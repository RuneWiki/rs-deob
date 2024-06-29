import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class129 {

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    private int field1845;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "[[Z")
    public static boolean[][] field1842 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "Lem;")
    public static class206 field1837 = new class206(17, 0);

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "[I")
    public static int[] field1844 = new int[1];

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "Loh;")
    public static class370 field1846 = new class370(6, 1);

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field1850 = 0;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "Lem;")
    public static class206 field1849 = new class206(57, -1);

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "Lpn;")
    public static class692 field1851 = new class692(4);

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "[I")
    public static int[] field1838;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V", line = 4)
    public final void method915(byte arg0) {
        field1841++;
        if (arg0 == 95) {
            OpenGL.glEndList();
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIII)V", line = 19)
    public static final void method916(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1839++;
        int var7 = -26 % ((arg5 - 9) / 46);
        if (class366.field4875.field9346 != 0 && arg1 != 0 && class166.field2420 < 50 && arg4 != -1) {
            class130.field1873[class166.field2420++] = new class437((byte) 1, arg4, arg1, arg0, arg2, arg6, arg3, null);
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V", line = 36)
    public static void method917(byte arg0) {
        field1842 = null;
        field1837 = null;
        field1846 = null;
        field1844 = null;
        field1838 = null;
        field1851 = null;
        int var1 = -118 / ((arg0 + 30) / 62);
        field1849 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IC)V", line = 51)
    public final void method918(int arg0, char arg1) {
        field1840++;
        if (arg0 == 1) {
            OpenGL.glCallList(this.field1845 + arg1);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V", line = 66)
    public final void method919(int arg0, int arg1) {
        field1847++;
        OpenGL.glNewList(this.field1845 + arg0, arg1);
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Llj;I)V", line = 94)
    public class129(class565 arg0, int arg1) {
        this.field1845 = OpenGL.glGenLists(arg1);
    }
}
