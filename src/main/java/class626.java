import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class626 {

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "Lpja;")
    private class43 field8728 = new class43(256);

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "Lsf;")
    private class551 field8727;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Ld;")
    private class162 field8725;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "[F")
    public static float[] field8723 = new float[4];

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "Z")
    public static boolean field8724 = false;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field8719;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field8720;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field8721;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field8722;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field8726;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public final void method3521(int arg0) {
        this.field8728.method273(127);
        field8721++;
        int var2 = 122 / ((arg0 + 22) / 63);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public static final void method3522(int arg0) {
        field8720++;
        for (class300 var1 = (class300) class211.field3155.method3589((byte) -127); var1 != null; var1 = (class300) class211.field3155.method3591(0)) {
            if (var1.field4127) {
                var1.method1207(100);
            } else {
                var1.field4122 = true;
                if (var1.field4132 >= 0 && var1.field4125 >= 0 && var1.field4132 < class483.field6515 && class65.field926 > var1.field4125) {
                    class245.method1635(true, var1);
                }
            }
        }
        class300 var2 = (class300) class488.field6589.method3589((byte) -127);
        int var3 = -24 % ((arg0 + 11) / 54);
        while (var2 != null) {
            if (var2.field4127) {
                var2.method1207(104);
            } else {
                var2.field4122 = true;
            }
            var2 = (class300) class488.field6589.method3591(0);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)V")
    public static final void method3523(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class625.field8717 != null) {
            class625.field8717[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class240.field3420 != null) {
            class240.field3420[arg0][arg1] = (short) arg3;
        }
        if (class603.field8438 != null) {
            class603.field8438[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
    public final void method3524(int arg0) {
        field8726++;
        this.field8728.method265(arg0, -36);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static void method3525(byte arg0) {
        if (arg0 <= 19) {
            method3527((byte) 4, null);
        }
        field8723 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Lgl;")
    public final class627 method3526(int arg0, int arg1) {
        field8722++;
        Object var3 = this.field8728.method266((byte) -112, (long) arg0);
        if (var3 != null) {
            return (class627) var3;
        } else if (!this.field8725.method1274(arg0, arg1 + 21527)) {
            return null;
        } else if (arg1 == 5) {
            class311 var4 = this.field8725.method1270(arg0, true);
            int var5 = var4.field4248 ? 64 : this.field8727.field7679;
            class627 var7;
            if (var4.field4232 && this.field8727.method577()) {
                float[] var6 = this.field8725.method1273(arg0, (byte) 80, false, var5, 0.7F, var5);
                var7 = this.field8727.method3160(var4.field4238 != 0, var5, class530.field7176, var5, (byte) -72, var6);
            } else {
                int[] var8;
                if (var4.field4242 != 2 && class500.method2864(7, var4.field4250)) {
                    var8 = this.field8725.method1269(0.7F, var5, true, arg0, var5, true);
                } else {
                    var8 = this.field8725.method1272(var5, arg0, 0.7F, var5, (byte) 81, false);
                }
                var7 = this.field8727.method3139(false, var5, var4.field4238 != 0, var5, var8);
            }
            var7.method2679(var4.field4253, var4.field4235, arg1 ^ 0xFFFFBC1C);
            this.field8728.method270(var7, (long) arg0, -122);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method3527(byte arg0, String arg1) {
        field8719++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class749.field10345; var2++) {
            if (arg1.equalsIgnoreCase(class463.field6303[var2])) {
                return true;
            }
        }
        if (arg1.equalsIgnoreCase(class235.field3379.field10641)) {
            return true;
        } else {
            if (arg0 > -110) {
                field8723 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lsf;Ld;)V")
    public class626(class551 arg0, class162 arg1) {
        this.field8727 = arg0;
        this.field8725 = arg1;
    }
}
