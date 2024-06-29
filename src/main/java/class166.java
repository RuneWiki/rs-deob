import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class166 extends class25 {

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "[B")
    public byte[] field2908;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Lcd;")
    public static class64 field2903 = class44.method335((byte) 71, "Nehmen");

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "Lcd;")
    public static class64 field2907 = class44.method335((byte) 71, "rot:");

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZLfk;III)V", line = 14)
    public static final void method1183(boolean arg0, class41 arg1, int arg2, int arg3, int arg4) {
        field2906++;
        if (class139.field2472 == arg1 || class220.field3736 >= 400) {
            return;
        }
        class64 var10;
        if (arg1.field650 == 0) {
            boolean var5 = true;
            if (class139.field2472.field644 != -1 && arg1.field644 != -1) {
                int var6 = class139.field2472.field659 > arg1.field659 ? class139.field2472.field659 : arg1.field659;
                int var7 = arg1.field644 > class139.field2472.field644 ? class139.field2472.field644 : arg1.field644;
                int var8 = var6 * 10 / 100 + var7 + 5;
                int var9 = class139.field2472.field659 - arg1.field659;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var9 > var8) {
                    var5 = false;
                }
            }
            if (arg1.field651 <= arg1.field659) {
                var10 = class104.method768(new class64[] { arg1.method323(-1), class240.field4102, class31.field523, class37.field598, var5 ? class236.method1687(class139.field2472.field659, 30404, arg1.field659) : class172.field2966, class310.method2149(arg1.field659, (byte) -8), class297.field5110 }, !arg0);
            } else {
                var10 = class104.method768(new class64[] { arg1.method323(-1), class240.field4102, class31.field523, class37.field598, var5 ? class236.method1687(class139.field2472.field659, 30404, arg1.field659) : class172.field2966, class310.method2149(arg1.field659, (byte) 102), class158.field2778, class310.method2149(arg1.field651 - arg1.field659, (byte) 89), class259.field4469 }, !arg0);
            }
        } else {
            var10 = class104.method768(new class64[] { arg1.method323(-1), class240.field4102, class101.field1819, class37.field598, class310.method2149(arg1.field650, (byte) -88), class259.field4469 }, false);
        }
        if (class77.field1453 == 1) {
            class80.field1482++;
            class248.method1792(class104.method768(new class64[] { class32.field534, class229.field3884, var10 }, !arg0), arg3, arg4, (byte) -15, (long) arg2, (short) 37, class213.field3588);
        } else if (!class42.field690) {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (class84.field1557[var11] != null) {
                    short var12 = 0;
                    class108.field1990++;
                    if (class172.field2971 == 0 && class84.field1557[var11].method515(-64, class106.field1959)) {
                        if (arg1.field659 > class139.field2472.field659) {
                            var12 = 2000;
                        }
                        if (class139.field2472.field670 != 0 && arg1.field670 != 0) {
                            if (class139.field2472.field670 == arg1.field670) {
                                var12 = 2000;
                            } else {
                                var12 = 0;
                            }
                        }
                    } else if (class262.field4498[var11]) {
                        var12 = 2000;
                    }
                    boolean var13 = false;
                    short var14 = class289.field4945[var11];
                    short var15 = (short) (var12 + var14);
                    class248.method1792(class104.method768(new class64[] { class172.field2966, var10 }, false), arg3, arg4, (byte) -57, (long) arg2, var15, class84.field1557[var11]);
                }
            }
        } else if ((class164.field2883 & 0x8) == 8) {
            class248.method1792(class104.method768(new class64[] { class103.field1891, class229.field3884, var10 }, false), arg3, arg4, (byte) -117, (long) arg2, (short) 36, class43.field708);
            class259.field4470++;
        }
        if (!arg0) {
            field2907 = (class64) null;
        }
        for (int var16 = 0; var16 < class220.field3736; var16++) {
            if (class289.field4934[var16] == 3) {
                class69.field1334[var16] = class104.method768(new class64[] { class172.field2966, var10 }, false);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIZ)V", line = 159)
    public static final void method1184(int arg0, int arg1, boolean arg2) {
        if (class280.field4822 > 0) {
            class196.method1377((byte) -70, class280.field4822);
            class280.field4822 = 0;
        }
        short var3 = 256;
        int var4 = 0;
        field2902++;
        int var5 = 0;
        int var6 = class210.field3537 * arg1;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class185.field3171[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class198.field3386[var4++];
                int var11 = class210.field3529[arg0 + var6++];
                if (var10 == 0) {
                    class265.field4566.field2274[var5++] = var11;
                } else {
                    int var12 = var10 + 18;
                    int var13 = 256 - var10 - 18;
                    int var14 = class113.field2090[var10];
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    class265.field4566.field2274[var5++] = class224.method1614(-16711936, var12 * class224.method1614(16711935, var14) + (var13 * class224.method1614(var11, 16711935))) + class224.method1614(class224.method1614(var14, 65280) * var12 + (var13 * class224.method1614(65280, var11)), 16711680) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class265.field4566.field2274[var5++] = class210.field3529[var6++ + arg0];
            }
            var6 += class210.field3537 - 128;
        }
        if (arg2) {
            field2903 = (class64) null;
        }
        class265.field4566.method314(arg0, arg1);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V", line = 240)
    public static void method1185(byte arg0) {
        field2907 = null;
        if (arg0 >= -114) {
            field2907 = (class64) null;
        }
        field2903 = null;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "([B)V", line = 254)
    public class166(byte[] arg0) {
        this.field2908 = arg0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)Lie;", line = 271)
    public static final class80 method1186(int arg0, int arg1) {
        class80 var2 = (class80) class43.field706.method329((long) arg1, (byte) -63);
        field2904++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class102.field1843.method1580(arg0, class288.method1987((byte) -77, arg1), class26.method238(arg1, (byte) -103));
        class80 var4 = new class80();
        if (var3 != null) {
            var4.method625(new class13(var3), (byte) -41);
        }
        class43.field706.method331((long) arg1, var4, (byte) 73);
        return var4;
    }
}
