import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class255 extends class286 {

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    private int field4309 = 20;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
    private int field4311 = 1365;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    private int field4310 = 0;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "I")
    private int field4307 = 0;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    public static int field4308 = 0;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "Lbe;")
    public static class283 field4306 = class153.method941(-104, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!r", name = "O", descriptor = "I")
    public static int field4301 = 127;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "[[I")
    public static int[][] field4304 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    public static int field4302 = -2;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "Lbe;")
    public static class283 field4303 = class153.method941(4, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!r", name = "N", descriptor = "S")
    public static short field4300 = 32767;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V", line = 6)
    public static void method1726(boolean arg0) {
        field4306 = null;
        field4304 = (int[][]) null;
        field4303 = null;
        if (!arg0) {
            field4303 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 19)
    public class255() {
        super(0, true);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfe;ZI)V", line = 26)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (arg1) {
            return;
        }
        if (arg2 == 0) {
            this.field4311 = arg0.method1496(true);
        } else if (arg2 == 1) {
            this.field4309 = arg0.method1496(!arg1);
        } else if (arg2 == 2) {
            this.field4307 = arg0.method1496(true);
        } else if (arg2 == 3) {
            this.field4310 = arg0.method1496(!arg1);
        }
        field4305++;
    }

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(I)[Lhe;", line = 101)
    public static final class87[] method1727(int arg0) {
        field4313++;
        class87[] var1 = new class87[class160.field2613];
        for (int var2 = arg0; var2 < class160.field2613; var2++) {
            var1[var2] = new class131(class197.field3372, class193.field3301, class247.field4226[var2], class232.field3933[var2], class202.field3451[var2], class201.field3440[var2], class256.field4329[var2], class296.field5018);
        }
        class88.method571(-4);
        return var1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[I", line = 135)
    public final int[] method14(int arg0, int arg1) {
        field4312++;
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            for (int var4 = 0; var4 < class27.field410; var4++) {
                int var5 = (class174.field2978[var4] << 12) / this.field4311 + this.field4307;
                int var6 = var5;
                int var7 = var5;
                int var8 = (class153.field2509[arg1] << 12) / this.field4311 + this.field4310;
                int var9 = var8;
                int var10 = var8;
                int var11 = var5 * var5 >> 12;
                int var12 = var8 * var8 >> 12;
                int var13 = 0;
                while ((var11 + var12) < 16384 && var13 < this.field4309) {
                    var13++;
                    var9 = (var7 * var9 >> 12) * 2 + var10;
                    var7 = var11 + var6 - var12;
                    var12 = var9 * var9 >> 12;
                    var11 = var7 * var7 >> 12;
                }
                var3[var4] = var13 >= (this.field4309 - 1) ? 0 : (var13 << 12) / this.field4309;
            }
        }
        return arg0 > -52 ? (int[]) null : var3;
    }
}
