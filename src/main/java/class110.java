import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class110 extends class627 {

    @OriginalMember(owner = "client!sha", name = "m", descriptor = "I")
    public int field1350 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sha", name = "o", descriptor = "I")
    public int field1352 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sha", name = "k", descriptor = "I")
    public int field1348 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sha", name = "j", descriptor = "I")
    public int field1347 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sha", name = "l", descriptor = "I")
    public int field1349 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sha", name = "p", descriptor = "I")
    public int field1353 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sha", name = "r", descriptor = "I")
    public int field1355 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sha", name = "u", descriptor = "I")
    public int field1358 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sha", name = "q", descriptor = "Lgba;")
    public class499 field1354;

    @OriginalMember(owner = "client!sha", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1357 = null;

    @OriginalMember(owner = "client!sha", name = "n", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!sha", name = "s", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lgba;)V", line = 92)
    public class110(class499 arg0) {
        this.field1354 = arg0;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(B)V", line = 14)
    public static void method751(byte arg0) {
        field1357 = null;
        if (arg0 <= 73) {
            field1357 = null;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(BLjava/lang/String;)J", line = 35)
    public static final long method752(byte arg0, String arg1) {
        field1356++;
        int var2 = arg1.length();
        long var3 = 0L;
        int var5 = -123 % ((-arg0 - 26) / 55);
        for (int var6 = 0; var6 < var2; var6++) {
            var3 = (var3 << 5) + ((long) arg1.charAt(var6)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(BII)Z", line = 59)
    public final boolean method753(byte arg0, int arg1, int arg2) {
        field1351++;
        if (arg2 >= this.field1358 && this.field1349 >= arg2 && this.field1347 <= arg1 && this.field1353 >= arg1) {
            return true;
        } else if (this.field1355 <= arg2 && arg2 <= this.field1348 && this.field1350 <= arg1 && this.field1352 >= arg1) {
            return true;
        } else if (arg0 < 1) {
            return false;
        } else {
            return false;
        }
    }
}
