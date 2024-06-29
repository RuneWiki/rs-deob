import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class230 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "[I")
    private int[] field3643;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "[I")
    public static int[] field3645 = new int[128];

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Z")
    public static boolean field3649 = false;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Lok;")
    public static class41 field3650 = class137.method956("<br>", 45);

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)Lok;", line = 8)
    public static final class41 method1645(int arg0, byte arg1) {
        class41 var2 = new class41();
        if (arg1 >= -113) {
            method1647(-46, 44, -83);
        }
        field3644++;
        var2.field660 = new byte[arg0];
        var2.field617 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 24)
    public static void method1646(int arg0) {
        field3645 = null;
        if (arg0 <= 80) {
            method1647(-67, -27, 122);
        }
        field3650 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)I", line = 39)
    public static final int method1647(int arg0, int arg1, int arg2) {
        field3647++;
        int var3 = class156.method1114(arg0 - 1, true, arg2 - arg1) + class156.method1114(arg0 + 1, true, arg2 - 1) + class156.method1114(arg0 + -1, true, arg2 - -1) + class156.method1114(arg0 + 1, true, arg2 + 1);
        int var4 = class156.method1114(arg0 - 1, true, arg2) - (-class156.method1114(arg0 + 1, true, arg2) - class156.method1114(arg0, true, arg2 - 1) - class156.method1114(arg0, true, arg2 + 1));
        int var5 = class156.method1114(arg0, true, arg2);
        return var3 / 16 + var5 / 4 + (var4 / 8);
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "([I)V", line = 57)
    public class230(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field3643 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3643[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3643[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field3643[var5 + var5] = arg0[var4];
            this.field3643[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(IB)I", line = 93)
    public static final int method1648(int arg0, byte arg1) {
        field3646++;
        if (arg1 >= -41) {
            method1646(-115);
        }
        return (arg0 & 0x1F1FC2) >> 18;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)I", line = 121)
    public final int method1649(int arg0, int arg1) {
        if (arg0 > -85) {
            method1648(-60, (byte) -88);
        }
        int var3 = (this.field3643.length >> 1) - 1;
        field3648++;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field3643[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3643[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }
}
