import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class131 {

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Lnd;")
    public static class127 field2377 = new class127(30);

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static volatile int field2382 = 0;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "Ltg;")
    private static class184 field2386 = class135.method812(" is already on your ignore list)3", 3);

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Ltg;")
    public static class184 field2384 = field2386;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "[I")
    public static int[] field2383 = new int[50];

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "Ltg;")
    private static class184 field2392 = class135.method812("glow2:", 3);

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "Ltg;")
    public static class184 field2387 = field2392;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "Ltg;")
    public static class184 field2391 = field2392;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2375;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "[I")
    public static int[] field2381;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "[I")
    public static int[] field2385;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "[Ltg;")
    public static class184[] field2388;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "[[[I")
    public static int[][][] field2380;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILka;[B)V")
    public final void method792(int arg0, class97 arg1, byte[] arg2) {
        field2390++;
        if (arg1.field1809[arg1.field1834] != 31 || arg1.field1809[arg1.field1834 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2375 == null) {
            this.field2375 = new Inflater(true);
        }
        try {
            this.field2375.setInput(arg1.field1809, arg1.field1834 + 10, arg1.field1809.length - 8 - (arg1.field1834 + 10));
            this.field2375.inflate(arg2);
        } catch (Exception var4) {
            this.field2375.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2375.reset();
        if (arg0 != -25425) {
            method794((byte) 65);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static void method793(byte arg0) {
        field2385 = null;
        if (arg0 != -100) {
            field2391 = null;
        }
        field2380 = null;
        field2387 = null;
        field2391 = null;
        field2377 = null;
        field2392 = null;
        field2388 = null;
        field2386 = null;
        field2381 = null;
        field2383 = null;
        field2384 = null;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class131() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V")
    public static final void method794(byte arg0) {
        field2389++;
        for (class114 var1 = (class114) class6.field110.method404(false); var1 != null; var1 = (class114) class6.field110.method414(-119)) {
            if (class47.field892 != var1.field2069 || class161.field2903 > var1.field2046) {
                var1.method797((byte) -88);
            } else if (var1.field2050 <= class161.field2903) {
                if (var1.field2071 > 0) {
                    class158 var3 = class52.field948[var1.field2071 - 1];
                    if (var3 != null && var3.field635 >= 0 && var3.field635 < 13312 && var3.field614 >= 0 && var3.field614 < 13312) {
                        var1.method702(var3.field635, class161.field2903, -10253, class115.method706(var3.field635, var1.field2069, 127, var3.field614) - var1.field2061, var3.field614);
                    }
                }
                if (var1.field2071 < 0) {
                    int var4 = -var1.field2071 - 1;
                    class67 var5;
                    if (class125.field2260 == var4) {
                        var5 = class46.field872;
                    } else {
                        var5 = class57.field1024[var4];
                    }
                    if (var5 != null && var5.field635 >= 0 && var5.field635 < 13312 && var5.field614 >= 0 && var5.field614 < 13312) {
                        var1.method702(var5.field635, class161.field2903, -10253, class115.method706(var5.field635, var1.field2069, 127, var5.field614) - var1.field2061, var5.field614);
                    }
                }
                var1.method701(-1, class170.field3231);
                class125.method760(class47.field892, (int) var1.field2068, (int) var1.field2077, (int) var1.field2049, 60, var1, var1.field2076, -1L, false);
            }
        }
        int var2 = 117 % ((13 - arg0) / 37);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static final void method795(int arg0) {
        field2379++;
        if (class31.field535 != null || (arg0 < 47 || class34.field591 != null)) {
            return;
        }
        int var1 = class133.field2410;
        if (class170.field3244) {
            if (var1 != 1) {
                int var6 = class39.field736;
                int var7 = class195.field3793;
                if (class52.field955 - 10 > var6 || var6 > class52.field955 + class125.field2256 + 10 || var7 < class113.field2043 - 10 || class67.field1302 + class113.field2043 + 10 < var7) {
                    class170.field3244 = false;
                    class74.method439(31094, class67.field1302, class113.field2043, class125.field2256, class52.field955);
                }
            }
            if (var1 != 1) {
                return;
            }
            int var8 = class113.field2043;
            int var9 = class52.field955;
            int var10 = class125.field2256;
            int var11 = class158.field2823;
            int var12 = class134.field2429;
            int var13 = -1;
            for (int var14 = 0; var14 < class133.field2404; var14++) {
                int var15 = var8 + (class133.field2404 + -1 - var14) * 15 + 31;
                if (var9 < var11 && var9 + var10 > var11 && var12 > var15 - 13 && var15 + 3 > var12) {
                    var13 = var14;
                }
            }
            if (var13 != -1) {
                class43.method249(true, var13);
            }
            class170.field3244 = false;
            class74.method439(31094, class67.field1302, class113.field2043, class125.field2256, class52.field955);
            return;
        }
        if (var1 == 1 && class133.field2404 > 0) {
            short var2 = class54.field960[class133.field2404 - 1];
            if (var2 == 46 || var2 == 3 || var2 == 21 || var2 == 51 || var2 == 45 || var2 == 58 || var2 == 12 || var2 == 44 || var2 == 2 || var2 == 57 || var2 == 47 || var2 == 1006) {
                int var3 = class164.field2958[class133.field2404 - 1];
                int var4 = class25.field444[class133.field2404 - 1];
                class167 var5 = class44.method255(var4, 10583);
                if (class119.method718(class188.method1191((byte) -39, var5), (byte) 115) || class179.method1097(-89, class188.method1191((byte) -110, var5))) {
                    class78.field1407 = false;
                    class184.field3542 = 0;
                    if (class31.field535 != null) {
                        class57.method305(-115, class31.field535);
                    }
                    class31.field535 = class44.method255(var4, 10583);
                    class185.field3580 = var3;
                    class143.field2574 = class158.field2823;
                    class182.field3514 = class134.field2429;
                    class57.method305(-113, class31.field535);
                    return;
                }
            }
        }
        if (var1 == 1 && (class43.field822 == 1 && class133.field2404 > 2 || class81.method453(false, class133.field2404 - 1))) {
            var1 = 2;
        }
        if (var1 == 1 && class133.field2404 > 0) {
            class43.method249(true, class133.field2404 - 1);
        }
        if (var1 == 2 && class133.field2404 > 0) {
            class113.method698(2);
            return;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIILfb;JLfb;Lfb;)V")
    public static final void method796(int arg0, int arg1, int arg2, int arg3, class52 arg4, long arg5, class52 arg6, class52 arg7) {
        class191 var9 = new class191();
        var9.field3728 = arg4;
        var9.field3711 = arg1 * 128 + 64;
        var9.field3731 = arg2 * 128 + 64;
        var9.field3732 = arg3;
        var9.field3721 = arg5;
        var9.field3716 = arg6;
        var9.field3722 = arg7;
        short var10 = 0;
        class90 var11 = class190.field3704[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1680; var12++) {
                if ((var11.field1686[var12].field2934 & 0x400000L) == 4194304L && var11.field1686[var12].field2951 instanceof class140) {
                    class140 var13 = (class140) var11.field1686[var12].field2951;
                    var13.method870();
                    if (var13.field949 < var10) {
                        var10 = var13.field949;
                    }
                }
            }
        }
        var9.field3726 = -var10;
        if (class190.field3704[arg0][arg1][arg2] == null) {
            class190.field3704[arg0][arg1][arg2] = new class90(arg0, arg1, arg2);
        }
        class190.field3704[arg0][arg1][arg2].field1681 = var9;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(III)V")
    private class131(int arg0, int arg1, int arg2) {
    }
}
