import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class157 extends class264 {

    @OriginalMember(owner = "client!df", name = "jb", descriptor = "I")
    private int field2339 = 0;

    @OriginalMember(owner = "client!df", name = "sb", descriptor = "I")
    private int field2348 = 2048;

    @OriginalMember(owner = "client!df", name = "Cb", descriptor = "I")
    private int field2358 = 2048;

    @OriginalMember(owner = "client!df", name = "vb", descriptor = "I")
    private int field2351 = 12288;

    @OriginalMember(owner = "client!df", name = "Ab", descriptor = "I")
    private int field2356 = 0;

    @OriginalMember(owner = "client!df", name = "Fb", descriptor = "I")
    private int field2361 = 8192;

    @OriginalMember(owner = "client!df", name = "Hb", descriptor = "I")
    private int field2363 = 4096;

    @OriginalMember(owner = "client!df", name = "nb", descriptor = "Lma;")
    public static class5 field2343 = class12.method119("Suche nach Updates )2 ", (byte) 99);

    @OriginalMember(owner = "client!df", name = "zb", descriptor = "I")
    public static int field2355 = 50;

    @OriginalMember(owner = "client!df", name = "pb", descriptor = "[I")
    public static int[] field2345 = new int[field2355];

    @OriginalMember(owner = "client!df", name = "wb", descriptor = "[I")
    public static int[] field2352 = new int[field2355];

    @OriginalMember(owner = "client!df", name = "ob", descriptor = "[I")
    public static int[] field2344 = new int[field2355];

    @OriginalMember(owner = "client!df", name = "xb", descriptor = "[I")
    public static int[] field2353 = new int[field2355];

    @OriginalMember(owner = "client!df", name = "kb", descriptor = "[I")
    public static int[] field2340 = new int[field2355];

    @OriginalMember(owner = "client!df", name = "yb", descriptor = "[I")
    public static int[] field2354 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!df", name = "lb", descriptor = "[Lma;")
    public static class5[] field2341 = new class5[field2355];

    @OriginalMember(owner = "client!df", name = "Db", descriptor = "[I")
    public static int[] field2359 = new int[field2355];

    @OriginalMember(owner = "client!df", name = "ib", descriptor = "[I")
    public static int[] field2338 = new int[field2355];

    @OriginalMember(owner = "client!df", name = "Eb", descriptor = "Lel;")
    public static class218 field2360 = new class218();

    @OriginalMember(owner = "client!df", name = "Ib", descriptor = "I")
    public static int field2364 = 0;

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!df", name = "hb", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!df", name = "mb", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!df", name = "qb", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!df", name = "rb", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!df", name = "tb", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!df", name = "ub", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!df", name = "Bb", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!df", name = "Gb", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!df", name = "fb", descriptor = "Lrj;")
    public static class237 field2335;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBI)Z", line = 8)
    private final boolean method1005(int arg0, byte arg1, int arg2) {
        field2357++;
        int var4 = (arg0 + arg2) * this.field2351 >> 12;
        int var5 = -89 % ((arg1 - 2) / 58);
        int var6 = class195.field3043[var4 * 255 >> 12 & 0xFF];
        int var7 = (var6 << 12) / this.field2351;
        int var8 = (var7 << 12) / this.field2361;
        int var9 = this.field2363 * var8 >> 12;
        return var9 > (arg0 - arg2) && (arg0 - arg2) > (-var9);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILii;)V", line = 28)
    public final void method4(int arg0, int arg1, class221 arg2) {
        field2362++;
        if (arg1 >= -27) {
            field2359 = (int[]) null;
        }
        if (arg0 == 0) {
            this.field2348 = arg2.method1524((byte) 72);
        } else if (arg0 == 1) {
            this.field2356 = arg2.method1524((byte) 40);
        } else if (arg0 == 2) {
            this.field2339 = arg2.method1524((byte) 74);
        } else if (arg0 == 3) {
            this.field2358 = arg2.method1524((byte) 94);
        } else if (arg0 == 4) {
            this.field2351 = arg2.method1524((byte) 63);
        } else if (arg0 == 5) {
            this.field2363 = arg2.method1524((byte) 122);
        } else if (arg0 == 6) {
            this.field2361 = arg2.method1524((byte) 51);
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(BI)Z", line = 105)
    public static final boolean method1006(byte arg0, int arg1) {
        field2337++;
        if (arg0 < 35) {
            return false;
        } else {
            return arg1 == 198 || arg1 == 230 || arg1 == 156 || arg1 == 140 || arg1 == 223;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 246)
    public class157() {
        super(0, true);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIBLni;)Lfi;", line = 139)
    public static final class222 method1007(int arg0, int arg1, byte arg2, class202 arg3) {
        field2336++;
        if (class180.method1171(arg1, arg0, arg3, (byte) -128)) {
            return arg2 == -97 ? class119.method796((byte) 26) : (class222) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)[I", line = 159)
    public final int[] method5(int arg0, int arg1) {
        field2349++;
        if (arg0 >= -58) {
            this.method4(67, 5, (class221) null);
        }
        int[] var3 = this.field4501.method1176(arg1, 123);
        if (this.field4501.field2741) {
            int var4 = class116.field1726[arg1] - 2048;
            for (int var5 = 0; var5 < class226.field3716; var5++) {
                int var6 = class251.field4159[var5] - 2048;
                int var7 = this.field2348 + var6;
                int var8 = this.field2339 + var6;
                int var9 = this.field2356 + var4;
                int var10 = var7 >= -2048 ? var7 : var7 + 4096;
                int var11 = var10 > 2048 ? var10 - 4096 : var10;
                int var12 = var9 < -2048 ? var9 + 4096 : var9;
                int var13 = this.field2358 + var4;
                int var14 = var8 >= -2048 ? var8 : var8 + 4096;
                int var15 = var12 > 2048 ? var12 - 4096 : var12;
                int var16 = var14 > 2048 ? var14 - 4096 : var14;
                int var17 = var13 < -2048 ? var13 + 4096 : var13;
                int var18 = var17 > 2048 ? var17 - 4096 : var17;
                var3[var5] = this.method1009((byte) 107, var15, var11) || this.method1005(var18, (byte) -87, var16) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V", line = 215)
    public final void method111(int arg0) {
        field2350++;
        class90.method592(0);
        int var2 = -36 % ((66 - arg0) / 44);
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(III)J", line = 235)
    public static final long method1008(int arg0, int arg1, int arg2) {
        class198 var3 = class43.field646[arg0][arg1][arg2];
        return var3 == null || var3.field3158 == null ? 0L : var3.field3158.field813;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BII)Z", line = 276)
    private final boolean method1009(byte arg0, int arg1, int arg2) {
        field2342++;
        int var4 = (arg1 - arg2) * this.field2351 >> 12;
        int var5 = class195.field3043[var4 * 255 >> 12 & 0xFF];
        if (arg0 == 107) {
            int var6 = (var5 << 12) / this.field2351;
            int var7 = (var6 << 12) / this.field2361;
            int var8 = this.field2363 * var7 >> 12;
            return (arg1 + arg2) < var8 && (-var8) < (arg1 + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "(I)V", line = 311)
    public static void method1010(int arg0) {
        field2360 = null;
        field2343 = null;
        field2345 = null;
        field2353 = null;
        field2354 = null;
        field2335 = null;
        field2338 = null;
        field2359 = null;
        field2344 = null;
        field2341 = null;
        if (arg0 != 5) {
            field2347 = -127;
        }
        field2340 = null;
        field2352 = null;
    }
}
