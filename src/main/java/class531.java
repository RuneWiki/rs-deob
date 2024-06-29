import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class class531 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Lju;")
    public static class137 field7187 = new class137(2, 4);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "[F")
    public static float[] field7188 = new float[2];

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "[Lrca;")
    public static class481[] field7189 = new class481[50];

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field7191 = 328;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method3013(int arg0) {
        int var1 = -29 / ((73 - arg0) / 46);
        field7187 = null;
        field7189 = null;
        field7188 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([BI)V")
    public abstract void method1503(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)[B")
    public abstract byte[] method1502(int arg0);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)Z")
    public static final boolean method3014(int arg0, boolean arg1) {
        field7190++;
        if (arg1) {
            return true;
        } else {
            return arg0 == 20 || arg0 == 49 || arg0 == 45 || arg0 == 13 || arg0 == 17 || arg0 == 9 || arg0 == 2;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)[B")
    public abstract byte[] method1504(int arg0, int arg1, int arg2);
}
