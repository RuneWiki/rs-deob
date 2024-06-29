import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class196 {

    @OriginalMember(owner = "client!me", name = "c", descriptor = "[I")
    public static int[] field2892 = new int[3];

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "[[Z")
    public static boolean[][] field2890;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I[B[BIIIIII)V", line = 6)
    public static final void method1399(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2893++;
        int var9 = -(arg0 >> 2);
        int var10 = -(arg0 & 0x3);
        if (arg4 != 13880) {
            method1399(9, null, null, -128, 85, -75, 62, 85, -51);
        }
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg1[var10001] += arg2[arg3++];
                int var14 = arg6++;
                arg1[var14] += arg2[arg3++];
                int var15 = arg6++;
                arg1[var15] += arg2[arg3++];
                int var16 = arg6++;
                arg1[var16] += arg2[arg3++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg1[var10001] += arg2[arg3++];
            }
            arg6 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lvq;IZI)V", line = 51)
    public static final void method1400(class462 arg0, int arg1, boolean arg2, int arg3) {
        field2894++;
        if (!class311.field4321) {
            return;
        }
        int var4 = 0;
        for (class324 var5 = (class324) arg0.field6503.method2344(-59); var5 != null; var5 = (class324) arg0.field6503.method2336((byte) 108)) {
            int var10 = class345.method2173(var5, false);
            if (var4 < var10) {
                var4 = var10;
            }
        }
        var4 += 8;
        if (!arg2) {
            return;
        }
        class562.field7760 = arg0.field6497 * 16 + (class545.field7514 ? 26 : 22);
        int var6 = arg0.field6497 * 16 + 21;
        int var7 = class565.field7788 + class106.field1869;
        if (var4 + var7 > class467.field6559) {
            var7 = class106.field1869 - var4;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = class545.field7514 ? 33 : 31;
        int var9 = arg3 + 13 - var8;
        if (class582.field7968 < (var6 + var9)) {
            var9 = class582.field7968 - var6;
        }
        class142.field2352 = var7;
        if (var9 < 0) {
            var9 = 0;
        }
        class164.field2589 = arg0;
        class465.field6522 = var4;
        class157.field2522 = var9;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 116)
    public static final void method1401(byte arg0) {
        if (arg0 != 11) {
            method1401((byte) -62);
        }
        class396.field5798 = new class378[class732.field9887.method867(-1)][];
        field2891++;
        class605.field8299 = new class378[class732.field9887.method867(-1)][];
        class609.field8353 = new boolean[class732.field9887.method867(-1)];
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V", line = 129)
    public static void method1402(byte arg0) {
        field2890 = null;
        field2892 = null;
        int var1 = -74 / ((arg0 - 17) / 46);
    }
}
