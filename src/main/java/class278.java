import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class278 {

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Z")
    public static boolean field3741 = false;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3745 = "M";

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field3747 = 0;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Lac;")
    public static class216 field3743;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 10)
    public static void method1774(byte arg0) {
        if (arg0 != 4) {
            method1777((byte) 81);
        }
        field3743 = null;
        field3745 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[Ljava/lang/String;II[S)V", line = 24)
    public static final void method1775(int arg0, String[] arg1, int arg2, int arg3, short[] arg4) {
        if (arg3 < arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            for (int var9 = arg3; var9 < arg0; var9++) {
                if (var7 == null || arg1[var9] != null && arg1[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var8;
            method1775(var6 - 1, arg1, 503, arg3, arg4);
            method1775(arg0, arg1, arg2, var6 + 1, arg4);
        }
        if (arg2 != 503) {
            method1776(25);
        }
        field3742++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 77)
    public static final void method1776(int arg0) {
        class284.field3808.method2539(100);
        field3746++;
        if (arg0 != 8556) {
            method1777((byte) 110);
        }
        class13.field98.method2539(59);
        class249.field3410.method2539(arg0 ^ 0x2101);
        class121.field1700.method2539(arg0 - 8496);
        class198.field2827.method2539(61);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V", line = 96)
    public static final void method1777(byte arg0) {
        field3744++;
        if (class416.field5820 != null) {
            return;
        }
        Container var1;
        if (class414.field5781 == null) {
            var1 = class30.field502.field4117;
        } else {
            var1 = class414.field5781;
        }
        class417.field5853 = var1.getSize().width;
        class135.field1927 = var1.getSize().height;
        if (class414.field5781 == var1) {
            Insets var2 = class414.field5781.getInsets();
            class135.field1927 -= var2.top + var2.bottom;
            class417.field5853 -= var2.right + var2.left;
        }
        if (class76.method651(-107) == 1) {
            class249.field3414 = 765;
            class172.field2520 = (class417.field5853 - 765) / 2;
            class258.field3488 = 503;
            class134.field1915 = 0;
        } else if (class297.field4005 < 96 && class243.field3355 == 0) {
            int var3 = class417.field5853 <= 1024 ? class417.field5853 : 1024;
            class249.field3414 = var3;
            class172.field2520 = (class417.field5853 - var3) / 2;
            int var4 = class135.field1927 <= 768 ? class135.field1927 : 768;
            class258.field3488 = var4;
            class134.field1915 = 0;
        } else {
            class249.field3414 = class417.field5853;
            class134.field1915 = 0;
            class258.field3488 = class135.field1927;
            class172.field2520 = 0;
        }
        if (class445.field6400 != 0) {
            boolean var10000;
            if (class249.field3414 < 1024 && class258.field3488 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class418.field5867.setSize(class249.field3414, class258.field3488);
        if (class249.field3415 != null) {
            class249.field3415.method174();
        }
        if (arg0 != 35) {
            return;
        }
        if (class414.field5781 == var1) {
            Insets var5 = class414.field5781.getInsets();
            class418.field5867.setLocation(class172.field2520 + var5.left, class134.field1915 + var5.top);
        } else {
            class418.field5867.setLocation(class172.field2520, class134.field1915);
        }
        if (class149.field2288 != -1) {
            class22.method282(true, arg0 ^ 0xFFFFFFA8);
        }
        class396.method2438(arg0 ^ 0x7E);
    }
}
