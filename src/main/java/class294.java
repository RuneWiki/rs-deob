import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class294 {

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    private int field4526;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    private int field4520;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    private int field4524;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    private int field4543;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "[[I")
    public int[][] field4544;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "[Lgh;")
    public static class222[] field4525 = new class222[14];

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "[Z")
    public static boolean[] field4534 = new boolean[112];

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "Lak;")
    public static class128 field4541 = null;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4542 = "K";

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "B")
    public static byte field4523;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "Ljh;")
    public static class207 field4529;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "Lke;")
    public static class95 field4531;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIZZIIZ)V", line = 4)
    public final void method1915(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field4518++;
        int var8 = 256;
        if (arg2) {
            var8 |= 0x20000;
        }
        if (arg6) {
            var8 |= 0x40000000;
        }
        int var9 = arg1 - this.field4543;
        int var10 = arg0 - this.field4524;
        for (int var11 = var9; var11 < arg4 + var9; var11++) {
            if (var11 >= 0 && this.field4520 > var11) {
                for (int var12 = var10; var12 < (arg5 + var10); var12++) {
                    if (var12 >= 0 && this.field4526 > var12) {
                        this.method1924(var12, var11, var8, -41);
                    }
                }
            }
        }
        if (!arg3) {
            method1928(-103);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)V", line = 51)
    public static final void method1916(byte arg0, int arg1) {
        class168.field2565--;
        field4530++;
        if (class168.field2565 == arg1) {
            return;
        }
        class223.method1502(class242.field3830, arg1 + 1, class242.field3830, arg1, class168.field2565 - arg1);
        class223.method1502(class76.field1144, arg1 + 1, class76.field1144, arg1, class168.field2565 - arg1);
        class223.method1504(class89.field1355, arg1 + 1, class89.field1355, arg1, class168.field2565 - arg1);
        class223.method1499(class194.field2925, arg1 + 1, class194.field2925, arg1, class168.field2565 - arg1);
        class223.method1505(class271.field4161, arg1 + 1, class271.field4161, arg1, class168.field2565 - arg1);
        int var2 = -105 / ((arg0 - 28) / 35);
        class223.method1504(class167.field2560, arg1 + 1, class167.field2560, arg1, class168.field2565 - arg1);
        class223.method1504(class76.field1135, arg1 + 1, class76.field1135, arg1, class168.field2565 - arg1);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)V", line = 71)
    private final void method1917(int arg0, int arg1, int arg2, int arg3) {
        this.field4544[arg2][arg1] = class311.method2135(this.field4544[arg2][arg1], ~arg0);
        if (arg3 <= 106) {
            this.method1929(-99, true, 13, -116, true, (byte) -11, 65, -35);
        }
        field4537++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIZIZII)V", line = 86)
    public final void method1918(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg3 - this.field4524;
        int var9 = arg0 - this.field4543;
        field4539++;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method1924(var8, var9, 128, 126);
                this.method1924(var8, var9 - 1, 8, 127);
            }
            if (arg1 == 1) {
                this.method1924(var8, var9, 2, 127);
                this.method1924(var8 + 1, var9, 32, 126);
            }
            if (arg1 == 2) {
                this.method1924(var8, var9, 8, 126);
                this.method1924(var8, var9 + 1, 128, arg6 ^ 0xFFFF9B9C);
            }
            if (arg1 == 3) {
                this.method1924(var8, var9, 32, 17);
                this.method1924(var8 - 1, var9, 2, 15);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method1924(var8, var9, 1, 125);
                this.method1924(var8 + 1, var9 + -1, 16, arg6 ^ 0xFFFF9B9F);
            }
            if (arg1 == 1) {
                this.method1924(var8, var9, 4, arg6 + 25593);
                this.method1924(var8 + 1, var9 + 1, 64, 27);
            }
            if (arg1 == 2) {
                this.method1924(var8, var9, 16, -65);
                this.method1924(var8 - 1, var9 + 1, 1, 16);
            }
            if (arg1 == 3) {
                this.method1924(var8, var9, 64, -69);
                this.method1924(var8 - 1, var9 + -1, 4, -16);
            }
        }
        if (arg6 != -25630) {
            field4535 = 31;
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method1924(var8, var9, 130, arg6 + 25511);
                this.method1924(var8, var9 - 1, 8, 125);
                this.method1924(var8 + 1, var9, 32, arg6 ^ 0xFFFF9B9D);
            }
            if (arg1 == 1) {
                this.method1924(var8, var9, 10, -78);
                this.method1924(var8 + 1, var9, 32, arg6 ^ 0xFFFF9B9D);
                this.method1924(var8, var9 + 1, 128, arg6 + 25756);
            }
            if (arg1 == 2) {
                this.method1924(var8, var9, 40, -6);
                this.method1924(var8, var9 + 1, 128, arg6 + 25654);
                this.method1924(var8 - 1, var9, 2, -100);
            }
            if (arg1 == 3) {
                this.method1924(var8, var9, 160, 125);
                this.method1924(var8 - 1, var9, 2, 126);
                this.method1924(var8, var9 - 1, 8, arg6 + 25656);
            }
        }
        if (arg2) {
            if (arg5 == 0) {
                if (arg1 == 0) {
                    this.method1924(var8, var9, 65536, -54);
                    this.method1924(var8, var9 - 1, 4096, 25);
                }
                if (arg1 == 1) {
                    this.method1924(var8, var9, 1024, 126);
                    this.method1924(var8 + 1, var9, 16384, 125);
                }
                if (arg1 == 2) {
                    this.method1924(var8, var9, 4096, -124);
                    this.method1924(var8, var9 + 1, 65536, arg6 ^ 0x6477);
                }
                if (arg1 == 3) {
                    this.method1924(var8, var9, 16384, 125);
                    this.method1924(var8 - 1, var9, 1024, arg6 + 25512);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg1 == 0) {
                    this.method1924(var8, var9, 512, 125);
                    this.method1924(var8 + 1, var9 + -1, 8192, -67);
                }
                if (arg1 == 1) {
                    this.method1924(var8, var9, 2048, -67);
                    this.method1924(var8 + 1, var9 + 1, 32768, -34);
                }
                if (arg1 == 2) {
                    this.method1924(var8, var9, 8192, 3);
                    this.method1924(var8 - 1, var9 - -1, 512, arg6 + 25756);
                }
                if (arg1 == 3) {
                    this.method1924(var8, var9, 32768, 127);
                    this.method1924(var8 - 1, var9 + -1, 2048, -110);
                }
            }
            if (arg5 == 2) {
                if (arg1 == 0) {
                    this.method1924(var8, var9, 66560, -121);
                    this.method1924(var8, var9 - 1, 4096, 125);
                    this.method1924(var8 + 1, var9, 16384, 126);
                }
                if (arg1 == 1) {
                    this.method1924(var8, var9, 5120, 126);
                    this.method1924(var8 + 1, var9, 16384, 127);
                    this.method1924(var8, var9 + 1, 65536, 125);
                }
                if (arg1 == 2) {
                    this.method1924(var8, var9, 20480, -116);
                    this.method1924(var8, var9 + 1, 65536, -76);
                    this.method1924(var8 - 1, var9, 1024, 125);
                }
                if (arg1 == 3) {
                    this.method1924(var8, var9, 81920, -92);
                    this.method1924(var8 - 1, var9, 1024, arg6 ^ 0xFFFF9B9F);
                    this.method1924(var8, var9 - 1, 4096, arg6 + 25757);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method1924(var8, var9, 536870912, arg6 + 25756);
                this.method1924(var8, var9 - 1, 33554432, -105);
            }
            if (arg1 == 1) {
                this.method1924(var8, var9, 8388608, -102);
                this.method1924(var8 + 1, var9, 134217728, 125);
            }
            if (arg1 == 2) {
                this.method1924(var8, var9, 33554432, 125);
                this.method1924(var8, var9 + 1, 536870912, 127);
            }
            if (arg1 == 3) {
                this.method1924(var8, var9, 134217728, -6);
                this.method1924(var8 - 1, var9, 8388608, 126);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method1924(var8, var9, 4194304, 126);
                this.method1924(var8 + 1, var9 + -1, 67108864, arg6 + 25621);
            }
            if (arg1 == 1) {
                this.method1924(var8, var9, 16777216, arg6 + 25543);
                this.method1924(var8 + 1, var9 + 1, 268435456, 126);
            }
            if (arg1 == 2) {
                this.method1924(var8, var9, 67108864, 127);
                this.method1924(var8 - 1, var9 - -1, 4194304, arg6 + 25537);
            }
            if (arg1 == 3) {
                this.method1924(var8, var9, 268435456, 126);
                this.method1924(var8 - 1, var9 + -1, 16777216, -106);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1924(var8, var9, 545259520, 127);
            this.method1924(var8, var9 - 1, 33554432, 127);
            this.method1924(var8 + 1, var9, 134217728, arg6 + 25559);
        }
        if (arg1 == 1) {
            this.method1924(var8, var9, 41943040, 127);
            this.method1924(var8 + 1, var9, 134217728, 126);
            this.method1924(var8, var9 + 1, 536870912, -27);
        }
        if (arg1 == 2) {
            this.method1924(var8, var9, 167772160, arg6 + 25755);
            this.method1924(var8, var9 + 1, 536870912, 127);
            this.method1924(var8 - 1, var9, 8388608, 127);
        }
        if (arg1 == 3) {
            this.method1924(var8, var9, 671088640, 10);
            this.method1924(var8 - 1, var9, 8388608, 125);
            this.method1924(var8, var9 - 1, 33554432, -90);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIB)V", line = 396)
    public final void method1919(int arg0, int arg1, byte arg2) {
        field4527++;
        int var4 = arg0 - this.field4524;
        int var5 = arg1 - this.field4543;
        this.field4544[var5][var4] = class276.method1810(this.field4544[var5][var4], 2097152);
        if (arg2 <= 21) {
            this.field4524 = 75;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZZIIIIB)V", line = 409)
    public final void method1920(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var8 = arg4 - this.field4524;
        int var9 = arg3 - this.field4543;
        field4528++;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method1917(128, var8, var9, 122);
                this.method1917(8, var8, var9 - 1, 107);
            }
            if (arg5 == 1) {
                this.method1917(2, var8, var9, 126);
                this.method1917(32, var8 + 1, var9, arg6 ^ 0x44);
            }
            if (arg5 == 2) {
                this.method1917(8, var8, var9, 108);
                this.method1917(128, var8, var9 + 1, 110);
            }
            if (arg5 == 3) {
                this.method1917(32, var8, var9, 127);
                this.method1917(2, var8 - 1, var9, 109);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method1917(1, var8, var9, arg6 ^ 0x4B);
                this.method1917(16, var8 + 1, var9 - 1, 118);
            }
            if (arg5 == 1) {
                this.method1917(4, var8, var9, 118);
                this.method1917(64, var8 + 1, var9 - -1, 113);
            }
            if (arg5 == 2) {
                this.method1917(16, var8, var9, 114);
                this.method1917(1, var8 - 1, var9 + 1, arg6 ^ 0x49);
            }
            if (arg5 == 3) {
                this.method1917(64, var8, var9, 109);
                this.method1917(4, var8 - 1, var9 + -1, 117);
            }
        }
        if (arg6 != 56) {
            this.method1930(-89, -125, -26);
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method1917(130, var8, var9, 111);
                this.method1917(8, var8, var9 - 1, arg6 + 65);
                this.method1917(32, var8 + 1, var9, 109);
            }
            if (arg5 == 1) {
                this.method1917(10, var8, var9, 112);
                this.method1917(32, var8 + 1, var9, 120);
                this.method1917(128, var8, var9 + 1, 112);
            }
            if (arg5 == 2) {
                this.method1917(40, var8, var9, 108);
                this.method1917(128, var8, var9 + 1, 115);
                this.method1917(2, var8 - 1, var9, 124);
            }
            if (arg5 == 3) {
                this.method1917(160, var8, var9, 126);
                this.method1917(2, var8 - 1, var9, arg6 + 56);
                this.method1917(8, var8, var9 - 1, 123);
            }
        }
        if (arg1) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    this.method1917(65536, var8, var9, arg6 + 63);
                    this.method1917(4096, var8, var9 - 1, 121);
                }
                if (arg5 == 1) {
                    this.method1917(1024, var8, var9, 112);
                    this.method1917(16384, var8 + 1, var9, 116);
                }
                if (arg5 == 2) {
                    this.method1917(4096, var8, var9, 114);
                    this.method1917(65536, var8, var9 + 1, 125);
                }
                if (arg5 == 3) {
                    this.method1917(16384, var8, var9, 112);
                    this.method1917(1024, var8 - 1, var9, arg6 + 62);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg5 == 0) {
                    this.method1917(512, var8, var9, 107);
                    this.method1917(8192, var8 + 1, var9 + -1, arg6 + 58);
                }
                if (arg5 == 1) {
                    this.method1917(2048, var8, var9, 124);
                    this.method1917(32768, var8 + 1, var9 - -1, 112);
                }
                if (arg5 == 2) {
                    this.method1917(8192, var8, var9, 127);
                    this.method1917(512, var8 - 1, var9 + 1, 115);
                }
                if (arg5 == 3) {
                    this.method1917(32768, var8, var9, 110);
                    this.method1917(2048, var8 - 1, var9 + -1, 117);
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    this.method1917(66560, var8, var9, 122);
                    this.method1917(4096, var8, var9 - 1, arg6 + 67);
                    this.method1917(16384, var8 + 1, var9, arg6 + 68);
                }
                if (arg5 == 1) {
                    this.method1917(5120, var8, var9, 122);
                    this.method1917(16384, var8 + 1, var9, 111);
                    this.method1917(65536, var8, var9 + 1, arg6 ^ 0x4A);
                }
                if (arg5 == 2) {
                    this.method1917(20480, var8, var9, 108);
                    this.method1917(65536, var8, var9 + 1, arg6 + 70);
                    this.method1917(1024, var8 - 1, var9, 108);
                }
                if (arg5 == 3) {
                    this.method1917(81920, var8, var9, 120);
                    this.method1917(1024, var8 - 1, var9, arg6 + 59);
                    this.method1917(4096, var8, var9 - 1, 127);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method1917(536870912, var8, var9, 115);
                this.method1917(33554432, var8, var9 - 1, 112);
            }
            if (arg5 == 1) {
                this.method1917(8388608, var8, var9, 126);
                this.method1917(134217728, var8 + 1, var9, 123);
            }
            if (arg5 == 2) {
                this.method1917(33554432, var8, var9, 127);
                this.method1917(536870912, var8, var9 + 1, 114);
            }
            if (arg5 == 3) {
                this.method1917(134217728, var8, var9, 114);
                this.method1917(8388608, var8 - 1, var9, arg6 ^ 0x4E);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method1917(4194304, var8, var9, 121);
                this.method1917(67108864, var8 + 1, var9 - 1, 116);
            }
            if (arg5 == 1) {
                this.method1917(16777216, var8, var9, 123);
                this.method1917(268435456, var8 + 1, var9 + 1, 112);
            }
            if (arg5 == 2) {
                this.method1917(67108864, var8, var9, arg6 ^ 0x42);
                this.method1917(4194304, var8 - 1, var9 + 1, arg6 ^ 0x40);
            }
            if (arg5 == 3) {
                this.method1917(268435456, var8, var9, 126);
                this.method1917(16777216, var8 - 1, var9 + -1, 113);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1917(545259520, var8, var9, 109);
            this.method1917(33554432, var8, var9 - 1, 120);
            this.method1917(134217728, var8 + 1, var9, 121);
        }
        if (arg5 == 1) {
            this.method1917(41943040, var8, var9, 109);
            this.method1917(134217728, var8 + 1, var9, arg6 ^ 0x41);
            this.method1917(536870912, var8, var9 + 1, 111);
        }
        if (arg5 == 2) {
            this.method1917(167772160, var8, var9, 112);
            this.method1917(536870912, var8, var9 + 1, 120);
            this.method1917(8388608, var8 - 1, var9, 111);
        }
        if (arg5 == 3) {
            this.method1917(671088640, var8, var9, 109);
            this.method1917(8388608, var8 - 1, var9, 112);
            this.method1917(33554432, var8, var9 - 1, arg6 ^ 0x40);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 734)
    public final void method1921(int arg0) {
        if (arg0 != -21761) {
            field4534 = (boolean[]) null;
        }
        for (int var2 = 0; var2 < this.field4520; var2++) {
            for (int var3 = 0; var3 < this.field4526; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field4520 - 5) <= var2 || var3 >= (this.field4526 - 5)) {
                    this.field4544[var2][var3] = 16777215;
                } else {
                    this.field4544[var2][var3] = 2097152;
                }
            }
        }
        field4521++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 764)
    public static void method1922(byte arg0) {
        field4529 = null;
        field4542 = null;
        field4534 = null;
        field4531 = null;
        if (arg0 > -52) {
            field4529 = (class207) null;
        }
        field4525 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 781)
    public static final String method1923(int arg0, Throwable arg1) throws IOException {
        field4533++;
        String var2;
        if ((arg1 instanceof class315)) {
            class315 var3 = (class315) arg1;
            arg1 = var3.field4957;
            var2 = var3.field4969 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg0 != -5) {
            return (String) null;
        }
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var11 = var9.indexOf(40);
            int var12 = var9.indexOf(41, var11 + 1);
            String var13;
            if (var11 == -1) {
                var13 = var9;
            } else {
                var13 = var9.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var2 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var9.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var9.substring(var18 + 5, var12);
                }
            }
            var2 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIII)V", line = 852)
    private final void method1924(int arg0, int arg1, int arg2, int arg3) {
        this.field4544[arg1][arg0] = class276.method1810(this.field4544[arg1][arg0], arg2);
        field4540++;
        int var5 = -31 % ((79 - arg3) / 46);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V", line = 875)
    public static final void method1925(int arg0, int arg1) {
        field4532++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class335.method2334(18);
        } else if (arg0 == 2) {
            class81.method560(false);
        } else if (arg0 == 3) {
            class63.method425(-103);
        } else {
            throw new RuntimeException();
        }
        if (arg1 != 671744) {
            field4523 = 30;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBI)V", line = 909)
    public final void method1926(int arg0, byte arg1, int arg2) {
        if (arg1 <= -89) {
            field4522++;
            int var4 = arg2 - this.field4543;
            int var5 = arg0 - this.field4524;
            this.field4544[var4][var5] = class311.method2135(this.field4544[var4][var5], -262145);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIZ)Z", line = 922)
    public final boolean method1927(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4519++;
        if (arg0 == arg2 && arg1 == arg3) {
            return true;
        }
        int var6 = arg1 - this.field4524;
        if (!arg4) {
            this.method1924(80, -68, -8, 92);
        }
        int var7 = arg0 - this.field4543;
        if (var7 < 0 || this.field4520 <= var7 || var6 < 0 || this.field4526 <= var6) {
            return false;
        }
        int var8 = arg3 - this.field4524;
        int var9 = arg2 - this.field4543;
        int var10;
        if (var9 < var7) {
            var10 = var7 - var9;
        } else {
            var10 = var9 - var7;
        }
        int var11;
        if (var8 >= var6) {
            var11 = var8 - var6;
        } else {
            var11 = var6 - var8;
        }
        if (var10 > var11) {
            int var12 = 32768;
            int var13 = var11 * 65536 / var10;
            while (var7 != var9) {
                if (var9 < var7) {
                    if ((this.field4544[var9][var8] & 0x2C0108) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var9 > var7) {
                    if ((this.field4544[var9][var8] & 0x2C0180) != 0) {
                        return false;
                    }
                    var9--;
                }
                var12 += var13;
                if (var12 >= 65536) {
                    var12 -= 65536;
                    if (var8 < var6) {
                        if ((this.field4544[var9][var8] & 0x2C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var6) {
                        if ((this.field4544[var9][var8] & 0x2C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        } else {
            int var14 = var10 * 65536 / var11;
            int var15 = 32768;
            while (var6 != var8) {
                if (var6 > var8) {
                    if ((this.field4544[var9][var8] & 0x2C0102) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var8 > var6) {
                    if ((this.field4544[var9][var8] & 0x2C0120) != 0) {
                        return false;
                    }
                    var8--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var9 < var7) {
                        if ((this.field4544[var9][var8] & 0x2C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var9 > var7) {
                        if ((this.field4544[var9][var8] & 0x2C0180) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        }
        return (this.field4544[var7][var6] & 0x240100) == 0;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V", line = 1075)
    public static final void method1928(int arg0) {
        field4536++;
        if (arg0 != 30392 || !class333.field5166 || class44.field629) {
            return;
        }
        class174[][][] var1 = class90.field1375;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class174[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class174 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field2667 != null && var6.field2667.field285 instanceof class340) {
                            class340 var7 = (class340) var6.field2667.field285;
                            if ((Long.MIN_VALUE & var6.field2667.field289) == 0L) {
                                var7.method2379(false, true, true, true, false, true, true);
                            } else {
                                var7.method2379(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field2650 != null) {
                            if (var6.field2650.field2405 instanceof class340) {
                                class340 var8 = (class340) var6.field2650.field2405;
                                if ((Long.MIN_VALUE & var6.field2650.field2392) == 0L) {
                                    var8.method2379(false, true, true, true, false, true, true);
                                } else {
                                    var8.method2379(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field2650.field2406 instanceof class340) {
                                class340 var9 = (class340) var6.field2650.field2406;
                                if ((var6.field2650.field2392 & Long.MIN_VALUE) == 0L) {
                                    var9.method2379(false, true, true, true, false, true, true);
                                } else {
                                    var9.method2379(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field2672 != null) {
                            if (var6.field2672.field2454 instanceof class340) {
                                class340 var10 = (class340) var6.field2672.field2454;
                                if ((var6.field2672.field2457 & Long.MIN_VALUE) == 0L) {
                                    var10.method2379(false, true, true, true, false, true, true);
                                } else {
                                    var10.method2379(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field2672.field2451 instanceof class340) {
                                class340 var11 = (class340) var6.field2672.field2451;
                                if ((Long.MIN_VALUE & var6.field2672.field2457) == 0L) {
                                    var11.method2379(false, true, true, true, false, true, true);
                                } else {
                                    var11.method2379(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field2655; var12++) {
                            if (var6.field2671[var12].field4173 instanceof class340) {
                                class340 var13 = (class340) var6.field2671[var12].field4173;
                                if ((var6.field2671[var12].field4183 & Long.MIN_VALUE) == 0L) {
                                    var13.method2379(false, true, true, true, false, true, true);
                                } else {
                                    var13.method2379(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class44.field629 = true;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZIIZBII)V", line = 1224)
    public final void method1929(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6, int arg7) {
        int var9 = arg6 - this.field4543;
        int var10 = arg7 - this.field4524;
        field4538++;
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg2;
            arg2 = arg3;
            arg3 = var11;
        }
        int var12 = 81 / ((arg5 - 65) / 52);
        int var13 = 256;
        if (arg4) {
            var13 |= 0x20000;
        }
        if (arg1) {
            var13 |= 0x40000000;
        }
        for (int var14 = var9; var14 < var9 + arg2; var14++) {
            if (var14 >= 0 && this.field4520 > var14) {
                for (int var15 = var10; var15 < (arg3 + var10); var15++) {
                    if (var15 >= 0 && var15 < this.field4526) {
                        this.method1917(var13, var15, var14, 114);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V", line = 1280)
    public final void method1930(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4524;
        int var5 = arg1 - this.field4543;
        this.field4544[var5][var4] = class276.method1810(this.field4544[var5][var4], 262144);
        if (arg0 != 10300) {
            this.method1924(1, 121, 32, -52);
        }
        field4516++;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(II)V", line = 1300)
    public class294(int arg0, int arg1) {
        this.field4526 = arg1;
        this.field4520 = arg0;
        this.field4524 = 0;
        this.field4543 = 0;
        this.field4544 = new int[this.field4520][this.field4526];
        this.method1921(-21761);
    }
}
