import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class17 extends class193 {

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field180 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "[[S")
    public static short[][] field183 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "Lud;")
    public class17 field176;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "Lud;")
    public class17 field178;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "[I")
    public static int[] field185;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V", line = 9)
    public static void method96(int arg0) {
        field185 = null;
        field183 = (short[][]) null;
        field180 = null;
        if (arg0 != 2859) {
            field183 = (short[][]) ((short[][]) null);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIZI[[I)I", line = 32)
    public static final int method97(int arg0, int arg1, int arg2, boolean arg3, int arg4, int[][] arg5) {
        if (!arg3) {
            method100((class222) null, -102);
        }
        int var6 = (128 - arg1) * arg5[arg4][arg2] + (arg5[arg4 + 1][arg2] * arg1) >> 7;
        int var7 = (128 - arg1) * arg5[arg4][arg2 + 1] + arg5[arg4 + 1][arg2 + 1] * arg1 >> 7;
        field175++;
        return (128 - arg0) * var6 + arg0 * var7 >> 7;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V", line = 51)
    public final void method98(int arg0) {
        field182++;
        if (this.field176 == null) {
            return;
        }
        this.field176.field178 = this.field178;
        if (arg0 != 412) {
            field183 = (short[][]) ((short[][]) null);
        }
        this.field178.field176 = this.field176;
        this.field176 = null;
        this.field178 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([BI)Z", line = 70)
    public static final boolean method99(byte[] arg0, int arg1) {
        class153 var2 = new class153(arg0);
        field177++;
        int var3 = var2.method1082(-77);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1082(-69) == 1;
        if (var4) {
            class65.method418(var2, true);
        }
        class226.method1611(false, var2);
        if (arg1 != 1259039367) {
            method96(-69);
        }
        return true;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lum;I)Z", line = 98)
    public static final boolean method100(class222 arg0, int arg1) {
        int var2 = 0 / ((arg1 + 36) / 57);
        field179++;
        return arg0.method1598(class68.field1060, -1);
    }
}
