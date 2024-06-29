import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class117 extends class317 {

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
    public static int field1593 = 0;

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "Ll;")
    public static class61 field1591 = new class61(0, 0);

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "Ljava/lang/Thread;")
    public static Thread field1594;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)[I", line = 10)
    public final int[] method140(int arg0, int arg1) {
        if (arg0 != 542) {
            method862((byte) 44);
        }
        field1590++;
        int[] var3 = this.field4847.method1387(arg1, (byte) -53);
        if (this.field4847.field2751) {
            for (int var4 = 0; var4 < class326.field4933; var4++) {
                this.method863((byte) -124, var4, arg1);
                int[] var5 = this.method2225((byte) 66, 0, class330.field4971);
                var3[var4] = var5[class138.field1899];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(B)V", line = 49)
    public static void method862(byte arg0) {
        int var1 = 119 % ((arg0 - 29) / 41);
        field1591 = null;
        field1594 = null;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(BII)V", line = 58)
    private final void method863(byte arg0, int arg1, int arg2) {
        field1589++;
        if (arg0 > -113) {
            field1591 = (class61) null;
        }
        int var4 = class99.field1360[arg1];
        int var5 = class51.field693[arg2];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class330.field4971 = arg2;
            class138.field1899 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class330.field4971 = arg1;
            class138.field1899 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class330.field4971 = arg1;
            class138.field1899 = class326.field4933 - arg2;
        } else if (var6 <= 0.0F && -0.7853981633974483D <= (double) var6) {
            class138.field1899 = arg1;
            class330.field4971 = class340.field5109 - arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class330.field4971 = class340.field5109 - arg2;
            class138.field1899 = class326.field4933 - arg1;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class138.field1899 = class326.field4933 - arg2;
            class330.field4971 = class340.field5109 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class330.field4971 = class340.field5109 - arg1;
            class138.field1899 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class138.field1899 = class326.field4933 - arg1;
            class330.field4971 = arg2;
        }
        class138.field1899 &= class246.field3548;
        class330.field4971 &= class202.field2889;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V", line = 132)
    public class117() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[[I", line = 143)
    public final int[][] method53(int arg0, int arg1) {
        field1592++;
        int var3 = -56 % ((-arg0 - 31) / 37);
        int[][] var4 = this.field4840.method1625(arg1, -13241);
        if (this.field4840.field3352) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class326.field4933; var8++) {
                this.method863((byte) -116, var8, arg1);
                int[][] var9 = this.method2227(0, 85, class330.field4971);
                var5[var8] = var9[0][class138.field1899];
                var6[var8] = var9[1][class138.field1899];
                var7[var8] = var9[2][class138.field1899];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lcg;II)V", line = 181)
    public final void method60(class316 arg0, int arg1, int arg2) {
        field1588++;
        int var4 = -4 / ((-arg1 - 17) / 40);
        if (arg2 == 0) {
            this.field4835 = arg0.method2219(16448) == 1;
        }
    }
}
