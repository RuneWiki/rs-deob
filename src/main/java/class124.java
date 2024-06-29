import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class124 extends class326 {

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    private int field1809 = 32768;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "Lgd;")
    public static class206 field1810 = new class206("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "Lgd;")
    public static class206 field1815 = new class206("K", "T", "K", "K");

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    public static int field1817 = -1;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    public static int field1818;

    static {
        new class206(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIII)V", line = 5)
    public static final void method762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1814;
        if (~arg5 == ~arg6) {
            class429.method2534(arg5, arg2, arg7, arg1, arg4, arg0, -86);
        } else if (arg3 == -275139932) {
            if (-arg5 + arg0 >= class425.field5751 && class136.field1985 >= arg0 - -arg5 && ~class221.field2942 >= ~(-arg6 + arg4) && arg4 - -arg6 <= class205.field2784) {
                class356.method2186(arg1, arg7, arg6, arg2, arg4, 31516, arg5, arg0);
            } else {
                class40.method282(true, arg4, arg1, arg2, arg7, arg0, arg6, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILbt;I)V", line = 30)
    public final void method33(int arg0, class32 arg1, int arg2) {
        ++field1818;
        if (arg2 < -3) {
            if (arg0 != 0) {
                if (arg0 == 1) {
                    super.field4358 = arg1.method201((byte) -108) == 1;
                }
            } else {
                this.field1809 = arg1.method215((byte) 120) << 4;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V", line = 66)
    public static void method763(int arg0) {
        field1810 = null;
        field1815 = null;
        if (arg0 <= 54) {
            method762(21, 89, -118, -97, 78, -1, -85, 56);
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V", line = 77)
    public class124() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IB)[[I", line = 81)
    public final int[][] method48(int arg0, byte arg1) {
        if (arg1 > -52) {
            return null;
        } else {
            ++field1812;
            int[][] var3 = super.field4343.method2356(arg0, 74);
            if (super.field4343.field5336) {
                int[] var4 = this.method1824(1, false, arg0);
                int[] var5 = this.method1824(2, false, arg0);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; var9 < class181.field2495; ++var9) {
                    int var10 = (var4[var9] * 255 & 1048089) >> 12;
                    int var11 = var5[var9] * this.field1809 >> 12;
                    int var12 = class461.field6247[var10] * var11 >> 12;
                    int var13 = class7.field90[var10] * var11 >> 12;
                    int var14 = class459.field6226 & var9 - -(var12 >> 12);
                    int var15 = class266.field3509 & (var13 >> 12) + arg0;
                    int[][] var16 = this.method1828(0, true, var15);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)[I", line = 139)
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 > -6) {
            return null;
        } else {
            ++field1808;
            int[] var3 = super.field4344.method130(arg1, -119);
            if (super.field4344.field286) {
                int[] var4 = this.method1824(1, false, arg1);
                int[] var5 = this.method1824(2, false, arg1);
                for (int var6 = 0; class181.field2495 > var6; ++var6) {
                    int var7 = (4088 & var4[var6]) >> 4;
                    int var8 = var5[var6] * this.field1809 >> 12;
                    int var9 = class461.field6247[var7] * var8 >> 12;
                    int var10 = class7.field90[var7] * var8 >> 12;
                    int var11 = (var9 >> 12) + var6 & class459.field6226;
                    int var12 = class266.field3509 & arg1 - -(var10 >> 12);
                    int[] var13 = this.method1824(0, false, var12);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V", line = 209)
    public final void method65(int arg0) {
        ++field1811;
        class66.method437(false);
        if (arg0 > -100) {
            this.method33(114, (class32) null, -87);
        }
    }
}
