import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public abstract class class269 extends class36 {

    @OriginalMember(owner = "client!en", name = "q", descriptor = "I")
    public int field3770;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "Luk;")
    public class221 field3772;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "[I")
    public static int[] field3771 = new int[120];

    @OriginalMember(owner = "client!en", name = "t", descriptor = "Lei;")
    public static class154 field3773;

    @OriginalMember(owner = "client!en", name = "p", descriptor = "I")
    public static int field3769;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field3771[var1] = var0 / 4;
        }
        field3773 = new class154();
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B[SI)[S", line = 11)
    public static final short[] method1757(byte arg0, short[] arg1, int arg2) {
        field3769++;
        if (arg0 != -14) {
            field3771 = null;
        }
        short[] var3 = new short[arg2];
        class210.method1329(arg1, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Luk;I)V", line = 25)
    public class269(class221 arg0, int arg1) {
        this.field3770 = arg1;
        this.field3772 = arg0;
    }

    @OriginalMember(owner = "client!en", name = "h", descriptor = "(I)V", line = 57)
    public static void method1758(int arg0) {
        field3773 = null;
        field3771 = null;
        if (arg0 != -27132) {
            field3771 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Z")
    public abstract boolean method1430(int arg0);

    @OriginalMember(owner = "client!en", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1429(int arg0);
}
