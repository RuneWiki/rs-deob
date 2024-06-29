import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class123 extends class279 {

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Lui;")
    public class94 field1761;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "Z")
    public static boolean field1766 = false;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field1767 = -1;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Ldl;")
    public static class29 field1760;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIZII)V", line = 11)
    public static final void method899(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 < 1) {
            arg1 = 1;
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        field1769++;
        if (class109.field1458) {
            int var6 = arg1 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class293.field4537 - class166.field2737) * var6 / 100 + class166.field2737;
            if (class328.field5139 > var7) {
                var7 = class328.field5139;
            } else if (var7 > class51.field650) {
                var7 = class51.field650;
            }
            int var8 = arg1 * 512 * var7 / (arg5 * 334);
            if (var8 < class286.field4420) {
                short var12 = class286.field4420;
                var7 = arg5 * var12 * 334 / (arg1 * 512);
                if (var7 > class51.field650) {
                    var7 = class51.field650;
                    int var13 = arg1 * var7 * 512 / (var12 * 334);
                    int var14 = (arg5 - var13) / 2;
                    if (arg3) {
                        class122.method898();
                        class122.method897(arg2, arg4, var14, arg1, 0);
                        class122.method897(arg2 + arg5 - var14, arg4, var14, arg1, 0);
                    }
                    arg2 += var14;
                    arg5 -= var14 * 2;
                }
            } else if (class25.field379 < var8) {
                short var9 = class25.field379;
                var7 = arg5 * 334 * var9 / (arg1 * 512);
                if (var7 < class328.field5139) {
                    var7 = class328.field5139;
                    int var10 = var9 * 334 * arg5 / (var7 * 512);
                    int var11 = (arg1 - var10) / 2;
                    if (arg3) {
                        class122.method898();
                        class122.method897(arg2, arg4, arg5, var11, 0);
                        class122.method897(arg2, arg4 + arg1 - var11, arg5, var11, 0);
                    }
                    arg1 -= var11 * 2;
                    arg4 += var11;
                }
            }
            class222.field3513 = arg1 * var7 / 334;
        }
        class69.field964 = arg2;
        class72.field1005 = (short) arg5;
        if (arg0 != 0) {
            method904(-93, -20, -5, -35, -26);
        }
        class305.field4771 = arg4;
        class270.field4194 = (short) arg1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 109)
    public static final String method900(int arg0, long arg1) {
        if (arg0 == 512) {
            field1765++;
            return class76.method568(arg1, (byte) -80);
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lui;)V", line = 119)
    public class123(class94 arg0) {
        this.field1761 = arg0;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V", line = 129)
    public static void method901(int arg0) {
        field1760 = null;
        if (arg0 != 17675) {
            method902(true);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V", line = 139)
    public static final void method902(boolean arg0) {
        class179.method1323(class101.field1351, 4);
        field1764++;
        int var1 = (class317.field5018 >> 10) + (class198.field3168 >> 3);
        byte var2 = 0;
        byte var3 = 8;
        byte var4 = 8;
        int var5 = (class326.field5108 >> 3) + (class295.field4572 >> 10);
        byte var6 = 18;
        class181.field2933 = new byte[var6][];
        class215.field3392 = new int[var6];
        class293.field4540 = new byte[var6][];
        class232.field3616 = new int[var6];
        class333.field5188 = new int[var6];
        class277.field4288 = new int[var6];
        class206.field3269 = new byte[var6][];
        class117.field1620 = new int[var6];
        class251.field3946 = new byte[var6][];
        class81.field1111 = new int[var6][4];
        class249.field3928 = new int[var6];
        class174.field2857 = new byte[var6][];
        int var7 = 0;
        for (int var8 = (var5 - 6) / 8; var8 <= ((var5 + 6) / 8); var8++) {
            for (int var9 = (var1 - 6) / 8; var9 <= ((var1 + 6) / 8); var9++) {
                int var10 = (var8 << 8) + var9;
                class232.field3616[var7] = var10;
                class277.field4288[var7] = class290.field4476.method1808(-1, "m" + var8 + "_" + var9);
                class117.field1620[var7] = class290.field4476.method1808(-1, "l" + var8 + "_" + var9);
                class215.field3392[var7] = class290.field4476.method1808(-1, "n" + var8 + "_" + var9);
                class249.field3928[var7] = class290.field4476.method1808(-1, "um" + var8 + "_" + var9);
                class333.field5188[var7] = class290.field4476.method1808(-1, "ul" + var8 + "_" + var9);
                if (class215.field3392[var7] == -1) {
                    class277.field4288[var7] = -1;
                    class117.field1620[var7] = -1;
                    class249.field3928[var7] = -1;
                    class333.field5188[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class215.field3392.length; var11++) {
            class215.field3392[var11] = -1;
            class277.field4288[var11] = -1;
            class117.field1620[var11] = -1;
            class249.field3928[var11] = -1;
            class333.field5188[var11] = -1;
        }
        class329.method2306(var3, var2, arg0, 83, var4, false, var5, var1);
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V", line = 223)
    public static final void method903(int arg0) {
        for (int var1 = arg0; var1 < class94.field1251; var1++) {
            class1 var2 = class337.method2336(var1, -1);
            if (var2 != null && var2.field14 == 0) {
                class256.field4046[var1] = 0;
                class220.field3477[var1] = 0;
            }
        }
        field1762++;
        class10.field192 = new class311(16);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V", line = 258)
    public static final void method904(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class34 var5 = class91.method656(arg4, -2, 4);
        var5.method307(-19063);
        field1768++;
        if (arg2 > 121) {
            var5.field500 = arg3;
            var5.field497 = arg0;
            var5.field502 = arg1;
        }
    }
}
