import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class239 {

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIZIII)V", line = 8)
    public static final void method1514(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field3096++;
        int var7 = class141.method970(arg0, class456.field6365, 1150002076, class418.field5559);
        int var8 = class141.method970(arg4, class456.field6365, 1150002076, class418.field5559);
        int var9 = class141.method970(arg1, class281.field3589, 1150002076, class65.field827);
        if (!arg3) {
            return;
        }
        int var10 = class141.method970(arg2, class281.field3589, 1150002076, class65.field827);
        int var11 = class141.method970(arg0 + arg5, class456.field6365, 1150002076, class418.field5559);
        int var12 = class141.method970(arg4 - arg5, class456.field6365, 1150002076, class418.field5559);
        for (int var13 = var7; var13 < var11; var13++) {
            class183.method1212(arg6, class333.field4265[var13], true, var9, var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class183.method1212(arg6, class333.field4265[var14], arg3, var9, var10);
        }
        int var15 = class141.method970(arg1 + arg5, class281.field3589, 1150002076, class65.field827);
        int var16 = class141.method970(arg2 - arg5, class281.field3589, 1150002076, class65.field827);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class333.field4265[var17];
            class183.method1212(arg6, var18, true, var9, var15);
            class183.method1212(arg6, var18, true, var16, var10);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Ljava/awt/Canvas;BLm;I)Lqa;", line = 63)
    public static final class129 method1515(Canvas arg0, byte arg1, class79 arg2, int arg3) {
        if (arg1 != 70) {
            method1514(20, 72, 46, true, -65, 42, -103);
        }
        field3097++;
        return new class150(arg3, arg0, arg2);
    }
}
