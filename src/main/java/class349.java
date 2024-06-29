import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class349 implements class515 {

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public int field4481;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "[I")
    public static int[] field4480 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field4484 = -1;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "F")
    public static float field4482;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Lgca;")
    public static class234 field4478;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Lkaa;")
    public static class44 field4486;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZZ)V", line = 7)
    public static final void method2010(boolean arg0, boolean arg1) {
        field4485++;
        if (class335.field4139 != null) {
            class335.field4139.method2511((byte) 96);
            class335.field4139 = null;
        }
        class583.field7833 = 0;
        class373.method2160(arg1);
        class564.method2998();
        for (int var2 = 0; var2 < 4; var2++) {
            class634.field8601[var2].method979(13292);
        }
        class569.method3016(false, (byte) 103);
        System.gc();
        class201.method1172(2, (byte) 26);
        class89.field1160 = false;
        class640.field8675 = -1;
        class388.method2220(true, false);
        class227.field2938 = 0;
        class563.field7027 = 0;
        class677.field9229 = 0;
        class442.field5572 = 0;
        class124.field1512 = 0;
        class522.field6612 = 0;
        for (int var3 = 0; var3 < class565.field7071.length; var3++) {
            class565.field7071[var3] = null;
        }
        class644.method3606(false);
        for (int var4 = 0; var4 < 2048; var4++) {
            class132.field1601[var4] = null;
        }
        class99.field1276 = 0;
        class168.field1973.method3839((byte) -102);
        class215.field2516 = 0;
        class370.field4774.method3839((byte) -119);
        class376.method2170(false);
        class340.field4343 = 0;
        class327.field4084.method302((byte) 77);
        class683.method3777((byte) 102);
        class402.method2264(-4366);
        class345.field4414 = 0L;
        class689.field9550 = null;
        if (arg0) {
            class78.method609(10503, 12);
            return;
        }
        class78.method609(10503, 3);
        try {
            class104.method744(class95.field1241, "loggedout", 119);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 82)
    public static void method2011(int arg0) {
        if (arg0 != 25122) {
            method2012(112, -66, -79);
        }
        field4480 = null;
        field4478 = null;
        field4486 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)Ljd;", line = 103)
    public final class216 method20(byte arg0) {
        int var2 = 54 % ((arg0 + 27) / 42);
        field4483++;
        return class653.field8904;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(I)V", line = 112)
    public class349(int arg0) {
        this.field4481 = arg0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V", line = 124)
    public static final void method2012(int arg0, int arg1, int arg2) {
        if (arg0 != -4559) {
            field4480 = null;
        }
        field4479++;
        class243 var3 = class546.method2926(arg2, 1, true);
        var3.method1457(10);
        var3.field3132 = arg1;
    }
}
