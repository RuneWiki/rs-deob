import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class261 extends class268 {

    @OriginalMember(owner = "client!aj", name = "Eb", descriptor = "[I")
    public static int[] field3787 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!aj", name = "Fb", descriptor = "[[I")
    public static int[][] field3788 = new int[6][];

    @OriginalMember(owner = "client!aj", name = "Rb", descriptor = "Lml;")
    public static class36 field3800 = new class36("WTWIP", 3);

    @OriginalMember(owner = "client!aj", name = "Xb", descriptor = "Lbv;")
    public static class567 field3806;

    @OriginalMember(owner = "client!aj", name = "Db", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!aj", name = "Gb", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!aj", name = "Hb", descriptor = "I")
    private int field3790;

    @OriginalMember(owner = "client!aj", name = "Ib", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!aj", name = "Jb", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!aj", name = "Kb", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!aj", name = "Lb", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!aj", name = "Mb", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!aj", name = "Nb", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!aj", name = "Ob", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!aj", name = "Pb", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!aj", name = "Qb", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!aj", name = "Tb", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!aj", name = "Ub", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!aj", name = "Vb", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!aj", name = "Sb", descriptor = "Lh;")
    private class457 field3801;

    @OriginalMember(owner = "client!aj", name = "Wb", descriptor = "Loh;")
    public static class549 field3805;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "(I)V")
    public static final void method1654(int arg0) {
        int var1 = 55 / ((51 - arg0) / 56);
        ++field3803;
        class188.field2712.method739(2048);
        class471.field6776.method478(0);
        class74.field1380.method478(0);
    }

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "(I)V")
    public final void method1655(int arg0) {
        if (arg0 != 6924) {
            field3800 = null;
        }
        ++field3793;
        this.field3790 = super.field3913 * 8;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[I)V")
    public final void method1656(int arg0, int[] arg1) {
        ++field3794;
        if (arg0 == 8) {
            this.field3801 = new class457(arg1);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZJIII)Ljava/lang/String;")
    public static final String method1657(boolean arg0, long arg1, int arg2, int arg3, int arg4) {
        ++field3792;
        char var6 = ',';
        char var7 = '.';
        if (arg4 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg3 != 10) {
            return null;
        } else {
            if (arg4 == 2) {
                var7 = 160;
            }
            boolean var8 = false;
            if (~arg1 > -1L) {
                arg1 = -arg1;
                var8 = true;
            }
            StringBuffer var9 = new StringBuffer(26);
            if (arg2 > 0) {
                for (int var10 = 0; arg2 > var10; ++var10) {
                    int var11 = (int) arg1;
                    arg1 /= 10L;
                    var9.append((char) (var11 + 48 + -((int) arg1 * 10)));
                }
                var9.append(var6);
            }
            int var12 = 0;
            while (true) {
                int var13 = (int) arg1;
                arg1 /= 10L;
                var9.append((char) (48 - (int) arg1 * 10 + var13));
                if (arg1 == 0L) {
                    if (var8) {
                        var9.append('-');
                    }
                    return var9.reverse().toString();
                }
                if (arg0) {
                    ++var12;
                    if (~(var12 % 3) == -1) {
                        var9.append(var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "(B)Z")
    public final boolean method1658(byte arg0) {
        ++field3802;
        if (arg0 > 0) {
            return true;
        } else {
            int var2 = 255 & super.field3952[super.field3913] + -this.field3801.method2681((byte) -53);
            return var2 >= 128;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIZIII)I")
    public static final int method1659(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if ((1 & arg4) == 1) {
            int var7 = arg2;
            arg2 = arg1;
            arg1 = var7;
        }
        int var8 = arg6 & 3;
        ++field3791;
        if (var8 == 0) {
            return arg5;
        } else {
            if (!arg3) {
                field3800 = null;
            }
            if (var8 == 1) {
                return -arg0 + 7 - (arg2 - 1);
            } else {
                return ~var8 == -3 ? 7 - arg5 + -arg1 + 1 : arg0;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "(II)I")
    public final int method1660(int arg0, int arg1) {
        ++field3799;
        int var3 = this.field3790 >> 3;
        int var4 = -(7 & this.field3790) + 8;
        this.field3790 += arg1;
        int var5 = 0;
        int var6 = -18 % ((-67 - arg0) / 59);
        while (var4 < arg1) {
            var5 += (super.field3952[var3++] & class234.field3436[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg1 != var4) {
            var7 = (super.field3952[var3] >> var4 - arg1 & class234.field3436[arg1]) + var5;
        } else {
            var7 = (super.field3952[var3] & class234.field3436[var4]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "(II)I")
    public final int method1661(int arg0, int arg1) {
        if (arg1 != -1672) {
            return -27;
        } else {
            ++field3797;
            return arg0 * 8 + -this.field3790;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ[BI)V")
    public final void method1662(int arg0, boolean arg1, byte[] arg2, int arg3) {
        ++field3789;
        if (!arg1) {
            field3787 = null;
        }
        for (int var5 = 0; ~var5 > ~arg3; ++var5) {
            arg2[var5 - -arg0] = (byte) (super.field3952[super.field3913++] + -this.field3801.method2679(256));
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(IB)V")
    public final void method1663(int arg0, byte arg1) {
        if (arg1 <= 113) {
            this.method1656(-72, (int[]) null);
        }
        ++field3798;
        super.field3952[super.field3913++] = (byte) (arg0 + this.field3801.method2679(256));
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1664(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0) {
            field3787 = null;
        }
        if (~class183.field2638 >= ~arg2 && ~arg4 >= ~class268.field3911 && class222.field3350 <= arg1 && arg5 <= class409.field6071) {
            class230.method1511(arg3, arg4, arg5, arg2, arg1, -1);
        } else {
            class209.method1341(arg5, arg2, 51, arg4, arg1, arg3);
        }
        ++field3804;
    }

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "(B)V")
    public static void method1665(byte arg0) {
        field3806 = null;
        field3800 = null;
        if (arg0 >= -25) {
            method1664(true, -10, 105, 124, -36, -106);
        }
        field3788 = null;
        field3787 = null;
        field3805 = null;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(I)V")
    public class261(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1666(int arg0, byte arg1, int arg2) {
        ++field3796;
        if (arg1 > -50) {
            field3800 = null;
        }
        return class55.method453(arg2, true, arg0) | (arg2 & 393216) != 0 || class586.method3358(55, arg0, arg2) || class105.method889(arg0, arg2, 119);
    }

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "(B)I")
    public final int method1667(byte arg0) {
        ++field3795;
        int var2 = super.field3952[super.field3913++] + -this.field3801.method2679(256) & 255;
        if (~var2 > -129) {
            return var2;
        } else {
            if (arg0 >= -53) {
                method1664(false, 98, 40, -98, -21, -55);
            }
            return (super.field3952[super.field3913++] - this.field3801.method2679(256) & 255) + (var2 - 128 << 8);
        }
    }

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "(B)V")
    public final void method1668(byte arg0) {
        if (arg0 == -40) {
            super.field3913 = (this.field3790 + 7) / 8;
            ++field3786;
        }
    }

    static {
        new class567("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        field3806 = new class567("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");
    }
}
