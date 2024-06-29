import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class17 {

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    private int field463;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "[[I")
    private int[][] field477;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "Lwb;")
    private static class130 field471 = class26.method212("Loading game screen )2 ", -32376);

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Lwb;")
    private static class130 field459 = class26.method212("Please contact customer support)3", -32376);

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "Lwb;")
    public static class130 field476 = class26.method212(":duelreq:", -32376);

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "Lwb;")
    private static class130 field478 = class26.method212("Username: ", -32376);

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "Lwb;")
    public static class130 field466 = field478;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field470 = 0;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Lwb;")
    public static class130 field462 = field471;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public static int field475 = -1;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lwb;")
    public static class130 field455 = class26.method212("Fps:", -32376);

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public static int field474 = 0;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "Lwb;")
    private static class130 field479 = class26.method212("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", -32376);

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "Lwb;")
    public static class130 field481 = field459;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Lwb;")
    public static class130 field458 = field479;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "J")
    public static long field480 = 0L;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "Lda;")
    public static class20 field465;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 5)
    public static final void method136(Component arg0, boolean arg1) {
        if (arg1) {
            field461++;
            arg0.addMouseListener(class130.field3083);
            arg0.addMouseMotionListener(class130.field3083);
            arg0.addFocusListener(class130.field3083);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 20)
    public static void method137(int arg0) {
        field459 = null;
        field479 = null;
        field455 = null;
        if (arg0 != 14760) {
            return;
        }
        field465 = null;
        field476 = null;
        field481 = null;
        field478 = null;
        field462 = null;
        field466 = null;
        field471 = null;
        field458 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B[B)[B", line = 42)
    public final byte[] method138(byte arg0, byte[] arg1) {
        if (arg0 > -91) {
            return null;
        }
        if (this.field477 != null) {
            int var3 = arg1.length * this.field460 / this.field463 + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var10 = this.field477[var6];
                byte var11 = arg1[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var10[var12] * var11;
                }
                int var13 = this.field460 + var6;
                int var14 = var13 / this.field463;
                var5 += var14;
                var6 = var13 - this.field463 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        field472++;
        return arg1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)I", line = 114)
    public final int method139(byte arg0, int arg1) {
        int var3 = 107 % ((-arg0 - 90) / 36);
        if (this.field477 != null) {
            arg1 = this.field460 * arg1 / this.field463;
        }
        field454++;
        return arg1;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 133)
    public static final void method140(int arg0) {
        field469++;
        if (arg0 != 14) {
            return;
        }
        if (class4.field189 && class71.field1818 != class111.field2726) {
            class112.method861(class99.field2383, class26.field762, class42.field1179.field2079[0], -116, class42.field1179.field2107[0], class71.field1818);
        } else if (class71.field1818 != class115.field2845) {
            class115.field2845 = class71.field1818;
            class116.method893((byte) 124, class71.field1818);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsb;IZI)Z", line = 158)
    public static final boolean method141(class110 arg0, int arg1, boolean arg2, int arg3) {
        field468++;
        if (class24.method209(arg1 ^ 0x14, arg2, arg0)) {
            if (arg1 < arg3) {
                class71.field1810 = new class41(arg3);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILmc;Z)V", line = 185)
    public static final void method142(int arg0, class75 arg1, boolean arg2) {
        if (arg2) {
            field471 = null;
        }
        field467++;
        if (class30.field824 == null) {
            class45.method414(true, 255, true, 255, 0, null, (byte) 0);
            class132.field3191[arg0] = arg1;
        } else {
            class30.field824.field1057 = arg0 * 4 + 5;
            int var3 = class30.field824.method361((byte) 79);
            arg1.method588(var3, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 219)
    public static final void method143(byte arg0) {
        while (true) {
            if (class67.field1682.method726((byte) -86, class65.field1661) >= 27) {
                int var1 = class67.field1682.method721(15, (byte) -95);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class26.field766[var1] == null) {
                        class26.field766[var1] = new class33();
                        var2 = true;
                    }
                    class33 var3 = class26.field766[var1];
                    class24.field716[class58.field1466++] = var1;
                    var3.field2104 = class130.field3128;
                    int var4 = class67.field1682.method721(5, (byte) -100);
                    int var5 = class67.field1682.method721(1, (byte) -122);
                    int var6 = class67.field1682.method721(1, (byte) -118);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    if (var6 == 1) {
                        class69.field1775[class45.field1220++] = var1;
                    }
                    int var7 = class67.field1682.method721(5, (byte) -123);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var3.field913 = class89.method663(class67.field1682.method721(13, (byte) -119), (byte) -6);
                    int var8 = class71.field1815[class67.field1682.method721(3, (byte) -116)];
                    if (var2) {
                        var3.field2099 = var8;
                    }
                    var3.field2076 = var3.field913.field1981;
                    var3.field2110 = var3.field913.field1999;
                    var3.field2086 = var3.field913.field1993;
                    var3.field2141 = var3.field913.field1996;
                    var3.field2123 = var3.field913.field1986;
                    var3.field2094 = var3.field913.field2013;
                    var3.field2118 = var3.field913.field1990;
                    if (var3.field2094 == 0) {
                        var3.field2099 = 0;
                    }
                    var3.field2068 = var3.field913.field1969;
                    var3.field2124 = var3.field913.field2011;
                    var3.method653((byte) 35, class42.field1179.field2079[0] + var7, var5 == 1, class42.field1179.field2107[0] + var4);
                    continue;
                }
            }
            class67.field1682.method730(-1);
            if (arg0 < 40) {
                return;
            }
            field464++;
            return;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)I", line = 296)
    public final int method144(int arg0, byte arg1) {
        if (this.field477 != null) {
            arg0 = this.field460 * arg0 / this.field463 + 7;
        }
        int var3 = 75 % ((-arg1 - 90) / 36);
        field473++;
        return arg0;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(II)V", line = 309)
    public class17(int arg0, int arg1) {
        int var3 = class26.method211(arg1, (byte) -110, arg0);
        int var4 = arg1 / var3;
        this.field460 = var4;
        int var5 = arg0 / var3;
        this.field463 = var5;
        if (var4 != var5) {
            this.field477 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field477[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                double var12 = (double) var4 / (double) var5;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var10 < var11) {
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
}
