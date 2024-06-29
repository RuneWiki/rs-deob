import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class class404 {

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public int field5068;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public int field5067;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public int field5064;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lbaa;")
    public static class593 field5069 = new class593(9, 0, 4, 1);

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field5070 = 0;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBI)V")
    public abstract void method1911(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)V")
    public static final void method2150(int arg0, byte arg1) {
        field5063++;
        class592 var2 = class61.method371(7, arg0, (byte) 108);
        if (arg1 != 75) {
            field5069 = null;
        }
        var2.method3253(0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ld;Ld;I)V")
    public static final void method2151(class329 arg0, class329 arg1, int arg2) {
        field5062++;
        if (arg0.field4196 != null) {
            arg0.method1871(arg2 ^ 0xFFFFFFB7);
        }
        arg0.field4196 = arg1.field4196;
        arg0.field4201 = arg1;
        arg0.field4196.field4201 = arg0;
        arg0.field4201.field4196 = arg0;
        if (arg2 != 4) {
            method2153(82, (byte) 74);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
    public abstract void method1910(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method2152(byte arg0) {
        field5069 = null;
        if (arg0 != -70) {
            method2152((byte) 46);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)V")
    public abstract void method1912(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(III)V")
    public class404(int arg0, int arg1, int arg2) {
        this.field5068 = arg2;
        this.field5067 = arg0;
        this.field5064 = arg1;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(IB)V")
    public static final void method2153(int arg0, byte arg1) {
        field5066++;
        if (class569.field7970 == null) {
            class569.field7970 = new byte[4][class431.field5395][class452.field5802];
        }
        if (arg0 != 4319) {
            field5070 = -45;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class431.field5395; var3++) {
                for (int var4 = 0; var4 < class452.field5802; var4++) {
                    class569.field7970[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
    public static final void method2154(int arg0, int arg1) {
        class382.field4823 = -1;
        field5065++;
        class590.field8287 = arg0;
        class550.field7645 = arg1;
        class673.field9471 = 100;
    }
}
