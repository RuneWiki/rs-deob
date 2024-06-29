import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public abstract class class89 extends class120 {

    @OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
    public int field1119;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
    public int field1118;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "Lal;")
    public static class52 field1112 = new class52(200);

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "Lmo;")
    public static class447 field1116;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILjg;)V")
    public static final void method535(int arg0, class186 arg1) {
        if (arg0 > -99) {
            method538((byte[]) null, 83, (byte) 98, -55, (byte[][]) null, (int[]) null, (int[]) null, (byte[][]) null);
        }
        field1117++;
        if ((arg1.field3066.length - arg1.field3044) < 1) {
            return;
        }
        int var2 = arg1.method1322(false);
        if (var2 < 0 || var2 > 15) {
            return;
        }
        byte var3;
        if (var2 == 15) {
            var3 = 37;
        } else if (var2 == 14) {
            var3 = 36;
        } else if (var2 == 13) {
            var3 = 35;
        } else if (var2 == 12) {
            var3 = 34;
        } else if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > arg1.field3066.length - arg1.field3044) {
            return;
        }
        class394.field5905 = arg1.method1322(false);
        if (class394.field5905 < 1) {
            class394.field5905 = 1;
        } else if (class394.field5905 > 4) {
            class394.field5905 = 4;
        }
        class449.method2794((byte) -92, arg1.method1322(false) == 1);
        class216.field3514 = arg1.method1322(false) == 1;
        class341.field5267 = arg1.method1322(false) == 1;
        class311.field4905 = arg1.method1322(false) == 1;
        class137.field2145 = arg1.method1322(false) == 1 ? 1 : 0;
        class234.field3903 = arg1.method1322(false) == 1;
        class256.field4149 = arg1.method1322(false) == 1;
        class183.field2984 = arg1.method1322(false) == 1;
        class299.field4755 = arg1.method1322(false);
        if (class299.field4755 > 2) {
            class299.field4755 = 2;
        }
        if (var2 < 2) {
            class377.field5695 = arg1.method1322(false) == 1;
            arg1.method1322(false);
        } else {
            class377.field5695 = arg1.method1322(false) == 1;
        }
        class220.field3627 = arg1.method1322(false) == 1;
        class241.field3987 = arg1.method1322(false) == 1;
        class86.field1103 = arg1.method1322(false);
        if (class86.field1103 > 2) {
            class86.field1103 = 2;
        }
        class418.field6198 = class86.field1103;
        class349.field5410 = arg1.method1322(false) == 1;
        class145.field2283 = arg1.method1322(false);
        if (class145.field2283 > 127) {
            class145.field2283 = 127;
        }
        class232.field3867 = arg1.method1322(false);
        class213.field3427 = arg1.method1322(false);
        if (class213.field3427 > 127) {
            class213.field3427 = 127;
        }
        if (var2 >= 1) {
            class343.field5286 = arg1.method1272((byte) -53);
            class417.field6163 = arg1.method1272((byte) -63);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1322(false);
        }
        if (var2 >= 4) {
            int var4 = arg1.method1322(false);
            if (var4 < 0 || var4 > 2) {
                var4 = 0;
            }
            if (class27.field314 < 96) {
                var4 = 0;
            }
            class331.method2196(0, var4);
        }
        if (var2 >= 5) {
            class13.field183 = arg1.method1284(8388607);
        }
        int var5 = 0;
        if (var2 >= 6) {
            class317.field4970 = var5 = arg1.method1322(false);
        }
        if (class317.field4970 != 1 && class317.field4970 != 2) {
            class317.field4970 = 2;
        }
        if (var2 >= 7) {
            class392.field5887 = arg1.method1322(false) == 1;
        }
        if (var2 >= 8) {
            class301.field4772 = arg1.method1322(false) == 1;
        }
        if (var2 >= 9) {
            class386.field5835 = arg1.method1322(false);
        }
        if (class386.field5835 < 0 || class386.field5835 > 3) {
            class386.field5835 = 0;
        }
        if (var2 >= 10) {
            class99.field1381 = arg1.method1322(false) != 0;
        }
        if (var2 >= 11) {
            class150.field2338 = arg1.method1322(false) != 0;
        }
        if (var2 >= 12) {
            class137.field2145 = arg1.method1322(false);
        }
        if (class137.field2145 < 0 || class137.field2145 > 2) {
            class137.field2145 = 1;
        }
        if (var2 >= 13) {
            class395.field5923 = arg1.method1322(false) == 1;
        }
        if (var2 >= 14) {
            class452.field6579 = arg1.method1322(false);
        } else if (var5 == 0) {
            class452.field6579 = 2;
        } else {
            class452.field6579 = 1;
        }
        if (class452.field6579 < 0 || class452.field6579 > 3) {
            class452.field6579 = 2;
        }
        if (var2 >= 15) {
            class183.field2996 = arg1.method1322(false);
            if (class183.field2996 < 0 || class183.field2996 > 4) {
                class183.field2996 = class452.field6587 == 1 ? 2 : 4;
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljg;Z)V")
    public static final void method536(class186 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        for (int var2 = 0; var2 < class137.field2142; var2++) {
            int var3 = arg0.method1299(-104);
            int var4 = arg0.method1272((byte) -62);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class41.field512[var3] != null) {
                class41.field512[var3].field4064 = var4;
            }
        }
        field1115++;
    }

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "(I)V")
    public static void method537(int arg0) {
        field1112 = null;
        field1116 = null;
        if (arg0 != 4372) {
            field1116 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(IIII)V")
    public class89(int arg0, int arg1, int arg2, int arg3) {
        this.field1121 = arg3;
        this.field1113 = arg2;
        this.field1119 = arg1;
        this.field1118 = arg0;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "([BIBI[[B[I[I[[B)I")
    public static final int method538(byte[] arg0, int arg1, byte arg2, int arg3, byte[][] arg4, int[] arg5, int[] arg6, byte[][] arg7) {
        field1114++;
        int var8 = arg5[arg1];
        int var9 = arg6[arg1] + var8;
        int var10 = arg5[arg3];
        int var11 = var10 + arg6[arg3];
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg0[arg1] & 0xFF;
        if ((arg0[arg3] & 0xFF) < var14) {
            var14 = arg0[arg3] & 0xFF;
        }
        byte[] var15 = arg7[arg1];
        byte[] var16 = arg4[arg3];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        if (arg2 != -35) {
            return -39;
        }
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }
}
