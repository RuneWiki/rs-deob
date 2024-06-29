import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class153 extends Canvas {

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field2777;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field2776 = 0;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "Lti;")
    public static class5 field2775 = new class5(16);

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field2780 = 0;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field2782 = 0;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BIIIII)V")
    public static final void method1010(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg4; var6 <= (arg3 + arg4); var6++) {
            for (int var11 = arg2; var11 <= arg1 + arg2; var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class232.field4052[arg5][var11][var6] = 127;
                }
            }
        }
        if (arg0 > -81) {
            method1012(79, (class137) null);
        }
        field2781++;
        for (int var7 = arg4; var7 < (arg3 + arg4); var7++) {
            for (int var10 = arg2; var10 < arg1 + arg2; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class112.field2102[arg5][var10][var7] = arg5 <= 0 ? 0 : class112.field2102[arg5 - 1][var10][var7];
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var8 = arg4 + 1; var8 < (arg3 + arg4); var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class112.field2102[arg5][arg2][var8] = class112.field2102[arg5][arg2 - 1][var8];
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var9 = arg2 + 1; var9 < (arg2 + arg1); var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class112.field2102[arg5][var9][arg4] = class112.field2102[arg5][var9][arg4 - 1];
                }
            }
        }
        if (arg2 < 0 || arg4 < 0 || arg2 >= 104 || arg4 >= 104) {
            return;
        }
        if (arg5 != 0) {
            if (arg2 > 0 && class112.field2102[arg5 - 1][arg2 - 1][arg4] != class112.field2102[arg5][arg2 - 1][arg4]) {
                class112.field2102[arg5][arg2][arg4] = class112.field2102[arg5][arg2 - 1][arg4];
                return;
            }
            if (arg4 > 0 && class112.field2102[arg5 - 1][arg2][arg4 - 1] != class112.field2102[arg5][arg2][arg4 - 1]) {
                class112.field2102[arg5][arg2][arg4] = class112.field2102[arg5][arg2][arg4 - 1];
                return;
            }
            if (arg2 > 0 && arg4 > 0 && class112.field2102[arg5 - 1][arg2 - 1][arg4 - 1] != class112.field2102[arg5][arg2 - 1][arg4 - 1]) {
                class112.field2102[arg5][arg2][arg4] = class112.field2102[arg5][arg2 - 1][arg4 - 1];
                return;
            }
            return;
        }
        if (arg2 > 0 && class112.field2102[arg5][arg2 - 1][arg4] != 0) {
            class112.field2102[arg5][arg2][arg4] = class112.field2102[arg5][arg2 - 1][arg4];
            return;
        }
        if (arg4 > 0 && class112.field2102[arg5][arg2][arg4 - 1] != 0) {
            class112.field2102[arg5][arg2][arg4] = class112.field2102[arg5][arg2][arg4 - 1];
            return;
        }
        if (arg2 > 0 && arg4 > 0 && class112.field2102[arg5][arg2 - 1][arg4 - 1] != 0) {
            class112.field2102[arg5][arg2][arg4] = class112.field2102[arg5][arg2 - 1][arg4 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!gi", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field2777.paint(arg0);
        field2778++;
    }

    @OriginalMember(owner = "client!gi", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2773++;
        this.field2777.update(arg0);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static void method1011(byte arg0) {
        if (arg0 <= -123) {
            field2775 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class153(Component arg0) {
        this.field2777 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILdg;)V")
    public static final void method1012(int arg0, class137 arg1) {
        field2774++;
        class255 var2 = (class255) class232.field4057.method31(-32665, arg1.field2508.method1755(arg0));
        if (var2 == null) {
            return;
        }
        if (var2.field4434 != null) {
            class43.field933.method1136(var2.field4434);
            var2.field4434 = null;
        }
        var2.method1614(-1204826926);
    }
}
