import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class291 extends class409 {

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
    private int field4507;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
    private int field4505;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    private int field4501;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    private int field4498;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "F")
    public static float field4500 = 1.0F;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "Lwa;")
    public static class505 field4497 = new class505(16);

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "[I")
    public static int[] field4509 = new int[100];

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "I")
    public static int field4510 = -1;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V")
    public static void method1946(int arg0) {
        field4497 = null;
        field4509 = null;
        if (arg0 != 16809) {
            field4500 = -0.6757891F;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1947(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4495;
        if (class31.method189(14, arg3)) {
            if (arg4 != -1) {
                method1947(-82, 90, -121, -1, 16, -53, 17, -70, 83, 67);
            }
            if (class394.field5749[arg3] != null) {
                client.method3092(class394.field5749[arg3], -1, arg7, arg5, arg1, arg2, arg6, arg9, arg8, arg0);
            } else {
                client.method3092(class237.field3555[arg3], -1, arg7, arg5, arg1, arg2, arg6, arg9, arg8, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)V")
    public final void method1850(int arg0, int arg1, int arg2) {
        if (arg2 >= 120) {
            ++field4502;
            int var4 = this.field4507 * arg1 >> 12;
            int var5 = this.field4498 * arg1 >> 12;
            int var6 = this.field4505 * arg0 >> 12;
            int var7 = this.field4501 * arg0 >> 12;
            class215.method1477(var7, var4, var5, super.field6042, (byte) -43, super.field6044, var6, super.field6043);
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(IIIIIII)V")
    public class291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4507 = arg0;
        this.field4505 = arg1;
        this.field4501 = arg3;
        this.field4498 = arg2;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(IBI)V")
    public final void method1852(int arg0, byte arg1, int arg2) {
        ++field4506;
        int var4 = this.field4507 * arg2 >> 12;
        int var5 = this.field4498 * arg2 >> 12;
        int var6 = this.field4505 * arg0 >> 12;
        int var7 = this.field4501 * arg0 >> 12;
        if (arg1 != 88) {
            method1949(46, -65);
        }
        class324.method2130(var7, var5, var4, 97, super.field6044, var6);
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)Lcl;")
    public static final class53 method1948(int arg0) {
        ++field4508;
        if (class362.field5333 != null && class107.field1626 != null) {
            if (arg0 != -1) {
                method1950((byte) -40, -77, 20, 114);
            }
            for (class53 var1 = (class53) class107.field1626.method1844(106); var1 != null; var1 = (class53) class107.field1626.method1844(68)) {
                class30 var2 = class362.field5329.method2182(var1.field824, (byte) -42);
                if (var2 != null && var2.field360 && var2.method184(95, class362.field5328)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)V")
    public static final void method1949(int arg0, int arg1) {
        ++field4499;
        class188 var2 = class10.method48((byte) 76, 7, arg1);
        var2.method1306(-23128);
        int var3 = -21 / ((-54 - arg0) / 62);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BIII)I")
    public static final int method1950(byte arg0, int arg1, int arg2, int arg3) {
        ++field4494;
        if (~(class229.field3460[arg2][arg3][arg1] & 8) != -1) {
            return 0;
        } else if (~arg2 < -1 && ~(class229.field3460[1][arg3][arg1] & 2) != -1) {
            return arg2 + -1;
        } else {
            int var4 = 22 % ((arg0 - 28) / 40);
            return arg2;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IBI)V")
    public final void method1855(int arg0, byte arg1, int arg2) {
        ++field4496;
        int var4 = this.field4507 * arg2 >> 12;
        int var5 = this.field4498 * arg2 >> 12;
        int var6 = this.field4505 * arg0 >> 12;
        int var7 = this.field4501 * arg0 >> 12;
        if (arg1 > -8) {
            method1949(-118, 80);
        }
        class73.method684(super.field6043, super.field6042, var6, var4, false, var7, var5);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/awt/Component;B)Ltu;")
    public static final class7 method1951(Component arg0, byte arg1) {
        if (arg1 > -4) {
            method1946(32);
        }
        ++field4504;
        return new class154(arg0);
    }

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)V")
    public static final void method1952(int arg0) {
        ++field4503;
        class150[] var1 = class364.field5371;
        synchronized (class364.field5371) {
            int var2 = 0;
            if (arg0 == -30999) {
                while (var2 < class364.field5371.length) {
                    class364.field5371[var2] = new class150();
                    class267.field4257[var2] = 0;
                    ++var2;
                }
            }
        }
    }
}
