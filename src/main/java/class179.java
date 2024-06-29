import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class179 {

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Ltl;")
    public static class59 field2933 = class85.method639("n", 9588);

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field2940 = 1;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public int field2930;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Loh;")
    public static class257 field2936;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Lme;")
    public static class295 field2928;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Lme;")
    public static class295 field2937;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Lme;")
    public static class295 field2938;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field2931;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "[I")
    public int[] field2939;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "[Lqd;")
    public static class231[] field2941;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 6)
    public final void method1320(int arg0) {
        field2932++;
        class272.method1912(this.field2939, this.field2934, this.field2930);
        if (arg0 != 16089) {
            field2937 = (class295) null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 20)
    public static void method1321(byte arg0) {
        field2938 = null;
        if (arg0 < 18) {
            field2936 = (class257) null;
        }
        field2933 = null;
        field2936 = null;
        field2928 = null;
        field2937 = null;
        field2941 = null;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V", line = 43)
    public static final void method1322(int arg0) {
        if (arg0 > -21) {
            field2933 = (class59) null;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class102.field1689[var1] = true;
        }
        field2929++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIZII)V", line = 77)
    public static final void method1323(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var8 = arg0 + 1;
        class174.method1283(7, arg4, class163.field2662[arg0], arg2, arg5);
        int var9 = arg1 - 1;
        class174.method1283(7, arg4, class163.field2662[arg1], arg2, arg5);
        field2927++;
        if (!arg3) {
            for (int var6 = var8; var6 <= var9; var6++) {
                int[] var7 = class163.field2662[var6];
                var7[arg2] = var7[arg5] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Ltl;", line = 112)
    public static final class59 method1324(int arg0, int arg1) {
        field2935++;
        if (arg1 != 255) {
            field2938 = (class295) null;
        }
        return class233.method1630(new class59[] { class81.method619((byte) -78, arg0 >> 24 & 0xFF), class53.field785, class81.method619((byte) -66, arg0 >> 16 & 0xFF), class53.field785, class81.method619((byte) -77, arg0 >> 8 & 0xFF), class53.field785, class81.method619((byte) -102, arg0 & 0xFF) }, -2883);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 121)
    protected class179() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method357(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method355(int arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Graphics;IIIZI)V")
    public abstract void method356(Graphics arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5);
}
