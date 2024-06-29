import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class40 {

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "Lhn;")
    private class509 field427 = new class509(64);

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "Lhn;")
    public class509 field438 = new class509(50);

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "Ljd;")
    public class155 field439 = new class155(250);

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "Lcl;")
    private class176 field440 = new class176();

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Lfo;")
    private class361 field417;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "Lfv;")
    private class79 field441;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "Lfo;")
    public class361 field437;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "Z")
    private boolean field433;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field442;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field443;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "[Lwl;")
    public static class282[] field429 = new class282[50];

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "[B")
    public static byte[] field435 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZZ)V")
    public final void method224(boolean arg0, boolean arg1) {
        field422++;
        if (arg0 == this.field433) {
            return;
        }
        this.field433 = arg0;
        if (!arg1) {
            this.field417 = null;
        }
        this.method226(false);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lsv;Z[[B)V")
    public static final void method225(class472 arg0, boolean arg1, byte[][] arg2) {
        for (int var3 = 0; var3 < arg0.field601; var3++) {
            class466.method2847(false);
            for (int var4 = 0; var4 < (class308.field4128 >> 3); var4++) {
                for (int var5 = 0; var5 < class426.field6200 >> 3; var5++) {
                    int var6 = class495.field7230[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x3A1468E) >> 24;
                        if (!arg0.field598 || var7 == 0) {
                            int var8 = (var6 & 0x6) >> 1;
                            int var9 = (var6 & 0xFFD9E3) >> 14;
                            int var10 = (var6 & 0x3FFD) >> 3;
                            int var11 = (var9 / 8 << 8) + (var10 / 8);
                            for (int var12 = 0; var12 < class467.field6937.length; var12++) {
                                if (class467.field6937[var12] == var11 && arg2[var12] != null) {
                                    arg0.method2882((var9 & 0x7) * 8, (var10 & 0x7) * 8, (byte) 66, class96.field1223, var5 * 8, var3, class343.field4596, var4 * 8, var7, var8, arg2[var12]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1) {
            field429 = null;
        }
        field431++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
    public final void method226(boolean arg0) {
        field419++;
        class509 var2 = this.field427;
        synchronized (this.field427) {
            this.field427.method3045(48);
        }
        class509 var3 = this.field438;
        synchronized (this.field438) {
            this.field438.method3045(48);
        }
        class155 var4 = this.field439;
        synchronized (this.field439) {
            if (arg0) {
                this.method238(null, 28, 74, -115, 107, -23, null, 13);
            }
            this.field439.method920((byte) 14);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lza;Loe;IZIIIIILza;ZLla;)Lo;")
    public final class24 method227(class287 arg0, class136 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class287 arg9, boolean arg10, class316 arg11) {
        field420++;
        class24 var13 = this.method238(arg1, arg6, 0, arg7, arg2, arg5, arg0, arg4);
        if (var13 != null) {
            return var13;
        }
        class199 var14 = this.method236(-18315, arg2);
        if (arg5 > 1 && var14.field2640 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg5 >= var14.field2626[var16] && var14.field2626[var16] != 0) {
                    var15 = var14.field2640[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method236(-18315, var15);
            }
        }
        int[] var17 = var14.method1284(arg5, arg6, arg4, arg9, arg0, arg1, -111, arg10, arg11, arg7);
        if (arg8 != -10465) {
            this.field417 = null;
        }
        if (var17 == null) {
            return null;
        }
        class24 var18;
        if (arg3) {
            var18 = arg9.method1218(var17, 0, 36, 36, 32);
        } else {
            var18 = arg0.method1218(var17, 0, 36, 36, 32);
        }
        if (!arg3) {
            class176 var19 = new class176();
            var19.field2268 = arg5;
            var19.field2270 = arg6;
            var19.field2271 = arg1 != null;
            var19.field2266 = arg7;
            var19.field2267 = arg0.field3766;
            var19.field2263 = arg4;
            var19.field2265 = arg2;
            this.field439.method919(var19, (byte) 54, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIII)V")
    public static final void method228(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field423++;
        if (arg2 > -59) {
            field435 = null;
        }
        if (arg1 > arg0) {
            class476.method2907(arg1, 108, arg3, class5.field54[arg4], arg0);
        } else {
            class476.method2907(arg0, 35, arg3, class5.field54[arg4], arg1);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public final void method229(byte arg0) {
        field436++;
        class509 var2 = this.field427;
        synchronized (this.field427) {
            this.field427.method3034((byte) 73);
        }
        class509 var3 = this.field438;
        synchronized (this.field438) {
            this.field438.method3034((byte) 71);
        }
        class155 var4 = this.field439;
        synchronized (this.field439) {
            if (arg0 > 34) {
                this.field439.method925(2000);
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)V")
    public final void method230(int arg0, byte arg1) {
        class509 var3 = this.field427;
        synchronized (this.field427) {
            this.field427.method3036(arg0, (byte) -114);
        }
        if (arg1 != 117) {
            this.method234(46);
        }
        field421++;
        class509 var4 = this.field438;
        synchronized (this.field438) {
            this.field438.method3036(arg0, (byte) -60);
        }
        class155 var5 = this.field439;
        synchronized (this.field439) {
            this.field439.method927(arg0, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BI)V")
    public final void method231(byte arg0, int arg1) {
        field426++;
        this.field444 = arg1;
        class509 var3 = this.field438;
        synchronized (this.field438) {
            if (arg0 <= -50) {
                this.field438.method3045(48);
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public final void method232(int arg0) {
        class155 var2 = this.field439;
        synchronized (this.field439) {
            this.field439.method920((byte) 14);
            if (arg0 != 36) {
                this.field441 = null;
            }
        }
        field425++;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public static void method233(int arg0) {
        field429 = null;
        if (arg0 == -23086) {
            field435 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
    public final void method234(int arg0) {
        field428++;
        class509 var2 = this.field438;
        synchronized (this.field438) {
            int var3 = 55 % ((77 - arg0) / 49);
            this.field438.method3045(48);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILza;IBII)V")
    public static final void method235(int arg0, class287 arg1, int arg2, byte arg3, int arg4, int arg5) {
        arg1.method1182(arg2, arg4, arg2 + arg5, arg0 + arg4);
        field430++;
        arg1.method1717(arg5, arg2, arg0, -16777216, -22794, arg4);
        if (class181.field2356 < 100) {
            return;
        }
        float var6 = (float) class416.field6015 / (float) class416.field6014;
        int var7 = arg5;
        int var8 = arg0;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg5 * var6);
        } else {
            var7 = (int) ((float) arg0 / var6);
        }
        int var9 = (arg0 - var8) / 2 + arg4;
        int var10 = (arg5 - var7) / 2 + arg2;
        if (class146.field1936 == null || class146.field1936.method150() != arg5 || class146.field1936.method146() != arg0) {
            class416.method2573(class416.field6009, class416.field6020 + class416.field6015, class416.field6014 + class416.field6009, class416.field6020, var10, var9, var7 + var10, var8 + var9);
            class416.method2561(arg1);
            class146.field1936 = arg1.method1216(var10, var9, var7, var8, false);
        }
        class146.field1936.method144(var10, var9);
        if (arg3 != 35) {
            method225(null, true, null);
        }
        int var11 = class173.field2222 * var7 / class416.field6014;
        int var12 = class139.field1859 * var8 / class416.field6015;
        int var13 = class331.field4391 * var7 / class416.field6014 + var10;
        int var14 = var8 + var9 - class422.field6150 * var8 / class416.field6015 - var12;
        int var15 = -1996554240;
        if (class381.field5520 == class373.field5065) {
            var15 = -1996488705;
        }
        arg1.method1153(var13, var14, var11, var12, var15, 1);
        arg1.method1157(var13, var14, var11, var12, var15, 0);
        if (class509.field7386 <= 0) {
            return;
        }
        int var16;
        if (class53.field615 > 50) {
            var16 = 500 - class53.field615 * 5;
        } else {
            var16 = class53.field615 * 5;
        }
        for (class519 var17 = (class519) class416.field5994.method970(12); var17 != null; var17 = (class519) class416.field5994.method976((byte) -41)) {
            class48 var18 = class416.field5987.method993(var17.field7646, -21143);
            if (class384.method2337(var18, (byte) -128)) {
                if (class183.field2379 == var17.field7646) {
                    int var19 = var17.field7651 * var7 / class416.field6014 + var10;
                    int var20 = (class416.field6015 - var17.field7648) * var8 / class416.field6015 + var9;
                    arg1.method1717(4, var19 - 2, 4, var16 << 24 | 0xFFFF00, arg3 - 22829, var20 - 2);
                } else if (class307.field4117 != -1 && class307.field4117 == var18.field512) {
                    int var21 = var17.field7651 * var7 / class416.field6014 + var10;
                    int var22 = (class416.field6015 - var17.field7648) * var8 / class416.field6015 + var9;
                    arg1.method1717(4, var21 - 2, 4, var16 << 24 | 0xFFFF00, -22794, var22 - 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Lnb;")
    public final class199 method236(int arg0, int arg1) {
        field418++;
        if (arg0 != -18315) {
            this.method224(false, true);
        }
        class509 var3 = this.field427;
        class199 var4;
        synchronized (this.field427) {
            var4 = (class199) this.field427.method3032(3589, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field417;
        byte[] var6;
        synchronized (this.field417) {
            var6 = this.field417.method2130(class340.method1981(-752305304, arg1), class413.method2522(arg1, -22015), arg0 + 18260);
        }
        class199 var7 = new class199();
        var7.field2661 = this;
        var7.field2582 = arg1;
        var7.field2655 = new String[] { null, null, class378.field5474.method1823(this.field424, (byte) -88), null, null };
        var7.field2653 = new String[] { null, null, null, null, class387.field5623.method1823(this.field424, (byte) -88) };
        if (var6 != null) {
            var7.method1272(new class396(var6), 0);
        }
        var7.method1267((byte) -12);
        if (var7.field2601 != -1) {
            var7.method1269(this.method236(-18315, var7.field2641), (byte) -50, this.method236(-18315, var7.field2601));
        }
        if (var7.field2591 != -1) {
            var7.method1281(this.method236(arg0, var7.field2591), (byte) -56, this.method236(-18315, var7.field2659));
        }
        if (!this.field433 && var7.field2598) {
            var7.field2623 = class316.field4224.method1823(this.field424, (byte) -88);
            var7.field2653 = this.field443;
            var7.field2655 = this.field442;
            var7.field2611 = 0;
            var7.field2636 = null;
            var7.field2586 = false;
            if (var7.field2639 != null) {
                boolean var8 = false;
                for (class435 var9 = var7.field2639.method300((byte) -88); var9 != null; var9 = var7.field2639.method301(-126)) {
                    class87 var10 = this.field441.method449((byte) 15, (int) var9.field6348);
                    if (var10.field1024) {
                        var9.method2674(true);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field2639 = null;
                }
            }
        }
        class509 var11 = this.field427;
        synchronized (this.field427) {
            this.field427.method3046((long) arg1, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BC)Z")
    public static final boolean method237(byte arg0, char arg1) {
        field434++;
        if (arg0 != 19) {
            method233(-48);
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Loe;IIIIILza;I)Lo;")
    public final class24 method238(class136 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class287 arg6, int arg7) {
        this.field440.field2270 = arg1;
        this.field440.field2267 = arg6.field3766;
        if (arg2 != 0) {
            this.method224(false, false);
        }
        this.field440.field2265 = arg4;
        this.field440.field2263 = arg7;
        this.field440.field2271 = arg0 != null;
        this.field440.field2268 = arg5;
        this.field440.field2266 = arg3;
        field432++;
        return (class24) this.field439.method921(this.field440, (byte) -109);
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Ld;IZLfv;Lfo;Lfo;)V")
    public class40(class104 arg0, int arg1, boolean arg2, class79 arg3, class361 arg4, class361 arg5) {
        this.field417 = arg4;
        this.field441 = arg3;
        this.field437 = arg5;
        this.field433 = arg2;
        this.field424 = arg1;
        if (this.field417 == null) {
            this.field416 = 0;
        } else {
            int var7 = this.field417.method2138(-1) - 1;
            this.field416 = var7 * 256 + this.field417.method2136(-76, var7);
        }
        this.field442 = new String[] { null, null, class378.field5474.method1823(this.field424, (byte) -88), null, null };
        this.field443 = new String[] { null, null, null, null, class387.field5623.method1823(this.field424, (byte) -88) };
    }
}
