import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class10 {

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "[I")
    public int[] field117;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "[Lfg;")
    public class352[] field121;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field118 = 0;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "Lwa;")
    public static class177 field123 = new class177(5000);

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z[Lwf;I)V", line = 5)
    public static final void method64(boolean arg0, class333[] arg1, int arg2) {
        field119++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class333 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field5105 == 0) {
                    if (var4.field5187 != null) {
                        method64(arg0, var4.field5187, arg2);
                    }
                    class74 var5 = (class74) class272.field3900.method2279((long) var4.field5109, 99);
                    if (var5 != null) {
                        class142.method1104(var5.field982, arg2, (byte) 104);
                    }
                }
                if (arg2 == 0 && var4.field5126 != null) {
                    class135 var6 = new class135();
                    var6.field1831 = var4;
                    var6.field1836 = var4.field5126;
                    class276.method1869(true, var6);
                }
                if (arg2 == 1 && var4.field5039 != null) {
                    if (var4.field5199 >= 0) {
                        class333 var7 = class89.method644(-110, var4.field5109);
                        if (var7 == null || var7.field5187 == null || var7.field5187.length <= var4.field5199 || var7.field5187[var4.field5199] != var4) {
                            continue;
                        }
                    }
                    class135 var8 = new class135();
                    var8.field1836 = var4.field5039;
                    var8.field1831 = var4;
                    class276.method1869(true, var8);
                }
            }
        }
        if (!arg0) {
            field118 = -109;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V", line = 78)
    public static void method65(byte arg0) {
        field123 = null;
        if (arg0 != -97) {
            field123 = (class177) null;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BIIIIIII)V", line = 95)
    public static final void method66(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field120++;
        if (arg4 < 128 || arg5 < 128 || arg4 > 13056 || arg5 > 13056) {
            class300.field4405 = -1;
            class206.field2860 = -1;
            return;
        }
        int var8 = class271.method1847(arg5, true, arg4, class56.field724) - arg2;
        int var9 = arg4 - class112.field1453;
        int var10 = var8 - class343.field5332;
        int var11 = arg5 - class248.field3606;
        int var12 = class350.field5476[class94.field1222];
        int var13 = -115 / ((arg0 + 22) / 61);
        int var14 = class350.field5474[class94.field1222];
        int var15 = class350.field5476[class347.field5398];
        int var16 = class350.field5474[class347.field5398];
        int var17 = var9 * var16 + var11 * var15 >> 16;
        int var18 = var11 * var16 - var9 * var15 >> 16;
        int var20 = var10 * var14 - (var12 * var18) >> 16;
        int var21 = var10 * var12 + var14 * var18 >> 16;
        if (var21 < 50) {
            class206.field2860 = -1;
            class300.field4405 = -1;
        } else if (class47.field623) {
            int var23 = arg3 * 512 >> 8;
            class300.field4405 = var17 * var23 / var21 + arg7;
            int var24 = arg6 * 512 >> 8;
            class206.field2860 = arg1 + (var20 * var24 / var21);
        } else {
            class300.field4405 = arg7 + ((var17 << 9) / var21);
            class206.field2860 = (var20 << 9) / var21 + arg1;
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(I)V", line = 159)
    public class10(int arg0) {
        this.field122 = arg0;
        this.field117 = new int[this.field122];
        this.field121 = new class352[this.field122];
    }
}
