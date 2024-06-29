import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class269 extends class71 {

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public volatile int field3930 = -1;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Ljava/lang/String;")
    public volatile String field3928;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Lcf;")
    public static class397 field3929;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "Lcf;")
    public static class397 field3931 = field3929 = new class397(false);

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "[I")
    public static int[] field3934 = new int[16];

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Lfv;")
    public static class718 field3932 = new class718();

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static final void method1824(byte arg0) {
        field3927++;
        for (class272 var1 = (class272) class176.field2411.method3828(96); var1 != null; var1 = (class272) class176.field2411.method3829(-29202)) {
            if (var1.field3953 > 1) {
                var1.field3953 = 0;
                class522.field7265.method3899(-107, var1, ((class558) var1.field3951.field9462.field33).field7758);
                var1.field3951.method3833(20975);
            }
        }
        class284.field4103 = 0;
        class569.field7865 = 0;
        class290.field4161.method3615((byte) -93);
        class560.field7789.method819(23738);
        class176.field2411.method3833(20975);
        class25.field320 = false;
        if (arg0 <= 76) {
            method1824((byte) 39);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Z")
    public static final boolean method1825(int arg0, int arg1) {
        field3933++;
        for (class558 var2 = (class558) class290.field4161.method3618(-110); var2 != null; var2 = (class558) class290.field4161.method3619(0)) {
            if (class131.method825(501, var2.field7754) && (long) arg0 == var2.field7762) {
                return true;
            }
        }
        if (arg1 == 16) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method1826(int arg0) {
        field3934 = null;
        field3929 = null;
        if (arg0 == 16) {
            field3932 = null;
            field3931 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILjava/lang/String;)I")
    public static final int method1827(int arg0, int arg1, String arg2) {
        field3926++;
        return arg0 == 16 ? class493.method2984(arg1, true, arg2, (byte) 90) : -18;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class269(String arg0) {
        this.field3928 = arg0;
    }
}
