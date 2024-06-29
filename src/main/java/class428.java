import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class class428 {

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "[B")
    public byte[] field6012 = new byte[5000];

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public volatile int field6013 = 0;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public int field6011 = 0;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "[Ljava/lang/Object;")
    public Object[] field6016 = new Object[5000];

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public volatile int field6010 = 0;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public int field6018 = 0;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "[I")
    public static int[] field6019 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lln;B)I", line = 18)
    public static final int method2423(class345 arg0, byte arg1) {
        field6014++;
        String var2 = class172.method1183(arg0, 0);
        int[] var3 = null;
        if (class375.method2187(arg0.field4983, false)) {
            var3 = class648.field9184.method3064((int) arg0.field4979, -54).field3610;
        } else if (arg0.field4980 != -1) {
            var3 = class648.field9184.method3064(arg0.field4980, -28).field3610;
        } else if (class287.method1729(arg0.field4983, (byte) 17)) {
            class178 var4 = (class178) class323.field4762.method2061(-17305, (long) ((int) arg0.field4979));
            if (var4 != null) {
                class225 var5 = var4.field2634;
                class161 var6 = var5.field3245;
                if (var6.field2409 != null) {
                    var6 = var6.method1114(class195.field2888, 0);
                }
                if (var6 != null) {
                    var3 = var6.field2429;
                }
            }
        } else if (class471.method2680(arg0.field4983, -14)) {
            Object var7 = null;
            class620 var8;
            if (arg0.field4983 == 1007) {
                var8 = class164.field2499.method2013((int) arg0.field4979, false);
            } else {
                var8 = class164.field2499.method2013((int) (arg0.field4979 >>> 32 & 0x7FFFFFFFL), false);
            }
            if (var8.field8623 != null) {
                var8 = var8.method3450(-128, class195.field2888);
            }
            if (var8 != null) {
                var3 = var8.field8572;
            }
        }
        if (var3 != null) {
            var2 = var2 + class366.method2140(4, var3);
        }
        int var9 = class432.field6119.method3321((byte) -11, var2, class206.field3038);
        if (arg1 < 48) {
            method2423(null, (byte) -83);
        }
        if (arg0.field4984) {
            var9 += class545.field7386.method31() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)[Ldg;", line = 91)
    public static final class377[] method2425(byte arg0) {
        if (arg0 == -26) {
            field6017++;
            return new class377[] { class607.field8453, class264.field3747, class228.field3272 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V", line = 133)
    public static void method2428(int arg0) {
        field6019 = null;
        int var1 = 43 % ((6 - arg0) / 50);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lhl;B)V")
    public abstract void method2420(class486 arg0, byte arg1);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public abstract void method2421(byte arg0);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIZLd;)V")
    public abstract void method2422(int arg0, int arg1, boolean arg2, class136 arg3);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZLhl;)V")
    public abstract void method2424(boolean arg0, class486 arg1);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
    public abstract void method2426(int arg0, int arg1);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public abstract void method2427(int arg0);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(ZLhl;)V")
    public abstract void method2429(boolean arg0, class486 arg1);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)V")
    public abstract void method2430(int arg0, int arg1);
}
