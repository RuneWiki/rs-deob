import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class341 extends class403 implements class635 {

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    private int field4792;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Lco;")
    public static class119 field4798;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Lvk;")
    public static class367 field4796;

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Loea;ILjaclib/memory/Buffer;)V")
    public class341(class594 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field4792 = arg1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)I")
    public final int method2158(byte arg0) {
        ++field4793;
        int var2 = -82 % ((22 - arg0) / 49);
        return 0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method2159(int arg0) {
        if (arg0 == 0) {
            field4798 = null;
            field4796 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)J")
    public final long method2160(byte arg0) {
        ++field4795;
        if (arg0 != -104) {
            method2159(-87);
        }
        return super.field5625.getAddress();
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Loea;I[BI)V")
    public class341(class594 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4792 = arg1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIB[B)V")
    public final void method2161(int arg0, int arg1, byte arg2, byte[] arg3) {
        this.method2483(arg3, arg1);
        if (arg2 > -69) {
            field4798 = null;
        }
        ++field4797;
        this.field4792 = arg0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)I")
    public final int method2162(boolean arg0) {
        if (!arg0) {
            field4796 = null;
        }
        ++field4794;
        return this.field4792;
    }
}
