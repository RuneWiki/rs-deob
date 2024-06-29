import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class149 {

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Lnc;")
    public class86 field2299 = new class86();

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2298 = 0;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2307 = "Loaded fonts";

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "La;")
    public static class49 field2310;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "Lnc;")
    private class86 field2312;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLnc;)V")
    public final void method1007(byte arg0, class86 arg1) {
        if (arg1.field1414 != null) {
            arg1.method693(arg0 + 34);
        }
        arg1.field1407 = this.field2299.field1407;
        arg1.field1414 = this.field2299;
        if (arg0 != 89) {
            this.field2299 = null;
        }
        field2295++;
        arg1.field1414.field1407 = arg1;
        arg1.field1407.field1414 = arg1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)Lnc;")
    public final class86 method1008(byte arg0) {
        field2300++;
        class86 var2 = this.field2312;
        if (this.field2299 == var2) {
            this.field2312 = null;
            return null;
        } else if (arg0 == 88) {
            this.field2312 = var2.field1407;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)Lnc;")
    public final class86 method1009(byte arg0) {
        field2303++;
        int var2 = 102 % ((arg0 - 13) / 52);
        class86 var3 = this.field2312;
        if (this.field2299 == var3) {
            this.field2312 = null;
            return null;
        } else {
            this.field2312 = var3.field1414;
            return var3;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Lnc;")
    public final class86 method1010(int arg0) {
        if (arg0 <= 107) {
            this.method1013(-40, (class86) null);
        }
        field2301++;
        class86 var2 = this.field2299.field1407;
        if (this.field2299 == var2) {
            this.field2312 = null;
            return null;
        } else {
            this.field2312 = var2.field1407;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Lnc;")
    public final class86 method1011(int arg0) {
        field2302++;
        class86 var2 = this.field2299.field1407;
        int var3 = 102 / ((arg0 - 71) / 32);
        if (this.field2299 == var2) {
            return null;
        } else {
            var2.method693(91);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)Lnc;")
    public final class86 method1012(int arg0) {
        class86 var2 = this.field2299.field1414;
        if (arg0 != -1) {
            this.method1008((byte) 17);
        }
        field2296++;
        if (this.field2299 == var2) {
            this.field2312 = null;
            return null;
        } else {
            this.field2312 = var2.field1414;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILnc;)V")
    public final void method1013(int arg0, class86 arg1) {
        field2305++;
        if (arg0 != 312991604) {
            field2307 = null;
        }
        if (arg1.field1414 != null) {
            arg1.method693(88);
        }
        arg1.field1414 = this.field2299.field1414;
        arg1.field1407 = this.field2299;
        arg1.field1414.field1407 = arg1;
        arg1.field1407.field1414 = arg1;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
    public static void method1014(byte arg0) {
        if (arg0 != -50) {
            field2307 = null;
        }
        field2310 = null;
        field2307 = null;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(B)I")
    public static final int method1015(byte arg0) {
        int var1 = 95 % ((-arg0 - 38) / 38);
        field2304++;
        return ((class63.field1011 == 0 ? 0 : 1) << 20) + (class144.field2230 << 17) + ((class56.field862 ? 1 : 0) << 15) + ((class270.field4279 & 0x3) << 11) + ((class155.field2366 ? 1 : 0) << 9) + ((class242.field3760 ? 1 : 0) << 7) + ((class1.field16 ? 1 : 0) << 5) + ((class51.field813 ? 1 : 0) << 4) + ((class121.field1859 ? 1 : 0) << 3) + (class250.field3847 & 0x7) + ((class196.field3083 ? 1 : 0) << 6) + ((class21.field320 ? 1 : 0) << 8) + ((class272.field4299 ? 1 : 0) << 10) + ((class30.field486 ? 1 : 0) << 13) + ((class144.field2246 ? 1 : 0) << 16) - (-((class43.field688 ? 1 : 0) << 19) + -((class259.field3985 == 0 ? 0 : 1) << 21) - (((class253.field3896 == 0 ? 0 : 1) << 22) - -(class240.method1622() << 23)));
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public final void method1016(boolean arg0) {
        while (true) {
            class86 var2 = this.field2299.field1407;
            if (this.field2299 == var2) {
                if (arg0) {
                    this.method1016(false);
                }
                this.field2312 = null;
                field2306++;
                return;
            }
            var2.method693(87);
        }
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
    public static final void method1017(int arg0) {
        field2297++;
        int var1 = class197.field3101.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class197.field3101[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class55.field857; var4++) {
                    if (class221.field3454[var2] == class134.field2097[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class134.field2097[class55.field857] = class221.field3454[var2];
                    var3 = class55.field857++;
                }
                class37 var5 = new class37(class197.field3101[var2]);
                int var6 = 0;
                while (class197.field3101[var2].length > var5.field588 && var6 < 511) {
                    int var7 = var5.method293(-83);
                    int var8 = var3 | var6++ << 6;
                    int var9 = var7 >> 14;
                    int var10 = var7 >> 7 & 0x3F;
                    int var11 = var7 & 0x3F;
                    int var12 = (class221.field3454[var2] >> 8) * 64 + var10 - class118.field1828;
                    int var13 = (class221.field3454[var2] & 0xFF) * 64 + var11 - class129.field2008;
                    class217 var14 = class253.method1689(var5.method293(100), -22396);
                    if (class72.field1144[var8] == null && (var14.field3370 & 0x1) > 0 && class210.field3264 == var9 && var12 >= 0 && (var12 + var14.field3352) < 104 && var13 >= 0 && (var14.field3352 + var13) < 104) {
                        class72.field1144[var8] = new class32();
                        class32 var15 = class72.field1144[var8];
                        class198.field3113[class62.field1006++] = var8;
                        var15.field4161 = class267.field4256;
                        var15.method259(var14, -2308);
                        var15.method1804((byte) -45, var15.field518.field3352);
                        var15.field4199 = var15.field4159 = class187.field2817[var15.field518.field3391];
                        var15.field4203 = var15.field518.field3361;
                        var15.field4167 = var15.field518.field3403;
                        if (var15.field4167 == 0) {
                            var15.field4159 = 0;
                        }
                        var15.method1803(var13, var15.method226((byte) -97), var12, true, arg0 ^ 0x1F);
                    }
                }
            }
        }
        if (arg0 != 2) {
            field2298 = 95;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZZIII)V")
    public static final void method1018(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field2311++;
        if (arg5 == 3) {
            method1018(-1, -2162, true, true, -1, class148.field2287, arg6);
            return;
        }
        Container var7;
        if (class6.field114 != null) {
            var7 = class6.field114;
        } else if (class239.field3716 == null) {
            var7 = class22.field329.field934;
        } else {
            var7 = class239.field3716;
        }
        class237.field3656 = var7.getSize().width;
        class205.field3183 = var7.getSize().height;
        if (class239.field3716 == var7) {
            Insets var8 = class239.field3716.getInsets();
            class237.field3656 -= var8.right + var8.left;
            class205.field3183 -= var8.top + var8.bottom;
        }
        if (arg5 >= 2) {
            class35.field573 = class237.field3656;
            class93.field1509 = 0;
            class62.field994 = 0;
            class277.field4369 = class205.field3183;
        } else {
            class35.field573 = 765;
            class93.field1509 = (class237.field3656 - 765) / 2;
            class62.field994 = 0;
            class277.field4369 = 503;
        }
        if (arg3) {
            class167.method1111(class189.field3021, 62);
            class1.method5(true, class189.field3021);
            if (class145.field2255 != null) {
                class145.field2255.method1127(0, class189.field3021);
            }
            class272.field4303.method948((byte) -41);
            class208.method1393(class189.field3021, (byte) -56);
            class6.method77(class189.field3021, arg1 ^ 0xFFFFF7E2);
            if (class145.field2255 != null) {
                class145.field2255.method1125(class189.field3021, false);
            }
        } else {
            class189.field3021.setSize(class35.field573, class277.field4369);
            if (class239.field3716 == var7) {
                Insets var9 = class239.field3716.getInsets();
                class189.field3021.setLocation(class93.field1509 + var9.left, class62.field994 + var9.top);
            } else {
                class189.field3021.setLocation(class93.field1509, class62.field994);
            }
        }
        if (arg5 > 0) {
            method1018(-1, -2162, true, true, -1, 0, arg6);
            return;
        }
        class270.field4274 = !class223.method1487(-93);
        if (arg1 != -2162) {
            field2309 = -115;
        }
        if (class34.field544 != -1) {
            class109.method819(9, true);
        }
        if (class118.field1829 != null && (class239.field3715 == 30 || class239.field3715 == 25)) {
            class293.method1967(161);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class37.field632[var10] = true;
        }
        class126.field1987 = true;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class149() {
        this.field2299.field1407 = this.field2299;
        this.field2299.field1414 = this.field2299;
    }
}
