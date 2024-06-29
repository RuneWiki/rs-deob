import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class class264 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public int field4285;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public int field4292;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "Lac;")
    public static class153 field4288;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field4289;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field4291;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "[I")
    public int[] field4293;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZLjava/awt/Graphics;II)V")
    public abstract void method68(int arg0, int arg1, boolean arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
    public abstract void method64(byte arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ)V")
    public static final void method1848(int arg0, boolean arg1) {
        field4290++;
        if (class254.field4154 != arg1) {
            class254.field4154 = arg1;
            int var2 = -86 % ((30 - arg0) / 37);
            class142.method922((byte) -121);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    public abstract void method65(int arg0, int arg1, boolean arg2, Component arg3);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
    public final void method1849(boolean arg0) {
        class151.method1045(this.field4293, this.field4292, this.field4285);
        field4287++;
        if (arg0) {
            field4288 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static void method1850(byte arg0) {
        field4288 = null;
        if (arg0 != 83) {
            field4288 = null;
        }
        field4289 = null;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
    protected class264() {
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static final void method1851(int arg0) {
        if (arg0 != -21571) {
            method1851(32);
        }
        class254.field4148.method1511((byte) 98);
        field4284++;
    }
}
