import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class218 {

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public int field3050 = 0;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public int field3058 = 0;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "Z")
    private boolean field3057 = false;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "[I")
    public static int[] field3051 = new int[25];

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public int field3052;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public int field3054;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public int field3055;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public int field3059;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public int field3060;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public int field3063;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    private int field3064;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public int field3065;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public int field3067;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "J")
    public long field3061;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lae;I)V")
    public final void method1341(class156 arg0, int arg1) {
        if (arg1 != -29353) {
            return;
        }
        while (true) {
            int var3 = arg0.method941((byte) 126);
            if (var3 == 0) {
                field3056++;
                return;
            }
            this.method1345(var3, arg0, 126);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public final void method1342(byte arg0) {
        field3068++;
        if (arg0 <= 29) {
            return;
        }
        this.field3059 = class323.field4733[this.field3064 << 3];
        this.field3054 = (int) Math.sqrt((double) (this.field3055 * this.field3055 + this.field3065 * this.field3065 + this.field3063 * this.field3063));
        if (this.field3053 == 0) {
            this.field3053 = 1;
        }
        if (this.field3052 == 0) {
            this.field3061 = 2147483647L;
        } else if (this.field3052 == 1) {
            this.field3061 = (this.field3054 * 8 / this.field3053);
            this.field3061 *= this.field3061;
        } else if (this.field3052 == 2) {
            this.field3061 = (this.field3054 * 8 / this.field3053);
        }
        if (this.field3057) {
            this.field3054 *= -1;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIZIILhe;I)V")
    public static final void method1343(int arg0, int arg1, boolean arg2, int arg3, int arg4, class239 arg5, int arg6) {
        class378.field5658 = 1;
        field3049++;
        class55.field857 = arg6;
        class25.field424 = arg2;
        class181.field2593 = arg5;
        class376.field5626 = arg0;
        class8.field139 = arg4;
        class409.field6002 = class8.field133.method1489(false) / arg1;
        if (class409.field6002 < 1) {
            class409.field6002 = 1;
        }
        if (arg3 <= 0) {
            method1344(-26);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public static void method1344(int arg0) {
        field3051 = null;
        if (arg0 != 0) {
            field3066 = -47;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILae;I)V")
    private final void method1345(int arg0, class156 arg1, int arg2) {
        if (arg2 <= 123) {
            return;
        }
        field3062++;
        if (arg0 == 1) {
            this.field3064 = arg1.method993((byte) -44);
        } else if (arg0 == 2) {
            arg1.method941((byte) 126);
        } else if (arg0 == 3) {
            this.field3063 = arg1.method950(186);
            this.field3055 = arg1.method950(186);
            this.field3065 = arg1.method950(186);
        } else if (arg0 == 4) {
            this.field3052 = arg1.method941((byte) 127);
            this.field3053 = arg1.method950(186);
        } else if (arg0 == 6) {
            this.field3060 = arg1.method941((byte) 123);
        } else if (arg0 == 8) {
            this.field3058 = 1;
        } else if (arg0 == 9) {
            this.field3050 = 1;
        } else if (arg0 == 10) {
            this.field3057 = true;
            return;
        }
    }
}
