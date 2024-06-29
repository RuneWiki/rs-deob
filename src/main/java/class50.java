import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class50 extends class123 {

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "[J")
    private long[] field1062 = new long[10];

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    private int field1054 = 1;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
    private int field1056 = 256;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    private int field1052 = 0;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "J")
    private long field1061 = class136.method950(8954);

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "Z")
    public static boolean field1049 = false;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "[I")
    public static int[] field1055 = new int[25];

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "[Lvf;")
    public static class265[] field1063 = new class265[1000];

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    public static int field1058 = 0;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    private int field1057;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "J")
    public static long field1050;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "[I")
    public static int[] field1059;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)I")
    public final int method400(int arg0, int arg1, int arg2) {
        field1064++;
        int var4 = this.field1054;
        int var5 = this.field1056;
        this.field1056 = 300;
        this.field1054 = 1;
        this.field1061 = class136.method950(8954);
        if (this.field1062[this.field1057] == 0L) {
            this.field1054 = var4;
            this.field1056 = var5;
        } else if (this.field1061 > this.field1062[this.field1057]) {
            this.field1056 = (int) ((long) (arg1 * 2560) / (this.field1061 - this.field1062[this.field1057]));
        }
        if (this.field1056 < 25) {
            this.field1056 = 25;
        }
        if (this.field1056 > 256) {
            this.field1056 = 256;
            this.field1054 = (int) ((long) arg1 - ((this.field1061 - this.field1062[this.field1057]) / 10L));
        }
        if (this.field1054 > arg1) {
            this.field1054 = arg1;
        }
        int var6 = 93 % ((arg2 - 25) / 60);
        this.field1062[this.field1057] = this.field1061;
        this.field1057 = (this.field1057 + 1) % 10;
        if (this.field1054 > 1) {
            for (int var7 = 0; var7 < 10; var7++) {
                if (this.field1062[var7] != 0L) {
                    this.field1062[var7] += (long) this.field1054;
                }
            }
        }
        if (this.field1054 < arg0) {
            this.field1054 = arg0;
        }
        class19.method136(1, (long) this.field1054);
        int var8 = 0;
        while (this.field1052 < 256) {
            var8++;
            this.field1052 += this.field1056;
        }
        this.field1052 &= 0xFF;
        return var8;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
    public static void method401(byte arg0) {
        field1063 = null;
        int var1 = -48 / ((62 - arg0) / 32);
        field1059 = null;
        field1055 = null;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V")
    public final void method402(boolean arg0) {
        if (arg0) {
            field1060 = 11;
        }
        field1051++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1062[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
    public class50() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1062[var1] = this.field1061;
        }
    }
}
