import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class231 extends class254 {

    @OriginalMember(owner = "client!vba", name = "n", descriptor = "I")
    private int field2940 = 0;

    @OriginalMember(owner = "client!vba", name = "r", descriptor = "Lba;")
    private class607 field2944 = new class607(16);

    @OriginalMember(owner = "client!vba", name = "O", descriptor = "I")
    private int field2966 = 0;

    @OriginalMember(owner = "client!vba", name = "M", descriptor = "Lbv;")
    private class568 field2964 = new class568();

    @OriginalMember(owner = "client!vba", name = "P", descriptor = "J")
    private long field2967 = 0L;

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "Lkm;")
    private class120 field2935;

    @OriginalMember(owner = "client!vba", name = "u", descriptor = "I")
    private int field2947;

    @OriginalMember(owner = "client!vba", name = "K", descriptor = "Z")
    private boolean field2963;

    @OriginalMember(owner = "client!vba", name = "N", descriptor = "Lbv;")
    private class568 field2965;

    @OriginalMember(owner = "client!vba", name = "D", descriptor = "Lgw;")
    private class140 field2956;

    @OriginalMember(owner = "client!vba", name = "o", descriptor = "Lkm;")
    private class120 field2941;

    @OriginalMember(owner = "client!vba", name = "q", descriptor = "[B")
    private byte[] field2943;

    @OriginalMember(owner = "client!vba", name = "y", descriptor = "I")
    private int field2951;

    @OriginalMember(owner = "client!vba", name = "Q", descriptor = "Z")
    private boolean field2968;

    @OriginalMember(owner = "client!vba", name = "C", descriptor = "Lbw;")
    private class411 field2955;

    @OriginalMember(owner = "client!vba", name = "A", descriptor = "I")
    private int field2953;

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "Loa;")
    private class212 field2938;

    @OriginalMember(owner = "client!vba", name = "w", descriptor = "I")
    public static int field2949 = -1;

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!vba", name = "m", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!vba", name = "p", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!vba", name = "s", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!vba", name = "t", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!vba", name = "v", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!vba", name = "B", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!vba", name = "E", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!vba", name = "F", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!vba", name = "G", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!vba", name = "H", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!vba", name = "x", descriptor = "Ltb;")
    private class409 field2950;

    @OriginalMember(owner = "client!vba", name = "J", descriptor = "Z")
    private boolean field2962;

    @OriginalMember(owner = "client!vba", name = "I", descriptor = "[B")
    private byte[] field2961;

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)I")
    public final int method1454(int arg0) {
        field2939++;
        return arg0 == 24642 ? this.field2940 : -105;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)Ltb;")
    public final class409 method1455(byte arg0) {
        field2942++;
        if (this.field2950 != null) {
            return this.field2950;
        }
        if (this.field2938 == null) {
            if (this.field2956.method740(-109)) {
                return null;
            }
            this.field2938 = this.field2956.method749((byte) 0, 255, this.field2947, true, -2057161616);
        }
        if (this.field2938.field2732) {
            return null;
        }
        byte[] var2 = this.field2938.method712((byte) 47);
        if (this.field2938 instanceof class349) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2950 = new class409(var2, this.field2953, this.field2943);
                if (this.field2950.field5620 != this.field2951) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var4) {
                this.field2950 = null;
                if (this.field2956.method740(-45)) {
                    this.field2938 = null;
                } else {
                    this.field2938 = this.field2956.method749((byte) 0, 255, this.field2947, true, -2057161616);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2950 = new class409(var2, this.field2953, this.field2943);
            } catch (RuntimeException var5) {
                this.field2956.method742(1);
                this.field2950 = null;
                if (this.field2956.method740(-58)) {
                    this.field2938 = null;
                } else {
                    this.field2938 = this.field2956.method749((byte) 0, 255, this.field2947, true, -2057161616);
                }
                return null;
            }
            if (this.field2941 != null) {
                this.field2955.method2452(-21126, this.field2947, this.field2941, var2);
            }
        }
        this.field2938 = null;
        int var3 = -114 / ((arg0 + 10) / 48);
        if (this.field2935 != null) {
            this.field2961 = new byte[this.field2950.field5623];
            this.field2940 = 0;
        }
        return this.field2950;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IBI)Loa;")
    private final class212 method1456(int arg0, byte arg1, int arg2) {
        field2954++;
        if (arg1 != 106) {
            this.method1462((byte) 68);
        }
        class212 var4 = (class212) this.field2944.method3476((long) arg0, (byte) 28);
        if (var4 != null && arg2 == 0 && !var4.field2728 && var4.field2732) {
            var4.method589(-8880);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field2935 == null || this.field2961[arg0] == -1) {
                    if (this.field2956.method740(-63)) {
                        return null;
                    }
                    var4 = this.field2956.method749((byte) 2, this.field2947, arg0, true, -2057161616);
                } else {
                    var4 = this.field2955.method2453(arg0, (byte) -89, this.field2935);
                }
            } else if (arg2 == 1) {
                if (this.field2935 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2955.method2451(-5926, arg0, this.field2935);
            } else if (arg2 == 2) {
                if (this.field2935 == null) {
                    throw new RuntimeException();
                }
                if (this.field2961[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2956.method746(20)) {
                    return null;
                }
                var4 = this.field2956.method749((byte) 2, this.field2947, arg0, false, -2057161616);
            } else {
                throw new RuntimeException();
            }
            this.field2944.method3475(-92, var4, (long) arg0);
        }
        if (var4.field2732) {
            return null;
        }
        byte[] var5 = var4.method712((byte) 107);
        if (!(var4 instanceof class349)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class20.field255.reset();
                class20.field255.update(var5, 0, var5.length - 2);
                int var6 = (int) class20.field255.getValue();
                if (this.field2950.field5603[arg0] != var6) {
                    throw new RuntimeException();
                }
                if (this.field2950.field5610 != null && this.field2950.field5610[arg0] != null) {
                    byte[] var7 = this.field2950.field5610[arg0];
                    byte[] var8 = class622.method3567(var5.length - 2, 0, arg1 - 203, var5);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field2956.field1797 = 0;
                this.field2956.field1795 = 0;
            } catch (RuntimeException var17) {
                this.field2956.method742(1);
                var4.method589(-8880);
                if (var4.field2728 && !this.field2956.method740(-80)) {
                    class135 var10 = this.field2956.method749((byte) 2, this.field2947, arg0, true, -2057161616);
                    this.field2944.method3475(-100, var10, (long) arg0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2950.field5605[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field2950.field5605[arg0];
            if (this.field2935 != null) {
                this.field2955.method2452(-21126, arg0, this.field2935, var5);
                if (this.field2961[arg0] != 1) {
                    this.field2940++;
                    this.field2961[arg0] = 1;
                }
            }
            if (!var4.field2728) {
                var4.method589(-8880);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class20.field255.reset();
            class20.field255.update(var5, 0, var5.length - 2);
            int var11 = (int) class20.field255.getValue();
            if (this.field2950.field5603[arg0] != var11) {
                throw new RuntimeException();
            }
            if (this.field2950.field5610 != null && this.field2950.field5610[arg0] != null) {
                byte[] var12 = this.field2950.field5610[arg0];
                byte[] var13 = class622.method3567(var5.length - 2, 0, 122, var5);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field2950.field5605[arg0] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field2961[arg0] != 1) {
                this.field2940++;
                this.field2961[arg0] = 1;
            }
            if (!var4.field2728) {
                var4.method589(-8880);
            }
            return var4;
        } catch (Exception var18) {
            this.field2961[arg0] = -1;
            var4.method589(-8880);
            if (var4.field2728 && !this.field2956.method740(arg1 ^ 0xFFFFFF8D)) {
                class135 var16 = this.field2956.method749((byte) 2, this.field2947, arg0, true, -2057161616);
                this.field2944.method3475(-124, var16, (long) arg0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(BI)[B")
    public final byte[] method1457(byte arg0, int arg1) {
        if (arg0 < 111) {
            this.field2964 = null;
        }
        field2960++;
        class212 var3 = this.method1456(arg1, (byte) 106, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method712((byte) 103);
            var3.method589(-8880);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)V")
    public final void method1458(int arg0) {
        field2937++;
        if (this.field2965 != null) {
            if (this.method1455((byte) 49) == null) {
                return;
            }
            if (this.field2963) {
                boolean var2 = true;
                for (class108 var3 = this.field2965.method3188((byte) -100); var3 != null; var3 = this.field2965.method3182((byte) -55)) {
                    int var5 = (int) var3.field1401;
                    if (this.field2961[var5] == 0) {
                        this.method1456(var5, (byte) 106, 1);
                    }
                    if (this.field2961[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method589(-8880);
                    }
                }
                while (this.field2950.field5621.length > this.field2966) {
                    if (this.field2950.field5621[this.field2966] == 0) {
                        this.field2966++;
                    } else {
                        if (this.field2955.field5653 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field2961[this.field2966] == 0) {
                            this.method1456(this.field2966, (byte) 106, 1);
                        }
                        if (this.field2961[this.field2966] == 0) {
                            class108 var4 = new class108();
                            var4.field1401 = this.field2966;
                            var2 = false;
                            this.field2965.method3181(var4, true);
                        }
                        this.field2966++;
                    }
                }
                if (var2) {
                    this.field2963 = false;
                    this.field2966 = 0;
                }
            } else if (this.field2962) {
                boolean var6 = true;
                for (class108 var7 = this.field2965.method3188((byte) -100); var7 != null; var7 = this.field2965.method3182((byte) -21)) {
                    int var9 = (int) var7.field1401;
                    if (this.field2961[var9] != 1) {
                        this.method1456(var9, (byte) 106, 2);
                    }
                    if (this.field2961[var9] == 1) {
                        var7.method589(-8880);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field2950.field5621.length > this.field2966) {
                    if (this.field2950.field5621[this.field2966] == 0) {
                        this.field2966++;
                    } else {
                        if (this.field2956.method746(20)) {
                            var6 = false;
                            break;
                        }
                        if (this.field2961[this.field2966] != 1) {
                            this.method1456(this.field2966, (byte) 106, 2);
                        }
                        if (this.field2961[this.field2966] != 1) {
                            class108 var8 = new class108();
                            var8.field1401 = this.field2966;
                            var6 = false;
                            this.field2965.method3181(var8, true);
                        }
                        this.field2966++;
                    }
                }
                if (var6) {
                    this.field2962 = false;
                    this.field2966 = 0;
                }
            } else {
                this.field2965 = null;
            }
        }
        if (this.field2968 && this.field2967 <= class348.method2175(-128)) {
            for (class212 var10 = (class212) this.field2944.method3473(-27089); var10 != null; var10 = (class212) this.field2944.method3478((byte) 5)) {
                if (!var10.field2732) {
                    if (var10.field2730) {
                        if (!var10.field2728) {
                            throw new RuntimeException();
                        }
                        var10.method589(-8880);
                    } else {
                        var10.field2730 = true;
                    }
                }
            }
            this.field2967 = class348.method2175(-122) + 1000L;
        }
        if (arg0 != 0) {
            this.method1455((byte) -76);
        }
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)I")
    public final int method1459(byte arg0) {
        if (arg0 != -1) {
            this.method1456(62, (byte) -52, 12);
        }
        field2945++;
        if (this.method1455((byte) 92) == null) {
            return this.field2938 == null ? 0 : this.field2938.method709((byte) -2);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(B)I")
    public final int method1460(byte arg0) {
        if (arg0 != 99) {
            this.method1463(88);
        }
        field2948++;
        return this.field2950 == null ? 0 : this.field2950.field5614;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(BI)V")
    public final void method1461(byte arg0, int arg1) {
        field2952++;
        if (this.field2935 == null) {
            return;
        }
        for (class108 var3 = this.field2964.method3188((byte) -100); var3 != null; var3 = this.field2964.method3182((byte) -108)) {
            if (((long) arg1) == var3.field1401) {
                return;
            }
        }
        if (arg0 < -82) {
            class108 var4 = new class108();
            var4.field1401 = arg1;
            this.field2964.method3181(var4, true);
        }
    }

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "(B)V")
    public final void method1462(byte arg0) {
        field2958++;
        if (this.field2935 != null) {
            this.field2962 = true;
            if (arg0 == -100 && this.field2965 == null) {
                this.field2965 = new class568();
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "(I)V")
    public final void method1463(int arg0) {
        field2934++;
        if (this.field2965 == null || this.method1455((byte) -86) == null) {
            return;
        }
        for (class108 var2 = this.field2964.method3188((byte) -100); var2 != null; var2 = this.field2964.method3182((byte) -55)) {
            int var3 = (int) var2.field1401;
            if (var3 < 0 || var3 >= this.field2950.field5623 || this.field2950.field5621[var3] == 0) {
                var2.method589(-8880);
            } else {
                if (this.field2961[var3] == 0) {
                    this.method1456(var3, (byte) 106, 1);
                }
                if (this.field2961[var3] == -1) {
                    this.method1456(var3, (byte) 106, 2);
                }
                if (this.field2961[var3] == 1) {
                    var2.method589(-8880);
                }
            }
        }
        if (arg0 != 26084) {
            this.method1457((byte) 35, 2);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)I")
    public final int method1464(boolean arg0) {
        field2936++;
        if (this.field2950 == null) {
            return 0;
        } else if (this.field2963) {
            class108 var2 = this.field2965.method3188((byte) -100);
            if (!arg0) {
                this.method1460((byte) 26);
            }
            return var2 == null ? 0 : (int) var2.field1401;
        } else {
            return this.field2950.field5614;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)I")
    public final int method1465(int arg0, int arg1) {
        field2959++;
        class212 var3 = (class212) this.field2944.method3476((long) arg0, (byte) 28);
        if (var3 == null) {
            return arg1 == 31566 ? 0 : -28;
        } else {
            return var3.method709((byte) -2);
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(ILkm;Lkm;Lgw;Lbw;I[BIZ)V")
    public class231(int arg0, class120 arg1, class120 arg2, class140 arg3, class411 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field2935 = arg1;
        this.field2947 = arg0;
        if (this.field2935 == null) {
            this.field2963 = false;
        } else {
            this.field2963 = true;
            this.field2965 = new class568();
        }
        this.field2956 = arg3;
        this.field2941 = arg2;
        this.field2943 = arg6;
        this.field2951 = arg7;
        this.field2968 = arg8;
        this.field2955 = arg4;
        this.field2953 = arg5;
        if (this.field2941 != null) {
            this.field2938 = this.field2955.method2453(this.field2947, (byte) 123, this.field2941);
        }
    }
}
