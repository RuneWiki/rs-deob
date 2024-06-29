import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class240 {

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lve;")
    public static class255 field4004 = class87.method607(61, "p12_full");

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Lve;")
    private static class255 field4007 = class87.method607(42, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Lve;")
    public static class255 field4008 = field4007;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public int field4002;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public int field4006;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Lrg;")
    public static class88 field4000;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3999;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Ljava/awt/Image;")
    public Image field3998;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "[I")
    public int[] field4003;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 13)
    public final void method1657(int arg0) {
        field4005++;
        if (arg0 != 25) {
            field4000 = (class88) null;
        }
        class175.method1254(this.field4003, this.field4002, this.field4006);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 27)
    public static final void method1658(byte arg0) {
        field4001++;
        class274.method1922((byte) -119);
        System.gc();
        class256.method1798(-77, 25);
        if (arg0 <= 71) {
            method1658((byte) -44);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V", line = 58)
    public static void method1659(int arg0) {
        field4000 = null;
        if (arg0 >= 91) {
            field3999 = null;
            field4007 = null;
            field4008 = null;
            field4004 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V", line = 81)
    protected class240() {
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILjava/awt/Graphics;IIB)V")
    public abstract void method1128(int arg0, int arg1, Graphics arg2, int arg3, int arg4, byte arg5);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method1124(Component arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
    public abstract void method1123(int arg0, Graphics arg1, byte arg2, int arg3);
}
