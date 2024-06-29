import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class202 extends class86 {

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
    public int field3444;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    public int field3443;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "Lbe;")
    public static class283 field3442 = class153.method941(125, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "Z")
    public static boolean field3450 = true;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "[[I")
    public static int[][] field3446 = new int[104][104];

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "Lbe;")
    private static class283 field3449 = class153.method941(-55, " ");

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "Lbe;")
    public static class283 field3445 = field3449;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    public static int field3447 = -1;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "[I")
    public static int[] field3448 = new int[64];

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "Lbe;")
    public static class283 field3456 = class153.method941(126, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "Lbe;")
    private static class283 field3455 = class153.method941(126, "shake:");

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "Lbe;")
    public static class283 field3454 = field3455;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "[Lsd;")
    public static class26[] field3459 = new class26[100];

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "Lbe;")
    public static class283 field3457 = field3455;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "[I")
    public static int[] field3451;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method1291(int arg0, byte arg1) {
        field3458++;
        Container var2;
        if (class1.field2 != null) {
            var2 = class1.field2;
        } else if (class164.field2711 == null) {
            var2 = class150.field2460.field4272;
        } else {
            var2 = class164.field2711;
        }
        class1.field1 = var2.getSize().width;
        if (arg1 != 109) {
            method1294((byte) 53);
        }
        class103.field1757 = var2.getSize().height;
        if (class164.field2711 == var2) {
            Insets var3 = class164.field2711.getInsets();
            class103.field1757 -= var3.top + var3.bottom;
            class1.field1 -= var3.left + var3.right;
        }
        if (!class71.field1230 && class1.field2 == null) {
            class115.field1945 = 765;
            class48.field655 = 503;
            class282.field4767 = class46.field634;
            class6.field62 = (class1.field1 - 765) / 2;
        } else {
            class115.field1945 = class1.field1;
            class282.field4767 = class46.field634;
            class48.field655 = class103.field1757 - class46.field634;
            class6.field62 = 0;
        }
        class167.method1028(class115.field1945, class48.field655);
        class264.field4487.setSize(class115.field1945, class48.field655);
        if (class164.field2711 == var2) {
            Insets var4 = class164.field2711.getInsets();
            class264.field4487.setLocation(var4.left + class6.field62, class282.field4767 + var4.top);
        } else {
            class264.field4487.setLocation(class6.field62, class282.field4767);
        }
        if (class82.field1397 != -1) {
            class89.method578((byte) 122, true);
        }
        class6.method34(0);
        if (class251.field4263.startsWith("mac")) {
            class23.field356 = class216.method1426(arg1 ^ 0x92) + ((long) arg0);
        }
        class2.field27 = (long) arg0 + class216.method1426(arg1 + 146);
        if (arg0 == 0 && class263.field4484 != null && (class175.field3019 == 30 || class175.field3019 == 25)) {
            class125.method784(arg1 ^ 0xFFFFD162);
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(IB)Ljj;", line = 81)
    public static final class140 method1292(int arg0, byte arg1) {
        class140 var2 = (class140) class125.field2072.method77((long) arg0, 12);
        field3452++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class57.field787.method1107(class107.method717((byte) -80, arg0), class279.method1863(arg0, 255), 126);
        if (arg1 >= -70) {
            return (class140) null;
        }
        class140 var4 = new class140();
        if (var3 != null) {
            var4.method885(new class229(var3), -1);
        }
        class125.field2072.method85(var4, (long) arg0, (byte) 70);
        return var4;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lui;I)V", line = 104)
    public static final void method1293(class251 arg0, int arg1) {
        field3453++;
        class274 var2 = null;
        int var3 = -63 % ((arg1 + 10) / 48);
        try {
            class310 var4 = arg0.method1704(-127, "runescape");
            while (var4.field5293 == 0) {
                class2.method11((byte) -20, 1L);
            }
            if (var4.field5293 == 1) {
                var2 = (class274) var4.field5296;
                class229 var5 = class171.method1084(true);
                var2.method1840(0, var5.field3879, -8165, var5.field3905);
            }
        } catch (Exception var9) {
        }
        try {
            if (var2 != null) {
                var2.method1843(-128);
            }
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(B)V", line = 149)
    public static void method1294(byte arg0) {
        field3459 = null;
        field3456 = null;
        field3449 = null;
        if (arg0 <= 116) {
            field3456 = (class283) null;
        }
        field3445 = null;
        field3446 = (int[][]) null;
        field3451 = null;
        field3442 = null;
        field3454 = null;
        field3455 = null;
        field3457 = null;
        field3448 = null;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(II)V", line = 171)
    public class202(int arg0, int arg1) {
        this.field3444 = arg1;
        this.field3443 = arg0;
    }
}
