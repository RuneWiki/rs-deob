import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class135 extends class199 {

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    private int field2457 = -32768;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    private int field2460 = 0;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    private int field2455 = -1;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "Z")
    public boolean field2462 = false;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    private int field2458 = 0;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public int field2467;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public int field2459;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public int field2451;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    private int field2454;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public int field2452;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public int field2463;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "Lek;")
    private class164 field2464;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Lid;")
    public static class149 field2450 = class60.method382("M", (byte) 60);

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Lid;")
    public static class149 field2453 = class60.method382("cookiehost", (byte) 46);

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "Lue;")
    private class88 field2461;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "[[[B")
    public static byte[][][] field2449;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2466++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZZ)V")
    public static final void method945(boolean arg0, boolean arg1) {
        class104.field1819 = arg1;
        if (class104.field1819) {
            int var2 = class11.field150.method531((byte) -88);
            int var3 = class11.field150.method531((byte) -88);
            int var4 = class11.field150.method522(128);
            int var5 = class11.field150.method531((byte) -88);
            class11.field150.method155(111);
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var22 = 0; var22 < 13; var22++) {
                    for (int var23 = 0; var23 < 13; var23++) {
                        int var24 = class11.field150.method154((byte) 9, 1);
                        if (var24 == 1) {
                            class184.field3319[var6][var22][var23] = class11.field150.method154((byte) 9, 26);
                        } else {
                            class184.field3319[var6][var22][var23] = -1;
                        }
                    }
                }
            }
            class11.field150.method159(0);
            int var7 = (class68.field1188 - class11.field150.field1340) / 16;
            class168.field3123 = new int[var7][4];
            for (int var8 = 0; var8 < var7; var8++) {
                for (int var21 = 0; var21 < 4; var21++) {
                    class168.field3123[var8][var21] = class11.field150.method510((byte) 77);
                }
            }
            int var9 = class11.field150.method485(-2386);
            class284.field5046 = new int[var7];
            class136.field2484 = null;
            class267.field4761 = new int[var7];
            class103.field1808 = new byte[var7][];
            class122.field2153 = new int[var7];
            class170.field3140 = null;
            class118.field2028 = new int[var7];
            class128.field2259 = new int[var7];
            class82.field1502 = new byte[var7][];
            int var10 = 0;
            for (int var11 = 0; var11 < 4; var11++) {
                for (int var12 = 0; var12 < 13; var12++) {
                    for (int var13 = 0; var13 < 13; var13++) {
                        int var14 = class184.field3319[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = (var14 & 0xFFCCA8) >> 14;
                            int var16 = (var14 & 0x3FFE) >> 3;
                            int var17 = (var15 / 8 << 8) + var16 / 8;
                            for (int var18 = 0; var18 < var10; var18++) {
                                if (class267.field4761[var18] == var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (var17 != -1) {
                                class267.field4761[var10] = var17;
                                int var19 = (var17 & 0xFFDF) >> 8;
                                int var20 = var17 & 0xFF;
                                class122.field2153[var10] = class221.field3874.method1550((byte) 12, class237.method1603(new class149[] { class277.field4950, class211.method1434(var19, true), class63.field1125, class211.method1434(var20, arg0) }, -109));
                                class118.field2028[var10] = class221.field3874.method1550((byte) -121, class237.method1603(new class149[] { class71.field1244, class211.method1434(var19, true), class63.field1125, class211.method1434(var20, arg0) }, -98));
                                class128.field2259[var10] = class221.field3874.method1550((byte) -122, class237.method1603(new class149[] { class149.field2704, class211.method1434(var19, arg0), class63.field1125, class211.method1434(var20, true) }, -95));
                                class284.field5046[var10] = class221.field3874.method1550((byte) 86, class237.method1603(new class149[] { class172.field3175, class211.method1434(var19, true), class63.field1125, class211.method1434(var20, true) }, -128));
                                var10++;
                            }
                        }
                    }
                }
            }
            class155.method1100(var4, var9, var2, 0, var3, var5, false);
        } else {
            int var25 = class11.field150.method484((byte) 22);
            int var26 = (class68.field1188 - class11.field150.field1340) / 16;
            class168.field3123 = new int[var26][4];
            for (int var27 = 0; var27 < var26; var27++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class168.field3123[var27][var37] = class11.field150.method510((byte) 86);
                }
            }
            int var28 = class11.field150.method522(128);
            int var29 = class11.field150.method485(-2386);
            int var30 = class11.field150.method484((byte) 22);
            int var31 = class11.field150.method484((byte) 22);
            class122.field2153 = new int[var26];
            class118.field2028 = new int[var26];
            class136.field2484 = null;
            class103.field1808 = new byte[var26][];
            class128.field2259 = new int[var26];
            class82.field1502 = new byte[var26][];
            class170.field3140 = null;
            boolean var32 = false;
            class284.field5046 = new int[var26];
            class267.field4761 = new int[var26];
            if (((var29 / 8) == 48 || var29 / 8 == 49) && var30 / 8 == 48) {
                var32 = true;
            }
            int var33 = 0;
            if (var29 / 8 == 48 && (var30 / 8) == 148) {
                var32 = true;
            }
            for (int var34 = (var29 - 6) / 8; var34 <= (var29 + 6) / 8; var34++) {
                for (int var35 = (var30 - 6) / 8; var35 <= ((var30 + 6) / 8); var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (var32 && var35 == 49 || var35 == 149 || var35 == 147 || var34 == 50 || !(var34 != 49 || var35 != 47)) {
                        class267.field4761[var33] = var36;
                        class122.field2153[var33] = -1;
                        class118.field2028[var33] = -1;
                        class128.field2259[var33] = -1;
                        class284.field5046[var33] = -1;
                    } else {
                        class267.field4761[var33] = var36;
                        class122.field2153[var33] = class221.field3874.method1550((byte) -114, class237.method1603(new class149[] { class277.field4950, class211.method1434(var34, true), class63.field1125, class211.method1434(var35, arg0) }, -111));
                        class118.field2028[var33] = class221.field3874.method1550((byte) -118, class237.method1603(new class149[] { class71.field1244, class211.method1434(var34, true), class63.field1125, class211.method1434(var35, arg0) }, -118));
                        class128.field2259[var33] = class221.field3874.method1550((byte) 113, class237.method1603(new class149[] { class149.field2704, class211.method1434(var34, true), class63.field1125, class211.method1434(var35, true) }, -122));
                        class284.field5046[var33] = class221.field3874.method1550((byte) -118, class237.method1603(new class149[] { class172.field3175, class211.method1434(var34, arg0), class63.field1125, class211.method1434(var35, true) }, -92));
                    }
                    var33++;
                }
            }
            class155.method1100(var28, var30, var25, 0, var29, var31, false);
        }
        field2448++;
        if (!arg0) {
            method945(false, false);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)Lnd;")
    private final class262 method946(byte arg0) {
        field2456++;
        int var2 = 56 % ((10 - arg0) / 32);
        class288 var3 = class200.method1374(-17177, this.field2454);
        class262 var4;
        if (this.field2462) {
            var4 = var3.method1972(-1, (byte) -44, 0, -1);
        } else {
            var4 = var3.method1972(this.field2455, (byte) -47, this.field2460, this.field2458);
        }
        return var4 == null ? null : var4;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIIJILue;)V")
    public final void method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class88 arg10) {
        field2468++;
        class262 var13 = this.method946((byte) -25);
        if (var13 != null) {
            var13.method54(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2461);
            this.field2457 = var13.method53();
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method947(int arg0) {
        field2453 = null;
        field2449 = null;
        if (arg0 == -1) {
            field2450 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V")
    public final void method948(int arg0, int arg1) {
        field2465++;
        if (this.field2462) {
            return;
        }
        if (arg1 > -114) {
            this.method49(-27, -59, 127, -96, -99);
        }
        this.field2460 += arg0;
        while (this.field2464.field3060[this.field2458] < this.field2460) {
            this.field2460 -= this.field2464.field3060[this.field2458];
            this.field2458++;
            if (this.field2458 >= this.field2464.field3035.length) {
                this.field2462 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()I")
    public final int method53() {
        field2469++;
        return this.field2457;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IIIIIII)V")
    public class135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2467 = arg2;
        this.field2459 = arg3;
        this.field2451 = arg1;
        this.field2454 = arg0;
        this.field2452 = arg4;
        this.field2463 = arg5 + arg6;
        int var8 = class200.method1374(-17177, this.field2454).field5130;
        if (var8 == -1) {
            this.field2462 = true;
        } else {
            this.field2462 = false;
            this.field2464 = class69.method436(var8, -32);
        }
    }
}
