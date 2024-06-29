import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public abstract class class157 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lqb;", line = 13)
    public static final class226 method1201(int arg0, int arg1) {
        field2523++;
        class226 var2 = (class226) class600.field8229.method992((long) arg0, arg1 - 128);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class640.field8794.method863(-1860, arg1, arg0);
        class226 var4 = new class226();
        if (var3 != null) {
            var4.method1592(24, new class215(var3));
        }
        var4.method1593(4);
        class600.field8229.method991(var4, (long) arg0, (byte) -103);
        return var4;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)Z", line = 38)
    public final boolean method1202(int arg0) {
        field2521++;
        if (arg0 <= 91) {
            this.method1202(53);
        }
        return this.method576(-83) || this.method569(-121) || this.method573((byte) 125);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Z")
    public abstract boolean method569(int arg0);

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public abstract void method579(int arg0);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Z")
    public abstract boolean method573(byte arg0);

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public abstract void method580(int arg0);

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)I")
    public abstract int method571(byte arg0);

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(I)Z")
    public abstract boolean method576(int arg0);

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(I)Lbu;")
    public abstract class19 method577(int arg0);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)I")
    public abstract int method574(boolean arg0);
}
