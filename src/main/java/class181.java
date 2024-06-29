import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class181 extends class216 {

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "[I")
    public static int[] field3116 = new int[1000];

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "Ljava/util/Random;")
    public static Random field3111 = new Random();

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field3119 = 0;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "[I")
    public static int[] field3118 = new int[2048];

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "Lbd;")
    public static class162 field3122 = class17.method142(0, " loggt sich ein)3");

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public int field3106;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    public int field3112;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "Lda;")
    public static class143 field3110;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "Lda;")
    public static class143 field3120;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "Lbd;")
    public class162 field3117;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "[I")
    public int[] field3114;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "[I")
    public int[] field3115;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "[Lbd;")
    public class162[] field3113;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "[Lbe;")
    public class235[] field3121;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBIIIIII)V", line = 11)
    public static final void method1374(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3109++;
        int var8 = class19.method172(class303.field5106, arg0, class298.field4989, false);
        int var9 = class19.method172(class303.field5106, arg5, class298.field4989, false);
        if (arg1 > -18) {
            field3111 = (Random) null;
        }
        int var10 = class19.method172(class112.field2028, arg4, class82.field1426, false);
        int var11 = class19.method172(class112.field2028, arg3, class82.field1426, false);
        int var12 = class19.method172(class303.field5106, arg0 + arg6, class298.field4989, false);
        int var13 = class19.method172(class303.field5106, arg5 - arg6, class298.field4989, false);
        for (int var14 = var8; var14 < var12; var14++) {
            class3.method14(arg7, var10, var11, class184.field3180[var14], -123);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class3.method14(arg7, var10, var11, class184.field3180[var15], -111);
        }
        int var16 = class19.method172(class112.field2028, arg4 + arg6, class82.field1426, false);
        int var17 = class19.method172(class112.field2028, arg3 - arg6, class82.field1426, false);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class184.field3180[var18];
            class3.method14(arg7, var10, var16, var19, -125);
            class3.method14(arg2, var16, var17, var19, -124);
            class3.method14(arg7, var17, var11, var19, -104);
        }
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(B)V", line = 65)
    public static void method1375(byte arg0) {
        field3116 = null;
        if (arg0 != 4) {
            field3120 = (class143) null;
        }
        field3122 = null;
        field3120 = null;
        field3111 = null;
        field3118 = null;
        field3110 = null;
    }
}
