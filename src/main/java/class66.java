import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class66 {

    @OriginalMember(owner = "client!si", name = "J", descriptor = "Loa;")
    private class107 field1042 = null;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "Z")
    private boolean field1032;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lcn;")
    private class7 field1009;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Z")
    private boolean field1017;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "Lph;")
    private static class229 field1026 = class266.method1858("Loading fonts )2 ", 0);

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Lph;")
    private static class229 field1011 = class266.method1858("slide:", 0);

    @OriginalMember(owner = "client!si", name = "K", descriptor = "[I")
    public static int[] field1043 = new int[5];

    @OriginalMember(owner = "client!si", name = "I", descriptor = "Lph;")
    public static class229 field1041 = field1026;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field1007 = 0;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "Lph;")
    public static class229 field1038 = class266.method1858("Hidden)2use", 0);

    @OriginalMember(owner = "client!si", name = "G", descriptor = "Lph;")
    public static class229 field1039 = field1011;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "Lph;")
    public static class229 field1033 = field1011;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!si", name = "O", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!si", name = "S", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!si", name = "T", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!si", name = "U", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!si", name = "L", descriptor = "[I")
    public static int[] field1044;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "[Ljava/lang/Object;")
    private Object[] field1025;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1046;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Z", line = 20)
    public final boolean method492(int arg0) {
        field1022++;
        if (!this.method509(0)) {
            return false;
        }
        boolean var2 = true;
        int var3 = 95 / ((arg0 - 16) / 50);
        for (int var4 = 0; var4 < this.field1042.field1797.length; var4++) {
            int var5 = this.field1042.field1797[var4];
            if (this.field1025[var5] == null) {
                this.method500(var5, (byte) 108);
                if (this.field1025[var5] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([IIII)[B", line = 58)
    public final byte[] method493(int[] arg0, int arg1, int arg2, int arg3) {
        field1030++;
        if (arg3 <= 70) {
            this.field1009 = (class7) null;
        }
        if (!this.method519(arg2, false, arg1)) {
            return null;
        }
        if (this.field1046[arg1] == null || this.field1046[arg1][arg2] == null) {
            boolean var5 = this.method516(arg0, arg1, (byte) -74);
            if (!var5) {
                this.method500(arg1, (byte) 108);
                boolean var6 = this.method516(arg0, arg1, (byte) -74);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class61.method417(false, (byte) -128, this.field1046[arg1][arg2]);
        if (this.field1032) {
            this.field1046[arg1][arg2] = null;
            if (this.field1042.field1793[arg1] == 1) {
                this.field1046[arg1] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)Z", line = 97)
    public final boolean method494(int arg0, boolean arg1) {
        field1053++;
        if (arg1) {
            this.method518(-118, 112);
        }
        if (!this.method509(0)) {
            return false;
        } else if (this.field1042.field1793.length == 1) {
            return this.method521(0, true, arg0);
        } else if (!this.method503(arg0, !arg1)) {
            return false;
        } else if (this.field1042.field1793[arg0] == 1) {
            return this.method521(arg0, true, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lph;ILph;)Z", line = 123)
    public final boolean method495(class229 arg0, int arg1, class229 arg2) {
        field1047++;
        if (!this.method509(0)) {
            return false;
        }
        class229 var4 = arg0.method1616(arg1 ^ 0x3AB6365B);
        class229 var5 = arg2.method1616(-985019996);
        int var6 = this.field1042.field1794.method300(var4.method1621(-81), arg1);
        if (this.method503(var6, true)) {
            int var7 = this.field1042.field1796[var6].method300(var5.method1621(arg1 - 57), -1);
            return this.method521(var6, true, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)I", line = 145)
    public final int method496(int arg0) {
        field1028++;
        if (!this.method509(0)) {
            throw new IllegalStateException("");
        }
        int var2 = -29 % ((arg0 + 12) / 62);
        return this.field1042.field1808;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lph;Lph;Z)[B", line = 163)
    public final byte[] method497(class229 arg0, class229 arg1, boolean arg2) {
        field1045++;
        if (!this.method509(0)) {
            return null;
        }
        class229 var4 = arg0.method1616(-985019996);
        class229 var5 = arg1.method1616(-985019996);
        int var6 = this.field1042.field1794.method300(var4.method1621(-100), -1);
        if (arg2) {
            field1041 = (class229) null;
        }
        if (this.method503(var6, !arg2)) {
            int var7 = this.field1042.field1796[var6].method300(var5.method1621(-56), -1);
            return this.method523(-23, var7, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lph;I)I", line = 188)
    public final int method498(class229 arg0, int arg1) {
        field1014++;
        if (!this.method509(arg1 + 1)) {
            return -1;
        }
        class229 var3 = arg0.method1616(-985019996);
        int var4 = this.field1042.field1794.method300(var3.method1621(arg1 ^ 0x41), arg1);
        if (this.method503(var4, true)) {
            if (arg1 != -1) {
                this.method512(-14, (byte) -117);
            }
            return var4;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)I", line = 209)
    public final int method499(byte arg0) {
        field1023++;
        if (this.method509(0)) {
            if (arg0 > -10) {
                this.method516((int[]) null, 14, (byte) -83);
            }
            return this.field1042.field1793.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V", line = 224)
    private final void method500(int arg0, byte arg1) {
        field1027++;
        if (arg1 != 108) {
            field1007 = -29;
        }
        if (this.field1017) {
            this.field1025[arg0] = this.field1009.method44((byte) -46, arg0);
        } else {
            this.field1025[arg0] = class300.method2016(-137, false, this.field1009.method44((byte) -46, arg0));
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(SI)Z", line = 239)
    public static final boolean method501(short arg0, int arg1) {
        field1051++;
        if (arg0 == 44 || arg0 == 24 || arg0 == 39 || arg0 == 31 || arg0 == 16 || arg0 == 30 || arg0 == 37 || arg0 == 49) {
            return true;
        } else if (arg0 == 14 || arg0 == 50 || arg0 == 1001 || arg0 == 1004) {
            return true;
        } else if (arg1 > -32) {
            return false;
        } else if (arg0 == 29 || arg0 == 4 || arg0 == 59 || arg0 == 26 || arg0 == 51) {
            return true;
        } else {
            return arg0 == 28 || arg0 == 34 || arg0 == 22 || arg0 == 46 || arg0 == 6 || arg0 == 3;
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)I", line = 272)
    public final int method502(int arg0) {
        field1013++;
        if (!this.method509(arg0 ^ arg0)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1025.length; var4++) {
            if (this.field1042.field1795[var4] > 0) {
                var3 += this.method520(var4, (byte) -109);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IZ)Z", line = 308)
    private final boolean method503(int arg0, boolean arg1) {
        field1012++;
        if (!this.method509(0)) {
            return false;
        }
        if (!arg1) {
            field1038 = (class229) null;
        }
        if (arg0 >= 0 && this.field1042.field1793.length > arg0 && this.field1042.field1793[arg0] != 0) {
            return true;
        } else if (class110.field1863) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)[B", line = 333)
    public final byte[] method504(int arg0, int arg1) {
        field1052++;
        if (arg1 != -13928) {
            this.field1009 = (class7) null;
        }
        if (!this.method509(arg1 + 13928)) {
            return null;
        } else if (this.field1042.field1793.length == 1) {
            return this.method523(-34, arg0, 0);
        } else if (!this.method503(arg0, true)) {
            return null;
        } else if (this.field1042.field1793[arg0] == 1) {
            return this.method523(arg1 ^ 0x366D, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lph;B)Z", line = 365)
    public final boolean method505(class229 arg0, byte arg1) {
        field1050++;
        if (arg1 < 46) {
            field1007 = -53;
        }
        if (this.method509(0)) {
            class229 var3 = arg0.method1616(-985019996);
            int var4 = this.field1042.field1794.method300(var3.method1621(-85), -1);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZZB)V", line = 395)
    public final void method506(boolean arg0, boolean arg1, byte arg2) {
        if (arg2 != 77) {
            field1011 = (class229) null;
        }
        field1040++;
        if (!this.method509(0)) {
            return;
        }
        if (arg0) {
            this.field1042.field1799 = null;
            this.field1042.field1794 = null;
        }
        if (arg1) {
            this.field1042.field1796 = null;
            this.field1042.field1809 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIZ)[B", line = 425)
    public final byte[] method507(int arg0, int arg1, boolean arg2) {
        field1034++;
        if (!this.method519(arg0, arg2, arg1)) {
            return null;
        }
        if (this.field1046[arg1] == null || this.field1046[arg1][arg0] == null) {
            boolean var4 = this.method516((int[]) null, arg1, (byte) -74);
            if (!var4) {
                this.method500(arg1, (byte) 108);
                boolean var5 = this.method516((int[]) null, arg1, (byte) -74);
                if (!var5) {
                    return null;
                }
            }
        }
        return class61.method417(false, (byte) -128, this.field1046[arg1][arg0]);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLph;)Z", line = 459)
    public final boolean method508(byte arg0, class229 arg1) {
        field1016++;
        if (this.method509(0)) {
            class229 var3 = arg1.method1616(-985019996);
            int var4 = this.field1042.field1794.method300(var3.method1621(-127), -1);
            int var5 = 76 / ((arg0 + 3) / 58);
            return this.method512(var4, (byte) -98);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)Z", line = 481)
    private final boolean method509(int arg0) {
        if (arg0 != 0) {
            this.method503(-30, false);
        }
        field1008++;
        if (this.field1042 == null) {
            this.field1042 = this.field1009.method50(127);
            if (this.field1042 == null) {
                return false;
            }
            this.field1025 = new Object[this.field1042.field1792];
            this.field1046 = new Object[this.field1042.field1792][];
        }
        return true;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(BLph;)I", line = 502)
    public final int method510(byte arg0, class229 arg1) {
        field1018++;
        if (this.method509(0)) {
            int var3 = 43 / ((-arg0 - 26) / 60);
            class229 var4 = arg1.method1616(-985019996);
            int var5 = this.field1042.field1794.method300(var4.method1621(-57), -1);
            return this.method520(var5, (byte) -69);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILph;)V", line = 527)
    public final void method511(int arg0, class229 arg1) {
        field1035++;
        if (!this.method509(0)) {
            return;
        }
        class229 var3 = arg1.method1616(-985019996);
        int var4 = this.field1042.field1794.method300(var3.method1621(-81), -1);
        this.method513(var4, -32);
        if (arg0 != 100) {
            this.method495((class229) null, 106, (class229) null);
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IB)Z", line = 545)
    public final boolean method512(int arg0, byte arg1) {
        field1049++;
        if (!this.method503(arg0, true)) {
            return false;
        } else if (arg1 >= -66) {
            return false;
        } else if (this.field1025[arg0] == null) {
            this.method500(arg0, (byte) 108);
            return this.field1025[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)V", line = 567)
    private final void method513(int arg0, int arg1) {
        this.field1009.method47(arg0, (byte) -39);
        field1021++;
        if (arg1 != -32) {
            this.field1009 = (class7) null;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V", line = 585)
    public final void method514(byte arg0) {
        if (arg0 != -5) {
            return;
        }
        field1015++;
        if (this.field1046 != null) {
            for (int var2 = 0; var2 < this.field1046.length; var2++) {
                this.field1046[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(I)V", line = 609)
    public static void method515(int arg0) {
        field1041 = null;
        field1011 = null;
        if (arg0 >= -27) {
            return;
        }
        field1033 = null;
        field1039 = null;
        field1044 = null;
        field1026 = null;
        field1043 = null;
        field1038 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([IIB)Z", line = 627)
    private final boolean method516(int[] arg0, int arg1, byte arg2) {
        field1024++;
        if (!this.method503(arg1, true)) {
            return false;
        } else if (this.field1025[arg1] == null) {
            return false;
        } else {
            int var4 = this.field1042.field1795[arg1];
            int[] var5 = this.field1042.field1804[arg1];
            boolean var6 = true;
            if (this.field1046[arg1] == null) {
                this.field1046[arg1] = new Object[this.field1042.field1793[arg1]];
            }
            Object[] var7 = this.field1046[arg1];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (arg2 != -74) {
                return false;
            } else if (var6) {
                return true;
            } else {
                byte[] var10;
                if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                    var10 = class61.method417(false, (byte) -128, this.field1025[arg1]);
                } else {
                    var10 = class61.method417(true, (byte) -128, this.field1025[arg1]);
                    class164 var11 = new class164(var10);
                    var11.method1172(arg0, var11.field2668.length, -20410, 5);
                }
                byte[] var12;
                try {
                    var12 = class306.method2065(arg2 ^ 0xFFFFFFB6, var10);
                } catch (RuntimeException var31) {
                    throw class174.method1260(var31, "T3 - " + (arg0 != null) + "," + arg1 + "," + var10.length + "," + class198.method1390(var10, var10.length, arg2 ^ 0xFFFFFFB6) + "," + class198.method1390(var10, var10.length - 2, 0) + "," + this.field1042.field1807[arg1] + "," + this.field1042.field1808);
                }
                if (this.field1017) {
                    this.field1025[arg1] = null;
                }
                if (var4 > 1) {
                    int var14 = var12.length;
                    int var32 = var14 - 1;
                    int var15 = var12[var32] & 0xFF;
                    class164 var16 = new class164(var12);
                    int var17 = var32 - var4 * 4 * var15;
                    var16.field2670 = var17;
                    int[] var18 = new int[var4];
                    for (int var19 = 0; var19 < var15; var19++) {
                        int var20 = 0;
                        for (int var21 = 0; var21 < var4; var21++) {
                            var20 += var16.method1191(31776);
                            var18[var21] += var20;
                            if (var5 != null) {
                            }
                        }
                    }
                    byte[][] var22 = new byte[var4][];
                    for (int var23 = 0; var23 < var4; var23++) {
                        var22[var23] = new byte[var18[var23]];
                        var18[var23] = 0;
                    }
                    var16.field2670 = var17;
                    int var24 = 0;
                    for (int var25 = 0; var25 < var15; var25++) {
                        int var26 = 0;
                        for (int var27 = 0; var27 < var4; var27++) {
                            var26 += var16.method1191(31776);
                            class42.method317(var12, var24, var22[var27], var18[var27], var26);
                            var24 += var26;
                            var18[var27] += var26;
                        }
                    }
                    for (int var28 = 0; var28 < var4; var28++) {
                        int var29;
                        if (var5 == null) {
                            var29 = var28;
                        } else {
                            var29 = var5[var28];
                        }
                        if (this.field1032) {
                            var7[var29] = var22[var28];
                        } else {
                            var7[var29] = class300.method2016(-137, false, var22[var28]);
                        }
                    }
                } else {
                    int var30;
                    if (var5 == null) {
                        var30 = 0;
                    } else {
                        var30 = var5[0];
                    }
                    if (this.field1032) {
                        var7[var30] = var12;
                    } else {
                        var7[var30] = class300.method2016(-137, false, var12);
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)I", line = 825)
    public final int method517(byte arg0, int arg1) {
        if (arg0 != -126) {
            this.field1032 = true;
        }
        field1048++;
        return this.method503(arg1, true) ? this.field1042.field1793[arg1] : 0;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(II)V", line = 840)
    public final void method518(int arg0, int arg1) {
        field1031++;
        if (this.method503(arg0, true) && arg1 == 0 && this.field1046 != null) {
            this.field1046[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZI)Z", line = 857)
    private final boolean method519(int arg0, boolean arg1, int arg2) {
        field1020++;
        if (!this.method509(0)) {
            return false;
        } else if (arg1) {
            return true;
        } else if (arg2 >= 0 && arg0 >= 0 && arg2 < this.field1042.field1793.length && this.field1042.field1793[arg2] > arg0) {
            return true;
        } else if (class110.field1863) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(IB)I", line = 881)
    private final int method520(int arg0, byte arg1) {
        field1036++;
        if (this.method503(arg0, true)) {
            if (arg1 >= -54) {
                this.method520(4, (byte) -53);
            }
            return this.field1025[arg0] == null ? this.field1009.method43((byte) 87, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lcn;ZZ)V", line = 1020)
    public class66(class7 arg0, boolean arg1, boolean arg2) {
        this.field1032 = arg2;
        this.field1009 = arg0;
        this.field1017 = arg1;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IZI)Z", line = 925)
    public final boolean method521(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field1025 = (Object[]) null;
        }
        field1037++;
        if (!this.method519(arg2, false, arg0)) {
            return false;
        } else if (this.field1046[arg0] != null && this.field1046[arg0][arg2] != null) {
            return true;
        } else if (this.field1025[arg0] == null) {
            this.method500(arg0, (byte) 108);
            return this.field1025[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIII)V", line = 950)
    public static final void method522(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            method515(60);
        }
        field1019++;
        if (class271.field4538 == 1) {
            class307.field5182[class43.field666 / 100].method653(class120.field2029 - 8, class256.field4281 + -8);
        }
        if (class271.field4538 == 2) {
            class307.field5182[class43.field666 / 100 + 4].method653(class120.field2029 - 8, class256.field4281 + -8);
        }
        class181.method1291((byte) 93);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)[B", line = 977)
    public final byte[] method523(int arg0, int arg1, int arg2) {
        field1029++;
        if (arg0 > -6) {
            this.method494(-62, false);
        }
        return this.method493((int[]) null, arg2, arg1, 84);
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(II)[I", line = 992)
    public final int[] method524(int arg0, int arg1) {
        field1010++;
        if (!this.method503(arg0, true)) {
            return null;
        }
        int[] var3 = this.field1042.field1804[arg0];
        int var4 = 33 % ((31 - arg1) / 52);
        if (var3 == null) {
            var3 = new int[this.field1042.field1795[arg0]];
            int var5 = 0;
            while (var3.length > var5) {
                var3[var5] = var5++;
            }
        }
        return var3;
    }
}
