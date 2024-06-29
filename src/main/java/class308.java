import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class308 {

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Z")
    public boolean field3804 = false;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    private int field3807 = -1;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    private int field3805 = 0;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    private int field3814 = 128;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    private int field3817 = 0;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    private int field3815 = 128;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    private int field3808 = 0;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public int field3824 = -1;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "B")
    public byte field3816 = 0;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Lpe;")
    public static class636 field3821 = new class636(1);

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "Llf;")
    public static class251 field3823 = new class251(2, 2);

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "Lhj;")
    public static class596 field3828 = new class596(20, 2);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public int field3806;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    private int field3812;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "Ltg;")
    public class245 field3827;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "[S")
    private short[] field3813;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "[S")
    private short[] field3818;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "[S")
    private short[] field3819;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "[S")
    private short[] field3825;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "[[Z")
    public static boolean[][] field3820;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Laaa;IIZILha;ZBLs;IIILs;I)Lka;")
    private final class498 method1820(class644 arg0, int arg1, int arg2, boolean arg3, int arg4, class66 arg5, boolean arg6, byte arg7, class296 arg8, int arg9, int arg10, int arg11, class296 arg12, int arg13) {
        field3809++;
        int var15 = arg4;
        class582 var16 = this.field3824 == -1 || arg11 == -1 ? null : arg0.method3600(-121, this.field3824);
        boolean var17 = arg6 & this.field3816 != 0;
        if (var16 != null) {
            var15 = arg4 | var16.method3352(arg2, false, arg11, true);
        }
        if (var17) {
            var15 |= this.field3816 == 3 ? 7 : 2;
        }
        if (this.field3815 != 128) {
            var15 |= 0x2;
        }
        if (this.field3814 != 128 || this.field3805 != 0) {
            var15 |= 0x5;
        }
        class288 var18 = this.field3827.field2899;
        class498 var19;
        synchronized (this.field3827.field2899) {
            var19 = (class498) this.field3827.field2899.method1684((long) (this.field3806 |= arg5.field904 << 29), -359);
        }
        if (var19 == null || arg5.method620(var19.method396(), var15) != 0) {
            if (var19 != null) {
                var15 = arg5.method632(var15, var19.method396());
            }
            int var20 = var15;
            if (this.field3818 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field3825 != null) {
                var20 |= 0x8000;
            }
            class496 var21 = class748.method4177(this.field3812, 0, this.field3827.field2887, 4);
            if (var21 == null) {
                return null;
            }
            if (var21.field6919 < 13) {
                var21.method2934(-116, 2);
            }
            var19 = arg5.method567(var21, var20, this.field3827.field2900, this.field3817 + 64, this.field3808 + 850);
            if (this.field3818 != null) {
                for (int var22 = 0; var22 < this.field3818.length; var22++) {
                    var19.method402(this.field3818[var22], this.field3819[var22]);
                }
            }
            if (this.field3825 != null) {
                for (int var23 = 0; var23 < this.field3825.length; var23++) {
                    var19.method399(this.field3825[var23], this.field3813[var23]);
                }
            }
            var19.method378(var15);
            class288 var24 = this.field3827.field2899;
            synchronized (this.field3827.field2899) {
                this.field3827.field2899.method1686(-25638, (long) (this.field3806 |= arg5.field904 << 29), var19);
            }
        }
        class498 var25 = var16 == null ? var19.method364(arg7, var15, true) : var16.method3353(arg2, var15, arg11, arg7, 0, arg9, var19, true);
        if (this.field3814 != 128 || this.field3815 != 128) {
            var25.method357(this.field3814, this.field3815, this.field3814);
        }
        if (this.field3805 != 0) {
            if (this.field3805 == 90) {
                var25.method360(4096);
            }
            if (this.field3805 == 180) {
                var25.method360(8192);
            }
            if (this.field3805 == 270) {
                var25.method360(12288);
            }
        }
        if (var17) {
            var25.method354(this.field3816, this.field3807, arg8, arg12, arg10, arg13, arg1);
        }
        if (!arg3) {
            this.field3813 = null;
        }
        var25.method378(arg4);
        return var25;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILaaa;ZBIILha;Ls;ILs;II)Lka;")
    public final class498 method1821(int arg0, int arg1, class644 arg2, boolean arg3, byte arg4, int arg5, int arg6, class66 arg7, class296 arg8, int arg9, class296 arg10, int arg11, int arg12) {
        field3803++;
        if (arg4 != 45) {
            this.method1822((byte) 0, null);
        }
        return this.method1820(arg2, arg5, arg9, true, arg1, arg7, arg3, (byte) 2, arg8, arg6, arg12, arg0, arg10, arg11);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLes;)V")
    public final void method1822(byte arg0, class403 arg1) {
        if (arg0 != 5) {
            this.field3813 = null;
        }
        while (true) {
            int var3 = arg1.method2396((byte) 55);
            if (var3 == 0) {
                field3811++;
                return;
            }
            this.method1823((byte) 47, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BILes;)V")
    private final void method1823(byte arg0, int arg1, class403 arg2) {
        if (arg0 != 47) {
            method1826((byte) 60);
        }
        field3826++;
        if (arg1 == 1) {
            this.field3812 = arg2.method2390((byte) 67);
        } else if (arg1 == 2) {
            this.field3824 = arg2.method2390((byte) -118);
        } else if (arg1 == 4) {
            this.field3814 = arg2.method2390((byte) 13);
        } else if (arg1 == 5) {
            this.field3815 = arg2.method2390((byte) -120);
        } else if (arg1 == 6) {
            this.field3805 = arg2.method2390((byte) 69);
        } else if (arg1 == 7) {
            this.field3817 = arg2.method2396((byte) 16);
        } else if (arg1 == 8) {
            this.field3808 = arg2.method2396((byte) -90);
        } else if (arg1 == 9) {
            this.field3816 = 3;
            this.field3807 = 8224;
        } else if (arg1 == 10) {
            this.field3804 = true;
        } else if (arg1 == 11) {
            this.field3816 = 1;
        } else if (arg1 == 12) {
            this.field3816 = 4;
        } else if (arg1 == 13) {
            this.field3816 = 5;
        } else if (arg1 == 14) {
            this.field3816 = 2;
            this.field3807 = arg2.method2396((byte) -86) * 256;
        } else if (arg1 == 15) {
            this.field3816 = 3;
            this.field3807 = arg2.method2390((byte) -101);
        } else if (arg1 == 16) {
            this.field3816 = 3;
            this.field3807 = arg2.method2381((byte) 48);
            return;
        } else if (arg1 == 40) {
            int var4 = arg2.method2396((byte) 44);
            this.field3818 = new short[var4];
            this.field3819 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3818[var5] = (short) arg2.method2390((byte) 52);
                this.field3819[var5] = (short) arg2.method2390((byte) -98);
            }
            return;
        } else if (arg1 == 41) {
            int var6 = arg2.method2396((byte) -100);
            this.field3813 = new short[var6];
            this.field3825 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3825[var7] = (short) arg2.method2390((byte) -125);
                this.field3813[var7] = (short) arg2.method2390((byte) -120);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILha;BBLaaa;III)Lka;")
    public final class498 method1824(int arg0, class66 arg1, byte arg2, byte arg3, class644 arg4, int arg5, int arg6, int arg7) {
        field3802++;
        return arg2 >= -124 ? null : this.method1820(arg4, 0, arg7, true, arg0, arg1, false, arg3, null, arg5, 0, arg6, null, 0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILha;Laaa;IIIB)Lka;")
    public final class498 method1825(int arg0, class66 arg1, class644 arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 == 2) {
            field3810++;
            return this.method1820(arg2, 0, arg5, true, arg4, arg1, false, (byte) 2, null, arg0, 0, arg3, null, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static void method1826(byte arg0) {
        field3821 = null;
        field3820 = null;
        if (arg0 != -29) {
            method1826((byte) -128);
        }
        field3823 = null;
        field3828 = null;
    }
}
