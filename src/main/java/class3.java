import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 extends class387 {

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "I")
    public int field16 = -1;

    @OriginalMember(owner = "client!dp", name = "y", descriptor = "I")
    public int field24 = -1;

    @OriginalMember(owner = "client!dp", name = "v", descriptor = "Ldr;")
    public static class675 field21 = new class675(1, -1);

    @OriginalMember(owner = "client!dp", name = "B", descriptor = "I")
    public static int field27 = 0;

    @OriginalMember(owner = "client!dp", name = "z", descriptor = "[Ljava/awt/Color;")
    public static Color[] field25 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "client!dp", name = "s", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!dp", name = "t", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!dp", name = "u", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!dp", name = "w", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!dp", name = "x", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!dp", name = "A", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!dp", name = "C", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIII)I")
    public static final int method5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -11603) {
            field25 = null;
        }
        ++field18;
        int var7 = arg5 & 3;
        if (~(1 & arg6) == -2) {
            int var8 = arg3;
            arg3 = arg2;
            arg2 = var8;
        }
        if (~var7 == -1) {
            return arg1;
        } else if (var7 == 1) {
            return -arg3 + -arg4 + 1 + 7;
        } else {
            return var7 == 2 ? 1 - (arg2 - 7 - -arg1) : arg4;
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(Loa;I)Lqt;")
    public final class595 method6(class650 arg0, int arg1) {
        if (arg1 != -7459) {
            method5(37, 47, -115, 67, -43, 14, -90);
        }
        ++field22;
        return null;
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(Loa;B)V")
    public final void method7(class650 arg0, byte arg1) {
        if (arg1 == 98) {
            ++field20;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BILoa;I)Z")
    public final boolean method8(byte arg0, int arg1, class650 arg2, int arg3) {
        ++field15;
        class396 var5 = arg2.method470();
        int var6 = 97 % ((77 - arg0) / 40);
        var5.method591(super.field4961, super.field4957, super.field4959);
        class359 var7 = class504.field6287.method1628(this.field14, (byte) -107).method539(this.field13, (class207) null, (byte) 119, 0, 0, (class621) null, -1, 131072, arg2);
        if (var7 != null && var7.method2074(arg3, arg1, var5, true)) {
            return true;
        } else {
            if (this.field16 != -1) {
                class359 var8 = class504.field6287.method1628(this.field16, (byte) -117).method539(this.field26, (class207) null, (byte) 61, 0, 0, (class621) null, -1, 131072, arg2);
                if (var8 != null && var8.method2074(arg3, arg1, var5, true)) {
                    return true;
                }
            }
            if (this.field24 != -1) {
                class359 var9 = class504.field6287.method1628(this.field24, (byte) -128).method539(this.field17, (class207) null, (byte) 121, 0, 0, (class621) null, -1, 131072, arg2);
                if (var9 != null && var9.method2074(arg3, arg1, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static void method9(int arg0) {
        field21 = null;
        field25 = null;
        if (arg0 != 0) {
            method10((byte[]) null, -111, -79, 28, 11, 65);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "([BIIIII)V")
    public static final void method10(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field28;
        int var6 = -50 / ((arg3 - 48) / 60);
        if (arg5 > arg4) {
            int var7 = -arg4 + arg5 >> 2;
            int var8 = arg1 + arg4;
            while (true) {
                --var7;
                if (var7 < 0) {
                    int var9 = -arg4 + arg5 & 3;
                    while (true) {
                        --var9;
                        if (var9 < 0) {
                            return;
                        }
                        arg0[var8++] = 1;
                    }
                }
                arg0[var8++] = 1;
                arg0[var8++] = 1;
                arg0[var8++] = 1;
                arg0[var8++] = 1;
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILoa;)Lww;")
    public final class686 method11(int arg0, class650 arg1) {
        ++field23;
        class396 var3 = arg1.method470();
        var3.method591(super.field4961, super.field4957 + -10, super.field4959);
        class686 var4 = class458.method2520(0, 3);
        if (arg0 > -89) {
            field21 = null;
        }
        if (this.field24 != -1) {
            class359 var5 = class504.field6287.method1628(this.field24, (byte) -99).method539(this.field17, (class207) null, (byte) 33, 0, 0, (class621) null, -1, 2048, arg1);
            if (var5 != null) {
                var5.method2049(var3, var4.field9361[2], 0);
            }
        }
        if (~this.field16 != 0) {
            class359 var6 = class504.field6287.method1628(this.field16, (byte) -96).method539(this.field26, (class207) null, (byte) -128, 0, 0, (class621) null, -1, 2048, arg1);
            if (var6 != null) {
                var6.method2049(var3, var4.field9361[1], 0);
            }
        }
        class359 var7 = class504.field6287.method1628(this.field14, (byte) -112).method539(this.field13, (class207) null, (byte) -124, 0, 0, (class621) null, -1, 2048, arg1);
        if (var7 != null) {
            var7.method2049(var3, var4.field9361[0], 0);
        }
        return var4;
    }
}
