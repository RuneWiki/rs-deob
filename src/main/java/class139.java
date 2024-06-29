import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public abstract class class139 extends class45 {

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
    public static int field1909 = -1;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "Lkp;")
    public static class8 field1912 = new class8();

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "F")
    public static float field1914;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "[Lcq;")
    public static class67[] field1915;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIII)I", line = 3)
    public static final int method894(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1916++;
        if ((arg0 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg1;
            arg1 = var7;
        }
        int var8 = arg2 & 0x3;
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return arg6;
        } else if (~var8 == arg3) {
            return 1 + 7 - arg5 - arg4;
        } else {
            return 7 + 1 - arg6 - arg1;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILjava/util/Random;I)I", line = 32)
    public static final int method895(int arg0, Random arg1, int arg2) {
        if (arg0 != -19416) {
            field1912 = null;
        }
        field1913++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class192.method1154(true, arg2)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class316.method2136(-1, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)I", line = 63)
    public static final int method896(int arg0, int arg1) {
        field1911++;
        int var8 = arg0 - 1;
        int var2 = var8 | var8 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = -37 / ((-arg1 - 12) / 50);
        int var6 = var4 | var4 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 83)
    public static final void method897(int arg0, boolean arg1, String arg2) {
        field1910++;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = -46 % ((arg0 + 20) / 36);
        int var6 = 0;
        int var7 = arg1 ? 32768 : 0;
        int var8 = (arg1 ? class164.field2212 : class379.field5520) + var7;
        for (int var9 = var7; var9 < var8; var9++) {
            class379 var12 = class418.method2678(var9, 14317);
            if (var12.field5504 && var12.method2463(-25).toLowerCase().indexOf(var3) != -1) {
                if (var6 >= 50) {
                    class410.field6054 = null;
                    class149.field2041 = -1;
                    return;
                }
                if (var6 >= var4.length) {
                    short[] var13 = new short[var4.length * 2];
                    for (int var14 = 0; var14 < var6; var14++) {
                        var13[var14] = var4[var14];
                    }
                    var4 = var13;
                }
                var4[var6++] = (short) var9;
            }
        }
        class299.field4373 = 0;
        class149.field2041 = var6;
        class410.field6054 = var4;
        String[] var10 = new String[class149.field2041];
        for (int var11 = 0; var11 < class149.field2041; var11++) {
            var10[var11] = class418.method2678(var4[var11], 14317).method2463(-32);
        }
        class135.method846(8851, var10, class410.field6054);
    }

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(I)V", line = 154)
    public static void method898(int arg0) {
        if (arg0 <= 118) {
            method896(-118, -79);
        }
        field1915 = null;
        field1912 = null;
    }
}
