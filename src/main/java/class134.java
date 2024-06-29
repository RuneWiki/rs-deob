import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class134 {

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lcc;")
    public static class209 field2541 = class95.method669(98, "mapflag");

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Laa;")
    public static class168 field2548;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "[I")
    public static int[] field2540;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "[Lij;")
    public static class194[] field2550;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)I")
    public static final int method936(byte arg0, int arg1, int arg2) {
        field2542++;
        int var3 = arg2 >> 31 & arg1 - 1;
        if (arg0 != 51) {
            method942(-56);
        }
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)I")
    public static final int method937(boolean arg0) {
        if (arg0) {
            method936((byte) -68, 96, 117);
        }
        field2549++;
        if ((double) class11.field224 == 3.0D) {
            return 37;
        } else if ((double) class11.field224 == 4.0D) {
            return 50;
        } else if ((double) class11.field224 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)Lnj;")
    public static final class141 method938(int arg0, int arg1) {
        field2544++;
        class141 var2 = (class141) class49.field949.method1257((long) arg0, -37);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class32.field580.method353(arg0, 110, 5);
        class141 var4 = new class141();
        if (arg1 > -22) {
            field2545 = -115;
        }
        if (var3 != null) {
            var4.method982(113, new class106(var3));
        }
        class49.field949.method1259((long) arg0, var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V")
    public static final void method939(int arg0, int arg1) {
        class1.field20.method662(32768, arg0);
        if (arg1 != 15941) {
            method940((byte) -127);
        }
        field2543++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static final void method940(byte arg0) {
        while (true) {
            if (client.field2818.method291(class112.field2253, -31508) >= 11) {
                int var1 = client.field2818.method289(8, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class103.field1993[var1] == null) {
                        var2 = true;
                        class103.field1993[var1] = new class108();
                        if (class262.field4702[var1] != null) {
                            class103.field1993[var1].method787(class262.field4702[var1], arg0 ^ 0xFFFFFF88);
                        }
                    }
                    class82.field1653[class250.field4502++] = var1;
                    class108 var3 = class103.field1993[var1];
                    var3.field1512 = class163.field2968;
                    int var4 = client.field2818.method289(8, 5);
                    int var5 = client.field2818.method289(arg0 ^ 0x7F, 1);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var6 = client.field2818.method289(8, 1);
                    if (var6 == 1) {
                        class211.field3840[class244.field4423++] = var1;
                    }
                    int var7 = client.field2818.method289(arg0 ^ 0x7F, 5);
                    int var8 = class161.field2918[client.field2818.method289(8, 3)];
                    if (var2) {
                        var3.field1570 = var3.field1504 = var8;
                    }
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var3.method784(class223.field4069.field1567[0] + var7, var5 == 1, class223.field4069.field1548[0] + var4, 58);
                    continue;
                }
            }
            field2546++;
            client.field2818.method297(true);
            if (arg0 != 119) {
                method938(124, 73);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IJ)V")
    public static final void method941(int arg0, long arg1) {
        field2551++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class3.field38 < 100 || class92.field1815) || class3.field38 >= 200) {
            class238.method1649((byte) -128, class246.field4451, 0, class1.field19);
            return;
        }
        class209 var3 = class56.method437(arg1, (byte) 39).method1459((byte) -74);
        for (int var4 = 0; var4 < class3.field38; var4++) {
            if (class179.field3253[var4] == arg1) {
                class238.method1649((byte) -122, class246.field4451, 0, class229.method1604(new class209[] { var3, class284.field4986 }, (byte) 91));
                return;
            }
        }
        for (int var5 = 0; var5 < class163.field2949; var5++) {
            if (class253.field4566[var5] == arg1) {
                class238.method1649((byte) -120, class246.field4451, 0, class229.method1604(new class209[] { class252.field4526, var3, class137.field2582 }, (byte) 94));
                return;
            }
        }
        if (var3.method1457((byte) -127, class223.field4069.field2140)) {
            class238.method1649((byte) -121, class246.field4451, 0, class190.field3449);
        } else if (arg0 == 5) {
            class235.field4222++;
            class286.field5049[class3.field38] = var3;
            class179.field3253[class3.field38] = arg1;
            class198.field3541[class3.field38] = 0;
            class258.field4666[class3.field38] = class246.field4451;
            class84.field1678[class3.field38] = 0;
            class8.field156[class3.field38] = false;
            class3.field38++;
            class264.field4744 = class54.field1069;
            class84.field1677.method287((byte) 119, 47);
            class84.field1677.method756(arg1, (byte) 96);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method942(int arg0) {
        field2541 = null;
        field2548 = null;
        field2540 = null;
        field2550 = null;
        if (arg0 >= -107) {
            method938(-20, -81);
        }
    }
}
