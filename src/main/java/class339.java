import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class339 extends class184 {

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public int field4626;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public int field4630;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "[I")
    public static int[] field4623 = new int[50];

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "Z")
    public static boolean field4624 = false;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "[I")
    public static int[] field4625 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "[Les;")
    public static class292[] field4627 = new class292[50];

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field4628 = 0;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
    public static int field4633 = 2;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(IIII)V")
    public class339(int arg0, int arg1, int arg2, int arg3) {
        this.field4626 = arg1;
        this.field4630 = arg2;
        this.field4622 = arg0;
        this.field4632 = arg3;
    }

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "(I)Z")
    public static final boolean method2153(int arg0) {
        if (arg0 != 9) {
            field4624 = true;
        }
        field4629++;
        return class243.field3355 == 0 ? class215.field2978 : true;
    }

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "(I)V")
    public static void method2154(int arg0) {
        field4625 = null;
        field4623 = null;
        if (arg0 != -16890) {
            field4631 = -62;
        }
        field4627 = null;
    }
}
