import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class96 extends class297 {

    @OriginalMember(owner = "client!wl", name = "O", descriptor = "I")
    private int field1544 = -1;

    @OriginalMember(owner = "client!wl", name = "R", descriptor = "Luc;")
    public static class202 field1546 = new class202();

    @OriginalMember(owner = "client!wl", name = "V", descriptor = "I")
    public static int field1550 = 0;

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!wl", name = "J", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!wl", name = "K", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!wl", name = "L", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!wl", name = "M", descriptor = "I")
    public int field1542;

    @OriginalMember(owner = "client!wl", name = "Q", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!wl", name = "S", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!wl", name = "T", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!wl", name = "U", descriptor = "I")
    public int field1549;

    @OriginalMember(owner = "client!wl", name = "N", descriptor = "[I")
    public int[] field1543;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lpf;B)I", line = 5)
    public static final int method778(class92 arg0, byte arg1) {
        field1540++;
        int var2 = -29 % ((arg1 - 79) / 32);
        int var3 = arg0.field1477;
        class66 var4 = arg0.method2062((byte) -115);
        if (arg0.field4614 == var4.field1006) {
            var3 = arg0.field1499;
        } else if (arg0.field4614 == var4.field1004 || arg0.field4614 == var4.field977 || arg0.field4614 == var4.field996 || arg0.field4614 == var4.field975) {
            var3 = arg0.field1495;
        } else if (arg0.field4614 == var4.field991 || arg0.field4614 == var4.field964 || arg0.field4614 == var4.field999 || arg0.field4614 == var4.field972) {
            var3 = arg0.field1510;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILaj;)V", line = 34)
    public final void method169(int arg0, int arg1, class1 arg2) {
        field1545++;
        if (arg0 == 0) {
            this.field1544 = arg2.method56(19612);
        }
        if (arg1 != 255) {
            method782(-83);
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V", line = 47)
    public final void method779(int arg0) {
        super.method779(arg0);
        this.field1543 = null;
        field1541++;
    }

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "(I)Z", line = 61)
    public final boolean method780(int arg0) {
        field1538++;
        if (this.field1543 != null) {
            return true;
        } else if (arg0 != -9757) {
            return false;
        } else if (this.field1544 >= 0) {
            class317 var2 = class38.field586 >= 0 ? class82.method641(this.field1544, true, class38.field586, class314.field4951) : class65.method519(class314.field4951, (byte) 113, this.field1544);
            var2.method2241();
            this.field1549 = var2.field1412;
            this.field1542 = var2.field1413;
            this.field1543 = var2.field4988;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V", line = 85)
    public class96() {
        super(0, false);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIILwd;ILtk;)V", line = 90)
    public static final void method781(int arg0, int arg1, int arg2, int arg3, class88 arg4, int arg5, class266 arg6) {
        field1539++;
        if (arg4 == null) {
            return;
        }
        int var7 = (int) class171.field2747 + class150.field2455 & 0x7FF;
        int var8 = Math.max(arg6.field3941 / arg0, arg6.field3939 / 2) + 10;
        int var9 = arg1 * arg1 + arg3 * arg3;
        if (var8 * var8 < var9) {
            return;
        }
        int var10 = class40.field612[var7];
        int var11 = var10 * 256 / (class10.field242 + 256);
        int var12 = class40.field619[var7];
        int var13 = var12 * 256 / (class10.field242 + 256);
        int var14 = arg1 * var11 + arg3 * var13 >> 16;
        int var15 = arg1 * var13 - arg3 * var11 >> 16;
        if (class162.field2623) {
            ((class196) arg4).method1390(var14 + arg6.field3941 / 2 + arg5 - arg4.field1422 / 2, arg6.field3939 / 2 + arg2 + -var15 + -(arg4.field1421 / 2), (class196) arg6.method1851(false, 0));
        } else {
            ((class317) arg4).method2245(arg6.field3941 / 2 + arg5 - (-var14 - -(arg4.field1422 / 2)), arg2 - var15 + arg6.field3939 / 2 + -(arg4.field1421 / 2), arg6.field4107, arg6.field4106);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)[[I", line = 135)
    public int[][] method172(int arg0, byte arg1) {
        field1547++;
        if (arg1 != 63) {
            method778((class92) null, (byte) 95);
        }
        int[][] var3 = this.field4767.method1141(-1677, arg0);
        if (this.field4767.field2480 && this.method780(arg1 ^ 0xFFFFD9DC)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = this.field1549 * (class164.field2670 == this.field1542 ? arg0 : this.field1542 * arg0 / class164.field2670);
            if (class31.field491 == this.field1549) {
                for (int var11 = 0; var11 < class31.field491; var11++) {
                    int var12 = this.field1543[var7++];
                    var5[var11] = class164.method1234(var12 << 4, 4080);
                    var6[var11] = class164.method1234(65280, var12) >> 4;
                    var4[var11] = class164.method1234(4080, var12 >> 12);
                }
            } else {
                for (int var8 = 0; var8 < class31.field491; var8++) {
                    int var9 = this.field1549 * var8 / class31.field491;
                    int var10 = this.field1543[var7 + var9];
                    var5[var8] = class164.method1234(var10, 255) << 4;
                    var6[var8] = class164.method1234(4080, var10 >> 4);
                    var4[var8] = class164.method1234(16711680, var10) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "(I)V", line = 206)
    public static void method782(int arg0) {
        if (arg0 <= 62) {
            field1550 = 97;
        }
        field1546 = null;
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)I", line = 219)
    public final int method783(int arg0) {
        if (arg0 <= 11) {
            return 48;
        } else {
            field1548++;
            return this.field1544;
        }
    }
}
