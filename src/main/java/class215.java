import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class215 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "[S")
    public static short[] field3807 = new short[500];

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Lha;")
    private static class46 field3812 = class271.method1828("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", -46);

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field3813 = 0;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Lha;")
    public static class46 field3814 = field3812;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Lwf;")
    public static class16 field3815 = new class16(260);

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "[I")
    public static int[] field3811;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "[I")
    public static int[] field3816;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "[[Lhi;")
    public static class24[][] field3809;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lmg;I)V")
    public static final void method1509(class275 arg0, int arg1) {
        class251.method1700(200000, (byte) -17, arg0);
        field3817++;
        int var2 = 113 / ((arg1 - 8) / 46);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method1510(int arg0) {
        field3816 = null;
        field3815 = null;
        field3811 = null;
        if (arg0 != 28740) {
            method1510(-76);
        }
        field3812 = null;
        field3814 = null;
        field3807 = null;
        field3809 = null;
    }
}
