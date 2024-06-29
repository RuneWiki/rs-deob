import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class92 extends class19 {

    @OriginalMember(owner = "client!nb", name = "Sc", descriptor = "I")
    public int field2119 = 0;

    @OriginalMember(owner = "client!nb", name = "Pc", descriptor = "I")
    public int field2116 = 0;

    @OriginalMember(owner = "client!nb", name = "hd", descriptor = "I")
    public int field2134 = 0;

    @OriginalMember(owner = "client!nb", name = "nd", descriptor = "I")
    public int field2140 = -1;

    @OriginalMember(owner = "client!nb", name = "id", descriptor = "I")
    public int field2135 = 0;

    @OriginalMember(owner = "client!nb", name = "qd", descriptor = "I")
    public int field2143 = -1;

    @OriginalMember(owner = "client!nb", name = "jd", descriptor = "I")
    public int field2136 = 0;

    @OriginalMember(owner = "client!nb", name = "ud", descriptor = "Z")
    public boolean field2147 = false;

    @OriginalMember(owner = "client!nb", name = "Wc", descriptor = "Laf;")
    public static class7 field2123 = class48.method406(40, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!nb", name = "fd", descriptor = "Laf;")
    public static class7 field2132 = null;

    @OriginalMember(owner = "client!nb", name = "ad", descriptor = "Laf;")
    public static class7 field2127 = class48.method406(40, "mapdots");

    @OriginalMember(owner = "client!nb", name = "kd", descriptor = "Laf;")
    public static class7 field2137 = class48.method406(40, "_");

    @OriginalMember(owner = "client!nb", name = "Qc", descriptor = "Laf;")
    public static class7 field2117 = class48.method406(40, "Schlie-8en");

    @OriginalMember(owner = "client!nb", name = "od", descriptor = "I")
    public static volatile int field2141 = 0;

    @OriginalMember(owner = "client!nb", name = "gd", descriptor = "I")
    public static int field2133 = 20;

    @OriginalMember(owner = "client!nb", name = "Vc", descriptor = "I")
    public static int field2122 = 0;

    @OriginalMember(owner = "client!nb", name = "td", descriptor = "Laf;")
    private static class7 field2146 = class48.method406(40, "Login limit exceeded)3");

    @OriginalMember(owner = "client!nb", name = "vd", descriptor = "Laf;")
    public static class7 field2148 = class48.method406(40, "<img=1>");

    @OriginalMember(owner = "client!nb", name = "Zc", descriptor = "Laf;")
    public static class7 field2126 = field2146;

    @OriginalMember(owner = "client!nb", name = "Nc", descriptor = "I")
    public int field2114;

    @OriginalMember(owner = "client!nb", name = "Oc", descriptor = "I")
    public int field2115;

    @OriginalMember(owner = "client!nb", name = "Tc", descriptor = "I")
    public int field2120;

    @OriginalMember(owner = "client!nb", name = "Xc", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!nb", name = "bd", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!nb", name = "cd", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!nb", name = "dd", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!nb", name = "ed", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!nb", name = "ld", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!nb", name = "md", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!nb", name = "pd", descriptor = "I")
    public int field2142;

    @OriginalMember(owner = "client!nb", name = "rd", descriptor = "I")
    public int field2144;

    @OriginalMember(owner = "client!nb", name = "sd", descriptor = "I")
    public int field2145;

    @OriginalMember(owner = "client!nb", name = "wd", descriptor = "I")
    public int field2149;

    @OriginalMember(owner = "client!nb", name = "Rc", descriptor = "Ltd;")
    public class136 field2118;

    @OriginalMember(owner = "client!nb", name = "Yc", descriptor = "Leb;")
    public class31 field2125;

    @OriginalMember(owner = "client!nb", name = "Uc", descriptor = "Laf;")
    public class7 field2121;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "(I)V")
    public static void method740(int arg0) {
        field2148 = null;
        field2123 = null;
        field2126 = null;
        field2137 = null;
        field2146 = null;
        field2117 = null;
        field2132 = null;
        if (arg0 == -1537) {
            field2127 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZBZZI)Lr;")
    public static final class118 method741(boolean arg0, byte arg1, boolean arg2, boolean arg3, int arg4) {
        if (arg1 > -51) {
            return null;
        } else {
            ++field2128;
            class126 var5 = null;
            if (class49.field1178 != null) {
                var5 = new class126(arg4, class49.field1178, class2.field20[arg4], 1000000);
            }
            return new class118(var5, class139.field3287, arg4, arg3, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLrd;)V")
    public final void method742(byte arg0, class122 arg1) {
        arg1.field2903 = 0;
        int var3 = arg1.method931((byte) 124);
        ++field2124;
        this.field2140 = arg1.method977(true);
        this.field2143 = arg1.method977(true);
        if (arg0 == 31) {
            int var4 = -1;
            this.field2134 = 0;
            int[] var5 = new int[12];
            for (int var6 = 0; var6 < 12; ++var6) {
                int var7 = arg1.method931((byte) 124);
                if (~var7 == -1) {
                    var5[var6] = 0;
                } else {
                    int var8 = arg1.method931((byte) 124);
                    var5[var6] = (var7 << 8) + var8;
                    if (~var6 == -1 && var5[0] == 65535) {
                        var4 = arg1.method965(false);
                        break;
                    }
                    if (~var5[var6] <= -513) {
                        int var12 = class64.method526(false, var5[var6] + -512).field3192;
                        if (~var12 != -1) {
                            this.field2134 = var12;
                        }
                    }
                }
            }
            int[] var9 = new int[5];
            for (int var10 = 0; ~var10 > -6; ++var10) {
                int var11 = arg1.method931((byte) 124);
                if (var11 < 0 || ~var11 <= ~class4.field58[var10].length) {
                    var11 = 0;
                }
                var9[var10] = var11;
            }
            super.field460 = arg1.method965(false);
            if (super.field460 == 65535) {
                super.field460 = -1;
            }
            super.field459 = arg1.method965(false);
            if (super.field459 == 65535) {
                super.field459 = -1;
            }
            super.field472 = super.field459;
            super.field454 = arg1.method965(false);
            if (super.field454 == 65535) {
                super.field454 = -1;
            }
            super.field490 = arg1.method965(false);
            if (super.field490 == 65535) {
                super.field490 = -1;
            }
            super.field465 = arg1.method965(false);
            if (~super.field465 == -65536) {
                super.field465 = -1;
            }
            super.field447 = arg1.method965(false);
            if (super.field447 == 65535) {
                super.field447 = -1;
            }
            super.field442 = arg1.method965(false);
            if (super.field442 == 65535) {
                super.field442 = -1;
            }
            this.field2121 = class86.method708(arg0 ^ -76, arg1.method946(-85)).method96(arg0 ^ 94);
            this.field2135 = arg1.method931((byte) 124);
            this.field2136 = arg1.method965(false);
            if (this.field2118 == null) {
                this.field2118 = new class136();
            }
            this.field2118.method1123(var5, 1, var3 == 1, var9, var4);
        }
    }

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)Z")
    public final boolean method186(int arg0) {
        ++field2130;
        if (this.field2118 == null) {
            return false;
        } else {
            if (arg0 >= -125) {
                this.method186(109);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZLrd;I)Laf;")
    public static final class7 method743(boolean arg0, class122 arg1, int arg2) {
        ++field2131;
        try {
            if (!arg0) {
                method743(false, (class122) null, -122);
            }
            class7 var3 = new class7();
            var3.field139 = arg1.method934(-125);
            if (arg2 < var3.field139) {
                var3.field139 = arg2;
            }
            var3.field162 = new byte[var3.field139];
            arg1.field2903 += class10.field278.method21(0, var3.field162, var3.field139, -16394, arg1.field2903, arg1.field2895);
            return var3;
        } catch (Exception var4) {
            return class121.field2849;
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)Leb;")
    public final class31 method190(int arg0) {
        ++field2138;
        if (this.field2118 == null) {
            return null;
        } else {
            class93 var2 = super.field478 != -1 && ~super.field457 == -1 ? class87.method710(super.field478, 6491) : null;
            class93 var3 = super.field502 == -1 || this.field2147 || super.field502 == super.field460 && var2 != null ? null : class87.method710(super.field502, 6491);
            if (arg0 != 1) {
                this.method190(18);
            }
            class31 var4 = this.field2118.method1120(super.field489, 7, super.field487, var3, var2);
            if (var4 == null) {
                return null;
            } else {
                var4.method262();
                super.field504 = var4.field2386;
                if (!this.field2147 && ~super.field469 != 0 && super.field475 != -1) {
                    class31 var5 = class94.method764(super.field469, -21565).method241(112, super.field475);
                    if (var5 != null) {
                        class31[] var6 = new class31[] { var4, var5 };
                        var5.method282(0, -super.field448, 0);
                        var4 = new class31(var6, 2);
                    }
                }
                if (!this.field2147 && this.field2125 != null) {
                    if (~class155.field3611 <= ~this.field2119) {
                        this.field2125 = null;
                    }
                    if (~this.field2116 >= ~class155.field3611 && this.field2119 > class155.field3611) {
                        class31 var7 = this.field2125;
                        class31[] var8 = new class31[] { var4, var7 };
                        var7.method282(-super.field505 + this.field2144, this.field2142 - this.field2115, -super.field491 + this.field2145);
                        if (~super.field492 != -513) {
                            if (~super.field492 != -1025) {
                                if (~super.field492 == -1537) {
                                    var7.method260();
                                }
                            } else {
                                var7.method260();
                                var7.method260();
                            }
                        } else {
                            var7.method260();
                            var7.method260();
                            var7.method260();
                        }
                        var4 = new class31(var8, 2);
                        if (~super.field492 == -513) {
                            var7.method260();
                        } else if (super.field492 == 1024) {
                            var7.method260();
                            var7.method260();
                        } else if (~super.field492 == -1537) {
                            var7.method260();
                            var7.method260();
                            var7.method260();
                        }
                        var7.method282(-this.field2144 + super.field505, -this.field2142 + this.field2115, -this.field2145 + super.field491);
                    }
                }
                var4.field799 = true;
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "(I)V")
    public static final void method744(int arg0) {
        ++field2129;
        if (class82.field1882 != null) {
            class113 var1 = class82.field1882;
            synchronized (class82.field1882) {
                class82.field1882 = null;
            }
        }
        if (arg0 != -28034) {
            method741(false, (byte) -3, false, false, 109);
        }
    }
}
