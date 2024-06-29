import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class440 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public int field6526;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lqi;")
    public class402 field6530;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "La;")
    public class440 field6528;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
    public static final void method2622(boolean arg0) {
        field6529++;
        if (!class186.field2990.method1783(-1, class133.field2236) && class419.field6303 != class211.field3371) {
            class379.method2333(false, 10, 1, class266.field4039, class49.field995);
            return;
        }
        class309.method1978(class262.field4006, 98);
        if (class448.field6672 != class211.field3371) {
            class4.method32((byte) -91);
        }
        if (!arg0) {
            method2624(5, (byte) 33);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public final void method2623(byte arg0) {
        field6531++;
        if (class119.field2096 >= 500) {
            return;
        }
        if (arg0 < 33) {
            this.field6528 = null;
        }
        this.field6528 = class381.field5580;
        this.field6526 = 0;
        this.field6530 = null;
        class119.field2096++;
        class381.field5580 = this;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)V")
    public static final void method2624(int arg0, byte arg1) {
        if (arg1 != 41) {
            method2624(93, (byte) -91);
        }
        field6527++;
        class18 var2 = class140.method1047(10, arg0, false);
        var2.method123(20983);
    }

    static {
        new class309("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
    }
}
