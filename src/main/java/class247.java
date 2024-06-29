import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class247 {

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public int field3729 = 2;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public int field3732 = -1;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public int field3731 = -1;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "Z")
    public boolean field3745 = false;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public int field3747 = -1;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public int field3730 = 99;

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "Z")
    public boolean field3757 = false;

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "Z")
    public boolean field3755 = false;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
    public int field3753 = -1;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public int field3740 = 5;

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "Z")
    public boolean field3758 = false;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
    public int field3752 = -1;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3738 = "K";

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field3733 = 0;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field3742 = 0;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public static int field3743 = 0;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
    public static int field3751 = 0;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public int field3739;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "[I")
    public int[] field3734;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "[I")
    private int[] field3744;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "[I")
    public int[] field3746;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "[Z")
    public boolean[] field3756;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "[[I")
    public int[][] field3741;

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "[[[I")
    public static int[][][] field3754;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Luc;BIII)Luc;", line = 7)
    public final class201 method1774(class201 arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field3746[arg3];
        int var7 = this.field3734[arg3];
        if (arg1 != -75) {
            this.method1774((class201) null, (byte) 14, 2, -64, -98);
        }
        field3737++;
        class115 var8 = class216.method1494(arg1 ^ 0x3E, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg0.method707(true, true, true);
        }
        class115 var10 = null;
        if ((this.field3755 || class37.field445) && arg4 != -1 && arg4 < this.field3734.length) {
            int var11 = this.field3734[arg4];
            var10 = class216.method1494(arg1 ^ 0x38, var11 >> 16);
            arg4 = var11 & 0xFFFF;
        }
        class201 var12;
        if (var10 == null) {
            var12 = arg0.method707(!var8.method787(var9, false), !var8.method785(-8572, var9), !this.field3758);
        } else {
            var12 = arg0.method707(!var8.method787(var9, false) & !var10.method787(arg4, false), !var8.method785(-8572, var9) & !var10.method785(-8572, arg4), !this.field3758);
        }
        var12.method1381(var8, var9, var10, arg4, arg2 - 1, var6, this.field3758);
        return var12;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILp;)V", line = 47)
    public final void method1775(int arg0, class107 arg1) {
        while (true) {
            int var3 = arg1.method661(-1);
            if (var3 == 0) {
                if (arg0 != 30544) {
                    return;
                }
                field3749++;
                return;
            }
            this.method1779(var3, 1, arg1);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Luc;IIIZ)Luc;", line = 67)
    public final class201 method1776(class201 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3736++;
        int var6 = this.field3734[arg1];
        int var7 = this.field3746[arg1];
        class115 var8 = class216.method1494(-119, var6 >> 16);
        int var9 = var6 & 0xFFFF;
        if (var8 == null) {
            return arg0.method716(true, true, true);
        }
        class115 var10 = null;
        class115 var11 = null;
        class115 var12 = null;
        if ((this.field3755 || class37.field445) && arg3 != -1 && this.field3734.length > arg3) {
            int var13 = this.field3734[arg3];
            var11 = class216.method1494(-128, var13 >> 16);
            arg3 = var13 & 0xFFFF;
        }
        int var14 = 0;
        int var15 = 0;
        if (this.field3744 != null) {
            if (arg1 < this.field3744.length) {
                var15 = this.field3744[arg1];
                if (var15 != 65535) {
                    var10 = class216.method1494(62, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field3755 || class37.field445) && arg3 != -1 && arg3 < this.field3744.length) {
                var14 = this.field3744[arg3];
                if (var14 != 65535) {
                    var12 = class216.method1494(-125, var14 >> 16);
                    var14 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method787(var9, arg4);
        boolean var17 = !var8.method785(-8572, var9);
        if (var10 != null) {
            var16 &= !var10.method787(var15, false);
            var17 &= !var10.method785(-8572, var15);
        }
        if (var11 != null) {
            var16 &= !var11.method787(arg3, false);
            var17 &= !var11.method785(-8572, arg3);
        }
        if (var12 != null) {
            var16 &= !var12.method787(var14, false);
            var17 &= !var12.method785(-8572, var14);
        }
        class201 var18 = arg0.method716(var16, var17, !this.field3758);
        var18.method1381(var8, var9, var11, arg3, arg2 - 1, var7, this.field3758);
        if (var10 != null) {
            var18.method1381(var10, var15, var12, var14, arg2 - 1, var7, this.field3758);
        }
        return var18;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 164)
    public static void method1777(int arg0) {
        field3754 = (int[][][]) null;
        int var1 = -117 % ((arg0 - 52) / 39);
        field3738 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIILuc;I)Luc;", line = 199)
    public final class201 method1778(int arg0, int arg1, int arg2, int arg3, class201 arg4, int arg5) {
        int var7 = this.field3746[arg1];
        int var8 = this.field3734[arg1];
        class115 var9 = class216.method1494(-118, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        field3728++;
        if (var9 == null) {
            return arg4.method716(true, true, true);
        }
        class115 var11 = null;
        if ((this.field3755 || class37.field445) && arg5 != -1 && this.field3734.length > arg5) {
            int var12 = this.field3734[arg5];
            var11 = class216.method1494(arg3 ^ 0xF1FF9A97, var12 >> 16);
            arg5 = var12 & 0xFFFF;
        }
        if (arg3 != -234906896) {
            return (class201) null;
        }
        int var13 = arg0 & 0x3;
        class201 var14;
        if (var11 == null) {
            var14 = arg4.method716(!var9.method787(var10, false), !var9.method785(-8572, var10), !this.field3758);
        } else {
            var14 = arg4.method716(!var9.method787(var10, false) & !var11.method787(arg5, false), !var9.method785(-8572, var10) & !var11.method785(-8572, arg5), !this.field3758);
        }
        if (this.field3758 && class250.field3787) {
            if (var13 == 1) {
                ((class108) var14).method708();
            } else if (var13 == 2) {
                ((class108) var14).method703();
            } else if (var13 == 3) {
                ((class108) var14).method686();
            }
        } else if (var13 == 1) {
            var14.method689();
        } else if (var13 == 2) {
            var14.method704();
        } else if (var13 == 3) {
            var14.method738();
        }
        var14.method1381(var9, var10, var11, arg5, arg2 - 1, var7, this.field3758);
        if (this.field3758 && class250.field3787) {
            if (var13 == 1) {
                ((class108) var14).method686();
            } else if (var13 == 2) {
                ((class108) var14).method703();
            } else if (var13 == 3) {
                ((class108) var14).method708();
            }
        } else if (var13 == 1) {
            var14.method738();
        } else if (var13 == 2) {
            var14.method704();
        } else if (var13 == 3) {
            var14.method689();
        }
        return var14;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILp;)V", line = 308)
    private final void method1779(int arg0, int arg1, class107 arg2) {
        if (arg0 == arg1) {
            int var4 = arg2.method624(arg1 ^ 0x3915);
            this.field3746 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3746[var5] = arg2.method624(class312.method2192(arg1, 14613));
            }
            this.field3734 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3734[var6] = arg2.method624(14612);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3734[var7] = (arg2.method624(class312.method2192(arg1, 14613)) << 16) + this.field3734[var7];
            }
        } else if (arg0 == 2) {
            this.field3753 = arg2.method624(14612);
        } else if (arg0 == 3) {
            this.field3756 = new boolean[256];
            int var8 = arg2.method661(-1);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3756[arg2.method661(-1)] = true;
            }
        } else if (arg0 == 4) {
            this.field3745 = true;
        } else if (arg0 == 5) {
            this.field3740 = arg2.method661(-1);
        } else if (arg0 == 6) {
            this.field3732 = arg2.method624(14612);
        } else if (arg0 == 7) {
            this.field3731 = arg2.method624(arg1 ^ 0x3915);
        } else if (arg0 == 8) {
            this.field3730 = arg2.method661(-1);
        } else if (arg0 == 9) {
            this.field3752 = arg2.method661(arg1 - 2);
        } else if (arg0 == 10) {
            this.field3747 = arg2.method661(-1);
        } else if (arg0 == 11) {
            this.field3729 = arg2.method661(-1);
        } else if (arg0 == 12) {
            int var10 = arg2.method661(arg1 ^ 0xFFFFFFFE);
            this.field3744 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field3744[var11] = arg2.method624(14612);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field3744[var12] += arg2.method624(14612) << 16;
            }
        } else if (arg0 == 13) {
            int var13 = arg2.method624(14612);
            this.field3741 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg2.method661(-1);
                if (var15 > 0) {
                    this.field3741[var14] = new int[var15];
                    this.field3741[var14][0] = arg2.method622((byte) -121);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field3741[var14][var16] = arg2.method624(14612);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field3758 = true;
        } else if (arg0 == 15) {
            this.field3755 = true;
        } else if (arg0 == 16) {
            this.field3757 = true;
        }
        field3748++;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V", line = 471)
    public final void method1780(int arg0) {
        if (this.field3752 == -1) {
            if (this.field3756 == null) {
                this.field3752 = 0;
            } else {
                this.field3752 = 2;
            }
        }
        field3750++;
        if (this.field3747 == -1) {
            if (this.field3756 == null) {
                this.field3747 = 0;
            } else {
                this.field3747 = 2;
            }
        }
        if (arg0 > -110) {
            this.method1781(79, (class201) null, 113, -61, -92, 21);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILuc;IIII)Luc;", line = 507)
    public final class201 method1781(int arg0, class201 arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = -84 / ((arg3 - 57) / 44);
        int var8 = this.field3746[arg5];
        int var9 = this.field3734[arg5];
        field3735++;
        class115 var10 = class216.method1494(92, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            return arg1.method695(true, true, true);
        }
        int var12 = arg4 & 0x3;
        class115 var13 = null;
        if ((this.field3755 || class37.field445) && arg0 != -1 && arg0 < this.field3734.length) {
            int var14 = this.field3734[arg0];
            var13 = class216.method1494(120, var14 >> 16);
            arg0 = var14 & 0xFFFF;
        }
        class201 var15;
        if (var13 == null) {
            var15 = arg1.method695(!var10.method787(var11, false), !var10.method785(-8572, var11), !this.field3758);
        } else {
            var15 = arg1.method695(!var10.method787(var11, false) & !var13.method787(arg0, false), !var10.method785(-8572, var11) & !var13.method785(-8572, arg0), !this.field3758);
        }
        if (class250.field3787 && this.field3758) {
            if (var12 == 1) {
                ((class108) var15).method708();
            } else if (var12 == 2) {
                ((class108) var15).method703();
            } else if (var12 == 3) {
                ((class108) var15).method686();
            }
        } else if (var12 == 1) {
            var15.method689();
        } else if (var12 == 2) {
            var15.method704();
        } else if (var12 == 3) {
            var15.method738();
        }
        var15.method1381(var10, var11, var13, arg0, arg2 - 1, var8, this.field3758);
        if (class250.field3787 && this.field3758) {
            if (var12 == 1) {
                ((class108) var15).method686();
            } else if (var12 == 2) {
                ((class108) var15).method703();
            } else if (var12 == 3) {
                ((class108) var15).method708();
            }
        } else if (var12 == 1) {
            var15.method738();
        } else if (var12 == 2) {
            var15.method704();
        } else if (var12 == 3) {
            var15.method689();
        }
        return var15;
    }
}
