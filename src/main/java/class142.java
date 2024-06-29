import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class142 extends class283 {

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    private int field2164 = 0;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "I")
    private int field2163 = 10;

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "I")
    private int field2175 = 2048;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "Lbe;")
    public static class297 field2165 = null;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "Ljava/util/Random;")
    public static Random field2166 = new Random();

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "[S")
    public static short[] field2178 = new short[500];

    @OriginalMember(owner = "client!d", name = "db", descriptor = "Z")
    public static boolean field2177 = false;

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "Lna;")
    private static class26 field2179 = class69.method505("Close", (byte) -121);

    @OriginalMember(owner = "client!d", name = "gb", descriptor = "Lna;")
    public static class26 field2180 = field2179;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!d", name = "ib", descriptor = "Lqf;")
    public static class148 field2182;

    @OriginalMember(owner = "client!d", name = "hb", descriptor = "Lve;")
    public static class266 field2181;

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "Ljava/awt/Frame;")
    public static Frame field2172;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "[I")
    private int[] field2168;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "[I")
    private int[] field2170;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V", line = 5)
    public final void method130(int arg0) {
        if (arg0 == 16251) {
            this.method945(1);
            field2171++;
        }
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(B)V", line = 16)
    public static void method943(byte arg0) {
        field2180 = null;
        field2178 = null;
        if (arg0 != 122) {
            method944(62, -109, 127);
        }
        field2172 = null;
        field2166 = null;
        field2179 = null;
        field2182 = null;
        field2165 = null;
        field2181 = null;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(III)I", line = 35)
    public static final int method944(int arg0, int arg1, int arg2) {
        field2167++;
        int var3 = arg1 - 1 & arg0 >> 31;
        int var4 = -95 % ((33 - arg2) / 54);
        return ((arg0 >>> 31) + arg0) % arg1 + var3;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V", line = 125)
    public class142() {
        super(0, true);
    }

    @OriginalMember(owner = "client!d", name = "h", descriptor = "(I)V", line = 49)
    private final void method945(int arg0) {
        if (arg0 != 1) {
            return;
        }
        int var2 = 0;
        field2173++;
        this.field2170 = new int[this.field2163 + 1];
        int var3 = 4096 / this.field2163;
        this.field2168 = new int[this.field2163 + 1];
        int var4 = this.field2175 * var3 >> 12;
        for (int var5 = 0; var5 < this.field2163; var5++) {
            this.field2168[var5] = var2;
            this.field2170[var5] = var2 + var4;
            var2 += var3;
        }
        this.field2168[this.field2163] = 4096;
        this.field2170[this.field2163] = this.field2170[0] + 4096;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILwa;Z)V", line = 81)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        field2176++;
        if (arg0 == 0) {
            this.field2163 = arg1.method642((byte) -118);
        } else if (arg0 == 1) {
            this.field2175 = arg1.method576(1);
        } else if (arg0 == 2) {
            this.field2164 = arg1.method642((byte) -81);
        }
        if (!arg2) {
            this.field2168 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)[I", line = 153)
    public final int[] method8(int arg0, byte arg1) {
        field2174++;
        int var3 = -12 / ((30 - arg1) / 36);
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            int var5 = class59.field955[arg0];
            if (this.field2164 == 0) {
                short var6 = 0;
                for (int var7 = 0; var7 < this.field2163; var7++) {
                    if (this.field2168[var7] <= var5 && var5 < this.field2168[var7 + 1]) {
                        if (var5 < this.field2170[var7]) {
                            var6 = 4096;
                        }
                        break;
                    }
                }
                class75.method538(var4, 0, class101.field1632, var6);
            } else {
                for (int var8 = 0; var8 < class101.field1632; var8++) {
                    int var9 = class13.field184[var8];
                    int var10 = 0;
                    int var11 = this.field2164;
                    if (var11 == 1) {
                        var10 = var9;
                    } else if (var11 == 2) {
                        var10 = (var5 + var9 - 4096 >> 1) + 2048;
                    } else if (var11 == 3) {
                        var10 = (var9 - var5 >> 1) + 2048;
                    }
                    short var12 = 0;
                    for (int var13 = 0; var13 < this.field2163; var13++) {
                        if (this.field2168[var13] <= var10 && var10 < this.field2168[var13 + 1]) {
                            if (var10 < this.field2170[var13]) {
                                var12 = 4096;
                            }
                            break;
                        }
                    }
                    var4[var8] = var12;
                }
            }
        }
        return var4;
    }
}
