import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class128 extends class324 {

    @OriginalMember(owner = "client!di", name = "q", descriptor = "B")
    public byte field2104 = 5;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "Lhda;")
    public static class752 field2103 = new class752(88, 4);

    @OriginalMember(owner = "client!di", name = "C", descriptor = "Lhda;")
    public static class752 field2116 = new class752(14, 6);

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public int field2107;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public int field2110;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public int field2111;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    public int field2112;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    public int field2113;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "I")
    public int field2115;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "Llg;")
    public static class417 field2105;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "Z")
    public boolean field2114;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
    public static void method1011(int arg0) {
        field2105 = null;
        field2116 = null;
        if (arg0 != -4400) {
            field2105 = null;
        }
        field2103 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1012(int arg0, byte arg1, int arg2) {
        field2106++;
        if (arg1 < 67) {
            method1011(105);
        }
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method1013(String arg0, byte arg1) {
        field2108++;
        return arg1 >= -123 ? false : class271.field3787.containsKey(arg0);
    }
}
