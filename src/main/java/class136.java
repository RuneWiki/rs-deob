import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class136 {

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "Z")
    public boolean field2395 = false;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public int field2391 = -1;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "[I")
    private int[] field2398 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Lp;")
    public static class280 field2393 = class18.method140((byte) -123, ":duelfriend:");

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lp;")
    public static class280 field2392 = class18.method140((byte) -127, "niveau ");

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "[I")
    private int[] field2387;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "[Leg;")
    public static class223[] field2403;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "[S")
    private short[] field2396;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "[S")
    private short[] field2399;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "[S")
    private short[] field2402;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "[S")
    private short[] field2404;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ltg;B)V")
    public static final void method929(class180 arg0, byte arg1) {
        field2397++;
        if (class248.field4346) {
            return;
        }
        class151.method1054();
        class90.field1456 = class226.method1519((byte) -120, arg0, class225.field3886);
        int var2 = class103.field1724;
        if (arg1 != 117) {
            field2403 = null;
        }
        int var3 = var2 * 956 / 503;
        class90.field1456.method760((class190.field3328 - var3) / 2, 0, var3, var2);
        class173.field3019 = class43.method326(class160.field2799, (byte) -59, arg0);
        class173.field3019.method62(class190.field3328 / 2 - (class173.field3019.field1341 / 2), 18);
        class248.field4346 = true;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method930(int arg0) {
        field2392 = null;
        field2403 = null;
        int var1 = 84 / ((arg0 - 76) / 41);
        field2393 = null;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)Lvj;")
    public final class114 method931(int arg0) {
        field2386++;
        if (this.field2387 == null) {
            return null;
        }
        class114[] var2 = new class114[this.field2387.length];
        for (int var3 = 0; var3 < this.field2387.length; var3++) {
            var2[var3] = class114.method819(class252.field4415, this.field2387[var3], 0);
        }
        class114 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class114(var2, var2.length);
        }
        if (arg0 != -21705) {
            this.method936((byte) 89);
        }
        if (this.field2396 != null) {
            for (int var5 = 0; var5 < this.field2396.length; var5++) {
                var4.method835(this.field2396[var5], this.field2399[var5]);
            }
        }
        if (this.field2404 != null) {
            for (int var6 = 0; var6 < this.field2404.length; var6++) {
                var4.method818(this.field2404[var6], this.field2402[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)Lvj;")
    public final class114 method932(byte arg0) {
        field2385++;
        class114[] var2 = new class114[5];
        int var3 = 0;
        if (arg0 != -22) {
            this.method932((byte) 79);
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2398[var4] != -1) {
                var2[var3++] = class114.method819(class252.field4415, this.field2398[var4], 0);
            }
        }
        class114 var5 = new class114(var2, var3);
        if (this.field2396 != null) {
            for (int var6 = 0; var6 < this.field2396.length; var6++) {
                var5.method835(this.field2396[var6], this.field2399[var6]);
            }
        }
        if (this.field2404 != null) {
            for (int var7 = 0; var7 < this.field2404.length; var7++) {
                var5.method818(this.field2404[var7], this.field2402[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Llj;B)V")
    public final void method933(class25 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method189((byte) -103);
            if (var3 == 0) {
                int var4 = -48 % ((arg1 + 72) / 54);
                field2388++;
                return;
            }
            this.method935(-97, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)[Leg;")
    public static final class223[] method934(boolean arg0) {
        field2394++;
        class223[] var1 = new class223[class149.field2579];
        for (int var2 = 0; var2 < class149.field2579; var2++) {
            byte[] var3 = class182.field3178[var2];
            int var4 = class97.field1562[var2] * class57.field915[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class16.field309[class214.method1432(255, var3[var6])];
            }
            var1[var2] = new class223(class93.field1512, class221.field3828, class243.field4263[var2], class124.field2172[var2], class97.field1562[var2], class57.field915[var2], var5);
        }
        if (!arg0) {
            method938(-8, (class53) null, (class53) null);
        }
        class126.method868(-15434);
        return var1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILlj;I)V")
    private final void method935(int arg0, class25 arg1, int arg2) {
        field2384++;
        if (arg2 == 1) {
            this.field2391 = arg1.method189((byte) -103);
        } else if (arg2 == 2) {
            int var4 = arg1.method189((byte) -103);
            this.field2387 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2387[var5] = arg1.method193((byte) 77);
            }
        } else if (arg2 == 3) {
            this.field2395 = true;
        } else if (arg2 == 40) {
            int var8 = arg1.method189((byte) -103);
            this.field2399 = new short[var8];
            this.field2396 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2396[var9] = (short) arg1.method193((byte) 77);
                this.field2399[var9] = (short) arg1.method193((byte) 77);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method189((byte) -103);
            this.field2404 = new short[var6];
            this.field2402 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2404[var7] = (short) arg1.method193((byte) 77);
                this.field2402[var7] = (short) arg1.method193((byte) 77);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field2398[arg2 - 60] = arg1.method193((byte) 77);
        }
        if (arg0 >= -49) {
            this.field2391 = -92;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)Z")
    public final boolean method936(byte arg0) {
        field2405++;
        if (this.field2387 == null) {
            return true;
        }
        if (arg0 > -89) {
            field2393 = null;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2387.length; var3++) {
            if (!class252.field4415.method1248((byte) -53, 0, this.field2387[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)Z")
    public final boolean method937(byte arg0) {
        if (arg0 != -35) {
            this.field2402 = null;
        }
        boolean var2 = true;
        field2389++;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2398[var3] != -1 && !class252.field4415.method1248((byte) 106, 0, this.field2398[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILkb;Lkb;)V")
    public static final void method938(int arg0, class53 arg1, class53 arg2) {
        field2401++;
        if (arg1.field873 != null) {
            arg1.method392(1);
        }
        arg1.field864 = arg2.field864;
        arg1.field873 = arg2;
        if (arg0 > -117) {
            field2393 = null;
        }
        arg1.field873.field864 = arg1;
        arg1.field864.field873 = arg1;
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(B)V")
    public static final void method939(byte arg0) {
        field2400++;
        int var1 = class75.method562(5);
        if (var1 == 0) {
            class268.field4705 = null;
            class235.method1582(3, 0);
        } else if (var1 == 1) {
            class83.method599((byte) 0, arg0 + 17976);
            class235.method1582(3, 512);
            class192.method1330(-26342);
        } else {
            class83.method599((byte) (class102.field1665 - 4 & 0xFF), arg0 ^ 0x4638);
            class235.method1582(3, 2);
        }
        if (arg0 != 6) {
            field2403 = null;
        }
    }
}
