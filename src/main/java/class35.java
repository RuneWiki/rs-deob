import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public abstract class class35 {

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "Lkk;")
    public static class239 field488;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field490;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(III)V", line = 6)
    public static final void method301(int arg0, int arg1, int arg2) {
        if (arg2 <= 11) {
            method301(109, -112, -11);
        }
        class371.field5147 = arg1 - class161.field2636;
        class34.field480 = arg0 - class161.field2628;
        field489++;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V", line = 19)
    public static void method302(boolean arg0) {
        field488 = null;
        field490 = null;
        if (!arg0) {
            method302(true);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)I")
    public abstract int method303(int arg0, int arg1);

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(II)[B")
    public abstract byte[] method304(int arg0, int arg1);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)Lpq;")
    public abstract class171 method305(int arg0);

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(II)V")
    public abstract void method306(int arg0, int arg1);
}
