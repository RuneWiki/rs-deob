import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class251 extends class678 {

    @OriginalMember(owner = "client!vea", name = "u", descriptor = "Lbe;")
    public class35 field3746;

    @OriginalMember(owner = "client!vea", name = "t", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!vea", name = "v", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!vea", name = "w", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!vea", name = "x", descriptor = "I")
    public static int field3749;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vea", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field3750;

    @OriginalMember(owner = "client!vea", name = "s", descriptor = "[I")
    public static int[] field3744;

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(B)V")
    public static void method1679(byte arg0) {
        if (arg0 > -54) {
            field3744 = null;
        }
        field3744 = null;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lbw;I)V")
    public static final void method1680(class641 arg0, int arg1) {
        field3749++;
        arg0.method715(class669.field9559.method2229((byte) 119), arg1 + 1949990842);
        arg0.method715(class247.field3726.method2229((byte) 92), 1949991176);
        arg0.method715(class213.field3263.method2229((byte) 76), arg1 ^ 0x743A8046);
        arg0.method715(class82.field1600.method2229((byte) 103), arg1 + 1949990842);
        arg0.method715(class35.field1027.method2229((byte) 107), 1949991176);
        arg0.method715(class13.field722.method2229((byte) 95), 1949991176);
        arg0.method715(class46.field1128.method2229((byte) 113), 1949991176);
        arg0.method715(class344.field5127.method2229((byte) 97), 1949991176);
        arg0.method715(class632.field9092.method2229((byte) 94), 1949991176);
        arg0.method715(class135.field2394.method2229((byte) 125), 1949991176);
        arg0.method715(class662.field9534.method2229((byte) 97), 1949991176);
        arg0.method715(class325.field4766.method2229((byte) 76), arg1 ^ 0x743A8046);
        arg0.method715(class481.field6912.method2229((byte) 114), 1949991176);
        arg0.method715(class95.field1708.method2229((byte) 120), 1949991176);
        arg0.method715(class444.field6395.method2229((byte) 101), 1949991176);
        arg0.method715(class324.field4757.method2229((byte) 126), 1949991176);
        arg0.method715(class455.field6494.method2229((byte) 105), 1949991176);
        arg0.method715(class323.field4720.method2229((byte) 116), 1949991176);
        arg0.method715(class136.field2418.method2229((byte) 76), arg1 + 1949990842);
        if (arg1 != 334) {
            return;
        }
        arg0.method715(class51.field1188.method2229((byte) 97), arg1 + 1949990842);
        arg0.method715(class405.field5852.method2229((byte) 101), 1949991176);
        arg0.method715(class420.field6053.method2229((byte) 75), arg1 + 1949990842);
        arg0.method715(class706.field9942.method2229((byte) 81), 1949991176);
        arg0.method715(class613.field8924.method2229((byte) 81), arg1 + 1949990842);
        arg0.method715(class302.field4506.method2229((byte) 78), 1949991176);
        arg0.method715(class143.field2508.method2229((byte) 106), 1949991176);
        arg0.method715(class150.field2566.method2229((byte) 82), 1949991176);
        arg0.method715(class117.field2085.method2229((byte) 126), 1949991176);
        arg0.method715(class385.field5656.method2229((byte) 115), 1949991176);
        arg0.method715(class150.field2578.method2229((byte) 93), 1949991176);
        arg0.method715(class51.field1187.method2229((byte) 112), 1949991176);
        arg0.method715(class252.field3751.method2229((byte) 121), 1949991176);
        arg0.method715(class334.method2157((byte) 111), 1949991176);
        arg0.method715(class35.method532(126), 1949991176);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1681(String arg0, int arg1) {
        if (arg1 == 334) {
            field3745++;
            return class418.method2538((byte) 80, field3750 == null ? (field3750 = method1684("kda")) : field3750, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Llk;I)Llk;")
    public static final class545 method1682(class545 arg0, int arg1) {
        field3747++;
        int var2 = -7 % ((arg1 + 12) / 37);
        class545 var3 = client.method1823(arg0);
        if (var3 == null) {
            var3 = arg0.field7757;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(IIIBIZ)V")
    public static final void method1683(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        field3748++;
        if (arg4 < 1) {
            arg4 = 1;
        }
        int var6 = arg4 - 334;
        if (arg3 != 66) {
            method1682(null, 60);
        }
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class112.field2018 + ((class470.field6670 - class112.field2018) * var6 / 100);
        if (var7 < class113.field2026) {
            var7 = class113.field2026;
        } else if (var7 > class496.field7075) {
            var7 = class496.field7075;
        }
        int var8 = arg4 * 512 * var7 / (arg0 * 334);
        if (class420.field6050 > var8) {
            short var9 = class420.field6050;
            var7 = arg0 * var9 * 334 / (arg4 * 512);
            if (var7 > class496.field7075) {
                var7 = class496.field7075;
                int var10 = arg4 * var7 * 512 / (var9 * 334);
                int var11 = (arg0 - var10) / 2;
                if (arg5) {
                    class623.field9017.method107();
                    class623.field9017.method1267(arg2, arg4, arg3 ^ 0x43, var11, arg1, -16777216);
                    class623.field9017.method1267(arg2, arg4, 1, var11, arg1 + arg0 - var11, -16777216);
                }
                arg1 += var11;
                arg0 -= var11 * 2;
            }
        } else if (var8 > class375.field5586) {
            short var12 = class375.field5586;
            var7 = var12 * 334 * arg0 / (arg4 * 512);
            if (class113.field2026 > var7) {
                var7 = class113.field2026;
                int var13 = arg0 * var12 * 334 / (var7 * 512);
                int var14 = (arg4 - var13) / 2;
                if (arg5) {
                    class623.field9017.method107();
                    class623.field9017.method1267(arg2, var14, 1, arg0, arg1, -16777216);
                    class623.field9017.method1267(arg2 + arg4 - var14, var14, 1, arg0, arg1, -16777216);
                }
                arg2 += var14;
                arg4 -= var14 * 2;
            }
        }
        class423.field6117 = (short) arg4;
        class421.field6070 = arg2;
        class673.field9576 = (short) arg0;
        class672.field9574 = arg1;
        class234.field3504 = arg4 * var7 / 334;
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lbe;)V")
    public class251(class35 arg0) {
        this.field3746 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1684(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
