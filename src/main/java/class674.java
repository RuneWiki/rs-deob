import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class674 {

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "I")
    public int field9478;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "I")
    public int field9480;

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "I")
    public int field9485;

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
    public int field9484;

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "Lrga;")
    public static class280 field9481 = new class280(24, 0);

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "I")
    public static int field9479;

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "I")
    public static int field9483;

    @OriginalMember(owner = "client!lw", name = "i", descriptor = "I")
    public static int field9486;

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "Ljava/lang/String;")
    public static String field9482;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V", line = 3)
    public static void method3783(byte arg0) {
        field9481 = null;
        if (arg0 != -32) {
            field9481 = null;
        }
        field9482 = null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)Llw;", line = 15)
    public final class674 method3784(int arg0, int arg1) {
        if (arg0 == 0) {
            field9483++;
            return new class674(this.field9484, arg1, this.field9485, this.field9478);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(BII)B", line = 34)
    public static final byte method3785(byte arg0, int arg1, int arg2) {
        field9479++;
        if (arg2 == 9) {
            if (arg0 != -74) {
                field9482 = null;
            }
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIII)V", line = 52)
    public static final void method3786(int arg0, int arg1, int arg2, int arg3) {
        field9486++;
        class592 var4 = class61.method371(arg1, arg3, (byte) -18);
        var4.method3256((byte) 11);
        var4.field8312 = arg0;
        var4.field8314 = arg2;
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(IIII)V", line = 69)
    public class674(int arg0, int arg1, int arg2, int arg3) {
        this.field9478 = arg3;
        this.field9480 = arg1;
        this.field9485 = arg2;
        this.field9484 = arg0;
    }
}
