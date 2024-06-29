import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class class288 {

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "[I")
    public static int[] field3744 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Lft;")
    public static class4 field3743 = new class4();

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 10)
    public static void method1618(int arg0) {
        field3744 = null;
        field3743 = null;
        if (arg0 != 47) {
            method1618(21);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "()V", line = 24)
    public static final void method1621() {
        class166.method925(1, client.field3216);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)V", line = 29)
    public static final void method1622(int arg0, int arg1) {
        field3742++;
        class557 var2 = class93.method564(arg1, -14073, arg0);
        var2.method3264(arg1 ^ 0xC2271CE5);
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(II)I", line = 41)
    public static int method1624(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)V")
    public abstract void method1617(int arg0, int arg1);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB)I")
    public abstract int method1619(int arg0, byte arg1);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method1620(byte arg0, int arg1);

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)Lwh;")
    public abstract class127 method1623(int arg0);
}
