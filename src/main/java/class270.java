import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class270 extends class194 {

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    private int field4717 = 0;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "Lpa;")
    private class140 field4732 = new class140(16);

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    private int field4744 = 0;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "Lid;")
    private class226 field4748 = new class226();

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "J")
    private long field4749 = 0L;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Lbj;")
    private class87 field4721;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    private int field4735;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "Z")
    private boolean field4745;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "Lid;")
    private class226 field4747;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "Lmc;")
    private class46 field4742;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "Z")
    private boolean field4750;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    private int field4730;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lbj;")
    private class87 field4720;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "Lce;")
    private class115 field4734;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    private int field4740;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Lfc;")
    private class96 field4715;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field4713 = 0;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "Leg;")
    public static class37 field4729 = class174.method1167(" steht bereits auf Ihrer Freunde)2Liste(Q", 68);

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "Ljl;")
    public static class101 field4736;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Leb;")
    private class244 field4728;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "Z")
    private boolean field4746;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "[B")
    private byte[] field4722;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "[I")
    public static int[] field4716;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "[I")
    public static int[] field4743;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Leb;")
    public final class244 method1344(int arg0) {
        if (arg0 != 7672) {
            this.method1807(-96);
        }
        field4725++;
        if (this.field4728 != null) {
            return this.field4728;
        }
        if (this.field4715 == null) {
            if (this.field4734.method827((byte) -109)) {
                return null;
            }
            this.field4715 = this.field4734.method823(206873392, (byte) 0, 255, this.field4735, true);
        }
        if (this.field4715.field1500) {
            return null;
        }
        byte[] var2 = this.field4715.method618(-31029);
        if (this.field4715 instanceof class95) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4728 = new class244(var2, this.field4740);
                if (this.field4728.field4384 != this.field4730) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field4728 = null;
                if (this.field4734.method827((byte) 49)) {
                    this.field4715 = null;
                } else {
                    this.field4715 = this.field4734.method823(arg0 ^ 0xC54BEC8, (byte) 0, 255, this.field4735, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4728 = new class244(var2, this.field4740);
            } catch (RuntimeException var4) {
                this.field4734.method817((byte) -105);
                this.field4728 = null;
                if (this.field4734.method827((byte) 87)) {
                    this.field4715 = null;
                } else {
                    this.field4715 = this.field4734.method823(206873392, (byte) 0, 255, this.field4735, true);
                }
                return null;
            }
            if (this.field4720 != null) {
                this.field4742.method301(0, var2, this.field4720, this.field4735);
            }
        }
        if (this.field4721 != null) {
            this.field4722 = new byte[this.field4728.field4387];
            this.field4717 = 0;
        }
        this.field4715 = null;
        return this.field4728;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILeg;)V")
    public static final void method1803(int arg0, class37 arg1) {
        field4738++;
        for (class7 var2 = (class7) class78.field1212.method1566(arg0 - 5); var2 != null; var2 = (class7) class78.field1212.method1570(3)) {
            if (var2.field114.method223(arg1, (byte) 63)) {
                class73.field1155 = var2;
                return;
            }
        }
        if (arg0 != 2) {
            method1803(-71, (class37) null);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILtc;)V")
    public static final void method1804(int arg0, int arg1, int arg2, int arg3, class133 arg4) {
        if (arg0 != -251) {
            method1804(23, 33, -68, -98, (class133) null);
        }
        field4733++;
        for (class89 var5 = (class89) class127.field2130.method1566(-3); var5 != null; var5 = (class89) class127.field2130.method1570(3)) {
            if (var5.field1411 == arg3 && arg2 * 128 == var5.field1402 && arg1 * 128 == var5.field1403 && var5.field1401.field2304 == arg4.field2304) {
                if (var5.field1410 != null) {
                    class127.field2127.method1514(var5.field1410);
                    var5.field1410 = null;
                }
                if (var5.field1421 != null) {
                    class127.field2127.method1514(var5.field1421);
                    var5.field1421 = null;
                }
                var5.method441(16773377);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public final void method1805(byte arg0) {
        field4731++;
        if (this.field4721 != null) {
            this.field4746 = true;
            if (arg0 == -50 && this.field4747 == null) {
                this.field4747 = new class226();
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)[B")
    public final byte[] method1341(int arg0, byte arg1) {
        field4718++;
        int var3 = 45 / ((arg1 - 4) / 52);
        class96 var4 = this.method1808((byte) -18, 0, arg0);
        if (var4 == null) {
            return null;
        } else {
            byte[] var5 = var4.method618(-31029);
            var4.method441(16773377);
            return var5;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
    public final void method1806(byte arg0) {
        field4723++;
        if (this.field4747 != null) {
            if (this.method1344(7672) == null) {
                return;
            }
            if (this.field4745) {
                boolean var6 = true;
                for (class62 var7 = this.field4747.method1566(-3); var7 != null; var7 = this.field4747.method1570(3)) {
                    int var9 = (int) var7.field1027;
                    if (this.field4722[var9] == 0) {
                        this.method1808((byte) -18, 1, var9);
                    }
                    if (this.field4722[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method441(16773377);
                    }
                }
                while (this.field4728.field4380.length > this.field4744) {
                    if (this.field4728.field4380[this.field4744] == 0) {
                        this.field4744++;
                    } else {
                        if (this.field4742.field730 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field4722[this.field4744] == 0) {
                            this.method1808((byte) -18, 1, this.field4744);
                        }
                        if (this.field4722[this.field4744] == 0) {
                            class62 var8 = new class62();
                            var8.field1027 = (long) this.field4744;
                            var6 = false;
                            this.field4747.method1574(var8, 0);
                        }
                        this.field4744++;
                    }
                }
                if (var6) {
                    this.field4744 = 0;
                    this.field4745 = false;
                }
            } else if (this.field4746) {
                boolean var2 = true;
                for (class62 var3 = this.field4747.method1566(-3); var3 != null; var3 = this.field4747.method1570(3)) {
                    int var5 = (int) var3.field1027;
                    if (this.field4722[var5] != 1) {
                        this.method1808((byte) -18, 2, var5);
                    }
                    if (this.field4722[var5] == 1) {
                        var3.method441(16773377);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field4728.field4380.length > this.field4744) {
                    if (this.field4728.field4380[this.field4744] == 0) {
                        this.field4744++;
                    } else {
                        if (this.field4734.method829(false)) {
                            var2 = false;
                            break;
                        }
                        if (this.field4722[this.field4744] != 1) {
                            this.method1808((byte) -18, 2, this.field4744);
                        }
                        if (this.field4722[this.field4744] != 1) {
                            var2 = false;
                            class62 var4 = new class62();
                            var4.field1027 = (long) this.field4744;
                            this.field4747.method1574(var4, 0);
                        }
                        this.field4744++;
                    }
                }
                if (var2) {
                    this.field4744 = 0;
                    this.field4746 = false;
                }
            } else {
                this.field4747 = null;
            }
        }
        if (this.field4750 && class149.method1024(-14898) >= this.field4749) {
            for (class96 var10 = (class96) this.field4732.method993(-15322); var10 != null; var10 = (class96) this.field4732.method988(4586)) {
                if (!var10.field1500) {
                    if (var10.field1503) {
                        if (!var10.field1502) {
                            throw new RuntimeException();
                        }
                        var10.method441(16773377);
                    } else {
                        var10.field1503 = true;
                    }
                }
            }
            this.field4749 = class149.method1024(-14898) + 1000L;
        }
        if (arg0 >= -90) {
            this.method1807(-49);
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)I")
    public final int method1807(int arg0) {
        field4726++;
        if (this.method1344(arg0 ^ 0xFFFFB2E5) == null) {
            return this.field4715 == null ? 0 : this.field4715.method621(false);
        } else {
            if (arg0 != -20707) {
                this.method1808((byte) -67, -32, -117);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BII)Lfc;")
    private final class96 method1808(byte arg0, int arg1, int arg2) {
        if (arg0 != -18) {
            method1804(-127, 13, 44, -97, (class133) null);
        }
        field4737++;
        class96 var4 = (class96) this.field4732.method992((byte) 125, (long) arg2);
        if (var4 != null && arg1 == 0 && !var4.field1502 && var4.field1500) {
            var4.method441(16773377);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field4721 == null || this.field4722[arg2] == -1) {
                    if (this.field4734.method827((byte) -95)) {
                        return null;
                    }
                    var4 = this.field4734.method823(206873392, (byte) 2, this.field4735, arg2, true);
                } else {
                    var4 = this.field4742.method307(arg2, this.field4721, (byte) 92);
                }
            } else if (arg1 == 1) {
                if (this.field4721 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4742.method303(this.field4721, (byte) 114, arg2);
            } else if (arg1 == 2) {
                if (this.field4721 == null) {
                    throw new RuntimeException();
                }
                if (this.field4722[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4734.method829(false)) {
                    return null;
                }
                var4 = this.field4734.method823(206873392, (byte) 2, this.field4735, arg2, false);
            } else {
                throw new RuntimeException();
            }
            this.field4732.method986(var4, (long) arg2, arg0 + 17);
        }
        if (var4.field1500) {
            return null;
        }
        byte[] var5 = var4.method618(arg0 - 31011);
        if (!var4 instanceof class95) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class78.field1214.reset();
                class78.field1214.update(var5, 0, var5.length - 2);
                int var6 = (int) class78.field1214.getValue();
                if (this.field4728.field4390[arg2] != var6) {
                    throw new RuntimeException();
                }
                this.field4734.field1975 = 0;
                this.field4734.field1972 = 0;
            } catch (RuntimeException var12) {
                this.field4734.method817((byte) -124);
                var4.method441(16773377);
                if (var4.field1502 && !this.field4734.method827((byte) 96)) {
                    class104 var7 = this.field4734.method823(206873392, (byte) 2, this.field4735, arg2, true);
                    this.field4732.method986(var7, (long) arg2, -1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4728.field4393[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field4728.field4393[arg2];
            if (this.field4721 != null) {
                this.field4742.method301(0, var5, this.field4721, arg2);
                if (this.field4722[arg2] != 1) {
                    this.field4717++;
                    this.field4722[arg2] = 1;
                }
            }
            if (!var4.field1502) {
                var4.method441(16773377);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class78.field1214.reset();
            class78.field1214.update(var5, 0, var5.length - 2);
            int var8 = (int) class78.field1214.getValue();
            if (this.field4728.field4390[arg2] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4728.field4393[arg2] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field4722[arg2] != 1) {
                this.field4717++;
                this.field4722[arg2] = 1;
            }
            if (!var4.field1502) {
                var4.method441(arg0 ^ 0xFF000EEF);
            }
            return var4;
        } catch (Exception var11) {
            this.field4722[arg2] = -1;
            var4.method441(16773377);
            if (var4.field1502 && !this.field4734.method827((byte) 39)) {
                class104 var10 = this.field4734.method823(206873392, (byte) 2, this.field4735, arg2, true);
                this.field4732.method986(var10, (long) arg2, -1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)I")
    public final int method1809(int arg0) {
        field4714++;
        if (this.field4728 == null) {
            return 0;
        }
        if (arg0 >= -49) {
            this.field4740 = 0;
        }
        if (this.field4745) {
            class62 var2 = this.field4747.method1566(-3);
            return var2 == null ? 0 : (int) var2.field1027;
        } else {
            return this.field4728.field4385;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)I")
    public final int method1810(boolean arg0) {
        field4711++;
        if (arg0) {
            method1804(-105, -81, 16, 5, (class133) null);
        }
        return this.field4717;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
    public static void method1811(byte arg0) {
        if (arg0 != -93) {
            method1811((byte) 10);
        }
        field4743 = null;
        field4729 = null;
        field4736 = null;
        field4716 = null;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(IB)I")
    public final int method1343(int arg0, byte arg1) {
        field4727++;
        class96 var3 = (class96) this.field4732.method992((byte) 125, (long) arg0);
        if (arg1 < 98) {
            this.method1343(-57, (byte) -39);
        }
        return var3 == null ? 0 : var3.method621(false);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V")
    public final void method1340(int arg0, boolean arg1) {
        field4739++;
        if (this.field4721 == null || arg1) {
            return;
        }
        for (class62 var3 = this.field4748.method1566(-3); var3 != null; var3 = this.field4748.method1570(3)) {
            if ((long) arg0 == var3.field1027) {
                return;
            }
        }
        class62 var4 = new class62();
        var4.field1027 = (long) arg0;
        this.field4748.method1574(var4, 0);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)I")
    public final int method1812(boolean arg0) {
        field4719++;
        if (arg0) {
            return -83;
        } else if (this.field4728 == null) {
            return 0;
        } else {
            return this.field4728.field4385;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(Z)V")
    public final void method1813(boolean arg0) {
        field4741++;
        if (this.field4747 == null || this.method1344(7672) == null) {
            return;
        }
        for (class62 var2 = this.field4748.method1566(-3); var2 != null; var2 = this.field4748.method1570(3)) {
            int var3 = (int) var2.field1027;
            if (var3 < 0 || this.field4728.field4387 <= var3 || this.field4728.field4380[var3] == 0) {
                var2.method441(16773377);
            } else {
                if (this.field4722[var3] == 0) {
                    this.method1808((byte) -18, 1, var3);
                }
                if (this.field4722[var3] == -1) {
                    this.method1808((byte) -18, 2, var3);
                }
                if (this.field4722[var3] == 1) {
                    var2.method441(16773377);
                }
            }
        }
        if (!arg0) {
            this.method1813(false);
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(ILbj;Lbj;Lce;Lmc;IIZ)V")
    public class270(int arg0, class87 arg1, class87 arg2, class115 arg3, class46 arg4, int arg5, int arg6, boolean arg7) {
        this.field4721 = arg1;
        this.field4735 = arg0;
        if (this.field4721 == null) {
            this.field4745 = false;
        } else {
            this.field4745 = true;
            this.field4747 = new class226();
        }
        this.field4742 = arg4;
        this.field4750 = arg7;
        this.field4730 = arg6;
        this.field4720 = arg2;
        this.field4734 = arg3;
        this.field4740 = arg5;
        if (this.field4720 != null) {
            this.field4715 = this.field4742.method307(this.field4735, this.field4720, (byte) 92);
        }
    }
}
