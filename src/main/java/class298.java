import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class298 extends class114 {

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "I")
    private int field4752 = 3216;

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "[I")
    private int[] field4750 = new int[3];

    @OriginalMember(owner = "client!sj", name = "X", descriptor = "I")
    private int field4757 = 3216;

    @OriginalMember(owner = "client!sj", name = "Y", descriptor = "I")
    private int field4758 = 4096;

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "Ljava/lang/String;")
    public static String field4754 = "Loaded sprites";

    @OriginalMember(owner = "client!sj", name = "ab", descriptor = "[Lwk;")
    public static class195[] field4760 = new class195[14];

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!sj", name = "W", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!sj", name = "Z", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "Ljava/lang/String;")
    public static String field4746;

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "[I")
    public static int[] field4748;

    @OriginalMember(owner = "client!sj", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field4755;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)V")
    public static final void method2003(int arg0, int arg1) {
        int var2 = -115 / ((35 - arg0) / 61);
        class145.field2008 = -1;
        ++field4751;
        if (arg1 == 37) {
            class97.field1407 = 3.0F;
        } else if (arg1 != 50) {
            if (~arg1 != -76) {
                if (~arg1 != -101) {
                    if (~arg1 == -201) {
                        class97.field1407 = 16.0F;
                    }
                } else {
                    class97.field1407 = 8.0F;
                }
            } else {
                class97.field1407 = 6.0F;
            }
        } else {
            class97.field1407 = 4.0F;
        }
        class145.field2008 = -1;
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V")
    private final void method2004(byte arg0) {
        ++field4756;
        double var2 = Math.cos((double) ((float) this.field4752 / 4096.0F));
        this.field4750[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field4757 / 4096.0F)));
        this.field4750[1] = (int) (var2 * Math.cos((double) ((float) this.field4757 / 4096.0F)) * 4096.0D);
        this.field4750[2] = (int) (4096.0D * Math.sin((double) ((float) this.field4752 / 4096.0F)));
        int var4 = this.field4750[2] * this.field4750[2] >> 12;
        int var5 = this.field4750[1] * this.field4750[1] >> 12;
        int var6 = this.field4750[0] * this.field4750[0] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var6 - -var5 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field4750[0] = (this.field4750[0] << 12) / var7;
            this.field4750[1] = (this.field4750[1] << 12) / var7;
            this.field4750[2] = (this.field4750[2] << 12) / var7;
        }
        if (arg0 != 2) {
            this.method16(25, false);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        this.method2004((byte) 2);
        if (arg0 >= 101) {
            ++field4749;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        ++field4747;
        if (arg1) {
            return null;
        } else {
            int[] var3 = super.field1630.method302(arg0, -128);
            if (super.field1630.field710) {
                int var4 = class132.field1837 * this.field4758 >> 12;
                int[] var5 = this.method729(class134.field1840 & arg0 + -1, 0, 0);
                int[] var6 = this.method729(arg0, 0, 0);
                int[] var7 = this.method729(class134.field1840 & arg0 + 1, 0, 0);
                for (int var8 = 0; ~var8 > ~class145.field2009; ++var8) {
                    int var9 = (var6[class309.field4977 & var8 + -1] + -var6[var8 + 1 & class309.field4977]) * var4 >> 12;
                    int var10 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var11 = var9 >> 4;
                    if (~var11 > -1) {
                        var11 = -var11;
                    }
                    int var12 = var10 >> 4;
                    if (var11 > 255) {
                        var11 = 255;
                    }
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 255 & class223.field3466[((var12 - -1) * var12 >> 1) + var11];
                    int var14 = var13 * 4096 >> 8;
                    int var15 = this.field4750[2] * var14 >> 12;
                    int var16 = var10 * var13 >> 8;
                    int var17 = this.field4750[1] * var16 >> 12;
                    int var18 = var9 * var13 >> 8;
                    int var19 = this.field4750[0] * var18 >> 12;
                    var3[var8] = var17 + var19 + var15;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "(I)V")
    public static void method2005(int arg0) {
        field4755 = null;
        field4746 = null;
        field4754 = null;
        if (arg0 != -32325) {
            method2003(98, 123);
        }
        field4760 = null;
        field4748 = null;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class298() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        ++field4753;
        if (arg2 != 12953) {
            method2005(111);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field4752 = arg0.method1379(-119);
                }
            } else {
                this.field4757 = arg0.method1379(-77);
            }
        } else {
            this.field4758 = arg0.method1379(-79);
        }
    }
}
