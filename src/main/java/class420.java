import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class420 extends class659 implements class745 {

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    private int field6042 = -1;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    private int field6043 = -1;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "Llf;")
    private class250 field6049;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    private int field6046;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public int field6047;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public int field6044;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    private int field6052;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    private int field6055;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "[I")
    public static int[] field6056 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 5)
    public final void method804(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field6042, this.field6043, 36161, arg0);
        field6045++;
        this.field6042 = -1;
        this.field6043 = -1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V", line = 23)
    public final void method2525(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg1, 36161, this.field6052);
        if (arg0 > -28) {
            this.field6049 = null;
        }
        field6050++;
        this.field6042 = arg2;
        this.field6043 = arg1;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Llf;III)V", line = 203)
    public class420(class250 arg0, int arg1, int arg2, int arg3) {
        this.field6049 = arg0;
        this.field6046 = arg1;
        this.field6047 = arg2;
        this.field6044 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class631.field8542, 0);
        this.field6052 = class631.field8542[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6052);
        OpenGL.glRenderbufferStorageEXT(36161, this.field6046, this.field6047, this.field6044);
        this.field6055 = this.field6047 * this.field6044 * this.field6049.method1590(24, this.field6046);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Llf;IIII)V", line = 241)
    public class420(class250 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6046 = arg1;
        this.field6049 = arg0;
        this.field6047 = arg2;
        this.field6044 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class631.field8542, 0);
        this.field6052 = class631.field8542[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6052);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field6046, this.field6047, this.field6044);
        this.field6055 = this.field6047 * this.field6044 * this.field6049.method1590(-107, this.field6046);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/lang/String;)V", line = 44)
    public static final void method2526(int arg0, String arg1) {
        field6041++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class703.method3895(arg1, (byte) 113);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg0 > -94) {
            method2526(116, null);
        }
        while (class664.field8915 > var3) {
            String var4 = class98.field1438[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class703.method3895(var4, (byte) -123);
            if (var5 != null && var5.equals(var2)) {
                class664.field8915--;
                for (int var6 = var3; var6 < class664.field8915; var6++) {
                    class98.field1438[var6] = class98.field1438[var6 + 1];
                    class560.field7682[var6] = class560.field7682[var6 + 1];
                    class194.field2533[var6] = class194.field2533[var6 + 1];
                    class196.field2542[var6] = class196.field2542[var6 + 1];
                    class100.field1456[var6] = class100.field1456[var6 + 1];
                }
                class462.field6564 = class701.field9280;
                class708.field9670++;
                class43 var7 = class492.method2903(class456.field6529, 0, class73.field983);
                var7.field457.method1725(class525.method3045(-122, arg1), 85);
                var7.field457.method1678(arg1, (byte) 39);
                class409.method2457((byte) -100, var7);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V", line = 111)
    public final void method2527(int arg0) {
        field6048++;
        if (arg0 != 10214) {
            this.field6055 = -8;
        }
        if (this.field6052 > 0) {
            this.field6049.method1618((byte) -63, this.field6052, this.field6055);
            this.field6052 = 0;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILha;IIIIIIIILtd;)V", line = 128)
    public static final void method2528(int arg0, int arg1, class66 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class478 arg11) {
        if (arg0 > arg6 && arg6 + arg7 > arg0 && arg9 - 13 < arg4 && (arg9 + 3) > arg4 && arg11.field6702) {
            arg3 = arg1;
        }
        field6054++;
        int[] var12 = null;
        if (class235.method1492(arg11.field6718, 29470)) {
            var12 = class16.field156.method2121((int) arg11.field6719, 25928).field5366;
        } else if (arg11.field6703 != -1) {
            var12 = class16.field156.method2121(arg11.field6703, 25928).field5366;
        } else if (class450.method2678(-49, arg11.field6718)) {
            class316 var15 = (class316) class176.field2326.method1248(87, (long) ((int) arg11.field6719));
            if (var15 != null) {
                class22 var16 = var15.field4455;
                class304 var17 = var16.field217;
                if (var17.field4295 != null) {
                    var17 = var17.method1968(class480.field6740, -1);
                }
                if (var17 != null) {
                    var12 = var17.field4340;
                }
            }
        } else if (class480.method2830(arg11.field6718, true)) {
            Object var13 = null;
            class412 var14;
            if (arg11.field6718 == 1012) {
                var14 = class210.field2705.method1362(0, (int) arg11.field6719);
            } else {
                var14 = class210.field2705.method1362(0, (int) (arg11.field6719 >>> 32 & 0x7FFFFFFFL));
            }
            if (var14.field5919 != null) {
                var14 = var14.method2478(class480.field6740, -1);
            }
            if (var14 != null) {
                var12 = var14.field5920;
            }
        }
        String var18 = class631.method3482(arg11, (byte) 100);
        if (var12 != null) {
            var18 = var18 + class493.method2907((byte) 107, var12);
        }
        class88.field1251.method558(0, arg3, class634.field8573, class584.field7966, arg9, 0, arg6 + 3, var18);
        if (arg11.field6706) {
            class180.field2366.method968(class643.field8657.method3619((byte) -69, var18) + arg6 + 5, arg9 + -12);
        }
        if (arg5 <= 61) {
            method2529((byte) 50);
        }
    }

    @OriginalMember(owner = "client!df", name = "finalize", descriptor = "()V", line = 220)
    protected final void finalize() throws Throwable {
        this.method2527(10214);
        field6040++;
        super.finalize();
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(B)V", line = 232)
    public static void method2529(byte arg0) {
        if (arg0 >= 108) {
            field6056 = null;
        }
    }
}
