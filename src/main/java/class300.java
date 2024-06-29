import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class300 extends class507 {

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
    public static int field3942 = -1;

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "[I")
    public static int[] field3940 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "Lqh;")
    private class50 field3937;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "[I")
    public static int[] field3945;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "(I)V", line = 7)
    public static void method1790(int arg0) {
        field3940 = null;
        field3945 = null;
        if (arg0 != 16) {
            method1790(-61);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lug;IZ)V", line = 18)
    private final void method1791(class396 arg0, int arg1, boolean arg2) {
        if (arg1 == 249) {
            int var4 = arg0.method2388((byte) -116);
            if (this.field3937 == null) {
                int var5 = class111.method682(40, var4);
                this.field3937 = new class50(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method2388((byte) -124) == 1;
                int var8 = arg0.method2396((byte) -123);
                class435 var9;
                if (var7) {
                    var9 = new class53(arg0.method2432((byte) 125));
                } else {
                    var9 = new class488(arg0.method2406((byte) -119));
                }
                this.field3937.method291((long) var8, var9, -106);
            }
        }
        if (arg2) {
            method1792(-6, 111, null, 101, -121, -81, false);
        }
        field3941++;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILfo;IIIZ)V", line = 65)
    public static final void method1792(int arg0, int arg1, class361 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3946++;
        class435.field6349 = arg5;
        class476.field7045 = arg2;
        if (arg4 != 26313) {
            method1794(-128);
        }
        class97.field1260 = 1;
        class212.field2841 = arg3;
        class481.field7112 = arg6;
        class204.field2703 = arg0;
        class337.field4464 = class246.field3235.method590(arg4 ^ 0xFFFF995F) / arg1;
        if (class337.field4464 < 1) {
            class337.field4464 = 1;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lug;B)V", line = 92)
    public final void method1793(class396 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2388((byte) -119);
            if (var3 == 0) {
                if (arg1 != -23) {
                    this.method1796(61, 37, -19);
                }
                field3944++;
                return;
            }
            this.method1791(arg0, var3, false);
        }
    }

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "(I)[Lbu;", line = 121)
    public static final class17[] method1794(int arg0) {
        field3938++;
        if (arg0 > -41) {
            method1790(78);
        }
        return new class17[] { class287.field3779, class255.field3396, class168.field2175, class202.field2683, class264.field3547, class50.field574 };
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 132)
    public final String method1795(int arg0, String arg1, int arg2) {
        field3943++;
        if (this.field3937 == null) {
            return arg1;
        } else if (arg2 == -15331) {
            class53 var4 = (class53) this.field3937.method295((long) arg0, -109);
            return var4 == null ? arg1 : var4.field618;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)I", line = 152)
    public final int method1796(int arg0, int arg1, int arg2) {
        field3939++;
        if (this.field3937 == null) {
            return arg1;
        }
        class488 var4 = (class488) this.field3937.method295((long) arg2, arg0 - 121);
        if (arg0 == 1) {
            return var4 == null ? arg1 : var4.field7162;
        } else {
            return 32;
        }
    }
}
