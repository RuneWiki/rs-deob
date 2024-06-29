import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class class427 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6003 = new Rectangle[100];

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Z")
    public static boolean field6008 = false;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Lfc;")
    public static class235 field6009 = new class235(73, 0);

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Loaa;")
    public static class260 field6007;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Lxa;")
    public static class461 field6006;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(JI)I")
    public final int method2417(long arg0, int arg1) {
        field6004++;
        long var4 = this.method1061((byte) 73);
        if (var4 > (long) arg1) {
            class419.method2390(102, var4);
        }
        return this.method1059(arg0, 4);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)J")
    public abstract long method1060(int arg0);

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public abstract void method1062(int arg0);

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public static void method2418(int arg0) {
        field6009 = null;
        field6006 = null;
        field6003 = null;
        int var1 = -47 / ((arg0 + 21) / 50);
        field6007 = null;
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)V")
    public static final void method2419(int arg0) {
        class410.field5804 = false;
        field6005++;
        class77.field1056 = null;
        if (arg0 > -113) {
            method2418(79);
        }
        class336.method2026(100);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)J")
    public abstract long method1061(byte arg0);

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(JI)I")
    public abstract int method1059(long arg0, int arg1);
}
