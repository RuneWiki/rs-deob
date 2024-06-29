import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class125 extends RuntimeException {

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1620;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "Ljava/lang/String;")
    public String field1624;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public static int field1619 = -9017772;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public static int field1621 = 0;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "Lte;")
    public static class357 field1617 = new class357(64);

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "J")
    public static long field1623 = 0L;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "Luh;")
    public static class414 field1618;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IBIIII)Z")
    public static final boolean method885(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 > -95) {
            field1623 = -45L;
        }
        field1622++;
        for (int var6 = arg5; var6 <= arg3; var6++) {
            for (int var7 = arg2; var7 <= arg4; var7++) {
                if (class386.field5640[var6][var7] == arg0 && class338.field4989[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
    public static void method886(int arg0) {
        field1617 = null;
        field1618 = null;
        if (arg0 != 1) {
            method885(39, (byte) 34, 66, 83, -90, -20);
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class125(Throwable arg0, String arg1) {
        this.field1620 = arg0;
        this.field1624 = arg1;
    }
}
