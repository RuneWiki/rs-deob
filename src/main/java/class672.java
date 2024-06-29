import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class672 extends class205 {

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "I")
    private int field9217;

    @OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
    private int field9226;

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
    private int field9222;

    @OriginalMember(owner = "client!lca", name = "s", descriptor = "I")
    private int field9228;

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "[I")
    public static int[] field9225 = new int[1];

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "Z")
    public static boolean field9218 = false;

    @OriginalMember(owner = "client!lca", name = "t", descriptor = "Lmja;")
    public static class441 field9229 = null;

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "Lak;")
    public static class370 field9220 = null;

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
    public static int field9216;

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
    public static int field9219;

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!lca", name = "r", descriptor = "I")
    public static int field9227;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIIII)V", line = 9)
    public static final void method3777(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class718.field10090 = arg3;
        if (arg0 < 121) {
            field9225 = null;
        }
        class540.field7598 = arg4;
        class320.field3968 = arg5;
        class99.field1298 = arg2;
        ++field9223;
        class404.field5329 = arg1;
        if (~class404.field5329 <= -101) {
            int var6 = class99.field1298 * 512 + 256;
            int var7 = class540.field7598 * 512 + 256;
            int var8 = class483.method2867(class581.field7921, (byte) -109, var7, var6) - class320.field3968;
            int var9 = var6 - class599.field8107;
            int var10 = -class303.field3622 + var8;
            int var11 = -class350.field4366 + var7;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class793.field10893 = 16383 & (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D);
            class111.field1405 = 16383 & (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D);
            class641.field8758 = 0;
            if (~class793.field10893 > -1025) {
                class793.field10893 = 1024;
            }
            if (class793.field10893 > 3072) {
                class793.field10893 = 3072;
            }
        }
        class719.field10094 = -1;
        class131.field1617 = -1;
        class7.field100 = 2;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(III)V", line = 56)
    public final void method1223(int arg0, int arg1, int arg2) {
        ++field9224;
        int var4 = this.field9222 * arg1 >> 12;
        int var5 = this.field9226 * arg1 >> 12;
        if (arg0 != 1) {
            this.method1222(33, 70, 44);
        }
        int var6 = this.field9217 * arg2 >> 12;
        int var7 = this.field9228 * arg2 >> 12;
        class244.method1471(var6, var4, var7, var5, super.field2449, 8616);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V", line = 78)
    public static void method3778(byte arg0) {
        int var1 = 109 % ((arg0 - 21) / 58);
        field9229 = null;
        field9225 = null;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIB)V", line = 88)
    public final void method1225(int arg0, int arg1, byte arg2) {
        ++field9219;
        if (arg2 > -6) {
            method3778((byte) -25);
        }
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(III)Z", line = 105)
    public static final boolean method3779(int arg0, int arg1, int arg2) {
        if (arg1 != -1219194420) {
            method3779(-85, -117, -12);
        }
        ++field9227;
        return ~(540800 & arg0) != -1;
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(IIIIIII)V", line = 120)
    public class672(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field9217 = arg1;
        this.field9226 = arg2;
        this.field9222 = arg0;
        this.field9228 = arg3;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(III)V", line = 131)
    public final void method1222(int arg0, int arg1, int arg2) {
        ++field9221;
        if (arg1 == -10852) {
            int var4 = this.field9222 * arg2 >> 12;
            int var5 = this.field9226 * arg2 >> 12;
            int var6 = this.field9217 * arg0 >> 12;
            int var7 = this.field9228 * arg0 >> 12;
            class349.method2068(var4, super.field2447, super.field2450, var7, super.field2449, var5, 10238, var6);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIII)V", line = 153)
    public static final void method3780(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9216;
        int var5 = class595.field8085;
        int var6 = class709.field9947;
        if (class769.field10572) {
            var5 += class793.method4373((byte) 99);
            var6 += class719.method4070((byte) 121);
        }
        if (arg0 != 8) {
            field9220 = null;
        }
        if (class148.field1853 == 1) {
            class312 var7 = class720.field10114[class164.field1997 / 100];
            var7.method1838(var5 + -8, var6 + -8);
            class326.method1945(var6 - 8, var7.method1634() + var5 - 8, var5 - 8, var6 + -8 - -var7.method1636(), false);
        }
        if (class148.field1853 == 2) {
            class312 var8 = class720.field10114[class164.field1997 / 100 + 4];
            var8.method1838(var5 + -8, var6 + -8);
            class326.method1945(var6 + -8, var5 + -8 - -var8.method1634(), var5 + -8, var6 - 8 - -var8.method1636(), false);
        }
        class517.method3094((byte) 111);
    }
}
