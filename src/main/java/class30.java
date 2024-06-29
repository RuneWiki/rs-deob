import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class30 {

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field423 = 0;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field424 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "Lok;")
    public static class160 field430;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "Ljm;")
    public static class251 field425;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZ)V", line = 19)
    public static final void method191(int arg0, boolean arg1) {
        class185.field2978[1] = (float) class200.method1465(arg0 >> 8, 255) / 255.0F;
        class185.field2978[0] = (float) class200.method1465(255, arg0 >> 16) / 255.0F;
        field426++;
        class185.field2978[2] = (float) class200.method1465(255, arg0) / 255.0F;
        class114.method793(3, 0);
        if (arg1) {
            field430 = (class160) null;
        }
        class114.method793(4, 0);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V", line = 40)
    public static final void method192(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class36.field483[var1] = false;
        }
        class282.field4461 = 5;
        class314.field4889 = -1;
        class286.field4522 = 0;
        class93.field1442 = 0;
        field427++;
        class160.field2464 = -1;
        if (arg0 != 16711680) {
            field428 = 69;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)Lel;", line = 62)
    public static final class128 method193(boolean arg0) {
        field432++;
        if (!arg0) {
            field423 = -35;
        }
        try {
            return (class128) Class.forName("bd").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class135();
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V", line = 82)
    public static void method194(byte arg0) {
        field430 = null;
        int var1 = 70 % ((arg0 - 34) / 51);
        field425 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILjava/lang/String;)V", line = 93)
    public static final void method195(int arg0, int arg1, String arg2) {
        field429++;
        boolean var3 = false;
        String var4 = class329.method2273(true, class245.method1735(-1, arg2));
        for (int var5 = 0; var5 < class24.field350; var5++) {
            class320 var6 = class100.field1523[class103.field1575[var5]];
            if (var6 != null && var6.field5003 != null && var6.field5003.equalsIgnoreCase(var4)) {
                if (arg0 == 1) {
                    class21.field313.method1541(70, 150);
                    class238.field3768++;
                    class21.field313.method1344((byte) 74, 0);
                    class21.field313.method1359(arg1 - 32512, class103.field1575[var5]);
                } else if (arg0 == 4) {
                    class291.field4578++;
                    class21.field313.method1541(74, 180);
                    class21.field313.method1401(class103.field1575[var5], -16384);
                    class21.field313.method1370(-102, 0);
                } else if (arg0 == 5) {
                    class175.field2816++;
                    class21.field313.method1541(-80, 207);
                    class21.field313.method1344((byte) 74, 0);
                    class21.field313.method1359(-110, class103.field1575[var5]);
                } else if (arg0 == 6) {
                    class21.field313.method1541(46, 43);
                    class21.field313.method1361(class103.field1575[var5], -488903776);
                    class281.field4423++;
                    class21.field313.method1370(-84, 0);
                } else if (arg0 == 7) {
                    class21.field313.method1541(110, 60);
                    class21.field313.method1401(class103.field1575[var5], -16384);
                    class21.field313.method1344((byte) 74, 0);
                    class209.field3425++;
                }
                var3 = true;
                break;
            }
        }
        if (arg1 != 32387) {
            method195(86, -65, (String) null);
        }
        if (!var3) {
            class245.method1740((byte) -113, 0, "", class86.field1310 + var4);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIII)I", line = 174)
    public static final int method196(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field431++;
        if (class249.field3963) {
            class249.field3963 = false;
            arg1 = 1000000;
        }
        class21 var5 = class274.field4345[arg3][arg2];
        float var6 = var5.field327;
        float var7 = ((float) arg4 * 0.1F + 0.7F) * var5.field322;
        int var8 = var5.field324;
        int var9 = var5.field307;
        float var10 = var5.field312;
        int var11 = var5.field321;
        if (!class238.field3766) {
            var11 = 0;
        }
        float var12 = var5.field317;
        float var13 = var5.field320;
        float var14 = var5.field325;
        class156 var15 = var5.field315;
        if (class191.field3089 != var8 || class276.field4367 != var7 || class191.field3095 != var6 || class91.field1388 != var10 || class115.field1729 != var9 || class191.field3086 != var11 || class119.field1825 != var15 || class118.field1794 != var14 || class10.field110 != var13 || class230.field3664 != var12) {
            class119.field1835 = class149.field2233;
            class29.field420 = class284.field4489;
            class245.field3894 = class36.field478;
            class229.field3629 = class50.field693;
            class250.field3980 = class277.field4382;
            class242.field3849 = class121.field1849;
            class254.field4038 = class35.field470;
            class12.field143 = class313.field4867;
            class126.field1882 = class121.field1837;
            class23.field334 = class333.field5169;
            if (class102.field1557 == null || class12.field143 == class102.field1557) {
                class102.field1557 = new class156();
            }
            class191.field3086 = var11;
            class118.field1794 = var14;
            class10.field110 = var13;
            class191.field3095 = var6;
            class115.field1729 = var9;
            class91.field1388 = var10;
            class191.field3089 = var8;
            class276.field4367 = var7;
            class230.field3664 = var12;
            class121.field1840 = 0;
            class119.field1825 = var15;
        }
        if (arg0 <= 18) {
            return -13;
        }
        if (class121.field1840 < 65536) {
            class121.field1840 += arg1 * 250;
            if (class121.field1840 >= 65536) {
                class12.field143 = null;
                class36.field478 = class191.field3089;
                class35.field470 = class118.field1794;
                class149.field2233 = class91.field1388;
                class50.field693 = class191.field3086;
                class121.field1840 = 65536;
                class313.field4867 = class119.field1825;
                class121.field1849 = class115.field1729;
                class277.field4382 = class276.field4367;
                class284.field4489 = class230.field3664;
                class121.field1837 = class191.field3095;
                class333.field5169 = class10.field110;
            } else {
                int var16 = 65536 - class121.field1840 >> 8;
                int var17 = class121.field1840 >> 8;
                class36.field478 = ((class245.field3894 & 0xFF00FF) * var16 + (class191.field3089 & 0xFF00FF) * var17 & 0xFF00FF00) + ((class245.field3894 & 0xFF00) * var16 + (class191.field3089 & 0xFF00) * var17 & 0xFF0000) >> 8;
                class50.field693 = class229.field3629 * var16 + class191.field3086 * var17 >> 8;
                class121.field1849 = ((class242.field3849 & 0xFF00FF) * var16 + (class115.field1729 & 0xFF00FF) * var17 & 0xFF00FF00) + ((class242.field3849 & 0xFF00) * var16 + (class115.field1729 & 0xFF00) * var17 & 0xFF0000) >> 8;
                float var18 = (float) (65536 - class121.field1840) / 65536.0F;
                float var19 = (float) class121.field1840 / 65536.0F;
                class333.field5169 = class23.field334 * var18 + class10.field110 * var19;
                class284.field4489 = class29.field420 * var18 + class230.field3664 * var19;
                class35.field470 = class254.field4038 * var18 + class118.field1794 * var19;
                class149.field2233 = class91.field1388 * var19 + class119.field1835 * var18;
                class121.field1837 = class191.field3095 * var19 + class126.field1882 * var18;
                class277.field4382 = class276.field4367 * var19 + class250.field3980 * var18;
                if (class12.field143 != class119.field1825) {
                    if (class12.field143 == null || class119.field1825 == null) {
                        class313.field4867 = null;
                    } else {
                        class313.field4867 = class102.field1557.method1085(class12.field143, class119.field1825, (float) class121.field1840 / 65536.0F);
                    }
                }
            }
        }
        return class121.field1849;
    }
}
