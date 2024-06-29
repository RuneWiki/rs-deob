import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class251 extends class157 {

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
    private int field4508 = -1;

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "Lcc;")
    public static class209 field4509 = class95.method669(104, "Chargement des textures )2 ");

    @OriginalMember(owner = "client!fj", name = "O", descriptor = "Lla;")
    public static class95 field4507 = new class95(50);

    @OriginalMember(owner = "client!fj", name = "W", descriptor = "Lcc;")
    public static class209 field4515 = class95.method669(118, " ");

    @OriginalMember(owner = "client!fj", name = "ab", descriptor = "Z")
    public static boolean field4519 = false;

    @OriginalMember(owner = "client!fj", name = "db", descriptor = "Lcc;")
    public static class209 field4522 = class95.method669(107, "l");

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!fj", name = "R", descriptor = "I")
    public int field4510;

    @OriginalMember(owner = "client!fj", name = "S", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!fj", name = "U", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!fj", name = "V", descriptor = "I")
    public int field4514;

    @OriginalMember(owner = "client!fj", name = "X", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!fj", name = "Y", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!fj", name = "bb", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!fj", name = "cb", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!fj", name = "Z", descriptor = "[I")
    public int[] field4518;

    @OriginalMember(owner = "client!fj", name = "T", descriptor = "[Lkb;")
    public static class53[] field4512;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V")
    public final void method807(byte arg0) {
        ++field4516;
        super.method807(arg0);
        this.field4518 = null;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(B)V")
    public static void method1736(byte arg0) {
        field4512 = null;
        field4515 = null;
        field4507 = null;
        field4509 = null;
        if (arg0 <= 6) {
            field4512 = null;
        }
        field4522 = null;
    }

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "(I)Z")
    public final boolean method1737(int arg0) {
        ++field4517;
        if (this.field4518 != null) {
            return true;
        } else {
            if (arg0 != -24871) {
                this.method1737(98);
            }
            if (~this.field4508 <= -1) {
                class269 var2 = class181.field3278 >= 0 ? class224.method1578(this.field4508, 95, class229.field4164, class181.field3278) : class161.method1114(this.field4508, class229.field4164, (byte) -5);
                var2.method1835();
                this.field4514 = var2.field4197;
                this.field4518 = var2.field4801;
                this.field4510 = var2.field4192;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)I")
    public final int method1095(int arg0) {
        if (arg0 != -1) {
            field4520 = -101;
        }
        ++field4513;
        return this.field4508;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[[I")
    public int[][] method250(int arg0, int arg1) {
        int[][] var3 = super.field2872.method533(arg1, 3);
        ++field4506;
        if (arg0 != 1) {
            this.method250(3, 105);
        }
        if (super.field2872.field1434 && this.method1737(-24871)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = (~class79.field1469 == ~this.field4510 ? arg1 : this.field4510 * arg1 / class79.field1469) * this.field4514;
            int[] var7 = var3[2];
            if (class226.field4124 != this.field4514) {
                for (int var8 = 0; ~var8 > ~class226.field4124; ++var8) {
                    int var9 = this.field4514 * var8 / class226.field4124;
                    int var10 = this.field4518[var6 + var9];
                    var7[var8] = class27.method220(var10 << 4, 4080);
                    var5[var8] = class27.method220(65280, var10) >> 4;
                    var4[var8] = class27.method220(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; ~class226.field4124 < ~var11; ++var11) {
                    int var12 = this.field4518[var6++];
                    var7[var11] = class27.method220(4080, var12 << 4);
                    var5[var11] = class27.method220(var12 >> 4, 4080);
                    var4[var11] = class27.method220(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class251() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (arg1 >= -29) {
            this.method807((byte) 107);
        }
        ++field4511;
        if (~arg0 == -1) {
            this.field4508 = arg2.method736(121);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)V")
    public static final void method1738(int arg0, int arg1) {
        ++field4521;
        if (arg1 <= -126) {
            if (arg0 != 0) {
                if (~arg0 == -2) {
                    class207.method1408(3);
                } else if (~arg0 == -3) {
                    class7.method69(4);
                } else {
                    throw new RuntimeException();
                }
            }
        }
    }
}
