import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class68 {

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Lwm;")
    private class399 field1374 = new class399(64);

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "Lwm;")
    public class399 field1386 = new class399(30);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Lph;")
    private class459 field1373;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "Lph;")
    public class459 field1383;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field1381 = 0;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Ls;")
    public static class186 field1375 = new class186(103, 5);

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "[Z")
    public static boolean[] field1377;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZIIII)V")
    public static final void method591(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class133.field2236 == 0) {
            class274.method1738((byte) 39, false);
        } else {
            class42.field585 = class133.field2236;
            class304.method1944(false, 0);
        }
        if (arg3 != 7390) {
            return;
        }
        field1385++;
        class535.field7860 = arg4;
        class107.field1983 = arg0;
        class467.field6938 = arg2;
        class319.method2040(arg1);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static void method592(byte arg0) {
        field1375 = null;
        field1377 = null;
        if (arg0 != -3) {
            method592((byte) 123);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
    public final void method593(int arg0, int arg1) {
        if (arg0 != 1) {
            this.field1374 = null;
        }
        field1388++;
        class399 var3 = this.field1374;
        synchronized (this.field1374) {
            this.field1374.method2471((byte) 98, arg1);
        }
        class399 var4 = this.field1386;
        synchronized (this.field1386) {
            this.field1386.method2471((byte) 98, arg1);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
    public final void method594(boolean arg0) {
        field1376++;
        if (!arg0) {
            return;
        }
        class399 var2 = this.field1374;
        synchronized (this.field1374) {
            this.field1374.method2477(-111);
        }
        class399 var3 = this.field1386;
        synchronized (this.field1386) {
            this.field1386.method2477(69);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)Llo;")
    public final class533 method595(int arg0, int arg1) {
        field1380++;
        class399 var3 = this.field1374;
        class533 var4;
        synchronized (this.field1374) {
            var4 = (class533) this.field1374.method2478(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field1373;
        byte[] var7;
        synchronized (this.field1373) {
            if (arg0 != -12186) {
                return null;
            }
            var7 = this.field1373.method2757(class507.method3039((byte) -88, arg1), class174.method1200(20721, arg1), (byte) -122);
        }
        class533 var8 = new class533();
        var8.field7750 = this;
        var8.field7732 = arg1;
        if (var7 != null) {
            var8.method3150(new class289(var7), arg0 - 3087);
        }
        class399 var9 = this.field1374;
        synchronized (this.field1374) {
            this.field1374.method2472(-108, var8, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
    public static final void method596(int arg0, int arg1, int arg2) {
        if (arg1 != -30623) {
            field1377 = null;
        }
        field1378++;
        if (class424.field6366 == class209.field3343) {
            if (!class377.method2317(-1, 0, arg2, false, 1, arg0, -2, 1, 0)) {
                class377.method2317(-1, 0, arg2, false, 1, arg0, -3, 1, 0);
            }
        } else if (!class377.method2317(arg1 + 30622, 0, arg2, false, 1, arg0, -3, 1, 0)) {
            class377.method2317(arg1 + 30622, 0, arg2, false, 1, arg0, -2, 1, 0);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)V")
    public final void method597(int arg0, int arg1) {
        field1384++;
        if (arg0 != 0) {
            this.method598((byte) -47);
        }
        this.field1387 = arg1;
        class399 var3 = this.field1386;
        synchronized (this.field1386) {
            this.field1386.method2475((byte) 67);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
    public final void method598(byte arg0) {
        field1379++;
        class399 var2 = this.field1374;
        synchronized (this.field1374) {
            this.field1374.method2475((byte) 67);
        }
        if (arg0 != 69) {
            this.field1387 = 69;
        }
        class399 var3 = this.field1386;
        synchronized (this.field1386) {
            this.field1386.method2475((byte) 67);
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lkp;ILph;Lph;)V")
    public class68(class341 arg0, int arg1, class459 arg2, class459 arg3) {
        this.field1373 = arg2;
        this.field1383 = arg3;
        int var5 = this.field1373.method2759(16460) - 1;
        this.field1373.method2763(var5, -3);
    }
}
