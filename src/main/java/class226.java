import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class226 extends class260 {

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
    private int field3982 = 0;

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "I")
    private int field3988 = 1;

    @OriginalMember(owner = "client!gj", name = "ab", descriptor = "I")
    private int field3992 = 0;

    @OriginalMember(owner = "client!gj", name = "Y", descriptor = "Loh;")
    public static class263 field3990 = class253.method1681(-122, "null");

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!gj", name = "Z", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "Lnb;")
    public static class201 field3984;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "[I")
    public static int[] field3981;

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "[[S")
    public static short[][] field3989;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V")
    public static void method1535(int arg0) {
        if (arg0 == -7322) {
            field3984 = null;
            field3981 = null;
            field3989 = null;
            field3990 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)I")
    public static final int method1536(int arg0, byte arg1) {
        ++field3979;
        if (arg1 < 30) {
            return 50;
        } else {
            return arg0 == 16711935 ? -1 : class35.method222(arg0, true);
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
    public class226() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        ++field3985;
        int[] var3 = super.field4511.method304(arg0, false);
        if (arg1 != 255) {
            this.method88(22);
        }
        if (super.field4511.field1029) {
            int var4 = class275.field4825[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; ~class49.field1052 < ~var6; ++var6) {
                int var7 = class70.field1409[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field3992 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field3988 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field3988;
                }
                int var12 = var11 - (var11 & -4096);
                if (this.field3982 == 0) {
                    var12 = class1.field13[(var12 & 4084) >> 4] + 4096 >> 1;
                } else if (this.field3982 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(II)V")
    public static final void method1537(int arg0, int arg1) {
        ++field3991;
        class105.field1984.method829(arg1, (byte) 104);
        if (arg0 != 0) {
            field3989 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V")
    public final void method88(int arg0) {
        ++field3987;
        if (arg0 <= 81) {
            method1536(41, (byte) -27);
        }
        class217.method1481((byte) 100);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        ++field3986;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field3988 = arg2.method1301(-8317);
                }
            } else {
                this.field3982 = arg2.method1301(arg1 ^ -13882);
            }
        } else {
            this.field3992 = arg2.method1301(-8317);
        }
        if (arg1 != 5701) {
            field3990 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lue;I)V")
    public static final void method1538(class86 arg0, int arg1) {
        if (arg1 == -23658) {
            class20.field465 = arg0;
            ++field3980;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIII)V")
    public static final void method1539(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3983;
        int var5 = 0;
        class191.method1255(-arg1 + arg4, arg3, arg1 + arg4, 60, class38.field870[arg2]);
        if (arg0 < 112) {
            field3981 = null;
        }
        int var6 = arg1;
        int var7 = -arg1;
        int var8 = -1;
        while (~var5 > ~var6) {
            var8 += 2;
            ++var5;
            var7 += var8;
            if (var7 >= 0) {
                --var6;
                var7 -= var6 << 1;
                int[] var9 = class38.field870[-var6 + arg2];
                int[] var10 = class38.field870[arg2 + var6];
                int var11 = -var5 + arg4;
                int var12 = arg4 + var5;
                class191.method1255(var11, arg3, var12, 112, var10);
                class191.method1255(var11, arg3, var12, 124, var9);
            }
            int var13 = arg4 - -var6;
            int var14 = arg4 - var6;
            int[] var15 = class38.field870[arg2 + var5];
            int[] var16 = class38.field870[-var5 + arg2];
            class191.method1255(var14, arg3, var13, 124, var15);
            class191.method1255(var14, arg3, var13, 60, var16);
        }
    }
}
