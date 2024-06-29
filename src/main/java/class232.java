import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class232 extends class175 {

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "I")
    private int field3986;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "Lmb;")
    public static class96 field3984 = class243.method1708("p12_full", (byte) 118);

    @OriginalMember(owner = "client!of", name = "P", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!of", name = "R", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class232() {
        this(4096);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)I")
    public static final int method1579(int arg0, byte arg1) {
        ++field3982;
        int var2 = 17 / ((arg1 - 21) / 42);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V")
    public static void method1580(boolean arg0) {
        field3984 = null;
        if (arg0) {
            field3984 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(I)V")
    private class232(int arg0) {
        super(0, true);
        this.field3986 = 4096;
        this.field3986 = arg0;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        ++field3977;
        int var3 = 91 / ((62 - arg0) / 54);
        int[] var4 = super.field3044.method904((byte) 101, arg1);
        if (super.field3044.field2150) {
            class102.method771(var4, 0, class1.field11, this.field3986);
        }
        return var4;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        if (~arg1 == -1) {
            this.field3986 = (arg2.method1651(4139) << 12) / 255;
        }
        int var5 = 104 % ((arg0 - -22) / 58);
        ++field3983;
    }
}
