import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class31 extends class638 {

    @OriginalMember(owner = "client!jha", name = "p", descriptor = "Ltm;")
    public static class334 field297 = new class334(43, 7);

    @OriginalMember(owner = "client!jha", name = "h", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!jha", name = "i", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!jha", name = "j", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!jha", name = "l", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!jha", name = "m", descriptor = "I")
    public int field294;

    @OriginalMember(owner = "client!jha", name = "n", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "client!jha", name = "o", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!jha", name = "q", descriptor = "I")
    public int field298;

    @OriginalMember(owner = "client!jha", name = "r", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "client!jha", name = "k", descriptor = "Ljava/lang/String;")
    public String field292;

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(ZLre;)Z")
    public static final boolean method159(boolean arg0, class277 arg1) {
        field293++;
        if (arg1 == null) {
            return false;
        } else if (arg1.field4226) {
            if (arg0) {
                field297 = null;
            }
            if (!arg1.method1813((byte) 41, class729.field10200)) {
                return false;
            } else if (class325.field4803.method3512(true, (long) arg1.field4251) == null) {
                return class448.field6531.method3512(true, (long) arg1.field4220) == null;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(II)Lvfa;")
    public static final class88 method160(int arg0, int arg1) {
        field296++;
        class88 var2 = (class88) class754.field10518.method80((byte) -59, (long) arg1);
        if (arg0 < 35) {
            method163(-125, null);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class154.field2390.method2624(0, 0, arg1);
        class88 var4 = new class88();
        if (var3 != null) {
            var4.method766(35, new class301(var3));
        }
        var4.method763(8);
        class754.field10518.method67((long) arg1, var4, -6772);
        return var4;
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(I)V")
    public static void method161(int arg0) {
        field297 = null;
        if (arg0 > -65) {
            method159(true, null);
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(Lr;III[Z)V")
    public static final void method162(class706 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class211.field3511 == class152.field2374) {
            return;
        }
        int var5 = class121.field1867[arg1].method2162(arg3, 1, arg2);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class339 var7 = class121.field1867[var6];
                if (var7 != null) {
                    var7.method621(arg0, arg2, var5 - var7.method2162(arg3, 1, arg2), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(ILofa;)Lhj;")
    public static final class45 method163(int arg0, class301 arg1) {
        field291++;
        int var2 = arg1.method1987(-29);
        class686 var3 = class99.method818((byte) 18)[arg1.method1987(-28)];
        class322 var4 = class570.method3305(0)[arg1.method1987(-49)];
        int var5 = arg1.method1977((byte) -117);
        int var6 = arg1.method1977((byte) -118);
        int var7 = arg1.method1989((byte) -79);
        int var8 = arg1.method1989((byte) -59);
        int var9 = arg1.method1934(-2);
        int var10 = arg1.method1934(-2);
        int var11 = arg1.method1934(-2);
        boolean var12 = ~arg1.method1987(-23) == arg0;
        return new class45(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }
}
