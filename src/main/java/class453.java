import java.awt.Rectangle;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class453 {

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "[I")
    public static int[] field6356 = new int[200];

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
    public static void method2705(boolean arg0) {
        field6356 = null;
        if (arg0) {
            method2707((byte) 28, null);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIII)V")
    public static final void method2706(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6357++;
        for (int var5 = arg1; var5 < class470.field6596; var5++) {
            Rectangle var6 = class663.field9227[var5];
            if (arg0 < var6.x + var6.width && var6.x < arg0 + arg4 && arg3 < (var6.y + var6.height) && arg2 + arg3 > var6.y) {
                class744.field10313[var5] = true;
            }
        }
        class33.method272(arg0, arg3, arg2 + arg3, false, arg0 + arg4);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BLso;)V")
    public static final void method2707(byte arg0, class494 arg1) {
        if (arg0 <= 61) {
            method2706(-8, -112, -5, -80, 115);
        }
        field6355++;
        byte[] var2 = new byte[24];
        if (class78.field886 != null) {
            try {
                class78.field886.method3632((byte) 96, 0L);
                class78.field886.method3628(var2, (byte) -10);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method2936(9278, 0, var2, 24);
    }
}
