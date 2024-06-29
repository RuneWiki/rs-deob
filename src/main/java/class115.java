import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class115 extends class182 {

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "[B")
    public byte[] field2138;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "[I")
    public static int[] field2142 = new int[25];

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
    public static int field2143 = 1;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    public static int field2140 = 10;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "Z")
    public static boolean field2137 = false;

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "Lkh;")
    private static class117 field2148 = class224.method1450((byte) 120, "slide:");

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "Lkh;")
    public static class117 field2144 = field2148;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "Lkh;")
    public static class117 field2147 = field2148;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "Lah;")
    public static class9 field2141;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)V")
    public static void method766(boolean arg0) {
        field2141 = null;
        field2148 = null;
        field2147 = null;
        field2144 = null;
        field2142 = null;
        if (arg0) {
            method767();
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V")
    public static final void method767() {
        for (int var0 = 0; var0 < class5.field76; var0++) {
            class57 var1 = class159.field2912[var0];
            class228.method1480(var1);
            class159.field2912[var0] = null;
        }
        class5.field76 = 0;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)[Lo;")
    public static final class153[] method768(int arg0) {
        field2136++;
        if (arg0 <= 29) {
            field2148 = null;
        }
        class153[] var1 = new class153[class203.field3668];
        for (int var2 = 0; var2 < class203.field3668; var2++) {
            var1[var2] = new class153(class106.field1934, class199.field3582, class100.field1827[var2], class106.field1927[var2], class204.field3690[var2], class11.field376[var2], class105.field1921[var2], class122.field2287);
        }
        class45.method376(5851);
        return var1;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "([B)V")
    public class115(byte[] arg0) {
        this.field2138 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I")
    public static final int method769(int arg0, int arg1) {
        field2145++;
        if (arg1 != -17516) {
            method769(-43, -67);
        }
        return arg0 & 0x3FF;
    }
}
