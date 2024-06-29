import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class314 extends class334 {

    @OriginalMember(owner = "client!qu", name = "H", descriptor = "I")
    private int field4432 = 4096;

    @OriginalMember(owner = "client!qu", name = "J", descriptor = "I")
    private int field4434 = 0;

    @OriginalMember(owner = "client!qu", name = "E", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!qu", name = "F", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!qu", name = "G", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!qu", name = "I", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!qu", name = "K", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!qu", name = "L", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)V")
    public static final void method1912(boolean arg0) {
        class589.field8465.method2893((byte) -50);
        ++field4431;
        if (!arg0) {
            method1914(-125L, 28, (class475) null);
        }
        class87.field1292.method2893((byte) -11);
        class367.field5187.method2893((byte) 89);
        class554.field7684.method2893((byte) 78);
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(II)I")
    public static final int method1913(int arg0, int arg1) {
        if (arg1 != 32) {
            method1913(-54, -16);
        }
        ++field4430;
        int var2 = arg0 & 63;
        int var3 = (223 & arg0) >> 6;
        if (var2 != 18) {
            if (var2 == 19 || ~var2 == -22) {
                if (~var3 == -1) {
                    return 16;
                }
                if (var3 == 1) {
                    return 32;
                }
                if (var3 == 2) {
                    return 64;
                }
                if (var3 == 3) {
                    return 128;
                }
            }
        } else {
            if (~var3 == -1) {
                return 1;
            }
            if (~var3 == -2) {
                return 2;
            }
            if (~var3 == -3) {
                return 4;
            }
            if (~var3 == -4) {
                return 8;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
    public class314() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)[I")
    public final int[] method28(int arg0, int arg1) {
        if (arg1 != -22563988) {
            this.field4432 = 122;
        }
        ++field4429;
        int[] var3 = super.field4743.method1027((byte) -78, arg0);
        if (super.field4743.field1993) {
            int[] var4 = this.method2052(0, 0, arg0);
            for (int var5 = 0; class439.field6099 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field4434 >= ~var6 && ~this.field4432 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(JILha;)V")
    public static final void method1914(long arg0, int arg1, class475 arg2) {
        class781.field10702 = arg1;
        ++field4433;
        class650.field9198 = 0;
        class615.field8728 = class719.field10047;
        class719.field10047 = 0;
        long var4 = class337.method2062(false);
        for (class187 var6 = (class187) class546.field7568.method1730((byte) 127); var6 != null; var6 = (class187) class546.field7568.method1729((byte) 100)) {
            if (var6.method1356(arg2, arg0)) {
                ++class650.field9198;
            }
        }
        if (class675.field9474 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + class546.field7568.method1732(arg1 + -124) + ", running: " + class650.field9198);
            System.out.println("Emitters: " + class781.field10702 + " Particles: " + class719.field10047 + ". Time taken: " + (class337.method2062(false) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZLol;)V")
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (!arg1) {
            ++field4436;
            if (arg0 != 0) {
                if (arg0 == 1) {
                    this.field4432 = arg2.method2565((byte) -113);
                }
            } else {
                this.field4434 = arg2.method2565((byte) -91);
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(BI)S")
    public static final short method1915(byte arg0, int arg1) {
        ++field4435;
        int var2 = 12 / ((-45 - arg0) / 56);
        int var3 = (65200 & arg1) >> 10;
        int var4 = arg1 >> 3 & 112;
        int var5 = arg1 & 127;
        int var6 = var5 > 64 ? (-var5 + 127) * var4 >> 7 : var4 * var5 >> 7;
        int var7 = var5 - -var6;
        int var8;
        if (var7 == 0) {
            var8 = var6 << 1;
        } else {
            var8 = (var6 << 8) / var7;
        }
        return (short) (var8 >> 4 << 7 | var3 << 10 | var7);
    }
}
