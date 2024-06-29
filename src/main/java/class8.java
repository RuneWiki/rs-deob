import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class8 extends class130 {

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public int field94;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "Z")
    public boolean field88;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field95 = new String[100];

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field100;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "[I")
    public static int[] field101;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public static int field98;

    static {
        new class34("", 76);
        field100 = new String[100];
        field101 = new int[13];
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lza;Lum;ZLum;)V", line = 3)
    public static final void method37(class299 arg0, class83 arg1, boolean arg2, class83 arg3) {
        class258.field4149 = class367.method2334(-76, 0, class294.field4539, arg3);
        if (arg2) {
            return;
        }
        field98++;
        class532.field7770 = arg0.method542(class258.field4149, class309.method2045(arg1, class294.field4539, 0), true);
        class114.field1755 = class367.method2334(-71, 0, class380.field5596, arg3);
        class54.field833 = arg0.method542(class114.field1755, class309.method2045(arg1, class380.field5596, 0), true);
        class447.field6643 = class367.method2334(-69, 0, class53.field821, arg3);
        class441.field6573 = arg0.method542(class447.field6643, class309.method2045(arg1, class53.field821, 0), true);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIII)V", line = 19)
    public static final void method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field93++;
        int var6 = class306.method2023(5, class487.field7124, arg5, class232.field3493);
        int var7 = class306.method2023(5, class487.field7124, arg2, class232.field3493);
        int var8 = class306.method2023(5, class232.field3492, arg3, class36.field453);
        int var9 = class306.method2023(5, class232.field3492, arg0, class36.field453);
        int var10 = var6;
        int var11 = 117 / ((arg1 + 55) / 58);
        while (var10 <= var7) {
            class262.method1831(var9, class402.field5946[var10], (byte) 43, arg4, var8);
            var10++;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V", line = 47)
    public static final void method39(boolean arg0) {
        field89++;
        if (arg0) {
            return;
        }
        if (class460.field6813 == 2) {
            class376.method2400(3, (byte) 107);
        } else if (class460.field6813 == 6) {
            class376.method2400(7, (byte) 107);
            return;
        } else if (class460.field6813 == 9) {
            class376.method2400(10, (byte) 107);
            return;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILgt;B)I", line = 71)
    public static final int method40(int arg0, class66 arg1, byte arg2) {
        if (arg2 > -39) {
            field95 = null;
        }
        field96++;
        return -1;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V", line = 84)
    public static void method41(boolean arg0) {
        field101 = null;
        field100 = null;
        if (!arg0) {
            field95 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(IIIIIZ)V", line = 107)
    public class8(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field92 = arg4;
        this.field94 = arg1;
        this.field90 = arg2;
        this.field88 = arg5;
        this.field99 = arg0;
        this.field91 = arg3;
    }
}
