import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class125 extends class71 {

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public int field1862 = 0;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    public int field1874 = -1;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public int field1859;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public int field1860;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    public int field1864;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    public int field1865;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public int field1866;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    public int field1869;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
    public int field1870;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public int field1872;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    public int field1873;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    public int field1875;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lim;I)Lkh;", line = 11)
    public static final class16 method863(class192 arg0, int arg1) {
        arg0.method1399(-1172389784);
        int var2 = arg0.method1399(arg1 ^ 0xBA1EEEC5);
        field1863++;
        class16 var3 = class140.method938(8, var2);
        var3.field205 = arg0.method1399(arg1 - 1172401733);
        int var4 = arg0.method1399(-1172389784);
        if (arg1 != 11949) {
            return (class16) null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1399(-1172389784);
            var3.method52((byte) -7, arg0, var6);
        }
        var3.method55((byte) 0);
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V", line = 44)
    public static final void method864(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method863((class192) null, 69);
        }
        field1867++;
        if (class204.method1498((byte) -97, arg0)) {
            class247.method1754((byte) 68, arg1, class21.field309[arg0]);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 60)
    public static final String method865(byte arg0, int arg1) {
        field1871++;
        if (arg0 >= -80) {
            method863((class192) null, -59);
        }
        if (arg1 >= 100000) {
            return arg1 < 10000000 ? "<col=ffffff>" + arg1 / 1000 + class132.field1967 + "</col>" : "<col=00ff80>" + arg1 / 1000000 + class321.field5032 + "</col>";
        } else {
            return "<col=ffff00>" + arg1 + "</col>";
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lim;B)Lvk;", line = 82)
    public static final class182 method866(class192 arg0, byte arg1) {
        int var2 = -32 % ((-arg1 - 78) / 42);
        field1868++;
        return new class182(arg0.method1389(122), arg0.method1389(113), arg0.method1389(113), arg0.method1389(110), arg0.method1389(97), arg0.method1389(118), arg0.method1389(126), arg0.method1389(110), arg0.method1378(false), arg0.method1399(-1172389784));
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()V", line = 105)
    public static final void method867() {
        if (class176.field2879 != null) {
            for (int var0 = 0; var0 < class176.field2879.length; var0++) {
                for (int var1 = 0; var1 < class4.field43; var1++) {
                    for (int var2 = 0; var2 < class64.field844; var2++) {
                        class176.field2879[var0][var1][var2] = null;
                    }
                }
            }
        }
        class60.field788 = (class83[][]) null;
        if (class339.field5270 != null) {
            for (int var3 = 0; var3 < class339.field5270.length; var3++) {
                for (int var4 = 0; var4 < class4.field43; var4++) {
                    for (int var5 = 0; var5 < class64.field844; var5++) {
                        class339.field5270[var3][var4][var5] = null;
                    }
                }
            }
        }
        class157.field2421 = (class83[][]) null;
        class181.field2918 = 0;
        if (class294.field4626 != null) {
            for (int var6 = 0; var6 < class181.field2918; var6++) {
                class294.field4626[var6] = null;
            }
        }
        if (class240.field3822 != null) {
            for (int var7 = 0; var7 < class281.field4422; var7++) {
                class240.field3822[var7] = null;
            }
            class281.field4422 = 0;
        }
        if (class145.field2165 != null) {
            for (int var8 = 0; var8 < class145.field2165.length; var8++) {
                class145.field2165[var8] = null;
            }
        }
    }
}
