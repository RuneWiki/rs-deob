import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class688 {

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
    public static int field9759 = -1;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "[I")
    public static int[] field9766 = new int[1];

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field9761;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public static int field9762;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field9763;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
    public static int field9764;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public static int field9765;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "[[Lkp;")
    public static class507[][] field9760;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
    public static final void method3875(int arg0) {
        for (int var1 = 0; var1 < class470.field5974; var1++) {
            int var3 = class153.field1958[var1];
            class206 var4 = (class206) class180.field2318.method399(-32748, (long) var3);
            if (var4 != null) {
                class307 var5 = var4.field2618;
                class422.method2243(var5, var5.field3902.field8210, 0);
            }
        }
        field9763++;
        int var2 = -102 / ((61 - arg0) / 63);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)V")
    public static void method3876(byte arg0) {
        field9766 = null;
        field9760 = null;
        if (arg0 != 121) {
            field9759 = 68;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)I")
    public static int method3877(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)V")
    public static final void method3878(boolean arg0) {
        field9762++;
        if (!arg0) {
            field9766 = null;
        }
        if (!class271.method1560(18403)) {
            return;
        }
        if (class329.field4194 == null) {
            class507.method2737(93);
        }
        class516.field7044 = true;
        class20.field311 = 0;
    }

    @OriginalMember(owner = "client!mv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9765++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IB)I")
    public static final int method3879(int arg0, byte arg1) {
        if (arg1 < 99) {
            return 14;
        } else {
            field9764++;
            return (arg0 & 0x3F93F) >> 11;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "()V")
    public static final void method3880() {
        class440.method2337(1, class391.field4927);
    }
}
