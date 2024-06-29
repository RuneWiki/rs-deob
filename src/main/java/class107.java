import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class107 {

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    private int field2400 = 0;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "[Llb;")
    private class109[] field2397;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    private int field2381;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Z")
    public static boolean field2388 = false;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Ldd;")
    public static class35 field2379 = class180.method1196((byte) -87, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field2394 = -1;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field2391 = 0;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Ldd;")
    public static class35 field2376 = class180.method1196((byte) -127, "_");

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "J")
    private long field2382;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Llb;")
    private class109 field2384;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "Llb;")
    private class109 field2401;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Lo;")
    public static class134 field2387;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Lwh;")
    public static class213 field2395;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Lce;")
    public static class26 field2389;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Ljava/awt/Font;")
    public static Font field2377;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)Ldd;")
    public static final class35 method788(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        }
        field2398++;
        if (arg1 < 100000) {
            return class63.method529(new class35[] { class125.field2733, class3.method19(arg1, -29578), class39.field864 }, (byte) 113);
        } else if (arg1 < 10000000) {
            return class63.method529(new class35[] { class159.field3238, class3.method19(arg1 / 1000, -29578), class56.field1394, class39.field864 }, (byte) 89);
        } else {
            return class63.method529(new class35[] { class95.field2102, class3.method19(arg1 / 1000000, -29578), class37.field823, class39.field864 }, (byte) 92);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Llb;ZJ)V")
    public final void method789(class109 arg0, boolean arg1, long arg2) {
        field2386++;
        if (!arg1) {
            this.method792((byte) 45);
        }
        if (arg0.field2421 != null) {
            arg0.method799(-24265);
        }
        class109 var5 = this.field2397[(int) ((long) (this.field2381 - 1) & arg2)];
        arg0.field2418 = var5;
        arg0.field2416 = arg2;
        arg0.field2421 = var5.field2421;
        arg0.field2421.field2418 = arg0;
        arg0.field2418.field2421 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)Llb;")
    public final class109 method790(int arg0) {
        field2393++;
        this.field2400 = 0;
        if (arg0 > -114) {
            field2387 = null;
        }
        return this.method794((byte) 90);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public static void method791(int arg0) {
        if (arg0 != 31983) {
            field2388 = true;
        }
        field2376 = null;
        field2387 = null;
        field2395 = null;
        field2389 = null;
        field2377 = null;
        field2379 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)I")
    public final int method792(byte arg0) {
        field2378++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2381; var3++) {
            class109 var5 = this.field2397[var3];
            class109 var6 = var5.field2418;
            while (var5 != var6) {
                var6 = var6.field2418;
                var2++;
            }
        }
        int var4 = 110 / ((9 - arg0) / 57);
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([Llb;I)I")
    public final int method793(class109[] arg0, int arg1) {
        field2396++;
        int var3 = 0;
        if (arg1 >= -90) {
            field2387 = null;
        }
        for (int var4 = 0; var4 < this.field2381; var4++) {
            class109 var5 = this.field2397[var4];
            for (class109 var6 = var5.field2418; var6 != var5; var6 = var6.field2418) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)Llb;")
    public final class109 method794(byte arg0) {
        if (arg0 != 90) {
            return null;
        }
        field2399++;
        if (this.field2400 > 0 && this.field2397[this.field2400 - 1] != this.field2401) {
            class109 var2 = this.field2401;
            this.field2401 = var2.field2418;
            return var2;
        }
        while (this.field2381 > this.field2400) {
            class109 var3 = this.field2397[this.field2400++].field2418;
            if (this.field2397[this.field2400 - 1] != var3) {
                this.field2401 = var3.field2418;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(B)Llb;")
    public final class109 method795(byte arg0) {
        field2392++;
        if (this.field2384 == null) {
            return null;
        }
        int var2 = -121 % ((arg0 - 67) / 57);
        class109 var3 = this.field2397[(int) (this.field2382 & (long) (this.field2381 - 1))];
        while (this.field2384 != var3) {
            if (this.field2384.field2416 == this.field2382) {
                class109 var4 = this.field2384;
                this.field2384 = this.field2384.field2418;
                return var4;
            }
            this.field2384 = this.field2384.field2418;
        }
        this.field2384 = null;
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZJ)Llb;")
    public final class109 method796(boolean arg0, long arg1) {
        this.field2382 = arg1;
        class109 var4 = this.field2397[(int) (arg1 & (long) (this.field2381 - 1))];
        this.field2384 = var4.field2418;
        field2385++;
        while (this.field2384 != var4) {
            if (this.field2384.field2416 == arg1) {
                class109 var5 = this.field2384;
                this.field2384 = this.field2384.field2418;
                return var5;
            }
            this.field2384 = this.field2384.field2418;
        }
        this.field2384 = null;
        if (!arg0) {
            field2388 = true;
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(I)V")
    public class107(int arg0) {
        this.field2397 = new class109[arg0];
        this.field2381 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class109 var3 = this.field2397[var2] = new class109();
            var3.field2421 = var3;
            var3.field2418 = var3;
        }
    }
}
