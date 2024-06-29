import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class67 extends class184 {

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "[J")
    private long[] field1258 = new long[10];

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    private int field1259 = 256;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    private int field1261 = 1;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    private int field1271 = 0;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "J")
    private long field1266 = class135.method849(true);

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field1262 = 0;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field1265 = 0;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "J")
    public static long field1270;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lab;II)Lva;")
    public static final class219 method458(class3 arg0, int arg1, int arg2) {
        if (arg2 <= 85) {
            field1270 = 45L;
        }
        field1263++;
        return class184.method1158(true, arg0, arg1) ? class11.method104(2) : null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIB)I")
    public final int method459(int arg0, int arg1, byte arg2) {
        int var4 = this.field1259;
        this.field1259 = 300;
        field1269++;
        int var5 = this.field1261;
        this.field1261 = 1;
        this.field1266 = class135.method849(true);
        if (this.field1258[this.field1272] == 0L) {
            this.field1261 = var5;
            this.field1259 = var4;
        } else if (this.field1258[this.field1272] < this.field1266) {
            this.field1259 = (int) ((long) (arg1 * 2560) / (this.field1266 - this.field1258[this.field1272]));
        }
        if (this.field1259 < 25) {
            this.field1259 = 25;
        }
        if (arg2 != 85) {
            this.field1261 = 13;
        }
        if (this.field1259 > 256) {
            this.field1259 = 256;
            this.field1261 = (int) ((long) arg1 - (this.field1266 - this.field1258[this.field1272]) / 10L);
        }
        if (this.field1261 > arg1) {
            this.field1261 = arg1;
        }
        this.field1258[this.field1272] = this.field1266;
        this.field1272 = (this.field1272 + 1) % 10;
        if (this.field1261 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1258[var6] != 0L) {
                    this.field1258[var6] -= -((long) this.field1261);
                }
            }
        }
        if (this.field1261 < arg0) {
            this.field1261 = arg0;
        }
        class225.method1471((long) this.field1261, -23364);
        int var7 = 0;
        while (this.field1271 < 256) {
            this.field1271 += this.field1259;
            var7++;
        }
        this.field1271 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public final void method460(int arg0) {
        field1267++;
        if (arg0 != 382) {
            this.field1266 = -14L;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1258[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lab;ZZLab;Lr;)V")
    public static final void method461(class3 arg0, boolean arg1, boolean arg2, class3 arg3, class178 arg4) {
        class119.field2257 = arg0;
        class80.field1542 = arg3;
        class228.field4289 = arg1;
        field1268++;
        if (arg2) {
            int var5 = class80.field1542.method34((byte) 16) - 1;
            class173.field3245 = var5 * 256 + class80.field1542.method38(5, var5);
            class25.field563 = arg4;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class67() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1258[var1] = this.field1266;
        }
    }
}
