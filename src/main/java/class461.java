import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class461 {

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Z")
    private boolean field6830 = false;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
    private int field6855 = -32768;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Z")
    private boolean field6840 = false;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    private int field6852 = -1;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    private int field6848 = -1;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    private int field6850;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public int field6843;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "B")
    private byte field6846;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "B")
    private byte field6836;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public int field6842;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public int field6856;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    private int field6835;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Z")
    private boolean field6838;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
    public static int field6857 = 0;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "F")
    public static float field6827;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    private int field6826;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    private int field6831;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    private int field6832;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
    private int field6853;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lcc;")
    public class122 field6824;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Lsq;")
    private class145 field6839;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "Li;")
    private class515 field6841;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "Le;")
    private class530 field6845;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "[Z")
    private boolean[] field6847;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lza;IILe;IIIZ)V")
    public final void method2744(class491 arg0, int arg1, int arg2, class530 arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field6837++;
        class345[] var9 = arg3.method777();
        class150[] var10 = arg3.method727();
        if ((this.field6824 == null || this.field6824.field2134) && (var9 != null || var10 != null)) {
            class39 var11 = class61.field928.method791(this.field6843, true);
            if (var11.field575 != null) {
                var11 = var11.method296(-1008, class327.field5160);
            }
            if (var11 != null) {
                this.field6824 = new class122(class504.field7348);
            }
        }
        if (arg6 != -1) {
            this.method2750(null, (byte) -67);
        }
        if (this.field6824 == null) {
            return;
        }
        if (arg7) {
            this.field6824.method960(arg0, (long) class504.field7348, var9, var10, false);
        } else {
            this.field6824.method967((long) class504.field7348);
        }
        this.field6824.method971(this.field6836, arg2, arg4, arg5, arg1);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
    public final void method2745(int arg0, int arg1) {
        this.field6840 = true;
        field6851++;
        if (arg1 != 100) {
            field6827 = -0.24901058F;
        }
        this.method2749(0, arg0);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBLza;IZIZ)Le;")
    public final class530 method2746(int arg0, byte arg1, class491 arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        if (arg1 > -110) {
            this.method2745(-109, 57);
        }
        field6829++;
        class39 var8 = class61.field928.method791(this.field6843, true);
        if (var8.field575 != null) {
            var8 = var8.method296(-1008, class327.field5160);
        }
        if (var8 == null) {
            this.method2750(arg2, (byte) 121);
            this.field6848 = -1;
            this.field6852 = this.field6853;
            return null;
        }
        if (!this.field6840 && this.field6848 != var8.field587) {
            this.field6845 = null;
            this.method2749(0, -1);
        }
        this.method2747(arg5, (byte) 51, arg0);
        boolean var9 = arg4 & this.field6838 & class510.field7403.method2041(118, class511.field7485) != 0;
        boolean var10 = var9 & (this.field6848 != var8.field587 || (this.field6853 != this.field6852 || this.field6839 != null && (this.field6839.field2357 || class230.field4004) && this.field6853 != this.field6826) && class510.field7403.method2041(121, class511.field7485) >= 2);
        if (arg6 && !var10) {
            this.field6852 = this.field6853;
            this.field6848 = var8.field587;
            return null;
        }
        if (var10) {
            class335.method2114(this.field6841, this.field6846, this.field6850, this.field6835, this.field6847);
        }
        class220 var11 = class360.field5592[this.field6846];
        class220 var12;
        if (this.field6830) {
            var12 = class511.field7488[0];
        } else {
            var12 = this.field6846 >= 3 ? null : class360.field5592[this.field6846 + 1];
        }
        class530 var13 = null;
        if (this.field6839 != null) {
            if (var10) {
                arg3 |= 0x40000;
            }
            var13 = var8.method299((byte) 18, this.field6853, this.field6856 == 11 ? this.field6842 + 4 : this.field6842, this.field6831, var12, var11, this.field6826, this.field6839, var11.method1517(this.field6850, this.field6835), this.field6835, this.field6850, arg2, arg3, this.field6856 == 11 ? 10 : this.field6856);
            if (var13 == null) {
                this.field6855 = 0;
                this.field6841 = null;
                this.field6847 = null;
            } else {
                if (var10) {
                    if (this.field6847 == null) {
                        this.field6847 = new boolean[4];
                    }
                    this.field6841 = var13.method774(this.field6841);
                    class219.method1506(this.field6841, this.field6846, arg0, arg5, this.field6847);
                }
                this.field6855 = var13.method726();
            }
            this.field6845 = null;
        } else if (this.field6845 != null && (arg3 & this.field6845.method741()) == arg3 && this.field6848 == var8.field587) {
            var13 = this.field6845;
        } else {
            if (this.field6845 != null) {
                arg3 |= this.field6845.method741();
            }
            class489 var14 = var8.method298(arg2, this.field6850, var11, this.field6835, var10, arg3, this.field6856 == 11 ? 10 : this.field6856, var11.method1517(this.field6850, this.field6835), var12, this.field6856 == 11 ? this.field6842 + 4 : this.field6842, 7280);
            if (var14 == null) {
                this.field6855 = 0;
                this.field6847 = null;
                this.field6841 = null;
                this.field6845 = null;
            } else {
                var13 = var14.field7150;
                this.field6845 = var14.field7150;
                if (var10) {
                    this.field6841 = var14.field7152;
                    this.field6847 = null;
                    class219.method1506(this.field6841, this.field6846, arg0, arg5, null);
                }
                this.field6855 = var13.method726();
            }
        }
        this.field6850 = arg0;
        this.field6848 = var8.field587;
        this.field6835 = arg5;
        this.field6852 = this.field6853;
        return var13;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBI)V")
    private final void method2747(int arg0, byte arg1, int arg2) {
        field6854++;
        if (arg1 <= 40) {
            this.field6853 = 107;
        }
        label90: while (true) {
            if (this.field6839 == null) {
                if (this.field6840) {
                    return;
                }
                this.method2749(0, -1);
                if (this.field6839 == null) {
                    return;
                }
            }
            int var4 = class504.field7348 - this.field6832;
            if (var4 > 100 && this.field6839.field2372 > 0) {
                int var5 = this.field6839.field2377.length - this.field6839.field2372;
                while (var5 > this.field6853 && this.field6839.field2375[this.field6853] < var4) {
                    var4 -= this.field6839.field2375[this.field6853];
                    this.field6853++;
                }
                if (var5 <= this.field6853) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field6839.field2377.length; var7++) {
                        var6 += this.field6839.field2375[var7];
                    }
                    var4 %= var6;
                }
                this.field6826 = this.field6853 + 1;
                if (this.field6826 >= this.field6839.field2377.length) {
                    this.field6826 -= this.field6839.field2372;
                    if (this.field6826 < 0 || this.field6839.field2377.length <= this.field6826) {
                        this.field6826 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field6839.field2375[this.field6853]) {
                            this.field6831 = var4;
                            this.field6832 = class504.field7348 - var4;
                            return;
                        }
                        class172.method1167(arg0, this.field6853, this.field6836, arg2, false, this.field6839, (byte) 32);
                        var4 -= this.field6839.field2375[this.field6853];
                        this.field6853++;
                        if (this.field6853 >= this.field6839.field2377.length) {
                            this.field6853 -= this.field6839.field2372;
                            if (this.field6853 < 0 || this.field6853 >= this.field6839.field2377.length) {
                                this.field6839 = null;
                                continue label90;
                            }
                        }
                        this.field6826 = this.field6853 + 1;
                    } while (this.field6826 < this.field6839.field2377.length);
                    this.field6826 -= this.field6839.field2372;
                } while (this.field6826 >= 0 && this.field6826 < this.field6839.field2377.length);
                this.field6826 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLza;)V")
    public final void method2748(byte arg0, class491 arg1) {
        if (arg0 <= 118) {
            this.field6836 = 115;
        }
        this.method2746(this.field6850, (byte) -115, arg1, 262144, true, this.field6835, true);
        field6833++;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)V")
    private final void method2749(int arg0, int arg1) {
        field6844++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class39 var5 = class61.field928.method791(this.field6843, true);
            class39 var6 = var5;
            if (var5.field575 != null) {
                var5 = var5.method296(-1008, class327.field5160);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field608 != null) {
                if (this.field6839 != null && var5.method290(this.field6839.field2361, 121)) {
                    return;
                }
                var3 = var5.method280(0);
                if (this.field6848 != var5.field587) {
                    var4 = var5.field634;
                }
            } else if (var5.field659 == -1) {
                if (var6 != null && var6.field608 != null) {
                    if (this.field6839 != null && var6.method290(this.field6839.field2361, 90)) {
                        return;
                    }
                    var3 = var6.method280(0);
                    if (this.field6848 != var6.field587) {
                        var4 = var6.field634;
                    }
                } else if (var6 != null && var6.field659 != -1 && this.field6848 != var6.field587) {
                    var3 = var6.field659;
                    var4 = var6.field634;
                }
            } else if (this.field6848 != var5.field587) {
                var4 = var5.field634;
                var3 = var5.field659;
            }
        }
        if (var3 == -1) {
            this.field6839 = null;
            return;
        }
        this.field6845 = null;
        if (this.field6839 == null || this.field6839.field2361 != var3) {
            this.field6839 = class130.field2232.method634(-1271654143, var3);
        } else if (this.field6839.field2367 == 0) {
            return;
        }
        if (this.field6839.field2377 == null) {
            this.field6839 = null;
            return;
        }
        if (var4) {
            this.field6853 = (int) ((double) this.field6839.field2377.length * Math.random());
            this.field6831 = (int) (Math.random() * (double) this.field6839.field2375[this.field6853]) + 1;
        } else {
            this.field6853 = 0;
            this.field6831 = 1;
        }
        this.field6826 = this.field6853 + 1;
        if (arg0 > this.field6826 || this.field6826 >= this.field6839.field2377.length) {
            this.field6826 = -1;
        }
        this.field6832 = class504.field7348 - this.field6831;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lza;B)V")
    public final void method2750(class491 arg0, byte arg1) {
        field6849++;
        if (this.field6841 != null) {
            class335.method2114(this.field6841, this.field6846, this.field6850, this.field6835, this.field6847);
            this.field6841 = null;
            this.field6847 = null;
        }
        if (arg1 != 121) {
            this.method2748((byte) 26, null);
        }
    }

    @OriginalMember(owner = "client!pe", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field6824 != null) {
            this.field6824.method962();
        }
        field6858++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Z")
    public final boolean method2751(int arg0) {
        if (arg0 >= -43) {
            return true;
        } else {
            field6828++;
            return this.field6838;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)I")
    public final int method2752(boolean arg0) {
        if (arg0) {
            this.method2748((byte) 121, null);
        }
        field6834++;
        return this.field6855;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lza;Lp;IIIIIIZI)V")
    public class461(class491 arg0, class39 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field6850 = arg6;
        this.field6843 = arg1.field587;
        this.field6830 = arg8;
        this.field6846 = (byte) arg5;
        this.field6836 = (byte) arg4;
        this.field6842 = arg3;
        this.field6856 = arg2;
        this.field6835 = arg7;
        this.field6838 = arg0.method841() && arg1.field655 && !this.field6830;
        if (arg9 != -1) {
            this.field6840 = true;
        }
        this.method2749(0, arg9);
    }
}
