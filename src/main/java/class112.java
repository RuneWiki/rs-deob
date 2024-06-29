import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class112 {

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "[I")
    public static int[] field1537 = new int[14];

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method831(boolean arg0) {
        field1535++;
        int var1 = class652.field8795;
        int[] var2 = class497.field6986;
        for (int var3 = 0; var3 < var1; var3++) {
            class758 var9 = class84.field1204[var2[var3]];
            if (var9 != null && var9.field6133 > 0) {
                var9.field6133--;
                if (var9.field6133 == 0) {
                    var9.field6182 = null;
                }
            }
        }
        if (!arg0) {
            field1537 = null;
        }
        for (int var4 = 0; var4 < class178.field2352; var4++) {
            long var5 = (long) class245.field3206[var4];
            class316 var7 = (class316) class176.field2326.method1248(99, var5);
            if (var7 != null) {
                class22 var8 = var7.field4455;
                if (var8.field6133 > 0) {
                    var8.field6133--;
                    if (var8.field6133 == 0) {
                        var8.field6182 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IZIII)V", line = 64)
    public static final void method832(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1536++;
        if (arg1) {
            method831(false);
        }
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        class464.method2733(arg3, arg4 - arg2, arg2 + arg4, -22816, class228.field2951[arg0]);
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class228.field2951[arg0 + var6];
                int[] var10 = class228.field2951[arg0 - var6];
                int var11 = arg4 + var5;
                int var12 = arg4 - var5;
                class464.method2733(arg3, var12, var11, -22816, var9);
                class464.method2733(arg3, var12, var11, -22816, var10);
            }
            int var13 = arg4 + var6;
            int var14 = arg4 - var6;
            int[] var15 = class228.field2951[arg0 + var5];
            int[] var16 = class228.field2951[arg0 - var5];
            class464.method2733(arg3, var14, var13, -22816, var15);
            class464.method2733(arg3, var14, var13, -22816, var16);
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V", line = 119)
    public static void method833(int arg0) {
        if (arg0 != 0) {
            method831(false);
        }
        field1537 = null;
    }
}
