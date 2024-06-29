import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class class11 extends class14 {

    @OriginalMember(owner = "mapview!g", name = "k", descriptor = "[J")
    private long[] field129 = new long[10];

    @OriginalMember(owner = "mapview!g", name = "i", descriptor = "Z")
    public static boolean field127 = false;

    @OriginalMember(owner = "mapview!g", name = "o", descriptor = "Lna;")
    public static class26 field133 = class6.method40("Agility Training", 48);

    @OriginalMember(owner = "mapview!g", name = "n", descriptor = "Lca;")
    public static class6 field132 = new class6();

    @OriginalMember(owner = "mapview!g", name = "p", descriptor = "I")
    public static int field134 = -1;

    @OriginalMember(owner = "mapview!g", name = "q", descriptor = "Lna;")
    public static class26 field135 = class6.method40("b12_full", 48);

    @OriginalMember(owner = "mapview!g", name = "s", descriptor = "[[B")
    public static byte[][] field137 = new byte[250][];

    @OriginalMember(owner = "mapview!g", name = "t", descriptor = "Lna;")
    public static class26 field138 = class6.method40("null", 48);

    @OriginalMember(owner = "mapview!g", name = "g", descriptor = "I")
    private int field125;

    @OriginalMember(owner = "mapview!g", name = "h", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "mapview!g", name = "l", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "mapview!g", name = "m", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "mapview!g", name = "j", descriptor = "J")
    private long field128;

    @OriginalMember(owner = "mapview!g", name = "r", descriptor = "[[B")
    public static byte[][] field136;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(III)I", line = 12)
    public final int method73(int arg0, int arg1, int arg2) {
        int var4 = this.field131;
        int var5 = this.field125;
        if (arg2 != 128) {
            return -74;
        }
        this.field125 = 1;
        this.field131 = 300;
        this.field128 = class32.method229(arg2 ^ 0xFFFFFF7F);
        if (this.field129[this.field126] == 0L) {
            this.field131 = var4;
            this.field125 = var5;
        } else if (this.field129[this.field126] < this.field128) {
            this.field131 = (int) ((long) (arg1 * 2560) / (this.field128 - this.field129[this.field126]));
        }
        if (this.field131 < 25) {
            this.field131 = 25;
        }
        if (this.field131 > 256) {
            this.field131 = 256;
            this.field125 = (int) ((long) arg1 - (this.field128 - this.field129[this.field126]) / 10L);
        }
        if (arg1 < this.field125) {
            this.field125 = arg1;
        }
        this.field129[this.field126] = this.field128;
        this.field126 = (this.field126 + 1) % 10;
        if (this.field125 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field129[var6] != 0L) {
                    this.field129[var6] += this.field125;
                }
            }
        }
        if (arg0 > this.field125) {
            this.field125 = arg0;
        }
        class23.method135(-24879, (long) this.field125);
        int var7 = 0;
        while (this.field130 < 256) {
            this.field130 += this.field131;
            var7++;
        }
        this.field130 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "(B)V", line = 84)
    public static void method74(byte arg0) {
        field132 = null;
        field137 = null;
        field136 = null;
        field138 = null;
        if (arg0 > -19) {
            field127 = false;
        }
        field133 = null;
        field135 = null;
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(B)V", line = 102)
    public final void method75(byte arg0) {
        this.field125 = 1;
        this.field131 = 256;
        this.field130 = 0;
        this.field128 = class32.method229(arg0 ^ 0xFFFFFFAB);
        if (arg0 != 84) {
            this.field130 = 38;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field129[var2] = this.field128;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "()V", line = 147)
    public class11() {
        this.method75((byte) 84);
    }
}
