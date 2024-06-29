import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class178 {

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "Lob;")
    public static class141 field3512 = class175.method1195(40, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field3507 = 0;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Lob;")
    private static class141 field3515 = class175.method1195(40, "Hidden");

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "[I")
    public static int[] field3517 = new int[50];

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Lob;")
    public static class141 field3516 = field3515;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "Lob;")
    public static class141 field3519 = class175.method1195(40, "");

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Lob;")
    public static class141 field3520 = class175.method1195(40, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "J")
    public static long field3514;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static final void method1208(byte arg0) {
        field3521++;
        int var1 = 72 % ((arg0 - 38) / 49);
        for (int var2 = 0; var2 < class195.field3738; var2++) {
            int var3 = class203.field3888[var2];
            class131 var4 = class10.field172[var3];
            if (var4 != null) {
                class104.method694(var4, var4.field2507.field205, 13184);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
    public static final void method1209(boolean arg0) {
        class191 var1 = class150.field2889;
        synchronized (class150.field2889) {
            if (arg0) {
                method1211((byte) -56, null);
            }
            class70.field1407++;
            class132.field2513 = class83.field1650;
            if (class165.field3204 >= 0) {
                while (class165.field3204 != class106.field2034) {
                    int var2 = class181.field3572[class106.field2034];
                    class106.field2034 = class106.field2034 + 1 & 0x7F;
                    if (var2 < 0) {
                        class60.field1177[~var2] = false;
                    } else {
                        class60.field1177[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class60.field1177[var3] = false;
                }
                class165.field3204 = class106.field2034;
            }
            class83.field1650 = class150.field2896;
        }
        field3510++;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(Z)V")
    public static void method1210(boolean arg0) {
        if (arg0) {
            field3507 = 120;
        }
        field3517 = null;
        field3516 = null;
        field3520 = null;
        field3519 = null;
        field3515 = null;
        field3512 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLud;)V")
    public static final void method1211(byte arg0, class203 arg1) {
        if (class20.field344 == arg1.field3881 || arg1.field3851 == -1 || arg1.field3861 != 0 || arg1.field3841 + 1 > class114.method736(15619, arg1.field3851).field496[arg1.field3875]) {
            int var2 = arg1.field3881 - arg1.field3843;
            int var3 = class20.field344 - arg1.field3843;
            int var4 = arg1.field3884 * 128 + arg1.field3871 * 64;
            int var5 = arg1.field3871 * 64 + arg1.field3852 * 128;
            int var6 = arg1.field3835 * 128 + arg1.field3871 * 64;
            int var7 = arg1.field3872 * 128 + arg1.field3871 * 64;
            arg1.field3889 = ((var2 - var3) * var4 + var3 * var5) / var2;
            arg1.field3854 = ((var2 - var3) * var6 + var3 * var7) / var2;
        }
        if (arg1.field3847 == 0) {
            arg1.field3833 = 1024;
        }
        if (arg0 <= 71) {
            method1212((byte) -110, 91);
        }
        if (arg1.field3847 == 1) {
            arg1.field3833 = 1536;
        }
        if (arg1.field3847 == 2) {
            arg1.field3833 = 0;
        }
        field3513++;
        if (arg1.field3847 == 3) {
            arg1.field3833 = 512;
        }
        arg1.field3845 = arg1.field3833;
        arg1.field3856 = 0;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)Z")
    public static final boolean method1212(byte arg0, int arg1) {
        field3509++;
        if (arg0 != -65) {
            method1211((byte) -88, null);
        }
        return (-arg1 & arg1) == arg1;
    }
}
