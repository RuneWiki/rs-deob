import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class70 implements class217 {

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "Ljs;")
    private class269 field943;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "Lis;")
    private class2 field948;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field942 = 0;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "Lpl;")
    public static class612 field949;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V", line = 5)
    public static void method416(int arg0) {
        if (arg0 <= -121) {
            field949 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZI)V", line = 16)
    public final void method395(boolean arg0, int arg1) {
        field947++;
        class649 var3 = this.field948.method7(this.field943.field3392, -1);
        if (arg1 != 6621) {
            field949 = null;
        }
        if (var3 == null) {
            return;
        }
        int var4 = this.field943.field3401.method2206(class593.field8327, this.field943.field3407, 2) + this.field943.field3390;
        int var5 = this.field943.field3398.method195(class316.field4060, this.field943.field3393, -84) + this.field943.field3402;
        if (this.field943.field3394) {
            class32.field452.method978(var4, var5, this.field943.field3407, this.field943.field3393, this.field943.field3396, 0);
        }
        int var6 = var5 + this.method418(var4, class65.field889, var5, 5, var3.field9168, false) * 12;
        int var9 = var6 + 8;
        if (this.field943.field3394) {
            class32.field452.method1065(var4, var9, this.field943.field3407 + var4 - 1, var9, this.field943.field3396, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method418(var4, class65.field889, var6, 5, var3.field9171, false) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method418(var4, class65.field889, var10, 5, var3.field9170, false) * 12;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lr;I)V", line = 53)
    public static final void method417(class566 arg0, int arg1) {
        if (arg1 != 5) {
            method417(null, 78);
        }
        field946++;
        for (class93 var2 = (class93) class290.field3620.method802((byte) 120); var2 != null; var2 = (class93) class290.field3620.method800((byte) -106)) {
            if (var2.field1301) {
                var2.method537(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 75)
    public final void method394(int arg0) {
        if (arg0 > -41) {
            field942 = -115;
        }
        field944++;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)Z", line = 88)
    public final boolean method392(byte arg0) {
        field945++;
        return arg0 == 82 ? this.field948.method9((byte) 116) : true;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lis;Ljs;)V", line = 100)
    public class70(class2 arg0, class269 arg1) {
        this.field943 = arg1;
        this.field948 = arg0;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILla;IILjava/lang/String;Z)I", line = 109)
    private final int method418(int arg0, class413 arg1, int arg2, int arg3, String arg4, boolean arg5) {
        field950++;
        if (arg5) {
            this.field948 = null;
        }
        return arg1.method2185(this.field943.field3406, 0, null, this.field943.field3407 - (arg3 * 2), arg4, this.field943.field3395, 0, -79, 0, this.field943.field3393 - (arg3 * 2), null, null, 0, 0, arg2 + arg3, arg0 - -arg3);
    }
}
