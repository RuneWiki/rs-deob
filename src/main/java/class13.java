import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class class13 extends class29 {

    @OriginalMember(owner = "mapview!g", name = "w", descriptor = "[J")
    private long[] field133 = new long[10];

    @OriginalMember(owner = "mapview!g", name = "n", descriptor = "I")
    public static int field124 = 0;

    @OriginalMember(owner = "mapview!g", name = "u", descriptor = "Ld;")
    public static class7 field131 = class37.method242("Furnace", 1333943984);

    @OriginalMember(owner = "mapview!g", name = "v", descriptor = "Ld;")
    public static class7 field132 = class37.method242("labels)3dat", 1333943984);

    @OriginalMember(owner = "mapview!g", name = "o", descriptor = "I")
    private int field125;

    @OriginalMember(owner = "mapview!g", name = "p", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "mapview!g", name = "r", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "mapview!g", name = "s", descriptor = "I")
    private int field129;

    @OriginalMember(owner = "mapview!g", name = "q", descriptor = "J")
    private long field127;

    @OriginalMember(owner = "mapview!g", name = "t", descriptor = "[B")
    public static byte[] field130;

    @OriginalMember(owner = "mapview!g", name = "c", descriptor = "(I)B", line = 6)
    public static final byte method100(int arg0) {
        if (arg0 != -73) {
            method102(126);
        }
        return field130 == null ? 0 : field130[class16.field166];
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(B)V", line = 25)
    public final void method101(byte arg0) {
        this.field129 = 1;
        this.field125 = 0;
        this.field128 = 256;
        this.field127 = class24.method157((byte) -117);
        if (arg0 != 79) {
            this.method101((byte) -93);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field133[var2] = this.field127;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "d", descriptor = "(I)V", line = 50)
    public static void method102(int arg0) {
        field131 = null;
        field130 = null;
        field132 = null;
        if (arg0 <= 90) {
            field130 = null;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(IIB)I", line = 67)
    public final int method103(int arg0, int arg1, byte arg2) {
        int var4 = this.field129;
        int var5 = this.field128;
        this.field129 = 1;
        if (arg2 <= 113) {
            return -30;
        }
        this.field128 = 300;
        this.field127 = class24.method157((byte) -117);
        if (this.field133[this.field126] == 0L) {
            this.field128 = var5;
            this.field129 = var4;
        } else if (this.field127 > this.field133[this.field126]) {
            this.field128 = (int) ((long) (arg1 * 2560) / (this.field127 - this.field133[this.field126]));
        }
        if (this.field128 < 25) {
            this.field128 = 25;
        }
        if (this.field128 > 256) {
            this.field128 = 256;
            this.field129 = (int) ((long) arg1 - (this.field127 - this.field133[this.field126]) / 10L);
        }
        if (arg1 < this.field129) {
            this.field129 = arg1;
        }
        this.field133[this.field126] = this.field127;
        this.field126 = (this.field126 + 1) % 10;
        if (this.field129 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field133[var6] != 0L) {
                    this.field133[var6] += this.field129;
                }
            }
        }
        if (this.field129 < arg0) {
            this.field129 = arg0;
        }
        int var7 = 0;
        class1.method8(106, (long) this.field129);
        while (this.field125 < 256) {
            this.field125 += this.field128;
            var7++;
        }
        this.field125 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "()V", line = 159)
    public class13() {
        this.method101((byte) 79);
    }
}
