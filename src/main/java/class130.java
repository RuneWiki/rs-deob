import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class130 extends class82 {

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "Ljava/lang/String;")
    public String field1934;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "Z")
    public static boolean field1932 = true;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([IIIIII)V")
    public static final void method810(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class270 var6 = class33.field487[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class256 var7 = var6.field4085;
        if (var7 != null) {
            int var8 = var7.field3911;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class135 var10 = var6.field4081;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1965;
        int var12 = var10.field1970;
        int var13 = var10.field1966;
        int var14 = var10.field1981;
        int[] var15 = class162.field2488[var11];
        int[] var16 = class251.field3825[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "(I)V")
    public static final void method811(int arg0) {
        field1931++;
        if (arg0 <= 118) {
            field1933 = 76;
        }
        if (class149.field2161 > 0) {
            class281.method1858(-1);
        } else {
            class191.field2939 = class44.field706;
            class44.field706 = null;
            class203.method1292(40, false);
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class130() {
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class130(String arg0) {
        this.field1934 = arg0;
    }
}
