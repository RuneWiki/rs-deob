import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class216 {

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "Lwm;")
    private class399 field3411 = new class399(64);

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "Lph;")
    private class459 field3414;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public static int field3415 = 100;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
    public static int field3416 = 0;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "Lur;")
    public static class378 field3417;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)Lwk;")
    public static final class97 method1447(boolean arg0) {
        field3406++;
        if (class319.field4858 == null || class119.field2093 == null) {
            return null;
        }
        for (class97 var1 = (class97) class119.field2093.method2895(31); var1 != null; var1 = (class97) class119.field2093.method2895(31)) {
            class25 var2 = class319.field4842.method1247(false, var1.field1890);
            if (var2 != null && var2.field380 && var2.method175(-2871, class319.field4849)) {
                return var1;
            }
        }
        if (!arg0) {
            field3417 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIILrj;)J")
    public static final long method1448(int arg0, int arg1, int arg2, class425 arg3) {
        field3413++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class306 var10 = class123.field2142.method1530((byte) -36, arg3.method224(-10848));
        long var11 = (long) (arg1 | 0x800000 << 7 | arg0 | arg3.method225(false) << 14 | arg3.method231(12) << 20);
        if (arg2 != -27140) {
            field3416 = -41;
        }
        if (var10.field4587 == 0) {
            var11 |= var8;
        }
        if (var10.field4602 == 1) {
            var11 |= var4;
        }
        if (var10.field4633) {
            var11 |= var6;
        }
        return var11 | (long) arg3.method224(-10848) << 32;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(Z)V")
    public static void method1449(boolean arg0) {
        if (arg0) {
            field3417 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
    public final void method1450(int arg0) {
        field3405++;
        if (arg0 >= 120) {
            class399 var2 = this.field3411;
            synchronized (this.field3411) {
                this.field3411.method2475((byte) 67);
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
    public final void method1451(int arg0) {
        if (arg0 != -442057458) {
            this.method1453(-105, -15);
        }
        field3412++;
        class399 var2 = this.field3411;
        synchronized (this.field3411) {
            this.field3411.method2477(-106);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)V")
    public final void method1452(int arg0, int arg1) {
        class399 var3 = this.field3411;
        synchronized (this.field3411) {
            if (arg0 != 27051) {
                field3417 = null;
            }
            this.field3411.method2471((byte) 98, arg1);
        }
        field3408++;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(II)V")
    public final void method1453(int arg0, int arg1) {
        field3409++;
        class399 var3 = this.field3411;
        synchronized (this.field3411) {
            this.field3411.method2475((byte) 67);
            this.field3411 = new class399(arg1);
        }
        if (arg0 != 1073741824) {
            method1449(true);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lph;I)I")
    public static final int method1454(class459 arg0, int arg1) {
        if (arg1 != 599684871) {
            field3417 = null;
        }
        field3407++;
        int var2 = 0;
        if (arg0.method2739(class237.field3656, arg1 - 599684787)) {
            var2++;
        }
        if (arg0.method2739(class524.field7616, -110)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(II)Lrp;")
    public final class303 method1455(int arg0, int arg1) {
        field3410++;
        class399 var3 = this.field3411;
        class303 var4;
        synchronized (this.field3411) {
            var4 = (class303) this.field3411.method2478(1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field3414;
        byte[] var6;
        synchronized (this.field3414) {
            var6 = this.field3414.method2757(class80.method712(arg0, true), class485.method2906((byte) -25, arg0), (byte) -123);
        }
        class303 var7 = new class303();
        if (arg1 != -11680) {
            field3415 = -81;
        }
        if (var6 != null) {
            var7.method1940((byte) 82, new class289(var6));
        }
        class399 var8 = this.field3411;
        synchronized (this.field3411) {
            this.field3411.method2472(-80, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lkp;ILph;)V")
    public class216(class341 arg0, int arg1, class459 arg2) {
        this.field3414 = arg2;
        if (this.field3414 != null) {
            int var4 = this.field3414.method2759(16460) - 1;
            this.field3414.method2763(var4, -3);
        }
    }
}
