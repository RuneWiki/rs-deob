import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class154 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Lml;")
    public static class14 field2132 = null;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field2133 = 0;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field2138 = 0;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2135 = "Mechscape is loading - please wait...";

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "J")
    public long field2141;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Lhb;")
    public class154 field2137;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "Lhb;")
    public class154 field2144;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "[Lbf;")
    public static class108[] field2140;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)Z")
    public final boolean method961(int arg0) {
        field2136++;
        if (this.field2137 == null) {
            return false;
        } else {
            if (arg0 > -109) {
                field2132 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public final void method962(int arg0) {
        field2145++;
        if (this.field2137 == null) {
            return;
        }
        this.field2137.field2144 = this.field2144;
        this.field2144.field2137 = this.field2137;
        this.field2137 = null;
        if (arg0 != 128) {
            method964((byte) 47, (class104) null);
        }
        this.field2144 = null;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public static void method963(int arg0) {
        field2135 = null;
        if (arg0 < -69) {
            field2140 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLpj;)V")
    public static final void method964(byte arg0, class104 arg1) {
        field2142++;
        if (arg0 != -24) {
            method966(56, 87);
        }
        class156.field2156 = arg1;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Ltl;")
    public static final class255 method965(int arg0, int arg1) {
        field2134++;
        class255 var2 = (class255) class93.field1359.method950((long) arg0, (byte) -45);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class139.field1931.method2050(118, arg1, arg0);
        class255 var4 = new class255();
        if (var3 != null) {
            var4.method1662(new class215(var3), arg1 - 4);
        }
        var4.method1661(-4);
        class93.field1359.method942((long) arg0, (byte) 49, var4);
        return var4;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)V")
    public static final void method966(int arg0, int arg1) {
        short var2 = 256;
        field2143++;
        if (arg1 > var2) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class10.field139 += arg1 * 128;
        if (class261.field4207.length < class10.field139) {
            class10.field139 -= class261.field4207.length;
            int var3 = (int) (Math.random() * 12.0D);
            class191.method1205(65, class115.field1667[var3]);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var26 = class129.field1795[var4 + var5] - class261.field4207[class10.field139 + var4 & class261.field4207.length + -1] * arg1 / 6;
            if (var26 < 0) {
                var26 = 0;
            }
            class129.field1795[var4++] = var26;
        }
        for (int var8 = var2 - arg1; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class129.field1795[var23 + var24] = 255;
                } else {
                    class129.field1795[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < var2 - arg1; var9++) {
            class96.field1390[var9] = class96.field1390[var9 + arg1];
        }
        int var10 = var2 - arg1;
        if (arg0 <= 58) {
            field2132 = null;
        }
        while (var2 > var10) {
            class96.field1390[var10] = (int) (Math.sin((double) class277.field4406 / 14.0D) * 16.0D + Math.sin((double) class277.field4406 / 15.0D) * 14.0D + Math.sin((double) class277.field4406 / 16.0D) * 12.0D);
            class277.field4406++;
            var10++;
        }
        class308.field4947 += arg1;
        int var11 = ((class35.field533 & 0x1) + arg1) / 2;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class308.field4947; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class129.field1795[var21 + (var22 << 7)] = 192;
        }
        class308.field4947 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = 0;
            int var19 = var13 * 128;
            for (int var20 = -var11; var20 < 128; var20++) {
                if (var11 + var20 < 128) {
                    var18 += class129.field1795[var19 + var20 + var11];
                }
                if ((var20 - var11 - 1) >= 0) {
                    var18 -= class129.field1795[var19 + var20 - var11 - 1];
                }
                if (var20 >= 0) {
                    class112.field1605[var19 + var20] = var18 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var2 > (var11 + var16)) {
                    var15 += class112.field1605[var14 + (var11 * 128) + var17];
                }
                if (var16 - var11 - 1 >= 0) {
                    var15 -= class112.field1605[var14 + var17 - ((var11 + 1) * 128)];
                }
                if (var16 >= 0) {
                    class129.field1795[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }
}
