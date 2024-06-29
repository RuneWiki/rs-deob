import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class282 extends class68 {

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field4683 = 0;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "Lce;")
    public static class126 field4684 = class206.method1445(-7923, "Sprites charg-Bs");

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public static int field4691 = 0;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    public static int field4700 = 0;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "Lce;")
    public static class126 field4692 = class206.method1445(-7923, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public int field4685;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    public int field4686;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public int field4687;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    public int field4694;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    public int field4696;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "Lwd;")
    public class112 field4689;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "Lwd;")
    public class112 field4697;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "Lce;")
    public class126 field4688;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "Z")
    public boolean field4690;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "[Ljava/lang/Object;")
    public Object[] field4699;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lgd;I)V", line = 6)
    public static final void method1885(class138 arg0, int arg1) {
        field4695++;
        arg0.field2501 = arg0.field2441;
        if (arg0.field2489 == 0) {
            arg0.field2490 = 0;
            return;
        }
        if (arg0.field2476 != -1 && arg0.field2449 == 0) {
            class294 var2 = class110.method721(-125, arg0.field2476);
            if (arg0.field2485 > 0 && var2.field4876 == 0) {
                arg0.field2490++;
                return;
            }
            if (arg0.field2485 <= 0 && var2.field4893 == 0) {
                arg0.field2490++;
                return;
            }
        }
        int var3 = arg0.field2461;
        int var4 = arg0.field2487;
        int var5 = arg0.field2460[arg0.field2489 - 1] * 128 + (arg0.method1013(false) * 64);
        int var6 = arg0.field2471[arg0.field2489 - 1] * 128 + arg0.method1013(false) * 64;
        if ((var5 - var3) > 256 || var5 - var3 < -256 || (var6 - var4) > 256 || var6 - var4 < -256) {
            arg0.field2487 = var6;
            arg0.field2461 = var5;
            return;
        }
        int var7 = arg0.field2494;
        if (var5 <= var3) {
            if (var5 >= var3) {
                if (var4 < var6) {
                    arg0.field2444 = 1024;
                } else if (var4 > var6) {
                    arg0.field2444 = 0;
                }
            } else if (var6 > var4) {
                arg0.field2444 = 768;
            } else if (var4 <= var6) {
                arg0.field2444 = 512;
            } else {
                arg0.field2444 = 256;
            }
        } else if (var4 < var6) {
            arg0.field2444 = 1280;
        } else if (var4 > var6) {
            arg0.field2444 = 1792;
        } else {
            arg0.field2444 = 1536;
        }
        int var8 = arg0.field2444 - arg0.field2483 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (arg1 >= ~var8 && var8 <= 256) {
            var7 = arg0.field2458;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg0.field2442;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg0.field2474;
        }
        if (var7 == -1) {
            var7 = arg0.field2458;
        }
        boolean var9 = true;
        arg0.field2501 = var7;
        if (arg0 instanceof class89) {
            var9 = ((class89) arg0).field1389.field5112;
        }
        int var10 = 4;
        if (var9) {
            if (arg0.field2483 != arg0.field2444 && arg0.field2475 == -1 && arg0.field2465 != 0) {
                var10 = 2;
            }
            if (arg0.field2489 > 2) {
                var10 = 6;
            }
            if (arg0.field2489 > 3) {
                var10 = 8;
            }
            if (arg0.field2490 > 0 && arg0.field2489 > 1) {
                var10 = 8;
                arg0.field2490--;
            }
        } else {
            if (arg0.field2489 > 1) {
                var10 = 6;
            }
            if (arg0.field2489 > 2) {
                var10 = 8;
            }
            if (arg0.field2490 > 0 && arg0.field2489 > 1) {
                var10 = 8;
                arg0.field2490--;
            }
        }
        if (arg0.field2507[arg0.field2489 - 1]) {
            var10 <<= 0x1;
        }
        if (var4 < var6) {
            arg0.field2487 += var10;
            if (var6 < arg0.field2487) {
                arg0.field2487 = var6;
            }
        } else if (var4 > var6) {
            arg0.field2487 -= var10;
            if (var6 > arg0.field2487) {
                arg0.field2487 = var6;
            }
        }
        if (var3 < var5) {
            arg0.field2461 += var10;
            if (var5 < arg0.field2461) {
                arg0.field2461 = var5;
            }
        } else if (var3 > var5) {
            arg0.field2461 -= var10;
            if (var5 > arg0.field2461) {
                arg0.field2461 = var5;
            }
        }
        if (arg0.field2461 == var5 && arg0.field2487 == var6) {
            if (arg0.field2485 > 0) {
                arg0.field2485--;
            }
            arg0.field2489--;
        }
        if (var10 >= 8 && arg0.field2501 == arg0.field2458 && arg0.field2464 != -1) {
            arg0.field2501 = arg0.field2464;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V", line = 218)
    public static void method1886(int arg0) {
        field4684 = null;
        if (arg0 <= -4) {
            field4692 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)I", line = 231)
    public static final int method1887(int arg0) {
        field4693++;
        return arg0 == 0 ? 2 : 112;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([[II)V", line = 251)
    public static final void method1888(int[][] arg0, int arg1) {
        class314.field5393 = arg0;
        if (arg1 == 9393) {
            field4698++;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V", line = 297)
    public static final void method1889(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class228.field3848; var3++) {
            for (int var4 = 0; var4 < class197.field3377; var4++) {
                for (int var5 = 0; var5 < class65.field1094; var5++) {
                    class5 var6 = class297.field4940[var3][var4][var5];
                    if (var6 != null) {
                        class130 var7 = var6.field46;
                        if (var7 != null && var7.field2234.method449()) {
                            class53.method333(var7.field2234, var3, var4, var5, 1, 1);
                            if (var7.field2239 != null && var7.field2239.method449()) {
                                class53.method333(var7.field2239, var3, var4, var5, 1, 1);
                                var7.field2234.method437(var7.field2239, 0, 0, 0, false);
                                var7.field2239 = var7.field2239.method431(arg0, arg1, arg2);
                            }
                            var7.field2234 = var7.field2234.method431(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field61; var8++) {
                            class240 var9 = var6.field54[var8];
                            if (var9 != null && var9.field4043.method449()) {
                                class53.method333(var9.field4043, var3, var4, var5, var9.field4051 + 1 - var9.field4041, var9.field4044 - var9.field4046 + 1);
                                var9.field4043 = var9.field4043.method431(arg0, arg1, arg2);
                            }
                        }
                        class8 var10 = var6.field52;
                        if (var10 != null && var10.field103.method449()) {
                            class161.method1187(var10.field103, var3, var4, var5);
                            var10.field103 = var10.field103.method431(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }
}
