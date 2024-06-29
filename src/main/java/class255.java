import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class255 extends class135 {

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "F")
    private float field3685 = 0.0F;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "Lob;")
    private class354 field3684;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field3675 = 1;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "Leda;")
    public static class116 field3682 = new class116(85, 8);

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    public final void method385(int arg0) {
        super.field2179.method2953(1, 115);
        ++field3683;
        super.field2179.method2959(class55.field715, class55.field715, (byte) -97);
        super.field2179.method2914(69, 0, class171.field2763);
        super.field2179.method2937(8, class171.field2763, 0);
        int var2 = 52 / ((arg0 - -29) / 45);
        super.field2179.method151(1, 9414);
        super.field2179.method2924(13528, (class402) null);
        super.field2179.method2953(0, 126);
        super.field2179.method2937(8, class171.field2763, 0);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)V")
    public final void method376(boolean arg0, int arg1) {
        super.field2179.method2953(1, 109);
        ++field3679;
        super.field2179.method2959(class673.field9556, class345.field4866, (byte) 89);
        super.field2179.method143(true, class171.field2763, -94, false, 0);
        super.field2179.method2937(8, class51.field669, 0);
        super.field2179.method151(0, arg1 ^ -18245);
        if (arg1 != -25475) {
            this.method376(true, -86);
        }
        super.field2179.method2953(0, 117);
        super.field2179.method2936(-16777216, -123);
        super.field2179.method2937(8, class450.field6484, 0);
        this.method378(arg1 + 25475);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Laj;II)V")
    public final void method384(class402 arg0, int arg1, int arg2) {
        super.field2179.method2924(13528, arg0);
        if (arg1 != 0) {
            method1624(115);
        }
        ++field3686;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIJBLis;Lua;I)V")
    public static final void method1623(int arg0, int arg1, int arg2, int arg3, long arg4, byte arg5, class101 arg6, class591 arg7, int arg8) {
        ++field3676;
        int var10 = arg0 * arg0 + arg3 * arg3;
        if (arg4 >= (long) var10) {
            if (arg5 <= 55) {
                method1624(21);
            }
            int var11 = Math.min(arg6.field1604 / 2, arg6.field1651 / 2);
            if (var10 <= var11 * var11) {
                class323.method1932(arg0, arg2, arg6, class168.field2748[arg1], arg3, arg7, 15663, arg8);
            } else {
                var11 -= 10;
                int var12;
                if (~class40.field544 != -5) {
                    var12 = (int) class473.field6790 - -class419.field5957 & 16383;
                } else {
                    var12 = (int) class473.field6790 & 16383;
                }
                int var13 = class302.field4241[var12];
                int var14 = class302.field4242[var12];
                if (class40.field544 != 4) {
                    var14 = var14 * 256 / (class239.field3523 + 256);
                    var13 = var13 * 256 / (class239.field3523 + 256);
                }
                int var15 = arg0 * var14 + arg3 * var13 >> 14;
                int var16 = arg3 * var14 + -(arg0 * var13) >> 14;
                double var17 = Math.atan2((double) var15, (double) var16);
                int var19 = (int) ((double) var11 * Math.sin(var17));
                int var20 = (int) (Math.cos(var17) * (double) var11);
                class530.field7812[arg1].method1637((float) arg6.field1604 / 2.0F + (float) arg2 + (float) var19, (float) arg6.field1651 / 2.0F + (float) arg8 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)Z")
    public final boolean method379(int arg0) {
        ++field3680;
        return arg0 != -4931 ? true : this.field3684.method2141(-77);
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V")
    public final void method378(int arg0) {
        if (~super.field2179.method2907((byte) 67) == -1) {
            class14 var2 = super.field2179.method2957(-11263);
            super.field2179.method2953(1, 118);
            class14 var3 = super.field2179.method2946((byte) -124);
            var3.method163(var2);
            var3.method161(1.0F, 0.125F, 0.125F, true);
            var3.method182(0.0F, 0.0F, (byte) 111, this.field3685);
            super.field2179.method2949(class455.field6538, (byte) 63);
            super.field2179.method2953(0, 105);
        }
        if (arg0 != 0) {
            this.field3684 = null;
        }
        ++field3681;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
    public final void method377(int arg0, int arg1, int arg2) {
        ++field3677;
        super.field2179.method2953(1, arg2 ^ 112);
        if (~(128 & arg1) == -1) {
            if (~(1 & arg0) != -2) {
                if (this.field3684.field4957) {
                    super.field2179.method2924(13528, this.field3684.field4958);
                } else {
                    super.field2179.method2924(13528, this.field3684.field4961[0]);
                }
            } else if (!this.field3684.field4957) {
                int var4 = super.field2179.field7370 % 4000 * 16 / 4000;
                super.field2179.method2924(13528, this.field3684.field4961[var4]);
            } else {
                this.field3685 = (float) (super.field2179.field7370 % 4000) / 4000.0F;
                super.field2179.method2924(arg2 ^ 13528, this.field3684.field4958);
            }
        } else {
            super.field2179.method2924(arg2 + 13528, (class402) null);
        }
        super.field2179.method2953(arg2, 105);
    }

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "(I)V")
    public static void method1624(int arg0) {
        int var1 = -15 % ((-39 - arg0) / 38);
        field3682 = null;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lnh;Lob;)V")
    public class255(class495 arg0, class354 arg1) {
        super(arg0);
        this.field3684 = arg1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public static final void method1625(boolean arg0) {
        if (arg0) {
            method1624(46);
        }
        if (class406.field5827 != null) {
            class406.field5827.method252(!arg0);
        }
        ++field3678;
        if (class260.field3751 != null) {
            while (true) {
                try {
                    class260.field3751.join();
                    return;
                } catch (InterruptedException var1) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)V")
    public final void method375(int arg0, boolean arg1) {
        super.field2179.method2959(class55.field715, class345.field4866, (byte) 126);
        if (arg0 <= 14) {
            field3675 = -37;
        }
        ++field3687;
    }
}
