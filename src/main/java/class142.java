import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class142 extends class20 {

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    public int field3332;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    private int field3328;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "[I")
    public int[] field3324;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "[[I")
    public int[][] field3329;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "Lsc;")
    public static class128 field3321 = class129.method1017(false, "hel");

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "Lsc;")
    public static class128 field3322 = class129.method1017(false, "::qa_op_test");

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "[I")
    public static int[] field3327 = new int[1000];

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "Lsc;")
    public static class128 field3331 = class129.method1017(false, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "Lje;")
    public static class67 field3325 = new class67(5000);

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "Lsc;")
    private static class128 field3334 = class129.method1017(false, "The server is being updated)3");

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
    public static int field3336 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "Lsc;")
    public static class128 field3337 = field3334;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    public static int field3335 = 1;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "Lsc;")
    public static class128 field3338 = class129.method1017(false, "<img=0>");

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public static final void method1158(int arg0) {
        field3323++;
        if (arg0 >= -96) {
            field3321 = null;
        }
        if (!class135.field3180) {
            class120.field2738[0] = class125.field2833;
            class7.field103 = 1;
            class105.field2394[0] = class18.field323;
            class121.field2760[0] = 1007;
        }
        if (class29.field556 != -1) {
            class33.method247(class29.field556, -1);
        }
        for (int var1 = 0; var1 < class117.field2657; var1++) {
            if (class153.field3517[var1]) {
                class7.field111[var1] = true;
            }
            class12.field194[var1] = class153.field3517[var1];
            class153.field3517[var1] = false;
        }
        class116.field2611 = null;
        class119.field2689 = -1;
        class75.field1644 = -1;
        class110.field2483 = class29.field554;
        if (class29.field556 != -1) {
            class117.field2657 = 0;
            class60.method461(class29.field556, 0, 0, 503, 0, -65, 0, -1, 765);
        }
        class138.method1138();
        class71.method535(2);
        if (class135.field3180) {
            class21.method178(16);
        } else if (class119.field2689 != -1) {
            class82.method607(class75.field1644, 10, class119.field2689);
        }
        if (class90.field2058 == 3) {
            for (int var2 = 0; var2 < class117.field2657; var2++) {
                if (class12.field194[var2]) {
                    class138.method1126(class35.field652[var2], class122.field2772[var2], class2.field16[var2], class18.field336[var2], 16711935, 128);
                } else if (class7.field111[var2]) {
                    class138.method1126(class35.field652[var2], class122.field2772[var2], class2.field16[var2], class18.field336[var2], 16711680, 128);
                }
            }
        }
        class42.method298((byte) -15, class29.field553, class151.field3473.field975, class155.field3570, class151.field3473.field987);
        class155.field3570 = 0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILha;)V")
    public static final void method1159(int arg0, int arg1, class50 arg2) {
        if (class29.field554 < arg2.field949) {
            class115.method888(arg2, (byte) -86);
        } else if (arg2.field1014 >= class29.field554) {
            class108.method840(arg2, (byte) 45);
        } else {
            class97.method754(arg2, (byte) -38);
        }
        field3333++;
        if (arg1 > arg2.field975 || arg2.field987 < 128 || arg2.field975 >= 13184 || arg2.field987 >= 13184) {
            arg2.field987 = arg2.field989[0] * 128 + arg2.field960 * 64;
            arg2.field1014 = 0;
            arg2.field949 = 0;
            arg2.field968 = -1;
            arg2.field975 = arg2.field962[0] * 128 + arg2.field960 * 64;
            arg2.field981 = -1;
            arg2.method387(-7798);
        }
        if (class151.field3473 == arg2 && (arg2.field975 < 1536 || arg2.field987 < 1536 || arg2.field975 >= 11776 || arg2.field987 >= 11776)) {
            arg2.field1014 = 0;
            arg2.field981 = -1;
            arg2.field949 = 0;
            arg2.field968 = -1;
            arg2.field987 = arg2.field989[0] * 128 + arg2.field960 * 64;
            arg2.field975 = arg2.field962[0] * 128 + arg2.field960 * 64;
            arg2.method387(-7798);
        }
        class53.method401((byte) -75, arg2);
        class16.method155((byte) 30, arg2);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIB)I")
    public static final int method1160(int arg0, int arg1, byte arg2) {
        int var3 = 0;
        field3330++;
        while (arg1 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg1--;
            arg0 >>>= 0x1;
        }
        if (arg2 != 58) {
            method1161(-111);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public static final void method1161(int arg0) {
        try {
            if (class90.field2056 == null) {
                class90.field2056 = new class158(class144.field3353, class51.method395(new class128[] { class44.field824, class18.field319, class102.field2328 }, false).method1011((byte) -116));
            } else {
                byte[] var1 = class90.field2056.method1229(-123);
                if (var1 != null) {
                    class86 var2 = new class86(var1);
                    class122.field2782 = var2.method632((byte) -80);
                    class23.field475 = new class5[class122.field2782];
                    for (int var3 = 0; var3 < class122.field2782; var3++) {
                        class5 var4 = class23.field475[var3] = new class5();
                        int var5 = var2.method632((byte) -80);
                        var4.field66 = (var5 & 0x8000) != 0;
                        var4.field54 = var5 & 0x7FFF;
                        var4.field50 = var2.method670(arg0 - 32769);
                        var4.field64 = var2.method637(false);
                        var4.field40 = var3;
                        var4.field52 = class128.method984(false, var4.field50);
                    }
                    class41.method296(class143.field3346, 0, arg0 ^ 0xA68F, class23.field475.length - 1, class55.field1231, class23.field475);
                    class90.field2056 = null;
                    class75.field1663 = true;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class90.field2056 = null;
        }
        field3326++;
        if (arg0 != 32768) {
            method1160(-63, -53, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V")
    public static final void method1162(byte arg0) {
        field3320++;
        while (class158.field3626.method510(true, class128.field2942) >= 11) {
            int var1 = class158.field3626.method512(11, (byte) -78);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class106.field2421[var1] == null) {
                class106.field2421[var1] = new class53();
                var2 = true;
                if (class129.field2959[var1] != null) {
                    class106.field2421[var1].method405(true, class129.field2959[var1]);
                }
            }
            class65.field1441[class134.field3151++] = var1;
            class53 var3 = class106.field2421[var1];
            var3.field1006 = class29.field554;
            int var4 = class158.field3626.method512(1, (byte) -78);
            if (var4 == 1) {
                class55.field1228[class124.field2802++] = var1;
            }
            int var5 = class158.field3626.method512(5, (byte) -78);
            int var6 = class100.field2299[class158.field3626.method512(3, (byte) -78)];
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var2) {
                var3.field985 = var3.field1012 = var6;
            }
            int var7 = class158.field3626.method512(5, (byte) -78);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class158.field3626.method512(1, (byte) -78);
            var3.method389(class151.field3473.field989[0] + var5, var8 == 1, class151.field3473.field962[0] + var7, (byte) -95);
        }
        if (arg0 > -30) {
            field3336 = -3;
        }
        class158.field3626.method511(false);
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)V")
    public static void method1163(byte arg0) {
        field3331 = null;
        field3321 = null;
        field3338 = null;
        if (arg0 > -25) {
            return;
        }
        field3322 = null;
        field3325 = null;
        field3327 = null;
        field3337 = null;
        field3334 = null;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I[B)V")
    public class142(int arg0, byte[] arg1) {
        this.field3332 = arg0;
        class86 var3 = new class86(arg1);
        this.field3328 = var3.method646(-15447);
        this.field3324 = new int[this.field3328];
        this.field3329 = new int[this.field3328][];
        for (int var4 = 0; var4 < this.field3328; var4++) {
            this.field3324[var4] = var3.method646(-15447);
        }
        for (int var5 = 0; var5 < this.field3328; var5++) {
            this.field3329[var5] = new int[var3.method646(-15447)];
        }
        for (int var6 = 0; var6 < this.field3328; var6++) {
            for (int var7 = 0; var7 < this.field3329[var6].length; var7++) {
                this.field3329[var6][var7] = var3.method646(-15447);
            }
        }
    }
}
