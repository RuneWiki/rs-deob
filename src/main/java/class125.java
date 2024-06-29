import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class125 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
    public static int[] field2256 = new int[99];

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field2258 = -1;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "J")
    public static long field2261 = 0L;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "Lsb;")
    public static class98 field2260 = class47.method368("3D)2Softwarebibliothek gestartet)3", 0);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Ltg;")
    public static class75 field2263;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method928(int arg0) {
        field2263 = null;
        field2256 = null;
        field2260 = null;
        if (arg0 != 10) {
            method930(-16, 92);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)Lda;")
    public static final class21 method929(int arg0, byte arg1) {
        field2259++;
        class21 var2 = (class21) class23.field464.method1564((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class14.field262.method571(class10.method96(114, arg0), class81.method609(72, arg0), 123);
        class21 var4 = new class21();
        var4.field404 = arg0;
        if (var3 != null) {
            var4.method231(new class216(var3), (byte) -101);
        }
        var4.method235(true);
        if (var4.field441) {
            var4.field442 = 0;
            var4.field395 = false;
        }
        if (!class145.field2541 && var4.field433) {
            var4.field379 = null;
        }
        class23.field464.method1563((long) arg0, 21771, var4);
        return arg1 >= -70 ? null : var4;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lsb;")
    public static final class98 method930(int arg0, int arg1) {
        if (arg0 != 25904) {
            field2260 = null;
        }
        field2254++;
        return class61.method449(10, (byte) 105, false, arg1);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILtg;)V")
    public static final void method931(int arg0, class75 arg1) {
        class99.field1740 = arg1;
        int var2 = 33 % ((arg0 + 32) / 44);
        field2255++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public static final void method932(boolean arg0) {
        class245.field4326 = null;
        class33.field572 = null;
        if (!arg0) {
            return;
        }
        class164.field2958 = null;
        field2257++;
        class204.field3491 = null;
        class9.field207 = null;
        class253.field4422 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2256[var1] = var0 / 4;
        }
    }
}
