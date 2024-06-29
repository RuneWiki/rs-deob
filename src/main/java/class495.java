import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class495 extends class431 {

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public int field7134;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public int field7137;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "[[Z")
    public static boolean[][] field7136 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Llq;Z)Z", line = 5)
    public static final boolean method2940(class389 arg0, boolean arg1) {
        boolean var2 = class491.field7059 == class290.field4367;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method958((byte) 41);
        if (arg0.field5836 < 0 || arg0.field5830 < 0 || arg0.field5827 >= class497.field7147 || arg0.field5829 >= class385.field5799) {
            return false;
        }
        for (int var6 = arg0.field5836; var6 <= arg0.field5827; var6++) {
            for (int var9 = arg0.field5830; var9 <= arg0.field5829; var9++) {
                class138 var10 = class297.method1929(arg0.field5826, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field5836) {
                        var11++;
                    }
                    if (var6 < arg0.field5827) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field5830) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field5829) {
                        var11 += 2;
                    }
                    class327 var12 = class68.method586((byte) 110, arg0, var11);
                    class327 var13 = var10.field2118;
                    if (var13 == null) {
                        var10.field2118 = var12;
                    } else {
                        while (var13.field4922 != null) {
                            var13 = var13.field4922;
                        }
                        var13.field4922 = var12;
                    }
                    var10.field2109 = (byte) (var10.field2109 | var11);
                    if (var2 && (class368.field5403[var6][var9] & 0xFF000000) != 0) {
                        var3 = class368.field5403[var6][var9];
                        var4 = class76.field1100[var6][var9];
                        var5 = class182.field2722[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field5836; var7 <= arg0.field5827; var7++) {
                for (int var8 = arg0.field5830; var8 <= arg0.field5829; var8++) {
                    if ((class368.field5403[var7][var8] & 0xFF000000) == 0) {
                        class368.field5403[var7][var8] = var3;
                        class76.field1100[var7][var8] = var4;
                        class182.field2722[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class308.field4643[class295.field4506++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILla;Ljava/lang/String;Luq;ILlm;IILma;II)V", line = 108)
    public static final void method2941(int arg0, int arg1, class317 arg2, String arg3, class114 arg4, int arg5, class348 arg6, int arg7, int arg8, class10 arg9, int arg10, int arg11) {
        field7141++;
        int var12;
        if (class176.field2611 == 4) {
            var12 = (int) class473.field6830 & 0x3FFF;
        } else {
            var12 = (int) class473.field6830 + class162.field2414 & 0x3FFF;
        }
        int var13 = Math.max(arg4.field1642 / 2, arg4.field1627 / 2) + 10;
        int var14 = arg5 * arg5 + arg10 * arg10;
        if (var13 * var13 < var14) {
            return;
        }
        int var15 = class281.field4278[var12];
        int var16 = class281.field4279[var12];
        if (class176.field2611 != 4) {
            var16 = var16 * 256 / (class4.field23 + 256);
            var15 = var15 * 256 / (class4.field23 + 256);
        }
        int var17 = arg5 * var15 + arg10 * var16 >> 15;
        int var18 = arg5 * var16 - (arg10 * var15) >> 15;
        int var19 = arg6.method2172((byte) 91, 100, null, arg3);
        int var20 = var17 - var19 / 2;
        int var21 = arg6.method2173(arg1 + 31, arg3, 0, 100, null);
        if (-arg4.field1642 <= var20 && var20 <= arg4.field1642 && var18 >= (-arg4.field1627) && arg4.field1627 >= var18) {
            arg2.method2043(arg11, 1, arg1, var19, null, arg3, arg0, arg9, null, 50, 0, arg8, arg4.field1642 / 2 + arg8 + var20, arg4.field1627 / 2 - var18 + -arg7 + arg11 - var21, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 155)
    public static final void method2942(String arg0, int arg1, int arg2) {
        field7135++;
        if (arg1 != 50) {
            field7136 = null;
        }
        class211 var3 = class452.method2749(2, -115, arg2);
        var3.method1463(0);
        var3.field3445 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;IIBIIII)V", line = 177)
    public static final void method2943(String arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field7140++;
        class169 var8 = new class169();
        var8.field2494 = arg4;
        var8.field2503 = arg1;
        if (arg3 <= 38) {
            field7138 = 106;
        }
        var8.field2495 = class475.field6854 + arg6;
        var8.field2493 = arg5;
        var8.field2500 = arg7;
        var8.field2501 = arg0;
        var8.field2499 = arg2;
        class316.field4776.method1957(-28, var8);
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(II)V", line = 197)
    public class495(int arg0, int arg1) {
        this.field7134 = arg0;
        this.field7137 = arg1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 207)
    public static void method2944(byte arg0) {
        if (arg0 >= 95) {
            field7136 = null;
        }
    }
}
