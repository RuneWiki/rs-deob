import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class143 implements Runnable {

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "[Lhn;")
    public volatile class196[] field2330 = new class196[2];

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Z")
    public volatile boolean field2337 = false;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Z")
    public volatile boolean field2338 = false;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2329 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field2334 = 0;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "Z")
    public static boolean field2335 = false;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field2332 = 0;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "Lna;")
    public class145 field2341;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1098(int arg0) {
        field2328++;
        int var1 = class313.field4976;
        int var2 = class190.field3048;
        int var3 = class117.field1969 - var1 - class298.field4779;
        if (arg0 < 0) {
            method1098(26);
        }
        int var4 = class129.field2188 - class252.field4266 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class89.field1502 != null) {
                var5 = class89.field1502;
            } else if (class241.field3994 == null) {
                var5 = class128.field2163.field2350;
            } else {
                var5 = class241.field3994;
            }
            int var6 = 0;
            int var7 = 0;
            if (class241.field3994 == var5) {
                Insets var8 = class241.field3994.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class129.field2188);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class117.field1969, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class117.field1969 + var6 - var3, var7, var3, class129.field2188);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class129.field2188 + var7 - var4, class117.field1969, var4);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 75)
    public static void method1099(byte arg0) {
        int var1 = -76 % ((-arg0 - 56) / 44);
        field2329 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V", line = 85)
    public static final void method1100(int arg0, int arg1) {
        int var2 = class281.field4617;
        field2333++;
        int var3 = class206.field3250;
        int var4 = class229.field3807;
        int var5 = class194.field3095;
        int var6 = class176.field2818;
        int var7 = (int) class261.field4396 + class296.field4763 & 0x7FF;
        int var8 = (int) class84.field1426;
        if (var8 < (class148.field2376 / 256)) {
            var8 = class148.field2376 / 256;
        }
        if (class78.field1353[4] && class34.field505[4] + 128 > var8) {
            var8 = class34.field505[4] + 128;
        }
        class179.method1408(var8, arg1, (byte) 116, class282.field4621, class271.method2034(-1, class6.field55.field3511, class6.field55.field3577, class186.field2991) - 50, var8 * 3 + 600, class206.field3259, var7);
        if (class281.field4617 == var2 && class206.field3250 == var3 && class229.field3807 == var4 && class194.field3095 == var5 && class176.field2818 == var6) {
            class112.field1827 = 1;
            return;
        }
        class353.field5590 = 10;
        class336.field5309 = 10;
        class258.field4347 = 10;
        int var9 = class176.field2818 - var6;
        if (var4 < class229.field3807) {
            var4 += (class229.field3807 - var4) * class336.field5309 / 1000 + class258.field4347;
            if (class229.field3807 > var4) {
                class229.field3807 = var4;
            }
        }
        class255.field4299 = 10;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var3 < class206.field3250) {
            var3 += class258.field4347 + ((class206.field3250 - var3) * class336.field5309 / 1000);
            if (class206.field3250 > var3) {
                class206.field3250 = var3;
            }
        }
        if (var3 > class206.field3250) {
            int var10 = var3 - ((var3 - class206.field3250) * class336.field5309 / 1000 + class258.field4347);
            if (class206.field3250 < var10) {
                class206.field3250 = var10;
            }
        }
        if (class194.field3095 > var5) {
            var5 += (class194.field3095 - var5) * class353.field5590 / 1000 + class255.field4299;
            if (var5 < class194.field3095) {
                class194.field3095 = var5;
            }
        }
        if (class194.field3095 < var5) {
            int var11 = var5 - ((var5 - class194.field3095) * class353.field5590 / 1000 + class255.field4299);
            if (class194.field3095 < var11) {
                class194.field3095 = var11;
            }
        }
        if (class229.field3807 < var4) {
            int var12 = var4 - ((var4 - class229.field3807) * class336.field5309 / 1000 + class258.field4347);
            if (var12 > class229.field3807) {
                class229.field3807 = var12;
            }
        }
        if (var9 < -1024) {
            var9 += 2048;
        }
        if (arg0 < 19) {
            field2339 = -123;
        }
        if (var9 > 0) {
            int var13 = class353.field5590 * var9 / 1000 + class255.field4299 + var6;
            var6 = var13 & 0x7FF;
        }
        if (var9 < 0) {
            int var14 = var6 - (class255.field4299 + (-var9 * class353.field5590 / 1000));
            var6 = var14 & 0x7FF;
        }
        if (class281.field4617 > var2) {
            var2 += (class281.field4617 - var2) * class336.field5309 / 1000 + class258.field4347;
            if (class281.field4617 > var2) {
                class281.field4617 = var2;
            }
        }
        if (var2 > class281.field4617) {
            int var15 = var2 - ((var2 - class281.field4617) * class336.field5309 / 1000 + class258.field4347);
            if (class281.field4617 < var15) {
                class281.field4617 = var15;
            }
        }
        int var16 = class176.field2818 - var6;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 >= 0 || var9 <= 0 || var16 > 0 && var9 < 0) {
            class176.field2818 = var6;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)I", line = 232)
    public static final int method1101(int arg0, byte arg1) {
        if (arg1 >= -46) {
            return -64;
        } else {
            field2340++;
            return arg0 >>> 7;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "()V", line = 243)
    public static final void method1102() {
        class7.field63 = 0;
        label194: for (int var0 = 0; var0 < class103.field1674; var0++) {
            class152 var1 = class44.field687[var0];
            if (class142.field2320 != null) {
                for (int var2 = 0; var2 < class142.field2320.length; var2++) {
                    if (class142.field2320[var2] != -1000000 && (var1.field2421 <= class142.field2320[var2] || var1.field2414 <= class142.field2320[var2]) && (var1.field2424 <= class16.field191[var2] || var1.field2409 <= class16.field191[var2]) && (var1.field2424 >= class70.field1223[var2] || var1.field2409 >= class70.field1223[var2]) && (var1.field2419 <= class278.field4573[var2] || var1.field2408 <= class278.field4573[var2]) && (var1.field2419 >= class336.field5310[var2] || var1.field2408 >= class336.field5310[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field2427 == 1) {
                int var3 = var1.field2423 + class172.field2740 - class245.field4011;
                if (var3 >= 0 && var3 <= class172.field2740 + class172.field2740) {
                    int var4 = var1.field2412 + class172.field2740 - class125.field2138;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field2432 + class172.field2740 - class125.field2138;
                    if (var5 > class172.field2740 + class172.field2740) {
                        var5 = class172.field2740 + class172.field2740;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class166.field2653[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class291.field4713 - var1.field2424;
                        if (var7 > 32) {
                            var1.field2430 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field2430 = 2;
                            var7 = -var7;
                        }
                        var1.field2426 = (var1.field2419 - class36.field550 << 8) / var7;
                        var1.field2429 = (var1.field2408 - class36.field550 << 8) / var7;
                        var1.field2416 = (var1.field2421 - class66.field1175 << 8) / var7;
                        var1.field2425 = (var1.field2414 - class66.field1175 << 8) / var7;
                        class314.field5000[class7.field63++] = var1;
                    }
                }
            } else if (var1.field2427 == 2) {
                int var8 = var1.field2412 + class172.field2740 - class125.field2138;
                if (var8 >= 0 && var8 <= class172.field2740 + class172.field2740) {
                    int var9 = var1.field2423 + class172.field2740 - class245.field4011;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field2420 + class172.field2740 - class245.field4011;
                    if (var10 > class172.field2740 + class172.field2740) {
                        var10 = class172.field2740 + class172.field2740;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class166.field2653[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class36.field550 - var1.field2419;
                        if (var12 > 32) {
                            var1.field2430 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field2430 = 4;
                            var12 = -var12;
                        }
                        var1.field2422 = (var1.field2424 - class291.field4713 << 8) / var12;
                        var1.field2413 = (var1.field2409 - class291.field4713 << 8) / var12;
                        var1.field2416 = (var1.field2421 - class66.field1175 << 8) / var12;
                        var1.field2425 = (var1.field2414 - class66.field1175 << 8) / var12;
                        class314.field5000[class7.field63++] = var1;
                    }
                }
            } else if (var1.field2427 == 4) {
                int var13 = var1.field2421 - class66.field1175;
                if (var13 > 128) {
                    int var14 = var1.field2412 + class172.field2740 - class125.field2138;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field2432 + class172.field2740 - class125.field2138;
                    if (var15 > class172.field2740 + class172.field2740) {
                        var15 = class172.field2740 + class172.field2740;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field2423 + class172.field2740 - class245.field4011;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field2420 + class172.field2740 - class245.field4011;
                        if (var17 > class172.field2740 + class172.field2740) {
                            var17 = class172.field2740 + class172.field2740;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class166.field2653[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field2430 = 5;
                            var1.field2422 = (var1.field2424 - class291.field4713 << 8) / var13;
                            var1.field2413 = (var1.field2409 - class291.field4713 << 8) / var13;
                            var1.field2426 = (var1.field2419 - class36.field550 << 8) / var13;
                            var1.field2429 = (var1.field2408 - class36.field550 << 8) / var13;
                            class314.field5000[class7.field63++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)Ljf;", line = 469)
    public static final class358 method1103(int arg0, int arg1) {
        field2331++;
        if (arg0 != 3307) {
            field2335 = false;
        }
        class358 var2 = (class358) class87.field1490.method2329((byte) 107, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class44.field691.method472(arg1, 51, 30);
        class358 var4 = new class358();
        if (var3 != null) {
            var4.method2521(new class227(var3), false, arg1);
        }
        class87.field1490.method2333((long) arg1, arg0 - 3307, var4);
        return var4;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(IB)I", line = 495)
    public static final int method1104(int arg0, byte arg1) {
        field2327++;
        return arg1 > -66 ? 117 : arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!vi", name = "run", descriptor = "()V", line = 541)
    public final void run() {
        field2336++;
        this.field2338 = true;
        try {
            while (!this.field2337) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class196 var2 = this.field2330[var1];
                    if (var2 != null) {
                        var2.method1516(256);
                    }
                }
                class283.method2076((byte) 114, 10L);
                class264.method2011(this.field2341, 0, (Object) null);
            }
        } catch (Exception var7) {
            class285.method2079(var7, (byte) -16, (String) null);
        } finally {
            this.field2338 = false;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(CZ)Z", line = 581)
    public static final boolean method1105(char arg0, boolean arg1) {
        field2342++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class348.method2441(!arg1, arg0)) {
            return true;
        } else {
            char[] var2 = class121.field2031;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
            if (!arg1) {
                return true;
            }
            char[] var5 = class293.field4739;
            for (int var6 = 0; var6 < var5.length; var6++) {
                char var7 = var5[var6];
                if (arg0 == var7) {
                    return true;
                }
            }
            return false;
        }
    }
}
