import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class612 extends class751 {

    @OriginalMember(owner = "client!eba", name = "E", descriptor = "I")
    private int field8641 = 409;

    @OriginalMember(owner = "client!eba", name = "D", descriptor = "I")
    private int field8640 = 4;

    @OriginalMember(owner = "client!eba", name = "C", descriptor = "I")
    private int field8639 = 1024;

    @OriginalMember(owner = "client!eba", name = "G", descriptor = "I")
    private int field8643 = 8;

    @OriginalMember(owner = "client!eba", name = "M", descriptor = "I")
    private int field8649 = 81;

    @OriginalMember(owner = "client!eba", name = "K", descriptor = "I")
    private int field8647 = 1024;

    @OriginalMember(owner = "client!eba", name = "L", descriptor = "I")
    private int field8648 = 204;

    @OriginalMember(owner = "client!eba", name = "S", descriptor = "I")
    private int field8654 = 0;

    @OriginalMember(owner = "client!eba", name = "B", descriptor = "I")
    public static int field8638 = 2;

    @OriginalMember(owner = "client!eba", name = "A", descriptor = "I")
    private int field8637;

    @OriginalMember(owner = "client!eba", name = "H", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!eba", name = "J", descriptor = "I")
    public static int field8646;

    @OriginalMember(owner = "client!eba", name = "N", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!eba", name = "P", descriptor = "I")
    private int field8651;

    @OriginalMember(owner = "client!eba", name = "R", descriptor = "I")
    public static int field8653;

    @OriginalMember(owner = "client!eba", name = "T", descriptor = "I")
    private int field8655;

    @OriginalMember(owner = "client!eba", name = "I", descriptor = "[I")
    private int[] field8645;

    @OriginalMember(owner = "client!eba", name = "F", descriptor = "[[I")
    private int[][] field8642;

    @OriginalMember(owner = "client!eba", name = "Q", descriptor = "[[I")
    private int[][] field8652;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILrv;I)V", line = 6)
    public final void method309(int arg0, class120 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (~arg2 == -8) {
                                        this.field8647 = arg1.method898((byte) -97);
                                    }
                                } else {
                                    this.field8649 = arg1.method898((byte) -127);
                                }
                            } else {
                                this.field8654 = arg1.method898((byte) -98);
                            }
                        } else {
                            this.field8639 = arg1.method898((byte) -111);
                        }
                    } else {
                        this.field8648 = arg1.method898((byte) -110);
                    }
                } else {
                    this.field8641 = arg1.method898((byte) -104);
                }
            } else {
                this.field8643 = arg1.method842(2384);
            }
        } else {
            this.field8640 = arg1.method842(2384);
        }
        ++field8646;
        int var5 = -123 % ((arg0 - 25) / 63);
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "()V", line = 95)
    public class612() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "(I)V", line = 114)
    private final void method3524(int arg0) {
        ++field8650;
        Random var2 = new Random((long) this.field8643);
        this.field8651 = this.field8649 / 2;
        this.field8655 = 4096 / this.field8643;
        this.field8637 = 4096 / this.field8640;
        int var3 = this.field8637 / 2;
        this.field8642 = new int[this.field8643][this.field8640 + 1];
        int var4 = this.field8655 / 2;
        this.field8652 = new int[this.field8643][this.field8640];
        this.field8645 = new int[this.field8643 + 1];
        this.field8645[0] = 0;
        if (arg0 >= 79) {
            for (int var5 = 0; var5 < this.field8643; ++var5) {
                if (var5 > 0) {
                    int var6 = this.field8655;
                    int var7 = (class425.method2530(-65, 4096, var2) - 2048) * this.field8648 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field8645[var5] = this.field8645[var5 - 1] + var8;
                }
                this.field8642[var5][0] = 0;
                for (int var9 = 0; var9 < this.field8640; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field8637;
                        int var11 = (class425.method2530(57, 4096, var2) - 2048) * this.field8641 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field8642[var5][var9] = this.field8642[var5][var9 - 1] + var12;
                    }
                    this.field8652[var5][var9] = ~this.field8647 < -1 ? -class425.method2530(-105, this.field8647, var2) + 4096 : 4096;
                }
                this.field8642[var5][this.field8640] = 4096;
            }
            this.field8645[this.field8643] = 4096;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "()V", line = 181)
    public static final void method3525() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class468.field6693.length; ++var1) {
                if (!class468.field6693[var1].method2668()) {
                    synchronized (class468.field6693[var1]) {
                        class468.field6693[var1].notify();
                    }
                    var0 = false;
                } else {
                    class88.field1146[var1] = class468.field6693[var1].method2670();
                }
            }
            if (var0) {
                class468.field6693[class468.field6693.length - 1].method2664();
                class115.method816(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class468.field6693.length - 1; ++var4) {
                        if (!class468.field6693[var4].method2668()) {
                            synchronized (class468.field6693[var4]) {
                                class468.field6693[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class468.field6693.length - 2; ++var6) {
                            class468.field6693[var6].method2664();
                        }
                        class115.method816(2);
                        while (!class468.field6693[0].method2668()) {
                            synchronized (class468.field6693[0]) {
                                class468.field6693[0].notify();
                            }
                            try {
                                class117.method820(false, 1L);
                            } catch (Exception var9) {
                            }
                        }
                        class468.field6693[0].method2664();
                        return;
                    }
                    try {
                        class117.method820(false, 1L);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class117.method820(false, 1L);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V", line = 284)
    public final void method1454(byte arg0) {
        this.method3524(123);
        ++field8644;
        if (arg0 < 123) {
            this.method3524(-59);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(II)[I", line = 300)
    public final int[] method365(int arg0, int arg1) {
        if (arg1 != 4095) {
            return null;
        } else {
            ++field8653;
            int[] var3 = super.field10405.method3601(true, arg0);
            if (super.field10405.field8923) {
                int var4 = 0;
                int var5;
                for (var5 = class619.field8728[arg0] + this.field8654; ~var5 > -1; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (~this.field8643 < ~var4 && var5 >= this.field8645[var4]) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = ~(var4 & 1) == -1;
                int var8 = this.field8645[var4];
                int var9 = this.field8645[var4 + -1];
                if (~(this.field8651 + var9) > ~var5 && ~var5 > ~(-this.field8651 + var8)) {
                    for (int var10 = 0; var10 < class673.field9452; ++var10) {
                        int var11 = 0;
                        int var12 = !var7 ? -this.field8639 : this.field8639;
                        int var13;
                        for (var13 = (this.field8637 * var12 >> 12) + class179.field2708[var10]; var13 < 0; var13 += 4096) {
                        }
                        while (~var13 < -4097) {
                            var13 -= 4096;
                        }
                        while (~this.field8640 < ~var11 && ~this.field8642[var6][var11] >= ~var13) {
                            ++var11;
                        }
                        int var14 = var11 + -1;
                        int var15 = this.field8642[var6][var14];
                        int var16 = this.field8642[var6][var11];
                        if (~var13 < ~(this.field8651 + var15) && -this.field8651 + var16 > var13) {
                            var3[var10] = this.field8652[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class42.method293(var3, 0, class673.field9452, 0);
                }
            }
            return var3;
        }
    }
}
