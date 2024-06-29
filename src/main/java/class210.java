import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class210 extends class248 {

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "Z")
    public boolean field3488 = false;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "Lcb;")
    private class222 field3500;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "Z")
    private boolean field3490;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "Z")
    private boolean field3496;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    private int field3482;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    private int field3481;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field3479 = 0;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "Lij;")
    private static class50 field3485 = class78.method578(122, "Walk here");

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "Lij;")
    public static class50 field3476 = field3485;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "Lij;")
    public static class50 field3486 = class78.method578(122, "(Z");

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "[Z")
    public static boolean[] field3492 = new boolean[100];

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "S")
    public static short field3493 = 256;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "Lij;")
    public static class50 field3480 = class78.method578(127, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "[[[B")
    public static byte[][][] field3495 = new byte[4][104][104];

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "Lij;")
    public static class50 field3498 = class78.method578(124, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "F")
    private float field3484;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "Lda;")
    public static class22 field3499;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "[I")
    private int[] field3477;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "[[Z")
    public static boolean[][] field3497;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "[[[I")
    public static int[][][] field3483;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(III)Lle;")
    public static final class102 method1402(int arg0, int arg1, int arg2) {
        class65 var3 = class59.field1089[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class102 var4 = var3.field1251;
            var3.field1251 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lda;Lmb;ZB)[I")
    public final int[] method1403(class22 arg0, class72 arg1, boolean arg2, byte arg3) {
        field3475++;
        if (!this.field3500.method1521(arg0, -108, arg1)) {
            return null;
        }
        if (arg3 < 4) {
            this.method1403((class22) null, (class72) null, true, (byte) -31);
        }
        int var5 = arg2 ? 64 : 128;
        return this.field3500.method1523(1.0D, false, var5, var5, arg0, (byte) -124, arg1, this.field3496);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
    public final void method1404(byte arg0, int arg1) {
        field3489++;
        if (this.field3477 == null) {
            return;
        }
        int var3 = -81 % ((75 - arg0) / 35);
        if (this.field3481 == 0 && this.field3482 == 0) {
            return;
        }
        if (class66.field1269 == null || this.field3477.length > class66.field1269.length) {
            class66.field1269 = new int[this.field3477.length];
        }
        int var4 = this.field3477.length == 4096 ? 64 : 128;
        int var5 = this.field3477.length;
        int var6 = this.field3482 * arg1;
        int var7 = var4 - 1;
        int var8 = var5 - 1;
        int var9 = arg1 * var4 * this.field3481;
        for (int var10 = 0; var10 < var5; var10 += var4) {
            int var12 = var8 & var9 + var10;
            for (int var13 = 0; var13 < var4; var13++) {
                int var14 = var10 + var13;
                int var15 = (var7 & var13 + var6) + var12;
                class66.field1269[var14] = this.field3477[var15];
            }
        }
        int[] var11 = this.field3477;
        this.field3477 = class66.field1269;
        class66.field1269 = var11;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Lti;")
    public static final class109 method1405(int arg0, int arg1) {
        if (arg0 != 1) {
            field3480 = null;
        }
        field3494++;
        class109 var2 = (class109) class25.field538.method764((byte) 70, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class45.field827.method190((byte) -87, class125.method900(255, arg1), class223.method1526(false, arg1));
        class109 var4 = new class109();
        var4.field1952 = arg1;
        if (var3 != null) {
            var4.method806(new class217(var3), 1281);
        }
        class25.field538.method765((byte) -123, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method1406(byte arg0) {
        field3492 = null;
        field3495 = null;
        field3499 = null;
        field3497 = null;
        field3476 = null;
        field3485 = null;
        field3480 = null;
        field3483 = null;
        field3498 = null;
        if (arg0 > -46) {
            field3498 = null;
        }
        field3486 = null;
    }

    @OriginalMember(owner = "client!ad", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field3491++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lda;ILmb;)Z")
    public final boolean method1407(class22 arg0, int arg1, class72 arg2) {
        if (arg1 == -20662) {
            field3474++;
            return this.field3500.method1521(arg0, -95, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lmb;FBLda;Z)[I")
    public final int[] method1408(class72 arg0, float arg1, byte arg2, class22 arg3, boolean arg4) {
        field3487++;
        if (this.field3477 == null || this.field3484 != arg1) {
            if (!this.field3500.method1521(arg3, -116, arg0)) {
                return null;
            }
            int var6 = arg4 ? 64 : 128;
            this.field3477 = this.field3500.method1523((double) arg1, true, var6, var6, arg3, (byte) -80, arg0, this.field3496);
            this.field3484 = arg1;
            if (this.field3490) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var12 = var6;
                int var13 = var6;
                int var14 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var14; var34 >= 0; var34--) {
                        var12--;
                        int var35 = this.field3477[var12];
                        var7[var34] += class51.method413(var35 >> 16, 255);
                        var8[var34] += class51.method413(var35 >> 8, 255);
                        var9[var34] += class51.method413(var35, 255);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 1;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var21 += var8[var25];
                        var23 += var7[var25];
                        var22 += var9[var25];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var27 = var14; var27 >= 0; var27--) {
                        int var31 = var23 / 9;
                        var25--;
                        var24--;
                        int var32 = var21 / 9;
                        int var33 = var22 / 9;
                        var19--;
                        var10[var19] = class29.method261(class29.method261(var32 << 8, var31 << 16), var33);
                        var22 += var9[var25] - var9[var24];
                        var23 += var7[var25] - var7[var24];
                        var21 += var8[var25] - var8[var24];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                        if (var24 == 0) {
                            var24 = var11;
                        }
                    }
                    for (int var28 = var14; var28 >= 0; var28--) {
                        var12--;
                        int var29 = this.field3477[var12];
                        var13--;
                        int var30 = this.field3477[var13];
                        var7[var28] += class51.method413(var29 >> 16, 255) - (class51.method413(var30, 16775187) >> 16);
                        var8[var28] += (class51.method413(65342, var29) >> 8) - (class51.method413(65363, var30) >> 8);
                        var9[var28] += class51.method413(var29, 255) - class51.method413(255, var30);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field3477 = var10;
            }
        }
        if (arg2 >= -83) {
            method1405(-6, 50);
        }
        return this.field3477;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
    public static final void method1409(int arg0) {
        if (arg0 != 10786) {
            method1406((byte) 72);
        }
        field3478++;
        for (class254 var1 = (class254) class47.field860.method689(1001); var1 != null; var1 = (class254) class47.field860.method688(-103)) {
            class40 var2 = var1.field4392;
            if (class201.field3312 != var2.field727 || var2.field749) {
                var1.method267(arg0 ^ 0x2A4D);
            } else if (class244.field4245 >= var2.field734) {
                var2.method306(-32684, class55.field988);
                if (var2.field749) {
                    var1.method267(126);
                } else {
                    class61.method470(var2.field727, var2.field745, var2.field739, var2.field728, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lwd;)V")
    public class210(class217 arg0) {
        this.field3500 = new class222(arg0);
        this.field3490 = arg0.method1487(255) == 1;
        this.field3496 = arg0.method1487(255) == 1;
        arg0.method1487(255);
        arg0.method1487(255);
        int var2 = arg0.method1487(255) & 0x3;
        this.field3482 = arg0.method1444((byte) -88);
        this.field3481 = arg0.method1444((byte) -65);
        arg0.method1487(255);
        arg0.method1487(255);
    }
}
