import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class139 implements Runnable {

    @OriginalMember(owner = "client!u", name = "q", descriptor = "[Lgb;")
    public volatile class45[] field3175 = new class45[2];

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Z")
    public volatile boolean field3166 = false;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "Z")
    public volatile boolean field3172 = false;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Lr;")
    public static class118 field3159 = class153.method1136(92, ":clan:");

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field3165 = 20;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Lr;")
    private static class118 field3163 = class153.method1136(84, "Loaded textures");

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lr;")
    public static class118 field3160 = field3163;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "[I")
    public static int[] field3173 = new int[25];

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field3170 = -1;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "Lvf;")
    public class152 field3174;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "La;")
    public static class1 field3167;

    @OriginalMember(owner = "client!u", name = "run", descriptor = "()V")
    public final void run() {
        field3171++;
        this.field3172 = true;
        try {
            while (!this.field3166) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class45 var2 = this.field3175[var1];
                    if (var2 != null) {
                        var2.method374((byte) -74);
                    }
                }
                method1042(-64, 10L);
                class142.method1055(null, 27114, this.field3174);
            }
        } catch (Exception var9) {
            class23.method212(null, (byte) 92, var9);
        } finally {
            Object var6 = null;
            this.field3172 = false;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIZ)Lr;")
    public static final class118 method1039(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 >= -64) {
            return null;
        }
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var4 = 1;
        field3164++;
        for (int var5 = arg1 / arg0; var5 != 0; var5 /= arg0) {
            var4++;
        }
        int var6 = var4;
        if (arg1 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg1 % arg0;
            if (var10 < 0) {
                var10 = -var10;
            }
            arg1 /= arg0;
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class118 var9 = new class118();
        var9.field2746 = var7;
        var9.field2743 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static final void method1040(int arg0) {
        if (class127.field2915 != null) {
            class127.field2915.method408((byte) 126);
            class127.field2915 = null;
        }
        if (arg0 > -8) {
            return;
        }
        field3162++;
        class121.method950((byte) 10);
        class68.field1583.method1172();
        for (int var1 = 0; var1 < 4; var1++) {
            class121.field2790[var1].method997((byte) 116);
        }
        System.gc();
        class13.method92((byte) -113, 2);
        class25.field616 = -1;
        class85.field2059 = false;
        class67.method574(-122);
        class39.method326(22077, 10);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method1041(byte arg0) {
        field3159 = null;
        field3173 = null;
        field3160 = null;
        field3167 = null;
        field3163 = null;
        if (arg0 < 51) {
            field3165 = -38;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IJ)V")
    public static final void method1042(int arg0, long arg1) {
        if (arg0 > -36) {
            method1040(1);
        }
        field3161++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class84.method684(arg1 - 1L, false);
            class84.method684(1L, false);
        } else {
            class84.method684(arg1, false);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I[BIB)I")
    public static final int method1043(int arg0, byte[] arg1, int arg2, byte arg3) {
        int var4 = -1;
        field3169++;
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class118.field2774[(arg1[var5] ^ var4) & 0xFF];
        }
        if (arg3 > -23) {
            field3173 = null;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
    public static final void method1044(int arg0) {
        int var1 = 0;
        int var2 = 75 % ((33 - arg0) / 58);
        while (var1 < class108.field2525) {
            int var10002 = class142.field3220[var1]--;
            if (class142.field3220[var1] >= -10) {
                label76: {
                    class96 var4 = class51.field1218[var1];
                    if (var4 == null) {
                        var4 = class96.method752(class91.field2189, class127.field2908[var1], 0);
                        if (var4 == null) {
                            break label76;
                        }
                        class142.field3220[var1] += var4.method751();
                        class51.field1218[var1] = var4;
                    }
                    if (class142.field3220[var1] < 0) {
                        label79: {
                            int var11;
                            if (class11.field262[var1] == 0) {
                                var11 = class33.field841;
                            } else {
                                int var5 = (class11.field262[var1] & 0xFF) * 128;
                                int var6 = class11.field262[var1] >> 16 & 0xFF;
                                int var7 = var6 * 128 + 64 - class89.field2150.field760;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var8 = class11.field262[var1] >> 8 & 0xFF;
                                int var9 = var8 * 128 + 64 - class89.field2150.field712;
                                if (var9 < 0) {
                                    var9 = -var9;
                                }
                                int var10 = var7 + var9 - 128;
                                if (var10 > var5) {
                                    class142.field3220[var1] = -100;
                                    break label79;
                                }
                                if (var10 < 0) {
                                    var10 = 0;
                                }
                                var11 = (var5 - var10) * class91.field2178 / var5;
                            }
                            if (var11 > 0) {
                                class117 var12 = var4.method753().method902(class136.field3090);
                                class50 var13 = class50.method449(var12, 100, var11);
                                var13.method448(class74.field1839[var1] - 1);
                                class94.field2239.method759(var13);
                            }
                            class142.field3220[var1] = -100;
                        }
                    }
                }
            } else {
                class108.field2525--;
                for (int var3 = var1; var3 < class108.field2525; var3++) {
                    class127.field2908[var3] = class127.field2908[var3 + 1];
                    class51.field1218[var3] = class51.field1218[var3 + 1];
                    class74.field1839[var3] = class74.field1839[var3 + 1];
                    class142.field3220[var3] = class142.field3220[var3 + 1];
                    class11.field262[var3] = class11.field262[var3 + 1];
                }
                var1--;
            }
            var1++;
        }
        if (class85.field2059 && !class126.method982(0)) {
            if (class59.field1386 != 0 && class25.field616 != -1) {
                class100.method773(0, class59.field1386, class46.field1113, 6116423, false, class25.field616);
            }
            class85.field2059 = false;
        }
        field3168++;
    }
}
