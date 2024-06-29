import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class165 extends class41 implements class283 {

    @OriginalMember(owner = "client!vda", name = "s", descriptor = "I")
    private int field2367;

    @OriginalMember(owner = "client!vda", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2366 = null;

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!vda", name = "p", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!vda", name = "q", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!vda", name = "t", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!vda", name = "u", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!vda", name = "v", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!vda", name = "w", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!vda", name = "y", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!vda", name = "x", descriptor = "[I")
    public static int[] field2372;

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)J")
    public final long method1138(int arg0) {
        if (arg0 != -19664) {
            this.field2367 = 54;
        }
        ++field2369;
        return 0L;
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lok;ILjaclib/memory/Buffer;IZ)V")
    public class165(class228 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2367 = arg1;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILmo;)Ljo;")
    public static final class303 method1139(int arg0, class695 arg1) {
        ++field2365;
        return arg0 != 10091 ? null : new class303(arg1.method3814(false), arg1.method3814(false), arg1.method3814(false), arg1.method3814(false), arg1.method3814(false), arg1.method3814(false), arg1.method3814(false), arg1.method3814(false), arg1.method3873(255), arg1.method3826(false));
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)I")
    public final int method1140(byte arg0) {
        int var2 = 28 % ((30 - arg0) / 62);
        ++field2371;
        return this.field2367;
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(B)V")
    public final void method463(byte arg0) {
        if (arg0 == -3) {
            ++field2373;
            super.field679.method1548(34962, this);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IBLmo;)Ljava/lang/String;")
    public static final String method1141(int arg0, byte arg1, class695 arg2) {
        ++field2368;
        try {
            int var3 = arg2.method3815(-32768);
            if (var3 > arg0) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg2.field9761 += class81.field1364.method2244(var4, 17099, arg2.field9796, arg2.field9761, var3, 0);
            if (arg1 < 114) {
                method1141(71, (byte) -25, (class695) null);
            }
            return class126.method949(0, (byte) -28, var3, var4);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)I")
    public final int method1142(int arg0) {
        ++field2364;
        return arg0 != -22806 ? -80 : super.field677;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(BII[B)V")
    public final void method1143(byte arg0, int arg1, int arg2, byte[] arg3) {
        int var5 = 122 % ((-75 - arg0) / 47);
        ++field2363;
        this.method461(arg1, (byte) 121, arg3);
        this.field2367 = arg2;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lea;)V")
    public static final void method1144(class506 arg0) {
        if (class258.field3938 < 65535) {
            class498 var1 = arg0.field7165;
            class580.field8172[class258.field3938] = arg0;
            class60.field1141[class258.field3938] = false;
            ++class258.field3938;
            int var2 = arg0.field7160;
            if (arg0.field7166) {
                var2 = 0;
            }
            int var3 = arg0.field7160;
            if (arg0.field7163) {
                var3 = class41.field685 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method2875(true) - var1.method2880(-15) + class683.field9623 >> class310.field4593;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method2875(true) + var1.method2880(-15) - class683.field9623 >> class310.field4593;
                if (var7 >= class8.field82) {
                    var7 = class8.field82 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field7158[var5++];
                    int var10 = (var1.method2883(126) - var1.method2880(-15) + class683.field9623 >> class310.field4593) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class302.field4492) {
                        var11 = class302.field4492 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class477.field6789[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class477.field6789[var4][var12][var8] = var13 | (long) class258.field3938;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class477.field6789[var4][var12][var8] = var13 | (long) class258.field3938 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class477.field6789[var4][var12][var8] = var13 | (long) class258.field3938 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class477.field6789[var4][var12][var8] = var13 | (long) class258.field3938 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(I)V")
    public static void method1145(int arg0) {
        field2366 = null;
        field2372 = null;
        int var1 = -77 / ((arg0 - 54) / 57);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Z)Z")
    public static final boolean method1146(boolean arg0) {
        ++field2362;
        if (class313.field4623 != 0) {
            return true;
        } else {
            if (!arg0) {
                method1144((class506) null);
            }
            return class323.field4762.method382(true);
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lok;I[BIZ)V")
    public class165(class228 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2367 = arg1;
    }
}
