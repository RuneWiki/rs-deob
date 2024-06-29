import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class49 extends class154 {

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "I")
    private int field775;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "J")
    public static long field773 = 0L;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "Leg;")
    private static class37 field774 = class174.method1167("Hidden", -118);

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "Leg;")
    public static class37 field772 = class174.method1167("_labels", -90);

    @OriginalMember(owner = "client!hc", name = "fb", descriptor = "Leg;")
    public static class37 field777 = field774;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
    public static int field769 = 0;

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!hc", name = "gb", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!hc", name = "hb", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!hc", name = "ib", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "Z")
    public static boolean field770;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIBIILbl;I)Lbl;")
    public static final class253 method321(int arg0, int arg1, byte arg2, int arg3, int arg4, class253 arg5, int arg6) {
        ++field779;
        long var7 = (long) arg4;
        class253 var9 = (class253) class73.field1151.method1411(-15, var7);
        if (var9 == null) {
            class211 var10 = class211.method1494(class94.field1482, arg4, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1480(64, 768, -50, -10, -50);
            class73.field1151.method1404(var7, false, var9);
        }
        int var11 = arg5.method1449();
        int var12 = arg5.method1458();
        int var13 = arg5.method1465();
        int var14 = arg5.method1466();
        class253 var15 = var9.method1464(true, true);
        if (arg3 != 0) {
            var15.method1445(arg3);
        }
        class209 var16 = (class209) var15;
        if (~arg0 != ~class262.method1768(class237.field4140, arg1 + var11, arg6 + var13, (byte) -121) || ~arg0 != ~class262.method1768(class237.field4140, arg1 + var12, arg6 + var14, (byte) -123)) {
            for (int var17 = 0; ~var17 > ~var16.field3551; ++var17) {
                var16.field3540[var17] += -arg0 + class262.method1768(class237.field4140, var16.field3558[var17] + arg1, var16.field3534[var17] + arg6, (byte) -100);
            }
            var16.field3537 = false;
        }
        if (arg2 != 72) {
            method322(false, (class101) null);
        }
        return var15;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class49() {
        this(4096);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        int[] var3 = super.field2574.method206(arg0, arg1 ^ 1075954836);
        if (super.field2574.field536) {
            class54.method350(var3, 0, class227.field3898, this.field775);
        }
        if (arg1 != 1075962732) {
            method322(false, (class101) null);
        }
        ++field780;
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (arg1 == -14015) {
            if (~arg2 == -1) {
                this.field775 = (arg0.method1268(255) << 12) / 255;
            }
            ++field771;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLjl;)V")
    public static final void method322(boolean arg0, class101 arg1) {
        class237.field4083 = arg1;
        ++field778;
        if (!arg0) {
            method321(-125, -125, (byte) 113, 117, -30, (class253) null, 127);
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(I)V")
    private class49(int arg0) {
        super(0, true);
        this.field775 = 4096;
        this.field775 = arg0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
    public static void method323(boolean arg0) {
        if (arg0) {
            field777 = null;
            field772 = null;
            field774 = null;
        }
    }
}
