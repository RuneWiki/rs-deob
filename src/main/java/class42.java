import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class42 extends class269 {

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "[I")
    public static int[] field549 = new int[8];

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "Luv;")
    public static class2 field547 = new class2(7, 6);

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field550 = 0;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public static int field553 = -1;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "[I")
    public static int[] field552 = new int[2048];

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)Lkq;", line = 10)
    public static final class78 method331(int arg0, byte arg1) {
        field548++;
        class78[] var2 = class171.method1181(2);
        if (arg1 != 69) {
            return null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class78 var4 = var2[var3];
            if (var4.field1083 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V", line = 40)
    public static void method332(int arg0) {
        field549 = null;
        field552 = null;
        field547 = null;
        if (arg0 != -30344) {
            method331(36, (byte) -84);
        }
    }
}
