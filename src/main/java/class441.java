import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class441 {

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Lmq;")
    private class104 field6055 = new class104(64);

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public int field6058 = 0;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Lfc;")
    private class343 field6046;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public int field6051;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Lcs;")
    public static class351 field6050 = new class351(4, 7);

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "[[Z")
    public static boolean[][] field6057 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Lfn;")
    public static class52 field6056 = new class52(82, 7);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "Ldr;")
    public static class250 field6059;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Lfc;")
    public static class343 field6048;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Lhc;")
    public final class277 method2556(int arg0, int arg1) {
        field6054++;
        class104 var3 = this.field6055;
        class277 var4;
        synchronized (this.field6055) {
            var4 = (class277) this.field6055.method659((long) arg1, (byte) -1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6046.method2029(4, arg1, 0);
        class277 var6 = new class277();
        var6.field3827 = this;
        var6.field3834 = arg1;
        if (var5 != null) {
            var6.method1741(new class425(var5), 124);
        }
        var6.method1738(true);
        class104 var7 = this.field6055;
        synchronized (this.field6055) {
            if (arg0 < 88) {
                this.method2558(-53);
            }
            this.field6055.method653(94, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZI)I")
    public static final int method2557(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field6053++;
            return arg0 == 1 || arg0 == 3 ? class317.field4309[arg2 & 0x3] : class423.field5818[arg2 & 0x3];
        } else {
            return 101;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    private final void method2558(int arg0) {
        field6045++;
        class104 var2 = this.field6055;
        synchronized (this.field6055) {
            this.field6055.method656(112);
            if (arg0 != 18470) {
                this.method2561(-1);
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
    public static final void method2559(boolean arg0) {
        field6049++;
        class33.field532.method2558(18470);
        class59.field928.method1975(-65536);
        class393.field5529.method1243(40);
        class304.field4160.method2069((byte) 21);
        class467.field6550.method1360(-90);
        class58.field918.method342(-1);
        class31.field505.method954(572);
        class163.field2348.method549(-2);
        class147.field2084.method406((byte) -62);
        class181.field2632.method2427((byte) 4);
        class363.field5161.method2807(arg0);
        class425.field5861.method380(108);
        class292.field4009.method83(124);
        class192.field2728.method422((byte) 124);
        class68.field1007.method960(-6257);
        class487.field6864.method2534(29);
        class191.field2725.method682(-19);
        class448.field6178.method1195((byte) -118);
        class38.field659.method1402(41);
        class375.field5314.method2359((byte) 36);
        class231.method1451(arg0);
        class256.method1592(122);
        class153.method929(-72);
        if (class96.field1373 != class396.field5558) {
            for (int var1 = 0; var1 < class270.field3748.length; var1++) {
                class270.field3748[var1] = null;
            }
            class486.field6857 = 0;
        }
        class378.method2256((byte) -111);
        class145.method898((byte) 65);
        class60.method442((byte) 16);
        class119.method749(0);
        class282.method1755((byte) -93);
        class212.field3006.method656(122);
        class338.field4636.method1055();
        class241.field3415.method1206(false);
        class321.method1936((byte) 84);
        class204.field2930.method2041(-3);
        class440.field6035.method2041(-3);
        class63.field969.method2041(-3);
        class346.field4729.method2041(-3);
        class464.field6523.method2041(-3);
        class336.field4611.method2041(-3);
        class101.field1440.method2041(-3);
        class160.field2302.method2041(-3);
        class120.field1685.method2041(-3);
        class341.field4651.method2041(-3);
        class85.field1283.method2041(-3);
        class172.field2548.method2041(-3);
        class451.field6193.method2041(-3);
        field6048.method2041(-3);
        class182.field2641.method2041(-3);
        class432.field5954.method2041(-3);
        class454.field6275.method2041(-3);
        class475.field6725.method2041(-3);
        class357.field4988.method2041(-3);
        class47.field763.method2041(-3);
        class460.field6480.method2041(-3);
        class254.field3551.method2041(-3);
        class330.field4544.method2041(-3);
        class183.field2667.method2041(-3);
        class228.field3227.method2041(-3);
        class370.field5237.method2041(-3);
        class440.field6040.method2041(-3);
        class106.field1530.method2041(-3);
        class126.field1721.method2041(-3);
        class344.field4712.method656(117);
        class196.field2786.method656(99);
        class479.field6770.method656(114);
        class90.field1345.method656(118);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
    public static void method2560(int arg0) {
        field6050 = null;
        field6057 = null;
        field6059 = null;
        field6048 = null;
        field6056 = null;
        if (arg0 >= -31) {
            field6048 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
    public final void method2561(int arg0) {
        class104 var2 = this.field6055;
        synchronized (this.field6055) {
            if (arg0 != -4) {
                field6059 = null;
            }
            this.field6055.method654(false);
        }
        field6047++;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)V")
    public final void method2562(int arg0, int arg1) {
        class104 var3 = this.field6055;
        synchronized (this.field6055) {
            if (arg1 != 16139) {
                this.field6058 = 19;
            }
            this.field6055.method666(arg0, false);
        }
        field6052++;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Ldk;ILfc;)V")
    public class441(class328 arg0, int arg1, class343 arg2) {
        this.field6046 = arg2;
        this.field6051 = this.field6046.method2054(0, 4);
    }
}
