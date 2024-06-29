import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class384 extends class431 {

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public int field5777;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public int field5776;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field5774 = 0;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Lak;")
    public static class234 field5773 = new class234("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method2397(byte arg0) {
        int var1 = -124 % ((-arg0 - 1) / 41);
        field5773 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([BIIIII)Z")
    public static final boolean method2398(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5778++;
        boolean var6 = true;
        class217 var7 = new class217(arg0);
        int var8 = -1;
        label56: while (true) {
            int var9 = var7.method1533((byte) 115);
            if (var9 == 0) {
                int var20 = -88 % ((46 - arg5) / 47);
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method1510(-129);
                    if (var13 == 0) {
                        continue label56;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = var10 >> 6 & 0x3F;
                    int var16 = var7.method1515((byte) 125) >> 2;
                    int var17 = arg1 + var15;
                    int var18 = var14 + arg2;
                    if (var17 > 0 && var18 > 0 && var17 < (arg3 - 1) && var18 < (arg4 - 1)) {
                        class69 var19 = class510.field7458.method2973(-122, var8);
                        if (var16 != 22 || class193.field3258.field7224 || var19.field922 != 0 || var19.field926 == 1 || var19.field980) {
                            if (!var19.method605(30027)) {
                                class475.field6863++;
                                var6 = false;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.method1510(-129);
                if (var12 == 0) {
                    break;
                }
                var7.method1515((byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)I")
    public static final int method2399(byte arg0) {
        if (arg0 >= -97) {
            method2401(-31, -5, -17, 90);
        }
        field5775++;
        return class213.field3474;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(II)V")
    public class384(int arg0, int arg1) {
        this.field5777 = arg1;
        this.field5776 = arg0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIBI)V")
    public static final void method2400(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field5772++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg0 * arg0;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = 64 % ((-arg4 - 26) / 58);
        int var17 = var9 << 2;
        int var18 = ((var6 << 1) + 3) * var10;
        int var19 = ((arg3 << 1) - 3) * var11;
        int var20 = (var6 + 1) * var17;
        int var21 = (arg3 - 1) * var15;
        if (arg1 >= class404.field5987 && class433.field6414 >= arg1) {
            int var22 = class385.method2403(class184.field2777, class327.field4931, arg0 + arg5, true);
            int var23 = class385.method2403(class184.field2777, class327.field4931, arg5 - arg0, true);
            class359.method2255((byte) -107, class416.field6200[arg1], var22, var23, arg2);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var20;
                    var13 += var18;
                    var20 += var17;
                    var6++;
                    var18 += var17;
                }
            }
            if (var14 < 0) {
                var13 += var18;
                var14 += var20;
                var20 += var17;
                var18 += var17;
                var6++;
            }
            var13 += -var21;
            var14 += -var19;
            var7--;
            var19 -= var15;
            var21 -= var15;
            int var24 = arg1 - var7;
            int var25 = arg1 + var7;
            if (var25 >= class404.field5987 && class433.field6414 >= var24) {
                int var26 = class385.method2403(class184.field2777, class327.field4931, arg5 + var6, true);
                int var27 = class385.method2403(class184.field2777, class327.field4931, arg5 - var6, true);
                if (class404.field5987 <= var24) {
                    class359.method2255((byte) -115, class416.field6200[var24], var26, var27, arg2);
                }
                if (class433.field6414 >= var25) {
                    class359.method2255((byte) -84, class416.field6200[var25], var26, var27, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIII)V")
    public static final void method2401(int arg0, int arg1, int arg2, int arg3) {
        class138 var4 = client.field3311[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class168 var5 = var4.field2115;
        class168 var6 = var4.field2106;
        if (var5 != null) {
            var5.field2486 = var5.field2486 * arg3 / (0x10 << class163.field2415 - 7);
            var5.field2488 = var5.field2488 * arg3 / (0x10 << class163.field2415 - 7);
        }
        if (var6 != null) {
            var6.field2486 = var6.field2486 * arg3 / (0x10 << class163.field2415 - 7);
            var6.field2488 = var6.field2488 * arg3 / (0x10 << class163.field2415 - 7);
        }
    }
}
