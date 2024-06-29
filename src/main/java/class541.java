import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class541 {

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public int field7413 = 0;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public int field7414 = 0;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    public int field7412 = 2048;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    public int field7418 = 2048;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "Lbr;")
    public static class192 field7417 = new class192("", 13);

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "F")
    public static float field7419;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V", line = 8)
    public static final void method3033(byte arg0) {
        if (arg0 <= 28) {
            method3033((byte) -95);
        }
        field7416++;
        class137.field1873 = 0;
        class101.field1211.method2512(-11558);
        class101.field1211.method2507(class389.field5221, (byte) -121);
        class137.field1873++;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIZIII)V", line = 22)
    public static final void method3034(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field7421++;
        if (arg1 == arg3) {
            class107.method589(arg0, arg2, arg6, 0, arg3, arg7, arg5);
            return;
        }
        if (!arg4) {
            method3033((byte) 39);
        }
        if (arg7 - arg3 >= class281.field3703 && arg3 + arg7 <= class255.field3350 && arg5 - arg1 >= class6.field66 && (arg1 + arg5) <= class151.field2071) {
            class199.method1281(-1, arg1, arg5, arg0, arg2, arg7, arg6, arg3);
        } else {
            class62.method350(arg3, arg0, arg5, 47, arg6, arg7, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)Lqw;", line = 55)
    public static final class329 method3035(int arg0, int arg1) {
        field7415++;
        class204[] var2 = class538.field7389;
        synchronized (class538.field7389) {
            if (arg0 != 27479) {
                return null;
            }
            class329 var4;
            if (class538.field7389.length <= arg1 || class538.field7389[arg1].method1301((byte) 42)) {
                var4 = new class329();
                var4.field4414 = new class667[arg1];
                for (int var5 = 0; var5 < arg1; var5++) {
                    var4.field4414[var5] = new class667();
                }
            } else {
                var4 = (class329) class538.field7389[arg1].method1304((byte) -45);
                var4.method3499(12151);
                int var10002 = class421.field5525[arg1]--;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BI)I", line = 94)
    public static final int method3036(byte arg0, int arg1) {
        field7420++;
        int var2 = -18 % ((54 - arg0) / 52);
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IBLio;)V", line = 104)
    private final void method3037(int arg0, byte arg1, class157 arg2) {
        if (arg0 == 1) {
            this.field7414 = arg2.method930(255);
        } else if (arg0 == 2) {
            this.field7412 = arg2.method963(-120);
        } else if (arg0 == 3) {
            this.field7418 = arg2.method963(-124);
        } else if (arg0 == 4) {
            this.field7413 = arg2.method928(2016790224);
        }
        field7422++;
        if (arg1 <= 55) {
            this.field7412 = -15;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V", line = 144)
    public static void method3038(int arg0) {
        if (arg0 <= 117) {
            method3034(-117, -77, 2, 93, false, 52, -60, -94);
        }
        field7417 = null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILio;)V", line = 155)
    public final void method3039(int arg0, class157 arg1) {
        while (true) {
            int var3 = arg1.method930(255);
            if (var3 == 0) {
                field7411++;
                int var4 = 53 / ((44 - arg0) / 50);
                return;
            }
            this.method3037(var3, (byte) 103, arg1);
        }
    }
}
