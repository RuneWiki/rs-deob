import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class209 extends class25 {

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "Lt;")
    public class185 field3486;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "[I")
    public static int[] field3487 = new int[50];

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "Lvh;")
    public static class252 field3485 = new class252();

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V")
    public static void method1437(int arg0) {
        field3487 = null;
        if (arg0 <= 71) {
            method1437(65);
        }
        field3485 = null;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)I")
    public static final int method1438(int arg0, int arg1) {
        field3484++;
        if (arg0 != -1) {
            method1438(-113, 36);
        }
        return arg1 == 16711935 ? -1 : class92.method700(arg1, 116);
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lt;)V")
    public class209(class185 arg0) {
        this.field3486 = arg0;
    }
}
