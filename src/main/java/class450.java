import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class450 extends class431 implements class529 {

    @OriginalMember(owner = "client!av", name = "H", descriptor = "Lpe;")
    public class431 field6628;

    @OriginalMember(owner = "client!av", name = "S", descriptor = "J")
    public static long field6639 = 0L;

    @OriginalMember(owner = "client!av", name = "D", descriptor = "Lgk;")
    public static class331 field6624 = new class331("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!av", name = "V", descriptor = "Z")
    public static boolean field6642 = false;

    @OriginalMember(owner = "client!av", name = "w", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!av", name = "x", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!av", name = "y", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!av", name = "z", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!av", name = "A", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!av", name = "B", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!av", name = "E", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!av", name = "F", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!av", name = "G", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!av", name = "I", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!av", name = "J", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!av", name = "K", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!av", name = "L", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!av", name = "M", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!av", name = "N", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!av", name = "P", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!av", name = "Q", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!av", name = "R", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!av", name = "T", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!av", name = "U", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!av", name = "W", descriptor = "Lla;")
    public static class314 field6643;

    @OriginalMember(owner = "client!av", name = "O", descriptor = "[Z")
    public static boolean[] field6635;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method30(int arg0) {
        field6620++;
        if (arg0 != 10869) {
            this.method25(50, -29, null, (byte) 35, false, null, 104);
        }
        return false;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lya;I)V", line = 14)
    public final void method31(class38 arg0, int arg1) {
        field6641++;
        if (arg1 != -12694) {
            this.method27(59);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IILya;I)Z", line = 25)
    public final boolean method34(int arg0, int arg1, class38 arg2, int arg3) {
        field6619++;
        if (arg1 != 0) {
            this.method22((byte) 91);
        }
        return false;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IILfi;BZLya;I)V", line = 40)
    public final void method25(int arg0, int arg1, class388 arg2, byte arg3, boolean arg4, class38 arg5, int arg6) {
        if (arg3 != -99) {
            field6624 = null;
        }
        field6636++;
    }

    @OriginalMember(owner = "client!av", name = "e", descriptor = "(B)V", line = 52)
    public static final void method2719(byte arg0) {
        field6627++;
        if (class37.field413 != null) {
            return;
        }
        class37.field413 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        int var3 = -26 % ((arg0 - 46) / 48);
        for (int var4 = 0; var4 < 65536; var4++) {
            double var5 = (double) (var4 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var7 = (double) (var4 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var9 = (double) (var4 & 0x7F) / 128.0D;
            double var11 = var9;
            double var13 = var9;
            double var15 = var9;
            if (var7 != 0.0D) {
                double var17;
                if (var9 < 0.5D) {
                    var17 = (var7 + 1.0D) * var9;
                } else {
                    var17 = var7 + var9 - (var7 * var9);
                }
                double var19 = var9 * 2.0D - var17;
                double var21 = var5 + 0.3333333333333333D;
                if (var21 > 1.0D) {
                    var21--;
                }
                double var25 = var5 - 0.3333333333333333D;
                if (var25 < 0.0D) {
                    var25++;
                }
                if (var5 * 6.0D < 1.0D) {
                    var13 = (var17 - var19) * 6.0D * var5 + var19;
                } else if (var5 * 2.0D < 1.0D) {
                    var13 = var17;
                } else if ((var5 * 3.0D < 2.0D)) {
                    var13 = (0.6666666666666666D - var5) * (var17 - var19) * 6.0D + var19;
                } else {
                    var13 = var19;
                }
                if (var21 * 6.0D < 1.0D) {
                    var11 = (var17 - var19) * 6.0D * var21 + var19;
                } else if ((var21 * 2.0D < 1.0D)) {
                    var11 = var17;
                } else if ((var21 * 3.0D < 2.0D)) {
                    var11 = (var17 - var19) * (0.6666666666666666D - var21) * 6.0D + var19;
                } else {
                    var11 = var19;
                }
                if (var25 * 6.0D < 1.0D) {
                    var15 = (var17 - var19) * 6.0D * var25 + var19;
                } else if ((var25 * 2.0D < 1.0D)) {
                    var15 = var17;
                } else if ((var25 * 3.0D < 2.0D)) {
                    var15 = (var17 - var19) * (0.6666666666666666D - var25) * 6.0D + var19;
                } else {
                    var15 = var19;
                }
            }
            double var27 = Math.pow(var11, var1);
            double var29 = Math.pow(var13, var1);
            double var31 = Math.pow(var15, var1);
            int var33 = (int) (var27 * 256.0D);
            int var34 = (int) (var29 * 256.0D);
            int var35 = (int) (var31 * 256.0D);
            int var36 = (var33 << 16) + (var34 << 8) + var35;
            class37.field413[var4] = var36;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IILya;ILuu;ILma;II)V", line = 166)
    public static final void method2720(int arg0, int arg1, class38 arg2, int arg3, class188 arg4, int arg5, class10 arg6, int arg7, int arg8) {
        field6638++;
        class405 var9 = class175.field2483.method837(arg3, (byte) -41);
        if (arg1 != -14698 || var9 == null || !var9.field6021 || !var9.method2481(-11247, class253.field3739)) {
            return;
        }
        if (var9.field6020 != null) {
            int[] var10 = new int[var9.field6020.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class462.field6802 == 4) {
                    var13 = (int) class328.field4588 & 0x3FFF;
                } else {
                    var13 = (int) class328.field4588 + class455.field6702 & 0x3FFF;
                }
                int var14 = class340.field4724[var13];
                int var15 = class340.field4715[var13];
                if (class462.field6802 != 4) {
                    var15 = var15 * 256 / (class465.field6839 + 256);
                    var14 = var14 * 256 / (class465.field6839 + 256);
                }
                var10[var11 * 2] = ((var9.field6020[var11 * 2] * 4 + arg0) * var15 + (var9.field6020[var11 * 2 + 1] * 4 + arg5) * var14 >> 15) + arg4.field2711 / 2 + arg7;
                var10[var11 * 2 + 1] = arg8 - (((arg5 + (var9.field6020[var11 * 2 + 1] * 4)) * var15 - (var9.field6020[var11 * 2] * 4 + arg0) * var14 >> 15) - (arg4.field2672 / 2));
            }
            class271.method1752(arg2, var10, var9.field6016, arg4.field2769, arg4.field2713);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg2.method357(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[(var12 + 1) * 2 + 1], var9.field5993, 1, arg6, arg7, arg8);
            }
            arg2.method357(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field5993, 1, arg6, arg7, arg8);
        }
        class16 var16 = null;
        if (var9.field6019 != -1) {
            var16 = var9.method2488(arg2, false, (byte) 119);
            if (var16 != null) {
                class100.method859(arg7, true, var16, arg4, arg6, arg5, arg0, arg8);
            }
        }
        if (var9.field5991 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method126();
        }
        class314 var18 = class122.field1792;
        class316 var19 = class59.field685;
        if (var9.field5987 == 1) {
            var18 = class396.field5802;
            var19 = class307.field4366;
        }
        if (var9.field5987 == 2) {
            var18 = class466.field6840;
            var19 = class387.field5731;
        }
        class287.method1824(arg7, var9.field5991, 3, arg0, var17, var18, arg8, arg4, arg5, var9.field6015, var19, arg6);
        return;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)I", line = 268)
    public final int method22(byte arg0) {
        field6631++;
        if (arg0 != -70) {
            this.method24(null, -77, -46);
        }
        return 0;
    }

    @OriginalMember(owner = "client!av", name = "g", descriptor = "(I)V", line = 279)
    public static void method2721(int arg0) {
        field6624 = null;
        if (arg0 != 0) {
            method2722(31, 20);
        }
        field6643 = null;
        field6635 = null;
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(IIIIIIIIIILpe;)V", line = 291)
    public class450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class431 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class157.method1121((byte) 120, arg1, arg0));
        this.field6628 = arg10;
    }

    @OriginalMember(owner = "client!av", name = "d", descriptor = "(B)Z", line = 299)
    public final boolean method32(byte arg0) {
        if (arg0 <= 104) {
            return false;
        } else {
            field6634++;
            return false;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZLya;)V", line = 310)
    public final void method26(boolean arg0, class38 arg1) {
        if (!arg0) {
            this.method29(-9);
        }
        field6633++;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)I", line = 320)
    public final int method28(boolean arg0) {
        field6623++;
        if (!arg0) {
            field6635 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!av", name = "e", descriptor = "(I)I", line = 334)
    public final int method890(int arg0) {
        if (arg0 == -25430) {
            field6626++;
            return 0;
        } else {
            return 119;
        }
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(Lya;I)Lfk;", line = 345)
    public final class462 method38(class38 arg0, int arg1) {
        if (arg1 >= -87) {
            return null;
        } else {
            field6622++;
            return null;
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V", line = 356)
    public final void method39(int arg0) {
        field6621++;
        if (arg0 > -18) {
            field6642 = true;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)V", line = 368)
    public static final void method2722(int arg0, int arg1) {
        if (arg0 != 0) {
            field6643 = null;
        }
        class2.field12 = arg1;
        field6630++;
        class429.field6321.method1105(false);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lya;II)Lt;", line = 380)
    public final class471 method24(class38 arg0, int arg1, int arg2) {
        field6637++;
        int var4 = 81 / ((54 - arg2) / 56);
        return null;
    }

    @OriginalMember(owner = "client!av", name = "d", descriptor = "(I)V", line = 390)
    public final void method29(int arg0) {
        int var2 = 74 / ((arg0 - 57) / 44);
        field6625++;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(Lya;I)V", line = 401)
    public final void method35(class38 arg0, int arg1) {
        if (arg1 <= 53) {
            this.method28(true);
        }
        field6632++;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 413)
    public static final String method2723(String arg0, byte arg1) {
        field6618++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 <= 63) {
            method2721(108);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!av", name = "h", descriptor = "(I)Ljava/lang/String;", line = 463)
    public static final String method2724(int arg0) {
        field6629++;
        if (arg0 != 256) {
            return null;
        }
        String var1 = "www";
        if (client.field2879 == class365.field5281) {
            var1 = "www-wtrc";
        } else if (class365.field5281 == class255.field3743) {
            var1 = "www-wtqa";
        } else if (class365.field5281 == class104.field1451) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class307.field4365 != null) {
            var2 = "/p=" + class307.field4365;
        }
        return "http://" + var1 + "." + class61.field703.field6596 + ".com/l=" + class377.field5585 + "/a=" + class401.field5950 + var2 + "/";
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(I)I", line = 499)
    public final int method27(int arg0) {
        field6640++;
        int var2 = 53 / ((arg0 - 39) / 41);
        return 0;
    }
}
