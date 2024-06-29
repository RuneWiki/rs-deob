import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class295 {

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[I")
    public static int[] field5063 = new int[500];

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Lve;")
    public static class255 field5066 = class87.method607(67, "Fps:");

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "[S")
    public static short[] field5064 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "[[Ldi;")
    public static class142[][] field5062;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V", line = 14)
    public static void method2079(boolean arg0) {
        field5064 = null;
        if (arg0) {
            field5063 = (int[]) null;
        }
        field5062 = (class142[][]) null;
        field5066 = null;
        field5063 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 40)
    public static final void method2080(int arg0) {
        while (true) {
            if (class160.field2692.method1518(true, class125.field2084) >= 27) {
                int var1 = class160.field2692.method1513((byte) 45, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class82.field1334[var1] == null) {
                        var2 = true;
                        class82.field1334[var1] = new class186();
                    }
                    class186 var3 = class82.field1334[var1];
                    class84.field1356[class282.field4858++] = var1;
                    var3.field5122 = class277.field4768;
                    if (var3.field2996 != null && var3.field2996.method1630(67)) {
                        class56.method350(var3, -31844);
                    }
                    int var4 = class160.field2692.method1513((byte) 45, 5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    var3.field2996 = class143.method1068(-117, class160.field2692.method1513((byte) 45, 14));
                    int var5 = class160.field2692.method1513((byte) 45, 1);
                    if (var5 == 1) {
                        class10.field145[class118.field1985++] = var1;
                    }
                    int var6 = class160.field2692.method1513((byte) 45, 5);
                    int var7 = class160.field2692.method1513((byte) 45, 1);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var8 = class155.field2640[class160.field2692.method1513((byte) 45, 3)];
                    if (var2) {
                        var3.field5129 = var3.field5157 = var8;
                    }
                    var3.method2102(70, var3.field2996.field3933);
                    var3.field5118 = var3.field2996.field3937;
                    var3.field5120 = var3.field2996.field3903;
                    var3.field5146 = var3.field2996.field3942;
                    var3.field5148 = var3.field2996.field3920;
                    var3.field5167 = var3.field2996.field3883;
                    var3.field5138 = var3.field2996.field3881;
                    if (var3.field5148 == 0) {
                        var3.field5157 = 0;
                    }
                    var3.field5121 = var3.field2996.field3928;
                    var3.field5113 = var3.field2996.field3897;
                    var3.method2104(class276.field4742.field5154[0] + var4, -6572, class276.field4742.field5125[0] + var6, var7 == 1, var3.method1680(-109));
                    if (var3.field2996.method1630(70)) {
                        class196.method1405(var3.field5125[0], (byte) 107, (class145) null, client.field4039, (class242) null, 0, var3.field5154[0], var3);
                    }
                    continue;
                }
            }
            class160.field2692.method1514(true);
            if (arg0 != 22461) {
                return;
            }
            field5065++;
            return;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)I", line = 123)
    public static final int method2081(int arg0, int arg1) {
        field5068++;
        if (arg1 != 7) {
            method2081(-31, 127);
        }
        return arg0 >> 18 & 0x7;
    }
}
