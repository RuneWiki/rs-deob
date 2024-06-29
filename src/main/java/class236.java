import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class236 extends class243 {

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "Z")
    public static boolean field3891 = false;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field3892 = -1;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public int field3895;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "Ljava/lang/String;")
    public String field3894;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "Ljava/lang/String;")
    public String field3896;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lvh;I)V")
    public static final void method1562(class108 arg0, int arg1) {
        ++field3897;
        class58.field1015 = arg0;
        if (arg1 == -25241) {
            class206.field3430 = class58.field1015.method754(-46, 16);
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)Laa;")
    public final class42 method1563(byte arg0) {
        if (arg0 >= -68) {
            this.field3896 = null;
        }
        ++field3890;
        return class203.field3320[super.field3992];
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)V")
    public static final void method1564(int arg0, int arg1, int arg2) {
        if (arg0 != 16) {
            method1564(62, 31, -119);
        }
        ++field3889;
        class55 var3 = class62.method395(12, arg2, (byte) -66);
        var3.method340((byte) -110);
        var3.field947 = arg1;
    }
}
