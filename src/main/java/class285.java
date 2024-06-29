import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class285 implements class409 {

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lcb;")
    private class544 field4373;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Lck;")
    private class666 field4368;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field4372 = 100;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Lqda;")
    private class112 field4374;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lbia;")
    public static class522 field4369;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Llc;")
    public static class672 field4370;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V", line = 6)
    public final void method811(boolean arg0) {
        field4371++;
        this.field4374 = class158.method1258(arg0, this.field4368.field9377, this.field4373);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V", line = 18)
    public static void method1917(byte arg0) {
        if (arg0 <= 90) {
            field4369 = null;
        }
        field4369 = null;
        field4370 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Z", line = 34)
    public final boolean method814(byte arg0) {
        field4367++;
        int var2 = 104 / ((-arg0 - 65) / 37);
        return this.field4373.method3131(-69, this.field4368.field9377);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZB)V", line = 44)
    public final void method374(boolean arg0, byte arg1) {
        if (arg0) {
            int var3 = class638.field8980 <= class785.field10790 ? class785.field10790 : class638.field8980;
            int var4 = class512.field7325 <= class264.field3734 ? class264.field3734 : class512.field7325;
            int var5 = this.field4374.method781();
            int var6 = this.field4374.method792();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var9 > var4) {
                var9 = var4;
                var8 = var4 * var5 / var6;
                var10 = 0;
                var7 = (var3 - var8) / 2;
            }
            this.field4374.method783(var7, var10, var8, var9);
        }
        field4375++;
        if (arg1 != -105) {
            field4372 = -87;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lcb;Lck;)V", line = 87)
    public class285(class544 arg0, class666 arg1) {
        this.field4373 = arg0;
        this.field4368 = arg1;
    }
}
