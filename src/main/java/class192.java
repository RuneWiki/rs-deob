import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class192 {

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field3369 = 0;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "[I")
    public static int[] field3374 = new int[2000];

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Lsc;")
    public static class181 field3370 = class149.method967(255, "k");

    @OriginalMember(owner = "client!i", name = "k", descriptor = "[Lgf;")
    public static class103[] field3378 = new class103[50];

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public int field3371;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public int field3372;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public int field3377;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public int field3380;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Lsc;")
    public class181 field3379;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Z")
    public boolean field3368;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BZ)V")
    public static final void method1320(byte arg0, boolean arg1) {
        field3375++;
        if (arg0 <= 79) {
            method1321((byte) -126);
        }
        if (class199.field3446 == null) {
            return;
        }
        try {
            class230 var2 = new class230(4);
            var2.method1538(arg1 ? 2 : 3, (byte) 100);
            var2.method1547(true, 0);
            class199.field3446.method317(4, 106, var2.field3977, 0);
        } catch (IOException var4) {
            try {
                class199.field3446.method313(-114);
            } catch (Exception var3) {
            }
            class199.field3446 = null;
            class75.field1206++;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static void method1321(byte arg0) {
        field3378 = null;
        if (arg0 >= -10) {
            field3369 = -102;
        }
        field3370 = null;
        field3374 = null;
    }
}
