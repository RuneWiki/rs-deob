import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class762 {

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "Lde;")
    private class534 field10625 = new class534(16);

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "Lnd;")
    private class547 field10623;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "[I")
    public static int[] field10619 = new int[1];

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field10618 = 0;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "Lkg;")
    public static class275 field10626 = new class275(60, 7);

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "Lwaa;")
    public static class705 field10627 = new class705("WTWIP", "office", "_wip", 3);

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "Lde;")
    public static class534 field10629 = new class534(4);

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "F")
    public static float field10628;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field10620;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field10621;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field10622;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public static int field10624;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    public static void method4231(int arg0) {
        field10619 = null;
        field10629 = null;
        field10626 = null;
        field10627 = null;
        if (arg0 != 2) {
            method4233(null, 95, 65, 90, 1, 40, -7, true, false);
        }
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)V")
    public final void method4232(int arg0) {
        field10621++;
        class534 var2 = this.field10625;
        synchronized (this.field10625) {
            this.field10625.method3065(true);
        }
        if (arg0 != 10000) {
            field10618 = 14;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lha;IIIIIIZZ)V")
    public static final void method4233(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class681.field9504 = arg0;
        class283.field3573 = arg1;
        class454.field6071 = class283.field3573 > 1 && class681.field9504.method549();
        class480.field6531 = arg2;
        class699.field9729 = 0x1 << class480.field6531;
        class139.field1991 = class699.field9729 >> 1;
        Math.sqrt((double) (class139.field1991 * class139.field1991 + class139.field1991 * class139.field1991));
        class29.field515 = arg3;
        class289.field3784 = arg4;
        class463.field6223 = arg5;
        class593.field8294 = arg6;
        class161.field2219 = class334.method1928((byte) 49);
        class86.method712(-88);
        class123.field1778 = new class14[arg3][class289.field3784][class463.field6223];
        class707.field9826 = new class282[arg3];
        if (arg7) {
            class498.field7019 = new int[class289.field3784][class463.field6223];
            class223.field2984 = new byte[class289.field3784][class463.field6223];
            class197.field2682 = new short[class289.field3784][class463.field6223];
            class665.field9356 = new class14[1][class289.field3784][class463.field6223];
            class395.field5009 = new class282[1];
        } else {
            class498.field7019 = null;
            class223.field2984 = null;
            class197.field2682 = null;
            class665.field9356 = null;
            class395.field5009 = null;
        }
        if (arg8) {
            class454.field6070 = new long[arg3][arg4][arg5];
            class58.field808 = new class667[65535];
            class592.field8277 = new boolean[65535];
            class178.field2498 = 0;
        } else {
            class454.field6070 = null;
            class58.field808 = null;
            class592.field8277 = null;
            class178.field2498 = 0;
        }
        class629.method3537(false);
        class730.field10164 = new class435[2];
        class72.field1005 = new class435[2];
        class259.field3278 = new class435[2];
        class381.field4850 = new class435[10000];
        class333.field4239 = 0;
        class442.field5873 = new class435[5000];
        class475.field6397 = 0;
        class541.field7494 = new class556[5000];
        class551.field7698 = 0;
        class449.field5945 = new boolean[class593.field8294 + class593.field8294 + 1][class593.field8294 + class593.field8294 + 1];
        class214.field2824 = new boolean[class593.field8294 + class593.field8294 + 2][class593.field8294 + class593.field8294 + 2];
        class307.field4057 = new int[class593.field8294 + class593.field8294 + 2];
        class386.field4924 = class386.field4923;
        if (class454.field6071) {
            class499.field7027 = new boolean[arg3][class593.field8294 + class593.field8294 + 1][class593.field8294 + class593.field8294 + 1];
            class619.field8537 = new boolean[arg3][][];
            if (class433.field5776 != null) {
                class409.method2285();
            }
            class433.field5776 = new class750[class283.field3573];
            class681.field9504.method452(class433.field5776.length + 1);
            class681.field9504.method506(0);
            for (int var9 = 0; var9 < class433.field5776.length; var9++) {
                class433.field5776[var9] = new class750(var9 + 1, class681.field9504);
                (new Thread(class433.field5776[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class283.field3573 == 2) {
                var10 = 4;
                class93.field1294 = 2;
            } else if (class283.field3573 == 3) {
                var10 = 6;
                class93.field1294 = 3;
            } else {
                var10 = 8;
                class93.field1294 = 4;
            }
            class160.field2211 = new class619[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class160.field2211[var11] = new class619(class679.field9487[class283.field3573 - 2][var11]);
            }
        } else {
            class93.field1294 = 1;
        }
        class629.field8674 = new int[class93.field1294 - 1];
        class437.field5812 = new int[class93.field1294 - 1];
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BI)Lro;")
    public final class2 method4234(byte arg0, int arg1) {
        field10620++;
        class534 var3 = this.field10625;
        class2 var4;
        synchronized (this.field10625) {
            var4 = (class2) this.field10625.method3079((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class547 var5 = this.field10623;
        byte[] var6;
        synchronized (this.field10623) {
            var6 = this.field10623.method3153(arg1, 0, 30);
        }
        int var7 = 77 / ((arg0 + 60) / 51);
        class2 var8 = new class2();
        if (var6 != null) {
            var8.method6(new class461(var6), -126);
        }
        class534 var9 = this.field10625;
        synchronized (this.field10625) {
            this.field10625.method3077((byte) -32, (long) arg1, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IB)V")
    public final void method4235(int arg0, byte arg1) {
        class534 var3 = this.field10625;
        synchronized (this.field10625) {
            this.field10625.method3070(arg0, 124);
        }
        if (arg1 <= -108) {
            field10622++;
        }
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)V")
    public final void method4236(int arg0) {
        field10624++;
        class534 var2 = this.field10625;
        synchronized (this.field10625) {
            this.field10625.method3064(false);
        }
        int var3 = -84 / ((arg0 - 44) / 52);
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lal;ILnd;)V")
    public class762(class102 arg0, int arg1, class547 arg2) {
        this.field10623 = arg2;
        this.field10623.method3178((byte) 83, 30);
    }
}
