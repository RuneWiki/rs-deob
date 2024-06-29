import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class113 {

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    private int field1627 = 0;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    private int field1637;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    private int field1629;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "[[I")
    public int[][] field1633;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field1622 = 0;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field1630 = 0;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "Z")
    public static boolean field1640;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "[[Lqi;")
    public static class131[][] field1631;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static final void method823(int arg0) {
        field1634++;
        class180.field2902.method1556((byte) 79);
        class3.field31.method1556((byte) 99);
        class20.field216.method1556((byte) 112);
        if (arg0 != 10630) {
            method835(-15);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII)V")
    private final void method824(int arg0, int arg1, int arg2, int arg3) {
        this.field1633[arg3][arg1] = class244.method1747(this.field1633[arg3][arg1], arg2);
        if (arg0 == 672024486) {
            field1638++;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIB)V")
    public final void method825(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field1627;
        int var5 = arg0 - this.field1625;
        if (arg2 != 114) {
            this.method837(-66, -127, false, 106, (byte) 116, 113, false);
        }
        field1623++;
        this.field1633[var5][var4] = class244.method1747(this.field1633[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIZZIII)V")
    public final void method826(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg5 != -1922) {
            field1630 = -41;
        }
        int var9 = arg7 - this.field1625;
        int var10 = arg6 - this.field1627;
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg1;
            arg1 = arg2;
            arg2 = var11;
        }
        int var12 = 256;
        field1642++;
        if (arg4) {
            var12 |= 0x20000;
        }
        if (arg3) {
            var12 |= 0x40000000;
        }
        for (int var13 = var9; var13 < (arg1 + var9); var13++) {
            if (var13 >= 0 && this.field1637 > var13) {
                for (int var14 = var10; var14 < arg2 + var10; var14++) {
                    if (var14 >= 0 && var14 < this.field1629) {
                        this.method833(var13, var14, var12, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public final void method827(byte arg0) {
        for (int var2 = 0; var2 < this.field1637; var2++) {
            for (int var3 = 0; var3 < this.field1629; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field1637 - 5) || (this.field1629 - 5) <= var3) {
                    this.field1633[var2][var3] = 16777215;
                } else {
                    this.field1633[var2][var3] = 2097152;
                }
            }
        }
        field1626++;
        if (arg0 != -60) {
            this.method831(-83, -105, -116);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
    public final void method828(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1625;
        int var5 = arg0 - this.field1627;
        int var6 = -21 / ((arg2 + 51) / 59);
        this.field1633[var4][var5] = class179.method1337(this.field1633[var4][var5], -262145);
        field1632++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZIZII)V")
    public final void method829(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field1624++;
        int var8 = arg0 - this.field1627;
        if (arg5 != -3) {
            return;
        }
        int var9 = arg1 - this.field1625;
        if (arg3 == 0) {
            if (arg6 == 0) {
                this.method833(var9, var8, 128, false);
                this.method833(var9 - 1, var8, 8, false);
            }
            if (arg6 == 1) {
                this.method833(var9, var8, 2, false);
                this.method833(var9, var8 + 1, 32, false);
            }
            if (arg6 == 2) {
                this.method833(var9, var8, 8, false);
                this.method833(var9 + 1, var8, 128, false);
            }
            if (arg6 == 3) {
                this.method833(var9, var8, 32, false);
                this.method833(var9, var8 - 1, 2, false);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg6 == 0) {
                this.method833(var9, var8, 1, false);
                this.method833(var9 - 1, var8 - -1, 16, false);
            }
            if (arg6 == 1) {
                this.method833(var9, var8, 4, false);
                this.method833(var9 + 1, var8 - -1, 64, false);
            }
            if (arg6 == 2) {
                this.method833(var9, var8, 16, false);
                this.method833(var9 + 1, var8 + -1, 1, false);
            }
            if (arg6 == 3) {
                this.method833(var9, var8, 64, false);
                this.method833(var9 - 1, var8 + -1, 4, false);
            }
        }
        if (arg3 == 2) {
            if (arg6 == 0) {
                this.method833(var9, var8, 130, false);
                this.method833(var9 - 1, var8, 8, false);
                this.method833(var9, var8 + 1, 32, false);
            }
            if (arg6 == 1) {
                this.method833(var9, var8, 10, false);
                this.method833(var9, var8 + 1, 32, false);
                this.method833(var9 + 1, var8, 128, false);
            }
            if (arg6 == 2) {
                this.method833(var9, var8, 40, false);
                this.method833(var9 + 1, var8, 128, false);
                this.method833(var9, var8 - 1, 2, false);
            }
            if (arg6 == 3) {
                this.method833(var9, var8, 160, false);
                this.method833(var9, var8 - 1, 2, false);
                this.method833(var9 - 1, var8, 8, false);
            }
        }
        if (arg2) {
            if (arg3 == 0) {
                if (arg6 == 0) {
                    this.method833(var9, var8, 65536, false);
                    this.method833(var9 - 1, var8, 4096, false);
                }
                if (arg6 == 1) {
                    this.method833(var9, var8, 1024, false);
                    this.method833(var9, var8 + 1, 16384, false);
                }
                if (arg6 == 2) {
                    this.method833(var9, var8, 4096, false);
                    this.method833(var9 + 1, var8, 65536, false);
                }
                if (arg6 == 3) {
                    this.method833(var9, var8, 16384, false);
                    this.method833(var9, var8 - 1, 1024, false);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg6 == 0) {
                    this.method833(var9, var8, 512, false);
                    this.method833(var9 - 1, var8 + 1, 8192, false);
                }
                if (arg6 == 1) {
                    this.method833(var9, var8, 2048, false);
                    this.method833(var9 + 1, var8 + 1, 32768, false);
                }
                if (arg6 == 2) {
                    this.method833(var9, var8, 8192, false);
                    this.method833(var9 + 1, var8 + -1, 512, false);
                }
                if (arg6 == 3) {
                    this.method833(var9, var8, 32768, false);
                    this.method833(var9 - 1, var8 + -1, 2048, false);
                }
            }
            if (arg3 == 2) {
                if (arg6 == 0) {
                    this.method833(var9, var8, 66560, false);
                    this.method833(var9 - 1, var8, 4096, false);
                    this.method833(var9, var8 + 1, 16384, false);
                }
                if (arg6 == 1) {
                    this.method833(var9, var8, 5120, false);
                    this.method833(var9, var8 + 1, 16384, false);
                    this.method833(var9 + 1, var8, 65536, false);
                }
                if (arg6 == 2) {
                    this.method833(var9, var8, 20480, false);
                    this.method833(var9 + 1, var8, 65536, false);
                    this.method833(var9, var8 - 1, 1024, false);
                }
                if (arg6 == 3) {
                    this.method833(var9, var8, 81920, false);
                    this.method833(var9, var8 - 1, 1024, false);
                    this.method833(var9 - 1, var8, 4096, false);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg6 == 0) {
                this.method833(var9, var8, 536870912, false);
                this.method833(var9 - 1, var8, 33554432, false);
            }
            if (arg6 == 1) {
                this.method833(var9, var8, 8388608, false);
                this.method833(var9, var8 + 1, 134217728, false);
            }
            if (arg6 == 2) {
                this.method833(var9, var8, 33554432, false);
                this.method833(var9 + 1, var8, 536870912, false);
            }
            if (arg6 == 3) {
                this.method833(var9, var8, 134217728, false);
                this.method833(var9, var8 - 1, 8388608, false);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg6 == 0) {
                this.method833(var9, var8, 4194304, false);
                this.method833(var9 - 1, var8 + 1, 67108864, false);
            }
            if (arg6 == 1) {
                this.method833(var9, var8, 16777216, false);
                this.method833(var9 + 1, var8 - -1, 268435456, false);
            }
            if (arg6 == 2) {
                this.method833(var9, var8, 67108864, false);
                this.method833(var9 + 1, var8 + -1, 4194304, false);
            }
            if (arg6 == 3) {
                this.method833(var9, var8, 268435456, false);
                this.method833(var9 - 1, var8 + -1, 16777216, false);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method833(var9, var8, 545259520, false);
            this.method833(var9 - 1, var8, 33554432, false);
            this.method833(var9, var8 + 1, 134217728, false);
        }
        if (arg6 == 1) {
            this.method833(var9, var8, 41943040, false);
            this.method833(var9, var8 + 1, 134217728, false);
            this.method833(var9 + 1, var8, 536870912, false);
        }
        if (arg6 == 2) {
            this.method833(var9, var8, 167772160, false);
            this.method833(var9 + 1, var8, 536870912, false);
            this.method833(var9, var8 - 1, 8388608, false);
        }
        if (arg6 == 3) {
            this.method833(var9, var8, 671088640, false);
            this.method833(var9, var8 - 1, 8388608, false);
            this.method833(var9 - 1, var8, 33554432, false);
            return;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
    public static void method830(int arg0) {
        if (arg0 >= -76) {
            field1640 = true;
        }
        field1631 = null;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V")
    public final void method831(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1625;
        if (arg1 != 2883968) {
            field1631 = null;
        }
        field1641++;
        int var5 = arg2 - this.field1627;
        this.field1633[var4][var5] = class244.method1747(this.field1633[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BII)V")
    public static final void method832(byte arg0, int arg1, int arg2) {
        int var3 = 96 % ((arg0 + 49) / 48);
        field1628++;
        if (class184.method1364(arg2, (byte) 87)) {
            class192.method1423((byte) -110, arg1, field1631[arg2]);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIZ)V")
    private final void method833(int arg0, int arg1, int arg2, boolean arg3) {
        this.field1633[arg0][arg1] = class179.method1337(this.field1633[arg0][arg1], ~arg2);
        if (arg3) {
            this.field1633 = null;
        }
        field1635++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILbe;)V")
    public static final void method834(int arg0, class29 arg1) {
        if (arg0 != -24283) {
            field1640 = false;
        }
        field1644++;
        class23 var2 = (class23) class288.field4566.method1034(class193.method1431(arg1.field344, false), (byte) 21);
        if (var2 == null) {
            class188.method1403(0, (class18) null, arg1.field1974[0], class58.field826, 127, (class36) null, arg1.field1917[0], arg1);
        } else {
            var2.method169(false);
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
    public static final void method835(int arg0) {
        class141.field2271.method1556((byte) 86);
        class96.field1414.method1556((byte) 109);
        if (arg0 != 65536) {
            method823(-54);
        }
        class189.field3055.method1556((byte) 84);
        field1636++;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(II)V")
    public class113(int arg0, int arg1) {
        this.field1637 = arg0;
        this.field1625 = 0;
        this.field1629 = arg1;
        this.field1633 = new int[this.field1637][this.field1629];
        this.method827((byte) -60);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZIIIZB)V")
    public final void method836(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, byte arg6) {
        field1639++;
        int var8 = arg3 - this.field1625;
        if (arg6 >= -11) {
            field1640 = true;
        }
        int var9 = arg2 - this.field1627;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method824(672024486, var9, 128, var8);
                this.method824(672024486, var9, 8, var8 - 1);
            }
            if (arg0 == 1) {
                this.method824(672024486, var9, 2, var8);
                this.method824(672024486, var9 + 1, 32, var8);
            }
            if (arg0 == 2) {
                this.method824(672024486, var9, 8, var8);
                this.method824(672024486, var9, 128, var8 + 1);
            }
            if (arg0 == 3) {
                this.method824(672024486, var9, 32, var8);
                this.method824(672024486, var9 - 1, 2, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method824(672024486, var9, 1, var8);
                this.method824(672024486, var9 + 1, 16, var8 - 1);
            }
            if (arg0 == 1) {
                this.method824(672024486, var9, 4, var8);
                this.method824(672024486, var9 + 1, 64, var8 + 1);
            }
            if (arg0 == 2) {
                this.method824(672024486, var9, 16, var8);
                this.method824(672024486, var9 - 1, 1, var8 + 1);
            }
            if (arg0 == 3) {
                this.method824(672024486, var9, 64, var8);
                this.method824(672024486, var9 - 1, 4, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method824(672024486, var9, 130, var8);
                this.method824(672024486, var9, 8, var8 - 1);
                this.method824(672024486, var9 + 1, 32, var8);
            }
            if (arg0 == 1) {
                this.method824(672024486, var9, 10, var8);
                this.method824(672024486, var9 + 1, 32, var8);
                this.method824(672024486, var9, 128, var8 + 1);
            }
            if (arg0 == 2) {
                this.method824(672024486, var9, 40, var8);
                this.method824(672024486, var9, 128, var8 + 1);
                this.method824(672024486, var9 - 1, 2, var8);
            }
            if (arg0 == 3) {
                this.method824(672024486, var9, 160, var8);
                this.method824(672024486, var9 - 1, 2, var8);
                this.method824(672024486, var9, 8, var8 - 1);
            }
        }
        if (arg1) {
            if (arg4 == 0) {
                if (arg0 == 0) {
                    this.method824(672024486, var9, 65536, var8);
                    this.method824(672024486, var9, 4096, var8 - 1);
                }
                if (arg0 == 1) {
                    this.method824(672024486, var9, 1024, var8);
                    this.method824(672024486, var9 + 1, 16384, var8);
                }
                if (arg0 == 2) {
                    this.method824(672024486, var9, 4096, var8);
                    this.method824(672024486, var9, 65536, var8 + 1);
                }
                if (arg0 == 3) {
                    this.method824(672024486, var9, 16384, var8);
                    this.method824(672024486, var9 - 1, 1024, var8);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg0 == 0) {
                    this.method824(672024486, var9, 512, var8);
                    this.method824(672024486, var9 + 1, 8192, var8 - 1);
                }
                if (arg0 == 1) {
                    this.method824(672024486, var9, 2048, var8);
                    this.method824(672024486, var9 + 1, 32768, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method824(672024486, var9, 8192, var8);
                    this.method824(672024486, var9 - 1, 512, var8 + 1);
                }
                if (arg0 == 3) {
                    this.method824(672024486, var9, 32768, var8);
                    this.method824(672024486, var9 - 1, 2048, var8 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    this.method824(672024486, var9, 66560, var8);
                    this.method824(672024486, var9, 4096, var8 - 1);
                    this.method824(672024486, var9 + 1, 16384, var8);
                }
                if (arg0 == 1) {
                    this.method824(672024486, var9, 5120, var8);
                    this.method824(672024486, var9 + 1, 16384, var8);
                    this.method824(672024486, var9, 65536, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method824(672024486, var9, 20480, var8);
                    this.method824(672024486, var9, 65536, var8 + 1);
                    this.method824(672024486, var9 - 1, 1024, var8);
                }
                if (arg0 == 3) {
                    this.method824(672024486, var9, 81920, var8);
                    this.method824(672024486, var9 - 1, 1024, var8);
                    this.method824(672024486, var9, 4096, var8 - 1);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method824(672024486, var9, 536870912, var8);
                this.method824(672024486, var9, 33554432, var8 - 1);
            }
            if (arg0 == 1) {
                this.method824(672024486, var9, 8388608, var8);
                this.method824(672024486, var9 + 1, 134217728, var8);
            }
            if (arg0 == 2) {
                this.method824(672024486, var9, 33554432, var8);
                this.method824(672024486, var9, 536870912, var8 + 1);
            }
            if (arg0 == 3) {
                this.method824(672024486, var9, 134217728, var8);
                this.method824(672024486, var9 - 1, 8388608, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method824(672024486, var9, 4194304, var8);
                this.method824(672024486, var9 + 1, 67108864, var8 - 1);
            }
            if (arg0 == 1) {
                this.method824(672024486, var9, 16777216, var8);
                this.method824(672024486, var9 + 1, 268435456, var8 + 1);
            }
            if (arg0 == 2) {
                this.method824(672024486, var9, 67108864, var8);
                this.method824(672024486, var9 - 1, 4194304, var8 + 1);
            }
            if (arg0 == 3) {
                this.method824(672024486, var9, 268435456, var8);
                this.method824(672024486, var9 - 1, 16777216, var8 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method824(672024486, var9, 545259520, var8);
            this.method824(672024486, var9, 33554432, var8 - 1);
            this.method824(672024486, var9 + 1, 134217728, var8);
        }
        if (arg0 == 1) {
            this.method824(672024486, var9, 41943040, var8);
            this.method824(672024486, var9 + 1, 134217728, var8);
            this.method824(672024486, var9, 536870912, var8 + 1);
        }
        if (arg0 == 2) {
            this.method824(672024486, var9, 167772160, var8);
            this.method824(672024486, var9, 536870912, var8 + 1);
            this.method824(672024486, var9 - 1, 8388608, var8);
        }
        if (arg0 == 3) {
            this.method824(672024486, var9, 671088640, var8);
            this.method824(672024486, var9 - 1, 8388608, var8);
            this.method824(672024486, var9, 33554432, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZIBIZ)V")
    public final void method837(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, boolean arg6) {
        int var8 = arg0 - this.field1627;
        int var9 = arg3 - this.field1625;
        int var10 = 256;
        field1645++;
        if (arg6) {
            var10 |= 0x20000;
        }
        if (arg2) {
            var10 |= 0x40000000;
        }
        int var11 = 2 / ((arg4 + 67) / 46);
        for (int var12 = var9; var12 < (var9 + arg1); var12++) {
            if (var12 >= 0 && var12 < this.field1637) {
                for (int var13 = var8; var13 < arg5 + var8; var13++) {
                    if (var13 >= 0 && var13 < this.field1629) {
                        this.method824(672024486, var13, var10, var12);
                    }
                }
            }
        }
    }
}
