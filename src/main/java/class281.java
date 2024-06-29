import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class281 {

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lkb;")
    public class41 field4449 = new class41();

    @OriginalMember(owner = "client!t", name = "f", descriptor = "[I")
    public static int[] field4451 = new int[64];

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Lkb;")
    private class41 field4456;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2027(int arg0) {
        while (true) {
            if (class282.field4499.method308(class191.field2869, 64) >= 27) {
                int var1 = class282.field4499.method307(15, true);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class251.field3974[var1] == null) {
                        class251.field3974[var1] = new class231();
                        var2 = true;
                    }
                    class231 var3 = class251.field3974[var1];
                    class225.field3392[class296.field4667++] = var1;
                    var3.field3772 = class102.field1381;
                    if (var3.field3503 != null && var3.field3503.method958((byte) 109)) {
                        class75.method475(2045418567, var3);
                    }
                    int var4 = class28.field331[class282.field4499.method307(3, true)];
                    if (var2) {
                        var3.field3806 = var3.field3760 = var4;
                    }
                    var3.method1599(23299, class178.method1229(class282.field4499.method307(14, true), 8));
                    int var5 = class282.field4499.method307(5, true);
                    int var6 = class282.field4499.method307(5, true);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var7 = class282.field4499.method307(1, true);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var8 = class282.field4499.method307(1, true);
                    if (var8 == 1) {
                        class127.field1864[class218.field3280++] = var1;
                    }
                    var3.method1721(362, var3.field3503.field2111);
                    var3.field3746 = var3.field3503.field2145;
                    var3.field3729 = var3.field3503.field2134;
                    if (var3.field3729 == 0) {
                        var3.field3760 = 0;
                    }
                    var3.method1714(class11.field113.field3747[0] + var5, var3.method412((byte) 75), false, class11.field113.field3786[0] + var6, var7 == 1);
                    if (var3.field3503.method958((byte) -67)) {
                        class218.method1517(0, (class67) null, (byte) 45, var3.field3747[0], var3, (class234) null, var3.field3786[0], class219.field3290);
                    }
                    continue;
                }
            }
            class282.field4499.method303(121);
            int var9 = -45 / ((-arg0 - 37) / 58);
            field4450++;
            return;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lkb;I)V", line = 90)
    public final void method2028(class41 arg0, int arg1) {
        if (arg0.field445 != null) {
            arg0.method253(2);
        }
        field4447++;
        arg0.field445 = this.field4449.field445;
        arg0.field450 = this.field4449;
        arg0.field445.field450 = arg0;
        int var3 = -111 % ((arg1 - 15) / 43);
        arg0.field450.field445 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)Lkb;", line = 107)
    public final class41 method2029(boolean arg0) {
        class41 var2 = this.field4456;
        if (arg0) {
            this.method2029(true);
        }
        field4452++;
        if (this.field4449 == var2) {
            this.field4456 = null;
            return null;
        } else {
            this.field4456 = var2.field450;
            return var2;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 130)
    public final void method2030(int arg0) {
        while (true) {
            class41 var2 = this.field4449.field450;
            if (this.field4449 == var2) {
                field4453++;
                this.field4456 = null;
                if (arg0 != 8226) {
                    method2035((byte) 30);
                }
                return;
            }
            var2.method253(arg0 - 8224);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)V", line = 150)
    public static final void method2031(byte arg0, int arg1) {
        field4455++;
        class279 var2 = class147.method1085(arg1, -19443, 10);
        if (arg0 < -42) {
            var2.method1996(true);
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(Z)V", line = 163)
    public static void method2032(boolean arg0) {
        if (!arg0) {
            method2034(-12, (byte) 19, 51, false, (class323) null);
        }
        field4451 = null;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)Lkb;", line = 177)
    public final class41 method2033(int arg0) {
        if (arg0 != 19696) {
            return (class41) null;
        }
        class41 var2 = this.field4449.field450;
        field4446++;
        if (this.field4449 == var2) {
            this.field4456 = null;
            return null;
        } else {
            this.field4456 = var2.field450;
            return var2;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBIZLhi;)V", line = 201)
    public static final void method2034(int arg0, byte arg1, int arg2, boolean arg3, class323 arg4) {
        field4454++;
        int var5 = arg4.field5169;
        if (arg4.field5110 == 0) {
            arg4.field5169 = arg4.field5095;
        } else if (arg4.field5110 == 1) {
            arg4.field5169 = arg2 - arg4.field5095;
        } else if (arg4.field5110 == 2) {
            arg4.field5169 = arg4.field5095 * arg2 >> 14;
        } else if (arg4.field5110 == 3) {
            if (arg4.field5107 == 2) {
                arg4.field5169 = (arg4.field5095 - 1) * arg4.field5071 + arg4.field5095 * 32;
            } else if (arg4.field5107 == 7) {
                arg4.field5169 = (arg4.field5095 - 1) * arg4.field5071 + arg4.field5095 * 115;
            }
        }
        int var6 = arg4.field5174;
        if (arg4.field5128 == 0) {
            arg4.field5174 = arg4.field5131;
        } else if (arg4.field5128 == 1) {
            arg4.field5174 = arg0 - arg4.field5131;
        } else if (arg4.field5128 == 2) {
            arg4.field5174 = arg4.field5131 * arg0 >> 14;
        } else if (arg4.field5128 == 3) {
            if (arg4.field5107 == 2) {
                arg4.field5174 = arg4.field5131 * 32 + ((arg4.field5131 - 1) * arg4.field5061);
            } else if (arg4.field5107 == 7) {
                arg4.field5174 = (arg4.field5131 - 1) * arg4.field5061 + arg4.field5131 * 12;
            }
        }
        if (arg1 != 96) {
            method2034(126, (byte) 112, -41, true, (class323) null);
        }
        if (arg4.field5110 == 4) {
            arg4.field5169 = arg4.field5174 * arg4.field5145 / arg4.field5197;
        }
        if (arg4.field5128 == 4) {
            arg4.field5174 = arg4.field5197 * arg4.field5169 / arg4.field5145;
        }
        if (class214.field3244 && (client.method2013(arg4).field994 != 0 || arg4.field5107 == 0)) {
            if (arg4.field5174 < 5 && arg4.field5169 < 5) {
                arg4.field5174 = 5;
                arg4.field5169 = 5;
            } else {
                if (arg4.field5169 <= 0) {
                    arg4.field5169 = 5;
                }
                if (arg4.field5174 <= 0) {
                    arg4.field5174 = 5;
                }
            }
        }
        if (arg4.field5182 == 1337) {
            class131.field1883 = arg4;
        }
        if (arg3 && arg4.field5051 != null && (arg4.field5169 != var5 || arg4.field5174 != var6)) {
            class185 var7 = new class185();
            var7.field2793 = arg4;
            var7.field2789 = arg4.field5051;
            class282.field4482.method1814(var7, true);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 306)
    public static final void method2035(byte arg0) {
        class194.field2940 = null;
        class143.method1011(0, class165.field2546, arg0 - 116, class345.field5482, 0, -1, 0, 0, class95.field1307);
        if (arg0 != 116) {
            field4451 = (int[]) null;
        }
        field4448++;
        if (class194.field2940 != null) {
            class35.method234(class67.field838.field5078, 0, class165.field2546, class194.field2940, -1412584499, 38, class10.field108, class50.field575, 0, class95.field1307);
            class194.field2940 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V", line = 335)
    public class281() {
        this.field4449.field445 = this.field4449;
        this.field4449.field450 = this.field4449;
    }
}
