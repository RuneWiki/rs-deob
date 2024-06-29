import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class347 extends class97 {

    @OriginalMember(owner = "client!po", name = "B", descriptor = "Lpf;")
    public static class425 field5177 = new class425(25, 8);

    @OriginalMember(owner = "client!po", name = "K", descriptor = "Lwl;")
    public static class452 field5186 = new class452(1, -2);

    @OriginalMember(owner = "client!po", name = "M", descriptor = "[S")
    public static short[] field5188 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    public int field5163;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public int field5164;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public int field5165;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "I")
    public int field5166;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "I")
    public int field5167;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "I")
    public int field5168;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "I")
    public int field5169;

    @OriginalMember(owner = "client!po", name = "u", descriptor = "I")
    public int field5170;

    @OriginalMember(owner = "client!po", name = "v", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!po", name = "w", descriptor = "I")
    public int field5172;

    @OriginalMember(owner = "client!po", name = "z", descriptor = "I")
    public int field5175;

    @OriginalMember(owner = "client!po", name = "C", descriptor = "I")
    public int field5178;

    @OriginalMember(owner = "client!po", name = "E", descriptor = "I")
    public int field5180;

    @OriginalMember(owner = "client!po", name = "F", descriptor = "I")
    public int field5181;

    @OriginalMember(owner = "client!po", name = "G", descriptor = "I")
    public int field5182;

    @OriginalMember(owner = "client!po", name = "H", descriptor = "I")
    public int field5183;

    @OriginalMember(owner = "client!po", name = "I", descriptor = "I")
    public int field5184;

    @OriginalMember(owner = "client!po", name = "J", descriptor = "I")
    public int field5185;

    @OriginalMember(owner = "client!po", name = "L", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!po", name = "O", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!po", name = "N", descriptor = "Ltb;")
    public static class290 field5189;

    @OriginalMember(owner = "client!po", name = "A", descriptor = "Lar;")
    public class2 field5176;

    @OriginalMember(owner = "client!po", name = "D", descriptor = "Lsr;")
    public class308 field5179;

    @OriginalMember(owner = "client!po", name = "x", descriptor = "Loq;")
    public class438 field5173;

    @OriginalMember(owner = "client!po", name = "y", descriptor = "Lsj;")
    public class444 field5174;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
    public static void method2105(boolean arg0) {
        if (!arg0) {
            field5189 = null;
        }
        field5188 = null;
        field5177 = null;
        field5186 = null;
        field5189 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(CI)Z")
    public static final boolean method2106(char arg0, int arg1) {
        field5171++;
        if (arg1 != 31965) {
            field5177 = null;
        }
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
    public final void method2107(int arg0) {
        this.field5176 = null;
        this.field5173 = null;
        this.field5179 = null;
        this.field5174 = null;
        field5190++;
        int var2 = 32 % ((arg0 + 16) / 34);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lfh;B)Lfh;")
    public static final class170 method2108(class170 arg0, byte arg1) {
        field5187++;
        class170 var2 = client.method2785(arg0);
        if (arg1 == -57) {
            if (var2 == null) {
                var2 = arg0.field2601;
            }
            return var2;
        } else {
            return null;
        }
    }
}
