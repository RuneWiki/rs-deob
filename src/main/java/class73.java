import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class73 extends class175 {

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "I")
    private int field1377 = 4096;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "[I")
    private int[] field1382 = new int[3];

    @OriginalMember(owner = "client!q", name = "R", descriptor = "I")
    private int field1378 = 3216;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "I")
    private int field1385 = 3216;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "Lij;")
    public static class50 field1372 = class78.method578(124, "Null");

    @OriginalMember(owner = "client!q", name = "M", descriptor = "I")
    public static int field1373 = -1;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "I")
    public static int field1379 = 0;

    @OriginalMember(owner = "client!q", name = "X", descriptor = "Lij;")
    public static class50 field1384 = class78.method578(121, " loggt sich ein)3");

    @OriginalMember(owner = "client!q", name = "N", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!q", name = "T", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        int[] var3 = super.field2941.method1427(arg1 ^ 16193, arg0);
        ++field1381;
        if (arg1 != -27746) {
            method549((byte) -89);
        }
        if (super.field2941.field3565) {
            int var4 = class117.field2066 * this.field1377 >> 12;
            int[] var5 = this.method1210(0, class108.field1928 & arg0 + -1, arg1 ^ -11529);
            int[] var6 = this.method1210(0, arg0, 16745);
            int[] var7 = this.method1210(0, class108.field1928 & arg0 + 1, 16745);
            for (int var8 = 0; ~class211.field3514 < ~var8; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class161.field2765] + -var6[var8 + 1 & class161.field2765]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var11 > 255) {
                    var11 = 255;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class161.field2762[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = this.field1382[0] * var15 >> 12;
                int var17 = this.field1382[1] * var14 >> 12;
                int var18 = var13 * 4096 >> 8;
                int var19 = this.field1382[2] * var18 >> 12;
                var3[var8] = var16 - -var17 - -var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "g", descriptor = "(I)V")
    private final void method548(int arg0) {
        ++field1376;
        double var2 = Math.cos((double) ((float) this.field1378 / 4096.0F));
        this.field1382[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field1385 / 4096.0F)));
        this.field1382[1] = (int) (4096.0D * Math.cos((double) ((float) this.field1385 / 4096.0F)) * var2);
        this.field1382[2] = (int) (Math.sin((double) ((float) this.field1378 / 4096.0F)) * 4096.0D);
        int var4 = this.field1382[2] * this.field1382[2] >> 12;
        int var5 = this.field1382[1] * this.field1382[1] >> 12;
        int var6 = this.field1382[0] * this.field1382[0] >> 12;
        if (arg0 != -1081180436) {
            this.method44(-125);
        }
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field1382[0] = (this.field1382[0] << 12) / var7;
            this.field1382[2] = (this.field1382[2] << 12) / var7;
            this.field1382[1] = (this.field1382[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(B)V")
    public static final void method549(byte arg0) {
        if (arg0 >= 15) {
            class173.field2882.method762((byte) 117);
            ++field1374;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        ++field1383;
        if (!arg0) {
            method549((byte) -98);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field1378 = arg2.method1441(115);
                }
            } else {
                this.field1385 = arg2.method1441(85);
            }
        } else {
            this.field1377 = arg2.method1441(-40);
        }
    }

    @OriginalMember(owner = "client!q", name = "f", descriptor = "(I)V")
    public final void method44(int arg0) {
        this.method548(-1081180436);
        if (arg0 != 0) {
            this.method39(true, 5, (class217) null);
        }
        ++field1380;
    }

    @OriginalMember(owner = "client!q", name = "h", descriptor = "(I)V")
    public static void method550(int arg0) {
        field1372 = null;
        field1384 = null;
        if (arg0 != -9514) {
            method549((byte) -81);
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class73() {
        super(1, true);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)Lsb;")
    public static final class87 method551(int arg0, int arg1, int arg2, int arg3) {
        class87 var4 = new class87();
        var4.field1676 = arg2;
        ++field1375;
        var4.field1678 = arg0;
        class132.field2304.method445(arg3 + 121, (long) arg1, var4);
        class19.method141(arg0, 0);
        class10 var5 = class89.method698(arg1, (byte) 94);
        if (var5 != null) {
            class140.method979((byte) 49, var5);
        }
        if (class220.field3676 != null) {
            class140.method979((byte) 70, class220.field3676);
            class220.field3676 = null;
        }
        class205.field3406 = false;
        class136.field2368 = 0;
        class2.method12(class70.field1339, arg3 ^ -87, class129.field2267, class231.field3864, class244.field4247);
        if (arg3 != 1) {
            field1373 = -85;
        }
        if (var5 != null) {
            class254.method1716(827759824, false, var5);
        }
        class117.method847(arg0, (byte) -76);
        if (~class48.field871 != 0) {
            class160.method1127(-17126, class48.field871, 1);
        }
        return var4;
    }
}
