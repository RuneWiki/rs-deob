import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class66 {

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "Lwm;")
    public static class152 field994 = class157.method1048(" s(West d-Bconnect-B)3", 127);

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "Lek;")
    public static class183 field989 = new class183();

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "Lhh;")
    public static class209 field997;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "[I")
    public static int[] field995;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "[Lbg;")
    public static class203[] field996;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V", line = 12)
    public static final void method418(byte arg0) {
        if (arg0 >= -121) {
            field995 = (int[]) null;
        }
        field991++;
        try {
            if (class89.field1252 == 1) {
                int var1 = class200.field3227.method2067(-11154);
                if (var1 > 0 && class200.field3227.method2054(86)) {
                    int var2 = var1 - class45.field717;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class200.field3227.method2059(var2, false);
                    return;
                }
                class200.field3227.method2072(-123);
                class200.field3227.method2064(-111);
                class240.field3933 = null;
                if (class65.field986 == null) {
                    class89.field1252 = 0;
                } else {
                    class89.field1252 = 2;
                }
                class150.field2330 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class200.field3227.method2072(-126);
            class89.field1252 = 0;
            class240.field3933 = null;
            class150.field2330 = null;
            class65.field986 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V", line = 58)
    public static void method419(byte arg0) {
        field996 = null;
        field994 = null;
        field997 = null;
        field989 = null;
        if (arg0 == 95) {
            field995 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B[BII)Z", line = 90)
    public static final boolean method420(byte arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 > -17) {
            return false;
        }
        class291 var4 = new class291(arg1);
        field990++;
        int var5 = -1;
        boolean var6 = true;
        label72: while (true) {
            int var7 = var4.method1981(-122);
            if (var7 == 0) {
                return var6;
            }
            boolean var8 = false;
            var5 += var7;
            int var9 = 0;
            while (true) {
                int var13;
                class270 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var8) {
                                        int var17 = var4.method2013((byte) -20);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var4.method2011(-58);
                                    }
                                    int var10 = var4.method2013((byte) -20);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var9 += var10 - 1;
                                    int var11 = var9 & 0x3F;
                                    int var12 = (var9 & 0xFC9) >> 6;
                                    var13 = var4.method2011(-120) >> 2;
                                    var14 = arg2 + var12;
                                    var15 = arg3 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class242.method1656(var5, true);
                } while (var13 == 22 && !class199.field3209 && var16.field4556 == 0 && var16.field4548 != 1 && !var16.field4554);
                var8 = true;
                if (!var16.method1849(-41)) {
                    var6 = false;
                    class180.field2868++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIII)I", line = 176)
    public static final int method421(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field988++;
        int var5 = arg0 & 0xF;
        if (arg1 == -15) {
            int var6 = var5 >= 8 ? arg4 : arg2;
            int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg2 : arg3) : arg4;
            return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
        } else {
            return 65;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BI)[F", line = 193)
    public static final float[] method422(byte arg0, int arg1) {
        field987++;
        if (arg0 != 93) {
            method422((byte) -39, -95);
        }
        float var2 = 0.58823526F;
        float var3 = class14.method85() + class14.method89();
        int var4 = class14.method94();
        float var5 = (float) (var4 & 0xFF) / 255.0F;
        float var6 = (float) (var4 >> 8 & 0xFF) / 255.0F;
        float var7 = (float) (var4 >> 16 & 0xFF) / 255.0F;
        class86.field1202[2] = var2 * var5 * ((float) class34.method251(255, arg1) / 255.0F) * var3;
        class86.field1202[3] = 1.0F;
        class86.field1202[0] = var3 * (float) class34.method251(255, arg1 >> 16) / 255.0F * var7 * var2;
        class86.field1202[1] = var6 * ((float) (class34.method251(arg1, 65336) >> 8) / 255.0F) * var2 * var3;
        return class86.field1202;
    }
}
