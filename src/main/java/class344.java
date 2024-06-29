import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class344 extends class178 {

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "Ljava/lang/Object;")
    private Object field5346;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "Ljava/lang/String;")
    public static String field5344 = "Loading interfaces - ";

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public static int field5340 = -1;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field5338 = 0;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "Z")
    public static boolean field5349 = false;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "Lgn;")
    public static class257 field5341;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "[Ltf;")
    public static class112[] field5343;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 8)
    public final Object method695(int arg0) {
        field5345++;
        return arg0 == 0 ? this.field5346 : (Object) null;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)Lfd;", line = 20)
    public static final class206 method2382(int arg0) {
        field5339++;
        int var1 = class28.field537[0] * class176.field2833[0];
        byte[] var2 = class254.field3968[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class274.field4202[class61.method475(var2[var4], 255)];
        }
        class206 var5 = new class206(class194.field3127, class321.field4891, class80.field1572[0], class27.field530[0], class28.field537[0], class176.field2833[0], var3);
        class97.method644((byte) 81);
        if (arg0 != -29899) {
            field5347 = -18;
        }
        return var5;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)V", line = 53)
    public static final void method2383(byte arg0) {
        for (int var1 = 0; var1 < class248.field3865; var1++) {
            int var2 = class130.field2206[var1];
            class278 var3 = class97.field1715[var2];
            int var4 = class190.field3082.method1317((byte) -72);
            if ((var4 & 0x10) != 0) {
                var4 += class190.field3082.method1317((byte) -107) << 8;
            }
            class190.method1217(var3, var2, var4, 62);
        }
        if (arg0 >= -29) {
            method2386(-90, false);
        }
        field5337++;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)V", line = 81)
    public static void method2384(byte arg0) {
        field5341 = null;
        field5344 = null;
        field5343 = null;
        if (arg0 != 32) {
            field5347 = 22;
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)Z", line = 104)
    public final boolean method696(int arg0) {
        if (arg0 != 0) {
            field5347 = 15;
        }
        field5350++;
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZIBI)V", line = 116)
    public static final void method2385(boolean arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        field5348++;
        int var5 = 16 / ((arg3 + 85) / 36);
        class99.method653(class236.field3715.length - 1, arg0, -82, arg4, arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)V", line = 128)
    public static final void method2386(int arg0, boolean arg1) {
        for (class174 var2 = (class174) class233.field3643.method424(arg0 ^ 0x4B); var2 != null; var2 = (class174) class233.field3643.method425(-32547)) {
            if (var2.field2789 != null) {
                class11.field230.method1237(var2.field2789);
                var2.field2789 = null;
            }
            if (var2.field2780 != null) {
                class11.field230.method1237(var2.field2780);
                var2.field2780 = null;
            }
            var2.method278((byte) -105);
        }
        field5342++;
        if (arg1) {
            for (class174 var3 = (class174) class264.field4094.method424(-70); var3 != null; var3 = (class174) class264.field4094.method425(-32547)) {
                if (var3.field2789 != null) {
                    class11.field230.method1237(var3.field2789);
                    var3.field2789 = null;
                }
                var3.method278((byte) -105);
            }
            for (class174 var4 = (class174) class200.field3197.method306(0); var4 != null; var4 = (class174) class200.field3197.method300(1)) {
                if (var4.field2789 != null) {
                    class11.field230.method1237(var4.field2789);
                    var4.field2789 = null;
                }
                var4.method278((byte) -105);
            }
        }
        if (arg0 != -1) {
            field5343 = (class112[]) null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 195)
    public class344(Object arg0) {
        this.field5346 = arg0;
    }
}
