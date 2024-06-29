import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class435 extends class267 implements class690 {

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    private int field6056;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public static int field6058 = 100;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "Lhk;")
    public static class153 field6061 = new class153(14, 0, 4, 1);

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)I", line = 9)
    public static final int method2594(int arg0, int arg1) {
        if (arg0 != -29742) {
            method2595(-84);
        }
        ++field6060;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Llea;I[BIZ)V", line = 23)
    public class435(class573 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field6056 = arg1;
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)V", line = 33)
    public static void method2595(int arg0) {
        if (arg0 != 1) {
            method2595(-72);
        }
        field6061 = null;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)J", line = 43)
    public final long method2596(int arg0) {
        ++field6054;
        return arg0 != 10385 ? -88L : 0L;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)I", line = 55)
    public final int method2597(byte arg0) {
        ++field6053;
        return arg0 != -79 ? -68 : this.field6056;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(BI)Ldw;", line = 67)
    public static final class589 method2598(byte arg0, int arg1) {
        ++field6062;
        int var2 = 84 % ((-30 - arg0) / 58);
        return new class589(arg1, false);
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V", line = 80)
    public final void method1329(int arg0) {
        ++field6057;
        super.field3780.method3323(this, arg0);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)I", line = 95)
    public final int method2599(int arg0) {
        if (arg0 != 18850) {
            return 28;
        } else {
            ++field6055;
            return super.field3781;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I[BII)V", line = 106)
    public final void method2600(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field6059;
        this.method1715(arg2, arg1, (byte) 67);
        if (arg0 != -8525) {
            field6058 = 106;
        }
        this.field6056 = arg3;
    }
}
