import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class254 extends class282 {

    @OriginalMember(owner = "client!md", name = "O", descriptor = "Lmb;")
    public static class105 field4426 = class73.method537((byte) -90);

    @OriginalMember(owner = "client!md", name = "W", descriptor = "Ljf;")
    public static class229 field4434 = class212.method1457((byte) 120, "compass");

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public int field4425;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    private int field4428;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "Ljf;")
    public class229 field4424;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lcb;IIIIIIZ)V", line = 10)
    public static final void method1803(class285 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field4904.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field4904[var9] - class331.field5639;
            int var11 = arg0.field4890[var9] - class42.field754;
            int var12 = arg0.field4899[var9] - class61.field1045;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field4888 != null) {
                class285.field4896[var9] = var13;
                class285.field4893[var9] = var16;
                class285.field4906[var9] = var17;
            }
            class285.field4895[var9] = (var13 << 9) / var17 + class227.field3909;
            class285.field4901[var9] = (var16 << 9) / var17 + class227.field3895;
        }
        class227.field3900 = 0;
        int var19 = arg0.field4900.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field4900[var20];
            int var22 = arg0.field4897[var20];
            int var23 = arg0.field4887[var20];
            int var24 = class285.field4895[var21];
            int var25 = class285.field4895[var22];
            int var26 = class285.field4895[var23];
            int var27 = class285.field4901[var21];
            int var28 = class285.field4901[var22];
            int var29 = class285.field4901[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class10.field115 && class290.method2018(class227.field3909 + class115.field2075, class29.field508 + class227.field3895, var27, var28, var29, var24, var25, var26)) {
                    class270.field4630 = arg5;
                    class273.field4678 = arg6;
                }
                if (!class108.field1900 && !arg7) {
                    class227.field3897 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class227.field3912 || var25 > class227.field3912 || var26 > class227.field3912) {
                        class227.field3897 = true;
                    }
                    if (arg0.field4888 == null || arg0.field4888[var20] == -1) {
                        if (arg0.field4903[var20] != 12345678) {
                            class227.method1579(var27, var28, var29, var24, var25, var26, arg0.field4903[var20], arg0.field4894[var20], arg0.field4886[var20]);
                        }
                    } else if (!class38.field713) {
                        int var30 = class227.field3904.method1509((byte) 126, arg0.field4888[var20]);
                        class227.method1579(var27, var28, var29, var24, var25, var26, class70.method519(var30, arg0.field4903[var20]), class70.method519(var30, arg0.field4894[var20]), class70.method519(var30, arg0.field4886[var20]));
                    } else if (arg0.field4885) {
                        class227.method1599(var27, var28, var29, var24, var25, var26, arg0.field4903[var20], arg0.field4894[var20], arg0.field4886[var20], class285.field4896[0], class285.field4896[1], class285.field4896[3], class285.field4893[0], class285.field4893[1], class285.field4893[3], class285.field4906[0], class285.field4906[1], class285.field4906[3], arg0.field4888[var20]);
                    } else {
                        class227.method1599(var27, var28, var29, var24, var25, var26, arg0.field4903[var20], arg0.field4894[var20], arg0.field4886[var20], class285.field4896[var21], class285.field4896[var22], class285.field4896[var23], class285.field4893[var21], class285.field4893[var22], class285.field4893[var23], class285.field4906[var21], class285.field4906[var22], class285.field4906[var23], arg0.field4888[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(B)V", line = 122)
    public static void method1804(byte arg0) {
        field4426 = null;
        if (arg0 <= -10) {
            field4434 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lkh;B)V", line = 137)
    public final void method1805(class14 arg0, byte arg1) {
        field4433++;
        while (true) {
            int var3 = arg0.method93(false);
            if (var3 == 0) {
                if (arg1 != -36) {
                    this.field4424 = (class229) null;
                }
                return;
            }
            this.method1807(var3, (byte) 56, arg0);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BZ)V", line = 160)
    public static final void method1806(byte arg0, boolean arg1) {
        if (arg0 >= -20) {
            return;
        }
        field4429++;
        for (class165 var2 = (class165) class83.field1589.method2078(-106); var2 != null; var2 = (class165) class83.field1589.method2080(5)) {
            if (var2.field2834 != null) {
                class104.field1816.method613(var2.field2834);
                var2.field2834 = null;
            }
            if (var2.field2820 != null) {
                class104.field1816.method613(var2.field2820);
                var2.field2820 = null;
            }
            var2.method1747((byte) -73);
        }
        if (!arg1) {
            return;
        }
        for (class165 var3 = (class165) class125.field2203.method2078(-113); var3 != null; var3 = (class165) class125.field2203.method2080(5)) {
            if (var3.field2834 != null) {
                class104.field1816.method613(var3.field2834);
                var3.field2834 = null;
            }
            var3.method1747((byte) -46);
        }
        for (class165 var4 = (class165) class115.field2069.method1884((byte) -71); var4 != null; var4 = (class165) class115.field2069.method1886(-123)) {
            if (var4.field2834 != null) {
                class104.field1816.method613(var4.field2834);
                var4.field2834 = null;
            }
            var4.method1747((byte) -51);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IBLkh;)V", line = 237)
    private final void method1807(int arg0, byte arg1, class14 arg2) {
        if (arg1 != 56) {
            method1804((byte) -80);
        }
        if (arg0 == 1) {
            this.field4428 = arg2.method93(false);
        } else if (arg0 == 2) {
            this.field4425 = arg2.method128((byte) 4);
        } else if (arg0 == 5) {
            this.field4424 = arg2.method105((byte) 112);
        }
        field4431++;
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V", line = 262)
    public static final void method1808(int arg0) {
        class220.method1520((byte) -5);
        field4427++;
        class232.method1666(-95);
        class311.method2105(arg0);
        class73.method536((byte) 113);
        class292.method2027(arg0 - 1);
        class293.method2032(arg0 ^ 0x7531);
        class19.method182((byte) 125);
        class321.method2164((byte) 96);
        class275.method1930((byte) 57);
        class106.method712(arg0 + 30418);
        class320.method2153((byte) 41);
        class83.method591(-15);
        class118.method843(-6477);
        class330.method2249(arg0 - 113);
        class29.method250(0);
        class42.method362(arg0 - 203338906);
        if (!class108.field1900) {
            ((class275) class227.field3904).method1927(81);
        }
        class34.field651.method644(1);
        class306.field5184.method1269((byte) -82);
        class42.field747.method1269((byte) -82);
        class50.field886.method1269((byte) -82);
        class289.field4945.method1269((byte) -82);
        class20.field332.method1269((byte) -82);
        class259.field4506.method1269((byte) -82);
        class180.field3123.method1269((byte) -82);
        class269.field4616.method1269((byte) -82);
        class33.field644.method1269((byte) -82);
        class29.field505.method1269((byte) -82);
        class293.field5023.method1269((byte) -82);
        class122.field2165.method226((byte) -95);
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)Z", line = 309)
    public final boolean method1809(int arg0) {
        field4430++;
        if (arg0 >= -30) {
            this.field4425 = -3;
        }
        return this.field4428 == 115;
    }
}
