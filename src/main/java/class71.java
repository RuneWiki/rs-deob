import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class71 {

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "Lmq;")
    private class472 field1081 = new class472(64);

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "Ljn;")
    private class668 field1082;

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "[I")
    public static int[] field1078 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BI)Laf;")
    public final class402 method630(byte arg0, int arg1) {
        field1077++;
        class472 var3 = this.field1081;
        class402 var4;
        synchronized (this.field1081) {
            var4 = (class402) this.field1081.method2766(-128, (long) arg1);
            if (arg0 != 103) {
                this.field1079 = 26;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class668 var5 = this.field1082;
        byte[] var6;
        synchronized (this.field1082) {
            var6 = this.field1082.method3800(arg1, 19, (byte) -92);
        }
        class402 var7 = new class402();
        if (var6 != null) {
            var7.method2427(7957, new class389(var6));
        }
        class472 var8 = this.field1081;
        synchronized (this.field1081) {
            this.field1081.method2772(var7, true, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIZ)I")
    public static final int method631(int arg0, int arg1, int arg2, boolean arg3) {
        field1083++;
        class122 var4 = class673.method3829(1, arg3, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg0 <= arg1 && var4.field1572.length > arg1) {
            return var4.field1572[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IZLdc;)V")
    public static final void method632(int arg0, boolean arg1, class5 arg2) {
        field1080++;
        boolean var3 = arg2.method25(1, 255) == 1;
        if (var3) {
            class700.field9908[class677.field9699++] = arg0;
        }
        int var4 = arg2.method25(2, 255);
        if (!arg1) {
            return;
        }
        class613 var5 = class184.field2252[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field8783 = false;
            } else if (class63.field1016 == arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class19 var6 = class195.field2364[arg0] = new class19();
                var6.field521 = (var5.field2689[0] + class36.field689 >> 6 << 14) + ((var5.field532 << 28) + (var5.field2686[0] + class88.field1239 >> 6));
                if (var5.field8796 == -1) {
                    var6.field520 = var5.field2588.method3060(16383);
                } else {
                    var6.field520 = var5.field8796;
                }
                var6.field516 = var5.field2628;
                var6.field519 = var5.field8782;
                if (var5.field8788 > 0) {
                    class564.method3300(-1, var5);
                }
                class184.field2252[arg0] = null;
                if (arg2.method25(1, 255) != 0) {
                    class19.method332(arg0, arg2, (byte) -67);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg2.method25(3, 255);
            int var8 = var5.field2689[0];
            int var9 = var5.field2686[0];
            if (var7 == 0) {
                var9--;
                var8--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field8783 = true;
                var5.field8789 = var8;
                var5.field8781 = var9;
            } else {
                var5.method3516(11, var9, var8, class468.field6541[arg0]);
            }
        } else if (var4 == 2) {
            int var10 = arg2.method25(4, 255);
            int var11 = var5.field2689[0];
            int var12 = var5.field2686[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var11 += 2;
                var12 -= 2;
            } else if (var10 == 5) {
                var11 -= 2;
                var12--;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field8783 = true;
                var5.field8789 = var11;
                var5.field8781 = var12;
            } else {
                var5.method3516(-47, var12, var11, class468.field6541[arg0]);
            }
        } else {
            int var13 = arg2.method25(1, 255);
            if (var13 == 0) {
                int var14 = arg2.method25(12, 255);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3F3) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field2689[0] + var16;
                int var19 = var5.field2686[0] + var17;
                if (var3) {
                    var5.field8781 = var19;
                    var5.field8783 = true;
                    var5.field8789 = var18;
                } else {
                    var5.method3516(-29, var19, var18, class468.field6541[arg0]);
                }
                var5.field532 = var5.field535 = (byte) (var5.field532 + var15 & 0x3);
                if (class626.method3602(var18, var19, (byte) 30)) {
                    var5.field535++;
                }
                if (class63.field1016 == arg0) {
                    class617.field8853 = var5.field532;
                }
            } else {
                int var20 = arg2.method25(30, 255);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (class36.field689 + var22 + var5.field2689[0] & 0x3FFF) - class36.field689;
                int var25 = (var5.field2686[0] + class88.field1239 + var23 & 0x3FFF) - class88.field1239;
                if (var3) {
                    var5.field8781 = var25;
                    var5.field8789 = var24;
                    var5.field8783 = true;
                } else {
                    var5.method3516(-72, var25, var24, class468.field6541[arg0]);
                }
                var5.field532 = var5.field535 = (byte) (var5.field532 + var21 & 0x3);
                if (class626.method3602(var24, var25, (byte) 80)) {
                    var5.field535++;
                }
                if (class63.field1016 == arg0) {
                    class617.field8853 = var5.field532;
                }
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(II)V")
    public static final void method633(int arg0, int arg1) {
        field1084++;
        if (!class62.method607((byte) -106, arg0)) {
            return;
        }
        int var2 = -83 / ((arg1 - 60) / 46);
        class17[] var3 = class516.field7555[arg0];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class17 var5 = var3[var4];
            if (var5 != null) {
                var5.field444 = 0;
                var5.field385 = 0;
                var5.field415 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Z)V")
    public static void method634(boolean arg0) {
        field1078 = null;
        if (!arg0) {
            field1078 = null;
        }
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Ler;ILjn;)V")
    public class71(class90 arg0, int arg1, class668 arg2) {
        this.field1082 = arg2;
        this.field1079 = this.field1082.method3805(19, false);
    }
}
