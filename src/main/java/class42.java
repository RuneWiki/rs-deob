import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class42 {

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "Ljc;")
    public static class305 field454;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field453;

    static {
        new class305("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field456 = 0;
        field454 = new class305(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V", line = 3)
    public static void method243(int arg0) {
        field454 = null;
        if (arg0 != 255) {
            field454 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIZZ)Lfo;", line = 17)
    public static final class361 method244(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field455++;
        class420 var5 = null;
        if (class196.field2528 != null) {
            var5 = new class420(arg2, class196.field2528, class493.field7217[arg2], 1000000);
        }
        int var6 = 123 / ((8 - arg1) / 50);
        class291.field3850[arg2] = class452.field6733.method900(arg2, class394.field5690, 2, var5);
        if (arg3) {
            class291.field3850[arg2].method18((byte) 120);
        }
        return new class361(class291.field3850[arg2], arg4, arg0);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lug;B[B)V", line = 36)
    public final void method245(class396 arg0, byte arg1, byte[] arg2) {
        field451++;
        if (arg0.field5761[arg0.field5729] != 31 || arg0.field5761[arg0.field5729 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field453 == null) {
            this.field453 = new Inflater(true);
        }
        try {
            this.field453.setInput(arg0.field5761, arg0.field5729 + 10, -10 - (8 - arg0.field5761.length + arg0.field5729));
            if (arg1 < 126) {
                this.field453 = null;
            }
            this.field453.inflate(arg2);
        } catch (Exception var4) {
            this.field453.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field453.reset();
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IB)C", line = 63)
    public static final char method246(int arg0, byte arg1) {
        field452++;
        int var2 = arg1 & 0xFF;
        if (arg0 == var2) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class211.field2831[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V", line = 89)
    public class42() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(III)V", line = 107)
    private class42(int arg0, int arg1, int arg2) {
    }
}
