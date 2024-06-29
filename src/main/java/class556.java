import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class556 {

    @OriginalMember(owner = "client!et", name = "k", descriptor = "I")
    public int field6953;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public int field6951;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    private int field6950;

    @OriginalMember(owner = "client!et", name = "u", descriptor = "B")
    public byte field6963;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "I")
    public int field6949;

    @OriginalMember(owner = "client!et", name = "q", descriptor = "Let;")
    public class556 field6959;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "Lnh;")
    public static class699 field6946 = new class699(4);

    @OriginalMember(owner = "client!et", name = "n", descriptor = "[[B")
    public static byte[][] field6956 = new byte[250][];

    @OriginalMember(owner = "client!et", name = "m", descriptor = "I")
    public static int field6955 = 0;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    public int field6943;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public int field6944;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    public int field6945;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    public int field6947;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "I")
    public int field6952;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "I")
    public int field6957;

    @OriginalMember(owner = "client!et", name = "p", descriptor = "I")
    public int field6958;

    @OriginalMember(owner = "client!et", name = "r", descriptor = "I")
    public int field6960;

    @OriginalMember(owner = "client!et", name = "s", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!et", name = "t", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!et", name = "v", descriptor = "I")
    public int field6964;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "[Lrr;")
    public static class337[] field6948;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V")
    public static void method2958(byte arg0) {
        if (arg0 < 61) {
            method2961(46, -65, -109, -108);
        }
        field6946 = null;
        field6956 = null;
        field6948 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIII)Let;")
    public final class556 method2959(int arg0, int arg1, int arg2, int arg3) {
        field6962++;
        return arg1 == 1007 ? new class556(this.field6950, arg0, arg2, arg3, this.field6963) : null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)Lrba;")
    public final class401 method2960(int arg0) {
        field6961++;
        if (arg0 >= -45) {
            this.field6950 = 15;
        }
        return class72.method568(-120, this.field6950);
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(IIII)V")
    public static final void method2961(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 27112) {
            method2961(62, 74, 65, -38);
        }
        if (arg2 == 1012) {
            class620.method3461(class431.field5441, arg1, arg0);
        } else if (arg2 == 1010) {
            class620.method3461(class141.field1693, arg1, arg0);
        } else if (arg2 == 1003) {
            class620.method3461(class222.field2578, arg1, arg0);
        } else if (arg2 == 1008) {
            class620.method3461(class555.field6941, arg1, arg0);
        } else if (arg2 == 1007) {
            class620.method3461(class639.field8653, arg1, arg0);
        }
        field6954++;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(IIIIB)V")
    public class556(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field6953 = arg2;
        this.field6951 = arg1;
        this.field6950 = arg0;
        this.field6963 = arg4;
        this.field6949 = arg3;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Let;I)V")
    public class556(class556 arg0, int arg1) {
        this.field6959 = arg0;
        this.field6951 = this.field6959.field6951 + arg1;
        this.field6950 = this.field6959.field6950;
        this.field6953 = this.field6959.field6953 + arg1;
        this.field6949 = this.field6959.field6949 + arg1;
        this.field6963 = this.field6959.field6963;
    }
}
