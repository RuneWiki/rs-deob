import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 extends class152 {

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "[J")
    private long[] field45 = new long[10];

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
    private int field52 = 256;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    private int field48 = 0;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    private int field47 = 1;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "J")
    private long field42 = class10.method47(18889);

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Lod;")
    public static class101 field40 = class46.method335(-86, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "Lod;")
    public static class101 field43 = class46.method335(79, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field41 = 7759444;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "Lod;")
    public static class101 field46 = class46.method335(-55, "Okay");

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "Ltf;")
    public static class138 field51 = new class138(8);

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "[I")
    public static int[] field55 = new int[1000];

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "[I")
    public static int[] field54 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    private int field50;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "Lc;")
    public static class15 field44;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "Lc;")
    public static class15 field56;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "[[B")
    public static byte[][] field53;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)Lqe;")
    public static final class116 method11(int arg0) {
        field38++;
        class116 var1 = new class116();
        var1.field2572 = class150.field3434[0];
        var1.field2569 = class67.field1503[0];
        var1.field2568 = class6.field94;
        var1.field2574 = class138.field3173[0];
        if (arg0 <= 32) {
            field40 = null;
        }
        var1.field2567 = class2.field31[0];
        var1.field2570 = class32.field822[0];
        var1.field2573 = class93.field1998;
        var1.field2571 = class34.field862;
        class63.method433(4096);
        return var1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        int var2 = -18 / ((-arg0 - 36) / 47);
        for (int var3 = 0; var3 < 10; var3++) {
            this.field45[var3] = 0L;
        }
        field49++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)I")
    public final int method13(int arg0, int arg1, int arg2) {
        field39++;
        int var4 = this.field52;
        this.field52 = 300;
        int var5 = this.field47;
        if (arg0 != 128) {
            return 117;
        }
        this.field47 = 1;
        this.field42 = class10.method47(18889);
        if (this.field45[this.field50] == 0L) {
            this.field47 = var5;
            this.field52 = var4;
        } else if (this.field45[this.field50] < this.field42) {
            this.field52 = (int) ((long) (arg1 * 2560) / (this.field42 - this.field45[this.field50]));
        }
        if (this.field52 < 25) {
            this.field52 = 25;
        }
        if (this.field52 > 256) {
            this.field52 = 256;
            this.field47 = (int) ((long) arg1 - (this.field42 - this.field45[this.field50]) / 10L);
        }
        if (arg1 < this.field47) {
            this.field47 = arg1;
        }
        this.field45[this.field50] = this.field42;
        this.field50 = (this.field50 + 1) % 10;
        if (this.field47 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field45[var6] != 0L) {
                    this.field45[var6] += this.field47;
                }
            }
        }
        if (arg2 > this.field47) {
            this.field47 = arg2;
        }
        class127.method981((byte) -86, (long) this.field47);
        int var7 = 0;
        while (this.field48 < 256) {
            this.field48 += this.field52;
            var7++;
        }
        this.field48 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V")
    public static void method14(byte arg0) {
        field56 = null;
        field53 = null;
        field40 = null;
        field55 = null;
        field43 = null;
        field54 = null;
        int var1 = -41 / ((arg0 - 28) / 38);
        field44 = null;
        field51 = null;
        field46 = null;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class3() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field45[var1] = this.field42;
        }
    }
}
