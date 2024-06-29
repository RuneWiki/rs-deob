import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public abstract class class252 {

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field3201 = 0;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field3202 = 0;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "[S")
    public static short[] field3200;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V", line = 11)
    public static void method1572(boolean arg0) {
        if (!arg0) {
            field3200 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZ)[B")
    public abstract byte[] method1570(int arg0, boolean arg1);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)I")
    public abstract int method1571(byte arg0, int arg1);

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(BI)V")
    public abstract void method1573(byte arg0, int arg1);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Ljc;")
    public abstract class480 method1574(int arg0);
}
