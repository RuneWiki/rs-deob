import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class432 {

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field6342 = "Loading world list data";

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public int field6339;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public int field6340;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public int field6341;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public int field6343;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public int field6344;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public int field6345;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public int field6347;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public int field6349;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public int field6351;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public int field6352;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public int field6353;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public int field6354;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public int field6355;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public int field6356;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public int field6357;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public int field6358;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public int field6361;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public int field6362;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "Llm;")
    public static class347 field6348;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static void method2734(int arg0) {
        field6348 = null;
        if (arg0 != 0) {
            method2735(33);
        }
        field6342 = null;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
    public static final void method2735(int arg0) {
        field6346++;
        int var1 = 0;
        if (arg0 < 115) {
            field6360 = 75;
        }
        for (int var2 = 0; var2 < class192.field2574; var2++) {
            for (int var3 = 0; var3 < class364.field5262; var3++) {
                if (class92.method643(class213.field2852, -84, var2, var1, var3, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V")
    public static final void method2736(int arg0, int arg1) {
        field6359++;
        if (arg0 == 0) {
            class174.field2326 = arg1;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)Lak;")
    public static final class219 method2737(byte arg0) {
        int var1 = 88 % ((arg0 - 82) / 36);
        field6350++;
        try {
            return new class408();
        } catch (Throwable var3) {
            try {
                return (class219) Class.forName("td").getDeclaredConstructor().newInstance();
            } catch (Throwable var2) {
                return new class54();
            }
        }
    }
}
