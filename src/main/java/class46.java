import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class46 {

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "Llj;")
    private class565 field553;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "J")
    public long field552;

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "Lpn;")
    public static class692 field554 = new class692(3);

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "Z")
    public static boolean field556 = false;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!wba", name = "g", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILr;)V")
    public static final void method378(int arg0, class166 arg1) {
        if (arg0 <= 47) {
            method380(null, (byte) -12, 30, -40, (byte) -13);
        }
        field551++;
        if (class473.field6500.method1434((byte) -50) == 0) {
            return;
        }
        if (class503.field6917 == 0) {
            for (class275 var2 = (class275) class473.field6500.method1436(28964); var2 != null; var2 = (class275) class473.field6500.method1443((byte) 6)) {
                class599.field8366.method3956(var2.field3807, false, var2.field3809, -74, false, var2.field3803, var2.field3806 ? class143.field2063.field9689 : null, arg1, class499.field6781, var2.field3808, arg1, var2.field3805);
                var2.method2340(-80);
            }
            class314.method1905(-101);
            return;
        }
        if (class266.field3600 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class266.field3600 = class166.method1169(120, 0, 0, var3, class345.field4629, class605.field8413);
            class315.field4348 = class266.field3600.method129(class43.method368(0, -105, class243.field3306, class55.field627), class168.method1186(class508.field6961, class243.field3306, 0), true);
        }
        for (class275 var4 = (class275) class473.field6500.method1436(28964); var4 != null; var4 = (class275) class473.field6500.method1443((byte) 6)) {
            class599.field8366.method3956(var4.field3807, false, var4.field3809, -128, false, var4.field3803, var4.field3806 ? class143.field2063.field9689 : null, arg1, class315.field4348, var4.field3808, class266.field3600, var4.field3805);
            var4.method2340(126);
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "([Lvv;II)V")
    public static final void method379(class295[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class295 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field4038;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field4038 < (var7 & 0x1) + var6) {
                class295 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method379(arg0, arg1, var4 - 1);
        method379(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lhb;BIIB)V")
    public static final void method380(class677 arg0, byte arg1, int arg2, int arg3, byte arg4) {
        field550++;
        int var5 = arg0.field1807[0];
        int var6 = arg0.field1801[0];
        if (var5 < 0 || class401.field5620 <= var5 || var6 < 0 || var6 >= class257.field3508 || arg3 < 0 || class401.field5620 <= arg3 || arg2 < 0 || arg2 >= class257.field3508) {
            return;
        }
        int var7 = class29.method285(arg0.method881(-118), -4, var6, class65.field856, 0, var5, 0, 0, class151.field2218[arg0.field4053], arg2, arg4 ^ 0xFFFFE54B, true, class125.field1815, 0, arg3);
        if (var7 < 1 || var7 > 3) {
            return;
        }
        if (arg4 != 122) {
            method380(null, (byte) -120, -31, -77, (byte) 14);
        }
        for (int var8 = 0; var8 < (var7 - 1); var8++) {
            arg0.method3852(arg1, class65.field856[var8], class125.field1815[var8], 77);
        }
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Llj;J[Ln;)V")
    public class46(class565 arg0, long arg1, class17[] arg2) {
        this.field553 = arg0;
        this.field552 = arg1;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILin;)Ljava/lang/String;")
    public static final String method381(int arg0, class78 arg1) {
        field549++;
        if (arg0 == ~client.method1679(arg1).method1849((byte) 66)) {
            return null;
        } else if (arg1.field1057 == null || arg1.field1057.trim().length() == 0) {
            return class314.field4339 ? "Hidden-use" : null;
        } else {
            return arg1.field1057;
        }
    }

    @OriginalMember(owner = "client!wba", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field555++;
        this.field553.method3185(this.field552, 2);
        super.finalize();
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V")
    public static void method382(int arg0) {
        if (arg0 >= 81) {
            field554 = null;
        }
    }
}
