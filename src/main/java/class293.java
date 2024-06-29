import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class293 extends class71 {

    @OriginalMember(owner = "client!ed", name = "Z", descriptor = "I")
    private int field5229 = 3072;

    @OriginalMember(owner = "client!ed", name = "fb", descriptor = "I")
    private int field5235 = 2048;

    @OriginalMember(owner = "client!ed", name = "jb", descriptor = "I")
    private int field5239 = 1024;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "Lud;")
    private static class279 field5215 = class130.method1024(")3en", 255);

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "Lud;")
    private static class279 field5221 = class130.method1024("German", 255);

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "I")
    public static int field5224 = 0;

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "Lud;")
    private static class279 field5227 = class130.method1024("French", 255);

    @OriginalMember(owner = "client!ed", name = "bb", descriptor = "Lud;")
    private static class279 field5231 = class130.method1024("en", 255);

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "Lud;")
    private static class279 field5217 = class130.method1024("English", 255);

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "I")
    public static volatile int field5228 = -1;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "Lud;")
    private static class279 field5222 = class130.method1024("pt", 255);

    @OriginalMember(owner = "client!ed", name = "ab", descriptor = "Lud;")
    private static class279 field5230 = class130.method1024(")3fr", 255);

    @OriginalMember(owner = "client!ed", name = "eb", descriptor = "Z")
    public static boolean field5234 = false;

    @OriginalMember(owner = "client!ed", name = "hb", descriptor = "Lud;")
    private static class279 field5237 = class130.method1024("fr", 255);

    @OriginalMember(owner = "client!ed", name = "gb", descriptor = "Lud;")
    public static class279 field5236 = class130.method1024("hint_headicons", 255);

    @OriginalMember(owner = "client!ed", name = "nb", descriptor = "Lud;")
    private static class279 field5243 = class130.method1024(")3pt", 255);

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "Lud;")
    private static class279 field5218 = class130.method1024("Portuguese", 255);

    @OriginalMember(owner = "client!ed", name = "pb", descriptor = "Lud;")
    private static class279 field5245 = class130.method1024("de", 255);

    @OriginalMember(owner = "client!ed", name = "ob", descriptor = "Lud;")
    private static class279 field5244 = class130.method1024(")3de", 255);

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "[Lud;")
    private static class279[] field5219 = new class279[] { field5217, field5221, field5227, field5218 };

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "[Lud;")
    public static class279[] field5225 = new class279[] { field5231, field5245, field5237, field5222 };

    @OriginalMember(owner = "client!ed", name = "mb", descriptor = "[Lud;")
    private static class279[] field5242 = new class279[] { field5215, field5244, field5230, field5243 };

    @OriginalMember(owner = "client!ed", name = "kb", descriptor = "F")
    public static float field5240;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!ed", name = "cb", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!ed", name = "db", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!ed", name = "ib", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!ed", name = "lb", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(IB)[I", line = 11)
    public final int[] method199(int arg0, byte arg1) {
        field5238++;
        if (arg1 > -69) {
            return (int[]) null;
        }
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            int[] var4 = this.method624(arg0, -3, 0);
            for (int var5 = 0; var5 < class215.field3787; var5++) {
                var3[var5] = (var4[var5] * this.field5235 >> 12) + this.field5239;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZLvh;)V", line = 47)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        field5214++;
        if (arg0 == 0) {
            this.field5239 = arg2.method468(28214);
        } else if (arg0 == 1) {
            this.field5229 = arg2.method468(28214);
        } else if (arg0 == 2) {
            this.field1389 = arg2.method483(-118) == 1;
        }
        if (!arg1) {
            method2084(111, -68, 74);
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(III)Z", line = 93)
    public static final boolean method2084(int arg0, int arg1, int arg2) {
        class264 var3 = class252.method1808(arg0, (byte) 4);
        field5220++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg1 >= -107) {
            field5230 = (class279) null;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method1895(arg2, -86);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIZ)Lwc;", line = 115)
    public static final class104 method2085(int arg0, int arg1, boolean arg2) {
        field5223++;
        if (arg2) {
            return (class104) null;
        }
        class104 var3 = (class104) class289.field5152.method610((long) arg0 << 32 | (long) arg1, -1);
        if (var3 == null) {
            var3 = new class104(arg0, arg1);
            class289.field5152.method612(false, var3, var3.field5539);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V", line = 146)
    public final void method627(int arg0) {
        field5233++;
        if (arg0 != 7) {
            field5219 = (class279[]) null;
        }
        this.field5235 = this.field5229 - this.field5239;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V", line = 166)
    public class293() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIB)V", line = 173)
    public static final void method2086(int arg0, int arg1, byte arg2) {
        field5241++;
        class317 var3 = class276.field4890[class287.field5134][arg1][arg0];
        if (var3 == null) {
            class250.method1789(class287.field5134, arg1, arg0);
            return;
        }
        if (arg2 != 86) {
            field5226 = -113;
        }
        int var4 = -99999999;
        class292 var5 = (class292) var3.method2248(-115);
        class292 var6 = null;
        while (var5 != null) {
            class157 var7 = class220.method1612(arg2 ^ 0xFFFFF764, var5.field5203.field1858);
            int var8 = var7.field2831;
            if (var7.field2848 == 1) {
                var8 = (var5.field5203.field1856 + 1) * var8;
            }
            if (var4 < var8) {
                var4 = var8;
                var6 = var5;
            }
            var5 = (class292) var3.method2240(1138);
        }
        if (var6 == null) {
            class250.method1789(class287.field5134, arg1, arg0);
            return;
        }
        var3.method2249(var6, (byte) 123);
        class292 var9 = (class292) var3.method2248(-92);
        class99 var10 = null;
        class99 var11 = null;
        while (var9 != null) {
            class99 var12 = var9.field5203;
            if (var6.field5203.field1858 != var12.field1858) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1858 != var12.field1858 && var11 == null) {
                    var11 = var12;
                }
            }
            var9 = (class292) var3.method2240(1138);
        }
        long var13 = (long) ((arg0 << 7) + arg1 + 1610612736);
        class248.method1778(class287.field5134, arg1, arg0, class130.method1025(arg1 * 128 + 64, 1008652135, class287.field5134, arg0 * 128 + 64), var6.field5203, var13, var10, var11);
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)V", line = 258)
    public static void method2087(int arg0) {
        field5215 = null;
        field5222 = null;
        field5217 = null;
        field5227 = null;
        field5218 = null;
        if (arg0 <= 75) {
            method2085(-19, 87, true);
        }
        field5245 = null;
        field5244 = null;
        field5221 = null;
        field5236 = null;
        field5231 = null;
        field5237 = null;
        field5230 = null;
        field5219 = null;
        field5242 = null;
        field5243 = null;
        field5225 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)[[I", line = 329)
    public final int[][] method86(int arg0, int arg1) {
        int var3 = 66 / ((-arg1 - 70) / 54);
        field5216++;
        int[][] var4 = this.field1400.method1746((byte) 46, arg0);
        if (this.field1400.field4363) {
            int[][] var5 = this.method619(0, 2, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var5[1];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class215.field3787; var12++) {
                var10[var12] = (var6[var12] * this.field5235 >> 12) + this.field5239;
                var9[var12] = (var8[var12] * this.field5235 >> 12) + this.field5239;
                var11[var12] = (var7[var12] * this.field5235 >> 12) + this.field5239;
            }
        }
        return var4;
    }
}
