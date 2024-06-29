import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class64 {

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public int field1594;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public int field1588;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "[Lid;")
    public static class60[] field1590 = new class60[500];

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "[I")
    public static int[] field1593 = new int[2000];

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Lid;")
    private static class60 field1597 = class11.method72("This world is running a closed Beta)3", (byte) 103);

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field1596 = 0;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "[I")
    public static int[] field1602 = new int[128];

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Lid;")
    public static class60 field1595 = class11.method72("::noclip", (byte) -16);

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field1604 = 0;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Lid;")
    public static class60 field1592 = class11.method72("lila:", (byte) -66);

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Lid;")
    public static class60 field1598 = class11.method72("<col=ff0000>", (byte) 127);

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "Lid;")
    public static class60 field1605 = class11.method72("Bitte benutzen Sie eine andere Welt)3", (byte) -88);

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field1600 = 0;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public static int field1608 = 0;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Lid;")
    public static class60 field1603 = field1597;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Ldf;")
    public static class28 field1587;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "[I")
    public static int[] field1606;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILae;BII)V")
    public static final void method493(int arg0, int arg1, class6 arg2, byte arg3, int arg4, int arg5) {
        field1591++;
        if (arg2 == null) {
            return;
        }
        int var6 = class157.field3590 + class151.field3394 & 0x7FF;
        int var7 = arg4 * arg4 + arg5 * arg5;
        if (var7 > 6400) {
            return;
        }
        int var8 = 24 % ((arg3 + 50) / 46);
        int var9 = class127.field2900[var6];
        int var10 = var9 * 256 / (class145.field3271 + 256);
        int var11 = class127.field2899[var6];
        int var12 = var11 * 256 / (class145.field3271 + 256);
        int var13 = arg5 * var12 - arg4 * var10 >> 16;
        int var14 = arg4 * var12 + arg5 * var10 >> 16;
        if (var7 > 2500) {
            arg2.method27(class50.field1274, arg1 + var14 + 94 + 4 - arg2.field88 / 2, -(arg2.field93 / 2) + -4 + -var13 + arg0 + 83);
        } else {
            arg2.method29(arg1 + var14 + 4 + 94 - arg2.field88 / 2, arg0 + 83 - (var13 - -(arg2.field93 / 2)) - 4);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method494(int arg0) {
        field1606 = null;
        if (arg0 != 31336) {
            method493(18, -103, null, (byte) 72, -28, -67);
        }
        field1595 = null;
        field1593 = null;
        field1602 = null;
        field1590 = null;
        field1603 = null;
        field1597 = null;
        field1605 = null;
        field1592 = null;
        field1598 = null;
        field1587 = null;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    public class64() {
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Ljb;)V")
    public class64(class64 arg0) {
        this.field1589 = arg0.field1589;
        this.field1594 = arg0.field1594;
        this.field1588 = arg0.field1588;
        this.field1601 = arg0.field1601;
    }
}
