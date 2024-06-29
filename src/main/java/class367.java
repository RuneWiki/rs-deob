import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class367 {

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    private int field5200;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "Lst;")
    public static class335 field5199 = new class335(53, 2);

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "[I")
    public static int[] field5206 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "Lkr;")
    public static class602 field5204 = new class602(89, 8);

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "F")
    public static float field5207;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZI)V")
    public final void method2311(boolean arg0, int arg1) {
        if (arg0) {
            OpenGL.glNewList(this.field5200 + arg1, 4864);
            field5201++;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
    public static void method2312(byte arg0) {
        field5199 = null;
        if (arg0 != 46) {
            method2316((byte) 125, null);
        }
        field5204 = null;
        field5206 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)V")
    public static final void method2313(boolean arg0) {
        class555.field7741 = null;
        field5198++;
        if (!arg0) {
            method2312((byte) -106);
        }
        class570.field7877 = -1;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)V")
    public final void method2314(byte arg0) {
        if (arg0 > -93) {
            this.method2311(false, 2);
        }
        field5205++;
        OpenGL.glEndList();
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZC)V")
    public final void method2315(boolean arg0, char arg1) {
        OpenGL.glCallList(this.field5200 + arg1);
        field5203++;
        if (!arg0) {
            method2316((byte) -119, null);
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ldw;I)V")
    public class367(class664 arg0, int arg1) {
        this.field5200 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BLuv;)V")
    public static final void method2316(byte arg0, class755 arg1) {
        if (arg0 != -61) {
            method2312((byte) 59);
        }
        field5202++;
        if (!class160.field2235) {
            return;
        }
        class118.field1560++;
        if (arg1.field10417 != null) {
            class755 var2 = class171.method1093((byte) 111, class401.field5748, class442.field6137);
            if (var2 != null) {
                class142 var3 = new class142();
                var3.field2017 = var2;
                var3.field2020 = arg1;
                var3.field2024 = arg1.field10417;
                class546.method3233(var3);
            }
        }
        class583 var4 = class54.method400(class213.field2800, (byte) 104, class11.field94);
        var4.field7963.method473(107, arg1.field10445);
        var4.field7963.method488(-128, arg1.field10441);
        var4.field7963.method492(-2, class209.field2732);
        var4.field7963.method453(class442.field6137, (byte) 107);
        var4.field7963.method492(-2, arg1.field10469);
        var4.field7963.method509(class401.field5748, 1470420840);
        class463.method2838(var4, (byte) 125);
    }
}
