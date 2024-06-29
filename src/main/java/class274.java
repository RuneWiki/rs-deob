import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class274 extends class337 {

    @OriginalMember(owner = "client!mt", name = "B", descriptor = "[I")
    public static int[] field4189 = new int[1000];

    @OriginalMember(owner = "client!mt", name = "E", descriptor = "[[B")
    public static byte[][] field4191 = new byte[50][];

    @OriginalMember(owner = "client!mt", name = "F", descriptor = "Lob;")
    public static class521 field4192 = new class521(47, 18);

    @OriginalMember(owner = "client!mt", name = "C", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!mt", name = "G", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!mt", name = "H", descriptor = "Lhn;")
    public static class509 field4194;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "(I)V", line = 3)
    public static void method1802(int arg0) {
        field4189 = null;
        field4194 = null;
        field4192 = null;
        field4191 = null;
        if (arg0 != 1) {
            method1804(-17, 48, 80);
        }
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V", line = 16)
    public class274() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IB)[I", line = 28)
    public final int[] method179(int arg0, byte arg1) {
        ++field4193;
        int[] var3 = super.field5007.method512(arg0, 0);
        if (super.field5007.field687) {
            int var4 = class505.field7381[arg0];
            for (int var5 = 0; class402.field5977 > var5; ++var5) {
                var3[var5] = this.method1803(var4, class109.field1530[var5], (byte) 123) % 4096;
            }
        }
        if (arg1 != -11) {
            this.method1803(-3, -95, (byte) 43);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIB)I", line = 60)
    private final int method1803(int arg0, int arg1, byte arg2) {
        if (arg2 <= 101) {
            return 62;
        } else {
            ++field4190;
            int var4 = arg1 - -(arg0 * 57);
            int var5 = var4 << 1 ^ var4;
            return -(((var5 * var5 * 15731 + 789221) * var5 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "(III)Z", line = 79)
    public static final boolean method1804(int arg0, int arg1, int arg2) {
        int var3 = class534.field7849[arg0][arg1][arg2];
        if (-class221.field3620 == var3) {
            return false;
        } else if (class221.field3620 == var3) {
            return true;
        } else {
            int var4 = arg1 << class163.field2415;
            int var5 = arg2 << class163.field2415;
            if (class52.method497(var4 + 1, class491.field7059[arg0].method411(arg1, arg2), var5 + 1) && class52.method497(class450.field6574 + var4 - 1, class491.field7059[arg0].method411(arg1 + 1, arg2), var5 + 1) && class52.method497(class450.field6574 + var4 - 1, class491.field7059[arg0].method411(arg1 + 1, arg2 + 1), class450.field6574 + var5 - 1) && class52.method497(var4 + 1, class491.field7059[arg0].method411(arg1, arg2 + 1), class450.field6574 + var5 - 1) && class52.method497(class5.field63 + var4, class491.field7059[arg0].method411(arg1, arg2), var5 + 1) && class52.method497(class450.field6574 + var4 - 1, class491.field7059[arg0].method411(arg1 + 1, arg2), class5.field63 + var5) && class52.method497(class5.field63 + var4, class491.field7059[arg0].method411(arg1, arg2 + 1), class450.field6574 + var5 - 1) && class52.method497(class450.field6574 + var4 - 1, class491.field7059[arg0].method411(arg1, arg2), class5.field63 + var5) && class52.method497(class5.field63 + var4, class491.field7059[arg0].method411(arg1, arg2), class5.field63 + var5)) {
                class534.field7849[arg0][arg1][arg2] = class221.field3620;
                return true;
            } else {
                class534.field7849[arg0][arg1][arg2] = -class221.field3620;
                return false;
            }
        }
    }
}
