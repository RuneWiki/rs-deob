import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class209 extends class182 {

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    private int field3534 = 4096;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    private int field3529 = 4096;

    @OriginalMember(owner = "client!uh", name = "ab", descriptor = "I")
    private int field3538 = 4096;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "Lbb;")
    public static class49 field3536 = new class49();

    @OriginalMember(owner = "client!uh", name = "bb", descriptor = "I")
    public static int field3539 = 0;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "[I")
    public static int[] field3537;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
    public static final void method1465(byte arg0) {
        if (arg0 >= -85) {
            method1467(-53, true);
        }
        ++field3527;
        for (class248 var1 = (class248) class21.field387.method309(0); var1 != null; var1 = (class248) class21.field387.method312((byte) -92)) {
            if (~var1.field4145 == 0) {
                var1.field4142 = 0;
                class113.method871((byte) -55, var1);
            } else {
                var1.method993(32);
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)Lel;")
    public static final class293 method1466(int arg0, byte arg1) {
        class293 var2 = (class293) class88.field1454.method99((long) arg0, true);
        ++field3528;
        if (arg1 != 8) {
            return null;
        } else if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class7.field142.method1149(1, (byte) 23, arg0);
            class293 var4 = new class293();
            var4.field4819 = arg0;
            if (var3 != null) {
                var4.method2026(arg1 + -8, new class249(var3));
            }
            var4.method2031((byte) -42);
            if (var4.field4802 == 2 && class97.field1573.method987(-127, (long) arg0) == null) {
                class97.field1573.method986((long) arg0, true, new class113(class88.field1459));
                class149.field2466[class88.field1459++] = var4;
            }
            class88.field1454.method100((long) arg0, var4, 105);
            return var4;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZ)V")
    public static final void method1467(int arg0, boolean arg1) {
        for (class253 var2 = (class253) field3536.method309(0); var2 != null; var2 = (class253) field3536.method312((byte) -104)) {
            if (var2.field4289 != null) {
                class278.field4627.method113(var2.field4289);
                var2.field4289 = null;
            }
            if (var2.field4300 != null) {
                class278.field4627.method113(var2.field4300);
                var2.field4300 = null;
            }
            var2.method993(32);
        }
        if (arg0 <= 6) {
            method1468(-82, 98, -22);
        }
        ++field3532;
        if (arg1) {
            for (class253 var3 = (class253) class237.field3995.method309(0); var3 != null; var3 = (class253) class237.field3995.method312((byte) -81)) {
                if (var3.field4289 != null) {
                    class278.field4627.method113(var3.field4289);
                    var3.field4289 = null;
                }
                var3.method993(32);
            }
            for (class253 var4 = (class253) class259.field4355.method982(-9570); var4 != null; var4 = (class253) class259.field4355.method981(-1)) {
                if (var4.field4289 != null) {
                    class278.field4627.method113(var4.field4289);
                    var4.field4289 = null;
                }
                var4.method993(32);
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class209() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field3538 = arg1.method1821((byte) 51);
                }
            } else {
                this.field3529 = arg1.method1821((byte) 51);
            }
        } else {
            this.field3534 = arg1.method1821((byte) 51);
        }
        if (arg0) {
            this.field3534 = -105;
        }
        ++field3526;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        int var3 = 112 / ((arg0 - -64) / 49);
        int[][] var4 = super.field2905.method50(arg1, (byte) 115);
        if (super.field2905.field158) {
            int[][] var5 = this.method1327(0, 0, arg1);
            int[] var6 = var4[0];
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            int[] var9 = var5[1];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; class4.field116 > var12; ++var12) {
                int var13 = var7[var12];
                int var14 = var8[var12];
                int var15 = var9[var12];
                if (var13 == var14 && ~var14 == ~var15) {
                    var6[var12] = this.field3534 * var13 >> 12;
                    var10[var12] = this.field3529 * var14 >> 12;
                    var11[var12] = this.field3538 * var15 >> 12;
                } else {
                    var6[var12] = this.field3534;
                    var10[var12] = this.field3529;
                    var11[var12] = this.field3538;
                }
            }
        }
        ++field3535;
        return var4;
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(III)I")
    public static final int method1468(int arg0, int arg1, int arg2) {
        ++field3531;
        int var3 = class277.method1941(-37, arg0 + -1, arg2 + -1) - (-class277.method1941(112, arg0 + -1, arg2 - -1) - (class277.method1941(-63, arg0 - -1, arg2 + -1) + class277.method1941(99, arg0 + 1, arg2 + 1)));
        int var4 = class277.method1941(127, arg0, arg2 + -1) + (class277.method1941(104, arg0, arg2 + 1) - (-class277.method1941(122, arg0 + -1, arg2) - class277.method1941(-74, arg0 - -1, arg2)));
        int var5 = class277.method1941(119, arg0, arg2);
        if (arg1 >= -118) {
            field3533 = -126;
        }
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "(I)V")
    public static void method1469(int arg0) {
        field3536 = null;
        field3537 = null;
        if (arg0 != 0) {
            method1468(106, -69, 39);
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)V")
    public static final void method1470(byte arg0) {
        class236.field3980.method640((byte) 97, 204);
        ++class147.field2431;
        if (arg0 != -127) {
            field3539 = -75;
        }
        for (class278 var1 = (class278) class306.field4952.method982(-9570); var1 != null; var1 = (class278) class306.field4952.method981(-1)) {
            if (~var1.field4623 == -1) {
                class272.method1917((byte) 74, true, var1);
            }
        }
        ++field3530;
        if (class6.field133 != null) {
            class206.method1441(arg0 ^ -127, class6.field133);
            class6.field133 = null;
        }
    }
}
