import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class167 {

    @OriginalMember(owner = "client!le", name = "o", descriptor = "Lul;")
    private class341 field2390;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Lmr;")
    private class77 field2379;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Lfc;")
    private class141 field2383;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "S")
    public static short field2385 = 32767;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "Lng;")
    public static class190 field2391 = new class190(64);

    @OriginalMember(owner = "client!le", name = "r", descriptor = "Ltc;")
    public static class196 field2393 = new class196();

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "Llf;")
    public static class130 field2394;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Leb;")
    private class371 field2392;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "[Lf;")
    private class450[] field2389;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static final void method1126(int arg0) {
        field2380++;
        int var1 = class393.field5747.method163(8, -91);
        if (class169.field2407 > var1) {
            for (int var2 = var1; var2 < class169.field2407; var2++) {
                class376.field5368[class296.field4079++] = class67.field1055[var2];
            }
        }
        if (var1 > class169.field2407) {
            throw new RuntimeException("gppov1");
        }
        class169.field2407 = 0;
        if (arg0 != 13) {
            field2391 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class67.field1055[var3];
            class354 var5 = class12.field153[var4];
            int var6 = class393.field5747.method163(1, arg0 - 127);
            if (var6 == 0) {
                class67.field1055[class169.field2407++] = var4;
                var5.field874 = class35.field541;
            } else {
                int var7 = class393.field5747.method163(2, -102);
                if (var7 == 0) {
                    class67.field1055[class169.field2407++] = var4;
                    var5.field874 = class35.field541;
                    class243.field3364[class54.field795++] = var4;
                } else if (var7 == 1) {
                    class67.field1055[class169.field2407++] = var4;
                    var5.field874 = class35.field541;
                    int var8 = class393.field5747.method163(3, -101);
                    var5.method401(var8, 1, -12053);
                    int var9 = class393.field5747.method163(1, arg0 - 133);
                    if (var9 == 1) {
                        class243.field3364[class54.field795++] = var4;
                    }
                } else if (var7 == 2) {
                    class67.field1055[class169.field2407++] = var4;
                    var5.field874 = class35.field541;
                    if (class393.field5747.method163(1, -108) == 1) {
                        int var11 = class393.field5747.method163(3, arg0 ^ 0xFFFFFFAF);
                        var5.method401(var11, 2, -12053);
                        int var12 = class393.field5747.method163(3, -115);
                        var5.method401(var12, 2, -12053);
                    } else {
                        int var10 = class393.field5747.method163(3, arg0 - 132);
                        var5.method401(var10, 0, arg0 ^ 0xFFFFD0E6);
                    }
                    int var13 = class393.field5747.method163(1, -93);
                    if (var13 == 1) {
                        class243.field3364[class54.field795++] = var4;
                    }
                } else if (var7 == 3) {
                    class376.field5368[class296.field4079++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BII)V")
    public static final void method1127(byte arg0, int arg1, int arg2) {
        field2381++;
        if (arg0 != -48) {
            field2391 = null;
        }
        class399 var3 = class269.method1655(13, arg2, arg0 ^ 0x1F);
        var3.method2583((byte) 71);
        var3.field5842 = arg1;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V")
    public static final void method1128(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2386++;
        class124 var5 = (class124) class71.field1103.method1412((byte) -54, (long) arg3);
        if (var5 == null) {
            var5 = new class124();
            class71.field1103.method1419((long) arg3, 108, var5);
        }
        if (arg2 >= var5.field1744.length) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field1744.length; var8++) {
                var6[var8] = var5.field1744[var8];
                var7[var8] = var5.field1740[var8];
            }
            for (int var9 = var5.field1744.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1740 = var7;
            var5.field1744 = var6;
        }
        if (arg4 < -119) {
            var5.field1744[arg2] = arg0;
            var5.field1740[arg2] = arg1;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public final void method1129(int arg0) {
        field2378++;
        if (this.field2389 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field2389.length; var2++) {
            if (this.field2389[var2] != null) {
                this.field2389[var2].method2814(-124);
            }
        }
        for (int var3 = 0; var3 < this.field2389.length; var3++) {
            if (this.field2389[var3] != null) {
                this.field2389[var3].method2815(100);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
    public static final void method1130(int arg0) {
        field2384++;
        int var1 = -28 % ((4 - arg0) / 47);
        if (class371.field5260 != null) {
            class1 var2 = class371.field5260;
            synchronized (class371.field5260) {
                class371.field5260 = null;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)Z")
    public final boolean method1131(int arg0) {
        field2377++;
        if (this.field2392 != null) {
            return true;
        }
        if (this.field2383 == null) {
            if (this.field2390.method2185(arg0 ^ 0xFFFFFFEB)) {
                return false;
            }
            this.field2383 = this.field2390.method2195(255, true, 255, arg0 ^ 0xFFFFFFFB, (byte) 0);
        }
        if (arg0 != -5) {
            field2393 = null;
        }
        if (this.field2383.field4169) {
            return false;
        } else {
            this.field2392 = new class371(this.field2383.method961(118));
            this.field2389 = new class450[(this.field2392.field5258.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lrb;BLrb;ZI)Lf;")
    private final class450 method1132(class197 arg0, byte arg1, class197 arg2, boolean arg3, int arg4) {
        field2388++;
        if (this.field2392 == null) {
            throw new RuntimeException();
        }
        this.field2392.field5273 = arg4 * 8 + 5;
        if (arg1 >= -102) {
            method1128(29, -45, 127, -46, -64);
        }
        if (this.field2392.field5258.length <= this.field2392.field5273) {
            throw new RuntimeException();
        } else if (this.field2389[arg4] == null) {
            int var6 = this.field2392.method2413((byte) -30);
            int var7 = this.field2392.method2413((byte) -30);
            class450 var8 = new class450(arg4, arg2, arg0, this.field2390, this.field2379, var6, var7, arg3);
            this.field2389[arg4] = var8;
            return var8;
        } else {
            return this.field2389[arg4];
        }
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V")
    public static void method1133(int arg0) {
        field2394 = null;
        field2391 = null;
        field2393 = null;
        if (arg0 > -126) {
            field2394 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lrb;Lrb;BI)Lf;")
    public final class450 method1134(class197 arg0, class197 arg1, byte arg2, int arg3) {
        field2376++;
        if (arg2 < 56) {
            field2394 = null;
        }
        return this.method1132(arg0, (byte) -125, arg1, true, arg3);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
    public static final void method1135() {
        class46.method326(1, class176.field2480);
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lul;Lmr;)V")
    public class167(class341 arg0, class77 arg1) {
        this.field2390 = arg0;
        this.field2379 = arg1;
        if (!this.field2390.method2185(16)) {
            this.field2383 = this.field2390.method2195(255, true, 255, 0, (byte) 0);
        }
    }
}
