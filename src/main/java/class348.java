import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class348 extends class170 {

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "I")
    public int field4699 = 1;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "Ljm;")
    public static class162 field4690 = new class162();

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "[Lin;")
    public static class182[] field4696 = new class182[14];

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "C")
    public char field4692;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "[I")
    public static int[] field4698;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lrg;II)V")
    private final void method2102(class366 arg0, int arg1, int arg2) {
        if (arg2 != 14) {
            return;
        }
        field4691++;
        if (arg1 == 1) {
            this.field4692 = class93.method732(63, arg0.method2289((byte) -77));
        } else if (arg1 == 2) {
            this.field4699 = 0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II[I)V")
    public static final void method2103(int arg0, int arg1, int[] arg2) {
        field4700++;
        for (int var3 = arg0; var3 > 0; var3--) {
            int var4 = var3 * 36;
            for (int var5 = 35; var5 > 0; var5--) {
                if (arg2[var4 + var5] == 0 && arg2[var4 + var5 - 36 - 1] != 0) {
                    arg2[var5 + var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLrg;)V")
    public final void method2104(byte arg0, class366 arg1) {
        field4697++;
        while (true) {
            int var3 = arg1.method2306((byte) 94);
            if (var3 == 0) {
                if (arg0 < 94) {
                    this.field4692 = (char) 65478;
                    return;
                } else {
                    return;
                }
            }
            this.method2102(arg1, var3, 14);
        }
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)V")
    public static final void method2105(int arg0) {
        field4693++;
        if (arg0 != 1) {
            return;
        }
        if (class354.field4765.method259()) {
            class251.method1616((byte) 41);
            class354.field4765.method240(class104.field1447);
            class136.method1018((byte) 89);
        } else {
            class90.method715(125, class22.field284);
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V")
    public static void method2106(byte arg0) {
        field4690 = null;
        field4698 = null;
        field4696 = null;
        if (arg0 != -48) {
            field4690 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IBI)V")
    public static final void method2107(int arg0, byte arg1, int arg2) {
        int var3 = 22 / ((arg1 + 48) / 63);
        field4694++;
        int var4 = class1.field2 * arg0 >> 8;
        if (arg2 == -1 && !class133.field1993) {
            class266.method1697(42);
        } else if (arg2 != -1 && (class354.field4762 != arg2 || !class187.method1302(0)) && var4 != 0 && !class133.field1993) {
            class80.method647(arg2, (byte) -118, 0, var4, false, 2, class2.field14);
        }
        class354.field4762 = arg2;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(IB)Lsp;")
    public static final class424 method2108(int arg0, byte arg1) {
        field4695++;
        if (arg1 != 33) {
            method2103(93, -61, (int[]) null);
        }
        if (arg0 == 0) {
            return new class372();
        } else if (arg0 == 1) {
            return new class346();
        } else if (arg0 == 2) {
            return new class30();
        } else if (arg0 == 3) {
            return new class381();
        } else if (arg0 == 4) {
            return new class281();
        } else if (arg0 == 5) {
            return new class64();
        } else if (arg0 == 6) {
            return new class130();
        } else if (arg0 == 7) {
            return new class156();
        } else if (arg0 == 8) {
            return new class356();
        } else if (arg0 == 9) {
            return new class373();
        } else if (arg0 == 10) {
            return new class395();
        } else if (arg0 == 11) {
            return new class232();
        } else if (arg0 == 12) {
            return new class379();
        } else if (arg0 == 13) {
            return new class398();
        } else if (arg0 == 14) {
            return new class332();
        } else if (arg0 == 15) {
            return new class117();
        } else if (arg0 == 16) {
            return new class300();
        } else if (arg0 == 17) {
            return new class169();
        } else if (arg0 == 18) {
            return new class452();
        } else if (arg0 == 19) {
            return new class194();
        } else if (arg0 == 20) {
            return new class124();
        } else if (arg0 == 21) {
            return new class436();
        } else if (arg0 == 22) {
            return new class140();
        } else if (arg0 == 23) {
            return new class243();
        } else if (arg0 == 24) {
            return new class302();
        } else if (arg0 == 25) {
            return new class4();
        } else if (arg0 == 26) {
            return new class18();
        } else if (arg0 == 27) {
            return new class123();
        } else if (arg0 == 28) {
            return new class282();
        } else if (arg0 == 29) {
            return new class92();
        } else if (arg0 == 30) {
            return new class343();
        } else if (arg0 == 31) {
            return new class8();
        } else if (arg0 == 32) {
            return new class19();
        } else if (arg0 == 33) {
            return new class90();
        } else if (arg0 == 34) {
            return new class319();
        } else if (arg0 == 35) {
            return new class150();
        } else if (arg0 == 36) {
            return new class317();
        } else if (arg0 == 37) {
            return new class85();
        } else if (arg0 == 38) {
            return new class113();
        } else if (arg0 == 39) {
            return new class431();
        } else {
            return null;
        }
    }
}
