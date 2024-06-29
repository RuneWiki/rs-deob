import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class272 extends class325 {

    @OriginalMember(owner = "client!sda", name = "F", descriptor = "I")
    private int field4016 = 32768;

    @OriginalMember(owner = "client!sda", name = "C", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!sda", name = "D", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!sda", name = "G", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!sda", name = "H", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!sda", name = "I", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!sda", name = "E", descriptor = "Leba;")
    public static class615 field4015;

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "()V", line = 3)
    public class272() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Z)V", line = 7)
    public final void method101(boolean arg0) {
        class38.method266(arg0);
        ++field4018;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(BI)[I", line = 17)
    public final int[] method100(byte arg0, int arg1) {
        ++field4017;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (super.field4727.field6067) {
            int[] var4 = this.method2062(arg1, 1, (byte) 33);
            int[] var5 = this.method2062(arg1, 2, (byte) 33);
            for (int var6 = 0; var6 < class261.field3874; ++var6) {
                int var7 = (var4[var6] & 4089) >> 4;
                int var8 = var5[var6] * this.field4016 >> 12;
                int var9 = class224.field3075[var7] * var8 >> 12;
                int var10 = class406.field5886[var7] * var8 >> 12;
                int var11 = class625.field8423 & var6 - -(var9 >> 12);
                int var12 = class566.field7574 & (var10 >> 12) + arg1;
                int[] var13 = this.method2062(var12, 0, (byte) 33);
                var3[var6] = var13[var11];
            }
        }
        if (arg0 < 21) {
            field4015 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V", line = 67)
    public static final void method1771(int arg0) {
        ++field4014;
        class393.field5800 = arg0;
        class729.field10120 = new class720[50];
    }

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "(B)V", line = 78)
    public static void method1772(byte arg0) {
        field4015 = null;
        int var1 = 21 / ((arg0 - 34) / 44);
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IB)[[I", line = 88)
    public final int[][] method360(int arg0, byte arg1) {
        ++field4019;
        if (arg1 != -9) {
            method1772((byte) -95);
        }
        int[][] var3 = super.field4733.method1251((byte) 114, arg0);
        if (super.field4733.field2369) {
            int[] var4 = this.method2062(arg0, 1, (byte) 33);
            int[] var5 = this.method2062(arg0, 2, (byte) 33);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class261.field3874; ++var9) {
                int var10 = (1045973 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field4016 >> 12;
                int var12 = class224.field3075[var10] * var11 >> 12;
                int var13 = class406.field5886[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class625.field8423;
                int var15 = class566.field7574 & (var13 >> 12) + arg0;
                int[][] var16 = this.method2063(0, 1, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Ljp;IB)V", line = 145)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        ++field4013;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field4738 = ~arg0.method2398(-1372747256) == -2;
            }
        } else {
            this.field4016 = arg0.method2359(-1) << 4;
        }
        if (arg2 > -41) {
            field4015 = null;
        }
    }
}
