import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class366 extends class5 {

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    private int field4653;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "Lki;")
    public static class320 field4651 = new class320();

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field4658 = 1400;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field4660 = null;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "Llf;")
    public static class676 field4657;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILes;I)V", line = 3)
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (arg0 == 1) {
            if (~arg2 == -1) {
                this.field4653 = (arg1.method3501(-9268) << 12) / 255;
            }
            ++field4654;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLes;)Lmk;", line = 31)
    public static final class506 method2005(byte arg0, class630 arg1) {
        if (arg0 < 102) {
            method2006(-107, (class272) null);
        }
        ++field4656;
        int var2 = arg1.method3470(13111);
        return new class506(var2);
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V", line = 44)
    public class366() {
        this(4096);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)[I", line = 48)
    public final int[] method39(int arg0, int arg1) {
        ++field4652;
        int var3 = 10 / ((arg0 - 81) / 36);
        int[] var4 = super.field126.method3280(arg1, true);
        if (super.field126.field8392) {
            class293.method1642(var4, 0, class657.field9287, this.field4653);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V", line = 77)
    public class366(int arg0) {
        super(0, true);
        this.field4653 = 4096;
        this.field4653 = arg0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILi;)V", line = 85)
    public static final void method2006(int arg0, class272 arg1) {
        class491.field6485[arg0] = arg1;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)I", line = 88)
    public static final int method2007(int arg0, int arg1) {
        if (arg0 != 255) {
            method2007(-64, -57);
        }
        ++field4655;
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V", line = 101)
    public static void method2008(boolean arg0) {
        field4657 = null;
        field4651 = null;
        field4660 = null;
        if (arg0) {
            method2008(false);
        }
    }
}
