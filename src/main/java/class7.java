import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class7 implements Runnable {

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "Z")
    public boolean field144 = true;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field126 = new Object();

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "[I")
    public int[] field151 = new int[500];

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
    public int field152 = 0;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "[I")
    public int[] field153 = new int[500];

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Ldg;")
    public static class317 field130 = new class317();

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "Lud;")
    private static class279 field139 = class130.method1024("white:", 255);

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Lud;")
    public static class279 field136 = class130.method1024("Mem:", 255);

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "Lud;")
    private static class279 field137 = class130.method1024("green:", 255);

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "Lud;")
    public static class279 field145 = field139;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "Lud;")
    public static class279 field140 = field137;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "Lud;")
    public static class279 field134 = field137;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static volatile int field142 = 0;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "Lud;")
    public static class279 field135 = field139;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "Lud;")
    public static class279 field148 = class130.method1024("(U0a )2 via: ", 255);

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    public static int field150 = 0;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "[[B")
    public static byte[][] field147;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "[[[B")
    public static byte[][][] field141;

    @OriginalMember(owner = "client!gk", name = "run", descriptor = "()V", line = 9)
    public final void run() {
        while (this.field144) {
            Object var1 = this.field126;
            synchronized (this.field126) {
                if (this.field152 < 500) {
                    this.field153[this.field152] = class130.field2363;
                    this.field151[this.field152] = class51.field1056;
                    this.field152++;
                }
            }
            class204.method1510(50L, 1);
        }
        field127++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(JB)V", line = 30)
    public static final void method39(long arg0, byte arg1) {
        field129++;
        if (arg0 == 0L) {
            return;
        }
        if (class194.field3498 >= 100) {
            class59.method532(class117.field2125, class60.field1265, 0, 29437);
            return;
        }
        class279 var3 = class72.method631(arg0, 5702).method2016(-32);
        for (int var4 = 0; var4 < class194.field3498; var4++) {
            if (class59.field1250[var4] == arg0) {
                class59.method532(class115.method929(new class279[] { var3, class64.field1318 }, (byte) 60), class60.field1265, 0, 29437);
                return;
            }
        }
        for (int var5 = 0; var5 < class167.field3011; var5++) {
            if (class287.field5123[var5] == arg0) {
                class59.method532(class115.method929(new class279[] { class79.field1507, var3, class13.field412 }, (byte) 60), class60.field1265, 0, 29437);
                return;
            }
        }
        if (var3.method1990((byte) 78, class72.field1420.field4197)) {
            class59.method532(class307.field5466, class60.field1265, 0, 29437);
            return;
        }
        class59.field1250[class194.field3498] = arg0;
        class248.field4417[class194.field3498++] = class72.method631(arg0, 5702);
        class162.field2923 = class249.field4443;
        class155.field2811++;
        if (arg1 != 15) {
            field135 = (class279) null;
        }
        class314.field5534.method1634(106, 0);
        class314.field5534.method490(arg0, 14886);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 96)
    public static void method40(int arg0) {
        field147 = (byte[][]) null;
        field137 = null;
        if (arg0 <= 107) {
            method42(false, 96);
        }
        field136 = null;
        field134 = null;
        field148 = null;
        field145 = null;
        field141 = (byte[][][]) null;
        field140 = null;
        field135 = null;
        field139 = null;
        field130 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 116)
    public static final void method41(byte arg0) {
        class249.field4427.method1334((byte) -25);
        field146++;
        if (arg0 > -13) {
            method40(50);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZI)V", line = 127)
    public static final void method42(boolean arg0, int arg1) {
        if (arg0) {
            return;
        }
        class276.field4901 = -1;
        class298.field5284 = -1;
        field138++;
        class265.field4776 = arg1;
        class239.method1717(-2984);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 152)
    public static final void method43(int arg0) {
        field128++;
        if (arg0 != 64) {
            method40(-26);
        }
        for (int var1 = 0; var1 < class260.field4620; var1++) {
            int var10002 = class232.field4057[var1]--;
            if (class232.field4057[var1] >= -10) {
                class187 var2 = class92.field1724[var1];
                if (var2 == null) {
                    var2 = class187.method1438(class317.field5574, class3.field104[var1], 0);
                    if (var2 == null) {
                        continue;
                    }
                    class232.field4057[var1] += var2.method1437();
                    class92.field1724[var1] = var2;
                }
                if (class232.field4057[var1] < 0) {
                    int var9;
                    if (class55.field1196[var1] == 0) {
                        var9 = class41.field875;
                    } else {
                        int var3 = (class55.field1196[var1] & 0xFF) * 128;
                        int var4 = class55.field1196[var1] >> 16 & 0xFF;
                        int var5 = class55.field1196[var1] >> 8 & 0xFF;
                        int var6 = var4 * 128 + 64 - class72.field1420.field86;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = var5 * 128 + 64 - class72.field1420.field79;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var6 + var7 - 128;
                        if (var8 > var3) {
                            class232.field4057[var1] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = (var3 - var8) * class3.field105 / var3;
                    }
                    if (var9 > 0) {
                        class40 var10 = var2.method1436().method350(class213.field3747);
                        class82 var11 = class82.method685(var10, 100, var9);
                        var11.method715(class266.field4785[var1] - 1);
                        class322.field5630.method1960(var11);
                    }
                    class232.field4057[var1] = -100;
                }
            } else {
                class260.field4620--;
                for (int var12 = var1; var12 < class260.field4620; var12++) {
                    class3.field104[var12] = class3.field104[var12 + 1];
                    class92.field1724[var12] = class92.field1724[var12 + 1];
                    class266.field4785[var12] = class266.field4785[var12 + 1];
                    class232.field4057[var12] = class232.field4057[var12 + 1];
                    class55.field1196[var12] = class55.field1196[var12 + 1];
                }
                var1--;
            }
        }
        if (class204.field3634 && !class113.method921(true)) {
            if (class113.field2073 != 0 && class125.field2292 != -1) {
                class87.method758(false, (byte) -118, 0, class125.field2292, class113.field2073, class33.field742);
            }
            class204.field3634 = false;
        } else if (class113.field2073 != 0 && class125.field2292 != -1 && !class113.method921(true)) {
            class37.field831++;
            class314.field5534.method1634(198, 0);
            class314.field5534.method444((byte) 46, class125.field2292);
            class125.field2292 = -1;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)V", line = 285)
    public static final void method44(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= arg2) {
            for (int var5 = arg2; var5 < arg3; var5++) {
                class182.field3348[var5][arg4] = arg1;
            }
        } else {
            for (int var6 = arg3; var6 < arg2; var6++) {
                class182.field3348[var6][arg4] = arg1;
            }
        }
        field133++;
        if (arg0 < 31) {
            field136 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V", line = 321)
    public static final void method45(int arg0) {
        if (arg0 != -15559) {
            method44(-6, -68, -97, 68, 4);
        }
        while (true) {
            class283 var1;
            class1 var3;
            do {
                var1 = (class283) class194.field3483.method2247(120);
                if (var1 == null) {
                    field143++;
                    return;
                }
                if (var1.field5058 >= 0) {
                    int var2 = var1.field5058 - 1;
                    var3 = class122.field2196[var2];
                } else {
                    int var4 = -var1.field5058 - 1;
                    if (class79.field1506 == var4) {
                        var3 = class72.field1420;
                    } else {
                        var3 = class96.field1780[var4];
                    }
                }
            } while (var3 == null);
            class264 var5 = class252.method1808(var1.field5054, (byte) 4);
            if (class287.field5134 < 3) {
            }
            int var6;
            int var7;
            if (var1.field5047 == 1 || var1.field5047 == 3) {
                var7 = var5.field4766;
                var6 = var5.field4733;
            } else {
                var6 = var5.field4766;
                var7 = var5.field4733;
            }
            int var8 = (var6 >> 1) + var1.field5049;
            int var9 = var1.field5049 + (var6 + 1 >> 1);
            int var10 = (var7 >> 1) + var1.field5060;
            int var11 = var1.field5060 + (var7 + 1 >> 1);
            int[][] var12 = class165.field2970[class287.field5134];
            int var13 = var12[var8][var10] + var12[var8][var11] + var12[var9][var10] + var12[var9][var11] >> 2;
            int var14 = class252.field4505[var1.field5048];
            class108 var15 = null;
            if (var14 == 0) {
                var15 = class135.method1059(class287.field5134, var1.field5049, var1.field5060).field522;
            } else if (var14 == 1) {
                var15 = class44.method383(class287.field5134, var1.field5049, var1.field5060).field4091;
            } else if (var14 == 2) {
                var15 = class99.method846(class287.field5134, var1.field5049, var1.field5060).field563;
            } else if (var14 == 3) {
                var15 = class54.method511(class287.field5134, var1.field5049, var1.field5060).field4316;
            }
            if (var15 != null) {
                class17.method148(var1.field5049, arg0 ^ 0xFFFFC339, var1.field5053 + 1, class287.field5134, var1.field5060, -1, var14, var1.field5050 + 1, 0, 0);
                var3.field35 = var1.field5049 * 128 + var6 * 64;
                var3.field89 = var13;
                var3.field41 = class8.field279 + var1.field5053;
                int var16 = var1.field5055;
                var3.field73 = var1.field5060 * 128 + var7 * 64;
                var3.field24 = var15;
                int var17 = var1.field5056;
                var3.field76 = var1.field5050 + class8.field279;
                int var18 = var1.field5051;
                int var19 = var1.field5057;
                if (var17 < var16) {
                    int var20 = var16;
                    var16 = var17;
                    var17 = var20;
                }
                var3.field72 = var1.field5049 + var17;
                var3.field56 = var1.field5049 + var16;
                if (var18 < var19) {
                    int var21 = var19;
                    var19 = var18;
                    var18 = var21;
                }
                var3.field100 = var1.field5060 + var19;
                var3.field67 = var1.field5060 + var18;
            }
        }
    }
}
