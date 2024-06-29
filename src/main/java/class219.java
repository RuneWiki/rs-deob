import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class219 extends class288 {

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    public static int field3107 = -1;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "Lwe;")
    public static class82 field3093 = null;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public static int field3101 = 0;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public int field3092;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public int field3095;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public int field3097;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public int field3100;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public int field3102;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public int field3103;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public int field3106;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    public int field3111;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    public int field3113;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "Lbc;")
    public static class282 field3110;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "Lwe;")
    public static class82 field3108;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public static void method1422(int arg0) {
        field3108 = null;
        field3110 = null;
        field3093 = null;
        if (arg0 != -1) {
            method1426(-115);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBILwe;)V")
    public static final void method1423(int arg0, byte arg1, int arg2, class82 arg3) {
        field3096++;
        if (class112.field1496 < 2 && class196.field2790 == 0 && !class267.field3857) {
            return;
        }
        String var4 = class248.method1597(-3);
        if (arg3 == null) {
            int var6 = class248.field3614.method525(var4, arg2 + 4, arg0 + 15, 16777215, 0, class206.field2919, class166.field2389);
            class9.method66(class248.field3614.method539(var4) + var6, 15, arg2 + 4, arg1 ^ 0xFFFFFFD4, arg0);
        } else {
            class89 var5 = arg3.method488((byte) 106, class36.field420);
            if (var5 == null) {
                var5 = class248.field3614;
            }
            var5.method542(var4, arg2, arg0, arg3.field1131, arg3.field1048, arg3.field1134, arg3.field1012, arg3.field1091, arg3.field1065, class206.field2919, class166.field2389, class54.field632);
            class9.method66(class54.field632[2], class54.field632[3], class54.field632[0], -35, class54.field632[1]);
        }
        if (arg1 != 9) {
            method1424(56);
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
    public static final void method1424(int arg0) {
        if (arg0 == 25) {
            field3112++;
            if (class141.field2034 == 30) {
                class17.method105(25, (byte) 109);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(B)V")
    public static final void method1425(byte arg0) {
        if (arg0 != -59) {
            method1424(87);
        }
        field3098++;
        if (!class255.field3681 && class200.field2851 != 2) {
            try {
                class208.method1328(-24232, class210.field2953, "tbrefresh");
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)I")
    public static final int method1426(int arg0) {
        if (arg0 != -1) {
            field3108 = null;
        }
        field3099++;
        return class228.field3210;
    }
}
