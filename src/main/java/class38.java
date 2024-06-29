import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class38 {

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field621 = 0;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "Lna;")
    private static class26 field628 = class69.method505("Opened title screen", (byte) -119);

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "Lna;")
    public static class26 field629 = field628;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "[[Z")
    public static boolean[][] field626;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 4)
    public static void method312(int arg0) {
        field626 = (boolean[][]) null;
        field628 = null;
        if (arg0 != 0) {
            field626 = (boolean[][]) ((boolean[][]) null);
        }
        field629 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIIII)V", line = 17)
    public static final void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 != 1) {
            field628 = (class26) null;
        }
        field627++;
        int var9 = arg2 - arg7;
        int var10 = arg3 - arg8;
        int var11 = (arg0 - arg1 << 16) / var9;
        int var12 = (arg4 - arg5 << 16) / var10;
        class157.method1070(arg1, arg3, arg2, var12, arg7, 0, 0, 127, var11, arg8, arg5);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Lwa;", line = 39)
    public static final class82 method314(byte arg0) {
        class82 var1 = new class82(34);
        var1.method591((byte) -40, 11);
        field625++;
        var1.method591((byte) -42, class57.field923);
        var1.method591((byte) -81, class133.field2035 ? 1 : 0);
        var1.method591((byte) -57, class8.field95 ? 1 : 0);
        var1.method591((byte) -12, class22.field307 ? 1 : 0);
        var1.method591((byte) -29, class39.field643 ? 1 : 0);
        var1.method591((byte) -60, class297.field5041 ? 1 : 0);
        var1.method591((byte) -78, class166.field2574 ? 1 : 0);
        var1.method591((byte) -30, class268.field4435 ? 1 : 0);
        var1.method591((byte) -6, class319.field5471 ? 1 : 0);
        var1.method591((byte) -83, class295.field4918);
        var1.method591((byte) -29, class25.field360 ? 1 : 0);
        var1.method591(arg0, class244.field4012 ? 1 : 0);
        var1.method591((byte) -45, class45.field707 ? 1 : 0);
        var1.method591((byte) -78, class33.field560);
        var1.method591((byte) -118, class303.field5227 ? 1 : 0);
        var1.method591((byte) -119, class263.field4311);
        var1.method591((byte) -70, class92.field1499);
        var1.method591((byte) -9, class42.field696);
        var1.method643(-20037, class283.field4721);
        var1.method643(arg0 - 19921, class310.field5331);
        var1.method591((byte) -53, class19.method126());
        var1.method577(-123, class26.field387);
        var1.method591((byte) -19, class96.field1574);
        var1.method591((byte) -117, class26.field380 ? 1 : 0);
        var1.method591((byte) -9, class316.field5411 ? 1 : 0);
        var1.method591((byte) -39, class210.field3269);
        var1.method591((byte) -78, class233.field3684 ? 1 : 0);
        var1.method591((byte) -79, class59.field960 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V", line = 92)
    public static final void method315(int arg0, int arg1) {
        field620++;
        if (arg0 >= 101) {
            class305 var2 = class94.field1539;
            synchronized (class94.field1539) {
                class94.field1536 = arg1;
            }
        }
    }
}
