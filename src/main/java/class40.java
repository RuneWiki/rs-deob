import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class40 {

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "Llga;")
    private class663 field464 = new class663(64);

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "Llga;")
    public class663 field473 = new class663(64);

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "Lsea;")
    public class648 field468;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "Lsea;")
    private class648 field469;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "Llh;")
    public static class487 field467 = new class487(0, 12);

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "[I")
    public static int[] field471 = new int[256];

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "Lgca;")
    public static class227 field470;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V", line = 7)
    public final void method354(int arg0) {
        field474++;
        class663 var2 = this.field464;
        synchronized (this.field464) {
            this.field464.method3755(19713);
            if (arg0 != 150) {
                field471 = null;
            }
        }
        class663 var3 = this.field473;
        synchronized (this.field473) {
            this.field473.method3755(19713);
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V", line = 28)
    public final void method355(int arg0) {
        if (arg0 >= -101) {
            this.method356(true, 1, 17);
        }
        class663 var2 = this.field464;
        synchronized (this.field464) {
            this.field464.method3749(7648);
        }
        field465++;
        class663 var3 = this.field473;
        synchronized (this.field473) {
            this.field473.method3749(7648);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZII)V", line = 45)
    public final void method356(boolean arg0, int arg1, int arg2) {
        this.field464 = new class663(arg2);
        if (arg0) {
            this.method356(true, 126, -80);
        }
        field463++;
        this.field473 = new class663(arg1);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)V", line = 58)
    public static void method357(boolean arg0) {
        if (arg0) {
            field470 = null;
        }
        field467 = null;
        field470 = null;
        field471 = null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI)Lcg;", line = 78)
    public final class122 method358(byte arg0, int arg1) {
        field462++;
        class663 var3 = this.field464;
        class122 var4;
        synchronized (this.field464) {
            var4 = (class122) this.field464.method3747((byte) -66, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field469;
        byte[] var6;
        synchronized (this.field469) {
            var6 = this.field469.method3654(-15615, 34, arg1);
            if (arg0 != -26) {
                this.method354(-16);
            }
        }
        class122 var7 = new class122();
        var7.field1682 = this;
        if (var6 != null) {
            var7.method874(new class501(var6), (byte) -21);
        }
        class663 var8 = this.field464;
        synchronized (this.field464) {
            this.field464.method3748((long) arg1, var7, 12537);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lci;ILsea;Lsea;)V", line = 440)
    public class40(class414 arg0, int arg1, class648 arg2, class648 arg3) {
        this.field468 = arg3;
        this.field469 = arg2;
        this.field469.method3653(34, true);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lmw;Lhb;IBI)V", line = 120)
    public static final void method359(class455 arg0, class677 arg1, int arg2, byte arg3, int arg4) {
        field466++;
        byte var5 = -1;
        if ((arg2 & 0x40) != 0) {
            int var6 = arg0.method2871((byte) -87);
            int var7 = arg0.method2838((byte) -2);
            arg1.method891(var6, var7, class186.field2697, -128);
            arg1.field1712 = class186.field2697 + 300;
            arg1.field1705 = arg0.method2831(true);
        }
        if ((arg2 & 0x2000) != 0) {
            arg1.field1709 = arg0.method2851((byte) -86);
            if (arg1.field1709.charAt(0) == '~') {
                arg1.field1709 = arg1.field1709.substring(1);
                class628.method3510(arg1.method3849(false, (byte) -66), -1, 0, 2, arg1.method3846(true, (byte) -60), arg1.field1709, arg1.field9682);
            } else if (class143.field2063 == arg1) {
                class628.method3510(arg1.method3849(false, (byte) -66), -1, 0, 2, arg1.method3846(true, (byte) -32), arg1.field1709, arg1.field9682);
            }
            arg1.field1755 = 150;
            arg1.field1757 = 0;
            arg1.field1723 = 0;
        }
        if ((arg2 & 0x800) != 0) {
            int var8 = arg0.method2846((byte) -69);
            arg1.field1767 = arg0.method2874((byte) -75);
            arg1.field1708 = arg0.method2831(true);
            arg1.field1754 = (var8 & 0x8000) != 0;
            arg1.field1727 = var8 & 0x7FFF;
            arg1.field1713 = class186.field2697 + arg1.field1727 + arg1.field1767;
        }
        if ((arg2 & 0x4) != 0) {
            int[] var9 = new int[4];
            for (int var10 = 0; var10 < 4; var10++) {
                var9[var10] = arg0.method2846((byte) -69);
                if (var9[var10] == 65535) {
                    var9[var10] = -1;
                }
            }
            int var11 = arg0.method2843(7592);
            class651.method3668(122, var9, var11, arg1);
        }
        if ((arg2 & 0x8000) != 0) {
            var5 = arg0.method2876((byte) -100);
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field9660 = arg0.method2831(true) == 1;
        }
        if (arg3 != -52) {
            field470 = null;
        }
        if ((arg2 & 0x10) != 0) {
            int var12 = arg0.method2845(-1);
            int var13 = arg0.method2840(false);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var14 = arg0.method2874((byte) -75);
            arg1.method882(var12, var14, (byte) -22, var13, false);
        }
        if ((arg2 & 0x10000) != 0) {
            arg1.field1775 = arg0.method2863(121);
            arg1.field1743 = arg0.method2827(-1655);
            arg1.field1736 = arg0.method2827(-1655);
            arg1.field1720 = (byte) arg0.method2843(arg3 ^ 0xFFFFE264);
            arg1.field1777 = class186.field2697 + arg0.method2816(0);
            arg1.field1789 = class186.field2697 + arg0.method2816(0);
        }
        if ((arg2 & 0x1) != 0) {
            arg1.field9684 = arg0.method2845(-1);
            if (arg1.field1797 == 0) {
                arg1.method886(0, arg1.field9684);
                arg1.field9684 = -1;
            }
        }
        if ((arg2 & 0x2) != 0) {
            int var15 = arg0.method2845(-1);
            if (var15 == 65535) {
                var15 = -1;
            }
            arg1.field1701 = var15;
        }
        if ((arg2 & 0x4000) != 0) {
            arg1.field1734 = arg0.method2876((byte) -113);
            arg1.field1752 = arg0.method2870((byte) 22);
            arg1.field1733 = arg0.method2876((byte) -108);
            arg1.field1788 = arg0.method2827(-1655);
            arg1.field1770 = arg0.method2846((byte) -69) + class186.field2697;
            arg1.field1751 = arg0.method2846((byte) -69) + class186.field2697;
            arg1.field1732 = arg0.method2843(arg3 + 7644);
            if (arg1.field9692) {
                arg1.field1797 = 0;
                arg1.field1733 += arg1.field9699;
                arg1.field1788 += arg1.field9700;
                arg1.field1734 += arg1.field9699;
                arg1.field1752 += arg1.field9700;
            } else {
                arg1.field1733 += arg1.field1807[0];
                arg1.field1788 += arg1.field1801[0];
                arg1.field1734 += arg1.field1807[0];
                arg1.field1797 = 1;
                arg1.field1752 += arg1.field1801[0];
            }
            arg1.field1802 = 0;
        }
        if ((arg2 & 0x20000) != 0) {
            int var16 = class186.field2697;
            int var17 = arg0.method2871((byte) -87);
            int var18 = arg0.method2874((byte) -75);
            arg1.method891(var17, var18, var16, -70);
        }
        if ((arg2 & 0x200) != 0) {
            int var19 = arg0.method2874((byte) -75);
            int[] var20 = new int[var19];
            int[] var21 = new int[var19];
            int[] var22 = new int[var19];
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = arg0.method2816(arg3 + 52);
                if (var24 == 65535) {
                    var24 = -1;
                }
                var20[var23] = var24;
                var21[var23] = arg0.method2838((byte) -2);
                var22[var23] = arg0.method2845(-1);
            }
            class398.method2331(var21, var20, 1, var22, arg1);
        }
        if ((arg2 & 0x100) != 0) {
            int var25 = arg0.method2845(-1);
            int var26 = arg0.method2858((byte) -97);
            if (var25 == 65535) {
                var25 = -1;
            }
            int var27 = arg0.method2843(7592);
            arg1.method882(var25, var27, (byte) -22, var26, true);
        }
        if ((arg2 & 0x8) != 0) {
            class78.field1188[arg4] = arg0.method2827(class324.method1944(arg3, 1605));
        }
        if ((arg2 & 0x80) != 0) {
            int var28 = arg0.method2843(arg3 ^ 0xFFFFE264);
            byte[] var29 = new byte[var28];
            class501 var30 = new class501(var29);
            arg0.method2857(var29, var28, (byte) 125, 0);
            class437.field6082[arg4] = var30;
            arg1.method3856(var30, (byte) 119);
        }
        if ((arg2 & 0x40000) != 0) {
            int var31 = arg0.method2874((byte) -75);
            int[] var32 = new int[var31];
            int[] var33 = new int[var31];
            for (int var34 = 0; var34 < var31; var34++) {
                int var35 = arg0.method2816(0);
                if ((var35 & 0xC000) == 49152) {
                    int var36 = arg0.method2867(-2);
                    var32[var34] = class647.method3617(var36, var35 << 16);
                } else {
                    var32[var34] = var35;
                }
                var33[var34] = arg0.method2816(class324.method1944(arg3, -52));
            }
            arg1.method898(var32, 37, var33);
        }
        if (!arg1.field9692) {
            return;
        }
        if (var5 == 127) {
            arg1.method3855(arg1.field9699, arg1.field9700, -112);
            return;
        }
        byte var37;
        if (var5 == -1) {
            var37 = class78.field1188[arg4];
        } else {
            var37 = var5;
        }
        arg1.method3847(var37, arg1.field9700, (byte) 2, arg1.field9699);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)V", line = 417)
    public final void method360(int arg0, int arg1) {
        class663 var3 = this.field464;
        synchronized (this.field464) {
            this.field464.method3754(arg1, true);
        }
        if (arg0 != 0) {
            return;
        }
        field472++;
        class663 var4 = this.field473;
        synchronized (this.field473) {
            this.field473.method3754(arg1, true);
        }
    }
}
