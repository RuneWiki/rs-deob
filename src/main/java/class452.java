import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class452 extends class601 {

    @OriginalMember(owner = "client!sca", name = "J", descriptor = "I")
    private int field5898 = 32768;

    @OriginalMember(owner = "client!sca", name = "K", descriptor = "Luw;")
    public static class208 field5899 = new class208(4, 4);

    @OriginalMember(owner = "client!sca", name = "G", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!sca", name = "H", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!sca", name = "I", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!sca", name = "L", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!sca", name = "M", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "()V", line = 3)
    public class452() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(B)V", line = 8)
    public final void method292(byte arg0) {
        if (arg0 <= 44) {
            this.method638(-10, 73);
        }
        ++field5897;
        class257.method1651(0);
    }

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "(I)V", line = 19)
    public static void method2573(int arg0) {
        if (arg0 < 41) {
            field5899 = null;
        }
        field5899 = null;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(II)[[I", line = 30)
    public final int[][] method638(int arg0, int arg1) {
        ++field5901;
        int[][] var3 = super.field7647.method3510((byte) -51, arg1);
        if (super.field7647.field8306) {
            int[] var4 = this.method3243(arg1, 27123, 1);
            int[] var5 = this.method3243(arg1, 27123, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class418.field5518 < ~var9; ++var9) {
                int var10 = (1048330 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field5898 >> 12;
                int var12 = class558.field7100[var10] * var11 >> 12;
                int var13 = class438.field5764[var10] * var11 >> 12;
                int var14 = class511.field6519 & (var12 >> 12) + var9;
                int var15 = (var13 >> 12) + arg1 & class104.field1388;
                int[][] var16 = this.method3247((byte) -99, 0, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return arg0 != 2017 ? null : var3;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lmc;II)V", line = 88)
    public final void method259(class234 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field7646 = ~arg0.method1509(true) == -2;
            }
        } else {
            this.field5898 = arg0.method1553((byte) -118) << 4;
        }
        int var5 = 80 % ((40 - arg2) / 52);
        ++field5896;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IB)[I", line = 132)
    public final int[] method261(int arg0, byte arg1) {
        ++field5895;
        if (arg1 > -76) {
            method2573(-8);
        }
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (super.field7643.field4364) {
            int[] var4 = this.method3243(arg0, 27123, 1);
            int[] var5 = this.method3243(arg0, 27123, 2);
            for (int var6 = 0; var6 < class418.field5518; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field5898 >> 12;
                int var9 = class558.field7100[var7] * var8 >> 12;
                int var10 = class438.field5764[var7] * var8 >> 12;
                int var11 = class511.field6519 & (var9 >> 12) + var6;
                int var12 = (var10 >> 12) + arg0 & class104.field1388;
                int[] var13 = this.method3243(var12, 27123, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "(I)Z", line = 180)
    public static final boolean method2574(int arg0) {
        ++field5900;
        if (class87.field1218) {
            try {
                if ((Boolean) class586.method3137(8259, "showingVideoAd", class80.field1134)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 2020498764) {
            field5899 = null;
        }
        return true;
    }
}
