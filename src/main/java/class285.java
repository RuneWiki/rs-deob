import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class285 {

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field4527 = -2;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "[I")
    public static int[] field4532 = new int[128];

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "F")
    public static float field4529;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public int field4535;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "Ljava/lang/String;")
    public String field4530;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)I", line = 13)
    public static final int method2052(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field4534++;
        if (var4 == 0) {
            return arg1;
        }
        if (arg2 != 9) {
            method2053(-6, 86, 104);
        }
        if (var4 == 1) {
            return 1023 - arg3;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)Lsg;", line = 36)
    public static final class44 method2053(int arg0, int arg1, int arg2) {
        class196 var3 = class194.field2947[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2979; var4++) {
            class44 var5 = var3.field2998[var4];
            if ((var5.field502 >> 29 & 0x3L) == 2L && var5.field504 == arg1 && var5.field497 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V", line = 57)
    public static void method2054(boolean arg0) {
        field4532 = null;
        if (!arg0) {
            method2052(50, -80, -42, 54);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V", line = 70)
    public static final void method2055(byte arg0) {
        field4533++;
        class232.field3512 = new class323[class127.field1861.method122(-73)][];
        class251.field3975 = new boolean[class127.field1861.method122(-96)];
        int var1 = 45 % ((arg0 - 12) / 61);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)Z", line = 87)
    public static final boolean method2056(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class251.field3981 * arg0 + class210.field3161 * arg3 >> 16;
        int var6 = class251.field3981 * arg3 - class210.field3161 * arg0 >> 16;
        int var7 = class58.field682 * arg1 + class4.field46 * var6 >> 16;
        int var8 = class4.field46 * arg1 - class58.field682 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class58.field682 * arg2 + class4.field46 * var6 >> 16;
        int var12 = class4.field46 * arg2 - class58.field682 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class212.field3212 && var13 < class212.field3212) {
            return false;
        } else if (var9 > class253.field4012 && var13 > class253.field4012) {
            return false;
        } else if (var10 < class73.field917 && var14 < class73.field917) {
            return false;
        } else {
            return var10 <= class76.field1003 || var14 <= class76.field1003;
        }
    }
}
