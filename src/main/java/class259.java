import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class259 {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "[B")
    public static byte[] field3960;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "[Lkr;")
    public static class234[] field3958;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([BB)[B")
    public static final byte[] method1604(byte[] arg0, byte arg1) {
        field3959++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != -58) {
            field3958 = null;
        }
        byte[] var2 = new byte[arg0.length];
        class129.method768(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public static void method1605(byte arg0) {
        if (arg0 != 78) {
            method1605((byte) -68);
        }
        field3960 = null;
        field3958 = null;
    }

    static {
        new class151("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        int var0 = 0;
        field3960 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3960[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 + 65535)) / 65535.0F))));
            }
        }
        field3961 = 0;
    }
}
