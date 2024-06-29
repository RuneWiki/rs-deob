import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class126 extends class6 {

    @OriginalMember(owner = "client!qo", name = "F", descriptor = "[I")
    private int[] field1630 = new int[this.field55];

    @OriginalMember(owner = "client!qo", name = "E", descriptor = "[I")
    public static int[] field1629 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "Luc;")
    public static class58 field1618 = new class58(16);

    @OriginalMember(owner = "client!qo", name = "I", descriptor = "I")
    public static int field1632 = 0;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client!qo", name = "B", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!qo", name = "C", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!qo", name = "D", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!qo", name = "H", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "Llg;")
    public static class20 field1621;

    @OriginalMember(owner = "client!qo", name = "y", descriptor = "[B")
    private byte[] field1623;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V", line = 5)
    public final void method24(int arg0) {
        ++field1617;
        this.field1625 = Math.abs(this.field1625);
        if (arg0 != 25020) {
            field1627 = -10;
        }
        if (~this.field1625 <= -4097) {
            this.field1625 = 4095;
        }
        this.method679(this.field1622++, (byte) (this.field1625 >> 4));
        this.field1625 = 0;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IBI)V", line = 22)
    public final void method23(int arg0, byte arg1, int arg2) {
        this.field1625 += this.field1630[arg0] * arg2 >> 12;
        ++field1626;
        int var4 = 97 % ((1 - arg1) / 56);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IB)V", line = 36)
    public void method679(int arg0, byte arg1) {
        ++field1624;
        this.field1623[this.field1622++] = (byte) ((class262.method1461(arg1, 255) >> 1) + 127);
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V", line = 44)
    public final void method29(int arg0) {
        this.field1622 = arg0;
        ++field1628;
        this.field1625 = 0;
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)V", line = 53)
    public static void method680(int arg0) {
        if (arg0 != 0) {
            field1627 = -99;
        }
        field1618 = null;
        field1629 = null;
        field1621 = null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIZ)V", line = 65)
    public static final void method681(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field1632 = 28;
        }
        ++field1619;
        if (arg1 != 1009) {
            if (~arg1 != -1013) {
                if (arg1 == 1004) {
                    class277.method1522(12, arg0, arg2);
                    return;
                }
                if (~arg1 == -1009) {
                    class277.method1522(13, arg0, arg2);
                    return;
                }
                if (arg1 == 1005) {
                    class277.method1522(14, arg0, arg2);
                    return;
                }
            } else {
                class277.method1522(11, arg0, arg2);
            }
        } else {
            class277.method1522(10, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILlo;)V", line = 101)
    public static final void method682(int arg0, class419 arg1) {
        ++field1631;
        boolean var2 = false;
        if (class234.field3224 != arg1.field6037 && ~arg1.field6073 != 0 && arg1.field6036 == 0) {
            class208 var3 = class193.method1037(arg0 ^ 25, arg1.field6073);
            if (var3.field2803 || arg1.field6040 + 1 > var3.field2818[arg1.field6033]) {
                var2 = true;
            }
        } else {
            var2 = true;
        }
        if (var2) {
            int var4 = -arg1.field6029 + arg1.field6037;
            int var5 = -arg1.field6029 + class234.field3224;
            int var6 = arg1.field6020 * 128 - -(64 * arg1.method857((byte) -106));
            int var7 = arg1.field6089 * 128 + 64 * arg1.method857((byte) -106);
            int var8 = arg1.field6026 * 128 - -(64 * arg1.method857((byte) -106));
            int var9 = arg1.field6031 * 128 - -(arg1.method857((byte) -106) * 64);
            arg1.field154 = ((-var5 + var4) * var7 + var5 * var9) / var4;
            arg1.field152 = ((-var5 + var4) * var6 + var5 * var8) / var4;
        }
        arg1.field6112 = 0;
        if (arg1.field6076 == arg0) {
            arg1.method2600(0, 8192);
        }
        if (arg1.field6076 == 1) {
            arg1.method2600(0, 12288);
        }
        if (arg1.field6076 == 2) {
            arg1.method2600(0, 0);
        }
        if (~arg1.field6076 == -4) {
            arg1.method2600(arg0, 4096);
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IIIIIF)V", line = 155)
    public class126(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field55; ++var7) {
            this.field1630[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }
}
