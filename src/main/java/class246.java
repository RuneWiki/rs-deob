import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class class246 {

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field3687 = new String[100];

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Lnn;")
    public static class151 field3688 = new class151("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "[Z")
    public static boolean[] field3692 = new boolean[8];

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Lkr;")
    public static class234 field3691;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "[[I")
    public static int[][] field3684;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "[[S")
    public static short[][] field3685;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I")
    public abstract int method647(int arg0);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method648(int arg0, Component arg1);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)I")
    public static final int method1503(byte arg0) {
        field3683++;
        if (class90.field1277 == null) {
            if (arg0 >= -54) {
                field3688 = null;
            }
            return class140.field1884 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method649(byte arg0, Component arg1);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1504(String arg0, int arg1, int arg2) {
        field3682++;
        class32 var3 = class136.method854(3, (byte) 109, arg1);
        if (arg2 == 24907) {
            var3.method194(false);
            var3.field408 = arg0;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static void method1505(int arg0) {
        field3684 = null;
        field3688 = null;
        field3687 = null;
        field3692 = null;
        field3685 = null;
        field3691 = null;
        if (arg0 < 32) {
            field3684 = null;
        }
    }
}
