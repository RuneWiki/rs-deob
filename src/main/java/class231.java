import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class231 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "Ldf;")
    public static class51 field4031 = class46.method233("_labels", 100);

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "Ldf;")
    public static class51 field4038 = class46.method233("<col=40ff00>", 100);

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Z")
    public static boolean field4040 = false;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public int field4034;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public int field4035;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public int field4041;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[[B")
    public static byte[][] field4032;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([BBIIIZI[Lkf;III)V")
    public static final void method1592(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class170[] arg7, int arg8, int arg9, int arg10) {
        field4042++;
        if (!arg5) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if ((arg8 + var11) > 0 && arg8 + var11 < 103 && (arg3 + var12) > 0 && arg3 + var12 < 103) {
                        arg7[arg2].field2787[arg8 + var11][arg3 + var12] = class191.method1366(arg7[arg2].field2787[arg8 + var11][arg3 + var12], -16777217);
                    }
                }
            }
        }
        class121 var13 = new class121(arg0);
        byte var14;
        if (arg5) {
            var14 = 1;
        } else {
            var14 = 4;
        }
        if (arg1 != 117) {
            return;
        }
        for (int var15 = 0; var15 < var14; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg4 == var15 && var16 >= arg10 && var16 < arg10 + 8 && var17 >= arg9 && var17 < arg9 + 8) {
                        class161.method1142(class12.method69(arg6, arg1 - 114, var16 & 0x7, var17 & 0x7) + arg3, arg5, (byte) 50, 0, arg8 + class63.method421(-110, var16 & 0x7, arg6, var17 & 0x7), var13, arg6, arg2, 0);
                    } else {
                        class161.method1142(-1, arg5, (byte) 121, 0, -1, var13, 0, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static final void method1593(int arg0) {
        if (arg0 == 7) {
            field4037++;
            class221.field3832.method1350((byte) 127);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Llb;I)V")
    public final void method1594(class121 arg0, int arg1) {
        field4039++;
        while (true) {
            int var3 = arg0.method897(108);
            if (var3 == 0) {
                if (arg1 == 233) {
                    return;
                } else {
                    method1597(false, 29);
                    return;
                }
            }
            this.method1595(-47, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILlb;)V")
    private final void method1595(int arg0, int arg1, class121 arg2) {
        if (arg1 == 1) {
            this.field4034 = arg2.method876(false);
            this.field4041 = arg2.method897(108);
            this.field4035 = arg2.method897(115);
        }
        if (arg0 >= -34) {
            this.method1594((class121) null, 79);
        }
        field4033++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static void method1596(byte arg0) {
        field4032 = null;
        if (arg0 < 114) {
            method1597(true, -78);
        }
        field4038 = null;
        field4031 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZI)I")
    public static final int method1597(boolean arg0, int arg1) {
        field4043++;
        if (arg1 < 0) {
            return 0;
        }
        class136 var2 = (class136) class7.field77.method1453((long) arg1, 1);
        if (var2 == null) {
            return class29.method149(arg1, -26793).field3745;
        }
        int var3 = 0;
        if (arg0) {
            field4032 = null;
        }
        for (int var4 = 0; var4 < var2.field2258.length; var4++) {
            if (var2.field2258[var4] == -1) {
                var3++;
            }
        }
        return var3 + class29.method149(arg1, -26793).field3745 - var2.field2258.length;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
    public static final void method1598(int arg0) {
        field4036++;
        class203.field3397++;
        class95.field1575.method424((byte) 100, 233);
        if (arg0 > -80) {
            method1592((byte[]) null, (byte) -37, 45, -71, 118, false, -16, (class170[]) null, -41, 22, -65);
        }
        for (class42 var1 = (class42) class79.field1265.method1451(-44); var1 != null; var1 = (class42) class79.field1265.method1449(-1)) {
            if (var1.field672 == 0) {
                class258.method1753(true, var1, false);
            }
        }
        if (class1.field3 != null) {
            class25.method135(class1.field3, -28014);
            class1.field3 = null;
        }
    }
}
