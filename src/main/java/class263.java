import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class263 extends class373 implements class237 {

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "Z")
    private boolean field3707 = false;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "Lvw;")
    public class322 field3691;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "Z")
    private boolean field3695;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!qa", name = "cb", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!qa", name = "db", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!qa", name = "eb", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!qa", name = "fb", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!qa", name = "gb", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!qa", name = "hb", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "Ldg;")
    private class435 field3705;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(BLha;)Lhga;", line = 3)
    public final class186 method898(byte arg0, class66 arg1) {
        ++field3689;
        class499 var3 = this.field3691.method2053(arg1, true, 2, false, 2048);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 <= 123) {
                this.field3691 = null;
            }
            class650 var4 = arg1.method533();
            var4.method1868(super.field7396, super.field7405, super.field7398);
            class186 var5 = class174.method1320(1, this.field3695, 17832);
            int var6 = super.field7396 >> 9;
            int var7 = super.field7398 >> 9;
            this.field3691.method2043(var6, arg1, var3, var4, true, var7, var7, var6, true);
            if (!class507.field6967) {
                var3.method301(var4, var5.field2877[0], 0);
            } else {
                var3.method310(var4, var5.field2877[0], class90.field1369, 0);
            }
            if (this.field3691.field4381 != null) {
                class442 var8 = this.field3691.field4381.method4299();
                if (!class507.field6967) {
                    arg1.method478(var8);
                } else {
                    arg1.method474(var8, class90.field1369);
                }
            }
            this.field3707 = var3.method327() || this.field3691.field4381 != null;
            if (this.field3705 == null) {
                this.field3705 = class538.method3042(super.field7398, super.field7396, (byte) -47, var3, super.field7405);
            } else {
                class651.method3647(-31546, super.field7396, super.field7398, var3, this.field3705, super.field7405);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "(I)Z", line = 55)
    public final boolean method902(int arg0) {
        ++field3699;
        return arg0 != 0 ? false : false;
    }

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "(I)I", line = 66)
    public static final int method1718(int arg0) {
        ++field3692;
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        if (class630.field8751.field10241 && !class630.field8751.field10253) {
            var1 = true;
            if (~class682.field9503.field9139 > -513 && class682.field9503.field9139 != 0) {
                var1 = false;
            }
            if (class742.field10234.startsWith("win")) {
                var2 = true;
                var3 = true;
            } else {
                var2 = true;
            }
        }
        if (arg0 != -24290) {
            return 80;
        } else {
            if (class776.field10710) {
                var1 = false;
            }
            if (class500.field6846) {
                var2 = false;
            }
            if (class382.field5195) {
                var3 = false;
            }
            if (!var1 && !var2 && !var3) {
                return class3.method19((byte) -117);
            } else {
                int var4 = -1;
                int var5 = -1;
                int var6 = -1;
                if (var1) {
                    try {
                        var4 = class591.method3384(2, 1000, 7762);
                    } catch (Exception var15) {
                    }
                }
                if (var3) {
                    try {
                        var6 = class591.method3384(3, 1000, 7762);
                        if (~class111.field1911.field6725.method3784((byte) 108) == -4) {
                            class100 var7 = class95.field1472.method586();
                            long var8 = 281474976710655L & var7.field1619;
                            int var10 = var7.field1620;
                            if (var10 != 4318) {
                                if (var10 == 4098) {
                                    var2 &= ~var8 <= -60129613780L;
                                }
                            } else {
                                var2 &= ~var8 <= -64425238955L;
                            }
                        }
                    } catch (Exception var14) {
                    }
                }
                if (var2) {
                    try {
                        var5 = class591.method3384(1, 1000, 7762);
                    } catch (Exception var13) {
                    }
                }
                if (var4 == -1 && ~var5 == 0 && var6 == -1) {
                    return class3.method19((byte) -112);
                } else {
                    int var11 = (int) ((float) var5 * 1.1F);
                    int var12 = (int) ((float) var6 * 1.1F);
                    if (~var4 < ~var12 && ~var11 > ~var4) {
                        return class789.method4309(var4, -16602);
                    } else {
                        return ~var12 < ~var11 ? class678.method3820(var12, -77, 3) : class678.method3820(var11, -102, 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(I)Z", line = 238)
    public final boolean method904(int arg0) {
        if (arg0 != 0) {
            this.field3691 = null;
        }
        ++field3710;
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILdja;)V", line = 251)
    public final void method1719(int arg0, class326 arg1) {
        ++field3696;
        if (arg0 != 3) {
            this.field3691 = null;
        }
        this.field3691.method2045(-1, arg1);
    }

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)I", line = 263)
    public final int method900(int arg0) {
        if (arg0 != 0) {
            this.method1039((class66) null, -37);
        }
        ++field3708;
        return this.field3691.method2049(3162);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)Z", line = 277)
    public final boolean method910(boolean arg0) {
        if (arg0) {
            this.field3705 = null;
        }
        ++field3709;
        return this.field3707;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lha;I)V", line = 289)
    public final void method1039(class66 arg0, int arg1) {
        ++field3697;
        this.field3691.method2044((byte) -126, arg0);
        if (arg1 < 81) {
            this.method1037(45);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLha;)V", line = 300)
    public final void method901(byte arg0, class66 arg1) {
        ++field3702;
        class499 var3 = this.field3691.method2053(arg1, true, 2, true, 262144);
        if (var3 != null) {
            int var4 = super.field7396 >> 9;
            int var5 = super.field7398 >> 9;
            class650 var6 = arg1.method533();
            var6.method1868(super.field7396, super.field7405, super.field7398);
            this.field3691.method2043(var4, arg1, var3, var6, false, var5, var5, var4, true);
        }
        if (arg0 <= 114) {
            this.field3695 = false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lha;Lcn;IIBZI)V", line = 325)
    public final void method903(class66 arg0, class543 arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        ++field3703;
        if (arg4 > 41) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Z", line = 337)
    public static final boolean method1720(int arg0, int arg1) {
        if (arg1 != 0) {
            return false;
        } else {
            ++field3713;
            return arg0 == 7 || arg0 == 8 || arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)I", line = 349)
    public final int method1032(boolean arg0) {
        ++field3688;
        if (arg0) {
            this.field3691 = null;
        }
        return this.field3691.field4396;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Z", line = 362)
    public final boolean method1036(byte arg0) {
        if (arg0 >= -44) {
            this.field3705 = null;
        }
        ++field3701;
        return this.field3691.method2051(-106);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V", line = 373)
    public final void method1037(int arg0) {
        ++field3711;
        if (arg0 != -1114) {
            this.field3707 = false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Lha;B)Ldg;", line = 383)
    public final class435 method894(class66 arg0, byte arg1) {
        ++field3690;
        if (arg1 > -38) {
            this.method902(-44);
        }
        return this.field3705;
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)I", line = 397)
    public final int method907(int arg0) {
        if (arg0 != -20425) {
            this.method910(true);
        }
        ++field3698;
        return this.field3691.method2048(true);
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lha;Lij;IIIIIZIII)V", line = 408)
    public class263(class66 arg0, class445 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class72.method635(arg8, (byte) -58, arg9));
        this.field3691 = new class322(arg0, arg1, arg8, arg9, super.field7391, arg3, this, arg7, arg10);
        this.field3695 = arg1.field6050 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)I", line = 417)
    public final int method1034(int arg0) {
        ++field3694;
        if (arg0 > -125) {
            this.method907(-47);
        }
        return this.field3691.field4397;
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V", line = 436)
    public final void method905(int arg0) {
        ++field3706;
        if (arg0 != -16665) {
            this.field3691 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lha;B)V", line = 450)
    public final void method1040(class66 arg0, byte arg1) {
        if (arg1 != 55) {
            this.method910(false);
        }
        this.field3691.method2046(arg0, (byte) -88);
        ++field3700;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(III)Z", line = 461)
    public static final boolean method1721(int arg0, int arg1, int arg2) {
        ++field3704;
        if (arg1 != 9) {
            return false;
        } else {
            return (arg2 & 2048) != 0;
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)I", line = 474)
    public final int method1033(int arg0) {
        ++field3693;
        return arg0 >= -12 ? 73 : this.field3691.field4418;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lha;III)Z", line = 485)
    public final boolean method908(class66 arg0, int arg1, int arg2, int arg3) {
        ++field3712;
        class499 var5 = this.field3691.method2053(arg0, false, 2, false, arg2);
        if (var5 == null) {
            return false;
        } else {
            class650 var6 = arg0.method533();
            var6.method1868(super.field7396, super.field7405, super.field7398);
            return !class507.field6967 ? var5.method290(arg1, arg3, var6, false, 0) : var5.method286(arg1, arg3, var6, false, 0, class90.field1369);
        }
    }
}
