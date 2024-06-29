import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public abstract class class31 {

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "Lu;")
    public static class38 field391 = class28.method177("Fishing Shop", (byte) -84);

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "I")
    public static int field389 = 0;

    @OriginalMember(owner = "mapview!p", name = "h", descriptor = "I")
    public static int field393 = 50;

    @OriginalMember(owner = "mapview!p", name = "i", descriptor = "Z")
    public static boolean field394 = false;

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "Lu;")
    public static class38 field392 = class28.method177("Please wait)3)3)3 Rendering Map", (byte) -84);

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "Ljava/awt/Image;")
    public Image field390;

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "[I")
    public int[] field388;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I)V", line = 14)
    public final void method187(int arg0) {
        if (arg0 != 0) {
            this.method131(null, 51, -47, -41);
        }
        class40.method263(this.field388, this.field386, this.field387);
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(B)V", line = 28)
    public static void method188(byte arg0) {
        if (arg0 != -90) {
            method189(-1);
        }
        field392 = null;
        field391 = null;
    }

    @OriginalMember(owner = "mapview!p", name = "<init>", descriptor = "()V", line = 50)
    protected class31() {
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(I)B", line = 65)
    public static final byte method189(int arg0) {
        int var1 = 60 % ((arg0 + 42) / 51);
        return class29.field367 == null ? 0 : class29.field367[class22.field213];
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(III)V", line = 77)
    public static final void method190(int arg0, int arg1, int arg2) {
        class28.field354 = arg0 >> 6;
        class32.field396 = arg0 & 0x3F;
        class17.field168 = arg2 & 0x3F;
        if (arg1 > -31) {
            field392 = null;
        }
        class29.field363 = arg2 >> 6;
        class22.field213 = (class17.field168 << 6) + class32.field396;
        class30.method182((byte) -7);
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method131(Component arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method128(int arg0, int arg1, Graphics arg2, int arg3);
}
