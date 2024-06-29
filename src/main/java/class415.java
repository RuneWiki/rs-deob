import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class415 {

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    private int field5937 = -32768;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "Z")
    private boolean field5947 = false;

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "I")
    private int field5970 = -1;

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "Z")
    private boolean field5971 = false;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
    private int field5957 = -1;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "B")
    private byte field5944;

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "I")
    private int field5965;

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "I")
    public int field5977;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public int field5949;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "B")
    private byte field5962;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    private int field5955;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public int field5938;

    @OriginalMember(owner = "client!pm", name = "F", descriptor = "Z")
    private boolean field5968;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "Lhn;")
    public static class509 field5946 = new class509(5);

    @OriginalMember(owner = "client!pm", name = "J", descriptor = "I")
    public static int field5972 = 0;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "Lho;")
    public static class103 field5953 = new class103(7, 8);

    @OriginalMember(owner = "client!pm", name = "Q", descriptor = "Lhn;")
    public static class509 field5978 = new class509(8);

    @OriginalMember(owner = "client!pm", name = "S", descriptor = "I")
    public static int field5980 = -1;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
    private int field5956;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
    private int field5960;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    private int field5961;

    @OriginalMember(owner = "client!pm", name = "B", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!pm", name = "G", descriptor = "I")
    private int field5969;

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!pm", name = "O", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "Loj;")
    private class260 field5963;

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "Li;")
    private class31 field5967;

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "Le;")
    private class373 field5966;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "Ldl;")
    public class46 field5954;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pm", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field5981;

    @OriginalMember(owner = "client!pm", name = "R", descriptor = "Z")
    public static boolean field5979;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "[Z")
    private boolean[] field5940;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2551(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLza;)V", line = 4)
    public final void method2534(byte arg0, class287 arg1) {
        this.method2544(this.field5965, this.field5955, arg1, true, (byte) 6, true, 262144);
        int var3 = 116 % ((arg0 - 59) / 52);
        field5939++;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)I", line = 14)
    public final int method2535(byte arg0) {
        field5942++;
        if (arg0 <= 118) {
            this.field5955 = 117;
        }
        return this.field5937;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Le;IZIILza;IZ)V", line = 32)
    public final void method2536(class373 arg0, int arg1, boolean arg2, int arg3, int arg4, class287 arg5, int arg6, boolean arg7) {
        field5941++;
        class142[] var9 = arg0.method2009();
        if (arg2) {
            return;
        }
        class127[] var10 = arg0.method2015();
        if ((this.field5954 == null || this.field5954.field477) && (var9 != null || var10 != null)) {
            class70 var11 = class123.field1593.method2920(this.field5938, 19219);
            if (var11.field848 != null) {
                var11 = var11.method403(-1, class52.field606);
            }
            if (var11 != null) {
                this.field5954 = new class46(class532.field7836);
            }
        }
        if (this.field5954 == null) {
            return;
        }
        if (arg7) {
            this.field5954.method259(arg5, (long) class532.field7836, var9, var10, false);
        } else {
            this.field5954.method265((long) class532.field7836);
        }
        this.field5954.method253(this.field5962, arg3, arg1, arg6, arg4);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V", line = 70)
    private final void method2537(int arg0, int arg1) {
        field5948++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class70 var5 = class123.field1593.method2920(this.field5938, 19219);
            class70 var6 = var5;
            if (var5.field848 != null) {
                var5 = var5.method403(-1, class52.field606);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field833 != null) {
                if (this.field5963 != null && var5.method415((byte) 54, this.field5963.field3468)) {
                    return;
                }
                var3 = var5.method408(-1930);
                if (this.field5970 != var5.field834) {
                    var4 = var5.field871;
                }
            } else if (var5.field902 == -1) {
                if (var6 != null && var6.field833 != null) {
                    if (this.field5963 != null && var6.method415((byte) -85, this.field5963.field3468)) {
                        return;
                    }
                    var3 = var6.method408(-1930);
                    if (this.field5970 != var6.field834) {
                        var4 = var6.field871;
                    }
                } else if (var6 != null && var6.field902 != -1 && this.field5970 != var6.field834) {
                    var4 = var6.field871;
                    var3 = var6.field902;
                }
            } else if (this.field5970 != var5.field834) {
                var4 = var5.field871;
                var3 = var5.field902;
            }
        }
        if (var3 == -1) {
            this.field5963 = null;
            return;
        }
        this.field5966 = null;
        if (this.field5963 == null || this.field5963.field3468 != var3) {
            this.field5963 = class7.field97.method2951(var3, -13765);
        } else if (this.field5963.field3475 == 0) {
            return;
        }
        if (this.field5963.field3474 == null) {
            this.field5963 = null;
            return;
        }
        if (var4) {
            this.field5956 = (int) (Math.random() * (double) this.field5963.field3474.length);
            this.field5961 = (int) (Math.random() * (double) this.field5963.field3489[this.field5956]) + 1;
        } else {
            this.field5961 = 1;
            this.field5956 = 0;
        }
        if (arg1 < 126) {
            this.method2544(95, 73, null, false, (byte) 94, false, -121);
        }
        this.field5960 = this.field5956 + 1;
        if (this.field5960 < 0 || this.field5963.field3474.length <= this.field5960) {
            this.field5960 = -1;
        }
        this.field5969 = class532.field7836 - this.field5961;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II[[BI[I[I[[B[B)I", line = 194)
    public static final int method2538(int arg0, int arg1, byte[][] arg2, int arg3, int[] arg4, int[] arg5, byte[][] arg6, byte[] arg7) {
        field5952++;
        int var8 = arg5[arg1];
        int var9 = arg4[arg1] + var8;
        int var10 = arg5[arg3];
        int var11 = arg4[arg3] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg7[arg1] & arg0;
        if ((arg7[arg3] & 0xFF) < var14) {
            var14 = arg7[arg3] & 0xFF;
        }
        byte[] var15 = arg6[arg1];
        byte[] var16 = arg2[arg3];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var15[var17++] + var16[var18++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V", line = 255)
    private final void method2539(int arg0, int arg1, int arg2) {
        field5958++;
        int var4 = -30 % ((-arg1 - 55) / 56);
        label88: while (true) {
            if (this.field5963 == null) {
                if (this.field5971) {
                    return;
                }
                this.method2537(-1, 127);
                if (this.field5963 == null) {
                    return;
                }
            }
            int var5 = class532.field7836 - this.field5969;
            if (var5 > 100 && this.field5963.field3482 > 0) {
                int var6 = this.field5963.field3474.length - this.field5963.field3482;
                while (this.field5956 < var6 && this.field5963.field3489[this.field5956] < var5) {
                    var5 -= this.field5963.field3489[this.field5956];
                    this.field5956++;
                }
                if (var6 <= this.field5956) {
                    int var7 = 0;
                    for (int var8 = var6; var8 < this.field5963.field3474.length; var8++) {
                        var7 += this.field5963.field3489[var8];
                    }
                    var5 %= var7;
                }
                this.field5960 = this.field5956 + 1;
                if (this.field5963.field3474.length <= this.field5960) {
                    this.field5960 -= this.field5963.field3482;
                    if (this.field5960 < 0 || this.field5963.field3474.length <= this.field5960) {
                        this.field5960 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field5963.field3489[this.field5956] >= var5) {
                            this.field5969 = class532.field7836 - var5;
                            this.field5961 = var5;
                            return;
                        }
                        class276.method1678(this.field5963, this.field5962, arg0, (byte) 118, arg2, false, this.field5956);
                        var5 -= this.field5963.field3489[this.field5956];
                        this.field5956++;
                        if (this.field5956 >= this.field5963.field3474.length) {
                            this.field5956 -= this.field5963.field3482;
                            if (this.field5956 < 0 || this.field5956 >= this.field5963.field3474.length) {
                                this.field5963 = null;
                                continue label88;
                            }
                        }
                        this.field5960 = this.field5956 + 1;
                    } while (this.field5960 < this.field5963.field3474.length);
                    this.field5960 -= this.field5963.field3482;
                } while (this.field5960 >= 0 && this.field5960 < this.field5963.field3474.length);
                this.field5960 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)V", line = 352)
    public final void method2540(byte arg0, int arg1) {
        if (arg0 <= 88) {
            this.field5977 = 2;
        }
        this.field5971 = true;
        field5976++;
        this.method2537(arg1, 127);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIIZI)Z", line = 364)
    public static final boolean method2541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field5951++;
        if (!arg7) {
            method2538(8, -38, null, -89, null, null, null, null);
        }
        if (arg1 < (arg3 + arg6) && arg6 < (arg1 + arg2)) {
            return (arg4 + arg8) > arg0 && arg0 + arg5 > arg8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)V", line = 383)
    public static final void method2542(byte arg0) {
        field5975++;
        if (arg0 != -121) {
            method2548(20, null);
        }
        if (class137.field1839 == 2) {
            class164.field2144 = 96;
            return;
        }
        try {
            Method var1 = (field5981 == null ? (field5981 = method2551("java.lang.Runtime")) : field5981).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class164.field2144 = (int) (var3 / 1048576L) + 1;
                    return;
                } catch (Throwable var4) {
                    return;
                }
            }
        } catch (Exception var5) {
            return;
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)V", line = 419)
    public static final void method2543(int arg0, int arg1) {
        if (arg1 == -7460) {
            field5973++;
            class184 var2 = class277.method1682(arg0, 16, -76);
            var2.method1075((byte) -75);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILza;ZBZI)Le;", line = 432)
    public final class373 method2544(int arg0, int arg1, class287 arg2, boolean arg3, byte arg4, boolean arg5, int arg6) {
        field5943++;
        class70 var8 = class123.field1593.method2920(this.field5938, 19219);
        if (var8.field848 != null) {
            var8 = var8.method403(-1, class52.field606);
        }
        if (var8 == null) {
            this.method2549(1, arg2);
            this.field5957 = this.field5956;
            this.field5970 = -1;
            return null;
        }
        if (!this.field5971 && this.field5970 != var8.field834) {
            this.field5966 = null;
            this.method2537(-1, 127);
        }
        this.method2539(arg1, 107, arg0);
        boolean var9 = arg3 & this.field5968 & class319.field4256.method2058(class20.field183, 1) != 0;
        boolean var10 = var9 & (this.field5970 != var8.field834 || (this.field5957 != this.field5956 || this.field5963 != null && (this.field5963.field3477 || class134.field1761) && this.field5960 != this.field5956) && class319.field4256.method2058(class20.field183, 1) >= 2);
        if (arg5 && !var10) {
            this.field5957 = this.field5956;
            this.field5970 = var8.field834;
            return null;
        }
        if (var10) {
            class488.method2957(this.field5967, this.field5944, this.field5955, this.field5965, this.field5940);
        }
        if (arg4 != 6) {
            method2550(-107, (byte) -14, -25, -13);
        }
        class38 var11 = class152.field1993[this.field5944];
        class38 var12;
        if (this.field5947) {
            var12 = class14.field152[0];
        } else {
            var12 = this.field5944 >= 3 ? null : class152.field1993[this.field5944 + 1];
        }
        class373 var13 = null;
        if (this.field5963 != null) {
            if (var10) {
                arg6 |= 0x40000;
            }
            var13 = var8.method409((byte) 122, this.field5965, this.field5956, var11.method216(this.field5955, this.field5965), arg6, var12, this.field5961, this.field5977 == 11 ? this.field5949 + 4 : this.field5949, this.field5963, this.field5960, arg2, var11, this.field5955, this.field5977 == 11 ? 10 : this.field5977);
            if (var13 == null) {
                this.field5940 = null;
                this.field5967 = null;
                this.field5937 = 0;
            } else {
                if (var10) {
                    if (this.field5940 == null) {
                        this.field5940 = new boolean[4];
                    }
                    this.field5967 = var13.method2017(this.field5967);
                    class378.method2312(this.field5967, this.field5944, arg1, arg0, this.field5940);
                }
                this.field5937 = var13.method2041();
            }
            this.field5966 = null;
        } else if (this.field5966 != null && (this.field5966.method2025() & arg6) == arg6 && this.field5970 == var8.field834) {
            var13 = this.field5966;
        } else {
            if (this.field5966 != null) {
                arg6 |= this.field5966.method2025();
            }
            class190 var14 = var8.method416(0, var11, arg6, var10, this.field5977 == 11 ? 10 : this.field5977, this.field5965, var12, var11.method216(this.field5955, this.field5965), arg2, this.field5955, this.field5977 == 11 ? this.field5949 + 4 : this.field5949);
            if (var14 == null) {
                this.field5967 = null;
                this.field5937 = 0;
                this.field5940 = null;
                this.field5966 = null;
            } else {
                var13 = var14.field2455;
                this.field5966 = var14.field2455;
                if (var10) {
                    this.field5940 = null;
                    this.field5967 = var14.field2454;
                    class378.method2312(this.field5967, this.field5944, arg1, arg0, null);
                }
                this.field5937 = var13.method2041();
            }
        }
        this.field5955 = arg1;
        this.field5965 = arg0;
        this.field5957 = this.field5956;
        this.field5970 = var8.field834;
        return var13;
    }

    @OriginalMember(owner = "client!pm", name = "finalize", descriptor = "()V", line = 559)
    protected final void finalize() {
        if (this.field5954 != null) {
            this.field5954.method261();
        }
        field5950++;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lza;Ler;IIIIIIZI)V", line = 707)
    public class415(class287 arg0, class70 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field5944 = (byte) arg5;
        this.field5965 = arg7;
        this.field5977 = arg2;
        this.field5949 = arg3;
        this.field5962 = (byte) arg4;
        this.field5955 = arg6;
        this.field5938 = arg1.field834;
        this.field5947 = arg8;
        this.field5968 = arg0.method1129() && arg1.field820 && !this.field5947;
        if (arg9 != -1) {
            this.field5971 = true;
        }
        this.method2537(arg9, 127);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Z", line = 579)
    public final boolean method2545(int arg0) {
        field5974++;
        if (arg0 != 11802) {
            this.field5962 = 8;
        }
        return this.field5968;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 593)
    public static void method2546(boolean arg0) {
        if (arg0) {
            method2546(false);
        }
        field5953 = null;
        field5946 = null;
        field5978 = null;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)Lrv;", line = 608)
    public static final class73 method2547(int arg0, int arg1, int arg2) {
        class498 var3 = class186.field2421[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class73 var4 = var3.field7273;
            var3.field7273 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILfo;)V", line = 620)
    public static final void method2548(int arg0, class361 arg1) {
        if (arg0 != -4) {
            field5980 = -88;
        }
        field5945++;
        class363.field4960 = arg1;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILza;)V", line = 637)
    public final void method2549(int arg0, class287 arg1) {
        if (this.field5967 != null) {
            class488.method2957(this.field5967, this.field5944, this.field5955, this.field5965, this.field5940);
            this.field5967 = null;
            this.field5940 = null;
        }
        field5964++;
        if (arg0 != 1) {
            this.method2549(68, null);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBII)V", line = 656)
    public static final void method2550(int arg0, byte arg1, int arg2, int arg3) {
        field5959++;
        if (arg0 == 0) {
            class259.field3454++;
            class492.method2979(class303.field4034, 34);
        }
        if (arg1 >= -10) {
            field5979 = false;
        }
        if (arg0 == 1) {
            class490.field7174++;
            class492.method2979(class223.field3003, 94);
        }
        class106.field1443.method2419(-9321, class413.field5893.method1472(28251, 82) ? 1 : 0);
        class106.field1443.method2410(false, arg2 + class357.field4867);
        class106.field1443.method2444((byte) 65, class418.field6074 + arg3);
        class234.field3122 = arg2;
        class417.field6028 = arg3;
        class20.field180 = false;
        class336.method1959((byte) -76);
    }
}
