import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class19 extends class295 {

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "Lsf;")
    public class144 field369;

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "[I")
    public static int[] field370 = new int[500];

    @OriginalMember(owner = "client!ko", name = "G", descriptor = "Laj;")
    public static class71 field374 = new class71(32);

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "[C")
    public static char[] field376 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ko", name = "J", descriptor = "[I")
    public static int[] field377 = new int[128];

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!ko", name = "F", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!ko", name = "K", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!ko", name = "H", descriptor = "Lvm;")
    public static class323 field375;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLrk;)V")
    public static final void method268(byte arg0, class427 arg1) {
        class220.field3038 = arg1;
        if (arg0 == -86) {
            field373++;
        }
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)V")
    public static final void method269(int arg0) {
        class335.field4541 = null;
        field372++;
        if (arg0 == 100) {
            class295.field3976 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(B)V")
    public static void method270(byte arg0) {
        if (arg0 != 105) {
            method269(-114);
        }
        field377 = null;
        field374 = null;
        field375 = null;
        field376 = null;
        field370 = null;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lsf;)V")
    public class19(class144 arg0) {
        this.field369 = arg0;
    }
}
