import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class23 {

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public int field294 = -1;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "[Z")
    public static boolean[] field301 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "Llm;")
    public static class347 field306;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "Lvk;")
    private class56 field311;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Ljava/lang/String;")
    private String field300;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "Ljava/lang/String;")
    private String field317;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "[I")
    private int[] field293;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "[I")
    private int[] field296;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "[I")
    private int[] field297;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "[I")
    private int[] field298;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "[I")
    private int[] field309;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "[I")
    private int[] field313;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "[I")
    private int[] field314;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "[I")
    private int[] field316;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "[Ljava/lang/String;")
    private String[] field299;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "[Ljava/lang/String;")
    private String[] field307;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "[[I")
    private int[][] field308;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "[[I")
    private int[][] field310;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "[[I")
    private int[][] field318;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "[[[I")
    public static int[][][] field304;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILnj;)V", line = 15)
    private final void method150(int arg0, int arg1, class228 arg2) {
        if (~arg0 == arg1) {
            this.field317 = arg2.method1373(-25706);
        } else if (arg0 == 2) {
            this.field300 = arg2.method1373(-25706);
        } else if (arg0 == 3) {
            int var22 = arg2.method1348(-97);
            this.field310 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field310[var23][0] = arg2.method1343(255);
                this.field310[var23][1] = arg2.method1344((byte) 51);
                this.field310[var23][2] = arg2.method1344((byte) 92);
            }
        } else if (arg0 == 4) {
            int var20 = arg2.method1348(-111);
            this.field318 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field318[var21][0] = arg2.method1343(255);
                this.field318[var21][1] = arg2.method1344((byte) 118);
                this.field318[var21][2] = arg2.method1344((byte) 112);
            }
        } else if (arg0 == 5) {
            arg2.method1343(255);
        } else if (arg0 == 6) {
            arg2.method1348(arg1 ^ 0x74);
        } else if (arg0 == 7) {
            arg2.method1348(arg1 - 91);
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg2.method1348(-116);
            } else if (arg0 == 10) {
                int var18 = arg2.method1348(-107);
                this.field297 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field297[var19] = arg2.method1344((byte) 123);
                }
            } else if (arg0 == 12) {
                arg2.method1344((byte) 123);
            } else if (arg0 == 13) {
                int var4 = arg2.method1348(-89);
                this.field314 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field314[var5] = arg2.method1343(255);
                }
            } else if (arg0 == 14) {
                int var16 = arg2.method1348(-113);
                this.field308 = new int[var16][2];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field308[var17][0] = arg2.method1348(class399.method2571(arg1, 87));
                    this.field308[var17][1] = arg2.method1348(-124);
                }
            } else if (arg0 == 15) {
                arg2.method1343(255);
            } else if (arg0 == 17) {
                this.field294 = arg2.method1343(255);
            } else if (arg0 == 18) {
                int var6 = arg2.method1348(arg1 - 100);
                this.field309 = new int[var6];
                this.field299 = new String[var6];
                this.field296 = new int[var6];
                this.field313 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field313[var7] = arg2.method1344((byte) 98);
                    this.field296[var7] = arg2.method1344((byte) 115);
                    this.field309[var7] = arg2.method1344((byte) 56);
                    this.field299[var7] = arg2.method1329(991328496);
                }
            } else if (arg0 == 19) {
                int var8 = arg2.method1348(arg1 - 113);
                this.field307 = new String[var8];
                this.field298 = new int[var8];
                this.field316 = new int[var8];
                this.field293 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field298[var9] = arg2.method1344((byte) 100);
                    this.field293[var9] = arg2.method1344((byte) 59);
                    this.field316[var9] = arg2.method1344((byte) 82);
                    this.field307[var9] = arg2.method1329(991328496);
                }
            } else if (arg0 == 249) {
                int var10 = arg2.method1348(-115);
                if (this.field311 == null) {
                    int var11 = class139.method896(var10, -80);
                    this.field311 = new class56(var11);
                }
                for (int var12 = 0; var12 < var10; var12++) {
                    boolean var13 = arg2.method1348(-95) == 1;
                    int var14 = arg2.method1333((byte) -112);
                    class45 var15;
                    if (var13) {
                        var15 = new class134(arg2.method1329(991328496));
                    } else {
                        var15 = new class279(arg2.method1344((byte) 117));
                    }
                    this.field311.method381(true, var15, (long) var14);
                }
            }
        }
        field303++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)Lni;", line = 242)
    public static final class246 method151(byte arg0) {
        field292++;
        if (class293.field4180 == null || class331.field4813 == null) {
            return null;
        }
        for (class246 var1 = (class246) class331.field4813.method1097((byte) 94); var1 != null; var1 = (class246) class331.field4813.method1097((byte) 102)) {
            class7 var2 = class99.method674(36, var1.field3323);
            if (var2 != null && var2.field106 && var2.method50(-28047)) {
                return var1;
            }
        }
        if (arg0 >= -94) {
            field304 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lnj;I)V", line = 271)
    public final void method152(class228 arg0, int arg1) {
        if (arg1 != 8912) {
            method153(125);
        }
        while (true) {
            int var3 = arg0.method1348(-104);
            if (var3 == 0) {
                field295++;
                return;
            }
            this.method150(var3, -2, arg0);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 292)
    public static void method153(int arg0) {
        field301 = null;
        field306 = null;
        field304 = null;
        if (arg0 != -1412584499) {
            method153(-110);
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 304)
    public static final void method154(int arg0) {
        field315++;
        int var1 = class395.field5833.length;
        int var2 = 0;
        if (arg0 != 2034913891) {
            method154(4);
        }
        while (var2 < var1) {
            if (class395.field5833[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class28.field415; var4++) {
                    if (class362.field5223[var4] == class147.field2015[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class362.field5223[class28.field415] = class147.field2015[var2];
                    var3 = class28.field415++;
                }
                class228 var5 = new class228(class395.field5833[var2]);
                int var6 = 0;
                while (class395.field5833[var2].length > var5.field3029 && var6 < 511 && class198.field2637 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1343(arg0 - 2034913636);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class147.field2015[var2] >> 8) * 64 + var10 - class7.field138;
                    int var13 = (class147.field2015[var2] & 0xFF) * 64 + var11 - class200.field2660;
                    class249 var14 = class119.method771((byte) 108, var5.method1343(255));
                    if (class306.field4496[var7] == null && (var14.field3390 & 0x1) > 0 && class200.field2661 == var9 && var12 >= 0 && class192.field2574 > (var14.field3363 + var12) && var13 >= 0 && (var14.field3363 + var13) < class364.field5262) {
                        class306.field4496[var7] = new class43();
                        class306.field4496[var7].field4301 = var7;
                        class43 var15 = class306.field4496[var7];
                        class398.field5938[class198.field2637++] = var7;
                        var15.field4342 = class28.field418;
                        var15.method306(0, var14);
                        var15.method2037(-109, var15.field606.field3363);
                        var15.field4271 = var15.field606.field3408 << 3;
                        if (var15.field4271 == 0) {
                            var15.method2047(0, (byte) -122);
                        } else {
                            var15.method2047(class362.field5232[var15.field606.field3405 - 1], (byte) -123);
                        }
                        var15.method2035(true, var13, var12, var15.method168(-126), (byte) -97, var9);
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V", line = 439)
    public final void method155(int arg0) {
        if (arg0 != 2) {
            this.method150(84, 122, (class228) null);
        }
        if (this.field300 == null) {
            this.field300 = this.field317;
        }
        field302++;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V", line = 458)
    public static final void method156(int arg0) {
        if (arg0 != 3) {
            return;
        }
        class377.field5488 = null;
        field312++;
        class34.method226(-1, class138.field1907, 0, 0, 0, class329.field4790, 80, 0, class92.field1294);
        if (class377.field5488 != null) {
            class63.method440(0, 67, class397.field5910, class179.field2370.field5759, class377.field5488, class173.field2310, 0, class138.field1907, class92.field1294, -1412584499);
            class377.field5488 = null;
        }
    }
}
