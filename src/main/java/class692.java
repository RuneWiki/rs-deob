import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public abstract class class692 {

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "Llea;")
    public class573 field9753;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "Ljava/lang/String;")
    public static String field9757 = null;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "F")
    public static float field9755;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
    public static int field9754;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
    public static int field9756;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V", line = 8)
    public static void method3889(int arg0) {
        if (arg0 == 22261) {
            field9757 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Llea;)V", line = 17)
    public class692(class573 arg0) {
        this.field9753 = arg0;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIB)Z", line = 28)
    public static final boolean method3890(int arg0, int arg1, byte arg2) {
        field9754++;
        if (arg2 <= 35) {
            field9757 = null;
        }
        return (class219.method1510(84, arg1, arg0) | class289.method1825(arg0, arg1, -111) | class356.method2149(arg0, arg1, (byte) 99)) & class18.method177(75, arg1, arg0);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V")
    public abstract void method1111(byte arg0);

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILfga;I)V")
    public abstract void method1119(int arg0, class377 arg1, int arg2);

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZI)V")
    public abstract void method1118(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZB)V")
    public abstract void method1117(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IZI)V")
    public abstract void method1113(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)Z")
    public abstract boolean method1112(int arg0);
}
