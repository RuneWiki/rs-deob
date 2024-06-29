import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class355 {

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public int field4992 = 128;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public int field4996 = 128;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public int field5002;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public int field5004;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public int field5005;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public int field4990;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field5003 = 1;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public int field4989;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public int field4993;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public int field4999;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public int field5000;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public int field5001;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Lrd;")
    public final class355 method2256(byte arg0) {
        int var2 = -69 / ((arg0 - 44) / 59);
        field4995++;
        return new class355(this.field5002, this.field4996, this.field4992, this.field5004, this.field5005, this.field4990);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method2257(int arg0) {
        field4998++;
        class225.method1539(false, 11);
        class749.method4170(-127);
        System.gc();
        if (arg0 <= 84) {
            field4991 = -73;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lrd;I)V")
    public final void method2258(class355 arg0, int arg1) {
        this.field4992 = arg0.field4992;
        this.field4990 = arg0.field4990;
        field4997++;
        this.field5005 = arg0.field5005;
        this.field5002 = arg0.field5002;
        this.field5004 = arg0.field5004;
        this.field4996 = arg0.field4996;
        if (arg1 >= -99) {
            method2257(-11);
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(I)V")
    public class355(int arg0) {
        this.field5002 = arg0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZIIZII)V")
    public static final void method2259(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field4994++;
        if ((arg4 ? class21.field353.field10094.method2896(-109) : class21.field353.field10061.method2896(-33)) != 0 && arg6 != 0 && class565.field8020 < 50 && arg5 != -1) {
            class262.field3842[class565.field8020++] = new class481((byte) (arg4 ? 3 : 2), arg5, arg6, arg3, arg2, 0, arg0, null);
        }
        if (!arg1) {
            method2257(27);
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(IIIIII)V")
    private class355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5004 = arg3;
        this.field4992 = arg2;
        this.field5002 = arg0;
        this.field5005 = arg4;
        this.field4990 = arg5;
        this.field4996 = arg1;
    }
}
