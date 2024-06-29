import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class102 {

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "[S")
    public static short[] field1682 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1687 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1689 = 0;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Lpk;")
    public static class120 field1690;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Leh;")
    public class179 field1683;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Lwk;")
    public class186 field1685;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIIII)V", line = 5)
    public static final void method828(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class310.field4897 <= arg0 && class180.field2862 >= arg0 && class310.field4897 <= arg9 && class180.field2862 >= arg9 && class310.field4897 <= arg1 && class180.field2862 >= arg1 && arg7 >= class310.field4897 && arg7 <= class180.field2862 && arg8 >= class104.field1719 && arg8 <= class333.field5188 && arg3 >= class104.field1719 && arg3 <= class333.field5188 && arg5 >= class104.field1719 && arg5 <= class333.field5188 && class104.field1719 <= arg4 && class333.field5188 >= arg4) {
            class286.method2011(arg2, arg7, (byte) -27, arg8, arg3, arg9, arg5, arg1, arg4, arg0);
        } else {
            class208.method1529(arg8, arg0, 0, arg7, arg9, arg3, arg2, arg4, arg1, arg5);
        }
        field1686++;
        int var10 = -110 / ((arg6 - 31) / 34);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 23)
    public static void method829(int arg0) {
        field1690 = null;
        if (arg0 >= 105) {
            field1682 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V", line = 46)
    public static final void method830(int arg0, int arg1, int arg2) {
        if (arg1 != 14804) {
            field1690 = (class120) null;
        }
        field1688++;
        if (arg0 == 8) {
            arg0 = 4;
        }
        if (arg0 == 4 && !class154.field2511) {
            arg2 = 2;
            arg0 = 2;
        }
        if (class9.field214 != arg0) {
            if (class168.field2716) {
                return;
            }
            if (class9.field214 != 0) {
                class136.field2221[class9.field214].method787();
            }
            if (arg0 != 0) {
                class335 var3 = class136.field2221[arg0];
                var3.method785();
                var3.method786(arg2);
            }
            class217.field3370 = arg2;
            class9.field214 = arg0;
        } else if (arg0 != 0 && class217.field3370 != arg2) {
            class136.field2221[arg0].method786(arg2);
            class217.field3370 = arg2;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)V", line = 104)
    public static final void method831(int arg0, int arg1, int arg2) {
        if (class100.field1595 > 0) {
            class309.method2184(class100.field1595, (byte) 57);
            class100.field1595 = 0;
        }
        int var3 = class33.field506 * arg0;
        int var4 = 0;
        int var5 = 0;
        short var6 = 256;
        field1684++;
        if (arg1 != 21478) {
            return;
        }
        for (int var7 = 1; var7 < (var6 - 1); var7++) {
            int var8 = (var6 - var7) * class4.field112[var7] / var6;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class214.field3343[var4++];
                int var11 = class33.field503[var3++ + arg2];
                if (var10 == 0) {
                    class299.field4788.field4988[var5++] = var11;
                } else {
                    int var12 = var10 + 18;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 256 - var10 - 18;
                    int var14 = class101.field1668[var10];
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    class299.field4788.field4988[var5++] = class164.method1234(class164.method1234(var11, 65280) * var13 + class164.method1234(var14, 65280) * var12, 16711680) + class164.method1234(var13 * class164.method1234(var11, 16711935) + class164.method1234(16711935, var14) * var12, -16711936) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class299.field4788.field4988[var5++] = class33.field503[arg2 + (var3++)];
            }
            var3 += class33.field506 - 128;
        }
        if (class162.field2623) {
            class114.method891(class299.field4788.field4988, arg2, arg0, class299.field4788.field1412, class299.field4788.field1413);
        } else {
            class299.field4788.method693(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lvd;)V", line = 189)
    public static final void method832(class144 arg0) {
        for (int var1 = arg0.field2345; var1 <= arg0.field2334; var1++) {
            for (int var2 = arg0.field2339; var2 <= arg0.field2337; var2++) {
                class42 var3 = class34.field521[arg0.field2333][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field672; var4++) {
                        if (var3.field659[var4] == arg0) {
                            var3.field672--;
                            for (int var5 = var4; var5 < var3.field672; var5++) {
                                var3.field659[var5] = var3.field659[var5 + 1];
                                var3.field673[var5] = var3.field673[var5 + 1];
                            }
                            var3.field659[var3.field672] = null;
                            break;
                        }
                    }
                    var3.field657 = 0;
                    for (int var6 = 0; var6 < var3.field672; var6++) {
                        var3.field657 |= var3.field673[var6];
                    }
                }
            }
        }
    }
}
