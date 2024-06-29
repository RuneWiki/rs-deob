import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class113 extends class16 {

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "Ljava/lang/String;")
    public static String field1687 = "Loaded textures";

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "J")
    public static long field1682 = 0L;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "Z")
    public static boolean field1696 = false;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    public static int field1694 = 0;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "[S")
    public static short[] field1699 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "Ljava/awt/Frame;")
    public static Frame field1688;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "[Lhc;")
    private class185[] field1684;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)V", line = 7)
    public static void method779(byte arg0) {
        if (arg0 > -84) {
            field1682 = -98L;
        }
        field1688 = null;
        field1687 = null;
        field1699 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)[[I", line = 22)
    public final int[][] method54(int arg0, byte arg1) {
        int var3 = -106 % ((arg1 - 40) / 41);
        int[][] var4 = this.field197.method715(true, arg0);
        field1695++;
        if (this.field197.field1548) {
            int var5 = class276.field4376;
            int var6 = class294.field4619;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = this.field197.method711((byte) -123);
            this.method784(126, var7);
            for (int var9 = 0; var9 < class294.field4619; var9++) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[1];
                int[] var14 = var11[2];
                for (int var15 = 0; var15 < class276.field4376; var15++) {
                    int var16 = var10[var15];
                    var14[var15] = class200.method1465(255, var16) << 4;
                    var13[var15] = class200.method1465(65280, var16) >> 4;
                    var12[var15] = class200.method1465(4080, var16 >> 12);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILek;)I", line = 89)
    public static final int method780(int arg0, class196 arg1) {
        class118 var2 = arg1.field3210;
        field1692++;
        if (var2.field1786 != null) {
            var2 = var2.method819((byte) -9);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 < 96) {
            method783(77);
        }
        int var3 = var2.field1768;
        class206 var4 = arg1.method899(true);
        if (arg1.field1994 == var4.field3354) {
            var3 = var2.field1797;
        } else if (arg1.field1994 == var4.field3347 || arg1.field1994 == var4.field3351 || arg1.field1994 == var4.field3374 || arg1.field1994 == var4.field3377) {
            var3 = var2.field1814;
        } else if (arg1.field1994 == var4.field3380 || arg1.field1994 == var4.field3356 || arg1.field1994 == var4.field3360 || arg1.field1994 == var4.field3349) {
            var3 = var2.field1770;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIII)V", line = 124)
    public static final void method781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1693++;
        if (arg1 != -5121) {
            field1699 = (short[]) null;
        }
        if (arg0 == arg5) {
            class115.method799(arg2, 4, arg3, arg5, arg4);
        } else if (class224.field3575 <= arg4 - arg5 && (arg4 + arg5) <= class231.field3697 && class233.field3721 <= arg3 - arg0 && arg0 + arg3 <= class235.field3735) {
            class342.method2358(arg2, arg4, arg3, arg5, arg0, false);
        } else {
            class248.method1759(arg4, arg3, arg5, arg2, arg0, false);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(ZI)[I", line = 158)
    public final int[] method8(boolean arg0, int arg1) {
        field1697++;
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (!arg0) {
            method785(62);
        }
        if (this.field207.field4024) {
            this.method784(123, this.field207.method1785(-51));
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BIC)C", line = 177)
    public static final char method782(byte arg0, int arg1, char arg2) {
        field1685++;
        if (arg0 < 18) {
            return '\u0011';
        }
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 == 'Ñ' && arg1 != 0) {
                return 'N';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 == 'ñ' && arg1 != 0) {
                return 'n';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V", line = 263)
    public static final void method783(int arg0) {
        field1683++;
        class339.field5257 = 0;
        class174.field2784 = 0;
        class19.field274 = false;
        class151.field2320 = 0;
        class126.field1887 = 0;
        class258.field4087 = 0;
        class93.field1430 = -1;
        class98.field1498 = -1;
        class138.field2063 = 0;
        class21.field313.field3129 = 0;
        class229.field3648 = -1;
        class35.field459 = -1;
        class336.field5213.field3129 = 0;
        for (int var1 = 0; var1 < class100.field1523.length; var1++) {
            if (class100.field1523[var1] != null) {
                class100.field1523[var1].field1976 = -1;
            }
        }
        for (int var2 = 0; var2 < class297.field4657.length; var2++) {
            if (class297.field4657[var2] != null) {
                class297.field4657[var2].field1976 = -1;
            }
        }
        class256.method1806(-1170672536);
        class282.field4461 = 1;
        class173.method1180(30, 65280);
        for (int var3 = 0; var3 < 100; var3++) {
            class284.field4485[var3] = true;
        }
        class55.method391(arg0);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 320)
    public class113() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[[I)V", line = 324)
    private final void method784(int arg0, int[][] arg1) {
        field1690++;
        int var3 = class294.field4619;
        int var4 = class276.field4376;
        class198.method1449(arg1, 3);
        class136.method923(0, (byte) -109, class148.field2215, class240.field3798, 0);
        if (arg0 <= 114) {
            method779((byte) -50);
        }
        if (this.field1684 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field1684.length; var5++) {
            class185 var6 = this.field1684[var5];
            int var7 = var6.field2972;
            int var8 = var6.field2974;
            if (var7 >= 0) {
                if (var8 >= 0) {
                    var6.method718(var4, var3, (byte) -118);
                } else {
                    var6.method717(var3, (byte) 126, var4);
                }
            } else if (var8 >= 0) {
                var6.method721(var4, -1, var3);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)Z", line = 375)
    public static final boolean method785(int arg0) {
        field1689++;
        if (arg0 < 102) {
            field1691 = 126;
        }
        if (class114.field1706) {
            try {
                class72.method470("showVideoAd", (byte) -122, class264.field4183.field68);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BCLjava/lang/StringBuffer;I)Ljava/lang/StringBuffer;", line = 397)
    public static final StringBuffer method786(byte arg0, char arg1, StringBuffer arg2, int arg3) {
        field1681++;
        int var4 = arg2.length();
        arg2.setLength(arg3);
        for (int var5 = var4; var5 < arg3; var5++) {
            arg2.setCharAt(var5, arg1);
        }
        if (arg0 > -65) {
            field1682 = 30L;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLim;I)V", line = 418)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg0 != -7) {
            this.method54(-58, (byte) 29);
        }
        if (arg2 == 0) {
            this.field1684 = new class185[arg1.method1399(-1172389784)];
            for (int var4 = 0; var4 < this.field1684.length; var4++) {
                int var5 = arg1.method1399(arg0 - 1172389777);
                if (var5 == 0) {
                    this.field1684[var4] = class319.method2224(false, arg1);
                } else if (var5 == 1) {
                    this.field1684[var4] = class125.method866(arg1, (byte) -124);
                } else if (var5 == 2) {
                    this.field1684[var4] = class145.method1017(-31541, arg1);
                } else if (var5 == 3) {
                    this.field1684[var4] = class201.method1469((byte) -86, arg1);
                }
            }
        } else if (arg2 == 1) {
            this.field191 = arg1.method1399(-1172389784) == 1;
        }
        field1686++;
    }
}
