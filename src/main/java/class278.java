import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class278 extends class120 {

    @OriginalMember(owner = "client!od", name = "db", descriptor = "I")
    private int field4556 = 4096;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "[Lok;")
    public static class41[] field4547 = new class41[200];

    @OriginalMember(owner = "client!od", name = "gb", descriptor = "I")
    public static int field4559 = -1;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!od", name = "fb", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!od", name = "hb", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "Ldm;")
    public static class182 field4550;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "Lpa;")
    public static class294 field4546;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "[I")
    public static int[] field4549;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "[[[I")
    public static int[][][] field4548;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V", line = 5)
    public static void method1962(int arg0) {
        if (arg0 != -2916) {
            method1966(33);
        }
        field4547 = null;
        field4550 = null;
        field4548 = (int[][][]) null;
        field4549 = null;
        field4546 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Llb;II)V", line = 26)
    public final void method30(class112 arg0, int arg1, int arg2) {
        if (~arg2 == arg1) {
            this.field4556 = arg0.method759((byte) -94);
        }
        field4554++;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(II)I", line = 45)
    public static final int method1963(int arg0, int arg1) {
        if (arg1 != -1691001909) {
            method1965(-26, (class302[]) null, -120);
        }
        field4553++;
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([Laf;I[Lka;[Lka;Lmh;[Lka;[Lka;)V", line = 56)
    public static final void method1964(class72[] arg0, int arg1, class279[] arg2, class279[] arg3, class65 arg4, class279[] arg5, class279[] arg6) {
        class249.field3966 = arg3;
        if (arg1 != 3066) {
            field4546 = (class294) null;
        }
        class107.field1515 = arg2;
        class139.field2144 = arg0;
        class235.field3770 = arg5;
        class317.field5358 = arg4;
        class10.field131 = arg6;
        field4552++;
        class88.field1284.method1499(-3868);
        int var7 = class317.field5358.method476(class186.field3030, (byte) 120);
        int[] var8 = class317.field5358.method457(-93, var7);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class88.field1284.method1503(class53.method362(new class112(class317.field5358.method454(var7, 0, var8[var9])), 1), (byte) -115);
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 86)
    public class278() {
        super(1, true);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I[Lbc;I)V", line = 99)
    public static final void method1965(int arg0, class302[] arg1, int arg2) {
        field4551++;
        for (int var3 = arg0; var3 < arg1.length; var3++) {
            class302 var4 = arg1[var3];
            if (var4 != null && var4.field4999 == arg2 && (!var4.field4964 || !client.method2117(var4))) {
                if (var4.field4951 == 0) {
                    if (!var4.field4964 && client.method2117(var4) && class260.field4147 != var4) {
                        continue;
                    }
                    method1965(0, arg1, var4.field4910);
                    if (var4.field4988 != null) {
                        method1965(0, var4.field4988, var4.field4910);
                    }
                    class187 var5 = (class187) class113.field1658.method617((long) var4.field4910, false);
                    if (var5 != null) {
                        class294.method2035(~arg0, var5.field3052);
                    }
                }
                if (var4.field4951 == 6) {
                    if (var4.field4915 != -1 || var4.field5014 != -1) {
                        boolean var6 = class64.method446(122, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field5014;
                        } else {
                            var7 = var4.field4915;
                        }
                        if (var7 != -1) {
                            class205 var8 = class285.method2000(var7, 4442);
                            if (var8 != null) {
                                var4.field4914 += class140.field2163;
                                while (var8.field3331[var4.field4994] < var4.field4914) {
                                    var4.field4914 -= var8.field3331[var4.field4994];
                                    var4.field4994++;
                                    if (var8.field3323.length <= var4.field4994) {
                                        var4.field4994 -= var8.field3306;
                                        if (var4.field4994 < 0 || var4.field4994 >= var8.field3323.length) {
                                            var4.field4994 = 0;
                                        }
                                    }
                                    class18.method91(arg0 + 28515, var4);
                                }
                            }
                        }
                    }
                    if (var4.field4891 != 0 && !var4.field4964) {
                        int var9 = var4.field4891 >> 16;
                        int var10 = var4.field4891 << 16 >> 16;
                        int var11 = class140.field2163 * var10;
                        var4.field5009 = var4.field5009 + var11 & 0x7FF;
                        int var12 = class140.field2163 * var9;
                        var4.field4889 = var4.field4889 + var12 & 0x7FF;
                        class18.method91(28515, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V", line = 208)
    public static final void method1966(int arg0) {
        class285.field4642.method844(-4, 217);
        field4555++;
        class38.field584++;
        class285.field4642.method797(class33.method228((byte) 119), -22096);
        class285.field4642.method778(class188.field3055, (byte) -4);
        if (arg0 < 37) {
            method1965(-19, (class302[]) null, -127);
        }
        class285.field4642.method778(class14.field182, (byte) -4);
    }

    @OriginalMember(owner = "client!od", name = "h", descriptor = "(I)[Lka;", line = 226)
    public static final class279[] method1967(int arg0) {
        class279[] var1 = new class279[class181.field2940];
        int var2 = 0;
        if (arg0 <= 29) {
            field4559 = 79;
        }
        while (var2 < class181.field2940) {
            var1[var2] = new class279(class204.field3299, class205.field3318, class95.field1412[var2], class314.field5288[var2], class69.field1040[var2], class173.field2812[var2], class223.field3562[var2], class312.field5263);
            var2++;
        }
        class286.method2005((byte) -9);
        field4560++;
        return var1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I", line = 253)
    public final int[] method14(int arg0, int arg1) {
        field4557++;
        if (arg1 != -14959) {
            field4559 = 57;
        }
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (this.field1775.field1798) {
            int[] var4 = this.method854(0, class27.field410 & arg0 - 1, arg1 ^ 0x6794);
            int[] var5 = this.method854(0, arg0, arg1 ^ 0x6794);
            int[] var6 = this.method854(0, arg0 + 1 & class27.field410, -24059);
            for (int var7 = 0; var7 < class307.field5160; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field4556;
                int var9 = var8 >> 12;
                int var10 = (var5[var7 + 1 & class51.field776] - var5[class51.field776 & var7 - 1]) * this.field4556;
                int var11 = var10 >> 12;
                int var12 = var9 * var9 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }
}
