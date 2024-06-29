import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class727 extends Canvas {

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "Ljava/awt/Component;")
    private Component field9992;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "Lrha;")
    public static class235 field9987 = new class235("WTRC", "office", "_rc", 1);

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public static int field9989 = 500;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "[Z")
    public static boolean[] field9991 = new boolean[5];

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field9983;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field9984;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field9985;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field9986;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public static int field9990;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "Lfca;")
    public static class93 field9988;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIIBI)V", line = 4)
    public static final void method4034(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field9984++;
        int var7 = class748.method4155(class223.field3260, 16, arg0, class706.field9700);
        int var8 = class748.method4155(class223.field3260, 16, arg1, class706.field9700);
        int var9 = class748.method4155(class268.field3766, 16, arg6, class236.field3392);
        int var10 = class748.method4155(class268.field3766, 16, arg2, class236.field3392);
        int var11 = class748.method4155(class223.field3260, 16, arg0 + arg4, class706.field9700);
        int var12 = class748.method4155(class223.field3260, arg5 ^ 0x10, arg1 - arg4, class706.field9700);
        for (int var13 = var7; var13 < var11; var13++) {
            class679.method3826(class298.field4105[var13], var10, 11, var9, arg3);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class679.method3826(class298.field4105[var14], var10, 11, var9, arg3);
        }
        int var15 = class748.method4155(class268.field3766, 16, arg6 + arg4, class236.field3392);
        int var16 = class748.method4155(class268.field3766, 16, arg2 - arg4, class236.field3392);
        int var17 = var11;
        if (arg5 != 0) {
            field9990 = 6;
        }
        while (var12 >= var17) {
            int[] var18 = class298.field4105[var17];
            class679.method3826(var18, var15, 11, var9, arg3);
            class679.method3826(var18, var10, arg5 ^ 0xB, var16, arg3);
            var17++;
        }
    }

    @OriginalMember(owner = "client!dq", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 56)
    public final void paint(Graphics arg0) {
        this.field9992.paint(arg0);
        field9986++;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)Z", line = 67)
    public static final boolean method4035(int arg0, int arg1, int arg2) {
        if (arg0 != 1865) {
            method4034(43, -84, -36, 2, 9, (byte) -91, 118);
        }
        field9985++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V", line = 79)
    public static void method4036(int arg0) {
        field9987 = null;
        if (arg0 >= -95) {
            method4034(-35, -84, 1, 117, -63, (byte) 108, 12);
        }
        field9988 = null;
        field9991 = null;
    }

    @OriginalMember(owner = "client!dq", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 103)
    public final void update(Graphics arg0) {
        this.field9992.update(arg0);
        field9983++;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 110)
    public class727(Component arg0) {
        this.field9992 = arg0;
    }
}
