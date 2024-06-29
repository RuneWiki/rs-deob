import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class494 extends class583 {

    @OriginalMember(owner = "client!iaa", name = "r", descriptor = "I")
    private int field7117;

    @OriginalMember(owner = "client!iaa", name = "q", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!iaa", name = "s", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!iaa", name = "u", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!iaa", name = "v", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!iaa", name = "w", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!iaa", name = "x", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!iaa", name = "y", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "[Lae;")
    public class250[] field7125;

    @OriginalMember(owner = "client!iaa", name = "t", descriptor = "[[B")
    private byte[][] field7119;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)Z")
    public final boolean method2953(int arg0, int arg1) {
        field7121++;
        if (arg1 != 1) {
            method2955((byte) 63);
        }
        return this.field7125[arg0].field3331;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lkba;III)V")
    public static final void method2954(class105 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class492.field6939) {
            class165 var4 = class553.field7776[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2266 != null && var4.field2266.method621(-108)) {
                arg0.method615(true, class362.field5135, 0, 0, var4.field2266, 22501, class586.field8250);
            }
        }
        if (arg3 < class492.field6939) {
            class165 var5 = class553.field7776[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2266 != null && var5.field2266.method621(-112)) {
                arg0.method615(true, class362.field5135, 0, class586.field8250, var5.field2266, 22501, 0);
            }
        }
        if (arg2 < class492.field6939 && arg3 < class365.field5171) {
            class165 var6 = class553.field7776[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2266 != null && var6.field2266.method621(-109)) {
                arg0.method615(true, class362.field5135, 0, class586.field8250, var6.field2266, 22501, class586.field8250);
            }
        }
        if (arg2 < class492.field6939 && arg3 > 0) {
            class165 var7 = class553.field7776[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2266 != null && var7.field2266.method621(-127)) {
                arg0.method615(true, class362.field5135, 0, -class586.field8250, var7.field2266, 22501, class586.field8250);
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "(B)V")
    public static final void method2955(byte arg0) {
        field7123++;
        if (arg0 != -6) {
            method2954(null, -103, 81, -74);
        }
        if (class557.field7812.field6532.method1419(false) == 0 && class526.field7430 != class310.field4320) {
            class657.method3610(11, false, class186.field2513, class557.field7832, false);
        } else {
            class449.method2692(31885, class268.field3831);
            if (class67.field825 != class526.field7430) {
                class405.method2515(-98);
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)Z")
    public final boolean method2956(int arg0) {
        field7124++;
        if (arg0 != -31394) {
            return false;
        } else if (this.field7125 == null) {
            if (this.field7119 == null) {
                class323 var2 = class681.field9333;
                synchronized (class681.field9333) {
                    if (!class681.field9333.method2101(this.field7117, -123)) {
                        return false;
                    }
                    int[] var4 = class681.field9333.method2077(this.field7117, 0);
                    this.field7119 = new byte[var4.length][];
                    for (int var5 = 0; var5 < var4.length; var5++) {
                        this.field7119[var5] = class681.field9333.method2100(var4[var5], (byte) 112, this.field7117);
                    }
                }
            }
            boolean var6 = true;
            for (int var7 = 0; var7 < this.field7119.length; var7++) {
                byte[] var8 = this.field7119[var7];
                class675 var9 = new class675(var8);
                var9.field9146 = 1;
                int var10 = var9.method3757((byte) -65);
                class323 var11 = class519.field7383;
                synchronized (class519.field7383) {
                    var6 &= class519.field7383.method2088(var10, arg0 ^ 0xFFFF8530);
                }
            }
            if (!var6) {
                return false;
            }
            class464 var12 = new class464();
            class323 var13 = class681.field9333;
            int[] var15;
            synchronized (class681.field9333) {
                int var14 = class681.field9333.method2084(this.field7117, 0);
                this.field7125 = new class250[var14];
                var15 = class681.field9333.method2077(this.field7117, 0);
            }
            for (int var16 = 0; var16 < var15.length; var16++) {
                byte[] var17 = this.field7119[var16];
                class675 var18 = new class675(var17);
                var18.field9146 = 1;
                int var19 = var18.method3757((byte) -65);
                class79 var20 = null;
                for (class79 var21 = (class79) var12.method2765(-12261); var21 != null; var21 = (class79) var12.method2759(-15361)) {
                    if (var21.field1009 == var19) {
                        var20 = var21;
                        break;
                    }
                }
                if (var20 == null) {
                    class323 var22 = class519.field7383;
                    synchronized (class519.field7383) {
                        var20 = new class79(var19, class519.field7383.method2108(var19, arg0 + 31394));
                    }
                    var12.method2770((byte) -13, var20);
                }
                this.field7125[var15[var16]] = new class250(var17, var20);
            }
            this.field7119 = null;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(II)Z")
    public final boolean method2957(int arg0, int arg1) {
        if (arg0 < 112) {
            this.field7117 = -28;
        }
        field7118++;
        return this.field7125[arg1].field3316;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZI)Z")
    public final boolean method2958(boolean arg0, int arg1) {
        if (arg0) {
            this.method2958(false, 124);
        }
        field7120++;
        return this.field7125[arg1].field3330;
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(III)V")
    public static final void method2959(int arg0, int arg1, int arg2) {
        class165 var3 = class553.field7776[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class461.method2739(var3.field2269);
        class461.method2739(var3.field2265);
        if (var3.field2269 != null) {
            var3.field2269 = null;
        }
        if (var3.field2265 != null) {
            var3.field2265 = null;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "(I)Lnu;")
    public static final class592 method2960(int arg0) {
        field7116++;
        class592 var1 = (class592) class1.field6.method4000((byte) -7);
        if (var1 != null) {
            var1.method1185(-86);
            var1.method3311(100);
            return var1;
        } else if (arg0 == 30548) {
            class592 var2;
            do {
                var2 = (class592) class28.field372.method4000((byte) -7);
                if (var2 == null) {
                    return null;
                }
                if (var2.method3348(0) > class479.method2864((byte) -57)) {
                    return null;
                }
                var2.method1185(-81);
                var2.method3311(100);
            } while ((var2.field8207 & Long.MIN_VALUE) == 0L);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(I)V")
    public class494(int arg0) {
        this.field7117 = arg0;
    }
}
