import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class196 extends RuntimeException {

    @OriginalMember(owner = "client!va", name = "m", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3807;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Ljava/lang/String;")
    public String field3804;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Ltg;")
    private static class184 field3797 = class135.method812("Account locked as we suspect it has been stolen)3", 3);

    @OriginalMember(owner = "client!va", name = "g", descriptor = "Ltg;")
    public static class184 field3801 = field3797;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "Ltg;")
    public static class184 field3799 = class135.method812("<col=00ffff>", 3);

    @OriginalMember(owner = "client!va", name = "i", descriptor = "Ltg;")
    public static class184 field3803 = class135.method812(":trade:", 3);

    @OriginalMember(owner = "client!va", name = "d", descriptor = "Ltg;")
    public static class184 field3798 = class135.method812("huffman", 3);

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field3806 = 0;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "[Loe;")
    public static class137[] field3802;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Z")
    public static final boolean method1242(int arg0, int arg1) {
        if (arg1 == 0) {
            field3795++;
            return (arg0 >> 20 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)Z")
    public static final boolean method1243(int arg0, int arg1) {
        field3796++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else if (arg1 >= 48 && arg1 <= 57) {
            return true;
        } else {
            if (arg0 < 15) {
                method1248(99);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V")
    public static final void method1244(boolean arg0, int arg1) {
        class91.method530(-128);
        field3800++;
        class58.field1089++;
        if (class58.field1089 < 50 && !arg0) {
            return;
        }
        class58.field1089 = 0;
        if (arg1 != 32) {
            method1244(false, 53);
        }
        if (class107.field1941 || class180.field3435 == null) {
            return;
        }
        class117.field2122.method106(33, arg1 - 155);
        class57.field1013++;
        try {
            class180.field3435.method514(class117.field2122.field1834, 0, class117.field2122.field1809, arg1 - 23454);
            class117.field2122.field1834 = 0;
        } catch (IOException var2) {
            class107.field1941 = true;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIZILvb;I)V")
    public static final void method1245(int arg0, int arg1, boolean arg2, int arg3, class197 arg4, int arg5) {
        class113.field2045 = 10000;
        class175.field3325 = arg5;
        class111.field2011 = arg3;
        class122.field2177 = arg4;
        field3805++;
        class149.field2678 = arg2;
        class101.field1875 = 1;
        class209.field4006 = arg0;
        if (arg1 >= -103) {
            field3802 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIII)V")
    public static final void method1246(int arg0, int arg1, int arg2, int arg3) {
        class90 var4 = class190.field3704[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class134 var5 = var4.field1684;
        if (var5 != null) {
            var5.field2444 = var5.field2444 * arg3 / 16;
            var5.field2443 = var5.field2443 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([IIIIIII)V")
    public static final void method1247(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class69.field1323 = arg5;
        class178.field3393 = new boolean[8][32][class69.field1323 + class69.field1323 + 1][class69.field1323 + class69.field1323 + 1];
        class87.field1597 = 0;
        class170.field3233 = 0;
        class204.field3921 = arg3;
        class58.field1092 = arg4;
        class186.field3596 = arg3 / 2;
        class12.field233 = arg4 / 2;
        boolean[][][][] var7 = new boolean[9][32][class69.field1323 + class69.field1323 + 3][class69.field1323 + class69.field1323 + 3];
        for (int var8 = 128; var8 <= 384; var8 += 32) {
            for (int var16 = 0; var16 < 2048; var16 += 64) {
                class134.field2445 = class23.field422[var8];
                class135.field2448 = class23.field434[var8];
                class62.field1178 = class23.field422[var16];
                class36.field682 = class23.field434[var16];
                int var17 = (var8 - 128) / 32;
                int var18 = var16 / 64;
                for (int var19 = -(class69.field1323 + 1); var19 <= class69.field1323 + 1; var19++) {
                    for (int var20 = -(class69.field1323 + 1); var20 <= class69.field1323 + 1; var20++) {
                        int var21 = var19 * 128;
                        int var22 = var20 * 128;
                        boolean var23 = false;
                        for (int var24 = -arg1; var24 <= arg2; var24 += 128) {
                            if (class205.method1299(var21, arg0[var17] + var24, var22, arg6)) {
                                var23 = true;
                                break;
                            }
                        }
                        var7[var17][var18][class69.field1323 + var19 + 1][class69.field1323 + var20 + 1] = var23;
                    }
                }
            }
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 32; var10++) {
                for (int var11 = -class69.field1323; var11 < class69.field1323; var11++) {
                    for (int var12 = -class69.field1323; var12 < class69.field1323; var12++) {
                        boolean var13 = false;
                        label78: for (int var14 = -1; var14 <= 1; var14++) {
                            for (int var15 = -1; var15 <= 1; var15++) {
                                if (var7[var9][var10][var11 + var14 + class69.field1323 + 1][var12 + var15 + class69.field1323 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9][(var10 + 1) % 31][var11 + var14 + class69.field1323 + 1][var12 + var15 + class69.field1323 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][var10][var11 + var14 + class69.field1323 + 1][var12 + var15 + class69.field1323 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][(var10 + 1) % 31][var11 + var14 + class69.field1323 + 1][var12 + var15 + class69.field1323 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                            }
                        }
                        class178.field3393[var9][var10][class69.field1323 + var11][class69.field1323 + var12] = var13;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class196(Throwable arg0, String arg1) {
        this.field3807 = arg0;
        this.field3804 = arg1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method1248(int arg0) {
        field3802 = null;
        field3798 = null;
        field3797 = null;
        int var1 = 117 % ((62 - arg0) / 32);
        field3801 = null;
        field3799 = null;
        field3803 = null;
    }
}
