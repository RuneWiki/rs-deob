import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class113 extends class747 {

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
    private int field1512 = -1;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "[I")
    public static int[] field1511 = new int[4096];

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
    private int field1519;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "Lkr;")
    public static class602 field1523;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "[I")
    private int[] field1516;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "[I")
    public static int[] field1518;

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "[Lfd;")
    public static class298[] field1513;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)[[I")
    public final int[][] method688(int arg0, int arg1) {
        ++field1508;
        int var3 = -70 / ((35 - arg0) / 58);
        int[][] var4 = super.field10289.method2200(0, arg1);
        if (super.field10289.field4906) {
            int var5 = this.field1522 * (class414.field5865 != this.field1519 ? this.field1519 * arg1 / class414.field5865 : arg1);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            if (~class73.field1095 == ~this.field1522) {
                for (int var9 = 0; class73.field1095 > var9; ++var9) {
                    int var10 = this.field1516[var5++];
                    var8[var9] = class665.method3759(4080, var10 << 4);
                    var7[var9] = class665.method3759(var10, 65280) >> 4;
                    var6[var9] = class665.method3759(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class73.field1095; ++var11) {
                    int var12 = this.field1522 * var11 / class73.field1095;
                    int var13 = this.field1516[var5 - -var12];
                    var8[var11] = class665.method3759(255, var13) << 4;
                    var7[var11] = class665.method3759(var13 >> 4, 4080);
                    var6[var11] = class665.method3759(var13 >> 12, 4080);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class113() {
        super(0, false);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ldc;II)V")
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg1 != 11608) {
            this.method727((byte) -105);
        }
        ++field1514;
        if (arg2 == 0) {
            this.field1512 = arg0.method482(-772591672);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)V")
    public final void method725(int arg0, int arg1, byte arg2) {
        super.method725(arg0, arg1, arg2);
        ++field1521;
        if (this.field1512 >= 0 && class182.field2497 != null) {
            int var4 = !class182.field2497.method521(this.field1512, 110).field3556 ? 128 : 64;
            this.field1516 = class182.field2497.method519(-6839, this.field1512, 1.0F, var4, var4, false);
            this.field1522 = var4;
            this.field1519 = var4;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)I")
    public final int method726(byte arg0) {
        ++field1517;
        if (arg0 <= 122) {
            this.method725(38, -4, (byte) -119);
        }
        return this.field1512;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public final void method727(byte arg0) {
        ++field1510;
        super.method727(arg0);
        this.field1516 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method728(String arg0, boolean arg1) {
        ++field1520;
        if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < class97.field1370; ++var2) {
                if (arg0.equalsIgnoreCase(class532.field7393[var2])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class557.field7749[var2])) {
                    return true;
                }
            }
            if (!arg1) {
                field1511 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
    public static void method729(int arg0) {
        field1523 = null;
        field1513 = null;
        field1518 = null;
        field1511 = null;
        if (arg0 != 1) {
            field1523 = null;
        }
    }
}
