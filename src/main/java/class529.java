import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class529 extends class383 {

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "[I")
    public int[] field7794 = new int[1];

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "[I")
    public int[] field7796 = new int[] { -1 };

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "Lkg;")
    public static class179 field7792 = new class179(36, -1);

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "[I")
    public static int[] field7798 = new int[5];

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "Lub;")
    public static class18 field7799 = new class18();

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    public static int field7800 = -1;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
    public static int field7793;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V", line = 6)
    public static void method3138(byte arg0) {
        if (arg0 == 34) {
            field7799 = null;
            field7792 = null;
            field7798 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIB)Z", line = 18)
    public static final boolean method3139(int arg0, int arg1, byte arg2) {
        field7801++;
        int var3 = 63 / ((59 - arg2) / 36);
        return class232.method1410(arg0, arg1, false) | (arg0 & 0x800) != 0 || class9.method57(arg1, arg0, 55);
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(Z)V", line = 28)
    public static final void method3140(boolean arg0) {
        field7793++;
        class479.field7013.method543(-127);
        int var1 = 0;
        if (!arg0) {
            field7799 = null;
        }
        while (var1 < 32) {
            class469.field6798[var1] = 0L;
            var1++;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class28.field392[var2] = 0L;
        }
        class226.field2879 = 0;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILeb;BILya;ZIIILid;)Lt;", line = 58)
    public final class474 method3141(int arg0, class442 arg1, byte arg2, int arg3, class38 arg4, boolean arg5, int arg6, int arg7, int arg8, class415 arg9) {
        field7795++;
        class474 var11 = null;
        int var12 = arg8;
        class511 var13 = null;
        if (arg0 != -1) {
            var13 = class327.field4134.method2573(arg0, (byte) 14);
        }
        int[] var14 = this.field7796;
        if (var13 != null && var13.field7416 != null) {
            var14 = new int[var13.field7416.length];
            for (int var15 = 0; var15 < var13.field7416.length; var15++) {
                int var16 = var13.field7416[var15];
                if (var16 >= 0 && var16 < this.field7796.length) {
                    var14[var15] = this.field7796[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        if (arg2 != 23) {
            field7800 = -91;
        }
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class513 var24 = null;
        class513 var25 = null;
        if (arg9 != null) {
            var12 = arg8 | 0x20;
            int var26 = arg9.field5927[arg7];
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class404.field5756.method551(var27, 23968);
            if (var24 != null) {
                var18 |= var24.method3066(var21, (byte) 35);
                var17 |= var24.method3064(arg2 - 138, var21);
                var20 |= var24.method3063(-12216, var21);
                var19 |= arg9.field5914;
            }
            if ((arg9.field5916 || class279.field3533) && arg6 != -1 && arg9.field5927.length > arg6) {
                var23 = arg9.field5915[arg7];
                int var28 = arg9.field5927[arg6];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class404.field5756.method551(var22 >>> 16, 23968);
                }
                if (var25 != null) {
                    var18 |= var25.method3066(var22, (byte) 35);
                    var17 |= var25.method3064(-104, var22);
                    var20 |= var25.method3063(-12216, var22);
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
        long var30 = this.method3143((byte) -110, arg0, var14, arg1 == null ? null : arg1.field6336, arg5);
        if (class392.field5265 != null) {
            var11 = (class474) class392.field5265.method2647(-116, var30);
        }
        if (var11 == null || arg4.method307(var11.method422(), var12) != 0) {
            if (var11 != null) {
                var12 = arg4.method370(var12, var11.method422());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class376.field4949.method624((byte) -116, var14[var34]).method70(arg5, -32217)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class173[] var35 = new class173[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class376.field4949.method624((byte) -114, var14[var36]).method68(arg5, (byte) -118);
                }
            }
            if (var13 != null && var13.field7392 != null) {
                for (int var37 = 0; var37 < var13.field7392.length; var37++) {
                    if (var13.field7392[var37] != null && var35[var37] != null) {
                        int var38 = var13.field7392[var37][0];
                        int var39 = var13.field7392[var37][1];
                        int var40 = var13.field7392[var37][2];
                        int var41 = var13.field7392[var37][3];
                        int var42 = var13.field7392[var37][4];
                        int var43 = var13.field7392[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method1105(var42, var41, var43, (byte) 93);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method1112(var40, 0, var38, var39);
                        }
                    }
                }
            }
            class173 var44 = new class173(var35, var35.length);
            if (arg1 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg4.method361(var44, var32, class347.field4453, 64, 850);
            if (arg1 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (class343.field4394[var45].length > arg1.field6336[var45]) {
                        var11.method425(class24.field353[var45], class343.field4394[var45][arg1.field6336[var45]]);
                    }
                    if (arg1.field6336[var45] < class102.field1241[var45].length) {
                        var11.method425(class75.field970[var45], class102.field1241[var45][arg1.field6336[var45]]);
                    }
                }
            }
            if (class392.field5265 != null) {
                var11.method442(var12);
                class392.field5265.method2635(var30, -26591, var11);
            }
        }
        if (arg9 == null || var24 == null) {
            return var11;
        } else {
            class474 var46 = var11.method416((byte) 1, var12, true);
            var46.method2855(arg9.field5914, var24, arg3 - 1, 65535, var25, var22, 0, var21, var23);
            return var46;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V", line = 301)
    public static final void method3142(int arg0, int arg1) {
        field7802++;
        int var2 = class163.field2065 - class363.field4727;
        if (var2 >= 100) {
            class142.field1835 = 1;
            return;
        }
        int var3 = (int) class49.field629;
        if ((class174.field2272 >> 8) > var3) {
            var3 = class174.field2272 >> 8;
        }
        if (class229.field2926[4] && class434.field6168[4] + 128 > var3) {
            var3 = class434.field6168[4] + 128;
        }
        int var4 = (int) class463.field6626 + class55.field718 & 0x3FFF;
        class514.method3072((byte) 70, class119.field1603, var4, arg0, class151.method991(class23.field336.field2677, false, class276.field3488, class23.field336.field2666) - 50, var3, ((var3 >> 3) * 3) + 600 << 0, class56.field740);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class80.field1030 = (int) ((float) (class80.field1030 - class52.field700) * var5 + (float) class52.field700);
        class193.field2500 = (int) ((float) (class193.field2500 - class496.field7206) * var5 + (float) class496.field7206);
        class310.field3971 = (int) ((float) (class310.field3971 - class111.field1489) * var5 + (float) class111.field1489);
        class286.field3665 = (int) ((float) (class286.field3665 - class51.field672) * var5 + (float) class51.field672);
        int var6 = class365.field4747 - class21.field291;
        if (arg1 <= 4) {
            method3138((byte) 95);
        }
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class365.field4747 = (int) ((float) var6 * var5 + (float) class21.field291);
        class365.field4747 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI[I[IZ)J", line = 355)
    private final long method3143(byte arg0, int arg1, int[] arg2, int[] arg3, boolean arg4) {
        field7797++;
        int var6 = -56 / ((25 - arg0) / 48);
        long[] var7 = class329.field4158;
        long var8 = -1L;
        long var10 = var7[(int) (((long) (arg1 >> 8) ^ var8) & 0xFFL)] ^ var8 >>> 8;
        long var12 = var7[(int) (((long) arg1 ^ var10) & 0xFFL)] ^ var10 >>> 8;
        for (int var14 = 0; var14 < arg2.length; var14++) {
            long var18 = var12 >>> 8 ^ var7[(int) ((var12 ^ (long) (arg2[var14] >> 24)) & 0xFFL)];
            long var20 = var7[(int) (((long) (arg2[var14] >> 16) ^ var18) & 0xFFL)] ^ var18 >>> 8;
            long var22 = var7[(int) ((var20 ^ (long) (arg2[var14] >> 8)) & 0xFFL)] ^ var20 >>> 8;
            var12 = var7[(int) (((long) arg2[var14] ^ var22) & 0xFFL)] ^ var22 >>> 8;
        }
        if (arg3 != null) {
            for (int var15 = 0; var15 < 5; var15++) {
                var12 = var12 >>> 8 ^ var7[(int) ((var12 ^ (long) arg3[var15]) & 0xFFL)];
            }
        }
        return var12 >>> 8 ^ var7[(int) ((var12 ^ (long) (arg4 ? 1 : 0)) & 0xFFL)];
    }
}
