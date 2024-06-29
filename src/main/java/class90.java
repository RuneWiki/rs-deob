import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class90 extends class136 {

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "I")
    public int field2345;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "I")
    private int field2332;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "[I")
    public int[] field2327;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "[[I")
    public int[][] field2339;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    public static int field2328 = 0;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    public static int field2335 = 0;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
    public static int field2336 = 0;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "Lpd;")
    private static class94 field2340 = class28.method249(41, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
    public static int field2338 = 0;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "Lpd;")
    public static class94 field2333 = field2340;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "I")
    public static int field2346 = 0;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "J")
    public static long field2331;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "Ls;")
    public static class111 field2329;

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "Lvc;")
    public static class128 field2350;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "Lme;")
    public static class77 field2326;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZI)V", line = 7)
    public static final void method670(int arg0, boolean arg1, int arg2) {
        field2348++;
        if (arg1) {
            method671(false, null, null);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 100; var4++) {
            if (class55.field1410[var4] != null) {
                int var5 = class82.field2110[var4];
                int var6 = class92.field2362 + 70 + 4 - var3 * 14;
                if (var6 < -20) {
                    break;
                }
                if (var5 == 0) {
                    var3++;
                }
                class94 var7 = class42.field1067[var4];
                if (var7 != null && var7.method686(-121, class17.field445)) {
                    var7 = var7.method687(5, -123);
                }
                if (var7 != null && var7.method686(-101, class46.field1122)) {
                    var7 = var7.method687(5, -123);
                }
                if ((var5 == 1 || var5 == 2) && (var5 == 1 || class97.field2473 == 0 || class97.field2473 == 1 && class2.method9(arg1, var7))) {
                    if (var6 - 14 < arg0 && var6 >= arg0 && !var7.method689((byte) 59, class80.field2044.field2295)) {
                        class81.field2064++;
                        class119.field2964++;
                        if (class73.field1784 >= 1) {
                            class97.method738(0, 0, class4.method20(new class94[] { class43.field1088, var7 }, !arg1), class127.field3194, 0, 14, -30801);
                            class92.field2351++;
                        }
                        class97.method738(0, 0, class4.method20(new class94[] { class43.field1088, var7 }, true), class119.field2949, 0, 37, -30801);
                        class97.method738(0, 0, class4.method20(new class94[] { class43.field1088, var7 }, !arg1), class52.field1307, 0, 32, -30801);
                    }
                    var3++;
                }
                if ((var5 == 3 || var5 == 7) && class4.field94 == 0 && (var5 == 7 || class102.field2569 == 0 || class102.field2569 == 1 && class2.method9(false, var7))) {
                    var3++;
                    if (var6 - 14 < arg0 && var6 >= arg0) {
                        class81.field2064++;
                        class119.field2964++;
                        if (class73.field1784 >= 1) {
                            class97.method738(0, 0, class4.method20(new class94[] { class43.field1088, var7 }, true), class127.field3194, 0, 14, -30801);
                            class92.field2351++;
                        }
                        class97.method738(0, 0, class4.method20(new class94[] { class43.field1088, var7 }, true), class119.field2949, 0, 37, -30801);
                        class97.method738(0, 0, class4.method20(new class94[] { class43.field1088, var7 }, !arg1), class52.field1307, 0, 32, -30801);
                    }
                }
                if (var5 == 4 && (class2.field58 == 0 || class2.field58 == 1 && class2.method9(false, var7))) {
                    var3++;
                    if (arg0 > var6 - 14 && var6 >= arg0) {
                        class97.method738(0, 0, class4.method20(new class94[] { class43.field1088, var7 }, true), class23.field601, 0, 57, -30801);
                        class27.field731++;
                    }
                }
                if ((var5 == 5 || var5 == 6) && class4.field94 == 0 && class102.field2569 < 2) {
                    var3++;
                }
                if (var5 == 8 && (class2.field58 == 0 || class2.field58 == 1 && class2.method9(arg1, var7))) {
                    if (var6 - 14 < arg0 && var6 >= arg0) {
                        class64.field1572++;
                        class97.method738(0, 0, class4.method20(new class94[] { class43.field1088, var7 }, !arg1), class115.field2924, 0, 50, -30801);
                    }
                    var3++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLpd;Luc;)I", line = 171)
    public static final int method671(boolean arg0, class94 arg1, class122 arg2) {
        int var3 = arg2.field3047;
        if (!arg0) {
            method676((byte) 52);
        }
        arg2.method931(-117, arg1.field2396);
        arg2.field3047 += class110.field2755.method170(arg2.field3047, arg1.field2396, arg2.field3074, arg1.field2382, 0, 1);
        field2337++;
        return arg2.field3047 - var3;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V", line = 208)
    public static void method672(byte arg0) {
        field2340 = null;
        field2350 = null;
        field2326 = null;
        if (arg0 != -65) {
            field2338 = 42;
        }
        field2333 = null;
        field2329 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V", line = 230)
    public static final void method673(int arg0, int arg1, int arg2) {
        field2344++;
        if (arg0 != 7928) {
            method671(true, null, null);
        }
        class119 var3 = class9.field243[class64.field1589][arg2][arg1];
        if (var3 == null) {
            class64.field1585.method193(class64.field1589, arg2, arg1);
            return;
        }
        class17 var4 = null;
        int var5 = -99999999;
        for (class17 var6 = (class17) var3.method895(-14156); var6 != null; var6 = (class17) var3.method893(true)) {
            class110 var11 = class39.method295(var6.field418, 1);
            int var12 = var11.field2725;
            if (var11.field2727 == 1) {
                var12 = (var6.field416 + 1) * var12;
            }
            if (var5 < var12) {
                var5 = var12;
                var4 = var6;
            }
        }
        if (var4 == null) {
            class64.field1585.method193(class64.field1589, arg2, arg1);
            return;
        }
        var3.method892(var4, (byte) 92);
        class17 var7 = (class17) var3.method895(-14156);
        class17 var8 = null;
        class17 var9 = null;
        while (var7 != null) {
            if (var4.field418 != var7.field418) {
                if (var8 == null) {
                    var8 = var7;
                }
                if (var7.field418 != var8.field418 && var9 == null) {
                    var9 = var7;
                }
            }
            var7 = (class17) var3.method893(true);
        }
        int var10 = (arg1 << 7) + arg2 + 1610612736;
        class64.field1585.method183(class64.field1589, arg2, arg1, class25.method226(class64.field1589, arg1 * 128 + 64, arg2 * 128 + 64, (byte) -98), var4, var10, var8, var9);
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V", line = 308)
    public static final void method674(int arg0) {
        class127.field3206 = null;
        class40.field1038 = null;
        class23.field599 = null;
        class107.field2671 = null;
        class6.field114 = null;
        class69.field1669 = null;
        if (arg0 != -24468) {
            return;
        }
        class98.field2488 = null;
        class121.field3018 = null;
        class63.field1543 = null;
        field2334++;
        class4.field97 = null;
        class12.field303 = null;
        class99.field2511 = null;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I[B)V", line = 354)
    public class90(int arg0, byte[] arg1) {
        this.field2345 = arg0;
        class122 var3 = new class122(arg1);
        this.field2332 = var3.method943(-1025);
        this.field2327 = new int[this.field2332];
        this.field2339 = new int[this.field2332][];
        for (int var4 = 0; var4 < this.field2332; var4++) {
            this.field2327[var4] = var3.method943(-1025);
        }
        for (int var5 = 0; var5 < this.field2332; var5++) {
            this.field2339[var5] = new int[var3.method943(-1025)];
        }
        for (int var6 = 0; var6 < this.field2332; var6++) {
            for (int var7 = 0; var7 < this.field2339[var6].length; var7++) {
                this.field2339[var6][var7] = var3.method943(-1025);
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIZI[B)V", line = 399)
    public static final void method675(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        field2347++;
        if (arg0 != 3599) {
            field2340 = null;
        }
        if (class39.field1017 == null) {
            return;
        }
        if (class86.field2194 >= 0) {
            arg1 -= 20;
            if (arg1 < 1) {
                arg1 = 1;
            }
            class4.field93 = arg1;
            if (class86.field2194 == 0) {
                class103.field2594 = 0;
            } else {
                int var5 = class2.method15(class86.field2194, false);
                int var6 = var5 - client.field490;
                class103.field2594 = (arg1 + var6 + 3599) / arg1;
            }
            class119.field2968 = arg3;
            class86.field2193 = arg2;
            class54.field1365 = arg4;
        } else if (class4.field93 == 0) {
            class113.method839(arg4, arg2, arg3, 75);
        } else {
            class86.field2193 = arg2;
            class119.field2968 = arg3;
            class54.field1365 = arg4;
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)V", line = 450)
    public static final void method676(byte arg0) {
        field2343++;
        if (arg0 >= -61) {
            field2330 = 114;
        }
        try {
            Graphics var1 = class128.field3218.getGraphics();
            class86.field2199.method498(4, 550, (byte) -12, var1);
        } catch (Exception var2) {
            class128.field3218.repaint();
        }
    }
}
