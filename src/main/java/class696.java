import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class696 extends class11 {

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
    private int field9763;

    @OriginalMember(owner = "client!wo", name = "y", descriptor = "Leb;")
    public static class584 field9766 = new class584();

    @OriginalMember(owner = "client!wo", name = "B", descriptor = "I")
    public static int field9769 = 0;

    @OriginalMember(owner = "client!wo", name = "E", descriptor = "Z")
    public static volatile boolean field9772 = true;

    @OriginalMember(owner = "client!wo", name = "C", descriptor = "F")
    public static float field9770;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
    public static int field9762;

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
    public static int field9764;

    @OriginalMember(owner = "client!wo", name = "x", descriptor = "I")
    public static int field9765;

    @OriginalMember(owner = "client!wo", name = "A", descriptor = "I")
    public static int field9768;

    @OriginalMember(owner = "client!wo", name = "D", descriptor = "I")
    public static int field9771;

    @OriginalMember(owner = "client!wo", name = "F", descriptor = "I")
    public static int field9773;

    @OriginalMember(owner = "client!wo", name = "H", descriptor = "I")
    public static int field9775;

    @OriginalMember(owner = "client!wo", name = "G", descriptor = "Lbi;")
    public static class449 field9774;

    @OriginalMember(owner = "client!wo", name = "I", descriptor = "Ljava/lang/Thread;")
    public static Thread field9776;

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "[Ljq;")
    public class478[] field9767;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "[[B")
    private byte[][] field9761;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)V", line = 4)
    public static final void method3850(boolean arg0, int arg1) {
        if (arg1 < 84) {
            method3854((byte) -99);
        }
        field9768++;
        if (arg0) {
            if (class251.field3463 != -1) {
                class150.method1070(0, class251.field3463);
            }
            for (class140 var2 = (class140) class264.field3667.method2915(119); var2 != null; var2 = (class140) class264.field3667.method2912((byte) 124)) {
                if (!var2.method2798(-1)) {
                    var2 = (class140) class264.field3667.method2915(105);
                    if (var2 == null) {
                        break;
                    }
                }
                class345.method2074(1, var2, false, true);
            }
            class251.field3463 = -1;
            class264.field3667 = new class520(8);
            class104.method798((byte) 105);
            class251.field3463 = class10.field202;
            class476.method2670((byte) -82, false);
            class449.method2540((byte) -45);
            class544.method3015(class251.field3463);
        }
        class280.field3984 = true;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(Z)Z", line = 47)
    public final boolean method3851(boolean arg0) {
        field9765++;
        if (this.field9767 != null) {
            return true;
        }
        if (this.field9761 == null) {
            if (!class522.field6971.method2548(-11693, this.field9763)) {
                return false;
            }
            int[] var2 = class522.field6971.method2534(this.field9763, 13758);
            this.field9761 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field9761[var3] = class522.field6971.method2537(false, this.field9763, var2[var3]);
            }
        }
        boolean var4 = arg0;
        for (int var5 = 0; var5 < this.field9761.length; var5++) {
            byte[] var15 = this.field9761[var5];
            class335 var16 = new class335(var15);
            var16.field4619 = 1;
            int var17 = var16.method2001((byte) -83);
            var4 &= class268.field3739.method2549(var17, 3015);
        }
        if (!var4) {
            return false;
        }
        class593 var6 = new class593();
        int var7 = class522.field6971.method2527(0, this.field9763);
        this.field9767 = new class478[var7];
        int[] var8 = class522.field6971.method2534(this.field9763, 13758);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field9761[var9];
            class335 var11 = new class335(var10);
            var11.field4619 = 1;
            int var12 = var11.method2001((byte) -83);
            class247 var13 = null;
            for (class247 var14 = (class247) var6.method3257(-75); var14 != null; var14 = (class247) var6.method3263((byte) -101)) {
                if (var14.field3437 == var12) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == null) {
                var13 = new class247(var12, class268.field3739.method2531(var12, 0));
                var6.method3265(var13, (byte) -120);
            }
            this.field9767[var8[var9]] = new class478(var10, var13);
        }
        this.field9761 = null;
        return true;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lbj;)V", line = 147)
    public static final void method3852(class225 arg0) {
        if (class697.field9777 >= 65535) {
            return;
        }
        class65 var1 = arg0.field3173;
        class350.field4791[class697.field9777] = arg0;
        class583.field7742[class697.field9777] = false;
        class697.field9777++;
        int var2 = arg0.field3170;
        if (arg0.field3186) {
            var2 = 0;
        }
        int var3 = arg0.field3170;
        if (arg0.field3187) {
            var3 = class13.field218 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method518((byte) 45) + class16.field256 - var1.method522(95) >> class348.field4782;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method518((byte) 116) + var1.method522(-83) - class16.field256 >> class348.field4782;
            if (var7 >= class227.field3196) {
                var7 = class227.field3196 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field3169[var5++];
                int var10 = (var1.method515((byte) 102) + class16.field256 - var1.method522(97) >> class348.field4782) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class657.field8966) {
                    var11 = class657.field8966 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class510.field6812[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class510.field6812[var4][var12][var8] = var13 | (long) class697.field9777;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class510.field6812[var4][var12][var8] = var13 | (long) class697.field9777 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class510.field6812[var4][var12][var8] = var13 | (long) class697.field9777 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class510.field6812[var4][var12][var8] = var13 | (long) class697.field9777 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)Z", line = 242)
    public final boolean method3853(int arg0, byte arg1) {
        if (arg1 == 19) {
            field9764++;
            return this.field9767[arg0].field6377;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)V", line = 253)
    public static void method3854(byte arg0) {
        field9766 = null;
        field9776 = null;
        if (arg0 == 42) {
            field9774 = null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)Z", line = 265)
    public final boolean method3855(int arg0, int arg1) {
        if (arg0 == 1) {
            field9773++;
            return this.field9767[arg1].field6369;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(ZI)Z", line = 276)
    public final boolean method3856(boolean arg0, int arg1) {
        if (arg0) {
            return false;
        } else {
            field9762++;
            return this.field9767[arg1].field6373;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BLjava/lang/String;)V", line = 299)
    public static final void method3857(byte arg0, String arg1) {
        field9771++;
        if (arg1.equals("")) {
            return;
        }
        if (arg0 > -73) {
            field9772 = false;
        }
        class10.field201++;
        class402 var2 = class390.method2252(class457.field6206, -115, class262.field3644);
        var2.field5354.method1980(-345277664, class580.method3186(110, arg1));
        var2.field5354.method2019(-99, arg1);
        class36.method278(0, var2);
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(I)V", line = 327)
    public class696(int arg0) {
        this.field9763 = arg0;
    }
}
