import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class106 extends class203 {

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "Lmh;")
    public static class62 field1725 = class201.method1405(true, ")2");

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "Z")
    public static boolean field1728 = false;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V", line = 7)
    public static void method823(int arg0) {
        field1725 = null;
        if (arg0 != -2947) {
            method824(-91, (class62) null, -95);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILmh;I)V", line = 18)
    public static final void method824(int arg0, class62 arg1, int arg2) {
        field1726++;
        class151 var3 = class165.method1194((byte) 1, arg0, arg2);
        var3.method1088(arg0 ^ 0x7E);
        var3.field2384 = arg1;
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(B)V", line = 31)
    public static final void method825(byte arg0) {
        field1729++;
        class42.field636.method1392(0);
        class165.field2677.method1392(arg0 + 40);
        if (arg0 != -40) {
            method824(-19, (class62) null, 1);
        }
        class294.field5004.method1392(0);
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)Z")
    public abstract boolean method15(int arg0);

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method16(byte arg0);
}
