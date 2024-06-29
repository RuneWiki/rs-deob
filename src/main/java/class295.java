import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class295 extends class149 {

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    private int field4660 = 0;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "Luc;")
    private class39 field4652 = new class39(16);

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "I")
    private int field4670 = 0;

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "Lam;")
    private class180 field4671 = new class180();

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "J")
    private long field4675 = 0L;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "I")
    private int field4665;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Luh;")
    private class103 field4638;

    @OriginalMember(owner = "client!lh", name = "P", descriptor = "Z")
    private boolean field4672;

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "Lam;")
    private class180 field4673;

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "Z")
    private boolean field4674;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    private int field4666;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Lia;")
    private class231 field4640;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    private int field4639;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "Luh;")
    private class103 field4651;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "Lii;")
    private class263 field4654;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Lv;")
    private class152 field4641;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "[I")
    public static int[] field4659 = new int[200];

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "Z")
    public static boolean field4663 = false;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Lic;")
    private class143 field4642;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "Lre;")
    public static class228 field4653;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "Z")
    private boolean field4669;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "[B")
    private byte[] field4655;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(BI)V")
    public final void method1007(byte arg0, int arg1) {
        if (arg0 < 18) {
            this.field4660 = 19;
        }
        field4647++;
        if (this.field4638 == null) {
            return;
        }
        for (class166 var3 = this.field4671.method1221(117); var3 != null; var3 = this.field4671.method1227(-10626)) {
            if ((long) arg1 == var3.field2603) {
                return;
            }
        }
        class166 var4 = new class166();
        var4.field2603 = (long) arg1;
        this.field4671.method1219(false, var4);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BIIII)V")
    public static final void method1965(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 32 / ((-arg0 - 57) / 51);
        field4662++;
        class148.field2338 = arg2;
        class223.field3423 = arg4;
        class266.field4247 = arg1;
        class90.field1568 = arg3;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)I")
    public final int method1966(boolean arg0) {
        field4667++;
        if (this.field4642 == null) {
            return 0;
        } else if (this.field4672) {
            class166 var2 = this.field4673.method1221(124);
            if (arg0) {
                return var2 == null ? 0 : (int) var2.field2603;
            } else {
                return 123;
            }
        } else {
            return this.field4642.field2198;
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V")
    public final void method1967(int arg0) {
        field4658++;
        if (this.field4673 == null || this.method1005(-1502) == null) {
            return;
        }
        for (class166 var2 = this.field4671.method1221(127); var2 != null; var2 = this.field4671.method1227(-10626)) {
            int var3 = (int) var2.field2603;
            if (var3 < 0 || var3 >= this.field4642.field2175 || this.field4642.field2186[var3] == 0) {
                var2.method1123(0);
            } else {
                if (this.field4655[var3] == 0) {
                    this.method1974(var3, true, 1);
                }
                if (this.field4655[var3] == -1) {
                    this.method1974(var3, true, 2);
                }
                if (this.field4655[var3] == 1) {
                    var2.method1123(0);
                }
            }
        }
        if (arg0 > -35) {
            this.field4652 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public final void method1968(byte arg0) {
        field4661++;
        if (arg0 > -63) {
            this.method1966(false);
        }
        if (this.field4673 != null) {
            if (this.method1005(-1502) == null) {
                return;
            }
            if (this.field4672) {
                boolean var2 = true;
                for (class166 var3 = this.field4673.method1221(120); var3 != null; var3 = this.field4673.method1227(-10626)) {
                    int var5 = (int) var3.field2603;
                    if (this.field4655[var5] == 0) {
                        this.method1974(var5, true, 1);
                    }
                    if (this.field4655[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1123(0);
                    }
                }
                while (this.field4670 < this.field4642.field2186.length) {
                    if (this.field4642.field2186[this.field4670] == 0) {
                        this.field4670++;
                    } else {
                        if (this.field4654.field4184 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field4655[this.field4670] == 0) {
                            this.method1974(this.field4670, true, 1);
                        }
                        if (this.field4655[this.field4670] == 0) {
                            class166 var4 = new class166();
                            var4.field2603 = (long) this.field4670;
                            var2 = false;
                            this.field4673.method1219(false, var4);
                        }
                        this.field4670++;
                    }
                }
                if (var2) {
                    this.field4670 = 0;
                    this.field4672 = false;
                }
            } else if (this.field4669) {
                boolean var6 = true;
                for (class166 var7 = this.field4673.method1221(118); var7 != null; var7 = this.field4673.method1227(-10626)) {
                    int var9 = (int) var7.field2603;
                    if (this.field4655[var9] != 1) {
                        this.method1974(var9, true, 2);
                    }
                    if (this.field4655[var9] == 1) {
                        var7.method1123(0);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field4642.field2186.length > this.field4670) {
                    if (this.field4642.field2186[this.field4670] == 0) {
                        this.field4670++;
                    } else {
                        if (this.field4640.method1538(-60)) {
                            var6 = false;
                            break;
                        }
                        if (this.field4655[this.field4670] != 1) {
                            this.method1974(this.field4670, true, 2);
                        }
                        if (this.field4655[this.field4670] != 1) {
                            class166 var8 = new class166();
                            var8.field2603 = (long) this.field4670;
                            var6 = false;
                            this.field4673.method1219(false, var8);
                        }
                        this.field4670++;
                    }
                }
                if (var6) {
                    this.field4670 = 0;
                    this.field4669 = false;
                }
            } else {
                this.field4673 = null;
            }
        }
        if (!this.field4674 || class134.method924(false) < this.field4675) {
            return;
        }
        for (class152 var10 = (class152) this.field4652.method287(-126); var10 != null; var10 = (class152) this.field4652.method291((byte) -85)) {
            if (!var10.field2377) {
                if (var10.field2381) {
                    if (!var10.field2387) {
                        throw new RuntimeException();
                    }
                    var10.method1123(0);
                } else {
                    var10.field2381 = true;
                }
            }
        }
        this.field4675 = class134.method924(false) + 1000L;
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)I")
    public final int method1969(int arg0) {
        if (arg0 != -164777272) {
            this.field4669 = false;
        }
        field4643++;
        return this.field4642 == null ? 0 : this.field4642.field2198;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
    public final void method1970(byte arg0) {
        field4649++;
        if (this.field4638 == null) {
            return;
        }
        this.field4669 = true;
        if (arg0 != 31) {
            this.field4642 = null;
        }
        if (this.field4673 == null) {
            this.field4673 = new class180();
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)I")
    public final int method1001(byte arg0, int arg1) {
        if (arg0 >= -26) {
            return -27;
        } else {
            field4668++;
            class152 var3 = (class152) this.field4652.method285((long) arg1, 13821);
            return var3 == null ? 0 : var3.method1026(true);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)[B")
    public final byte[] method1003(int arg0, int arg1) {
        if (arg1 != 2) {
            this.method1974(-98, false, -79);
        }
        class152 var3 = this.method1974(arg0, true, 0);
        field4650++;
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1024(-117);
            var3.method1123(0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)V")
    public static void method1971(int arg0) {
        field4653 = null;
        field4659 = null;
        int var1 = -77 / ((arg0 - 4) / 36);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)V")
    public static final void method1972(int arg0, int arg1) {
        field4645++;
        class39.method278(arg0 ^ 0x45F9);
        class206.method1387(arg0 ^ 0x7863);
        int var2 = class93.method703(15226, arg1).field2123;
        if (arg0 != 30734 || var2 == 0) {
            return;
        }
        int var3 = class31.field462[arg1];
        if (var2 == 5) {
            class37.field524 = var3;
        }
        if (var2 == 6) {
            class27.field375 = var3;
        }
        if (var2 == 9) {
            class274.field4376 = var3;
        }
    }

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)I")
    public final int method1973(int arg0) {
        field4664++;
        if (this.method1005(-1502) == null) {
            return this.field4641 == null ? 0 : this.field4641.method1026(true);
        } else {
            if (arg0 != 2399) {
                this.method1001((byte) 105, -50);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZI)Lv;")
    private final class152 method1974(int arg0, boolean arg1, int arg2) {
        field4644++;
        if (!arg1) {
            field4659 = null;
        }
        class152 var4 = (class152) this.field4652.method285((long) arg0, 13821);
        if (var4 != null && arg2 == 0 && !var4.field2387 && var4.field2377) {
            var4.method1123(0);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field4638 == null || this.field4655[arg0] == -1) {
                    if (this.field4640.method1548(arg1)) {
                        return null;
                    }
                    var4 = this.field4640.method1540((byte) 2, 0, arg0, this.field4665, true);
                } else {
                    var4 = this.field4654.method1774(arg0, 21919, this.field4638);
                }
            } else if (arg2 == 1) {
                if (this.field4638 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4654.method1780(true, arg0, this.field4638);
            } else if (arg2 == 2) {
                if (this.field4638 == null) {
                    throw new RuntimeException();
                }
                if (this.field4655[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4640.method1538(-118)) {
                    return null;
                }
                var4 = this.field4640.method1540((byte) 2, 0, arg0, this.field4665, false);
            } else {
                throw new RuntimeException();
            }
            this.field4652.method281(1, (long) arg0, var4);
        }
        if (var4.field2377) {
            return null;
        }
        byte[] var5 = var4.method1024(-99);
        if (!var4 instanceof class174) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class41.field587.reset();
                class41.field587.update(var5, 0, var5.length - 2);
                int var9 = (int) class41.field587.getValue();
                if (this.field4642.field2182[arg0] != var9) {
                    throw new RuntimeException();
                }
                this.field4640.field3693 = 0;
                this.field4640.field3691 = 0;
            } catch (RuntimeException var12) {
                this.field4640.method1543(0);
                var4.method1123(0);
                if (var4.field2387 && !this.field4640.method1548(true)) {
                    class213 var10 = this.field4640.method1540((byte) 2, 0, arg0, this.field4665, true);
                    this.field4652.method281(1, (long) arg0, var10);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4642.field2176[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field4642.field2176[arg0];
            if (this.field4638 != null) {
                this.field4654.method1778((byte) 73, arg0, var5, this.field4638);
                if (this.field4655[arg0] != 1) {
                    this.field4660++;
                    this.field4655[arg0] = 1;
                }
            }
            if (!var4.field2387) {
                var4.method1123(0);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class41.field587.reset();
            class41.field587.update(var5, 0, var5.length - 2);
            int var6 = (int) class41.field587.getValue();
            if (this.field4642.field2182[arg0] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4642.field2176[arg0] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field4655[arg0] != 1) {
                this.field4660++;
                this.field4655[arg0] = 1;
            }
            if (!var4.field2387) {
                var4.method1123(0);
            }
            return var4;
        } catch (Exception var11) {
            this.field4655[arg0] = -1;
            var4.method1123(0);
            if (var4.field2387 && !this.field4640.method1548(arg1)) {
                class213 var8 = this.field4640.method1540((byte) 2, 0, arg0, this.field4665, true);
                this.field4652.method281(1, (long) arg0, var8);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)I")
    public final int method1975(byte arg0) {
        field4648++;
        if (arg0 >= -4) {
            this.field4674 = true;
        }
        return this.field4660;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)I")
    public static final int method1976(int arg0, int arg1, int arg2) {
        field4637++;
        if (arg2 != 0) {
            return -48;
        }
        if (arg0 > arg1) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Lic;")
    public final class143 method1005(int arg0) {
        field4656++;
        if (this.field4642 != null) {
            return this.field4642;
        }
        if (this.field4641 == null) {
            if (this.field4640.method1548(true)) {
                return null;
            }
            this.field4641 = this.field4640.method1540((byte) 0, 0, this.field4665, 255, true);
        }
        if (this.field4641.field2377) {
            return null;
        } else if (arg0 == -1502) {
            byte[] var2 = this.field4641.method1024(-113);
            if (this.field4641 instanceof class174) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field4642 = new class143(var2, this.field4666);
                    if (this.field4642.field2185 != this.field4639) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field4642 = null;
                    if (this.field4640.method1548(true)) {
                        this.field4641 = null;
                    } else {
                        this.field4641 = this.field4640.method1540((byte) 0, 0, this.field4665, 255, true);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field4642 = new class143(var2, this.field4666);
                } catch (RuntimeException var4) {
                    this.field4640.method1543(0);
                    this.field4642 = null;
                    if (this.field4640.method1548(true)) {
                        this.field4641 = null;
                    } else {
                        this.field4641 = this.field4640.method1540((byte) 0, arg0 ^ 0xFFFFFA22, this.field4665, 255, true);
                    }
                    return null;
                }
                if (this.field4651 != null) {
                    this.field4654.method1778((byte) 73, this.field4665, var2, this.field4651);
                }
            }
            if (this.field4638 != null) {
                this.field4660 = 0;
                this.field4655 = new byte[this.field4642.field2175];
            }
            this.field4641 = null;
            return this.field4642;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(ILuh;Luh;Lia;Lii;IIZ)V")
    public class295(int arg0, class103 arg1, class103 arg2, class231 arg3, class263 arg4, int arg5, int arg6, boolean arg7) {
        this.field4665 = arg0;
        this.field4638 = arg1;
        if (this.field4638 == null) {
            this.field4672 = false;
        } else {
            this.field4672 = true;
            this.field4673 = new class180();
        }
        this.field4674 = arg7;
        this.field4666 = arg5;
        this.field4640 = arg3;
        this.field4639 = arg6;
        this.field4651 = arg2;
        this.field4654 = arg4;
        if (this.field4651 != null) {
            this.field4641 = this.field4654.method1774(this.field4665, 21919, this.field4651);
        }
    }
}
