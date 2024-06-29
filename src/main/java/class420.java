import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class420 extends class80 {

    @OriginalMember(owner = "client!ot", name = "P", descriptor = "I")
    private int field6333 = 1;

    @OriginalMember(owner = "client!ot", name = "Q", descriptor = "I")
    private int field6334 = 204;

    @OriginalMember(owner = "client!ot", name = "N", descriptor = "I")
    private int field6331 = 1;

    @OriginalMember(owner = "client!ot", name = "R", descriptor = "Leo;")
    public static class196 field6335 = class76.method683(6);

    @OriginalMember(owner = "client!ot", name = "S", descriptor = "Z")
    public static boolean field6336 = false;

    @OriginalMember(owner = "client!ot", name = "U", descriptor = "[Z")
    public static boolean[] field6338 = new boolean[100];

    @OriginalMember(owner = "client!ot", name = "I", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!ot", name = "J", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!ot", name = "L", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!ot", name = "M", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!ot", name = "O", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!ot", name = "T", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!ot", name = "V", descriptor = "Lve;")
    public static class351 field6339;

    @OriginalMember(owner = "client!ot", name = "W", descriptor = "[Lo;")
    public static class24[] field6340;

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
    public class420() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field6328;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (arg1 != -16828) {
            return null;
        } else {
            if (super.field1601.field124) {
                for (int var4 = 0; ~var4 > ~class137.field2308; ++var4) {
                    int var5 = class460.field6860[var4];
                    int var6 = class44.field795[arg0];
                    int var7 = this.field6331 * var5 >> 12;
                    int var8 = this.field6333 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field6331) * this.field6331;
                    int var10 = var6 % (4096 / this.field6333) * this.field6333;
                    if (~this.field6334 < ~var10) {
                        for (var7 -= var8; var7 < 0; var7 += 4) {
                        }
                        while (~var7 < -4) {
                            var7 -= 4;
                        }
                        if (var7 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (this.field6334 > var9) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (~this.field6334 < ~var9) {
                        int var11;
                        for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                        }
                        while (~var11 < -4) {
                            var11 -= 4;
                        }
                        if (var11 > 0) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(B)V")
    public static final void method2566(byte arg0) {
        ++field6329;
        if (arg0 < -17) {
            if (class179.field2910 == 5) {
                class179.field2910 = 6;
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "(I)V")
    public static void method2567(int arg0) {
        field6340 = null;
        if (arg0 > -20) {
            method2568((byte) -106, -20);
        }
        field6339 = null;
        field6338 = null;
        field6335 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BI)Z")
    public static final boolean method2568(byte arg0, int arg1) {
        int var2 = -42 % ((48 - arg0) / 57);
        ++field6327;
        return arg1 == 45 || arg1 == 3 || arg1 == 1001 || arg1 == 30 || arg1 == 19;
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(IIB)Z")
    public static final boolean method2569(int arg0, int arg1, byte arg2) {
        if (arg2 != 31) {
            method2569(-105, 26, (byte) -113);
        }
        ++field6332;
        if (!(class71.method611(arg1, arg0, 108) | (arg1 & 65536) != 0) && !class491.method2966(0, arg1, arg0)) {
            return (arg0 & 55) == 0 && class181.method1237(arg1, 0, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        int var4 = 32 % ((28 - arg1) / 53);
        ++field6330;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field6334 = arg2.method1841((byte) -123);
                }
            } else {
                this.field6333 = arg2.method1858(-3256);
            }
        } else {
            this.field6331 = arg2.method1858(-3256);
        }
    }
}
