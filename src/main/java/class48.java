import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class48 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field986 = 0;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "Lth;")
    public static class55 field992 = new class55();

    @OriginalMember(owner = "client!r", name = "m", descriptor = "[[Z")
    public static boolean[][] field998 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!r", name = "o", descriptor = "Z")
    public static boolean field1000 = false;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field999 = 0;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public int field995;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "Lbm;")
    public static class307 field994;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "Lbm;")
    public static class307 field996;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "Ljava/awt/Image;")
    public Image field990;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "[I")
    public int[] field988;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "[[Lml;")
    public static class16[][] field1001;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 5)
    public static final void method367(int arg0) {
        class37.method289(-943652756, false);
        field991++;
        class31.field583 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class164.field2654.length; var2++) {
            if (class334.field5125[var2] != -1 && class164.field2654[var2] == null) {
                class164.field2654[var2] = class138.field2304.method2036(class334.field5125[var2], 0, (byte) 93);
                if (class164.field2654[var2] == null) {
                    class31.field583++;
                    var1 = false;
                }
            }
            if (class85.field1602[var2] != -1 && class72.field1502[var2] == null) {
                class72.field1502[var2] = class138.field2304.method2046(0, (byte) -95, class45.field934[var2], class85.field1602[var2]);
                if (class72.field1502[var2] == null) {
                    var1 = false;
                    class31.field583++;
                }
            }
            if (class249.field3893) {
                if (class18.field334[var2] != -1 && client.field905[var2] == null) {
                    client.field905[var2] = class138.field2304.method2036(class18.field334[var2], 0, (byte) 117);
                    if (client.field905[var2] == null) {
                        class31.field583++;
                        var1 = false;
                    }
                }
                if (class131.field2228[var2] != -1 && class218.field3458[var2] == null) {
                    class218.field3458[var2] = class138.field2304.method2036(class131.field2228[var2], 0, (byte) 23);
                    if (class218.field3458[var2] == null) {
                        class31.field583++;
                        var1 = false;
                    }
                }
            }
            if (class31.field626 != null && class292.field4474[var2] == null && class31.field626[var2] != -1) {
                class292.field4474[var2] = class138.field2304.method2046(0, (byte) -107, class45.field934[var2], class31.field626[var2]);
                if (class292.field4474[var2] == null) {
                    class31.field583++;
                    var1 = false;
                }
            }
        }
        if (class218.field3459 == null) {
            if (class241.field3765 == null || !class109.field1923.method2034(class241.field3765.field5030 + "_labels", -108)) {
                class218.field3459 = new class234(0);
            } else if (class109.field1923.method2049(class241.field3765.field5030 + "_labels", 4)) {
                class218.field3459 = class146.method946(class241.field3765.field5030 + "_labels", class109.field1923, true);
            } else {
                var1 = false;
                class31.field583++;
            }
        }
        if (!var1) {
            class84.field1593 = 1;
            return;
        }
        class264.field4102 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class164.field2654.length; var4++) {
            byte[] var5 = class72.field1502[var4];
            if (var5 != null) {
                int var6 = (class95.field1708[var4] >> 8) * 64 - class246.field3818;
                int var7 = (class95.field1708[var4] & 0xFF) * 64 - class101.field1769;
                if (class121.field2093) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class180.method1134(var6, var5, var7, (byte) -72);
            }
            if (class249.field3893) {
                byte[] var8 = class218.field3458[var4];
                if (var8 != null) {
                    int var9 = (class95.field1708[var4] >> 8) * 64 - class246.field3818;
                    int var10 = (class95.field1708[var4] & 0xFF) * 64 - class101.field1769;
                    if (class121.field2093) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class180.method1134(var9, var8, var10, (byte) 93);
                }
            }
        }
        if (!var3) {
            class84.field1593 = 2;
            return;
        }
        if (class84.field1593 != 0) {
            class188.method1200(false, class219.field3478 + "<br>(100%)", true);
        }
        class268.method1782(true);
        class188.method1198(-115);
        boolean var11 = false;
        if (class249.field3893 && class45.field926) {
            for (int var12 = 0; var12 < class164.field2654.length; var12++) {
                if (class218.field3458[var12] != null || client.field905[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class329.method2278(4, 104, 104, class249.field3893 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class326.field4990[var13].method216(-125);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class99.field1749[var14][var15][var16] = 0;
                }
            }
        }
        class344.method2386(-1, false);
        if (class249.field3893) {
            class60.field1171.method735();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class60.field1170[var17][var18].field1582 = true;
                }
            }
        }
        if (class249.field3893) {
            class310.method2077();
        }
        if (class249.field3893) {
            class296.method1981((byte) 26);
        }
        class268.method1782(true);
        System.gc();
        class37.method289(-943652756, true);
        class234.method1558(false, true);
        if (!class121.field2093) {
            class100.method661(false, -127);
            class37.method289(-943652756, true);
            if (class249.field3893) {
                int var19 = class66.field1265.field1899[0] >> 3;
                int var20 = class66.field1265.field1871[0] >> 3;
                class226.method1509((byte) -91, var20, var19);
            }
            class254.method1701(-114, false);
            if (class292.field4474 != null) {
                class186.method1187(122);
            }
        }
        if (class121.field2093) {
            class106.method689((byte) -109, false);
            class37.method289(-943652756, true);
            if (class249.field3893) {
                int var21 = class66.field1265.field1871[0] >> 3;
                int var22 = class66.field1265.field1899[0] >> 3;
                class226.method1509((byte) 10, var21, var22);
            }
            class62.method482(false, false);
        }
        class188.method1198(66);
        class37.method289(-943652756, true);
        class290.method1952(false, class121.field2093 ? class99.field1748 : (int[][][]) null, false, class326.field4990);
        if (class249.field3893) {
            class310.method2071();
        }
        class37.method289(-943652756, true);
        int var23 = class72.field1499;
        if (class289.field4438 < var23) {
            var23 = class289.field4438;
        }
        if (class289.field4438 - 1 > var23) {
            int var24 = class289.field4438 - 1;
        }
        if (class19.method127(-94)) {
            class199.method1270(0);
        } else {
            class199.method1270(class72.field1499);
        }
        class39.method309(-24430);
        if (class249.field3893 && var11) {
            class199.method1269(true);
            class234.method1558(true, true);
            if (!class121.field2093) {
                class100.method661(true, -120);
                class37.method289(-943652756, true);
                class254.method1701(-97, true);
            }
            if (class121.field2093) {
                class106.method689((byte) -109, true);
                class37.method289(-943652756, true);
                class62.method482(true, false);
            }
            class188.method1198(111);
            class37.method289(-943652756, true);
            class290.method1952(false, class121.field2093 ? class99.field1748 : (int[][][]) null, true, class326.field4990);
            class37.method289(-943652756, true);
            class39.method309(-24430);
            class199.method1269(false);
        }
        if (class249.field3893) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class60.field1170[var25][var26].method589(class45.field923[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class240.method1592(var27, 103, var28);
            }
        }
        class210.method1423((byte) -124);
        class268.method1782(true);
        class149.method972(0);
        class188.method1198(-112);
        int var29 = -34 % ((14 - arg0) / 48);
        class168.field2702 = false;
        if (class249.field3893) {
            class135.method884(true, (byte) -122);
        }
        if (class283.field4376 != null && class177.field2860 != null && class38.field730 == 25) {
            class141.field2327++;
            class14.field263.method80(155, (byte) 103);
            class14.field263.method1359(16705, 1057001181);
        }
        if (!class121.field2093) {
            int var30 = (class303.field4597 - 6) / 8;
            int var31 = (class14.field270 - 6) / 8;
            int var32 = (class303.field4597 + 6) / 8;
            int var33 = (class14.field270 + 6) / 8;
            for (int var34 = var30 - 1; var34 <= (var32 + 1); var34++) {
                for (int var35 = var31 - 1; var35 <= var33 + 1; var35++) {
                    if (var30 > var34 || var34 > var32 || var31 > var35 || var35 > var33) {
                        class138.field2304.method2035(true, "m" + var34 + "_" + var35);
                        class138.field2304.method2035(true, "l" + var34 + "_" + var35);
                    }
                }
            }
        }
        if (class38.field730 == 28) {
            class9.method79((byte) -101, 10);
        } else {
            class9.method79((byte) -101, 30);
            if (class177.field2860 != null) {
                class14.field263.method80(240, (byte) 115);
            }
        }
        class146.method954((byte) 17);
        class268.method1782(true);
        class204.method1367(false);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 507)
    public static void method368(byte arg0) {
        field994 = null;
        if (arg0 == -33) {
            field992 = null;
            field1001 = (class16[][]) null;
            field996 = null;
            field998 = (boolean[][]) null;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V", line = 525)
    public final void method369(byte arg0) {
        class270.method1805(this.field988, this.field995, this.field1002);
        field993++;
        if (arg0 != -19) {
            this.method264((Graphics) null, -72, 42, 25, 95, -24);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)V", line = 537)
    public static final void method370(int arg0, byte arg1) {
        class33.field668[1] = (float) (class61.method475(arg0, 65470) >> 8) / 255.0F;
        class33.field668[0] = (float) class61.method475(255, arg0 >> 16) / 255.0F;
        class33.field668[2] = (float) class61.method475(255, arg0) / 255.0F;
        class134.method875(3, -88);
        field989++;
        if (arg1 != 67) {
            method371((byte) 27, 110, -57, -126, 101);
        }
        class134.method875(4, -71);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BIIII)I", line = 558)
    public static final int method371(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field987++;
        if (arg0 == -104) {
            int var5 = 65536 - class284.field4398[arg1 * 1024 / arg2] >> 1;
            return ((65536 - var5) * arg4 >> 16) + (arg3 * var5 >> 16);
        } else {
            return -60;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 590)
    protected class48() {
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILjava/awt/Component;B)V")
    public abstract void method269(int arg0, int arg1, Component arg2, byte arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
    public abstract void method265(int arg0, Graphics arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method264(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
