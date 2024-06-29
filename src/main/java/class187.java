import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class187 extends class118 {

    @OriginalMember(owner = "client!jm", name = "N", descriptor = "[[I")
    public static int[][] field2803 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!jm", name = "S", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!jm", name = "T", descriptor = "Lwl;")
    public static class452 field2809;

    @OriginalMember(owner = "client!jm", name = "U", descriptor = "[S")
    public static short[] field2810;

    @OriginalMember(owner = "client!jm", name = "G", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!jm", name = "I", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!jm", name = "K", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!jm", name = "M", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!jm", name = "O", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!jm", name = "Q", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!jm", name = "R", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!jm", name = "H", descriptor = "Liq;")
    public static class134 field2799;

    @OriginalMember(owner = "client!jm", name = "P", descriptor = "Lkd;")
    public static class359 field2805;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 3;
        if (~(arg6 & 1) == -2) {
            int var8 = arg2;
            arg2 = arg1;
            arg1 = var8;
        }
        ++field2802;
        if (var7 == 0) {
            return arg3;
        } else if (~var7 == -2) {
            return arg5;
        } else if (arg0 != 2) {
            return -37;
        } else {
            return ~var7 == -3 ? 7 - (arg3 - 1 - -arg2) : -arg1 + 8 + -arg5;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method195(boolean arg0, int arg1) {
        if (arg0) {
            field2803 = null;
        }
        ++field2804;
        int[][] var3 = super.field1549.method2013(arg1, !arg0);
        if (super.field1549.field4903) {
            int[][] var4 = this.method708(arg1, (byte) -88, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class440.field6474; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "(I)Lon;")
    public static final class432 method1136(int arg0) {
        ++field2807;
        if (arg0 != 27459) {
            return null;
        } else {
            return class205.field3072.length > class110.field1453 ? class205.field3072[class110.field1453++] : null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (arg1 != 1) {
            field2803 = null;
        }
        ++field2798;
        if (arg0 == 0) {
            super.field1552 = arg2.method2343(255) == 1;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field2800;
        if (arg0 != 1) {
            field2803 = null;
        }
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (super.field1537.field5756) {
            int[] var4 = this.method703(0, arg1, -2);
            for (int var5 = 0; ~var5 > ~class440.field6474; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "(I)V")
    public static void method1137(int arg0) {
        field2810 = null;
        field2805 = null;
        field2799 = null;
        field2803 = null;
        if (arg0 != 0) {
            method1139((Frame) null, 17, (class239) null);
        }
        field2809 = null;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
    public class187() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lmr;I)V")
    public static final void method1138(class145 arg0, int arg1) {
        arg0.field1939 = false;
        ++field2801;
        if (arg0.field1936 != -1) {
            class379 var2 = class98.method629(arg0.field1936, (byte) -115);
            if (var2 != null && var2.field5539 != null) {
                label305: {
                    ++arg0.field1990;
                    if (var2.field5539.length > arg0.field1989 && arg0.field1990 > var2.field5540[arg0.field1989]) {
                        arg0.field1990 = 1;
                        ++arg0.field1934;
                        ++arg0.field1989;
                        class251.method1528(class113.field1500 == arg0, arg0.field1989, arg0.field1892, arg0.field1900, var2, arg0.field1902, (byte) -118);
                    }
                    if (~arg0.field1989 <= ~var2.field5539.length) {
                        arg0.field1989 = 0;
                        arg0.field1990 = 0;
                        if (arg0.field1933) {
                            arg0.field1936 = arg0.method902(26647).method2659(true);
                            if (arg0.field1936 == -1) {
                                arg0.field1933 = false;
                                break label305;
                            }
                            var2 = class98.method629(arg0.field1936, (byte) -115);
                        }
                        class251.method1528(class113.field1500 == arg0, arg0.field1989, arg0.field1892, arg0.field1900, var2, arg0.field1902, (byte) -118);
                    }
                    arg0.field1934 = arg0.field1989 + 1;
                    if (~arg0.field1934 <= ~var2.field5539.length) {
                        arg0.field1934 = 0;
                    }
                }
            } else {
                arg0.field1933 = false;
                arg0.field1936 = -1;
            }
        }
        if (arg0.field1938 != -1 && ~arg0.field1995 >= ~class26.field332) {
            class195 var3 = class251.method1530(arg0.field1938, 110);
            int var4 = var3.field2950;
            if (~var4 == 0) {
                arg0.field1938 = -1;
            } else {
                label307: {
                    class379 var5 = class98.method629(var4, (byte) -115);
                    if (var3.field2949) {
                        if (~var5.field5514 == -4) {
                            if (~arg0.field2014 < -1 && class26.field332 >= arg0.field2004 && class26.field332 > arg0.field1978) {
                                arg0.field1938 = -1;
                                break label307;
                            }
                        } else if (var5.field5514 == 1 && arg0.field2014 > 0 && ~arg0.field2004 >= ~class26.field332 && ~class26.field332 < ~arg0.field1978) {
                            arg0.field1995 = class26.field332 - -1;
                            break label307;
                        }
                    }
                    if (var5 != null && var5.field5539 != null) {
                        if (~arg0.field1932 > -1) {
                            arg0.field1932 = 0;
                            class251.method1528(class113.field1500 == arg0, 0, arg0.field1892, arg0.field1900, var5, arg0.field1902, (byte) -118);
                        }
                        ++arg0.field1992;
                        if (~var5.field5539.length < ~arg0.field1932 && arg0.field1992 > var5.field5540[arg0.field1932]) {
                            ++arg0.field1932;
                            arg0.field1992 = 1;
                            class251.method1528(class113.field1500 == arg0, arg0.field1932, arg0.field1892, arg0.field1900, var5, arg0.field1902, (byte) -118);
                        }
                        if (~arg0.field1932 <= ~var5.field5539.length) {
                            if (var3.field2949) {
                                arg0.field1932 -= var5.field5527;
                                ++arg0.field1952;
                                if (var5.field5541 > arg0.field1952) {
                                    if (~arg0.field1932 <= -1 && ~var5.field5539.length < ~arg0.field1932) {
                                        class251.method1528(class113.field1500 == arg0, arg0.field1932, arg0.field1892, arg0.field1900, var5, arg0.field1902, (byte) -118);
                                    } else {
                                        arg0.field1938 = -1;
                                    }
                                } else {
                                    arg0.field1938 = -1;
                                }
                            } else {
                                arg0.field1938 = -1;
                            }
                        }
                        arg0.field2005 = arg0.field1932 + 1;
                        if (var5.field5539.length <= arg0.field2005) {
                            if (!var3.field2949) {
                                arg0.field2005 = -1;
                            } else {
                                arg0.field2005 -= var5.field5527;
                                if (var5.field5541 > arg0.field1952 + 1) {
                                    if (~arg0.field2005 > -1 || ~arg0.field2005 <= ~var5.field5539.length) {
                                        arg0.field2005 = -1;
                                    }
                                } else {
                                    arg0.field2005 = -1;
                                }
                            }
                        }
                    } else {
                        arg0.field1938 = -1;
                    }
                }
            }
        }
        if (~arg0.field1955 != 0 && arg0.field1935 <= 1) {
            class379 var6 = class98.method629(arg0.field1955, (byte) -115);
            if (var6.field5514 == 3) {
                if (arg0.field2014 > 0 && arg0.field2004 <= class26.field332 && ~arg0.field1978 > ~class26.field332) {
                    arg0.field1955 = -1;
                }
            } else if (~var6.field5514 == -2 && ~arg0.field2014 < -1 && class26.field332 >= arg0.field2004 && class26.field332 > arg0.field1978) {
                arg0.field1935 = 2;
            }
        }
        if (arg1 != -8079) {
            field2810 = null;
        }
        if (~arg0.field1955 != 0 && arg0.field1935 == 0) {
            class379 var7 = class98.method629(arg0.field1955, (byte) -115);
            if (var7 != null && var7.field5539 != null) {
                ++arg0.field1962;
                if (~arg0.field1928 > ~var7.field5539.length && arg0.field1962 > var7.field5540[arg0.field1928]) {
                    arg0.field1962 = 1;
                    ++arg0.field1928;
                    class251.method1528(class113.field1500 == arg0, arg0.field1928, arg0.field1892, arg0.field1900, var7, arg0.field1902, (byte) -118);
                }
                if (var7.field5539.length <= arg0.field1928) {
                    arg0.field1928 -= var7.field5527;
                    ++arg0.field1948;
                    if (arg0.field1948 >= var7.field5541) {
                        arg0.field1955 = -1;
                    } else if (arg0.field1928 >= 0 && var7.field5539.length > arg0.field1928) {
                        class251.method1528(class113.field1500 == arg0, arg0.field1928, arg0.field1892, arg0.field1900, var7, arg0.field1902, (byte) -118);
                    } else {
                        arg0.field1955 = -1;
                    }
                }
                arg0.field1941 = arg0.field1928 + 1;
                if (arg0.field1941 >= var7.field5539.length) {
                    arg0.field1941 -= var7.field5527;
                    if (~var7.field5541 >= ~(arg0.field1948 + 1)) {
                        arg0.field1941 = -1;
                    } else if (~arg0.field1941 > -1 || var7.field5539.length <= arg0.field1941) {
                        arg0.field1941 = -1;
                    }
                }
                arg0.field1939 = var7.field5520;
            } else {
                arg0.field1955 = -1;
            }
        }
        if (arg0.field1935 > 0) {
            --arg0.field1935;
        }
        for (int var8 = 0; ~arg0.field1947.length < ~var8; ++var8) {
            class410 var9 = arg0.field1947[var8];
            if (var9 != null) {
                if (var9.field6103 > 0) {
                    --var9.field6103;
                } else {
                    class379 var10 = class98.method629(var9.field6105, (byte) -115);
                    if (var10 != null && var10.field5539 != null) {
                        ++var9.field6106;
                        if (~var10.field5539.length < ~var9.field6102 && ~var9.field6106 < ~var10.field5540[var9.field6102]) {
                            var9.field6106 = 1;
                            ++var9.field6102;
                            class251.method1528(class113.field1500 == arg0, var9.field6102, arg0.field1892, arg0.field1900, var10, arg0.field1902, (byte) -118);
                        }
                        if (~var9.field6102 <= ~var10.field5539.length) {
                            ++var9.field6111;
                            var9.field6102 -= var10.field5527;
                            if (~var9.field6111 <= ~var10.field5541) {
                                arg0.field1947[var8] = null;
                            } else if (~var9.field6102 <= -1 && ~var9.field6102 > ~var10.field5539.length) {
                                class251.method1528(class113.field1500 == arg0, var9.field6102, arg0.field1892, arg0.field1900, var10, arg0.field1902, (byte) -118);
                            } else {
                                arg0.field1947[var8] = null;
                            }
                        }
                        var9.field6107 = var9.field6102 + 1;
                        if (var10.field5539.length <= var9.field6107) {
                            var9.field6107 -= var10.field5527;
                            if (~(var9.field6111 + 1) > ~var10.field5541) {
                                if (var9.field6107 < 0 || var9.field6107 >= var10.field5539.length) {
                                    var9.field6107 = -1;
                                }
                            } else {
                                var9.field6107 = -1;
                            }
                        }
                    } else {
                        arg0.field1947[var8] = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/awt/Frame;ILsc;)V")
    public static final void method1139(Frame arg0, int arg1, class239 arg2) {
        while (true) {
            class211 var3 = arg2.method1443((byte) -29, arg0);
            while (var3.field3172 == 0) {
                class109.method674((byte) 99, 10L);
            }
            if (var3.field3172 == 1) {
                ++field2806;
                arg0.setVisible(false);
                if (arg1 != 0) {
                    field2803 = null;
                }
                arg0.dispose();
                return;
            }
            class109.method674((byte) 99, 100L);
        }
    }

    static {
        new class151("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field2808 = 0;
        field2809 = new class452(86, 3);
        field2810 = new short[] { 6798, 8741, 25238, 4626, 4550 };
    }
}
