import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class144 extends class493 {

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "[I")
    public static int[] field1861 = new int[250];

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "Lfc;")
    public static class262 field1866 = new class262(8);

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "Lufa;")
    public static class680 field1860;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "Ljava/applet/Applet;")
    public static Applet field1868;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
    public final void method628(int arg0) {
        if (arg0 != -2) {
            this.method634((byte) -106);
        }
        ++field1859;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILjava/awt/Canvas;ILd;ILni;)Lha;")
    public static final class60 method897(int arg0, Canvas arg1, int arg2, class152 arg3, int arg4, class522 arg5) {
        if (arg2 <= 21) {
            return null;
        } else {
            ++field1864;
            int var6 = 0;
            int var7 = 0;
            if (arg1 != null) {
                Dimension var8 = arg1.getSize();
                var6 = var8.width;
                var7 = var8.height;
            }
            return class60.method341((byte) 64, arg0, arg1, arg3, var6, arg5, arg4, var7);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)V")
    public final void method632(int arg0, boolean arg1) {
        if (arg0 <= 93) {
            method897(-78, (Canvas) null, 97, (class152) null, 28, (class522) null);
        }
        ++field1863;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(IZ)V")
    public final void method633(int arg0, boolean arg1) {
        if (arg0 != 69) {
            field1860 = null;
        }
        ++field1858;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Luv;)V")
    public class144(class367 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(B)V")
    public static void method898(byte arg0) {
        field1860 = null;
        field1868 = null;
        if (arg0 >= 64) {
            field1866 = null;
            field1861 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)V")
    public final void method627(int arg0, int arg1, int arg2) {
        ++field1857;
        if (arg2 >= -75) {
            field1860 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)Z")
    public final boolean method634(byte arg0) {
        ++field1862;
        if (arg0 != 27) {
            field1868 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILbl;)V")
    public final void method629(int arg0, int arg1, class649 arg2) {
        ++field1865;
        if (arg0 != 6) {
            field1867 = 101;
        }
        super.field6720.method2148(arg2, -123);
        super.field6720.method2153(arg1, (byte) 117);
    }
}
