import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class245 extends class259 {

    @OriginalMember(owner = "client!li", name = "A", descriptor = "[I")
    public static int[] field3848 = new int[256];

    @OriginalMember(owner = "client!li", name = "L", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3858;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "Lvh;")
    public static class62 field3860;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "Lqb;")
    public static class117 field3862;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "Lqb;")
    private class117 field3850;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "[I")
    public static int[] field3855;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method1731(boolean arg0) {
        field3854++;
        if (!arg0) {
            class122.field1686.method378(0);
        }
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V", line = 20)
    public static void method1732(int arg0) {
        field3862 = null;
        field3860 = null;
        field3858 = null;
        field3848 = null;
        if (arg0 > -34) {
            method1731(false);
        }
        field3855 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILlf;)V", line = 39)
    public final void method1733(int arg0, class143 arg1) {
        if (arg0 > -10) {
            method1731(true);
        }
        field3857++;
        while (true) {
            int var3 = arg1.method1043(true);
            if (var3 == 0) {
                return;
            }
            this.method1736(arg1, (byte) 68, var3);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3848[var0] = var1;
        }
        field3858 = new CRC32();
        field3860 = new class62(64);
        field3862 = new class117(16);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Llf;I)Ljava/lang/String;", line = 66)
    public static final String method1734(class143 arg0, int arg1) {
        if (arg1 != 32767) {
            method1732(33);
        }
        field3849++;
        return class108.method696(arg0, (byte) 4, 32767);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIZ)Lsb;", line = 79)
    public static final class126 method1735(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg1 << 8 | arg0;
        field3856++;
        class126 var5 = (class126) class267.field4201.method1998(-1114531641, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class309.field4821.method124(class309.field4821.method108(var4, 2782), 12700);
        if (var6 == null) {
            int var7 = arg0 | arg2 + 65536 << 8;
            class126 var8 = (class126) class267.field4201.method1998(-1114531641, (long) var7 << 16);
            if (var8 != null) {
                return var8;
            }
            byte[] var9 = class309.field4821.method124(class309.field4821.method108(var7, 2782), 12700);
            if (var9 == null) {
                int var11 = arg0 | 0xFFFF00;
                class126 var12 = (class126) class267.field4201.method1998(-1114531641, (long) var11 << 16);
                if (var12 != null) {
                    return var12;
                }
                byte[] var13 = class309.field4821.method124(class309.field4821.method108(var11, 2782), 12700);
                if (arg3) {
                    field3848 = (int[]) null;
                }
                if (var13 == null) {
                    return null;
                } else if (var13.length <= 1) {
                    return null;
                } else {
                    class126 var14 = class42.method265(var13, (byte) -128);
                    var14.field1781 = arg0;
                    class267.field4201.method2000(var14, (byte) 124, (long) var11 << 16);
                    return var14;
                }
            } else if (var9.length <= 1) {
                return null;
            } else {
                class126 var10 = class42.method265(var9, (byte) -128);
                var10.field1781 = arg0;
                class267.field4201.method2000(var10, (byte) -125, (long) var7 << 16);
                return var10;
            }
        } else if (var6.length > 1) {
            class126 var15 = class42.method265(var6, (byte) -128);
            var15.field1781 = arg0;
            class267.field4201.method2000(var15, (byte) 39, (long) var4 << 16);
            return var15;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Llf;BI)V", line = 149)
    private final void method1736(class143 arg0, byte arg1, int arg2) {
        field3853++;
        if (arg2 == 249) {
            int var4 = arg0.method1043(true);
            if (this.field3850 == null) {
                int var5 = class226.method1571(true, var4);
                this.field3850 = new class117(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1043(true) == 1;
                int var8 = arg0.method1017((byte) 101);
                class188 var9;
                if (var7) {
                    var9 = new class23(arg0.method1040((byte) -128));
                } else {
                    var9 = new class305(arg0.method1057(-107));
                }
                this.field3850.method764(24369, var9, (long) var8);
            }
        }
        int var10 = 81 / ((-arg1 - 39) / 50);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IBI)I", line = 200)
    public final int method1737(int arg0, byte arg1, int arg2) {
        field3851++;
        if (this.field3850 == null) {
            return arg0;
        }
        if (arg1 <= 112) {
            this.method1737(97, (byte) -75, -40);
        }
        class305 var4 = (class305) this.field3850.method770((long) arg2, 102);
        return var4 == null ? arg0 : var4.field4748;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;", line = 222)
    public final String method1738(int arg0, int arg1, String arg2) {
        if (arg1 <= 117) {
            this.method1733(60, (class143) null);
        }
        field3852++;
        if (this.field3850 == null) {
            return arg2;
        } else {
            class23 var4 = (class23) this.field3850.method770((long) arg0, -90);
            return var4 == null ? arg2 : var4.field274;
        }
    }
}
