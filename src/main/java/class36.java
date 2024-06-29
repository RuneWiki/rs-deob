import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class36 {

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public int field411 = 128;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    private int field410 = 0;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Z")
    public boolean field419 = true;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public int field421 = -1;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Llg;")
    public static class237 field413 = new class237(4);

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field424 = -1;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Lae;")
    public static class134 field422;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "[I")
    public static int[] field418;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ldg;III)V", line = 5)
    private final void method217(class236 arg0, int arg1, int arg2, int arg3) {
        field420++;
        if (arg1 == 1) {
            this.field410 = arg0.method1616(false);
            this.method219(this.field410, 127);
        } else if (arg1 == 2) {
            this.field421 = arg0.method1617((byte) 48);
            if (this.field421 == 65535) {
                this.field421 = -1;
            }
        } else if (arg1 == 3) {
            this.field411 = arg0.method1617((byte) 48);
        } else if (arg1 == 4) {
            this.field419 = false;
        }
        if (arg3 < 46) {
            this.method219(-3, -76);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ldg;ZI)V", line = 42)
    public final void method218(class236 arg0, boolean arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1574(-97);
            if (var4 == 0) {
                field409++;
                if (!arg1) {
                    this.field414 = 93;
                    return;
                }
                return;
            }
            this.method217(arg0, var4, arg2, 79);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V", line = 70)
    private final void method219(int arg0, int arg1) {
        field415++;
        double var3 = (double) ((arg0 & 0xFF118B) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
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
        this.field414 = (int) (var17 * 256.0D);
        this.field412 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field412 < 0) {
            this.field412 = 0;
        } else if (this.field412 > 255) {
            this.field412 = 255;
        }
        if (this.field414 < 0) {
            this.field414 = 0;
        } else if (this.field414 > 255) {
            this.field414 = 255;
        }
        if (var17 > 0.5D) {
            this.field416 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field416 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field416 < 1) {
            this.field416 = 1;
        }
        if (arg1 > 92) {
            this.field417 = (int) ((double) this.field416 * var19);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 162)
    public static void method220(int arg0) {
        field413 = null;
        field422 = null;
        field418 = null;
        if (arg0 != 0) {
            method221(-75, 51, -35);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V", line = 181)
    public static final void method221(int arg0, int arg1, int arg2) {
        field408++;
        int var3 = class384.field5422.field5677[0];
        int var4 = class384.field5422.field5664[arg0];
        if (class384.field5425 == 1) {
            if (!class95.method530(0, var3, false, 0, 1, arg1, -2, arg2, var4, 1, (byte) -45)) {
                class95.method530(0, var3, false, 0, 1, arg1, -3, arg2, var4, 1, (byte) -45);
            }
        } else if (!class95.method530(0, var3, false, 0, 1, arg1, -3, arg2, var4, 1, (byte) -45)) {
            class95.method530(0, var3, false, 0, 1, arg1, -2, arg2, var4, 1, (byte) -45);
        }
    }
}
