import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class75 extends class68 {

    @OriginalMember(owner = "client!ib", name = "Bb", descriptor = "[I")
    public static int[] field1629 = new int[100];

    @OriginalMember(owner = "client!ib", name = "Fb", descriptor = "[I")
    public static int[] field1633 = new int[5];

    @OriginalMember(owner = "client!ib", name = "Ib", descriptor = "Ljava/util/Random;")
    public static Random field1636 = new Random();

    @OriginalMember(owner = "client!ib", name = "Cb", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!ib", name = "Db", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!ib", name = "Eb", descriptor = "I")
    private int field1632;

    @OriginalMember(owner = "client!ib", name = "Gb", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!ib", name = "Hb", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ib", name = "Jb", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!ib", name = "Kb", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!ib", name = "Lb", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!ib", name = "Mb", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!ib", name = "Nb", descriptor = "Lwe;")
    private class203 field1641;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "(I)V")
    public static void method653(int arg0) {
        field1636 = null;
        if (arg0 != -12262) {
            method660(14, 34, 77);
        }
        field1633 = null;
        field1629 = null;
    }

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "(II)I")
    public final int method654(int arg0, int arg1) {
        ++field1635;
        if (arg1 != 8) {
            field1636 = null;
        }
        return arg0 * 8 + -this.field1632;
    }

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "(II)I")
    public final int method655(int arg0, int arg1) {
        int var3 = 8 - (this.field1632 & 7);
        ++field1631;
        int var4 = this.field1632 >> 3;
        this.field1632 += arg0;
        int var5 = 0;
        if (arg1 != 720) {
            return 50;
        } else {
            while (var3 < arg0) {
                var5 += (super.field1495[var4++] & class16.field327[var3]) << -var3 + arg0;
                arg0 -= var3;
                var3 = 8;
            }
            int var6;
            if (arg0 != var3) {
                var6 = (super.field1495[var4] >> -arg0 + var3 & class16.field327[arg0]) + var5;
            } else {
                var6 = (class16.field327[var3] & super.field1495[var4]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I)V")
    public class75(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "(I)I")
    public final int method656(int arg0) {
        ++field1638;
        if (arg0 >= -40) {
            this.method659((int[]) null, 46);
        }
        return 255 & super.field1495[super.field1454++] + -this.field1641.method1330(31);
    }

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "(II)V")
    public final void method657(int arg0, int arg1) {
        ++field1637;
        if (arg0 != 28182) {
            this.method658(-104);
        }
        super.field1495[super.field1454++] = (byte) (this.field1641.method1330(arg0 + -28098) + arg1);
    }

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "(I)V")
    public final void method658(int arg0) {
        ++field1634;
        this.field1632 = super.field1454 * 8;
        if (arg0 != -9462) {
            this.method658(-29);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([II)V")
    public final void method659(int[] arg0, int arg1) {
        ++field1639;
        this.field1641 = new class203(arg0);
        if (arg1 != 20748) {
            method653(2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)V")
    public static final void method660(int arg0, int arg1, int arg2) {
        ++field1640;
        if (class95.field1958 == 2) {
            class12.method90(class37.field727 * 2, 105, (-class127.field2536 + class166.field3217 << 7) + class195.field3792, (-class34.field649 + class97.field2054 << 7) + class53.field1034);
            if (class158.field3068 > -1 && ~(class18.field362 % 20) > -11) {
                class137.field2683[0].method439(arg0 - -class158.field3068 + -12, arg2 - (-class179.field3432 + 28));
            }
            if (arg1 != 0) {
                method660(29, -105, 99);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(Z)V")
    public final void method661(boolean arg0) {
        if (!arg0) {
            super.field1454 = (this.field1632 + 7) / 8;
            ++field1630;
        }
    }
}
