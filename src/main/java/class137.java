import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class137 {

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    private int field1991 = 0;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    private int field1985;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    private int field1994;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "[[I")
    public int[][] field1988;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    private int field2001;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field1993 = 0;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "[[I")
    public static int[][] field1996 = new int[5][5000];

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2002 = "Loading config - ";

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field1989 = 255;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BII)V")
    public final void method889(byte arg0, int arg1, int arg2) {
        field1987++;
        int var4 = arg1 - this.field2001;
        int var5 = arg2 - this.field1991;
        if (arg0 != 39) {
            this.method895(5, 125, -73, true);
        }
        this.field1988[var5][var4] = class5.method26(this.field1988[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static void method890(int arg0) {
        if (arg0 == 536870912) {
            field1996 = null;
            field2002 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
    public final void method891(int arg0) {
        for (int var2 = 0; var2 < this.field1994; var2++) {
            for (int var3 = 0; var3 < this.field1985; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field1994 - 5) || var3 >= this.field1985 - 5) {
                    this.field1988[var2][var3] = 16777215;
                } else {
                    this.field1988[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 != 28734) {
            field1996 = null;
        }
        field2005++;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIZIZ)V")
    public final void method892(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int var8 = arg5 - this.field2001;
        field1999++;
        int var9 = arg2 - this.field1991;
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method895(var8, var9, 128, false);
                this.method895(var8, var9 - 1, 8, false);
            }
            if (arg1 == 1) {
                this.method895(var8, var9, 2, false);
                this.method895(var8 + 1, var9, 32, false);
            }
            if (arg1 == 2) {
                this.method895(var8, var9, 8, false);
                this.method895(var8, var9 + 1, 128, false);
            }
            if (arg1 == 3) {
                this.method895(var8, var9, 32, false);
                this.method895(var8 - 1, var9, 2, false);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method895(var8, var9, 1, false);
                this.method895(var8 + 1, var9 + -1, 16, false);
            }
            if (arg1 == 1) {
                this.method895(var8, var9, 4, false);
                this.method895(var8 + 1, var9 + 1, 64, false);
            }
            if (arg1 == 2) {
                this.method895(var8, var9, 16, false);
                this.method895(var8 - 1, var9 + 1, 1, false);
            }
            if (arg1 == 3) {
                this.method895(var8, var9, 64, false);
                this.method895(var8 - 1, var9 + -1, 4, false);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method895(var8, var9, 130, false);
                this.method895(var8, var9 - 1, 8, false);
                this.method895(var8 + 1, var9, 32, false);
            }
            if (arg1 == 1) {
                this.method895(var8, var9, 10, false);
                this.method895(var8 + 1, var9, 32, false);
                this.method895(var8, var9 + 1, 128, false);
            }
            if (arg1 == 2) {
                this.method895(var8, var9, 40, false);
                this.method895(var8, var9 + 1, 128, false);
                this.method895(var8 - 1, var9, 2, false);
            }
            if (arg1 == 3) {
                this.method895(var8, var9, 160, false);
                this.method895(var8 - 1, var9, 2, false);
                this.method895(var8, var9 - 1, 8, false);
            }
        }
        if (arg6) {
            if (arg0 == 0) {
                if (arg1 == 0) {
                    this.method895(var8, var9, 65536, false);
                    this.method895(var8, var9 - 1, 4096, false);
                }
                if (arg1 == 1) {
                    this.method895(var8, var9, 1024, false);
                    this.method895(var8 + 1, var9, 16384, false);
                }
                if (arg1 == 2) {
                    this.method895(var8, var9, 4096, false);
                    this.method895(var8, var9 + 1, 65536, false);
                }
                if (arg1 == 3) {
                    this.method895(var8, var9, 16384, false);
                    this.method895(var8 - 1, var9, 1024, false);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg1 == 0) {
                    this.method895(var8, var9, 512, false);
                    this.method895(var8 + 1, var9 + -1, 8192, false);
                }
                if (arg1 == 1) {
                    this.method895(var8, var9, 2048, false);
                    this.method895(var8 + 1, var9 + 1, 32768, false);
                }
                if (arg1 == 2) {
                    this.method895(var8, var9, 8192, false);
                    this.method895(var8 - 1, var9 - -1, 512, false);
                }
                if (arg1 == 3) {
                    this.method895(var8, var9, 32768, false);
                    this.method895(var8 - 1, var9 + -1, 2048, false);
                }
            }
            if (arg0 == 2) {
                if (arg1 == 0) {
                    this.method895(var8, var9, 66560, false);
                    this.method895(var8, var9 - 1, 4096, false);
                    this.method895(var8 + 1, var9, 16384, false);
                }
                if (arg1 == 1) {
                    this.method895(var8, var9, 5120, false);
                    this.method895(var8 + 1, var9, 16384, false);
                    this.method895(var8, var9 + 1, 65536, false);
                }
                if (arg1 == 2) {
                    this.method895(var8, var9, 20480, false);
                    this.method895(var8, var9 + 1, 65536, false);
                    this.method895(var8 - 1, var9, 1024, false);
                }
                if (arg1 == 3) {
                    this.method895(var8, var9, 81920, false);
                    this.method895(var8 - 1, var9, 1024, false);
                    this.method895(var8, var9 - 1, 4096, false);
                }
            }
        }
        if (arg4) {
            if (arg0 == 0) {
                if (arg1 == 0) {
                    this.method895(var8, var9, 536870912, false);
                    this.method895(var8, var9 - 1, 33554432, false);
                }
                if (arg1 == 1) {
                    this.method895(var8, var9, 8388608, false);
                    this.method895(var8 + 1, var9, 134217728, false);
                }
                if (arg1 == 2) {
                    this.method895(var8, var9, 33554432, false);
                    this.method895(var8, var9 + 1, 536870912, false);
                }
                if (arg1 == 3) {
                    this.method895(var8, var9, 134217728, false);
                    this.method895(var8 - 1, var9, 8388608, false);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg1 == 0) {
                    this.method895(var8, var9, 4194304, false);
                    this.method895(var8 + 1, var9 + -1, 67108864, false);
                }
                if (arg1 == 1) {
                    this.method895(var8, var9, 16777216, false);
                    this.method895(var8 + 1, var9 + 1, 268435456, false);
                }
                if (arg1 == 2) {
                    this.method895(var8, var9, 67108864, false);
                    this.method895(var8 - 1, var9 + 1, 4194304, false);
                }
                if (arg1 == 3) {
                    this.method895(var8, var9, 268435456, false);
                    this.method895(var8 - 1, var9 + -1, 16777216, false);
                }
            }
            if (arg0 == 2) {
                if (arg1 == 0) {
                    this.method895(var8, var9, 545259520, false);
                    this.method895(var8, var9 - 1, 33554432, false);
                    this.method895(var8 + 1, var9, 134217728, false);
                }
                if (arg1 == 1) {
                    this.method895(var8, var9, 41943040, false);
                    this.method895(var8 + 1, var9, 134217728, false);
                    this.method895(var8, var9 + 1, 536870912, false);
                }
                if (arg1 == 2) {
                    this.method895(var8, var9, 167772160, false);
                    this.method895(var8, var9 + 1, 536870912, false);
                    this.method895(var8 - 1, var9, 8388608, false);
                }
                if (arg1 == 3) {
                    this.method895(var8, var9, 671088640, false);
                    this.method895(var8 - 1, var9, 8388608, false);
                    this.method895(var8, var9 - 1, 33554432, false);
                }
            }
        }
        if (arg3 > -8) {
            this.field1988 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZIIIZI)V")
    public final void method893(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        int var9 = arg4 - this.field1991;
        field2000++;
        if (arg5 <= 69) {
            this.field1991 = 83;
        }
        int var10 = arg0 - this.field2001;
        int var11 = 256;
        if (arg1 == 1 || arg1 == 3) {
            int var12 = arg7;
            arg7 = arg3;
            arg3 = var12;
        }
        if (arg6) {
            var11 |= 0x20000;
        }
        if (arg2) {
            var11 |= 0x40000000;
        }
        for (int var13 = var9; var13 < arg7 + var9; var13++) {
            if (var13 >= 0 && this.field1994 > var13) {
                for (int var14 = var10; var14 < var10 + arg3; var14++) {
                    if (var14 >= 0 && this.field1985 > var14) {
                        this.method895(var14, var13, var11, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZ)V")
    public final void method894(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method899(-89, 62, false, false, (byte) -61, 6, 106);
        }
        field1992++;
        int var4 = arg1 - this.field1991;
        int var5 = arg0 - this.field2001;
        this.field1988[var4][var5] = class220.method1432(this.field1988[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIZ)V")
    private final void method895(int arg0, int arg1, int arg2, boolean arg3) {
        this.field1988[arg1][arg0] = class5.method26(this.field1988[arg1][arg0], ~arg2);
        field2004++;
        if (arg3) {
            field2002 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public static final void method896(byte arg0) {
        field2003++;
        if (!class176.method1141(1) && class251.field3626 != class199.field2833) {
            class179.method1164(false, class199.field2833, class88.field1196, false, class177.field2507.field4585[0], class177.field2507.field4597[0], -124, class181.field2575);
        } else if (arg0 >= 104 && class199.field2833 != class115.field1586 && class133.method867(false, class199.field2833)) {
            class115.field1586 = class199.field2833;
            class90.method548(870);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIB)V")
    private final void method897(int arg0, int arg1, int arg2, byte arg3) {
        field1990++;
        if (arg3 != -94) {
            field1996 = null;
        }
        this.field1988[arg2][arg0] = class220.method1432(this.field1988[arg2][arg0], arg1);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)V")
    public final void method898(int arg0, int arg1, int arg2) {
        if (arg0 != 20532) {
            this.method893(119, -4, true, 85, 8, -24, true, 27);
        }
        int var4 = arg2 - this.field1991;
        field1998++;
        int var5 = arg1 - this.field2001;
        this.field1988[var4][var5] = class220.method1432(this.field1988[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZZBII)V")
    public final void method899(int arg0, int arg1, boolean arg2, boolean arg3, byte arg4, int arg5, int arg6) {
        if (arg4 != -74) {
            return;
        }
        int var8 = arg1 - this.field1991;
        int var9 = arg5 - this.field2001;
        field1995++;
        if (arg0 == 0) {
            if (arg6 == 0) {
                this.method897(var9, 128, var8, (byte) -94);
                this.method897(var9, 8, var8 - 1, (byte) -94);
            }
            if (arg6 == 1) {
                this.method897(var9, 2, var8, (byte) -94);
                this.method897(var9 + 1, 32, var8, (byte) -94);
            }
            if (arg6 == 2) {
                this.method897(var9, 8, var8, (byte) -94);
                this.method897(var9, 128, var8 + 1, (byte) -94);
            }
            if (arg6 == 3) {
                this.method897(var9, 32, var8, (byte) -94);
                this.method897(var9 - 1, 2, var8, (byte) -94);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg6 == 0) {
                this.method897(var9, 1, var8, (byte) -94);
                this.method897(var9 + 1, 16, var8 - 1, (byte) -94);
            }
            if (arg6 == 1) {
                this.method897(var9, 4, var8, (byte) -94);
                this.method897(var9 + 1, 64, var8 + 1, (byte) -94);
            }
            if (arg6 == 2) {
                this.method897(var9, 16, var8, (byte) -94);
                this.method897(var9 - 1, 1, var8 + 1, (byte) -94);
            }
            if (arg6 == 3) {
                this.method897(var9, 64, var8, (byte) -94);
                this.method897(var9 - 1, 4, var8 - 1, (byte) -94);
            }
        }
        if (arg0 == 2) {
            if (arg6 == 0) {
                this.method897(var9, 130, var8, (byte) -94);
                this.method897(var9, 8, var8 - 1, (byte) -94);
                this.method897(var9 + 1, 32, var8, (byte) -94);
            }
            if (arg6 == 1) {
                this.method897(var9, 10, var8, (byte) -94);
                this.method897(var9 + 1, 32, var8, (byte) -94);
                this.method897(var9, 128, var8 + 1, (byte) -94);
            }
            if (arg6 == 2) {
                this.method897(var9, 40, var8, (byte) -94);
                this.method897(var9, 128, var8 + 1, (byte) -94);
                this.method897(var9 - 1, 2, var8, (byte) -94);
            }
            if (arg6 == 3) {
                this.method897(var9, 160, var8, (byte) -94);
                this.method897(var9 - 1, 2, var8, (byte) -94);
                this.method897(var9, 8, var8 - 1, (byte) -94);
            }
        }
        if (arg3) {
            if (arg0 == 0) {
                if (arg6 == 0) {
                    this.method897(var9, 65536, var8, (byte) -94);
                    this.method897(var9, 4096, var8 - 1, (byte) -94);
                }
                if (arg6 == 1) {
                    this.method897(var9, 1024, var8, (byte) -94);
                    this.method897(var9 + 1, 16384, var8, (byte) -94);
                }
                if (arg6 == 2) {
                    this.method897(var9, 4096, var8, (byte) -94);
                    this.method897(var9, 65536, var8 + 1, (byte) -94);
                }
                if (arg6 == 3) {
                    this.method897(var9, 16384, var8, (byte) -94);
                    this.method897(var9 - 1, 1024, var8, (byte) -94);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg6 == 0) {
                    this.method897(var9, 512, var8, (byte) -94);
                    this.method897(var9 + 1, 8192, var8 - 1, (byte) -94);
                }
                if (arg6 == 1) {
                    this.method897(var9, 2048, var8, (byte) -94);
                    this.method897(var9 + 1, 32768, var8 + 1, (byte) -94);
                }
                if (arg6 == 2) {
                    this.method897(var9, 8192, var8, (byte) -94);
                    this.method897(var9 - 1, 512, var8 + 1, (byte) -94);
                }
                if (arg6 == 3) {
                    this.method897(var9, 32768, var8, (byte) -94);
                    this.method897(var9 - 1, 2048, var8 - 1, (byte) -94);
                }
            }
            if (arg0 == 2) {
                if (arg6 == 0) {
                    this.method897(var9, 66560, var8, (byte) -94);
                    this.method897(var9, 4096, var8 - 1, (byte) -94);
                    this.method897(var9 + 1, 16384, var8, (byte) -94);
                }
                if (arg6 == 1) {
                    this.method897(var9, 5120, var8, (byte) -94);
                    this.method897(var9 + 1, 16384, var8, (byte) -94);
                    this.method897(var9, 65536, var8 + 1, (byte) -94);
                }
                if (arg6 == 2) {
                    this.method897(var9, 20480, var8, (byte) -94);
                    this.method897(var9, 65536, var8 + 1, (byte) -94);
                    this.method897(var9 - 1, 1024, var8, (byte) -94);
                }
                if (arg6 == 3) {
                    this.method897(var9, 81920, var8, (byte) -94);
                    this.method897(var9 - 1, 1024, var8, (byte) -94);
                    this.method897(var9, 4096, var8 - 1, (byte) -94);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg6 == 0) {
                this.method897(var9, 536870912, var8, (byte) -94);
                this.method897(var9, 33554432, var8 - 1, (byte) -94);
            }
            if (arg6 == 1) {
                this.method897(var9, 8388608, var8, (byte) -94);
                this.method897(var9 + 1, 134217728, var8, (byte) -94);
            }
            if (arg6 == 2) {
                this.method897(var9, 33554432, var8, (byte) -94);
                this.method897(var9, 536870912, var8 + 1, (byte) -94);
            }
            if (arg6 == 3) {
                this.method897(var9, 134217728, var8, (byte) -94);
                this.method897(var9 - 1, 8388608, var8, (byte) -94);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg6 == 0) {
                this.method897(var9, 4194304, var8, (byte) -94);
                this.method897(var9 + 1, 67108864, var8 - 1, (byte) -94);
            }
            if (arg6 == 1) {
                this.method897(var9, 16777216, var8, (byte) -94);
                this.method897(var9 + 1, 268435456, var8 + 1, (byte) -94);
            }
            if (arg6 == 2) {
                this.method897(var9, 67108864, var8, (byte) -94);
                this.method897(var9 - 1, 4194304, var8 + 1, (byte) -94);
            }
            if (arg6 == 3) {
                this.method897(var9, 268435456, var8, (byte) -94);
                this.method897(var9 - 1, 16777216, var8 - 1, (byte) -94);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method897(var9, 545259520, var8, (byte) -94);
            this.method897(var9, 33554432, var8 - 1, (byte) -94);
            this.method897(var9 + 1, 134217728, var8, (byte) -94);
        }
        if (arg6 == 1) {
            this.method897(var9, 41943040, var8, (byte) -94);
            this.method897(var9 + 1, 134217728, var8, (byte) -94);
            this.method897(var9, 536870912, var8 + 1, (byte) -94);
        }
        if (arg6 == 2) {
            this.method897(var9, 167772160, var8, (byte) -94);
            this.method897(var9, 536870912, var8 + 1, (byte) -94);
            this.method897(var9 - 1, 8388608, var8, (byte) -94);
        }
        if (arg6 == 3) {
            this.method897(var9, 671088640, var8, (byte) -94);
            this.method897(var9 - 1, 8388608, var8, (byte) -94);
            this.method897(var9, 33554432, var8 - 1, (byte) -94);
            return;
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(II)V")
    public class137(int arg0, int arg1) {
        this.field1985 = arg1;
        this.field1994 = arg0;
        this.field1988 = new int[this.field1994][this.field1985];
        this.field2001 = 0;
        this.method891(28734);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZIIZI)V")
    public final void method900(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg3 - this.field2001;
        field1986++;
        int var9 = arg4 - this.field1991;
        int var10 = 256;
        if (arg5) {
            var10 |= 0x20000;
        }
        if (arg2) {
            var10 |= 0x40000000;
        }
        if (arg1 != -1) {
            return;
        }
        for (int var11 = var9; var11 < (arg0 + var9); var11++) {
            if (var11 >= 0 && var11 < this.field1994) {
                for (int var12 = var8; var12 < (arg6 + var8); var12++) {
                    if (var12 >= 0 && var12 < this.field1985) {
                        this.method897(var12, var10, var11, (byte) -94);
                    }
                }
            }
        }
    }
}
