import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class63 extends class72 {

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field1371 = 0;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "[Lae;")
    public static class6[] field1375 = new class6[1000];

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "Lbd;")
    public static class12 field1385 = new class12(10);

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "Lae;")
    public static class6 field1386 = class64.method474(106, "@whi@ )4 ");

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "I")
    public static int field1387 = 0;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    public int field1372;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
    public int field1376;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "I")
    public int field1379;

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "Lbf;")
    public static class14 field1382;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(Z)V", line = 17)
    public static final void method458(boolean arg0) {
        try {
            if (arg0) {
                return;
            }
            Graphics var1 = class70.field1564.getGraphics();
            class111.field2675.method1(-39, var1, 0, 4);
            class108.field2586.method1(-107, var1, 0, 357);
            class92.field2188.method1(-97, var1, 722, 4);
            class15.field311.method1(-119, var1, 743, 205);
            class79.field1920.method1(-65, var1, 0, 0);
            class123.field3029.method1(-123, var1, 516, 4);
            class47.field1066.method1(-103, var1, 516, 205);
            class121.field2995.method1(-112, var1, 496, 357);
            class105.field2496.method1(-66, var1, 0, 338);
        } catch (Exception var2) {
            class70.field1564.repaint();
        }
        field1384++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 43)
    public static final void method459(byte arg0) {
        class103 var1 = (class103) class24.field609.method798(false);
        if (arg0 != 92) {
            method459((byte) -28);
        }
        while (var1 != null) {
            if (var1.field2425 > 0) {
                var1.field2425--;
            }
            if (var1.field2425 != 0) {
                if (var1.field2447 > 0) {
                    var1.field2447--;
                }
                if (var1.field2447 == 0 && var1.field2435 >= 1 && var1.field2444 >= 1 && var1.field2435 <= 102 && var1.field2444 <= 102 && (var1.field2428 < 0 || class87.method742(0, var1.field2426, var1.field2428))) {
                    class108.method912(var1.field2438, var1.field2427, var1.field2441, var1.field2444, var1.field2428, var1.field2426, var1.field2435, false);
                    var1.field2447 = -1;
                    if (var1.field2440 == var1.field2428 && var1.field2440 == -1) {
                        var1.method498(arg0 ^ 0x34);
                    } else if (var1.field2440 == var1.field2428 && var1.field2441 == var1.field2418 && var1.field2426 == var1.field2420) {
                        var1.method498(98);
                    }
                }
            } else if (var1.field2440 < 0 || class87.method742(arg0 - 92, var1.field2420, var1.field2440)) {
                class108.method912(var1.field2438, var1.field2427, var1.field2418, var1.field2444, var1.field2440, var1.field2420, var1.field2435, false);
                var1.method498(116);
            }
            var1 = (class103) class24.field609.method792((byte) -87);
        }
        field1383++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lm;B)V", line = 112)
    public final void method460(class77 arg0, byte arg1) {
        field1378++;
        if (arg1 != 122) {
            field1387 = 109;
        }
        while (true) {
            int var3 = arg0.method620((byte) -8);
            if (var3 == 0) {
                return;
            }
            this.method464(var3, -27451, arg0);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZ[BI)V", line = 134)
    public static final void method461(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        field1377++;
        if (class108.field2590 == null) {
            return;
        }
        if (class49.field1094 >= 0) {
            class105.field2503 = arg4;
            if (class49.field1094 == 0) {
                class87.field2102 = 1;
            } else {
                int var5 = class76.method610(929, class49.field1094);
                int var6 = var5 - class130.field3160;
                class87.field2102 = (var6 + 3600) / arg4;
                if (class87.field2102 < 1) {
                    class87.field2102 = 1;
                }
            }
            class51.field1155 = arg3;
            class134.field3267 = arg0;
            class61.field1343 = arg2;
        } else if (class87.field2102 == 0) {
            class87.method737(arg0, arg2, arg3, false);
        } else {
            class61.field1343 = arg2;
            class51.field1155 = arg3;
            class134.field3267 = arg0;
        }
        if (arg1 != 1) {
            method466((byte) 123);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V", line = 188)
    public static final void method462(int arg0, int arg1) {
        field1374++;
        if (!class21.method208(0, arg1)) {
            return;
        }
        class121[] var2 = class35.field828[arg1];
        int var3 = 0;
        if (arg0 > -74) {
            field1386 = null;
        }
        while (var3 < var2.length) {
            class121 var4 = var2[var3];
            if (var4 != null) {
                var4.field2954 = 0;
                var4.field2853 = 0;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)V", line = 220)
    public static final void method463(int arg0) {
        field1381++;
        class61 var1 = class2.field21;
        synchronized (class2.field21) {
            class77.field1861 = class42.field963;
            if (class26.field643 >= 0) {
                while (class89.field2128 != class26.field643) {
                    int var3 = class85.field2065[class89.field2128];
                    class89.field2128 = class89.field2128 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class19.field370[var3] = true;
                    } else {
                        class19.field370[~var3] = false;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class19.field370[var2] = false;
                }
                class26.field643 = class89.field2128;
            }
            class42.field963 = class76.field1779;
        }
        if (arg0 != 3116) {
            field1375 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILm;)V", line = 261)
    private final void method464(int arg0, int arg1, class77 arg2) {
        field1380++;
        if (arg1 != -27451) {
            this.field1372 = -53;
        }
        if (arg0 == 1) {
            this.field1372 = arg2.method636(106);
            this.field1376 = arg2.method620((byte) -8);
            this.field1379 = arg2.method620((byte) -8);
        }
    }

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V", line = 286)
    public static final void method465(int arg0) {
        class138.field3350.method941(10);
        field1373++;
        if (arg0 <= 46) {
            field1371 = 5;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V", line = 313)
    public static void method466(byte arg0) {
        field1386 = null;
        if (arg0 >= -4) {
            field1371 = -63;
        }
        field1375 = null;
        field1385 = null;
        field1382 = null;
    }
}
