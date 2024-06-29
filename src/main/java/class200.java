import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class200 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Lkh;")
    public static class117 field3609 = class224.method1450((byte) -30, " )2>");

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "[I")
    public static int[] field3622 = new int[128];

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field3626 = 2;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Lkh;")
    public static class117 field3617 = class224.method1450((byte) 127, "Registrierter Benutzer");

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "B")
    public static byte field3637 = 0;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field3639 = 20;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public int field3611;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public int field3612;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public int field3613;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public int field3615;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public int field3619;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public int field3621;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public int field3623;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public int field3624;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public int field3625;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public int field3627;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public int field3628;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public int field3630;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public int field3631;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public int field3632;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public int field3633;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public int field3634;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public int field3635;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    public int field3640;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "Ljava/awt/Font;")
    public static Font field3638;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3629++;
        if (arg9 != 2) {
            field3609 = null;
        }
        class159 var10 = null;
        for (class159 var11 = (class159) class145.field2606.method314((byte) -26); var11 != null; var11 = (class159) class145.field2606.method320(0)) {
            if (var11.field2902 == arg6 && var11.field2900 == arg4 && var11.field2893 == arg5 && var11.field2906 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class159();
            var10.field2906 = arg3;
            var10.field2893 = arg5;
            var10.field2902 = arg6;
            var10.field2900 = arg4;
            class4.method33((byte) -51, var10);
            class145.field2606.method325(arg9 + 122, var10);
        }
        var10.field2914 = arg7;
        var10.field2905 = arg8;
        var10.field2908 = arg2;
        var10.field2896 = arg0;
        var10.field2911 = arg1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public static void method1332(boolean arg0) {
        field3617 = null;
        field3638 = null;
        if (!arg0) {
            field3639 = 76;
        }
        field3609 = null;
        field3622 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lkh;ILai;Lkh;)[Lnb;")
    public static final class144[] method1333(class117 arg0, int arg1, class10 arg2, class117 arg3) {
        int var4 = arg2.method84(arg0, 1491);
        if (arg1 != 0) {
            field3622 = null;
        }
        field3614++;
        int var5 = arg2.method102(false, arg3, var4);
        return class154.method1101(false, arg2, var4, var5);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILkh;)I")
    public static final int method1334(int arg0, class117 arg1) {
        if (arg0 == 0) {
            field3618++;
            return arg1.method819((byte) -112) + 1;
        } else {
            return -97;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[B)V")
    public static final void method1335(byte arg0, byte[] arg1) {
        field3636++;
        class145 var2 = new class145(arg1);
        var2.field2643 = arg1.length - 2;
        class203.field3668 = var2.method1049((byte) 97);
        class106.field1927 = new int[class203.field3668];
        class100.field1827 = new int[class203.field3668];
        class105.field1921 = new byte[class203.field3668][];
        class204.field3690 = new int[class203.field3668];
        class11.field376 = new int[class203.field3668];
        var2.field2643 = arg1.length - class203.field3668 * 8 - 7;
        class106.field1934 = var2.method1049((byte) 112);
        class199.field3582 = var2.method1049((byte) 88);
        int var3 = (var2.method998(95) & 0xFF) + 1;
        for (int var4 = 0; var4 < class203.field3668; var4++) {
            class100.field1827[var4] = var2.method1049((byte) 101);
        }
        for (int var5 = 0; var5 < class203.field3668; var5++) {
            class106.field1927[var5] = var2.method1049((byte) 97);
        }
        int var6 = 0;
        if (arg0 <= 84) {
            return;
        }
        while (class203.field3668 > var6) {
            class204.field3690[var6] = var2.method1049((byte) 96);
            var6++;
        }
        for (int var7 = 0; var7 < class203.field3668; var7++) {
            class11.field376[var7] = var2.method1049((byte) 91);
        }
        var2.field2643 = arg1.length + 3 - var3 * 3 - class203.field3668 * 8 - 7;
        class122.field2287 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class122.field2287[var8] = var2.method1023(-1002744);
            if (class122.field2287[var8] == 0) {
                class122.field2287[var8] = 1;
            }
        }
        var2.field2643 = 0;
        for (int var9 = 0; var9 < class203.field3668; var9++) {
            int var10 = class204.field3690[var9];
            int var11 = class11.field376[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class105.field1921[var9] = var13;
            int var14 = var2.method998(61);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method994((byte) 51);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method994((byte) 99);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
    public static final void method1336(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class240.field4355 <= arg3 - arg4 && arg3 + arg4 <= class146.field2678 && arg1 - arg4 >= class159.field2910 && class224.field4040 >= arg1 + arg4) {
            class125.method867(arg3, 0, arg1, arg4, arg0);
        } else {
            class123.method858(arg0, arg4, arg1, 109, arg3);
        }
        field3620++;
        if (arg2 != -1254) {
            field3639 = -121;
        }
    }
}
