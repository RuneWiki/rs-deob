import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class301 extends class529 {

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Lss;")
    public static class213 field4723 = new class213("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!da", name = "t", descriptor = "Lqu;")
    public static class219 field4728 = new class219(59, 16);

    @OriginalMember(owner = "client!da", name = "w", descriptor = "[Lhg;")
    public static class363[] field4731 = new class363[14];

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public static int field4733 = 1338;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "F")
    public static float field4726;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public int field4720;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public int field4721;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "Lgr;")
    public static class464 field4732;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "[I")
    public static int[] field4730;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static final void method2024(int arg0) {
        int var1 = 18 % ((arg0 + 61) / 63);
        field4722++;
        class13.field147++;
        class81.method578((byte) 66, class183.field2664);
        class170.field2488.method1437(class159.field2168, 0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static void method2025(byte arg0) {
        field4731 = null;
        field4728 = null;
        if (arg0 > 77) {
            field4723 = null;
            field4732 = null;
            field4730 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(JIZII)Ljava/lang/String;")
    public static final String method2026(long arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4724++;
        if (arg4 != 4160) {
            method2024(-8);
        }
        char var6 = ',';
        char var7 = '.';
        if (arg1 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg1 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            var8 = true;
            arg0 = -arg0;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 > 0) {
            for (int var10 = 0; var10 < arg3; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg0 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg0 * 10)));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg2) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;BC)I")
    public static final int method2027(String arg0, byte arg1, char arg2) {
        field4727++;
        if (arg1 != 10) {
            return -27;
        }
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2 == arg0.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBIIII)V")
    public static final void method2028(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field4725++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg5 * arg5;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        if (arg1 != 32) {
            return;
        }
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg2 >= class462.field7105 && class222.field3750 >= arg2) {
            int var20 = class405.method2598(class460.field7096, class178.field2609, arg3 + arg5, (byte) 119);
            int var21 = class405.method2598(class460.field7096, class178.field2609, arg3 - arg5, (byte) 82);
            class280.method1888(var21, var20, (byte) 82, class103.field1521[arg2], arg4);
        }
        int var22 = (arg0 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var6++;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var17 += var16;
                var6++;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var22;
            var7--;
            var18 -= var15;
            var22 -= var15;
            int var23 = arg2 - var7;
            int var24 = arg2 + var7;
            if (var24 >= class462.field7105 && var23 <= class222.field3750) {
                int var25 = class405.method2598(class460.field7096, class178.field2609, arg3 + var6, (byte) 84);
                int var26 = class405.method2598(class460.field7096, class178.field2609, arg3 - var6, (byte) 85);
                if (class462.field7105 <= var23) {
                    class280.method1888(var26, var25, (byte) 82, class103.field1521[var23], arg4);
                }
                if (class222.field3750 >= var24) {
                    class280.method1888(var26, var25, (byte) 82, class103.field1521[var24], arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method2029(String arg0, String arg1, int arg2) {
        field4729++;
        int var3 = -85 % ((62 - arg2) / 41);
        class334.field5227 = 1;
        class300.field4718 = -1;
        class426.method2695(arg0, false, arg1);
    }
}
