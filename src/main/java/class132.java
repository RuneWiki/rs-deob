import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class132 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "[I")
    public static int[] field1975 = new int[1000];

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Z")
    public static boolean field1977 = false;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field1981 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "[S")
    public static short[] field1983;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V")
    public static final void method986(int arg0, int arg1) {
        field1980++;
        if (arg0 != 1060698244) {
            return;
        }
        class408 var2 = class261.field3601;
        synchronized (class261.field3601) {
            class261.field3601.method2531(arg1, arg0 - 1060698132);
        }
        class408 var3 = class68.field965;
        synchronized (class68.field965) {
            class68.field965.method2531(arg1, arg0 ^ 0x3F38F8F4);
        }
        class408 var4 = class147.field2135;
        synchronized (class147.field2135) {
            class147.field2135.method2531(arg1, arg0 - 1060698132);
        }
        class408 var5 = class326.field4433;
        synchronized (class326.field4433) {
            class326.field4433.method2531(arg1, 112);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method987(int arg0) {
        field1981 = null;
        field1975 = null;
        if (arg0 != -3) {
            field1977 = true;
        }
        field1983 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIII)V")
    public static final void method988(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1982++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg5 * arg5;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) - arg0) * var11;
        int var19 = (var6 + 1) * var16;
        class149.method1112(arg4, arg2 + arg5, 8, arg2 - arg5, class83.field1157[arg1]);
        int var20 = (arg3 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var19 += var16;
                    var17 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var20;
            var7--;
            var18 -= var15;
            var20 -= var15;
            int var21 = arg1 - var7;
            int var22 = arg1 + var7;
            int var23 = arg2 + var6;
            int var24 = arg2 - var6;
            class149.method1112(arg4, var23, arg0 ^ 0xB, var24, class83.field1157[var21]);
            class149.method1112(arg4, var23, 8, var24, class83.field1157[var22]);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZIIZ)I")
    public static final int method989(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field1976++;
        class57 var5 = class2.method5(arg1, arg3, true);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        if (arg2 >= -116) {
            return 120;
        }
        for (int var7 = 0; var7 < var5.field741.length; var7++) {
            if (var5.field741[var7] >= 0 && class104.field1436 > var5.field741[var7]) {
                class14 var8 = class367.method2308(false, var5.field741[var7]);
                int var9 = var8.method73(arg0, (byte) -38, class405.method2504(arg0, (byte) -72).field2876);
                if (arg4) {
                    var6 += var5.field739[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)I")
    public static final int method990(int arg0, int arg1) {
        if (arg0 != -1) {
            method988(101, -110, -115, -103, -80, 62);
        }
        field1979++;
        int var2 = (arg1 & 0x55555555) + (arg1 >>> 1 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCF) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    static {
        new class368("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field1983 = new short[] { 8, 20, 57, 19, 25, 46, 15, 48 };
        field1984 = 0;
        field1985 = -1;
    }
}
