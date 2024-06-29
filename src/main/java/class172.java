import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class172 extends class23 {

    @OriginalMember(owner = "client!pi", name = "eb", descriptor = "I")
    private int field3348;

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "I")
    public static int field3338 = -1;

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "Li;")
    public static class88 field3339 = class208.method1425(105, "::noclip");

    @OriginalMember(owner = "client!pi", name = "Y", descriptor = "Li;")
    public static class88 field3342 = class208.method1425(105, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "Li;")
    public static class88 field3336 = class208.method1425(105, ":clan:");

    @OriginalMember(owner = "client!pi", name = "X", descriptor = "I")
    public static int field3341 = 0;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
    public static int field3335 = 0;

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!pi", name = "Z", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!pi", name = "ab", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!pi", name = "bb", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!pi", name = "cb", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!pi", name = "db", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        ++field3343;
        int[] var3 = super.field379.method1080(false, arg0);
        if (super.field379.field3100) {
            class124.method839(var3, 0, class70.field1276, this.field3348);
        }
        return arg1 < 19 ? null : var3;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(I)V")
    private class172(int arg0) {
        super(0, true);
        this.field3348 = 4096;
        this.field3348 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(Z)V")
    public static void method1219(boolean arg0) {
        if (!arg0) {
            field3336 = null;
        }
        field3342 = null;
        field3339 = null;
        field3336 = null;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)V")
    public static final void method1220(byte arg0) {
        int var1 = 0;
        if (arg0 > -7) {
            method1221(-20, (class159) null);
        }
        while (~var1 > ~class192.field3704) {
            int var2 = class139.field2581[var1];
            class44 var3 = class244.field4493[var2];
            int var4 = class230.field4314.method347(26119);
            if (~(var4 & 2) != -1) {
                var4 += class230.field4314.method347(26119) << 8;
            }
            class203.method1396(var4, var3, 16, var2);
            ++var1;
        }
        ++field3340;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILog;)V")
    public static final void method1221(int arg0, class159 arg1) {
        ++field3337;
        long var2 = 0L;
        if (~arg1.field3065 == -1) {
            var2 = class157.method1064(arg1.field3057, arg1.field3061, arg1.field3054);
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        if (~arg1.field3065 == arg0) {
            var2 = class161.method1084(arg1.field3057, arg1.field3061, arg1.field3054);
        }
        if (arg1.field3065 == 2) {
            var2 = class112.method772(arg1.field3057, arg1.field3061, arg1.field3054);
        }
        if (~arg1.field3065 == -4) {
            var2 = class74.method501(arg1.field3057, arg1.field3061, arg1.field3054);
        }
        if (var2 != 0L) {
            var5 = (int) var2 >> 20 & 3;
            var6 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var4 = ((int) var2 & 511494) >> 14;
        }
        arg1.field3066 = var5;
        arg1.field3055 = var6;
        arg1.field3062 = var4;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lea;Li;B)I")
    public static final int method1222(class46 arg0, class88 arg1, byte arg2) {
        if (arg2 != 113) {
            return -107;
        } else {
            ++field3344;
            int var3 = arg0.field831;
            arg0.method308(true, arg1.field1660);
            arg0.field831 += class112.field2035.method1458(arg1.field1643, arg0.field831, arg1.field1660, 0, arg0.field842, true);
            return -var3 + arg0.field831;
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)V")
    public static final void method1223(int arg0, int arg1) {
        if (arg1 >= -54) {
            field3339 = null;
        }
        class157.field3035 = arg0;
        ++field3346;
        class34.field594 = -1;
        class34.field594 = -1;
        class245.method1606(0);
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
    public class172() {
        this(4096);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (arg1 != -3) {
            method1223(35, -38);
        }
        if (arg2 == 0) {
            this.field3348 = (arg0.method347(26119) << 12) / 255;
        }
        ++field3334;
    }
}
