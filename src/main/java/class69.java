import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class69 extends class220 {

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    private int field952 = 3072;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    private int field951 = 2048;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "I")
    private int field962 = 1024;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public static int field953 = 0;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "Lop;")
    public static class353 field958 = new class353(128);

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
    public static int field959 = 0;

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
    public static int field960 = 0;

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field961 = "flash1:";

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBLil;)V")
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (arg1 != -49) {
            field953 = -67;
        }
        ++field963;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field3131 = ~arg2.method1697(74) == -2;
                }
            } else {
                this.field952 = arg2.method1685(8104);
            }
        } else {
            this.field962 = arg2.method1685(8104);
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(Z)V")
    public static void method439(boolean arg0) {
        if (!arg0) {
            field961 = null;
            field958 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class69() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
    public final void method440(int arg0) {
        this.field951 = -this.field962 + this.field952;
        ++field957;
        if (arg0 != 0) {
            field960 = -114;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method1(52, -27);
        }
        ++field954;
        int[][] var3 = super.field3135.method1774(arg0, -2);
        if (super.field3135.field4087) {
            int[][] var4 = this.method1369(0, (byte) 118, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class344.field5043 < ~var11; ++var11) {
                var8[var11] = (var5[var11] * this.field951 >> 12) + this.field962;
                var9[var11] = this.field962 - -(var6[var11] * this.field951 >> 12);
                var10[var11] = this.field962 - -(var7[var11] * this.field951 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field955;
        int[] var3 = super.field3125.method2005(arg1, (byte) 121);
        if (arg0 != -11543) {
            field953 = -28;
        }
        if (super.field3125.field4676) {
            int[] var4 = this.method1366(0, (byte) -40, arg1);
            for (int var5 = 0; ~class344.field5043 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field951 >> 12) + this.field962;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(BI)Lf;")
    public static final class57 method441(byte arg0, int arg1) {
        ++field956;
        class57 var2 = (class57) class328.field4707.method209(124, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class311.field4453.method1472(arg1, 34, 0);
            class57 var4 = new class57();
            if (var3 != null) {
                var4.method383((byte) 85, new class265(var3), arg1);
            }
            if (arg0 != -110) {
                return null;
            } else {
                class328.field4707.method202(true, var4, (long) arg1);
                return var4;
            }
        }
    }
}
