import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "[J")
    public static long[] field82 = new long[100];

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Lva;")
    private static class121 field88 = class107.method797("skill)2", -10983);

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "Lva;")
    public static class121 field86 = class107.method797("cross", -10983);

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field90 = 0;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "[Lbe;")
    public static class12[] field85 = new class12[256];

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "[I")
    public static int[] field80 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lva;")
    public static class121 field92 = field88;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Lva;")
    private static class121 field91 = class107.method797("This world is full)3", -10983);

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Lva;")
    public static class121 field87 = field91;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lw;")
    public static class125 field79;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Lwd;")
    public static class129 field89;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Lge;", line = 3)
    public static final class41 method33(int arg0, int arg1) {
        field84++;
        class41 var2 = (class41) class58.field1355.method345(107, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class85.field1955.method315(12, true, arg1);
        if (arg0 != 9) {
            method33(-52, 95);
        }
        class41 var4 = new class41();
        if (var3 != null) {
            var4.method276(new class113(var3), 115);
        }
        var4.method278(arg0 + 96);
        class58.field1355.method350((byte) 123, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBI)Z", line = 29)
    public static final boolean method34(int arg0, byte arg1, int arg2) {
        if (arg1 > 0) {
            field91 = null;
        }
        field83++;
        if (arg2 == 0 && class127.field2915 == arg0) {
            return true;
        } else if (arg2 == 1 && class116.field2641 == arg0) {
            return true;
        } else {
            return (arg2 == 2 || arg2 == 3) && class21.field569 == arg0;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 50)
    public static void method35(int arg0) {
        field82 = null;
        field89 = null;
        field91 = null;
        field85 = null;
        field87 = null;
        field88 = null;
        field86 = null;
        field92 = null;
        field79 = null;
        field80 = null;
        if (arg0 != 1) {
            method35(54);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILhe;I)Z", line = 71)
    public static final boolean method36(int arg0, int arg1, class47 arg2, int arg3) {
        field81++;
        if (arg1 != 29066) {
            field82 = null;
        }
        byte[] var4 = arg2.method315(arg3, true, arg0);
        if (var4 == null) {
            return false;
        } else {
            class69.method485(arg1 - 4559, var4);
            return true;
        }
    }
}
