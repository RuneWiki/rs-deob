import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "Z")
    private boolean field24 = false;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "Z")
    private boolean field16 = false;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    private int field21 = -1;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    private int field18 = -32768;

    @OriginalMember(owner = "client!ro", name = "K", descriptor = "I")
    private int field44 = -1;

    @OriginalMember(owner = "client!ro", name = "x", descriptor = "I")
    private int field31;

    @OriginalMember(owner = "client!ro", name = "y", descriptor = "I")
    private int field32;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "client!ro", name = "w", descriptor = "B")
    private byte field30;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "client!ro", name = "F", descriptor = "I")
    public int field39;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "B")
    private byte field22;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "Z")
    private boolean field25;

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "I")
    public static int field33 = -1;

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "[S")
    public static short[] field28 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
    private int field27;

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ro", name = "A", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ro", name = "B", descriptor = "I")
    private int field35;

    @OriginalMember(owner = "client!ro", name = "C", descriptor = "I")
    private int field36;

    @OriginalMember(owner = "client!ro", name = "D", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ro", name = "E", descriptor = "I")
    private int field38;

    @OriginalMember(owner = "client!ro", name = "H", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ro", name = "J", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ro", name = "I", descriptor = "Ljl;")
    private class168 field42;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "Lss;")
    private class283 field10;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "Lva;")
    private class327 field8;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "Lko;")
    public class332 field15;

    @OriginalMember(owner = "client!ro", name = "G", descriptor = "[Z")
    private boolean[] field40;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLeq;)V")
    public final void method4(byte arg0, class134 arg1) {
        if (this.field10 != null) {
            class458.method2666(this.field10, this.field30, this.field32, this.field31, this.field40);
            this.field10 = null;
            this.field40 = null;
        }
        if (arg0 > -27) {
            this.method12((byte) 58);
        }
        field37++;
    }

    @OriginalMember(owner = "client!ro", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field15 != null) {
            this.field15.method2007();
        }
        field20++;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)V")
    private final void method5(int arg0, int arg1) {
        field26++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class486 var5 = class114.field1471.method2132((byte) 120, this.field12);
            class486 var6 = var5;
            if (var5.field7043 != null) {
                var5 = var5.method2834(class453.field6591, false);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field7072 != null) {
                if (this.field42 != null && var5.method2835(this.field42.field2202, (byte) 76)) {
                    return;
                }
                var3 = var5.method2841(-122);
                if (this.field21 != var5.field7046) {
                    var4 = var5.field7098;
                }
            } else if (var5.field7029 == -1) {
                if (var6 != null && var6.field7072 != null) {
                    if (this.field42 != null && var6.method2835(this.field42.field2202, (byte) 109)) {
                        return;
                    }
                    var3 = var6.method2841(-114);
                    if (this.field21 != var6.field7046) {
                        var4 = var6.field7098;
                    }
                } else if (var6 != null && var6.field7029 != -1 && this.field21 != var6.field7046) {
                    var3 = var6.field7029;
                    var4 = var6.field7098;
                }
            } else if (this.field21 != var5.field7046) {
                var3 = var5.field7029;
                var4 = var5.field7098;
            }
        }
        if (var3 == -1) {
            this.field42 = null;
            return;
        }
        this.field8 = null;
        if (this.field42 == null || this.field42.field2202 != var3) {
            this.field42 = class286.field4083.method2602(-24462, var3);
        } else if (this.field42.field2221 == 0) {
            return;
        }
        if (this.field42.field2219 == null) {
            this.field42 = null;
            return;
        }
        if (var4) {
            this.field38 = (int) ((double) this.field42.field2219.length * Math.random());
            this.field36 = ((int) ((double) this.field42.field2205[this.field38] * Math.random())) + 1;
        } else {
            this.field36 = 1;
            this.field38 = 0;
        }
        this.field27 = this.field38 + 1;
        if (this.field27 < 0 || this.field42.field2219.length <= this.field27) {
            this.field27 = -1;
        }
        int var7 = -80 % ((arg0 - 65) / 38);
        this.field35 = class263.field3748 - this.field36;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method6(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var7 = 3 % ((-arg5 - 70) / 49);
        field41++;
        if (arg3 - arg0 >= class473.field6839 && (arg3 + arg0) <= class63.field933 && arg4 - arg0 >= class7.field131 && class92.field1252 >= (arg4 + arg0)) {
            class134.method824(arg6, arg4, arg2, (byte) 59, arg3, arg0, arg1);
        } else {
            class451.method2627(arg1, arg3, arg6, 100, arg4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Leq;B)V")
    public final void method7(class134 arg0, byte arg1) {
        this.method16(this.field31, -1, this.field32, arg0, true, 262144, true);
        field34++;
        int var3 = 108 / ((75 - arg1) / 33);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZI)V")
    public final void method8(boolean arg0, int arg1) {
        field43++;
        if (!arg0) {
            this.field24 = true;
            this.method5(112, arg1);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
    public static final void method9(byte arg0) {
        if (arg0 != -48) {
            method15((byte) 9, -81, true, -110);
        }
        field17++;
        int var1 = class118.field1533.method2959(0, class293.field4174);
        if (var1 == 0) {
            class449.field6546 = null;
            class3.method19(73, 0);
        } else if (var1 == 1) {
            class284.method1722((byte) 0, true);
            class3.method19(108, 512);
            if (class379.field5661 != null) {
                class430.method2554(-29907);
            }
        } else {
            class284.method1722((byte) (class287.field4103 - 4 & 0xFF), true);
            class3.method19(125, 2);
        }
        class503.field7680 = class355.field5121;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public static void method10(int arg0) {
        if (arg0 < -50) {
            field28 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)V")
    private final void method11(int arg0, int arg1, int arg2) {
        field19++;
        if (arg2 != -1) {
            return;
        }
        label90: while (true) {
            if (this.field42 == null) {
                if (this.field24) {
                    return;
                }
                this.method5(127, -1);
                if (this.field42 == null) {
                    return;
                }
            }
            int var4 = class263.field3748 - this.field35;
            if (var4 > 100 && this.field42.field2210 > 0) {
                int var5 = this.field42.field2219.length - this.field42.field2210;
                while (var5 > this.field38 && this.field42.field2205[this.field38] < var4) {
                    var4 -= this.field42.field2205[this.field38];
                    this.field38++;
                }
                if (this.field38 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field42.field2219.length; var7++) {
                        var6 += this.field42.field2205[var7];
                    }
                    var4 %= var6;
                }
                this.field27 = this.field38 + 1;
                if (this.field27 >= this.field42.field2219.length) {
                    this.field27 -= this.field42.field2210;
                    if (this.field27 < 0 || this.field27 >= this.field42.field2219.length) {
                        this.field27 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field42.field2205[this.field38]) {
                            this.field35 = class263.field3748 - var4;
                            this.field36 = var4;
                            return;
                        }
                        class204.method1258(-1, this.field38, arg1, false, this.field42, arg0, this.field22);
                        var4 -= this.field42.field2205[this.field38];
                        this.field38++;
                        if (this.field38 >= this.field42.field2219.length) {
                            this.field38 -= this.field42.field2210;
                            if (this.field38 < 0 || this.field42.field2219.length <= this.field38) {
                                this.field42 = null;
                                continue label90;
                            }
                        }
                        this.field27 = this.field38 + 1;
                    } while (this.field42.field2219.length > this.field27);
                    this.field27 -= this.field42.field2210;
                } while (this.field27 >= 0 && this.field42.field2219.length > this.field27);
                this.field27 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)I")
    public final int method12(byte arg0) {
        field13++;
        int var2 = -29 % ((-arg0 - 18) / 51);
        return this.field18;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lva;IIIZILeq;I)V")
    public final void method13(class327 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class134 arg6, int arg7) {
        field29++;
        class56[] var9 = arg0.method203();
        if (arg1 != -32533) {
            method6(47, 114, 52, 51, 89, (byte) -81, 80);
        }
        class339[] var10 = arg0.method185();
        if ((this.field15 == null || this.field15.field4820) && (var9 != null || var10 != null)) {
            class486 var11 = class114.field1471.method2132((byte) 124, this.field12);
            if (var11.field7043 != null) {
                var11 = var11.method2834(class453.field6591, false);
            }
            if (var11 != null) {
                this.field15 = new class332(class263.field3748);
            }
        }
        if (this.field15 == null) {
            return;
        }
        if (arg4) {
            this.field15.method2003(arg6, (long) class263.field3748, var9, var10, false);
        } else {
            this.field15.method2006((long) class263.field3748);
        }
        this.field15.method2010(this.field22, arg5, arg3, arg2, arg7);
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(B)Z")
    public final boolean method14(byte arg0) {
        field14++;
        return arg0 <= 79 ? true : this.field25;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BIZI)Ljava/lang/String;")
    public static final String method15(byte arg0, int arg1, boolean arg2, int arg3) {
        field11++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg2 && arg1 >= 0) {
            int var4 = 2;
            for (int var5 = arg1 / arg3; var5 != 0; var5 /= arg3) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            if (arg0 <= 59) {
                field33 = -21;
            }
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg3;
                int var9 = var8 - (arg1 * arg3);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIILeq;ZIZ)Lva;")
    public final class327 method16(int arg0, int arg1, int arg2, class134 arg3, boolean arg4, int arg5, boolean arg6) {
        field23++;
        class486 var8 = class114.field1471.method2132((byte) 123, this.field12);
        if (var8.field7043 != null) {
            var8 = var8.method2834(class453.field6591, false);
        }
        if (var8 == null) {
            this.method4((byte) -112, arg3);
            this.field44 = this.field38;
            this.field21 = -1;
            return null;
        }
        if (!this.field24 && this.field21 != var8.field7046) {
            this.field8 = null;
            this.method5(121, -1);
        }
        this.method11(arg0, arg2, arg1);
        boolean var9 = arg6 & this.field25 & class118.field1533.field6901 != 0;
        boolean var10 = var9 & (this.field21 != var8.field7046 || (this.field44 != this.field38 || this.field42 != null && (this.field42.field2212 || class360.field5338) && this.field38 != this.field27) && class118.field1533.field6901 >= 2);
        if (arg4 && !var10) {
            this.field44 = this.field38;
            this.field21 = var8.field7046;
            return null;
        }
        if (var10) {
            class458.method2666(this.field10, this.field30, this.field32, this.field31, this.field40);
        }
        class441 var11 = class311.field4527[this.field30];
        class441 var12;
        if (this.field16) {
            var12 = class459.field6685[0];
        } else {
            var12 = this.field30 < 3 ? class311.field4527[this.field30 + 1] : null;
        }
        class327 var13 = null;
        if (this.field42 != null) {
            if (var10) {
                arg5 |= 0x40000;
            }
            var13 = var8.method2832(var11, this.field36, var11.method855(this.field32, this.field31), this.field42, this.field38, this.field27, this.field9 == 11 ? 10 : this.field9, arg5, this.field31, arg3, this.field9 == 11 ? this.field39 + 4 : this.field39, var12, (byte) -85, this.field32);
            if (var13 == null) {
                this.field10 = null;
                this.field40 = null;
                this.field18 = 0;
            } else {
                if (var10) {
                    if (this.field40 == null) {
                        this.field40 = new boolean[4];
                    }
                    this.field10 = var13.method181(this.field10);
                    class484.method2821(this.field10, this.field30, arg2, arg0, this.field40);
                }
                this.field18 = var13.method195();
            }
            this.field8 = null;
        } else if (this.field8 != null && (arg5 & this.field8.method200()) == arg5 && this.field21 == var8.field7046) {
            var13 = this.field8;
        } else {
            if (this.field8 != null) {
                arg5 |= this.field8.method200();
            }
            class107 var14 = var8.method2836(var12, var11, this.field32, this.field31, arg5, var11.method855(this.field32, this.field31), this.field9 == 11 ? 10 : this.field9, var10, this.field9 == 11 ? this.field39 + 4 : this.field39, arg3, (byte) 68);
            if (var14 == null) {
                this.field18 = 0;
                this.field40 = null;
                this.field8 = null;
                this.field10 = null;
            } else {
                var13 = var14.field1435;
                this.field8 = var14.field1435;
                if (var10) {
                    this.field40 = null;
                    this.field10 = var14.field1436;
                    class484.method2821(this.field10, this.field30, arg2, arg0, null);
                }
                this.field18 = var13.method195();
            }
        }
        this.field31 = arg0;
        this.field44 = this.field38;
        this.field21 = var8.field7046;
        this.field32 = arg2;
        return var13;
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Leq;Lhn;IIIIIIZI)V")
    public class2(class134 arg0, class486 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field31 = arg7;
        this.field32 = arg6;
        this.field16 = arg8;
        this.field9 = arg2;
        this.field30 = (byte) arg5;
        this.field12 = arg1.field7046;
        this.field39 = arg3;
        this.field22 = (byte) arg4;
        this.field25 = arg0.method761() && arg1.field7091 && !this.field16;
        if (arg9 != -1) {
            this.field24 = true;
        }
        this.method5(121, arg9);
    }
}
