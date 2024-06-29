import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class88 extends class35 {

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "Ljava/lang/String;")
    public String field1244;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field1240 = 0;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "[[I")
    public static int[][] field1242 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Lct;")
    public static class285 field1238 = new class285(72, 2);

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V", line = 7)
    public static void method694(boolean arg0) {
        field1242 = null;
        if (arg0) {
            field1246 = 46;
        }
        field1238 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILgu;)Z", line = 22)
    public static final boolean method695(int arg0, class94 arg1) {
        field1245++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 <= 38) {
            method697((class446) null, (byte) -101);
        }
        if (!arg1.field1332) {
            return false;
        } else if (!arg1.method727(-1, class189.field2876)) {
            return false;
        } else if (class184.field2744.method2305((long) arg1.field1312, (byte) 42) == null) {
            return class106.field1484.method2305((long) arg1.field1322, (byte) 64) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIILcp;ZLtq;I)V", line = 52)
    public static final void method696(int arg0, int arg1, int arg2, class481 arg3, boolean arg4, class63 arg5, int arg6) {
        field1241++;
        if (class286.field4374 < 100) {
            class304.method1895(1, arg3, arg5);
        }
        arg5.method500(arg6, arg2, arg6 + arg0, arg1 + arg2);
        if (class286.field4374 < 100) {
            byte var7 = 20;
            int var8 = arg6 + (arg0 / 2);
            int var9 = arg1 / 2 + arg2 - (18 - -var7);
            arg5.method508(arg6, arg2, arg0, arg1, -16777216, 0);
            arg5.method569(var8 - 152, var9, 304, 34, class78.field1099[class252.field3624].getRGB(), 0);
            arg5.method508(var8 - 150, var9 + 2, class286.field4374 * 3, 30, class154.field2157[class252.field3624].getRGB(), 0);
            class462.field6513.method1494(-1, class452.field6413[class252.field3624].getRGB(), var8, (byte) 126, class325.field4873.method2036(class4.field85, (byte) -21), var7 + var9);
            return;
        }
        int var10 = class384.field5692 - ((int) ((float) arg0 / class189.field2890));
        int var11 = (int) ((float) arg1 / class189.field2890) + class446.field6309;
        int var12 = (int) ((float) arg0 / class189.field2890) + class384.field5692;
        class226.field3312 = class384.field5692 - ((int) ((float) arg0 / class189.field2890));
        class304.field4531 = (int) ((float) (arg1 * 2) / class189.field2890);
        class316.field4753 = class446.field6309 - (int) ((float) arg1 / class189.field2890);
        int var13 = class446.field6309 - ((int) ((float) arg1 / class189.field2890));
        class325.field4875 = (int) ((float) (arg0 * 2) / class189.field2890);
        class189.method1319(class189.field2912 + var10, class189.field2902 + var11, var12 + class189.field2912, class189.field2902 + var13, arg6, arg2, arg6 + arg0, arg1 + arg2 + 1);
        if (!arg4) {
            method694(false);
        }
        class189.method1316(arg5);
        class412 var14 = class189.method1320(arg5);
        class78.method654(0, 0, var14, 4, arg5);
        if (class132.field1843 > 0) {
            class163.field2270--;
            if (class163.field2270 == 0) {
                class132.field1843--;
                class163.field2270 = 20;
            }
        }
        if (!class162.field2245) {
            return;
        }
        int var15 = arg0 + arg6 - 5;
        int var16 = arg1 + arg2 - 8;
        class310.field4690.method1490("Fps:" + class83.field1174, 16776960, var15, var16, 29729, -1);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class310.field4690.method1490("Mem:" + var18 + "k", var19, var15, var20, 29729, -1);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lre;B)Lub;", line = 131)
    public static final class279 method697(class446 arg0, byte arg1) {
        if (arg1 != -61) {
            field1240 = 13;
        }
        field1239++;
        return new class279(arg0.method2634(122), arg0.method2634(-39), arg0.method2634(arg1 + 176), arg0.method2634(arg1 + 47), arg0.method2613(arg1 - 25717), arg0.method2613(-25778), arg0.method2628(49152));
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V", line = 145)
    public class88() {
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 155)
    public class88(String arg0, int arg1) {
        this.field1244 = arg0;
    }
}
