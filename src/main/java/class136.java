import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class136 extends class377 {

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    private int field1649 = 0;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    private int field1650 = 20;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    private int field1658 = 1365;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    private int field1653 = 0;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field1659 = new String[200];

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "Z")
    public static boolean field1660 = false;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "Ljava/lang/String;")
    public static String field1664 = null;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "Lpfa;")
    public static class275 field1656;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "Lpfa;")
    public static class275 field1662;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "Lxa;")
    public static class468 field1651;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "[I")
    public static int[] field1654;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILji;)V", line = 4)
    public final void method27(int arg0, int arg1, class572 arg2) {
        ++field1657;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 == -4) {
                        this.field1653 = arg2.method3031(-1);
                    }
                } else {
                    this.field1649 = arg2.method3031(-1);
                }
            } else {
                this.field1650 = arg2.method3031(-1);
            }
        } else {
            this.field1658 = arg2.method3031(-1);
        }
        int var5 = 112 % ((13 - arg1) / 55);
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 175)
    public class136() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)V", line = 65)
    public static void method871(int arg0) {
        field1656 = null;
        field1654 = null;
        field1662 = null;
        field1659 = null;
        if (arg0 != 2) {
            method871(7);
        }
        field1651 = null;
        field1664 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lrr;III)V", line = 82)
    public static final void method872(class337 arg0, int arg1, int arg2, int arg3) {
        ++field1663;
        if (arg0 != null) {
            if (arg0.field4156 != null) {
                class402 var4 = new class402();
                var4.field5153 = arg0.field4156;
                var4.field5154 = arg0;
                class620.method3450(var4);
            }
            class37.field542 = true;
            class530.field6684 = arg0.field4287;
            class194.field2290 = arg0.field4252;
            class458.field5709 = arg2;
            class112.field1383 = arg0.field4310;
            class168.field1978 = arg0.field4172;
            class696.field9644 = arg3;
            if (arg1 != 0) {
                field1651 = null;
            }
            class7.field74 = arg0.field4213;
            class99.method721((byte) 107, arg0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I", line = 118)
    public final int[] method88(int arg0, int arg1) {
        int var3 = -89 % ((arg1 - 5) / 53);
        ++field1661;
        int[] var4 = super.field4842.method2772(arg0, (byte) -120);
        if (super.field4842.field6354) {
            for (int var5 = 0; var5 < class528.field6661; ++var5) {
                int var6 = (field1654[var5] << 12) / this.field1658 + this.field1649;
                int var7 = (class596.field8003[arg0] << 12) / this.field1658 + this.field1653;
                int var8 = var6;
                int var9 = var7;
                int var10 = var6;
                int var11 = var7;
                int var12 = var6 * var6 >> 12;
                int var13 = var7 * var7 >> 12;
                int var14 = 0;
                while (var12 + var13 < 16384 && this.field1650 > var14) {
                    var11 = (var10 * var11 >> 12) * 2 + var9;
                    var10 = -var13 + var12 + var8;
                    var12 = var10 * var10 >> 12;
                    ++var14;
                    var13 = var11 * var11 >> 12;
                }
                var4[var5] = ~(this.field1650 + -1) >= ~var14 ? 0 : (var14 << 12) / this.field1650;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIII)I", line = 200)
    public static final int method873(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1655;
        int var5 = 15 & arg3;
        int var6 = -127 % ((arg0 - -1) / 60);
        int var7 = ~var5 <= -9 ? arg4 : arg1;
        int var8 = ~var5 <= -5 ? (var5 != 12 && var5 != 14 ? arg2 : arg1) : arg4;
        return (~(var5 & 1) != -1 ? -var7 : var7) - -(~(var5 & 2) != -1 ? -var8 : var8);
    }
}
