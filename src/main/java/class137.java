import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class class137 {

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2250 = "Hidden";

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Luj;")
    public static class132 field2256 = new class132(16);

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2257 = "slide:";

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public int field2248;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public int field2253;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lsg;")
    public static class183 field2255;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field2254;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "[I")
    public int[] field2252;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method1014(int arg0) {
        field2257 = null;
        if (arg0 <= -28) {
            field2256 = null;
            field2250 = null;
            field2255 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public abstract void method1005(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1015(int arg0, int arg1) {
        if (arg0 != 255) {
            method1014(115);
        }
        field2249++;
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF54BD) >> 16) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public final void method1016(int arg0) {
        if (arg0 == 255) {
            class211.method1499(this.field2252, this.field2253, this.field2248);
            field2251++;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    protected class137() {
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method1000(int arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method1004(int arg0, int arg1, int arg2, Graphics arg3);
}
