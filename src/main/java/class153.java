import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class153 extends class397 {

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "I")
    private int field1958 = 204;

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    private int field1960 = 1;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "I")
    private int field1962 = 1;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1957 = new CRC32();

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "Lak;")
    public static class222 field1963 = new class222(4, 1, 1, 1);

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "Lph;")
    public static class438 field1964 = new class438("WTWIP", 3);

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "I")
    public static int field1966 = -1;

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "Z")
    public static boolean field1967;

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "I")
    public static int field1965;

    static {
        new class194("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field1967 = false;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)[I", line = 5)
    public final int[] method31(int arg0, int arg1) {
        ++field1961;
        if (arg0 != -780833076) {
            field1966 = -29;
        }
        int[] var3 = super.field5854.method465(arg1, 102);
        if (super.field5854.field991) {
            for (int var4 = 0; ~class164.field2152 < ~var4; ++var4) {
                int var5 = class228.field3210[var4];
                int var6 = class447.field6523[arg1];
                int var7 = this.field1962 * var5 >> 12;
                int var8 = this.field1960 * var6 >> 12;
                int var9 = var5 % (4096 / this.field1962) * this.field1962;
                int var10 = var6 % (4096 / this.field1960) * this.field1960;
                if (this.field1958 > var10) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field1958) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field1958 < ~var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 89)
    public class153() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(B)V", line = 95)
    public static void method930(byte arg0) {
        field1964 = null;
        int var1 = -82 / ((52 - arg0) / 42);
        field1957 = null;
        field1963 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBLae;)V", line = 125)
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (arg1 != 80) {
            method930((byte) -70);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field1958 = arg2.method993((byte) -121);
                }
            } else {
                this.field1960 = arg2.method941((byte) 124);
            }
        } else {
            this.field1962 = arg2.method941((byte) 124);
        }
        ++field1959;
    }
}
