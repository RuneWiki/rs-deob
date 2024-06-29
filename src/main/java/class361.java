import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class361 {

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5239 = null;

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "[[I")
    public static int[][] field5242 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!afa", name = "g", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "[[[Z")
    public static boolean[][][] field5238;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILha;)V", line = 4)
    public static final void method2263(int arg0, class66 arg1) {
        field5237++;
        class79.field1047 = class441.method2663(1, class455.field6536, arg1, true);
        class408.field5763 = class514.method2995(0, arg1, class455.field6536);
        class564.field8008 = class441.method2663(1, class190.field2838, arg1, true);
        int var2 = 61 % (arg0 / 42);
        class157.field2343 = class514.method2995(0, arg1, class190.field2838);
        class546.field7704 = class441.method2663(1, class444.field6313, arg1, true);
        class33.field439 = class514.method2995(0, arg1, class444.field6313);
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V", line = 27)
    public static void method2264(int arg0) {
        if (arg0 != 6) {
            field5239 = null;
        }
        field5239 = null;
        field5242 = null;
        field5238 = null;
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)V", line = 41)
    public static final void method2265(int arg0) {
        if (arg0 <= 98) {
            method2265(-77);
        }
        field5240++;
        if (class64.field867 == 1 || class64.field867 == 3 || class64.field867 != class313.field4650 && (class64.field867 == 0 || class313.field4650 == 0)) {
            class26.field379 = 0;
            class662.field9292 = 0;
            class543.field7606.method387(-21125);
        }
        class313.field4650 = class64.field867;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Z)Lls;", line = 64)
    public static final class148 method2266(boolean arg0) {
        field5241++;
        try {
            if (!arg0) {
                field5238 = null;
            }
            return new class309();
        } catch (Throwable var2) {
            try {
                return (class148) Class.forName("hi").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class398();
            }
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lrv;I)Ljava/lang/String;", line = 87)
    public static final String method2267(class120 arg0, int arg1) {
        int var2 = 100 % ((58 - arg1) / 32);
        field5243++;
        return class322.method2089(-126, arg0, 32767);
    }
}
