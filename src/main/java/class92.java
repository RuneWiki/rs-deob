import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class92 extends class62 {

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "[[I")
    public static int[][] field2356 = new int[104][104];

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "Lpd;")
    private static class94 field2355 = class28.method249(-92, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "Lpd;")
    public static class94 field2354 = class28.method249(-48, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field2361 = 3;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    public static int field2362 = 0;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public static int field2352 = 0;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    public static volatile int field2364 = -1;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "Lpd;")
    private static class94 field2368 = class28.method249(-109, "Please remove ");

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "Lpd;")
    public static class94 field2369 = field2368;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "[Z")
    public static boolean[] field2353 = new boolean[112];

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "Lpd;")
    public static class94 field2358 = field2368;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "Lpd;")
    public static class94 field2370 = field2355;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "Lic;")
    public static class50 field2365;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "Lla;")
    public static class66 field2360;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZJ)V", line = 16)
    public final void method677(boolean arg0, long arg1) {
        for (int var4 = 0; var4 < 128; var4++) {
            int var11 = class20.field548[var4];
            class20.field548[var4] = 0;
            for (int var12 = 0; var12 < 16; var12++) {
                if ((0x1 << var12 & var11) != 0) {
                    this.method389(var12 + 144, var4, 0, arg1);
                }
            }
        }
        field2363++;
        int var5 = 0;
        if (arg0) {
            return;
        }
        while (var5 < 16) {
            this.method389(var5 + 176, 123, 0, arg1);
            var5++;
        }
        for (int var6 = 0; var6 < 16; var6++) {
            this.method389(var6 + 176, 120, 0, arg1);
        }
        for (int var7 = 0; var7 < 16; var7++) {
            this.method389(var7 + 176, 121, 0, arg1);
        }
        for (int var8 = 0; var8 < 16; var8++) {
            this.method389(var8 + 176, 0, 0, arg1);
        }
        for (int var9 = 0; var9 < 16; var9++) {
            this.method389(var9 + 176, 32, 0, arg1);
        }
        for (int var10 = 0; var10 < 16; var10++) {
            this.method389(var10 + 192, 0, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIJI)V", line = 94)
    public final void method678(int arg0, int arg1, long arg2, int arg3) {
        int var6 = (int) (Math.pow(0.1D, (double) arg0 * 5.0E-4D) * (double) arg1 + 0.5D);
        field2357++;
        if (arg3 != -17) {
            field2356 = null;
        }
        if (class7.field145 == var6) {
            return;
        }
        class7.field145 = var6;
        for (int var7 = 0; var7 < 16; var7++) {
            int var8 = method679(var7);
            this.method389(var7 + 176, 7, var8 >> 7, arg2);
            this.method389(var7 + 176, 39, var8 & 0x7F, arg2);
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)I", line = 126)
    private static final int method679(int arg0) {
        int var1 = class119.field2961[arg0];
        int var2 = (class7.field145 * var1 >> 8) * var1;
        return (int) (Math.sqrt((double) var2) + 0.5D);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BII)I", line = 137)
    public static final int method680(byte arg0, int arg1, int arg2) {
        field2366++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 / 128;
        if (arg0 > -21) {
            return 121;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BJ)V", line = 168)
    public static final void method681(byte arg0, long arg1) {
        if (arg0 < 31) {
            field2364 = 6;
        }
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field2359++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBJ)V", line = 210)
    public final void method682(int arg0, byte arg1, long arg2) {
        field2367++;
        class7.field145 = arg0;
        for (int var5 = 0; var5 < 16; var5++) {
            class119.field2961[var5] = 12800;
        }
        int var6 = -8 / ((-arg1 - 44) / 33);
        for (int var7 = 0; var7 < 16; var7++) {
            int var8 = method679(var7);
            this.method389(var7 + 176, 7, var8 >> 7, arg2);
            this.method389(var7 + 176, 39, var8 & 0x7F, arg2);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIIJ)Z", line = 250)
    public final boolean method683(int arg0, int arg1, int arg2, long arg3) {
        if ((arg0 & 0xE0) == 128) {
            int var6 = 0x1 << (arg0 & 0xF);
            int var7 = class20.field548[arg1];
            if (arg0 < 144 || arg2 == 0) {
                class20.field548[arg1] = var7 & ~var6;
            } else if ((var7 & var6) == 0) {
                class20.field548[arg1] = var7 | var6;
            } else {
                this.method389(arg0, arg1, 0, arg3);
            }
            return false;
        }
        if ((arg0 & 0xF0) == 176) {
            if (arg1 == 121) {
                this.method389(arg0, arg1, arg2, arg3);
                int var8 = arg0 & 0xF;
                class119.field2961[var8] = 12800;
                int var9 = method679(var8);
                this.method389(arg0, 7, var9 >> 7, arg3);
                this.method389(arg0, 39, var9 & 0x7F, arg3);
                return true;
            }
            if (arg1 == 7 || arg1 == 39) {
                int var10 = arg0 & 0xF;
                if (arg1 == 7) {
                    class119.field2961[var10] = (arg2 << 7) + (class119.field2961[var10] & 0x7F);
                } else {
                    class119.field2961[var10] = (class119.field2961[var10] & 0x3F80) + arg2;
                }
                int var11 = method679(var10);
                this.method389(arg0, 7, var11 >> 7, arg3);
                this.method389(arg0, 39, var11 & 0x7F, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V", line = 312)
    public static void method684(int arg0) {
        field2360 = null;
        field2365 = null;
        field2358 = null;
        field2354 = null;
        field2355 = null;
        field2368 = null;
        field2356 = null;
        field2369 = null;
        field2370 = null;
        field2353 = null;
        if (arg0 != -17) {
            field2368 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIJ)V")
    public abstract void method389(int arg0, int arg1, int arg2, long arg3);
}
