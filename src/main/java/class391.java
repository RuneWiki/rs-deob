import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class391 {

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "[I")
    public static int[] field5869 = new int[2500];

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field5874 = 0;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Llc;")
    public static class385 field5873 = new class385();

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "Lne;")
    public static class172 field5872;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "Lmo;")
    public static class447 field5875;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Lmo;")
    public static class447 field5876;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)I", line = 6)
    public static final int method2465(byte arg0) {
        field5870++;
        if ((double) class400.field5953 == 3.0D) {
            return 37;
        } else if ((double) class400.field5953 == 4.0D) {
            return 50;
        } else if ((double) class400.field5953 == 6.0D) {
            return 75;
        } else {
            if (arg0 != -113) {
                method2466(72);
            }
            return (double) class400.field5953 == 8.0D ? 100 : 200;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 44)
    public static final void method2466(int arg0) {
        field5868++;
        int var1 = 2 / ((arg0 + 33) / 49);
        for (int var2 = 0; var2 < class31.field382.length; var2++) {
            for (int var3 = 0; var3 < class31.field382[0].length; var3++) {
                for (int var4 = 0; var4 < class31.field382[0][0].length; var4++) {
                    class31.field382[var2][var3][var4] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 82)
    public static void method2467(int arg0) {
        if (arg0 < 48) {
            method2467(-92);
        }
        field5869 = null;
        field5875 = null;
        field5872 = null;
        field5873 = null;
        field5876 = null;
    }
}
