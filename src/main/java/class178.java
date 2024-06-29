import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class178 extends class194 {

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "[I")
    private int[] field2075 = new int[3];

    @OriginalMember(owner = "client!lr", name = "N", descriptor = "I")
    private int field2080 = 4096;

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "I")
    private int field2077 = 4096;

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
    private int field2076 = 409;

    @OriginalMember(owner = "client!lr", name = "Q", descriptor = "I")
    private int field2083 = 4096;

    @OriginalMember(owner = "client!lr", name = "P", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!lr", name = "O", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!lr", name = "R", descriptor = "Z")
    public static boolean field2084;

    static {
        new class72("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field2082 = 0;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V", line = 181)
    public class178() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILbg;)V", line = 11)
    public final void method54(int arg0, int arg1, class242 arg2) {
        ++field2079;
        int var4 = -62 / ((arg1 - 52) / 61);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            int var6 = arg2.method1545(8);
                            this.field2075[2] = class191.method1183(255, var6) >> 12;
                            this.field2075[1] = class191.method1183(var6 >> 4, 4080);
                            this.field2075[0] = class191.method1183(267386880, var6 << 4);
                        }
                    } else {
                        this.field2083 = arg2.method1587((byte) -102);
                    }
                } else {
                    this.field2080 = arg2.method1587((byte) -102);
                }
            } else {
                this.field2077 = arg2.method1587((byte) -102);
            }
        } else {
            this.field2076 = arg2.method1587((byte) -102);
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(II)[[I", line = 83)
    public final int[][] method59(int arg0, int arg1) {
        if (arg0 != -730) {
            return null;
        } else {
            ++field2078;
            int[][] var3 = super.field2283.method1667(arg1, arg0 + 657);
            if (super.field2283.field3451) {
                int[][] var4 = this.method1200(60, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class138.field1579 < ~var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field2075[0] + var12;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (this.field2076 < var13) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field2075[1] + var14;
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (this.field2076 < var15) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = -this.field2075[2] + var16;
                            if (~var17 > -1) {
                                var17 = -var17;
                            }
                            if (~var17 < ~this.field2076) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field2083 * var12 >> 12;
                                var9[var11] = this.field2080 * var14 >> 12;
                                var10[var11] = this.field2077 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIII)V", line = 195)
    public static final void method1119(int arg0, int arg1, int arg2, int arg3) {
        if (class134.field1536 != null) {
            class134.field1536[arg0][arg1] = (arg3 & 2040) << 21 | arg2 & 16777215;
        }
    }
}
