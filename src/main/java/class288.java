import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class288 extends class30 {

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "I")
    private int field4614 = 0;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "I")
    private int field4613 = 1365;

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "I")
    private int field4612 = 0;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
    private int field4618 = 20;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "[I")
    public static int[] field4610 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "Ljava/lang/String;")
    public static String field4617 = "red:";

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!pi", name = "X", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)I", line = 4)
    public static final int method1943(int arg0, int arg1) {
        if (arg1 <= 21) {
            method1944(-13, 7);
        }
        ++field4615;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)Lel;", line = 16)
    public static final class324 method1944(int arg0, int arg1) {
        ++field4619;
        class324 var2 = (class324) class8.field106.method331((byte) 69, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class89.field1116.method2771(arg0, arg1, 3);
            class324 var4 = new class324();
            var4.field5068 = arg1;
            if (var3 != null) {
                var4.method2151(new class186(var3), -83);
            }
            var4.method2150(0);
            class8.field106.method341(58, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)[I", line = 39)
    public final int[] method116(int arg0, byte arg1) {
        ++field4620;
        int[] var3 = super.field371.method2367((byte) 71, arg0);
        if (super.field371.field5586) {
            for (int var4 = 0; var4 < class369.field5610; ++var4) {
                int var5 = (class79.field995[var4] << 12) / this.field4613 + this.field4612;
                int var6 = (class132.field2064[arg0] << 12) / this.field4613 + this.field4614;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && this.field4618 > var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var7 + var11;
                    var11 = var9 * var9 >> 12;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = var13 < this.field4618 + -1 ? (var13 << 12) / this.field4618 : 0;
            }
        }
        if (arg1 <= 49) {
            method1945(-3, 55, -91);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(III)I", line = 98)
    public static final int method1945(int arg0, int arg1, int arg2) {
        ++field4609;
        class33 var3 = (class33) class126.field1937.method1770(-880, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && ~arg1 > ~var3.field412.length) {
            int var4 = 66 % ((39 - arg2) / 37);
            return var3.field412[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V", line = 116)
    public class288() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lri;IIIII)V", line = 128)
    public static final void method1946(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4616;
        if (~arg0.field741 != 0 || arg0.field736 != null) {
            int var6 = 0;
            int var7 = class213.field3427 * arg0.field743 >> 8;
            if (arg4 > arg0.field737) {
                var6 += -arg0.field737 + arg4;
            } else if (arg0.field740 > arg4) {
                var6 += -arg4 + arg0.field740;
            }
            if (~arg0.field756 > ~arg2) {
                var6 += -arg0.field756 + arg2;
            } else if (~arg0.field730 < ~arg2) {
                var6 += arg0.field730 - arg2;
            }
            if (~arg0.field750 != -1 && ~(var6 + -64) >= ~arg0.field750 && ~class213.field3427 != -1 && ~arg0.field732 == ~arg1) {
                if (arg5 == -6639) {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var8 = (-var6 + arg0.field750) * var7 / arg0.field750;
                    if (arg0.field753 != null) {
                        arg0.field753.method1425(var8);
                    } else if (~arg0.field741 <= -1) {
                        class416 var9 = class416.method2600(class236.field3950, arg0.field741, 0);
                        if (var9 != null) {
                            class445 var10 = var9.method2598().method2755(class305.field4841);
                            class202 var11 = class202.method1423(var10, 100, var8);
                            var11.method1421(-1);
                            class82.field1025.method2482(var11);
                            arg0.field753 = var11;
                        }
                    }
                    if (arg0.field728 == null) {
                        if (arg0.field736 != null && (arg0.field755 -= arg3) <= 0) {
                            int var12 = (int) (Math.random() * (double) arg0.field736.length);
                            class416 var13 = class416.method2600(class236.field3950, arg0.field736[var12], 0);
                            if (var13 != null) {
                                class445 var14 = var13.method2598().method2755(class305.field4841);
                                class202 var15 = class202.method1423(var14, 100, var8);
                                var15.method1421(0);
                                class82.field1025.method2482(var15);
                                arg0.field728 = var15;
                                arg0.field755 = arg0.field738 + (int) ((double) (-arg0.field738 + arg0.field733) * Math.random());
                                return;
                            }
                        }
                    } else {
                        arg0.field728.method1425(var8);
                        if (arg0.field728.method1123((byte) 62)) {
                            return;
                        }
                        arg0.field728 = null;
                    }
                }
            } else {
                if (arg0.field753 != null) {
                    class82.field1025.method2479(arg0.field753);
                    arg0.field753 = null;
                }
                if (arg0.field728 != null) {
                    class82.field1025.method2479(arg0.field728);
                    arg0.field728 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljg;II)V", line = 257)
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (arg1 == 6456) {
            ++field4608;
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (arg2 == 3) {
                            this.field4614 = arg0.method1272((byte) -98);
                        }
                    } else {
                        this.field4612 = arg0.method1272((byte) -82);
                    }
                } else {
                    this.field4618 = arg0.method1272((byte) -54);
                }
            } else {
                this.field4613 = arg0.method1272((byte) -124);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)V", line = 310)
    public static final void method1947(int arg0) {
        if (class144.field2271 != null) {
            class144.field2271.method2091(-15001);
            class144.field2271 = null;
            class101.field1414 = null;
        }
        if (arg0 > 68) {
            ++field4621;
        }
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(B)V", line = 346)
    public static void method1948(byte arg0) {
        field4617 = null;
        field4610 = null;
        if (arg0 != 54) {
            method1948((byte) 61);
        }
    }
}
