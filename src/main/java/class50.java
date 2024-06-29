import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class50 extends class271 {

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "[J")
    private long[] field791 = new long[10];

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    private int field785 = 256;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    private int field788 = 1;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    private int field789 = 0;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "J")
    private long field778 = class128.method869((byte) -55);

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "Lgn;")
    public static class5 field783 = new class5(128);

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "[I")
    public static int[] field793 = new int[2];

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "Lna;")
    public static class26 field784 = class69.method505("Fallen lassen", (byte) -117);

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public static int field790 = 0;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    private int field782;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "Ljava/awt/Image;")
    public static Image field792;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "[Lqf;")
    public static class148[] field787;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V", line = 14)
    public static void method367(int arg0) {
        field784 = null;
        field793 = null;
        field792 = null;
        if (arg0 != 14635) {
            field783 = (class5) null;
        }
        field787 = null;
        field783 = null;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V", line = 28)
    public final void method368(int arg0) {
        field781++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field791[var2] = 0L;
        }
        int var3 = -114 % ((arg0 + 82) / 42);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)I", line = 48)
    public final int method369(int arg0, int arg1, int arg2) {
        field780++;
        if (arg0 != -1) {
            this.method369(-14, 83, 10);
        }
        int var4 = this.field788;
        int var5 = this.field785;
        this.field785 = 300;
        this.field788 = 1;
        this.field778 = class128.method869((byte) -55);
        if (this.field791[this.field782] == 0L) {
            this.field785 = var5;
            this.field788 = var4;
        } else if (this.field791[this.field782] < this.field778) {
            this.field785 = (int) ((long) (arg2 * 2560) / (this.field778 - this.field791[this.field782]));
        }
        if (this.field785 < 25) {
            this.field785 = 25;
        }
        if (this.field785 > 256) {
            this.field785 = 256;
            this.field788 = (int) ((long) arg2 - ((this.field778 - this.field791[this.field782]) / 10L));
        }
        if (arg2 < this.field788) {
            this.field788 = arg2;
        }
        this.field791[this.field782] = this.field778;
        this.field782 = (this.field782 + 1) % 10;
        if (this.field788 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field791[var6] != 0L) {
                    this.field791[var6] += (long) this.field788;
                }
            }
        }
        if (arg1 > this.field788) {
            this.field788 = arg1;
        }
        class126.method862((long) this.field788, arg0 ^ 0xFFFFFFBF);
        int var7 = 0;
        while (this.field789 < 256) {
            this.field789 += this.field785;
            var7++;
        }
        this.field789 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V", line = 138)
    public class50() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field791[var1] = this.field778;
        }
    }
}
