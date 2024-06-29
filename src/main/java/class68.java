import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class68 {

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    private int field878 = 0;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    private int field877;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    private int field885;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "[[I")
    public int[][] field889;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    private int field886;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[I")
    public static int[] field874 = new int[100];

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Ljava/lang/String;")
    public static String field881 = "Please wait...";

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Lkb;")
    public static class39 field884;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZIIIZZI)V", line = 12)
    public final void method441(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        int var8 = arg2 - this.field886;
        field883++;
        int var9 = arg6 - this.field878;
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method450(var9, 128, 8, var8);
                this.method450(var9 - 1, 8, 8, var8);
            }
            if (arg1 == 1) {
                this.method450(var9, 2, 8, var8);
                this.method450(var9, 32, 8, var8 + 1);
            }
            if (arg1 == 2) {
                this.method450(var9, 8, 8, var8);
                this.method450(var9 + 1, 128, 8, var8);
            }
            if (arg1 == 3) {
                this.method450(var9, 32, 8, var8);
                this.method450(var9, 2, 8, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method450(var9, 1, 8, var8);
                this.method450(var9 - 1, 16, 8, var8 + 1);
            }
            if (arg1 == 1) {
                this.method450(var9, 4, 8, var8);
                this.method450(var9 + 1, 64, 8, var8 + 1);
            }
            if (arg1 == 2) {
                this.method450(var9, 16, 8, var8);
                this.method450(var9 + 1, 1, 8, var8 - 1);
            }
            if (arg1 == 3) {
                this.method450(var9, 64, 8, var8);
                this.method450(var9 - 1, 4, 8, var8 - 1);
            }
        }
        if (!arg5) {
            this.method446(false, false, -99, -96, -32, 62, 3);
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method450(var9, 130, 8, var8);
                this.method450(var9 - 1, 8, 8, var8);
                this.method450(var9, 32, 8, var8 + 1);
            }
            if (arg1 == 1) {
                this.method450(var9, 10, 8, var8);
                this.method450(var9, 32, 8, var8 + 1);
                this.method450(var9 + 1, 128, 8, var8);
            }
            if (arg1 == 2) {
                this.method450(var9, 40, 8, var8);
                this.method450(var9 + 1, 128, 8, var8);
                this.method450(var9, 2, 8, var8 - 1);
            }
            if (arg1 == 3) {
                this.method450(var9, 160, 8, var8);
                this.method450(var9, 2, 8, var8 - 1);
                this.method450(var9 - 1, 8, 8, var8);
            }
        }
        if (arg0) {
            if (arg3 == 0) {
                if (arg1 == 0) {
                    this.method450(var9, 65536, 8, var8);
                    this.method450(var9 - 1, 4096, 8, var8);
                }
                if (arg1 == 1) {
                    this.method450(var9, 1024, 8, var8);
                    this.method450(var9, 16384, 8, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method450(var9, 4096, 8, var8);
                    this.method450(var9 + 1, 65536, 8, var8);
                }
                if (arg1 == 3) {
                    this.method450(var9, 16384, 8, var8);
                    this.method450(var9, 1024, 8, var8 - 1);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg1 == 0) {
                    this.method450(var9, 512, 8, var8);
                    this.method450(var9 - 1, 8192, 8, var8 + 1);
                }
                if (arg1 == 1) {
                    this.method450(var9, 2048, 8, var8);
                    this.method450(var9 + 1, 32768, 8, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method450(var9, 8192, 8, var8);
                    this.method450(var9 + 1, 512, 8, var8 - 1);
                }
                if (arg1 == 3) {
                    this.method450(var9, 32768, 8, var8);
                    this.method450(var9 - 1, 2048, 8, var8 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    this.method450(var9, 66560, 8, var8);
                    this.method450(var9 - 1, 4096, 8, var8);
                    this.method450(var9, 16384, 8, var8 + 1);
                }
                if (arg1 == 1) {
                    this.method450(var9, 5120, 8, var8);
                    this.method450(var9, 16384, 8, var8 + 1);
                    this.method450(var9 + 1, 65536, 8, var8);
                }
                if (arg1 == 2) {
                    this.method450(var9, 20480, 8, var8);
                    this.method450(var9 + 1, 65536, 8, var8);
                    this.method450(var9, 1024, 8, var8 - 1);
                }
                if (arg1 == 3) {
                    this.method450(var9, 81920, 8, var8);
                    this.method450(var9, 1024, 8, var8 - 1);
                    this.method450(var9 - 1, 4096, 8, var8);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method450(var9, 536870912, 8, var8);
                this.method450(var9 - 1, 33554432, 8, var8);
            }
            if (arg1 == 1) {
                this.method450(var9, 8388608, 8, var8);
                this.method450(var9, 134217728, 8, var8 + 1);
            }
            if (arg1 == 2) {
                this.method450(var9, 33554432, 8, var8);
                this.method450(var9 + 1, 536870912, 8, var8);
            }
            if (arg1 == 3) {
                this.method450(var9, 134217728, 8, var8);
                this.method450(var9, 8388608, 8, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method450(var9, 4194304, 8, var8);
                this.method450(var9 - 1, 67108864, 8, var8 + 1);
            }
            if (arg1 == 1) {
                this.method450(var9, 16777216, 8, var8);
                this.method450(var9 + 1, 268435456, 8, var8 + 1);
            }
            if (arg1 == 2) {
                this.method450(var9, 67108864, 8, var8);
                this.method450(var9 + 1, 4194304, 8, var8 - 1);
            }
            if (arg1 == 3) {
                this.method450(var9, 268435456, 8, var8);
                this.method450(var9 - 1, 16777216, 8, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method450(var9, 545259520, 8, var8);
            this.method450(var9 - 1, 33554432, 8, var8);
            this.method450(var9, 134217728, 8, var8 + 1);
        }
        if (arg1 == 1) {
            this.method450(var9, 41943040, 8, var8);
            this.method450(var9, 134217728, 8, var8 + 1);
            this.method450(var9 + 1, 536870912, 8, var8);
        }
        if (arg1 == 2) {
            this.method450(var9, 167772160, 8, var8);
            this.method450(var9 + 1, 536870912, 8, var8);
            this.method450(var9, 8388608, 8, var8 - 1);
        }
        if (arg1 == 3) {
            this.method450(var9, 671088640, 8, var8);
            this.method450(var9, 8388608, 8, var8 - 1);
            this.method450(var9 - 1, 33554432, 8, var8);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 321)
    public final void method442(byte arg0) {
        if (arg0 <= 40) {
            field884 = (class39) null;
        }
        for (int var2 = 0; var2 < this.field877; var2++) {
            for (int var3 = 0; var3 < this.field885; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field877 - 5) || (this.field885 - 5) <= var3) {
                    this.field889[var2][var3] = 16777215;
                } else {
                    this.field889[var2][var3] = 2097152;
                }
            }
        }
        field887++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V", line = 354)
    public final void method443(int arg0, int arg1, int arg2) {
        field893++;
        int var4 = arg1 - this.field886;
        int var5 = 112 / ((arg0 + 55) / 32);
        int var6 = arg2 - this.field878;
        this.field889[var6][var4] = class24.method149(this.field889[var6][var4], 262144);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lgn;B)V", line = 367)
    public static final void method444(class6 arg0, byte arg1) {
        class91.field1404 = 3;
        field890++;
        class127.method870(1404591760, true);
        class175.field2791 = true;
        class80.field1213 = 0;
        class330.field5138 = 0;
        if (arg1 >= -20) {
            method448(true);
        }
        class39.field512 = true;
        class139.field2076 = 127;
        class17.field227 = 2;
        class269.field4250 = true;
        class39.field548 = true;
        class202.field3302 = true;
        class243.field3859 = true;
        class63.field831 = true;
        class198.field3256 = 0;
        class337.field5229 = 127;
        class56.field739 = true;
        class238.field3766 = true;
        class226.field3598 = true;
        class196.field3219 = true;
        class13.field164 = 255;
        class301 var2 = null;
        class327.field5098 = 0;
        if (class130.field1924 < 96) {
            class167.method1152(0);
        } else {
            class167.method1152(2);
        }
        class325.field5079 = false;
        class17.field230 = 0;
        class86.field1304 = 0;
        class126.field1885 = true;
        class49.field674 = 0;
        class27.field390 = false;
        class263.field4174 = false;
        try {
            class217 var3 = arg0.method31((byte) -49, "runescape");
            while (var3.field3488 == 0) {
                class20.method128(0, 1L);
            }
            if (var3.field3488 == 1) {
                var2 = (class301) var3.field3490;
                byte[] var4 = new byte[(int) var2.method2107(1)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2104(var5, var4.length - var5, -84, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class52.method357(new class192(var4), 8);
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method2106((byte) 35);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIBIIZZI)V", line = 449)
    public final void method445(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        if (arg2 <= 98) {
            return;
        }
        int var9 = arg4 - this.field878;
        field873++;
        if (arg7 == 1 || arg7 == 3) {
            int var10 = arg0;
            arg0 = arg1;
            arg1 = var10;
        }
        int var11 = 256;
        int var12 = arg3 - this.field886;
        if (arg5) {
            var11 |= 0x20000;
        }
        if (arg6) {
            var11 |= 0x40000000;
        }
        for (int var13 = var9; var13 < (arg0 + var9); var13++) {
            if (var13 >= 0 && this.field877 > var13) {
                for (int var14 = var12; var14 < var12 + arg1; var14++) {
                    if (var14 >= 0 && var14 < this.field885) {
                        this.method453(var11, (byte) 69, var14, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZZIIIII)V", line = 505)
    public final void method446(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field875++;
        int var8 = arg5 - this.field886;
        int var9 = arg3 - this.field878;
        if (arg4 != 2) {
            this.field886 = 29;
        }
        if (arg6 == 0) {
            if (arg2 == 0) {
                this.method453(128, (byte) -23, var8, var9);
                this.method453(8, (byte) -4, var8, var9 - 1);
            }
            if (arg2 == 1) {
                this.method453(2, (byte) 119, var8, var9);
                this.method453(32, (byte) -32, var8 + 1, var9);
            }
            if (arg2 == 2) {
                this.method453(8, (byte) -117, var8, var9);
                this.method453(128, (byte) 80, var8, var9 + 1);
            }
            if (arg2 == 3) {
                this.method453(32, (byte) 72, var8, var9);
                this.method453(2, (byte) 105, var8 - 1, var9);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg2 == 0) {
                this.method453(1, (byte) 127, var8, var9);
                this.method453(16, (byte) -79, var8 + 1, var9 + -1);
            }
            if (arg2 == 1) {
                this.method453(4, (byte) 77, var8, var9);
                this.method453(64, (byte) -22, var8 + 1, var9 + 1);
            }
            if (arg2 == 2) {
                this.method453(16, (byte) -17, var8, var9);
                this.method453(1, (byte) 105, var8 - 1, var9 + 1);
            }
            if (arg2 == 3) {
                this.method453(64, (byte) -55, var8, var9);
                this.method453(4, (byte) -48, var8 - 1, var9 + -1);
            }
        }
        if (arg6 == 2) {
            if (arg2 == 0) {
                this.method453(130, (byte) -42, var8, var9);
                this.method453(8, (byte) -2, var8, var9 - 1);
                this.method453(32, (byte) 72, var8 + 1, var9);
            }
            if (arg2 == 1) {
                this.method453(10, (byte) 119, var8, var9);
                this.method453(32, (byte) -4, var8 + 1, var9);
                this.method453(128, (byte) -112, var8, var9 + 1);
            }
            if (arg2 == 2) {
                this.method453(40, (byte) -69, var8, var9);
                this.method453(128, (byte) -76, var8, var9 + 1);
                this.method453(2, (byte) 76, var8 - 1, var9);
            }
            if (arg2 == 3) {
                this.method453(160, (byte) 73, var8, var9);
                this.method453(2, (byte) 119, var8 - 1, var9);
                this.method453(8, (byte) 73, var8, var9 - 1);
            }
        }
        if (arg0) {
            if (arg6 == 0) {
                if (arg2 == 0) {
                    this.method453(65536, (byte) 120, var8, var9);
                    this.method453(4096, (byte) 91, var8, var9 - 1);
                }
                if (arg2 == 1) {
                    this.method453(1024, (byte) -104, var8, var9);
                    this.method453(16384, (byte) -69, var8 + 1, var9);
                }
                if (arg2 == 2) {
                    this.method453(4096, (byte) 73, var8, var9);
                    this.method453(65536, (byte) -77, var8, var9 + 1);
                }
                if (arg2 == 3) {
                    this.method453(16384, (byte) -33, var8, var9);
                    this.method453(1024, (byte) 117, var8 - 1, var9);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg2 == 0) {
                    this.method453(512, (byte) -56, var8, var9);
                    this.method453(8192, (byte) 77, var8 + 1, var9 + -1);
                }
                if (arg2 == 1) {
                    this.method453(2048, (byte) -76, var8, var9);
                    this.method453(32768, (byte) -44, var8 + 1, var9 - -1);
                }
                if (arg2 == 2) {
                    this.method453(8192, (byte) 72, var8, var9);
                    this.method453(512, (byte) -39, var8 - 1, var9 - -1);
                }
                if (arg2 == 3) {
                    this.method453(32768, (byte) -73, var8, var9);
                    this.method453(2048, (byte) -100, var8 - 1, var9 + -1);
                }
            }
            if (arg6 == 2) {
                if (arg2 == 0) {
                    this.method453(66560, (byte) 69, var8, var9);
                    this.method453(4096, (byte) 114, var8, var9 - 1);
                    this.method453(16384, (byte) 123, var8 + 1, var9);
                }
                if (arg2 == 1) {
                    this.method453(5120, (byte) -42, var8, var9);
                    this.method453(16384, (byte) -11, var8 + 1, var9);
                    this.method453(65536, (byte) 89, var8, var9 + 1);
                }
                if (arg2 == 2) {
                    this.method453(20480, (byte) 125, var8, var9);
                    this.method453(65536, (byte) 100, var8, var9 + 1);
                    this.method453(1024, (byte) 87, var8 - 1, var9);
                }
                if (arg2 == 3) {
                    this.method453(81920, (byte) 86, var8, var9);
                    this.method453(1024, (byte) 71, var8 - 1, var9);
                    this.method453(4096, (byte) 93, var8, var9 - 1);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg6 == 0) {
            if (arg2 == 0) {
                this.method453(536870912, (byte) 120, var8, var9);
                this.method453(33554432, (byte) -56, var8, var9 - 1);
            }
            if (arg2 == 1) {
                this.method453(8388608, (byte) 87, var8, var9);
                this.method453(134217728, (byte) 113, var8 + 1, var9);
            }
            if (arg2 == 2) {
                this.method453(33554432, (byte) -87, var8, var9);
                this.method453(536870912, (byte) -79, var8, var9 + 1);
            }
            if (arg2 == 3) {
                this.method453(134217728, (byte) 110, var8, var9);
                this.method453(8388608, (byte) 127, var8 - 1, var9);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg2 == 0) {
                this.method453(4194304, (byte) 106, var8, var9);
                this.method453(67108864, (byte) -35, var8 + 1, var9 + -1);
            }
            if (arg2 == 1) {
                this.method453(16777216, (byte) -74, var8, var9);
                this.method453(268435456, (byte) 84, var8 + 1, var9 + 1);
            }
            if (arg2 == 2) {
                this.method453(67108864, (byte) -8, var8, var9);
                this.method453(4194304, (byte) -75, var8 - 1, var9 + 1);
            }
            if (arg2 == 3) {
                this.method453(268435456, (byte) 121, var8, var9);
                this.method453(16777216, (byte) -49, var8 - 1, var9 + -1);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method453(545259520, (byte) -124, var8, var9);
            this.method453(33554432, (byte) 71, var8, var9 - 1);
            this.method453(134217728, (byte) -99, var8 + 1, var9);
        }
        if (arg2 == 1) {
            this.method453(41943040, (byte) 94, var8, var9);
            this.method453(134217728, (byte) -97, var8 + 1, var9);
            this.method453(536870912, (byte) 114, var8, var9 + 1);
        }
        if (arg2 == 2) {
            this.method453(167772160, (byte) -62, var8, var9);
            this.method453(536870912, (byte) 120, var8, var9 + 1);
            this.method453(8388608, (byte) 110, var8 - 1, var9);
        }
        if (arg2 == 3) {
            this.method453(671088640, (byte) -20, var8, var9);
            this.method453(8388608, (byte) 68, var8 - 1, var9);
            this.method453(33554432, (byte) 108, var8, var9 - 1);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIZ)V", line = 815)
    public final void method447(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 - this.field886;
        if (arg2) {
            this.method453(117, (byte) -5, -117, 5);
        }
        field880++;
        int var5 = arg0 - this.field878;
        this.field889[var5][var4] = class200.method1465(this.field889[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V", line = 836)
    public static void method448(boolean arg0) {
        field884 = null;
        if (arg0) {
            field874 = null;
            field881 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(III)V", line = 848)
    public final void method449(int arg0, int arg1, int arg2) {
        if (arg2 >= -127) {
            this.field885 = 46;
        }
        int var4 = arg0 - this.field886;
        int var5 = arg1 - this.field878;
        this.field889[var5][var4] = class24.method149(this.field889[var5][var4], 2097152);
        field892++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)V", line = 861)
    private final void method450(int arg0, int arg1, int arg2, int arg3) {
        this.field889[arg0][arg3] = class24.method149(this.field889[arg0][arg3], arg1);
        if (arg2 == 8) {
            field879++;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII)Z", line = 874)
    public final boolean method451(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field882++;
        if (arg1 == arg2 && arg0 == arg3) {
            return true;
        }
        int var6 = arg2 - this.field878;
        int var7 = arg0 - this.field886;
        if (var6 < 0 || var6 >= this.field877 || var7 < 0 || this.field885 <= var7) {
            return false;
        }
        int var8 = arg3 - this.field886;
        int var9 = arg1 - this.field878;
        int var10;
        if (var7 <= var8) {
            var10 = var8 - var7;
        } else {
            var10 = var7 - var8;
        }
        int var11;
        if (var6 <= var9) {
            var11 = var9 - var6;
        } else {
            var11 = var6 - var9;
        }
        int var12 = -117 % ((-arg4 - 61) / 41);
        if (var11 > var10) {
            int var13 = var10 * 65536 / var11;
            int var14 = 32768;
            while (var6 != var9) {
                if (var6 > var9) {
                    if ((this.field889[var9][var8] & 0x2C0108) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var6 < var9) {
                    if ((this.field889[var9][var8] & 0x2C0180) != 0) {
                        return false;
                    }
                    var9--;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var8 < var7) {
                        if ((this.field889[var9][var8] & 0x2C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var7 < var8) {
                        if ((this.field889[var9][var8] & 0x2C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        } else {
            int var15 = 32768;
            int var16 = var11 * 65536 / var10;
            while (var7 != var8) {
                if (var8 < var7) {
                    if ((this.field889[var9][var8] & 0x2C0102) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var7 < var8) {
                    if ((this.field889[var9][var8] & 0x2C0120) != 0) {
                        return false;
                    }
                    var8--;
                }
                var15 += var16;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var9 < var6) {
                        if ((this.field889[var9][var8] & 0x2C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var6 < var9) {
                        if ((this.field889[var9][var8] & 0x2C0180) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        }
        return (this.field889[var6][var7] & 0x240100) == 0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIBZIZI)V", line = 1031)
    public final void method452(int arg0, int arg1, byte arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg4 - this.field886;
        field888++;
        if (arg2 < 69) {
            this.method452(-49, 104, (byte) -9, true, 100, true, -107);
        }
        int var9 = 256;
        if (arg3) {
            var9 |= 0x20000;
        }
        int var10 = arg1 - this.field878;
        if (arg5) {
            var9 |= 0x40000000;
        }
        for (int var11 = var10; var11 < (arg6 + var10); var11++) {
            if (var11 >= 0 && this.field877 > var11) {
                for (int var12 = var8; var12 < arg0 + var8; var12++) {
                    if (var12 >= 0 && var12 < this.field885) {
                        this.method450(var11, var9, 8, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IBII)V", line = 1083)
    private final void method453(int arg0, byte arg1, int arg2, int arg3) {
        field876++;
        int var5 = -62 / ((34 - arg1) / 34);
        this.field889[arg3][arg2] = class200.method1465(this.field889[arg3][arg2], ~arg0);
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(II)V", line = 1096)
    public class68(int arg0, int arg1) {
        this.field877 = arg0;
        this.field885 = arg1;
        this.field889 = new int[this.field877][this.field885];
        this.field886 = 0;
        this.method442((byte) 76);
    }
}
