import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class216 {

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "[Lbe;")
    public static class283[] field3656 = new class283[500];

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Lbe;")
    public static class283 field3660 = class153.method941(127, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Z")
    public static boolean field3662 = true;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field3658 = 0;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Lbe;")
    public static class283 field3668 = class153.method941(127, "blaugr-Un:");

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Lbe;")
    public static class283 field3663 = class153.method941(-86, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "Lbe;")
    private static class283 field3669 = class153.method941(-27, "Please remove ");

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Lbe;")
    public static class283 field3667 = field3669;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lbe;")
    public static class283 field3664 = field3669;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V", line = 17)
    public static void method1424(byte arg0) {
        field3664 = null;
        field3669 = null;
        field3663 = null;
        field3668 = null;
        field3667 = null;
        field3656 = null;
        field3660 = null;
        if (arg0 < 60) {
            field3664 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILbe;)I", line = 44)
    public static final int method1425(int arg0, class283 arg1) {
        field3654++;
        if (arg1.method1925((byte) -44) == 0) {
            return -1;
        }
        int var2 = 17 % ((arg0 + 54) / 57);
        for (int var3 = 0; var3 < class272.field4577.field5069; var3++) {
            if (class272.field4577.field5066[var3].method1923(class121.field2021, (byte) 42, class155.field2548).method1943(arg1, true)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)J", line = 74)
    public static final synchronized long method1426(int arg0) {
        field3657++;
        long var1 = System.currentTimeMillis();
        if (arg0 != 255) {
            return -55L;
        }
        if (var1 < class121.field2015) {
            class114.field1919 += class121.field2015 - var1;
        }
        class121.field2015 = var1;
        return class114.field1919 + var1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)I", line = 96)
    public static final int method1427(int arg0, int arg1) {
        field3655++;
        if (arg1 != -1147987632) {
            field3668 = (class283) null;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)I", line = 107)
    public static final int method1428(int arg0, int arg1) {
        int var2 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
        field3661++;
        if (arg1 > -99) {
            field3667 = (class283) null;
        }
        int var3 = ((var2 & 0xCCCCCCCC) >>> 2) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILek;)V", line = 123)
    public static final void method1429(int arg0, class172 arg1) {
        class10.field86 = arg1;
        class128.field2131 = class10.field86.method1108(4, -90);
        field3659++;
        if (arg0 != 5826) {
            field3658 = -35;
        }
    }
}
