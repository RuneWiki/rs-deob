import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class337 extends class107 {

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "Ljava/lang/Object;")
    private Object field5209;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "Ljava/lang/String;")
    public static String field5210 = "glow2:";

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    public static int field5211 = 0;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "Lgd;")
    public static class325 field5206 = new class325(50);

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "Lgd;")
    public static class325 field5212 = new class325(50);

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "J")
    public static long field5213;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "Lpk;")
    public static class120 field5215;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "[[[I")
    public static int[][][] field5214;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)Z", line = 8)
    public final boolean method485(int arg0) {
        field5208++;
        if (arg0 != 16) {
            this.method486(73);
        }
        return false;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 32)
    public static final void method2347(String arg0, boolean arg1) {
        field5205++;
        if (class160.field2597 == null) {
            return;
        }
        int var2 = 0;
        long var3 = class106.method851(arg0, -29);
        if (var3 == 0L) {
            return;
        }
        while (class160.field2597.length > var2 && class160.field2597[var2].field879 != var3) {
            var2++;
        }
        if (class160.field2597.length <= var2 || class160.field2597[var2] == null) {
            return;
        }
        class168.field2700++;
        class209.field3305.method1808((byte) -74, 98);
        if (arg1) {
            class209.field3305.method59(class160.field2597[var2].field879, false);
        }
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 67)
    public final Object method486(int arg0) {
        field5207++;
        if (arg0 < 65) {
            field5215 = (class120) null;
        }
        return this.field5209;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V", line = 78)
    public static void method2348(byte arg0) {
        if (arg0 != 20) {
            field5212 = (class325) null;
        }
        field5215 = null;
        field5206 = null;
        field5210 = null;
        field5212 = null;
        field5214 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 96)
    public class337(Object arg0) {
        this.field5209 = arg0;
    }
}
