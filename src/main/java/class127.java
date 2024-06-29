import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class127 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lji;")
    private class40 field2342 = new class40();

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    private int field2345;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    private int field2346;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Lti;")
    private class5 field2348;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Loh;")
    public static class263 field2354 = class253.method1681(-126, "ul");

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lal;")
    public static class223 field2351 = new class223(5000);

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Loh;")
    private static class263 field2358 = class253.method1681(-127, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Loh;")
    public static class263 field2359 = field2358;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "[I")
    public static int[] field2362 = new int[32];

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "Loh;")
    public static class263 field2363 = class253.method1681(-126, "1");

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Lpc;")
    public static class21 field2360;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Loh;")
    public static class263 field2361;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static void method822(byte arg0) {
        field2361 = null;
        field2359 = null;
        field2363 = null;
        if (arg0 != 111) {
            field2358 = null;
        }
        field2351 = null;
        field2358 = null;
        field2360 = null;
        field2354 = null;
        field2362 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIBI)Lg;")
    public static final class266 method823(int arg0, int arg1, byte arg2, int arg3) {
        class266 var4 = new class266();
        var4.field4640 = arg0;
        field2349++;
        var4.field4641 = arg3;
        class212.field3797.method33(var4, (long) arg1, -109);
        class70.method446(0, arg3);
        class21 var5 = class8.method55(65535, arg1);
        if (var5 != null) {
            class220.method1508(var5, (byte) -108);
        }
        if (class113.field2121 != null) {
            class220.method1508(class113.field2121, (byte) -47);
            class113.field2121 = null;
        }
        int var6 = class252.field4384;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class165.method1089(class202.field3645[var7], 13)) {
                class258.method1707(var7, -17919);
            }
        }
        if (class252.field4384 == 1) {
            class2.field53 = false;
            class53.method338(class83.field1652, 2, class134.field2455, class55.field1162, class275.field4822);
        } else {
            class53.method338(class83.field1652, 2, class134.field2455, class55.field1162, class275.field4822);
            int var8 = class107.field2026.method408(class38.field864);
            for (int var9 = 0; var9 < class252.field4384; var9++) {
                int var10 = class107.field2026.method408(class200.method1388(var9, false));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class275.field4822 = var8 + 8;
            class134.field2455 = class252.field4384 * 15 + 22;
        }
        if (arg2 >= -42) {
            method827(-59, (byte) 101);
        }
        if (var5 != null) {
            class225.method1532(false, var5, -1);
        }
        class128.method834(arg3, (byte) 125);
        if (class186.field3353 != -1) {
            class96.method670(class186.field3353, -5846, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BJ)V")
    public final void method824(byte arg0, long arg1) {
        field2350++;
        if (arg0 <= 68) {
            this.method826(-94L, -79, (Object) null);
        }
        class61 var4 = (class61) this.field2348.method31(-32665, arg1);
        if (var4 != null) {
            var4.method1614(-1204826926);
            var4.method1401((byte) 27);
            this.field2345++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public final void method825(int arg0) {
        field2344++;
        for (class61 var2 = (class61) this.field2342.method250(arg0); var2 != null; var2 = (class61) this.field2342.method251((byte) -119)) {
            if (var2.method380(2000)) {
                var2.method1614(-1204826926);
                var2.method1401((byte) 27);
                this.field2345++;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(JILjava/lang/Object;)V")
    public final void method826(long arg0, int arg1, Object arg2) {
        this.method824((byte) 88, arg0);
        if (this.field2345 == 0) {
            class61 var5 = (class61) this.field2342.method255(arg1 - 9815);
            var5.method1614(-1204826926);
            var5.method1401((byte) 27);
        } else {
            this.field2345--;
        }
        field2352++;
        if (arg1 != 9815) {
            method822((byte) 99);
        }
        class215 var6 = new class215(arg2);
        this.field2348.method33(var6, arg0, -128);
        this.field2342.method253(var6, (byte) 13);
        var6.field3647 = 0L;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)V")
    public static final void method827(int arg0, byte arg1) {
        class33.field800 = 50;
        field2347++;
        if (arg1 >= -120) {
            method823(-92, -126, (byte) -123, -20);
        }
        class152.field2742 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method828(int arg0, long arg1) {
        field2341++;
        class61 var4 = (class61) this.field2348.method31(-32665, arg1);
        if (var4 == null) {
            return null;
        }
        if (arg0 != 0) {
            method823(68, 31, (byte) 112, -50);
        }
        Object var5 = var4.method370(false);
        if (var5 == null) {
            var4.method1614(-1204826926);
            var4.method1401((byte) 27);
            this.field2345++;
            return null;
        }
        if (var4.method380(2000)) {
            class215 var6 = new class215(var5);
            this.field2348.method33(var6, var4.field4226, -118);
            this.field2342.method253(var6, (byte) 13);
            var6.field3647 = 0L;
            var4.method1614(-1204826926);
            var4.method1401((byte) 27);
        } else {
            this.field2342.method253(var4, (byte) 13);
            var4.field3647 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(IB)V")
    public final void method829(int arg0, byte arg1) {
        int var3 = -81 % ((64 - arg1) / 37);
        field2355++;
        if (class136.field2477 == null) {
            return;
        }
        for (class61 var4 = (class61) this.field2342.method250(0); var4 != null; var4 = (class61) this.field2342.method251((byte) 122)) {
            if (var4.method380(2000)) {
                if (var4.method370(false) == null) {
                    var4.method1614(-1204826926);
                    var4.method1401((byte) 27);
                    this.field2345++;
                }
            } else if (++var4.field3647 > (long) arg0) {
                class61 var5 = class136.field2477.method1203((byte) -79, var4);
                this.field2348.method33(var5, var4.field4226, -124);
                class196.method1340(true, var4, var5);
                var4.method1614(-1204826926);
                var4.method1401((byte) 27);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public final void method830(int arg0) {
        this.field2342.method257(true);
        this.field2348.method29(arg0 ^ 0x7C);
        this.field2345 = this.field2346;
        field2356++;
        if (arg0 != 50) {
            field2360 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I)V")
    public class127(int arg0) {
        this.field2345 = arg0;
        this.field2346 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field2348 = new class5(var2);
    }
}
