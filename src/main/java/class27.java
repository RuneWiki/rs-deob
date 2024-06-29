import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class27 extends class171 {

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public static int field344 = 0;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public static volatile int field345 = 0;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "J")
    public static long field346 = 0L;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public static int field347 = 0;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public int field343;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public int field348;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public int field351;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public int field352;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "Lse;")
    public class211 field338;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "Lse;")
    public class211 field339;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "Ljava/lang/String;")
    public String field353;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "Z")
    public static boolean field340;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "Z")
    public boolean field350;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "[Ljava/lang/Object;")
    public Object[] field341;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lhc;ILhc;)V")
    public static final void method178(class235 arg0, int arg1, class235 arg2) {
        field354++;
        if (arg1 != 0) {
            method178((class235) null, -85, (class235) null);
        }
        class175.field2464 = arg0;
        class270.field4139 = arg2;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)I")
    public static final int method179(int arg0) {
        if (arg0 <= 126) {
            field346 = -127L;
        }
        field349++;
        return 2;
    }
}
