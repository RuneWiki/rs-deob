import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class180 extends class54 {

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    public int field3364;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public int field3356;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "Z")
    public static boolean field3358 = true;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "[I")
    public static int[] field3353 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "Ldc;")
    public static class37 field3355 = class185.method1233((byte) 86, "Hier wechseln");

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "Lce;")
    public static class28 field3357 = new class28(new byte[5000]);

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "Lgb;")
    public static class68 field3351;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "Lhe;")
    public static class81 field3352;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "[[[Lbf;")
    public static class18[][][] field3354;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)V")
    public static void method1194(byte arg0) {
        field3357 = null;
        field3354 = null;
        field3353 = null;
        if (arg0 < -44) {
            field3352 = null;
            field3351 = null;
            field3355 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLce;)Ldc;")
    public static final class37 method1195(byte arg0, class28 arg1) {
        if (arg0 != -80) {
            method1198(false, 29, 124, -84);
        }
        field3363++;
        return class135.method942(arg1, (byte) -26, 32767);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIII)V")
    public static final void method1196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3367++;
        if (arg5 != -4838) {
            field3357 = null;
        }
        if (arg1 == arg2) {
            class239.method1571(arg1, true, arg3, arg0, arg4);
        } else if (arg0 - arg1 >= class29.field536 && arg0 + arg1 <= class82.field1458 && arg4 - arg2 >= class198.field3697 && class199.field3712 >= arg2 + arg4) {
            class105.method681(arg3, arg4, (byte) 58, arg2, arg1, arg0);
        } else {
            class121.method829(arg4, arg2, arg3, arg0, 3, arg1);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V")
    public static final void method1197(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -10) {
            method1198(false, -8, 101, -80);
        }
        class82.field1458 = arg0;
        field3361++;
        class29.field536 = arg1;
        class198.field3697 = arg3;
        class199.field3712 = arg2;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZIII)Ldc;")
    public static final class37 method1198(boolean arg0, int arg1, int arg2, int arg3) {
        field3359++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var4 = arg3 / arg1;
        int var5 = 1;
        while (var4 != 0) {
            var5++;
            var4 /= arg1;
        }
        if (arg2 != -23328) {
            field3357 = null;
        }
        int var6 = var5;
        if (arg3 < 0 || arg0) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = arg3 % arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            arg3 /= arg1;
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class37 var9 = new class37();
        var9.field733 = var6;
        var9.field743 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(II)V")
    public class180(int arg0, int arg1) {
        this.field3364 = arg0;
        this.field3356 = arg1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([BB)[B")
    public static final byte[] method1199(byte[] arg0, byte arg1) {
        field3366++;
        int var2 = arg0.length;
        if (arg1 != 118) {
            method1200(-112, (byte) -109);
        }
        byte[] var3 = new byte[var2];
        class4.method35(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Lmf;")
    public static final class136 method1200(int arg0, byte arg1) {
        field3362++;
        if (arg1 != 111) {
            field3357 = null;
        }
        int var2 = arg0 & 0xFFFF;
        int var3 = arg0 >> 16;
        if (class177.field3344[var3] == null || class177.field3344[var3][var2] == null) {
            boolean var4 = class39.method352(-10924, var3);
            if (!var4) {
                return null;
            }
        }
        return class177.field3344[var3][var2];
    }
}
