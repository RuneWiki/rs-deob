import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class425 extends class73 {

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
    private int field5767 = 0;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "Lad;")
    private class268 field5754 = new class268(16);

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
    private int field5771 = 0;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "Lld;")
    private class105 field5773 = new class105();

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "J")
    private long field5777 = 0L;

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "Lrq;")
    private class213 field5769;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    private int field5743;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "Z")
    private boolean field5775;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "Lld;")
    private class105 field5772;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
    private int field5765;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "Z")
    private boolean field5776;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "Lrq;")
    private class213 field5759;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "Lpp;")
    private class245 field5761;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "Lro;")
    private class2 field5750;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    private int field5745;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "Lut;")
    private class71 field5753;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public static int field5751 = 0;

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "I")
    public static int field5768 = 16777215;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "Lra;")
    private class63 field5763;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "Z")
    private boolean field5774;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "[B")
    private byte[] field5758;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public final void method2508(byte arg0) {
        field5766++;
        if (this.field5772 == null || this.method472(true) == null) {
            return;
        }
        if (arg0 != -1) {
            field5747 = 42;
        }
        for (class445 var2 = this.field5773.method652((byte) 37); var2 != null; var2 = this.field5773.method653(arg0 + 113)) {
            int var3 = (int) var2.field6047;
            if (var3 < 0 || var3 >= this.field5763.field841 || this.field5763.field830[var3] == 0) {
                var2.method2614((byte) -112);
            } else {
                if (this.field5758[var3] == 0) {
                    this.method2517(arg0 + 121, var3, 1);
                }
                if (this.field5758[var3] == -1) {
                    this.method2517(-77, var3, 2);
                }
                if (this.field5758[var3] == 1) {
                    var2.method2614((byte) -127);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)Lcj;")
    public static final class451 method2509(int arg0, int arg1, int arg2) {
        class491 var3 = class289.field3897[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6840;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V")
    public final void method2510(byte arg0) {
        if (arg0 > -119) {
            this.method472(false);
        }
        field5746++;
        if (this.field5772 != null) {
            if (this.method472(true) == null) {
                return;
            }
            if (this.field5775) {
                boolean var2 = true;
                for (class445 var3 = this.field5772.method652((byte) 37); var3 != null; var3 = this.field5772.method653(73)) {
                    int var5 = (int) var3.field6047;
                    if (this.field5758[var5] == 0) {
                        this.method2517(42, var5, 1);
                    }
                    if (this.field5758[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method2614((byte) -94);
                    }
                }
                while (this.field5771 < this.field5763.field830.length) {
                    if (this.field5763.field830[this.field5771] == 0) {
                        this.field5771++;
                    } else {
                        if (this.field5750.field37 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field5758[this.field5771] == 0) {
                            this.method2517(96, this.field5771, 1);
                        }
                        if (this.field5758[this.field5771] == 0) {
                            class445 var4 = new class445();
                            var4.field6047 = (long) this.field5771;
                            this.field5772.method641(var4, (byte) -93);
                            var2 = false;
                        }
                        this.field5771++;
                    }
                }
                if (var2) {
                    this.field5771 = 0;
                    this.field5775 = false;
                }
            } else if (this.field5774) {
                boolean var6 = true;
                for (class445 var7 = this.field5772.method652((byte) 37); var7 != null; var7 = this.field5772.method653(71)) {
                    int var9 = (int) var7.field6047;
                    if (this.field5758[var9] != 1) {
                        this.method2517(126, var9, 2);
                    }
                    if (this.field5758[var9] == 1) {
                        var7.method2614((byte) -69);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field5771 < this.field5763.field830.length) {
                    if (this.field5763.field830[this.field5771] == 0) {
                        this.field5771++;
                    } else {
                        if (this.field5761.method1367(false)) {
                            var6 = false;
                            break;
                        }
                        if (this.field5758[this.field5771] != 1) {
                            this.method2517(-110, this.field5771, 2);
                        }
                        if (this.field5758[this.field5771] != 1) {
                            class445 var8 = new class445();
                            var8.field6047 = (long) this.field5771;
                            this.field5772.method641(var8, (byte) -93);
                            var6 = false;
                        }
                        this.field5771++;
                    }
                }
                if (var6) {
                    this.field5771 = 0;
                    this.field5774 = false;
                }
            } else {
                this.field5772 = null;
            }
        }
        if (!this.field5776 || class440.method2583(25267) < this.field5777) {
            return;
        }
        for (class71 var10 = (class71) this.field5754.method1518((byte) -94); var10 != null; var10 = (class71) this.field5754.method1517(-30942)) {
            if (!var10.field973) {
                if (var10.field974) {
                    if (!var10.field976) {
                        throw new RuntimeException();
                    }
                    var10.method2614((byte) -101);
                } else {
                    var10.field974 = true;
                }
            }
        }
        this.field5777 = class440.method2583(25267) + 1000L;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)I")
    public final int method2511(byte arg0) {
        if (arg0 > -103) {
            return 24;
        } else {
            field5748++;
            return this.field5763 == null ? 0 : this.field5763.field836;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)I")
    public final int method2512(boolean arg0) {
        field5764++;
        if (this.method472(arg0) == null) {
            return this.field5753 == null ? 0 : this.field5753.method448(64);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)[B")
    public final byte[] method477(int arg0, int arg1) {
        field5749++;
        class71 var3 = this.method2517(-125, arg0, arg1);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method447((byte) -122);
            var3.method2614((byte) -119);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(Z)I")
    public final int method2513(boolean arg0) {
        field5762++;
        if (this.field5763 == null) {
            return 0;
        } else if (this.field5775) {
            class445 var2 = this.field5772.method652((byte) 37);
            if (var2 == null) {
                return 0;
            } else if (arg0) {
                return 120;
            } else {
                return (int) var2.field6047;
            }
        } else {
            return this.field5763.field836;
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)I")
    public final int method2514(int arg0) {
        if (arg0 <= 4) {
            this.method2512(false);
        }
        field5755++;
        return this.field5767;
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)V")
    public final void method2515(int arg0) {
        field5756++;
        if (arg0 != 0) {
            this.field5774 = false;
        }
        if (this.field5769 != null) {
            this.field5774 = true;
            if (this.field5772 == null) {
                this.field5772 = new class105();
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg9 != 22576) {
            field5768 = -78;
        }
        field5752++;
        class363 var10 = null;
        for (class363 var11 = (class363) class78.field1054.method652((byte) 37); var11 != null; var11 = (class363) class78.field1054.method653(34)) {
            if (var11.field4972 == arg6 && var11.field4976 == arg3 && var11.field4978 == arg5 && var11.field4983 == arg1) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class363();
            var10.field4978 = arg5;
            var10.field4972 = arg6;
            var10.field4976 = arg3;
            var10.field4983 = arg1;
            class192.method1098(2, var10);
            class78.field1054.method641(var10, (byte) -93);
        }
        var10.field4986 = arg4;
        var10.field4970 = arg2;
        var10.field4971 = arg0;
        var10.field4980 = arg7;
        var10.field4977 = arg8;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(III)Lut;")
    private final class71 method2517(int arg0, int arg1, int arg2) {
        field5760++;
        class71 var4 = (class71) this.field5754.method1528((long) arg1, 113);
        if (var4 != null && arg2 == 0 && !var4.field976 && var4.field973) {
            var4.method2614((byte) -71);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field5769 == null || this.field5758[arg1] == -1) {
                    if (this.field5761.method1375(20)) {
                        return null;
                    }
                    var4 = this.field5761.method1373(true, this.field5743, (byte) 24, (byte) 2, arg1);
                } else {
                    var4 = this.field5750.method21(arg1, (byte) -96, this.field5769);
                }
            } else if (arg2 == 1) {
                if (this.field5769 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field5750.method22(arg1, this.field5769, true);
            } else if (arg2 == 2) {
                if (this.field5769 == null) {
                    throw new RuntimeException();
                }
                if (this.field5758[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field5761.method1367(false)) {
                    return null;
                }
                var4 = this.field5761.method1373(false, this.field5743, (byte) 24, (byte) 2, arg1);
            } else {
                throw new RuntimeException();
            }
            this.field5754.method1525((byte) 19, var4, (long) arg1);
        }
        if (var4.field973) {
            return null;
        }
        int var5 = -102 / ((arg0 + 13) / 53);
        byte[] var6 = var4.method447((byte) -125);
        if (!var4 instanceof class289) {
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class96.field1412.reset();
                class96.field1412.update(var6, 0, var6.length - 2);
                int var10 = (int) class96.field1412.getValue();
                if (this.field5763.field844[arg1] != var10) {
                    throw new RuntimeException();
                }
                this.field5761.field3280 = 0;
                this.field5761.field3278 = 0;
            } catch (RuntimeException var13) {
                this.field5761.method1374((byte) 67);
                var4.method2614((byte) -87);
                if (var4.field976 && !this.field5761.method1375(20)) {
                    class67 var11 = this.field5761.method1373(true, this.field5743, (byte) 24, (byte) 2, arg1);
                    this.field5754.method1525((byte) 19, var11, (long) arg1);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field5763.field838[arg1] >>> 8);
            var6[var6.length - 1] = (byte) this.field5763.field838[arg1];
            if (this.field5769 != null) {
                this.field5750.method24(var6, arg1, this.field5769, 57);
                if (this.field5758[arg1] != 1) {
                    this.field5767++;
                    this.field5758[arg1] = 1;
                }
            }
            if (!var4.field976) {
                var4.method2614((byte) -69);
            }
            return var4;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class96.field1412.reset();
            class96.field1412.update(var6, 0, var6.length - 2);
            int var7 = (int) class96.field1412.getValue();
            if (this.field5763.field844[arg1] != var7) {
                throw new RuntimeException();
            }
            int var8 = (var6[var6.length - 2] & 0xFF << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field5763.field838[arg1] & 0xFFFF) != var8) {
                throw new RuntimeException();
            }
            if (this.field5758[arg1] != 1) {
                this.field5767++;
                this.field5758[arg1] = 1;
            }
            if (!var4.field976) {
                var4.method2614((byte) -100);
            }
            return var4;
        } catch (Exception var12) {
            this.field5758[arg1] = -1;
            var4.method2614((byte) -68);
            if (var4.field976 && !this.field5761.method1375(20)) {
                class67 var9 = this.field5761.method1373(true, this.field5743, (byte) 24, (byte) 2, arg1);
                this.field5754.method1525((byte) 19, var9, (long) arg1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V")
    public final void method473(int arg0, int arg1) {
        field5770++;
        if (arg1 != -20252) {
            this.field5777 = 69L;
        }
        if (this.field5769 == null) {
            return;
        }
        for (class445 var3 = this.field5773.method652((byte) 37); var3 != null; var3 = this.field5773.method653(arg1 + 20266)) {
            if (((long) arg0) == var3.field6047) {
                return;
            }
        }
        class445 var4 = new class445();
        var4.field6047 = (long) arg0;
        this.field5773.method641(var4, (byte) -93);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)I")
    public final int method475(int arg0, byte arg1) {
        field5757++;
        int var3 = 91 / ((46 - arg1) / 61);
        class71 var4 = (class71) this.field5754.method1528((long) arg0, 101);
        return var4 == null ? 0 : var4.method448(64);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)Lra;")
    public final class63 method472(boolean arg0) {
        field5744++;
        if (!arg0) {
            return null;
        } else if (this.field5763 == null) {
            if (this.field5753 == null) {
                if (this.field5761.method1375(20)) {
                    return null;
                }
                this.field5753 = this.field5761.method1373(true, 255, (byte) 24, (byte) 0, this.field5743);
            }
            if (this.field5753.field973) {
                return null;
            }
            byte[] var2 = this.field5753.method447((byte) -122);
            if (this.field5753 instanceof class289) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field5763 = new class63(var2, this.field5745);
                    if (this.field5763.field829 != this.field5765) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field5763 = null;
                    if (this.field5761.method1375(20)) {
                        this.field5753 = null;
                    } else {
                        this.field5753 = this.field5761.method1373(true, 255, (byte) 24, (byte) 0, this.field5743);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field5763 = new class63(var2, this.field5745);
                } catch (RuntimeException var4) {
                    this.field5761.method1374((byte) 106);
                    this.field5763 = null;
                    if (this.field5761.method1375(20)) {
                        this.field5753 = null;
                    } else {
                        this.field5753 = this.field5761.method1373(true, 255, (byte) 24, (byte) 0, this.field5743);
                    }
                    return null;
                }
                if (this.field5759 != null) {
                    this.field5750.method24(var2, this.field5743, this.field5759, 115);
                }
            }
            this.field5753 = null;
            if (this.field5769 != null) {
                this.field5767 = 0;
                this.field5758 = new byte[this.field5763.field841];
            }
            return this.field5763;
        } else {
            return this.field5763;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(ILrq;Lrq;Lpp;Lro;IIZ)V")
    public class425(int arg0, class213 arg1, class213 arg2, class245 arg3, class2 arg4, int arg5, int arg6, boolean arg7) {
        this.field5769 = arg1;
        this.field5743 = arg0;
        if (this.field5769 == null) {
            this.field5775 = false;
        } else {
            this.field5775 = true;
            this.field5772 = new class105();
        }
        this.field5765 = arg6;
        this.field5776 = arg7;
        this.field5759 = arg2;
        this.field5761 = arg3;
        this.field5750 = arg4;
        this.field5745 = arg5;
        if (this.field5759 != null) {
            this.field5753 = this.field5750.method21(this.field5743, (byte) -121, this.field5759);
        }
    }
}
