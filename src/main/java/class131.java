import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class131 extends class165 {

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Ljava/lang/String;")
    public String field2069;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field2072 = 0;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "[S")
    public static short[] field2073 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "[I")
    public static int[] field2075 = new int[32];

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field2077 = -1;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V", line = 4)
    public static void method964(int arg0) {
        if (arg0 >= 114) {
            field2073 = null;
            field2075 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)Z", line = 17)
    public static final boolean method965(byte arg0) {
        field2074++;
        if (class102.field1494) {
            try {
                class308.method2181("showVideoAd", 32627, class14.field159.field1951);
                return true;
            } catch (Throwable var2) {
            }
        }
        if (arg0 != 86) {
            field2077 = -107;
        }
        return false;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V", line = 42)
    public static final void method966(int arg0) {
        field2076++;
        if (class279.field4504 != null) {
            return;
        }
        if (arg0 >= -98) {
            field2075 = (int[]) null;
        }
        if (class307.field4783 != null) {
            return;
        }
        int var1 = class160.field2642;
        if (!class196.field3204) {
            if (var1 == 1 && class185.field3070 > 0) {
                short var2 = class113.field1727[class185.field3070 - 1];
                if (var2 == 8 || var2 == 10 || var2 == 3 || var2 == 57 || var2 == 17 || var2 == 15 || var2 == 2 || var2 == 22 || var2 == 26 || var2 == 45 || var2 == 31 || var2 == 1006) {
                    int var3 = class343.field5338[class185.field3070 - 1];
                    int var4 = class193.field3155[class185.field3070 - 1];
                    class157 var5 = class142.method1053(var3, 65535);
                    class279 var6 = client.method766(var5);
                    if (var6.method2022((byte) 86) || var6.method2018(17065)) {
                        class256.field4122 = false;
                        class335.field5247 = 0;
                        if (class279.field4504 != null) {
                            class320.method2252(class279.field4504, 0);
                        }
                        class279.field4504 = class142.method1053(var3, 65535);
                        class175.field2909 = var4;
                        class113.field1718 = class198.field3221;
                        class208.field3415 = class105.field1542;
                        class320.method2252(class279.field4504, 0);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class113.field1731 == 1 && class185.field3070 > 2 || class207.method1501(-1, class185.field3070 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class185.field3070 > 0 || class194.field3168 == 1) {
                class116.method797(15);
            }
            if (var1 == 1 && class185.field3070 > 0 || class194.field3168 == 2) {
                class198.method1457(0);
            }
            return;
        }
        if (var1 != 1) {
            int var7 = class70.field995;
            int var8 = class233.field3738;
            if (var7 < (class121.field1831 - 10) || (class121.field1831 + class227.field3617 + 10) < var7 || var8 < class315.field4877 - 10 || class315.field4877 + class295.field4671 + 10 < var8) {
                class196.field3204 = false;
                class93.method620(true, class227.field3617, class121.field1831, class295.field4671, class315.field4877);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var9 = class315.field4877;
        int var10 = class121.field1831;
        int var11 = class227.field3617;
        int var12 = -1;
        int var13 = class198.field3221;
        int var14 = class105.field1542;
        for (int var15 = 0; var15 < class185.field3070; var15++) {
            if (class52.field737) {
                int var17 = (class185.field3070 - var15 - 1) * 15 + var9 + 33;
                if (var10 < var14 && (var10 + var11) > var14 && var13 > (var17 - 13) && var13 < (var17 + 3)) {
                    var12 = var15;
                }
            } else {
                int var16 = (class185.field3070 - var15 - 1) * 15 + var9 + 31;
                if (var10 < var14 && var14 < (var10 + var11) && var13 > (var16 - 13) && var16 + 3 > var13) {
                    var12 = var15;
                }
            }
        }
        if (var12 != -1) {
            class252.method1816(var12, 11);
        }
        class196.field3204 = false;
        class93.method620(true, class227.field3617, class121.field1831, class295.field4671, class315.field4877);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V", line = 183)
    public class131() {
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 188)
    public class131(String arg0) {
        this.field2069 = arg0;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2075[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)I", line = 200)
    public static final int method967(int arg0) {
        if (arg0 <= 40) {
            method967(4);
        }
        field2068++;
        return class260.field4151 == 0 ? 0 : class174.field2890[class260.field4151].method66();
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Lrl;", line = 216)
    public static final class289 method968(int arg0, int arg1) {
        class289 var2 = (class289) class110.field1628.method755((long) arg1, false);
        field2070++;
        if (arg0 != -13) {
            return (class289) null;
        } else if (var2 == null) {
            byte[] var3;
            if (arg1 < 32768) {
                var3 = class298.field4705.method1287(arg1, 0, -1);
            } else {
                var3 = class231.field3683.method1287(arg1 & 0x7FFF, 0, -1);
            }
            class289 var4 = new class289();
            if (var3 != null) {
                var4.method2070(new class44(var3), arg0 ^ 0x7B);
            }
            if (arg1 >= 32768) {
                var4.method2073((byte) 121);
            }
            class110.field1628.method750(var4, (long) arg1, -18339);
            return var4;
        } else {
            return var2;
        }
    }
}
