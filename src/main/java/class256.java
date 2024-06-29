import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class256 implements class447 {

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public int field3709;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public int field3710;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Ljha;")
    public class692 field3711;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public int field3715;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Ljg;")
    public class338 field3713;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public int field3701;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public int field3714;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public int field3705;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field3703 = 0;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "[[[Z")
    public static boolean[][][] field3708;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 6)
    public static final void method1739(int arg0) {
        field3712++;
        if (arg0 != -13957) {
            field3708 = null;
        }
        if (class359.field5046 == null) {
            return;
        }
        if (class200.field2876) {
            class53.method484(true);
        }
        class62.field1128.method3128(-2);
        class372.method2342();
        class615.method3536((byte) 36);
        class376.method2361((byte) 123);
        class537.method3145(true);
        class692.method3894(20433);
        if (class576.field8161 != null) {
            class576.field8161.method2018(122);
        }
        class79.method781(255);
        class114.method941(arg0 + 13957);
        class195.method1366(-25575);
        class105.method906((byte) -122);
        class497.method2990(123, false);
        for (int var1 = 0; var1 < 2048; var1++) {
            class349 var5 = class165.field2442[var1];
            if (var5 != null) {
                for (int var6 = 0; var6 < var5.field990.length; var6++) {
                    var5.field990[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class130.field1948; var2++) {
            class84 var3 = class379.field5284[var2].field3885;
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field990.length; var4++) {
                    var3.field990[var4] = null;
                }
            }
        }
        class25.field369 = null;
        class57.field1066 = null;
        class359.field5046.method623(-1);
        class359.field5046 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)V", line = 86)
    public static final void method1740(byte arg0, int arg1, int arg2) {
        field3706++;
        if (class152.field2285 == 1) {
            class320.method2062(arg2, class594.field8486, (byte) -72, arg1);
        } else if (class152.field2285 == 2) {
            if (class200.field2876) {
                class419.method2563(arg1 + class252.method1712((byte) 37), arg2 + class228.method1570((byte) 73), true);
            } else {
                class419.method2563(arg1, arg2, true);
            }
        }
        class152.field2285 = 0;
        class594.field8486 = null;
        if (arg0 != 84) {
            method1741(23);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)Ljw;", line = 112)
    public class551 method930(int arg0) {
        field3707++;
        if (arg0 != 17503) {
            this.method930(-106);
        }
        return null;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V", line = 130)
    public static void method1741(int arg0) {
        field3708 = null;
        int var1 = 115 / ((arg0 - 25) / 35);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLeq;)V", line = 140)
    public static final void method1742(byte arg0, class209 arg1) {
        int var2 = -57 % ((arg0 - 27) / 41);
        class245.field3411 = arg1;
        field3704++;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Ljg;Ljha;IIIIIII)V", line = 157)
    public class256(class338 arg0, class692 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field3702 = arg3;
        this.field3709 = arg7;
        this.field3710 = arg2;
        this.field3711 = arg1;
        this.field3715 = arg8;
        this.field3713 = arg0;
        this.field3701 = arg5;
        this.field3714 = arg6;
        this.field3705 = arg4;
    }
}
