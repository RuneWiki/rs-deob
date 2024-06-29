import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class171 extends class19 {

    @OriginalMember(owner = "client!t", name = "R", descriptor = "I")
    public int field3287 = 0;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "Lsd;")
    public static class166 field3282 = class135.method935("null", 0);

    @OriginalMember(owner = "client!t", name = "O", descriptor = "[B")
    public static byte[] field3284 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static void method1186(byte arg0) {
        field3282 = null;
        field3284 = null;
        if (arg0 <= 62) {
            method1186((byte) -30);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILff;)V")
    private final void method1187(int arg0, int arg1, class53 arg2) {
        if (arg1 > 61) {
            field3283++;
            if (arg0 == 2) {
                this.field3287 = arg2.method405(2);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILff;)V")
    public final void method1188(int arg0, class53 arg1) {
        if (arg0 != -3993) {
            this.method1187(74, -27, null);
        }
        while (true) {
            int var3 = arg1.method400(arg0 ^ 0xFFFFF098);
            if (var3 == 0) {
                field3286++;
                return;
            }
            this.method1187(var3, 87, arg1);
        }
    }
}
