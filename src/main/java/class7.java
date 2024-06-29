import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class7 extends class12 {

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public int field253;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "[[I")
    public int[][] field251;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "[Z")
    public boolean[] field256;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "[I")
    public int[] field252;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "Lvf;")
    public static class265 field261 = class87.method582(-46, "<col=ff0000>");

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
    public static int field262 = 0;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "Lch;")
    public static class117 field250 = new class117();

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "I")
    public static int field264 = 0;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "S")
    public static short field265 = 1;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)Llf;")
    public static final class105 method48(int arg0, int arg1) {
        field260++;
        if (arg1 == 0) {
            return new class267();
        } else if (arg1 == 1) {
            return new class253();
        } else if (arg1 == 2) {
            return new class187();
        } else if (arg1 == 3) {
            return new class161();
        } else if (arg1 == 4) {
            return new class155();
        } else if (arg1 == 5) {
            return new class2();
        } else if (arg1 == 6) {
            return new class19();
        } else if (arg1 == 7) {
            return new class147();
        } else if (arg1 == 8) {
            return new class111();
        } else if (arg1 == 9) {
            return new class282();
        } else if (arg1 == 10) {
            return new class258();
        } else if (arg1 == 11) {
            return new class162();
        } else if (arg1 == 12) {
            return new class231();
        } else if (arg1 == 13) {
            return new class193();
        } else if (arg1 == 14) {
            return new class68();
        } else if (arg1 == 15) {
            return new class94();
        } else if (arg1 == 16) {
            return new class249();
        } else if (arg1 == 17) {
            return new class112();
        } else if (arg1 == 18) {
            return new class236();
        } else if (arg1 == 19) {
            return new class96();
        } else if (arg1 == 20) {
            return new class22();
        } else if (arg1 == 21) {
            return new class171();
        } else if (arg1 == 22) {
            return new class67();
        } else if (arg1 == 23) {
            return new class61();
        } else if (arg1 == 24) {
            return new class280();
        } else if (arg1 == 25) {
            return new class53();
        } else if (arg1 == 26) {
            return new class32();
        } else if (arg1 == 27) {
            return new class30();
        } else if (arg1 == 28) {
            return new class11();
        } else if (arg1 == 29) {
            return new class91();
        } else if (arg1 == 30) {
            return new class124();
        } else if (arg1 == 31) {
            return new class78();
        } else if (arg1 == 32) {
            return new class240();
        } else if (arg1 == 33) {
            return new class44();
        } else if (arg1 == 34) {
            return new class120();
        } else if (arg1 == 35) {
            return new class97();
        } else if (arg1 == 36) {
            return new class18();
        } else if (arg1 == 37) {
            return new class243();
        } else if (arg1 == 38) {
            return new class279();
        } else if (arg1 == 39) {
            return new class57();
        } else {
            if (arg0 >= -117) {
                method48(-52, 75);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)V")
    public static void method49(int arg0) {
        field250 = null;
        field261 = null;
        int var1 = 46 / ((arg0 + 70) / 32);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lvf;B)V")
    public static final void method50(class265 arg0, byte arg1) {
        field255++;
        if (class198.field3547 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg0.method1793(43);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class198.field3547.length && class198.field3547[var2].field393 != var3) {
            var2++;
        }
        int var5 = -78 / ((60 - arg1) / 48);
        if (var2 < class198.field3547.length && class198.field3547[var2] != null) {
            class278.field4920++;
            class55.field1133.method1863(true, 34);
            class55.field1133.method911(0, class198.field3547[var2].field393);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III[B)Lvf;")
    public static final class265 method51(int arg0, int arg1, int arg2, byte[] arg3) {
        field263++;
        class265 var4 = new class265();
        var4.field4643 = new byte[arg2];
        var4.field4640 = 0;
        if (arg1 != 12047) {
            return null;
        }
        for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
            if (arg3[var5] != 0) {
                var4.field4643[var4.field4640++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)V")
    public static final void method52(int arg0, int arg1) {
        field259++;
        for (class12 var2 = class239.field4173.method1851(false); var2 != null; var2 = class239.field4173.method1847(false)) {
            if ((var2.field393 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method97(158);
            }
        }
        if (arg0 < 81) {
            field250 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lve;B)V")
    public static final void method53(class226 arg0, byte arg1) {
        field254++;
        class99 var2 = null;
        try {
            class114 var3 = arg0.method1538("runescape", 4);
            while (var3.field1996 == 0) {
                class19.method136(1, 1L);
            }
            if (arg1 > -121) {
                return;
            }
            if (var3.field1996 == 1) {
                var2 = (class99) var3.field1997;
                class135 var4 = class123.method829(false);
                var2.method658((byte) -76, 0, var4.field2483, var4.field2449);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method656(false);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIB)Lhh;")
    public static final class177 method54(int arg0, int arg1, byte arg2) {
        if (arg2 < 107) {
            return null;
        }
        field249++;
        class177 var3 = new class177();
        for (class13 var4 = (class13) class48.field1032.method789((byte) -64); var4 != null; var4 = (class13) class48.field1032.method787((byte) -76)) {
            if (var4.field401 && var4.method102(arg1, (byte) 74, arg0)) {
                var3.method1154(var4, -31849);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I[B)V")
    public class7(int arg0, byte[] arg1) {
        this.field253 = arg0;
        class135 var3 = new class135(arg1);
        this.field257 = var3.method920((byte) 75);
        this.field251 = new int[this.field257][];
        this.field256 = new boolean[this.field257];
        this.field252 = new int[this.field257];
        for (int var4 = 0; var4 < this.field257; var4++) {
            this.field252[var4] = var3.method920((byte) 83);
        }
        for (int var5 = 0; var5 < this.field257; var5++) {
            this.field256[var5] = var3.method920((byte) 78) == 1;
        }
        for (int var6 = 0; var6 < this.field257; var6++) {
            this.field251[var6] = new int[var3.method920((byte) 107)];
        }
        for (int var7 = 0; var7 < this.field257; var7++) {
            for (int var8 = 0; var8 < this.field251[var7].length; var8++) {
                this.field251[var7][var8] = var3.method920((byte) 22);
            }
        }
    }
}
