import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class367 {

    @OriginalMember(owner = "client!ft", name = "q", descriptor = "I")
    private int field19 = 0;

    @OriginalMember(owner = "client!ft", name = "A", descriptor = "Lqh;")
    private class50 field29 = new class50(16);

    @OriginalMember(owner = "client!ft", name = "K", descriptor = "I")
    private int field39 = 0;

    @OriginalMember(owner = "client!ft", name = "J", descriptor = "Lsr;")
    private class167 field38 = new class167();

    @OriginalMember(owner = "client!ft", name = "L", descriptor = "J")
    private long field40 = 0L;

    @OriginalMember(owner = "client!ft", name = "E", descriptor = "Lvs;")
    private class420 field33;

    @OriginalMember(owner = "client!ft", name = "u", descriptor = "I")
    private int field23;

    @OriginalMember(owner = "client!ft", name = "G", descriptor = "Z")
    private boolean field35;

    @OriginalMember(owner = "client!ft", name = "F", descriptor = "Lsr;")
    private class167 field34;

    @OriginalMember(owner = "client!ft", name = "y", descriptor = "I")
    private int field27;

    @OriginalMember(owner = "client!ft", name = "M", descriptor = "Z")
    private boolean field41;

    @OriginalMember(owner = "client!ft", name = "r", descriptor = "Lsn;")
    private class447 field20;

    @OriginalMember(owner = "client!ft", name = "x", descriptor = "Lqj;")
    private class355 field26;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "Lvs;")
    private class420 field10;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "client!ft", name = "w", descriptor = "Lhi;")
    private class140 field25;

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
    public static int field15 = 0;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ft", name = "n", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ft", name = "s", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ft", name = "t", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ft", name = "v", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ft", name = "z", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ft", name = "B", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ft", name = "C", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ft", name = "D", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "Lwv;")
    private class26 field7;

    @OriginalMember(owner = "client!ft", name = "p", descriptor = "Lie;")
    public static class6 field18;

    @OriginalMember(owner = "client!ft", name = "H", descriptor = "Z")
    private boolean field36;

    @OriginalMember(owner = "client!ft", name = "o", descriptor = "[B")
    private byte[] field17;

    @OriginalMember(owner = "client!ft", name = "I", descriptor = "[I")
    public static int[] field37;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
    public static final void method13(int arg0) {
        field12++;
        for (class428 var1 = (class428) class65.field740.method970(12); var1 != null; var1 = (class428) class65.field740.method976((byte) -127)) {
            class530 var2 = var1.field6220;
            if (var2.field7778) {
                var1.method2674(true);
                var2.method3146(-16470);
            } else if (class532.field7836 >= var2.field7762) {
                var2.method3143(class123.field1594, arg0 + 14);
                if (var2.field7778) {
                    var1.method2674(true);
                } else {
                    class279.method1691(var2, true);
                }
            }
        }
        if (arg0 != 100) {
            field15 = 0;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)Lwv;")
    public final class26 method14(byte arg0) {
        field30++;
        if (this.field7 != null) {
            return this.field7;
        }
        if (this.field25 == null) {
            if (this.field20.method2767((byte) 123)) {
                return null;
            }
            this.field25 = this.field20.method2759(this.field23, 255, (byte) 69, (byte) 0, true);
        }
        if (this.field25.field1861) {
            return null;
        }
        byte[] var2 = this.field25.method868(-81);
        if (this.field25 instanceof class421) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field7 = new class26(var2, this.field8);
                if (this.field7.field255 != this.field27) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field7 = null;
                if (this.field20.method2767((byte) 123)) {
                    this.field25 = null;
                } else {
                    this.field25 = this.field20.method2759(this.field23, 255, (byte) -98, (byte) 0, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field7 = new class26(var2, this.field8);
            } catch (RuntimeException var4) {
                this.field20.method2769(false);
                this.field7 = null;
                if (this.field20.method2767((byte) 123)) {
                    this.field25 = null;
                } else {
                    this.field25 = this.field20.method2759(this.field23, 255, (byte) 8, (byte) 0, true);
                }
                return null;
            }
            if (this.field10 != null) {
                this.field26.method2087(this.field23, (byte) -104, var2, this.field10);
            }
        }
        if (arg0 != 15) {
            this.field23 = 96;
        }
        if (this.field33 != null) {
            this.field19 = 0;
            this.field17 = new byte[this.field7.field244];
        }
        this.field25 = null;
        return this.field7;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)I")
    public final int method15(int arg0) {
        if (arg0 != 0) {
            this.field29 = null;
        }
        field14++;
        if (this.method14((byte) 15) == null) {
            return this.field25 == null ? 0 : this.field25.method864((byte) 13);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZ)[B")
    public final byte[] method16(int arg0, boolean arg1) {
        field28++;
        class140 var3 = this.method25(0, (byte) 2, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method868(125);
            var3.method2674(arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(B)I")
    public final int method17(byte arg0) {
        field31++;
        if (arg0 != 19) {
            this.method19((byte) 37);
        }
        return this.field19;
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(B)V")
    public final void method18(byte arg0) {
        field21++;
        if (this.field33 == null) {
            return;
        }
        this.field36 = true;
        if (this.field34 == null) {
            this.field34 = new class167();
        }
        if (arg0 <= 29) {
            this.field26 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "(B)I")
    public final int method19(byte arg0) {
        field9++;
        if (this.field7 == null) {
            return 0;
        } else if (arg0 <= 66) {
            return -50;
        } else {
            return this.field7.field243;
        }
    }

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "(B)V")
    public final void method20(byte arg0) {
        field13++;
        if (this.field34 == null || this.method14((byte) 15) == null) {
            return;
        }
        for (class435 var2 = this.field38.method970(12); var2 != null; var2 = this.field38.method976((byte) -117)) {
            int var3 = (int) var2.field6348;
            if (var3 < 0 || var3 >= this.field7.field244 || this.field7.field245[var3] == 0) {
                var2.method2674(true);
            } else {
                if (this.field17[var3] == 0) {
                    this.method25(1, (byte) 2, var3);
                }
                if (this.field17[var3] == -1) {
                    this.method25(2, (byte) 2, var3);
                }
                if (this.field17[var3] == 1) {
                    var2.method2674(true);
                }
            }
        }
        if (arg0 > -84) {
            this.field23 = -88;
        }
    }

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "(B)V")
    public static void method21(byte arg0) {
        field18 = null;
        if (arg0 > 92) {
            field37 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IB)V")
    public final void method22(int arg0, byte arg1) {
        field24++;
        if (this.field33 == null) {
            return;
        }
        for (class435 var3 = this.field38.method970(12); var3 != null; var3 = this.field38.method976((byte) -123)) {
            if (((long) arg0) == var3.field6348) {
                return;
            }
        }
        class435 var4 = new class435();
        var4.field6348 = arg0;
        this.field38.method975(0, var4);
        if (arg1 != 122) {
            field15 = -18;
        }
    }

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "(B)V")
    public final void method23(byte arg0) {
        if (arg0 >= -45) {
            return;
        }
        field22++;
        if (this.field34 != null) {
            if (this.method14((byte) 15) == null) {
                return;
            }
            if (this.field35) {
                boolean var6 = true;
                for (class435 var7 = this.field34.method970(12); var7 != null; var7 = this.field34.method976((byte) 47)) {
                    int var9 = (int) var7.field6348;
                    if (this.field17[var9] == 0) {
                        this.method25(1, (byte) 2, var9);
                    }
                    if (this.field17[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method2674(true);
                    }
                }
                while (this.field7.field245.length > this.field39) {
                    if (this.field7.field245[this.field39] == 0) {
                        this.field39++;
                    } else {
                        if (this.field26.field4750 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field17[this.field39] == 0) {
                            this.method25(1, (byte) 2, this.field39);
                        }
                        if (this.field17[this.field39] == 0) {
                            class435 var8 = new class435();
                            var8.field6348 = this.field39;
                            this.field34.method975(0, var8);
                            var6 = false;
                        }
                        this.field39++;
                    }
                }
                if (var6) {
                    this.field35 = false;
                    this.field39 = 0;
                }
            } else if (this.field36) {
                boolean var2 = true;
                for (class435 var3 = this.field34.method970(12); var3 != null; var3 = this.field34.method976((byte) 96)) {
                    int var5 = (int) var3.field6348;
                    if (this.field17[var5] != 1) {
                        this.method25(2, (byte) 2, var5);
                    }
                    if (this.field17[var5] == 1) {
                        var3.method2674(true);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field39 < this.field7.field245.length) {
                    if (this.field7.field245[this.field39] == 0) {
                        this.field39++;
                    } else {
                        if (this.field20.method2760((byte) -111)) {
                            var2 = false;
                            break;
                        }
                        if (this.field17[this.field39] != 1) {
                            this.method25(2, (byte) 2, this.field39);
                        }
                        if (this.field17[this.field39] != 1) {
                            class435 var4 = new class435();
                            var4.field6348 = this.field39;
                            this.field34.method975(0, var4);
                            var2 = false;
                        }
                        this.field39++;
                    }
                }
                if (var2) {
                    this.field36 = false;
                    this.field39 = 0;
                }
            } else {
                this.field34 = null;
            }
        }
        if (!this.field41 || this.field40 > class45.method252((byte) -8)) {
            return;
        }
        for (class140 var10 = (class140) this.field29.method300((byte) -96); var10 != null; var10 = (class140) this.field29.method301(-120)) {
            if (!var10.field1861) {
                if (var10.field1864) {
                    if (!var10.field1863) {
                        throw new RuntimeException();
                    }
                    var10.method2674(true);
                } else {
                    var10.field1864 = true;
                }
            }
        }
        this.field40 = class45.method252((byte) -8) + 1000L;
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)I")
    public final int method24(int arg0) {
        int var2 = -83 / ((arg0 + 67) / 53);
        field32++;
        if (this.field7 == null) {
            return 0;
        } else if (this.field35) {
            class435 var3 = this.field34.method970(12);
            return var3 == null ? 0 : (int) var3.field6348;
        } else {
            return this.field7.field243;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IBI)Lhi;")
    private final class140 method25(int arg0, byte arg1, int arg2) {
        field11++;
        class140 var4 = (class140) this.field29.method295((long) arg2, -90);
        if (var4 != null && arg0 == 0 && !var4.field1863 && var4.field1861) {
            var4.method2674(true);
            var4 = null;
        }
        if (arg1 != 2) {
            this.field7 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field33 == null || this.field17[arg2] == -1) {
                    if (this.field20.method2767((byte) 123)) {
                        return null;
                    }
                    var4 = this.field20.method2759(arg2, this.field23, (byte) -124, (byte) 2, true);
                } else {
                    var4 = this.field26.method2089(arg2, arg1 - 1, this.field33);
                }
            } else if (arg0 == 1) {
                if (this.field33 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field26.method2086(this.field33, arg2, false);
            } else if (arg0 == 2) {
                if (this.field33 == null) {
                    throw new RuntimeException();
                }
                if (this.field17[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field20.method2760((byte) 43)) {
                    return null;
                }
                var4 = this.field20.method2759(arg2, this.field23, (byte) -128, (byte) 2, false);
            } else {
                throw new RuntimeException();
            }
            this.field29.method291((long) arg2, var4, -106);
        }
        if (var4.field1861) {
            return null;
        }
        byte[] var5 = var4.method868(122);
        if (!var4 instanceof class421) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class245.field3225.reset();
                class245.field3225.update(var5, 0, var5.length - 2);
                int var9 = (int) class245.field3225.getValue();
                if (this.field7.field246[arg2] != var9) {
                    throw new RuntimeException();
                }
                this.field20.field6532 = 0;
                this.field20.field6534 = 0;
            } catch (RuntimeException var12) {
                this.field20.method2769(false);
                var4.method2674(true);
                if (var4.field1863 && !this.field20.method2767((byte) 123)) {
                    class406 var10 = this.field20.method2759(arg2, this.field23, (byte) 110, (byte) 2, true);
                    this.field29.method291((long) arg2, var10, -64);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field7.field242[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field7.field242[arg2];
            if (this.field33 != null) {
                this.field26.method2087(arg2, (byte) -104, var5, this.field33);
                if (this.field17[arg2] != 1) {
                    this.field19++;
                    this.field17[arg2] = 1;
                }
            }
            if (!var4.field1863) {
                var4.method2674(true);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class245.field3225.reset();
            class245.field3225.update(var5, 0, var5.length - 2);
            int var6 = (int) class245.field3225.getValue();
            if (this.field7.field246[arg2] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field7.field242[arg2] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field17[arg2] != 1) {
                this.field19++;
                this.field17[arg2] = 1;
            }
            if (!var4.field1863) {
                var4.method2674(true);
            }
            return var4;
        } catch (Exception var11) {
            this.field17[arg2] = -1;
            var4.method2674(true);
            if (var4.field1863 && !this.field20.method2767((byte) 123)) {
                class406 var8 = this.field20.method2759(arg2, this.field23, (byte) 12, (byte) 2, true);
                this.field29.method291((long) arg2, var8, -87);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(IB)I")
    public final int method26(int arg0, byte arg1) {
        field16++;
        class140 var3 = (class140) this.field29.method295((long) arg0, -100);
        if (var3 == null) {
            return arg1 >= -73 ? 59 : 0;
        } else {
            return var3.method864((byte) 13);
        }
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(ILvs;Lvs;Lsn;Lqj;IIZ)V")
    public class4(int arg0, class420 arg1, class420 arg2, class447 arg3, class355 arg4, int arg5, int arg6, boolean arg7) {
        this.field33 = arg1;
        this.field23 = arg0;
        if (this.field33 == null) {
            this.field35 = false;
        } else {
            this.field35 = true;
            this.field34 = new class167();
        }
        this.field27 = arg6;
        this.field41 = arg7;
        this.field20 = arg3;
        this.field26 = arg4;
        this.field10 = arg2;
        this.field8 = arg5;
        if (this.field10 != null) {
            this.field25 = this.field26.method2089(this.field23, 1, this.field10);
        }
    }
}
