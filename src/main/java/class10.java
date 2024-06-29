import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class class10 extends class2 {

    @OriginalMember(owner = "mapview!f", name = "z", descriptor = "[J")
    private long[] field106 = new long[10];

    @OriginalMember(owner = "mapview!f", name = "C", descriptor = "I")
    private int field109 = 0;

    @OriginalMember(owner = "mapview!f", name = "t", descriptor = "I")
    private int field100 = 1;

    @OriginalMember(owner = "mapview!f", name = "v", descriptor = "I")
    private int field102 = 256;

    @OriginalMember(owner = "mapview!f", name = "u", descriptor = "J")
    private long field101 = class9.method60((byte) -111);

    @OriginalMember(owner = "mapview!f", name = "s", descriptor = "La;")
    public static class1 field99 = class3.method36("underlay)3dat", -93);

    @OriginalMember(owner = "mapview!f", name = "p", descriptor = "La;")
    public static class1 field96 = class3.method36("mapscene", -108);

    @OriginalMember(owner = "mapview!f", name = "B", descriptor = "[I")
    public static int[] field108 = new int[128];

    @OriginalMember(owner = "mapview!f", name = "D", descriptor = "[[[[B")
    public static byte[][][][] field110 = new byte[5][][][];

    @OriginalMember(owner = "mapview!f", name = "A", descriptor = "La;")
    public static class1 field107 = class3.method36("Helmet Shop", -103);

    @OriginalMember(owner = "mapview!f", name = "E", descriptor = "I")
    public static int field111 = 1;

    @OriginalMember(owner = "mapview!f", name = "q", descriptor = "La;")
    public static class1 field97 = class3.method36("Switch to ", -104);

    @OriginalMember(owner = "mapview!f", name = "y", descriptor = "La;")
    public static class1 field105 = class3.method36("Slayer Master", -110);

    @OriginalMember(owner = "mapview!f", name = "r", descriptor = "La;")
    public static class1 field98 = class3.method36("Silver Shop", -82);

    @OriginalMember(owner = "mapview!f", name = "x", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "mapview!f", name = "o", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "mapview!f", name = "w", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field103;

    @OriginalMember(owner = "mapview!f", name = "d", descriptor = "(I)V", line = 33)
    public static void method61(int arg0) {
        field98 = null;
        field99 = null;
        field110 = null;
        field96 = null;
        field108 = null;
        if (arg0 <= 105) {
            method61(23);
        }
        field107 = null;
        field103 = null;
        field105 = null;
        field97 = null;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(BII)I", line = 89)
    public final int method34(byte arg0, int arg1, int arg2) {
        int var4 = this.field102;
        int var5 = this.field100;
        this.field102 = 300;
        this.field100 = 1;
        this.field101 = class9.method60((byte) -83);
        if (this.field106[this.field104] == 0L) {
            this.field100 = var5;
            this.field102 = var4;
        } else if (this.field101 > this.field106[this.field104]) {
            this.field102 = (int) ((long) (arg2 * 2560) / (this.field101 - this.field106[this.field104]));
        }
        if (this.field102 < 25) {
            this.field102 = 25;
        }
        if (this.field102 > 256) {
            this.field102 = 256;
            this.field100 = (int) ((long) arg2 - (this.field101 - this.field106[this.field104]) / 10L);
        }
        if (arg2 < this.field100) {
            this.field100 = arg2;
        }
        this.field106[this.field104] = this.field101;
        this.field104 = (this.field104 + 1) % 10;
        if (this.field100 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field106[var6] != 0L) {
                    this.field106[var6] += this.field100;
                }
            }
        }
        int var7 = 0;
        if (arg1 > this.field100) {
            this.field100 = arg1;
        }
        if (arg0 < 17) {
            this.field109 = 24;
        }
        class1.method11((long) this.field100, (byte) -61);
        while (this.field109 < 256) {
            this.field109 += this.field102;
            var7++;
        }
        this.field109 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!f", name = "<init>", descriptor = "()V", line = 172)
    public class10() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field106[var1] = this.field101;
        }
    }
}
