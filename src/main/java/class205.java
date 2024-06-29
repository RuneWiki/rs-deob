import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public abstract class class205 {

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "Lkg;")
    public static class275 field2725 = new class275(99, 17);

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "Lde;")
    public static class534 field2726 = new class534(64);

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)V", line = 14)
    public static void method1328(byte arg0) {
        int var1 = 14 % ((51 - arg0) / 49);
        field2726 = null;
        field2725 = null;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)J")
    public abstract long method1327(int arg0);
}
