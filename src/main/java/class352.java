import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class352 extends class159 {

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "[B")
    public byte[] field5609;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "Ljava/lang/String;")
    public static String field5608 = "rating: ";

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "Z")
    public static boolean field5610 = true;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field5607 = 0;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "[[B")
    public static byte[][] field5613 = new byte[250][];

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
    public static int field5612 = 0;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "Lle;")
    public static class137 field5615;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "[[Ljb;")
    public static class226[][] field5605;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V", line = 5)
    public static final void method2457(int arg0) {
        field5614++;
        class167.field2627 = new class264[class41.field632.method1503(false)][];
        if (arg0 == 3008) {
            class296.field4914 = new boolean[class41.field632.method1503(false)];
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(III)Lbn;", line = 20)
    public static final class206 method2458(int arg0, int arg1, int arg2) {
        class50 var3 = class264.field4230[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class206 var4 = var3.field747;
            var3.field747 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)V", line = 41)
    public static final void method2459(int arg0) {
        field5604++;
        if (!class107.field1532) {
            return;
        }
        class264 var1 = class113.method741(class345.field5530, (byte) 124, class313.field5108);
        if (var1 != null && var1.field4211 != null) {
            class190 var2 = new class190();
            var2.field2937 = var1;
            var2.field2940 = var1.field4211;
            class201.method1372(var2, arg0 + 200001);
        }
        class83.field1199 = arg0;
        class107.field1532 = false;
        class218.method1472((byte) 96, var1);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 65)
    public static final void method2460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class20 var20 = new class20(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class264.field4230[var21][arg1][arg2] == null) {
                    class264.field4230[var21][arg1][arg2] = new class50(var21, arg1, arg2);
                }
            }
            class264.field4230[arg0][arg1][arg2].field754 = var20;
        } else if (arg3 == 1) {
            class20 var22 = new class20(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class264.field4230[var23][arg1][arg2] == null) {
                    class264.field4230[var23][arg1][arg2] = new class50(var23, arg1, arg2);
                }
            }
            class264.field4230[arg0][arg1][arg2].field754 = var22;
        } else {
            class316 var24 = new class316(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class264.field4230[var25][arg1][arg2] == null) {
                    class264.field4230[var25][arg1][arg2] = new class50(var25, arg1, arg2);
                }
            }
            class264.field4230[arg0][arg1][arg2].field740 = var24;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 124)
    public static final void method2461(byte arg0) {
        class192.field2972 = 0;
        int var1 = (class329.field5388.field4796 >> 7) + class215.field3313;
        int var2 = (class329.field5388.field4783 >> 7) + class150.field2420;
        field5603++;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class192.field2972 = 1;
        }
        if (arg0 != 82) {
            return;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class192.field2972 = 1;
        }
        if (class192.field2972 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class192.field2972 = 0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 148)
    public static final void method2462(String arg0, int arg1) {
        field5606++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        if (arg1 > -95) {
            field5612 = -28;
        }
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)V", line = 163)
    public static void method2463(int arg0) {
        if (arg0 > -119) {
            field5615 = (class137) null;
        }
        field5613 = (byte[][]) null;
        field5605 = (class226[][]) null;
        field5608 = null;
        field5615 = null;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "([B)V", line = 178)
    public class352(byte[] arg0) {
        this.field5609 = arg0;
    }
}
