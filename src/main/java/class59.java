import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class59 extends class177 {

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    private int field872 = 4096;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    private int field883 = 3216;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "[I")
    private int[] field888 = new int[3];

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    private int field881 = 3216;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "Ljava/lang/String;")
    public static String field884 = "Connection lost.";

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "Lad;")
    public static class128 field882 = new class128();

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
    public static int field889 = 0;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "I")
    public static int field890 = 0;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V", line = 6)
    public static void method523(int arg0) {
        if (arg0 == 1539230348) {
            field884 = null;
            field882 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(B)V", line = 18)
    private final void method524(byte arg0) {
        if (arg0 <= 104) {
            this.method97((class35) null, 79, -35);
        }
        field877++;
        double var2 = Math.cos((double) ((float) this.field883 / 4096.0F));
        this.field888[0] = (int) (Math.sin((double) ((float) this.field881 / 4096.0F)) * var2 * 4096.0D);
        this.field888[1] = (int) (Math.cos((double) ((float) this.field881 / 4096.0F)) * var2 * 4096.0D);
        this.field888[2] = (int) (Math.sin((double) ((float) this.field883 / 4096.0F)) * 4096.0D);
        int var4 = this.field888[0] * this.field888[0] >> 12;
        int var5 = this.field888[1] * this.field888[1] >> 12;
        int var6 = this.field888[2] * this.field888[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field888[0] = (this.field888[0] << 12) / var7;
            this.field888[1] = (this.field888[1] << 12) / var7;
            this.field888[2] = (this.field888[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lhb;II)V", line = 52)
    public final void method97(class35 arg0, int arg1, int arg2) {
        field870++;
        if (arg1 != -18061) {
            method526((byte) -125, -47);
        }
        if (arg2 == 0) {
            this.field872 = arg0.method300(-1394191632);
        } else if (arg2 == 1) {
            this.field881 = arg0.method300(-1394191632);
        } else if (arg2 == 2) {
            this.field883 = arg0.method300(-1394191632);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)[I", line = 95)
    public final int[] method95(int arg0, int arg1) {
        field878++;
        if (arg0 > -52) {
            method528(72, false, true, (byte) 103, -55, 83, -126, true);
        }
        int[] var3 = this.field2652.method1481(arg1, (byte) -78);
        if (this.field2652.field3287) {
            int var4 = class79.field1115 * this.field872 >> 12;
            int[] var5 = this.method1280(class11.field120 & arg1 - 1, 0, false);
            int[] var6 = this.method1280(arg1, 0, false);
            int[] var7 = this.method1280(arg1 + 1 & class11.field120, 0, false);
            for (int var8 = 0; var8 < class287.field4415; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = var9 >> 4;
                int var11 = (var6[var8 - 1 & class133.field2090] - var6[var8 + 1 & class133.field2090]) * var4 >> 12;
                int var12 = var11 >> 4;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > 255) {
                    var10 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class272.field4110[((var10 + 1) * var10 >> 1) + var12] & 0xFF;
                int var14 = var9 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = this.field888[1] * var14 >> 12;
                int var17 = var11 * var13 >> 8;
                int var18 = this.field888[0] * var17 >> 12;
                int var19 = this.field888[2] * var15 >> 12;
                var3[var8] = var18 + var19 + var16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZCI)C", line = 165)
    public static final char method525(boolean arg0, char arg1, int arg2) {
        field876++;
        if (!arg0) {
            field882 = (class128) null;
        }
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(BI)V", line = 252)
    public static final void method526(byte arg0, int arg1) {
        if (class183.field2773 == null) {
            class183.field2773 = new byte[4][104][104];
        }
        if (arg1 != 13226) {
            field884 = (String) null;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class183.field2773[var2][var3][var4] = arg0;
                }
            }
        }
        field869++;
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(B)Z", line = 292)
    public static final boolean method527(byte arg0) {
        field873++;
        if (class41.field616 == 0) {
            if (arg0 <= 54) {
                field882 = (class128) null;
            }
            return class213.field3383.method858(85);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V", line = 786)
    public class59() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZZBIIIZ)Lsd;", line = 312)
    public static final class27 method528(int arg0, boolean arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field874++;
        class274 var8 = class225.method1603(arg4, 0);
        if (arg6 > 1 && var8.field4145 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field4193[var10] <= arg6 && var8.field4193[var10] != 0) {
                    var9 = var8.field4145[var10];
                }
            }
            if (var9 != -1) {
                var8 = class225.method1603(var9, 0);
            }
        }
        class85 var11 = var8.method1913(-10);
        if (var11 == null) {
            return null;
        }
        class134 var12 = null;
        if (var8.field4156 != -1) {
            var12 = (class134) method528(1, true, true, (byte) -121, var8.field4148, 0, 10, false);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field4177 != -1) {
            var12 = (class134) method528(arg0, true, false, (byte) -86, var8.field4195, arg5, arg6, false);
            if (var12 == null) {
                return null;
            }
        }
        int var13 = class168.field2527;
        int[] var14 = class168.field2525;
        int var15 = class168.field2524;
        int[] var16 = new int[4];
        class168.method1238(var16);
        class134 var17 = new class134(36, 32);
        class168.method1244(var17.field2101, 36, 32);
        class56.method505();
        class56.method494(16, 16);
        class56.field826 = false;
        int var18 = var8.field4210;
        if (arg2) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg0 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class56.field838[var8.field4201] * var18 >> 16;
        int var20 = class56.field830[var8.field4201] * var18 >> 16;
        var11.method18(0, var8.field4167, var8.field4154, var8.field4201, var8.field4196, var19 + var8.field4185 - (var11.method19() / 2), var8.field4185 + var20, -1L);
        if (arg0 >= 1) {
            var17.method1019(1);
            if (arg0 >= 2) {
                var17.method1019(16777215);
            }
            class168.method1244(var17.field2101, 36, 32);
        }
        if (arg5 != 0) {
            var17.method1024(arg5);
        }
        if (var8.field4156 != -1) {
            var12.method186(0, 0);
        } else if (var8.field4177 != -1) {
            class168.method1244(var12.field2101, 36, 32);
            var17.method186(0, 0);
            var17 = var12;
        }
        if (arg7 && (var8.field4173 == 1 || arg6 != 1) && arg6 != -1) {
            class41.field618.method434(class287.method2024(-21883, arg6), 0, 9, 16776960, 1);
        }
        class168.method1244(var14, var13, var15);
        class168.method1241(var16);
        class56.method505();
        class56.field826 = true;
        if (class36.field534 && !arg1) {
            return new class221(var17);
        } else if (arg3 >= -61) {
            return (class27) null;
        } else {
            return var17;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 438)
    public static final String method529(String arg0, boolean arg1) {
        field887++;
        int var2 = arg0.length();
        if (!arg1) {
            return (String) null;
        }
        byte var3 = 2;
        char[] var4 = new char[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg0.charAt(var5);
            if (var3 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var3 == 2 || Character.isUpperCase(var6)) {
                var6 = Character.toTitleCase(var6);
            }
            if (Character.isLetter(var6)) {
                var3 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var3 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var4[var5] = var6;
        }
        return new String(var4);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Laj;ZIIIIZLng;IIIIII)Laj;", line = 500)
    public static final class1 method530(class1 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, class162 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field885++;
        long var14 = ((long) arg5 << 48) + ((long) arg10 << 32) + (long) ((arg2 << 24) + (arg8 - -(arg13 << 16)));
        class1 var16 = (class1) class297.field4655.method1432((byte) 117, var14);
        if (var16 == null) {
            byte var17 = 3;
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19;
            if (arg8 == 1) {
                var19 = 9;
            } else if (arg8 == 2) {
                var19 = 12;
            } else if (arg8 == 3) {
                var19 = 15;
            } else if (arg8 == 4) {
                var19 = 18;
            } else {
                var19 = 21;
            }
            int[][] var20 = new int[var17][var19];
            class42 var21 = new class42(var17 * var19 + 1, var19 * 2 * var17 + -var19, 0);
            int var22 = var21.method392(0, 0, 0);
            for (int var23 = 0; var23 < var17; var23++) {
                int var24 = var18[var23];
                int var25 = var18[var23];
                for (int var26 = 0; var26 < var19; var26++) {
                    int var27 = (var26 << 11) / var19;
                    int var28 = arg9 + (class56.field838[var27] * var24) >> 16;
                    int var29 = class56.field830[var27] * var25 + arg3 >> 16;
                    var20[var23][var26] = var21.method392(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var17; var30++) {
                int var31 = (var30 * 256 + 128) / var17;
                int var32 = 256 - var31;
                short var33 = (short) (((arg5 & 0x380) * var31 + (arg10 & 0x380) * var32 & 0x38000) + ((arg5 & 0x7F) * var31 + (arg10 & 0x7F) * var32 & 0x7F00) + ((arg5 & 0xFC00) * var31 + (arg10 & 0xFC00) * var32 & 0xFC0000) >> 8);
                byte var34 = (byte) (arg2 * var31 + arg13 * var32 >> 8);
                for (int var35 = 0; var35 < var19; var35++) {
                    if (var30 == 0) {
                        var21.method390(var22, var20[0][(var35 + 1) % var19], var20[0][var35], (byte) 1, var33, var34);
                    } else {
                        var21.method390(var20[var30 - 1][var35], var20[var30 - 1][(var35 + 1) % var19], var20[var30][(var35 + 1) % var19], (byte) 1, var33, var34);
                        var21.method390(var20[var30 - 1][var35], var20[var30][(var35 + 1) % var19], var20[var30][var35], (byte) 1, var33, var34);
                    }
                }
            }
            var16 = var21.method379(64, 768, -50, -10, -50);
            class297.field4655.method1436(false, var16, var14);
        }
        int var36 = arg8 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = var36;
        int var40 = arg0.method25();
        int var41 = -var36;
        int var42 = arg0.method22();
        if (arg6) {
            if (arg11 > 1152 && arg11 < 1920) {
                var38 = var36 + 128;
            }
            if (arg11 > 1664 || arg11 < 384) {
                var37 -= 128;
            }
            if (arg11 > 128 && arg11 < 896) {
                var41 -= 128;
            }
            if (arg11 > 640 && arg11 < 1408) {
                var39 = var36 + 128;
            }
        }
        if (var42 > var38) {
            var42 = var38;
        }
        class160 var43 = null;
        int var44 = arg0.method12();
        if (var41 > var40) {
            var40 = var41;
        }
        int var45 = arg0.method17();
        if (var45 > var39) {
            var45 = var39;
        }
        if (var44 < var37) {
            var44 = var37;
        }
        if (arg7 != null) {
            int var46 = arg7.field2401[arg12];
            var43 = class41.method368(0, var46 >> 16);
            arg12 = var46 & 0xFFFF;
        }
        class1 var47;
        if (var43 == null) {
            var47 = var16.method26(true, true, true);
            var47.method2((var42 - var40) / 2, 128, (var45 - var44) / 2);
            var47.method32((var40 + var42) / 2, 0, (var44 + var45) / 2);
        } else {
            var47 = var16.method26(!var43.method1150(2, arg12), !var43.method1149(arg12, true), true);
            var47.method2((var42 - var40) / 2, 128, (var45 - var44) / 2);
            var47.method32((var40 + var42) / 2, 0, (var44 + var45) / 2);
            var47.method11(var43, arg12);
        }
        if (!arg1) {
            return (class1) null;
        }
        if (arg11 != 0) {
            var47.method23(arg11);
        }
        if (class36.field534) {
            class165 var50 = (class165) var47;
            if (arg4 != class294.method2080(899, arg3 + var44, arg9 + var40, class50.field775) || arg4 != class294.method2080(899, arg3 + var45, arg9 + var42, class50.field775)) {
                for (int var51 = 0; var51 < var50.field2438; var51++) {
                    var50.field2473[var51] += class294.method2080(899, var50.field2455[var51] + arg3, var50.field2446[var51] - -arg9, class50.field775) - arg4;
                }
                var50.field2443.field4749 = false;
                var50.field2466.field4989 = false;
            }
        } else {
            class85 var48 = (class85) var47;
            if (arg4 != class294.method2080(899, arg3 + var44, arg9 + var40, class50.field775) || class294.method2080(899, arg3 + var45, arg9 - -var42, class50.field775) != arg4) {
                for (int var49 = 0; var49 < var48.field1204; var49++) {
                    var48.field1176[var49] += class294.method2080(899, var48.field1196[var49] + arg3, var48.field1201[var49] + arg9, class50.field775) - arg4;
                }
                var48.field1187 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)Lhb;", line = 731)
    public static final class35 method531(int arg0) {
        field880++;
        class35 var1 = new class35(34);
        var1.method262((byte) 81, 11);
        var1.method262((byte) 81, class317.field4926);
        if (arg0 != 1) {
            method532(-26, 65);
        }
        var1.method262((byte) 81, class270.field4081 ? 1 : 0);
        var1.method262((byte) 81, class69.field1019 ? 1 : 0);
        var1.method262((byte) 81, class11.field127 ? 1 : 0);
        var1.method262((byte) 81, class325.field5062 ? 1 : 0);
        var1.method262((byte) 81, class154.field2327 ? 1 : 0);
        var1.method262((byte) 81, class38.field581 ? 1 : 0);
        var1.method262((byte) 81, class101.field1512 ? 1 : 0);
        var1.method262((byte) 81, class228.field3534 ? 1 : 0);
        var1.method262((byte) 81, class143.field2212);
        var1.method262((byte) 81, class175.field2589 ? 1 : 0);
        var1.method262((byte) 81, class289.field4541 ? 1 : 0);
        var1.method262((byte) 81, class319.field4971 ? 1 : 0);
        var1.method262((byte) 81, class204.field3246);
        var1.method262((byte) 81, class213.field3387 ? 1 : 0);
        var1.method262((byte) 81, class261.field3874);
        var1.method262((byte) 81, class170.field2536);
        var1.method262((byte) 81, class238.field3618);
        var1.method263(class100.field1498, (byte) 106);
        var1.method263(class44.field684, (byte) 113);
        var1.method262((byte) 81, class254.method1777());
        var1.method259(arg0 ^ 0xFFFFC4A4, class252.field3765);
        var1.method262((byte) 81, class6.field63);
        var1.method262((byte) 81, class235.field3605 ? 1 : 0);
        var1.method262((byte) 81, class304.field4766 ? 1 : 0);
        var1.method262((byte) 81, class107.field1647);
        var1.method262((byte) 81, class37.field545 ? 1 : 0);
        var1.method262((byte) 81, class287.field4432 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(II)V", line = 774)
    public static final void method532(int arg0, int arg1) {
        class27.field313 = 20;
        if (arg1 <= 41) {
            field882 = (class128) null;
        }
        class261.field3862 = 3;
        class107.field1644 = arg0;
        field875++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 800)
    public final void method465(int arg0) {
        field879++;
        int var2 = 32 % ((arg0 + 6) / 43);
        this.method524((byte) 115);
    }
}
