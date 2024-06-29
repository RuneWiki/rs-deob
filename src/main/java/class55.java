import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class55 {

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public int field850 = -1;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field836 = 0;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field839 = null;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "Z")
    public static boolean field846 = true;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "Ljava/lang/String;")
    public static String field848 = null;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "[F")
    public static float[] field849 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "Ltk;")
    public static class266 field841 = null;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "Lnb;")
    public static class331 field837;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "Ltm;")
    public class77 field851;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "[I")
    public int[] field840;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "[I")
    public static int[] field845;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "[Ljava/lang/String;")
    public String[] field847;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method466(int arg0, byte arg1) {
        field838++;
        if (arg1 != 57) {
            method466(-61, (byte) -77);
        }
        class170 var2 = class221.method1613(2, arg0, -8410);
        var2.method1267(107);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V", line = 23)
    public static void method467(boolean arg0) {
        field841 = null;
        if (arg0) {
            method467(true);
        }
        field837 = null;
        field845 = null;
        field849 = null;
        field848 = null;
        field839 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V", line = 52)
    public static final void method468(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field842++;
        class323.method2273(arg2 - arg3, arg1, class221.field3443[arg4], arg2 + arg3, 50);
        int var5 = 0;
        int var6 = -arg3;
        int var7 = arg3;
        int var8 = -1;
        while (var5 < var7) {
            var8 += 2;
            var6 += var8;
            var5++;
            if (var6 >= 0) {
                var7--;
                var6 -= var7 << 1;
                int[] var9 = class221.field3443[arg4 + var7];
                int var10 = arg2 + var5;
                int[] var11 = class221.field3443[arg4 - var7];
                int var12 = arg2 - var5;
                class323.method2273(var12, arg1, var9, var10, 110);
                class323.method2273(var12, arg1, var11, var10, 86);
            }
            int var13 = arg2 - var7;
            int[] var14 = class221.field3443[arg4 + var5];
            int var15 = arg2 + var7;
            int[] var16 = class221.field3443[arg4 - var5];
            class323.method2273(var13, arg1, var14, var15, 68);
            class323.method2273(var13, arg1, var16, var15, 112);
        }
        if (arg0 <= 58) {
            field841 = (class266) null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)V", line = 125)
    public static final void method469(boolean arg0) {
        for (class71 var1 = (class71) class180.field2858.method268(-1); var1 != null; var1 = (class71) class180.field2858.method278(1)) {
            if (var1.field1078) {
                var1.method570(-5106);
            }
        }
        field843++;
        class71 var2 = (class71) class76.field1176.method268(-1);
        if (arg0) {
            field836 = -12;
        }
        while (var2 != null) {
            if (var2.field1078) {
                var2.method570(-5106);
            }
            var2 = (class71) class76.field1176.method278(1);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)J", line = 156)
    public static final long method470(int arg0, int arg1, int arg2) {
        class42 var3 = class34.field521[arg0][arg1][arg2];
        return var3 == null || var3.field665 == null ? 0L : var3.field665.field1721;
    }
}
