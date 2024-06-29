import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class8 extends class114 {

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
    private int field87 = 1;

    @OriginalMember(owner = "client!mm", name = "Z", descriptor = "I")
    private int field98 = 0;

    @OriginalMember(owner = "client!mm", name = "ab", descriptor = "I")
    private int field99 = 0;

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "Llh;")
    public static class58 field89 = new class58();

    @OriginalMember(owner = "client!mm", name = "T", descriptor = "Lim;")
    public static class178 field92 = null;

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!mm", name = "U", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!mm", name = "V", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!mm", name = "W", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!mm", name = "X", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!mm", name = "Y", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!mm", name = "S", descriptor = "Lui;")
    public static class286 field91;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -4) {
                    this.field87 = arg0.method1374((byte) -60);
                }
            } else {
                this.field99 = arg0.method1374((byte) -60);
            }
        } else {
            this.field98 = arg0.method1374((byte) -60);
        }
        ++field90;
        if (arg2 != 12953) {
            this.method13((class215) null, 65, -87);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lim;Z)V")
    public static final void method44(class178 arg0, boolean arg1) {
        ++field85;
        class178 var2 = class81.method516(arg0, 1910073168);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class218.field3386;
            var4 = class174.field2460;
        } else {
            var4 = var2.field2571;
            var3 = var2.field2529;
        }
        class25.method158(arg1, arg0, -1, var4, var3);
        class100.method646((byte) -58, var4, var3, arg0);
    }

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "(I)V")
    public static final void method45(int arg0) {
        if (class110.field1585 != null) {
            class110.field1585.method871(32646);
        }
        if (class156.field2158 != null) {
            class156.field2158.method871(32646);
        }
        if (arg0 == 4087) {
            ++field97;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZIIII)V")
    public static final void method46(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 113 % ((23 - arg4) / 50);
        ++field96;
        if (class311.method2104(42, arg2)) {
            class227.method1500(class262.field4214[arg2], arg3, 0, arg0, -1, arg1);
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V")
    public class8() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(Z)V")
    public static void method47(boolean arg0) {
        if (!arg0) {
            field92 = null;
        }
        field89 = null;
        field92 = null;
        field91 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBI)I")
    public static final int method48(int arg0, byte arg1, int arg2) {
        int var3 = -111 % ((arg1 - 76) / 40);
        ++field88;
        int var4 = 1;
        while (arg2 > 1) {
            if (~(arg2 & 1) != -1) {
                var4 = arg0 * var4;
            }
            arg2 >>= 1;
            arg0 *= arg0;
        }
        if (arg2 == 1) {
            return arg0 * var4;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        class288.method1923((byte) -98);
        if (arg0 >= 101) {
            ++field95;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field86;
            int[] var3 = super.field1630.method302(arg0, -120);
            if (super.field1630.field710) {
                int var4 = class159.field2209[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; var6 < class145.field2009; ++var6) {
                    int var7 = class99.field1434[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var9;
                    if (this.field98 == 0) {
                        var9 = (var7 - var4) * this.field87;
                    } else {
                        int var10 = var5 * var5 + var8 * var8 >> 12;
                        int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                        var9 = (int) ((double) (this.field87 * var11) * 3.141592653589793D);
                    }
                    int var12 = var9 - (var9 & -4096);
                    if (this.field99 != 0) {
                        if (this.field99 == 2) {
                            var12 -= 2048;
                            if (~var12 > -1) {
                                var12 = -var12;
                            }
                            var12 = -var12 + 2048 << 1;
                        }
                    } else {
                        var12 = class197.field3023[(var12 & 4087) >> 4] - -4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }
}
