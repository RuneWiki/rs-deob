import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class52 extends class20 {

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "[J")
    private long[] field1136 = new long[10];

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    private int field1137 = 256;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    private int field1126 = 0;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    private int field1127 = 1;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "J")
    private long field1134 = class80.method600(-54);

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "Z")
    public static boolean field1132 = false;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    private int field1131;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "Lvb;")
    public static class226 field1133;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static void method404(byte arg0) {
        if (arg0 > -107) {
            field1133 = null;
        }
        field1133 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public final void method175(int arg0) {
        if (arg0 >= 119) {
            for (int var2 = 0; var2 < 10; var2++) {
                this.field1136[var2] = 0L;
            }
            field1130++;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)I")
    public final int method176(int arg0, int arg1, int arg2) {
        int var4 = this.field1127;
        field1128++;
        int var5 = this.field1137;
        this.field1127 = 1;
        this.field1137 = 300;
        this.field1134 = class80.method600(-55);
        if (this.field1136[this.field1131] == 0L) {
            this.field1127 = var4;
            this.field1137 = var5;
        } else if (this.field1136[this.field1131] < this.field1134) {
            this.field1137 = (int) ((long) (arg2 * 2560) / (this.field1134 - this.field1136[this.field1131]));
        }
        if (this.field1137 < 25) {
            this.field1137 = 25;
        }
        if (this.field1137 > 256) {
            this.field1137 = 256;
            this.field1127 = (int) ((long) arg2 - ((this.field1134 - this.field1136[this.field1131]) / 10L));
        }
        if (arg2 < this.field1127) {
            this.field1127 = arg2;
        }
        this.field1136[this.field1131] = this.field1134;
        this.field1131 = (this.field1131 + 1) % 10;
        if (this.field1127 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1136[var6] != 0L) {
                    this.field1136[var6] += (long) this.field1127;
                }
            }
        }
        if (arg1 > this.field1127) {
            this.field1127 = arg1;
        }
        class33.method283(-117, (long) this.field1127);
        if (arg0 >= -122) {
            method404((byte) 100);
        }
        int var7 = 0;
        while (this.field1126 < 256) {
            var7++;
            this.field1126 += this.field1137;
        }
        this.field1126 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
    public class52() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1136[var1] = this.field1134;
        }
    }
}
