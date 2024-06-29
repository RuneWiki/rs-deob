import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class160 {

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Lkb;")
    public static class93 field3214 = class76.method390("Bitte geben Sie Ihren Benutzenamen ein)3", 0);

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Lkb;")
    public static class93 field3215 = class76.method390("null", 0);

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Lkb;")
    public static class93 field3213 = class76.method390("Ihr Charakter)2Profil wird in:", 0);

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field3217 = 0;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
    public static void method1094(boolean arg0) {
        field3214 = null;
        field3213 = null;
        if (!arg0) {
            field3215 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILh;)V")
    public static final void method1095(int arg0, class65 arg1) {
        field3216++;
        if (arg0 == 0 && class29.field482 == arg1.field1109) {
            class203.field3927[arg1.field1135] = true;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII[B[Lqf;III)V")
    public static final void method1096(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, class151[] arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg3 + var10 > 0 && arg3 + var10 < 103 && arg8 + var15 > 0 && arg8 + var15 < 103) {
                    arg6[arg1].field2916[arg3 + var10][arg8 + var15] = class91.method479(arg6[arg1].field2916[arg3 + var10][arg8 + var15], -16777217);
                }
            }
        }
        field3211++;
        class158 var11 = new class158(arg5);
        if (arg9 <= 59) {
            method1094(false);
        }
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg7 == var12 && var13 >= arg0 && arg0 + 8 > var13 && var14 >= arg4 && var14 < arg4 + 8) {
                        class80.method402(var11, arg8 + class88.method446(arg2, var13 & 0x7, var14 & 0x7, -4193), class139.method871(3, var13 & 0x7, arg2, var14 & 0x7) + arg3, arg1, arg2, 0, 0, 21165);
                    } else {
                        class80.method402(var11, -1, -1, 0, 0, 0, 0, 21165);
                    }
                }
            }
        }
    }
}
