import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class634 {

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public int field8530 = 512;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Z")
    public boolean field8534 = true;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "Z")
    public boolean field8533 = true;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    private int field8525 = 0;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public int field8537 = -1;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Lgw;")
    public static class690 field8524 = new class690(64);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public int field8526;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field8527;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public int field8528;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field8531;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field8532;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public int field8535;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public int field8536;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field8538;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field8540;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "[Ldi;")
    public static class5[] field8539;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ldc;I)V")
    public final void method3552(class63 arg0, int arg1) {
        if (arg1 > -55) {
            field8539 = null;
        }
        field8531++;
        while (true) {
            int var3 = arg0.method505((byte) -119);
            if (var3 == 0) {
                return;
            }
            this.method3554(arg0, var3, (byte) 43);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)V")
    public static final void method3553(byte arg0, int arg1) {
        field8527++;
        if (arg1 == -1 || !class518.field7230[arg1]) {
            return;
        }
        class216.field2822.method1588(arg1, true);
        class266.field3900[arg1] = null;
        if (arg0 >= -12) {
            method3553((byte) 51, 58);
        }
        class39.field483[arg1] = null;
        class518.field7230[arg1] = false;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ldc;IB)V")
    private final void method3554(class63 arg0, int arg1, byte arg2) {
        field8532++;
        if (arg2 != 43) {
            this.field8528 = 69;
        }
        if (arg1 == 1) {
            this.field8525 = arg0.method476((byte) 114);
            this.method3558((byte) -128, this.field8525);
        } else if (arg1 == 2) {
            this.field8537 = arg0.method482(arg2 ^ 0xD1F32FE3);
            if (this.field8537 == 65535) {
                this.field8537 = -1;
                return;
            }
        } else if (arg1 == 3) {
            this.field8530 = arg0.method482(-772591672) << 2;
            return;
        } else {
            if (arg1 == 4) {
                this.field8533 = false;
            } else if (arg1 == 5) {
                this.field8534 = false;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static final void method3555(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class396.field5692[var1] = false;
        }
        field8540++;
        class221.field2987 = -1;
        class388.field5597 = -1;
        class299.field4237 = -1;
        class355.field5109 = 0;
        if (arg0 != 17220) {
            field8524 = null;
        }
        class204.field2693 = 0;
        class720.field10023 = 1;
        class712.field9954 = -1;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    public static void method3556(int arg0) {
        if (arg0 != 255) {
            field8539 = null;
        }
        field8539 = null;
        field8524 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Luv;I)Luv;")
    public static final class755 method3557(class755 arg0, int arg1) {
        field8523++;
        if (arg1 != 2) {
            field8524 = null;
        }
        class755 var2 = client.method2748(arg0);
        if (var2 == null) {
            var2 = arg0.field10528;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(BI)V")
    private final void method3558(byte arg0, int arg1) {
        field8538++;
        double var3 = (double) ((arg1 & 0xFF23BA) >> 16) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        if (arg0 > -108) {
            this.field8528 = -3;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field8526 = (int) (var17 * 256.0D);
        this.field8535 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field8535 < 0) {
            this.field8535 = 0;
        } else if (this.field8535 > 255) {
            this.field8535 = 255;
        }
        if (this.field8526 < 0) {
            this.field8526 = 0;
        } else if (this.field8526 > 255) {
            this.field8526 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field8536 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field8536 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field8536 < 1) {
            this.field8536 = 1;
        }
        this.field8528 = (int) ((double) this.field8536 * var19);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIB)I")
    public static final int method3559(int arg0, int arg1, byte arg2) {
        field8522++;
        byte var3;
        if (arg0 > 20000) {
            var3 = 4;
            class320.method2066((byte) -127);
        } else if (arg0 > 10000) {
            class699.method3950((byte) -123);
            var3 = 3;
        } else if (arg0 > 5000) {
            var3 = 2;
            class710.method3995((byte) -125);
        } else {
            var3 = 1;
            class611.method3466((byte) 4, true);
        }
        if (class332.field4707.field4789.method963(0) != arg1) {
            class332.field4707.method2158(arg1, class332.field4707.field4753, -15);
            class393.method2459(arg1, false, 1);
        }
        if (arg2 != -112) {
            method3559(-84, -28, (byte) -117);
        }
        class263.method1802(-2);
        return var3;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V")
    public static final void method3560(boolean arg0) {
        field8529++;
        if (!arg0) {
            return;
        }
        int var1 = class239.field3580.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class239.field3580[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class670.field9248; var4++) {
                    if (class548.field7613[var4] == class316.field4364[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class548.field7613[class670.field9248] = class316.field4364[var2];
                    var3 = class670.field9248++;
                }
                class63 var5 = new class63(class239.field3580[var2]);
                int var6 = 0;
                while (var5.field956 < class239.field3580[var2].length && var6 < 511 && class262.field3837 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method482(-772591672);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FC3) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class316.field4364[var2] >> 8) * 64 + var10 - class113.field1509;
                    int var13 = (class316.field4364[var2] & 0xFF) * 64 + var11 - class587.field7995;
                    class123 var14 = class525.field7291.method146(2, var5.method482(-772591672));
                    class234 var15 = (class234) class372.field5245.method812(121, (long) var7);
                    if (var15 == null && (var14.field1683 & 0x1) > 0 && class622.field8328 == var9 && var12 >= 0 && class277.field4036 > (var14.field1656 + var12) && var13 >= 0 && (var13 + var14.field1656) < class667.field9202) {
                        class679 var16 = new class679();
                        var16.field7148 = var7;
                        class234 var17 = new class234(var16);
                        class372.field5245.method820((long) var7, (byte) -42, var17);
                        class757.field10568[class445.field6185++] = var17;
                        class446.field6192[class262.field3837++] = var7;
                        var16.field7139 = class483.field6741;
                        var16.method3826(var14, 0);
                        var16.method3081(var16.field9436.field1656, 32679);
                        var16.field7136 = var16.field9436.field1702 << 3;
                        var16.method3073(true, true, var16.field9436.field1694 + 4 << 11 & 0x3C7C);
                        var16.method3825(var9, var16.method662((byte) 15), var13, true, -7749, var12);
                    }
                }
            }
        }
    }
}
