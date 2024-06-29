import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class55 extends class147 {

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
    public int field884 = 0;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "[Lec;")
    public class39[] field877 = new class39[5];

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "[I")
    public int[] field893 = new int[5];

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "I")
    public int field894;

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "Lna;")
    public static class26 field870 = class69.method505("Konfig geladen)3", (byte) -127);

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public static int field872 = 2;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "[S")
    public static short[] field874 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "Lna;")
    public static class26 field898 = class69.method505("welle2:", (byte) -127);

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "I")
    public static int field899 = 3353893;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "Lna;")
    private static class26 field880 = class69.method505("Please wait)3)3)3", (byte) -126);

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field873 = -1;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "Lna;")
    public static class26 field871 = field880;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "Lsc;")
    public static class259 field876 = new class259(32);

    @OriginalMember(owner = "client!bj", name = "Y", descriptor = "I")
    public static int field902 = 0;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "I")
    public int field897;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "Lrh;")
    public class136 field896;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "Lbm;")
    public class137 field886;

    @OriginalMember(owner = "client!bj", name = "X", descriptor = "Ljj;")
    public class149 field901;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "Ldf;")
    public class164 field889;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "Lfg;")
    public class213 field882;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "Ljh;")
    public class267 field890;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "Lbj;")
    public class55 field891;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "Z")
    public boolean field878;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "Z")
    public boolean field881;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "Z")
    public boolean field892;

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(III)V", line = 28)
    public class55(int arg0, int arg1, int arg2) {
        this.field887 = arg2;
        this.field894 = this.field900 = arg0;
        this.field895 = arg1;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V", line = 61)
    public static void method401(int arg0) {
        field876 = null;
        if (arg0 != 3353893) {
            field871 = (class26) null;
        }
        field874 = null;
        field898 = null;
        field870 = null;
        field880 = null;
        field871 = null;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(B)V", line = 86)
    public static final void method402(byte arg0) {
        client.field4109.method1820(122);
        field875++;
        if (arg0 <= 18) {
            field880 = (class26) null;
        }
        class138.field2114.method1699(17126);
        class136.field2080.method1699(17126);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)J", line = 122)
    public static final long method403(int arg0, int arg1, int arg2) {
        class55 var3 = class36.field585[arg0][arg1][arg2];
        return var3 == null || var3.field886 == null ? 0L : var3.field886.field2105;
    }
}
