import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class110 extends class443 {

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "Lhd;")
    public class258 field1431;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1433 = "white:";

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "[I")
    public static int[] field1437 = new int[2];

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "[I")
    public static int[] field1434 = new int[5];

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(B)V", line = 11)
    public static void method823(byte arg0) {
        field1433 = null;
        field1434 = null;
        field1437 = null;
        if (arg0 != 85) {
            method823((byte) 36);
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lhd;)V", line = 23)
    public class110(class258 arg0) {
        this.field1431 = arg0;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)Lps;", line = 31)
    public static final class162 method824(int arg0, int arg1, int arg2, int arg3) {
        field1436++;
        class77 var4 = class106.field1405[arg3][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        class162 var5 = null;
        int var6 = -1;
        class356 var7 = var4.field1064;
        if (arg0 != -2045603225) {
            method824(38, 25, -124, -61);
        }
        while (var7 != null) {
            class407 var8 = var7.field5274;
            if (var8 instanceof class162) {
                class162 var9 = (class162) var8;
                int var10 = (var9.method1091((byte) -105) - 1) * 64 + 60;
                int var11 = var9.field5921 - var10 >> 7;
                int var12 = var9.field5930 - var10 >> 7;
                int var13 = var9.field5921 + var10 >> 7;
                int var14 = var9.field5930 + var10 >> 7;
                if (var11 <= arg1 && arg2 >= var12 && arg1 <= var13 && var14 >= arg2) {
                    int var15 = (var14 + 1 - arg2) * (var13 + 1 - arg1);
                    if (var15 > var6) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
            var7 = var7.field5275;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V", line = 97)
    public static final void method825(int arg0, int arg1, int arg2) {
        class441.field6396++;
        field1435++;
        class140.field1797.method1833(-20379, 33);
        if (arg1 != 2184) {
            field1434 = null;
        }
        class140.field1797.method2225(arg0, -121);
        class140.field1797.method2205(130574744, arg2);
    }
}
