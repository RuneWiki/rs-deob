import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class220 extends class377 {

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    private int field2551 = 10;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    private int field2556 = 0;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    private int field2559 = 2048;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "Lcga;")
    public static class449 field2561 = new class449(8, 7);

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "[I")
    private int[] field2553;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "[I")
    private int[] field2558;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V", line = 6)
    private final void method1260(int arg0) {
        ++field2557;
        int var2 = 0;
        this.field2553 = new int[this.field2551 + 1];
        this.field2558 = new int[this.field2551 + 1];
        int var3 = 4096 / this.field2551;
        int var4 = this.field2559 * var3 >> 12;
        if (arg0 != 2048) {
            this.field2553 = null;
        }
        for (int var5 = 0; var5 < this.field2551; ++var5) {
            this.field2558[var5] = var2;
            this.field2553[var5] = var2 + var4;
            var2 += var3;
        }
        this.field2558[this.field2551] = 4096;
        this.field2553[this.field2551] = this.field2553[0] + 4096;
    }

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "(I)V", line = 39)
    public static void method1261(int arg0) {
        field2561 = null;
        if (arg0 != -16233) {
            field2561 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIZ)I", line = 51)
    public static final int method1262(int arg0, int arg1, boolean arg2) {
        ++field2560;
        if (arg2) {
            return 0;
        } else {
            class36 var3 = class354.method2029(arg0, Integer.MIN_VALUE, arg2);
            if (var3 == null) {
                return class131.field1587.method706(arg0, arg1 ^ 23243).field9875;
            } else {
                int var4 = 0;
                for (int var5 = 0; var5 < var3.field541.length; ++var5) {
                    if (var3.field541[var5] == -1) {
                        ++var4;
                    }
                }
                int var6 = var4 + (class131.field1587.method706(arg0, 19147).field9875 - var3.field541.length);
                if (arg1 != 4096) {
                    field2561 = null;
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V", line = 87)
    public final void method91(byte arg0) {
        this.method1260(2048);
        if (arg0 <= 52) {
            this.field2551 = -93;
        }
        ++field2555;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 100)
    public class220() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILji;)V", line = 107)
    public final void method27(int arg0, int arg1, class572 arg2) {
        int var4 = -103 % ((13 - arg1) / 55);
        ++field2554;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field2556 = arg2.method3097((byte) 12);
                }
            } else {
                this.field2559 = arg2.method3031(-1);
            }
        } else {
            this.field2551 = arg2.method3097((byte) 12);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[I", line = 154)
    public final int[] method88(int arg0, int arg1) {
        ++field2552;
        int[] var3 = super.field4842.method2772(arg0, (byte) -111);
        if (super.field4842.field6354) {
            int var4 = class596.field8003[arg0];
            if (this.field2556 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field2551; ++var6) {
                    if (this.field2558[var6] <= var4 && this.field2558[var6 + 1] > var4) {
                        if (var4 < this.field2553[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class70.method558(var3, 0, class528.field6661, var5);
            } else {
                for (int var7 = 0; ~class528.field6661 < ~var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class136.field1654[var7];
                    int var11 = this.field2556;
                    if (var11 != 1) {
                        if (var11 != 2) {
                            if (var11 == 3) {
                                var8 = 2048 - -(-var4 + var10 >> 1);
                            }
                        } else {
                            var8 = (-4096 - (-var4 - var10) >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~var12 > ~this.field2551; ++var12) {
                        if (~this.field2558[var12] >= ~var8 && var8 < this.field2558[var12 + 1]) {
                            if (var8 < this.field2553[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        int var13 = -105 / ((arg1 - 5) / 53);
        return var3;
    }
}
