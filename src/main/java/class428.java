import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class428 {

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "[I")
    public static int[] field5844 = new int[4096];

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "I")
    public static int field5845 = -1;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lfca;I)V", line = 4)
    public static final void method2520(class93 arg0, int arg1) {
        field5843++;
        byte[] var2 = new byte[24];
        if (class769.field10595 != null) {
            try {
                class769.field10595.method2553(-1, 0L);
                class769.field10595.method2551(var2, true);
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
        arg0.method743(arg1, 24, var2, true);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V", line = 48)
    public static void method2521(int arg0) {
        if (arg0 != -25) {
            field5844 = null;
        }
        field5844 = null;
    }
}
