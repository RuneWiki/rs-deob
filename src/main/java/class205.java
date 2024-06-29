import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class205 extends class80 {

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public int field3385;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public int field3389;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field3380 = -1;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "Lph;")
    public static class229 field3379 = class266.method1858(" zuerst von Ihrer Freunde)2Liste(Q", 0);

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "Lph;")
    public static class229 field3388 = null;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "Lri;")
    public static class301 field3390;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "[I")
    public static int[] field3377;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIJIZ)Lph;", line = 5)
    public static final class229 method1432(int arg0, int arg1, long arg2, int arg3, boolean arg4) {
        if (arg3 > -28) {
            field3388 = (class229) null;
        }
        field3384++;
        class229 var6 = class121.method904(0, 30487);
        if (arg2 < 0L) {
            arg2 = -arg2;
            var6.method1631(class180.field2949, true);
        }
        class229 var7 = class208.field3430;
        class229 var8 = class255.field4262;
        if (arg1 == 1) {
            var7 = class255.field4262;
            var8 = class208.field3430;
        }
        if (arg1 == 2) {
            var7 = class255.field4262;
            var8 = class275.field4589;
        }
        if (arg1 == 3) {
            var7 = class255.field4262;
            var8 = class208.field3430;
        }
        class229 var9 = class121.method904(0, 30487);
        class229 var10 = class121.method904(0, 30487);
        for (int var11 = 0; var11 < arg0; var11++) {
            var10.method1631(class50.method354(0, (int) (arg2 % 10L)), true);
            arg2 /= 10L;
        }
        if (arg2 == 0L) {
            var9 = class5.field66;
        }
        int var12 = 0;
        while (arg2 > 0L) {
            if (arg4 && var12 != 0 && var12 % 3 == 0) {
                var9.method1631(var8, true);
            }
            var12++;
            var9.method1631(class50.method354(0, (int) (arg2 % 10L)), true);
            arg2 /= 10L;
        }
        if (var10.method1642(93) > 0) {
            var10.method1631(var7, true);
        }
        return class248.method1746(8528, new class229[] { var6, var9.method1612((byte) 30), var10.method1612((byte) 30) });
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([BI)Z", line = 85)
    public static final boolean method1433(byte[] arg0, int arg1) {
        field3374++;
        class164 var2 = new class164(arg0);
        int var3 = var2.method1178(8);
        if (var3 != 1) {
            return false;
        }
        if (arg1 < 65) {
            method1437(-14);
        }
        boolean var4 = var2.method1178(8) == 1;
        if (var4) {
            class48.method338(22, var2);
        }
        class65.method491(0, var2);
        return true;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V", line = 109)
    public static final void method1434(int arg0, int arg1) {
        field3375++;
        class118.field1982.method1418((byte) -17, arg0);
        class98.field1659.method1418((byte) -17, arg0);
        if (arg1 == 1) {
            class25.field333.method1418((byte) -17, arg0);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIII)V", line = 124)
    public static final void method1435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3383++;
        int var7 = arg6 + arg4;
        if (arg2 != 4542) {
            method1436((class301) null, 114);
        }
        for (int var8 = arg6; var8 < var7; var8++) {
            class193.method1354((byte) -37, arg5, arg3, arg0, class202.field3337[var8]);
        }
        int var9 = arg3 + arg4;
        int var10 = arg5 - arg4;
        int var11 = arg1 - arg4;
        for (int var12 = arg1; var12 > var11; var12--) {
            class193.method1354((byte) -37, arg5, arg3, arg0, class202.field3337[var12]);
        }
        for (int var13 = var7; var13 <= var11; var13++) {
            int[] var14 = class202.field3337[var13];
            class193.method1354((byte) -37, var9, arg3, arg0, var14);
            class193.method1354((byte) -37, arg5, var10, arg0, var14);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lri;I)Z", line = 177)
    public static final boolean method1436(class301 arg0, int arg1) {
        field3381++;
        if (arg0.field4996 == 205) {
            class208.field3429 = 250;
            return true;
        } else if (arg1 >= -120) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V", line = 206)
    public static void method1437(int arg0) {
        int var1 = -118 / ((arg0 + 73) / 52);
        field3390 = null;
        field3379 = null;
        field3377 = null;
        field3388 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZ)V", line = 220)
    public static final void method1438(int arg0, boolean arg1) {
        if (!arg1) {
            method1434(108, 14);
        }
        field3386++;
        class265.field4460.method1418((byte) -17, arg0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lph;ZILph;)V", line = 238)
    public static final void method1439(class229 arg0, boolean arg1, int arg2, class229 arg3) {
        field3376++;
        if (!arg1) {
            method1438(-81, false);
        }
        class190.method1323(-1, (class229) null, arg2, 18411, arg3, arg0);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(II)V", line = 255)
    public class205(int arg0, int arg1) {
        this.field3385 = arg0;
        this.field3389 = arg1;
    }
}
