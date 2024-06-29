import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class443 {

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "Z")
    public boolean field6490 = true;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public int field6492 = -1;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public int field6503 = 128;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    private int field6504 = 0;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Ltn;")
    public static class58 field6496 = null;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "[I")
    public static int[] field6506 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "B")
    public static byte field6495;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public int field6493;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public int field6494;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public int field6499;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public int field6505;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)I")
    public static final int method2689(int arg0, byte arg1) {
        field6498++;
        int var2 = 84 % ((arg1 - 40) / 59);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILti;)V")
    private final void method2690(int arg0, int arg1, class303 arg2) {
        if (arg1 == 1) {
            this.field6504 = arg2.method1866(false);
            this.method2692(this.field6504, arg0 + 84858408);
        } else if (arg1 == 2) {
            this.field6492 = arg2.method1868(0);
            if (this.field6492 == 65535) {
                this.field6492 = -1;
            }
        } else if (arg1 == 3) {
            this.field6503 = arg2.method1868(0) << 0;
        } else if (arg1 == 4) {
            this.field6490 = false;
        }
        field6489++;
        if (arg0 != -1466775424) {
            this.method2692(-23, 49);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
    public static final void method2691(boolean arg0) {
        if (class415.field6118 >= 0) {
            long var1 = class464.method2773((byte) 103);
            class415.field6118 = (int) ((long) class415.field6118 - (var1 - class96.field1563));
            if (class415.field6118 > 0) {
                int var3 = (class415.field6118 << 8) / class337.field5144;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class134.field2066 = ((class61.field1051 & 0xFF00FF) * var3 + ((class474.field6982.field2307 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class61.field1051 & 0xFF00) * var3 + (class474.field6982.field2307 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                float var6 = 1.0F - var5;
                class41.field628 = (class474.field6982.field2313 - class236.field3423) * var6 + class236.field3423;
                class131.field2012 = (class474.field6982.field2311 - class297.field4250) * var6 + class297.field4250;
                class87.field1462 = (class474.field6982.field2302 - class84.field1376) * var6 + class84.field1376;
                class82.field1354 = (class474.field6982.field2310 - class434.field6309) * var6 + class434.field6309;
                class324.field4963 = (class474.field6982.field2314 - class74.field1238) * var6 + class74.field1238;
                class182.field2745 = (class474.field6982.field2304 - class205.field2960) * var6 + class205.field2960;
                class188.field2789 = ((class129.field1980 & 0xFF00FF) * var3 + ((class474.field6982.field2321 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class129.field1980 & 0xFF00) * var3 + (class474.field6982.field2321 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class210.field3027 = class179.field2711 * var3 + class474.field6982.field2301 * var4 >> 8;
                if (class89.field1495 != class474.field6982.field2305) {
                    class392.field5805 = class14.field242.method440(class89.field1495, class474.field6982.field2305, var6, class392.field5805);
                }
            } else {
                class210.field3027 = class474.field6982.field2301;
                class415.field6118 = -1;
                class82.field1354 = class474.field6982.field2310;
                class41.field628 = class474.field6982.field2313;
                class182.field2745 = class474.field6982.field2304;
                class392.field5805 = class474.field6982.field2305;
                class188.field2789 = class474.field6982.field2321;
                class87.field1462 = class474.field6982.field2302;
                class324.field4963 = class474.field6982.field2314;
                class131.field2012 = class474.field6982.field2311;
                class134.field2066 = class474.field6982.field2307;
            }
            class96.field1563 = var1;
        }
        if (!arg0) {
            field6502++;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
    private final void method2692(int arg0, int arg1) {
        field6497++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (arg1 != -1381917016) {
            return;
        }
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field6499 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field6493 = (int) (var15 * 256.0D);
        if (var17 > 0.5D) {
            this.field6494 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field6494 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field6499 < 0) {
            this.field6499 = 0;
        } else if (this.field6499 > 255) {
            this.field6499 = 255;
        }
        if (this.field6493 < 0) {
            this.field6493 = 0;
        } else if (this.field6493 > 255) {
            this.field6493 = 255;
        }
        if (this.field6494 < 1) {
            this.field6494 = 1;
        }
        this.field6505 = (int) ((double) this.field6494 * var19);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lti;I)V")
    public final void method2693(class303 arg0, int arg1) {
        if (arg1 != 15423) {
            return;
        }
        while (true) {
            int var3 = arg0.method1918((byte) 105);
            if (var3 == 0) {
                field6501++;
                return;
            }
            this.method2690(-1466775424, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method2694(int arg0) {
        field6496 = null;
        if (arg0 != -1) {
            method2694(123);
        }
        field6506 = null;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IB)S")
    public static final short method2695(int arg0, byte arg1) {
        if (arg1 <= 39) {
            method2689(-19, (byte) -108);
        }
        field6500++;
        int var2 = (arg0 & 0xFC42) >> 10;
        int var3 = arg0 >> 3 & 0x70;
        int var4 = arg0 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }
}
