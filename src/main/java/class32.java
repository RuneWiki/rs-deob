import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class32 extends class106 {

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "[I")
    public static int[] field643 = new int[2];

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field640;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
    public final void method342(int arg0) {
        super.field1770.method1986(false, (byte) 84);
        if (arg0 != 3) {
            field640 = null;
        }
        ++field644;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZI)V")
    public final void method343(boolean arg0, int arg1) {
        if (arg1 == 1) {
            ++field641;
            super.field1770.method1986(true, (byte) 110);
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lvj;)V")
    public class32(class303 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZB)V")
    public final void method344(boolean arg0, byte arg1) {
        ++field639;
        if (arg1 < 102) {
            field643 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
    public static void method345(byte arg0) {
        field643 = null;
        field640 = null;
        int var1 = 94 % ((arg0 - 6) / 45);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILih;)V")
    public final void method346(int arg0, int arg1, class492 arg2) {
        if (arg0 != 128) {
            field643 = null;
        }
        super.field1770.method1990(arg2, 11864);
        ++field645;
        super.field1770.method1989(-24145, arg1);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBI)V")
    public final void method347(int arg0, byte arg1, int arg2) {
        if (arg1 != 43) {
            this.method344(false, (byte) 13);
        }
        ++field642;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)Z")
    public final boolean method348(int arg0) {
        ++field646;
        return arg0 == -22884;
    }
}
