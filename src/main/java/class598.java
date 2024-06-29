import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class598 {

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "Leda;")
    private class14 field8468 = new class14(64);

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "Leda;")
    public class14 field8478 = new class14(50);

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "Leda;")
    public class14 field8479 = new class14(5);

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "Lcr;")
    public class292 field8475;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "Lla;")
    public class422 field8470;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "Lla;")
    private class422 field8474;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Z")
    public boolean field8466;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "Lcb;")
    public static class631 field8465 = new class631(4, 7);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field8461;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field8463;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field8467;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field8471;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field8476;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field8477;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    public int field8480;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public final void method3429(byte arg0) {
        class14 var2 = this.field8468;
        synchronized (this.field8468) {
            this.field8468.method76(-96);
        }
        field8476++;
        class14 var3 = this.field8478;
        synchronized (this.field8478) {
            this.field8478.method76(-110);
        }
        class14 var4 = this.field8479;
        synchronized (this.field8479) {
            if (arg0 != 13) {
                this.field8479 = null;
            }
            this.field8479.method76(29);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public final void method3430(int arg0) {
        field8463++;
        class14 var2 = this.field8478;
        synchronized (this.field8478) {
            if (arg0 != 7) {
                return;
            }
            this.field8478.method76(94);
        }
        class14 var3 = this.field8479;
        synchronized (this.field8479) {
            this.field8479.method76(30);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
    public static void method3431(boolean arg0) {
        field8465 = null;
        if (arg0) {
            field8465 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)I")
    public static final int method3432(int arg0, int arg1, int arg2) {
        field8477++;
        if (arg0 == 1 || arg0 == 3) {
            return class35.field334[arg1 & 0x3];
        } else if (arg2 == 3) {
            return class453.field6596[arg1 & 0x3];
        } else {
            return -127;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZB)V")
    public final void method3433(boolean arg0, byte arg1) {
        field8472++;
        if (arg0 == this.field8466) {
            return;
        }
        this.field8466 = arg0;
        this.method3429((byte) 13);
        if (arg1 < 88) {
            this.field8478 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)Lmaa;")
    public final class504 method3434(byte arg0, int arg1) {
        field8462++;
        class14 var3 = this.field8468;
        class504 var4;
        synchronized (this.field8468) {
            var4 = (class504) this.field8468.method80((byte) -20, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var5 = this.field8474;
        byte[] var6;
        synchronized (this.field8474) {
            if (arg0 != -115) {
                field8465 = null;
            }
            var6 = this.field8474.method2624(0, class458.method2802(-1791676761, arg1), class583.method3363(false, arg1));
        }
        class504 var7 = new class504();
        var7.field7343 = this;
        var7.field7297 = arg1;
        if (var6 != null) {
            var7.method3045(64, new class301(var6));
        }
        var7.method3047(114);
        class14 var8 = this.field8468;
        synchronized (this.field8468) {
            this.field8468.method67((long) arg1, var7, -6772);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V")
    public final void method3435(byte arg0) {
        field8464++;
        class14 var2 = this.field8468;
        synchronized (this.field8468) {
            this.field8468.method71((byte) 44);
            if (arg0 != -37) {
                this.method3440(-8, -37);
            }
        }
        class14 var3 = this.field8478;
        synchronized (this.field8478) {
            this.field8478.method71((byte) 44);
        }
        class14 var4 = this.field8479;
        synchronized (this.field8479) {
            this.field8479.method71((byte) 44);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIBII)V")
    public static final void method3436(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field8473++;
        if (arg2 != -123) {
            field8465 = null;
        }
        for (int var5 = 0; var5 < class429.field6280; var5++) {
            Rectangle var6 = class466.field6792[var5];
            if (var6.x + var6.width > arg0 && var6.x < (arg0 + arg3) && arg4 < var6.y + var6.height && (arg1 + arg4) > var6.y) {
                class6.field66[var5] = true;
            }
        }
        class438.method2696(arg4, arg4 + arg1, arg0 - -arg3, (byte) 117, arg0);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)V")
    public final void method3437(int arg0, byte arg1) {
        class14 var3 = this.field8468;
        synchronized (this.field8468) {
            if (arg1 != 18) {
                this.field8480 = -83;
            }
            this.field8468.method68(-16878, arg0);
        }
        field8467++;
        class14 var4 = this.field8478;
        synchronized (this.field8478) {
            this.field8478.method68(-16878, arg0);
        }
        class14 var5 = this.field8479;
        synchronized (this.field8479) {
            this.field8479.method68(-16878, arg0);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILre;ILiba;BLha;)Z")
    public static final boolean method3438(int arg0, class277 arg1, int arg2, class302 arg3, byte arg4, class544 arg5) {
        field8471++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg1.field4209 != null) {
            var7 = (class729.field10225 - class729.field10240) * (arg1.field4246 + arg3.field4604 - class729.field10227) / (class729.field10233 - class729.field10227) + class729.field10240;
            var9 = class729.field10219 - ((arg1.field4214 + arg3.field4605 - class729.field10237) * (class729.field10219 - class729.field10222) / (class729.field10230 - class729.field10237));
            var8 = class729.field10219 - ((arg1.field4208 + arg3.field4605 - class729.field10237) * (class729.field10219 - class729.field10222) / (class729.field10230 - class729.field10237));
            var6 = (arg1.field4213 + arg3.field4604 - class729.field10227) * (class729.field10225 - class729.field10240) / (class729.field10233 - class729.field10227) + class729.field10240;
        }
        class34 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg1.field4237 != -1) {
            if (arg3.field4602 && arg1.field4230 != -1) {
                var10 = arg1.method1811(true, arg5, 124);
            } else {
                var10 = arg1.method1811(false, arg5, 122);
            }
            if (var10 != null) {
                var11 = arg3.field4600 - (var10.method177() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg3.field4600 + (var10.method177() + 1 >> 1);
                var13 = arg3.field4603 - (var10.method184() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg3.field4603 + (var10.method184() + 1 >> 1);
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class746 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg1.field4225 != null) {
            var15 = class656.method3693(arg4 + 96, arg1.field4211);
            if (var15 != null) {
                var16 = class570.field8090.method511(null, -7205, null, arg1.field4225, class226.field3627);
                int var24 = arg3.field4603 - ((class729.field10219 - class729.field10222) * arg1.field4231 / (class729.field10230 - class729.field10237));
                var17 = (class729.field10225 - class729.field10240) * arg1.field4253 / (class729.field10233 - class729.field10227) + arg3.field4600;
                if (var10 == null) {
                    var18 = var24 - var16 * var15.method4175() / 2;
                } else {
                    var18 = var24 - ((var10.method184() >> 1) + var16 * var15.method4172());
                }
                for (int var25 = 0; var25 < var16; var25++) {
                    String var26 = class226.field3627[var25];
                    if (var16 - 1 > var25) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method4171(var26);
                    if (var19 < var27) {
                        var19 = var27;
                    }
                }
                var20 = var17 - (var19 / 2 - arg0);
                if (var20 < var6) {
                    var6 = var20;
                }
                var21 = var19 / 2 + var17 + arg0;
                var22 = arg2 + var18;
                if (var7 < var21) {
                    var7 = var21;
                }
                var23 = arg2 + var16 * var15.method4172() + var18;
                if (var8 > var22) {
                    var8 = var22;
                }
                if (var23 > var9) {
                    var9 = var23;
                }
            }
        }
        if (var7 < class729.field10240 || var6 > class729.field10225 || class729.field10222 > var9 || class729.field10219 < var8) {
            return true;
        }
        class729.method4029(arg5, arg3, arg1);
        if (var10 != null) {
            if (class167.field2913 > 0 && (class214.field3547 != -1 && class214.field3547 == arg3.field4601 || class173.field2953 != -1 && class173.field2953 == arg1.field4220)) {
                int var28;
                if (class511.field7416 <= 50) {
                    var28 = class511.field7416 * 2;
                } else {
                    var28 = (100 - class511.field7416) * 2;
                }
                int var29 = var28 << 24 | 0xFFFF00;
                arg5.method3180(arg3.field4600, (byte) 77, var10.method175() / 2 + 7, var29, arg3.field4603);
                arg5.method3180(arg3.field4600, (byte) 77, var10.method175() / 2 + 5, var29, arg3.field4603);
                arg5.method3180(arg3.field4600, (byte) 77, var10.method175() / 2 + 3, var29, arg3.field4603);
                arg5.method3180(arg3.field4600, (byte) 77, var10.method175() / 2 + 1, var29, arg3.field4603);
                arg5.method3180(arg3.field4600, (byte) 77, var10.method175() / 2, var29, arg3.field4603);
            }
            var10.method182(arg3.field4600 - (var10.method177() >> 1), arg3.field4603 + -(var10.method184() >> 1));
        }
        if (arg1.field4225 != null && var15 != null) {
            class639.method3613(arg5, var18, var17, arg4 ^ 0x5A, var19, arg3, var16, arg1, var15);
        }
        if (arg1.field4237 != -1 || arg1.field4225 != null) {
            class141 var30 = new class141(arg3);
            var30.field2203 = var12;
            var30.field2208 = var21;
            var30.field2206 = var20;
            var30.field2204 = var23;
            var30.field2202 = var22;
            var30.field2207 = var11;
            var30.field2209 = var13;
            var30.field2205 = var14;
            class508.field7390.method3472(arg4 + 214, var30);
        }
        if (arg4 != -95) {
            field8465 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public static final void method3439(int arg0) {
        field8469++;
        class624.field8743 = false;
        class353.method2259((byte) -84);
        if (arg0 != Integer.MIN_VALUE) {
            method3431(true);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
    public final void method3440(int arg0, int arg1) {
        field8461++;
        this.field8480 = arg1;
        if (arg0 <= 124) {
            this.field8466 = false;
        }
        class14 var3 = this.field8478;
        synchronized (this.field8478) {
            this.field8478.method76(76);
        }
        class14 var4 = this.field8479;
        synchronized (this.field8479) {
            this.field8479.method76(7);
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lcr;IZLla;Lla;)V")
    public class598(class292 arg0, int arg1, boolean arg2, class422 arg3, class422 arg4) {
        this.field8475 = arg0;
        this.field8470 = arg4;
        this.field8474 = arg3;
        this.field8466 = arg2;
        if (this.field8474 != null) {
            int var6 = this.field8474.method2628(-107) - 1;
            this.field8474.method2615(0, var6);
        }
    }
}
