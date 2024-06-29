import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class129 {

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "[I")
    public static int[] field2335 = new int[32];

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Ltg;")
    private static class184 field2334 = class135.method812("This world is running a closed Beta)3", 3);

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "[I")
    public static int[] field2336 = new int[99];

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field2326 = 0;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "[[I")
    public static int[][] field2333 = new int[5][5000];

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "Ltg;")
    public static class184 field2340 = field2334;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "Ltg;")
    public static class184 field2343;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "Ltg;")
    public static class184 field2342;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "Ltg;")
    public static class184 field2341;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public int field2328;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public int field2339;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Loe;")
    public static class137 field2330;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2344;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field2332;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "[I")
    public int[] field2337;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "[[[B")
    public static byte[][][] field2327;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method442(int arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method440(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lvb;ZLvb;B)V")
    public static final void method785(class197 arg0, boolean arg1, class197 arg2, byte arg3) {
        class194.field3765 = arg1;
        class45.field860 = arg2;
        if (arg3 != -18) {
            method785(null, true, null, (byte) -126);
        }
        field2338++;
        class18.field350 = arg0;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method786(int arg0) {
        field2334 = null;
        field2340 = null;
        if (arg0 <= 95) {
            field2344 = null;
        }
        field2330 = null;
        field2333 = null;
        field2327 = null;
        field2335 = null;
        field2341 = null;
        field2343 = null;
        field2342 = null;
        field2336 = null;
        field2344 = null;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public final void method787(int arg0) {
        if (arg0 == 0) {
            field2329++;
            class4.method20(this.field2337, this.field2328, this.field2339);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method441(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    protected class129() {
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2336[var1] = var0 / 4;
        }
        field2343 = class135.method812("blinken1:", 3);
        field2342 = class135.method812("null", 3);
        field2345 = 0;
        field2341 = class135.method812("Bitte versuchen Sie)1", 3);
        field2346 = 0;
    }
}
