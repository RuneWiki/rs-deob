import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class182 extends class177 {

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "[C")
    public static char[] field2721 = new char[128];

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "Lel;")
    public static class118 field2727;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "Lm;")
    public static class48 field2726;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII)V", line = 7)
    public static final void method1311(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 24161) {
            return;
        }
        class147 var5 = class92.method731(-29125, arg2, 4);
        field2724++;
        var5.method1095(arg1 ^ 0x5E09);
        var5.field2249 = arg3;
        var5.field2240 = arg4;
        var5.field2241 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([Lvd;ZLlb;)V", line = 23)
    public static final void method1312(class134[] arg0, boolean arg1, class211 arg2) {
        class87.field1281 = arg2;
        field2722++;
        class213.field3382 = arg0;
        class322.field4997 = new boolean[class213.field3382.length];
        class87.field1276.method980(1);
        int var3 = class87.field1281.method1519((byte) 16, "details");
        int[] var4 = class87.field1281.method1508(0, var3);
        if (arg1) {
            method1312((class134[]) null, false, (class211) null);
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class87.field1276.method977(4, class105.method809(new class35(class87.field1281.method1507(var4[var5], (byte) -128, var3)), -77));
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[I", line = 55)
    public final int[] method95(int arg0, int arg1) {
        field2728++;
        int[] var3 = this.field2652.method1481(arg1, (byte) -76);
        if (this.field2652.field3287) {
            int var4 = class260.field3858[arg1];
            for (int var5 = 0; var5 < class287.field4415; var5++) {
                var3[var5] = this.method1315(120, class179.field2684[var5], var4) % 4096;
            }
        }
        if (arg0 > -52) {
            method1318(27, 84, (class211) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(III)V", line = 87)
    public static final void method1313(int arg0, int arg1, int arg2) {
        field2720++;
        class128 var3 = class281.field4336[class50.field775][arg0][arg2];
        if (var3 == null) {
            class77.method624(class50.field775, arg0, arg2);
            return;
        }
        int var4 = -99999999;
        class205 var5 = null;
        for (class205 var6 = (class205) var3.method986(false); var6 != null; var6 = (class205) var3.method982(14877)) {
            class274 var7 = class225.method1603(var6.field3253.field4785, arg1 - 1376312589);
            int var8 = var7.field4175;
            if (var7.field4173 == 1) {
                var8 = (var6.field3253.field4787 + 1) * var8;
            }
            if (var8 > var4) {
                var5 = var6;
                var4 = var8;
            }
        }
        if (var5 == null) {
            class77.method624(class50.field775, arg0, arg2);
            return;
        }
        var3.method984(var5, (byte) 127);
        class307 var9 = null;
        class205 var10 = (class205) var3.method986(false);
        if (arg1 != 1376312589) {
            field2721 = (char[]) null;
        }
        class307 var11 = null;
        while (var10 != null) {
            class307 var12 = var10.field3253;
            if (var5.field3253.field4785 != var12.field4785) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field4785 != var12.field4785 && var11 == null) {
                    var11 = var12;
                }
            }
            var10 = (class205) var3.method982(14877);
        }
        long var13 = (long) ((arg2 << 7) + arg0 + 1610612736);
        class83.method684(class50.field775, arg0, arg2, class294.method2080(899, arg2 * 128 + 64, arg0 * 128 + 64, class50.field775), var5.field3253, var13, var9, var11);
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)Z", line = 164)
    public static final boolean method1314(byte arg0) {
        field2725++;
        if (class162.field2408) {
            try {
                class226.method1607(class301.field4715.field285, true, "showVideoAd");
                return true;
            } catch (Throwable var2) {
            }
        }
        if (arg0 <= 67) {
            method1317(-112, -4, 70);
        }
        return false;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(III)I", line = 190)
    private final int method1315(int arg0, int arg1, int arg2) {
        field2723++;
        int var4 = arg1 + (arg2 * 57);
        int var5 = -63 / ((-arg0 - 40) / 54);
        int var6 = var4 << 1 ^ var4;
        return 4096 - (((var6 * 15731 * var6 + 789221) * var6 + 1376312589 & Integer.MAX_VALUE) / 262144);
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V", line = 204)
    public static void method1316(int arg0) {
        field2726 = null;
        field2727 = null;
        field2721 = null;
        if (arg0 != 15731) {
            method1313(-13, -66, 64);
        }
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(III)J", line = 217)
    public static final long method1317(int arg0, int arg1, int arg2) {
        class99 var3 = class250.field3746[arg0][arg1][arg2];
        return var3 == null || var3.field1474 == null ? 0L : var3.field1474.field4550;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V", line = 224)
    public class182() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILlb;)[Lom;", line = 231)
    public static final class70[] method1318(int arg0, int arg1, class211 arg2) {
        field2729++;
        if (class57.method513(arg1, arg2, 11332)) {
            int var3 = 76 / ((-arg0 - 34) / 53);
            return class154.method1128((byte) -7);
        } else {
            return null;
        }
    }
}
