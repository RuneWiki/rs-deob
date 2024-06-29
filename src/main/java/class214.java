import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class214 {

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "Lbv;")
    public static class567 field3243;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field3245;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "Lfaa;")
    public static class273 field3244;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "Lha;")
    public static class116 field3242;

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(II)V")
    public class214(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!nn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3237++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)Z")
    public static final boolean method1451(int arg0, int arg1, int arg2) {
        if (arg2 <= 91) {
            return true;
        } else {
            field3241++;
            return class252.method1593((byte) 119, arg1, arg0) | (arg0 & 0x70000) != 0 || class511.method2866(arg1, arg0, 46);
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(III)V")
    public static final void method1452(int arg0, int arg1, int arg2) {
        class184 var3 = class277.field4051[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field2669 != null) {
            var3.field2669 = null;
        }
        if (var3.field2653 != null) {
            var3.field2653 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)Lah;")
    public static final class240 method1453(int arg0, int arg1) {
        field3239++;
        class240 var2 = (class240) class390.field5814.method3286(arg0 + 8000, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class108.field1804.method3175(0, (byte) -53, arg1);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class240 var4 = class69.method680(var3, -1);
        class390.field5814.method3287(0, (long) arg1, var4);
        if (arg0 != -8091) {
            field3245 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public static void method1454(int arg0) {
        field3243 = null;
        field3244 = null;
        field3245 = null;
        field3242 = null;
        int var1 = -121 % ((50 - arg0) / 56);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IILn;BLqa;II)V")
    public static final void method1455(int arg0, int arg1, class472 arg2, byte arg3, class167 arg4, int arg5, int arg6) {
        if (arg3 != -38) {
            method1452(-100, -20, 64);
        }
        field3238++;
        if (class210.field2970 < 100) {
            class431.method2568((byte) 98, arg4, arg2);
        }
        arg4.method615(arg1, arg0, arg1 + arg6, arg0 + arg5);
        if (class210.field2970 < 100) {
            byte var7 = 20;
            int var8 = arg6 / 2 + arg1;
            int var9 = arg0 + (arg5 / 2) - var7 - 18;
            arg4.method653(arg1, arg0, arg6, arg5, -16777216, 0);
            arg4.method638(var8 - 152, var9, 304, 34, class534.field7461[class635.field9232].getRGB(), 0);
            arg4.method653(var8 - 150, var9 + 2, class210.field2970 * 3, 30, class35.field464[class635.field9232].getRGB(), 0);
            class273.field3996.method1635(class79.field1429.method3220(false, class538.field7500), var8, -1, 16777215, var7 + var9, class263.field3836[class635.field9232].getRGB());
            return;
        }
        int var10 = class274.field4008 - ((int) ((float) arg6 / class212.field3102));
        int var11 = (int) ((float) arg5 / class212.field3102) + class119.field1915;
        int var12 = (int) ((float) arg6 / class212.field3102) + class274.field4008;
        class621.field8756 = (int) ((float) (arg6 * 2) / class212.field3102);
        class271.field3981 = class274.field4008 - ((int) ((float) arg6 / class212.field3102));
        class151.field2280 = (int) ((float) (arg5 * 2) / class212.field3102);
        int var13 = class119.field1915 - (int) ((float) arg5 / class212.field3102);
        class485.field6859 = class119.field1915 - ((int) ((float) arg5 / class212.field3102));
        class212.method1427(var10 + class212.field3118, class212.field3120 + var11, class212.field3118 + var12, class212.field3120 + var13, arg1, arg0, arg1 + arg6, arg0 + arg5 - -1);
        class212.method1420(arg4);
        class47 var14 = class212.method1409(arg4);
        class530.method2981(var14, arg4, 0, arg3 + 138, 0);
        if (class62.field856 > 0) {
            class608.field8634--;
            if (class608.field8634 == 0) {
                class62.field856--;
                class608.field8634 = 20;
            }
        }
        if (!class201.field2844) {
            return;
        }
        int var15 = arg1 + arg6 - 5;
        int var16 = arg5 + arg0 - 8;
        class409.field6077.method1632(var16, arg3 ^ 0x54, var15, "Fps:" + class437.field6388, 16776960, -1);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class409.field6077.method1632(var20, -98, var15, "Mem:" + var18 + "k", var19, -1);
        var16 = var20 - 15;
    }

    static {
        new class567("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field3243 = new class567("scroll:", "scrollen:", "déroulement:", "rolagem:");
        field3245 = new Rectangle[100];
        field3244 = new class273();
    }
}
