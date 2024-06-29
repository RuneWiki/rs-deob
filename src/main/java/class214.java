import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class214 extends class221 {

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "[I")
    public static int[] field3648 = new int[200];

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public int field3644;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public int field3645;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public int field3647;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public int field3651;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "Lmn;")
    public static class162 field3646;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "Lkj;")
    public class55 field3650;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIILds;)V")
    public static final void method1585(int arg0, int arg1, int arg2, class12 arg3) {
        class409 var4 = class207.method1413(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field6176 = arg3;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BII)I")
    public static final int method1586(byte arg0, int arg1, int arg2) {
        field3649++;
        int var3 = arg2 - 1 & arg1 >> 31;
        return arg0 <= 13 ? -127 : ((arg1 >>> 31) + arg1) % arg2 + var3;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
    public static void method1587(int arg0) {
        field3646 = null;
        if (arg0 != -15589) {
            method1587(-58);
        }
        field3648 = null;
    }
}
