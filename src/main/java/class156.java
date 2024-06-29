import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public abstract class class156 {

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "[Lvb;")
    public static class60[] field2539 = new class60[4];

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field2540 = 0;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Lqh;")
    public static class201 field2533;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public abstract void method401(byte arg0);

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILog;)V")
    public static final void method1096(int arg0, class221 arg1) {
        field2534++;
        if (arg0 >= -22) {
            field2540 = 108;
        }
        for (int var2 = 0; var2 < class205.field3288; var2++) {
            int var3 = arg1.method1528(19380);
            int var4 = arg1.method1521((byte) 113);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class48.field863[var3] != null) {
                class48.field863[var3].field1500 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I[BII)I")
    public static final int method1097(int arg0, byte[] arg1, int arg2, int arg3) {
        field2536++;
        int var4 = -1;
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ class25.field409[(arg1[var5] ^ var4) & 0xFF];
        }
        return arg3 == -21780 ? ~var4 : 8;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BII)I")
    public abstract int method402(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V")
    public static void method1098(byte arg0) {
        field2533 = null;
        if (arg0 == -81) {
            field2539 = null;
        }
    }
}
