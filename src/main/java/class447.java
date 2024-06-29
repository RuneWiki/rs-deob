import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class class447 {

    @OriginalMember(owner = "client!ika", name = "b", descriptor = "Lbu;")
    public static class21 field6090 = new class21(93, 6);

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!ika", name = "c", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!ika", name = "d", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!ika", name = "e", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(I)V")
    public static final void method2663(int arg0) {
        class652 var1 = class670.field9316;
        synchronized (class670.field9316) {
            class670.field9316.method3743(8);
        }
        field6089++;
        class652 var2 = class640.field8972;
        synchronized (class640.field8972) {
            class640.field8972.method3743(8);
            if (arg0 != Integer.MIN_VALUE) {
                method2666(-24, 46, false);
            }
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(Lha;BI)Lie;")
    public static final class6 method2664(class65 arg0, byte arg1, int arg2) {
        field6092++;
        class717 var3 = class58.method395(arg2, true, arg0, true);
        if (arg1 != -124) {
            field6090 = null;
        }
        return var3 == null ? null : var3.field9943;
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(II)I")
    public static final int method2665(int arg0, int arg1) {
        if (arg0 == -29242421) {
            field6093++;
            return arg1 >> 11 & 0x7F;
        } else {
            return 114;
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(IIZ)Lsw;")
    public static final class787 method2666(int arg0, int arg1, boolean arg2) {
        field6091++;
        long var3 = (long) (arg0 | (arg2 ? Integer.MIN_VALUE : 0));
        if (arg1 != Integer.MIN_VALUE) {
            field6090 = null;
        }
        return (class787) class220.field3409.method2242(var3, -1);
    }

    @OriginalMember(owner = "client!ika", name = "b", descriptor = "(I)V")
    public static void method2667(int arg0) {
        if (arg0 == -22866) {
            field6090 = null;
        }
    }
}
