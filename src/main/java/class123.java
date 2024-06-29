import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class123 extends class129 {

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "Z")
    public boolean field2181 = true;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "Lrc;")
    public static class9 field2176 = new class9(64);

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "I")
    public static int field2182 = 0;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "[I")
    public int[] field2175;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "[I")
    private int[] field2179;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field2165;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "[[I")
    private int[][] field2171;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Leh;B)Ljava/lang/String;")
    public final String method838(class101 arg0, byte arg1) {
        field2167++;
        if (arg1 != 49) {
            return null;
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2179 != null) {
            for (int var4 = 0; var4 < this.field2179.length; var4++) {
                var3.append(this.field2165[var4]);
                var3.append(class183.method1203((byte) 73, this.field2179[var4], this.field2171[var4], arg0.method643((byte) 52, class59.field1027[this.field2179[var4]])));
            }
        }
        var3.append(this.field2165[this.field2165.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Leh;[IB)V")
    public final void method839(class101 arg0, int[] arg1, byte arg2) {
        field2173++;
        if (this.field2179 == null) {
            return;
        }
        if (arg2 > -13) {
            this.method849(-49, -50);
        }
        for (int var4 = 0; var4 < this.field2179.length; var4++) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = class102.field1798[this.method849(0, var4)];
            if (var5 > 0) {
                arg0.method654(8, var5, (long) arg1[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)I")
    public final int method840(boolean arg0) {
        field2166++;
        if (this.field2179 == null) {
            return 0;
        } else {
            if (!arg0) {
                method841(-66, 53, -102);
            }
            return this.field2179.length;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)I")
    public static final int method841(int arg0, int arg1, int arg2) {
        if (arg2 > -10) {
            field2182 = 68;
        }
        int var3 = class243.method1604(arg1 - 1, arg0 - 1, (byte) -2) + class243.method1604(arg1 + 1, arg0 - 1, (byte) -95) + class243.method1604(arg1 + -1, arg0 - -1, (byte) 127) + class243.method1604(arg1 + 1, arg0 + 1, (byte) -60);
        field2172++;
        int var4 = class243.method1604(arg1 - 1, arg0, (byte) -20) + class243.method1604(arg1 + 1, arg0, (byte) -65) + class243.method1604(arg1, arg0 + -1, (byte) -26) + class243.method1604(arg1, arg0 + 1, (byte) 97);
        int var5 = class243.method1604(arg1, arg0, (byte) 125);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
    public static void method842(int arg0) {
        int var1 = -103 % ((-arg0 - 41) / 45);
        field2176 = null;
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)Ljava/lang/String;")
    public final String method843(int arg0) {
        field2169++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2165 == null) {
            return "";
        }
        var2.append(this.field2165[0]);
        if (arg0 != 3044) {
            this.method844((byte) 80);
        }
        for (int var3 = 1; var3 < this.field2165.length; var3++) {
            var2.append("...");
            var2.append(this.field2165[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
    public final void method844(byte arg0) {
        if (arg0 >= -70) {
            this.method838((class101) null, (byte) 70);
        }
        field2168++;
        if (this.field2175 != null) {
            for (int var2 = 0; var2 < this.field2175.length; var2++) {
                this.field2175[var2] = class112.method789(this.field2175[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIILtb;Ltb;IIIIJ)V")
    public static final void method845(int arg0, int arg1, int arg2, int arg3, class184 arg4, class184 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class223 var12 = new class223();
        var12.field3759 = arg10;
        var12.field3766 = arg1 * 128 + 64;
        var12.field3760 = arg2 * 128 + 64;
        var12.field3763 = arg3;
        var12.field3764 = arg4;
        var12.field3753 = arg5;
        var12.field3758 = arg6;
        var12.field3762 = arg7;
        var12.field3767 = arg8;
        var12.field3756 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class79.field1367[var13][arg1][arg2] == null) {
                class79.field1367[var13][arg1][arg2] = new class109(var13, arg1, arg2);
            }
        }
        class79.field1367[arg0][arg1][arg2].field1976 = var12;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBI)I")
    public final int method846(int arg0, byte arg1, int arg2) {
        if (arg1 != -85) {
            this.method840(false);
        }
        field2178++;
        if (this.field2179 == null || arg2 < 0 || this.field2179.length < arg2) {
            return -1;
        } else if (this.field2171[arg2] == null || arg0 < 0 || arg0 > this.field2171[arg2].length) {
            return -1;
        } else {
            return this.field2171[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILeh;I)V")
    private final void method847(int arg0, class101 arg1, int arg2) {
        if (arg0 != 0) {
            return;
        }
        if (arg2 == 1) {
            this.field2165 = class154.method1056(arg1.method662((byte) 1), -1, '<');
        } else if (arg2 == 2) {
            int var4 = arg1.method669((byte) 36);
            this.field2175 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2175[var5] = arg1.method677(false);
            }
        } else if (arg2 == 3) {
            int var6 = arg1.method669((byte) 36);
            this.field2179 = new int[var6];
            this.field2171 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method677(false);
                this.field2179[var7] = var8;
                this.field2171[var7] = new int[class186.field3015[var8]];
                for (int var9 = 0; var9 < class186.field3015[var8]; var9++) {
                    this.field2171[var7][var9] = arg1.method677(false);
                }
            }
        } else if (arg2 == 4) {
            this.field2181 = false;
        }
        field2180++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILeh;)V")
    public final void method848(int arg0, class101 arg1) {
        field2170++;
        while (true) {
            int var3 = arg1.method669((byte) 36);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    this.method838((class101) null, (byte) -52);
                    return;
                }
            }
            this.method847(0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
    public final int method849(int arg0, int arg1) {
        field2177++;
        if (this.field2179 == null || arg1 < 0 || arg1 > this.field2179.length) {
            return -1;
        } else {
            if (arg0 != 0) {
                field2176 = null;
            }
            return this.field2179[arg1];
        }
    }
}
