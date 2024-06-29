import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class696 {

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "J")
    public long field9692;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "Lhj;")
    private class47 field9691;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "Z")
    public static boolean field9689 = false;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "[[Ljava/lang/String;")
    public static String[][] field9693 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field9690;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lum;)V", line = 3)
    public static final void method3928(class131 arg0) {
        if (class486.field6796 >= 65535) {
            return;
        }
        class687 var1 = arg0.field1842;
        class532.field7385[class486.field6796] = arg0;
        class325.field4491[class486.field6796] = false;
        class486.field6796++;
        int var2 = arg0.field1836;
        if (arg0.field1824) {
            var2 = 0;
        }
        int var3 = arg0.field1836;
        if (arg0.field1841) {
            var3 = class370.field5229 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method3870(97) + class292.field4190 - var1.method3866((byte) -54) >> class371.field5241;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method3870(89) + var1.method3866((byte) -60) - class292.field4190 >> class371.field5241;
            if (var7 >= class713.field9959) {
                var7 = class713.field9959 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field1838[var5++];
                int var10 = (var1.method3873((byte) -7) + class292.field4190 - var1.method3866((byte) -63) >> class371.field5241) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class61.field877) {
                    var11 = class61.field877 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class142.field2015[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class142.field2015[var4][var12][var8] = var13 | (long) class486.field6796;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class142.field2015[var4][var12][var8] = var13 | (long) class486.field6796 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class142.field2015[var4][var12][var8] = var13 | (long) class486.field6796 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class142.field2015[var4][var12][var8] = var13 | (long) class486.field6796 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "finalize", descriptor = "()V", line = 98)
    protected final void finalize() throws Throwable {
        field9690++;
        this.field9691.method261(this.field9692, false);
        super.finalize();
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 109)
    public static void method3929(int arg0) {
        int var1 = -92 / ((-arg0 - 51) / 38);
        field9693 = null;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lhj;JI)V", line = 126)
    public class696(class47 arg0, long arg1, int arg2) {
        this.field9692 = arg1;
        this.field9691 = arg0;
    }
}
