import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class272 extends class305 {

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "[[F")
    public static float[][] field4290 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "Lpu;")
    public static class179 field4291 = new class179("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        if (arg1 != 4688) {
            this.method15(-18, -102);
        }
        ++field4289;
        int[] var3 = super.field4677.method2174(arg0, 30);
        if (super.field4677.field5040) {
            class325.method2134(var3, 0, class91.field1471, class301.field4614[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class272() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)V")
    public static void method1868(int arg0) {
        field4290 = null;
        field4291 = null;
        if (arg0 != 0) {
            field4288 = 36;
        }
    }
}
