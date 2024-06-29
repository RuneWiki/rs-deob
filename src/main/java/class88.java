import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class88 {

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public int field1524;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "[B")
    public byte[] field1516;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "[S")
    public short[] field1523;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "[Loa;")
    public class99[] field1529;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "[S")
    public short[] field1517;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "[I")
    public int[] field1525;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field1519 = 0;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lbj;")
    public static class155 field1515;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "[Lde;")
    public static class109[] field1528;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)Z")
    public final boolean method600(boolean arg0, int arg1) {
        field1530++;
        if (!arg0) {
            this.method603(true, 72);
        }
        return (this.field1516[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Z")
    public final boolean method601(int arg0, int arg1) {
        field1527++;
        if (arg1 != 0) {
            this.method603(true, 94);
        }
        return (this.field1516[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method602(int arg0) {
        field1528 = null;
        if (arg0 == 27201) {
            field1515 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(ZI)I")
    public final int method603(boolean arg0, int arg1) {
        field1518++;
        if (arg0) {
            field1519 = -106;
        }
        return this.field1516[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
    public static final void method604(boolean arg0) {
        if (!arg0) {
            field1515 = null;
        }
        class189.field3336.method1812(-100);
        field1522++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIBII)V")
    public static final void method605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field1521++;
        int var9 = -84 % ((arg6 - 66) / 56);
        int var10 = arg5 - arg1;
        int var11 = arg0 - arg3;
        int var12 = (arg8 - arg4 << 16) / var11;
        int var13 = (arg7 - arg2 << 16) / var10;
        class7.method60(var13, arg5, arg0, arg1, arg4, 0, arg2, 0, arg3, 5000, var12);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/util/Random;IZ)I")
    public static final int method606(Random arg0, int arg1, boolean arg2) {
        field1526++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class151.method1007(-104, arg1)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            if (arg2) {
                field1528 = null;
            }
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class238.method1556(-1, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(I)V")
    public class88(int arg0) {
        this.field1524 = arg0;
        this.field1516 = new byte[this.field1524];
        this.field1523 = new short[this.field1524];
        this.field1529 = new class99[this.field1524];
        this.field1517 = new short[this.field1524];
        this.field1525 = new int[this.field1524];
    }
}
