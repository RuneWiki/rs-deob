import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class362 extends class647 {

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "J")
    public static long field5285 = 20000000L;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "Lbe;")
    public static class40 field5282;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "[B")
    private byte[] field5286;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "(I)V")
    public static void method2275(int arg0) {
        field5282 = null;
        if (arg0 != -12285) {
            field5285 = 53L;
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class362() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "(I)V")
    public static final void method2276(int arg0) {
        if (class784.field10800 != null) {
            try {
                class784.field10800.close();
            } catch (IOException var1) {
            }
        }
        field5287++;
        class784.field10800 = null;
        if (arg0 > -1) {
            method2275(45);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)[B")
    public final byte[] method2277(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -31095) {
            this.field5286 = null;
        }
        this.field5286 = new byte[arg2 * arg3 * arg0 * 2];
        field5284++;
        this.method1751((byte) 116, arg0, arg3, arg2);
        return this.field5286;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZIB)V")
    public final void method2278(boolean arg0, int arg1, byte arg2) {
        if (!arg0) {
            this.method2277(-7, 81, 89, -80);
        }
        field5283++;
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field5286[var10001] = (byte) (var5 * 3 >> 5);
        this.field5286[var6] = (byte) (var5 * 3 >> 5);
    }
}
