import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class92 extends class288 {

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "Leg;")
    public static class272 field1306 = new class272(4);

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    public static int field1308 = 0;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    public static int field1309 = 0;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "[I")
    public static int[] field1315 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1314 = "";

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public static int field1312 = 0;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field1318 = "Please remove ";

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public static int field1319 = 255;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "Ljj;")
    public static class134 field1313;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field1311;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)V")
    public static void method647(byte arg0) {
        int var1 = 44 % ((arg0 - -26) / 42);
        field1314 = null;
        field1318 = null;
        field1313 = null;
        field1306 = null;
        field1315 = null;
        field1311 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)V")
    public static final void method648(int arg0, byte arg1) {
        ++field1305;
        class75.field1024.method1832(arg0, (byte) 97);
        if (arg1 < 29) {
            field1316 = 28;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class92() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)I")
    private final int method649(int arg0, int arg1, int arg2) {
        ++field1317;
        int var4 = arg0 * 57 + arg1;
        if (arg2 != 1) {
            return 76;
        } else {
            int var5 = var4 ^ var4 << 1;
            return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field1310;
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field4609.method579((byte) -62, arg1);
            if (super.field4609.field1059) {
                int var4 = class1.field15[arg1];
                for (int var5 = 0; ~var5 > ~class186.field2986; ++var5) {
                    var3[var5] = this.method649(var4, class246.field3958[var5], arg0 + 1) % 4096;
                }
            }
            return var3;
        }
    }
}
