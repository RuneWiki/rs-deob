import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class179 extends class115 {

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    private int field2545 = 12288;

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "I")
    private int field2555 = 8192;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    private int field2548 = 4096;

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "I")
    private int field2559 = 0;

    @OriginalMember(owner = "client!ah", name = "Z", descriptor = "I")
    private int field2560 = 2048;

    @OriginalMember(owner = "client!ah", name = "db", descriptor = "I")
    private int field2564 = 0;

    @OriginalMember(owner = "client!ah", name = "fb", descriptor = "I")
    private int field2566 = 2048;

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
    public static volatile int field2552 = 0;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2553 = "Discard";

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    public static int field2550 = 0;

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "I")
    public static int field2561 = 0;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!ah", name = "cb", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "Lnj;")
    public static class198 field2556;

    @OriginalMember(owner = "client!ah", name = "eb", descriptor = "Lrf;")
    public static class241 field2565;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V")
    public static void method1159(int arg0) {
        if (arg0 != 0) {
            method1162(71);
        }
        field2553 = null;
        field2565 = null;
        field2556 = null;
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(III)Z")
    private final boolean method1160(int arg0, int arg1, int arg2) {
        ++field2547;
        int var4 = (-arg2 + arg0) * this.field2545 >> 12;
        int var5 = class124.field1788[(var4 * 255 & 1044711) >> 12];
        int var6 = (var5 << 12) / this.field2545;
        int var7 = (var6 << 12) / this.field2555;
        if (arg1 != 0) {
            this.method168(79, (class114) null, 66);
        }
        int var8 = this.field2548 * var7 >> 12;
        return ~(arg0 + arg2) > ~var8 && -var8 < arg0 + arg2;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class179() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BII)Z")
    private final boolean method1161(byte arg0, int arg1, int arg2) {
        ++field2557;
        int var4 = (arg1 + arg2) * this.field2545 >> 12;
        int var5 = class124.field1788[(var4 * 255 & 1047897) >> 12];
        int var6 = (var5 << 12) / this.field2545;
        int var7 = (var6 << 12) / this.field2555;
        if (arg0 >= -29) {
            return true;
        } else {
            int var8 = this.field2548 * var7 >> 12;
            return var8 > -arg2 + arg1 && ~(-var8) > ~(-arg2 + arg1);
        }
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        if (arg0 != 242152972) {
            return null;
        } else {
            ++field2562;
            int[] var3 = super.field1705.method463(arg1, false);
            if (super.field1705.field1072) {
                int var4 = class187.field2664[arg1] + -2048;
                for (int var5 = 0; ~var5 > ~class77.field1178; ++var5) {
                    int var6 = class169.field2444[var5] + -2048;
                    int var7 = this.field2566 + var6;
                    int var8 = var7 >= -2048 ? var7 : var7 - -4096;
                    int var9 = var8 <= 2048 ? var8 : var8 - 4096;
                    int var10 = this.field2564 + var6;
                    int var11 = var10 < -2048 ? var10 - -4096 : var10;
                    int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                    int var13 = this.field2559 + var4;
                    int var14 = var4 - -this.field2560;
                    int var15 = var14 < -2048 ? var14 + 4096 : var14;
                    int var16 = ~var13 > 2047 ? var13 + 4096 : var13;
                    int var17 = ~var15 >= -2049 ? var15 : var15 + -4096;
                    int var18 = ~var16 < -2049 ? var16 + -4096 : var16;
                    var3[var5] = !this.method1160(var18, 0, var9) && !this.method1161((byte) -110, var17, var12) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        ++field2554;
        if (arg0 != -1) {
            this.method170((byte) 29);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field2555 = arg1.method756(arg0 + -29900);
                                }
                            } else {
                                this.field2548 = arg1.method756(-29901);
                            }
                        } else {
                            this.field2545 = arg1.method756(arg0 + -29900);
                        }
                    } else {
                        this.field2560 = arg1.method756(-29901);
                    }
                } else {
                    this.field2564 = arg1.method756(-29901);
                }
            } else {
                this.field2559 = arg1.method756(-29901);
            }
        } else {
            this.field2566 = arg1.method756(-29901);
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
    public final void method170(byte arg0) {
        class276.method1856((byte) 48);
        ++field2551;
        int var2 = -101 / ((arg0 - 78) / 42);
    }

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)V")
    public static final void method1162(int arg0) {
        ++field2546;
        if (arg0 != 5) {
            method1159(119);
        }
        class171.field2454.method260(0);
    }
}
