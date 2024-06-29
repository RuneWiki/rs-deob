import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class32 implements class432 {

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "Lqv;")
    public static class316 field415 = new class316(9, 6);

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "Lbd;")
    public static class44 field416 = new class44("K", "T", "K", "K");

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)Ljava/lang/String;", line = 5)
    public static final String method176(int arg0, int arg1, int arg2) {
        field414++;
        int var3 = arg1 - arg2;
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
        } else if (arg0 != 20351) {
            return null;
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

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BJLvr;[I)Ljava/lang/String;", line = 45)
    public final String method177(byte arg0, long arg1, class92 arg2, int[] arg3) {
        if (arg0 >= -36) {
            return null;
        }
        field413++;
        if (class131.field2054 == arg2) {
            class333 var6 = class6.field37.method2697(18782, arg3[0]);
            return var6.method2114((byte) -93, (int) arg1);
        } else if (class425.field5999 == arg2 || class69.field1142 == arg2) {
            class116 var7 = class58.field1052.method1646(21708, (int) arg1);
            return var7.field1780;
        } else if (class406.field5769 == arg2 || class23.field326 == arg2 || class465.field6764 == arg2) {
            return class6.field37.method2697(18782, arg3[0]).method2114((byte) -96, (int) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V", line = 80)
    public static void method178(int arg0) {
        if (arg0 > -37) {
            method178(34);
        }
        field415 = null;
        field416 = null;
    }
}
