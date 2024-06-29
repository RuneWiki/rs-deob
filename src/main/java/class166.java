import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class166 {

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "J")
    public long field2683 = 0L;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2694 = "Face here";

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2696 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public int field2678;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public int field2680;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public int field2682;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public int field2684;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public int field2686;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public int field2687;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public int field2688;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public int field2691;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public int field2692;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public int field2693;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public int field2695;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Lwg;")
    public class178 field2681;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)Lsi;")
    public static final class204 method1221(int arg0) {
        if (arg0 < 77) {
            field2696 = null;
        }
        int var1 = class201.field3220[0] * class19.field214[0];
        field2679++;
        byte[] var2 = class152.field2505[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class101.field1476[class179.method1337(255, var2[var4])];
        }
        class140 var5 = new class140(class262.field4258, class62.field912, class217.field3457[0], class272.field4377[0], class19.field214[0], class201.field3220[0], var3);
        class188.method1398((byte) 119);
        return var5;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIBI)V")
    public static final void method1222(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = class241.field3845 * arg1 >> 8;
        field2697++;
        if (var4 != 0 && arg3 != -1) {
            class86.method632(arg3, var4, (byte) -118, class276.field4428, 0, false);
            class195.field3136 = true;
        }
        int var5 = -112 / ((6 - arg2) / 35);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
    public static void method1223(boolean arg0) {
        field2694 = null;
        field2696 = null;
        if (!arg0) {
            method1223(true);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)V")
    public static final void method1224(byte arg0, int arg1) {
        class52.field765.method1548(arg1, 0);
        field2690++;
        class81.field1171.method1548(arg1, 0);
        class45.field651.method1548(arg1, 0);
        if (arg0 < 20) {
            field2696 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2685++;
        int var7 = class281.method1924(false, class228.field3657, class207.field3328, arg1);
        int var8 = class281.method1924(false, class228.field3657, class207.field3328, arg6);
        int var9 = class281.method1924(false, class211.field3386, class272.field4374, arg3);
        int var10 = class281.method1924(false, class211.field3386, class272.field4374, arg2);
        int var11 = class281.method1924(false, class228.field3657, class207.field3328, arg1 + arg4);
        int var12 = class281.method1924(false, class228.field3657, class207.field3328, arg6 - arg4);
        for (int var13 = var7; var13 < var11; var13++) {
            class177.method1330(class240.field3831[var13], var9, arg5, 32232, var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class177.method1330(class240.field3831[var14], var9, arg5, 32232, var10);
        }
        if (arg0 > -123) {
            method1223(true);
        }
        int var15 = class281.method1924(false, class211.field3386, class272.field4374, arg3 + arg4);
        int var16 = class281.method1924(false, class211.field3386, class272.field4374, arg2 - arg4);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class240.field3831[var17];
            class177.method1330(var18, var9, arg5, 32232, var15);
            class177.method1330(var18, var16, arg5, 32232, var10);
        }
    }
}
