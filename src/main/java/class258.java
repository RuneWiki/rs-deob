import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class258 {

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Z")
    private boolean field3734 = false;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    private int field3732 = -1;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "Z")
    private boolean field3754 = false;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    private int field3735 = 0;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    private int field3744 = 0;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    private int field3748 = -1;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    private int field3765 = -1;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "Lgs;")
    private class43 field3746;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public int field3757;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public int field3755;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "B")
    private byte field3745;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public int field3764;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "B")
    private byte field3743;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "Z")
    private boolean field3756;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field3741 = 0;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "D")
    public static double field3753;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    private int field3733;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    private int field3738;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    private int field3758;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    private int field3759;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lr;")
    private class181 field3731;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "Lka;")
    private class469 field3760;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "Lhn;")
    private class718 field3751;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Lf;")
    public class753 field3736;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "[Z")
    private boolean[] field3752;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILha;ZZ)Lka;")
    public final class469 method1747(int arg0, int arg1, class58 arg2, boolean arg3, boolean arg4) {
        if (arg1 != -1) {
            this.method1753(false);
        }
        field3749++;
        class414 var6 = class66.field1181.method131(arg1 + 3, this.field3764);
        if (var6.field5720 != null) {
            var6 = var6.method2513(class742.field10408, true);
        }
        if (var6 == null) {
            this.method1752(arg2, (byte) -45);
            this.field3765 = -1;
            this.field3732 = -1;
            this.field3748 = -1;
            return null;
        }
        if (!this.field3754 && this.field3748 != var6.field5711) {
            this.field3760 = null;
            this.method1750(arg1 + 2, -1);
        }
        this.method1756(this.field3746, (byte) -77);
        if (arg3) {
            boolean var7 = arg3 & this.field3756 & class471.field6781.field6689.method56(arg1 + 27670) != 0;
            arg3 = var7 & (this.field3765 != var6.field5711 || this.field3751 != null && class471.field6781.field6689.method56(27669) >= 2 && (this.field3738 != this.field3732 || (this.field3751.field10046 || class712.field9957) && this.field3738 != this.field3733));
        }
        if (arg4 && !arg3) {
            this.field3748 = var6.field5711;
            return null;
        }
        if (arg3) {
            class489.method2942(this.field3731, this.field3745, this.field3746.field644, this.field3746.field648, this.field3752);
            this.field3765 = -1;
            this.field3732 = -1;
        }
        class278 var8 = class138.field2153[this.field3745];
        class278 var9;
        if (this.field3734) {
            var9 = class173.field2511[0];
        } else {
            var9 = this.field3745 >= 3 ? null : class138.field2153[this.field3745 + 1];
        }
        class469 var10 = null;
        if (this.field3751 != null) {
            if (arg3) {
                arg0 |= 0x40000;
            }
            var10 = var6.method2526(this.field3758, 102, var9, this.field3733, this.field3738, this.field3751, arg0, this.field3746.field648, var8.method1827(-3458, this.field3746.field644, this.field3746.field648), this.field3757 == 11 ? 10 : this.field3757, var8, this.field3757 == 11 ? this.field3755 + 4 : this.field3755, arg2, this.field3746.field644);
            if (var10 == null) {
                this.field3735 = 0;
                this.field3731 = null;
                this.field3752 = null;
                this.field3744 = 0;
            } else {
                if (arg3) {
                    if (this.field3752 == null) {
                        this.field3752 = new boolean[4];
                    }
                    this.field3731 = var10.method340(this.field3731);
                    class299.method1928(this.field3731, this.field3745, this.field3746.field644, this.field3746.field648, this.field3752);
                    this.field3732 = this.field3738;
                    this.field3765 = var6.field5711;
                }
                this.field3735 = var10.method338();
                this.field3744 = var10.method324();
            }
            this.field3760 = null;
        } else if (this.field3760 != null && arg0 == (arg0 & this.field3760.method361()) && this.field3748 == var6.field5711) {
            var10 = this.field3760;
        } else {
            if (this.field3760 != null) {
                arg0 |= this.field3760.method361();
            }
            class244 var11 = var6.method2523(var9, var8, var8.method1827(-3458, this.field3746.field644, this.field3746.field648), arg3, 1, this.field3757 == 11 ? this.field3755 + 4 : this.field3755, this.field3746.field644, this.field3757 == 11 ? 10 : this.field3757, arg0, arg2, this.field3746.field648);
            if (var11 == null) {
                this.field3752 = null;
                this.field3760 = null;
                this.field3744 = 0;
                this.field3731 = null;
                this.field3735 = 0;
            } else {
                var10 = var11.field3407;
                this.field3760 = var11.field3407;
                if (arg3) {
                    this.field3731 = var11.field3404;
                    this.field3752 = null;
                    class299.method1928(this.field3731, this.field3745, this.field3746.field644, this.field3746.field648, null);
                    this.field3732 = -1;
                    this.field3765 = var6.field5711;
                }
                this.field3735 = var10.method338();
                this.field3744 = var10.method324();
            }
        }
        this.field3748 = var6.field5711;
        return var10;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)V")
    public final void method1748(byte arg0, int arg1) {
        int var3 = 65 % ((-arg0 - 76) / 47);
        this.field3754 = true;
        field3739++;
        this.method1750(1, arg1);
    }

    @OriginalMember(owner = "client!fc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field3736 != null) {
            this.field3736.method4179();
        }
        field3729++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI[B)Ljava/lang/String;")
    public static final String method1749(int arg0, byte arg1, int arg2, byte[] arg3) {
        field3762++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        if (arg1 <= 9) {
            return null;
        }
        int var6 = arg0;
        int var7 = arg0 + arg2;
        while (var6 < var7) {
            int var8 = arg3[var6++] & 0xFF;
            int var9;
            if (var8 < 128) {
                if (var8 == 0) {
                    var9 = 65533;
                } else {
                    var9 = var8;
                }
            } else if (var8 < 192) {
                var9 = 65533;
            } else if (var8 >= 224) {
                if (var8 >= 240) {
                    if (var8 >= 248) {
                        var9 = 65533;
                    } else if (var7 > var6 + 2 && (arg3[var6] & 0xC0) == 128 && (arg3[var6 + 1] & 0xC0) == 128 && (arg3[var6 + 2] & 0xC0) == 128) {
                        int var10 = arg3[var6++] & 0x3F << 12 | var8 << 18 & 0x1C0000 | arg3[var6++] & 0x3F << 6 | arg3[var6++] & 0x3F;
                        if (var10 >= 65536 && var10 <= 1114111) {
                            var9 = 65533;
                        } else {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var7 > (var6 + 1) && (arg3[var6] & 0xC0) == 128 && (arg3[var6 + 1] & 0xC0) == 128) {
                    var9 = (var8 & 0xF) << 12 | (arg3[var6++] & 0x3F) << 6 | arg3[var6++] & 0x3F;
                    if (var9 < 2048) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var7 > var6 && (arg3[var6] & 0xC0) == 128) {
                var9 = var8 & 0x1F << 6 | arg3[var6++] & 0x3F;
                if (var9 < 128) {
                    var9 = 65533;
                }
            } else {
                var9 = 65533;
            }
            var4[var5++] = (char) var9;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
    private final void method1750(int arg0, int arg1) {
        field3750++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class414 var5 = class66.field1181.method131(2, this.field3764);
            class414 var6 = var5;
            if (var5.field5720 != null) {
                var5 = var5.method2513(class742.field10408, true);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field5796 != null) {
                if (this.field3751 != null && var5.method2512(this.field3751.field10068, 180)) {
                    return;
                }
                var3 = var5.method2516(arg0 ^ 0x44);
                if (this.field3748 != var5.field5711) {
                    var4 = var5.field5734;
                }
            } else if (var5.field5802 == -1) {
                if (var6 != null && var6.field5796 != null) {
                    if (this.field3751 != null && var6.method2512(this.field3751.field10068, 180)) {
                        return;
                    }
                    var3 = var6.method2516(69);
                    if (this.field3748 != var6.field5711) {
                        var4 = var6.field5734;
                    }
                } else if (var6 != null && var6.field5802 != -1 && this.field3748 != var6.field5711) {
                    var3 = var6.field5802;
                    var4 = var6.field5734;
                }
            } else if (this.field3748 != var5.field5711) {
                var4 = var5.field5734;
                var3 = var5.field5802;
            }
        }
        if (var3 == -1) {
            this.field3751 = null;
            return;
        }
        this.field3760 = null;
        if (this.field3751 == null || this.field3751.field10068 != var3) {
            this.field3751 = class698.field9806.method851(var3, -2);
        } else if (this.field3751.field10061 == 0) {
            return;
        }
        if (this.field3751.field10053 == null) {
            this.field3751 = null;
            return;
        }
        if (var4) {
            this.field3738 = (int) ((double) this.field3751.field10053.length * Math.random());
            this.field3758 = ((int) ((double) this.field3751.field10048[this.field3738] * Math.random())) + 1;
        } else {
            this.field3758 = 1;
            this.field3738 = 0;
        }
        this.field3733 = this.field3738 + arg0;
        if (this.field3733 < 0 || this.field3733 >= this.field3751.field10053.length) {
            this.field3733 = -1;
        }
        this.field3759 = class605.field8787 - this.field3758;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lha;Z)V")
    public final void method1751(class58 arg0, boolean arg1) {
        this.method1747(262144, -1, arg0, arg1, true);
        field3761++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lha;B)V")
    public final void method1752(class58 arg0, byte arg1) {
        if (arg1 != -45) {
            this.field3735 = 54;
        }
        field3730++;
        if (this.field3731 != null) {
            class489.method2942(this.field3731, this.field3745, this.field3746.field644, this.field3746.field648, this.field3752);
            this.field3731 = null;
            this.field3752 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)Z")
    public final boolean method1753(boolean arg0) {
        if (arg0) {
            this.method1748((byte) 7, -60);
        }
        field3737++;
        return this.field3756;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILha;ILkd;ZIILka;I)V")
    public final void method1754(int arg0, class58 arg1, int arg2, class280 arg3, boolean arg4, int arg5, int arg6, class469 arg7, int arg8) {
        field3742++;
        class675[] var10 = arg7.method334();
        class206[] var11 = arg7.method336();
        if ((this.field3736 == null || this.field3736.field10494) && (var10 != null || var11 != null)) {
            class414 var12 = class66.field1181.method131(arg2 ^ 0xFFFFFF3D, this.field3764);
            if (var12.field5720 != null) {
                var12 = var12.method2513(class742.field10408, true);
            }
            if (var12 != null) {
                this.field3736 = class753.method4187(class605.field8787, true);
            }
        }
        if (this.field3736 != null) {
            arg7.method354(arg3);
            if (arg4) {
                this.field3736.method4183(arg1, (long) class605.field8787, var10, var11, false);
            } else {
                this.field3736.method4173((long) class605.field8787);
            }
            this.field3736.method4176(this.field3743, arg6, arg8, arg5, arg0);
        }
        if (arg2 != -193) {
            this.method1748((byte) -72, 29);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)I")
    public final int method1755(int arg0) {
        field3763++;
        if (arg0 != 1709088134) {
            this.field3758 = -59;
        }
        return this.field3735;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lgs;B)V")
    private final void method1756(class43 arg0, byte arg1) {
        field3740++;
        if (arg1 != -77) {
            this.method1752(null, (byte) -104);
        }
        label90: while (true) {
            if (this.field3751 == null) {
                if (this.field3754) {
                    return;
                }
                this.method1750(arg1 + 78, -1);
                if (this.field3751 == null) {
                    return;
                }
            }
            int var3 = class605.field8787 - this.field3759;
            if (var3 > 100 && this.field3751.field10043 > 0) {
                int var4 = this.field3751.field10053.length - this.field3751.field10043;
                while (var4 > this.field3738 && var3 > this.field3751.field10048[this.field3738]) {
                    var3 -= this.field3751.field10048[this.field3738];
                    this.field3738++;
                }
                if (this.field3738 >= var4) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field3751.field10053.length; var6++) {
                        var5 += this.field3751.field10048[var6];
                    }
                    var3 %= var5;
                }
                this.field3733 = this.field3738 + 1;
                if (this.field3733 >= this.field3751.field10053.length) {
                    this.field3733 -= this.field3751.field10043;
                    if (this.field3733 < 0 || this.field3733 >= this.field3751.field10053.length) {
                        this.field3733 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var3 <= this.field3751.field10048[this.field3738]) {
                            this.field3758 = var3;
                            this.field3759 = class605.field8787 - var3;
                            return;
                        }
                        class749.method4165(this.field3738, (byte) 123, this.field3751, arg0);
                        var3 -= this.field3751.field10048[this.field3738];
                        this.field3738++;
                        if (this.field3751.field10053.length <= this.field3738) {
                            this.field3738 -= this.field3751.field10043;
                            if (this.field3738 < 0 || this.field3751.field10053.length <= this.field3738) {
                                this.field3751 = null;
                                continue label90;
                            }
                        }
                        this.field3733 = this.field3738 + 1;
                    } while (this.field3733 < this.field3751.field10053.length);
                    this.field3733 -= this.field3751.field10043;
                } while (this.field3733 >= 0 && this.field3751.field10053.length > this.field3733);
                this.field3733 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)I")
    public final int method1757(boolean arg0) {
        if (arg0) {
            return -44;
        } else {
            field3747++;
            return this.field3744;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lha;Luw;IIIILgs;ZI)V")
    public class258(class58 arg0, class414 arg1, int arg2, int arg3, int arg4, int arg5, class43 arg6, boolean arg7, int arg8) {
        this.field3746 = arg6;
        this.field3757 = arg2;
        this.field3755 = arg3;
        this.field3745 = (byte) arg5;
        this.field3734 = arg7;
        this.field3764 = arg1.field5711;
        this.field3743 = (byte) arg4;
        this.field3756 = arg0.method550() && arg1.field5770 && !this.field3734;
        if (arg8 != -1) {
            this.field3754 = true;
        }
        this.method1750(1, arg8);
    }
}
