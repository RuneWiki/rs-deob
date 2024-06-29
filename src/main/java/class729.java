import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class729 extends class510 {

    @OriginalMember(owner = "client!no", name = "j", descriptor = "Lbo;")
    public class759 field10198;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "[I")
    public static int[] field10194 = new int[8];

    @OriginalMember(owner = "client!no", name = "d", descriptor = "Lke;")
    public static class622 field10192 = new class622(75, 7);

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public static int field10193;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public static int field10196;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "Ljm;")
    public static class716 field10197;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "Lqn;")
    public static class71 field10195;

    // $FF: synthetic field
    @OriginalMember(owner = "client!no", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field10199;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
    public static void method4089(int arg0) {
        field10192 = null;
        field10197 = null;
        field10194 = null;
        field10195 = null;
        if (arg0 != 1) {
            method4091(null, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIILpi;)V")
    public static final void method4090(int arg0, int arg1, int arg2, int arg3, int arg4, class521 arg5) {
        field10193++;
        if (~arg0 > arg4 || arg1 < 1 || class109.field1314 - 2 < arg0 || class760.field10479 - 2 < arg1) {
            return;
        }
        if (class378.field5427 == null) {
            return;
        }
        class362 var6 = class663.field9301.method2842(arg3, -31205, arg2, arg0, arg1);
        if (var6 == null) {
            return;
        }
        if (var6 instanceof class627) {
            ((class627) var6).method3594(arg5, 0);
            return;
        }
        if (var6 instanceof class130) {
            ((class130) var6).method941(arg5, arg4 + 620);
            return;
        }
        if ((var6 instanceof class412)) {
            ((class412) var6).method2474((byte) 56, arg5);
        } else if (var6 instanceof class91) {
            ((class91) var6).method652(arg5, -128);
            return;
        }
        return;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lst;B)V")
    public static final void method4091(class455 arg0, byte arg1) {
        field10196++;
        if (class378.field5427 == null) {
            return;
        }
        class362 var2 = null;
        if (arg0.field6525 == 0) {
            var2 = (class362) class259.method1702(arg0.field6524, arg0.field6529, arg0.field6523);
        }
        if (arg0.field6525 == 1) {
            var2 = (class362) class143.method987(arg0.field6524, arg0.field6529, arg0.field6523);
        }
        if (arg0.field6525 == 2) {
            var2 = (class362) class195.method1415(arg0.field6524, arg0.field6529, arg0.field6523, field10199 == null ? (field10199 = method4092("ija")) : field10199);
        }
        if (arg0.field6525 == 3) {
            var2 = (class362) class728.method4087(arg0.field6524, arg0.field6529, arg0.field6523);
        }
        if (var2 == null) {
            arg0.field6538 = 0;
            arg0.field6537 = 0;
            arg0.field6526 = -1;
        } else {
            arg0.field6526 = var2.method650(-84);
            arg0.field6538 = var2.method646((byte) 45);
            arg0.field6537 = var2.method643(false);
        }
        if (arg1 >= -49) {
            method4090(-14, 116, -96, -64, 99, null);
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lkv;II[B)V")
    public class729(class280 arg0, int arg1, int arg2, byte[] arg3) {
        this.field10198 = class784.method4293(6406, arg2, 6406, arg3, false, 34037, arg0, arg1);
        this.field10198.method1252(false, 3314, false);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4092(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
