import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class158 extends class157 {

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2242 = null;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "Lfa;")
    public static class156 field2240 = new class156(32);

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public int field2241;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "Lst;")
    public class297 field2238;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "[B")
    public byte[] field2239;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)[B")
    public final byte[] method1123(boolean arg0) {
        if (arg0) {
            method1126((class387) null, 22);
        }
        ++field2243;
        if (super.field2230) {
            throw new RuntimeException();
        } else {
            return this.field2239;
        }
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
    public static void method1125(int arg0) {
        field2240 = null;
        field2242 = null;
        if (arg0 != 0) {
            method1126((class387) null, -92);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lfs;I)V")
    public static final void method1126(class387 arg0, int arg1) {
        class222.field3259 = arg0.method2358("titlebg", (byte) -125);
        ++field2244;
        class443.field6571 = arg0.method2358("logo", (byte) -97);
        if (arg1 != 14564) {
            method1127(-9, (short[]) null, -128);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)I")
    public final int method1122(int arg0) {
        ++field2237;
        if (super.field2230) {
            return 0;
        } else {
            return arg0 <= 23 ? -47 : 100;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[SI)[S")
    public static final short[] method1127(int arg0, short[] arg1, int arg2) {
        ++field2236;
        short[] var3 = new short[arg2];
        class201.method1410(arg1, 0, var3, arg0, arg2);
        return var3;
    }

    static {
        new class331("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
    }
}
