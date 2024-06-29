import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class30 {

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "[Lv;")
    private class77[] field422;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public static int field425 = 0;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "Ljava/lang/String;")
    public static String field431 = "Created gameworld";

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "[I")
    public static int[] field427 = new int[100];

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "Ljava/lang/String;")
    public static String field436 = "Discard";

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "Z")
    public static boolean field430 = false;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "J")
    private long field429;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "Lv;")
    private class77 field424;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "[Z")
    public static boolean[] field421;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIBIIIIIIIII)V", line = 4)
    public static final void method208(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field433++;
        class102 var13 = new class102();
        var13.field1468 = arg9;
        var13.field1466 = arg12;
        var13.field1471 = arg6;
        var13.field1463 = arg4;
        var13.field1456 = arg8;
        var13.field1469 = arg0;
        var13.field1461 = arg1;
        var13.field1464 = arg7;
        var13.field1467 = arg5;
        var13.field1458 = arg2;
        if (arg3 >= 68) {
            var13.field1465 = arg11;
            var13.field1462 = arg10;
            class273.field4135.method106(var13, -126);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(JI)Lv;", line = 32)
    public final class77 method209(long arg0, int arg1) {
        if (arg1 < 79) {
            field421 = (boolean[]) null;
        }
        this.field429 = arg0;
        class77 var4 = this.field422[(int) (arg0 & (long) (this.field426 - 1))];
        this.field424 = var4.field1127;
        field435++;
        while (this.field424 != var4) {
            if (this.field424.field1122 == arg0) {
                class77 var5 = this.field424;
                this.field424 = this.field424.field1127;
                return var5;
            }
            this.field424 = this.field424.field1127;
        }
        this.field424 = null;
        return null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V", line = 83)
    public static final void method210(byte arg0) {
        int var1 = -95 % ((arg0 + 43) / 47);
        field423++;
        if (class95.field1325) {
            return;
        }
        if (class274.field4156) {
            class103.field1476 = (float) ((int) class103.field1476 - 17 & 0xFFFFFFF0);
        } else {
            class354.field5443 += (-12.0F - class354.field5443) / 2.0F;
        }
        class71.field1010 = true;
        class95.field1325 = true;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(I)V", line = 112)
    public class30(int arg0) {
        this.field422 = new class77[arg0];
        this.field426 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class77 var3 = this.field422[var2] = new class77();
            var3.field1127 = var3;
            var3.field1124 = var3;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IB)V", line = 137)
    public static final void method211(int arg0, byte arg1) {
        int var2 = -54 / ((arg1 - 30) / 48);
        if (class347.field5364 == null || class347.field5364.length < arg0) {
            class347.field5364 = new int[arg0];
        }
        field432++;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)Lei;", line = 164)
    public static final class261 method212(int arg0, int arg1) {
        field434++;
        class261 var2 = (class261) class28.field391.method461((byte) 120, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 0) {
            method210((byte) 5);
        }
        byte[] var3 = class99.field1416.method2520(class347.method2439(arg1, 1), class304.method2142(-1, arg1), (byte) -25);
        class261 var4 = new class261();
        var4.field3977 = arg1;
        if (var3 != null) {
            var4.method1930(new class190(var3), (byte) 112);
        }
        var4.method1919(arg0 ^ 0x6F);
        if (!class287.field4353 && var4.field3920) {
            var4.field3910 = null;
        }
        if (var4.field3945) {
            var4.field3957 = 0;
            var4.field3888 = false;
        }
        class28.field391.method460(var4, -26089, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V", line = 198)
    public static void method213(int arg0) {
        field436 = null;
        if (arg0 == 17) {
            field427 = null;
            field431 = null;
            field421 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)Lv;", line = 218)
    public final class77 method214(byte arg0) {
        field428++;
        if (arg0 != 110) {
            this.field429 = -89L;
        }
        if (this.field424 == null) {
            return null;
        }
        class77 var2 = this.field422[(int) (this.field429 & (long) (this.field426 - 1))];
        while (this.field424 != var2) {
            if (this.field424.field1122 == this.field429) {
                class77 var3 = this.field424;
                this.field424 = this.field424.field1127;
                return var3;
            }
            this.field424 = this.field424.field1127;
        }
        this.field424 = null;
        return null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lv;BJ)V", line = 249)
    public final void method215(class77 arg0, byte arg1, long arg2) {
        if (arg0.field1124 != null) {
            arg0.method627(0);
        }
        field437++;
        class77 var5 = this.field422[(int) ((long) (this.field426 - 1) & arg2)];
        arg0.field1122 = arg2;
        arg0.field1124 = var5.field1124;
        arg0.field1127 = var5;
        arg0.field1124.field1127 = arg0;
        arg0.field1127.field1124 = arg0;
        if (arg1 > 0) {
            method208(-39, -42, -110, (byte) 18, 43, 94, -40, -71, 106, -13, -30, 88, 71);
        }
    }
}
