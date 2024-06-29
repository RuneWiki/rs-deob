import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class108 extends class268 {

    @OriginalMember(owner = "client!al", name = "y", descriptor = "[I")
    private int[] field1488 = new int[this.field3945];

    @OriginalMember(owner = "client!al", name = "w", descriptor = "Lmga;")
    public static class739 field1486 = new class739(76, 6);

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    private int field1482;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "Laj;")
    public static class333 field1492;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "[B")
    private byte[] field1487;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public final void method816(int arg0) {
        ++field1483;
        if (arg0 != 1029024876) {
            method821(-3);
        }
        this.field1482 = Math.abs(this.field1482);
        if (this.field1482 >= 4096) {
            this.field1482 = 4095;
        }
        this.method86(this.field1490++, (byte) 103, (byte) (this.field1482 >> 4));
        this.field1482 = 0;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)V")
    public final void method817(int arg0) {
        if (arg0 != 29373) {
            this.method817(3);
        }
        this.field1490 = 0;
        ++field1484;
        this.field1482 = 0;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIIF)V")
    public class108(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field3945; ++var7) {
            this.field1488[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
    public static void method818(boolean arg0) {
        field1486 = null;
        if (arg0) {
            field1486 = null;
        }
        field1492 = null;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)Z")
    public static final boolean method819(byte arg0) {
        ++field1480;
        if (arg0 != -14) {
            return false;
        } else {
            class143 var1 = (class143) class359.field5249.method2551((byte) -108);
            if (var1 == null) {
                return false;
            } else {
                for (int var2 = 0; ~var2 > ~var1.field2063; ++var2) {
                    if (var1.field2058[var2] != null && var1.field2058[var2].field8321 == 0) {
                        return false;
                    }
                    if (var1.field2061[var2] != null && var1.field2061[var2].field8321 == 0) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IBB)V")
    public void method86(int arg0, byte arg1, byte arg2) {
        int var4 = -121 / ((-75 - arg1) / 40);
        this.field1487[this.field1490++] = (byte) (127 + (class440.method2643(arg2, 255) >> 1));
        ++field1491;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V")
    public final void method820(int arg0, int arg1, int arg2) {
        ++field1481;
        if (arg0 != 0) {
            this.field1488 = null;
        }
        this.field1482 += this.field1488[arg2] * arg1 >> 12;
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V")
    public static final void method821(int arg0) {
        ++field1489;
        if (arg0 != 16175) {
            field1492 = null;
        }
        class155.method1133(2, class712.field9959.field1296.method4127(69) == 1, (byte) 0, 22050);
        class558.field7520 = class549.method3114(16036, class706.field9894, 0, class730.field10124, 22050);
        class706.method3961(class466.method2754((class751) null, -125), 57, true);
        class268.field3953 = class549.method3114(16036, class706.field9894, 1, class730.field10124, 2048);
        class686.field9647 = new class67();
        class268.field3953.method1263(class686.field9647, (byte) 112);
        class533.field7260 = new class388(22050, class386.field5629);
        class237.method1532(arg0 + -16175);
    }
}
