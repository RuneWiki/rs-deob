import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class718 extends class147 implements class741 {

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "[F")
    public static float[] field10094 = new float[4];

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field10099 = -1;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "B")
    private byte field10095;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
    public static int field10092;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
    public static int field10093;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public static int field10096;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    public static int field10097;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    public static int field10098;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field10100;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    public static int field10101;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field10102;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public static int field10103;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)I", line = 3)
    public final int method51(byte arg0) {
        ++field10100;
        return arg0 != -105 ? -124 : super.method51((byte) -105);
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(B)V", line = 26)
    public static void method4048(byte arg0) {
        if (arg0 > -4) {
            method4050(false);
        }
        field10094 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)I", line = 36)
    public final int method4049(int arg0) {
        ++field10093;
        if (arg0 != 17816) {
            this.method4049(41);
        }
        return this.field10095;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)Z", line = 48)
    public final boolean method3457(int arg0, int arg1, int arg2) {
        this.field10095 = (byte) arg1;
        ++field10103;
        super.method50(false, arg0);
        return arg2 != 3882 ? true : true;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 63)
    public final Buffer method3454(int arg0, boolean arg1) {
        if (arg0 != 13952) {
            return null;
        } else {
            ++field10102;
            return super.method1012(super.field1887.field9533, arg1, (byte) -77);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V", line = 79)
    public static final void method4050(boolean arg0) {
        class90.field1165 = new class312(class674.field9555.method3825((byte) -10, class526.field7494), "", class303.field4540, 1001, -1, 0L, 0, 0, true, arg0, 0L, true);
        ++field10092;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 90)
    public final void method47(byte arg0) {
        if (arg0 <= -18) {
            ++field10098;
            super.method47((byte) -112);
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Log;Z)V", line = 102)
    public class718(class673 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)Z", line = 106)
    public final boolean method3456(byte arg0) {
        if (arg0 != 71) {
            this.field10095 = 48;
        }
        ++field10097;
        return super.method1011(false, super.field1887.field9533);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z", line = 117)
    public final boolean method3455(int arg0, int arg1, int arg2, Source arg3) {
        ++field10096;
        this.field10095 = (byte) arg0;
        if (arg1 != 6838) {
            method4048((byte) 93);
        }
        super.method1010(-125, arg2, arg3);
        return true;
    }
}
