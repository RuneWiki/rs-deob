import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class164 {

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "Lqo;")
    private class22 field2590;

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "J")
    public long field2593;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "Lvq;")
    public static class462 field2589 = null;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
    public static void method1243(int arg0) {
        if (arg0 != 0) {
            field2589 = null;
        }
        field2589 = null;
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)V")
    public static final void method1244(int arg0) {
        if (arg0 < 44) {
            method1245((byte) -81, null);
        }
        field2592++;
        class526.field7282++;
        class564 var1 = class227.method1594(class177.field2723, class72.field1320, -99);
        var1.field7778.method1526(false, 0);
        class167.method1260(118, var1);
    }

    @OriginalMember(owner = "client!tba", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2588++;
        this.field2590.method254(this.field2593, false);
        super.finalize();
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(BLvq;)V")
    public static final void method1245(byte arg0, class462 arg1) {
        int var2 = -104 / ((arg0 - 38) / 54);
        field2591++;
        arg1.method115(true);
        boolean var3 = false;
        for (class462 var4 = (class462) class631.field8684.method2344(-85); var4 != null; var4 = (class462) class631.field8684.method2336((byte) 84)) {
            if (class42.method536(var4.method2732(-17937), arg1.method2732(-17937), true)) {
                class239.method1662(var4, arg1, -1);
                var3 = true;
                break;
            }
        }
        if (!var3) {
            class631.field8684.method2338(true, arg1);
        }
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lqo;JI)V")
    public class164(class22 arg0, long arg1, int arg2) {
        this.field2590 = arg0;
        this.field2593 = arg1;
    }
}
