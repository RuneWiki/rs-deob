import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class509 {

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
    private int field6986;

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "Lfja;")
    public static class783 field6987 = new class783(19, -1);

    @OriginalMember(owner = "client!cga", name = "i", descriptor = "Lvl;")
    public static class15 field6993 = new class15(21, 7);

    @OriginalMember(owner = "client!cga", name = "j", descriptor = "[[I")
    public static int[][] field6994 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!cga", name = "h", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!cga", name = "k", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V", line = 6)
    public static final void method2900(int arg0) {
        if (arg0 >= -117) {
            field6994 = null;
        }
        field6989++;
        class139.method1142(2, 11);
        class118.method1042(8);
        System.gc();
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(I)V", line = 20)
    public final void method2901(int arg0) {
        if (arg0 == 4) {
            field6992++;
            OpenGL.glEndList();
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)V", line = 31)
    public final void method2902(int arg0, int arg1) {
        field6990++;
        OpenGL.glNewList(this.field6986 + arg0, arg1);
    }

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "(I)V", line = 40)
    public static void method2903(int arg0) {
        field6993 = null;
        if (arg0 != 21) {
            field6993 = null;
        }
        field6994 = null;
        field6987 = null;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lkh;I)V", line = 52)
    public static final void method2904(class17 arg0, int arg1) {
        if (arg1 != -27082) {
            field6987 = null;
        }
        field6988++;
        class17 var2 = class533.method3020(arg0, (byte) -50);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class108.field1697;
            var3 = class732.field10098;
        } else {
            var3 = var2.field347;
            var4 = var2.field330;
        }
        class708.method3952((byte) -117, arg0, false, var3, var4);
        class206.method1462(var4, arg0, var3, true);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 83)
    public static final void method2905(String arg0, int arg1) {
        System.exit(1);
        int var2 = -87 / ((23 - arg1) / 49);
        field6985++;
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lhk;I)V", line = 100)
    public class509(class111 arg0, int arg1) {
        this.field6986 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(CI)V", line = 115)
    public final void method2906(char arg0, int arg1) {
        field6991++;
        OpenGL.glCallList(this.field6986 + arg0);
        int var3 = 77 / ((9 - arg1) / 58);
    }
}
