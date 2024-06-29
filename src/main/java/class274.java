import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class274 {

    @OriginalMember(owner = "client!to", name = "a", descriptor = "Lhc;")
    public static class368 field3740 = new class368("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public static int field3749 = -1;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field3751 = new String[5];

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "Lts;")
    public class116 field3748;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "Lcf;")
    public static class142 field3750;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "Llb;")
    public class210 field3745;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1730(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field3746++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg0 < 1) {
            arg0 = 1;
        }
        int var6 = arg0 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class267.field3666 - class245.field3459) * var6 / 100 + class245.field3459;
        if (class18.field246 > var7) {
            var7 = class18.field246;
        } else if (var7 > class300.field4104) {
            var7 = class300.field4104;
        }
        int var8 = arg0 * var7 * arg2 / (arg3 * 334);
        if (var8 < class147.field2138) {
            short var12 = class147.field2138;
            var7 = arg3 * var12 * 334 / (arg0 * 512);
            if (class300.field4104 < var7) {
                var7 = class300.field4104;
                int var13 = var7 * 512 * arg0 / (var12 * 334);
                int var14 = (arg3 - var13) / 2;
                if (arg4) {
                    class354.field4765.method204();
                    class354.field4765.method461(var14, -16777216, arg0, -91, arg5, arg1);
                    class354.field4765.method461(var14, -16777216, arg0, -91, arg5 - (var14 - arg3), arg1);
                }
                arg3 -= var14 * 2;
                arg5 += var14;
            }
        } else if (var8 > class431.field6048) {
            short var9 = class431.field6048;
            var7 = var9 * 334 * arg3 / (arg0 * 512);
            if (class18.field246 > var7) {
                var7 = class18.field246;
                int var10 = var9 * 334 * arg3 / (var7 * 512);
                int var11 = (arg0 - var10) / 2;
                if (arg4) {
                    class354.field4765.method204();
                    class354.field4765.method461(arg3, -16777216, var11, -91, arg5, arg1);
                    class354.field4765.method461(arg3, -16777216, var11, -91, arg5, arg1 + arg0 - var11);
                }
                arg0 -= var11 * 2;
                arg1 += var11;
            }
        }
        class261.field3599 = arg0 * var7 / 334;
        class65.field885 = (short) arg3;
        class127.field1905 = arg5;
        class353.field4746 = (short) arg0;
        class399.field5535 = arg1;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)I")
    public static final int method1731(int arg0, int arg1) {
        field3742++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        if (arg0 != 512) {
            method1735(-48, -10, 109, (class316) null);
        }
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public static final void method1732(int arg0) {
        class346.field4679.method2522((byte) 71);
        field3743++;
        if (arg0 != 512) {
            field3752 = -40;
        }
        class339.field4590.method2522((byte) 93);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1733(int arg0, int arg1, String arg2) {
        field3741++;
        class26 var3 = class217.method1445(true, arg0, 2);
        var3.method158(28194);
        if (arg1 != 1872) {
            field3750 = null;
        }
        var3.field332 = arg2;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
    public static void method1734(int arg0) {
        if (arg0 != -2) {
            method1735(-107, 76, 97, (class316) null);
        }
        field3750 = null;
        field3751 = null;
        field3740 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIILij;)Lge;")
    public static final class104 method1735(int arg0, int arg1, int arg2, class316 arg3) {
        field3744++;
        class366 var4 = new class366(arg3.method1926(0, arg1, arg2));
        class104 var5 = new class104(arg1, var4.method2255(-32226), var4.method2255(-32226), var4.method2258(1177515464), var4.method2258(1177515464), var4.method2306((byte) 25) == 1, var4.method2306((byte) 49), var4.method2306((byte) 24));
        int var6 = var4.method2306((byte) 113);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field1454.method1162(126, new class428(var4.method2306((byte) 68), var4.method2297(13352), var4.method2297(arg0 ^ 0x17B9), var4.method2297(arg0 ^ 0x17B9), var4.method2297(arg0 + 4247), var4.method2297(13352), var4.method2297(13352), var4.method2297(13352), var4.method2297(arg0 + 4247)));
        }
        var5.method789((byte) 113);
        if (arg0 != 9105) {
            field3752 = -106;
        }
        return var5;
    }
}
