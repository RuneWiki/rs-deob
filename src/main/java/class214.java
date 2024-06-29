import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class214 extends class198 {

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "I")
    private int field3422 = 3216;

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "I")
    private int field3421 = 3216;

    @OriginalMember(owner = "client!bm", name = "S", descriptor = "I")
    private int field3425 = 4096;

    @OriginalMember(owner = "client!bm", name = "Q", descriptor = "[I")
    private int[] field3423 = new int[3];

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "[I")
    public static int[] field3420 = new int[500];

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!bm", name = "R", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!bm", name = "U", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!bm", name = "T", descriptor = "[I")
    public static int[] field3426;

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
    public class214() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "(I)V")
    public static void method1500(int arg0) {
        if (arg0 >= -7) {
            field3420 = null;
        }
        field3420 = null;
        field3426 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIII)V")
    public static final void method1501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3417;
        if (~arg3 <= ~class53.field711 && ~class87.field1356 <= ~arg4 && ~arg2 <= ~class63.field941 && arg1 <= class75.field1180) {
            class128.method849(arg0, arg1, arg3, arg2, arg4, 19114);
        } else {
            class163.method1078(arg0, arg1, arg3, arg2, arg4, -121);
        }
        if (arg5 >= -96) {
            method1500(74);
        }
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(B)V")
    private final void method1502(byte arg0) {
        int var2 = -69 % ((arg0 - 78) / 48);
        ++field3419;
        double var3 = Math.cos((double) ((float) this.field3422 / 4096.0F));
        this.field3423[0] = (int) (4096.0D * Math.sin((double) ((float) this.field3421 / 4096.0F)) * var3);
        this.field3423[1] = (int) (4096.0D * Math.cos((double) ((float) this.field3421 / 4096.0F)) * var3);
        this.field3423[2] = (int) (Math.sin((double) ((float) this.field3422 / 4096.0F)) * 4096.0D);
        int var5 = this.field3423[1] * this.field3423[1] >> 12;
        int var6 = this.field3423[0] * this.field3423[0] >> 12;
        int var7 = this.field3423[2] * this.field3423[2] >> 12;
        int var8 = (int) (Math.sqrt((double) (var5 + var6 - -var7 >> 12)) * 4096.0D);
        if (~var8 != -1) {
            this.field3423[2] = (this.field3423[2] << 12) / var8;
            this.field3423[0] = (this.field3423[0] << 12) / var8;
            this.field3423[1] = (this.field3423[1] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)V")
    public final void method142(byte arg0) {
        ++field3416;
        this.method1502((byte) -6);
        int var2 = 121 / ((-46 - arg0) / 47);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        ++field3427;
        if (!arg0) {
            this.method142((byte) -88);
        }
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (super.field3134.field69) {
            int var4 = class31.field392 * this.field3425 >> 12;
            int[] var5 = this.method1367((byte) -79, 0, class52.field704 & arg1 + -1);
            int[] var6 = this.method1367((byte) -79, 0, arg1);
            int[] var7 = this.method1367((byte) -79, 0, class52.field704 & arg1 + 1);
            for (int var8 = 0; ~class42.field590 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class227.field3594 & var8 + -1] + -var6[var8 + 1 & class227.field3594]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var9 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class92.field1405[var11 - -((var12 + 1) * var12 >> 1)];
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field3423[1] * var16 >> 12;
                int var18 = this.field3423[0] * var15 >> 12;
                int var19 = this.field3423[2] * var14 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)V")
    public static final void method1503(int arg0, int arg1) {
        ++field3418;
        class184.field2862 = -1;
        class187.field2897 = arg0;
        class120.field1849 = arg1;
        class162.method1073(67);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field3422 = arg1.method1419(90);
                }
            } else {
                this.field3421 = arg1.method1419(67);
            }
        } else {
            this.field3425 = arg1.method1419(66);
        }
        ++field3424;
        int var5 = 52 % ((arg0 - 60) / 61);
    }
}
