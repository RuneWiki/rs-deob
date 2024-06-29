import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class208 extends class352 {

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
    public static int field3049 = 0;

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "[[I")
    public static int[][] field3050 = new int[6][];

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "()V")
    public static final void method1402() {
        for (int var0 = class509.field7252; var0 < class409.field6165; var0++) {
            for (int var1 = 0; var1 < class34.field356; var1++) {
                for (int var2 = 0; var2 < class565.field8040; var2++) {
                    class186 var3 = class80.field1136[var0][var1][var2];
                    if (var3 != null) {
                        class12 var4 = var3.field2834;
                        class12 var5 = var3.field2841;
                        if (var4 != null && var4.method738((byte) 88)) {
                            class357.method2234(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method738((byte) 88)) {
                                class357.method2234(var5, var0, var1, var2, 1, 1);
                                var5.method737(8616, var4, false, 0, class118.field1620, 0, 0);
                                var5.method741(-94);
                            }
                            var4.method741(-97);
                        }
                        for (class754 var6 = var3.field2830; var6 != null; var6 = var6.field10537) {
                            class119 var8 = var6.field10542;
                            if (var8 != null && var8.method738((byte) 88)) {
                                class357.method2234(var8, var0, var1, var2, var8.field1632 + 1 - var8.field1628, var8.field1624 - var8.field1626 + 1);
                                var8.method741(-119);
                            }
                        }
                        class343 var7 = var3.field2844;
                        if (var7 != null && var7.method738((byte) 88)) {
                            class152.method1128(var7, var0, var1, var2);
                            var7.method741(-109);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIIILwh;)Liba;")
    public static final class531 method1403(int arg0, int arg1, int arg2, int arg3, class148 arg4) {
        if (arg3 != 3553) {
            field3050 = null;
        }
        field3053++;
        if (!arg4.field2258 && (!class627.method3619(2, arg0) || !class627.method3619(arg3 ^ 0xDE3, arg1))) {
            return arg4.field2264 ? new class531(arg4, 34037, arg2, arg0, arg1) : new class531(arg4, arg2, arg0, arg1, class432.method2684(arg0, -21774), class432.method2684(arg1, -21774));
        } else {
            return new class531(arg4, 3553, arg2, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(III[[[BIIIILha;IIII)V")
    public static final void method1404(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, int arg5, int arg6, int arg7, class60 arg8, int arg9, int arg10, int arg11, int arg12) {
        field3052++;
        if (arg9 == 0 || arg0 == 0) {
            return;
        }
        if (arg9 == 9) {
            arg9 = 1;
            arg5 = arg5 + 1 & 0x3;
        }
        if (arg9 == 10) {
            arg9 = 1;
            arg5 = arg5 + 3 & 0x3;
        }
        if (arg9 == 11) {
            arg5 = arg5 + 3 & 0x3;
            arg9 = 8;
        }
        arg8.method519(arg12, arg7, arg6, arg10, arg11, arg4, arg3[arg9 - 1][arg5], arg0, arg1);
        if (arg2 != -6925) {
            field3049 = 78;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIII)V")
    public static final void method1405(int arg0, int arg1, int arg2, int arg3) {
        field3051++;
        if (arg0 != 2620) {
            method1405(-58, 1, 85, 21);
        }
        class60.field847 = new byte[arg1][arg3][arg2];
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)V")
    public static void method1406(int arg0) {
        if (arg0 != -8025) {
            method1405(98, -51, -124, 74);
        }
        field3050 = null;
    }
}
