import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class519 {

    @OriginalMember(owner = "client!au", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field7697;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "Lpg;")
    public static class492 field7698;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "Lui;")
    public static class375 field7699;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field7694;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "I")
    public static int field7696;

    // $FF: synthetic field
    @OriginalMember(owner = "client!au", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field7700;

    // $FF: synthetic method
    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3093(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class375("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field7697 = new String[5];
        field7698 = new class492(89, -2);
        field7699 = new class375("green:", "grün:", "vert:", "verde:");
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljb;IJILea;IIII)V", line = 3)
    public static final void method3087(class499 arg0, int arg1, long arg2, int arg3, class15 arg4, int arg5, int arg6, int arg7, int arg8) {
        field7696++;
        int var10 = arg7 * arg7 + arg8 * arg8;
        if (arg2 < ((long) var10)) {
            return;
        }
        if (arg1 < 66) {
            method3089(86, 50, 123, 6);
        }
        int var11 = Math.min(arg0.field7348 / 2, arg0.field7386 / 2);
        if ((var11 * var11) >= var10) {
            class432.method2585(78, arg4, arg0, class316.field4825[arg5], arg8, arg7, arg3, arg6);
            return;
        }
        var11 -= 10;
        int var12;
        if (class432.field6409 == 4) {
            var12 = (int) class482.field7022 & 0x3FFF;
        } else {
            var12 = (int) class482.field7022 + class384.field5871 & 0x3FFF;
        }
        int var13 = class525.field7760[var12];
        int var14 = class525.field7763[var12];
        if (class432.field6409 != 4) {
            var14 = var14 * 256 / (class235.field3345 + 256);
            var13 = var13 * 256 / (class235.field3345 + 256);
        }
        int var15 = arg8 * var13 + (arg7 * var14) >> 15;
        int var16 = arg8 * var14 - arg7 * var13 >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class4.field62[arg5].method1333((float) arg0.field7348 / 2.0F + (float) arg3 + (float) var19, (float) arg0.field7386 / 2.0F + (float) arg6 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V", line = 54)
    public static final void method3088(byte arg0) {
        field7692++;
        if (arg0 != -15) {
            field7697 = null;
        }
        int var1 = (int) ((double) class96.field1403 * 34.46D);
        int var2 = var1 << 0;
        if (class337.field5242.method1109()) {
            var2 += 128;
        }
        class337.field5242.method1137(50, var2);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIII)Z", line = 72)
    public static final boolean method3089(int arg0, int arg1, int arg2, int arg3) {
        field7694++;
        boolean var4 = true;
        class196 var5 = (class196) class456.method2743(arg3, arg1, arg2);
        if (var5 != null) {
            var4 &= class304.method1950(var5, -1);
        }
        if (arg0 != 17706) {
            field7697 = null;
        }
        class196 var6 = (class196) class432.method2587(arg3, arg1, arg2, field7700 == null ? (field7700 = method3093("ou")) : field7700);
        if (var6 != null) {
            var4 &= class304.method1950(var6, -1);
        }
        class196 var7 = (class196) class380.method2357(arg3, arg1, arg2);
        if (var7 != null) {
            var4 &= class304.method1950(var7, -1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(B)V", line = 100)
    public static void method3090(byte arg0) {
        if (arg0 == -30) {
            field7698 = null;
            field7699 = null;
            field7697 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)I", line = 115)
    public static final int method3091(int arg0, int arg1) {
        if (arg0 != 9910) {
            return -100;
        }
        field7693++;
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ZI)V", line = 158)
    public static final void method3092(boolean arg0, int arg1) {
        field7695++;
        if (arg1 != 256) {
            method3090((byte) -19);
        }
        class220.method1491(arg0, (byte) 126, class486.field7136, class329.field5062, class7.field112);
    }
}
