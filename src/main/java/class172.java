import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class172 {

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "[I")
    public int[] field2386;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "[I")
    public int[] field2394;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "[Ljava/lang/String;")
    public String[] field2395;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "[B")
    public byte[] field2392;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "Z")
    public static boolean field2389 = false;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field2384 = 0;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Llc;")
    public static class86 field2388 = new class86(500);

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public static int field2399 = -1;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "Llc;")
    public static class86 field2398 = new class86(64);

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public static int field2400 = -1;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1123(int arg0, int arg1) {
        field2390++;
        String var2 = Integer.toString(arg1);
        if (arg0 != 0) {
            return null;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class46.field677 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class85.field1154 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)I")
    public final int method1124(int arg0, int arg1) {
        field2397++;
        if (arg1 != -24698) {
            this.method1126(-44, 91);
        }
        return this.field2392[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZ)Z")
    public final boolean method1125(int arg0, boolean arg1) {
        field2381++;
        if (arg1) {
            this.field2386 = null;
        }
        return (this.field2392[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(II)Z")
    public final boolean method1126(int arg0, int arg1) {
        if (arg1 != 3) {
            method1123(-113, -97);
        }
        field2382++;
        return (this.field2392[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILql;)Lnd;")
    public static final class270 method1127(int arg0, class224 arg1) {
        field2383++;
        if (arg0 != -1) {
            field2387 = -17;
        }
        return new class270(arg1.method1479(false), arg1.method1479(false), arg1.method1479(false), arg1.method1479(false), arg1.method1454(-72), arg1.method1454(arg0 ^ 0x55), arg1.method1453((byte) -128));
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lak;I[I[I[I)V")
    public static final void method1128(class140 arg0, int arg1, int[] arg2, int[] arg3, int[] arg4) {
        if (arg1 != 3354) {
            field2387 = -92;
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg3[var5];
            int var8 = arg2[var5];
            int var9 = 0;
            while (var7 != 0 && arg0.field4022.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field4022[var9] = null;
                    } else {
                        class240 var10 = class132.method905(true, var6);
                        int var11 = var10.field3674;
                        class212 var12 = arg0.field4022[var9];
                        if (var12 != null) {
                            if (var12.field3195 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field4022[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3196 = 1;
                                    var12.field3191 = 0;
                                    var12.field3189 = 0;
                                    var12.field3190 = 0;
                                    var12.field3197 = var8;
                                    class116.method781(arg0.field4085, arg1 - 3118, arg0.field4019, false, 0, var10);
                                } else if (var11 == 2) {
                                    var12.field3191 = 0;
                                }
                            } else if (var10.field3671 >= class132.method905(true, var12.field3195).field3671) {
                                var12 = arg0.field4022[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class212 var13 = arg0.field4022[var9] = new class212();
                            var13.field3196 = 1;
                            var13.field3195 = var6;
                            var13.field3190 = 0;
                            var13.field3191 = 0;
                            var13.field3197 = var8;
                            var13.field3189 = 0;
                            class116.method781(arg0.field4085, arg1 - 3118, arg0.field4019, false, 0, var10);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field2396++;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIBII)V")
    public static final void method1129(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != 57) {
            field2387 = -38;
        }
        for (int var6 = arg2; var6 <= arg5; var6++) {
            class154.method1028(-353, class216.field3264[var6], arg1, arg4, arg0);
        }
        field2385++;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)Z")
    public final boolean method1130(int arg0, byte arg1) {
        field2391++;
        if (arg1 == 83) {
            return (this.field2392[arg0] & 0x8) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(I)V")
    public class172(int arg0) {
        this.field2393 = arg0;
        this.field2386 = new int[this.field2393];
        this.field2394 = new int[this.field2393];
        this.field2395 = new String[this.field2393];
        this.field2392 = new byte[this.field2393];
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
    public static void method1131(byte arg0) {
        field2398 = null;
        if (arg0 <= 122) {
            field2399 = -22;
        }
        field2388 = null;
    }
}
