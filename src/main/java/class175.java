import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class class175 {

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Leb;")
    public static class230 field3074 = class68.method589(0, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Leb;")
    public static class230 field3079 = class68.method589(0, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Leb;")
    public static class230 field3082 = class68.method589(0, "Schlie-8en");

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public int field3081;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field3077;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[I")
    public int[] field3073;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "[Lej;")
    public static class49[] field3072;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method1278(int arg0) {
        field3079 = null;
        field3072 = null;
        field3082 = null;
        if (arg0 < -41) {
            field3074 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    public abstract void method362(int arg0, int arg1, boolean arg2, Component arg3);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method361(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILjava/awt/Graphics;IZI)V")
    public abstract void method360(int arg0, int arg1, Graphics arg2, int arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZB)V")
    public static final void method1279(boolean arg0, byte arg1) {
        if (arg1 >= 68) {
            class138.method1063(class135.field2434, -1, class180.field3155, arg0, class263.field4679);
            field3076++;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static final void method1280(byte arg0) {
        class113.field2026 = new class98();
        if (arg0 >= 110) {
            field3078++;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public final void method1281(int arg0) {
        if (arg0 == 19116) {
            class87.method710(this.field3073, this.field3081, this.field3075);
            field3080++;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    protected class175() {
    }
}
