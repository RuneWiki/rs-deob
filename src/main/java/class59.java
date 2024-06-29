import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class59 extends class194 {

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "J")
    public long field1078;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Lqk;")
    private static class207 field1080 = class24.method212(255, "Loaded wordpack");

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Lqk;")
    public static class207 field1081 = field1080;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static volatile int field1082 = 0;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field1085 = 0;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Lpk;")
    public static class99 field1088;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(BI)V")
    public static final void method431(byte arg0, int arg1) {
        if (class14.field235 == null || class14.field235.length < arg1) {
            class14.field235 = new int[arg1];
        }
        field1087++;
        if (arg0 != 113) {
            method432(74, 24, -42, -58, -122);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V")
    public static final void method432(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1079++;
        if (arg1 != 10987) {
            return;
        }
        class23.method164(arg4, arg3, arg2 + arg4, arg3 - -arg0);
        class23.method167(arg4, arg3, arg2, arg0, 0);
        if (class134.field2325 < 100) {
            return;
        }
        if (class163.field2886 == null || class163.field2886.field1802 != arg2 || class163.field2886.field1811 != arg0) {
            class139 var5 = new class139(arg2, arg0);
            class23.method165(var5.field2399, arg2, arg0);
            class269.method1840(0, class70.field1253, false, arg2, 0, class197.field3463, arg0, 0, 0);
            class163.field2886 = var5;
            class86.field1565.method818((byte) 79);
        }
        class163.field2886.method387(arg4, arg3);
        int var6 = arg4 + (class21.field351 * arg2 / class197.field3463);
        int var7 = class230.field4219 * arg2 / class197.field3463;
        int var8 = arg3 + (class12.field168 * arg0 / class70.field1253);
        int var9 = class190.field3354 * arg0 / class70.field1253;
        int var10 = 16711680;
        if (class171.field3035 == 1) {
            var10 = 16777215;
        }
        class23.method159(var6, var8, var7, var9, var10, 128);
        class23.method166(var6, var8, var7, var9, var10);
        if (class78.field1430 <= 0) {
            return;
        }
        int var11;
        if (class26.field535 > 10) {
            var11 = 500 - class26.field535 * 25;
        } else {
            var11 = class26.field535 * 25;
        }
        for (class73 var12 = (class73) class14.field234.method922((byte) 110); var12 != null; var12 = (class73) class14.field234.method928(-93)) {
            if (class201.field3556 == var12.field1339) {
                int var13 = arg4 + (var12.field1352 * arg2 / class197.field3463);
                int var14 = arg3 + (var12.field1343 * arg0 / class70.field1253);
                class23.method159(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)J")
    public static final long method433(int arg0, int arg1, int arg2) {
        class174 var3 = class82.field1498[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3138; var4++) {
            class288 var5 = var3.field3140[var4];
            if ((var5.field5129 >> 29 & 0x3L) == 2L && var5.field5150 == arg1 && var5.field5140 == arg2) {
                return var5.field5129;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class59() {
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)I")
    public static final int method434(boolean arg0) {
        field1083++;
        if (class57.field1052 == null) {
            return -1;
        }
        while (class57.field1052.field3301 > class105.field1855) {
            if (class57.field1052.method1308(class105.field1855, (byte) -67)) {
                return class105.field1855++;
            }
            class105.field1855++;
        }
        if (!arg0) {
            field1082 = 24;
        }
        return -1;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V")
    public static void method435(byte arg0) {
        field1088 = null;
        field1080 = null;
        if (arg0 != 114) {
            field1085 = -66;
        }
        field1081 = null;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(J)V")
    public class59(long arg0) {
        this.field1078 = arg0;
    }
}
