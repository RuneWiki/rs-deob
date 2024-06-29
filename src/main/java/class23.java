import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class23 extends class223 {

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    private int field409;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public static int field408 = 1401;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "Lvj;")
    public static class304 field407 = new class304("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "Z")
    public static boolean field413 = true;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "Ldf;")
    public static class274 field415;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Lpc;")
    public static class473 field403;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Ljava/lang/Object;")
    public static Object field399;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(III)V", line = 5)
    public final void method205(int arg0, int arg1, int arg2) {
        ++field396;
        if (arg2 != -28706) {
            this.field405 = 112;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V", line = 17)
    public static void method206(int arg0) {
        field403 = null;
        field407 = null;
        field399 = null;
        if (arg0 <= 4) {
            method207(39);
        }
        field415 = null;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)I", line = 38)
    public static final int method207(int arg0) {
        if (arg0 >= -99) {
            return 23;
        } else {
            ++field395;
            class236 var1 = class388.field5270;
            synchronized (class388.field5270) {
                return class388.field5270.method1467(77);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lpc;I)V", line = 54)
    public static final void method208(class473 arg0, int arg1) {
        if (arg1 == 0) {
            class518.field7682 = arg0;
            ++field410;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V", line = 67)
    public final void method209(int arg0, int arg1, int arg2) {
        ++field412;
        if (arg1 != 0) {
            method212(-79);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIZ)Z", line = 78)
    public static final boolean method210(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method210(63, -12, false);
        }
        ++field393;
        return (33 & arg1) != 0;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(III)V", line = 90)
    public final void method211(int arg0, int arg1, int arg2) {
        ++field406;
        int var4 = this.field402 * arg1 >> 12;
        int var5 = this.field392 * arg0 >> 12;
        if (arg2 != 91) {
            field407 = null;
        }
        int var6 = this.field405 * arg1 >> 12;
        int var7 = this.field397 * arg0 >> 12;
        int var8 = this.field411 * arg1 >> 12;
        int var9 = this.field409 * arg0 >> 12;
        int var10 = this.field400 * arg1 >> 12;
        int var11 = this.field398 * arg0 >> 12;
        class60.method424(var8, var11, var6, var10, var4, var9, super.field3010, var7, var5, arg2 ^ 44);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 120)
    public class23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field397 = arg3;
        this.field398 = arg7;
        this.field411 = arg4;
        this.field405 = arg2;
        this.field402 = arg0;
        this.field392 = arg1;
        this.field409 = arg5;
        this.field400 = arg6;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V", line = 139)
    public static final void method212(int arg0) {
        ++field404;
        if (!class74.field1112) {
            class104.field1531 = true;
            class74.field1112 = true;
            if (class154.field2244.field7738) {
                class426.field5820 = (float) ((int) class426.field5820 + -17 & -16);
            } else {
                class48.field754 += (-12.0F - class48.field754) / 2.0F;
            }
            if (arg0 != 1401) {
                field399 = null;
            }
        }
    }
}
