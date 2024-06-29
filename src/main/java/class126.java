import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class126 implements class25 {

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Lge;")
    public static class235 field2308 = new class235(32);

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Lha;")
    public static class46 field2310 = class271.method1828("Bitte warten Sie)3)3)3", -46);

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Lha;")
    public static class46 field2309 = class271.method1828("Untersuchen", -46);

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field2316 = 0;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Lha;")
    public static class46 field2317 = class271.method1828("<img=0>", -46);

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field2313 = 0;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "Lha;")
    public static class46 field2315 = class271.method1828("Okay", -46);

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "[I")
    public static int[] field2311 = new int[128];

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static volatile int field2319 = 0;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Lpi;")
    public static class181 field2312;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "Lgi;")
    public static class256 field2318;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(JI[II)Lha;")
    public final class46 method182(long arg0, int arg1, int[] arg2, int arg3) {
        field2307++;
        if (arg1 == 0) {
            class37 var6 = class115.method930(8, arg2[0]);
            return var6.method249((int) arg0, true);
        } else if (arg1 == 1 || arg1 == 10) {
            class71 var7 = class80.method633((int) arg0, 0);
            return var7.field1213;
        } else if (arg1 == 6 || arg1 == 7) {
            return class115.method930(8, arg2[0]).method249((int) arg0, true);
        } else if (arg3 == -20459) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public static void method979(byte arg0) {
        field2308 = null;
        if (arg0 != -107) {
            return;
        }
        field2317 = null;
        field2309 = null;
        field2310 = null;
        field2311 = null;
        field2312 = null;
        field2315 = null;
        field2318 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static final void method980(int arg0) {
        field2305++;
        for (class31 var1 = (class31) class93.field1727.method1592(false); var1 != null; var1 = (class31) class93.field1727.method1591(arg0 + 15870)) {
            int var2 = var1.field582;
            if (class175.method1259(var2, (byte) 127)) {
                class24[] var3 = class215.field3809[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field480;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field1195;
                    class24 var7 = class13.method73(arg0 + 1506544413, var6);
                    if (var7 != null) {
                        class226.method1549(false, var7);
                    }
                }
            }
        }
        if (arg0 != -15789) {
            method980(60);
        }
    }
}
