import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class1 extends class166 {

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    private int field7 = -32768;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field4 = 0;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "Lia;")
    public static class257 field8 = class28.method234(75, "Sprites geladen)3");

    @OriginalMember(owner = "client!md", name = "l", descriptor = "[I")
    public static int[] field1 = new int[1000];

    @OriginalMember(owner = "client!md", name = "v", descriptor = "J")
    public static volatile long field11 = 0L;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "[I")
    public static int[] field14 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!md", name = "p", descriptor = "B")
    public static byte field5;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public int field3;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "Lmb;")
    public static class178 field13;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "[I")
    public static int[] field9;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static void method1(int arg0) {
        if (arg0 != 0) {
            field13 = null;
        }
        field9 = null;
        field8 = null;
        field14 = null;
        field13 = null;
        field1 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()I")
    public final int method2() {
        field12++;
        return this.field7;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2++;
        class168 var11 = class156.method1090(this.field3, 0).method144((byte) 62, this.field10, 0, (class31) null);
        if (var11 != null) {
            var11.method3(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field7 = var11.method2();
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IBLmb;)Lte;")
    public static final class184 method4(int arg0, byte arg1, class178 arg2) {
        field6++;
        if (arg1 == 86) {
            return class231.method1505(-23917, arg2, arg0) ? class211.method1418(-10785) : null;
        } else {
            return null;
        }
    }
}
