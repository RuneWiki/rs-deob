import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class74 {

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "[I")
    private int[] field1378;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Lve;")
    public static class184 field1381 = new class184(5);

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Ljd;")
    private static class85 field1382 = class221.method1499(" more options", (byte) -98);

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Ljd;")
    public static class85 field1383 = field1382;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "J")
    public static long field1387 = 0L;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "[I")
    public static int[] field1388 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "[[[I")
    public static int[][][] field1386 = new int[4][13][13];

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public static final void method519(byte arg0) {
        field1374++;
        if (class99.field1779 < class11.field165) {
            class99.field1779 = (float) ((double) class99.field1779 / 30.0D + (double) class99.field1779);
            if (class99.field1779 > class11.field165) {
                class99.field1779 = class11.field165;
            }
            class201.method1381(arg0 ^ 0xFFFFFFE1);
        } else if (class99.field1779 > class11.field165) {
            class99.field1779 = (float) ((double) class99.field1779 - (double) class99.field1779 / 30.0D);
            if (class11.field165 > class99.field1779) {
                class99.field1779 = class11.field165;
            }
            class201.method1381(0);
        }
        if (arg0 != -31) {
            field1383 = null;
        }
        if (class147.field2496 == -1 || class150.field2537 == -1) {
            return;
        }
        int var1 = class150.field2537 - class168.field2901;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        int var2 = class147.field2496 - class6.field75;
        class168.field2901 += var1;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class6.field75 += var2;
        if (var2 == 0 && var1 == 0) {
            class147.field2496 = -1;
            class150.field2537 = -1;
        }
        class201.method1381(0);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)I")
    public static final int method520(int arg0, int arg1) {
        field1375++;
        if (arg0 < 0) {
            return 0;
        }
        class186 var2 = (class186) class172.field2975.method1398(1, (long) arg0);
        if (var2 == null) {
            return class255.method1771(arg0, (byte) -69).field4624;
        } else if (arg1 == -17209) {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field3198.length; var4++) {
                if (var2.field3198[var4] == -1) {
                    var3++;
                }
            }
            return var3 + class255.method1771(arg0, (byte) -69).field4624 - var2.field3198.length;
        } else {
            return -118;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method521(int arg0) {
        field1388 = null;
        if (arg0 == 1) {
            field1382 = null;
            field1386 = null;
            field1383 = null;
            field1381 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "([I)V")
    public class74(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field1378 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field1378[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1378[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1378[var5 + var5] = arg0[var4];
            this.field1378[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIZI)V")
    public static final void method522(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1379++;
        if (arg1 != 1) {
            method519((byte) 84);
        }
        if (class222.method1508(0, arg0)) {
            class27.method193(arg2, class215.field3774[arg0], arg3, -1, (byte) 18, arg4);
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)I")
    public final int method523(int arg0, int arg1) {
        field1377++;
        if (arg1 != 0) {
            method524(-56L, 9);
        }
        int var3 = (this.field1378.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field1378[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1378[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(JI)V")
    public static final void method524(long arg0, int arg1) {
        field1376++;
        if (arg1 != 0) {
            method524(-20L, -110);
        }
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZI)I")
    public static final int method525(int arg0, boolean arg1, int arg2) {
        field1384++;
        int var3 = class137.method906(arg0 - 1, (byte) 67, arg2 - 1) + class137.method906(arg0 - 1, (byte) 67, arg2 + 1) + class137.method906(arg0 + 1, (byte) 67, arg2 + -1) + class137.method906(arg0 + 1, (byte) 67, arg2 + 1);
        if (arg1) {
            int var4 = class137.method906(arg0, (byte) 67, arg2 - 1) + class137.method906(arg0, (byte) 67, arg2 + 1) - (-class137.method906(arg0 + -1, (byte) 67, arg2) - class137.method906(arg0 + 1, (byte) 67, arg2));
            int var5 = class137.method906(arg0, (byte) 67, arg2);
            return var3 / 16 + var4 / 8 + var5 / 4;
        } else {
            return 66;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lb;Ljava/lang/Object;I)V")
    public static final void method526(class81 arg0, Object arg1, int arg2) {
        field1380++;
        if (arg0.field1461 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field1461.peekEvent() != null; var3++) {
            class190.method1311(1L, 1);
        }
        if (arg1 != null) {
            arg0.field1461.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
        int var4 = -39 % ((15 - arg2) / 45);
    }
}
