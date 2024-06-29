import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class77 extends class396 {

    @OriginalMember(owner = "client!qm", name = "Jc", descriptor = "Z")
    public static boolean field906 = false;

    @OriginalMember(owner = "client!qm", name = "Oc", descriptor = "Lse;")
    public static class138 field911 = new class138(16);

    @OriginalMember(owner = "client!qm", name = "Dc", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!qm", name = "Ec", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!qm", name = "Fc", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!qm", name = "Gc", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!qm", name = "Hc", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!qm", name = "Ic", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!qm", name = "Kc", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!qm", name = "Lc", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!qm", name = "Mc", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!qm", name = "Nc", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!qm", name = "Qc", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!qm", name = "Rc", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!qm", name = "Sc", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!qm", name = "Tc", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!qm", name = "Uc", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!qm", name = "Vc", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!qm", name = "Pc", descriptor = "Lsr;")
    public class135 field912;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "(I)I")
    public final int method61(int arg0) {
        if (arg0 != 131910471) {
            method425(false);
        }
        ++field900;
        return super.field5628;
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(Z)V")
    public static void method425(boolean arg0) {
        field911 = null;
        if (!arg0) {
            field918 = 36;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lae;B)V")
    public final void method64(class134 arg0, byte arg1) {
        if (arg1 >= -50) {
            field911 = null;
        }
        ++field907;
        if (this.field912 != null) {
            if (super.field5675 || this.method427((byte) -101, 0, arg0)) {
                this.method2531(super.field5675, super.field5671, arg0, -43);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)Z")
    public final boolean method54(boolean arg0) {
        if (!arg0) {
            this.method60(true, (byte) 50, 32, 106, (class29) null, 45, (class134) null);
        }
        ++field910;
        return false;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)I")
    public final int method245(int arg0) {
        ++field917;
        if (arg0 != -1) {
            this.method430((byte) -72);
        }
        if (this.field912.field1655 != null) {
            class135 var2 = this.field912.method836((byte) 120);
            if (var2 != null && var2.field1657 != -1) {
                return var2.field1657;
            }
        }
        return this.field912.field1657;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)I")
    public final int method426(byte arg0) {
        ++field903;
        if (this.field912.field1655 != null) {
            class135 var2 = this.field912.method836((byte) -34);
            if (var2 != null && ~var2.field1665 != 0) {
                return var2.field1665;
            }
        }
        int var3 = 57 / ((-29 - arg0) / 51);
        return this.field912.field1665 == -1 ? super.method426((byte) -98) : this.field912.field1665;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZBIILna;ILae;)V")
    public final void method60(boolean arg0, byte arg1, int arg2, int arg3, class29 arg4, int arg5, class134 arg6) {
        ++field913;
        int var8 = -87 / ((arg1 - -16) / 62);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BILae;)Z")
    private final boolean method427(byte arg0, int arg1, class134 arg2) {
        ++field914;
        int var4 = arg1;
        class306 var5 = this.method2526(4);
        class412 var6 = ~super.field5612 != 0 && ~super.field5638 == -1 ? class189.method1288(-8192, super.field5612) : null;
        class412 var7 = super.field5640 == -1 || super.field5613 && var6 != null ? null : class189.method1288(-8192, super.field5640);
        int var8 = var5.field4310;
        int var9 = var5.field4299;
        if (~var8 != -1 || ~var9 != -1 || ~var5.field4301 != -1 || var5.field4337 != 0) {
            arg1 |= 7;
        }
        class210 var10 = super.field5671[0] = this.field912.method839(super.field5623, super.field5609, super.field5634, arg1, var7, arg2, super.field5630, super.field5591, var6, super.field5596, 1663604207, super.field5643);
        if (var10 == null) {
            return false;
        } else {
            super.field5628 = var10.method1405();
            this.method2529((byte) -119, var10);
            int var11 = super.field5602.method2177((byte) -121);
            super.field5589 = 0;
            super.field5598 = 0;
            super.field5601 = 0;
            if (var8 == 0 && var9 == 0) {
                this.method2521(this.method242(-30129) << 7, (byte) -33, this.method242(-30129) << 7, var11);
            } else {
                this.method2521(var9, (byte) -33, var8, var11);
                if (~super.field5601 != -1) {
                    super.field5671[0].method1403(super.field5601);
                }
                if (super.field5598 != 0) {
                    super.field5671[0].method1407(super.field5598);
                }
                if (super.field5589 != 0) {
                    super.field5671[0].method1388(0, super.field5589, 0);
                }
            }
            super.field5671[1] = null;
            if (arg0 > -97) {
                field906 = false;
            }
            if (~super.field5611 != 0 && ~super.field5649 != 0) {
                class97 var12 = class434.method2721(super.field5611, 4096);
                class210 var13 = var12.method535(var4 | (var12.field1154 ? 7 : 2), arg2, super.field5649, (byte) -32, super.field5593, super.field5606);
                if (var13 != null) {
                    var13.method1388(0, -super.field5605, 0);
                    if (var12.field1154 && (~var8 != -1 || var9 != 0)) {
                        if (super.field5601 != 0) {
                            var13.method1403(super.field5601);
                        }
                        if (super.field5598 != 0) {
                            var13.method1407(super.field5598);
                        }
                        if (super.field5589 != 0) {
                            var13.method1388(0, super.field5589, 0);
                        }
                    }
                    super.field5671[1] = var13;
                }
            }
            super.field5671[2] = null;
            if (super.field5658 != null) {
                if (super.field5669 <= class189.field2726) {
                    super.field5658 = null;
                }
                if (class189.field2726 >= super.field5662 && super.field5669 > class189.field2726) {
                    class210 var14 = super.field5658.method70(arg2, true, var4 | 7);
                    if (var14 != null) {
                        var14.method1388(-super.field3284 + super.field5661, super.field5673 - super.field3287, -super.field3269 + super.field5659);
                        if (var11 != 0) {
                            var14.method1413(var11);
                        }
                        super.field5671[2] = var14;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLae;)Ljg;")
    public final class186 method52(byte arg0, class134 arg1) {
        ++field904;
        if (this.field912 != null && this.method427((byte) -124, 1024, arg1)) {
            if (arg0 != -120) {
                field911 = null;
            }
            class18 var3 = arg1.method649();
            int var4 = super.field5602.method2177((byte) -121);
            var3.method123(var4);
            var3.method125(super.field3284, super.field3287, super.field3269);
            class306 var5 = this.method2526(4);
            class135 var6 = this.field912.field1655 != null ? this.field912.method836((byte) -74) : this.field912;
            if (class33.field381 && var6.field1684 && var5.field4329) {
                class412 var7 = ~super.field5612 != 0 && super.field5638 == 0 ? class189.method1288(-8192, super.field5612) : null;
                class412 var8 = ~super.field5640 == 0 || super.field5613 && var7 != null ? null : class189.method1288(-8192, super.field5640);
                class210 var9 = class249.method1696(65535 & this.field912.field1675, arg1, var4, 255 & this.field912.field1634, super.field5671[0], super.field5598, var8 != null ? super.field5643 : super.field5591, 65535 & this.field912.field1677, 0, 255 & this.field912.field1644, super.field5583, var8 != null ? var8 : var7, super.field5601, super.field5589, this.field912.field1697);
                if (var9 != null) {
                    float var10 = arg1.method674();
                    float var11 = arg1.method662();
                    arg1.method617(false);
                    arg1.method691(var10, var11 + -150.0F);
                    var9.method1416(var3, (class136) null, 0);
                    arg1.method691(var10, var11);
                    arg1.method617(true);
                }
            }
            class186 var12 = null;
            if (this.method430((byte) 100)) {
                var12 = class348.method2229(super.field5671.length, 21534);
            }
            if (super.field5665 != null) {
                class63 var13 = super.field5665.method1371();
                arg1.method642(super.field5671, var13, var3, var12 == null ? null : var12.field2704, 0);
            } else {
                arg1.method682(super.field5671, var3, var12 != null ? var12.field2704 : null, 0);
            }
            this.method2531(false, super.field5671, arg1, -86);
            if (super.field5671[2] != null) {
                if (var4 != 0) {
                    super.field5671[2].method1413(var4);
                }
                super.field5671[2].method1388(super.field3284 - super.field5661, super.field3287 - super.field5673, super.field3269 - super.field5659);
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)I")
    public final int method248(int arg0) {
        ++field905;
        if (this.field912.field1655 != null) {
            class135 var2 = this.field912.method836((byte) -87);
            if (var2 != null && var2.field1628 != -1) {
                return var2.field1628;
            }
        }
        if (arg0 != -1) {
            field918 = -112;
        }
        return this.field912.field1628;
    }

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "(I)Z")
    public final boolean method428(int arg0) {
        ++field901;
        if (this.field912 == null) {
            return false;
        } else {
            if (arg0 != -27076) {
                field906 = false;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBI)V")
    public final void method429(int arg0, byte arg1, int arg2) {
        ++field916;
        int var4 = super.field5677[0];
        int var5 = super.field5664[0];
        if (~arg0 == -1) {
            ++var5;
        }
        if (arg0 == 1) {
            ++var5;
            ++var4;
        }
        if (arg0 == 2) {
            ++var4;
        }
        if (arg0 == 3) {
            --var5;
            ++var4;
        }
        if (~arg0 == -5) {
            --var5;
        }
        if (~arg0 == -6) {
            --var5;
            --var4;
        }
        if (arg0 == 6) {
            --var4;
        }
        if (arg0 == 7) {
            --var4;
            ++var5;
        }
        if (arg1 != -17) {
            field918 = 116;
        }
        if (super.field5612 != -1 && class189.method1288(-8192, super.field5612).field5920 == 1) {
            super.field5612 = -1;
        }
        if (~super.field5611 != 0) {
            class97 var6 = class434.method2721(super.field5611, 4096);
            if (var6.field1158 && var6.field1166 != -1 && ~class189.method1288(-8192, var6.field1166).field5920 == -2) {
                super.field5611 = -1;
            }
        }
        if (super.field5674 < 9) {
            ++super.field5674;
        }
        for (int var7 = super.field5674; ~var7 < -1; --var7) {
            super.field5677[var7] = super.field5677[var7 + -1];
            super.field5664[var7] = super.field5664[var7 + -1];
            super.field5668[var7] = super.field5668[var7 + -1];
        }
        super.field5677[0] = var4;
        super.field5668[0] = (byte) arg2;
        super.field5664[0] = var5;
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(B)Z")
    private final boolean method430(byte arg0) {
        if (arg0 < 16) {
            this.method52((byte) 39, (class134) null);
        }
        ++field915;
        return this.field912.field1664;
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)V")
    public final void method51(int arg0) {
        if (arg0 != 6) {
            this.method430((byte) 65);
        }
        ++field908;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILae;II)Z")
    public final boolean method56(int arg0, class134 arg1, int arg2, int arg3) {
        ++field909;
        if (this.field912 != null && this.method427((byte) -101, 65536, arg1)) {
            class18 var5 = arg1.method649();
            int var6 = super.field5602.method2177((byte) -127);
            var5.method123(var6);
            var5.method125(super.field3284, super.field3287, super.field3269);
            for (int var7 = 0; var7 < super.field5671.length; ++var7) {
                if (super.field5671[var7] != null && super.field5671[var7].method1382(arg0, arg3, var5, this.field912.field1697 == 1)) {
                    return true;
                }
            }
            if (arg2 != 4835) {
                this.method248(-48);
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lsr;I)V")
    public final void method431(class135 arg0, int arg1) {
        this.field912 = arg0;
        ++field902;
        if (arg1 < 84) {
            this.method52((byte) 47, (class134) null);
        }
        if (super.field5665 != null) {
            super.field5665.method1364();
        }
    }
}
