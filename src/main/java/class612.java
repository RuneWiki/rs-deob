import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class612 implements class198 {

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "Liw;")
    private class316 field8645;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "[I")
    public int[] field8650;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public int field8648;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public int field8652;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Lqb;")
    private class225 field8642;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "[F")
    public float[] field8643;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field8649 = 0;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field8655 = 0;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field8646;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field8654;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field8656;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ji", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field8657;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "[Lbb;")
    public static class334[] field8647;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "[Ldr;")
    public static class722[] field8653;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BII)Z")
    public static final boolean method3545(byte arg0, int arg1, int arg2) {
        if (arg0 >= -4) {
            field8653 = null;
        }
        field8646++;
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIZZ)V")
    public final void method1371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field8656++;
        class323.method2057(this.field8648, arg3, arg6 ? this.field8650 : null, this.field8645.field4467.field3661, this.field8645.field4467.field3658, arg4, arg5, arg7 ? this.field8643 : null, arg7 ? this.field8645.field4506 : null, arg2, arg0, 125, arg1);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILha;I)Z")
    public static final boolean method3546(int arg0, class60 arg1, int arg2) {
        field8644++;
        int var3 = (class194.field2946 - 104) / 2;
        int var4 = (class255.field3656 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var57 = var4; var57 < var4 + 104; var57++) {
                for (int var58 = arg2; var58 <= 3; var58++) {
                    if (class46.method350(arg2, 25380, var57, var58, var6)) {
                        int var59 = var58;
                        if (class286.method1827(var6, var57, (byte) 116)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class650.method3773(var59, var6, (byte) 84, var57);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        if (arg0 != -3186) {
            field8647 = null;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class741.field10402 = arg1.method531(512, 512, var7, 512, 0, (byte) -101);
        class630.method3632((byte) 65);
        int var9 = -((-((int) (Math.random() * 20.0D)) - (((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (((int) (Math.random() * 20.0D) - 10) + 238 << 8))) - 238) - 10 | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x32AEFF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class61.field880 + 3][class61.field880 + 1 + 2];
        for (int var13 = var3; var13 < var3 + 104; var13 += class61.field880) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class61.field880) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var37 += 4;
                    var39 = var13 - 1;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = class61.field880 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = class61.field880 + var36;
                if (var42 < 104) {
                    var42++;
                    var38 += 4;
                }
                arg1.method476(0, 0, var37 + (class61.field880 * 4), class61.field880 * 4 + var38);
                arg1.method502(-16777216);
                for (int var43 = arg2; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class61.field880; var50++) {
                        for (int var56 = 0; var56 <= class61.field880; var56++) {
                            var12[var50][var56] = class46.method350(arg2, 25380, var40 + var56, var43, var39 + var50);
                        }
                    }
                    class531.field7566[var43].method970(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class325.field4649) {
                        for (int var51 = -4; var51 < class61.field880; var51++) {
                            for (int var52 = -4; var52 < class61.field880; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var3 <= var53 && var54 >= var4 && class46.method350(arg2, 25380, var54, var43, var53)) {
                                    int var55 = var43;
                                    if (class286.method1827(var53, var54, (byte) -86)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class642.method3681(var51 * 4 + var37, arg1, var55, var10, var38 + ((-var52 + class61.field880) * 4) - 4, (byte) -55, var9, var53, var54);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class325.field4649) {
                    class240 var44 = class326.field4655[arg2];
                    for (int var45 = 0; var45 < class61.field880; var45++) {
                        for (int var46 = 0; var46 < class61.field880; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field3488[var47 - var44.field3500][var48 - var44.field3482];
                            if ((var49 & 0x40240000) != 0) {
                                arg1.method482(var37 + (var45 * 4), -1713569622, 4, arg0 + 3187, var38 - -((class61.field880 - var46) * 4) + -4, 4);
                            } else if ((var49 & 0x800000) != 0) {
                                arg1.method448((class61.field880 - var46) * 4 + var38 - 4, 4, (byte) -46, -1713569622, var45 * 4 + var37);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg1.method437(-1713569622, 4, (class61.field880 - var46) * 4 + var38 - 4, var45 * 4 + 3 + var37, arg0 ^ 0xFFFFF38F);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg1.method448((class61.field880 - var46) * 4 + var38 + 3 - 4, 4, (byte) 115, -1713569622, var37 + (var45 * 4));
                            } else if ((var49 & 0x20000000) != 0) {
                                arg1.method437(-1713569622, 4, var38 + ((class61.field880 - var46) * 4) - 4, var45 * 4 + var37, arg0 + 3187);
                            }
                        }
                    }
                }
                arg1.method516(var37, var38, class61.field880 * 4, class61.field880 * 4, var11, 2);
                class741.field10402.method135((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + 464 - class61.field880 * 4, class61.field880 * 4, class61.field880 * 4, var37, var38);
            }
        }
        arg1.method469();
        arg1.method502(-16777215);
        class459.method2805(arg0 + 3307);
        class45.field511 = 0;
        class673.field9382.method1200(47);
        if (!class325.field4649) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg2; (arg2 + 1) >= var21 && var21 <= 3; var21++) {
                        if (class46.method350(arg2, 25380, var20, var21, var14)) {
                            class721 var22 = (class721) class577.method3340(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class721) class755.method4208(var21, var14, var20, field8657 == null ? (field8657 = method3549("jn")) : field8657);
                            }
                            if (var22 == null) {
                                var22 = (class721) class608.method3529(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class721) class245.method1634(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class211 var23 = class239.field3470.method388(var22.method317(121), 100);
                                if (!var23.field3146 || class691.field9553) {
                                    int var24 = var23.field3118;
                                    if (var23.field3172 != null) {
                                        for (int var25 = 0; var25 < var23.field3172.length; var25++) {
                                            if (var23.field3172[var25] != -1) {
                                                class211 var26 = class239.field3470.method388(var23.field3172[var25], 100);
                                                if (var26.field3118 >= 0) {
                                                    var24 = var26.field3118;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class519 var28 = class637.field8949.method864(-124, var24);
                                            if (var28 != null && var28.field7405) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class326.field4655[var21].field3488;
                                            int var32 = class326.field4655[var21].field3500;
                                            int var33 = class326.field4655[var21].field3482;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && var14 - 3 < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && (var3 + 104 - 1) > var29 && var14 + 3 > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var20 - 3 < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && (var4 + 104 - 1) > var30 && var20 + 3 > var30 && (var31[var29 - var32][var30 - (var33 - 1)] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class188.field2857[class45.field511] = var23.field3158;
                                        class461.field6801[class45.field511] = var29;
                                        class309.field4388[class45.field511] = var30;
                                        class45.field511++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class567.field8057 != null) {
                class734.field10278.field400 = 1;
                class637.field8949.method863(-257, 1024, 64);
                for (int var15 = 0; var15 < class567.field8057.field2354; var15++) {
                    int var16 = class567.field8057.field2353[var15];
                    if (var16 >> 28 == class130.field1749.field8429) {
                        int var17 = ((var16 & 0xFFFCD95) >> 14) - class361.field5224;
                        int var18 = (var16 & 0x3FFF) - class582.field8288;
                        if (var17 >= 0 && class194.field2946 > var17 && var18 >= 0 && var18 < class255.field3656) {
                            class673.field9382.method1203(new class317(var15), (byte) 107);
                        } else {
                            class519 var19 = class637.field8949.method864(-17, class567.field8057.field2348[var15]);
                            if (var19.field7419 != null && (var19.field7407 + var17) >= 0 && class194.field2946 > var17 + var19.field7417 && var19.field7442 + var18 >= 0 && class255.field3656 > var19.field7416 + var18) {
                                class673.field9382.method1203(new class317(var15), (byte) 100);
                            }
                        }
                    }
                }
                class637.field8949.method863(-257, 128, 64);
                class734.field10278.field400 = 2;
                class734.field10278.method224((byte) 120);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/io/File;II)[B")
    public static final byte[] method3547(File arg0, int arg1, int arg2) {
        field8651++;
        try {
            if (arg2 != -1) {
                method3546(-83, null, 1);
            }
            byte[] var3 = new byte[arg1];
            class149.method1108(arg0, true, var3, arg1);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIIIIZZ)V")
    public final void method1372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field8654++;
        class323.method2057(this.field8645.field4467.field3658, arg3, arg6 ? this.field8645.field4467.field3661 : null, this.field8650, this.field8648, arg4, arg5, arg7 ? this.field8645.field4506 : null, arg7 ? this.field8643 : null, arg2, arg0, 116, arg1);
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Liw;Lpga;Lqb;)V")
    public class612(class316 arg0, class536 arg1, class225 arg2) {
        this.field8645 = arg0;
        if ((arg1 instanceof class155)) {
            class155 var5 = (class155) arg1;
            this.field8648 = var5.field10346;
            this.field8652 = var5.field10337;
            this.field8650 = var5.field2508;
        } else if ((arg1 instanceof class26)) {
            class26 var4 = (class26) arg1;
            this.field8650 = var4.field264;
            this.field8648 = var4.field10346;
            this.field8652 = var4.field10337;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field8642 = arg2;
            if (this.field8642.field3308 != this.field8648 || this.field8642.field3307 != this.field8652) {
                throw new RuntimeException();
            }
            this.field8643 = this.field8642.field3312;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static void method3548(int arg0) {
        field8647 = null;
        field8653 = null;
        if (arg0 != -10552) {
            method3545((byte) -16, -124, 28);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3549(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
