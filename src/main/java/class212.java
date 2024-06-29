import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class212 extends class70 {

    @OriginalMember(owner = "client!kf", name = "Qb", descriptor = "Lwl;")
    public static class81 field3611 = new class81(64);

    @OriginalMember(owner = "client!kf", name = "Vb", descriptor = "Lve;")
    public static class255 field3616 = class87.method607(59, "M");

    @OriginalMember(owner = "client!kf", name = "Wb", descriptor = "[I")
    public static int[] field3617 = new int[4096];

    @OriginalMember(owner = "client!kf", name = "Xb", descriptor = "Z")
    public static boolean field3618 = false;

    @OriginalMember(owner = "client!kf", name = "Yb", descriptor = "Lve;")
    public static class255 field3619 = class87.method607(123, "Okay");

    @OriginalMember(owner = "client!kf", name = "Zb", descriptor = "F")
    public static float field3620;

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!kf", name = "Lb", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!kf", name = "Nb", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!kf", name = "Ob", descriptor = "I")
    private int field3609;

    @OriginalMember(owner = "client!kf", name = "Pb", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!kf", name = "Rb", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!kf", name = "Sb", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!kf", name = "Tb", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!kf", name = "Ub", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!kf", name = "ac", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!kf", name = "Mb", descriptor = "Lg;")
    private class150 field3607;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(BI)I", line = 9)
    public final int method1513(byte arg0, int arg1) {
        field3615++;
        int var3 = this.field3609 >> 3;
        int var4 = 8 - (this.field3609 & 0x7);
        this.field3609 += arg1;
        int var5 = 0;
        if (arg0 != 45) {
            this.method1517(true);
        }
        while (var4 < arg1) {
            var5 += (this.field1066[var3++] & class315.field5344[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (class315.field5344[var4] & this.field1066[var3]) + var5;
        } else {
            var6 = (this.field1066[var3] >> var4 - arg1 & class315.field5344[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(Z)V", line = 40)
    public final void method1514(boolean arg0) {
        field3613++;
        if (!arg0) {
            this.field3609 = 7;
        }
        this.field1068 = (this.field3609 + 7) / 8;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I)V", line = 52)
    public class212(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "(I)V", line = 58)
    public final void method1515(int arg0) {
        this.field3609 = this.field1068 * 8;
        field3612++;
        if (arg0 != 7) {
            this.method1518(true, 42);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II[BI)V", line = 69)
    public final void method1516(int arg0, int arg1, byte[] arg2, int arg3) {
        field3621++;
        int var5 = 102 % ((-arg3 - 49) / 35);
        for (int var6 = 0; var6 < arg1; var6++) {
            arg2[arg0 + var6] = (byte) (this.field1066[this.field1068++] - this.field3607.method1111(true));
        }
    }

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(Z)I", line = 89)
    public final int method1517(boolean arg0) {
        field3610++;
        if (arg0) {
            this.method1515(125);
        }
        return this.field1066[this.field1068++] - this.field3607.method1111(true) & 0xFF;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(ZI)I", line = 102)
    public final int method1518(boolean arg0, int arg1) {
        if (arg0) {
            field3614++;
            return arg1 * 8 - this.field3609;
        } else {
            return 53;
        }
    }

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "(B)V", line = 120)
    public static void method1519(byte arg0) {
        field3611 = null;
        if (arg0 != 0) {
            method1519((byte) -76);
        }
        field3619 = null;
        field3616 = null;
        field3617 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z[I)V", line = 137)
    public final void method1520(boolean arg0, int[] arg1) {
        this.field3607 = new class150(arg1);
        field3606++;
        if (!arg0) {
            field3611 = (class81) null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)Lfc;", line = 156)
    public static final class213 method1521(int arg0, int arg1, int arg2) {
        class249 var3 = class118.field1984[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class213 var4 = var3.field4183;
            var3.field4183 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/util/Random;IB)I", line = 171)
    public static final int method1522(Random arg0, int arg1, byte arg2) {
        field3605++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class116.method881(arg1, (byte) -69)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            if (arg2 < 104) {
                method1522((Random) null, 86, (byte) 14);
            }
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var4 >= var3);
            return class75.method536(1627291839, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "(II)V", line = 203)
    public final void method1523(int arg0, int arg1) {
        this.field1066[this.field1068++] = (byte) (this.field3607.method1111(true) + arg1);
        field3608++;
        if (arg0 != 22260) {
            field3619 = (class255) null;
        }
    }
}
