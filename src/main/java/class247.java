import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class247 extends class71 implements class46 {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    private int field3439;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Lcm;")
    public static class449 field3444 = new class449(44, -1);

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field3445 = 4;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)I")
    public final int method348(boolean arg0) {
        if (!arg0) {
            return 35;
        } else {
            ++field3442;
            return 0;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lbv;ILjaggl/memory/NativeBuffer;)V")
    public class247(class282 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field3439 = arg1;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static void method1632(int arg0) {
        field3444 = null;
        if (arg0 != 15170) {
            method1632(-91);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)J")
    public final long method347(byte arg0) {
        if (arg0 != -93) {
            this.method346(-105);
        }
        ++field3443;
        return super.field975.method148();
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lbv;I[BI)V")
    public class247(class282 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3439 = arg1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
    public final int method346(int arg0) {
        ++field3440;
        int var2 = 60 % ((arg0 - 76) / 39);
        return this.field3439;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[BII)V")
    public final void method345(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field3441;
        int var5 = 106 / ((-13 - arg0) / 55);
        this.method482(arg1, arg2);
        this.field3439 = arg3;
    }
}
