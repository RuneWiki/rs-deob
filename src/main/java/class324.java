import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class324 extends class335 {

    @OriginalMember(owner = "client!lea", name = "F", descriptor = "I")
    private int field4367 = 20;

    @OriginalMember(owner = "client!lea", name = "B", descriptor = "I")
    private int field4363 = 0;

    @OriginalMember(owner = "client!lea", name = "L", descriptor = "I")
    private int field4373 = 0;

    @OriginalMember(owner = "client!lea", name = "I", descriptor = "I")
    private int field4370 = 1365;

    @OriginalMember(owner = "client!lea", name = "E", descriptor = "I")
    public static int field4366 = 0;

    @OriginalMember(owner = "client!lea", name = "C", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!lea", name = "D", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!lea", name = "J", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!lea", name = "K", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!lea", name = "M", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!lea", name = "N", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!lea", name = "O", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!lea", name = "H", descriptor = "Ljm;")
    public static class285 field4369;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lea", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field4377;

    @OriginalMember(owner = "client!lea", name = "G", descriptor = "[Lnr;")
    public static class145[] field4368;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1885(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILio;I)V", line = 3)
    public final void method2(int arg0, class157 arg1, int arg2) {
        ++field4374;
        if (arg2 != -66) {
            method1884(-126);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field4373 = arg1.method963(-119);
                    }
                } else {
                    this.field4363 = arg1.method963(-119);
                }
            } else {
                this.field4367 = arg1.method963(-122);
            }
        } else {
            this.field4370 = arg1.method963(-121);
        }
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(Z)V", line = 55)
    public static final void method1881(boolean arg0) {
        ++field4365;
        if (arg0) {
            for (int var1 = 0; class569.field7760.length > var1; ++var1) {
                for (int var2 = 0; class569.field7760[var1].length > var2; ++var2) {
                    class569.field7760[var1][var2] = class510.field7109;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZI)[I", line = 82)
    public final int[] method3(boolean arg0, int arg1) {
        ++field4372;
        if (!arg0) {
            method1881(false);
        }
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (super.field4525.field5435) {
            for (int var4 = 0; ~var4 > ~class649.field8968; ++var4) {
                int var5 = (class376.field4981[var4] << 12) / this.field4370 - -this.field4363;
                int var6 = (class686.field9697[arg1] << 12) / this.field4370 + this.field4373;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13;
                for (var13 = 0; var11 + var12 < 16384 && ~var13 > ~this.field4367; ++var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var11 + var7;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = ~(this.field4367 - 1) < ~var13 ? (var13 << 12) / this.field4367 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 139)
    public static final boolean method1882(String arg0, int arg1) {
        int var2 = -50 % ((arg1 - 28) / 47);
        ++field4375;
        return class469.method2686(field4377 != null ? field4377 : (field4377 = method1885("lh")), -3, arg0);
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "()V", line = 149)
    public class324() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(BLjava/lang/String;)I", line = 170)
    public static final int method1883(byte arg0, String arg1) {
        ++field4364;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 > -65) {
            return -73;
        } else {
            for (int var4 = 0; var2 > var4; ++var4) {
                var3 = class63.method368((byte) -118, arg1.charAt(var4)) + (var3 << 5) + -var3;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "(I)V", line = 193)
    public static void method1884(int arg0) {
        field4369 = null;
        field4368 = null;
        if (arg0 < 47) {
            method1881(true);
        }
    }
}
