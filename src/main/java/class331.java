import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class331 {

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public int field4389;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Lho;")
    public static class103 field4387 = new class103(47, 3);

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4393 = new Rectangle[100];

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lo;")
    public static class24 field4392;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "[Lo;")
    public static class24[] field4394;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field4393[var0] = new Rectangle();
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1939(int arg0) {
        field4390++;
        int var1 = 81 % ((arg0 + 33) / 44);
        for (int var2 = 0; var2 < class347.field4621; var2++) {
            class282 var3 = class40.field429[var2];
            boolean var4 = false;
            if (var3.field3737 == null) {
                var3.field3739--;
                if (var3.field3739 < (var3.field3736 == 2 ? -1500 : -10)) {
                    var4 = true;
                } else {
                    if (var3.field3736 == 1 && var3.field3734 == null) {
                        var3.field3734 = class25.method159(class273.field3641, var3.field3728, 0);
                        if (var3.field3734 == null) {
                            continue;
                        }
                        var3.field3739 += var3.field3734.method158();
                    } else if (var3.field3736 == 2 && (var3.field3730 == null || var3.field3726 == null)) {
                        if (var3.field3730 == null) {
                            var3.field3730 = class56.method331(class75.field938, var3.field3728);
                        }
                        if (var3.field3730 == null) {
                            continue;
                        }
                        if (var3.field3726 == null) {
                            var3.field3726 = var3.field3730.method336(new int[] { 22050 });
                            if (var3.field3726 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field3739 < 0) {
                        int var12;
                        if (var3.field3738 == 0) {
                            var12 = class319.field4256.field4652 * var3.field3735 >> 8;
                        } else {
                            int var5 = (var3.field3738 & 0x3A902C0) >> 24;
                            if (class96.field1170.field3695 == var5) {
                                int var6 = (var3.field3738 & 0xFF) << 7;
                                int var7 = var3.field3738 >> 16 & 0xFF;
                                int var8 = (var7 << 7) + 64 - class96.field1170.field3704;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = (var3.field3738 & 0xFFC2) >> 8;
                                int var10 = (var9 << 7) + 64 - class96.field1170.field3694;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 128;
                                if (var11 > var6) {
                                    var3.field3739 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var12 = (var6 - var11) * class319.field4256.field4650 * var3.field3735 / var6 >> 8;
                            } else {
                                var12 = 0;
                            }
                        }
                        if (var12 > 0) {
                            class77 var13 = null;
                            if (var3.field3736 == 1) {
                                var13 = var3.field3734.method156().method444(class266.field3571);
                            } else if (var3.field3736 == 2) {
                                var13 = var3.field3726;
                            }
                            class224 var14 = var3.field3737 = class224.method1430(var13, 100, var12);
                            var14.method1407(var3.field3732 - 1);
                            class465.field6928.method1110(var14);
                        }
                    }
                }
            } else if (!var3.field3737.method2673(-122)) {
                var4 = true;
            }
            if (var4) {
                class347.field4621--;
                for (int var15 = var2; var15 < class347.field4621; var15++) {
                    class40.field429[var15] = class40.field429[var15 + 1];
                }
                var2--;
            }
        }
        if (class401.field5809 && !class390.method2359((byte) 21)) {
            if (class319.field4256.field4655 != 0 && class43.field460 != -1) {
                class525.method3124(false, 1, class43.field460, 0, class96.field1214, class319.field4256.field4655);
            }
            class401.field5809 = false;
        } else if (class319.field4256.field4655 != 0 && class43.field460 != -1 && !class390.method2359((byte) 113)) {
            class492.method2979(class534.field7856, 56);
            class375.field5085++;
            class106.field1443.method2398(7, class43.field460);
            class43.field460 = -1;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V", line = 182)
    public static void method1940(int arg0) {
        if (arg0 != 255) {
            method1941(-124, null, -10, (byte) -52, 118, -50);
        }
        field4387 = null;
        field4394 = null;
        field4392 = null;
        field4393 = null;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V", line = 194)
    public class331(int arg0) {
        this.field4389 = arg0;
    }

    @OriginalMember(owner = "client!ka", name = "toString", descriptor = "()Ljava/lang/String;", line = 202)
    public final String toString() {
        field4388++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[[[BIBII)V", line = 211)
    public static final void method1941(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class292.field3861++;
        class258.field3443 = 0;
        for (int var6 = class12.field127; var6 < class478.field7065; var6++) {
            class498[][] var17 = class186.field2421[var6];
            for (int var18 = class259.field3462; var18 < class410.field5874; var18++) {
                for (int var19 = class176.field2275; var19 < class69.field814; var19++) {
                    class498 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class487.field7157[var18 + class349.field4645 - class151.field1977][var19 + class349.field4645 - class122.field1577] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field7258 = true;
                            var20.field7267 = true;
                            if (var20.field7263 == null) {
                                var20.field7261 = false;
                            } else {
                                var20.field7261 = true;
                            }
                            class258.field3443++;
                        } else {
                            var20.field7258 = false;
                            var20.field7267 = false;
                            var20.field7266 = 0;
                            if (var18 >= class151.field1977 - 16 && var18 <= class151.field1977 + 16 && var19 >= class122.field1577 - 16 && var19 <= class122.field1577 + 16 && (var20.field7264 != null || var20.field7257 != null || var20.field7259 != null || var20.field7271 != null || var20.field7268 != null || var20.field7263 != null)) {
                                class429.field6242.method200((byte) 125, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class378.field5470 == class152.field1993;
        for (int var8 = class12.field127; var8 < class478.field7065; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class492.field7216.method1144() && var8 >= arg2 && arg1 != null) {
                int var10 = class487.field7157.length;
                if (class487.field7157.length + class259.field3462 > class515.field7487) {
                    var10 -= class487.field7157.length + class259.field3462 - class515.field7487;
                }
                int var11 = class487.field7157[0].length;
                if (class487.field7157[0].length + class176.field2275 > class114.field1494) {
                    var11 -= class487.field7157[0].length + class176.field2275 - class114.field1494;
                }
                int var12 = class38.field397;
                while (true) {
                    if (var12 >= var10) {
                        class429.field6242.method199(class152.field1993[var8], var9, true, var8, 0);
                        break;
                    }
                    int var13 = class259.field3462 + var12 - class38.field397;
                    for (int var14 = class135.field1792; var14 < var11; var14++) {
                        class32.field327[var12][var14] = false;
                        if (class487.field7157[var12][var14]) {
                            int var15 = class176.field2275 + var14 - class135.field1792;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class186.field2421[var16][var13][var15] != null && class186.field2421[var16][var13][var15].field7262 == var8) {
                                    class32.field327[var12][var14] = class186.field2421[var16][var13][var15].field7258;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class429.field6242.method199(class152.field1993[var8], var9, false, var8, 0);
            }
            class429.field6242.method205(0);
        }
        if (!class366.method2174(true)) {
            class366.method2174(false);
        }
    }
}
