import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class36 extends class57 {

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    private final int field661;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    private final int field667;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    private final int field665;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    private final int field669;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Lok;")
    public static class146 field658 = class235.method1724(-12908, "Kampfstufe: ");

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "[Lok;")
    public static class146[] field666 = new class146[200];

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "[F")
    public static float[] field660 = new float[4];

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "Loh;")
    public static class15 field668;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "[[I")
    public static int[][] field670;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 11)
    public static void method257(int arg0) {
        field660 = null;
        field668 = null;
        if (arg0 < -84) {
            field666 = null;
            field658 = null;
            field670 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(IIIIII)V", line = 25)
    public class36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field661 = arg2;
        this.field667 = arg1;
        this.field665 = arg0;
        this.field669 = arg3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BII)V", line = 38)
    public final void method258(byte arg0, int arg1, int arg2) {
        if (arg0 != -27) {
            this.method258((byte) 1, 110, -110);
        }
        field659++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V", line = 52)
    public final void method259(int arg0, int arg1, int arg2) {
        field663++;
        int var4 = this.field665 * arg1 >> 12;
        if (arg0 != -27128) {
            method257(-126);
        }
        int var5 = this.field661 * arg1 >> 12;
        int var6 = this.field667 * arg2 >> 12;
        int var7 = this.field669 * arg2 >> 12;
        class232.method1702(var4, this.field1002, var7, var6, var5, arg0 ^ 0x698D);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIB)V", line = 71)
    public final void method260(int arg0, int arg1, byte arg2) {
        if (arg2 > 53) {
            field662++;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILr;BI)V", line = 97)
    public static final void method261(int arg0, int arg1, class264 arg2, byte arg3, int arg4) {
        field671++;
        int var5 = -60 % ((-arg3 - 5) / 39);
        if (class271.field4640) {
            class131.method973(arg0, arg4, arg0 + arg2.field4393, arg2.field4381 + arg4);
        }
        if (class166.field2802 >= 3) {
            if (class271.field4640) {
                class70 var6 = arg2.method1910(true, false);
                if (var6 != null) {
                    var6.method47(arg0, arg4);
                }
            } else {
                class181.method1436(arg0, arg4, 0, arg2.field4451, arg2.field4429);
            }
        } else if (class271.field4640) {
            ((class8) class91.field1439).method52(arg0, arg4, arg2.field4393, arg2.field4381, class91.field1439.field1145 / 2, class91.field1439.field1155 / 2, class158.field2668, 256, (class8) arg2.method1910(true, false));
        } else {
            ((class307) class91.field1439).method1707(arg0, arg4, arg2.field4393, arg2.field4381, class91.field1439.field1145 / 2, class91.field1439.field1155 / 2, class158.field2668, 256, arg2.field4451, arg2.field4429);
        }
        class269.field4623[arg1] = true;
    }
}
