import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class222 {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field3622 = 0;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 14)
    public static final void method1534(byte arg0) {
        field3625++;
        class238.field3912 = 0;
        class26.field452 = 0;
        class203.method1344(arg0 - 57);
        class325.method2285((byte) 82);
        class72.method491((byte) 100);
        if (arg0 != 55) {
            method1539(-66);
        }
        class316.method2209((byte) -19);
        for (int var1 = 0; var1 < class26.field452; var1++) {
            int var2 = class305.field5243[var1];
            if (class142.field2187 != class22.field380[var2].field4251) {
                if (class22.field380[var2].field150 > 0) {
                    class42.method294(class22.field380[var2], (byte) -65);
                }
                class22.field380[var2] = null;
            }
        }
        if (class288.field4882 != class73.field1058.field4946) {
            throw new RuntimeException("gpp1 pos:" + class73.field1058.field4946 + " psize:" + class288.field4882);
        }
        for (int var3 = 0; var3 < class194.field3114; var3++) {
            if (class22.field380[class325.field5670[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class194.field3114);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZLrd;)V", line = 69)
    public static final void method1535(int arg0, boolean arg1, class171 arg2) {
        field3624++;
        if (class217.field3516 || arg1) {
            int var3 = class227.field3709;
            int var4 = var3 * 956 / 503;
            class234.field3834.method428((class172.field2757 - var4) / 2, 0, var4, var3);
            class242.field3986.method1572(class172.field2757 / 2 - (class242.field3986.field3746 / 2), 18);
        }
        arg2.method1122(class124.field1735, class172.field2757 / 2, class227.field3709 / 2 - 26, 16777215, -1);
        int var5 = 79 / ((arg0 + 45) / 36);
        int var6 = class227.field3709 / 2 - 18;
        if (class217.field3516) {
            class13.method68(class172.field2757 / 2 - 152, var6, 304, 34, 9179409);
            class13.method68(class172.field2757 / 2 - 151, var6 - -1, 302, 32, 0);
            class13.method78(class172.field2757 / 2 - 150, var6 + 2, class139.field2119 * 3, 30, 9179409);
            class13.method78(class172.field2757 / 2 + class139.field2119 * 3 - 150, var6 - -2, 300 - class139.field2119 * 3, 30, 0);
        } else {
            class96.method648(class172.field2757 / 2 - 152, var6, 304, 34, 9179409);
            class96.method648(class172.field2757 / 2 - 151, var6 - -1, 302, 32, 0);
            class96.method635(class172.field2757 / 2 - 150, var6 + 2, class139.field2119 * 3, 30, 9179409);
            class96.method635(class172.field2757 / 2 + class139.field2119 * 3 - 150, var6 + 2, 300 - class139.field2119 * 3, 30, 0);
        }
        arg2.method1122(class20.field262, class172.field2757 / 2, class227.field3709 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 109)
    public static final void method1536(int arg0) {
        class167.field2626 = arg0;
        for (int var1 = 0; var1 < class112.field1595; var1++) {
            for (int var2 = 0; var2 < class97.field1394; var2++) {
                if (class287.field4857[arg0][var1][var2] == null) {
                    class287.field4857[arg0][var1][var2] = new class34(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V", line = 140)
    public static final void method1537(int arg0) {
        field3623++;
        int var1 = class316.field5485.method1123(class48.field741);
        for (int var2 = 0; var2 < class160.field2556; var2++) {
            int var3 = class316.field5485.method1123(class6.method27(var2, -39));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class247.field4134 - (var1 / 2);
        int var5 = class160.field2556 * 15 + 21;
        int var6 = class195.field3134;
        if ((var1 + var4) > class172.field2757) {
            var4 = class172.field2757 - var1;
        }
        if ((var5 + var6) > class227.field3709) {
            var6 = class227.field3709 - var5;
        }
        if (arg0 != 30) {
            field3622 = -99;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (class18.field251 == 1) {
            if (class247.field4134 == class162.field2566 && class94.field1349 == class195.field3134) {
                class128.field1957 = var6;
                class267.field4503 = var4;
                class258.field4429 = class160.field2556 * 15 + (class180.field2874 ? 26 : 22);
                class17.field232 = var1;
                class18.field251 = 0;
                class70.field1016 = true;
            }
        } else if (class247.field4134 == class193.field3066 && class62.field944 == class195.field3134) {
            class267.field4503 = var4;
            class258.field4429 = class160.field2556 * 15 + (class180.field2874 ? 26 : 22);
            class18.field251 = 0;
            class128.field1957 = var6;
            class17.field232 = var1;
            class70.field1016 = true;
        } else {
            class18.field251 = 1;
            class94.field1349 = class62.field944;
            class162.field2566 = class193.field3066;
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V", line = 234)
    public static final void method1538(int arg0) {
        int var1 = 0;
        if (arg0 > -14) {
            method1537(-128);
        }
        while (var1 < 5) {
            class179.field2858[var1] = false;
            var1++;
        }
        class28.field485 = 1;
        class180.field2866 = 0;
        class299.field5181 = -1;
        class174.field2790 = 0;
        class104.field1489 = -1;
        field3627++;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V", line = 259)
    public static final void method1539(int arg0) {
        field3626++;
        class314 var1 = (class314) class146.field2234.method1221((byte) 102);
        if (arg0 != 2) {
            field3622 = -11;
        }
        while (var1 != null) {
            class289 var2 = var1.field5437;
            if (class23.field400 != var2.field4898 || var2.field4912) {
                var1.method1880(arg0 ^ 0xFFFF9CEA);
            } else if (class142.field2187 >= var2.field4896) {
                var2.method1941(class277.field4740, 1);
                if (var2.field4912) {
                    var1.method1880(-25368);
                } else {
                    class241.method1644(var2.field4898, var2.field4888, var2.field4884, var2.field4889, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class314) class146.field2234.method1223(91);
        }
    }
}
