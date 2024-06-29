import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public class class5 extends class15 {

    @OriginalMember(owner = "mapview!c", name = "o", descriptor = "[J")
    private long[] field124 = new long[10];

    @OriginalMember(owner = "mapview!c", name = "n", descriptor = "Ln;")
    public static class26 field123 = class9.method82(255, " )2 ");

    @OriginalMember(owner = "mapview!c", name = "r", descriptor = "Ln;")
    public static class26 field127 = class9.method82(255, "Farming patch");

    @OriginalMember(owner = "mapview!c", name = "s", descriptor = "[J")
    public static long[] field128 = new long[32];

    @OriginalMember(owner = "mapview!c", name = "B", descriptor = "[Z")
    public static boolean[] field137 = new boolean[112];

    @OriginalMember(owner = "mapview!c", name = "p", descriptor = "I")
    public static int field125 = 0;

    @OriginalMember(owner = "mapview!c", name = "w", descriptor = "I")
    public static volatile int field132 = -1;

    @OriginalMember(owner = "mapview!c", name = "y", descriptor = "Ln;")
    public static class26 field134 = class9.method82(255, "Prev page");

    @OriginalMember(owner = "mapview!c", name = "t", descriptor = "Ln;")
    public static class26 field129 = class9.method82(255, "Agility Training");

    @OriginalMember(owner = "mapview!c", name = "D", descriptor = "Ln;")
    public static class26 field138 = class9.method82(255, "Skirt Shop");

    @OriginalMember(owner = "mapview!c", name = "J", descriptor = "I")
    public static int field143 = 0;

    @OriginalMember(owner = "mapview!c", name = "u", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "mapview!c", name = "v", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "mapview!c", name = "z", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "mapview!c", name = "A", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "mapview!c", name = "F", descriptor = "I")
    private int field140;

    @OriginalMember(owner = "mapview!c", name = "G", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "mapview!c", name = "q", descriptor = "J")
    public static long field126;

    @OriginalMember(owner = "mapview!c", name = "x", descriptor = "J")
    public static long field133;

    @OriginalMember(owner = "mapview!c", name = "I", descriptor = "J")
    private long field142;

    @OriginalMember(owner = "mapview!c", name = "E", descriptor = "Ljava/lang/String;")
    public static String field139;

    @OriginalMember(owner = "mapview!c", name = "<init>", descriptor = "()V", line = 228)
    public class5() {
        this.method62(22083);
    }

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "(B)B", line = 16)
    public static final byte method60(byte arg0) {
        if (arg0 > -15) {
            method60((byte) -85);
        }
        return class29.field373 == null ? 0 : class29.field373[class18.field262];
    }

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "(I)V", line = 76)
    public static void method61(int arg0) {
        field137 = null;
        field139 = null;
        field123 = null;
        field127 = null;
        field129 = null;
        field128 = null;
        field138 = null;
        field134 = null;
        if (arg0 != 25) {
            method61(-116);
        }
    }

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "(I)V", line = 101)
    public final void method62(int arg0) {
        this.field141 = 1;
        this.field140 = 0;
        this.field136 = 256;
        if (arg0 != 22083) {
            field143 = -65;
        }
        this.field142 = class16.method115((byte) 74);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field124[var2] = this.field142;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(ZII)I", line = 148)
    public final int method63(boolean arg0, int arg1, int arg2) {
        int var4 = this.field136;
        this.field136 = 300;
        int var5 = this.field141;
        this.field141 = 1;
        this.field142 = class16.method115((byte) 74);
        if (this.field124[this.field131] == 0L) {
            this.field136 = var4;
            this.field141 = var5;
        } else if (this.field142 > this.field124[this.field131]) {
            this.field136 = (int) ((long) (arg2 * 2560) / (this.field142 - this.field124[this.field131]));
        }
        if (this.field136 < 25) {
            this.field136 = 25;
        }
        if (this.field136 > 256) {
            this.field136 = 256;
            this.field141 = (int) ((long) arg2 - (this.field142 - this.field124[this.field131]) / 10L);
        }
        if (arg2 < this.field141) {
            this.field141 = arg2;
        }
        this.field124[this.field131] = this.field142;
        if (!arg0) {
            this.field141 = -102;
        }
        this.field131 = (this.field131 + 1) % 10;
        if (this.field141 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field124[var6] != 0L) {
                    this.field124[var6] += this.field141;
                }
            }
        }
        if (this.field141 < arg1) {
            this.field141 = arg1;
        }
        class18.method137((long) this.field141, (byte) 119);
        int var7 = 0;
        while (this.field140 < 256) {
            var7++;
            this.field140 += this.field136;
        }
        this.field140 &= 0xFF;
        return var7;
    }
}
