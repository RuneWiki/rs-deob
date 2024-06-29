import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class300 {

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "J")
    public static volatile long field4008 = 0L;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field4007 = 0;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "Lkk;")
    public static class114 field4010 = new class114("WTI", 5);

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "Lh;")
    public static class434 field4011 = new class434(24, 12);

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "Lhu;")
    public static class76 field4012 = new class76(10);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1682(int arg0, int arg1) {
        field4006++;
        if (arg0 == 100 && class458.field6208 > 0) {
            byte[] var2 = class14.field203[--class458.field6208];
            class14.field203[class458.field6208] = null;
            return var2;
        } else if (arg0 == 5000 && class316.field4180 > 0) {
            byte[] var3 = class412.field5635[--class316.field4180];
            class412.field5635[class316.field4180] = null;
            return var3;
        } else if (arg0 == 30000 && class71.field979 > 0) {
            byte[] var4 = class321.field4236[--class71.field979];
            class321.field4236[class71.field979] = null;
            return var4;
        } else {
            int var5 = 98 / ((-arg1 - 65) / 58);
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public static void method1683(int arg0) {
        field4011 = null;
        field4010 = null;
        if (arg0 >= -46) {
            method1683(47);
        }
        field4012 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIII)I")
    public static final int method1684(int arg0, int arg1, int arg2, int arg3) {
        field4009++;
        int var4 = arg3 & 0x3;
        if (arg2 == var4) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg1;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return arg1;
        }
    }
}
