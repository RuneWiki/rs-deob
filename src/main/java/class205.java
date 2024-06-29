import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class205 {

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Z")
    public boolean field2732 = true;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field2728 = 0;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "J")
    public static long field2735 = 0L;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "C")
    private char field2731;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public int field2727;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "Lla;")
    public static class319 field2737;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Ljava/lang/String;")
    public String field2729;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLnj;I)V", line = 4)
    private final void method1379(byte arg0, class164 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2731 = class165.method1122((byte) -98, arg1.method1088((byte) 81));
        } else if (arg2 == 2) {
            this.field2727 = arg1.method1099(100);
        } else if (arg2 == 4) {
            this.field2732 = false;
        } else if (arg2 == 5) {
            this.field2729 = arg1.method1064(false);
        }
        field2738++;
        if (arg0 != 43) {
            method1380((byte) 80);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 33)
    public static final void method1380(byte arg0) {
        field2736++;
        if (class268.method1719(true)) {
            if (class470.field7013 == null) {
                class293.method1877(76);
            }
            class178.field2378 = true;
            class146.field1940 = 0;
            try {
                class129.field1744 = class168.field2261.getToolkit().getSystemClipboard();
            } catch (Exception var2) {
            }
        }
        int var1 = 38 % ((-arg0 - 65) / 59);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 57)
    public static void method1381(int arg0) {
        field2737 = null;
        if (arg0 != 5) {
            method1382(-104, -39, (byte) -14);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIB)I", line = 76)
    public static final int method1382(int arg0, int arg1, byte arg2) {
        if (arg1 > arg0) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        field2733++;
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg2 > -72 ? 85 : arg0;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)Z", line = 107)
    public final boolean method1383(int arg0) {
        if (arg0 == 22243) {
            field2734++;
            return this.field2731 == 's';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILnj;)V", line = 126)
    public final void method1384(int arg0, class164 arg1) {
        while (true) {
            int var3 = arg1.method1087(false);
            if (var3 == 0) {
                if (arg0 < 42) {
                    method1381(-69);
                }
                field2730++;
                return;
            }
            this.method1379((byte) 43, arg1, var3);
        }
    }
}
