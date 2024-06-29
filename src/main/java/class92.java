import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class92 {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "[[B")
    public static byte[][] field2204 = new byte[50][];

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field2208 = 0;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lwb;")
    public static class130 field2212 = class26.method212("Stufe)2", -32376);

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2214 = -1;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Lwb;")
    public static class130 field2213 = class26.method212("Lade Sprites )2 ", -32376);

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "J")
    public static long field2215 = 0L;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lwb;")
    public static class130 field2205 = class26.method212("Cabbage", -32376);

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2216 = 0;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "[I")
    public static int[] field2206;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lk;IIIB)[B", line = 12)
    public static final byte[] method684(class60 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2207++;
        if (arg4 != 52) {
            return null;
        }
        long var5 = ((long) arg2 << 32) + ((long) (arg1 * 37 + arg3 & 0xFFFF)) + (long) (arg1 << 16);
        if (class71.field1810 != null) {
            class81 var7 = (class81) class71.field1810.method402(var5, -118);
            if (var7 != null) {
                return var7.field1935;
            }
        }
        byte[] var8 = arg0.method508(arg3, arg4 - 52, arg1);
        if (var8 == null) {
            return null;
        } else {
            if (class71.field1810 != null) {
                class71.field1810.method403(var5, new class81(var8), (byte) -101);
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Z", line = 60)
    public static final boolean method685(int arg0) {
        field2203++;
        long var1 = class90.method668(false);
        int var3 = (int) (var1 - class6.field229);
        if (var3 > 200) {
            var3 = 200;
        }
        class6.field229 = var1;
        class103.field2525 += var3;
        if (class21.field604 == arg0 && class21.field596 == 0 && class129.field3051 == 0 && class79.field1914 == 0) {
            return true;
        } else if (class45.field1207 == null) {
            return false;
        } else {
            try {
                if (class103.field2525 > 30000) {
                    throw new IOException();
                }
                while (class21.field596 < 20 && class79.field1914 > 0) {
                    class99 var4 = (class99) class15.field438.method75(-117);
                    class36 var5 = new class36(4);
                    var5.method330(arg0 - 1, 1);
                    var5.method339((int) var4.field2329, -176481232);
                    class45.field1207.method145(0, 4, 0, var5.field1067);
                    class120.field2927.method80(var4.field2329, var4, -1);
                    class79.field1914--;
                    class21.field596++;
                }
                while (class21.field604 < 20 && class129.field3051 > 0) {
                    class99 var6 = (class99) class106.field2579.method454(10);
                    class36 var7 = new class36(4);
                    var7.method330(-1, 0);
                    var7.method339((int) var6.field2329, -176481232);
                    class45.field1207.method145(arg0, 4, 0, var7.field1067);
                    var6.method239(1);
                    class52.field1356.method80(var6.field2329, var6, -1);
                    class129.field3051--;
                    class21.field604++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class45.field1207.method155((byte) -116);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class103.field2525 = 0;
                    byte var10 = 0;
                    if (class14.field405 == null) {
                        var10 = 8;
                    } else if (class26.field736 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class84.field1980.field1057;
                        if (var9 < var11) {
                            var11 = var9;
                        }
                        class45.field1207.method149(97, var11, class84.field1980.field1057, class84.field1980.field1067);
                        if (class47.field1267 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class84.field1980.field1067[class84.field1980.field1057 + var12] = (byte) class111.method854(class84.field1980.field1067[class84.field1980.field1057 + var12], class47.field1267);
                            }
                        }
                        class84.field1980.field1057 += var11;
                        if (var10 > class84.field1980.field1057) {
                            break;
                        }
                        if (class14.field405 == null) {
                            class84.field1980.field1057 = 0;
                            int var13 = class84.field1980.method365((byte) -127);
                            int var14 = class84.field1980.method351((byte) -116);
                            long var15 = (long) ((var13 << 16) + var14);
                            int var17 = class84.field1980.method365((byte) -125);
                            int var18 = class84.field1980.method361((byte) 100);
                            class99 var19 = (class99) class120.field2927.method78((byte) -21, var15);
                            class6.field223 = true;
                            if (var19 == null) {
                                var19 = (class99) class52.field1356.method78((byte) -21, var15);
                                class6.field223 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class14.field405 = var19;
                            int var20 = var17 == 0 ? 5 : 9;
                            class109.field2644 = new class36(var18 + var20 + class14.field405.field2386);
                            class109.field2644.method330(-1, var17);
                            class109.field2644.method325(-405801808, var18);
                            class84.field1980.field1057 = 0;
                            class26.field736 = 8;
                        } else if (class26.field736 == 0) {
                            if (class84.field1980.field1067[0] == -1) {
                                class26.field736 = 1;
                                class84.field1980.field1057 = 0;
                            } else {
                                class14.field405 = null;
                            }
                        }
                    } else {
                        int var21 = class109.field2644.field1067.length - class14.field405.field2386;
                        int var22 = 512 - class26.field736;
                        if (var21 - class109.field2644.field1057 < var22) {
                            var22 = var21 - class109.field2644.field1057;
                        }
                        if (var9 < var22) {
                            var22 = var9;
                        }
                        class45.field1207.method149(arg0 ^ 0x66, var22, class109.field2644.field1057, class109.field2644.field1067);
                        if (class47.field1267 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                class109.field2644.field1067[class109.field2644.field1057 + var23] = (byte) class111.method854(class109.field2644.field1067[class109.field2644.field1057 + var23], class47.field1267);
                            }
                        }
                        class109.field2644.field1057 += var22;
                        class26.field736 += var22;
                        if (class109.field2644.field1057 == var21) {
                            if (class14.field405.field2329 == 16711935L) {
                                class30.field824 = class109.field2644;
                                for (int var25 = 0; var25 < 256; var25++) {
                                    class75 var26 = class132.field3191[var25];
                                    if (var26 != null) {
                                        class30.field824.field1057 = var25 * 4 + 5;
                                        int var27 = class30.field824.method361((byte) 80);
                                        var26.method588(var27, (byte) -83);
                                    }
                                }
                            } else {
                                class95.field2307.reset();
                                class95.field2307.update(class109.field2644.field1067, 0, var21);
                                int var24 = (int) class95.field2307.getValue();
                                if (class14.field405.field2380 != var24) {
                                    try {
                                        class45.field1207.method148(arg0 + 18);
                                    } catch (Exception var29) {
                                    }
                                    class116.field2877++;
                                    class45.field1207 = null;
                                    class47.field1267 = (byte) (Math.random() * 255.0D + 1.0D);
                                    return false;
                                }
                                class29.field817 = 0;
                                class116.field2877 = 0;
                                class14.field405.field2393.method585(-109, (int) (class14.field405.field2329 & 0xFFFFL), class6.field223, class109.field2644.field1067, (class14.field405.field2329 & 0xFF0000L) == 16711680L);
                            }
                            class14.field405.method714((byte) 52);
                            class109.field2644 = null;
                            class14.field405 = null;
                            class26.field736 = 0;
                            if (class6.field223) {
                                class21.field596--;
                            } else {
                                class21.field604--;
                            }
                        } else {
                            if (class26.field736 != 512) {
                                break;
                            }
                            class26.field736 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var30) {
                try {
                    class45.field1207.method148(arg0 ^ 0xFFFFFF91);
                } catch (Exception var28) {
                }
                class29.field817++;
                class45.field1207 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 354)
    public static void method686(boolean arg0) {
        if (arg0) {
            return;
        }
        field2205 = null;
        field2212 = null;
        field2204 = null;
        field2213 = null;
        field2206 = null;
    }
}
