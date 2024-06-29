import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 {

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "[[I")
    private int[][] field189;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    private int field186;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "Lac;")
    public static class153 field190 = new class153(16);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "Lvl;")
    public static class73 field196;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Ljava/awt/Font;")
    public static Font field182;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method71(String arg0, byte arg1) throws ClassNotFoundException {
        field192++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg1 != -88) {
            return null;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZI)Ltj;")
    public static final class169 method72(boolean arg0, int arg1) {
        field185++;
        class169 var2 = (class169) class162.field2443.method707((long) arg1, (byte) 59);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class232.field3754.method501(-2, arg1, 5);
        class169 var4 = new class169();
        if (var3 != null) {
            var4.method1154((byte) -66, new class170(var3));
        }
        class162.field2443.method712(arg0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILbk;Lbk;)V")
    public static final void method73(int arg0, class59 arg1, class59 arg2) {
        if (arg2.field868 != null) {
            arg2.method378((byte) -109);
        }
        field195++;
        arg2.field866 = arg1.field866;
        arg2.field868 = arg1;
        arg2.field868.field866 = arg2;
        if (arg0 == 1) {
            arg2.field866.field868 = arg2;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)I")
    public final int method74(int arg0, int arg1) {
        field193++;
        if (arg1 == 12318) {
            if (this.field189 != null) {
                arg0 = (int) ((long) this.field186 * (long) arg0 / (long) this.field183);
            }
            return arg0;
        } else {
            return 58;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        if (this.field189 != null) {
            arg1 = (int) ((long) this.field186 * (long) arg1 / (long) this.field183) + 6;
        }
        field194++;
        if (arg0 != 6) {
            field190 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static void method76(byte arg0) {
        field196 = null;
        field190 = null;
        field182 = null;
        if (arg0 <= 106) {
            field196 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([BI)[B")
    public final byte[] method77(byte[] arg0, int arg1) {
        field181++;
        if (this.field189 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field186 / (long) this.field183) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field189[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field186 + var6;
                int var14 = var13 / this.field183;
                var6 = var13 - this.field183 * var14;
                var5 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        if (arg1 != 22) {
            this.field186 = 22;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)V")
    public static final void method78(int arg0, boolean arg1) {
        field188++;
        class181 var2 = class95.method652(7, (byte) 34, arg0);
        var2.method1283(192);
        if (!arg1) {
            field190 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(II)V")
    public class13(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class254.method1806(arg0, (byte) -85, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field183 = var4;
            this.field189 = new int[var4][14];
            this.field186 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field189[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                double var12 = (double) var5 / (double) var4;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjava/lang/String;ZJLjava/lang/String;ZIIIZI)V")
    public static final void method79(int arg0, String arg1, boolean arg2, long arg3, String arg4, boolean arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field191++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class170 var14 = new class170(128);
        var14.method1183(10, arg6 - 1565212074);
        var14.method1180(-17437, (arg9 ? 4 : 0) | (arg2 ? 1 : 0) | (arg5 ? 2 : 0));
        var14.method1160(-25643, arg3);
        var14.method1210(var12[0], (byte) -16);
        var14.method1168((byte) -37, arg4);
        var14.method1210(var12[1], (byte) -16);
        var14.method1180(-17437, class158.field2371);
        var14.method1183(arg10, 984049208);
        var14.method1183(arg0, arg6 ^ 0xAD55C5DA);
        var14.method1210(var12[2], (byte) -16);
        if (arg6 != -1745706014) {
            field187 = -57;
        }
        var14.method1180(-17437, arg7);
        var14.method1180(-17437, arg8);
        var14.method1210(var12[3], (byte) -16);
        var14.method1204(80, class228.field3529, class175.field2762);
        class170 var15 = new class170(350);
        var15.method1168((byte) -37, arg1);
        int var16 = 8 - (class313.method2098(arg1, (byte) 110) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1183((int) (Math.random() * 255.0D), 984049208);
        }
        var15.method1167(var12, true);
        class150.field2218.field2676 = 0;
        class150.field2218.method1183(22, 984049208);
        class150.field2218.method1180(-17437, var14.field2676 + var15.field2676 + 2);
        class150.field2218.method1180(-17437, 548);
        class150.field2218.method1174(var14.field2676, arg6 + 1745706911, 0, var14.field2650);
        class150.field2218.method1174(var15.field2676, arg6 + 1745706911, 0, var15.field2650);
        class118.field1706 = 0;
        class130.field1863 = -3;
        class299.field4764 = 1;
        class263.field4267 = 0;
    }
}
