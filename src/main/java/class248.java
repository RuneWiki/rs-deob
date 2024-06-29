import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class248 extends class184 {

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "I")
    private int field3180 = 0;

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "I")
    private int field3184 = 4096;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "Ljk;")
    public static class449 field3187 = new class449(64);

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field3182;
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (super.field2409.field436) {
            int[] var4 = this.method1159(106, arg0, 0);
            for (int var5 = 0; ~var5 > ~class245.field3167; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field3180 && var6 <= this.field3184 ? 4096 : 0;
            }
        }
        if (arg1 != 578) {
            method1506();
        }
        return var3;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/awt/Component;BZ)Ljs;")
    public static final class218 method1505(Component arg0, byte arg1, boolean arg2) {
        if (arg1 != -42) {
            field3187 = null;
        }
        ++field3181;
        return new class276(arg0, arg2);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "()V")
    public static final void method1506() {
        class522.method3102(1, class524.field7753);
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)I")
    public static final int method1507(byte arg0) {
        ++field3183;
        int var1 = -61 % ((arg0 - 20) / 45);
        return 6;
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(B)V")
    public static void method1508(byte arg0) {
        field3187 = null;
        if (arg0 >= -107) {
            field3187 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BILfh;)V")
    public final void method7(byte arg0, int arg1, class463 arg2) {
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field3184 = arg2.method2758((byte) 77);
            }
        } else {
            this.field3180 = arg2.method2758((byte) 106);
        }
        int var5 = -127 % ((arg0 - -13) / 51);
        ++field3186;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
    public class248() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLjava/lang/String;I[B)I")
    public static final int method1509(byte arg0, String arg1, int arg2, byte[] arg3) {
        ++field3185;
        int var4 = arg1.length();
        int var5 = arg2;
        int var6 = 0;
        if (arg0 != 23) {
            field3187 = null;
        }
        while (var4 > var6) {
            char var7 = arg1.charAt(var6);
            if (~var7 < -128) {
                if (~var7 >= -2048) {
                    arg3[var5++] = (byte) class215.method1323(var7 >> 6, 192);
                    arg3[var5++] = (byte) class215.method1323(128, class378.method2145(63, var7));
                } else {
                    arg3[var5++] = (byte) (class215.method1323(921259, var7) >> 12);
                    arg3[var5++] = (byte) class215.method1323(class378.method2145(4067, var7) >> 6, 128);
                    arg3[var5++] = (byte) class215.method1323(class378.method2145(var7, 63), 128);
                }
            } else {
                arg3[var5++] = (byte) var7;
            }
            ++var6;
        }
        return -arg2 + var5;
    }
}
