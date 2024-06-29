import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class177 {

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Ldd;")
    private class272 field3009 = null;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    private int field3004 = 65000;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Ldd;")
    private class272 field3013 = null;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    private int field3012;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field3008 = 0;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Z")
    public static boolean field3007 = false;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field3016 = 0;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "F")
    public static float field3002;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Ljc;")
    public static class323 field3014;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Lcg;")
    public static class49 field3011;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(JB)V", line = 5)
    public static final void method1365(long arg0, byte arg1) {
        class341.field5443.field5353 = 0;
        field3005++;
        class341.field5443.method2370(21, (byte) -20);
        class341.field5443.method2333(arg0, -93);
        class108.field1843 = 0;
        class69.field1127 = 1;
        class148.field2660 = -3;
        class225.field3792 = 0;
        if (arg1 >= -17) {
            method1365(-118L, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZII[BI)Z", line = 30)
    private final boolean method1366(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field3001++;
        class272 var6 = this.field3009;
        synchronized (this.field3009) {
            try {
                int var7;
                boolean var10000;
                if (arg0) {
                    if (this.field3013.method1856(arg4 - 254) < (long) (arg1 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field3013.method1864((long) (arg1 * 6), 26);
                    this.field3013.method1860((byte) -40, 6, class256.field4129, 0);
                    var7 = (class256.field4129[5] & 0xFF) + (((class256.field4129[3] & 0xFF) << 16) + (class256.field4129[4] & 0xFF << 8));
                    if (var7 <= 0 || ((long) var7) > (this.field3009.method1856(1) / 520L)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field3009.method1856(arg4 - 254) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class256.field4129[5] = (byte) var7;
                class256.field4129[4] = (byte) (var7 >> 8);
                class256.field4129[2] = (byte) arg2;
                class256.field4129[1] = (byte) (arg2 >> 8);
                int var8 = 0;
                class256.field4129[3] = (byte) (var7 >> 16);
                class256.field4129[0] = (byte) (arg2 >> 16);
                this.field3013.method1864((long) (arg1 * 6), 68);
                if (arg4 != 255) {
                    this.method1366(true, 4, 86, (byte[]) null, -22);
                }
                int var9 = 0;
                this.field3013.method1865(0, 6, arg4 ^ 0xFFFFFF00, class256.field4129);
                while (true) {
                    if (arg2 > var8) {
                        label138: {
                            int var10 = 0;
                            if (arg0) {
                                this.field3009.method1864((long) (var7 * 520), 47);
                                try {
                                    this.field3009.method1860((byte) -40, 8, class256.field4129, 0);
                                } catch (EOFException var18) {
                                    break label138;
                                }
                                int var12 = ((class256.field4129[0] & 0xFF) << 8) + (class256.field4129[1] & 0xFF);
                                var10 = (class256.field4129[6] & 0xFF) + ((class256.field4129[4] & 0xFF << 16) + ((class256.field4129[5] & 0xFF) << 8));
                                int var13 = ((class256.field4129[2] & 0xFF) << 8) + (class256.field4129[3] & 0xFF);
                                int var14 = class256.field4129[7] & 0xFF;
                                if (arg1 != var12 || var9 != var13 || this.field3012 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || this.field3009.method1856(arg4 ^ 0xFE) / 520L < (long) var10) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field3009.method1856(1) + 519L) / 520L);
                                arg0 = false;
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class256.field4129[2] = (byte) (var9 >> 8);
                            class256.field4129[0] = (byte) (arg1 >> 8);
                            if (arg2 - var8 <= 512) {
                                var10 = 0;
                            }
                            class256.field4129[1] = (byte) arg1;
                            class256.field4129[4] = (byte) (var10 >> 16);
                            class256.field4129[7] = (byte) this.field3012;
                            class256.field4129[6] = (byte) var10;
                            class256.field4129[3] = (byte) var9;
                            class256.field4129[5] = (byte) (var10 >> 8);
                            var9++;
                            int var15 = arg2 - var8;
                            this.field3009.method1864((long) (var7 * 520), arg4 ^ 0x88);
                            this.field3009.method1865(0, 8, -1, class256.field4129);
                            var7 = var10;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            this.field3009.method1865(var8, var15, arg4 ^ 0xFFFFFF00, arg3);
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 149)
    public static void method1367(int arg0) {
        field3011 = null;
        if (arg0 != -5316) {
            method1367(-30);
        }
        field3014 = null;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)[Lwb;", line = 160)
    public static final class171[] method1368(int arg0) {
        if (arg0 < 18) {
            method1368(38);
        }
        class171[] var1 = new class171[class130.field2242];
        for (int var2 = 0; var2 < class130.field2242; var2++) {
            byte[] var3 = class191.field3205[var2];
            int var4 = class39.field585[var2] * class123.field2138[var2];
            if (class32.field452[var2]) {
                byte[] var5 = class85.field1367[var2];
                int[] var6 = new int[var4];
                for (int var7 = 0; var7 < var4; var7++) {
                    var6[var7] = class144.method1159(class40.field600[class36.method319(var3[var7], 255)], class36.method319(var5[var7], 255) << 24);
                }
                if (class43.field680) {
                    var1[var2] = new class182(class308.field4901, class4.field58, class352.field5575[var2], class104.field1743[var2], class39.field585[var2], class123.field2138[var2], var6);
                } else {
                    var1[var2] = new class273(class308.field4901, class4.field58, class352.field5575[var2], class104.field1743[var2], class39.field585[var2], class123.field2138[var2], var6);
                }
            } else {
                int[] var8 = new int[var4];
                for (int var9 = 0; var9 < var4; var9++) {
                    var8[var9] = class40.field600[class36.method319(255, var3[var9])];
                }
                if (class43.field680) {
                    var1[var2] = new class157(class308.field4901, class4.field58, class352.field5575[var2], class104.field1743[var2], class39.field585[var2], class123.field2138[var2], var8);
                } else {
                    var1[var2] = new class309(class308.field4901, class4.field58, class352.field5575[var2], class104.field1743[var2], class39.field585[var2], class123.field2138[var2], var8);
                }
            }
        }
        class15.method151(0);
        field3010++;
        return var1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)[B", line = 240)
    public final byte[] method1369(int arg0, boolean arg1) {
        field3015++;
        class272 var3 = this.field3009;
        synchronized (this.field3009) {
            try {
                Object var10000;
                if ((long) (arg0 * 6 + 6) > this.field3013.method1856(1)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field3013.method1864((long) (arg0 * 6), 111);
                this.field3013.method1860((byte) -40, 6, class256.field4129, 0);
                int var4 = ((class256.field4129[1] & 0xFF) << 8) + (class256.field4129[0] & 0xFF << 16) + (class256.field4129[2] & 0xFF);
                int var5 = (class256.field4129[5] & 0xFF) + ((class256.field4129[4] & 0xFF) << 8) + (class256.field4129[3] & 0xFF << 16);
                if (var4 < 0 || var4 > this.field3004) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 <= 0 || (this.field3009.method1856(1) / 520L) < ((long) var5)) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    byte[] var6 = new byte[var4];
                    int var7 = 0;
                    byte[] var19;
                    if (!arg1) {
                        var19 = (byte[]) null;
                        return var19;
                    }
                    int var8 = 0;
                    label118: while (var7 < var4) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field3009.method1864((long) (var5 * 520), 38);
                        int var9 = var4 - var7;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field3009.method1860((byte) -40, var9 + 8, class256.field4129, 0);
                        int var10 = (class256.field4129[2] & 0xFF << 8) + (class256.field4129[3] & 0xFF);
                        int var11 = class256.field4129[7] & 0xFF;
                        int var12 = ((class256.field4129[0] & 0xFF) << 8) + (class256.field4129[1] & 0xFF);
                        int var13 = ((class256.field4129[4] & 0xFF) << 16) + ((class256.field4129[5] & 0xFF) << 8) + (class256.field4129[6] & 0xFF);
                        if (arg0 == var12 && var8 == var10 && this.field3012 == var11) {
                            if (var13 >= 0 && (this.field3009.method1856(1) / 520L) >= ((long) var13)) {
                                var5 = var13;
                                var8++;
                                int var14 = 0;
                                while (true) {
                                    if (var14 >= var9) {
                                        continue label118;
                                    }
                                    var6[var7++] = class256.field4129[var14 + 8];
                                    var14++;
                                }
                            }
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var10000 = null;
                        return (byte[]) var10000;
                    }
                    var19 = var6;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "toString", descriptor = "()Ljava/lang/String;", line = 327)
    public final String toString() {
        field3003++;
        return "Cache:" + this.field3012;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([BIII)Z", line = 338)
    public final boolean method1370(byte[] arg0, int arg1, int arg2, int arg3) {
        field3006++;
        class272 var5 = this.field3009;
        synchronized (this.field3009) {
            if (arg2 < arg1 || this.field3004 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1366(true, arg3, arg2, arg0, 255);
            if (!var6) {
                var6 = this.method1366(false, arg3, arg2, arg0, 255);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(ILdd;Ldd;I)V", line = 373)
    public class177(int arg0, class272 arg1, class272 arg2, int arg3) {
        this.field3009 = arg1;
        this.field3012 = arg0;
        this.field3013 = arg2;
        this.field3004 = arg3;
    }
}
