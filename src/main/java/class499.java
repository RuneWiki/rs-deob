import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class499 {

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "[J")
    public static long[] field6971 = new long[10];

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!bia", name = "c", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!bia", name = "e", descriptor = "I")
    public int field6974;

    @OriginalMember(owner = "client!bia", name = "f", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!bia", name = "g", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!bia", name = "h", descriptor = "I")
    public int field6977;

    @OriginalMember(owner = "client!bia", name = "i", descriptor = "I")
    public int field6978;

    @OriginalMember(owner = "client!bia", name = "d", descriptor = "Lin;")
    public static class91 field6973;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(ILcea;)V")
    public final void method2943(int arg0, class215 arg1) {
        if (arg0 != 2048) {
            return;
        }
        field6976++;
        while (true) {
            int var3 = arg1.method1535(255);
            if (var3 == 0) {
                return;
            }
            this.method2944(var3, arg1, (byte) 17);
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(ILcea;B)V")
    private final void method2944(int arg0, class215 arg1, byte arg2) {
        field6972++;
        if (arg2 != 17) {
            method2946(-80);
        }
        if (arg0 == 1) {
            this.field6977 = arg1.method1478(842397944);
            this.field6974 = arg1.method1535(255);
            this.field6978 = arg1.method1535(arg2 ^ 0xEE);
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2945(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field6975++;
            return (arg1 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)V")
    public static void method2946(int arg0) {
        if (arg0 != 10) {
            method2945(91, -68, true);
        }
        field6971 = null;
        field6973 = null;
    }
}
