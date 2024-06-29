import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public abstract class class203 {

    @OriginalMember(owner = "client!on", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2746 = new String[100];

    @OriginalMember(owner = "client!on", name = "e", descriptor = "Ljm;")
    public static class448 field2749 = new class448(64);

    @OriginalMember(owner = "client!on", name = "g", descriptor = "Lqg;")
    public static class296 field2751 = new class296(5000);

    @OriginalMember(owner = "client!on", name = "h", descriptor = "[I")
    public static int[] field2752 = new int[4096];

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2745;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "[S")
    public static short[] field2753;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III)V")
    public abstract void method1029(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V")
    public static void method1157(byte arg0) {
        field2745 = null;
        field2751 = null;
        if (arg0 >= -25) {
            method1160(-24);
        }
        field2752 = null;
        field2753 = null;
        field2746 = null;
        field2749 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lon;)V")
    public abstract void method1024(class203 arg0);

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public abstract void method1020(int arg0);

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
    public abstract void method1032(int arg0);

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIIIIBII)V")
    public static final void method1158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field2750++;
        if (!class492.method2867(arg6, (byte) 95)) {
            return;
        }
        if (arg7 <= 124) {
            field2745 = null;
        }
        if (class392.field5437[arg6] == null) {
            client.method1040(class146.field2099[arg6], -1, arg9, arg3, arg2, arg1, arg0, arg4, arg5, arg8);
        } else {
            client.method1040(class392.field5437[arg6], -1, arg9, arg3, arg2, arg1, arg0, arg4, arg5, arg8);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIILwm;)V")
    public static final void method1159(int arg0, int arg1, int arg2, int arg3, int arg4, class364 arg5) {
        field2748++;
        arg5.method1981(arg0, arg2, arg0 + arg4, arg1 + arg2);
        arg5.method2222(arg1, arg0, arg2, -16777216, 118, arg4);
        if (class373.field5100 < 100) {
            return;
        }
        if (arg3 != 16776960) {
            field2752 = null;
        }
        float var6 = (float) class55.field750 / (float) class55.field756;
        int var7 = arg4;
        int var8 = arg1;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg4 * var6);
        } else {
            var7 = (int) ((float) arg1 / var6);
        }
        int var9 = (arg4 - var7) / 2 + arg0;
        int var10 = (arg1 - var8) / 2 + arg2;
        if (class31.field419 == null || class31.field419.method775() != arg4 || class31.field419.method771() != arg1) {
            class55.method405(class55.field757, class55.field754 + class55.field750, class55.field757 + class55.field756, class55.field754, var9, var10, var7 + var9, var8 + var10);
            class55.method397(arg5);
            class31.field419 = arg5.method2026(var9, var10, var7, var8, false);
        }
        class31.field419.method836(var9, var10);
        int var11 = class160.field2210 * var7 / class55.field756;
        int var12 = class11.field146 * var8 / class55.field750;
        int var13 = class152.field2137 * var7 / class55.field756 + var9;
        int var14 = var8 + var10 - (class28.field367 * var8 / class55.field750) - var12;
        int var15 = -1996554240;
        if (class343.field4601 == class243.field3233) {
            var15 = -1996488705;
        }
        arg5.method2003(var13, var14, var11, var12, var15, 1);
        arg5.method1973(var13, var14, var11, var12, var15, 0);
        if (class134.field1953 <= 0) {
            return;
        }
        int var16;
        if (class308.field4076 > 50) {
            var16 = 500 - class308.field4076 * 5;
        } else {
            var16 = class308.field4076 * 5;
        }
        for (class205 var17 = (class205) class55.field736.method652((byte) 37); var17 != null; var17 = (class205) class55.field736.method653(58)) {
            class313 var18 = class55.field735.method2710(26, var17.field2775);
            if (class330.method1835(8, var18)) {
                if (class15.field215 == var17.field2775) {
                    int var21 = var17.field2777 * var7 / class55.field756 + var9;
                    int var22 = (class55.field750 - var17.field2780) * var8 / class55.field750 + var10;
                    arg5.method2222(4, var21 - 2, var22 + -2, var16 << 24 | 0xFFFF00, 116, 4);
                } else if (class464.field6405 != -1 && class464.field6405 == var18.field4139) {
                    int var19 = var17.field2777 * var7 / class55.field756 + var9;
                    int var20 = var10 + ((class55.field750 - var17.field2780) * var8 / class55.field750);
                    arg5.method2222(4, var19 - 2, var20 + -2, var16 << 24 | 0xFFFF00, arg3 - 16776850, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V")
    public abstract void method1034(int arg0);

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(I)V")
    public abstract void method1028(int arg0);

    @OriginalMember(owner = "client!on", name = "a", descriptor = "()V")
    public abstract void method1023();

    @OriginalMember(owner = "client!on", name = "e", descriptor = "(I)V")
    public abstract void method1031(int arg0);

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III[I)V")
    public abstract void method1022(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!on", name = "a", descriptor = "([I)V")
    public abstract void method1019(int[] arg0);

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(III)V")
    public abstract void method1027(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!on", name = "f", descriptor = "(I)V")
    public static final void method1160(int arg0) {
        for (class408 var1 = (class408) class165.field2281.method2773((byte) 4); var1 != null; var1 = (class408) class165.field2281.method2773((byte) 4)) {
            class299.method1679(false, var1);
        }
        field2747++;
        int var2;
        int var3;
        if (class488.field6789.method2415(114, class222.field2958)) {
            var3 = 0;
            var2 = 3;
        } else {
            var2 = class160.field2220;
            var3 = class160.field2220;
        }
        client.method1038();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1035();
            client.method1050(var4);
            client.method1051(var4);
        }
        client.method1049();
        if (arg0 != 0) {
            method1160(54);
        }
        client.method1053();
    }

    static {
        new class206("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
    }
}
