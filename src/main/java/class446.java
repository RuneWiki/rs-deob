import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class446 extends class311 {

    @OriginalMember(owner = "client!pn", name = "Qc", descriptor = "Lub;")
    public static class15 field6372 = new class15(50);

    @OriginalMember(owner = "client!pn", name = "Xc", descriptor = "I")
    public static int field6379 = 0;

    @OriginalMember(owner = "client!pn", name = "Dc", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!pn", name = "Ec", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!pn", name = "Fc", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!pn", name = "Gc", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!pn", name = "Hc", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!pn", name = "Ic", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!pn", name = "Jc", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!pn", name = "Kc", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!pn", name = "Lc", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!pn", name = "Mc", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!pn", name = "Nc", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!pn", name = "Oc", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!pn", name = "Pc", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!pn", name = "Rc", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!pn", name = "Sc", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!pn", name = "Uc", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!pn", name = "Vc", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!pn", name = "Wc", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!pn", name = "Yc", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!pn", name = "Tc", descriptor = "Lnf;")
    public class346 field6375;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "(B)V")
    public static final void method2777(byte arg0) {
        ++field6370;
        class352.field5114.method2047((byte) -106);
        int var1 = class352.field5114.method2053((byte) 0, 8);
        if (var1 < class229.field3396) {
            for (int var2 = var1; ~var2 > ~class229.field3396; ++var2) {
                class232.field3434[class190.field2731++] = class431.field6169[var2];
            }
        }
        if (class229.field3396 < var1) {
            throw new RuntimeException("gnpov1");
        } else {
            class229.field3396 = 0;
            if (arg0 != 83) {
                field6379 = -86;
            }
            for (int var3 = 0; ~var1 < ~var3; ++var3) {
                int var4 = class431.field6169[var3];
                class446 var5 = class442.field6317[var4];
                int var6 = class352.field5114.method2053((byte) 0, 1);
                if (var6 == 0) {
                    class431.field6169[class229.field3396++] = var4;
                    var5.field4542 = class34.field434;
                } else {
                    int var7 = class352.field5114.method2053((byte) 0, 2);
                    if (~var7 == -1) {
                        class431.field6169[class229.field3396++] = var4;
                        var5.field4542 = class34.field434;
                        class314.field4623[class349.field5084++] = var4;
                    } else if (~var7 == -2) {
                        class431.field6169[class229.field3396++] = var4;
                        var5.field4542 = class34.field434;
                        int var8 = class352.field5114.method2053((byte) 0, 3);
                        var5.method2778(arg0 + -18330, 1, var8);
                        int var9 = class352.field5114.method2053((byte) 0, 1);
                        if (var9 == 1) {
                            class314.field4623[class349.field5084++] = var4;
                        }
                    } else if (var7 == 2) {
                        class431.field6169[class229.field3396++] = var4;
                        var5.field4542 = class34.field434;
                        if (class352.field5114.method2053((byte) 0, 1) != 1) {
                            int var10 = class352.field5114.method2053((byte) 0, 3);
                            var5.method2778(-18247, 0, var10);
                        } else {
                            int var11 = class352.field5114.method2053((byte) 0, 3);
                            var5.method2778(-18247, 2, var11);
                            int var12 = class352.field5114.method2053((byte) 0, 3);
                            var5.method2778(-18247, 2, var12);
                        }
                        int var13 = class352.field5114.method2053((byte) 0, 1);
                        if (~var13 == -2) {
                            class314.field4623[class349.field5084++] = var4;
                        }
                    } else if (var7 == 3) {
                        class232.field3434[class190.field2731++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V")
    private final void method2778(int arg0, int arg1, int arg2) {
        ++field6368;
        int var4 = super.field4595[0];
        int var5 = super.field4601[0];
        if (~arg2 == -1) {
            ++var5;
        }
        if (arg2 == 1) {
            ++var4;
            ++var5;
        }
        if (~arg2 == -3) {
            ++var4;
        }
        if (arg2 == 3) {
            --var5;
            ++var4;
        }
        if (~arg2 == -5) {
            --var5;
        }
        if (~arg2 == -6) {
            --var5;
            --var4;
        }
        if (~arg2 == -7) {
            --var4;
        }
        if (~arg2 == -8) {
            ++var5;
            --var4;
        }
        if (arg0 != -18247) {
            method2779(-103);
        }
        if (super.field4558 != -1 && ~class110.method671(-21965, super.field4558).field2597 == -2) {
            super.field4558 = -1;
        }
        if (~super.field4578 != 0) {
            class135 var6 = class209.method1486(super.field4578, 11);
            if (var6.field2068 && ~var6.field2078 != 0 && ~class110.method671(-21965, var6.field2078).field2597 == -2) {
                super.field4578 = -1;
            }
        }
        if (super.field4599 < 9) {
            ++super.field4599;
        }
        for (int var7 = super.field4599; ~var7 < -1; --var7) {
            super.field4595[var7] = super.field4595[var7 + -1];
            super.field4601[var7] = super.field4601[var7 + -1];
            super.field4606[var7] = super.field4606[var7 + -1];
        }
        super.field4595[0] = var4;
        super.field4601[0] = var5;
        super.field4606[0] = (byte) arg1;
    }

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "(B)I")
    public final int method778(byte arg0) {
        if (arg0 <= 81) {
            this.method2778(-46, 53, -54);
        }
        ++field6378;
        if (this.field6375.field5023 != null) {
            class346 var2 = this.field6375.method2273(-1);
            if (var2 != null && ~var2.field5031 != 0) {
                return var2.field5031;
            }
        }
        return this.field6375.field5031;
    }

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "(B)I")
    public final int method2090(byte arg0) {
        if (arg0 != -71) {
            this.field6375 = null;
        }
        ++field6363;
        if (this.field6375.field5023 != null) {
            class346 var2 = this.field6375.method2273(-1);
            if (var2 != null && ~var2.field4984 != 0) {
                return var2.field4984;
            }
        }
        return this.field6375.field4984 == -1 ? super.method2090((byte) -71) : this.field6375.field4984;
    }

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "(I)V")
    public static void method2779(int arg0) {
        field6372 = null;
        if (arg0 != -13327) {
            method2783(-121, -13, -42);
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)I")
    public static final int method2780(int arg0, int arg1) {
        ++field6366;
        if (arg1 != -1071689049) {
            field6379 = 100;
        }
        return arg0 & 255;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)I")
    public final int method787(byte arg0) {
        ++field6373;
        if (arg0 != 43) {
            return -104;
        } else {
            if (this.field6375.field5023 != null) {
                class346 var2 = this.field6375.method2273(-1);
                if (var2 != null && ~var2.field5002 != 0) {
                    return var2.field5002;
                }
            }
            return this.field6375.field5002;
        }
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)Z")
    public final boolean method610(int arg0) {
        ++field6371;
        if (arg0 != -439) {
            this.method2090((byte) -63);
        }
        return false;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lnf;B)V")
    public final void method2781(class346 arg0, byte arg1) {
        this.field6375 = arg0;
        ++field6362;
        if (super.field4590 != null) {
            super.field4590.method2153();
        }
        if (arg1 <= 96) {
            field6372 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lvq;B)V")
    public final void method22(class269 arg0, byte arg1) {
        ++field6360;
        if (arg1 < 11) {
            field6379 = -107;
        }
        if (this.field6375 != null) {
            if (super.field4596 || this.method2786(0, 0, arg0)) {
                this.method2085(false, super.field4597, super.field4596, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "(I)Z")
    public final boolean method2782(int arg0) {
        ++field6367;
        if (this.field6375 == null) {
            return false;
        } else {
            if (arg0 != 150) {
                this.method611((class269) null, true, (class198) null, -22, -102, (byte) -105, 15);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lvq;ZLkm;IIBI)V")
    public final void method611(class269 arg0, boolean arg1, class198 arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field6376;
        int var8 = -103 % ((12 - arg5) / 40);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLvq;)Lbf;")
    public final class316 method15(byte arg0, class269 arg1) {
        ++field6374;
        if (this.field6375 != null && this.method2786(0, 1024, arg1)) {
            class154 var3 = arg1.method884();
            int var4 = super.field4570.method2426(-125);
            var3.method1136(var4);
            var3.method1134(super.field4463, super.field4457, super.field4466);
            class3 var5 = this.method2093(-1498200479);
            class346 var6 = this.field6375.field5023 == null ? this.field6375 : this.field6375.method2273(-1);
            if (class79.field1027 && var6.field4983 && var5.field55) {
                class183 var7 = super.field4558 != -1 && super.field4535 == 0 ? class110.method671(-21965, super.field4558) : null;
                class183 var8 = ~super.field4537 == 0 || super.field4513 && var7 != null ? null : class110.method671(-21965, super.field4537);
                class305 var9 = class135.method1039(arg1, 255 & this.field6375.field5039, this.field6375.field5008, var8 == null ? super.field4566 : super.field4520, super.field4597[0], 255 & this.field6375.field5036, super.field4550, 65535 & this.field6375.field5018, var4, var8 != null ? var8 : var7, super.field4548, (byte) 78, this.field6375.field5010 & 65535, super.field4551, super.field4554);
                if (var9 != null) {
                    float var10 = arg1.method988();
                    float var11 = arg1.method866();
                    arg1.method874(false);
                    arg1.method956(var10, var11 - 150.0F);
                    var9.method230(var3, (class144) null, 0);
                    arg1.method956(var10, var11);
                    arg1.method874(true);
                }
            }
            int var12 = -2 % ((arg0 - -8) / 51);
            class316 var13 = null;
            if (this.method2784(1)) {
                var13 = class105.method616(-15465, super.field4597.length);
            }
            if (super.field4590 == null) {
                arg1.method917(super.field4597, var3, var13 == null ? null : var13.field4631, 0);
            } else {
                class235 var14 = super.field4590.method2152();
                arg1.method1008(super.field4597, var14, var3, var13 == null ? null : var13.field4631, 0);
            }
            this.method2085(false, super.field4597, false, arg1);
            if (super.field4597[2] != null) {
                if (var4 != 0) {
                    super.field4597[2].method198(var4);
                }
                super.field4597[2].method201(-super.field4605 + super.field4463, -super.field4592 + super.field4457, -super.field4593 + super.field4466);
            }
            return var13;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(III)V")
    public static final void method2783(int arg0, int arg1, int arg2) {
        ++field6365;
        if (arg1 < 28) {
            method2783(-76, 31, -51);
        }
        class169.field2397[arg2] = arg0;
        class312 var3 = (class312) class419.field6014.method1373((long) arg2, -52);
        if (var3 != null) {
            if (var3.field4612 != 4611686018427387905L) {
                var3.field4612 = 4611686018427387904L | 500L + class18.method107(-16145);
                return;
            }
        } else {
            class312 var4 = new class312(4611686018427387905L);
            class419.field6014.method1376(var4, (long) arg2, 117);
        }
    }

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "(I)Z")
    private final boolean method2784(int arg0) {
        if (arg0 != 1) {
            field6372 = null;
        }
        ++field6380;
        return this.field6375.field5020;
    }

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "(I)I")
    public final int method775(int arg0) {
        ++field6364;
        return arg0 != 3 ? -77 : super.field4543;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIB)V")
    public static final void method2785(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (class245.field3659 <= arg2 && class240.field3547 >= arg2) {
            int var5 = class209.method1485(class231.field3415, arg4 + 1734, class408.field5789, arg3);
            int var6 = class209.method1485(class231.field3415, 1667, class408.field5789, arg1);
            class111.method676(arg0, var5, -1, var6, arg2);
        }
        if (arg4 != -67) {
            method2785(13, 87, -12, -69, (byte) 111);
        }
        ++field6359;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IILvq;)Z")
    private final boolean method2786(int arg0, int arg1, class269 arg2) {
        ++field6369;
        int var4 = arg1;
        class3 var5 = this.method2093(-1498200479);
        class183 var6 = super.field4558 != -1 && super.field4535 == 0 ? class110.method671(-21965, super.field4558) : null;
        class183 var7 = super.field4537 == -1 || super.field4513 && var6 != null ? null : class110.method671(-21965, super.field4537);
        int var8 = var5.field35;
        int var9 = var5.field43;
        if (~var8 != -1 || var9 != 0 || ~var5.field47 != -1 || var5.field16 != 0) {
            arg1 |= 7;
        }
        class305 var10 = super.field4597[0] = this.field6375.method2266(super.field4520, super.field4566, super.field4575, super.field4519, arg1, super.field4506, arg2, super.field4541, super.field4547, (byte) -122, var6, var7);
        if (var10 == null) {
            return false;
        } else {
            super.field4543 = var10.method221();
            this.method2087(false, var10);
            int var11 = super.field4570.method2426(-99);
            super.field4548 = 0;
            super.field4551 = arg0;
            super.field4554 = 0;
            if (~var8 == -1 && ~var9 == -1) {
                this.method2082(-25962, var11, this.method773((byte) 94) << 7, this.method773((byte) 124) << 7);
            } else {
                this.method2082(-25962, var11, var9, var8);
                if (~super.field4554 != -1) {
                    super.field4597[0].method207(super.field4554);
                }
                if (super.field4548 != 0) {
                    super.field4597[0].method197(super.field4548);
                }
                if (~super.field4551 != -1) {
                    super.field4597[0].method201(0, super.field4551, 0);
                }
            }
            super.field4597[1] = null;
            if (super.field4578 != -1 && ~super.field4577 != 0) {
                class135 var12 = class209.method1486(super.field4578, 11);
                class305 var13 = var12.method1041((var12.field2085 ? 7 : 2) | var4, super.field4577, arg2, -121, super.field4552, super.field4586);
                if (var13 != null) {
                    var13.method201(0, -super.field4545, 0);
                    if (var12.field2085 && (var8 != 0 || ~var9 != -1)) {
                        if (~super.field4554 != -1) {
                            var13.method207(super.field4554);
                        }
                        if (super.field4548 != 0) {
                            var13.method197(super.field4548);
                        }
                        if (super.field4551 != 0) {
                            var13.method201(0, super.field4551, 0);
                        }
                    }
                    super.field4597[1] = var13;
                }
            }
            super.field4597[2] = null;
            if (super.field4600 != null) {
                if (class34.field434 >= super.field4598) {
                    super.field4600 = null;
                }
                if (~class34.field434 <= ~super.field4602 && ~class34.field434 > ~super.field4598) {
                    class305 var14 = super.field4600.method614(-76, 7 | var4, arg2);
                    if (var14 != null) {
                        var14.method201(super.field4605 - super.field4463, -super.field4457 + super.field4592, super.field4593 - super.field4466);
                        if (~var11 != -1) {
                            var14.method198(var11);
                        }
                        super.field4597[2] = var14;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lvq;IIB)Z")
    public final boolean method16(class269 arg0, int arg1, int arg2, byte arg3) {
        int var5 = -73 / ((arg3 - 19) / 45);
        ++field6361;
        if (this.field6375 != null && this.method2786(0, 65536, arg0)) {
            class154 var6 = arg0.method884();
            int var7 = super.field4570.method2426(117);
            var6.method1136(var7);
            var6.method1134(super.field4463, super.field4457, super.field4466);
            for (int var8 = 0; super.field4597.length > var8; ++var8) {
                if (super.field4597[var8] != null && super.field4597[var8].method209(arg1, arg2, var6, this.field6375.field5008 == 1)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)V")
    public final void method613(byte arg0) {
        if (arg0 >= -56) {
            field6372 = null;
        }
        ++field6377;
        throw new IllegalStateException();
    }
}
