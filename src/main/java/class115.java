import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class115 {

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "Lbn;")
    private class256 field1591 = new class256(256);

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "Lbn;")
    private class256 field1596 = new class256(256);

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "Lmo;")
    private class447 field1589;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "Lmo;")
    private class447 field1587;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "Lal;")
    public static class52 field1590 = new class52(10);

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public static int field1594 = 0;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "S")
    public static short field1598 = 256;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "Z")
    public static boolean field1599 = false;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public static int field1600 = 0;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI)Lgj;")
    public static final class379 method839(byte arg0, int arg1) {
        field1588++;
        class52 var2 = class270.field4326;
        class379 var3;
        synchronized (class270.field4326) {
            var3 = (class379) class270.field4326.method331((byte) 69, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        } else if (arg0 == -57) {
            byte[] var4 = class287.field4607.method2771(class415.method2592(arg1, (byte) -61), class390.method2461(-9812, arg1), 3);
            class379 var5 = new class379();
            var5.field5736 = arg1;
            if (var4 != null) {
                var5.method2414((byte) 104, new class186(var4));
            }
            class52 var6 = class270.field4326;
            synchronized (class270.field4326) {
                class270.field4326.method341(91, (long) arg1, var5);
                return var5;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I[IB)Lkr;")
    public final class445 method840(int arg0, int[] arg1, byte arg2) {
        if (arg2 != 66) {
            field1590 = null;
        }
        field1586++;
        if (this.field1589.method2773(62) == 1) {
            return this.method844(0, 121, arg1, arg0);
        } else if (this.field1589.method2758(arg0, arg2 ^ 0x3885) == 1) {
            return this.method844(arg0, -90, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method841(String arg0, int arg1) {
        if (arg1 != 19027) {
            field1590 = null;
        }
        field1597++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class262.field4215; var2++) {
            if (arg0.equalsIgnoreCase(class338.field5248[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public static void method842(int arg0) {
        if (arg0 == -722148948) {
            field1590 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([IIBI)Lkr;")
    private final class445 method843(int[] arg0, int arg1, byte arg2, int arg3) {
        field1595++;
        int var5 = (arg3 << 4 & 0xFFF8 | arg3 >>> 12) ^ arg1;
        int var6 = var5 | arg3 << 16;
        if (arg2 != 47) {
            field1598 = -5;
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class445 var9 = (class445) this.field1596.method1770(-880, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class278 var10 = (class278) this.field1591.method1770(-880, var7);
            if (var10 == null) {
                var10 = class278.method1879(this.field1587, arg3, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field1591.method1766(var7, var10, 65);
            }
            class445 var11 = var10.method1871(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method1120(-97);
                this.field1596.method1766(var7, var11, -100);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II[II)Lkr;")
    private final class445 method844(int arg0, int arg1, int[] arg2, int arg3) {
        field1592++;
        int var5 = arg3 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFF8);
        int var6 = var5 | arg0 << 16;
        int var7 = 59 % ((-arg1 - 40) / 43);
        long var8 = (long) var6;
        class445 var10 = (class445) this.field1596.method1770(-880, var8);
        if (var10 != null) {
            return var10;
        } else if (arg2 == null || arg2[0] > 0) {
            class416 var11 = class416.method2600(this.field1589, arg0, arg3);
            if (var11 == null) {
                return null;
            }
            class445 var12 = var11.method2598();
            this.field1596.method1766(var8, var12, 52);
            if (arg2 != null) {
                arg2[0] -= var12.field6483.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([III)Lkr;")
    public final class445 method845(int[] arg0, int arg1, int arg2) {
        field1593++;
        if (this.field1587.method2773(60) == 1) {
            return this.method843(arg0, arg2, (byte) 47, 0);
        } else if (this.field1587.method2758(arg2, 14535) == 1) {
            return this.method843(arg0, 0, (byte) 47, arg2);
        } else {
            if (arg1 != 0) {
                this.method845((int[]) null, -121, 117);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lmo;Lmo;)V")
    public class115(class447 arg0, class447 arg1) {
        this.field1589 = arg0;
        this.field1587 = arg1;
    }
}
