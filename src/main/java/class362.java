import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class362 implements class155 {

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field5444 = -1;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field5442 = 104;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field5443 = 0;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field5446 = -1;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public int field5435;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public int field5436;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public int field5439;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public int field5441;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public int field5445;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public int field5448;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Z")
    public boolean field5440;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lja;IIIII)V", line = 6)
    public static final void method2209(class173 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5434++;
        if (arg0.field2356 == -1 && arg0.field2372 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class118.field1533.field6903 * arg0.field2365 >> 8;
        if (arg0.field2368 < arg1) {
            var6 += arg1 - arg0.field2368;
        } else if (arg0.field2362 > arg1) {
            var6 += arg0.field2362 - arg1;
        }
        if (arg4 > arg0.field2357) {
            var6 += arg4 - arg0.field2357;
        } else if (arg0.field2364 > arg4) {
            var6 += arg0.field2364 - arg4;
        }
        if (arg0.field2375 == 0 || arg0.field2375 < (var6 - 64) || class118.field1533.field6903 == 0 || arg0.field2353 != arg2) {
            if (arg0.field2366 != null) {
                class375.field5607.method643(arg0.field2366);
                arg0.field2366 = null;
            }
            if (arg0.field2361 != null) {
                class375.field5607.method643(arg0.field2361);
                arg0.field2361 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg0.field2375 - var6) * var7 / arg0.field2375;
        if (arg0.field2366 != null) {
            arg0.field2366.method2713(var8);
        } else if (arg0.field2356 >= 0) {
            class264 var9 = class264.method1629(class238.field3338, arg0.field2356, 0);
            if (var9 != null) {
                class80 var10 = var9.method1626().method518(class222.field3135);
                class462 var11 = class462.method2681(var10, 100, var8);
                var11.method2685(-1);
                class375.field5607.method640(var11);
                arg0.field2366 = var11;
            }
        }
        if (arg3 != 100) {
            return;
        }
        if (arg0.field2361 != null) {
            arg0.field2361.method2713(var8);
            if (!arg0.field2361.method542((byte) -67)) {
                arg0.field2361 = null;
            }
        } else if (arg0.field2372 != null && (arg0.field2374 -= arg5) <= 0) {
            int var12 = (int) (Math.random() * (double) arg0.field2372.length);
            class264 var13 = class264.method1629(class238.field3338, arg0.field2372[var12], 0);
            if (var13 != null) {
                class80 var14 = var13.method1626().method518(class222.field3135);
                class462 var15 = class462.method2681(var14, 100, var8);
                var15.method2685(0);
                class375.field5607.method640(var15);
                arg0.field2374 = arg0.field2355 + (int) (Math.random() * (double) (arg0.field2370 - arg0.field2355));
                arg0.field2361 = var15;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()V", line = 133)
    public static final void method2210() {
        for (int var0 = 0; var0 < class134.field1712; var0++) {
            class210 var1 = class451.field6573[var0];
            class420.method2489(var1);
            class451.field6573[var0] = null;
        }
        class134.field1712 = 0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLqa;)Z", line = 149)
    public final boolean method935(byte arg0, class155 arg1) {
        field5438++;
        if (!(arg1 instanceof class362)) {
            return false;
        } else if (arg0 >= -77) {
            return true;
        } else {
            class362 var3 = (class362) arg1;
            if (this.field5436 != var3.field5436) {
                return false;
            } else if (this.field5445 != var3.field5445) {
                return false;
            } else if (this.field5441 != var3.field5441) {
                return false;
            } else if (this.field5435 != var3.field5435) {
                return false;
            } else if (this.field5448 != var3.field5448) {
                return false;
            } else if (this.field5439 == var3.field5439) {
                return var3.field5440 == this.field5440;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lhe;ZI)Lrp;", line = 196)
    public static final class287 method2211(class239 arg0, boolean arg1, int arg2) {
        field5437++;
        if (arg1) {
            byte[] var3 = arg0.method1465(0, arg2);
            return var3 == null ? null : new class287(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)J", line = 222)
    public final long method934(int arg0) {
        field5447++;
        long[] var2 = class156.field2026;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field5436) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) (((long) (this.field5445 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) ((var7 ^ (long) this.field5445) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) (((long) (this.field5441 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field5441 >> 16)) & 0xFFL)];
        long var15 = var2[(int) (((long) (this.field5441 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) ((var15 ^ (long) this.field5441) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field5435) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field5448 >> 24)) & 0xFFL)];
        long var23 = var2[(int) (((long) (this.field5448 >> 16) ^ var21) & 0xFFL)] ^ var21 >>> 8;
        int var25 = -56 % ((arg0 + 59) / 63);
        long var26 = var23 >>> 8 ^ var2[(int) (((long) (this.field5448 >> 8) ^ var23) & 0xFFL)];
        long var28 = var26 >>> 8 ^ var2[(int) ((var26 ^ (long) this.field5448) & 0xFFL)];
        long var30 = var28 >>> 8 ^ var2[(int) ((var28 ^ (long) this.field5439) & 0xFFL)];
        return var30 >>> 8 ^ var2[(int) (((long) (this.field5440 ? 1 : 0) ^ var30) & 0xFFL)];
    }
}
