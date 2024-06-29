import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class224 extends class177 {

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "[I")
    public static int[] field3941 = new int[500];

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field3940 = 0;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Lid;")
    public static class149 field3943 = class60.method382("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", (byte) 126);

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field3939 = 0;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lid;")
    public static class149 field3936 = class60.method382(" (X", (byte) 27);

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field3944 = 0;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Leg;")
    public static class225 field3938;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public static void method1504(int arg0) {
        field3936 = null;
        field3941 = null;
        if (arg0 == 0) {
            field3943 = null;
            field3938 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public static final void method1505(int arg0) {
        int var1 = class94.method687(0);
        if (arg0 != 512) {
            field3936 = null;
        }
        field3942++;
        if (var1 == 0) {
            class135.field2449 = null;
            class236.method1596((byte) -39, 0);
        } else if (var1 == 1) {
            class90.method665(60, (byte) 0);
            class236.method1596((byte) -39, 512);
            class237.method1605(73);
        } else {
            class90.method665(72, (byte) (class86.field1567 - 4 & 0xFF));
            class236.method1596((byte) -39, 2);
        }
    }
}
