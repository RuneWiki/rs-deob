import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class30 extends class87 {

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    private int field316 = 4096;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    private int field320 = 0;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field317;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            int[] var4 = this.method642(0, arg0, true);
            for (int var5 = 0; class206.field3032 > var5; ++var5) {
                int var6 = var4[var5];
                if (this.field320 > var6) {
                    var3[var5] = this.field320;
                } else if (var6 <= this.field316) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field316;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method189(int arg0, String arg1) throws ClassNotFoundException {
        ++field315;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else {
            if (arg0 != -1) {
                method190(24);
            }
            if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else {
                return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class30() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V")
    public static final void method190(int arg0) {
        class304.field4926 = -1;
        class222.field3258 = -1;
        class162.field2510 = 0;
        ++field322;
        class45.field592 = -1;
        class147.field2360 = 0;
        class283.field4556 = 0;
        class243.field3574 = 0;
        class274.field4433 = -1;
        class191.field2823 = false;
        class144.field2338.field735 = 0;
        class92.field1488.field735 = 0;
        class158.method1156(0);
        for (int var1 = 0; ~class92.field1475.length < ~var1; ++var1) {
            if (class92.field1475[var1] != null) {
                class92.field1475[var1].field3679 = -1;
            }
        }
        int var2 = 0;
        if (arg0 != -12914) {
            method190(6);
        }
        while (~var2 > ~class255.field3856.length) {
            if (class255.field3856[var2] != null) {
                class255.field3856[var2].field3679 = -1;
            }
            ++var2;
        }
        class277.method1926(arg0 + 4891);
        class119.field1931 = 1;
        class79.method586(-1, 30);
        for (int var3 = 0; var3 < 100; ++var3) {
            class91.field1452[var3] = true;
        }
        class212.method1488(arg0 ^ 12883);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg2 != 25645) {
            this.method37(93, false);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field1381 = ~arg0.method366(-16505) == -2;
                }
            } else {
                this.field316 = arg0.method331(arg2 + -25733);
            }
        } else {
            this.field320 = arg0.method331(-37);
        }
        ++field321;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)[[I")
    public final int[][] method143(int arg0, int arg1) {
        if (arg1 != 6) {
            this.field316 = 58;
        }
        int[][] var3 = super.field1390.method1902(-125, arg0);
        if (super.field1390.field4428) {
            int[][] var4 = this.method648(arg0, -108, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; ~var11 > ~class206.field3032; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~this.field320 >= ~var12) {
                    if (var12 > this.field316) {
                        var10[var11] = this.field316;
                    } else {
                        var10[var11] = var12;
                    }
                } else {
                    var10[var11] = this.field320;
                }
                if (var14 >= this.field320) {
                    if (~this.field316 > ~var14) {
                        var8[var11] = this.field316;
                    } else {
                        var8[var11] = var14;
                    }
                } else {
                    var8[var11] = this.field320;
                }
                if (~var13 <= ~this.field320) {
                    if (~var13 < ~this.field316) {
                        var9[var11] = this.field316;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field320;
                }
            }
        }
        ++field318;
        return var3;
    }
}
