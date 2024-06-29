import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class113 {

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "Z")
    public boolean field1448 = false;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "Lmq;")
    private class472 field1453 = new class472(64);

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "Lmq;")
    public class472 field1459 = new class472(500);

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "Lmq;")
    public class472 field1461 = new class472(30);

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "Lmq;")
    public class472 field1464 = new class472(50);

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Z")
    public boolean field1449;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "Ljn;")
    private class668 field1456;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "Ljn;")
    public class668 field1451;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Lwaa;")
    public static class652 field1442 = new class652(8);

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field1458 = -1;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "Lwo;")
    public static class690 field1460 = new class690(10, 7);

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "J")
    public static long field1463 = 0L;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "Ljk;")
    public static class585 field1462 = new class585(78, 8);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIILec;ILec;IZI)V")
    public static final void method805(int arg0, int arg1, int arg2, int arg3, class213 arg4, int arg5, class213 arg6, int arg7, boolean arg8, int arg9) {
        field1441++;
        int var10 = arg4.method1291(120);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class701 var12 = (class701) class48.field814.method2766(-125, (long) var10);
        if (var12 == null) {
            class495[] var13 = class495.method2877(class692.field9847, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class68.field1045.method216(var13[0], true);
            class48.field814.method2772(var12, true, (long) var10);
        }
        class658.method3726(arg6.field530, (byte) 115, arg9 >> 1, arg2, arg6.field531, arg7, 0, arg6.method1284((byte) -124) * 256, arg6.field532, arg1 >> 1);
        int var14 = class438.field6260[0] + arg0 - 18;
        int var15 = arg5 / 4 * 18 + var14;
        int var16 = arg3 + class438.field6260[1] - 70;
        int var17 = arg5 % 4 * 18 + var16;
        var12.method3924(var15, var17);
        if (arg4 == arg6) {
            class68.field1045.method1046(127, 18, -256, var17 - 1, 18, var15 - 1);
        }
        class553 var18 = class9.method54((byte) -104);
        var18.field8031 = var17;
        if (arg8) {
            method812(64);
        }
        var18.field8028 = var15 + 16;
        var18.field8026 = var15;
        var18.field8027 = arg4;
        var18.field8032 = var17 + 16;
        class627.field8993.method2071((byte) 107, var18);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
    public final void method806(int arg0, int arg1) {
        field1445++;
        this.field1465 = arg1;
        class472 var3 = this.field1459;
        synchronized (this.field1459) {
            this.field1459.method2776(false);
        }
        class472 var4 = this.field1461;
        synchronized (this.field1461) {
            this.field1461.method2776(false);
        }
        class472 var5 = this.field1464;
        synchronized (this.field1464) {
            this.field1464.method2776(false);
        }
        if (arg0 != 4) {
            this.field1464 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)Lfga;")
    public final class232 method807(int arg0, int arg1) {
        field1457++;
        class472 var3 = this.field1453;
        class232 var4;
        synchronized (this.field1453) {
            var4 = (class232) this.field1453.method2766(-125, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class668 var5 = this.field1456;
        byte[] var6;
        synchronized (this.field1456) {
            var6 = this.field1456.method3800(class114.method817(arg1, 4095), class568.method3326((byte) 29, arg1), (byte) -92);
        }
        class232 var7 = new class232();
        var7.field3056 = arg1;
        var7.field3044 = this;
        if (arg0 != 0) {
            method805(-30, -83, 107, -128, null, 101, null, -34, true, -115);
        }
        if (var6 != null) {
            var7.method1407(85, new class389(var6));
        }
        var7.method1411(123);
        if (var7.field3027) {
            var7.field3058 = false;
            var7.field3016 = 0;
        }
        if (!this.field1449 && var7.field3057) {
            var7.field3061 = null;
            var7.field3019 = null;
        }
        class472 var8 = this.field1453;
        synchronized (this.field1453) {
            this.field1453.method2772(var7, true, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)V")
    public final void method808(int arg0, int arg1) {
        class472 var3 = this.field1453;
        synchronized (this.field1453) {
            this.field1453.method2777(arg1, 27);
        }
        field1444++;
        class472 var4 = this.field1459;
        synchronized (this.field1459) {
            if (arg0 != 0) {
                method805(-65, 93, -108, 18, null, -113, null, -21, true, 45);
            }
            this.field1459.method2777(arg1, 42);
        }
        class472 var5 = this.field1461;
        synchronized (this.field1461) {
            this.field1461.method2777(arg1, 85);
        }
        class472 var6 = this.field1464;
        synchronized (this.field1464) {
            this.field1464.method2777(arg1, arg0 ^ 0x55);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V")
    public final void method809(boolean arg0, int arg1) {
        field1452++;
        if (this.field1448 != arg0 && arg1 == 30) {
            this.field1448 = arg0;
            this.method811(arg1 ^ 0xFFFFFFCA);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
    public final void method810(int arg0, boolean arg1) {
        field1450++;
        if (arg1) {
            this.field1453 = new class472(arg0);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public final void method811(int arg0) {
        class472 var2 = this.field1453;
        synchronized (this.field1453) {
            if (arg0 > -38) {
                this.method807(64, 34);
            }
            this.field1453.method2776(false);
        }
        field1447++;
        class472 var3 = this.field1459;
        synchronized (this.field1459) {
            this.field1459.method2776(false);
        }
        class472 var4 = this.field1461;
        synchronized (this.field1461) {
            this.field1461.method2776(false);
        }
        class472 var5 = this.field1464;
        synchronized (this.field1464) {
            this.field1464.method2776(false);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public static void method812(int arg0) {
        if (arg0 <= 30) {
            field1442 = null;
        }
        field1462 = null;
        field1442 = null;
        field1460 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public final void method813(byte arg0) {
        class472 var2 = this.field1453;
        synchronized (this.field1453) {
            this.field1453.method2778((byte) 121);
        }
        field1446++;
        class472 var3 = this.field1459;
        synchronized (this.field1459) {
            this.field1459.method2778((byte) 108);
        }
        class472 var4 = this.field1461;
        synchronized (this.field1461) {
            this.field1461.method2778((byte) 106);
        }
        class472 var5 = this.field1464;
        synchronized (this.field1464) {
            if (arg0 <= 102) {
                method805(-26, -103, 109, -35, null, 49, null, 85, false, 100);
            }
            this.field1464.method2778((byte) 124);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BZ)V")
    public final void method814(byte arg0, boolean arg1) {
        field1455++;
        if (arg0 <= 36) {
            field1454 = 84;
        }
        if (arg1 != this.field1449) {
            this.field1449 = arg1;
            this.method811(-109);
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Ler;IZLjn;Ljn;)V")
    public class113(class90 arg0, int arg1, boolean arg2, class668 arg3, class668 arg4) {
        this.field1449 = arg2;
        this.field1456 = arg3;
        this.field1451 = arg4;
        if (this.field1456 != null) {
            int var6 = this.field1456.method3779(5) - 1;
            this.field1456.method3805(var6, false);
        }
    }
}
