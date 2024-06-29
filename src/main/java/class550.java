import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class class550 {

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public int field8199;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public int field8195;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public int field8200;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Lqp;")
    public static class586 field8198 = new class586(75, 1);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field8194;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field8196;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field8197;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Llt;")
    public static class255 field8201;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lwca;I)V", line = 4)
    public static final void method3220(class311 arg0, int arg1) {
        field8196++;
        if (!class369.field5337) {
            return;
        }
        if (arg0.field4673 != null) {
            class311 var2 = class240.method1540(class564.field8360, class427.field6085, true);
            if (var2 != null) {
                class355 var3 = new class355();
                var3.field5160 = arg0.field4673;
                var3.field5159 = var2;
                var3.field5150 = arg0;
                class330.method2072(var3);
            }
        }
        class183.field2794++;
        class165.method1046(-3466, class228.field3352);
        class221.field3268.method2576(true, arg0.field4667);
        if (arg1 != 0) {
            field8201 = null;
        }
        class221.field3268.method2608(class546.field8160, (byte) 71);
        class221.field3268.method2579(-120, class427.field6085);
        class221.field3268.method2619(arg0.field4558, 1420669333);
        class221.field3268.method2595(class564.field8360, 36);
        class221.field3268.method2579(-55, arg0.field4661);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)V", line = 45)
    public static final void method3221(int arg0, boolean arg1) {
        field8194++;
        if (class513.field7606 != null) {
            class513.field7606.method1247((byte) 49);
            class513.field7606 = null;
        }
        class395.field5743 = 0;
        class151.method883((byte) -97);
        class78.method454();
        for (int var2 = 0; var2 < 4; var2++) {
            class67.field772[var2].method481(-88);
        }
        class186.method1221(-1, false);
        System.gc();
        class341.method2116(arg0 + 122, 2);
        class17.field155 = -1;
        class579.field8531 = false;
        class469.method2853(false, true);
        class184.field2798 = 0;
        class584.field8677 = 0;
        class277.field4064 = 0;
        class453.field6622 = 0;
        class157.field2003 = arg0;
        class424.field6061 = 0;
        for (int var3 = 0; var3 < class255.field3737.length; var3++) {
            class255.field3737[var3] = null;
        }
        class465.method2756(-7398);
        for (int var4 = 0; var4 < 2048; var4++) {
            class383.field5604[var4] = null;
        }
        class567.field8409 = 0;
        class627.field9185.method1332(-22538);
        class350.field5086 = 0;
        class546.field8147.method1332(-22538);
        class196.method1264((byte) 107);
        class205.field3037 = 0;
        class406.field5823.method651(true);
        class554.method3239(17496);
        class35.method179(arg0 ^ 0xFFFFFF81);
        class68.field777 = null;
        class502.field7510 = 0L;
        if (arg1) {
            class463.method2749(1, 11);
            return;
        }
        class463.method2749(1, 2);
        try {
            class222.method1460(false, "loggedout", class328.field4850.field5129);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIB)V", line = 118)
    public static final void method3222(int arg0, int arg1, int arg2, byte arg3) {
        field8197++;
        class621 var4 = class442.method2691(arg1, 11, true);
        var4.method3592((byte) 120);
        int var5 = 34 / ((arg3 + 16) / 61);
        var4.field9068 = arg0;
        var4.field9070 = arg2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V", line = 133)
    public static void method3223(byte arg0) {
        field8201 = null;
        field8198 = null;
        if (arg0 >= -76) {
            field8201 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(III)V", line = 153)
    public class550(int arg0, int arg1, int arg2) {
        this.field8199 = arg0;
        this.field8195 = arg1;
        this.field8200 = arg2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZII)V")
    public abstract void method647(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBI)V")
    public abstract void method648(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IBI)V")
    public abstract void method646(int arg0, byte arg1, int arg2);
}
