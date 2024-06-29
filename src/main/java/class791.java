import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class791 {

    @OriginalMember(owner = "client!wia", name = "e", descriptor = "[Llda;")
    public static class513[] field10877 = new class513[0];

    @OriginalMember(owner = "client!wia", name = "j", descriptor = "Z")
    public static boolean field10882 = true;

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "Lmt;")
    public static class419 field10875 = new class419(8, 0, 4, 1);

    @OriginalMember(owner = "client!wia", name = "o", descriptor = "Ljw;")
    public static class581 field10887 = new class581(8, 9);

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "I")
    public int field10873;

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "I")
    public int field10874;

    @OriginalMember(owner = "client!wia", name = "f", descriptor = "I")
    public int field10878;

    @OriginalMember(owner = "client!wia", name = "g", descriptor = "I")
    public int field10879;

    @OriginalMember(owner = "client!wia", name = "h", descriptor = "I")
    public int field10880;

    @OriginalMember(owner = "client!wia", name = "i", descriptor = "I")
    public static int field10881;

    @OriginalMember(owner = "client!wia", name = "l", descriptor = "I")
    public int field10884;

    @OriginalMember(owner = "client!wia", name = "m", descriptor = "I")
    public static int field10885;

    @OriginalMember(owner = "client!wia", name = "n", descriptor = "I")
    public int field10886;

    @OriginalMember(owner = "client!wia", name = "p", descriptor = "Lsaa;")
    public static class347 field10888;

    @OriginalMember(owner = "client!wia", name = "d", descriptor = "[B")
    public byte[] field10876;

    @OriginalMember(owner = "client!wia", name = "k", descriptor = "[B")
    public byte[] field10883;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)V", line = 5)
    public static void method4361(byte arg0) {
        field10877 = null;
        if (arg0 < -105) {
            field10887 = null;
            field10875 = null;
            field10888 = null;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Ltia;Ltia;I)V", line = 19)
    public static final void method4362(class281 arg0, class281 arg1, int arg2) {
        if (arg0.field4145 != null) {
            arg0.method1811(28064);
        }
        field10881++;
        if (arg2 > -98) {
            method4363(-124, 101, -74);
        }
        arg0.field4145 = arg1.field4145;
        arg0.field4146 = arg1;
        arg0.field4145.field4146 = arg0;
        arg0.field4146.field4145 = arg0;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(III)I", line = 44)
    public static final int method4363(int arg0, int arg1, int arg2) {
        field10885++;
        double var3 = Math.log((double) arg1) / Math.log(2.0D);
        if (arg2 != 2) {
            field10882 = false;
        }
        double var5 = Math.log((double) arg0) / Math.log(2.0D);
        double var7 = var5 + Math.random() * (var3 - var5);
        return (int) (Math.pow(2.0D, var7) + 0.5D);
    }
}
