import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class43 {

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "[[I")
    public static int[][] field707 = new int[104][104];

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Lwa;")
    private static class75 field703 = class66.method560("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", false);

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "Lwa;")
    public static class75 field709 = field703;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Lwa;")
    public static class75 field706 = class66.method560("Gegenstand f-Ur Mitglieder", false);

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Lwa;")
    private static class75 field711 = class66.method560("Drop", false);

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lwa;")
    public static class75 field705 = field711;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "S")
    public static short field712 = 256;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(JI)V", line = 22)
    public static final void method288(long arg0, int arg1) {
        field704++;
        class89.field1470.field1012 = 0;
        class89.field1470.method518(103, 111);
        class89.field1470.method514(arg1 + 30009, arg0);
        class139.field2377 = -3;
        class121.field2034 = 0;
        class252.field4225 = 1;
        class157.field2693 = arg1;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 39)
    public static void method289(int arg0) {
        field711 = null;
        field707 = (int[][]) null;
        field709 = null;
        field706 = null;
        field703 = null;
        field705 = null;
        if (arg0 != 256) {
            field703 = (class75) null;
        }
    }
}
