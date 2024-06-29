import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 {

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Z")
    public static boolean field128 = false;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Lob;")
    public static class141 field127 = class175.method1195(40, "(U0a )2 in: ");

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field126 = -2;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "[[S")
    public static short[][] field133 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Lob;")
    public static class141 field130 = class175.method1195(40, "l");

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Lob;")
    public static class141 field123 = class175.method1195(40, "(R");

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Lob;")
    private static class141 field135 = class175.method1195(40, "Prepared sound engine");

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "Lob;")
    public static class141 field132 = field135;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "Lob;")
    private static class141 field137 = class175.method1195(40, "wave:");

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "Lob;")
    public static class141 field136 = class175.method1195(40, "null");

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lob;")
    public static class141 field124 = field137;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Lob;")
    public static class141 field122 = field137;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "Lob;")
    public static class141 field139 = class175.method1195(40, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "Lob;")
    private static class141 field138 = class175.method1195(40, " seconds)3");

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Lob;")
    public static class141 field131 = field138;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Z")
    public static final boolean method56(int arg0, int arg1) {
        if (arg1 == 4) {
            field125++;
            return (arg0 >> 31 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static final void method57(int arg0) {
        class60.field1178 = new int[104];
        class57.field1118 = new byte[4][105][arg0];
        class209.field3953 = new int[104];
        class191.field3694 = new byte[4][104][104];
        class103.field1991 = 99;
        class118.field2295 = new byte[4][104][104];
        class132.field2519 = new byte[4][104][104];
        class139.field2676 = new int[104];
        class165.field3190 = new int[104];
        field134++;
        class176.field3497 = new byte[4][104][104];
        class5.field61 = new int[104];
        class9.field158 = new int[4][105][105];
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public static void method58(int arg0) {
        field132 = null;
        field133 = null;
        field135 = null;
        field130 = null;
        if (arg0 != 4) {
            return;
        }
        field122 = null;
        field123 = null;
        field124 = null;
        field136 = null;
        field137 = null;
        field139 = null;
        field131 = null;
        field127 = null;
        field138 = null;
    }
}
