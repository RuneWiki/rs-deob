import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class282 extends class394 {

    @OriginalMember(owner = "client!rd", name = "gb", descriptor = "Lft;")
    public class4 field3897;

    @OriginalMember(owner = "client!rd", name = "hb", descriptor = "Lpg;")
    public static class625 field3898 = class470.method2739(4876);

    @OriginalMember(owner = "client!rd", name = "ib", descriptor = "Lit;")
    public static class555 field3899 = new class555();

    @OriginalMember(owner = "client!rd", name = "fb", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lkw;)V")
    public class282(class208 arg0) {
        super(arg0);
        this.field3897 = new class4(arg0);
        super.field5582 = new class307(super.field5557);
        super.field5600 = new class307(super.field5557);
        super.field5603 = new class307(super.field5557);
        super.field5608 = new class307(super.field5557);
        super.field5569 = new class307(super.field5557);
        super.field5585 = new class307(super.field5557);
        super.field5578 = new class307(super.field5557);
        super.field5575 = new class307(super.field5557);
        super.field5606 = new class307(super.field5557);
        super.field5577 = new class307(super.field5557);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public static void method1816(int arg0) {
        field3899 = null;
        field3898 = null;
        if (arg0 != -26195) {
            method1816(64);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public final void method180(int arg0) {
        ++field3896;
        this.field3897 = new class4((class208) super.field5557);
        if (arg0 != -8191) {
            this.field3897 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)Lwe;")
    public static final class344 method1817(int arg0, int arg1, int arg2) {
        class622 var3 = class356.field4807[arg0][arg1][arg2];
        return var3 == null ? null : var3.field8982;
    }
}
