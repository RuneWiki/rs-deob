import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class57 extends class84 {

    @OriginalMember(owner = "client!i", name = "H", descriptor = "[I")
    public static int[] field817 = new int[100];

    @OriginalMember(owner = "client!i", name = "M", descriptor = "I")
    public static int field822 = -1;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "Llc;")
    public static class86 field819 = new class86(5);

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public static int field826 = 0;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "I")
    public int field814;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "I")
    public int field820;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "Ljava/lang/String;")
    public String field821;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "[I")
    public int[] field815;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "[I")
    public int[] field823;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "[I")
    public static int[] field825;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "[Lvd;")
    public class4[] field824;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field813;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lhc;IIB)Z")
    public static final boolean method351(class235 arg0, int arg1, int arg2, byte arg3) {
        field812++;
        byte[] var4 = arg0.method1576(-81, arg2, arg1);
        if (var4 == null) {
            return false;
        } else {
            int var5 = 33 / ((arg3 - 22) / 42);
            class236.method1585(-17859, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!i", name = "h", descriptor = "(I)V")
    public static void method352(int arg0) {
        if (arg0 != 5) {
            field825 = null;
        }
        field817 = null;
        field825 = null;
        field819 = null;
    }
}
