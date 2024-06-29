import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class306 extends class175 {

    @OriginalMember(owner = "client!bq", name = "E", descriptor = "I")
    private int field4352 = 0;

    @OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
    private int field4353 = 0;

    @OriginalMember(owner = "client!bq", name = "J", descriptor = "I")
    private int field4357 = 20;

    @OriginalMember(owner = "client!bq", name = "M", descriptor = "I")
    private int field4360 = 1365;

    @OriginalMember(owner = "client!bq", name = "I", descriptor = "Ljb;")
    public static class519 field4356 = new class519(108, 4);

    @OriginalMember(owner = "client!bq", name = "G", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!bq", name = "H", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!bq", name = "K", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!bq", name = "L", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/io/File;I)[B", line = 5)
    public static final byte[] method1980(File arg0, int arg1) {
        int var2 = -23 / ((25 - arg1) / 56);
        ++field4358;
        return class537.method3116(arg0, (int) arg0.length(), -2);
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V", line = 31)
    public class306() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(B)V", line = 22)
    public static void method1981(byte arg0) {
        field4356 = null;
        int var1 = 14 / ((-11 - arg0) / 53);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILdt;Z)V", line = 34)
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        ++field4359;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 == 3) {
                        this.field4353 = arg1.method1728((byte) 21);
                    }
                } else {
                    this.field4352 = arg1.method1728((byte) 87);
                }
            } else {
                this.field4357 = arg1.method1728((byte) 20);
            }
        } else {
            this.field4360 = arg1.method1728((byte) 34);
        }
        if (arg2) {
            this.field4357 = 12;
        }
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(III)V", line = 90)
    public static final void method1982(int arg0, int arg1, int arg2) {
        ++field4355;
        if (class685.field9171 != null) {
            int var3 = class1.field2;
            int var4 = class441.field6352;
            class538.method3120((byte) -72, arg1, arg2);
            if (arg0 != -2) {
                field4356 = null;
            }
            if (~class206.field2664 == -1) {
                class593.field8101 = null;
                class593.field8101 = class685.field9171.method461(class685.field9171.method498(class169.field2222, class776.field10671), class685.field9171.method437(class169.field2222, class776.field10671));
            } else if (~class206.field2664 == -2 && (class204.field2635 == null || class1.field2 != var3 || ~class441.field6352 != ~var4)) {
                class204.field2635 = new class718[class441.field6352 * class1.field2];
                for (int var5 = 0; class204.field2635.length > var5; ++var5) {
                    class204.field2635[var5] = class685.field9171.method461(class685.field9171.method498(class533.field7397, class607.field8210), class685.field9171.method437(class533.field7397, class607.field8210));
                }
                class600.field8184 = 1;
                class562.field7701 = new int[class441.field6352 * class1.field2];
            }
            class132.field1818 = true;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZI)[I", line = 137)
    public final int[] method47(boolean arg0, int arg1) {
        ++field4354;
        int[] var3 = super.field2310.method91(0, arg1);
        if (!arg0) {
            method1981((byte) -54);
        }
        if (super.field2310.field169) {
            for (int var4 = 0; var4 < class598.field8136; ++var4) {
                int var5 = (class693.field9221[var4] << 12) / this.field4360 + this.field4352;
                int var6 = (class456.field6536[arg1] << 12) / this.field4360 + this.field4353;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13;
                for (var13 = 0; var11 + var12 < 16384 && var13 < this.field4357; ++var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var11 - var12 + var7;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = ~var13 <= ~(this.field4357 - 1) ? 0 : (var13 << 12) / this.field4357;
            }
        }
        return var3;
    }
}
