import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public class class6 extends class4 {

    @OriginalMember(owner = "mapview!ca", name = "w", descriptor = "[J")
    private long[] field80 = new long[10];

    @OriginalMember(owner = "mapview!ca", name = "s", descriptor = "Lr;")
    public static class33 field76 = class29.method192("loc)3dat", (byte) 126);

    @OriginalMember(owner = "mapview!ca", name = "n", descriptor = "Lr;")
    public static class33 field71 = class29.method192("Find", (byte) 126);

    @OriginalMember(owner = "mapview!ca", name = "o", descriptor = "I")
    public static int field72 = 0;

    @OriginalMember(owner = "mapview!ca", name = "m", descriptor = "[I")
    public static int[] field70 = new int[128];

    @OriginalMember(owner = "mapview!ca", name = "r", descriptor = "I")
    public static int field75 = 1;

    @OriginalMember(owner = "mapview!ca", name = "l", descriptor = "I")
    private int field69;

    @OriginalMember(owner = "mapview!ca", name = "q", descriptor = "I")
    private int field74;

    @OriginalMember(owner = "mapview!ca", name = "t", descriptor = "I")
    private int field77;

    @OriginalMember(owner = "mapview!ca", name = "u", descriptor = "I")
    private int field78;

    @OriginalMember(owner = "mapview!ca", name = "p", descriptor = "J")
    private long field73;

    @OriginalMember(owner = "mapview!ca", name = "v", descriptor = "Ljava/awt/Frame;")
    public static Frame field79;

    @OriginalMember(owner = "mapview!ca", name = "k", descriptor = "Z")
    public static boolean field68;

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "(I)V", line = 21)
    public static void method38(int arg0) {
        field71 = null;
        field76 = null;
        field70 = null;
        field79 = null;
        if (arg0 > -31) {
            method39(113, 11, (byte) -10, null);
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(I)V", line = 43)
    public final void method25(int arg0) {
        this.field77 = 0;
        this.field69 = 256;
        this.field78 = 1;
        this.field73 = class13.method94(-125);
        for (int var2 = arg0; var2 < 10; var2++) {
            this.field80[var2] = this.field73;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IIB[Lr;)V", line = 86)
    public static final void method39(int arg0, int arg1, byte arg2, class33[] arg3) {
        if (arg0 == 1) {
            arg3[0].method217(0);
        } else {
            class10.method59(arg3, arg1, arg0, true).method217(0);
        }
        int var4 = -14 % ((arg2 + 23) / 32);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IIB)I", line = 108)
    public final int method26(int arg0, int arg1, byte arg2) {
        int var4 = this.field69;
        int var5 = this.field78;
        this.field69 = 300;
        this.field78 = 1;
        this.field73 = class13.method94(-109);
        if (arg2 < 42) {
            return -122;
        }
        if (this.field80[this.field74] == 0L) {
            this.field69 = var4;
            this.field78 = var5;
        } else if (this.field80[this.field74] < this.field73) {
            this.field69 = (int) ((long) (arg1 * 2560) / (this.field73 - this.field80[this.field74]));
        }
        if (this.field69 < 25) {
            this.field69 = 25;
        }
        if (this.field69 > 256) {
            this.field69 = 256;
            this.field78 = (int) ((long) arg1 - (this.field73 - this.field80[this.field74]) / 10L);
        }
        if (this.field78 > arg1) {
            this.field78 = arg1;
        }
        this.field80[this.field74] = this.field73;
        this.field74 = (this.field74 + 1) % 10;
        if (this.field78 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field80[var6] != 0L) {
                    this.field80[var6] += this.field78;
                }
            }
        }
        if (arg0 > this.field78) {
            this.field78 = arg0;
        }
        class35.method240(false, (long) this.field78);
        int var7 = 0;
        while (this.field77 < 256) {
            var7++;
            this.field77 += this.field69;
        }
        this.field77 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!ca", name = "<init>", descriptor = "()V", line = 178)
    public class6() {
        this.method25(0);
    }
}
