import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class4 {

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public int field29;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lmba;")
    private class643 field23;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "[Lcca;")
    public static class462[] field31 = new class462[75];

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Lgr;")
    public static class530 field28 = new class530(42, 3);

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field33 = 0;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Leg;")
    public static class317 field32;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)V", line = 3)
    public static final void method18(int arg0, byte arg1) {
        field24++;
        class503 var2 = class512.method3112(11, arg0, 0);
        var2.method3074(-96);
        if (arg1 != 105) {
            method19(-85);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 21)
    public static void method19(int arg0) {
        field28 = null;
        field31 = null;
        int var1 = 96 / ((arg0 - 9) / 50);
        field32 = null;
    }

    @OriginalMember(owner = "client!ob", name = "finalize", descriptor = "()V", line = 32)
    protected final void finalize() throws Throwable {
        field27++;
        this.field23.method3710(this.field29, (byte) 63);
        super.finalize();
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lmba;II)V", line = 43)
    public class4(class643 arg0, int arg1, int arg2) {
        this.field29 = arg2;
        this.field23 = arg0;
    }
}
