import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class208 extends class286 {

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "Lbe;")
    public static class283 field3564 = class153.method941(126, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    public static int field3566 = -1;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "Lbe;")
    public static class283 field3569 = class153.method941(127, "showingVideoAd");

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "Lcm;")
    public static class181 field3565;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "[[[B")
    public static byte[][][] field3567;

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V", line = 3)
    public class208() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)V", line = 8)
    public static void method1380(int arg0) {
        field3564 = null;
        if (arg0 > 0) {
            method1382(-57, (byte) 96);
        }
        field3569 = null;
        field3565 = null;
        field3567 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[I", line = 21)
    public final int[] method14(int arg0, int arg1) {
        if (arg0 > -52) {
            field3567 = (byte[][][]) ((byte[][][]) null);
        }
        field3563++;
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            class136.method849(var3, 0, class27.field410, class153.field2509[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIILgf;IZJ)Z", line = 76)
    public static final boolean method1381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class7 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class65.field890 == class228.field3834;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class246.field4176 || var16 >= class76.field1325) {
                    return false;
                }
                class160 var17 = class86.field1459[arg0][var15][var16];
                if (var17 != null && var17.field2627 >= 5) {
                    return false;
                }
            }
        }
        class26 var18 = new class26();
        var18.field379 = arg11;
        var18.field386 = arg0;
        var18.field380 = arg5;
        var18.field390 = arg6;
        var18.field388 = arg7;
        var18.field381 = arg8;
        var18.field382 = arg9;
        var18.field398 = arg1;
        var18.field394 = arg2;
        var18.field395 = arg1 + arg3 - 1;
        var18.field378 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class86.field1459[var22][var19][var20] == null) {
                        class86.field1459[var22][var19][var20] = new class160(var22, var19, var20);
                    }
                }
                class160 var23 = class86.field1459[arg0][var19][var20];
                var23.field2623[var23.field2627] = var18;
                var23.field2628[var23.field2627] = var21;
                var23.field2609 |= var21;
                var23.field2627++;
                if (var13 && class140.field2329[var19][var20] != 0) {
                    var14 = class140.field2329[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class140.field2329[var24][var25] == 0) {
                        class140.field2329[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class257.field4338[class116.field1969++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IB)V", line = 196)
    public static final void method1382(int arg0, byte arg1) {
        int var2 = -69 % ((79 - arg1) / 38);
        class290.field4915 = arg0;
        field3568++;
        class222.field3731 = 50;
    }
}
