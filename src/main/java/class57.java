import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class57 {

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field1070 = 0;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Lvd;")
    public static class222 field1068 = class212.method1357(")4slr2)3ws?order=LPWM", 10731);

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Lba;")
    public static class13 field1074 = null;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Lvd;")
    public static class222 field1075 = class212.method1357("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", 10731);

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lvd;")
    public static class222 field1069 = class212.method1357("l", 10731);

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field1076 = 0;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIII)V")
    public static final void method417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg4 + 1;
        class81.method532(arg3, arg1, class156.field2981[arg4], arg0, -7);
        int var9 = arg5 - 1;
        class81.method532(arg3, arg1, class156.field2981[arg5], arg0, -7);
        if (arg2 != -8193) {
            return;
        }
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class156.field2981[var6];
            var7[arg3] = var7[arg0] = arg1;
        }
        field1071++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method418(int arg0) {
        field1074 = null;
        field1068 = null;
        field1075 = null;
        if (arg0 > -83) {
            method419(-68);
        }
        field1069 = null;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public static final void method419(int arg0) {
        if (arg0 != 906) {
            return;
        }
        field1073++;
        if (class180.field3335 != null) {
            class215 var1 = class180.field3335;
            synchronized (class180.field3335) {
                class180.field3335 = null;
            }
        }
    }
}
