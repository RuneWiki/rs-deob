import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class267 extends class323 implements class438 {

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "Loh;")
    public class443 field3959;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "Z")
    private boolean field3960;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field3958 = new Rectangle[100];

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public static int field3976 = 0;

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "Ljn;")
    public static class409 field3979;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "Lgt;")
    public static class341 field3963;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V")
    public static void method1837(int arg0) {
        field3963 = null;
        field3958 = null;
        if (arg0 != 2589) {
            field3958 = null;
        }
        field3979 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lfp;Lje;ZIIII)V")
    public final void method32(class9 arg0, class309 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3974;
        if (arg5 > -31) {
            method1837(23);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lfp;II)Lbi;")
    public final class143 method11(class9 arg0, int arg1, int arg2) {
        ++field3961;
        if (arg2 != -23109) {
            field3976 = -95;
        }
        return this.field3959.method2718(false, 0, false, 0, arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
    public final void method33(int arg0) {
        ++field3965;
        if (arg0 < 109) {
            this.method7((class9) null, 63);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(B)Z")
    public final boolean method34(byte arg0) {
        int var2 = 82 % ((arg0 - -19) / 44);
        ++field3967;
        return false;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)I")
    public final int method6(int arg0) {
        if (arg0 != -20839) {
            this.method4(-38);
        }
        ++field3962;
        return this.field3959.field6462;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lfp;I)V")
    public final void method7(class9 arg0, int arg1) {
        this.field3959.method2724(arg0, 112);
        ++field3971;
        if (arg1 < 98) {
            this.method7((class9) null, -22);
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public final void method4(int arg0) {
        ++field3956;
        if (arg0 != -27030) {
            field3979 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILfp;)Luq;")
    public final class241 method2(int arg0, class9 arg1) {
        ++field3970;
        class143 var3 = this.field3959.method2718(false, super.field4771, true, super.field4764, arg1, 1024, false);
        if (var3 == null) {
            return null;
        } else {
            class187 var4 = arg1.method145();
            var4.method831(super.field4771, super.field4766, super.field4764);
            class241 var5 = null;
            if (arg0 >= -125) {
                this.method14(60, (class9) null);
            }
            if (this.field3960) {
                var5 = class395.method2485(-29083, 1);
            }
            if (this.field3959.field6437 == null) {
                var3.method947(var4, var5 == null ? null : var5.field3578[0], 0);
            } else {
                class400 var6 = this.field3959.field6437.method2076();
                arg1.method166(var3, var6, var4, var5 != null ? var5.field3578[0] : null, 0);
            }
            this.field3959.method2720(super.field4764 >> 7, (byte) 95, super.field4764 >> 7, super.field4771 >> 7, true, arg1, var3, super.field4771 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(ILfp;)V")
    public final void method14(int arg0, class9 arg1) {
        ++field3978;
        class143 var3 = this.field3959.method2718(true, super.field4771, true, super.field4764, arg1, 131072, false);
        if (var3 != null) {
            this.field3959.method2720(super.field4764 >> 7, (byte) 79, super.field4764 >> 7, super.field4771 >> 7, false, arg1, var3, super.field4771 >> 7);
        }
        if (arg0 != -7561) {
            method1837(64);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)I")
    public final int method1(int arg0) {
        if (arg0 > -72) {
            this.method34((byte) -3);
        }
        ++field3969;
        return this.field3959.field6465;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)Z")
    public final boolean method15(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field3964;
            return this.field3959.method2729(-126);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)I")
    public final int method9(byte arg0) {
        ++field3972;
        if (arg0 <= 102) {
            field3976 = 56;
        }
        return this.field3959.field6453;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lfp;Z)V")
    public final void method10(class9 arg0, boolean arg1) {
        ++field3975;
        if (arg1) {
            field3963 = null;
        }
        this.field3959.method2726(18143, arg0);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIZLct;)Le;")
    public static final class100 method1838(int arg0, int arg1, boolean arg2, class104 arg3) {
        if (arg2) {
            field3976 = -74;
        }
        ++field3957;
        byte[] var4 = arg3.method715(arg0, (byte) 100, arg1);
        return var4 == null ? null : new class100(var4);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lfp;III)Z")
    public final boolean method5(class9 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -754) {
            return true;
        } else {
            ++field3977;
            class143 var5 = this.field3959.method2718(false, super.field4771, false, super.field4764, arg0, 65536, false);
            if (var5 == null) {
                return false;
            } else {
                class187 var6 = arg0.method145();
                var6.method831(super.field4771, super.field4766, super.field4764);
                return var5.method988(arg3, arg1, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lfp;Lgn;IIIIIIZI)V")
    public class267(class9 arg0, class178 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        super(arg5, arg6, arg7, arg1.field2467, arg1.field2466);
        this.field3959 = new class443(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
        this.field3960 = arg1.field2479 != 0 && !arg8;
    }

    static {
        for (int var0 = 0; ~var0 > -101; ++var0) {
            field3958[var0] = new Rectangle();
        }
        field3979 = new class409("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");
        new class409("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
    }
}
