import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class class165 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[Lmb;")
    public static class260[] field2335 = new class260[128];

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Ljava/util/Random;")
    public static Random field2336 = new Random();

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Lij;")
    public static class316 field2339;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V", line = 3)
    public static final void method1179(int arg0, int arg1) {
        field2338++;
        class26 var2 = class217.method1445(true, arg0, arg1);
        var2.method164(12);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 15)
    public static void method1180(int arg0) {
        field2335 = null;
        if (arg0 == 5) {
            field2339 = null;
            field2336 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lij;Lij;I)V", line = 33)
    public static final void method1181(class316 arg0, class316 arg1, int arg2) {
        field2334++;
        if (arg2 == 5) {
            class171.field2427 = arg0;
            class249.field3497 = arg1;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZZB)V", line = 49)
    public static final void method1182(boolean arg0, boolean arg1, byte arg2) {
        field2337++;
        if (arg0) {
            class80.field1117++;
            class269.method1706(-1);
        }
        int var3 = 33 % ((28 - arg2) / 33);
        if (arg1) {
            class5.field49++;
            class359.method2218((byte) 127);
        }
    }
}
