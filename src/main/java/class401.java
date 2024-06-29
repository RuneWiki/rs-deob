import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class401 {

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field5703 = 0;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Z")
    public static final boolean method2519(int arg0, int arg1) {
        class423.field5981 = true;
        field5702++;
        class254.field3573 = arg1 + 1 & 0xFFFF;
        if (arg0 != 1) {
            method2521(3, -119, 109, (class453[]) null, -73, true);
        }
        return true;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lgr;IIII)V")
    public static final void method2520(class249 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class95.method686(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class200.field2772) {
            class95.method686(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class95.method686(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class264.field3687) {
            class95.method686(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class264.field3687) {
            class95.method686(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class200.field2772 && arg4 <= class264.field3687) {
            class95.method686(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class95.method686(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class200.field2772 && arg4 > 0) {
            class95.method686(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III[Lms;IZ)V")
    public static final void method2521(int arg0, int arg1, int arg2, class453[] arg3, int arg4, boolean arg5) {
        for (int var6 = 0; var6 < arg3.length; var6++) {
            class453 var7 = arg3[var6];
            if (var7 != null && var7.field6470 == arg1) {
                class319.method2066(arg5, arg2, arg0, var7, (byte) 90);
                class1.method5(arg2, var7, arg0, -25599);
                if (var7.field6444 > (var7.field6434 - var7.field6342)) {
                    var7.field6444 = var7.field6434 - var7.field6342;
                }
                if (var7.field6444 < 0) {
                    var7.field6444 = 0;
                }
                if ((var7.field6377 - var7.field6447) < var7.field6344) {
                    var7.field6344 = var7.field6377 - var7.field6447;
                }
                if (var7.field6344 < 0) {
                    var7.field6344 = 0;
                }
                if (var7.field6356 == 0) {
                    class224.method1496(arg5, (byte) 124, var7);
                }
            }
        }
        field5704++;
        if (arg4 != 10906) {
            method2519(17, 9);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
    public static final int method2522(String arg0, int arg1, int arg2, String arg3) {
        field5705++;
        int var4 = arg3.length();
        int var5 = arg0.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while ((var6 - var8) < var4 || var5 > var7 - var9) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if (var5 <= (var7 - var9)) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class434.method2729((byte) 51, var22);
            var9 = class434.method2729((byte) 51, var24);
            char var26 = class2.method8(arg2, 192, var22);
            char var27 = class2.method8(arg2, 192, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class371.method2380(arg2, true, var28) - class371.method2380(arg2, true, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg0.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class371.method2380(arg2, true, var20) - class371.method2380(arg2, true, var21);
                }
            }
        }
        if (arg1 != 18397) {
            field5707 = -73;
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg0.charAt(var13);
            if (var14 != var15) {
                return class371.method2380(arg2, true, var14) - class371.method2380(arg2, true, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLnq;)V")
    public static final void method2523(byte arg0, class268 arg1) {
        if (arg0 >= 86) {
            class164.field2265 = arg1;
            field5706++;
        }
    }

    static {
        new class442("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field5707 = 0;
        field5708 = 0;
    }
}
