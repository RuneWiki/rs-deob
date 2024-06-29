import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class93 implements Runnable {

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Z")
    public boolean field1589 = true;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field1583 = new Object();

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public int field1592 = 0;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "[I")
    public int[] field1593 = new int[500];

    @OriginalMember(owner = "client!od", name = "m", descriptor = "[I")
    public int[] field1595 = new int[500];

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Luk;")
    public static class100 field1594 = new class100(64);

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Lih;")
    public static class208 field1596;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BIIII)Lcj;")
    public static final class119 method701(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1588++;
        long var5 = 0xFFFFL << 16 & (long) arg3 << 16 | ((long) arg2 & 0xFFFFL) << 32 | (long) arg1 << 48 & 0xFFFFL << 48 | (long) arg4 & 0xFFFFL;
        class119 var7 = (class119) class235.field3773.method1887(0, var5);
        int var8 = -104 % ((38 - arg0) / 41);
        if (var7 != null) {
            return var7;
        }
        class246[] var9 = null;
        class255 var10 = class110.method786(arg4, -32439);
        if (var10.field4089 != null) {
            var9 = new class246[var10.field4089.length];
            for (int var11 = 0; var11 < var9.length; var11++) {
                class118 var12 = class187.method1264(var10.field4089[var11], 64);
                var9[var11] = new class246(var12.field1909, var12.field1916, var12.field1912, var12.field1917, var12.field1911, var12.field1905, var12.field1910, var12.field1906);
            }
        }
        class119 var13 = new class119(var10.field4085, var9, var10.field4084, arg1, arg2, arg3);
        class235.field3773.method1886(-62, var5, var13);
        return var13;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method702(int arg0) {
        field1594 = null;
        field1596 = null;
        if (arg0 >= -43) {
            field1594 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Lhf;")
    public static final class139 method703(int arg0, int arg1) {
        field1585++;
        class139 var2 = (class139) class25.field333.method1887(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class267.field4269.method1590(arg1, (byte) -25, 16);
        if (arg0 != 15226) {
            method707((String) null, (byte) -118);
        }
        class139 var4 = new class139();
        if (var3 != null) {
            var4.method941(new class88(var3), (byte) -67);
        }
        class25.field333.method1886(-116, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public static final void method704(int arg0) {
        if (class40.field571 == 2) {
            if (class213.field3321 == class179.field2796 && class15.field236 == class147.field2332) {
                class40.field571 = 0;
                if (class244.field3975 && class106.field1764[81] && class128.field2018 > 2) {
                    class201.method1359(class128.field2018 - 2, 5469);
                } else {
                    class201.method1359(class128.field2018 - 1, 5469);
                }
            }
        } else if (class291.field4584 == class179.field2796 && class147.field2332 == class112.field1838) {
            class40.field571 = 0;
            if (class244.field3975 && class106.field1764[81] && class128.field2018 > 2) {
                class201.method1359(class128.field2018 - 2, 5469);
            } else {
                class201.method1359(class128.field2018 - 1, 5469);
            }
        } else {
            class213.field3321 = class291.field4584;
            class40.field571 = 2;
            class15.field236 = class112.field1838;
        }
        field1597++;
        if (arg0 != 0) {
            field1594 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBIIII)V")
    public static final void method705(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        class166.method1124(true, class154.field2406[arg5], arg0 + arg2, arg4, arg2 - arg0);
        field1586++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg0 * arg0;
        int var9 = var8 << 1;
        if (arg1 > -127) {
            return;
        }
        int var10 = arg3 << 1;
        int var11 = arg3 * arg3;
        int var12 = var11 << 1;
        int var13 = var11 - ((var10 - 1) * var9);
        int var14 = (1 - var10) * var8 + var12;
        int var15 = var8 << 2;
        int var16 = var11 << 2;
        int var17 = ((arg3 << 1) - 3) * var9;
        int var18 = ((var6 << 1) + 3) * var12;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg3 - 1) * var15;
        while (var7 > 0) {
            var7--;
            if (var14 < 0) {
                while (var14 < 0) {
                    var13 += var19;
                    var6++;
                    var14 += var18;
                    var18 += var16;
                    var19 += var16;
                }
            }
            if (var13 < 0) {
                var13 += var19;
                var19 += var16;
                var6++;
                var14 += var18;
                var18 += var16;
            }
            var13 += -var17;
            var17 -= var15;
            var14 += -var20;
            var20 -= var15;
            int var21 = arg5 - var7;
            int var22 = arg5 + var7;
            int var23 = arg2 + var6;
            int var24 = arg2 - var6;
            class166.method1124(true, class154.field2406[var21], var23, arg4, var24);
            class166.method1124(true, class154.field2406[var22], var23, arg4, var24);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static final void method706(byte arg0) {
        field1587++;
        int var1 = class15.field233.length;
        if (arg0 > -61) {
            method707((String) null, (byte) 73);
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class15.field233[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class142.field2168; var4++) {
                    if (class255.field4090[var4] == class230.field3653[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                int var5 = 0;
                if (var3 == -1) {
                    class255.field4090[class142.field2168] = class230.field3653[var2];
                    var3 = class142.field2168++;
                }
                class88 var6 = new class88(class15.field233[var2]);
                while (class15.field233[var2].length > var6.field1535 && var5 < 511) {
                    int var7 = var6.method645(11596);
                    int var8 = var7 >> 14;
                    int var9 = var5++ << 6 | var3;
                    int var10 = var7 >> 7 & 0x3F;
                    int var11 = (class230.field3653[var2] >> 8) * 64 + var10 - class46.field656;
                    int var12 = var7 & 0x3F;
                    int var13 = (class230.field3653[var2] & 0xFF) * 64 + var12 - class260.field4162;
                    class60 var14 = class62.method469(var6.method645(11596), 69);
                    if (class255.field4082[var9] == null && (var14.field988 & 0x1) > 0 && class255.field4081 == var8 && var11 >= 0 && var14.field977 + var11 < 104 && var13 >= 0 && var14.field977 + var13 < 104) {
                        class255.field4082[var9] = new class45();
                        class45 var15 = class255.field4082[var9];
                        class284.field4506[class70.field1119++] = var9;
                        var15.field2279 = class192.field2978;
                        var15.method327(-68, var14);
                        var15.method967(var15.field645.field977, (byte) -30);
                        var15.field2257 = var15.field2275 = class148.field2335[var15.field645.field1006];
                        var15.field2270 = var15.field645.field1012;
                        var15.field2260 = var15.field645.field1036;
                        if (var15.field2260 == 0) {
                            var15.field2275 = 0;
                        }
                        var15.method978(var15.method971(65535), var11, var13, 2, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method707(String arg0, byte arg1) {
        field1584++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 > -29) {
            field1596 = null;
        }
        for (int var2 = 0; var2 < class166.field2604; var2++) {
            if (arg0.equalsIgnoreCase(class129.field2024[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class283.field4473.field3803);
    }

    @OriginalMember(owner = "client!od", name = "run", descriptor = "()V")
    public final void run() {
        field1590++;
        while (this.field1589) {
            Object var1 = this.field1583;
            synchronized (this.field1583) {
                if (this.field1592 < 500) {
                    this.field1595[this.field1592] = class79.field1323;
                    this.field1593[this.field1592] = class115.field1883;
                    this.field1592++;
                }
            }
            class150.method1011((byte) 41, 50L);
        }
    }
}
