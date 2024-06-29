import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class420 {

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Lsa;")
    public static class130 field6203 = new class130(0, 0);

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Lwt;")
    public static class194 field6204 = new class194("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field6206 = 0;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field6205 = 13156520;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Ljava/lang/String;")
    public static String field6207;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "[Z")
    public static boolean[] field6208;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method2487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class391.field5800 = arg3;
        class350.field5085 = arg1;
        field6202++;
        class348.field5043 = arg4;
        if (arg2 < 54) {
            return;
        }
        class278.field3964 = arg5;
        class167.field2190 = arg0;
        if (class278.field3964 >= 100) {
            int var6 = class167.field2190 * 128 + 64;
            int var7 = class350.field5085 * 128 + 64;
            int var8 = class103.method620(class355.field5121, var7, (byte) 20, var6) - class348.field5043;
            int var9 = var6 - class205.field2843;
            int var10 = var8 - class432.field6338;
            int var11 = var7 - class282.field4026;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class317.field4653 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class21.field284 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            class236.field3317 = 0;
            if (class317.field4653 < 1024) {
                class317.field4653 = 1024;
            }
            if (class317.field4653 > 3072) {
                class317.field4653 = 3072;
            }
        }
        class306.field4454 = 2;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 51)
    public static void method2488(int arg0) {
        field6204 = null;
        field6208 = null;
        field6203 = null;
        field6207 = null;
        int var1 = -33 % ((49 - arg0) / 54);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljo;)V", line = 66)
    public static final void method2489(class210 arg0) {
        for (int var1 = arg0.field2972; var1 <= arg0.field2962; var1++) {
            for (int var2 = arg0.field2975; var2 <= arg0.field2957; var2++) {
                class468 var3 = class358.field5312[arg0.field2956][var1][var2];
                if (var3 != null) {
                    class323 var4 = var3.field6769;
                    class323 var5 = null;
                    while (var4 != null) {
                        if (var4.field4726 == arg0) {
                            if (var5 == null) {
                                var3.field6769 = var4.field4727;
                            } else {
                                var5.field4727 = var4.field4727;
                            }
                            var4.method1938(-243);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field4727;
                    }
                    var3.field6767 = 0;
                    for (class323 var6 = var3.field6769; var6 != null; var6 = var6.field4727) {
                        var3.field6767 = (byte) (var3.field6767 | var6.field4730);
                    }
                }
            }
        }
    }
}
