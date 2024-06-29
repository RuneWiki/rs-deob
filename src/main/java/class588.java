import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class588 extends class560 implements class290 {

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    private int field8524;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field8522 = 0;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "[I")
    public static int[] field8527 = new int[1];

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field8525;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field8526;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field8528;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field8530;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oj", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field8531;

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Luca;I[BI)V")
    public class588(class287 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field8524 = arg1;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)J")
    public final long method1793(byte arg0) {
        if (arg0 < 79) {
            field8522 = -6;
        }
        ++field8525;
        return super.field8213.getAddress();
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)I")
    public final int method1790(int arg0) {
        if (arg0 != 17906) {
            field8527 = null;
        }
        ++field8528;
        return 0;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public static void method3354(int arg0) {
        field8527 = null;
        if (arg0 > -116) {
            field8527 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[BII)V")
    public final void method1791(int arg0, byte[] arg1, int arg2, int arg3) {
        this.method3247(arg1, arg0);
        ++field8530;
        this.field8524 = arg2;
        int var5 = 30 / ((arg3 - -71) / 55);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(FIFF)I")
    public static final int method3355(float arg0, int arg1, float arg2, float arg3) {
        ++field8529;
        float var4 = !(arg0 < 0.0F) ? arg0 : -arg0;
        int var5 = -61 / ((5 - arg1) / 57);
        float var6 = !(arg3 < 0.0F) ? arg3 : -arg3;
        float var7 = !(arg2 < 0.0F) ? arg2 : -arg2;
        if (var6 > var4 && var7 < var6) {
            return arg3 > 0.0F ? 0 : 1;
        } else if (var4 < var7 && var7 > var6) {
            return !(arg2 > 0.0F) ? 3 : 2;
        } else {
            return !(arg0 > 0.0F) ? 5 : 4;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lho;I)V")
    public static final void method3356(class285 arg0, int arg1) {
        ++field8526;
        if (class603.field8695 != null) {
            class83 var2 = null;
            if (arg0.field3807 == 0) {
                var2 = (class83) class386.method2381(arg0.field3803, arg0.field3808, arg0.field3802);
            }
            if (arg0.field3807 == 1) {
                var2 = (class83) class374.method2304(arg0.field3803, arg0.field3808, arg0.field3802);
            }
            if (arg1 != 5) {
                field8527 = null;
            }
            if (arg0.field3807 == 2) {
                var2 = (class83) class434.method2583(arg0.field3803, arg0.field3808, arg0.field3802, field8531 != null ? field8531 : (field8531 = method3357("je")));
            }
            if (~arg0.field3807 == -4) {
                var2 = (class83) class566.method3261(arg0.field3803, arg0.field3808, arg0.field3802);
            }
            if (var2 == null) {
                arg0.field3794 = 0;
                arg0.field3804 = -1;
                arg0.field3806 = 0;
            } else {
                arg0.field3804 = var2.method277((byte) 95);
                arg0.field3794 = var2.method264(-5273);
                arg0.field3806 = var2.method263((byte) 120);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)I")
    public final int method1792(byte arg0) {
        ++field8523;
        if (arg0 != 115) {
            field8522 = -96;
        }
        return this.field8524;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3357(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
