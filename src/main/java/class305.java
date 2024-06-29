import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class305 {

    @OriginalMember(owner = "client!on", name = "d", descriptor = "Z")
    public boolean field4487 = true;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public int field4496 = 512;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public int field4493 = -1;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    private int field4501 = 0;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "Z")
    public static boolean field4498 = false;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "[[I")
    public static int[][] field4500 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public int field4486;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public int field4489;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public int field4491;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public int field4495;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "Lgd;")
    public static class309 field4492;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljr;II)V")
    private final void method1873(class96 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            return;
        }
        field4490++;
        if (arg1 == 1) {
            this.field4501 = arg0.method736(-126);
            this.method1879(this.field4501, -114);
        } else if (arg1 == 2) {
            this.field4493 = arg0.method743((byte) -73);
            if (this.field4493 == 65535) {
                this.field4493 = -1;
                return;
            }
        } else if (arg1 == 3) {
            this.field4496 = arg0.method743((byte) -106) << 2;
        } else if (arg1 == 4) {
            this.field4487 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIILoa;)V")
    public static final void method1874(int arg0, int arg1, int arg2, class638 arg3) {
        field4497++;
        class292.field4399 = arg3;
        class568.field7648 = new class667[arg2][arg0];
        if (arg1 != 1) {
            field4498 = false;
        }
        if (class525.field7180 != null) {
            class421.field5949 = class608.method3361(class525.field7180[1], class525.field7180[3], class525.field7180[4], (byte) 114, class525.field7180[5], class525.field7180[2], class525.field7180[0]);
        }
        class46.field694 = new class667();
        class233.method1475(true);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)V")
    public static final void method1875(int arg0, int arg1) {
        field4485++;
        if (arg0 == 24) {
            class679 var2 = class669.method3708(12, arg1, 1403048928);
            var2.method3749(arg0 ^ 0xFFFFFFAD);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Le;ILjava/awt/Canvas;Lpj;I)Loa;")
    public static final class638 method1876(class489 arg0, int arg1, Canvas arg2, class132 arg3, int arg4) {
        field4499++;
        if (!class26.method121((byte) -107)) {
            throw new RuntimeException("");
        } else if (class307.method1881("jaggl", false)) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg2, 8, 8, 8, 24, 0, arg1);
            if (arg4 < 43) {
                return null;
            } else if (var6 == 0L) {
                throw new RuntimeException("");
            } else {
                class120 var8 = new class120(var5, arg2, var6, arg0, arg3, arg1);
                var8.method3237(0);
                return var8;
            }
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljr;I)V")
    public final void method1877(class96 arg0, int arg1) {
        if (arg1 != 24455) {
            this.field4491 = -80;
        }
        field4494++;
        while (true) {
            int var3 = arg0.method718(-59);
            if (var3 == 0) {
                return;
            }
            this.method1873(arg0, var3, -3);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public static void method1878(int arg0) {
        field4492 = null;
        field4500 = null;
        if (arg0 < 102) {
            field4492 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(II)V")
    private final void method1879(int arg0, int arg1) {
        field4484++;
        double var3 = (double) ((arg0 & 0xFF98CB) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
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
        int var15 = 57 / ((arg1 - 61) / 42);
        double var16 = 0.0D;
        double var18 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var18 < 0.5D) {
                var16 = (var11 - var9) / (var9 + var11);
            }
            if (var18 >= 0.5D) {
                var16 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field4495 = (int) (var18 * 256.0D);
        this.field4491 = (int) (var16 * 256.0D);
        double var20 = var13 / 6.0D;
        if ((var18 > 0.5D)) {
            this.field4489 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field4489 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field4491 < 0) {
            this.field4491 = 0;
        } else if (this.field4491 > 255) {
            this.field4491 = 255;
        }
        if (this.field4495 < 0) {
            this.field4495 = 0;
        } else if (this.field4495 > 255) {
            this.field4495 = 255;
        }
        if (this.field4489 < 1) {
            this.field4489 = 1;
        }
        this.field4486 = (int) ((double) this.field4489 * var20);
    }
}
