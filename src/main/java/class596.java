import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class596 extends Canvas {

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field8471;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "Lwk;")
    public static class431 field8472 = new class431();

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "Lgr;")
    public static class530 field8475 = new class530(5, 1);

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "Lgr;")
    public static class530 field8477 = new class530(52, -1);

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field8470;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "Ldea;")
    public static class355 field8476;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "Lqt;")
    public static class502 field8478;

    @OriginalMember(owner = "client!jq", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field8471.paint(arg0);
        field8474++;
    }

    @OriginalMember(owner = "client!jq", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field8473++;
        this.field8471.update(arg0);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
    public static void method3489(int arg0) {
        if (arg0 != 5) {
            method3489(-61);
        }
        field8472 = null;
        field8478 = null;
        field8475 = null;
        field8477 = null;
        field8476 = null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIII)V")
    public static final void method3490(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8470++;
        int var5 = 0;
        int var6 = arg1;
        if (arg4 > -83) {
            method3489(-10);
        }
        int var7 = -arg1;
        int var8 = -1;
        class518.method3153(arg2 + arg1, -arg1 + arg2, class193.field2839[arg3], -7, arg0);
        while (var5 < var6) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class193.field2839[arg3 + var6];
                int[] var10 = class193.field2839[arg3 - var6];
                int var11 = arg2 + var5;
                int var12 = arg2 - var5;
                class518.method3153(var11, var12, var9, -7, arg0);
                class518.method3153(var11, var12, var10, -7, arg0);
            }
            int var13 = arg2 + var6;
            int var14 = arg2 - var6;
            int[] var15 = class193.field2839[arg3 + var5];
            int[] var16 = class193.field2839[arg3 - var5];
            class518.method3153(var13, var14, var15, -7, arg0);
            class518.method3153(var13, var14, var16, -7, arg0);
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class596(Component arg0) {
        this.field8471 = arg0;
    }
}
