import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class503 extends class513 {

    @OriginalMember(owner = "client!hha", name = "r", descriptor = "Lfha;")
    public static class522 field7030 = new class522();

    @OriginalMember(owner = "client!hha", name = "v", descriptor = "I")
    public static int field7034 = 4;

    @OriginalMember(owner = "client!hha", name = "n", descriptor = "I")
    public int field7026;

    @OriginalMember(owner = "client!hha", name = "o", descriptor = "I")
    public int field7027;

    @OriginalMember(owner = "client!hha", name = "p", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!hha", name = "u", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!hha", name = "k", descriptor = "[I")
    public int[] field7023;

    @OriginalMember(owner = "client!hha", name = "q", descriptor = "[I")
    public int[] field7029;

    @OriginalMember(owner = "client!hha", name = "s", descriptor = "[I")
    public int[] field7031;

    @OriginalMember(owner = "client!hha", name = "l", descriptor = "[Lfg;")
    public class436[] field7024;

    @OriginalMember(owner = "client!hha", name = "t", descriptor = "[Lfg;")
    public class436[] field7032;

    @OriginalMember(owner = "client!hha", name = "m", descriptor = "[[[B")
    public byte[][][] field7025;

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(B)V")
    public static final void method3003(byte arg0) {
        int var1 = 104 / ((arg0 - 53) / 51);
        field7028++;
        if (class510.field7112 != null && class666.field9382 != null) {
            return;
        }
        class666.field9382 = new int[256];
        class510.field7112 = new int[256];
        for (int var2 = 0; var2 < 256; var2++) {
            double var3 = (double) var2 / 255.0D * 6.283185307179586D;
            class510.field7112[var2] = (int) (Math.sin(var3) * 4096.0D);
            class666.field9382[var2] = (int) (Math.cos(var3) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(Z)V")
    public static void method3004(boolean arg0) {
        if (!arg0) {
            field7030 = null;
        }
        field7030 = null;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(ZB)C")
    public static final char method3005(boolean arg0, byte arg1) {
        field7033++;
        if (!arg0) {
            method3005(false, (byte) 97);
        }
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class647.field9172[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }
}
