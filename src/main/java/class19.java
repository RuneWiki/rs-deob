import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class19 extends class214 {

    @OriginalMember(owner = "client!un", name = "R", descriptor = "I")
    private int field311 = 12288;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "I")
    private int field305 = 2048;

    @OriginalMember(owner = "client!un", name = "X", descriptor = "I")
    private int field317 = 0;

    @OriginalMember(owner = "client!un", name = "W", descriptor = "I")
    private int field316 = 2048;

    @OriginalMember(owner = "client!un", name = "T", descriptor = "I")
    private int field313 = 8192;

    @OriginalMember(owner = "client!un", name = "db", descriptor = "I")
    private int field323 = 4096;

    @OriginalMember(owner = "client!un", name = "eb", descriptor = "I")
    private int field324 = 0;

    @OriginalMember(owner = "client!un", name = "U", descriptor = "I")
    public static int field314 = -1;

    @OriginalMember(owner = "client!un", name = "P", descriptor = "I")
    public static int field309 = 0;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "La;")
    public static class420 field303 = null;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!un", name = "N", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!un", name = "O", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!un", name = "Q", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!un", name = "S", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!un", name = "Y", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!un", name = "Z", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!un", name = "ab", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!un", name = "bb", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!un", name = "cb", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!un", name = "V", descriptor = "Lbc;")
    public static class187 field315;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "[Laq;")
    public static class385[] field304;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "(I)V")
    public final void method12(int arg0) {
        ++field319;
        if (arg0 != 27108) {
            field309 = 14;
        }
        class407.method2390((byte) -110);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)[I")
    public final int[] method14(byte arg0, int arg1) {
        ++field307;
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (super.field3024.field6135) {
            int var4 = class56.field909[arg1] + -2048;
            for (int var5 = 0; var5 < class399.field5585; ++var5) {
                int var6 = class436.field5989[var5] + -2048;
                int var7 = this.field305 + var6;
                int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = var4 - -this.field317;
                int var11 = ~var10 > 2047 ? var10 - -4096 : var10;
                int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                int var13 = var6 - -this.field324;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = var14 <= 2048 ? var14 : var14 - 4096;
                int var16 = var4 - -this.field316;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method164(-2048, var9, var12) && !this.method163(var18, -404351860, var15) ? 0 : 4096;
            }
        }
        if (arg0 != 123) {
            this.method14((byte) 22, -126);
        }
        return var3;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
    public class19() {
        super(0, true);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(B)V")
    public static void method161(byte arg0) {
        if (arg0 == 111) {
            field315 = null;
            field303 = null;
            field304 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BII)V")
    public static final void method162(byte arg0, int arg1, int arg2) {
        class84.field1265 = -class379.field5379 + arg2;
        if (arg0 > -107) {
            field303 = null;
        }
        class266.field3706 = -class379.field5393 + arg1;
        ++field308;
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(III)Z")
    private final boolean method163(int arg0, int arg1, int arg2) {
        ++field310;
        int var4 = (arg0 + arg2) * this.field311 >> 12;
        int var5 = class328.field4534[(var4 * 255 & 1046410) >> 12];
        int var6 = (var5 << 12) / this.field311;
        int var7 = (var6 << 12) / this.field313;
        int var8 = this.field323 * var7 >> 12;
        if (arg1 != -404351860) {
            this.method14((byte) 102, 87);
        }
        return ~var8 < ~(-arg2 + arg0) && ~(-arg2 + arg0) < ~(-var8);
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "(III)Z")
    private final boolean method164(int arg0, int arg1, int arg2) {
        ++field320;
        int var4 = (-arg1 + arg2) * this.field311 >> 12;
        if (arg0 != -2048) {
            field303 = null;
        }
        int var5 = class328.field4534[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field311;
        int var7 = (var6 << 12) / this.field313;
        int var8 = this.field323 * var7 >> 12;
        return ~(arg1 + arg2) > ~var8 && arg1 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Llk;II)V")
    public final void method15(class425 arg0, int arg1, int arg2) {
        ++field312;
        if (arg1 >= -114) {
            this.method163(1, -86, -21);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field313 = arg0.method2508(true);
                                }
                            } else {
                                this.field323 = arg0.method2508(true);
                            }
                        } else {
                            this.field311 = arg0.method2508(true);
                        }
                    } else {
                        this.field316 = arg0.method2508(true);
                    }
                } else {
                    this.field324 = arg0.method2508(true);
                }
            } else {
                this.field317 = arg0.method2508(true);
            }
        } else {
            this.field305 = arg0.method2508(true);
        }
    }
}
