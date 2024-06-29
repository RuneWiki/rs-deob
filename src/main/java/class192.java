import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class192 extends class155 {

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public static int field2843 = 0;

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "I")
    public static int field2836 = 0;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "C")
    private char field2842;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    public int field2840;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "Ljava/lang/String;")
    public String field2837;

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "Z")
    public static boolean field2839;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "[[[B")
    public static byte[][][] field2847;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(Z)V")
    public static final void method1361(boolean arg0) {
        field2835++;
        if (arg0) {
            method1361(true);
        }
        for (class293 var1 = (class293) class222.field3228.method8(-120); var1 != null; var1 = (class293) class222.field3228.method12((byte) 69)) {
            if (var1.field4668 > 0) {
                var1.field4668--;
            }
            if (var1.field4668 != 0) {
                if (var1.field4660 > 0) {
                    var1.field4660--;
                }
                if (var1.field4660 == 0 && var1.field4655 >= 1 && var1.field4663 >= 1 && var1.field4655 <= 102 && var1.field4663 <= 102 && (var1.field4649 < 0 || class123.method951(var1.field4662, var1.field4649, arg0))) {
                    class87.method639(var1.field4667, var1.field4649, var1.field4662, var1.field4670, var1.field4663, var1.field4655, -7, var1.field4651);
                    var1.field4660 = -1;
                    if (var1.field4652 == var1.field4649 && var1.field4652 == -1) {
                        var1.method1781(5250);
                    } else if (var1.field4652 == var1.field4649 && var1.field4654 == var1.field4651 && var1.field4662 == var1.field4657) {
                        var1.method1781(5250);
                    }
                }
            } else if (var1.field4652 < 0 || class123.method951(var1.field4657, var1.field4652, arg0)) {
                class87.method639(var1.field4667, var1.field4652, var1.field4657, var1.field4670, var1.field4663, var1.field4655, -7, var1.field4654);
                var1.method1781(5250);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method1362(String arg0, int arg1, boolean arg2) {
        String var3 = arg0.toLowerCase();
        int var4 = 0;
        if (arg1 != 7490) {
            method1365((class270) null, (class270) null, 81);
        }
        short[] var5 = new short[16];
        field2844++;
        for (int var6 = 0; var6 < class32.field402; var6++) {
            class31 var9 = class12.method88(var6, 27838);
            if ((!arg2 || var9.field353) && var9.field323 == -1 && var9.field369 == -1 && var9.field363 == 0 && var9.field349.toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 250) {
                    class45.field610 = null;
                    class289.field4617 = -1;
                    return;
                }
                if (var4 >= var5.length) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var4++] = (short) var6;
            }
        }
        class170.field2579 = 0;
        class45.field610 = var5;
        class289.field4617 = var4;
        String[] var7 = new String[class289.field4617];
        for (int var8 = 0; var8 < class289.field4617; var8++) {
            var7[var8] = class12.method88(var5[var8], arg1 + 20348).field349;
        }
        class65.method488(0, var7, class45.field610);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lhc;Z)V")
    public final void method1363(class53 arg0, boolean arg1) {
        if (!arg1) {
            this.method1364((class53) null, -10, 36);
        }
        while (true) {
            int var3 = arg0.method366(-16505);
            if (var3 == 0) {
                field2838++;
                return;
            }
            this.method1364(arg0, var3, -1);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lhc;II)V")
    private final void method1364(class53 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2842 = class52.method320(1, arg0.method335((byte) 26));
        } else if (arg1 == 2) {
            this.field2840 = arg0.method340(-128);
        } else if (arg1 == 5) {
            this.field2837 = arg0.method326(76);
        }
        field2846++;
        if (arg2 != -1) {
            this.method1364((class53) null, -79, 66);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Llc;Llc;I)V")
    public static final void method1365(class270 arg0, class270 arg1, int arg2) {
        class5.field46 = arg1;
        if (arg2 < 31) {
            method1361(false);
        }
        class301.field4867 = arg0;
        class301.field4867.method1891(36, 73);
        field2834++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIII)V")
    public static final void method1366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -114 / ((arg2 - 57) / 57);
        field2841++;
        if (arg3 > class59.field859 || arg4 < class73.field1156) {
            return;
        }
        boolean var7;
        if (class264.field4230 > arg0) {
            arg0 = class264.field4230;
            var7 = false;
        } else if (arg0 <= class273.field4418) {
            var7 = true;
        } else {
            var7 = false;
            arg0 = class273.field4418;
        }
        boolean var8;
        if (class264.field4230 > arg1) {
            arg1 = class264.field4230;
            var8 = false;
        } else if (class273.field4418 >= arg1) {
            var8 = true;
        } else {
            var8 = false;
            arg1 = class273.field4418;
        }
        if (arg3 >= class73.field1156) {
            class89.method669(class104.field1795[arg3++], arg5, arg0, arg1, (byte) -123);
        } else {
            arg3 = class73.field1156;
        }
        if (class59.field859 >= arg4) {
            class89.method669(class104.field1795[arg4--], arg5, arg0, arg1, (byte) -123);
        } else {
            arg4 = class59.field859;
        }
        if (var8 && var7) {
            for (int var9 = arg3; var9 <= arg4; var9++) {
                int[] var10 = class104.field1795[var9];
                var10[arg1] = var10[arg0] = arg5;
            }
        } else if (var8) {
            for (int var12 = arg3; var12 <= arg4; var12++) {
                class104.field1795[var12][arg1] = arg5;
            }
        } else if (var7) {
            for (int var11 = arg3; var11 <= arg4; var11++) {
                class104.field1795[var11][arg0] = arg5;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(Z)V")
    public static void method1367(boolean arg0) {
        field2847 = null;
        if (!arg0) {
            field2833 = -96;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)I")
    public static final int method1368(int arg0, int arg1) {
        field2832++;
        return arg1 == 14011 ? arg0 & 0x7F : 8;
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)Z")
    public final boolean method1369(int arg0) {
        field2845++;
        if (arg0 == 0) {
            return this.field2842 == 's';
        } else {
            return true;
        }
    }
}
