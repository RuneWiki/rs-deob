import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class93 {

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Lhb;")
    private static class44 field2361 = class102.method810("flash1:", -28606);

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lhb;")
    public static class44 field2362 = class102.method810("Unerwartete Antwort vom Anmelde)2Server", -28606);

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lhb;")
    public static class44 field2356 = class102.method810(":0", -28606);

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Lhb;")
    public static class44 field2367 = class102.method810("@red@", -28606);

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Lhb;")
    private static class44 field2370 = class102.method810("Please check your message)2centre for details)3", -28606);

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Lhb;")
    public static class44 field2365 = class102.method810("p12_full", -28606);

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field2359 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Lhb;")
    public static class44 field2369 = class102.method810("(X", -28606);

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Lhb;")
    public static class44 field2368 = field2370;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "Lhb;")
    private static class44 field2371 = class102.method810("M", -28606);

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "Lhb;")
    public static class44 field2372 = field2361;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lhb;")
    public static class44 field2364 = field2371;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public int field2358;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public int field2366;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "Ljava/awt/Image;")
    public Image field2363;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "[I")
    public int[] field2353;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "[I")
    public static int[] field2360;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "[[I")
    public static int[][] field2357;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 5)
    public static void method746(int arg0) {
        field2371 = null;
        field2361 = null;
        field2372 = null;
        field2370 = null;
        field2357 = null;
        field2368 = null;
        field2362 = null;
        field2356 = null;
        field2364 = null;
        if (arg0 != -32486) {
            method746(-1);
        }
        field2365 = null;
        field2360 = null;
        field2369 = null;
        field2367 = null;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 68)
    protected class93() {
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 71)
    public final void method747(int arg0) {
        class112.method857(this.field2353, this.field2366, this.field2358);
        field2355++;
        if (arg0 != 17) {
            field2362 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method143(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method142(int arg0, int arg1, int arg2, Component arg3);
}
