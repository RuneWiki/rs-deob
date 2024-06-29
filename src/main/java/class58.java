import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class58 extends class331 implements class289 {

    @OriginalMember(owner = "client!eda", name = "D", descriptor = "Z")
    private boolean field805;

    @OriginalMember(owner = "client!eda", name = "C", descriptor = "Z")
    private boolean field804;

    @OriginalMember(owner = "client!eda", name = "K", descriptor = "B")
    private byte field811;

    @OriginalMember(owner = "client!eda", name = "I", descriptor = "B")
    private byte field809;

    @OriginalMember(owner = "client!eda", name = "z", descriptor = "S")
    private short field801;

    @OriginalMember(owner = "client!eda", name = "E", descriptor = "Z")
    private boolean field806;

    @OriginalMember(owner = "client!eda", name = "n", descriptor = "Z")
    private boolean field789;

    @OriginalMember(owner = "client!eda", name = "H", descriptor = "Lba;")
    private class629 field808;

    @OriginalMember(owner = "client!eda", name = "m", descriptor = "Lw;")
    private class451 field788;

    @OriginalMember(owner = "client!eda", name = "J", descriptor = "Ljn;")
    public static class562 field810 = new class562(8);

    @OriginalMember(owner = "client!eda", name = "P", descriptor = "I")
    public static int field816 = -1;

    @OriginalMember(owner = "client!eda", name = "R", descriptor = "[I")
    public static int[] field818 = new int[13];

    @OriginalMember(owner = "client!eda", name = "o", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!eda", name = "p", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!eda", name = "q", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!eda", name = "r", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!eda", name = "s", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!eda", name = "t", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!eda", name = "u", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!eda", name = "v", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!eda", name = "w", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!eda", name = "x", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!eda", name = "y", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!eda", name = "A", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!eda", name = "F", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!eda", name = "L", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!eda", name = "M", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!eda", name = "N", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!eda", name = "O", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!eda", name = "Q", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!eda", name = "S", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!eda", name = "B", descriptor = "Lvg;")
    private class162 field803;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z)Z")
    public final boolean method122(boolean arg0) {
        if (arg0) {
            this.field811 = -6;
        }
        ++field790;
        return this.field789;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lbo;ILoa;IIIZ)V")
    public final void method133(class631 arg0, int arg1, class689 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg4 != -8763) {
            this.method123((byte) 53, (class689) null);
        }
        if (arg0 instanceof class58) {
            class58 var8 = (class58) arg0;
            if (this.field808 != null && var8.field808 != null) {
                this.field808.method646(var8.field808, arg3, arg1, arg5, arg6);
            }
        }
        ++field799;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(BLoa;)Lvg;")
    public final class162 method134(byte arg0, class689 arg1) {
        if (arg0 <= 121) {
            return null;
        } else {
            ++field815;
            if (this.field803 == null) {
                this.field803 = class440.method2525(255, this.method364(0, arg1, true), super.field4847, super.field4844, super.field4845);
            }
            return this.field803;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILoa;)V")
    public final void method131(int arg0, class689 arg1) {
        ++field792;
        Object var3 = null;
        if (arg0 == -20929) {
            class451 var5;
            if (this.field788 == null && this.field789) {
                class72 var4 = this.method361(arg1, true, true, 262144);
                var5 = var4 != null ? var4.field932 : null;
            } else {
                var5 = this.field788;
                this.field788 = null;
            }
            if (var5 != null) {
                class477.method2673(var5, this.field811, super.field4847, super.field4845, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IZIBZII)V")
    public static final void method360(int arg0, boolean arg1, int arg2, byte arg3, boolean arg4, int arg5, int arg6) {
        if (arg3 == -121) {
            ++field812;
            if (arg6 < arg0) {
                int var7 = (arg0 + arg6) / 2;
                int var8 = arg6;
                class40 var9 = class375.field5394[var7];
                class375.field5394[var7] = class375.field5394[arg0];
                class375.field5394[arg0] = var9;
                for (int var10 = arg6; ~arg0 < ~var10; ++var10) {
                    if (~class140.method970((byte) 120, arg1, arg2, class375.field5394[var10], var9, arg5, arg4) >= -1) {
                        class40 var11 = class375.field5394[var10];
                        class375.field5394[var10] = class375.field5394[var8];
                        class375.field5394[var8++] = var11;
                    }
                }
                class375.field5394[arg0] = class375.field5394[var8];
                class375.field5394[var8] = var9;
                method360(var8 + -1, arg1, arg2, (byte) -121, arg4, arg5, arg6);
                method360(arg0, arg1, arg2, (byte) -121, arg4, arg5, var8 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "(I)V")
    public final void method127(int arg0) {
        ++field798;
        this.field804 = false;
        if (arg0 >= 118) {
            if (this.field808 != null) {
                this.field808.method655(-65537 & this.field808.method688());
            }
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Loa;ZZI)Ltaa;")
    private final class72 method361(class689 arg0, boolean arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.field811 = 74;
        }
        ++field793;
        class252 var5 = class578.field7980.method1746(this.field801 & 65535, (byte) 91);
        class176 var6;
        class176 var7;
        if (!this.field806) {
            var6 = class249.field3345[this.field811];
            if (this.field811 >= 3) {
                var7 = null;
            } else {
                var7 = class249.field3345[this.field811 + 1];
            }
        } else {
            var6 = class185.field2270[this.field811];
            var7 = class249.field3345[0];
        }
        return var5.method1564(var6, 22, super.field4847, this.field809, 31302, arg0, super.field4845, arg1, super.field4844, var7, arg3);
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(BLoa;)V")
    public final void method123(byte arg0, class689 arg1) {
        ++field813;
        if (arg0 <= 91) {
            this.field803 = null;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Loa;B)Llt;")
    public final class95 method136(class689 arg0, byte arg1) {
        ++field800;
        if (this.field808 == null) {
            return null;
        } else {
            if (arg1 >= -47) {
                this.method128((byte) 96);
            }
            class111 var3 = arg0.method1972();
            var3.method609(super.field4847, super.field4844, super.field4845);
            class95 var4 = null;
            if (this.field805) {
                var4 = class429.method2472(1, (byte) -67);
            }
            this.field808.method665(var3, var4 != null ? var4.field1175[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!eda", name = "g", descriptor = "(I)V")
    public static void method362(int arg0) {
        field810 = null;
        field818 = null;
        if (arg0 != 0) {
            method360(77, false, 32, (byte) 43, false, 41, 69);
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)I")
    public final int method126(int arg0) {
        ++field795;
        return arg0 != 20377 ? 12 : this.field809;
    }

    @OriginalMember(owner = "client!eda", name = "e", descriptor = "(I)Z")
    public final boolean method135(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field796;
            return this.field804;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIILoa;)Z")
    public final boolean method137(int arg0, int arg1, int arg2, class689 arg3) {
        if (arg2 < 117) {
            this.method122(false);
        }
        ++field802;
        class629 var5 = this.method364(131072, arg3, true);
        if (var5 != null) {
            class111 var6 = arg3.method1972();
            var6.method609(super.field4847, super.field4844, super.field4845);
            return var5.method695(arg0, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Loa;Luca;IIIIZIZ)V")
    public class58(class689 arg0, class252 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field3481, arg1.field3430, arg1.field3484);
        this.field805 = ~arg1.field3453 != -1 && !arg6;
        super.field4845 = arg5;
        this.field804 = arg8;
        this.field811 = (byte) arg2;
        this.field809 = (byte) arg7;
        this.field801 = (short) arg1.field3456;
        this.field806 = arg6;
        super.field4847 = arg3;
        this.field789 = arg0.method1976() && arg1.field3413 && !this.field806 && class72.field935.method2693(class161.field2038, (byte) 91) != 0;
        int var10 = 2048;
        if (this.field804) {
            var10 |= 65536;
        }
        class72 var11 = this.method361(arg0, this.field789, true, var10);
        if (var11 != null) {
            this.field808 = var11.field934;
            this.field788 = var11.field932;
            if (this.field804) {
                this.field808 = this.field808.method659((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)I")
    public final int method128(byte arg0) {
        ++field817;
        if (arg0 < 35) {
            this.field808 = null;
        }
        return 22;
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(B)Ldf;")
    public static final class544 method363(byte arg0) {
        ++field807;
        return arg0 <= 3 ? null : class413.method2419(-53, 1);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IILoa;)Lba;")
    public final class629 method124(int arg0, int arg1, class689 arg2) {
        ++field797;
        if (arg1 != 17925) {
            this.method137(105, 99, 6, (class689) null);
        }
        return this.method364(arg0, arg2, true);
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(ILoa;)V")
    public final void method129(int arg0, class689 arg1) {
        ++field791;
        Object var3 = null;
        class451 var5;
        if (this.field788 == null && this.field789) {
            class72 var4 = this.method361(arg1, true, true, 262144);
            var5 = var4 != null ? var4.field932 : null;
        } else {
            var5 = this.field788;
            this.field788 = null;
        }
        if (var5 != null) {
            class105.method564(var5, this.field811, super.field4847, super.field4845, (boolean[]) null);
        }
        if (arg0 != 27921) {
            this.method133((class631) null, 93, (class689) null, 44, 25, 70, false);
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILoa;Z)Lba;")
    private final class629 method364(int arg0, class689 arg1, boolean arg2) {
        ++field819;
        if (this.field808 != null && arg1.method2007(this.field808.method688(), arg0) == 0) {
            return this.field808;
        } else {
            class72 var4 = this.method361(arg1, false, arg2, arg0);
            return var4 == null ? null : var4.field934;
        }
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(Z)V")
    public final void method132(boolean arg0) {
        if (this.field808 != null) {
            this.field808.method647();
        }
        if (!arg0) {
            this.method361((class689) null, false, true, -20);
        }
        ++field814;
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(I)I")
    public final int method130(int arg0) {
        ++field794;
        if (arg0 != -5582) {
            this.method128((byte) 82);
        }
        return this.field801 & 65535;
    }
}
