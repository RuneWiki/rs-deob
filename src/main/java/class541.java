import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class541 extends class481 {

    @OriginalMember(owner = "client!paa", name = "z", descriptor = "I")
    public int field7757 = (int) (class84.method550((byte) -115) / 1000L);

    @OriginalMember(owner = "client!paa", name = "x", descriptor = "S")
    public short field7755;

    @OriginalMember(owner = "client!paa", name = "v", descriptor = "Ljava/lang/String;")
    public String field7753;

    @OriginalMember(owner = "client!paa", name = "u", descriptor = "I")
    public static int field7752 = 0;

    @OriginalMember(owner = "client!paa", name = "A", descriptor = "Lea;")
    public static class474 field7758 = new class474("M", "M", "M", "M");

    @OriginalMember(owner = "client!paa", name = "D", descriptor = "Z")
    public static boolean field7761 = false;

    @OriginalMember(owner = "client!paa", name = "E", descriptor = "[Lor;")
    public static class557[] field7762 = new class557[4];

    @OriginalMember(owner = "client!paa", name = "w", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!paa", name = "y", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!paa", name = "B", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!paa", name = "C", descriptor = "I")
    public static int field7760;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Ljava/lang/String;II)I", line = 3)
    public static final int method3142(String arg0, int arg1, int arg2) {
        field7760++;
        return arg2 == 0 ? class149.method882(arg1, (byte) 120, true, arg0) : 8;
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(B)V", line = 16)
    public static void method3143(byte arg0) {
        if (arg0 != -54) {
            field7762 = null;
        }
        field7758 = null;
        field7762 = null;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IBI)Lrc;", line = 27)
    public static final class467 method3144(int arg0, byte arg1, int arg2) {
        field7759++;
        class467 var3 = (class467) class254.field3619.method524((byte) 86, (long) arg0 | (long) arg2 << 32);
        if (arg1 >= -85) {
            return null;
        }
        if (var3 == null) {
            var3 = new class467(arg2, arg0);
            class254.field3619.method520((byte) -75, var3, var3.field4676);
        }
        return var3;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILqd;III)V", line = 47)
    public static final void method3145(int arg0, class385 arg1, int arg2, int arg3, int arg4) {
        field7754++;
        if (arg3 != 842072393) {
            method3142(null, -59, -87);
        }
        for (class588 var5 = (class588) class278.field3884.method719(false); var5 != null; var5 = (class588) class278.field3884.method716(14)) {
            if (var5.field8456 == arg0 && (arg2 << 9) == var5.field8462 && (arg4 << 9) == var5.field8452 && var5.field8445.field5810 == arg1.field5810) {
                if (var5.field8455 != null) {
                    class44.field469.method934(var5.field8455);
                    var5.field8455 = null;
                }
                if (var5.field8457 != null) {
                    class44.field469.method934(var5.field8457);
                    var5.field8457 = null;
                }
                var5.method2108(true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 90)
    public class541(String arg0, int arg1) {
        this.field7755 = (short) arg1;
        this.field7753 = arg0;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIIIZ)V", line = 100)
    public static final void method3146(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field7756++;
        class467 var5 = method3144(arg1, (byte) -110, 8);
        var5.method2851(arg4);
        var5.field6930 = arg2;
        var5.field6925 = arg0;
        var5.field6926 = arg3;
    }
}
