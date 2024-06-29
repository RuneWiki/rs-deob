import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class151 {

    @OriginalMember(owner = "client!on", name = "b", descriptor = "Z")
    private boolean field2425 = false;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    private int field2434 = 32;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "J")
    private long field2427 = class19.method122(-12169);

    @OriginalMember(owner = "client!on", name = "v", descriptor = "J")
    private long field2445 = 0L;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "[Lro;")
    private class1[] field2444 = new class1[8];

    @OriginalMember(owner = "client!on", name = "w", descriptor = "I")
    private int field2446 = 0;

    @OriginalMember(owner = "client!on", name = "G", descriptor = "I")
    private int field2456 = 0;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "J")
    private long field2447 = 0L;

    @OriginalMember(owner = "client!on", name = "E", descriptor = "[Lro;")
    private class1[] field2454 = new class1[8];

    @OriginalMember(owner = "client!on", name = "D", descriptor = "I")
    private int field2453 = 0;

    @OriginalMember(owner = "client!on", name = "C", descriptor = "I")
    private int field2452 = 0;

    @OriginalMember(owner = "client!on", name = "B", descriptor = "Z")
    private boolean field2451 = true;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "I")
    public int field2448;

    @OriginalMember(owner = "client!on", name = "z", descriptor = "I")
    private int field2449;

    @OriginalMember(owner = "client!on", name = "A", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!on", name = "F", descriptor = "I")
    public int field2455;

    @OriginalMember(owner = "client!on", name = "H", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "Lro;")
    private class1 field2441;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "Lgk;")
    public static class222 field2429;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "[I")
    public int[] field2438;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "[[[B")
    public static byte[][][] field2430;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 5)
    public static void method1089(int arg0) {
        field2429 = null;
        field2430 = (byte[][][]) null;
        if (arg0 <= 52) {
            method1090(97, -85, 29);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III)I", line = 17)
    public static final int method1090(int arg0, int arg1, int arg2) {
        class220 var3 = (class220) class294.field4888.method29((long) arg2, arg1 + 10115);
        field2435++;
        if (arg1 != -10012) {
            return 82;
        } else if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var3.field3375.length) {
            return var3.field3375[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "()V", line = 37)
    public void method710() {
        field2428++;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "()V", line = 45)
    public void method708() throws Exception {
        field2437++;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V", line = 58)
    public final synchronized void method1091(int arg0) {
        field2431++;
        if (this.field2425) {
            return;
        }
        long var2 = class19.method122(-12169);
        try {
            if (var2 > this.field2427 + 500000L) {
                this.field2427 = var2 - 500000L;
            }
            while (this.field2427 + 5000L < var2) {
                this.method1097(256, -13882);
                this.field2427 += (long) (256000 / class322.field5294);
            }
        } catch (Exception var9) {
            this.field2427 = var2;
        }
        if (this.field2438 == null) {
            return;
        }
        try {
            if (this.field2445 != 0L) {
                if (var2 < this.field2445) {
                    return;
                }
                this.method709(this.field2455);
                this.field2445 = 0L;
                this.field2451 = true;
            }
            int var5 = this.method706();
            if (arg0 != 1) {
                return;
            }
            if ((this.field2446 - var5) > this.field2452) {
                this.field2452 = this.field2446 - var5;
            }
            int var6 = this.field2449 + this.field2448;
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if (var6 + 256 > this.field2455) {
                var5 = 0;
                this.field2455 += 1024;
                if (this.field2455 > 16384) {
                    this.field2455 = 16384;
                }
                this.method710();
                this.method709(this.field2455);
                if (this.field2455 < var6 + 256) {
                    var6 = this.field2455 - 256;
                    this.field2449 = var6 - this.field2448;
                }
                this.field2451 = true;
            }
            while (var5 < var6) {
                this.method1093(this.field2438, 256);
                this.method707();
                var5 += 256;
            }
            if (var2 > this.field2447) {
                if (this.field2451) {
                    this.field2451 = false;
                } else if (this.field2452 == 0 && this.field2456 == 0) {
                    this.method710();
                    this.field2445 = var2 + 2000L;
                    return;
                } else {
                    this.field2449 = Math.min(this.field2456, this.field2452);
                    this.field2456 = this.field2452;
                }
                this.field2452 = 0;
                this.field2447 = var2 + 2000L;
            }
            this.field2446 = var5;
        } catch (Exception var8) {
            this.method710();
            this.field2445 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V", line = 178)
    public final synchronized void method1092(int arg0) {
        field2432++;
        if (class148.field2395 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class148.field2395.field4928[var3] == this) {
                    class148.field2395.field4928[var3] = null;
                }
                if (class148.field2395.field4928[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class148.field2395.field4922 = true;
                while (class148.field2395.field4920) {
                    class177.method1246(50L, -32644);
                }
                class148.field2395 = null;
            }
        }
        if (arg0 != -26619) {
            this.method710();
        }
        this.method710();
        this.field2425 = true;
        this.field2438 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 227)
    public void method705(Component arg0) throws Exception {
        field2433++;
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(I)V", line = 234)
    public void method709(int arg0) throws Exception {
        field2426++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "([II)V", line = 244)
    private final void method1093(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class228.field3587) {
            var3 = arg1 << 1;
        }
        class298.method2101(arg0, 0, var3);
        this.field2453 -= arg1;
        if (this.field2441 != null && this.field2453 <= 0) {
            this.field2453 += class322.field5294 >> 4;
            class186.method1287(this.field2441, false);
            this.method1098(0, this.field2441.method2(), this.field2441);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class1 var10 = null;
                        class1 var11 = this.field2454[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class301 var12 = var11.field4;
                                if (var12 == null || var12.field4962 <= var8) {
                                    var11.field3 = true;
                                    int var13 = var11.method7();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4962 += var13;
                                    }
                                    if (var4 >= this.field2434) {
                                        break label105;
                                    }
                                    class1 var14 = var11.method3();
                                    if (var14 != null) {
                                        int var15 = var11.field1;
                                        while (var14 != null) {
                                            this.method1098(0, var15 * var14.method2() >> 8, var14);
                                            var14 = var11.method1();
                                        }
                                    }
                                    class1 var16 = var11.field2;
                                    var11.field2 = null;
                                    if (var10 == null) {
                                        this.field2454[var7] = var16;
                                    } else {
                                        var10.field2 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2444[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class1 var18 = this.field2454[var17];
                this.field2454[var17] = this.field2444[var17] = null;
                while (var18 != null) {
                    class1 var19 = var18.field2;
                    var18.field2 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2453 < 0) {
            this.field2453 = 0;
        }
        if (this.field2441 != null) {
            this.field2441.method4(arg0, 0, arg1);
        }
        this.field2427 = class19.method122(-12169);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V", line = 411)
    public final synchronized void method1094(boolean arg0) {
        field2457++;
        this.field2451 = true;
        try {
            if (arg0) {
                this.field2434 = 82;
            }
            this.method708();
        } catch (Exception var3) {
            this.method710();
            this.field2445 = class19.method122(-12169) + 2000L;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lro;I)V", line = 431)
    public final synchronized void method1095(class1 arg0, int arg1) {
        this.field2441 = arg0;
        field2442++;
        if (arg1 != 0) {
            this.field2448 = -83;
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "()I", line = 444)
    public int method706() throws Exception {
        field2439++;
        return this.field2455;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(Z)V", line = 453)
    public final void method1096(boolean arg0) {
        if (!arg0) {
            this.field2451 = true;
            field2440++;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)V", line = 464)
    private final void method1097(int arg0, int arg1) {
        this.field2453 -= arg0;
        if (this.field2453 < 0) {
            this.field2453 = 0;
        }
        if (this.field2441 != null) {
            this.field2441.method5(arg0);
        }
        if (arg1 != -13882) {
            field2429 = (class222) null;
        }
        field2443++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IILro;)V", line = 500)
    private final void method1098(int arg0, int arg1, class1 arg2) {
        field2436++;
        int var4 = arg1 >> 5;
        class1 var5 = this.field2444[var4];
        if (var5 == null) {
            this.field2454[var4] = arg2;
        } else {
            var5.field2 = arg2;
        }
        this.field2444[var4] = arg2;
        if (arg0 != 0) {
            field2429 = (class222) null;
        }
        arg2.field1 = arg1;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ID)V", line = 522)
    public static final void method1099(int arg0, double arg1) {
        if (class324.field5323 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class18.field220[var3] = var4 > 255 ? 255 : var4;
            }
            class324.field5323 = arg1;
        }
        field2450++;
        if (arg0 != 0) {
            method1090(61, 27, -7);
        }
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "()V", line = 561)
    public void method707() throws Exception {
        field2424++;
    }
}
