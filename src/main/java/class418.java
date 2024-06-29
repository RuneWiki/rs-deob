import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class418 {

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public int field5793 = -1;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field5783 = 0;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field5784 = 0;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "[I")
    public static int[] field5781 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public int field5778;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public int field5782;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public int field5785;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public int field5786;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public int field5787;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public int field5789;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public int field5791;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public int field5792;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public int field5795;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)I", line = 7)
    public static final int method2578(int arg0) {
        field5794++;
        int var1 = 52 / ((arg0 + 8) / 59);
        if (class31.field431 == null) {
            if (!class317.field4324 && class149.field2171 > 0) {
                if (class187.field2704 && class146.field2122.method1474(-20986, 81) && class149.field2171 > 2) {
                    return ((class429) class451.field6491.field2296.field4225.field4225).field5980;
                }
                return ((class429) class451.field6491.field2296.field4225).field5980;
            }
            int var2 = class116.field1759.method34(true);
            int var3 = class116.field1759.method30((byte) 115);
            int var4 = class75.field1073;
            int var5 = class49.field631;
            int var6 = class4.field32;
            if (var4 < var2 && (var4 + var6) > var2) {
                int var7 = -1;
                for (int var8 = 0; var8 < class149.field2171; var8++) {
                    if (class53.field678) {
                        int var12 = var5 - (-((class149.field2171 - var8 - 1) * 16) - 33);
                        if (var3 > (var12 - 13) && var3 <= (var12 + 3)) {
                            var7 = var8;
                        }
                    } else {
                        int var13 = (class149.field2171 - var8 - 1) * 16 + (var5 + 31);
                        if (var13 - 13 < var3 && (var13 + 3) >= var3) {
                            var7 = var8;
                        }
                    }
                }
                if (var7 != -1) {
                    int var9 = 0;
                    class416 var10 = new class416(class451.field6491);
                    for (class429 var11 = (class429) var10.method2572(107); var11 != null; var11 = (class429) var10.method2573(-126)) {
                        if (var9++ == var7) {
                            return var11.field5980;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZC)Z", line = 106)
    public static final boolean method2579(boolean arg0, char arg1) {
        field5779++;
        if (arg0) {
            field5783 = 105;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lh;I)V", line = 118)
    public static final void method2580(class429 arg0, int arg1) {
        if (arg1 != 8986) {
            field5780 = 26;
        }
        field5790++;
        if (!class317.field4324) {
            arg0.method1884(false);
            class149.field2171--;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V", line = 144)
    public static final void method2581(int arg0) {
        field5777++;
        int var1 = -84 % ((arg0 - 45) / 53);
        for (int var2 = 0; var2 < class389.field5423.length; var2++) {
            for (int var3 = 0; var3 < class389.field5423[var2].length; var3++) {
                class389.field5423[var2][var3] = class367.field5098;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V", line = 178)
    public static void method2582(boolean arg0) {
        field5781 = null;
        if (!arg0) {
            field5780 = -16;
        }
    }
}
