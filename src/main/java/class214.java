import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class214 extends class446 implements class302 {

    @OriginalMember(owner = "client!sba", name = "I", descriptor = "I")
    public static int field3070 = 0;

    @OriginalMember(owner = "client!sba", name = "B", descriptor = "I")
    public static int field3063 = -2;

    @OriginalMember(owner = "client!sba", name = "F", descriptor = "Z")
    public static boolean field3067 = false;

    @OriginalMember(owner = "client!sba", name = "G", descriptor = "B")
    private byte field3068;

    @OriginalMember(owner = "client!sba", name = "A", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!sba", name = "C", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!sba", name = "D", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!sba", name = "E", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!sba", name = "H", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!sba", name = "J", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!sba", name = "K", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!sba", name = "L", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!sba", name = "M", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "(I)I", line = 4)
    public final int method1491(int arg0) {
        int var2 = 106 % ((arg0 - -42) / 46);
        ++field3074;
        return super.method1491(-122);
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Leea;Z)V", line = 14)
    public class214(class132 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 21)
    public final Buffer method1492(byte arg0, boolean arg1) {
        ++field3066;
        if (arg0 != -20) {
            field3065 = 57;
        }
        return super.method2670(arg1, 1, super.field6184.field2085);
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)I", line = 35)
    public final int method1493(int arg0) {
        ++field3073;
        if (arg0 <= 113) {
            this.method1495((Source) null, -102, -28, (byte) -75);
        }
        return this.field3068;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)Z", line = 46)
    public final boolean method1494(int arg0) {
        ++field3064;
        if (arg0 != 5069) {
            this.method1494(-110);
        }
        return super.method2665(super.field6184.field2085, 15064);
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Ljaclib/memory/Source;IIB)Z", line = 61)
    public final boolean method1495(Source arg0, int arg1, int arg2, byte arg3) {
        ++field3069;
        this.field3068 = (byte) arg1;
        super.method2664(-77, arg0, arg2);
        int var5 = -85 / ((arg3 - 29) / 55);
        return true;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Z)V", line = 81)
    public final void method1496(boolean arg0) {
        ++field3062;
        super.method1496(arg0);
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(III)Z", line = 96)
    public final boolean method1497(int arg0, int arg1, int arg2) {
        ++field3071;
        this.field3068 = (byte) arg0;
        super.method1600(arg1, -106);
        if (arg2 != -29407) {
            field3067 = true;
        }
        return true;
    }
}
