import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class165 extends class307 {

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
    public static int field2729 = 0;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "Lqd;")
    public static class40 field2736 = class147.method1106("<col=ffffff>", (byte) -127);

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "Lo;")
    public static class199 field2731 = new class199(8);

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "I")
    public int field2726;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    public int field2732;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "[Lcm;")
    public static class185[] field2727;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Loa;", line = 19)
    public static final class277 method1243(int arg0, int arg1) {
        field2728++;
        class277 var2 = (class277) class2.field16.method1345((long) arg1, 28150);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class206.field3291.method1651(class315.method2186(arg1, (byte) -97), class236.method1635(arg1, (byte) -84), -1);
        class277 var4 = new class277();
        if (arg0 >= -10) {
            method1243(-64, 76);
        }
        var4.field4670 = arg1;
        if (var3 != null) {
            var4.method1930(new class26(var3), (byte) -79);
        }
        var4.method1935(0);
        if (var4.field4648 != -1) {
            var4.method1929(method1243(-57, var4.field4661), (byte) 120, method1243(-89, var4.field4648));
        }
        if (var4.field4641 != -1) {
            var4.method1942(method1243(-106, var4.field4641), method1243(-50, var4.field4674), 126);
        }
        if (!class72.field1279 && var4.field4627) {
            var4.field4683 = false;
            var4.field4628 = class62.field1177;
            var4.field4656 = null;
            var4.field4662 = null;
            var4.field4621 = 0;
        }
        class2.field16.method1350(var4, (long) arg1, -67);
        return var4;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V", line = 74)
    public static void method1244(int arg0) {
        field2731 = null;
        field2727 = null;
        field2736 = null;
        if (arg0 != 14043) {
            field2731 = (class199) null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([IIIJ)Lqd;", line = 92)
    public static final class40 method1245(int[] arg0, int arg1, int arg2, long arg3) {
        field2735++;
        if (class90.field1633 != null) {
            class40 var5 = class90.field1633.method1233(true, arg2, arg0, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg1 != -17880) {
            method1245((int[]) null, -34, -13, -4L);
        }
        return arg2 == 5 ? class199.method1401(arg3, 1).method372((byte) -58) : class86.method664(-76, arg3);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)I", line = 119)
    public static final int method1246(int arg0, int arg1, int arg2) {
        if (arg1 == -515141921) {
            field2730++;
            int var3 = arg0 >>> 31;
            return (arg0 + var3) / arg2 - var3;
        } else {
            return 38;
        }
    }
}
