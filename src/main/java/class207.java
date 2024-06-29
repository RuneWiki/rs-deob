import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class207 extends class80 {

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    public int field3592;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    private int field3585;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "[Z")
    public boolean[] field3584;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "[[I")
    public int[][] field3590;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "[I")
    public int[] field3588;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "Lwh;")
    public static class167 field3589 = new class167();

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "Lr;")
    private static class66 field3598 = class93.method641(43, "Prepared sound engine");

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "Lr;")
    public static class66 field3593 = class93.method641(43, "null");

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "Lr;")
    public static class66 field3596 = field3598;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "Lfa;")
    public static class45 field3595;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Laf;I)V")
    public static final void method1345(class39 arg0, int arg1) {
        field3591++;
        arg0.method235(class234.field4090, class19.field257 / 2, class12.field143 / 2 - 26, 16777215, -1);
        int var2 = class12.field143 / 2 - 18;
        if (arg1 != -27931) {
            method1350(false, (byte) 82);
        }
        class235.method1534(class19.field257 / 2 - 152, var2, 304, 34, 9179409);
        class235.method1534(class19.field257 / 2 - 151, var2 - -1, 302, 32, 0);
        class235.method1558(class19.field257 / 2 - 150, var2 + 2, class208.field3599 * 3, 30, 9179409);
        class235.method1558(class19.field257 / 2 + (class208.field3599 * 3) - 150, var2 - -2, 300 - (class208.field3599 * 3), 30, 0);
        arg0.method235(class237.field4116, class19.field257 / 2, class12.field143 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)I")
    public static final int method1346(int arg0) {
        field3586++;
        if (class251.field4417) {
            return 0;
        }
        if (arg0 != 1) {
            field3593 = null;
        }
        if (class88.method625(24781)) {
            return class198.field3421 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lcj;I)V")
    public static final void method1347(class28 arg0, int arg1) {
        if (arg1 != -5545) {
            return;
        }
        class44.field785 = arg0.method132(class173.field3054, (byte) -84);
        field3594++;
        class52.field926 = arg0.method132(class139.field2559, (byte) -125);
        class153.field2737 = arg0.method132(class83.field1623, (byte) -127);
        class69.field1397 = arg0.method132(class131.field2436, (byte) -103);
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V")
    public static void method1348(int arg0) {
        field3589 = null;
        if (arg0 != 304) {
            method1346(-74);
        }
        field3598 = null;
        field3593 = null;
        field3596 = null;
        field3595 = null;
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)V")
    public static final void method1349(int arg0) {
        int var1 = -1;
        int var2 = -71 / ((-arg0 - 81) / 38);
        while (client.field1650 > var1) {
            int var3;
            if (var1 == -1) {
                var3 = 2047;
            } else {
                var3 = class192.field3335[var1];
            }
            class45 var4 = class59.field988[var3];
            if (var4 != null) {
                class222.method1414(var4, 128, var4.field2060);
            }
            var1++;
        }
        field3587++;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(ZB)V")
    public static final void method1350(boolean arg0, byte arg1) {
        if (arg1 != 84) {
            return;
        }
        byte[][] var2 = class57.field977;
        int var3 = class76.field1503.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class202.field3469[var4] >> 8) * 64 - class3.field39;
                int var7 = (class202.field3469[var4] & 0xFF) * 64 - class34.field512;
                class129.method901(arg1 ^ 0x3F96);
                class132.method916(var6, var7, var5, arg0, class193.field3346, false);
            }
        }
        field3583++;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I[B)V")
    public class207(int arg0, byte[] arg1) {
        this.field3592 = arg0;
        class249 var3 = new class249(arg1);
        this.field3585 = var3.method1677(-6677);
        this.field3584 = new boolean[this.field3585];
        this.field3590 = new int[this.field3585][];
        this.field3588 = new int[this.field3585];
        for (int var4 = 0; var4 < this.field3585; var4++) {
            this.field3588[var4] = var3.method1677(-6677);
        }
        for (int var5 = 0; var5 < this.field3585; var5++) {
            this.field3584[var5] = var3.method1677(-6677) == 1;
        }
        for (int var6 = 0; var6 < this.field3585; var6++) {
            this.field3590[var6] = new int[var3.method1677(-6677)];
        }
        for (int var7 = 0; var7 < this.field3585; var7++) {
            for (int var8 = 0; var8 < this.field3590[var7].length; var8++) {
                this.field3590[var7][var8] = var3.method1677(-6677);
            }
        }
    }
}
