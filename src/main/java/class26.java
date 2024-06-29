import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class26 extends class364 {

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field253 = 0;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Ljava/lang/String;")
    public static String field251 = "flash3:";

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Lfi;")
    public static class331 field254 = new class331(16);

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZZLdh;IIBLdh;)I", line = 5)
    public static final int method155(boolean arg0, boolean arg1, class175 arg2, int arg3, int arg4, byte arg5, class175 arg6) {
        field252++;
        int var7 = class342.method2193(arg4, arg2, arg0, 7976, arg6);
        if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (arg5 > -67) {
            return -77;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = class342.method2193(arg3, arg2, arg1, 7976, arg6);
            return arg1 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 39)
    public static final void method156(int arg0) {
        while (true) {
            if (class249.field3379.method814((byte) -97, class290.field4131) >= 11) {
                int var1 = class249.field3379.method817(-127, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class375.field5473[var1] == null) {
                        class375.field5473[var1] = new class133();
                        class375.field5473[var1].field6279 = var1;
                        var2 = true;
                        if (class138.field1965[var1] != null) {
                            class375.field5473[var1].method796(-71, class138.field1965[var1]);
                        }
                    }
                    class294.field4217[class148.field2082++] = var1;
                    class133 var3 = class375.field5473[var1];
                    var3.field6320 = class221.field3033;
                    int var4 = class196.field2668[class249.field3379.method817(20, 3)];
                    int var5 = class249.field3379.method817(-115, 1);
                    if (var5 == 1) {
                        class204.field2798[class189.field2578++] = var1;
                    }
                    int var6 = class249.field3379.method817(122, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class249.field3379.method817(arg0 - 125, 1);
                    int var8 = class249.field3379.method817(arg0 - 117, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    if (var2) {
                        var3.method2687(var4, true);
                    }
                    var3.method794((byte) -19, class390.field5715.field6350[0] + var6, var7 == 1, class390.field5715.field6351[0] + var8, class410.field5931);
                    continue;
                }
            }
            field249++;
            class249.field3379.method810(arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 108)
    public static final void method157(int arg0, int arg1) {
        field250++;
        class410.field5933 = arg0;
        class329.field4707.method2043(arg1 ^ 0xFFFFDF9E);
        if (arg1 != 8225) {
            method157(83, 68);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V", line = 127)
    public static void method158(byte arg0) {
        field254 = null;
        if (arg0 == 69) {
            field251 = null;
        }
    }
}
