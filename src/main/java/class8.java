import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 {

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    private int field111 = 0;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    private int field117 = -1;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "Lmf;")
    private class291 field115 = new class291();

    @OriginalMember(owner = "client!to", name = "n", descriptor = "Z")
    public boolean field124 = false;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    private int field114;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "[Lcm;")
    private class515[] field122;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "[[I")
    private int[][] field116;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "[B")
    public static byte[] field118 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!to", name = "k", descriptor = "Los;")
    public static class309 field121 = new class309(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "[I")
    public static int[] field112;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public final void method46(int arg0) {
        field123++;
        for (int var2 = arg0; var2 < this.field120; var2++) {
            this.field116[var2] = null;
        }
        this.field116 = null;
        this.field122 = null;
        this.field115.method1891(-3);
        this.field115 = null;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)[[I")
    public final int[][] method47(int arg0) {
        field113++;
        if (this.field120 != this.field114) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = -5 / ((-arg0 - 46) / 51);
        for (int var3 = 0; var3 < this.field120; var3++) {
            this.field122[var3] = class432.field6426;
        }
        return this.field116;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IB)[I")
    public final int[] method48(int arg0, byte arg1) {
        if (arg1 != 0) {
            return null;
        }
        field119++;
        if (this.field120 == this.field114) {
            this.field124 = this.field122[arg0] == null;
            this.field122[arg0] = class432.field6426;
            return this.field116[arg0];
        } else if (this.field120 == 1) {
            this.field124 = this.field117 != arg0;
            this.field117 = arg0;
            return this.field116[0];
        } else {
            class515 var3 = this.field122[arg0];
            if (var3 == null) {
                this.field124 = true;
                if (this.field120 > this.field111) {
                    var3 = new class515(arg0, this.field111);
                    this.field111++;
                } else {
                    class515 var4 = (class515) this.field115.method1884((byte) -30);
                    var3 = new class515(arg0, var4.field7474);
                    this.field122[var4.field7475] = null;
                    var4.method1676(true);
                }
                this.field122[arg0] = var3;
            } else {
                this.field124 = false;
            }
            this.field115.method1887((byte) 127, var3);
            return this.field116[var3.field7474];
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V")
    public static void method49(int arg0) {
        field121 = null;
        field118 = null;
        int var1 = -111 % ((-arg0 - 49) / 51);
        field112 = null;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(III)V")
    public class8(int arg0, int arg1, int arg2) {
        this.field120 = arg0;
        this.field114 = arg1;
        this.field122 = new class515[this.field114];
        this.field116 = new int[this.field120][arg2];
    }
}
