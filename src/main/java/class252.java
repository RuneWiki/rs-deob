import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class252 extends class243 implements class30 {

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    private int field3714;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "Lho;")
    public static class102 field3710 = new class102(0, 2, 2, 1);

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V", line = 3)
    public static void method1635(int arg0) {
        if (arg0 == 11134) {
            field3710 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)V", line = 16)
    public static final void method1636(int arg0, boolean arg1) {
        ++field3711;
        class215 var2 = class171.method1208(arg0, (byte) 127, 11);
        if (arg1) {
            method1637(96, (byte) -26);
        }
        var2.method1469((byte) -84);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)V", line = 30)
    public static final void method1637(int arg0, byte arg1) {
        if (arg1 <= 41) {
            method1636(51, false);
        }
        ++field3707;
        class215 var2 = class171.method1208(arg0, (byte) 116, 16);
        var2.method1469((byte) -86);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)J", line = 44)
    public final long method239(int arg0) {
        if (arg0 != 12786) {
            return -2L;
        } else {
            ++field3708;
            return super.field3584.method2673();
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lfd;ILjaggl/memory/NativeBuffer;)V", line = 58)
    public class252(class365 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field3714 = arg1;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)I", line = 66)
    public final int method238(boolean arg0) {
        if (!arg0) {
            this.method239(-15);
        }
        ++field3713;
        return this.field3714;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)I", line = 79)
    public final int method237(int arg0) {
        ++field3709;
        int var2 = 35 / ((17 - arg0) / 39);
        return 0;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lfd;I[BI)V", line = 89)
    public class252(class365 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3714 = arg1;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BII[B)V", line = 100)
    public final void method240(byte arg0, int arg1, int arg2, byte[] arg3) {
        ++field3715;
        this.method1600(arg3, arg1);
        int var5 = 94 / ((12 - arg0) / 38);
        this.field3714 = arg2;
    }
}
