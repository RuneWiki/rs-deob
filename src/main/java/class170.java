import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class170 {

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field2635 = 16777215;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "[I")
    public static int[] field2637 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "Liv;")
    public static class64 field2633 = new class64(93, 6);

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field2638 = 1;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "Liv;")
    public static class64 field2639 = new class64(24, 3);

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Lia;")
    public static class414 field2632;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "Ljava/awt/Font;")
    public static Font field2640;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "[I")
    public static int[] field2629;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIB[BII[BI)V", line = 4)
    public static final void method1244(int arg0, int arg1, int arg2, byte arg3, byte[] arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        if (arg3 != -76) {
            return;
        }
        field2630++;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        for (int var11 = -arg1; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg4[var10001] += arg7[arg8++];
                int var14 = arg6++;
                arg4[var14] += arg7[arg8++];
                int var15 = arg6++;
                arg4[var15] += arg7[arg8++];
                int var16 = arg6++;
                arg4[var16] += arg7[arg8++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg4[var10001] += arg7[arg8++];
            }
            arg8 += arg5;
            arg6 += arg0;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)V", line = 49)
    public static final void method1245(int arg0, int arg1, int arg2, int arg3) {
        field2631++;
        int var4 = class443.field6623.field594 * arg3 >> 8;
        int var5 = 117 % ((arg0 + 26) / 39);
        if (arg2 == -1 && !class217.field3129) {
            class106.method801(1);
        } else if (arg2 != -1 && (class281.field4026 != arg2 || !class517.method3090((byte) -96)) && var4 != 0 && !class217.field3129) {
            class174.method1252(0, arg1, class84.field1455, 6, arg2, false, var4);
        }
        class281.field4026 = arg2;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 75)
    public static void method1246(int arg0) {
        field2632 = null;
        field2639 = null;
        field2633 = null;
        field2629 = null;
        if (arg0 == 0) {
            field2637 = null;
            field2640 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Len;I)Ljava/lang/String;", line = 94)
    public static final String method1247(class208 arg0, int arg1) {
        field2636++;
        if (arg1 == 36096) {
            return arg0.field3007 == null || arg0.field3007.length() <= 0 ? arg0.field3008 : arg0.field3008 + class335.field5062.method2180(client.field2870, 29491) + arg0.field3007;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)Lvr;", line = 109)
    public static final class89 method1248(int arg0) {
        field2634++;
        if (class403.field6057.length > class232.field3390) {
            return class403.field6057[class232.field3390++];
        } else {
            if (arg0 != 16186) {
                field2635 = 113;
            }
            return null;
        }
    }
}
