import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class174 extends class114 {

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    private int field2458 = 4096;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
    private int field2465 = 4096;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
    private int field2464 = 4096;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    public static int field2457 = -2;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "[I")
    public static int[] field2459;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "[[[Lbe;")
    public static class91[][][] field2456;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILbj;)Luf;")
    public static final class176 method1099(int arg0, class215 arg1) {
        if (arg0 != 14055) {
            return null;
        } else {
            ++field2463;
            return new class176(arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1403(6591), arg1.method1403(6591), arg1.method1374((byte) -60));
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        ++field2461;
        if (arg0 != -112) {
            this.field2464 = -3;
        }
        int[][] var3 = super.field1627.method104(arg1, (byte) 108);
        if (super.field1627.field280) {
            int[][] var4 = this.method727(0, arg1, 842);
            int[] var5 = var4[1];
            int[] var6 = var3[1];
            int[] var7 = var4[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; class145.field2009 > var11; ++var11) {
                int var12 = var7[var11];
                int var13 = var5[var11];
                int var14 = var8[var11];
                if (var12 == var14 && ~var13 == ~var14) {
                    var10[var11] = this.field2465 * var12 >> 12;
                    var6[var11] = this.field2458 * var14 >> 12;
                    var9[var11] = this.field2464 * var13 >> 12;
                } else {
                    var10[var11] = this.field2465;
                    var6[var11] = this.field2458;
                    var9[var11] = this.field2464;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        ++field2462;
        if (arg2 != 12953) {
            this.method13((class215) null, -77, 15);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field2464 = arg0.method1379(-84);
                }
            } else {
                this.field2458 = arg0.method1379(-124);
            }
        } else {
            this.field2465 = arg0.method1379(-121);
        }
    }

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "(I)V")
    public static void method1100(int arg0) {
        int var1 = -45 / ((-39 - arg0) / 61);
        field2459 = null;
        field2456 = null;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class174() {
        super(1, false);
    }
}
