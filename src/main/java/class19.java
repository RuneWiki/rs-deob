import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public abstract class class19 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field255 = "level: ";

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "Ljava/lang/String;")
    public static String field264 = "Loading...";

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "[I")
    public static int[] field260 = new int[2000];

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field257 = 127;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field258 = -1;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field256 = -1;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public int field259;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public int field266;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field261;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "[I")
    public int[] field265;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
    public static void method113(int arg0) {
        field264 = null;
        field260 = null;
        if (arg0 != -1) {
            method113(61);
        }
        field255 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public abstract void method114(int arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method115(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
    public abstract void method116(Graphics arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
    public static final void method117(int arg0) {
        if (arg0 <= -74) {
            field262++;
            class33.field412.method145(-98);
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V")
    public final void method118(int arg0) {
        field263++;
        if (arg0 != 127) {
            field256 = -70;
        }
        class62.method399(this.field265, this.field259, this.field266);
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
    protected class19() {
    }
}
