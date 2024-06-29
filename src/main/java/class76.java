import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class76 extends class192 {

    @OriginalMember(owner = "client!rda", name = "I", descriptor = "I")
    private int field1034 = 1024;

    @OriginalMember(owner = "client!rda", name = "N", descriptor = "I")
    private int field1039 = 2048;

    @OriginalMember(owner = "client!rda", name = "Q", descriptor = "I")
    private int field1042 = 3072;

    @OriginalMember(owner = "client!rda", name = "J", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!rda", name = "K", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!rda", name = "L", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!rda", name = "M", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!rda", name = "O", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!rda", name = "P", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!rda", name = "R", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IB)[I")
    public final int[] method118(int arg0, byte arg1) {
        ++field1037;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (super.field2448.field7266) {
            int[] var4 = this.method1253(0, arg0, 0);
            for (int var5 = 0; class561.field7319 > var5; ++var5) {
                var3[var5] = (var4[var5] * this.field1039 >> 12) + this.field1034;
            }
        }
        if (arg1 > -123) {
            this.method109(11, (class418) null, 7);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "()V")
    public class76() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(IB)[[I")
    public final int[][] method107(int arg0, byte arg1) {
        ++field1040;
        int var3 = 20 / ((arg1 - -14) / 34);
        int[][] var4 = super.field2467.method2466(arg0, 0);
        if (super.field2467.field5565) {
            int[][] var5 = this.method1251(0, arg0, (byte) -111);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~class561.field7319 < ~var12; ++var12) {
                var9[var12] = (var6[var12] * this.field1039 >> 12) + this.field1034;
                var10[var12] = (var7[var12] * this.field1039 >> 12) + this.field1034;
                var11[var12] = (var8[var12] * this.field1039 >> 12) + this.field1034;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)Lkq;")
    public static final class700 method617(int arg0) {
        if (arg0 != 5) {
            method617(54);
        }
        ++field1035;
        if (class706.field9838 != null && class386.field4956 != null) {
            for (class700 var1 = (class700) class386.field4956.method1066(true); var1 != null; var1 = (class700) class386.field4956.method1066(true)) {
                class576 var2 = class706.field9833.method2291((byte) 114, var1.field9761);
                if (var2 != null && var2.field7812 && var2.method3147(class706.field9829, (byte) 59)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(B)V")
    public final void method618(byte arg0) {
        ++field1036;
        if (arg0 != 63) {
            this.method109(69, (class418) null, -113);
        }
        this.field1039 = this.field1042 - this.field1034;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILfd;I)V")
    public final void method109(int arg0, class418 arg1, int arg2) {
        ++field1043;
        if (arg2 != -12160) {
            method617(-41);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field2449 = ~arg1.method2396(arg2 ^ -12098) == -2;
                }
            } else {
                this.field1042 = arg1.method2393(-30727);
            }
        } else {
            this.field1034 = arg1.method2393(-30727);
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILoa;II)V")
    public static final void method619(int arg0, class43 arg1, int arg2, int arg3) {
        class408.field5286 = arg1;
        ++field1041;
        class287.field3714 = new class559[arg2][arg3];
        if (class326.field4247 != null) {
            class215.field2772 = class290.method1724(class326.field4247[1], class326.field4247[0], (byte) 29, class326.field4247[3], class326.field4247[2], class326.field4247[4], class326.field4247[5]);
        }
        class224.field2920 = new class559();
        class347.method1996(0);
        if (arg0 != 85) {
            field1038 = 124;
        }
    }
}
