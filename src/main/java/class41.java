import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public abstract class class41 extends class179 {

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "Luk;")
    public class309 field490;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "Z")
    public static boolean field486 = false;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field488 = 0;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field487 = new Rectangle[100];

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "Lc;")
    public static class436 field489;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field487[var0] = new Rectangle();
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)[Ltr;", line = 3)
    public static final class215[] method255(int arg0) {
        if (class57.field661 == null) {
            class215[] var1 = class318.method1991(class401.field5525, 29400);
            class215[] var2 = new class215[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var4 < var1.length; var4++) {
                class215 var8 = var1[var4];
                if ((var8.field2660 <= 0 || var8.field2660 >= 24) && var8.field2656 >= 800 && var8.field2657 >= 600 && (class105.field1254 >= 96 || class20.field220 != 0 || var8.field2656 <= 1024 && var8.field2657 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class215 var10 = var2[var9];
                        if (var8.field2656 == var10.field2656 && var8.field2657 == var10.field2657) {
                            if (var10.field2660 < var8.field2660) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class57.field661 = new class215[var3];
            class114.method666(var2, 0, class57.field661, 0, var3);
            int[] var5 = new int[class57.field661.length];
            for (int var6 = 0; var6 < class57.field661.length; var6++) {
                class215 var7 = class57.field661[var6];
                var5[var6] = var7.field2657 * var7.field2656;
            }
            class105.method633(var5, class57.field661, -1);
        }
        field491++;
        if (arg0 != 0) {
            field486 = false;
        }
        return class57.field661;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)V", line = 92)
    public static void method256(int arg0) {
        if (arg0 != 768) {
            method257(75, -97, -58, 68, (byte) -115);
        }
        field487 = null;
        field489 = null;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Luk;)V", line = 105)
    public class41(class309 arg0) {
        this.field490 = arg0;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIB)V", line = 118)
    public static final void method257(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field493++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        if (arg4 > -106) {
            method257(53, -77, -93, -127, (byte) -118);
        }
        int var9 = class65.method376(class295.field3937, class427.field5844, arg0 + arg3, (byte) 105);
        int var10 = class65.method376(class295.field3937, class427.field5844, arg3 - arg0, (byte) 117);
        class384.method2394(arg2, 116, class228.field2877[arg1], var9, var10);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg1 - var6;
                int var12 = arg1 + var6;
                if (var12 >= class53.field624 && class118.field1356 >= var11) {
                    int var13 = class65.method376(class295.field3937, class427.field5844, arg3 + var5, (byte) -57);
                    int var14 = class65.method376(class295.field3937, class427.field5844, arg3 - var5, (byte) -43);
                    if (var12 <= class118.field1356) {
                        class384.method2394(arg2, 116, class228.field2877[var12], var13, var14);
                    }
                    if (var11 >= class53.field624) {
                        class384.method2394(arg2, 125, class228.field2877[var11], var13, var14);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (var16 >= class53.field624 && class118.field1356 >= var15) {
                int var17 = class65.method376(class295.field3937, class427.field5844, arg3 + var6, (byte) -84);
                int var18 = class65.method376(class295.field3937, class427.field5844, arg3 - var6, (byte) 88);
                if (var16 <= class118.field1356) {
                    class384.method2394(arg2, 106, class228.field2877[var16], var17, var18);
                }
                if (class53.field624 <= var15) {
                    class384.method2394(arg2, 119, class228.field2877[var15], var17, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V", line = 192)
    public static final void method258(int arg0) {
        field492++;
        if (arg0 == 100) {
            class301.field4028.method2298(arg0 - 100);
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)Z")
    public abstract boolean method118(int arg0);

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method121(int arg0);
}
