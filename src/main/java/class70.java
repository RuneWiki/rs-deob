import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class70 extends class237 implements class438 {

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "S")
    private short field815;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "B")
    private byte field797;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "Z")
    private boolean field796;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "Z")
    private boolean field798;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "B")
    private byte field789;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "Z")
    private boolean field794;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "B")
    private byte field809;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "Z")
    private boolean field799;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "Lk;")
    private class88 field805;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "Lr;")
    public class520 field810;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "Lqp;")
    public static class586 field800 = new class586(108, 10);

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "I")
    public static int field821 = 0;

    @OriginalMember(owner = "client!mf", name = "db", descriptor = "S")
    public static short field822 = 256;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "Led;")
    private class115 field791;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)I", line = 3)
    public final int method159(int arg0) {
        ++field806;
        int var2 = -45 / ((-30 - arg0) / 50);
        return this.field810 != null ? this.field810.method1954() : 0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILuf;Ldda;)V", line = 15)
    public static final void method420(int arg0, class353 arg1, class597 arg2) {
        class252.field3688 = arg1;
        ++field817;
        class136.field1813 = "";
        class356.field5181 = arg2;
        if (!class353.field5142.startsWith("win")) {
            if (!class353.field5142.startsWith("linux")) {
                if (class353.field5142.startsWith("mac")) {
                    class136.field1813 = class136.field1813 + "macos/";
                }
            } else {
                class136.field1813 = class136.field1813 + "linux/";
            }
        } else {
            class136.field1813 = class136.field1813 + "windows/";
        }
        if (class353.field5140 == arg0) {
            class136.field1813 = class136.field1813 + "msjava/";
        } else if (!class353.field5125.startsWith("amd64") && !class353.field5125.startsWith("x86_64")) {
            if (!class353.field5125.startsWith("i386") && !class353.field5125.startsWith("i486") && !class353.field5125.startsWith("i586") && !class353.field5125.startsWith("x86")) {
                if (!class353.field5125.startsWith("ppc")) {
                    class136.field1813 = class136.field1813 + "universal/";
                } else {
                    class136.field1813 = class136.field1813 + "ppc/";
                }
            } else {
                class136.field1813 = class136.field1813 + "x86/";
            }
        } else {
            class136.field1813 = class136.field1813 + "x86_64/";
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILqa;IB)Z", line = 59)
    public final boolean method164(int arg0, class167 arg1, int arg2, byte arg3) {
        if (arg3 != 77) {
            return false;
        } else {
            ++field808;
            class520 var5 = this.method423(false, 131072, arg1);
            if (var5 != null) {
                class105 var6 = arg1.method1038();
                var6.method613(super.field3464, super.field3460, super.field3463);
                return var5.method1963(arg0, arg2, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)Z", line = 81)
    public final boolean method162(int arg0) {
        ++field813;
        if (arg0 != -177) {
            this.method167(false);
        }
        return this.field799;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)I", line = 95)
    public final int method171(boolean arg0) {
        ++field793;
        if (!arg0) {
            this.field805 = null;
        }
        return this.field797;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILqa;)Llb;", line = 107)
    public final class239 method169(int arg0, class167 arg1) {
        ++field816;
        if (this.field810 == null) {
            return null;
        } else {
            if (arg0 != -911932384) {
                this.method159(62);
            }
            class105 var3 = arg1.method1038();
            var3.method613(super.field3464, super.field3460, super.field3463);
            class239 var4 = null;
            if (this.field794) {
                var4 = class210.method1365(false, 1);
            }
            this.field810.method1965(var3, var4 == null ? null : var4.field3503[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lqa;B)V", line = 136)
    public final void method158(class167 arg0, byte arg1) {
        ++field801;
        if (arg1 > -76) {
            this.method157((byte) 43, (class167) null);
        }
        Object var3 = null;
        class88 var5;
        if (this.field805 == null && this.field799) {
            class342 var4 = this.method421(262144, true, true, arg0);
            var5 = var4 == null ? null : var4.field5001;
        } else {
            var5 = this.field805;
            this.field805 = null;
        }
        if (var5 != null) {
            class253.method1607(var5, this.field789, super.field3464, super.field3463, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V", line = 164)
    public final void method165(byte arg0) {
        ++field795;
        this.field798 = false;
        if (arg0 != -33) {
            this.method158((class167) null, (byte) -93);
        }
        if (this.field810 != null) {
            this.field810.method1973(-65537 & this.field810.method1950());
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZZLqa;)Lrp;", line = 179)
    private final class342 method421(int arg0, boolean arg1, boolean arg2, class167 arg3) {
        ++field803;
        class158 var5 = class312.field4690.method2004(false, this.field815 & 65535);
        if (!arg2) {
            return null;
        } else {
            class543 var6;
            class543 var7;
            if (!this.field796) {
                if (~this.field789 <= -4) {
                    var6 = null;
                } else {
                    var6 = class562.field8337[this.field789 + 1];
                }
                var7 = class562.field8337[this.field789];
            } else {
                var7 = class287.field4219[this.field789];
                var6 = class562.field8337[0];
            }
            return var5.method918(super.field3460, super.field3464, var7, super.field3463, 0, this.field797 != 11 ? this.field797 : 10, arg1, arg0, ~this.field797 != -12 ? this.field809 : this.field809 + 4, var6, arg3);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BILqa;)Lr;", line = 210)
    public final class520 method161(byte arg0, int arg1, class167 arg2) {
        ++field804;
        return arg0 != -127 ? null : this.method423(false, arg1, arg2);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLqa;)Led;", line = 221)
    public final class115 method157(byte arg0, class167 arg1) {
        if (this.field791 == null) {
            this.field791 = class411.method2443(-27621, super.field3460, super.field3464, super.field3463, this.method423(false, 0, arg1));
        }
        ++field788;
        int var3 = -71 % ((arg0 - 14) / 48);
        return this.field791;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lqa;Z)V", line = 235)
    public final void method166(class167 arg0, boolean arg1) {
        if (!arg1) {
            this.method161((byte) 89, -60, (class167) null);
        }
        ++field818;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)I", line = 247)
    public final int method173(int arg0) {
        if (arg0 <= 30) {
            return 16;
        } else {
            ++field807;
            return this.field815 & 65535;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)I", line = 261)
    public final int method170(int arg0) {
        if (arg0 != -5527) {
            return -74;
        } else {
            ++field792;
            return this.field809;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIBIIII)V", line = 275)
    public static final void method422(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        class201.method1305((byte) -128, arg0);
        ++field819;
        int var7 = 0;
        if (arg2 != 87) {
            method420(60, (class353) null, (class597) null);
        }
        int var8 = -arg6 + arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class47.field558[arg4];
        int var16 = -var8 + arg5;
        int var17 = arg5 + var8;
        class69.method418(arg3, var15, var16, (byte) 117, arg5 - arg0);
        class69.method418(arg1, var15, var17, (byte) 117, var16);
        class69.method418(arg3, var15, arg5 - -arg0, (byte) 117, var17);
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (~var12 <= -1 && var11 >= 1) {
                class481.field7293[var11] = var7;
                --var11;
                var12 -= var11 << 1;
            }
            ++var7;
            if (var10 >= 0) {
                --var9;
                if (~var8 < ~var9) {
                    int[] var18 = class47.field558[arg4 + var9];
                    int[] var19 = class47.field558[arg4 - var9];
                    int var20 = class481.field7293[var9];
                    int var21 = arg5 + var7;
                    int var22 = arg5 - var7;
                    int var23 = arg5 + var20;
                    int var24 = -var20 + arg5;
                    class69.method418(arg3, var18, var24, (byte) 117, var22);
                    class69.method418(arg1, var18, var23, (byte) 117, var24);
                    class69.method418(arg3, var18, var21, (byte) 117, var23);
                    class69.method418(arg3, var19, var24, (byte) 117, var22);
                    class69.method418(arg1, var19, var23, (byte) 117, var24);
                    class69.method418(arg3, var19, var21, (byte) 117, var23);
                } else {
                    int[] var25 = class47.field558[arg4 + var9];
                    int[] var26 = class47.field558[-var9 + arg4];
                    int var27 = arg5 + var7;
                    int var28 = -var7 + arg5;
                    class69.method418(arg3, var25, var27, (byte) 117, var28);
                    class69.method418(arg3, var26, var27, (byte) 117, var28);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class47.field558[arg4 + var7];
            int[] var30 = class47.field558[arg4 - var7];
            int var31 = arg5 + var9;
            int var32 = -var9 + arg5;
            if (~var8 < ~var7) {
                int var33 = ~var7 < ~var11 ? class481.field7293[var7] : var11;
                int var34 = arg5 + var33;
                int var35 = -var33 + arg5;
                class69.method418(arg3, var29, var35, (byte) 117, var32);
                class69.method418(arg1, var29, var34, (byte) 117, var35);
                class69.method418(arg3, var29, var31, (byte) 117, var34);
                class69.method418(arg3, var30, var35, (byte) 117, var32);
                class69.method418(arg1, var30, var34, (byte) 117, var35);
                class69.method418(arg3, var30, var31, (byte) 117, var34);
            } else {
                class69.method418(arg3, var29, var31, (byte) 117, var32);
                class69.method418(arg3, var30, var31, (byte) 117, var32);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZILqa;)Lr;", line = 409)
    private final class520 method423(boolean arg0, int arg1, class167 arg2) {
        ++field811;
        if (this.field810 != null && ~arg2.method1026(this.field810.method1950(), arg1) == -1) {
            return this.field810;
        } else {
            class342 var4 = this.method421(arg1, arg0, true, arg2);
            return var4 == null ? null : var4.field4999;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lqa;Lih;IIIIIZIIIIIIZ)V", line = 428)
    public class70(class167 arg0, class158 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field2060 == -2, class156.method904(arg12, false, arg13));
        this.field815 = (short) arg1.field2010;
        this.field797 = (byte) arg12;
        this.field796 = arg7;
        this.field798 = arg14;
        this.field789 = (byte) arg3;
        this.field794 = ~arg1.field2028 != -1 && !arg7;
        this.field809 = (byte) arg13;
        this.field799 = arg0.method1007() && arg1.field2078 && !this.field796 && class94.field1158.method131(false, class239.field3499) != 0;
        int var16 = 2048;
        if (this.field798) {
            var16 |= 65536;
        }
        class342 var17 = this.method421(var16, this.field799, true, arg0);
        if (var17 != null) {
            this.field805 = var17.field5001;
            this.field810 = var17.field4999;
            if (this.field798) {
                this.field810 = this.field810.method369((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(B)V", line = 462)
    public static void method424(byte arg0) {
        int var1 = 8 % ((58 - arg0) / 43);
        field800 = null;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Lqa;B)V", line = 473)
    public final void method174(class167 arg0, byte arg1) {
        ++field820;
        if (arg1 != 2) {
            this.method157((byte) -89, (class167) null);
        }
        Object var3 = null;
        class88 var5;
        if (this.field805 == null && this.field799) {
            class342 var4 = this.method421(262144, true, true, arg0);
            var5 = var4 != null ? var4.field5001 : null;
        } else {
            var5 = this.field805;
            this.field805 = null;
        }
        if (var5 != null) {
            class639.method3698(var5, this.field789, super.field3464, super.field3463, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)I", line = 503)
    public final int method425(int arg0) {
        ++field814;
        if (arg0 < 95) {
            this.method173(-56);
        }
        return this.field810 != null ? this.field810.method1958() / 4 : 15;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)Z", line = 516)
    public final boolean method167(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field812;
            return this.field798;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 527)
    public final void method154(byte arg0) {
        if (arg0 != -74) {
            method422(-103, -48, (byte) -118, -82, -87, 118, -91);
        }
        ++field802;
        if (this.field810 != null) {
            this.field810.method1961();
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILqa;IIZLse;I)V", line = 554)
    public final void method160(int arg0, class167 arg1, int arg2, int arg3, boolean arg4, class198 arg5, int arg6) {
        if (arg5 instanceof class403) {
            class403 var8 = (class403) arg5;
            if (this.field810 != null && var8.field5774 != null) {
                this.field810.method1952(var8.field5774, arg6, arg3, arg0, arg4);
            }
        } else if (arg5 instanceof class70) {
            class70 var9 = (class70) arg5;
            if (this.field810 != null && var9.field810 != null) {
                this.field810.method1952(var9.field810, arg6, arg3, arg0, arg4);
            }
        }
        ++field790;
        if (arg2 != -4) {
            this.method158((class167) null, (byte) 88);
        }
    }
}
