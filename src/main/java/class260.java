import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class260 {

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field3265 = 0;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "F")
    public static float field3259;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZFFF)F", line = 5)
    public static final float method1536(boolean arg0, float arg1, float arg2, float arg3) {
        if (arg0) {
            field3264++;
            return (arg2 - arg3) * arg1 + arg3;
        } else {
            return -0.15269251F;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 21)
    public static final String method1537(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        } else {
            field3261++;
            return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFFA065) >> 16) + "." + ((arg1 & 0xFF8D) >> 8) + "." + (arg1 & 0xFF);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZI)Ljava/lang/String;", line = 32)
    public static final String method1538(int arg0, boolean arg1, int arg2) {
        field3262++;
        if (arg1) {
            method1536(true, 0.030924685F, -1.5134544F, -1.0969118F);
        }
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)Lbf;", line = 79)
    public static final class247 method1539(int arg0, byte arg1) {
        field3263++;
        class247 var2 = (class247) class80.field817.method78(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class24.field186.method3854((byte) 112, 0, arg0);
        class247 var4 = new class247();
        if (var3 != null) {
            var4.method1457(arg0, new class115(var3), 43);
        }
        if (arg1 < 67) {
            method1539(-86, (byte) 123);
        }
        class80.field817.method92(1, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V", line = 112)
    public static final void method1540(int arg0, int arg1) {
        if (arg1 != -1) {
            method1537(true, 88);
        }
        field3260++;
        class76 var2 = class3.method28(4, (byte) 42, arg0);
        var2.method406(-975503968);
    }
}
