import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class556 implements class590 {

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lkda;")
    private class441 field8163;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lsc;")
    private class38 field8162;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "Ldc;")
    public static class302 field8164 = new class302();

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Lvg;")
    public static class622 field8167 = new class622(99, 8);

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field8169 = 1403;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "Liba;")
    public static class211 field8168 = new class211(69, 0);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field8158;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field8160;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field8161;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Ltq;")
    public static class358 field8166;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lks;")
    public static class421 field8165;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public final void method940(int arg0) {
        field8160++;
        if (arg0 != -32557) {
            this.method944(107, true);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;IIIILla;)I")
    private final int method3230(String arg0, int arg1, int arg2, int arg3, int arg4, class393 arg5) {
        field8159++;
        return arg4 == -4132 ? arg5.method2435(null, null, arg0, arg4 ^ -4132, this.field8163.field6404 - (arg3 * 2), arg1 + arg3, this.field8163.field6407 - (arg3 * 2), this.field8163.field6401, arg2 + arg3, 0, 0, this.field8163.field6411, 0, null, 0, 0) : -44;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lsc;Lkda;)V")
    public class556(class38 arg0, class441 arg1) {
        this.field8163 = arg1;
        this.field8162 = arg0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)V")
    public final void method944(int arg0, boolean arg1) {
        field8161++;
        class191 var3 = this.field8162.method218(this.field8163.field6415, -65536);
        if (arg0 != -31764) {
            field8169 = -21;
        }
        if (var3 == null) {
            return;
        }
        int var4 = this.field8163.field6405.method3193(-30796, class677.field9591, this.field8163.field6404) + this.field8163.field6400;
        int var5 = this.field8163.field6413.method1916((byte) 112, class619.field8966, this.field8163.field6407) + this.field8163.field6412;
        if (this.field8163.field6402) {
            class332.field4821.method633(var4, var5, this.field8163.field6404, this.field8163.field6407, this.field8163.field6414, 0);
        }
        int var6 = var5 + this.method3230(var3.field2584, var4, var5, 5, -4132, class395.field5976) * 12;
        int var9 = var6 + 8;
        if (this.field8163.field6402) {
            class332.field4821.method609(var4, var9, var4 + this.field8163.field6404 - 1, var9, this.field8163.field6414, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method3230(var3.field2588, var4, var6, 5, -4132, class395.field5976) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method3230(var3.field2590, var4, var10, 5, -4132, class395.field5976) * 12;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Z")
    public final boolean method941(byte arg0) {
        field8158++;
        if (arg0 >= -15) {
            field8164 = null;
        }
        return this.field8162.method217(20617);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
    public static void method3231(byte arg0) {
        if (arg0 < 34) {
            field8169 = -30;
        }
        field8164 = null;
        field8167 = null;
        field8165 = null;
        field8168 = null;
        field8166 = null;
    }
}
