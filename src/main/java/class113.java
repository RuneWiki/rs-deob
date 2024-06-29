import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class113 extends class242 {

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public int field2046;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    private int field2047;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "[[I")
    public int[][] field2038;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "[I")
    public int[] field2039;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "[Z")
    public boolean[] field2043;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field2044 = 0;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)Lpi;", line = 12)
    public static final class313 method799(int arg0, byte arg1) {
        field2040++;
        class313 var2 = (class313) class324.field5460.method229((long) arg0, arg1 ^ 0xFFFFFFC0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class189.field3291.method1275(class71.method522(1, arg0), class70.method517(arg0, (byte) 90), -5211);
        class313 var4 = new class313();
        var4.field5277 = arg0;
        if (var3 != null) {
            var4.method2119(new class14(var3), -13321);
        }
        var4.method2123(-2);
        if (var4.field5303 != -1) {
            var4.method2131(method799(var4.field5303, (byte) 50), (byte) 114, method799(var4.field5304, (byte) 50));
        }
        if (var4.field5321 != -1) {
            var4.method2128(method799(var4.field5321, (byte) 50), method799(var4.field5325, (byte) 50), 0);
        }
        if (arg1 != 50) {
            return (class313) null;
        }
        if (!class162.field2747 && var4.field5299) {
            var4.field5262 = false;
            var4.field5265 = null;
            var4.field5281 = class62.field1053;
            var4.field5329 = 0;
            var4.field5305 = null;
        }
        class324.field5460.method227(-25077, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lkb;IIIIILnf;)V", line = 76)
    public static final void method800(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class67 arg6) {
        field2041++;
        if (arg0 == null) {
            return;
        }
        int var7 = class229.field3939 + class213.field3653 & 0x7FF;
        int var8 = Math.max(arg6.field1258 / 2, arg6.field1295 / 2) + 10;
        int var9 = arg3 * arg3 + arg4 * arg4;
        if (var8 * var8 < var9) {
            return;
        }
        int var10 = class227.field3896[var7];
        int var11 = -1 % ((arg1 - 38) / 58);
        int var12 = var10 * 256 / (class102.field1778 + 256);
        int var13 = class227.field3911[var7];
        int var14 = var13 * 256 / (class102.field1778 + 256);
        int var15 = arg4 * var12 + (arg3 * var14) >> 16;
        int var16 = arg4 * var14 - (arg3 * var12) >> 16;
        if (class108.field1900) {
            ((class326) arg0).method2190(arg2 + (arg6.field1258 / 2) - (arg0.field670 / 2 + -var15), arg6.field1295 / 2 + (arg5 - var16) + -(arg0.field662 / 2), (class326) arg6.method506(-27654, false));
        } else {
            ((class159) arg0).method1076(arg6.field1258 / 2 + arg2 - (-var15 - -(arg0.field670 / 2)), arg6.field1295 / 2 + -(arg0.field662 / 2) + arg5 + -var16, arg6.field1237, arg6.field1224);
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I[B)V", line = 113)
    public class113(int arg0, byte[] arg1) {
        this.field2046 = arg0;
        class14 var3 = new class14(arg1);
        this.field2047 = var3.method93(false);
        this.field2038 = new int[this.field2047][];
        this.field2039 = new int[this.field2047];
        this.field2043 = new boolean[this.field2047];
        for (int var4 = 0; var4 < this.field2047; var4++) {
            this.field2039[var4] = var3.method93(false);
        }
        for (int var5 = 0; var5 < this.field2047; var5++) {
            this.field2043[var5] = var3.method93(false) == 1;
        }
        for (int var6 = 0; var6 < this.field2047; var6++) {
            this.field2038[var6] = new int[var3.method93(false)];
        }
        for (int var7 = 0; var7 < this.field2047; var7++) {
            for (int var8 = 0; var8 < this.field2038[var7].length; var8++) {
                this.field2038[var7][var8] = var3.method93(false);
            }
        }
    }
}
