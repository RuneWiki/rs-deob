import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class51 extends class68 {

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    private int field818 = 0;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "Lfk;")
    private class144 field810 = new class144(16);

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    private int field822 = 0;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "Lmi;")
    private class12 field826 = new class12();

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "J")
    private long field828 = 0L;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    private int field800;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "Lhh;")
    private class80 field801;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "Z")
    private boolean field824;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "Lmi;")
    private class12 field823;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "Lnl;")
    private class279 field793;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    private int field797;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    private int field795;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "Lsk;")
    private class202 field802;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "Lhh;")
    private class80 field804;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "Z")
    private boolean field827;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "Lhe;")
    private class243 field794;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "Lmb;")
    public static class172 field803 = new class172(50);

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public static int field815 = 0;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "Loh;")
    public static class258 field817 = class153.method1046("::cardmem", 100);

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "Lmb;")
    public static class172 field819 = new class172(64);

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "Loh;")
    private static class258 field821 = class153.method1046(" from your ignore list first)3", 124);

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "Loh;")
    public static class258 field820 = field821;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "Lqf;")
    private class313 field813;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "Z")
    private boolean field825;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "[B")
    private byte[] field811;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V", line = 6)
    public final void method400(int arg0, int arg1) {
        field816++;
        int var3 = 0 % ((-arg1 - 39) / 50);
        if (this.field801 == null) {
            return;
        }
        for (class154 var4 = this.field826.method83(-73); var4 != null; var4 = this.field826.method87((byte) -80)) {
            if (((long) arg0) == var4.field2642) {
                return;
            }
        }
        class154 var5 = new class154();
        var5.field2642 = (long) arg0;
        this.field826.method82(var5, (byte) -39);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IJ)V", line = 34)
    public static final void method401(int arg0, long arg1) {
        field790++;
        if (arg0 != -2) {
            method412(false);
        }
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)I", line = 51)
    public final int method402(byte arg0) {
        if (arg0 > -93) {
            return 60;
        }
        field799++;
        if (this.method407((byte) 1) == null) {
            return this.field794 == null ? 0 : this.field794.method1063(-23559);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V", line = 74)
    public final void method403(byte arg0) {
        field806++;
        if (this.field801 == null) {
            return;
        }
        if (arg0 != -52) {
            this.method400(-29, -41);
        }
        this.field825 = true;
        if (this.field823 == null) {
            this.field823 = new class12();
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)Lhe;", line = 96)
    private final class243 method404(int arg0, int arg1, int arg2) {
        field791++;
        class243 var4 = (class243) this.field810.method986((long) arg1, 0);
        if (var4 != null && arg2 == 0 && !var4.field4219 && var4.field4208) {
            var4.method1054((byte) 127);
            var4 = null;
        }
        if (arg0 != 2) {
            return (class243) null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field801 == null || this.field811[arg1] == -1) {
                    if (this.field793.method1963(-7164)) {
                        return null;
                    }
                    var4 = this.field793.method1961((byte) 2, 25933, true, this.field800, arg1);
                } else {
                    var4 = this.field802.method1339(this.field801, arg0, arg1);
                }
            } else if (arg2 == 1) {
                if (this.field801 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field802.method1343((byte) 2, this.field801, arg1);
            } else if (arg2 == 2) {
                if (this.field801 == null) {
                    throw new RuntimeException();
                }
                if (this.field811[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field793.method1962(false)) {
                    return null;
                }
                var4 = this.field793.method1961((byte) 2, arg0 ^ 0x654F, false, this.field800, arg1);
            } else {
                throw new RuntimeException();
            }
            this.field810.method984((byte) 65, var4, (long) arg1);
        }
        if (var4.field4208) {
            return null;
        }
        byte[] var5 = var4.method1061((byte) -114);
        if (!var4 instanceof class155) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class243.field4210.reset();
                class243.field4210.update(var5, 0, var5.length - 2);
                int var6 = (int) class243.field4210.getValue();
                if (this.field813.field5319[arg1] != var6) {
                    throw new RuntimeException();
                }
                this.field793.field4808 = 0;
                this.field793.field4811 = 0;
            } catch (RuntimeException var14) {
                this.field793.method1953(-296773104);
                var4.method1054((byte) 98);
                if (var4.field4219 && !this.field793.method1963(-7164)) {
                    class184 var8 = this.field793.method1961((byte) 2, 25933, true, this.field800, arg1);
                    this.field810.method984((byte) -117, var8, (long) arg1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field813.field5310[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field813.field5310[arg1];
            if (this.field801 != null) {
                this.field802.method1346(this.field801, arg1, (byte) 108, var5);
                if (this.field811[arg1] != 1) {
                    this.field818++;
                    this.field811[arg1] = 1;
                }
            }
            if (!var4.field4219) {
                var4.method1054((byte) 105);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class243.field4210.reset();
            class243.field4210.update(var5, 0, var5.length - 2);
            int var9 = (int) class243.field4210.getValue();
            if (this.field813.field5319[arg1] != var9) {
                throw new RuntimeException();
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field813.field5310[arg1] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field811[arg1] != 1) {
                if (this.field811[arg1] != 0) {
                }
                this.field818++;
                this.field811[arg1] = 1;
            }
            if (!var4.field4219) {
                var4.method1054((byte) 88);
            }
            return var4;
        } catch (Exception var13) {
            this.field811[arg1] = -1;
            var4.method1054((byte) 95);
            if (var4.field4219 && !this.field793.method1963(arg0 ^ 0xFFFFE406)) {
                class184 var12 = this.field793.method1961((byte) 2, arg0 ^ 0x654F, true, this.field800, arg1);
                this.field810.method984((byte) -101, var12, (long) arg1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)[B", line = 305)
    public final byte[] method405(int arg0, int arg1) {
        field808++;
        class243 var3 = this.method404(2, arg0, arg1);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1061((byte) -118);
            var3.method1054((byte) 94);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)I", line = 329)
    public final int method406(int arg0, int arg1) {
        class243 var3 = (class243) this.field810.method986((long) arg0, arg1 + arg1);
        field796++;
        return var3 == null ? 0 : var3.method1063(-23559);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)Lqf;", line = 341)
    public final class313 method407(byte arg0) {
        field809++;
        if (this.field813 != null) {
            return this.field813;
        }
        if (this.field794 == null) {
            if (this.field793.method1963(-7164)) {
                return null;
            }
            this.field794 = this.field793.method1961((byte) 0, 25933, true, 255, this.field800);
        }
        if (arg0 != 1) {
            return (class313) null;
        } else if (this.field794.field4208) {
            return null;
        } else {
            byte[] var2 = this.field794.method1061((byte) -77);
            if (this.field794 instanceof class155) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field813 = new class313(var2, this.field797);
                    if (this.field813.field5307 != this.field795) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var5) {
                    this.field813 = null;
                    if (this.field793.method1963(arg0 ^ 0xFFFFE405)) {
                        this.field794 = null;
                    } else {
                        this.field794 = this.field793.method1961((byte) 0, 25933, true, 255, this.field800);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field813 = new class313(var2, this.field797);
                } catch (RuntimeException var6) {
                    this.field793.method1953(arg0 - 296773105);
                    this.field813 = null;
                    if (this.field793.method1963(-7164)) {
                        this.field794 = null;
                    } else {
                        this.field794 = this.field793.method1961((byte) 0, 25933, true, 255, this.field800);
                    }
                    return null;
                }
                if (this.field804 != null) {
                    this.field802.method1346(this.field804, this.field800, (byte) 106, var2);
                }
            }
            this.field794 = null;
            if (this.field801 != null) {
                this.field818 = 0;
                this.field811 = new byte[this.field813.field5311];
            }
            return this.field813;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)I", line = 452)
    public final int method408(boolean arg0) {
        field792++;
        if (this.field813 == null) {
            return 0;
        } else if (this.field824) {
            if (arg0) {
                field803 = (class172) null;
            }
            class154 var2 = this.field823.method83(-104);
            return var2 == null ? 0 : (int) var2.field2642;
        } else {
            return this.field813.field5318;
        }
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(B)V", line = 475)
    public final void method409(byte arg0) {
        field812++;
        if (this.field823 == null || this.method407((byte) 1) == null) {
            return;
        }
        if (arg0 != 98) {
            method413(62, 28, 96, -72, -10, -112, (class123) null, 73, 42L);
        }
        for (class154 var2 = this.field826.method83(-50); var2 != null; var2 = this.field826.method87((byte) -80)) {
            int var3 = (int) var2.field2642;
            if (var3 < 0 || var3 >= this.field813.field5311 || this.field813.field5304[var3] == 0) {
                var2.method1054((byte) 77);
            } else {
                if (this.field811[var3] == 0) {
                    this.method404(2, var3, 1);
                }
                if (this.field811[var3] == -1) {
                    this.method404(2, var3, 2);
                }
                if (this.field811[var3] == 1) {
                    var2.method1054((byte) 104);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V", line = 532)
    public final void method410(int arg0) {
        field805++;
        if (this.field823 != null) {
            if (this.method407((byte) 1) == null) {
                return;
            }
            if (this.field824) {
                boolean var6 = true;
                for (class154 var7 = this.field823.method83(-87); var7 != null; var7 = this.field823.method87((byte) -80)) {
                    int var8 = (int) var7.field2642;
                    if (this.field811[var8] == 0) {
                        this.method404(2, var8, 1);
                    }
                    if (this.field811[var8] == 0) {
                        var6 = false;
                    } else {
                        var7.method1054((byte) 100);
                    }
                }
                while (this.field822 < this.field813.field5304.length) {
                    if (this.field813.field5304[this.field822] == 0) {
                        this.field822++;
                    } else {
                        if (this.field802.field3509 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field811[this.field822] == 0) {
                            this.method404(2, this.field822, 1);
                        }
                        if (this.field811[this.field822] == 0) {
                            class154 var9 = new class154();
                            var9.field2642 = (long) this.field822;
                            var6 = false;
                            this.field823.method82(var9, (byte) -39);
                        }
                        this.field822++;
                    }
                }
                if (var6) {
                    this.field824 = false;
                    this.field822 = 0;
                }
            } else if (this.field825) {
                boolean var2 = true;
                for (class154 var3 = this.field823.method83(-70); var3 != null; var3 = this.field823.method87((byte) -80)) {
                    int var4 = (int) var3.field2642;
                    if (this.field811[var4] != 1) {
                        this.method404(2, var4, 2);
                    }
                    if (this.field811[var4] == 1) {
                        var3.method1054((byte) 123);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field813.field5304.length > this.field822) {
                    if (this.field813.field5304[this.field822] == 0) {
                        this.field822++;
                    } else {
                        if (this.field793.method1962(false)) {
                            var2 = false;
                            break;
                        }
                        if (this.field811[this.field822] != 1) {
                            this.method404(2, this.field822, 2);
                        }
                        if (this.field811[this.field822] != 1) {
                            var2 = false;
                            class154 var5 = new class154();
                            var5.field2642 = (long) this.field822;
                            this.field823.method82(var5, (byte) -39);
                        }
                        this.field822++;
                    }
                }
                if (var2) {
                    this.field825 = false;
                    this.field822 = 0;
                }
            } else {
                this.field823 = null;
            }
        }
        if (this.field827 && this.field828 <= class25.method197(-3418)) {
            for (class243 var10 = (class243) this.field810.method985(122); var10 != null; var10 = (class243) this.field810.method983(-1)) {
                if (!var10.field4208) {
                    if (var10.field4209) {
                        if (!var10.field4219) {
                            throw new RuntimeException();
                        }
                        var10.method1054((byte) 117);
                    } else {
                        var10.field4209 = true;
                    }
                }
            }
            this.field828 = class25.method197(-3418) + 1000L;
        }
        int var11 = -102 / ((arg0 + 55) / 40);
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)I", line = 710)
    public final int method411(int arg0) {
        field798++;
        if (arg0 != 255) {
            this.field797 = -106;
        }
        return this.field818;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)V", line = 725)
    public static void method412(boolean arg0) {
        field819 = null;
        field803 = null;
        field817 = null;
        field821 = null;
        field820 = null;
        if (!arg0) {
            field815 = -38;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIILrk;IJ)Z", line = 738)
    public static final boolean method413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class123 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return client.method349(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)I", line = 749)
    public static final int method414(int arg0, byte arg1) {
        if (arg1 < 79) {
            return -118;
        } else {
            field814++;
            return arg0 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(B)I", line = 774)
    public final int method415(byte arg0) {
        int var2 = -123 % ((arg0) / 36);
        field807++;
        return this.field813 == null ? 0 : this.field813.field5318;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(ILhh;Lhh;Lnl;Lsk;IIZ)V", line = 822)
    public class51(int arg0, class80 arg1, class80 arg2, class279 arg3, class202 arg4, int arg5, int arg6, boolean arg7) {
        this.field800 = arg0;
        this.field801 = arg1;
        if (this.field801 == null) {
            this.field824 = false;
        } else {
            this.field824 = true;
            this.field823 = new class12();
        }
        this.field793 = arg3;
        this.field797 = arg5;
        this.field795 = arg6;
        this.field802 = arg4;
        this.field804 = arg2;
        this.field827 = arg7;
        if (this.field804 != null) {
            this.field794 = this.field802.method1339(this.field804, 2, this.field800);
        }
    }
}
