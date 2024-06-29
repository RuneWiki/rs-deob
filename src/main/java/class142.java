import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class142 {

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    private int field2206 = 0;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    private int field2209;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    private int field2198;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    private int field2202;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "[[I")
    public int[][] field2211;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "Ld;")
    public static class259 field2205 = new class259(0, 0);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BII)V")
    public final void method942(byte arg0, int arg1, int arg2) {
        if (arg0 != -25) {
            this.field2209 = -109;
        }
        int var4 = arg1 - this.field2206;
        field2207++;
        int var5 = arg2 - this.field2198;
        this.field2211[var4][var5] = class82.method554(this.field2211[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public final void method943(int arg0) {
        field2199++;
        if (arg0 <= 119) {
            return;
        }
        for (int var2 = 0; var2 < this.field2209; var2++) {
            for (int var3 = 0; var3 < this.field2202; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field2209 - 5) <= var2 || var3 >= this.field2202 - 5) {
                    this.field2211[var2][var3] = 16777215;
                } else {
                    this.field2211[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLfa;Lfa;Lfa;)V")
    public static final void method944(byte arg0, class273 arg1, class273 arg2, class273 arg3) {
        class179.field2780 = arg3;
        if (arg0 >= -46) {
            method957(-87, 5, -125, -77, 114);
        }
        class143.field2223 = arg1;
        field2204++;
        class209.field3354 = arg2;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public static final void method945(int arg0) {
        class140.field2161.method144(0);
        if (arg0 == 33554432) {
            field2213++;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(BII)V")
    public final void method946(byte arg0, int arg1, int arg2) {
        field2220++;
        int var4 = -109 % ((-arg0 - 14) / 61);
        int var5 = arg1 - this.field2206;
        int var6 = arg2 - this.field2198;
        this.field2211[var5][var6] = class10.method53(this.field2211[var5][var6], -262145);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B[I[I[ILbl;)V")
    public static final void method947(byte arg0, int[] arg1, int[] arg2, int[] arg3, class35 arg4) {
        field2200++;
        if (arg0 < 39) {
            method954(-49);
        }
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var7 != 0 && arg4.field851.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field851[var9] = null;
                    } else {
                        class200 var10 = class196.method1359(var6, (byte) 21);
                        int var11 = var10.field3171;
                        class219 var12 = arg4.field851[var9];
                        if (var12 != null) {
                            if (var12.field3493 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field851[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3490 = var8;
                                    var12.field3492 = 1;
                                    var12.field3495 = 0;
                                    var12.field3497 = 0;
                                    var12.field3498 = 0;
                                    class49.method303(false, false, arg4.field836, 0, var10, arg4.field850);
                                } else if (var11 == 2) {
                                    var12.field3497 = 0;
                                }
                            } else if (var10.field3173 >= class196.method1359(var12.field3493, (byte) 21).field3173) {
                                var12 = arg4.field851[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class219 var13 = arg4.field851[var9] = new class219();
                            var13.field3492 = 1;
                            var13.field3493 = var6;
                            var13.field3498 = 0;
                            var13.field3490 = var8;
                            var13.field3495 = 0;
                            var13.field3497 = 0;
                            class49.method303(false, false, arg4.field836, 0, var10, arg4.field850);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIBI)V")
    private final void method948(int arg0, int arg1, byte arg2, int arg3) {
        field2217++;
        if (arg2 < 112) {
            this.method959(-35, (byte) -23, 111, 8, 109, false, -31, false);
        }
        this.field2211[arg3][arg1] = class82.method554(this.field2211[arg3][arg1], arg0);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZBIIIZI)V")
    public final void method949(boolean arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg4 - this.field2206;
        int var9 = arg6 - this.field2198;
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method956(64, var9, 128, var8);
                this.method956(64, var9, 8, var8 - 1);
            }
            if (arg2 == 1) {
                this.method956(64, var9, 2, var8);
                this.method956(64, var9 + 1, 32, var8);
            }
            if (arg2 == 2) {
                this.method956(64, var9, 8, var8);
                this.method956(64, var9, 128, var8 + 1);
            }
            if (arg2 == 3) {
                this.method956(arg1 + 168, var9, 32, var8);
                this.method956(64, var9 - 1, 2, var8);
            }
        }
        field2216++;
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method956(64, var9, 1, var8);
                this.method956(64, var9 + 1, 16, var8 - 1);
            }
            if (arg2 == 1) {
                this.method956(64, var9, 4, var8);
                this.method956(arg1 + 168, var9 + 1, 64, var8 + 1);
            }
            if (arg2 == 2) {
                this.method956(64, var9, 16, var8);
                this.method956(64, var9 - 1, 1, var8 + 1);
            }
            if (arg2 == 3) {
                this.method956(64, var9, 64, var8);
                this.method956(64, var9 - 1, 4, var8 - 1);
            }
        }
        if (arg1 != -104) {
            this.field2211 = null;
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method956(64, var9, 130, var8);
                this.method956(64, var9, 8, var8 - 1);
                this.method956(arg1 ^ 0xFFFFFFD8, var9 + 1, 32, var8);
            }
            if (arg2 == 1) {
                this.method956(64, var9, 10, var8);
                this.method956(64, var9 + 1, 32, var8);
                this.method956(64, var9, 128, var8 + 1);
            }
            if (arg2 == 2) {
                this.method956(64, var9, 40, var8);
                this.method956(64, var9, 128, var8 + 1);
                this.method956(64, var9 - 1, 2, var8);
            }
            if (arg2 == 3) {
                this.method956(arg1 + 168, var9, 160, var8);
                this.method956(arg1 ^ 0xFFFFFFD8, var9 - 1, 2, var8);
                this.method956(arg1 + 168, var9, 8, var8 - 1);
            }
        }
        if (arg0) {
            if (arg3 == 0) {
                if (arg2 == 0) {
                    this.method956(64, var9, 65536, var8);
                    this.method956(64, var9, 4096, var8 - 1);
                }
                if (arg2 == 1) {
                    this.method956(64, var9, 1024, var8);
                    this.method956(64, var9 + 1, 16384, var8);
                }
                if (arg2 == 2) {
                    this.method956(64, var9, 4096, var8);
                    this.method956(64, var9, 65536, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method956(64, var9, 16384, var8);
                    this.method956(64, var9 - 1, 1024, var8);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg2 == 0) {
                    this.method956(64, var9, 512, var8);
                    this.method956(arg1 ^ 0xFFFFFFD8, var9 + 1, 8192, var8 - 1);
                }
                if (arg2 == 1) {
                    this.method956(arg1 + 168, var9, 2048, var8);
                    this.method956(64, var9 + 1, 32768, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method956(arg1 ^ 0xFFFFFFD8, var9, 8192, var8);
                    this.method956(arg1 ^ 0xFFFFFFD8, var9 - 1, 512, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method956(64, var9, 32768, var8);
                    this.method956(arg1 ^ 0xFFFFFFD8, var9 - 1, 2048, var8 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg2 == 0) {
                    this.method956(64, var9, 66560, var8);
                    this.method956(arg1 + 168, var9, 4096, var8 - 1);
                    this.method956(64, var9 + 1, 16384, var8);
                }
                if (arg2 == 1) {
                    this.method956(64, var9, 5120, var8);
                    this.method956(64, var9 + 1, 16384, var8);
                    this.method956(arg1 + 168, var9, 65536, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method956(arg1 + 168, var9, 20480, var8);
                    this.method956(64, var9, 65536, var8 + 1);
                    this.method956(arg1 ^ 0xFFFFFFD8, var9 - 1, 1024, var8);
                }
                if (arg2 == 3) {
                    this.method956(64, var9, 81920, var8);
                    this.method956(64, var9 - 1, 1024, var8);
                    this.method956(arg1 + 168, var9, 4096, var8 - 1);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method956(64, var9, 536870912, var8);
                this.method956(arg1 + 168, var9, 33554432, var8 - 1);
            }
            if (arg2 == 1) {
                this.method956(arg1 + 168, var9, 8388608, var8);
                this.method956(arg1 ^ 0xFFFFFFD8, var9 + 1, 134217728, var8);
            }
            if (arg2 == 2) {
                this.method956(arg1 + 168, var9, 33554432, var8);
                this.method956(64, var9, 536870912, var8 + 1);
            }
            if (arg2 == 3) {
                this.method956(64, var9, 134217728, var8);
                this.method956(64, var9 - 1, 8388608, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method956(64, var9, 4194304, var8);
                this.method956(64, var9 + 1, 67108864, var8 - 1);
            }
            if (arg2 == 1) {
                this.method956(arg1 + 168, var9, 16777216, var8);
                this.method956(64, var9 + 1, 268435456, var8 + 1);
            }
            if (arg2 == 2) {
                this.method956(64, var9, 67108864, var8);
                this.method956(64, var9 - 1, 4194304, var8 + 1);
            }
            if (arg2 == 3) {
                this.method956(64, var9, 268435456, var8);
                this.method956(arg1 + 168, var9 + -1, 16777216, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method956(arg1 ^ 0xFFFFFFD8, var9, 545259520, var8);
            this.method956(64, var9, 33554432, var8 - 1);
            this.method956(arg1 + 168, var9 + 1, 134217728, var8);
        }
        if (arg2 == 1) {
            this.method956(64, var9, 41943040, var8);
            this.method956(arg1 ^ 0xFFFFFFD8, var9 + 1, 134217728, var8);
            this.method956(64, var9, 536870912, var8 + 1);
        }
        if (arg2 == 2) {
            this.method956(arg1 + 168, var9, 167772160, var8);
            this.method956(arg1 + 168, var9, 536870912, var8 + 1);
            this.method956(64, var9 - 1, 8388608, var8);
        }
        if (arg2 == 3) {
            this.method956(64, var9, 671088640, var8);
            this.method956(64, var9 - 1, 8388608, var8);
            this.method956(64, var9, 33554432, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(CB)Z")
    public static final boolean method950(char arg0, byte arg1) {
        field2221++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else if (arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ') {
            return true;
        } else if (arg1 == -15) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIZZB)V")
    public final void method951(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, byte arg6) {
        if (arg6 != 29) {
            method950('_', (byte) 113);
        }
        int var8 = arg2 - this.field2198;
        int var9 = arg3 - this.field2206;
        field2208++;
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method948(128, var8, (byte) 121, var9);
                this.method948(8, var8, (byte) 117, var9 - 1);
            }
            if (arg1 == 1) {
                this.method948(2, var8, (byte) 121, var9);
                this.method948(32, var8 + 1, (byte) 125, var9);
            }
            if (arg1 == 2) {
                this.method948(8, var8, (byte) 118, var9);
                this.method948(128, var8, (byte) 120, var9 + 1);
            }
            if (arg1 == 3) {
                this.method948(32, var8, (byte) 122, var9);
                this.method948(2, var8 - 1, (byte) 120, var9);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method948(1, var8, (byte) 123, var9);
                this.method948(16, var8 + 1, (byte) 122, var9 - 1);
            }
            if (arg1 == 1) {
                this.method948(4, var8, (byte) 119, var9);
                this.method948(64, var8 + 1, (byte) 122, var9 + 1);
            }
            if (arg1 == 2) {
                this.method948(16, var8, (byte) 119, var9);
                this.method948(1, var8 - 1, (byte) 124, var9 + 1);
            }
            if (arg1 == 3) {
                this.method948(64, var8, (byte) 122, var9);
                this.method948(4, var8 - 1, (byte) 115, var9 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method948(130, var8, (byte) 122, var9);
                this.method948(8, var8, (byte) 117, var9 - 1);
                this.method948(32, var8 + 1, (byte) 118, var9);
            }
            if (arg1 == 1) {
                this.method948(10, var8, (byte) 114, var9);
                this.method948(32, var8 + 1, (byte) 113, var9);
                this.method948(128, var8, (byte) 119, var9 + 1);
            }
            if (arg1 == 2) {
                this.method948(40, var8, (byte) 114, var9);
                this.method948(128, var8, (byte) 116, var9 + 1);
                this.method948(2, var8 - 1, (byte) 119, var9);
            }
            if (arg1 == 3) {
                this.method948(160, var8, (byte) 114, var9);
                this.method948(2, var8 - 1, (byte) 121, var9);
                this.method948(8, var8, (byte) 119, var9 - 1);
            }
        }
        if (arg5) {
            if (arg0 == 0) {
                if (arg1 == 0) {
                    this.method948(65536, var8, (byte) 121, var9);
                    this.method948(4096, var8, (byte) 116, var9 - 1);
                }
                if (arg1 == 1) {
                    this.method948(1024, var8, (byte) 116, var9);
                    this.method948(16384, var8 + 1, (byte) 127, var9);
                }
                if (arg1 == 2) {
                    this.method948(4096, var8, (byte) 126, var9);
                    this.method948(65536, var8, (byte) 124, var9 + 1);
                }
                if (arg1 == 3) {
                    this.method948(16384, var8, (byte) 116, var9);
                    this.method948(1024, var8 - 1, (byte) 117, var9);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg1 == 0) {
                    this.method948(512, var8, (byte) 114, var9);
                    this.method948(8192, var8 + 1, (byte) 127, var9 - 1);
                }
                if (arg1 == 1) {
                    this.method948(2048, var8, (byte) 117, var9);
                    this.method948(32768, var8 + 1, (byte) 117, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method948(8192, var8, (byte) 118, var9);
                    this.method948(512, var8 - 1, (byte) 119, var9 + 1);
                }
                if (arg1 == 3) {
                    this.method948(32768, var8, (byte) 116, var9);
                    this.method948(2048, var8 - 1, (byte) 125, var9 - 1);
                }
            }
            if (arg0 == 2) {
                if (arg1 == 0) {
                    this.method948(66560, var8, (byte) 119, var9);
                    this.method948(4096, var8, (byte) 113, var9 - 1);
                    this.method948(16384, var8 + 1, (byte) 126, var9);
                }
                if (arg1 == 1) {
                    this.method948(5120, var8, (byte) 118, var9);
                    this.method948(16384, var8 + 1, (byte) 119, var9);
                    this.method948(65536, var8, (byte) 121, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method948(20480, var8, (byte) 114, var9);
                    this.method948(65536, var8, (byte) 126, var9 + 1);
                    this.method948(1024, var8 - 1, (byte) 120, var9);
                }
                if (arg1 == 3) {
                    this.method948(81920, var8, (byte) 120, var9);
                    this.method948(1024, var8 - 1, (byte) 115, var9);
                    this.method948(4096, var8, (byte) 113, var9 - 1);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method948(536870912, var8, (byte) 123, var9);
                this.method948(33554432, var8, (byte) 121, var9 - 1);
            }
            if (arg1 == 1) {
                this.method948(8388608, var8, (byte) 121, var9);
                this.method948(134217728, var8 + 1, (byte) 122, var9);
            }
            if (arg1 == 2) {
                this.method948(33554432, var8, (byte) 116, var9);
                this.method948(536870912, var8, (byte) 122, var9 + 1);
            }
            if (arg1 == 3) {
                this.method948(134217728, var8, (byte) 114, var9);
                this.method948(8388608, var8 - 1, (byte) 121, var9);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method948(4194304, var8, (byte) 122, var9);
                this.method948(67108864, var8 + 1, (byte) 121, var9 - 1);
            }
            if (arg1 == 1) {
                this.method948(16777216, var8, (byte) 126, var9);
                this.method948(268435456, var8 + 1, (byte) 120, var9 + 1);
            }
            if (arg1 == 2) {
                this.method948(67108864, var8, (byte) 126, var9);
                this.method948(4194304, var8 - 1, (byte) 127, var9 + 1);
            }
            if (arg1 == 3) {
                this.method948(268435456, var8, (byte) 113, var9);
                this.method948(16777216, var8 - 1, (byte) 119, var9 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method948(545259520, var8, (byte) 118, var9);
            this.method948(33554432, var8, (byte) 118, var9 - 1);
            this.method948(134217728, var8 + 1, (byte) 118, var9);
        }
        if (arg1 == 1) {
            this.method948(41943040, var8, (byte) 123, var9);
            this.method948(134217728, var8 + 1, (byte) 113, var9);
            this.method948(536870912, var8, (byte) 117, var9 + 1);
        }
        if (arg1 == 2) {
            this.method948(167772160, var8, (byte) 122, var9);
            this.method948(536870912, var8, (byte) 119, var9 + 1);
            this.method948(8388608, var8 - 1, (byte) 122, var9);
        }
        if (arg1 == 3) {
            this.method948(671088640, var8, (byte) 122, var9);
            this.method948(8388608, var8 - 1, (byte) 126, var9);
            this.method948(33554432, var8, (byte) 127, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)I")
    public static final int method952(byte arg0) {
        if (arg0 <= 121) {
            return -85;
        } else {
            field2201++;
            return 6;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZZIIIII)V")
    public final void method953(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field2206;
        field2215++;
        int var9 = arg5 - this.field2198;
        int var10 = arg3;
        if (arg1) {
            var10 = arg3 | 0x20000;
        }
        if (arg0) {
            var10 |= 0x40000000;
        }
        for (int var11 = var8; var11 < (arg4 + var8); var11++) {
            if (var11 >= 0 && var11 < this.field2209) {
                for (int var12 = var9; var12 < arg6 + var9; var12++) {
                    if (var12 >= 0 && this.field2202 > var12) {
                        this.method948(var10, var12, (byte) 124, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
    public static void method954(int arg0) {
        field2205 = null;
        if (arg0 != 12633) {
            field2205 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZIIIIIIIII)Z")
    private final boolean method955(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2196++;
        int var11 = arg5 + arg8;
        int var12 = arg9 + arg7;
        int var13 = arg1 + arg6;
        if (arg0) {
            this.method943(126);
        }
        int var14 = arg3 + arg4;
        if (arg8 == var12 && (arg2 & 0x2) == 0) {
            int var15 = arg3 >= arg6 ? arg3 : arg6;
            int var16 = var13 < var14 ? var13 : var14;
            while (var16 > var15) {
                if ((this.field2211[var12 - this.field2206 - 1][var15 - this.field2198] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg9 == var11 && (arg2 & 0x8) == 0) {
            int var17 = arg3 >= arg6 ? arg3 : arg6;
            int var18 = var14 <= var13 ? var14 : var13;
            while (var17 < var18) {
                if ((this.field2211[arg9 - this.field2206][var17 - this.field2198] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg6 == var14 && (arg2 & 0x1) == 0) {
            int var19 = var12 <= var11 ? var12 : var11;
            for (int var20 = arg8 <= arg9 ? arg9 : arg8; var20 < var19; var20++) {
                if ((this.field2211[var20 - this.field2206][var14 - this.field2198 - 1] & 0x2) == 0) {
                    return true;
                }
            }
        } else if (arg3 == var13 && (arg2 & 0x4) == 0) {
            int var21 = arg9 >= arg8 ? arg9 : arg8;
            int var22 = var11 >= var12 ? var12 : var11;
            while (var22 > var21) {
                if ((this.field2211[var21 - this.field2206][arg3 - this.field2198] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIII)V")
    private final void method956(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 64) {
            this.field2209 = -99;
        }
        field2203++;
        this.field2211[arg3][arg1] = class10.method53(this.field2211[arg3][arg1], ~arg2);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIII)V")
    public static final void method957(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2212++;
        if (arg0 > arg4) {
            for (int var5 = arg4; var5 < arg0; var5++) {
                class130.field2005[var5][arg1] = arg3;
            }
        } else {
            for (int var6 = arg0; var6 < arg4; var6++) {
                class130.field2005[var6][arg1] = arg3;
            }
        }
        if (arg2 != 32) {
            field2205 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIBIIII)Z")
    public final boolean method958(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field2219++;
        if (arg1 > 1) {
            return class59.method368(arg0, arg1, arg2, arg5, arg1, arg6, arg3, (byte) -99, arg8) ? true : this.method955(false, arg1, arg7, arg2, arg3, arg1, arg5, arg8, arg6, arg0);
        }
        int var10 = arg2 + arg3 - 1;
        int var11 = arg0 + arg8 - 1;
        if (arg4 != 105) {
            this.field2202 = 82;
        }
        if (arg0 <= arg6 && arg6 <= var11 && arg2 <= arg5 && var10 >= arg5) {
            return true;
        } else if (arg0 - 1 == arg6 && arg2 <= arg5 && arg5 <= var10 && (this.field2211[arg6 - this.field2206][arg5 - this.field2198] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if ((var11 + 1) == arg6 && arg5 >= arg2 && var10 >= arg5 && (this.field2211[arg6 - this.field2206][arg5 - this.field2198] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg5 && arg6 >= arg0 && arg6 <= var11 && (this.field2211[arg6 - this.field2206][arg5 - this.field2198] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg5 && arg6 >= arg0 && arg6 <= var11 && (this.field2211[arg6 - this.field2206][arg5 - this.field2198] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBIIIZIZ)V")
    public final void method959(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, boolean arg7) {
        int var9 = arg3 - this.field2198;
        int var10 = arg4 - this.field2206;
        field2218++;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg0;
            arg0 = arg6;
            arg6 = var11;
        }
        int var12 = 256;
        if (arg5) {
            var12 |= 0x20000;
        }
        if (arg7) {
            var12 |= 0x40000000;
        }
        if (arg1 >= -32) {
            return;
        }
        for (int var13 = var10; var13 < arg0 + var10; var13++) {
            if (var13 >= 0 && this.field2209 > var13) {
                for (int var14 = var9; var14 < arg6 + var9; var14++) {
                    if (var14 >= 0 && var14 < this.field2202) {
                        this.method956(64, var14, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method960(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2210++;
        if (arg4 == 1) {
            if (arg5 == arg7 && arg3 == arg6) {
                return true;
            }
        } else if (arg5 >= arg7 && arg5 <= arg7 + arg4 - 1 && arg3 <= arg3 && arg3 <= arg3 + arg4 - 1) {
            return true;
        }
        if (arg2 != 9270) {
            this.field2209 = -29;
        }
        int var9 = arg5 - this.field2206;
        int var10 = arg6 - this.field2198;
        int var11 = arg7 - this.field2206;
        int var12 = arg3 - this.field2198;
        if (arg4 == 1) {
            if (arg0 == 0) {
                if (arg1 == 0) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field2211[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field2211[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field2211[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field2211[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field2211[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field2211[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 == var11 && var12 - 1 == var10) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field2211[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field2211[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg1 == 0) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field2211[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field2211[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field2211[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field2211[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field2211[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field2211[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field2211[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field2211[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var9 == var11 && (var12 + 1) == var10 && (this.field2211[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var12 - 1) == var10 && (this.field2211[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var11 && var10 == var12 && (this.field2211[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 == var12 && (this.field2211[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg4 - 1;
            int var14 = arg4 + var11 - 1;
            if (arg0 == 0) {
                if (arg1 == 0) {
                    if (var9 - arg4 == var11 && var12 >= var10 && var12 <= var13) {
                        return true;
                    }
                    if (var9 >= var11 && var14 >= var9 && var12 + 1 == var10 && (this.field2211[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var14 && (var12 - arg4) == var10 && (this.field2211[var9][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 <= var9 && var9 <= var14 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var9 - arg4) == var11 && var12 >= var10 && var13 >= var12 && (this.field2211[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 <= var12 && var13 >= var12 && (this.field2211[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var9 + 1) == var11 && var10 <= var12 && var13 >= var12) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var14 && (var12 + 1) == var10 && (this.field2211[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var14 && var12 - arg4 == var10 && (this.field2211[var9][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 >= var11 && var9 <= var14 && var12 - arg4 == var10) {
                        return true;
                    }
                    if ((var9 - arg4) == var11 && var10 <= var12 && var12 <= var13 && (this.field2211[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 <= var12 && var12 <= var13 && (this.field2211[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg1 == 0) {
                    if ((var9 - arg4) == var11 && var12 >= var10 && var13 >= var12) {
                        return true;
                    }
                    if (var9 >= var11 && var14 >= var9 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 >= var10 && var12 <= var13 && (this.field2211[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var14 && var12 - arg4 == var10 && (this.field2211[var9][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 - arg4 == var11 && var12 >= var10 && var13 >= var12 && (this.field2211[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var14 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 >= var10 && var12 <= var13) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var14 && (var12 - arg4) == var10 && (this.field2211[var9][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var9 - arg4 == var11 && var10 <= var12 && var13 >= var12 && (this.field2211[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var14 >= var9 && (var12 + 1) == var10 && (this.field2211[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 <= var12 && var12 <= var13) {
                        return true;
                    }
                    if (var9 >= var11 && var14 >= var9 && (var12 - arg4) == var10) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var9 - arg4) == var11 && var12 >= var10 && var12 <= var13) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var14 && var12 + 1 == var10 && (this.field2211[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 <= var12 && var12 <= var13 && (this.field2211[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var14 >= var9 && var12 - arg4 == var10) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var9 >= var11 && var9 <= var14 && (var12 + 1) == var10 && (this.field2211[var9][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var9 && var9 <= var14 && (var12 - arg4) == var10 && (this.field2211[var9][var13] & 0x2C0102) == 0) {
                    return true;
                }
                if (var9 - arg4 == var11 && var12 >= var10 && var12 <= var13 && (this.field2211[var14][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var10 <= var12 && var12 <= var13 && (this.field2211[var11][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIB)V")
    public final void method961(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field2198;
        if (arg2 != -33) {
            this.field2209 = 115;
        }
        field2197++;
        int var5 = arg1 - this.field2206;
        this.field2211[var5][var4] = class82.method554(this.field2211[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(II)V")
    public class142(int arg0, int arg1) {
        this.field2209 = arg0;
        this.field2198 = 0;
        this.field2202 = arg1;
        this.field2211 = new int[this.field2209][this.field2202];
        this.method943(125);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIBII)Z")
    public final boolean method962(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field2214++;
        if (arg3 == 1) {
            if (arg6 == arg7 && arg0 == arg1) {
                return true;
            }
        } else if (arg6 <= arg7 && arg7 <= (arg6 + arg3 - 1) && arg0 >= arg0 && arg0 + arg3 - 1 >= arg0) {
            return true;
        }
        int var9 = arg0 - this.field2198;
        int var10 = arg6 - this.field2206;
        int var11 = arg7 - this.field2206;
        if (arg5 != -47) {
            this.field2198 = 30;
        }
        int var12 = arg1 - this.field2198;
        if (arg3 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field2211[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field2211[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field2211[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field2211[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field2211[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field2211[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var11 + 1 == var10 && var9 == var12 && (this.field2211[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field2211[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var10 == var11 && (var9 + 1) == var12 && (this.field2211[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var9 - 1) == var12 && (this.field2211[var10][var12] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var10 && var9 == var12 && (this.field2211[var10][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var9 == var12 && (this.field2211[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 - (1 - arg3);
            int var14 = arg3 + var12 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var11 + 1 == var10 && var9 >= var12 && var9 <= var14 && (this.field2211[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var9 - arg3) == var12 && (this.field2211[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var11 - arg3 == var10 && var12 <= var9 && var9 <= var14 && (this.field2211[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && var9 - arg3 == var12 && (this.field2211[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var11 - arg3 == var10 && var12 <= var9 && var14 >= var9 && (this.field2211[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && var9 + 1 == var12 && (this.field2211[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var11 + 1) == var10 && var9 >= var12 && var14 >= var9 && (this.field2211[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var9 + 1) == var12 && (this.field2211[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var11 >= var10 && var13 >= var11 && var9 + 1 == var12 && (this.field2211[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 <= var11 && var13 >= var11 && var9 - arg3 == var12 && (this.field2211[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg3) == var10 && var9 >= var12 && var14 >= var9 && (this.field2211[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var12 <= var9 && var14 >= var9 && (this.field2211[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
