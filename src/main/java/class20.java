import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class20 {

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Lrn;")
    public static class633 field184 = new class633(83, 8);

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field189 = 0;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field186 = 0;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field185 = -1;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "[F")
    public static float[] field187 = new float[16];

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field190 = -1;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "F")
    public static float field188;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I", line = 3)
    public static final int method87(int arg0, int arg1) {
        field178++;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            if (arg1 != 6409) {
                method91((byte) -91);
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 40)
    public static void method88(int arg0) {
        field187 = null;
        int var1 = -38 % ((67 - arg0) / 59);
        field184 = null;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)V", line = 51)
    public static final void method89(int arg0, int arg1) {
        field181++;
        class614 var2 = class497.method2759(arg1, 5977, (long) arg0);
        var2.method3279(false);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)I", line = 62)
    public final int method90(int arg0, int arg1, int arg2) {
        field179++;
        int var4 = class463.field6021 > arg0 ? class463.field6021 : arg0;
        if (class213.field2925 == this) {
            return 0;
        } else if (class170.field2258 == this) {
            return var4 - arg1;
        } else {
            int var5 = -94 / ((arg2 - 56) / 40);
            return class589.field7472 == this ? (var4 - arg1) / 2 : 0;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V", line = 86)
    public static final void method91(byte arg0) {
        field182++;
        class614 var1 = class497.method2759(15, 5977, 0L);
        if (arg0 != -84) {
            field187 = null;
        }
        var1.method3279(false);
    }

    @OriginalMember(owner = "client!dg", name = "toString", descriptor = "()Ljava/lang/String;", line = 104)
    public final String toString() {
        field183++;
        throw new IllegalStateException();
    }
}
