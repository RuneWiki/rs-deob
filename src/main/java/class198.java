import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class198 extends class311 {

    @OriginalMember(owner = "client!ega", name = "A", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!ega", name = "D", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!ega", name = "E", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!ega", name = "F", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!ega", name = "C", descriptor = "[I")
    public static int[] field2542;

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Lkha;Lkha;Luv;)V")
    public class198(class687 arg0, class687 arg1, class25 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIII)V")
    public final void method1240(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2545;
        int var6 = super.field3978.method1892();
        int var7 = ((class25) super.field1128).field438 * class475.method2786(arg3 ^ arg3) / 10 % var6;
        super.field3978.method3938(-var6 + arg0 + var7, arg4, var6 - var7 + arg2, arg1);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1241(String arg0, byte arg1) {
        ++field2541;
        if (arg1 > -103) {
            method1241((String) null, (byte) -68);
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; ++var4) {
            var3 = class278.method1665(arg0.charAt(var4), (byte) 59) + (var3 << 5) + -var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "(I)V")
    public static void method1242(int arg0) {
        field2542 = null;
        if (arg0 != -10690) {
            field2542 = null;
        }
    }
}
