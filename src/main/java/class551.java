import jaclib.memory.Buffer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class551 extends class215 implements class128 {

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    private int field7695;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field7698 = 0;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field7694 = new Hashtable();

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "[I")
    public static int[] field7703 = new int[256];

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Ljv;")
    public static class81 field7702 = new class81();

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Ljava/lang/String;")
    public static String field7704 = null;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field7696;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field7697;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)I")
    public final int method960(int arg0) {
        ++field7692;
        return arg0 != -21047 ? 18 : 0;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public static void method3200(int arg0) {
        field7704 = null;
        if (arg0 != 16720915) {
            field7698 = -82;
        }
        field7694 = null;
        field7702 = null;
        field7703 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)J")
    public final long method961(boolean arg0) {
        ++field7697;
        if (arg0) {
            this.method960(34);
        }
        return super.field2847.getAddress();
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)I")
    public static final int method3201(int arg0, int arg1) {
        ++field7700;
        double var2 = (double) ((arg1 & 16720915) >> 16) / 256.0D;
        double var4 = (double) (255 & arg1 >> 8) / 256.0D;
        double var6 = (double) (arg1 & 255) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (-var8 + var10) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 != var10) {
                if (var6 == var10) {
                    var12 = (var2 - var4) / (var10 - var8) + 4.0D;
                }
            } else {
                var12 = (-var2 + var6) / (var10 - var8) + 2.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (-var8 + var10) / (2.0D - var10 + -var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) ((double) arg0 * var18);
        int var21 = (int) (var14 * 256.0D);
        if (var21 >= 0) {
            if (var21 > 255) {
                var21 = 255;
            }
        } else {
            var21 = 0;
        }
        int var22 = (int) (var16 * 256.0D);
        if (~var22 <= -1) {
            if (var22 > 255) {
                var22 = 255;
            }
        } else {
            var22 = 0;
        }
        if (~var22 < -244) {
            var21 >>= 4;
        } else if (~var22 >= -218) {
            if (~var22 >= -193) {
                if (~var22 < -180) {
                    var21 >>= 1;
                }
            } else {
                var21 >>= 2;
            }
        } else {
            var21 >>= 3;
        }
        return (var22 >> 1) + (var21 >> 5 << 7) + ((63 & var20 >> 2) << 10);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II[BB)V")
    public final void method958(int arg0, int arg1, byte[] arg2, byte arg3) {
        this.method1374(arg2, arg1);
        int var5 = 51 / ((arg3 - -59) / 35);
        ++field7696;
        this.field7695 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lbi;I[BI)V")
    public class551(class483 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field7695 = arg1;
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)Liu;")
    public static final class580 method3202(int arg0) {
        if (arg0 < 74) {
            field7704 = null;
        }
        ++field7701;
        class580 var1 = (class580) class299.field3933.method157((byte) 107);
        if (var1 != null) {
            --class461.field6214;
            return var1;
        } else {
            return new class580();
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I")
    public final int method959(int arg0) {
        if (arg0 <= 110) {
            return -98;
        } else {
            ++field7693;
            return this.field7695;
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lbi;ILjaclib/memory/Buffer;)V")
    public class551(class483 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field7695 = arg1;
    }
}
