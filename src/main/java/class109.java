import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class109 extends class51 {

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "[I")
    private int[] field2443 = new int[3];

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
    private int field2447 = 4096;

    @OriginalMember(owner = "client!mb", name = "lb", descriptor = "I")
    private int field2453 = 4096;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    private int field2442 = 4096;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    private int field2448 = 409;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
    public static int field2450 = 0;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
    public static int field2449 = -1;

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    public static volatile int field2446 = -1;

    @OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
    public static int field2454 = 255;

    @OriginalMember(owner = "client!mb", name = "ob", descriptor = "I")
    public static int field2456 = 0;

    @OriginalMember(owner = "client!mb", name = "nb", descriptor = "Lhc;")
    public static class66 field2455 = new class66(8);

    @OriginalMember(owner = "client!mb", name = "pb", descriptor = "Lea;")
    public static class38 field2457 = class9.method46((byte) 111, "null");

    @OriginalMember(owner = "client!mb", name = "qb", descriptor = "Lea;")
    public static class38 field2458 = class9.method46((byte) 114, "<col=00ff80>");

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)V")
    public static void method870(int arg0) {
        field2457 = null;
        if (arg0 == 4096) {
            field2458 = null;
            field2455 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lef;Z)Lef;")
    public static final class43 method871(class43 arg0, boolean arg1) {
        ++field2444;
        int var2 = class111.method884((byte) 125, class40.method299(arg0, 25));
        if (~var2 == -1) {
            return null;
        } else {
            for (int var3 = 0; var3 < var2; ++var3) {
                arg0 = class98.method813(arg0.field1005, 4096);
                if (arg0 == null) {
                    return null;
                }
            }
            if (arg1) {
                field2456 = 60;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        ++field2441;
        if (!arg2) {
            field2446 = -80;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            int var5 = arg0.method466(-26256544);
                            this.field2443[2] = class52.method380(var5, 255) >> 12;
                            this.field2443[1] = class52.method380(4080, var5 >> 4);
                            this.field2443[0] = class52.method380(16711680, var5) << 4;
                        }
                    } else {
                        this.field2447 = arg0.method511(-123);
                    }
                } else {
                    this.field2453 = arg0.method511(102);
                }
            } else {
                this.field2442 = arg0.method511(-123);
            }
        } else {
            this.field2448 = arg0.method511(-121);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field2451;
        int[][] var3 = super.field1292.method720(false, arg1);
        if (super.field1292.field2032) {
            int[][] var4 = this.method377(0, arg1, (byte) -113);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class86.field2008 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field2443[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field2448 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field2443[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field2448) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field2443[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field2448 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field2447 * var12 >> 12;
                            var9[var11] = this.field2453 * var14 >> 12;
                            var10[var11] = this.field2442 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return arg0 <= 111 ? null : var3;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class109() {
        super(1, false);
    }
}
