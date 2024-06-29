import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class188 extends class35 {

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "[I")
    public int[] field2780 = new int[1];

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "[I")
    public int[] field2781 = new int[] { -1 };

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "Z")
    public static volatile boolean field2786 = true;

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "Lll;")
    public static class332 field2785 = class239.method1742(12121);

    @OriginalMember(owner = "client!tp", name = "q", descriptor = "[I")
    public static int[] field2787 = new int[32];

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "Lvj;")
    public static class177 field2783;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "[[B")
    public static byte[][] field2779;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIBLbn;Lbq;ZLja;II)Lrc;")
    public final class100 method1458(int arg0, int arg1, int arg2, byte arg3, class153 arg4, class51 arg5, boolean arg6, class90 arg7, int arg8, int arg9) {
        field2782++;
        class100 var11 = null;
        int var12 = arg2;
        class419 var13 = null;
        if (arg1 != -1) {
            var13 = class248.method1789((byte) -117, arg1);
        }
        int[] var14 = this.field2781;
        if (var13 != null && var13.field6115 != null) {
            var14 = new int[var13.field6115.length];
            for (int var15 = 0; var15 < var13.field6115.length; var15++) {
                int var16 = var13.field6115[var15];
                if (var16 >= 0 && this.field2781.length > var16) {
                    var14[var15] = this.field2781[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -1;
        int var21 = -1;
        int var22 = 0;
        class293 var23 = null;
        class293 var24 = null;
        if (arg5 != null) {
            int var25 = arg5.field835[arg9];
            var12 = arg2 | 0x20;
            int var26 = var25 >>> 16;
            var20 = var25 & 0xFFFF;
            var23 = class132.method1099(false, var26);
            if (var23 != null) {
                var18 |= var23.method2049(-92, var20);
                var17 |= var23.method2047(var20, -423207056);
                var19 |= arg5.field828;
            }
            if ((arg5.field818 || class221.field3301) && arg8 != -1 && arg8 < arg5.field835.length) {
                int var27 = arg5.field835[arg8];
                var22 = arg5.field845[arg9];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class132.method1099(false, var21 >>> 16);
                }
                if (var24 != null) {
                    var18 |= var24.method2049(-111, var21);
                    var17 |= var24.method2047(var21, -423207056);
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
        }
        if (arg3 != 62) {
            this.field2780 = null;
        }
        long var29 = this.method1459(arg1, arg6, (byte) 127, var14, arg4 == null ? null : arg4.field2339);
        if (class44.field654 != null) {
            var11 = (class100) class44.field654.method103(0, var29);
        }
        if (var11 == null || arg7.method677(var11.method560(), var12) != 0) {
            if (var11 != null) {
                var12 = arg7.method713(var12, var11.method560());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class206.method1561(arg3 ^ 0xFFFFFF8B, var14[var33]).method1046(arg3 ^ 0x56C1, arg6)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class382[] var34 = new class382[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class206.method1561(-77, var14[var35]).method1059((byte) -32, arg6);
                }
            }
            if (var13 != null && var13.field6106 != null) {
                for (int var36 = 0; var36 < var13.field6106.length; var36++) {
                    if (var13.field6106[var36] != null && var34[var36] != null) {
                        int var37 = var13.field6106[var36][0];
                        int var38 = var13.field6106[var36][1];
                        int var39 = var13.field6106[var36][2];
                        int var40 = var13.field6106[var36][3];
                        int var41 = var13.field6106[var36][4];
                        int var42 = var13.field6106[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method2423(var42, var41, -101, var40);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method2415(var38, var39, var37, (byte) -103);
                        }
                    }
                }
            }
            class382 var43 = new class382(var34, var34.length);
            if (arg4 != null) {
                var31 = var12 | 0x2000;
            }
            var11 = arg7.method735(var43, var31, class377.field5358, 64, 850);
            if (arg4 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (arg4.field2339[var44] < class196.field2874[var44].length) {
                        var11.method554(class365.field5199[var44], class196.field2874[var44][arg4.field2339[var44]]);
                    }
                    if (class416.field6026[var44].length > arg4.field2339[var44]) {
                        var11.method554(class383.field5473[var44], class416.field6026[var44][arg4.field2339[var44]]);
                    }
                }
            }
            if (class44.field654 != null) {
                var11.method525(var12);
                class44.field654.method113(var11, 0, var29);
            }
        }
        if (arg5 == null || var23 == null) {
            return var11;
        } else {
            class100 var45 = var11.method518((byte) 1, var12, true);
            var45.method829(var23, var21, var22, arg5.field828, -70, var24, 0, arg0 - 1, var20);
            return var45;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZB[I[I)J")
    private final long method1459(int arg0, boolean arg1, byte arg2, int[] arg3, int[] arg4) {
        field2784++;
        long[] var6 = class106.field1755;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg0 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        if (arg2 <= 99) {
            this.field2780 = null;
        }
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg0 ^ var9) & 0xFFL)];
        for (int var13 = 0; var13 < arg3.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg3[var13] >> 24)) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg3[var13] >> 16)) & 0xFFL)];
            long var21 = var6[(int) (((long) (arg3[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) (((long) arg3[var13] ^ var21) & 0xFFL)];
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg4[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(I)V")
    public static void method1460(int arg0) {
        field2785 = null;
        field2779 = null;
        if (arg0 != 15340) {
            method1460(-112);
        }
        field2787 = null;
        field2783 = null;
    }
}
