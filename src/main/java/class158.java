import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class158 {

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public int field2295;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "[I")
    public static int[] field2293 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public static int field2302 = 100;

    @OriginalMember(owner = "client!to", name = "y", descriptor = "[S")
    public static short[] field2312 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!to", name = "m", descriptor = "Lgl;")
    public static class432 field2300 = new class432("", 12);

    @OriginalMember(owner = "client!to", name = "z", descriptor = "Lui;")
    public static class375 field2313 = new class375(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!to", name = "x", descriptor = "F")
    public static float field2311;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public int field2289;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    public int field2304;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "Lgb;")
    public class350 field2292;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "[I")
    public int[] field2290;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "[I")
    public int[] field2294;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "[I")
    public int[] field2297;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "[I")
    public int[] field2306;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "[I")
    public int[] field2307;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "[I")
    public int[] field2310;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "[Lgb;")
    public class350[] field2298;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "[[I")
    public int[][] field2308;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "[[I")
    public int[][] field2309;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILns;)V", line = 4)
    public static final void method1026(int arg0, class438 arg1) {
        class394.field5989 = arg1.method2652("p11_full", 70);
        field2305++;
        class66.field917 = arg1.method2652("p12_full", 119);
        int var2 = -6 / ((arg0 - 68) / 45);
        class14.field238 = arg1.method2652("b12_full", -110);
        class391.field5942 = arg1.method2652("hitmarks", 124);
        class453.field6658 = arg1.method2652("hitbar_default", -106);
        class14.field243 = arg1.method2652("timerbar_default", -104);
        class408.field6163 = arg1.method2652("headicons_pk", -118);
        class272.field3782 = arg1.method2652("headicons_prayer", -68);
        class262.field3647 = arg1.method2652("hint_headicons", 92);
        class211.field2974 = arg1.method2652("hint_mapmarkers", 108);
        class115.field1597 = arg1.method2652("mapflag", -68);
        class82.field1095 = arg1.method2652("cross", -96);
        class398.field6056 = arg1.method2652("mapdots", -110);
        class495.field7240 = arg1.method2652("scrollbar", 103);
        class150.field2165 = arg1.method2652("name_icons", -99);
        class167.field2430 = arg1.method2652("floorshadows", -100);
        class199.field2816 = arg1.method2652("compass", -79);
        class526.field7774 = arg1.method2652("otherlevel", 104);
        class33.field524 = arg1.method2652("hint_mapedge", 110);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIZZ)V", line = 32)
    public static final void method1027(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class386.field5882 = arg0;
        class215.field2995 = 0x1 << class386.field5882;
        class380.field5804 = class215.field2995 >> 1;
        class440.field6551 = (int) Math.sqrt((double) (class380.field5804 * class380.field5804 + class380.field5804 * class380.field5804));
        class276.field3828 = class215.field2995 >> 2;
        class386.field5880 = class215.field2995;
        class492.field7186 = arg2;
        class285.field4248 = arg3;
        class75.field1021 = arg4;
        class492.field7181 = new class420[arg1][class492.field7186][class285.field4248];
        class204.field2871 = new class206[arg1];
        if (arg5) {
            class202.field2843 = new int[class492.field7186][class285.field4248];
            class482.field7024 = new byte[class492.field7186][class285.field4248];
            class518.field7684 = new byte[class492.field7186][class285.field4248];
            class483.field7028 = new class420[1][class492.field7186][class285.field4248];
            class187.field2632 = new class206[1];
        } else {
            class202.field2843 = null;
            class482.field7024 = null;
            class518.field7684 = null;
            class483.field7028 = null;
            class187.field2632 = null;
        }
        if (arg6) {
            class467.field6805 = new long[arg1][arg2][arg3];
            class515.field7632 = new class138[65535];
            class473.field6909 = new boolean[65535];
            class309.field4630 = 0;
        } else {
            class467.field6805 = null;
            class515.field7632 = null;
            class473.field6909 = null;
            class309.field4630 = 0;
        }
        class439.method2655(false);
        class313.field4787 = new class367[1000];
        class399.field6089 = 0;
        class103.field1464 = new class367[1000];
        class323.field4986 = 0;
        class470.field6873 = new int[arg1][class492.field7186 + 1][class285.field4248 + 1];
        class232.field3295 = new class153[5000];
        class494.field7230 = 0;
        class11.field171 = new boolean[class75.field1021 + class75.field1021 + 1][class75.field1021 + class75.field1021 + 1];
        class25.field408 = new boolean[class75.field1021 + class75.field1021 + 2][class75.field1021 + class75.field1021 + 2];
        class307.field4503 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "([BB)V", line = 90)
    private final void method1028(byte[] arg0, byte arg1) {
        field2291++;
        class91 var3 = new class91(class422.method2538(false, arg0));
        int var4 = var3.method618((byte) 100);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field2299 = 0;
        } else {
            this.field2299 = var3.method626((byte) 100);
        }
        int var5 = var3.method618((byte) 100);
        this.field2289 = var3.method631(10494);
        if (arg1 != 31) {
            method1029((byte) 123);
        }
        int var6 = 0;
        int var7 = -1;
        this.field2294 = new int[this.field2289];
        for (int var8 = 0; var8 < this.field2289; var8++) {
            this.field2294[var8] = var6 += var3.method631(10494);
            if (var7 < this.field2294[var8]) {
                var7 = this.field2294[var8];
            }
        }
        this.field2304 = var7 + 1;
        this.field2297 = new int[this.field2304];
        this.field2310 = new int[this.field2304];
        this.field2290 = new int[this.field2304];
        this.field2308 = new int[this.field2304][];
        this.field2306 = new int[this.field2304];
        if (var5 != 0) {
            this.field2307 = new int[this.field2304];
            for (int var9 = 0; var9 < this.field2304; var9++) {
                this.field2307[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field2289; var10++) {
                this.field2307[this.field2294[var10]] = var3.method626((byte) 100);
            }
            this.field2292 = new class350(this.field2307);
        }
        for (int var11 = 0; var11 < this.field2289; var11++) {
            this.field2290[this.field2294[var11]] = var3.method626((byte) 100);
        }
        for (int var12 = 0; var12 < this.field2289; var12++) {
            this.field2310[this.field2294[var12]] = var3.method626((byte) 100);
        }
        for (int var13 = 0; var13 < this.field2289; var13++) {
            this.field2297[this.field2294[var13]] = var3.method631(arg1 + 10463);
        }
        for (int var14 = 0; var14 < this.field2289; var14++) {
            int var21 = this.field2294[var14];
            int var22 = 0;
            int var23 = this.field2297[var21];
            int var24 = -1;
            this.field2308[var21] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field2308[var21][var25] = var22 += var3.method631(10494);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field2306[var21] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field2308[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field2309 = new int[var7 + 1][];
        this.field2298 = new class350[var7 + 1];
        for (int var15 = 0; var15 < this.field2289; var15++) {
            int var16 = this.field2294[var15];
            int var17 = this.field2297[var16];
            this.field2309[var16] = new int[this.field2306[var16]];
            for (int var18 = 0; var18 < this.field2306[var16]; var18++) {
                this.field2309[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field2308[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field2308[var16][var19];
                }
                this.field2309[var16][var20] = var3.method626((byte) 100);
            }
            this.field2298[var16] = new class350(this.field2309[var16]);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V", line = 269)
    public static void method1029(byte arg0) {
        if (arg0 != -50) {
            method1031(67, (byte) -24, -79, -71);
        }
        field2312 = null;
        field2300 = null;
        field2313 = null;
        field2293 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lhu;ILjava/awt/Frame;)V", line = 283)
    public static final void method1030(class469 arg0, int arg1, Frame arg2) {
        while (true) {
            class125 var3 = arg0.method2812(false, arg2);
            while (var3.field1791 == 0) {
                class106.method710(10L, (byte) 6);
            }
            if (var3.field1791 == 1) {
                field2303++;
                arg2.setVisible(false);
                if (arg1 != 0) {
                    field2311 = 1.0008553F;
                }
                arg2.dispose();
                return;
            }
            class106.method710(100L, (byte) 6);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IBII)V", line = 311)
    public static final void method1031(int arg0, byte arg1, int arg2, int arg3) {
        field2301++;
        if (class380.field5802 == null) {
            return;
        }
        long var4 = (long) (arg2 | arg3 << 14 | arg0 << 28);
        class481 var6 = (class481) class392.field5964.method943(var4, -1);
        if (var6 == null) {
            class69.method474(arg0, arg2, arg3);
            return;
        }
        class251 var7 = (class251) var6.field7021.method1970(64);
        if (var7 == null) {
            class69.method474(arg0, arg2, arg3);
            return;
        }
        class459 var8 = (class459) class69.method474(arg0, arg2, arg3);
        if (var8 == null) {
            var8 = new class459();
        } else {
            var8.field6741 = var8.field6738 = -1;
        }
        if (arg1 >= -5) {
            field2312 = null;
        }
        var8.field6733 = var7.field3476;
        var8.field6740 = var7.field3474;
        label48: while (true) {
            class251 var9 = (class251) var6.field7021.method1960(24);
            if (var9 == null) {
                break;
            }
            if (var8.field6733 != var9.field3476) {
                var8.field6741 = var9.field3476;
                var8.field6735 = var9.field3474;
                while (true) {
                    class251 var10 = (class251) var6.field7021.method1960(24);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field6733 != var10.field3476 && var8.field6741 != var10.field3476) {
                        var8.field6738 = var10.field3476;
                        var8.field6737 = var10.field3474;
                    }
                }
            }
        }
        int var11 = class500.method2985((arg2 << 7) + 64, 5293, arg0, (arg3 << 7) + 64);
        class423.method2550(arg0, arg2, arg3, var11, var8);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lcw;ILqa;)I", line = 391)
    public static final int method1032(class95 arg0, int arg1, class496 arg2) {
        if (arg1 != 6) {
            method1027(-4, -124, 8, -73, 71, true, true);
        }
        field2296++;
        if (arg0.field1374 != -1) {
            return arg0.field1374;
        }
        if (arg0.field1385 != -1) {
            class263 var3 = arg2.field7256.method1558(arg2.method1132() ? arg0.field1385 : arg0.field1386, (byte) 109);
            if (!var3.field3665) {
                return var3.field3668;
            }
        }
        return arg0.field1375;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "([BI)V", line = 443)
    public class158(byte[] arg0, int arg1) {
        this.field2295 = class353.method2232(arg0.length, 0, arg0);
        if (this.field2295 != arg1) {
            throw new RuntimeException();
        }
        this.method1028(arg0, (byte) 31);
    }
}
