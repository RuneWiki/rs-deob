import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class527 extends class66 {

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "[I")
    public int[] field7693 = new int[] { -1 };

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "[I")
    public int[] field7697 = new int[1];

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "Lor;")
    public static class594 field7696 = new class594();

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "Z")
    public static boolean field7699 = false;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field7700 = new String[200];

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "Lwm;")
    public static class524 field7691;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "Lri;")
    public static class97 field7694;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([IIBZ[I)J", line = 5)
    private final long method3193(int[] arg0, int arg1, byte arg2, boolean arg3, int[] arg4) {
        field7695++;
        if (arg2 != 82) {
            return -43L;
        }
        long[] var6 = class114.field1792;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg1 >> 8)) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var6[(int) ((var9 ^ (long) arg1) & 0xFFL)];
        for (int var13 = 0; var13 < arg4.length; var13++) {
            long var17 = var6[(int) (((long) (arg4[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg4[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) ((var19 ^ (long) (arg4[var13] >> 8)) & 0xFFL)];
            var11 = var21 >>> 8 ^ var6[(int) (((long) arg4[var13] ^ var21) & 0xFFL)];
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg0[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 54)
    public static void method3194(int arg0) {
        field7691 = null;
        if (arg0 != -1) {
            method3194(98);
        }
        field7700 = null;
        field7694 = null;
        field7696 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZILhq;IIILqg;Lr;I)Lda;", line = 69)
    public final class55 method3195(int arg0, boolean arg1, int arg2, class144 arg3, int arg4, int arg5, int arg6, class428 arg7, class167 arg8, int arg9) {
        field7698++;
        class55 var11 = null;
        int var12 = arg0;
        class642 var13 = null;
        if (arg4 != -1) {
            var13 = class472.field6988.method2674(-112, arg4);
        }
        int[] var14 = this.field7693;
        if (var13 != null && var13.field9036 != null) {
            var14 = new int[var13.field9036.length];
            for (int var15 = 0; var15 < var13.field9036.length; var15++) {
                int var16 = var13.field9036[var15];
                if (var16 >= 0 && this.field7693.length > var16) {
                    var14[var15] = this.field7693[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        if (arg2 != -4113) {
            return null;
        }
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class675 var24 = null;
        class675 var25 = null;
        if (arg7 != null) {
            int var26 = arg7.field6521[arg5];
            var12 = arg0 | 0x20;
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class636.field8942.method2870(var27, 28133);
            if (var24 != null) {
                var18 |= var24.method3865((byte) 59, var21);
                var17 |= var24.method3863(var21, (byte) 127);
                var20 |= var24.method3861(-3425, var21);
                var19 |= arg7.field6530;
            }
            if ((arg7.field6531 || class436.field6656) && arg6 != -1 && arg7.field6521.length > arg6) {
                int var28 = arg7.field6521[arg6];
                var23 = arg7.field6532[arg5];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class636.field8942.method2870(var22 >>> 16, 28133);
                }
                if (var25 != null) {
                    var18 |= var25.method3865((byte) 59, var22);
                    var17 |= var25.method3863(var22, (byte) -109);
                    var20 |= var25.method3861(-3425, var22);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method3193(arg3 == null ? null : arg3.field2424, arg4, (byte) 82, arg1, var14);
        if (class234.field3710 != null) {
            var11 = (class55) class234.field3710.method560(false, var30);
        }
        if (var11 == null || arg8.method323(var11.method651(), var12) != 0) {
            if (var11 != null) {
                var12 = arg8.method286(var12, var11.method651());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class91.field1083.method2859(var14[var34], (byte) 126).method1047(arg1, -126)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class534[] var35 = new class534[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class91.field1083.method2859(var14[var36], (byte) 122).method1046(arg1, (byte) 72);
                }
            }
            if (var13 != null && var13.field9047 != null) {
                for (int var37 = 0; var37 < var13.field9047.length; var37++) {
                    if (var13.field9047[var37] != null && var35[var37] != null) {
                        int var38 = var13.field9047[var37][0];
                        int var39 = var13.field9047[var37][1];
                        int var40 = var13.field9047[var37][2];
                        int var41 = var13.field9047[var37][3];
                        int var42 = var13.field9047[var37][4];
                        int var43 = var13.field9047[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method3245(var42, 15, var43, var41);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method3234(0, var39, var38, var40);
                        }
                    }
                }
            }
            if (arg3 != null) {
                var32 = var12 | 0x4000;
            }
            class534 var44 = new class534(var35, var35.length);
            var11 = arg8.method287(var44, var32, class206.field3451, 64, 850);
            if (arg3 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class356.field5686.length; var46++) {
                        if (arg3.field2424[var45] < class356.field5686[var46][var45].length) {
                            var11.method608(class376.field5859[var46][var45], class356.field5686[var46][var45][arg3.field2424[var45]]);
                        }
                    }
                }
            }
            if (class234.field3710 != null) {
                var11.method629(var12);
                class234.field3710.method559(var11, var30, 0);
            }
        }
        if (arg7 == null || var24 == null) {
            return var11;
        } else {
            class55 var47 = var11.method609((byte) 1, var12, true);
            var47.method635(arg7.field6530, var22, (byte) -126, var25, var23, var21, arg9 - 1, 0, var24);
            return var47;
        }
    }
}
