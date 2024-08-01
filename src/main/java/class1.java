import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("a")
public class class1 {

    @OriginalMember(owner = "a", name = "c", descriptor = "Llf;")
    public static class109 field3 = class35.method275("Anmelde)2Limit -Uberschritten)3", 2);

    @OriginalMember(owner = "a", name = "b", descriptor = "Llf;")
    public static class109 field2 = class35.method275("Texturen geladen)3", 2);

    @OriginalMember(owner = "a", name = "d", descriptor = "Llf;")
    public static class109 field4 = class35.method275(" zuerst von Ihrer Ignorieren)2Liste(Q", 2);

    @OriginalMember(owner = "a", name = "a", descriptor = "Llf;")
    public static class109 field1 = class35.method275("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", 2);

    @OriginalMember(owner = "a", name = "f", descriptor = "J")
    public static volatile long field6 = 0L;

    @OriginalMember(owner = "a", name = "g", descriptor = "Llf;")
    public static class109 field7 = class35.method275(" x ", 2);

    @OriginalMember(owner = "a", name = "h", descriptor = "[I")
    public static int[] field8 = new int[32768];

    @OriginalMember(owner = "a", name = "j", descriptor = "I")
    public static int field10 = 0;

    @OriginalMember(owner = "a", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "a", name = "i", descriptor = "Leh;")
    public static class49 field9;

    @OriginalMember(owner = "a", name = "a", descriptor = "(III)Z")
    public static final boolean method1(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class125.field2412; var3++) {
            class164 var4 = class84.field1696[var3];
            if (var4.field3073 == 1) {
                int var5 = var4.field3093 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3087 * var5 >> 8) + var4.field3090;
                    int var7 = (var4.field3079 * var5 >> 8) + var4.field3072;
                    int var8 = (var4.field3074 * var5 >> 8) + var4.field3089;
                    int var9 = (var4.field3091 * var5 >> 8) + var4.field3086;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3073 == 2) {
                int var10 = arg0 - var4.field3093;
                if (var10 > 0) {
                    int var11 = (var4.field3087 * var10 >> 8) + var4.field3090;
                    int var12 = (var4.field3079 * var10 >> 8) + var4.field3072;
                    int var13 = (var4.field3074 * var10 >> 8) + var4.field3089;
                    int var14 = (var4.field3091 * var10 >> 8) + var4.field3086;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3073 == 3) {
                int var15 = var4.field3090 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3083 * var15 >> 8) + var4.field3093;
                    int var17 = (var4.field3066 * var15 >> 8) + var4.field3082;
                    int var18 = (var4.field3074 * var15 >> 8) + var4.field3089;
                    int var19 = (var4.field3091 * var15 >> 8) + var4.field3086;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3073 == 4) {
                int var20 = arg2 - var4.field3090;
                if (var20 > 0) {
                    int var21 = (var4.field3083 * var20 >> 8) + var4.field3093;
                    int var22 = (var4.field3066 * var20 >> 8) + var4.field3082;
                    int var23 = (var4.field3074 * var20 >> 8) + var4.field3089;
                    int var24 = (var4.field3091 * var20 >> 8) + var4.field3086;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3073 == 5) {
                int var25 = arg1 - var4.field3089;
                if (var25 > 0) {
                    int var26 = (var4.field3083 * var25 >> 8) + var4.field3093;
                    int var27 = (var4.field3066 * var25 >> 8) + var4.field3082;
                    int var28 = (var4.field3087 * var25 >> 8) + var4.field3090;
                    int var29 = (var4.field3079 * var25 >> 8) + var4.field3072;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(I)V")
    public static void method2(int arg0) {
        field7 = null;
        field1 = null;
        if (arg0 != 2) {
            method1(-56, 72, 106);
        }
        field2 = null;
        field3 = null;
        field8 = null;
        field4 = null;
        field9 = null;
    }
}
