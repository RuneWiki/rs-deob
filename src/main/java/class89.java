import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class89 {

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1438 = 0;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1439 = 0;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILca;)V")
    public static final void method667(int arg0, class122 arg1) {
        field1434++;
        class168 var2 = null;
        try {
            if (arg0 != 1) {
                method667(105, (class122) null);
            }
            class60 var3 = arg1.method930("runescape", 0);
            while (var3.field936 == 0) {
                class155.method1130(1, 1L);
            }
            if (var3.field936 == 1) {
                var2 = (class168) var3.field932;
                class53 var4 = class195.method1379((byte) -115);
                var2.method1200(var4.field735, 109, var4.field758, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1202(arg0 - 1);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII)V")
    public static final void method668(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1437++;
        if (field1439 < 100) {
            class22.method155(arg3 ^ 0xFFFFFFF3);
        }
        class130.method982(arg1, arg2, arg0 + arg1, arg2 + arg4);
        if (field1439 < 100) {
            int var5 = arg1 + (arg0 / 2);
            byte var6 = 20;
            int var7 = arg4 / 2 + arg2 - var6 - 18;
            class130.method996(arg1, arg2, arg0, arg4, 0);
            class130.method1006(var5 - 152, var7, 304, 34, 9179409);
            class130.method996(var5 - 150, var7 + 2, field1439 * 3, 30, 9179409);
            class208.field3084.method67(class19.field203, var5, var6 + var7, 16777215, -1);
            return;
        }
        class123.field2036 = (int) ((float) (arg0 * 2) / class46.field629);
        class119.field1927 = (int) ((float) (arg4 * 2) / class46.field629);
        class162.field2514 = class30.field319 - ((int) ((float) arg0 / class46.field629));
        class123.field2040 = class121.field1989 - (int) ((float) arg4 / class46.field629);
        int var8 = class30.field319 - ((int) ((float) arg0 / class46.field629));
        int var9 = class121.field1989 - ((int) ((float) arg4 / class46.field629));
        int var10 = (int) ((float) arg0 / class46.field629) + class30.field319;
        int var11 = (int) ((float) arg4 / class46.field629) + class121.field1989;
        class46.method275(var8, var9, var10, var11, arg1, arg2, arg0 + arg1, arg2 + arg4 - -1);
        class46.method283();
        class2 var12 = class46.method281();
        class247.method1698(var12, -1, 0, arg3);
        if (class141.field2276 > 0) {
            class284.field4572--;
            if (class284.field4572 == 0) {
                class141.field2276--;
                class284.field4572 = 20;
            }
        }
        if (!class191.field2828) {
            return;
        }
        int var13 = arg2 + arg4 - 8;
        int var14 = arg1 + arg0 - 5;
        int var15 = 16776960;
        class124.field2073.method66("Fps:" + class199.field2940, var14, var13, 16776960, -1);
        Runtime var16 = Runtime.getRuntime();
        int var17 = (int) ((var16.totalMemory() - var16.freeMemory()) / 1024L);
        int var18 = var13 - 15;
        if (var17 > 65536) {
            var15 = 16711680;
        }
        class124.field2073.method66("Mem:" + var17 + "k", var14, var18, var15, -1);
        var13 = var18 - 15;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([IIIIB)V")
    public static final void method669(int[] arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1433++;
        arg3--;
        int var6 = arg2 - 1;
        int var5 = var6 - 7;
        while (var5 > arg3) {
            int var7 = arg3 + 1;
            arg0[var7] = arg1;
            int var8 = var7 + 1;
            arg0[var8] = arg1;
            int var9 = var8 + 1;
            arg0[var9] = arg1;
            int var10 = var9 + 1;
            arg0[var10] = arg1;
            int var11 = var10 + 1;
            arg0[var11] = arg1;
            int var12 = var11 + 1;
            arg0[var12] = arg1;
            int var13 = var12 + 1;
            arg0[var13] = arg1;
            arg3 = var13 + 1;
            arg0[arg3] = arg1;
        }
        if (arg4 <= -122) {
            while (var6 > arg3) {
                arg3++;
                arg0[arg3] = arg1;
            }
        }
    }
}
