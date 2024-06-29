import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class447 extends class527 {

    @OriginalMember(owner = "client!rda", name = "T", descriptor = "I")
    public int field6109 = -1;

    @OriginalMember(owner = "client!rda", name = "N", descriptor = "Z")
    private boolean field6103 = false;

    @OriginalMember(owner = "client!rda", name = "db", descriptor = "I")
    public int field6119 = -1;

    @OriginalMember(owner = "client!rda", name = "Z", descriptor = "I")
    private int field6115 = 0;

    @OriginalMember(owner = "client!rda", name = "ab", descriptor = "I")
    public int field6116 = 0;

    @OriginalMember(owner = "client!rda", name = "fb", descriptor = "Lfha;")
    public static class522 field6121 = new class522();

    @OriginalMember(owner = "client!rda", name = "hb", descriptor = "Lwj;")
    public static class121 field6123 = new class121("game3", 2);

    @OriginalMember(owner = "client!rda", name = "K", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!rda", name = "L", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!rda", name = "O", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!rda", name = "P", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!rda", name = "Q", descriptor = "I")
    public int field6106;

    @OriginalMember(owner = "client!rda", name = "R", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!rda", name = "S", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!rda", name = "U", descriptor = "I")
    public int field6110;

    @OriginalMember(owner = "client!rda", name = "V", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!rda", name = "W", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!rda", name = "X", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!rda", name = "Y", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!rda", name = "bb", descriptor = "I")
    public int field6117;

    @OriginalMember(owner = "client!rda", name = "cb", descriptor = "I")
    public int field6118;

    @OriginalMember(owner = "client!rda", name = "eb", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!rda", name = "gb", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(ILha;)V")
    public final void method271(int arg0, class545 arg1) {
        int var3 = 18 % ((-15 - arg0) / 57);
        ++field6104;
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(ILha;)Lgp;")
    public final class551 method274(int arg0, class545 arg1) {
        if (arg0 != 0) {
            field6123 = null;
        }
        ++field6114;
        return null;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method273(class545 arg0, int arg1, int arg2, int arg3) {
        ++field6102;
        class723 var5 = arg0.method2087();
        var5.method848(super.field9490, super.field9502 + -10, super.field9489);
        class544 var6 = class487.field6572.method3054(this.field6118, (byte) -99);
        class283 var7 = var6.method3242(this.field6110, arg0, (class635) null, (class103) null, 131072, 0, arg3 ^ 32341, arg3, 0);
        if (var7 != null && (class286.field3774 ? var7.method1151(arg1, arg2, var5, true, var6.field7662, class527.field7375) : var7.method1155(arg1, arg2, var5, true, var6.field7662))) {
            return true;
        } else {
            if (~this.field6119 != 0) {
                class544 var8 = class487.field6572.method3054(this.field6119, (byte) -99);
                class283 var9 = var8.method3242(this.field6106, arg0, (class635) null, (class103) null, 131072, 0, -32342, -1, 0);
                if (var9 != null && (class286.field3774 ? var9.method1151(arg1, arg2, var5, true, var8.field7662, class527.field7375) : var9.method1155(arg1, arg2, var5, true, var8.field7662))) {
                    return true;
                }
            }
            if (~this.field6109 != 0) {
                class544 var10 = class487.field6572.method3054(this.field6109, (byte) -99);
                class283 var11 = var10.method3242(this.field6117, arg0, (class635) null, (class103) null, 131072, 0, -32342, -1, 0);
                if (var11 != null && (!class286.field3774 ? var11.method1155(arg1, arg2, var5, true, var10.field7662) : var11.method1151(arg1, arg2, var5, true, var10.field7662, class527.field7375))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IB)Lou;")
    public static final class160 method2662(int arg0, byte arg1) {
        ++field6105;
        class160 var2 = (class160) class617.field8782.method3200((long) arg0, arg1 ^ 20032);
        if (var2 != null) {
            return var2;
        } else if (arg1 != -79) {
            return null;
        } else {
            byte[] var3 = class435.field5962.method3322(0, arg0, (byte) 121);
            class160 var4 = new class160();
            if (var3 != null) {
                var4.method999(new class26(var3), -74);
            }
            var4.method1001(39);
            class617.field8782.method3199((byte) 78, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(B)Z")
    public final boolean method283(byte arg0) {
        ++field6108;
        if (arg0 >= -33) {
            field6121 = null;
        }
        return this.field6103;
    }

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "(I)I")
    public final int method376(int arg0) {
        ++field6107;
        if (arg0 != 0) {
            this.field6117 = -87;
        }
        class544 var2 = class487.field6572.method3054(this.field6118, (byte) -99);
        int var3 = var2.field7662;
        if (this.field6119 != -1) {
            class544 var4 = class487.field6572.method3054(this.field6119, (byte) -99);
            if (var3 < var4.field7662) {
                var3 = var4.field7662;
            }
        }
        if (this.field6109 != -1) {
            class544 var5 = class487.field6572.method3054(this.field6109, (byte) -99);
            if (~var3 > ~var5.field7662) {
                var3 = var5.field7662;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)V")
    public static void method2663(int arg0) {
        field6123 = null;
        if (arg0 != 0) {
            field6121 = null;
        }
        field6121 = null;
    }

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "(I)Z")
    public final boolean method277(int arg0) {
        ++field6120;
        if (arg0 != 3) {
            this.field6119 = 48;
        }
        return false;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)Z")
    public static final boolean method2664(int arg0, int arg1) {
        ++field6113;
        if (arg0 != 0) {
            return false;
        } else {
            return ~(-arg1 & arg1) == ~arg1;
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(Lha;I)Ljl;")
    public final class596 method278(class545 arg0, int arg1) {
        ++field6111;
        class590 var3 = class141.method926(super.field9501, super.field9490 >> class509.field7106, super.field9489 >> class509.field7106);
        if (var3 != null && var3.field8468.field10360) {
            int var4 = var3.field8468.method268(arg1 ^ -2275);
            if (this.field6116 != var4) {
                super.field9502 -= this.field6116;
                this.field6116 = var4;
                super.field9502 += var4;
            }
        }
        class723 var5 = arg0.method2087();
        var5.method860();
        if (var3 == null || !var3.field8468.field10360) {
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            class339 var9 = class52.field741[super.field9495];
            int var10 = this.field6115 << 1;
            int var12 = -var10 / 2;
            int var13 = -var10 / 2;
            int var14 = var9.method1960(super.field9490 + var12, super.field9489 + var13, 120);
            int var15 = var10 / 2;
            int var16 = -var10 / 2;
            int var17 = var9.method1960(super.field9490 - -var15, super.field9489 + var16, 123);
            int var18 = -var10 / 2;
            int var19 = var10 / 2;
            int var20 = var9.method1960(super.field9490 + var18, super.field9489 + var19, 120);
            int var21 = var10 / 2;
            int var22 = var10 / 2;
            int var23 = var9.method1960(super.field9490 + var21, super.field9489 + var22, arg1 + -2150);
            int var24 = ~var14 <= ~var17 ? var17 : var14;
            int var25 = ~var20 <= ~var23 ? var23 : var20;
            int var26 = var17 >= var23 ? var23 : var17;
            int var27 = ~var14 <= ~var20 ? var20 : var14;
            if (~var10 != -1) {
                int var28 = (int) (Math.atan2((double) (-var25 + var24), (double) var10) * 2607.5945876176133D) & 16383;
                if (var28 != 0) {
                    var5.method844(var28);
                }
            }
            int var29 = var14 - -var23;
            if (var10 != 0) {
                int var30 = (int) (2607.5945876176133D * Math.atan2((double) (-var26 + var27), (double) var10)) & 16383;
                if (var30 != 0) {
                    var5.method847(-var30);
                }
            }
            if (~var29 < ~(var17 + var20)) {
                var29 = var17 + var20;
            }
            int var31 = (var29 >> 1) + -super.field9502;
            if (var31 != 0) {
                var5.method851(0, var31, 0);
            }
        }
        var5.method851(super.field9490, super.field9502 + -10, super.field9489);
        class596 var32 = class589.method3502(3, true, 0);
        if (arg1 != 2274) {
            this.method274(113, (class545) null);
        }
        this.field6103 = false;
        this.field6115 = 0;
        if (this.field6109 != -1) {
            class283 var33 = class487.field6572.method3054(this.field6109, (byte) -99).method3242(this.field6117, arg0, (class635) null, (class103) null, 2048, 0, arg1 + -34616, -1, 0);
            if (var33 != null) {
                if (class286.field3774) {
                    var33.method1164(var5, var32.field8579[2], class527.field7375, 0);
                } else {
                    var33.method1168(var5, var32.field8579[2], 0);
                }
                this.field6103 |= var33.method1130();
                this.field6115 = var33.method1113();
            }
        }
        if (~this.field6119 != 0) {
            class283 var34 = class487.field6572.method3054(this.field6119, (byte) -99).method3242(this.field6106, arg0, (class635) null, (class103) null, 2048, 0, -32342, -1, 0);
            if (var34 != null) {
                if (class286.field3774) {
                    var34.method1164(var5, var32.field8579[1], class527.field7375, 0);
                } else {
                    var34.method1168(var5, var32.field8579[1], 0);
                }
                this.field6103 |= var34.method1130();
                if (~var34.method1113() < ~this.field6115) {
                    this.field6115 = var34.method1113();
                }
            }
        }
        class283 var35 = class487.field6572.method3054(this.field6118, (byte) -99).method3242(this.field6110, arg0, (class635) null, (class103) null, 2048, 0, -32342, -1, 0);
        if (var35 != null) {
            if (!class286.field3774) {
                var35.method1168(var5, var32.field8579[0], 0);
            } else {
                var35.method1164(var5, var32.field8579[0], class527.field7375, 0);
            }
            this.field6103 |= var35.method1130();
            if (var35.method1113() > this.field6115) {
                this.field6115 = var35.method1113();
            }
        }
        return var32;
    }

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "(I)I")
    public final int method282(int arg0) {
        ++field6101;
        return arg0 != -1 ? 72 : this.field6115;
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(IIIII)V")
    public class447(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIBIIII)Lcd;")
    public static final class22 method2665(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 106) {
            field6121 = null;
        }
        ++field6112;
        long var7 = (long) arg1 * 76724863L ^ (long) arg6 * 32147369L ^ (long) arg4 * 986053L ^ (long) arg3 * 67481L ^ (long) arg5 * 97549L ^ (long) arg0 * 475427L;
        class22 var9 = (class22) class514.field7178.method3200(var7, -19983);
        if (var9 != null) {
            return var9;
        } else {
            class22 var10 = class126.field1741.method2134(arg3, arg5, arg0, arg4, arg6, arg1);
            class514.field7178.method3199((byte) 78, var10, var7);
            return var10;
        }
    }

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "(I)I")
    public final int method268(int arg0) {
        if (arg0 != -1) {
            field6123 = null;
        }
        ++field6122;
        return -10;
    }
}
