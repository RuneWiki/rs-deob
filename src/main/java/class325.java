import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class325 extends RuntimeException {

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Ljava/lang/Throwable;")
    public Throwable field5075;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Ljava/lang/String;")
    public String field5073;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field5068 = 0;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5077 = "Starting 3d Library";

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "[I")
    public static int[] field5076 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field5072 = 128;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Lpl;")
    public static class206 field5071 = new class206();

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "Z")
    public static boolean field5079;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "[[[B")
    public static byte[][][] field5074;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([Lok;IB)V", line = 6)
    public static final void method2259(class160[] arg0, int arg1, byte arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class160 var4 = arg0[var3];
            if (var4 != null && var4.field2544 == arg1 && (!var4.field2551 || !client.method1896(var4))) {
                if (var4.field2608 == 0) {
                    if (!var4.field2551 && client.method1896(var4) && class102.field1564 != var4) {
                        continue;
                    }
                    method2259(arg0, var4.field2446, (byte) -128);
                    if (var4.field2459 != null) {
                        method2259(var4.field2459, var4.field2446, (byte) -74);
                    }
                    class224 var5 = (class224) class176.field2870.method1743((long) var4.field2446, (byte) 119);
                    if (var5 != null) {
                        class173.method1181((byte) -110, var5.field3564);
                    }
                }
                if (var4.field2608 == 6) {
                    if (var4.field2596 != -1 || var4.field2622 != -1) {
                        boolean var6 = class261.method1868(true, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field2622;
                        } else {
                            var7 = var4.field2596;
                        }
                        if (var7 != -1) {
                            class80 var8 = class37.method236(var7, 20254);
                            if (var8 != null) {
                                var4.field2600 += class274.field4353;
                                while (var4.field2600 > var8.field1223[var4.field2605]) {
                                    var4.field2600 -= var8.field1223[var4.field2605];
                                    var4.field2605++;
                                    if (var4.field2605 >= var8.field1209.length) {
                                        var4.field2605 -= var8.field1196;
                                        if (var4.field2605 < 0 || var8.field1209.length <= var4.field2605) {
                                            var4.field2605 = 0;
                                        }
                                    }
                                    var4.field2618 = var4.field2605 + 1;
                                    if (var4.field2618 >= var8.field1209.length) {
                                        var4.field2618 -= var8.field1196;
                                        if (var4.field2618 < 0 || var8.field1209.length <= var4.field2618) {
                                            var4.field2618 = -1;
                                        }
                                    }
                                    class219.method1600(var4, 109);
                                }
                            }
                        }
                    }
                    if (var4.field2566 != 0 && !var4.field2551) {
                        int var9 = var4.field2566 >> 16;
                        int var10 = class274.field4353 * var9;
                        int var11 = var4.field2566 << 16 >> 16;
                        var4.field2586 = var4.field2586 + var10 & 0x7FF;
                        int var12 = class274.field4353 * var11;
                        var4.field2582 = var4.field2582 + var12 & 0x7FF;
                        class219.method1600(var4, 116);
                    }
                }
            }
        }
        if (arg2 >= -39) {
            field5072 = 44;
        }
        field5070++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIII)V", line = 121)
    public static final void method2260(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -12886) {
            method2261(-23);
        }
        field5078++;
        for (int var5 = 0; var5 < class140.field2086; var5++) {
            if (class192.field3135[var5] + class283.field4466[var5] > arg2 && (arg0 + arg2) > class192.field3135[var5] && arg4 < class48.field647[var5] + class210.field3433[var5] && arg3 + arg4 > class48.field647[var5]) {
                class284.field4485[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 154)
    public class325(Throwable arg0, String arg1) {
        this.field5075 = arg0;
        this.field5073 = arg1;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 177)
    public static void method2261(int arg0) {
        field5074 = (byte[][][]) null;
        int var1 = 76 % ((arg0 + 35) / 38);
        field5071 = null;
        field5076 = null;
        field5077 = null;
    }
}
