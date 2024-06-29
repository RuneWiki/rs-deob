import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class115 extends class642 {

    @OriginalMember(owner = "client!we", name = "D", descriptor = "Z")
    public static boolean field1723 = false;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "[[F")
    public static float[][] field1721 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!we", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field1722 = new String[100];

    @OriginalMember(owner = "client!we", name = "F", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "Z")
    public static boolean field1728;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lbk;B)I", line = 4)
    public static final int method854(class106 arg0, byte arg1) {
        if (arg1 != -118) {
            return -122;
        } else {
            ++field1727;
            if (class106.field1568 == arg0) {
                return 5120;
            } else if (class106.field1569 == arg0) {
                return 5122;
            } else if (class106.field1572 != arg0) {
                if (class106.field1573 != arg0) {
                    if (class106.field1574 != arg0) {
                        if (class106.field1575 != arg0) {
                            if (class106.field1576 == arg0) {
                                return 5131;
                            } else if (class106.field1577 == arg0) {
                                return 5126;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 5125;
                        }
                    } else {
                        return 5123;
                    }
                } else {
                    return 5121;
                }
            } else {
                return 5124;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Z", line = 46)
    public static final boolean method855(int arg0, int arg1, int arg2) {
        if (arg2 != -1148) {
            method858(80);
        }
        ++field1724;
        if (!class620.method3570(arg2 ^ 1147, arg1, arg0)) {
            return false;
        } else {
            return class574.method3304(arg1, arg2 + 1263, arg0) | (arg1 & 36864) != 0 | class211.method1337(arg0, arg1, 16500) ? true : (class48.method290(arg0, arg2 ^ -10533, arg1) | (arg1 & 8192) != 0 | class215.method1358(arg1, (byte) -123, arg0)) & (55 & arg0) == 0;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIB)Z", line = 66)
    public static final boolean method856(int arg0, int arg1, byte arg2) {
        if (arg2 != 4) {
            field1731 = -48;
        }
        ++field1729;
        return false;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILgk;B)V", line = 78)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (~arg0 == -1) {
            super.field9207 = arg1.method3115(29871) == 1;
        }
        ++field1726;
        if (arg2 <= 29) {
            method854((class106) null, (byte) -6);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(III)Z", line = 97)
    public static final boolean method857(int arg0, int arg1, int arg2) {
        if (arg0 != 15547) {
            field1723 = false;
        }
        ++field1732;
        return ~(32 & arg2) != -1;
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(I)V", line = 111)
    public static void method858(int arg0) {
        field1722 = null;
        field1721 = null;
        if (arg0 != -13697) {
            field1722 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)[I", line = 123)
    public final int[] method3(int arg0, int arg1) {
        ++field1725;
        int[] var3 = super.field9216.method1185(arg0, -92);
        if (arg1 != -9) {
            return null;
        } else {
            if (super.field9216.field2418) {
                int[] var4 = this.method3658((byte) 59, arg0, 0);
                int[] var5 = this.method3658((byte) 112, arg0, 1);
                int[] var6 = this.method3658((byte) 104, arg0, 2);
                for (int var7 = 0; class338.field4909 > var7; ++var7) {
                    int var8 = var6[var7];
                    if (~var8 == -4097) {
                        var3[var7] = var4[var7];
                    } else if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)[[I", line = 175)
    public final int[][] method138(int arg0, int arg1) {
        ++field1730;
        if (arg0 != 21402) {
            field1723 = true;
        }
        int[][] var3 = super.field9211.method1068(0, arg1);
        if (super.field9211.field2131) {
            int[] var4 = this.method3658((byte) 114, arg1, 2);
            int[][] var5 = this.method3657(arg1, true, 0);
            int[][] var6 = this.method3657(arg1, true, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class338.field4909; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (var17 != 0) {
                        int var18 = 4096 - var17;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V", line = 260)
    public class115() {
        super(3, false);
    }
}
