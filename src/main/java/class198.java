import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class198 extends class539 {

    @OriginalMember(owner = "client!sba", name = "q", descriptor = "Lkda;")
    public static class354 field2926 = new class354();

    @OriginalMember(owner = "client!sba", name = "s", descriptor = "[I")
    public static int[] field2928 = new int[1000];

    @OriginalMember(owner = "client!sba", name = "m", descriptor = "I")
    public int field2922;

    @OriginalMember(owner = "client!sba", name = "n", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!sba", name = "o", descriptor = "I")
    public int field2924;

    @OriginalMember(owner = "client!sba", name = "p", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!sba", name = "r", descriptor = "[[B")
    public static byte[][] field2927;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V", line = 7)
    public static void method1340(int arg0) {
        field2927 = null;
        field2928 = null;
        field2926 = null;
        int var1 = -114 / ((arg0 + 12) / 32);
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(BII)Ljava/lang/String;", line = 32)
    public static final String method1341(byte arg0, int arg1, int arg2) {
        field2925++;
        int var3 = arg2 - arg1;
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
        } else {
            if (arg0 != -10) {
                method1341((byte) -17, 94, 89);
            }
            return var3 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lfaa;Z)Lfaa;", line = 70)
    public static final class140 method1342(class140 arg0, boolean arg1) {
        field2923++;
        if (arg0.field2054 != -1) {
            return class266.method1626(arg0.field2054, 114);
        }
        int var2 = arg0.field2100 >>> 16;
        class527 var3 = new class527(class368.field5262);
        class198 var4 = (class198) var3.method2928((byte) -112);
        if (!arg1) {
            field2928 = null;
        }
        while (var4 != null) {
            if (var4.field2922 == var2) {
                return class266.method1626((int) var4.field7311, 124);
            }
            var4 = (class198) var3.method2927((byte) -97);
        }
        return null;
    }
}
