import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public class class21 extends class27 {

    @OriginalMember(owner = "mapview!k", name = "q", descriptor = "[J")
    private long[] field240 = new long[10];

    @OriginalMember(owner = "mapview!k", name = "l", descriptor = "[I")
    public static int[] field235 = new int[256];

    @OriginalMember(owner = "mapview!k", name = "s", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "mapview!k", name = "x", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "mapview!k", name = "v", descriptor = "Lt;")
    public static class35 field245;

    @OriginalMember(owner = "mapview!k", name = "w", descriptor = "Lt;")
    public static class35 field246;

    @OriginalMember(owner = "mapview!k", name = "r", descriptor = "Lt;")
    public static class35 field241;

    @OriginalMember(owner = "mapview!k", name = "m", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "mapview!k", name = "o", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "mapview!k", name = "p", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "mapview!k", name = "t", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "mapview!k", name = "k", descriptor = "J")
    private long field234;

    @OriginalMember(owner = "mapview!k", name = "u", descriptor = "Ln;")
    public static class26 field244;

    @OriginalMember(owner = "mapview!k", name = "n", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field237;

    @OriginalMember(owner = "mapview!k", name = "y", descriptor = "Z")
    public static boolean field248;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "([Lt;III)Lt;", line = 15)
    public static final class35 method123(class35[] arg0, int arg1, int arg2, int arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg0[arg3 + var5] == null) {
                arg0[arg3 + var5] = class17.field196;
            }
            var4 += arg0[arg3 + var5].field434;
        }
        int var6 = arg2;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg1; var8++) {
            class35 var9 = arg0[arg3 + var8];
            class14.method90(var9.field433, 0, var7, var6, var9.field434);
            var6 += var9.field434;
        }
        class35 var10 = new class35();
        var10.field433 = var7;
        var10.field434 = var4;
        return var10;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(B)V", line = 66)
    public final void method124(byte arg0) {
        this.field239 = 0;
        this.field243 = 1;
        this.field238 = 256;
        this.field234 = class19.method119(32);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field240[var2] = this.field234;
        }
        int var3 = 7 % ((23 - arg0) / 52);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(IBI)I", line = 96)
    public final int method125(int arg0, byte arg1, int arg2) {
        int var4 = this.field243;
        int var5 = this.field238;
        this.field243 = 1;
        this.field238 = 300;
        this.field234 = class19.method119(arg1 ^ 0x5A);
        if (this.field240[this.field236] == 0L) {
            this.field243 = var4;
            this.field238 = var5;
        } else if (this.field234 > this.field240[this.field236]) {
            this.field238 = (int) ((long) (arg0 * 2560) / (this.field234 - this.field240[this.field236]));
        }
        if (this.field238 < 25) {
            this.field238 = 25;
        }
        if (this.field238 > 256) {
            this.field238 = 256;
            this.field243 = (int) ((long) arg0 - (this.field234 - this.field240[this.field236]) / 10L);
        }
        if (arg1 != 1) {
            method126((byte) -116);
        }
        if (arg0 < this.field243) {
            this.field243 = arg0;
        }
        this.field240[this.field236] = this.field234;
        this.field236 = (this.field236 + 1) % 10;
        if (this.field243 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field240[var6] != 0L) {
                    this.field240[var6] += this.field243;
                }
            }
        }
        int var7 = 0;
        if (this.field243 < arg2) {
            this.field243 = arg2;
        }
        class27.method152((byte) 114, (long) this.field243);
        while (this.field239 < 256) {
            this.field239 += this.field238;
            var7++;
        }
        this.field239 &= 0xFF;
        return var7;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field235[var0] = var1;
        }
        field242 = 20;
        field247 = 0;
        field245 = class3.method28(false, "Chainmail Shop");
        field246 = class3.method28(false, "underlay)3dat");
        field241 = class3.method28(false, "Cookery Shop");
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(B)V", line = 179)
    public static void method126(byte arg0) {
        field237 = null;
        field235 = null;
        field246 = null;
        field241 = null;
        if (arg0 == 30) {
            field244 = null;
            field245 = null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "<init>", descriptor = "()V", line = 258)
    public class21() {
        this.method124((byte) -105);
    }
}
