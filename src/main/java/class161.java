import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class161 {

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field2905 = 5063219;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field2910 = -1;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "[S")
    public static short[] field2913 = new short[256];

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public int field2906;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public int field2908;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public int field2911;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public int field2914;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Lvh;")
    public static class147 field2907;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "Lcc;")
    public static class313 field2904;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lja;III)V", line = 3)
    public static final void method1187(class114 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class197.field3377) {
            class5 var4 = class297.field4940[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field52 != null && var4.field52.field103.method449()) {
                arg0.method437(var4.field52.field103, 128, 0, 0, true);
            }
        }
        if (arg3 < class197.field3377) {
            class5 var5 = class297.field4940[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field52 != null && var5.field52.field103.method449()) {
                arg0.method437(var5.field52.field103, 0, 0, 128, true);
            }
        }
        if (arg2 < class197.field3377 && arg3 < class65.field1094) {
            class5 var6 = class297.field4940[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field52 != null && var6.field52.field103.method449()) {
                arg0.method437(var6.field52.field103, 128, 0, 128, true);
            }
        }
        if (arg2 < class197.field3377 && arg3 > 0) {
            class5 var7 = class297.field4940[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field52 != null && var7.field52.field103.method449()) {
                arg0.method437(var7.field52.field103, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZIIIIII)V", line = 51)
    public static final void method1188(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2912++;
        if (arg5 < 128 || arg3 < 128 || arg5 > 13056 || arg3 > 13056) {
            class15.field215 = -1;
            class313.field5365 = -1;
            return;
        }
        int var8 = class174.method1265(arg3, 8100, class131.field2250, arg5) - arg7;
        int var9 = class236.field3985[class102.field1640];
        int var10 = class236.field3985[class29.field404];
        int var11 = var8 - class143.field2600;
        int var12 = arg3 - class223.field3755;
        int var13 = arg5 - class152.field2780;
        int var14 = class236.field3971[class102.field1640];
        int var15 = class236.field3971[class29.field404];
        int var16 = var10 * var12 + var13 * var15 >> 16;
        int var17 = var12 * var15 - var10 * var13 >> 16;
        int var19 = var11 * var14 - (var9 * var17) >> 16;
        int var20 = var9 * var11 + var14 * var17 >> 16;
        if (!arg1) {
            return;
        }
        if (var20 < 50) {
            class15.field215 = -1;
            class313.field5365 = -1;
        } else if (class56.field846) {
            int var22 = arg6 * 512 >> 8;
            int var23 = arg4 * 512 >> 8;
            class15.field215 = var19 * var23 / var20 + arg0;
            class313.field5365 = arg2 + (var16 * var22 / var20);
        } else {
            class15.field215 = arg0 + ((var19 << 9) / var20);
            class313.field5365 = (var16 << 9) / var20 + arg2;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)V", line = 118)
    public static final void method1189(boolean arg0) {
        class189.field3244.method1185(1);
        field2909++;
        class167.field2967.method1185(1);
        if (arg0) {
            field2904 = (class313) null;
        }
        class170.field3019.method1185(1);
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(Z)V", line = 138)
    public static void method1190(boolean arg0) {
        if (arg0) {
            field2905 = 81;
        }
        field2907 = null;
        field2913 = null;
        field2904 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IB)Lce;", line = 165)
    public static final class126 method1191(int arg0, byte arg1) {
        int var2 = -69 / ((arg1 + 50) / 58);
        field2903++;
        class126 var3 = new class126();
        var3.field2158 = new byte[arg0];
        var3.field2140 = 0;
        return var3;
    }
}
