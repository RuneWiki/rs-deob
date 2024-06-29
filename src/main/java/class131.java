import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class131 {

    @OriginalMember(owner = "client!m", name = "n", descriptor = "B")
    private byte field2458;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public int field2457;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public int field2456;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public int field2452;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public int field2459;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public int field2461;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Li;")
    public static class88 field2448 = class208.method1425(105, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Li;")
    public static class88 field2454 = class208.method1425(105, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Lid;")
    public static class92 field2449 = new class92(64);

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Z")
    public static boolean field2462 = false;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "Lwi;")
    public static class248 field2463 = new class248();

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
    public static final void method883(int arg0, int arg1) {
        field2447++;
        if (class229.field4286 == arg0 || arg1 != 65536) {
            return;
        }
        if (class229.field4286 == 0) {
            class134.method896(arg1 ^ 0x752457A1);
        }
        if (arg0 == 20 || arg0 == 40) {
            class117.field2119 = 0;
            class6.field71 = 0;
            class196.field3760 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class89.field1666 != null) {
            class89.field1666.method919(true);
            class89.field1666 = null;
        }
        if (class229.field4286 == 25) {
            class113.field2047 = 0;
            class203.field3863 = 0;
            class146.field2753 = 1;
            class143.field2654 = 1;
            class196.field3756 = 0;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class184.method1300(class9.field137, class154.field2977, true, class226.field4245);
        } else {
            class202.method1386(-118);
        }
        class229.field4286 = arg0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)I")
    public final int method884(int arg0) {
        if (arg0 > -58) {
            method886(true);
        }
        field2455++;
        return (this.field2458 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)I")
    public static final int method885(int arg0, byte arg1) {
        field2460++;
        if (arg1 != -84) {
            field2454 = null;
        }
        return arg0 == 16711935 ? -1 : class234.method1561(arg0, true);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
    public static void method886(boolean arg0) {
        field2454 = null;
        if (!arg0) {
            method883(-12, 26);
        }
        field2463 = null;
        field2449 = null;
        field2448 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)I")
    public static final int method887(byte arg0) {
        field2445++;
        if (arg0 != 39) {
            method887((byte) -92);
        }
        int var1 = 3;
        if (class207.field3936 < 310) {
            int var2 = class79.field1428 >> 7;
            int var3 = class184.field3610 >> 7;
            int var4 = class240.field4458.field4138 >> 7;
            if ((class116.field2100[class149.field2909][var2][var3] & 0x4) != 0) {
                var1 = class149.field2909;
            }
            int var5;
            if (var2 < var4) {
                var5 = var4 - var2;
            } else {
                var5 = var2 - var4;
            }
            int var6 = class240.field4458.field4123 >> 7;
            int var7;
            if (var6 > var3) {
                var7 = var6 - var3;
            } else {
                var7 = var3 - var6;
            }
            if (var7 >= var5) {
                int var8 = var5 * 65536 / var7;
                int var9 = 32768;
                while (var3 != var6) {
                    if (var6 > var3) {
                        var3++;
                    } else if (var3 > var6) {
                        var3--;
                    }
                    var9 += var8;
                    if ((class116.field2100[class149.field2909][var2][var3] & 0x4) != 0) {
                        var1 = class149.field2909;
                    }
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var4 > var2) {
                            var2++;
                        } else if (var4 < var2) {
                            var2--;
                        }
                        if ((class116.field2100[class149.field2909][var2][var3] & 0x4) != 0) {
                            var1 = class149.field2909;
                        }
                    }
                }
            } else {
                int var10 = var7 * 65536 / var5;
                int var11 = 32768;
                while (var2 != var4) {
                    if (var2 < var4) {
                        var2++;
                    } else if (var2 > var4) {
                        var2--;
                    }
                    var11 += var10;
                    if ((class116.field2100[class149.field2909][var2][var3] & 0x4) != 0) {
                        var1 = class149.field2909;
                    }
                    if (var11 >= 65536) {
                        if (var3 < var6) {
                            var3++;
                        } else if (var3 > var6) {
                            var3--;
                        }
                        if ((class116.field2100[class149.field2909][var2][var3] & 0x4) != 0) {
                            var1 = class149.field2909;
                        }
                        var11 -= 65536;
                    }
                }
            }
        }
        if ((class116.field2100[class149.field2909][class240.field4458.field4138 >> 7][class240.field4458.field4123 >> 7] & 0x4) != 0) {
            var1 = class149.field2909;
        }
        return var1;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)I")
    public final int method888(byte arg0) {
        field2446++;
        if (arg0 != -93) {
            this.method888((byte) 98);
        }
        return this.field2458 & 0x7;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class131() {
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lea;)V")
    public class131(class46 arg0) {
        this.field2458 = arg0.method324(123);
        this.field2457 = arg0.method301(36);
        this.field2456 = arg0.method323((byte) -97);
        this.field2452 = arg0.method323((byte) -80);
        this.field2459 = arg0.method323((byte) -116);
        this.field2461 = arg0.method323((byte) -118);
    }
}
