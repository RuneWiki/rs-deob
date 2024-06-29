import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class254 extends class248 {

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "Lra;")
    public class40 field4392;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "Lij;")
    public static class50 field4387 = class78.method578(125, ")1p");

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "[I")
    public static int[] field4389 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public static int field4393 = -1;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Lkh;")
    public static class247 field4388 = new class247();

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "Lij;")
    public static class50 field4396 = class78.method578(124, "<col=ff7000>");

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "[[[I")
    public static int[][][] field4390;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZLce;)V")
    public static final void method1716(int arg0, boolean arg1, class10 arg2) {
        field4395++;
        int var3 = arg2.field138 == 0 ? arg2.field243 : arg2.field138;
        int var4 = arg2.field292 == 0 ? arg2.field242 : arg2.field292;
        class189.method1276((byte) -20, arg2.field155, var3, class137.field2380[arg2.field155 >> 16], var4, arg1);
        if (arg2.field297 != null) {
            class189.method1276((byte) -20, arg2.field155, var3, arg2.field297, var4, arg1);
        }
        if (arg0 != 827759824) {
            field4387 = null;
        }
        class87 var5 = (class87) class132.field2304.method443((long) arg2.field155, (byte) 105);
        if (var5 != null) {
            class197.method1323(128, var3, var5.field1678, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Z")
    public static final boolean method1717(byte arg0) {
        field4384++;
        if (class219.field3661 != 0) {
            try {
                class126.field2209.method378(class186.field3058.field2408, 102);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 >= -42) {
            field4387 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
    public static final void method1718(int arg0) {
        field4386++;
        if (arg0 != 50) {
            method1721((byte) -102, (byte[]) null);
        }
        while (true) {
            class86 var1 = class129.field2259;
            class124 var2;
            synchronized (class129.field2259) {
                var2 = (class124) class78.field1447.method679((byte) -94);
            }
            if (var2 == null) {
                return;
            }
            var2.field2169.method162((int) var2.field635, var2.field2179, false, -1, var2.field2182);
        }
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V")
    public static final void method1719(int arg0) {
        field4385++;
        if (class86.field1654 == null) {
            return;
        }
        if (class223.field3762 < 10) {
            if (!class37.field715.method168(1, class86.field1654)) {
                class223.field3762 = class37.field715.method167(126, class86.field1654) / 10;
                return;
            }
            class82.method598(124);
            class223.field3762 = 10;
        }
        if (class223.field3762 == 10) {
            class217 var1 = new class217(class37.field715.method181(class86.field1654, arg0 ^ 0xCEA96336, class96.field1796));
            int var2 = var1.method1441(arg0 - 827759704);
            int var3 = var1.method1441(116);
            int var4 = var1.method1441(127);
            int var5 = var1.method1441(-114);
            int var6 = var1.method1441(arg0 - 827759846);
            int var7 = var1.method1441(92);
            class46.field847 = var3 * 64;
            int var8 = (class239.field4067.field4027 >> 7) + field4394 - class46.field847;
            class155.field2701 = (var4 + 1 - var2) * 64;
            class140.field2460 = (var5 + 1 - var3) * 64;
            class2.field20 = 8.0D;
            class252.field4369 = 8.0D;
            int var9 = var8 + ((int) (Math.random() * 10.0D) - 5);
            class90.field1714 = var2 * 64;
            int var10 = (class239.field4067.field3990 >> 7) + class61.field1124 - class90.field1714;
            int var11 = var10 + ((int) (Math.random() * 10.0D) - 5);
            if (var11 >= 0 && var11 < class155.field2701 && var9 >= 0 && var9 < class140.field2460) {
                class215.field3559 = var11;
                class222.field3744 = class140.field2460 - var9;
            } else {
                class222.field3744 = class46.field847 + class140.field2460 - (var7 * 64);
                class215.field3559 = var6 * 64 - class90.field1714;
            }
            class125.method899(-1);
            int var12 = class52.field947 >> 2 << 10;
            int var13 = class155.field2701 >> 6;
            int var14 = class140.field2460 >> 6;
            class84.field1624 = new byte[var13][var14][];
            class153.field2679 = new byte[var13][var14][];
            class201.field3311 = new int[class235.field3930 + 1];
            class203.field3374 = new byte[var13][var14][];
            class161.field2766 = new byte[var13][var14][];
            class210.field3483 = new int[var13][var14][];
            class250.field4332 = new byte[var13][var14][];
            class237.field4012 = new byte[var13][var14][];
            int var15 = class49.field876 >> 1;
            class184.field3024 = new int[var13][var14][];
            for (int var16 = 0; var16 < class235.field3930; var16++) {
                class3 var17 = class106.method797(var16, 6);
                if (var17 != null) {
                    int var18 = var17.field40;
                    if (var18 >= 0 && !class13.field309.method544(83, var18)) {
                        var18 = -1;
                    }
                    int var22;
                    if (var17.field45 >= 0) {
                        int var19 = var17.field45;
                        int var20 = (var19 & 0x7F) + var15;
                        if (var20 < 0) {
                            var20 = 0;
                        } else if (var20 > 127) {
                            var20 = 127;
                        }
                        int var21 = (var12 + var19 & 0xFC00) + (var19 & 0x380) + var20;
                        var22 = class13.field321[class161.method1131(-3, var21, 96)];
                    } else if (var18 >= 0) {
                        var22 = class13.field321[class161.method1131(-3, class13.field309.method545(arg0 ^ -827755007, var18), 96)];
                    } else if (var17.field49 == -1) {
                        var22 = -1;
                    } else {
                        int var23 = var17.field49;
                        int var24 = (var23 & 0x7F) + var15;
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 > 127) {
                            var24 = 127;
                        }
                        int var25 = (var12 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                        var22 = class13.field321[class161.method1131(-3, var25, 96)];
                    }
                    class201.field3311[var16 + 1] = var22;
                }
            }
            class223.field3762 = 20;
            return;
        }
        if (arg0 != 827759824) {
            field4396 = null;
        }
        if (class223.field3762 == 20) {
            class256.method1728((byte) 68, class37.field715.method181(class86.field1654, arg0 ^ 0x31569CFB, class153.field2682));
            class223.field3762 = 30;
            class225.method1538(true, (byte) 81);
            class97.method733((byte) 44);
        } else if (class223.field3762 == 30) {
            class36.method288(class37.field715.method181(class86.field1654, -15, class5.field63), (byte) -122);
            class223.field3762 = 40;
            class97.method733((byte) 30);
        } else if (class223.field3762 == 40) {
            class24.method235(true, class37.field715.method181(class86.field1654, -123, class8.field123));
            class223.field3762 = 50;
            class97.method733((byte) 127);
        } else if (class223.field3762 == 50) {
            class227.method1552((byte) -19, class37.field715.method181(class86.field1654, 49, class51.field942));
            class223.field3762 = 60;
            class225.method1538(true, (byte) 81);
            class97.method733((byte) 48);
        } else if (class223.field3762 == 60) {
            class258.method1735(arg0 - 827759921, class37.field715.method181(class86.field1654, arg0 ^ 0x31569CBB, class182.field2998));
            class223.field3762 = 70;
            class97.method733((byte) 25);
        } else if (class223.field3762 == 70) {
            class25.field546 = new class143(11, true, class228.field3834);
            class223.field3762 = 73;
            class225.method1538(true, (byte) 81);
            class97.method733((byte) 36);
        } else if (class223.field3762 == 73) {
            class206.field3422 = new class143(12, true, class228.field3834);
            class223.field3762 = 76;
            class225.method1538(true, (byte) 81);
            class97.method733((byte) 58);
        } else if (class223.field3762 == 76) {
            class24.field531 = new class143(14, true, class228.field3834);
            class223.field3762 = 79;
            class225.method1538(true, (byte) 81);
            class97.method733((byte) 84);
        } else if (class223.field3762 == 79) {
            class221.field3707 = new class143(17, true, class228.field3834);
            class223.field3762 = 82;
            class225.method1538(true, (byte) 81);
            class97.method733((byte) 8);
        } else if (class223.field3762 == 82) {
            class41.field750 = new class143(19, true, class228.field3834);
            class223.field3762 = 85;
            class225.method1538(true, (byte) 81);
            class97.method733((byte) 104);
        } else if (class223.field3762 == 85) {
            class199.field3285 = new class143(22, true, class228.field3834);
            class223.field3762 = 88;
            class225.method1538(true, (byte) 81);
            class97.method733((byte) 109);
        } else if (class223.field3762 == 88) {
            class236.field3964 = new class143(26, true, class228.field3834);
            class223.field3762 = 91;
            class225.method1538(true, (byte) 81);
            class97.method733((byte) 47);
        } else {
            class209.field3468 = new class143(30, true, class228.field3834);
            class223.field3762 = 100;
            class225.method1538(true, (byte) 81);
            class97.method733((byte) 93);
            field4393 = -1;
            class142.field2484 = -1;
            System.gc();
        }
    }

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "(I)V")
    public static void method1720(int arg0) {
        field4396 = null;
        if (arg0 > -86) {
            field4390 = null;
        }
        field4389 = null;
        field4388 = null;
        field4390 = null;
        field4387 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B[B)Lqj;")
    public static final class152 method1721(byte arg0, byte[] arg1) {
        field4391++;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = -63 / ((arg0 + 55) / 42);
            class38 var3 = new class38(arg1, class20.field421, class2.field27, class46.field836, class164.field2805, class31.field628);
            class261.method1759(true);
            return var3;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lra;)V")
    public class254(class40 arg0) {
        this.field4392 = arg0;
    }
}
