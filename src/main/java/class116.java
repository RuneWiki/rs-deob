import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public class class116 {

    @OriginalMember(owner = "client!rja", name = "e", descriptor = "[I")
    public int[] field1385;

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "[I")
    public int[] field1382;

    @OriginalMember(owner = "client!rja", name = "j", descriptor = "[I")
    public int[] field1376;

    @OriginalMember(owner = "client!rja", name = "d", descriptor = "[I")
    public int[] field1381;

    @OriginalMember(owner = "client!rja", name = "m", descriptor = "[S")
    public short[] field1378;

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "[S")
    public short[] field1374;

    @OriginalMember(owner = "client!rja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1387 = new String[] { method1027(method1026("`\u0002U\u0014")), method1027(method1026("|\u001dXV\r&")), method1027(method1026("uY\u0017V1")), method1027(method1026("|\u001dXV\t&")), method1027(method1026("\u007f\u001e")), method1027(method1026("|\u001dXV\u000f&")), method1027(method1026("|\u001dXV\b&")), method1027(method1026("2\u001bMF")), method1027(method1026("2\u0010MF")), method1027(method1026("|\u001dXVpg\u0019P\fr&")), method1027(method1026("|\u001dXV\u000e&")) };

    @OriginalMember(owner = "client!rja", name = "i", descriptor = "Lel;")
    public static class573 field1383 = new class573(45, 2);

    @OriginalMember(owner = "client!rja", name = "k", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!rja", name = "c", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!rja", name = "h", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!rja", name = "g", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!rja", name = "l", descriptor = "I")
    public static int field1384;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rja", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field1386;

    // $FF: synthetic method
    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1025(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 7)
    public static final String method1020(String arg0, int arg1) {
        try {
            field1380++;
            int var2 = arg0.length();
            int var3 = 0;
            if (arg1 != 24347) {
                field1384 = -29;
            }
            for (int var4 = 0; var4 < var2; var4++) {
                char var5 = arg0.charAt(var4);
                if (var5 == '<' || var5 == '>') {
                    var3 += 3;
                }
            }
            StringBuffer var6 = new StringBuffer(var2 + var3);
            for (int var7 = 0; var7 < var2; var7++) {
                char var8 = arg0.charAt(var7);
                if (var8 == '<') {
                    var6.append(field1387[7]);
                } else if (var8 == '>') {
                    var6.append(field1387[8]);
                } else {
                    var6.append(var8);
                }
            }
            return var6.toString();
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field1387[6] + (arg0 == null ? field1387[0] : field1387[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(I)V", line = 56)
    public static void method1021(int arg0) {
        try {
            field1383 = null;
            if (arg0 != -3) {
                method1021(-52);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1387[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(IIBI[FIFIF[FIIFI)V", line = 75)
    public static final void method1022(int arg0, int arg1, byte arg2, int arg3, float[] arg4, int arg5, float arg6, int arg7, float arg8, float[] arg9, int arg10, int arg11, float arg12, int arg13) {
        try {
            int var23 = arg1 - arg11;
            int var24 = arg7 - arg10;
            field1379++;
            int var25 = arg13 - arg0;
            if (arg2 > 23) {
                float var14 = arg9[2] * (float) var24 + arg9[0] * (float) var25 + arg9[1] * (float) var23;
                float var15 = arg9[5] * (float) var24 + arg9[3] * (float) var25 + arg9[4] * (float) var23;
                float var16 = arg9[8] * (float) var24 + arg9[7] * (float) var23 + arg9[6] * (float) var25;
                float var17;
                float var18;
                if (arg5 == 0) {
                    var18 = arg12 + 0.5F - var16;
                    var17 = arg8 + var14 + 0.5F;
                } else if (arg5 == 1) {
                    var18 = arg12 + var16 + 0.5F;
                    var17 = arg8 + var14 + 0.5F;
                } else if (arg5 == 2) {
                    var17 = arg8 + 0.5F - var14;
                    var18 = arg6 + 0.5F - var15;
                } else if (arg5 == 3) {
                    var17 = arg8 + var14 + 0.5F;
                    var18 = arg6 + 0.5F - var15;
                } else if (arg5 == 4) {
                    var17 = arg12 + var16 + 0.5F;
                    var18 = arg6 + 0.5F - var15;
                } else {
                    var17 = arg12 + 0.5F - var16;
                    var18 = arg6 + 0.5F - var15;
                }
                if (arg3 == 1) {
                    float var19 = var17;
                    var17 = -var18;
                    var18 = var19;
                } else if (arg3 == 2) {
                    var17 = -var17;
                    var18 = -var18;
                } else if (arg3 == 3) {
                    float var20 = var17;
                    var17 = var18;
                    var18 = -var20;
                }
                arg4[0] = var17;
                arg4[1] = var18;
            }
        } catch (RuntimeException var22) {
            throw class759.method5498(var22, field1387[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field1387[0] : field1387[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 == null ? field1387[0] : field1387[2]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(ZLmca;)[Lpi;", line = 167)
    public static final class523[] method1023(boolean arg0, class33 arg1) {
        try {
            field1377++;
            if (!arg1.method216(0)) {
                return new class523[0];
            }
            if (arg0) {
                method1024(null, 113);
            }
            class42 var2 = arg1.method214((byte) -87);
            while (var2.field503 == 0) {
                class151.method1269(arg0, 10L);
            }
            if (var2.field503 == 2) {
                return new class523[0];
            }
            int[] var3 = (int[]) var2.field499;
            class523[] var4 = new class523[var3.length >> 2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class523 var6 = new class523();
                var4[var5] = var6;
                var6.field7647 = var3[var5 << 2];
                var6.field7642 = var3[(var5 << 2) + 1];
                var6.field7645 = var3[(var5 << 2) + 2];
                var6.field7641 = var3[(var5 << 2) + 3];
            }
            return var4;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1387[5] + arg0 + ',' + (arg1 == null ? field1387[0] : field1387[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!rja", name = "<init>", descriptor = "(Lko;)V", line = 210)
    public class116(class530 arg0) {
        try {
            this.field1385 = new int[3];
            this.field1382 = new int[2];
            this.field1376 = new int[2];
            this.field1381 = new int[3];
            this.field1381[1] = arg0.field7794;
            this.field1381[2] = arg0.field7710;
            this.field1381[0] = arg0.field7749;
            this.field1385[2] = arg0.field7785;
            this.field1385[1] = arg0.field7783;
            this.field1385[0] = arg0.field7722;
            this.field1376[1] = arg0.field7762;
            this.field1376[0] = arg0.field7780;
            this.field1382[1] = arg0.field7713;
            this.field1382[0] = arg0.field7763;
            if (arg0.field7739 != null) {
                this.field1378 = new short[arg0.field7739.length];
                class467.method3552(arg0.field7739, 0, this.field1378, 0, this.field1378.length);
            }
            if (arg0.field7760 != null) {
                this.field1374 = new short[arg0.field7760.length];
                class467.method3552(arg0.field7760, 0, this.field1374, 0, this.field1374.length);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1387[9] + (arg0 == null ? field1387[0] : field1387[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 245)
    public static final boolean method1024(String arg0, int arg1) {
        try {
            field1375++;
            if (arg1 != 1) {
                field1383 = null;
            }
            return class770.method5565(arg1 + 98, field1386 == null ? (field1386 = method1025(field1387[4])) : field1386, arg0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1387[3] + (arg0 == null ? field1387[0] : field1387[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1026(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1027(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 119;
                    break;
                case 2:
                    var10005 = 57;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 76;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
