import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class328 {

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "[I")
    public int[] field4835 = new int[4];

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "B")
    public byte field4828;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "B")
    public byte field4850;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "[I")
    public int[] field4839;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "[I")
    public int[] field4832;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "S")
    public short field4833;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "S")
    public short field4849;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "S")
    public short field4846;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "S")
    public short field4847;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "[S")
    public short[] field4829;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "[S")
    public short[] field4840;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "[S")
    public short[] field4841;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Lcb;")
    public static class631 field4834 = new class631(7, 11);

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Z")
    public static boolean field4837 = false;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Ltm;")
    public static class334 field4836 = new class334(25, 2);

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lla;BLd;)V", line = 5)
    public static final void method2116(class422 arg0, byte arg1, class267 arg2) {
        class99.field1467 = arg2;
        class642.field9105 = arg0;
        field4845++;
        int var3 = -92 % ((69 - arg1) / 46);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIZ)Z", line = 22)
    public static final boolean method2117(int arg0, int arg1, boolean arg2) {
        field4844++;
        if (!arg2) {
            field4836 = null;
        }
        return (arg1 & 0x100100) != 0;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lbfa;B)V", line = 37)
    public static final void method2118(class573 arg0, byte arg1) {
        if (arg1 < 54) {
            return;
        }
        field4830++;
        class447 var2 = (class447) class261.field4063.method3512(true, (long) arg0.field1628);
        if (var2 == null) {
            class52.method498(arg0, arg0.field9470, arg0.field1702[0], null, (byte) -112, 0, null, arg0.field1704[0]);
        } else {
            var2.method2754(-111);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V", line = 63)
    public static final void method2119(int arg0, int arg1, int arg2) {
        class700.field9892++;
        field4843++;
        if (arg2 != 0) {
            method2116(null, (byte) -25, null);
        }
        class540 var3 = class257.method1732(true, class681.field9631, class655.field9332);
        var3.field7707.method1970((byte) 29, arg1);
        var3.field7707.method1982((byte) 63, arg0);
        class756.method4211(var3, arg2 ^ 0x76);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/lang/String;)I", line = 84)
    public static final int method2120(int arg0, String arg1) {
        field4831++;
        if (!class544.field7771.field10270) {
            return -1;
        } else if (class602.field8515.containsKey(arg1)) {
            return 100;
        } else {
            String var2 = class686.method3825(false, arg1);
            if (var2 == null) {
                return -1;
            }
            String var3 = class64.field1032 + var2;
            if (arg0 <= 44) {
                return -22;
            } else if (!class131.field2136.method2635(-65, var3, "")) {
                return -1;
            } else if (class131.field2136.method2642(-29983, var3)) {
                byte[] var4 = class131.field2136.method2638("", 92, var3);
                Object var5 = null;
                File var6;
                try {
                    var6 = class663.method3725(var2, 0);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class718.method3963(true, var6);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class544.field7771.method4063(122, var4, var6);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class468.method2861(var6, arg1, -11195);
                return 100;
            } else {
                return class131.field2136.method2631(0, var3);
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 177)
    public static void method2121(int arg0) {
        field4834 = null;
        if (arg0 == -28880) {
            field4836 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILraa;)Lraa;", line = 197)
    public static final class353 method2122(int arg0, class353 arg1) {
        field4842++;
        class353 var2 = client.method2751(arg1);
        if (var2 == null) {
            var2 = arg1.field5326;
        }
        if (arg0 < 94) {
            field4837 = true;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V", line = 215)
    public class328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field4828 = (byte) arg1;
        this.field4850 = (byte) arg0;
        this.field4839 = new int[4];
        this.field4832 = new int[4];
        this.field4839[2] = arg4;
        this.field4839[0] = arg2;
        this.field4839[1] = arg3;
        this.field4839[3] = arg5;
        this.field4832[2] = arg8;
        this.field4832[3] = arg9;
        this.field4832[0] = arg6;
        this.field4832[1] = arg7;
        this.field4835[3] = arg13;
        this.field4835[0] = arg10;
        this.field4835[2] = arg12;
        this.field4833 = (short) (arg2 >> class662.field9425);
        this.field4835[1] = arg11;
        this.field4849 = (short) (arg4 >> class662.field9425);
        this.field4846 = (short) (arg10 >> class662.field9425);
        this.field4847 = (short) (arg12 >> class662.field9425);
        this.field4829 = new short[4];
        this.field4840 = new short[4];
        this.field4841 = new short[4];
    }
}
