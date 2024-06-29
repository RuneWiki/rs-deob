import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class199 {

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "B")
    private byte field2649;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public int field2646;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public int field2642;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public int field2651;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public int field2645;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public int field2648;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field2653 = 0;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2654 = "Take";

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "Lvj;")
    public static class177 field2644;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static final void method1180(int arg0) {
        field2643++;
        class212.field2844 = arg0;
        class321.field4726.method335((byte) 63);
        class2.field26 = false;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V")
    public static final void method1181(int arg0, int arg1, int arg2) {
        field2650++;
        class28.field399 = arg0 - class293.field4205;
        if (arg1 != 1) {
            method1182((byte) 127);
        }
        class135.field1874 = arg2 - class293.field4197;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public static void method1182(byte arg0) {
        field2644 = null;
        field2654 = null;
        if (arg0 > -104) {
            field2653 = 81;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)I")
    public final int method1183(int arg0) {
        field2647++;
        if (arg0 != 8) {
            this.field2649 = -18;
        }
        return (this.field2649 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
    public class199() {
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lmp;IIII)V")
    public static final void method1184(class21 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class282.method1942(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class104.field1436) {
            class282.method1942(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class282.method1942(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class214.field2858) {
            class282.method1942(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class214.field2858) {
            class282.method1942(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class104.field1436 && arg4 <= class214.field2858) {
            class282.method1942(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class282.method1942(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class104.field1436 && arg4 > 0) {
            class282.method1942(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)I")
    public final int method1185(int arg0) {
        if (arg0 >= -56) {
            return 13;
        } else {
            field2652++;
            return this.field2649 & 0x7;
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lnj;)V")
    public class199(class228 arg0) {
        this.field2649 = arg0.method1349(3);
        this.field2646 = arg0.method1343(255);
        this.field2642 = arg0.method1344((byte) 93);
        this.field2651 = arg0.method1344((byte) 80);
        this.field2645 = arg0.method1344((byte) 124);
        this.field2648 = arg0.method1344((byte) 88);
    }
}
