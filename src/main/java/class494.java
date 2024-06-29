import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class494 extends class739 {

    @OriginalMember(owner = "client!mw", name = "G", descriptor = "I")
    private int field6995 = 2048;

    @OriginalMember(owner = "client!mw", name = "K", descriptor = "I")
    private int field6999 = 3072;

    @OriginalMember(owner = "client!mw", name = "L", descriptor = "I")
    private int field7000 = 1024;

    @OriginalMember(owner = "client!mw", name = "E", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!mw", name = "H", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!mw", name = "I", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!mw", name = "J", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!mw", name = "M", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!mw", name = "F", descriptor = "Lkg;")
    public static class275 field6994;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "(I)V", line = 3)
    public static void method2909(int arg0) {
        field6994 = null;
        if (arg0 != 2) {
            method2909(-11);
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(BI)[[I", line = 13)
    public final int[][] method223(byte arg0, int arg1) {
        ++field6993;
        int[][] var3 = super.field10312.method2191((byte) 52, arg1);
        if (arg0 <= 26) {
            this.method214((class461) null, 53, -10);
        }
        if (super.field10312.field4922) {
            int[][] var4 = this.method4119(2, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class29.field523; ++var11) {
                var8[var11] = this.field7000 - -(var5[var11] * this.field6995 >> 12);
                var9[var11] = (var6[var11] * this.field6995 >> 12) + this.field7000;
                var10[var11] = (var7[var11] * this.field6995 >> 12) + this.field7000;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "()V", line = 59)
    public class494() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)[I", line = 65)
    public final int[] method215(int arg0, int arg1) {
        ++field6997;
        int[] var3 = super.field10311.method2116(arg1, (byte) 98);
        if (arg0 != -23347) {
            return null;
        } else {
            if (super.field10311.field4728) {
                int[] var4 = this.method4115(-125, arg1, 0);
                for (int var5 = 0; var5 < class29.field523; ++var5) {
                    var3[var5] = (var4[var5] * this.field6995 >> 12) + this.field7000;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "(I)V", line = 100)
    public final void method216(int arg0) {
        this.field6995 = -this.field7000 + this.field6999;
        ++field6996;
        if (arg0 != -21773) {
            field6994 = null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lsl;II)V", line = 123)
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field10297 = ~arg0.method2600((byte) -123) == -2;
                }
            } else {
                this.field6999 = arg0.method2566(arg2 + 1);
            }
        } else {
            this.field7000 = arg0.method2566(-2);
        }
        if (arg2 != -3) {
            field6994 = null;
        }
        ++field6998;
    }
}
