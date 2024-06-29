import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class522 extends class281 {

    @OriginalMember(owner = "client!iaa", name = "x", descriptor = "[B")
    public byte[] field7159;

    @OriginalMember(owner = "client!iaa", name = "y", descriptor = "Lhv;")
    public static class546 field7160 = new class546(5, 1);

    @OriginalMember(owner = "client!iaa", name = "A", descriptor = "Lmga;")
    public static class739 field7162 = new class739(22, 1);

    @OriginalMember(owner = "client!iaa", name = "B", descriptor = "Ljw;")
    public static class581 field7163 = new class581(26, -1);

    @OriginalMember(owner = "client!iaa", name = "D", descriptor = "Z")
    public static boolean field7164 = true;

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "F")
    public static float field7161;

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "(B)V")
    public static void method3015(byte arg0) {
        field7163 = null;
        int var1 = 70 / ((arg0 + 77) / 34);
        field7162 = null;
        field7160 = null;
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "([B)V")
    public class522(byte[] arg0) {
        this.field7159 = arg0;
    }
}
