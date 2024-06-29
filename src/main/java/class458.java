import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class458 extends class503 implements class155 {

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "Z")
    public static boolean field6501 = false;

    @OriginalMember(owner = "client!ls", name = "D", descriptor = "Z")
    public static boolean field6506 = true;

    @OriginalMember(owner = "client!ls", name = "G", descriptor = "I")
    public static int field6509 = 0;

    @OriginalMember(owner = "client!ls", name = "x", descriptor = "B")
    private byte field6500;

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!ls", name = "B", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!ls", name = "C", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!ls", name = "E", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!ls", name = "F", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!ls", name = "I", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!ls", name = "J", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!ls", name = "K", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "J")
    public static long field6503;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V", line = 7)
    public final void method74(byte arg0) {
        if (arg0 < 99) {
            this.method197(118);
        }
        super.method74((byte) 104);
        ++field6504;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;", line = 19)
    public final Buffer method354(boolean arg0, boolean arg1) {
        if (!arg0) {
            field6509 = -36;
        }
        ++field6512;
        return super.method2892(-100, super.field7248.field2731, arg1);
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)Z", line = 40)
    public final boolean method357(int arg0) {
        if (arg0 != -28830) {
            this.method354(false, false);
        }
        ++field6511;
        return super.method2888(super.field7248.field2731, -1);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)I", line = 54)
    public final int method2627(byte arg0) {
        ++field6510;
        return arg0 != 72 ? 41 : this.field6500;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lmr;Z)V", line = 66)
    public class458(class221 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z", line = 69)
    public final boolean method355(int arg0, int arg1, Source arg2, int arg3) {
        ++field6502;
        this.field6500 = (byte) arg1;
        super.method2889(114, arg2, arg3);
        return arg0 != -26863 ? true : true;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZII)Z", line = 87)
    public static final boolean method2628(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field6503 = -72L;
        }
        ++field6507;
        return false;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)I", line = 98)
    public final int method197(int arg0) {
        ++field6508;
        int var2 = 118 / ((27 - arg0) / 38);
        return super.method197(111);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIB)Z", line = 112)
    public final boolean method353(int arg0, int arg1, byte arg2) {
        ++field6505;
        int var4 = 79 % ((arg2 - 17) / 47);
        this.field6500 = (byte) arg1;
        super.method73(arg0, (byte) -55);
        return true;
    }
}
