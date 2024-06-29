import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class377 {

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "Lku;")
    private class232 field5431 = new class232(64);

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "Lb;")
    private class201 field5422;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public static int field5427 = -1;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "[J")
    public static long[] field5433 = new long[32];

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public static int field5435 = 0;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
    public static int field5436 = 0;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "Lsf;")
    public static class334 field5424;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "Lkl;")
    public static class51 field5429;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Llr;")
    public static final class489 method2294(int arg0) {
        if (arg0 != -30650) {
            field5429 = null;
        }
        field5430++;
        class489 var1 = (class489) class96.field1231.method1558(true);
        if (var1 != null) {
            var1.method1510((byte) -13);
            var1.method1673((byte) 27);
            return var1;
        }
        class489 var2;
        do {
            var2 = (class489) class141.field1881.method1558(true);
            if (var2 == null) {
                return null;
            }
            if (var2.method2865((byte) 28) > class433.method2562(-2039)) {
                return null;
            }
            var2.method1510((byte) -13);
            var2.method1673((byte) 27);
        } while ((var2.field3960 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)V")
    public final void method2295(int arg0, int arg1) {
        field5434++;
        class232 var3 = this.field5431;
        synchronized (this.field5431) {
            if (arg1 == 32) {
                this.field5431.method1486(438127120, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IB)Lap;")
    public final class307 method2296(int arg0, byte arg1) {
        field5425++;
        class232 var3 = this.field5431;
        class307 var4;
        synchronized (this.field5431) {
            var4 = (class307) this.field5431.method1479(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5422.method1257(arg0, 31, 24558);
        class307 var6 = new class307();
        if (var5 != null) {
            var6.method1902(new class276(var5), (byte) -88);
        }
        class232 var7 = this.field5431;
        synchronized (this.field5431) {
            this.field5431.method1473(var6, (long) arg0, 119);
        }
        if (arg1 != 88) {
            field5433 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V")
    public final void method2297(boolean arg0) {
        if (arg0) {
            field5424 = null;
        }
        field5426++;
        class232 var2 = this.field5431;
        synchronized (this.field5431) {
            this.field5431.method1475(0);
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V")
    public static final void method2298(int arg0) {
        field5423++;
        if (arg0 == -10989) {
            class82.method467();
        }
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
    public final void method2299(int arg0) {
        field5428++;
        class232 var2 = this.field5431;
        synchronized (this.field5431) {
            this.field5431.method1478((byte) -87);
            if (arg0 != -1436375577) {
                field5424 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(Z)V")
    public static void method2300(boolean arg0) {
        field5433 = null;
        field5429 = null;
        field5424 = null;
        if (arg0) {
            method2294(-6);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZII)I")
    public static final int method2301(boolean arg0, int arg1, int arg2) {
        field5432++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (!arg0) {
            field5429 = null;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lea;ILb;)V")
    public class377(class353 arg0, int arg1, class201 arg2) {
        this.field5422 = arg2;
        this.field5422.method1235(0, 31);
    }
}
