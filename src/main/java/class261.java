import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class261 extends class454 {

    @OriginalMember(owner = "client!tw", name = "F", descriptor = "S")
    public static short field3703 = 32767;

    @OriginalMember(owner = "client!tw", name = "D", descriptor = "I")
    public static int field3701 = 1;

    @OriginalMember(owner = "client!tw", name = "H", descriptor = "Lsv;")
    public static class570 field3705 = new class570(61, -1);

    @OriginalMember(owner = "client!tw", name = "A", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!tw", name = "B", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!tw", name = "E", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!tw", name = "G", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!tw", name = "I", descriptor = "Lhga;")
    public static class197 field3706;

    @OriginalMember(owner = "client!tw", name = "C", descriptor = "Lsi;")
    private class769 field3700;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(ILol;)V")
    public final void method1693(int arg0, class431 arg1) {
        while (true) {
            int var3 = arg1.method2557(14929);
            if (var3 == 0) {
                field3702++;
                if (arg0 >= -60) {
                    this.method1694(null, -23, (byte) -23);
                    return;
                }
                return;
            }
            this.method1694(arg1, var3, (byte) 53);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lol;IB)V")
    private final void method1694(class431 arg0, int arg1, byte arg2) {
        field3698++;
        if (arg1 == 249) {
            int var4 = arg0.method2557(14929);
            if (this.field3700 == null) {
                int var5 = class661.method3706(var4, true);
                this.field3700 = new class769(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method2557(14929) == 1;
                int var8 = arg0.method2515(85);
                class766 var9;
                if (var7) {
                    var9 = new class662(arg0.method2532((byte) -111));
                } else {
                    var9 = new class725(arg0.method2526(17));
                }
                this.field3700.method4252(false, var9, (long) var8);
            }
        }
        if (arg2 <= 26) {
            field3703 = 69;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V")
    public static void method1695(int arg0) {
        field3705 = null;
        field3706 = null;
        if (arg0 != -1) {
            method1695(-61);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIZ)I")
    public final int method1696(int arg0, int arg1, boolean arg2) {
        field3704++;
        if (this.field3700 == null) {
            return arg1;
        }
        class725 var4 = (class725) this.field3700.method4253((long) arg0, -1);
        if (var4 == null) {
            return arg1;
        } else {
            if (!arg2) {
                this.method1697(null, false, 50);
            }
            return var4.field10098;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;")
    public final String method1697(String arg0, boolean arg1, int arg2) {
        if (arg1) {
            field3706 = null;
        }
        field3699++;
        if (this.field3700 == null) {
            return arg0;
        } else {
            class662 var4 = (class662) this.field3700.method4253((long) arg2, -1);
            return var4 == null ? arg0 : var4.field9327;
        }
    }
}
