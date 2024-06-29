import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class393 {

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "I")
    private int field5629;

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "[F")
    public static float[] field5630 = new float[4];

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "Laj;")
    public static class338 field5624 = new class338(14, 1);

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "Laj;")
    public static class338 field5631 = new class338(15, 4);

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "Laj;")
    public static class338 field5632 = new class338(16, -2);

    @OriginalMember(owner = "client!hea", name = "j", descriptor = "Laj;")
    public static class338 field5633 = new class338(17, 0);

    @OriginalMember(owner = "client!hea", name = "k", descriptor = "Laj;")
    public static class338 field5634 = new class338(18, -2);

    @OriginalMember(owner = "client!hea", name = "l", descriptor = "Laj;")
    public static class338 field5635 = new class338(19, -2);

    @OriginalMember(owner = "client!hea", name = "m", descriptor = "Laj;")
    public static class338 field5636 = new class338(20, 6);

    @OriginalMember(owner = "client!hea", name = "n", descriptor = "Laj;")
    public static class338 field5637 = new class338(21, 9);

    @OriginalMember(owner = "client!hea", name = "o", descriptor = "Laj;")
    public static class338 field5638 = new class338(22, -2);

    @OriginalMember(owner = "client!hea", name = "p", descriptor = "Laj;")
    public static class338 field5639 = new class338(23, 4);

    @OriginalMember(owner = "client!hea", name = "q", descriptor = "Laj;")
    public static class338 field5640 = new class338(24, -1);

    @OriginalMember(owner = "client!hea", name = "r", descriptor = "Laj;")
    public static class338 field5641 = new class338(25, -2);

    @OriginalMember(owner = "client!hea", name = "s", descriptor = "Laj;")
    public static class338 field5642 = new class338(26, 0);

    @OriginalMember(owner = "client!hea", name = "t", descriptor = "Laj;")
    public static class338 field5643 = new class338(27, 0);

    @OriginalMember(owner = "client!hea", name = "u", descriptor = "[Laj;")
    private static class338[] field5644 = new class338[32];

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "I")
    public static int field5628;

    static {
        class338[] var0 = class78.method443((byte) -127);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field5644[var0[var1].field4951] = var0[var1];
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V", line = 8)
    public static void method2335(int arg0) {
        field5640 = null;
        field5637 = null;
        field5632 = null;
        field5644 = null;
        field5634 = null;
        field5643 = null;
        field5641 = null;
        field5633 = null;
        field5638 = null;
        field5635 = null;
        field5639 = null;
        field5642 = null;
        field5631 = null;
        if (arg0 == 19) {
            field5624 = null;
            field5630 = null;
            field5636 = null;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(BC)V", line = 34)
    public final void method2336(byte arg0, char arg1) {
        if (arg0 != 32) {
            this.method2336((byte) 85, (char) 65508);
        }
        OpenGL.glCallList(this.field5629 + arg1);
        field5627++;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(III)V", line = 46)
    public static final void method2337(int arg0, int arg1, int arg2) {
        field5625++;
        class19 var3 = class364.method2236(1248116640, arg2, 14);
        var3.method110(12142);
        if (arg1 != -8558) {
            method2337(84, -78, 20);
        }
        var3.field171 = arg0;
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(I)V", line = 60)
    public final void method2338(int arg0) {
        if (arg0 != -20555) {
            this.method2336((byte) 64, '\u000e');
        }
        field5628++;
        OpenGL.glEndList();
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)V", line = 71)
    public final void method2339(int arg0, int arg1) {
        field5626++;
        OpenGL.glNewList(this.field5629 + arg1, arg0);
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lpea;I)V", line = 93)
    public class393(class641 arg0, int arg1) {
        this.field5629 = OpenGL.glGenLists(arg1);
    }
}
