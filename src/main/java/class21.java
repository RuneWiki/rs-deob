import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class21 extends class42 {

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public volatile int field379 = -1;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "Ljava/lang/String;")
    public volatile String field378;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "Z")
    public static boolean field380 = false;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "J")
    public static long field386 = -1L;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Lvj;")
    public static class304 field376 = new class304("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "Ljr;")
    public static class72 field377;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lcr;B)Lcr;")
    public static final class403 method195(class403 arg0, byte arg1) {
        field375++;
        if (arg1 < 9) {
            field376 = null;
        }
        class403 var2 = client.method1264(arg0);
        if (var2 == null) {
            var2 = arg0.field5519;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[B[BIIIIII)V")
    public static final void method196(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field382++;
        int var9 = -(arg6 >> 2);
        int var10 = -(arg6 & 0x3);
        int var11 = -arg0;
        if (arg8 < 31) {
            return;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg1[var10001] = (byte) (arg1[var10001] - arg2[arg3++]);
                int var14 = arg7++;
                arg1[var14] = (byte) (arg1[var14] - arg2[arg3++]);
                int var15 = arg7++;
                arg1[var15] = (byte) (arg1[var15] - arg2[arg3++]);
                int var16 = arg7++;
                arg1[var16] = (byte) (arg1[var16] - arg2[arg3++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg1[var10001] = (byte) (arg1[var10001] - arg2[arg3++]);
            }
            arg7 += arg4;
            arg3 += arg5;
            var11++;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIII)Lto;")
    public static final class8 method197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field384++;
        if (arg5 != 10) {
            field380 = true;
        }
        long var7 = (long) arg4 * 986053L ^ (long) arg3 * 475427L ^ (long) arg0 * 67481L ^ (long) arg2 * 97549L ^ (long) arg1 * 32147369L ^ (long) arg6 * 76724863L;
        class8 var9 = (class8) class49.field757.method1456(var7, 121);
        if (var9 == null) {
            class8 var10 = class302.field3987.method522(arg0, arg2, arg3, arg4, arg1, arg6);
            class49.field757.method1462(var10, var7, -24);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lpc;Lqa;I)V")
    public static final void method198(class473 arg0, class162 arg1, int arg2) {
        field385++;
        if (class503.field6932) {
            return;
        }
        arg1.method550(0);
        class487.field6761 = arg1.method596(class134.method943(arg0, class402.field5392), true);
        class487.field6761.method3109((class149.field2132 - class487.field6761.method151()) / 2, (class175.field2555 - class487.field6761.method149()) / 2);
        class411.field5655 = arg1.method596(class134.method943(arg0, class364.field4926), true);
        class411.field5655.method3109((class149.field2132 - class411.field5655.method151()) / arg2, 18);
        class503.field6932 = true;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V")
    public static final void method199(byte arg0) {
        if (arg0 <= 119) {
            field380 = false;
        }
        class148.method1023(true, false);
        field381++;
        if (class318.field4166 >= 0 && class318.field4166 != 0) {
            class258.method1562(class318.field4166, (byte) 126);
            class318.field4166 = -1;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static void method200(int arg0) {
        field376 = null;
        if (arg0 != -1) {
            method200(112);
        }
        field377 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([Lf;B)V")
    public static final void method201(class529[] arg0, byte arg1) {
        if (arg1 >= -60) {
            return;
        }
        class499.field6905 = arg0.length;
        field383++;
        class9.field220 = new class529[class499.field6905 + 10];
        class294.field3843 = new int[class499.field6905 + 10];
        class254.method1533(arg0, 0, class9.field220, 0, class499.field6905);
        for (int var2 = 0; var2 < class499.field6905; var2++) {
            class294.field3843[var2] = class9.field220[var2].method149();
        }
        for (int var3 = class499.field6905; var3 < class9.field220.length; var3++) {
            class294.field3843[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class21(String arg0) {
        this.field378 = arg0;
    }
}
