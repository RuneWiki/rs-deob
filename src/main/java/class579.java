import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class579 implements class643 {

    @OriginalMember(owner = "client!vaa", name = "g", descriptor = "Llk;")
    private class638 field8133 = new class638(128);

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "[I")
    private int[] field8127 = new int[class206.field2895.field4268];

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "[I")
    public int[] field8128 = new int[class206.field2895.field4268];

    @OriginalMember(owner = "client!vaa", name = "i", descriptor = "Lqk;")
    public static class1 field8135 = new class1(81, -1);

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!vaa", name = "h", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!vaa", name = "j", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!vaa", name = "k", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!vaa", name = "l", descriptor = "I")
    public static int field8138;

    @OriginalMember(owner = "client!vaa", name = "m", descriptor = "I")
    public static int field8139;

    @OriginalMember(owner = "client!vaa", name = "n", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "Loo;")
    public static class12 field8132;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(III)V")
    public final void method3389(int arg0, int arg1, int arg2) {
        this.field8127[arg0] = arg2;
        field8139++;
        class664 var4 = (class664) this.field8133.method3669(false, (long) arg0);
        if (var4 == null) {
            class664 var5 = new class664(4611686018427387905L);
            this.field8133.method3666((byte) 65, (long) arg0, var5);
        } else if (var4.field9333 != 4611686018427387905L) {
            var4.field9333 = class683.method3903((byte) 4) + 500L | 0x4000000000000000L;
        }
        int var6 = -32 / ((45 - arg1) / 57);
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(III)V")
    public final void method3390(int arg0, int arg1, int arg2) {
        field8138++;
        this.field8128[arg1] = arg0;
        class664 var4 = (class664) this.field8133.method3669(false, (long) arg1);
        if (arg2 != -17823) {
            field8135 = null;
        }
        if (var4 == null) {
            class664 var5 = new class664(class683.method3903((byte) 4) + 500L);
            this.field8133.method3666((byte) 65, (long) arg1, var5);
        } else {
            var4.field9333 = class683.method3903((byte) 4) + 500L;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BII)V")
    public final void method3391(byte arg0, int arg1, int arg2) {
        field8129++;
        class320 var4 = class650.field9089.method1967((byte) -77, arg2);
        if (arg0 <= 49) {
            this.method3393((byte) 26);
        }
        int var5 = var4.field4529;
        int var6 = var4.field4532;
        int var7 = var4.field4531;
        int var8 = class585.field8267[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method3389(var5, -103, this.field8127[var5] & ~var9 | arg1 << var6 & var9);
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(II)I")
    public final int method3392(int arg0, int arg1) {
        if (arg1 < 64) {
            return -87;
        } else {
            field8136++;
            return this.field8128[arg0];
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)V")
    public final void method3393(byte arg0) {
        int var2 = 0;
        if (arg0 != 86) {
            return;
        }
        while (class206.field2895.field4268 > var2) {
            class502 var3 = class206.field2895.method1925(var2, (byte) -23);
            if (var3 != null && var3.field6863 == 0) {
                this.field8127[var2] = 0;
                this.field8128[var2] = 0;
            }
            var2++;
        }
        field8140++;
        this.field8133 = new class638(128);
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(B)V")
    public static void method3394(byte arg0) {
        field8135 = null;
        if (arg0 <= 79) {
            method3394((byte) -79);
        }
        field8132 = null;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIZ)V")
    public final void method3395(int arg0, int arg1, boolean arg2) {
        field8137++;
        class320 var4 = class650.field9089.method1967((byte) -77, arg1);
        if (!arg2) {
            this.method3389(-37, -33, -113);
        }
        int var5 = var4.field4529;
        int var6 = var4.field4532;
        int var7 = var4.field4531;
        int var8 = class585.field8267[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method3390(~var9 & this.field8128[var5] | var9 & arg0 << var6, var5, -17823);
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIB)V")
    public static final void method3396(int arg0, int arg1, byte arg2) {
        if (arg2 != -114) {
            return;
        }
        field8130++;
        if (class389.field5550 == class327.field4603) {
            if (!class461.method2775(-2, false, 0, 1, -2, arg1, 0, 1, arg0)) {
                class461.method2775(-2, false, 0, 1, -3, arg1, 0, 1, arg0);
            }
        } else if (!class461.method2775(arg2 + 112, false, 0, 1, -3, arg1, 0, 1, arg0)) {
            class461.method2775(-2, false, 0, 1, -2, arg1, 0, 1, arg0);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BZ)I")
    public final int method3397(byte arg0, boolean arg1) {
        field8131++;
        long var3 = class683.method3903((byte) 4);
        if (arg0 != 54) {
            field8132 = null;
        }
        for (class664 var5 = arg1 ? (class664) this.field8133.method3668(-111) : (class664) this.field8133.method3667((byte) 103); var5 != null; var5 = (class664) this.field8133.method3667((byte) -122)) {
            if (var3 > (var5.field9333 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field9333 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field762;
                    this.field8128[var6] = this.field8127[var6];
                    var5.method527(-11229);
                    return var6;
                }
                var5.method527(arg0 ^ 0xFFFFD415);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)I")
    public final int method3398(int arg0, int arg1) {
        field8134++;
        class320 var3 = class650.field9089.method1967((byte) -77, arg0);
        if (arg1 != 0) {
            return -6;
        }
        int var4 = var3.field4529;
        int var5 = var3.field4532;
        int var6 = var3.field4531;
        int var7 = class585.field8267[var6 - var5];
        return this.field8128[var4] >> var5 & var7;
    }
}
