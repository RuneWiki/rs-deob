import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class161 extends class62 {

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    private int field2834 = 0;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "Ldf;")
    private class146 field2837 = new class146(16);

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "I")
    private int field2864 = 0;

    @OriginalMember(owner = "client!ti", name = "Y", descriptor = "Loa;")
    private class262 field2868 = new class262();

    @OriginalMember(owner = "client!ti", name = "ab", descriptor = "J")
    private long field2870 = 0L;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
    private int field2855;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "Lnh;")
    private class276 field2832;

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "Z")
    private boolean field2865;

    @OriginalMember(owner = "client!ti", name = "X", descriptor = "Loa;")
    private class262 field2867;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "Lnh;")
    private class276 field2857;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "Lrh;")
    private class97 field2846;

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
    private int field2856;

    @OriginalMember(owner = "client!ti", name = "Z", descriptor = "Z")
    private boolean field2869;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    private int field2851;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "Leh;")
    private class132 field2836;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "Lvk;")
    private class134 field2848;

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "Z")
    public static boolean field2860 = true;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "Lmb;")
    public static class96 field2845 = class243.method1708("::clientjs5drop", (byte) 108);

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "Lea;")
    private class203 field2842;

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "Z")
    private boolean field2866;

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "[B")
    private byte[] field2863;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "[I")
    public static int[] field2840;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public final void method1163(byte arg0) {
        field2854++;
        if (this.field2867 == null || this.method442(255) == null) {
            return;
        }
        for (class249 var2 = this.field2868.method1811(2); var2 != null; var2 = this.field2868.method1810(false)) {
            int var3 = (int) var2.field4304;
            if (var3 < 0 || this.field2842.field3508 <= var3 || this.field2842.field3520[var3] == 0) {
                var2.method1743((byte) 62);
            } else {
                if (this.field2863[var3] == 0) {
                    this.method1172(var3, true, 1);
                }
                if (this.field2863[var3] == -1) {
                    this.method1172(var3, true, 2);
                }
                if (this.field2863[var3] == 1) {
                    var2.method1743((byte) 6);
                }
            }
        }
        if (arg0 != 69) {
            field2840 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V")
    public final void method1164(byte arg0) {
        field2861++;
        if (this.field2867 != null) {
            if (this.method442(255) == null) {
                return;
            }
            if (this.field2865) {
                boolean var2 = true;
                for (class249 var3 = this.field2867.method1811(arg0 ^ 0xFFFFFFB9); var3 != null; var3 = this.field2867.method1810(false)) {
                    int var5 = (int) var3.field4304;
                    if (this.field2863[var5] == 0) {
                        this.method1172(var5, true, 1);
                    }
                    if (this.field2863[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1743((byte) 14);
                    }
                }
                while (this.field2842.field3520.length > this.field2864) {
                    if (this.field2842.field3520[this.field2864] == 0) {
                        this.field2864++;
                    } else {
                        if (this.field2836.field2381 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field2863[this.field2864] == 0) {
                            this.method1172(this.field2864, true, 1);
                        }
                        if (this.field2863[this.field2864] == 0) {
                            var2 = false;
                            class249 var4 = new class249();
                            var4.field4304 = (long) this.field2864;
                            this.field2867.method1814(1, var4);
                        }
                        this.field2864++;
                    }
                }
                if (var2) {
                    this.field2865 = false;
                    this.field2864 = 0;
                }
            } else if (this.field2866) {
                boolean var6 = true;
                for (class249 var7 = this.field2867.method1811(2); var7 != null; var7 = this.field2867.method1810(false)) {
                    int var9 = (int) var7.field4304;
                    if (this.field2863[var9] != 1) {
                        this.method1172(var9, true, 2);
                    }
                    if (this.field2863[var9] == 1) {
                        var7.method1743((byte) 23);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field2842.field3520.length > this.field2864) {
                    if (this.field2842.field3520[this.field2864] == 0) {
                        this.field2864++;
                    } else {
                        if (this.field2846.method730(20)) {
                            var6 = false;
                            break;
                        }
                        if (this.field2863[this.field2864] != 1) {
                            this.method1172(this.field2864, true, 2);
                        }
                        if (this.field2863[this.field2864] != 1) {
                            var6 = false;
                            class249 var8 = new class249();
                            var8.field4304 = (long) this.field2864;
                            this.field2867.method1814(1, var8);
                        }
                        this.field2864++;
                    }
                }
                if (var6) {
                    this.field2864 = 0;
                    this.field2866 = false;
                }
            } else {
                this.field2867 = null;
            }
        }
        if (this.field2869 && class155.method1133(126) >= this.field2870) {
            for (class134 var10 = (class134) this.field2837.method1074(false); var10 != null; var10 = (class134) this.field2837.method1087((byte) -118)) {
                if (!var10.field2403) {
                    if (var10.field2410) {
                        if (!var10.field2400) {
                            throw new RuntimeException();
                        }
                        var10.method1743((byte) 44);
                    } else {
                        var10.field2410 = true;
                    }
                }
            }
            this.field2870 = class155.method1133(124) + 1000L;
        }
        if (arg0 != -69) {
            this.field2834 = 78;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIII)V")
    public static final void method1165(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            method1166(-44);
        }
        field2852++;
        class43 var5 = class270.method1847(arg1, -10277, 10);
        var5.method333(30);
        var5.field734 = arg3;
        var5.field740 = arg4;
        var5.field732 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(BI)V")
    public final void method443(byte arg0, int arg1) {
        field2835++;
        if (this.field2832 == null || arg0 != 72) {
            return;
        }
        for (class249 var3 = this.field2868.method1811(2); var3 != null; var3 = this.field2868.method1810(false)) {
            if ((long) arg1 == var3.field4304) {
                return;
            }
        }
        class249 var4 = new class249();
        var4.field4304 = (long) arg1;
        this.field2868.method1814(arg0 - 71, var4);
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
    public static void method1166(int arg0) {
        int var1 = 55 % ((12 - arg0) / 59);
        field2845 = null;
        field2840 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)I")
    public final int method440(byte arg0, int arg1) {
        field2839++;
        if (arg0 >= -110) {
            this.field2836 = null;
        }
        class134 var3 = (class134) this.field2837.method1081(0, (long) arg1);
        return var3 == null ? 0 : var3.method394(-128);
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)I")
    public final int method1167(byte arg0) {
        field2858++;
        if (arg0 <= 34) {
            this.method443((byte) 74, 125);
        }
        if (this.method442(255) == null) {
            return this.field2848 == null ? 0 : this.field2848.method394(-33);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V")
    public final void method1168(int arg0) {
        if (arg0 != 1876) {
            this.field2846 = null;
        }
        field2853++;
        if (this.field2832 != null) {
            this.field2866 = true;
            if (this.field2867 == null) {
                this.field2867 = new class262();
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)I")
    public final int method1169(int arg0) {
        field2843++;
        if (this.field2842 == null) {
            return 0;
        } else if (this.field2865) {
            class249 var2 = this.field2867.method1811(2);
            if (var2 == null) {
                return 0;
            } else {
                int var3 = -80 / ((arg0 - 52) / 55);
                return (int) var2.field4304;
            }
        } else {
            return this.field2842.field3511;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)Lea;")
    public final class203 method442(int arg0) {
        field2833++;
        if (this.field2842 != null) {
            return this.field2842;
        }
        if (this.field2848 == null) {
            if (this.field2846.method725((byte) -122)) {
                return null;
            }
            this.field2848 = this.field2846.method733(255, this.field2855, (byte) 0, (byte) 120, true);
        }
        if (this.field2848.field2403) {
            return null;
        }
        byte[] var2 = this.field2848.method397(arg0 - 318);
        if (this.field2848 instanceof class53) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2842 = new class203(var2, this.field2851);
                if (this.field2842.field3516 != this.field2856) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field2842 = null;
                if (this.field2846.method725((byte) -123)) {
                    this.field2848 = null;
                } else {
                    this.field2848 = this.field2846.method733(255, this.field2855, (byte) 0, (byte) 120, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2842 = new class203(var2, this.field2851);
            } catch (RuntimeException var4) {
                this.field2846.method739((byte) -14);
                this.field2842 = null;
                if (this.field2846.method725((byte) -106)) {
                    this.field2848 = null;
                } else {
                    this.field2848 = this.field2846.method733(255, this.field2855, (byte) 0, (byte) 120, true);
                }
                return null;
            }
            if (this.field2857 != null) {
                this.field2836.method994(this.field2855, this.field2857, var2, arg0 - 255);
            }
        }
        this.field2848 = null;
        if (this.field2832 != null) {
            this.field2834 = 0;
            this.field2863 = new byte[this.field2842.field3508];
        }
        return arg0 == 255 ? this.field2842 : null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIZII)Lmj;")
    public static final class246 method1170(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg4 != -666384303) {
            return null;
        }
        int var7 = (arg2 << 17) + (arg3 ? 65536 : 0) + (arg1 << 19) + arg5;
        field2859++;
        long var8 = (long) arg0 * 3147483667L + (long) var7 * 3849834839L;
        class246 var10 = (class246) class241.field4190.method84(63, var8);
        if (var10 != null) {
            return var10;
        }
        class240.field4178 = false;
        class246 var11 = class49.method374(arg3, false, arg5, arg0, 2, false, arg2, arg1);
        if (var11 != null && !class240.field4178) {
            class241.field4190.method88(var11, 16518, var8);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(BI)[B")
    public final byte[] method445(byte arg0, int arg1) {
        if (arg0 <= 11) {
            return null;
        }
        field2841++;
        class134 var3 = this.method1172(arg1, true, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method397(-119);
            var3.method1743((byte) 52);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)I")
    public final int method1171(int arg0) {
        field2862++;
        return arg0 >= -37 ? -126 : this.field2834;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZI)Lvk;")
    private final class134 method1172(int arg0, boolean arg1, int arg2) {
        class134 var4 = (class134) this.field2837.method1081(0, (long) arg0);
        if (var4 != null && arg2 == 0 && !var4.field2400 && var4.field2403) {
            var4.method1743((byte) 117);
            var4 = null;
        }
        field2850++;
        if (!arg1) {
            return null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field2832 == null || this.field2863[arg0] == -1) {
                    if (this.field2846.method725((byte) -125)) {
                        return null;
                    }
                    var4 = this.field2846.method733(this.field2855, arg0, (byte) 2, (byte) 120, true);
                } else {
                    var4 = this.field2836.method996(10284, arg0, this.field2832);
                }
            } else if (arg2 == 1) {
                if (this.field2832 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2836.method991((byte) 60, this.field2832, arg0);
            } else if (arg2 == 2) {
                if (this.field2832 == null) {
                    throw new RuntimeException();
                }
                if (this.field2863[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2846.method730(20)) {
                    return null;
                }
                var4 = this.field2846.method733(this.field2855, arg0, (byte) 2, (byte) 120, false);
            } else {
                throw new RuntimeException();
            }
            this.field2837.method1085(-1, var4, (long) arg0);
        }
        if (var4.field2403) {
            return null;
        }
        byte[] var5 = var4.method397(111);
        if (!var4 instanceof class53) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class186.field3238.reset();
                class186.field3238.update(var5, 0, var5.length - 2);
                int var6 = (int) class186.field3238.getValue();
                if (this.field2842.field3515[arg0] != var6) {
                    throw new RuntimeException();
                }
                this.field2846.field1660 = 0;
                this.field2846.field1661 = 0;
            } catch (RuntimeException var12) {
                this.field2846.method739((byte) -14);
                var4.method1743((byte) 84);
                if (var4.field2400 && !this.field2846.method725((byte) -117)) {
                    class52 var7 = this.field2846.method733(this.field2855, arg0, (byte) 2, (byte) 120, true);
                    this.field2837.method1085(-1, var7, (long) arg0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2842.field3506[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field2842.field3506[arg0];
            if (this.field2832 != null) {
                this.field2836.method994(arg0, this.field2832, var5, 0);
                if (this.field2863[arg0] != 1) {
                    this.field2834++;
                    this.field2863[arg0] = 1;
                }
            }
            if (!var4.field2400) {
                var4.method1743((byte) 17);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class186.field3238.reset();
            class186.field3238.update(var5, 0, var5.length - 2);
            int var8 = (int) class186.field3238.getValue();
            if (this.field2842.field3515[arg0] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field2842.field3506[arg0] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field2863[arg0] != 1) {
                this.field2834++;
                this.field2863[arg0] = 1;
            }
            if (!var4.field2400) {
                var4.method1743((byte) 35);
            }
            return var4;
        } catch (Exception var11) {
            this.field2863[arg0] = -1;
            var4.method1743((byte) 80);
            if (var4.field2400 && !this.field2846.method725((byte) -127)) {
                class52 var10 = this.field2846.method733(this.field2855, arg0, (byte) 2, (byte) 120, true);
                this.field2837.method1085(-1, var10, (long) arg0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(B)I")
    public final int method1173(byte arg0) {
        if (arg0 != 58) {
            this.method1164((byte) -107);
        }
        field2844++;
        return this.field2842 == null ? 0 : this.field2842.field3511;
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)Lmj;")
    public static final class246 method1174(int arg0) {
        field2849++;
        int var1 = class31.field490[0] * class170.field2982[0];
        byte[] var2 = class217.field3724[arg0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class139.field2492[class130.method985(255, var2[var4])];
        }
        class174 var5 = new class174(class249.field4309, class109.field2019, class241.field4187[0], class176.field3064[0], class31.field490[0], class170.field2982[0], var3);
        class192.method1344(0);
        return var5;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(ILnh;Lnh;Lrh;Leh;IIZ)V")
    public class161(int arg0, class276 arg1, class276 arg2, class97 arg3, class132 arg4, int arg5, int arg6, boolean arg7) {
        this.field2855 = arg0;
        this.field2832 = arg1;
        if (this.field2832 == null) {
            this.field2865 = false;
        } else {
            this.field2865 = true;
            this.field2867 = new class262();
        }
        this.field2857 = arg2;
        this.field2846 = arg3;
        this.field2856 = arg6;
        this.field2869 = arg7;
        this.field2851 = arg5;
        this.field2836 = arg4;
        if (this.field2857 != null) {
            this.field2848 = this.field2836.method996(10284, this.field2855, this.field2857);
        }
    }
}
