import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public class class54 {

    @OriginalMember(owner = "client!gja", name = "c", descriptor = "I")
    public int field772 = 128;

    @OriginalMember(owner = "client!gja", name = "f", descriptor = "I")
    public int field775 = 128;

    @OriginalMember(owner = "client!gja", name = "i", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!gja", name = "h", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "client!gja", name = "e", descriptor = "I")
    public int field774;

    @OriginalMember(owner = "client!gja", name = "k", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "Lju;")
    public static class137 field770 = new class137(12, 7);

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!gja", name = "d", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!gja", name = "g", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!gja", name = "j", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(Z)V", line = 3)
    public static void method394(boolean arg0) {
        if (arg0) {
            field770 = null;
        }
    }

    @OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(I)V", line = 92)
    public class54(int arg0) {
        this.field778 = arg0;
    }

    @OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(IIIIII)V", line = 99)
    private class54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field772 = arg1;
        this.field777 = arg5;
        this.field778 = arg0;
        this.field774 = arg3;
        this.field775 = arg2;
        this.field780 = arg4;
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(BJI)Lcl;", line = 19)
    public static final class281 method395(byte arg0, long arg1, int arg2) {
        field771++;
        if (arg0 != -53) {
            return null;
        }
        class281 var4 = (class281) class271.field3794.method337((long) arg2 << 56 | arg1, 1);
        if (var4 == null) {
            var4 = new class281(arg2, arg1);
            class271.field3794.method341(var4.field2528, var4, (byte) 50);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)Lgja;", line = 47)
    public final class54 method396(int arg0) {
        field779++;
        if (arg0 != -2100862536) {
            method395((byte) 105, 101L, 20);
        }
        return new class54(this.field778, this.field772, this.field775, this.field774, this.field780, this.field777);
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(ILgja;)V", line = 59)
    public final void method397(int arg0, class54 arg1) {
        this.field780 = arg1.field780;
        this.field775 = arg1.field775;
        if (arg0 != -2100862536) {
            this.field778 = 47;
        }
        field776++;
        this.field777 = arg1.field777;
        this.field778 = arg1.field778;
        this.field772 = arg1.field772;
        this.field774 = arg1.field774;
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(IIII)V", line = 76)
    public static final void method398(int arg0, int arg1, int arg2, int arg3) {
        field773++;
        if (arg1 <= 32) {
            field770 = null;
        }
        class28 var4 = class378.field5161[arg0][arg3];
        class644.method3578(arg2, var4 == null ? class241.field3435 : var4, (byte) 125);
    }
}
