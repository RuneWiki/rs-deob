import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class253 extends class98 {

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "Lmb;")
    public static class96 field4379 = class243.method1708("showingVideoAd", (byte) 101);

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "[I")
    public static int[] field4373 = new int[99];

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field4380 = 0;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "Lmb;")
    public static class96 field4376 = class243.method1708("document)3cookie=(R", (byte) 94);

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "Lmb;")
    public static class96 field4382;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public int field4370;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    private int field4383;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "Lmb;")
    public class96 field4375;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    public static void method1758(int arg0) {
        field4379 = null;
        field4373 = null;
        if (arg0 >= -121) {
            method1764(-84);
        }
        field4382 = null;
        field4376 = null;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)Z")
    public final boolean method1759(byte arg0) {
        if (arg0 == -67) {
            field4371++;
            return this.field4383 == 115;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
    public static final void method1760(int arg0) {
        field4377++;
        while (class1.field4.method1014(class47.field820, (byte) 6) >= 11) {
            int var1 = class1.field4.method1017((byte) 124, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class22.field371[var1] == null) {
                var2 = true;
                class22.field371[var1] = new class47();
                if (class140.field2514[var1] != null) {
                    class22.field371[var1].method367((byte) -124, class140.field2514[var1]);
                }
            }
            class103.field1734[class145.field2577++] = var1;
            class47 var3 = class22.field371[var1];
            var3.field4510 = class236.field4053;
            int var4 = class1.field4.method1017((byte) 126, 1);
            int var5 = class1.field4.method1017((byte) 124, 5);
            int var6 = class1.field4.method1017((byte) 126, 5);
            int var7 = class146.field2604[class1.field4.method1017((byte) 124, 3)];
            if (var2) {
                var3.field4531 = var3.field4534 = var7;
            }
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var6 > 15) {
                var6 -= 32;
            }
            int var8 = class1.field4.method1017((byte) 124, 1);
            if (var8 == 1) {
                class78.field1335[class157.field2745++] = var1;
            }
            var3.method360(class236.field4047.field4528[0] + var6, class236.field4047.field4566[0] + var5, 4770, var4 == 1);
        }
        class1.field4.method1018((byte) 32);
        if (arg0 != 1) {
            field4379 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
    public static final void method1761(int arg0) {
        field4381++;
        if (class244.field4243 == -1 || class270.field4711 == -1) {
            return;
        }
        int var1 = ((class206.field3543 - class136.field2438) * class7.field133 >> 16) + class136.field2438;
        class7.field133 += var1;
        float[] var2 = new float[3];
        if (class7.field133 >= 65535) {
            if (class237.field4075) {
                class68.field1181 = false;
            } else {
                class68.field1181 = true;
            }
            class7.field133 = 65535;
            class237.field4075 = true;
        } else {
            class68.field1181 = false;
            class237.field4075 = false;
        }
        float var3 = (float) class7.field133 / 65535.0F;
        int var4 = class9.field143 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = (class189.field3300[class244.field4243][var4 + 2][var5] + class189.field3300[class244.field4243][var4 + 2][var5] - class189.field3300[class244.field4243][var4 + 3][var5]) * 3;
            int var22 = class189.field3300[class244.field4243][var4][var5];
            int var23 = class189.field3300[class244.field4243][var4 + 1][var5] * 3;
            int var24 = class189.field3300[class244.field4243][var4][var5] * 3;
            int var25 = var21 + var24 - (var23 * 2);
            int var26 = var23 - var24;
            int var27 = class189.field3300[class244.field4243][var4 + 2][var5] + var23 - var22 - var21;
            var2[var5] = (((float) var27 * var3 + (float) var25) * var3 + (float) var26) * var3 + (float) var22;
        }
        class178.field3078 = (int) var2[0] - (class196.field3383 * 128);
        class105.field1767 = (int) var2[1] * -1;
        class22.field389 = (int) var2[2] - (class225.field3832 * 128);
        float[] var6 = new float[3];
        int var7 = class237.field4074 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class189.field3300[class270.field4711][var7][var8] * 3;
            int var15 = class189.field3300[class270.field4711][var7 + 1][var8] * 3;
            int var16 = class189.field3300[class270.field4711][var7][var8];
            int var17 = (class189.field3300[class270.field4711][var7 + 2][var8] + class189.field3300[class270.field4711][var7 + 2][var8] - class189.field3300[class270.field4711][var7 + 3][var8]) * 3;
            int var18 = var14 + var17 - var15 * 2;
            int var19 = var15 - var14;
            int var20 = class189.field3300[class270.field4711][var7 + 2][var8] + var15 - var16 - var17;
            var6[var8] = (((float) var20 * var3 + (float) var18) * var3 + (float) var19) * var3 + (float) var16;
        }
        float var9 = var6[0] - var2[0];
        if (arg0 < 87) {
            return;
        }
        float var10 = var6[2] - var2[2];
        float var11 = (var6[1] - var2[1]) * -1.0F;
        double var12 = Math.sqrt((double) (var9 * var9 + var10 * var10));
        class92.field1524 = (float) Math.atan2((double) var11, var12);
        class90.field1496 = -((float) Math.atan2((double) var9, (double) var10));
        class140.field2501 = (int) ((double) class92.field1524 * 325.949D) & 0x7FF;
        class23.field392 = (int) ((double) class90.field1496 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBLrg;)V")
    private final void method1762(int arg0, byte arg1, class239 arg2) {
        field4372++;
        int var4 = 83 % ((15 - arg1) / 46);
        if (arg0 == 1) {
            this.field4383 = arg2.method1651(4139);
        } else if (arg0 == 2) {
            this.field4370 = arg2.method1617((byte) -43);
            return;
        } else if (arg0 == 5) {
            this.field4375 = arg2.method1634(-87);
            return;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lrg;B)V")
    public final void method1763(class239 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1651(4139);
            if (var3 == 0) {
                field4374++;
                if (arg1 != 49) {
                    this.method1763((class239) null, (byte) 58);
                    return;
                }
                return;
            }
            this.method1762(var3, (byte) -63, arg0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
    public static final void method1764(int arg0) {
        if (arg0 <= 114) {
            field4379 = null;
        }
        field4378++;
        class250.field4316.method83(0);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field4373[var1] = var0 / 4;
        }
        field4382 = class243.method1708("Bitte warten Sie)3)3)3", (byte) 120);
    }
}
