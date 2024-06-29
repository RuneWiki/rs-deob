import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class class323 {

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field4401 = 0;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field4403 = 0;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lin;III)V", line = 5)
    public static final void method1936(class78 arg0, int arg1, int arg2, int arg3) {
        class467.field6425 = arg1;
        class565.field7638 = arg0;
        if (arg2 >= -106) {
            method1937(68);
        }
        class546.field7398 = arg3;
        field4402++;
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V", line = 19)
    public static final void method1937(int arg0) {
        class685.field9772 = arg0;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public abstract void method1934(int arg0);

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
    public abstract void method1935(int arg0);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II[BI)V")
    public abstract void method1938(int arg0, int arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II[BB)I")
    public abstract int method1939(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Z")
    public abstract boolean method1940(int arg0, int arg1) throws IOException;
}
