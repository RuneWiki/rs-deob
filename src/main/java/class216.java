import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public abstract class class216 extends class501 {

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "Lbn;")
    public static class378 field3171 = new class378(0, 16);

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "[I")
    public static int[] field3174 = new int[1000];

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "[I")
    public static int[] field3173 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field3175 = 0;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Lmm;")
    public static class234 field3172;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "Lqba;")
    public static class345 field3176;

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V")
    public class216(int arg0) {
        this.field3169 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method855(int arg0);

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)Z")
    public abstract boolean method854(byte arg0);

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IC)Z")
    public static final boolean method1412(int arg0, char arg1) {
        field3170++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg0 >= ~arg1 && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
    public static void method1413(byte arg0) {
        field3172 = null;
        field3173 = null;
        field3176 = null;
        int var1 = 36 % ((arg0 + 61) / 34);
        field3171 = null;
        field3174 = null;
    }
}
