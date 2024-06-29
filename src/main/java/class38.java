import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class38 extends class196 {

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    private int field580 = 1;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    private int field578 = 0;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    private int field583 = 0;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "Lqh;")
    public static class189 field584 = new class189(100);

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
    public static int field586 = 0;

    @OriginalMember(owner = "client!r", name = "kb", descriptor = "I")
    public static int field598 = 50;

    @OriginalMember(owner = "client!r", name = "jb", descriptor = "[I")
    public static int[] field597 = new int[field598];

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "[I")
    public static int[] field593 = new int[field598];

    @OriginalMember(owner = "client!r", name = "lb", descriptor = "[I")
    public static int[] field599 = new int[field598];

    @OriginalMember(owner = "client!r", name = "hb", descriptor = "[I")
    public static int[] field595 = new int[field598];

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
    public static int field594 = -1;

    @OriginalMember(owner = "client!r", name = "ib", descriptor = "[S")
    public static short[] field596 = new short[256];

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "[I")
    public static int[] field588 = new int[field598];

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "[Ldf;")
    public static class51[] field590 = new class51[field598];

    @OriginalMember(owner = "client!r", name = "db", descriptor = "[I")
    public static int[] field591 = new int[field598];

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "[I")
    public static int[] field587 = new int[field598];

    @OriginalMember(owner = "client!r", name = "eb", descriptor = "Ldf;")
    public static class51 field592 = class46.method233("Hierhin gehen", 100);

    @OriginalMember(owner = "client!r", name = "R", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "Lg;")
    public static class254 field589;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
    public final void method73(byte arg0) {
        int var2 = 31 % ((43 - arg0) / 41);
        class124.method930((byte) -117);
        ++field585;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 3) {
                    this.field580 = arg1.method897(arg2 ^ 38);
                }
            } else {
                this.field578 = arg1.method897(arg2 + -172);
            }
        } else {
            this.field583 = arg1.method897(120);
        }
        ++field579;
        if (arg2 != 82) {
            this.method44(99, (class121) null, (byte) -36);
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field582;
        if (arg1 != 10565) {
            this.method73((byte) -127);
        }
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            int var4 = class161.field2639[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class49.field767 > var6; ++var6) {
                int var7 = class211.field3510[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field583 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field580 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field580;
                }
                int var12 = var11 - (-4096 & var11);
                if (this.field578 == 0) {
                    var12 = class115.field1952[255 & var12 >> 4] + 4096 >> 1;
                } else if (this.field578 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BJ)V")
    public static final void method190(byte arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        if (arg0 <= 122) {
            method191((byte) 67);
        }
        ++field581;
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(B)V")
    public static void method191(byte arg0) {
        field589 = null;
        field591 = null;
        field597 = null;
        field587 = null;
        field584 = null;
        field599 = null;
        field593 = null;
        field592 = null;
        field596 = null;
        field588 = null;
        if (arg0 > -12) {
            field591 = null;
        }
        field595 = null;
        field590 = null;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class38() {
        super(0, true);
    }
}
