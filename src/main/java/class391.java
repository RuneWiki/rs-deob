import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class391 {

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
    private int field5888;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    private int field5881;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "[[I")
    private int[][] field5880;

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5891 = new String[] { method3111(method3110("4C\u007fIw")), method3111(method3110("4C\u007fMw")), method3111(method3110("-C=c")), method3111(method3110("8\u0018\u007f!\"")), method3111(method3110("4C\u007f36-_%1w")), method3111(method3110("4C\u007fLw")), method3111(method3110("4C\u007fNw")), method3111(method3110("4C\u007fJw")), method3111(method3110("4C\u007fKw")) };

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "Lel;")
    public static class573 field5885 = new class573(80, 2);

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "B")
    public static byte field5890;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "F")
    public static float field5887;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "Lmca;")
    public static class33 field5889;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[B)[B")
    public final byte[] method3104(int arg0, byte[] arg1) {
        try {
            if (arg0 != -26498) {
                return null;
            }
            field5882++;
            if (this.field5880 != null) {
                int var3 = (int) ((long) arg1.length * (long) this.field5881 / (long) this.field5888) + 14;
                int[] var4 = new int[var3];
                int var5 = 0;
                int var6 = 0;
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    byte var8 = arg1[var7];
                    int[] var9 = this.field5880[var6];
                    for (int var10 = 0; var10 < 14; var10++) {
                        var4[var5 + var10] += var9[var10] * var8;
                    }
                    int var11 = this.field5881 + var6;
                    int var12 = var11 / this.field5888;
                    var5 += var12;
                    var6 = var11 - this.field5888 * var12;
                }
                arg1 = new byte[var3];
                for (int var13 = 0; var13 < var3; var13++) {
                    int var14 = var4[var13] + 32768 >> 16;
                    if (var14 < -128) {
                        arg1[var13] = -128;
                    } else if (var14 > 127) {
                        arg1[var13] = 127;
                    } else {
                        arg1[var13] = (byte) var14;
                    }
                }
            }
            return arg1;
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field5891[1] + arg0 + ',' + (arg1 == null ? field5891[2] : field5891[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZLpda;)V")
    public static final void method3105(boolean arg0, class655 arg1) {
        try {
            field5886++;
            boolean var2 = false;
            arg1.method362((byte) 72);
            class655 var3 = (class655) class492.field7058.method4068(!arg0);
            if (!arg0) {
                method3105(true, null);
            }
            while (var3 != null) {
                if (class315.method2649(arg1.method4803(29), false, var3.method4803(103))) {
                    class109.method959(var3, arg1, (byte) 82);
                    var2 = true;
                    break;
                }
                var3 = (class655) class492.field7058.method4072(-113);
            }
            if (!var2) {
                class492.field7058.method4067((byte) -122, arg1);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5891[7] + arg0 + ',' + (arg1 == null ? field5891[2] : field5891[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)I")
    public final int method3106(int arg0, int arg1) {
        try {
            if (arg0 != 0) {
                this.method3109((byte) -85, 117);
            }
            if (this.field5880 != null) {
                arg1 = (int) ((long) this.field5881 * (long) arg1 / (long) this.field5888) + 6;
            }
            field5883++;
            return arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5891[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V")
    public static void method3107(byte arg0) {
        try {
            field5889 = null;
            if (arg0 == -44) {
                field5885 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5891[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[S)[S")
    public final short[] method3108(int arg0, short[] arg1) {
        try {
            if (arg0 != 2) {
                field5890 = 28;
            }
            field5879++;
            if (this.field5880 != null) {
                int var3 = (int) ((long) arg1.length * (long) this.field5881 / (long) this.field5888) + 14;
                int[] var4 = new int[var3];
                int var5 = 0;
                int var6 = 0;
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    short var8 = arg1[var7];
                    int[] var9 = this.field5880[var6];
                    for (int var10 = 0; var10 < 14; var10++) {
                        var4[var5 + var10] += var9[var10] * var8 >> 2;
                    }
                    int var11 = this.field5881 + var6;
                    int var12 = var11 / this.field5888;
                    var6 = var11 - this.field5888 * var12;
                    var5 += var12;
                }
                arg1 = new short[var3];
                for (int var13 = 0; var13 < var3; var13++) {
                    int var14 = var4[var13] + 8192 >> 14;
                    if (var14 < -32768) {
                        arg1[var13] = -32768;
                    } else if (var14 > 32767) {
                        arg1[var13] = 32767;
                    } else {
                        arg1[var13] = (short) var14;
                    }
                }
            }
            return arg1;
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field5891[8] + arg0 + ',' + (arg1 == null ? field5891[2] : field5891[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BI)I")
    public final int method3109(byte arg0, int arg1) {
        try {
            if (this.field5880 != null) {
                arg1 = (int) ((long) this.field5881 * (long) arg1 / (long) this.field5888);
            }
            field5884++;
            int var3 = -122 % ((-arg0 - 22) / 58);
            return arg1;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5891[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(II)V")
    public class391(int arg0, int arg1) {
        try {
            if (arg0 != arg1) {
                int var3 = class361.method2933(arg0, arg1, 0);
                int var20 = arg0 / var3;
                int var21 = arg1 / var3;
                this.field5888 = var20;
                this.field5881 = var21;
                this.field5880 = new int[var20][14];
                for (int var4 = 0; var4 < var20; var4++) {
                    int[] var5 = this.field5880[var4];
                    double var6 = (double) var4 / (double) var20 + 6.0D;
                    int var8 = (int) Math.floor(var6 + 1.0D - 7.0D);
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    int var9 = (int) Math.ceil(var6 + 7.0D);
                    if (var9 > 14) {
                        var9 = 14;
                    }
                    double var10 = (double) var21 / (double) var20;
                    while (var8 < var9) {
                        double var12 = ((double) var8 - var6) * 3.141592653589793D;
                        double var14 = var10;
                        if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
                            var14 = var10 * (Math.sin(var12) / var12);
                        }
                        double var16 = var14 * (Math.cos(((double) var8 - var6) * 0.2243994752564138D) * 0.46D + 0.54D);
                        var5[var8] = (int) Math.floor(var16 * 65536.0D + 0.5D);
                        var8++;
                    }
                }
            }
        } catch (RuntimeException var19) {
            throw class759.method5498(var19, field5891[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3110(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3111(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 67;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 81;
                    break;
                case 3:
                    var10005 = 15;
                    break;
                default:
                    var10005 = 95;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
