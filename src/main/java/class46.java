import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class46 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public int field549;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "S")
    public short field551;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public int field558;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "S")
    public short field550;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "B")
    public byte field557;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "B")
    public byte field552;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "Z")
    public boolean field554;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "S")
    public short field555;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field560 = 0;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Lbda;")
    public static class437 field553;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "[I")
    public static int[] field559;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method244(byte arg0) {
        field553 = null;
        if (arg0 < 25) {
            method245(-49);
        }
        field559 = null;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
    public class46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field549 = arg10;
        this.field551 = (short) arg5;
        this.field558 = arg0;
        this.field550 = (short) arg4;
        this.field557 = (byte) arg7;
        this.field552 = (byte) arg8;
        this.field554 = arg9;
        this.field555 = (short) arg6;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static final void method245(int arg0) {
        field556++;
        class314 var1 = (class314) class519.field7193.method2506(68);
        if (arg0 != 0) {
            method245(-9);
        }
        while (var1 != null) {
            class523 var2 = var1.field4210;
            if (var2.field7240) {
                var1.method242(true);
                var2.method2970((byte) 110);
            } else if (class327.field4404 >= var2.field7258) {
                var2.method2967(2, class498.field6849);
                if (var2.field7240) {
                    var1.method242(true);
                } else {
                    class616.method3409(var2, true);
                }
            }
            var1 = (class314) class519.field7193.method2505(-112);
        }
    }
}
