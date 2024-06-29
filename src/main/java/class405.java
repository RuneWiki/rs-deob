import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class405 {

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Lvj;")
    public static class405 field5930 = new class405();

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "Lvj;")
    public static class405 field5932 = new class405();

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Lvj;")
    public static class405 field5933 = new class405();

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Lvj;")
    public static class405 field5934 = new class405();

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field5935 = -1;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "F")
    public static float field5936;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()V")
    public static final void method2457() {
        for (int var0 = class293.field4322; var0 < class41.field685; var0++) {
            for (int var1 = 0; var1 < class302.field4492; var1++) {
                for (int var2 = 0; var2 < class8.field82; var2++) {
                    class40 var3 = class153.field2210[var0][var1][var2];
                    if (var3 != null) {
                        class244 var4 = var3.field658;
                        class244 var5 = var3.field669;
                        if (var4 != null && var4.method951(-31)) {
                            class329.method2069(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method951(-56)) {
                                class329.method2069(var5, var0, var1, var2, 1, 1);
                                var5.method953(0, false, class682.field9618, var4, 0, 0, true);
                                var5.method947(-107);
                            }
                            var4.method947(-122);
                        }
                        for (class106 var6 = var3.field671; var6 != null; var6 = var6.field1641) {
                            class454 var8 = var6.field1638;
                            if (var8 != null && var8.method951(-33)) {
                                class329.method2069(var8, var0, var1, var2, var8.field6526 + 1 - var8.field6524, var8.field6516 - var8.field6521 + 1);
                                var8.method947(97);
                            }
                        }
                        class701 var7 = var3.field663;
                        if (var7 != null && var7.method951(-88)) {
                            class486.method2828(var7, var0, var1, var2);
                            var7.method947(-93);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I")
    public static final int method2458(int arg0, int arg1) {
        field5929++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 == -619912415 ? ~var7 & arg0 : 4;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static void method2459(byte arg0) {
        if (arg0 != 71) {
            method2460((byte) -96, null);
        }
        field5930 = null;
        field5934 = null;
        field5933 = null;
        field5932 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLkj;)I")
    public static final int method2460(byte arg0, class525 arg1) {
        if (arg0 != 19) {
            return 19;
        }
        field5931++;
        if (class61.field1155 == arg1) {
            return 5890;
        } else if (class315.field4669 == arg1) {
            return 34167;
        } else if (class319.field4696 == arg1) {
            return 34168;
        } else if (class124.field1869 == arg1) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5928++;
        throw new IllegalStateException();
    }
}
