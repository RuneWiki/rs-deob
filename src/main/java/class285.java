import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class285 extends class40 {

    @OriginalMember(owner = "client!kp", name = "N", descriptor = "I")
    private int field4143 = 0;

    @OriginalMember(owner = "client!kp", name = "L", descriptor = "I")
    private int field4141 = 0;

    @OriginalMember(owner = "client!kp", name = "U", descriptor = "I")
    private int field4150 = 1;

    @OriginalMember(owner = "client!kp", name = "M", descriptor = "I")
    public static int field4142 = 10;

    @OriginalMember(owner = "client!kp", name = "Q", descriptor = "I")
    public static int field4146 = 0;

    @OriginalMember(owner = "client!kp", name = "O", descriptor = "[I")
    public static int[] field4144 = new int[5];

    @OriginalMember(owner = "client!kp", name = "X", descriptor = "Ljava/lang/String;")
    public static String field4153 = null;

    @OriginalMember(owner = "client!kp", name = "W", descriptor = "Lub;")
    public static class15 field4152 = new class15(128);

    @OriginalMember(owner = "client!kp", name = "R", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!kp", name = "S", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!kp", name = "T", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!kp", name = "V", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!kp", name = "P", descriptor = "Ltj;")
    public static class108 field4145;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)[I")
    public final int[] method44(byte arg0, int arg1) {
        if (arg0 > -20) {
            field4152 = null;
        }
        ++field4147;
        int[] var3 = super.field551.method185(65280, arg1);
        if (super.field551.field441) {
            int var4 = class86.field1123[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~var6 > ~class410.field5886; ++var6) {
                int var7 = class9.field124[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field4141 == 0) {
                    var9 = (-var4 + var7) * this.field4150;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field4150 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field4143 == -1) {
                    var12 = class357.field5166[var12 >> 4 & 255] + 4096 >> 1;
                } else if (~this.field4143 == -3) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IILlf;)V")
    public final void method43(int arg0, int arg1, class130 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field4150 = arg2.method837(true);
                }
            } else {
                this.field4143 = arg2.method837(true);
            }
        } else {
            this.field4141 = arg2.method837(true);
        }
        if (arg1 < 79) {
            this.field4143 = 13;
        }
        ++field4148;
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V")
    public static void method1958(int arg0) {
        field4153 = null;
        field4152 = null;
        field4145 = null;
        if (arg0 == -4096) {
            field4144 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
    public class285() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(Z)Z")
    public static final boolean method1959(boolean arg0) {
        ++field4149;
        try {
            if (arg0) {
                method1959(true);
            }
            if (~class439.field6279 == -3) {
                if (class324.field4713 == null) {
                    class324.field4713 = class307.method2065(class20.field269, class200.field2854, class316.field4635);
                    if (class324.field4713 == null) {
                        return false;
                    }
                }
                if (class28.field357 == null) {
                    class28.field357 = new class242(class181.field2548, class390.field5484);
                }
                if (class213.field3014.method1464(class323.field4704, -96, class324.field4713, 22050, class28.field357)) {
                    class213.field3014.method1456((byte) -30);
                    class213.field3014.method1440(class85.field1094, -102);
                    class213.field3014.method1445(class324.field4713, (byte) -124, class189.field2706);
                    class20.field269 = null;
                    class439.field6279 = 0;
                    class28.field357 = null;
                    class324.field4713 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class213.field3014.method1443(false);
            class20.field269 = null;
            class28.field357 = null;
            class324.field4713 = null;
            class439.field6279 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "(B)V")
    public final void method39(byte arg0) {
        class187.method1341(true);
        if (arg0 != -23) {
            this.field4141 = 67;
        }
        ++field4151;
    }
}
