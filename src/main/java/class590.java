import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class590 {

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public int field8391;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "[I")
    public static int[] field8392 = new int[1];

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field8388;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field8389;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field8390;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3312(int arg0, int arg1, byte arg2) {
        if (arg2 > -126) {
            return true;
        } else {
            field8389++;
            return (arg0 & 0x180) != 0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLvj;)I")
    public static final int method3313(byte arg0, class402 arg1) {
        if (arg0 != 71) {
            method3315(7);
        }
        field8388++;
        if (class181.field2225 == arg1) {
            return 6407;
        } else if (class581.field8260 == arg1) {
            return 6408;
        } else if (class595.field8446 == arg1) {
            return 6406;
        } else if (class301.field3936 == arg1) {
            return 6409;
        } else if (class234.field2984 == arg1) {
            return 6410;
        } else if (class624.field8841 == arg1) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)I")
    public final int method3314(byte arg0) {
        if (arg0 == 8) {
            field8393++;
            return this.field8391;
        } else {
            return 96;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method3315(int arg0) {
        if (arg0 != 6409) {
            field8392 = null;
        }
        field8392 = null;
    }

    @OriginalMember(owner = "client!lc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8390++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class590(String arg0, int arg1) {
        this.field8391 = arg1;
    }
}
