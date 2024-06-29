import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class264 {

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "B")
    private byte field3124;

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "I")
    public int field3130;

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "I")
    public int field3123;

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
    public int field3129;

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
    public int field3127;

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3131 = new String[100];

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3128 = new String[5];

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V", line = 3)
    public static void method1575(byte arg0) {
        field3128 = null;
        if (arg0 != -95) {
            field3128 = null;
        }
        field3131 = null;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)I", line = 15)
    public final int method1576(byte arg0) {
        field3122++;
        if (arg0 != -88) {
            this.field3126 = -14;
        }
        return (this.field3124 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "()V", line = 44)
    public class264() {
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Les;)V", line = 46)
    public class264(class403 arg0) {
        this.field3124 = arg0.method2392(-123);
        this.field3130 = arg0.method2390((byte) 73);
        this.field3123 = arg0.method2381((byte) 127);
        this.field3129 = arg0.method2381((byte) 27);
        this.field3126 = arg0.method2381((byte) 120);
        this.field3127 = arg0.method2381((byte) 89);
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(B)I", line = 59)
    public final int method1577(byte arg0) {
        if (arg0 != 100) {
            field3128 = null;
        }
        field3125++;
        return this.field3124 & 0x7;
    }
}
