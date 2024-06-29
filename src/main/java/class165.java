import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class165 {

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Lke;")
    public static class256 field2925 = class316.method2202("Zugewiesener Speicher)3", 27626);

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Lke;")
    public static class256 field2929 = class316.method2202("M-Bmoire attribu-Be", 27626);

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Z")
    public static boolean field2928 = false;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "[I")
    public static int[] field2930 = new int[32];

    @OriginalMember(owner = "client!df", name = "g", descriptor = "Lij;")
    public static class175 field2927 = new class175();

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field2932 = 0;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Llh;")
    public static class218 field2922;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Ljava/lang/Thread;")
    public static Thread field2931;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Ldc;", line = 36)
    public static final class1 method1208(int arg0, int arg1) {
        field2924++;
        class1 var2 = (class1) class294.field5107.method2077(-13408, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 2) {
            method1208(121, 33);
        }
        byte[] var3 = class76.field1448.method1016(3, arg1 ^ 0x66, arg0);
        class1 var4 = new class1();
        if (var3 != null) {
            var4.method8(new class41(var3), (byte) 110);
        }
        class294.field5107.method2074(var4, (long) arg0, -1);
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lng;B)V", line = 60)
    public static final void method1209(class138 arg0, byte arg1) {
        field2921++;
        if (class119.field2121) {
            return;
        }
        if (class253.field4323) {
            class60.method481();
        } else {
            class178.method1295();
        }
        class172.field3058 = class207.method1463(true, class91.field1660, arg0);
        int var2 = class124.field2200;
        int var3 = var2 * 956 / 503;
        class172.field3058.method648((class112.field1969 - var3) / 2, 0, var3, var2);
        class10.field157 = class112.method773(class194.field3539, arg0, (byte) -76);
        if (arg1 >= 109) {
            class10.field157.method12(class112.field1969 / 2 - (class10.field157.field5015 / 2), 18);
            class119.field2121 = true;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIII)V", line = 111)
    public static final void method1210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg6 + arg3;
        field2926++;
        if (arg5 > -15) {
            field2930 = (int[]) null;
        }
        int var9 = arg2 - arg3;
        int var10 = arg1 + arg3;
        int var11 = arg0 - arg3;
        for (int var12 = arg6; var12 < var8; var12++) {
            class73.method550(-29903, class308.field5329[var12], arg2, arg1, arg7);
        }
        for (int var13 = arg0; var13 > var11; var13--) {
            class73.method550(-29903, class308.field5329[var13], arg2, arg1, arg7);
        }
        for (int var14 = var8; var14 <= var11; var14++) {
            int[] var15 = class308.field5329[var14];
            class73.method550(-29903, var15, var10, arg1, arg7);
            class73.method550(-29903, var15, var9, var10, arg4);
            class73.method550(-29903, var15, arg2, var9, arg7);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 168)
    public static void method1211(int arg0) {
        field2931 = null;
        field2927 = null;
        field2929 = null;
        field2925 = null;
        if (arg0 > -62) {
            field2922 = (class218) null;
        }
        field2930 = null;
        field2922 = null;
    }
}
