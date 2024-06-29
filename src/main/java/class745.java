import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class745 extends class224 {

    @OriginalMember(owner = "client!wga", name = "I", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field10438 = new Rectangle[100];

    @OriginalMember(owner = "client!wga", name = "y", descriptor = "I")
    public int field10428;

    @OriginalMember(owner = "client!wga", name = "A", descriptor = "I")
    public int field10430;

    @OriginalMember(owner = "client!wga", name = "B", descriptor = "I")
    public static int field10431;

    @OriginalMember(owner = "client!wga", name = "C", descriptor = "I")
    public int field10432;

    @OriginalMember(owner = "client!wga", name = "E", descriptor = "I")
    public static int field10434;

    @OriginalMember(owner = "client!wga", name = "H", descriptor = "I")
    public int field10437;

    @OriginalMember(owner = "client!wga", name = "G", descriptor = "Lkg;")
    public class271 field10436;

    @OriginalMember(owner = "client!wga", name = "F", descriptor = "Ljava/lang/String;")
    public String field10435;

    @OriginalMember(owner = "client!wga", name = "x", descriptor = "[I")
    public int[] field10427;

    @OriginalMember(owner = "client!wga", name = "D", descriptor = "[I")
    public int[] field10433;

    @OriginalMember(owner = "client!wga", name = "J", descriptor = "[Lmp;")
    public class758[] field10439;

    @OriginalMember(owner = "client!wga", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field10429;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field10438[var0] = new Rectangle();
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIIII)I", line = 3)
    public static final int method4148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 & 0x3;
        field10434++;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg6;
            arg6 = var8;
        }
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return arg3;
        } else {
            if (arg2 > -64) {
                field10438 = null;
            }
            return var7 == 2 ? 7 + 1 - arg0 - arg5 : 7 - arg3 + -arg6 + 1;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V", line = 42)
    public static void method4149(int arg0) {
        if (arg0 == 1) {
            field10438 = null;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILha;)V", line = 54)
    public static final void method4150(int arg0, class58 arg1) {
        for (class753 var2 = (class753) class460.field6633.method4159(arg0); var2 != null; var2 = (class753) class460.field6633.method4151(7)) {
            if (var2.field10500) {
                var2.method4175(arg1);
            }
        }
        field10431++;
    }
}
