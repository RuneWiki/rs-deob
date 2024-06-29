import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class class114 {

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Z")
    public static boolean field2694 = true;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "[I")
    public static int[] field2699 = new int[2000];

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public int field2695;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public int field2700;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Ljava/awt/Image;")
    public Image field2691;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "[I")
    public int[] field2690;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "[Lva;")
    public static class128[] field2698;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 20)
    public final void method941(int arg0) {
        field2696++;
        class74.method578(this.field2690, this.field2695, this.field2700);
        if (arg0 != 10) {
            field2694 = true;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)Lae;", line = 34)
    public static final class6 method942(byte arg0, int arg1) {
        if (arg0 != 71) {
            method942((byte) -77, 115);
        }
        field2692++;
        return class79.method682(false, 10, arg0 ^ 0xFFFFFFCA, arg1);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 50)
    public static void method943(int arg0) {
        field2699 = null;
        if (arg0 > -19) {
            field2699 = null;
        }
        field2698 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)Lo;", line = 80)
    public static final class89 method944(byte arg0) {
        field2697++;
        if (arg0 < 50) {
            method944((byte) 1);
        }
        try {
            return (class89) Class.forName("td").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class58();
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V", line = 96)
    protected class114() {
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method2(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method1(int arg0, Graphics arg1, int arg2, int arg3);
}
