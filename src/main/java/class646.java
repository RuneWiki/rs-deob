import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class646 {

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    private int field9299;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public static int field9304;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Llr;I)I", line = 3)
    public static final int method3677(class311 arg0, int arg1) {
        field9301++;
        int var2 = arg0.method1946(2, (byte) 121);
        if (arg1 < 97) {
            return -2;
        }
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method1946(5, (byte) 122);
        } else if (var2 == 2) {
            var3 = arg0.method1946(8, (byte) 126);
        } else {
            var3 = arg0.method1946(11, (byte) 123);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(CI)V", line = 32)
    public final void method3678(char arg0, int arg1) {
        OpenGL.glCallList(this.field9299 + arg0);
        if (arg1 >= 71) {
            field9302++;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V", line = 49)
    public final void method3679(int arg0) {
        OpenGL.glEndList();
        if (arg0 < -67) {
            field9304++;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IB)V", line = 62)
    public final void method3680(int arg0, byte arg1) {
        OpenGL.glNewList(this.field9299 + arg0, 4864);
        int var3 = 65 / ((-arg1 - 67) / 57);
        field9303++;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lmv;B)I", line = 72)
    public static final int method3681(class295 arg0, byte arg1) {
        field9300++;
        int var2 = 0;
        if (arg0.method1818(class111.field1638, 4)) {
            var2++;
        }
        if (arg0.method1818(class702.field9975, 4)) {
            var2++;
        }
        if (arg0.method1818(class205.field2789, 4)) {
            var2++;
        }
        if (arg0.method1818(class465.field6713, 4)) {
            var2++;
        }
        if (arg0.method1818(class57.field937, 4)) {
            var2++;
        }
        if (arg0.method1818(class150.field2129, 4)) {
            var2++;
        }
        if (arg0.method1818(class527.field7485, 4)) {
            var2++;
        }
        if (arg0.method1818(class489.field6941, 4)) {
            var2++;
        }
        if (arg0.method1818(class297.field4375, 4)) {
            var2++;
        }
        if (arg0.method1818(class105.field1563, 4)) {
            var2++;
        }
        if (arg0.method1818(class684.field9640, 4)) {
            var2++;
        }
        if (arg0.method1818(class430.field6263, 4)) {
            var2++;
        }
        if (arg0.method1818(class121.field1786, 4)) {
            var2++;
        }
        if (arg0.method1818(class147.field2093, 4)) {
            var2++;
        }
        if (arg1 <= 10) {
            method3677(null, -29);
        }
        if (arg0.method1818(class574.field8339, 4)) {
            var2++;
        }
        if (arg0.method1818(class324.field4710, 4)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Luca;I)V", line = 139)
    public class646(class287 arg0, int arg1) {
        this.field9299 = OpenGL.glGenLists(arg1);
    }
}
