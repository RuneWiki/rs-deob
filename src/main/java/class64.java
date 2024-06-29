import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class64 extends class175 {

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public int field898 = 0;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    public static int field900 = 0;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public static int field899 = 0;

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "[J")
    public static long[] field907 = new long[1000];

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
    public static int field906 = 1;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "J")
    public static long field905;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lhi;II)V")
    private final void method511(class264 arg0, int arg1, int arg2) {
        field908++;
        if (~arg2 == arg1) {
            this.field898 = arg0.method1777(arg1 ^ 0x2A);
        }
    }

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "(I)V")
    public static void method512(int arg0) {
        field907 = null;
        if (arg0 != 0) {
            method515((class134) null, (class134) null, 13);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lhi;Z)V")
    public final void method513(class264 arg0, boolean arg1) {
        field909++;
        while (true) {
            int var3 = arg0.method1779(-96);
            if (var3 == 0) {
                if (arg1) {
                    method515((class134) null, (class134) null, -116);
                    return;
                } else {
                    return;
                }
            }
            this.method511(arg0, -3, var3);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)Lgj;")
    public static final class208 method514(int arg0, int arg1) {
        field902++;
        class208 var2 = (class208) class207.field3335.method1839((byte) 106, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class156.field2508.method940((byte) 118, class246.method1621(-760058068, arg0), class188.method1283(arg0, (byte) -126));
        class208 var4 = new class208();
        var4.field3428 = arg0;
        if (var3 != null) {
            var4.method1402((byte) 69, new class264(var3));
        }
        var4.method1420((byte) 127);
        if (~var4.field3370 != arg1) {
            var4.method1416(false, method514(var4.field3367, arg1), method514(var4.field3370, 0));
        }
        if (var4.field3399 != -1) {
            var4.method1401(method514(var4.field3392, 0), 126, method514(var4.field3399, 0));
        }
        if (!class144.field2331 && var4.field3391) {
            var4.field3387 = class94.field1386;
            var4.field3358 = class175.field2814;
            var4.field3353 = class261.field4149;
            var4.field3394 = 0;
            var4.field3357 = false;
        }
        class207.field3335.method1830((long) arg0, -46, var4);
        return var4;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljj;Ljj;I)V")
    public static final void method515(class134 arg0, class134 arg1, int arg2) {
        field903++;
        class23.field285 = arg1;
        class238.field3805 = arg0;
        if (arg2 != 0) {
            method514(82, -80);
        }
    }
}
