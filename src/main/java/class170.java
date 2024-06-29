import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class170 {

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
    public int field2585;

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "[B")
    private byte[] field2580;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "Lsv;")
    public static class570 field2577 = new class570(19, 0);

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public int field2571;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public int field2572;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
    public int field2586;

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "Lkq;")
    public class782 field2578;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "[I")
    public int[] field2569;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "[I")
    public int[] field2575;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "[I")
    public int[] field2576;

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "[I")
    public int[] field2581;

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "[I")
    public int[] field2583;

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "[I")
    public int[] field2584;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "[Lkq;")
    public class782[] field2568;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "[[B")
    public byte[][] field2570;

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "[[I")
    public int[][] field2579;

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "[[I")
    public int[][] field2582;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V")
    public static final void method1257(byte arg0) {
        if (arg0 < 30) {
            return;
        }
        field2574++;
        class494 var1 = class725.field10099;
        synchronized (class725.field10099) {
            class725.field10099.method2881((byte) -105);
        }
        class494 var2 = class677.field9507;
        synchronized (class677.field9507) {
            class677.field9507.method2881((byte) -73);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[B)V")
    private final void method1258(int arg0, byte[] arg1) {
        field2573++;
        class431 var3 = new class431(class347.method2116(true, arg1));
        int var4 = var3.method2557(14929);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field2586 = 0;
        } else {
            this.field2586 = var3.method2526(17);
        }
        int var5 = var3.method2557(14929);
        boolean var6 = (var5 & 0x1) != 0;
        this.field2571 = var3.method2565((byte) -122);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        int var9 = -1;
        this.field2584 = new int[this.field2571];
        for (int var10 = 0; var10 < this.field2571; var10++) {
            this.field2584[var10] = var8 += var3.method2565((byte) -124);
            if (var9 < this.field2584[var10]) {
                var9 = this.field2584[var10];
            }
        }
        this.field2572 = var9 + 1;
        this.field2569 = new int[this.field2572];
        if (var7) {
            this.field2570 = new byte[this.field2572][];
        }
        this.field2579 = new int[this.field2572][];
        this.field2581 = new int[this.field2572];
        this.field2575 = new int[this.field2572];
        this.field2583 = new int[this.field2572];
        if (var6) {
            this.field2576 = new int[this.field2572];
            for (int var11 = 0; var11 < this.field2572; var11++) {
                this.field2576[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field2571; var12++) {
                this.field2576[this.field2584[var12]] = var3.method2526(17);
            }
            this.field2578 = new class782(this.field2576);
        }
        for (int var13 = 0; var13 < this.field2571; var13++) {
            this.field2575[this.field2584[var13]] = var3.method2526(17);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field2571; var14++) {
                byte[] var15 = new byte[64];
                var3.method2530(-50, var15, 0, 64);
                this.field2570[this.field2584[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field2571; var16++) {
            this.field2583[this.field2584[var16]] = var3.method2526(17);
        }
        int var17 = 0;
        if (arg0 >= -118) {
            return;
        }
        while (this.field2571 > var17) {
            this.field2569[this.field2584[var17]] = var3.method2565((byte) -82);
            var17++;
        }
        for (int var18 = 0; var18 < this.field2571; var18++) {
            int var25 = this.field2584[var18];
            int var26 = this.field2569[var25];
            int var27 = 0;
            int var28 = -1;
            this.field2579[var25] = new int[var26];
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field2579[var25][var29] = var27 += var3.method2565((byte) -87);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field2581[var25] = var28 + 1;
            if ((var28 + 1) == var26) {
                this.field2579[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field2582 = new int[var9 + 1][];
        this.field2568 = new class782[var9 + 1];
        for (int var19 = 0; var19 < this.field2571; var19++) {
            int var20 = this.field2584[var19];
            int var21 = this.field2569[var20];
            this.field2582[var20] = new int[this.field2581[var20]];
            for (int var22 = 0; var22 < this.field2581[var20]; var22++) {
                this.field2582[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field2579[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field2579[var20][var23];
                }
                this.field2582[var20][var24] = var3.method2526(17);
            }
            this.field2568[var20] = new class782(this.field2582[var20]);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
    public static void method1259(int arg0) {
        field2577 = null;
        if (arg0 != 0) {
            field2577 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "([BI[B)V")
    public class170(byte[] arg0, int arg1, byte[] arg2) {
        this.field2585 = class549.method3177(arg0.length, -26861, arg0);
        if (this.field2585 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field2580 = class65.method652(arg0, 0, arg0.length, (byte) -60);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field2580[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method1258(-122, arg0);
    }
}
