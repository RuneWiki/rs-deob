import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class192 extends class132 {

    @OriginalMember(owner = "client!rt", name = "y", descriptor = "Lrn;")
    public class225 field2715;

    @OriginalMember(owner = "client!rt", name = "A", descriptor = "Lfl;")
    public class630 field2717;

    @OriginalMember(owner = "client!rt", name = "C", descriptor = "Lej;")
    public static class104 field2719 = new class104("Loaded shaders", "Shaders geladen", "Nuanceurs chargés", "Sombreamento carregado");

    @OriginalMember(owner = "client!rt", name = "E", descriptor = "[I")
    public static int[] field2721 = new int[32];

    @OriginalMember(owner = "client!rt", name = "J", descriptor = "[I")
    public static int[] field2726 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "I")
    public int field2716;

    @OriginalMember(owner = "client!rt", name = "B", descriptor = "I")
    public int field2718;

    @OriginalMember(owner = "client!rt", name = "D", descriptor = "I")
    public int field2720;

    @OriginalMember(owner = "client!rt", name = "F", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!rt", name = "G", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!rt", name = "I", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!rt", name = "K", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!rt", name = "L", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!rt", name = "M", descriptor = "I")
    public int field2729;

    @OriginalMember(owner = "client!rt", name = "H", descriptor = "[S")
    public static short[] field2724;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V")
    public static final void method1191(byte arg0) {
        field2722++;
        class218.field3108 = null;
        class434.method2579(class56.field1005, 0, class387.field5196, -1, 0, (byte) -2, 0, 0, class134.field2128);
        if (class218.field3108 != null) {
            class506.method2929(class26.field462, -1412584499, class387.field5196, class218.field3108, class638.field9294.field1768, 9, class522.field7350, 0, class134.field2128, 0);
            class218.field3108 = null;
        }
        if (arg0 <= 40) {
            field2721 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(III)Z")
    public static final boolean method1192(int arg0, int arg1, int arg2) {
        field2725++;
        if (arg0 != 2) {
            field2724 = null;
        }
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)V")
    public final void method1193(byte arg0) {
        this.field2718 = this.field2715.field3223;
        this.field2728 = this.field2715.field3225;
        int var2 = 6 / ((arg0 + 27) / 46);
        field2727++;
        this.field2720 = this.field2715.field3220;
        if (this.field2715.field3228 != null) {
            this.field2715.field3228.method1041(this.field2717.field9224, this.field2717.field9226, this.field2717.field9211, class8.field100);
        }
        this.field2716 = class8.field100[0];
        this.field2729 = class8.field100[2];
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLn;Ljava/awt/Canvas;)Lqa;")
    public static final class207 method1194(byte arg0, class17 arg1, Canvas arg2) {
        field2723++;
        if (arg0 < 80) {
            method1192(-127, 12, -101);
        }
        return new class530(arg2, arg1);
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(Z)V")
    public static void method1195(boolean arg0) {
        field2719 = null;
        field2721 = null;
        if (!arg0) {
            method1192(-101, 29, -53);
        }
        field2726 = null;
        field2724 = null;
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lrn;Ljw;)V")
    public class192(class225 arg0, class475 arg1) {
        this.field2715 = arg0;
        this.field2717 = this.field2715.method1441((byte) 32);
        this.method1193((byte) 125);
    }
}
