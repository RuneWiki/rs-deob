import java.applet.Applet;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public class class688 {

    @OriginalMember(owner = "client!jka", name = "f", descriptor = "[S")
    public short[] field9561;

    @OriginalMember(owner = "client!jka", name = "e", descriptor = "[I")
    public int[] field9560;

    @OriginalMember(owner = "client!jka", name = "h", descriptor = "J")
    public long field9563;

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "[S")
    public short[] field9556;

    @OriginalMember(owner = "client!jka", name = "d", descriptor = "Lbu;")
    public static class21 field9559 = new class21(7, -2);

    @OriginalMember(owner = "client!jka", name = "g", descriptor = "[Ljava/awt/Color;")
    public static Color[] field9562 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!jka", name = "b", descriptor = "I")
    public static int field9557;

    @OriginalMember(owner = "client!jka", name = "c", descriptor = "Ljava/applet/Applet;")
    public static Applet field9558;

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method3878(byte arg0, int arg1) {
        class350.field4900 = -1;
        class353.field4975 = arg1;
        class14.field279 = 0;
        class741.field10208 = false;
        if (arg0 > -45) {
            field9558 = null;
        }
        class106.field1241 = null;
        class90.field1011 = 1;
        class665.field9257 = -1;
        class161.field2559 = null;
        field9557++;
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(B)V", line = 26)
    public static void method3879(byte arg0) {
        field9562 = null;
        if (arg0 > 57) {
            field9558 = null;
            field9559 = null;
        }
    }

    @OriginalMember(owner = "client!jka", name = "<init>", descriptor = "(J[I[S[S)V", line = 49)
    public class688(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field9561 = arg2;
        this.field9560 = arg1;
        this.field9563 = arg0;
        this.field9556 = arg3;
    }

    @OriginalMember(owner = "client!jka", name = "<init>", descriptor = "()V", line = 59)
    protected class688() {
    }
}
