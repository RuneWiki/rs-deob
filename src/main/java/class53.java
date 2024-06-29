import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class53 extends class15 {

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "Lgp;")
    public class282 field696;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "Lc;")
    public class172 field688;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "Lvf;")
    public static class166 field689 = new class166();

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public int field691;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public int field693;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
    public int field695;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(B)V")
    public static void method284(byte arg0) {
        field689 = null;
        if (arg0 != 93) {
            method284((byte) 14);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public final void method285(int arg0) {
        this.field691 = this.field696.field4105;
        this.field694 = this.field696.field4106;
        field692++;
        this.field690 = this.field696.field4102;
        if (this.field696.field4101 != null) {
            this.field696.field4101.method557(this.field688.field2076, this.field688.field2075, this.field688.field2074, class214.field2943);
        }
        this.field695 = class214.field2943[0];
        if (arg0 != 10468) {
            this.field696 = null;
        }
        this.field693 = class214.field2943[2];
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lgp;Lbt;)V")
    public class53(class282 arg0, class380 arg1) {
        this.field696 = arg0;
        this.field688 = class140.method664(arg0.field4099, (byte) -121);
        this.method285(10468);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lg;IIBZI)V")
    public static final void method286(class470 arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        class349.field5020 = arg4;
        field687++;
        class269.field3862 = arg1;
        class80.field957 = arg2;
        class128.field1581 = arg0;
        class175.field2099 = 10000;
        if (arg3 != 91) {
            field689 = null;
        }
        class199.field2766 = arg5;
        class142.field1712 = 1;
    }
}
