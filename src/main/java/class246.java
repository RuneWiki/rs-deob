import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class246 extends class139 {

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    private int field3864;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    private int field3868;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    private int field3861;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    private int field3851;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    private int field3867;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    private int field3860;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    private int field3852;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    private int field3857;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "[I")
    public static int[] field3863 = new int[25];

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "Llm;")
    public static class150 field3859 = new class150(100);

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "Lbf;")
    public static class108 field3869;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "Lha;")
    public static class51 field3865;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "[[[Lbe;")
    public static class91[][][] field3856;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BII)V")
    public final void method790(byte arg0, int arg1, int arg2) {
        ++field3855;
        int var4 = this.field3867 * arg2 >> 12;
        int var5 = this.field3864 * arg1 >> 12;
        int var6 = this.field3860 * arg1 >> 12;
        int var7 = this.field3868 * arg1 >> 12;
        int var8 = this.field3861 * arg2 >> 12;
        int var9 = this.field3857 * arg1 >> 12;
        int var10 = this.field3851 * arg2 >> 12;
        int var11 = this.field3852 * arg2 >> 12;
        if (arg0 <= 93) {
            this.method791(true, -49, -128);
        }
        class84.method546(var6, var11, 60, var10, var8, super.field1926, var9, var4, var7, var5);
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3864 = arg1;
        this.field3868 = arg5;
        this.field3861 = arg2;
        this.field3851 = arg6;
        this.field3867 = arg0;
        this.field3860 = arg3;
        this.field3852 = arg4;
        this.field3857 = arg7;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(ZII)V")
    public final void method786(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.field3867 = -68;
        }
        ++field3854;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZII)V")
    public final void method791(boolean arg0, int arg1, int arg2) {
        ++field3853;
        if (arg0) {
            method1612((class305) null, (byte) -46);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;ZBIJIZLjava/lang/String;IIZ)V")
    public static final void method1610(String arg0, boolean arg1, byte arg2, int arg3, long arg4, int arg5, boolean arg6, String arg7, int arg8, int arg9, boolean arg10) {
        ++field3862;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; ++var13) {
            var12[var13] = (int) (9.9999999E7D * Math.random());
        }
        class215 var14 = new class215(128);
        var14.method1363(10, -56);
        var14.method1385((arg6 ? 1 : 0) | (arg10 ? 2 : 0) | (arg1 ? 4 : 0), true);
        var14.method1386(arg4, true);
        var14.method1398(true, var12[0]);
        var14.method1384(arg0, -595448376);
        var14.method1398(true, var12[1]);
        var14.method1385(class148.field2026, true);
        var14.method1363(arg9, 93);
        var14.method1363(arg3, 127);
        var14.method1398(true, var12[2]);
        var14.method1385(arg5, true);
        var14.method1385(arg8, true);
        var14.method1398(true, var12[3]);
        var14.method1397(class258.field4163, 106, class136.field1867);
        class215 var15 = new class215(350);
        var15.method1384(arg7, -595448376);
        int var16 = 8 - class231.method1518(arg7, 60) % 8;
        for (int var17 = 0; ~var17 > ~var16; ++var17) {
            var15.method1363((int) (255.0D * Math.random()), 119);
        }
        var15.method1382(8472, var12);
        class231.field3614.field3280 = 0;
        class231.field3614.method1363(22, -48);
        class231.field3614.method1385(var14.field3280 + 2 - -var15.field3280, true);
        int var18 = -83 / ((14 - arg2) / 51);
        class231.field3614.method1385(551, true);
        class231.field3614.method1365(var14.field3280, 0, var14.field3287, (byte) -62);
        class231.field3614.method1365(var15.field3280, 0, var15.field3287, (byte) -62);
        class179.field2714 = 1;
        class19.field318 = 0;
        class168.field2405 = -3;
        class154.field2133 = 0;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)I")
    public static final int method1611(int arg0) {
        ++field3858;
        if (arg0 != 100) {
            field3863 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lnh;B)I")
    public static final int method1612(class305 arg0, byte arg1) {
        int var2 = 0;
        if (arg1 > -118) {
            field3869 = null;
        }
        ++field3866;
        if (arg0.method2056(true, class4.field28)) {
            ++var2;
        }
        if (arg0.method2056(true, class91.field1320)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
    public static void method1613(int arg0) {
        field3869 = null;
        field3863 = null;
        if (arg0 < 72) {
            field3859 = null;
        }
        field3856 = null;
        field3859 = null;
        field3865 = null;
    }
}
