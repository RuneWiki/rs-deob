import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class233 extends class270 {

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
    private int field4021 = 0;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
    private int field4020 = 0;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
    private int field4019 = 20;

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
    private int field4025 = 1365;

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "Lmh;")
    private static class62 field4022 = class201.method1405(true, "Loading fonts )2 ");

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "Lmh;")
    public static class62 field4015 = class201.method1405(true, "Wordpack geladen)3");

    @OriginalMember(owner = "client!kh", name = "gb", descriptor = "Lmh;")
    public static class62 field4029 = field4022;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "Lmh;")
    public static class62 field4016 = class201.method1405(true, "Freie Welt");

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!kh", name = "db", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!kh", name = "eb", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!kh", name = "fb", descriptor = "[S")
    public static short[] field4028;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BILjava/awt/Component;Lgi;I)Lje;", line = 8)
    public static final class111 method1644(byte arg0, int arg1, Component arg2, class285 arg3, int arg4) {
        field4024++;
        if (class151.field2393 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class111 var5 = (class111) Class.forName("kd").getDeclaredConstructor().newInstance();
                var5.field1804 = new int[(class75.field1219 ? 2 : 1) * 256];
                var5.field1821 = arg1;
                var5.method866(arg2);
                var5.field1818 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field1818 > 16384) {
                    var5.field1818 = 16384;
                }
                var5.method862(var5.field1818);
                if (class198.field3347 > 0 && class114.field1895 == null) {
                    class114.field1895 = new class228();
                    class114.field1895.field3962 = arg3;
                    arg3.method1954(class198.field3347, 0, class114.field1895);
                }
                if (class114.field1895 != null) {
                    if (class114.field1895.field3959[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class114.field1895.field3959[arg4] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    if (arg0 != 127) {
                        return (class111) null;
                    }
                    class130 var7 = new class130(arg3, arg4);
                    var7.field1804 = new int[(class75.field1219 ? 2 : 1) * 256];
                    var7.field1821 = arg1;
                    var7.method866(arg2);
                    var7.field1818 = 16384;
                    var7.method862(var7.field1818);
                    if (class198.field3347 > 0 && class114.field1895 == null) {
                        class114.field1895 = new class228();
                        class114.field1895.field3962 = arg3;
                        arg3.method1954(class198.field3347, 0, class114.field1895);
                    }
                    if (class114.field1895 != null) {
                        if (class114.field1895.field3959[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class114.field1895.field3959[arg4] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class111();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V", line = 310)
    public class233() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V", line = 109)
    public static void method1645(int arg0) {
        field4016 = null;
        field4028 = null;
        field4029 = null;
        field4015 = null;
        int var1 = -39 / ((66 - arg0) / 51);
        field4022 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZLmi;)V", line = 130)
    public static final void method1646(boolean arg0, class92 arg1) {
        if (class129.field2119 != null) {
            try {
                class129.field2119.method1996(0L, 62);
                class129.field2119.method1994(arg1.field1495, arg1.field1476, 24, (byte) 78);
            } catch (Exception var3) {
            }
        }
        arg1.field1476 += 24;
        field4017++;
        if (!arg0) {
            method1644((byte) 2, -28, (Component) null, (class285) null, -53);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lmi;II)V", line = 156)
    public final void method8(class92 arg0, int arg1, int arg2) {
        int var4 = 105 / ((arg2 + 8) / 53);
        if (arg1 == 0) {
            this.field4025 = arg0.method721(115);
        } else if (arg1 == 1) {
            this.field4019 = arg0.method721(74);
        } else if (arg1 == 2) {
            this.field4020 = arg0.method721(45);
        } else if (arg1 == 3) {
            this.field4021 = arg0.method721(55);
        }
        field4018++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[I", line = 208)
    public final int[] method6(int arg0, int arg1) {
        if (arg0 != 18693) {
            return (int[]) null;
        }
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            for (int var4 = 0; var4 < class109.field1770; var4++) {
                int var5 = (class283.field4840[var4] << 12) / this.field4025 + this.field4020;
                int var6 = (class166.field2702[arg1] << 12) / this.field4025 + this.field4021;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = 0;
                int var12 = var5 * var5 >> 12;
                int var13 = var6 * var6 >> 12;
                while ((var12 + var13) < 16384 && this.field4019 > var11) {
                    var11++;
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var7 + var12 - var13;
                    var13 = var10 * var10 >> 12;
                    var12 = var9 * var9 >> 12;
                }
                var3[var4] = var11 >= this.field4019 - 1 ? 0 : (var11 << 12) / this.field4019;
            }
        }
        field4027++;
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(ZI)Lkm;", line = 270)
    public static final class53 method1647(boolean arg0, int arg1) {
        class53 var2 = (class53) class254.field4315.method263(2013, (long) arg1);
        if (!arg0) {
            return (class53) null;
        }
        field4023++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class232.field4011.method157(arg1 & 0x7FFF, 0, (byte) 19);
        } else {
            var3 = class103.field1691.method157(arg1, 0, (byte) 19);
        }
        class53 var4 = new class53();
        if (var3 != null) {
            var4.method345((byte) -59, new class92(var3));
        }
        if (arg1 >= 32768) {
            var4.method342(89);
        }
        class254.field4315.method257(false, var4, (long) arg1);
        return var4;
    }
}
