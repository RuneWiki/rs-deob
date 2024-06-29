import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class class133 {

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "[Z")
    public static boolean[] field2324 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Loa;")
    public static class99 field2325 = class221.method1463(2844, "Titelbild geladen)3");

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Loa;")
    public static class99 field2321 = class221.method1463(2844, "::fpson");

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Loa;")
    public static class99 field2319 = class221.method1463(2844, "Untersuchen");

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Loa;")
    private static class99 field2327 = class221.method1463(2844, "Examine");

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "[[B")
    public static byte[][] field2330 = new byte[1000][];

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Loa;")
    public static class99 field2332 = class221.method1463(2844, "(R");

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Loa;")
    public static class99 field2323 = field2327;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field2326 = 0;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Loa;")
    public static class99 field2329 = class221.method1463(2844, "p11_full");

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Lbh;")
    public static class7 field2322;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "[I")
    public static int[] field2320;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "[[S")
    public static short[][] field2333;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static final void method889(byte arg0) {
        field2331++;
        class116.field2065.method163(arg0 + 23);
        class53.field873 = 1;
        if (arg0 != 89) {
            method890(23);
        }
        class161.field2860 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method615(int arg0, Component arg1);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method614(Component arg0, int arg1);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I")
    public abstract int method616(int arg0);

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    public static void method890(int arg0) {
        field2319 = null;
        field2329 = null;
        if (arg0 < 120) {
            field2332 = null;
        }
        field2324 = null;
        field2332 = null;
        field2321 = null;
        field2320 = null;
        field2325 = null;
        field2333 = null;
        field2323 = null;
        field2322 = null;
        field2327 = null;
        field2330 = null;
    }
}
