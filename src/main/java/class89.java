import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class89 extends class31 {

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "Ljava/lang/Object;")
    private Object field1410;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "[I")
    public static int[] field1412 = new int[1000];

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "Lsc;")
    public static class181 field1408 = class149.method967(255, "(Y<)4col>");

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "I")
    public static volatile int field1413 = -1;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class89(Object arg0) {
        this.field1410 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)V")
    public static void method592(int arg0) {
        field1412 = null;
        if (arg0 < -4) {
            field1408 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method246(byte arg0) {
        int var2 = -54 % ((arg0 + 35) / 38);
        field1409++;
        return this.field1410;
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)Z")
    public final boolean method245(int arg0) {
        if (arg0 > -1) {
            return true;
        } else {
            field1411++;
            return false;
        }
    }
}
