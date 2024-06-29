import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class30 extends class67 {

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "Ltd;")
    public static class176 field568 = new class176(64);

    @OriginalMember(owner = "client!d", name = "C", descriptor = "[I")
    public static int[] field569 = new int[2000];

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "Ljava/lang/String;")
    public static String field571;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "[I")
    public static int[] field573;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "[S")
    public static short[] field570;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static void method157(byte arg0) {
        field570 = null;
        field569 = null;
        field568 = null;
        if (arg0 != 105) {
            method161(2, -95);
        }
        field571 = null;
        field573 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLpa;Z)V")
    public static final void method158(byte arg0, class137 arg1, boolean arg2) {
        int var3 = arg1.field2850;
        field565++;
        int var4 = (int) arg1.field1353;
        arg1.method417(-84);
        if (arg2) {
            class54.method327(var3, false);
        }
        if (arg0 > -70) {
            method161(43, -48);
        }
        class158.method997(1616457584, var3);
        class129 var5 = class124.method801((byte) -36, var4);
        if (var5 != null) {
            class43.method265(false, var5);
        }
        class41.field799 = 0;
        class186.field3665 = false;
        class200.method1306(class103.field1963, field574, class125.field2474, class158.field3200, 0);
        if (class187.field3666 != -1) {
            class67.method416((byte) -94, 1, class187.field3666);
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
    public class30() {
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZJ)V")
    public static final void method159(boolean arg0, long arg1) {
        if (arg0) {
            field569 = null;
        }
        field563++;
        if (arg1 != 0L) {
            class88.field1709++;
            class29.field522.method338(253, 190);
            class29.field522.method550(-121, arg1);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)Z")
    public static final boolean method160(byte arg0, int arg1) {
        field566++;
        if (arg0 != -55) {
            method160((byte) -109, 106);
        }
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I)V")
    public class30(int arg0) {
        this.field564 = arg0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Led;")
    public static final class43 method161(int arg0, int arg1) {
        if (arg1 != 10) {
            field573 = null;
        }
        field561++;
        return class136.method883(arg0, (byte) 53, false, 10);
    }
}
