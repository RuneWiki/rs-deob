import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class275 {

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public int field3826;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public int field3830;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public int field3831;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public int field3829;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field3827 = -1;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "Lhda;")
    public static class752 field3834 = new class752(109, 0);

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Lkg;")
    public static class275 field3835 = new class275(6, 0, 4, 2);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "Lwu;")
    public static class376 field3836;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "Lda;")
    public static class60 field3832;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static final void method1650(byte arg0) {
        if (arg0 == -53) {
            field3833++;
            class362.field5097.method561((byte) -78);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
    public static final void method1651(int arg0, int arg1) {
        class758.field10539 = arg1;
        field3825++;
        class120.field1919 = 2;
        if (arg0 != 35) {
            field3832 = null;
        }
        long var2 = 0L;
        if (class677.field9393 == null) {
            class484.method2735(35, (byte) -111);
        } else {
            class677 var4 = new class677(class125.method989(1, class95.method708(256, class677.field9393)));
            long var5 = var4.method3820(1237129056);
            class112.field1856 = var4.method3820(1237129056);
            class121.method976(true, "", (byte) 16, class593.method3226(var5, 13754));
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1652(int arg0, byte arg1, int arg2) {
        field3828++;
        int var3 = -115 % ((arg1 + 74) / 46);
        return (arg0 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method1653(int arg0) {
        field3832 = null;
        field3836 = null;
        field3835 = null;
        field3834 = null;
        int var1 = -102 % ((arg0 - 50) / 38);
    }

    @OriginalMember(owner = "client!kg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3824++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIII)V")
    public class275(int arg0, int arg1, int arg2, int arg3) {
        this.field3826 = arg2;
        this.field3830 = arg3;
        this.field3831 = arg0;
        this.field3829 = arg1;
    }
}
