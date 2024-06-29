import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class179 extends class461 {

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    private int field2884 = 0;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "Lmn;")
    private class249 field2909 = new class249(16);

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    private int field2911 = 0;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "Lmf;")
    private class291 field2916 = new class291();

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "J")
    private long field2918 = 0L;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    private int field2904;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "Lfq;")
    private class137 field2905;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "Z")
    private boolean field2915;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "Lmf;")
    private class291 field2917;

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "Z")
    private boolean field2919;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    private int field2881;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "Lrm;")
    private class284 field2887;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    private int field2895;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "Lhf;")
    private class273 field2906;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "Lfq;")
    private class137 field2886;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "Lnr;")
    private class42 field2890;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field2882 = -1;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "S")
    public static short field2897 = 320;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "Los;")
    public static class309 field2907 = new class309("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
    public static int field2910 = 0;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
    public static int field2913 = 0;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "Ltu;")
    public static class233 field2912;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "Lea;")
    private class386 field2892;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "Z")
    private boolean field2914;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "[B")
    private byte[] field2898;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
    public final void method1222(int arg0) {
        field2883++;
        if (arg0 != 0) {
            return;
        }
        if (this.field2917 != null) {
            if (this.method1227(51) == null) {
                return;
            }
            if (this.field2915) {
                boolean var2 = true;
                for (class261 var3 = this.field2917.method1892(arg0 ^ 0x5E); var3 != null; var3 = this.field2917.method1893((byte) -2)) {
                    int var5 = (int) var3.field3977;
                    if (this.field2898[var5] == 0) {
                        this.method1235(1, var5, (byte) -122);
                    }
                    if (this.field2898[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1676(true);
                    }
                }
                while (this.field2892.field5629.length > this.field2911) {
                    if (this.field2892.field5629[this.field2911] == 0) {
                        this.field2911++;
                    } else {
                        if (this.field2887.field4280 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field2898[this.field2911] == 0) {
                            this.method1235(1, this.field2911, (byte) -116);
                        }
                        if (this.field2898[this.field2911] == 0) {
                            class261 var4 = new class261();
                            var4.field3977 = this.field2911;
                            var2 = false;
                            this.field2917.method1885(false, var4);
                        }
                        this.field2911++;
                    }
                }
                if (var2) {
                    this.field2911 = 0;
                    this.field2915 = false;
                }
            } else if (this.field2914) {
                boolean var6 = true;
                for (class261 var7 = this.field2917.method1892(112); var7 != null; var7 = this.field2917.method1893((byte) -2)) {
                    int var9 = (int) var7.field3977;
                    if (this.field2898[var9] != 1) {
                        this.method1235(2, var9, (byte) -113);
                    }
                    if (this.field2898[var9] == 1) {
                        var7.method1676(true);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field2892.field5629.length > this.field2911) {
                    if (this.field2892.field5629[this.field2911] == 0) {
                        this.field2911++;
                    } else {
                        if (this.field2906.method1728((byte) 72)) {
                            var6 = false;
                            break;
                        }
                        if (this.field2898[this.field2911] != 1) {
                            this.method1235(2, this.field2911, (byte) -120);
                        }
                        if (this.field2898[this.field2911] != 1) {
                            class261 var8 = new class261();
                            var8.field3977 = this.field2911;
                            var6 = false;
                            this.field2917.method1885(false, var8);
                        }
                        this.field2911++;
                    }
                }
                if (var6) {
                    this.field2911 = 0;
                    this.field2914 = false;
                }
            } else {
                this.field2917 = null;
            }
        }
        if (!this.field2919 || class423.method2578(arg0 - 19698) < this.field2918) {
            return;
        }
        for (class42 var10 = (class42) this.field2909.method1615(0); var10 != null; var10 = (class42) this.field2909.method1621((byte) 77)) {
            if (!var10.field582) {
                if (var10.field580) {
                    if (!var10.field581) {
                        throw new RuntimeException();
                    }
                    var10.method1676(true);
                } else {
                    var10.field580 = true;
                }
            }
        }
        this.field2918 = class423.method2578(-19698) + 1000L;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
    public static void method1223(byte arg0) {
        field2912 = null;
        field2907 = null;
        int var1 = 11 / ((36 - arg0) / 48);
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V")
    public final void method1224(int arg0) {
        field2901++;
        if (this.field2905 == null) {
            return;
        }
        this.field2914 = true;
        if (this.field2917 == null) {
            this.field2917 = new class291();
        }
        if (arg0 != 0) {
            this.method1227(-107);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(IB)I")
    public final int method1225(int arg0, byte arg1) {
        if (arg1 <= 9) {
            this.field2906 = null;
        }
        field2896++;
        class42 var3 = (class42) this.field2909.method1622((long) arg0, -121);
        return var3 == null ? 0 : var3.method258(0);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLjava/awt/Canvas;)Lwl;")
    public static final class283 method1226(boolean arg0, Canvas arg1) {
        if (!arg0) {
            field2882 = -37;
        }
        field2902++;
        try {
            Class var2 = Class.forName("np");
            class283 var3 = (class283) var2.getDeclaredConstructor().newInstance();
            var3.method206(arg1, 7);
            return var3;
        } catch (Throwable var5) {
            class29 var4 = new class29();
            var4.method206(arg1, 7);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)Lea;")
    public final class386 method1227(int arg0) {
        if (arg0 <= 25) {
            this.method1234(-3);
        }
        field2888++;
        if (this.field2892 != null) {
            return this.field2892;
        }
        if (this.field2890 == null) {
            if (this.field2906.method1724(20)) {
                return null;
            }
            this.field2890 = this.field2906.method1727(true, 255, this.field2904, true, (byte) 0);
        }
        if (this.field2890.field582) {
            return null;
        }
        byte[] var2 = this.field2890.method259(-38);
        if (this.field2890 instanceof class59) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2892 = new class386(var2, this.field2881);
                if (this.field2892.field5645 != this.field2895) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field2892 = null;
                if (this.field2906.method1724(20)) {
                    this.field2890 = null;
                } else {
                    this.field2890 = this.field2906.method1727(true, 255, this.field2904, true, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2892 = new class386(var2, this.field2881);
            } catch (RuntimeException var4) {
                this.field2906.method1736(0);
                this.field2892 = null;
                if (this.field2906.method1724(20)) {
                    this.field2890 = null;
                } else {
                    this.field2890 = this.field2906.method1727(true, 255, this.field2904, true, (byte) 0);
                }
                return null;
            }
            if (this.field2886 != null) {
                this.field2887.method1773((byte) 25, this.field2904, this.field2886, var2);
            }
        }
        if (this.field2905 != null) {
            this.field2898 = new byte[this.field2892.field5639];
            this.field2884 = 0;
        }
        this.field2890 = null;
        return this.field2892;
    }

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "(I)V")
    public final void method1228(int arg0) {
        field2900++;
        if (this.field2917 == null || this.method1227(80) == null) {
            return;
        }
        if (arg0 != -1) {
            this.field2914 = true;
        }
        for (class261 var2 = this.field2916.method1892(arg0 ^ 0xFFFFFFA5); var2 != null; var2 = this.field2916.method1893((byte) -2)) {
            int var3 = (int) var2.field3977;
            if (var3 < 0 || var3 >= this.field2892.field5639 || this.field2892.field5629[var3] == 0) {
                var2.method1676(true);
            } else {
                if (this.field2898[var3] == 0) {
                    this.method1235(1, var3, (byte) -114);
                }
                if (this.field2898[var3] == -1) {
                    this.method1235(2, var3, (byte) -119);
                }
                if (this.field2898[var3] == 1) {
                    var2.method1676(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)V")
    public static final void method1229(int arg0) {
        field2908++;
        if (arg0 != 30419) {
            return;
        }
        for (int var1 = 0; var1 < class218.field3439; var1++) {
            class387 var2 = class276.field4170[var1];
            if (var2.field5661 == 2) {
                if (var2.field5663 == null) {
                    var2.field5655 = Integer.MIN_VALUE;
                } else {
                    class288.field4357.method2157(var2.field5663);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)[B")
    public final byte[] method1230(int arg0, byte arg1) {
        field2899++;
        class42 var3 = this.method1235(0, arg0, (byte) -118);
        if (var3 == null) {
            return null;
        } else {
            int var4 = -96 % ((arg1 + 14) / 46);
            byte[] var5 = var3.method259(-14);
            var3.method1676(true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
    public final void method1231(int arg0, int arg1) {
        field2903++;
        if (this.field2905 == null) {
            return;
        }
        if (arg1 != 28276) {
            field2912 = null;
        }
        for (class261 var3 = this.field2916.method1892(98); var3 != null; var3 = this.field2916.method1893((byte) -2)) {
            if (((long) arg0) == var3.field3977) {
                return;
            }
        }
        class261 var4 = new class261();
        var4.field3977 = arg0;
        this.field2916.method1885(false, var4);
    }

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "(I)I")
    public final int method1232(int arg0) {
        field2894++;
        return arg0 >= -74 ? 0 : this.field2884;
    }

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "(I)I")
    public final int method1233(int arg0) {
        field2889++;
        if (this.field2892 == null) {
            return 0;
        } else if (this.field2915) {
            class261 var2 = this.field2917.method1892(102);
            if (arg0 > -73) {
                return 13;
            } else if (var2 == null) {
                return 0;
            } else {
                return (int) var2.field3977;
            }
        } else {
            return this.field2892.field5638;
        }
    }

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "(I)I")
    public final int method1234(int arg0) {
        if (arg0 > -112) {
            return 86;
        } else {
            field2891++;
            return this.field2892 == null ? 0 : this.field2892.field5638;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIB)Lnr;")
    private final class42 method1235(int arg0, int arg1, byte arg2) {
        field2893++;
        class42 var4 = (class42) this.field2909.method1622((long) arg1, 31);
        if (var4 != null && arg0 == 0 && !var4.field581 && var4.field582) {
            var4.method1676(true);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field2905 == null || this.field2898[arg1] == -1) {
                    if (this.field2906.method1724(20)) {
                        return null;
                    }
                    var4 = this.field2906.method1727(true, this.field2904, arg1, true, (byte) 2);
                } else {
                    var4 = this.field2887.method1778((byte) -82, this.field2905, arg1);
                }
            } else if (arg0 == 1) {
                if (this.field2905 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2887.method1771(true, this.field2905, arg1);
            } else if (arg0 == 2) {
                if (this.field2905 == null) {
                    throw new RuntimeException();
                }
                if (this.field2898[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2906.method1728((byte) 72)) {
                    return null;
                }
                var4 = this.field2906.method1727(true, this.field2904, arg1, false, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field2909.method1618(var4, (long) arg1, -1);
        }
        if (var4.field582) {
            return null;
        }
        byte[] var5 = var4.method259(106);
        if (arg2 >= -112) {
            this.method1236(92);
        }
        if (!var4 instanceof class59) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class387.field5658.reset();
                class387.field5658.update(var5, 0, var5.length - 2);
                int var9 = (int) class387.field5658.getValue();
                if (this.field2892.field5642[arg1] != var9) {
                    throw new RuntimeException();
                }
                this.field2906.field4153 = 0;
                this.field2906.field4156 = 0;
            } catch (RuntimeException var12) {
                this.field2906.method1736(0);
                var4.method1676(true);
                if (var4.field581 && !this.field2906.method1724(20)) {
                    class224 var10 = this.field2906.method1727(true, this.field2904, arg1, true, (byte) 2);
                    this.field2909.method1618(var10, (long) arg1, -1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2892.field5636[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field2892.field5636[arg1];
            if (this.field2905 != null) {
                this.field2887.method1773((byte) 25, arg1, this.field2905, var5);
                if (this.field2898[arg1] != 1) {
                    this.field2884++;
                    this.field2898[arg1] = 1;
                }
            }
            if (!var4.field581) {
                var4.method1676(true);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class387.field5658.reset();
            class387.field5658.update(var5, 0, var5.length - 2);
            int var6 = (int) class387.field5658.getValue();
            if (this.field2892.field5642[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field2892.field5636[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field2898[arg1] != 1) {
                this.field2884++;
                this.field2898[arg1] = 1;
            }
            if (!var4.field581) {
                var4.method1676(true);
            }
            return var4;
        } catch (Exception var11) {
            this.field2898[arg1] = -1;
            var4.method1676(true);
            if (var4.field581 && !this.field2906.method1724(20)) {
                class224 var8 = this.field2906.method1727(true, this.field2904, arg1, true, (byte) 2);
                this.field2909.method1618(var8, (long) arg1, -1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "(I)I")
    public final int method1236(int arg0) {
        field2885++;
        if (this.method1227(111) == null) {
            return this.field2890 == null ? 0 : this.field2890.method258(arg0 - 16321);
        } else {
            if (arg0 != 16321) {
                method1229(-124);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(ILfq;Lfq;Lhf;Lrm;IIZ)V")
    public class179(int arg0, class137 arg1, class137 arg2, class273 arg3, class284 arg4, int arg5, int arg6, boolean arg7) {
        this.field2904 = arg0;
        this.field2905 = arg1;
        if (this.field2905 == null) {
            this.field2915 = false;
        } else {
            this.field2915 = true;
            this.field2917 = new class291();
        }
        this.field2919 = arg7;
        this.field2881 = arg5;
        this.field2887 = arg4;
        this.field2895 = arg6;
        this.field2906 = arg3;
        this.field2886 = arg2;
        if (this.field2886 != null) {
            this.field2890 = this.field2887.method1778((byte) 126, this.field2886, this.field2904);
        }
    }
}
