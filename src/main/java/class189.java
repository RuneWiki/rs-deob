import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class189 extends class53 {

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "[B")
    public byte[] field3315;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public static int field3317 = 0;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field3314 = 0;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "[I")
    public static int[] field3321 = new int[128];

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public static int field3316 = 0;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "Lp;")
    public static class280 field3324 = class18.method140((byte) -123, "OK");

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "[Ll;")
    public static class160[] field3320;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V")
    public static void method1314(int arg0) {
        field3320 = null;
        if (arg0 < 115) {
            field3321 = null;
        }
        field3324 = null;
        field3321 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lp;I)V")
    public static final void method1315(class280 arg0, int arg1) {
        field3318++;
        if (class59.field950 == null) {
            return;
        }
        int var2 = -38 / ((arg1 + 45) / 43);
        int var3 = 0;
        long var4 = arg0.method1896(112);
        if (var4 == 0L) {
            return;
        }
        while (class59.field950.length > var3 && class59.field950[var3].field2827 != var4) {
            var3++;
        }
        if (class59.field950.length > var3 && class59.field950[var3] != null) {
            class34.field627.method551(169, true);
            class34.field627.method219(class59.field950[var3].field2827, -93);
            class254.field4449++;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(BI)V")
    public static final void method1316(byte arg0, int arg1) {
        field3322++;
        class157.field2745--;
        if (class157.field2745 == arg1) {
            return;
        }
        class143.method987(class197.field3441, arg1 + 1, class197.field3441, arg1, class157.field2745 - arg1);
        class143.method987(class258.field4566, arg1 + 1, class258.field4566, arg1, class157.field2745 - arg1);
        class143.method988(class123.field2161, arg1 + 1, class123.field2161, arg1, class157.field2745 - arg1);
        class143.method991(class275.field4765, arg1 + 1, class275.field4765, arg1, class157.field2745 - arg1);
        class143.method985(class219.field3753, arg1 + 1, class219.field3753, arg1, class157.field2745 - arg1);
        if (arg0 >= -103) {
            method1314(59);
        }
        class143.method988(class242.field4235, arg1 + 1, class242.field4235, arg1, class157.field2745 - arg1);
        class143.method988(class227.field3917, arg1 + 1, class227.field3917, arg1, class157.field2745 - arg1);
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
    public static final void method1317(int arg0) {
        field3323++;
        while (class20.field367.method557(false, class23.field422) >= 11) {
            int var1 = class20.field367.method547(11, (byte) 41);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class280.field4940[var1] == null) {
                var2 = true;
                class280.field4940[var1] = new class142();
                if (class92.field1486[var1] != null) {
                    class280.field4940[var1].method978((byte) 126, class92.field1486[var1]);
                }
            }
            class250.field4376[class205.field3554++] = var1;
            class142 var3 = class280.field4940[var1];
            var3.field4848 = class117.field2104;
            int var4 = class20.field367.method547(5, (byte) 115);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class20.field367.method547(1, (byte) 78);
            int var6 = class122.field2143[class20.field367.method547(3, (byte) 54)];
            if (var2) {
                var3.field4863 = var3.field4809 = var6;
            }
            int var7 = class20.field367.method547(1, (byte) 78);
            if (var7 == 1) {
                class192.field3359[class204.field3543++] = var1;
            }
            int var8 = class20.field367.method547(5, (byte) 120);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method983(class262.field4631.field4837[0] + var8, -112, ~var5 == -2, class262.field4631.field4792[0] + var4);
        }
        class20.field367.method552(22535);
        if (arg0 < 80) {
            method1318(45);
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "([B)V")
    public class189(byte[] arg0) {
        this.field3315 = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V")
    public static final void method1318(int arg0) {
        field3326++;
        class20.field367.method558(25830);
        int var1 = class20.field367.method547(1, (byte) 73);
        if (var1 == 0) {
            return;
        }
        int var2 = class20.field367.method547(2, (byte) 83);
        if (arg0 == var2) {
            class192.field3359[class204.field3543++] = 2047;
        } else if (var2 == 1) {
            int var3 = class20.field367.method547(3, (byte) 88);
            class262.field4631.method1842(var3, 126, false);
            int var4 = class20.field367.method547(1, (byte) 70);
            if (var4 == 1) {
                class192.field3359[class204.field3543++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class20.field367.method547(3, (byte) 50);
            class262.field4631.method1842(var5, arg0 + 89, true);
            int var6 = class20.field367.method547(3, (byte) 119);
            class262.field4631.method1842(var6, 70, true);
            int var7 = class20.field367.method547(1, (byte) 85);
            if (var7 == 1) {
                class192.field3359[class204.field3543++] = 2047;
            }
        } else if (var2 == 3) {
            class231.field4013 = class20.field367.method547(2, (byte) 92);
            int var8 = class20.field367.method547(1, (byte) 61);
            int var9 = class20.field367.method547(7, (byte) 45);
            int var10 = class20.field367.method547(7, (byte) 62);
            int var11 = class20.field367.method547(1, (byte) 67);
            if (var11 == 1) {
                class192.field3359[class204.field3543++] = 2047;
            }
            class262.field4631.method983(var10, -113, var8 == 1, var9);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Llj;I)Lve;")
    public static final class188 method1319(class25 arg0, int arg1) {
        if (arg1 >= -117) {
            field3325 = -114;
        }
        field3319++;
        return new class188(arg0.method191(123), arg0.method191(-106), arg0.method191(58), arg0.method191(-109), arg0.method191(-105), arg0.method191(124), arg0.method191(23), arg0.method191(-121), arg0.method230(15046), arg0.method189((byte) -103));
    }
}
