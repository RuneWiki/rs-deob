import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class386 extends class666 {

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    private int field5157 = 1024;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    private int field5160 = 3072;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    private int field5164 = 2048;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "Z")
    public static boolean field5154 = false;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field5165 = -60;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field5161 = 0;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "J")
    public static long field5163 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "Lpr;")
    public static class407 field5162 = new class407(15, 12);

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "[[I")
    public static int[][] field5168 = new int[128][128];

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "Ljo;")
    public static class303 field5156;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILep;I)V", line = 10)
    public static final void method2114(int arg0, int arg1, class382 arg2, int arg3) {
        ++field5155;
        if (class477.field6938) {
            class450 var4 = ~class109.field1269 == 0 ? null : class80.field854.method687(false, class109.field1269);
            if (client.method1530(arg2).method1500((byte) 124) && (32 & class406.field5414) != 0 && (var4 == null || arg2.method2101(arg1 + -122, class109.field1269, var4.field6198) != var4.field6198)) {
                class459.method2618(false, 500, arg2.field5110, class182.field2231 + " -> " + arg2.field5007, arg2.field5073, true, arg2.field5055, 0L, class419.field5567, 20, class122.field1376);
                ++class92.field1044;
            }
        }
        for (int var5 = 9; ~var5 <= -6; --var5) {
            String var9 = class397.method2178(var5, arg2, arg1 + 1);
            if (var9 != null) {
                ++class113.field1314;
                class459.method2618(false, 500, arg2.field5110, arg2.field5007, arg2.field5073, true, arg2.field5055, (long) (var5 + 1), var9, 1002, class534.method3039(-1, var5, arg2));
            }
        }
        String var6 = class236.method1370(arg1, arg2);
        if (var6 != null) {
            class459.method2618(false, 500, arg2.field5110, arg2.field5007, arg2.field5073, true, arg2.field5055, 0L, var6, 50, arg2.field4974);
            ++class326.field4244;
        }
        int var7 = 4;
        if (arg1 != -1) {
            method2115(80);
        }
        while (~var7 <= -1) {
            String var8 = class397.method2178(var7, arg2, 0);
            if (var8 != null) {
                class459.method2618(false, 500, arg2.field5110, arg2.field5007, arg2.field5073, true, arg2.field5055, (long) (var7 + 1), var8, 2, class534.method3039(-1, var7, arg2));
                ++class113.field1314;
            }
            --var7;
        }
        if (client.method1530(arg2).method1502((byte) 69)) {
            if (arg2.field5117 != null) {
                class459.method2618(false, 500, arg2.field5110, "", arg2.field5073, true, arg2.field5055, 0L, arg2.field5117, 19, -1);
            } else {
                class459.method2618(false, arg1 + 501, arg2.field5110, "", arg2.field5073, true, arg2.field5055, 0L, class221.field2681.method1296(class226.field2899, (byte) 89), 19, -1);
            }
            ++class217.field2621;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[I", line = 88)
    public final int[] method122(int arg0, int arg1) {
        if (arg0 >= -21) {
            method2115(76);
        }
        ++field5167;
        int[] var3 = super.field9466.method1811(arg1, 31);
        if (super.field9466.field4172) {
            int[] var4 = this.method3739(0, -121, arg1);
            for (int var5 = 0; ~var5 > ~class501.field7222; ++var5) {
                var3[var5] = this.field5157 - -(var4[var5] * this.field5164 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "(I)V", line = 122)
    public static void method2115(int arg0) {
        field5156 = null;
        field5168 = null;
        if (arg0 != 0) {
            method2114(39, -113, (class382) null, -91);
        }
        field5162 = null;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 190)
    public class386() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/lang/Object;IB)[B", line = 141)
    public static final byte[] method2116(int arg0, Object arg1, int arg2, byte arg3) {
        ++field5159;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return class279.method1591(var4, arg2, -125, arg0);
        } else if (arg1 instanceof class40) {
            class40 var5 = (class40) arg1;
            return var5.method207(-125, arg2, arg0);
        } else {
            int var6 = -4 / ((arg3 - 28) / 35);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)[[I", line = 197)
    public final int[][] method1251(int arg0, byte arg1) {
        ++field5153;
        if (arg1 != 98) {
            method2114(57, -52, (class382) null, -75);
        }
        int[][] var3 = super.field9471.method3639(arg1 + -77, arg0);
        if (super.field9471.field9180) {
            int[][] var4 = this.method3737(arg0, 0, 3);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class501.field7222 < ~var11; ++var11) {
                var8[var11] = this.field5157 - -(var5[var11] * this.field5164 >> 12);
                var9[var11] = (var6[var11] * this.field5164 >> 12) + this.field5157;
                var10[var11] = this.field5157 - -(var7[var11] * this.field5164 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILiaa;Z)V", line = 243)
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        ++field5158;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field9465 = ~arg1.method2541(51) == -2;
                }
            } else {
                this.field5160 = arg1.method2574(-1758460248);
            }
        } else {
            this.field5157 = arg1.method2574(-1758460248);
        }
        if (!arg2) {
            field5161 = -110;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 286)
    public final void method118(int arg0) {
        this.field5164 = -this.field5157 + this.field5160;
        ++field5166;
        if (arg0 != -9) {
            field5168 = null;
        }
    }
}
