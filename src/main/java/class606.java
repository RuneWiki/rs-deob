import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class606 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Ltb;")
    public static class450 field8527 = new class450(64);

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field8528;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field8530;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static final void method3317(int arg0) {
        if (arg0 != -1) {
            field8527 = null;
        }
        field8528++;
        try {
            if (class235.field2946 == 1) {
                int var1 = class598.field8405.method1343(-128);
                if (var1 > 0 && class598.field8405.method1341(false)) {
                    int var2 = var1 - class608.field8547;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class598.field8405.method1314(arg0 - 29, var2);
                    return;
                }
                class598.field8405.method1316(arg0 ^ 0xFFFFFFDF);
                class598.field8405.method1315((byte) -108);
                class329.field4193 = null;
                class49.field691 = null;
                if (class316.field4061 == null) {
                    class235.field2946 = 0;
                } else {
                    class235.field2946 = 2;
                }
            }
            if (class235.field2946 == 3) {
                int var3 = class598.field8405.method1343(-114);
                if (var3 < class436.field5443 && class598.field8405.method1341(false)) {
                    int var4 = class223.field2774 + var3;
                    if (var4 > class436.field5443) {
                        var4 = class436.field5443;
                    }
                    class598.field8405.method1314(-36, var4);
                } else {
                    class223.field2774 = 0;
                    class235.field2946 = 0;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class598.field8405.method1316(32);
            class316.field4061 = null;
            class49.field691 = null;
            class235.field2946 = 0;
            class329.field4193 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
    public static void method3318(boolean arg0) {
        field8527 = null;
        if (!arg0) {
            field8527 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)Lpk;")
    public static final class104 method3319(byte arg0, int arg1) {
        field8530++;
        int var2 = 77 % ((13 - arg0) / 49);
        class104[] var3 = class25.method176((byte) -105);
        for (int var4 = 0; var4 < var3.length; var4++) {
            class104 var5 = var3[var4];
            if (var5.field1391 == arg1) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V")
    public static final void method3320(boolean arg0) {
        field8529++;
        class472.field5995.method2412((byte) -127);
        class84.field1187.method2412((byte) -118);
        class376.field4740.method2412((byte) 61);
        class376.field4747.method2412((byte) 92);
        if (arg0) {
            field8527 = null;
        }
    }
}
