import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class267 {

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Z")
    public boolean field4726 = true;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public int field4727;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public int field4721;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public int field4728;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public int field4722;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public int field4724;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public int field4720;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Lv;")
    public static class59 field4725 = null;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lli;")
    private static class185 field4719 = class245.method1649(" from your ignore list first)3", 127);

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field4723 = 0;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "Lli;")
    public static class185 field4731 = class245.method1649("Mem:", 126);

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "Lli;")
    public static class185 field4733 = field4719;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "[Z")
    public static boolean[] field4734;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static final void method1816(byte arg0) {
        field4729++;
        if (class65.field1124 == null) {
            return;
        }
        if (client.field3929 < 10) {
            if (!class76.field1320.method1676(1, class65.field1124.field1680)) {
                client.field3929 = class193.field3563.method1675(class65.field1124.field1680, (byte) 126) / 10;
                return;
            }
            class125.method905(-88);
            client.field3929 = 10;
        }
        if (client.field3929 == 10) {
            class264.field4679 = class65.field1124.field1672 >> 6 << 6;
            if (class65.field1124.field1684 == 37) {
                class274.field4859 = 3.0F;
                class169.field3129 = 3.0F;
            } else if (class65.field1124.field1684 == 50) {
                class274.field4859 = 4.0F;
                class169.field3129 = 4.0F;
            } else if (class65.field1124.field1684 == 75) {
                class274.field4859 = 6.0F;
                class169.field3129 = 6.0F;
            } else if (class65.field1124.field1684 == 100) {
                class274.field4859 = 8.0F;
                class169.field3129 = 8.0F;
            } else if (class65.field1124.field1684 == 200) {
                class274.field4859 = 16.0F;
                class169.field3129 = 16.0F;
            } else {
                class274.field4859 = 8.0F;
                class169.field3129 = 8.0F;
            }
            class252.field4481 = class65.field1124.field1670 >> 6 << 6;
            class125.field2246 = (class65.field1124.field1679 >> 6 << 6) + 64 - class264.field4679;
            int var1 = (class241.field4310.field2694 >> 7) + class77.field1339 - class252.field4481;
            class56.field971 = (class65.field1124.field1678 >> 6 << 6) + 64 - class252.field4481;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            int var3 = class264.field4679 - ((class241.field4310.field2687 >> 7) + class107.field1933 + 1 - class125.field2246);
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var2 >= 0 && var2 < class56.field971 && var4 >= 0 && class125.field2246 > var4) {
                class212.field3884 = var4;
                class66.field1146 = var2;
            } else {
                class212.field3884 = class264.field4679 + class125.field2246 - class65.field1124.field1669 * 64 - 1;
                class66.field1146 = class65.field1124.field1667 * 64 - class252.field4481;
            }
            class268.method1820(-13248);
            class40.field637 = new int[class273.field4839 + 1];
            int var5 = class265.field4694 >> 2 << 10;
            int var6 = class56.field971 >> 6;
            int var7 = class18.field293 >> 1;
            int var8 = class125.field2246 >> 6;
            class199.field3662 = new byte[var6][var8][];
            class258.field4590 = new byte[var6][var8][];
            class232.field4179 = new int[var6][var8][];
            class165.field3091 = new byte[var6][var8][];
            class60.field1081 = new short[var6][var8][];
            class129.field2312 = new byte[var6][var8][];
            class232.field4176 = new int[var6][var8][];
            class272.field4825 = new byte[var6][var8][];
            class203.method1444(26817, var5, var7);
            client.field3929 = 20;
        } else if (client.field3929 == 20) {
            class227.method1570(new class118(class76.field1320.method1702(class82.field1542, class65.field1124.field1680, 100)), (byte) -70);
            client.field3929 = 30;
            class232.method1591(99, true);
            class157.method1119(30831);
        } else if (client.field3929 == 30) {
            class63.method426(new class118(class76.field1320.method1702(class69.field1223, class65.field1124.field1680, 100)), -14530);
            client.field3929 = 40;
            class157.method1119(30831);
        } else if (client.field3929 == 40) {
            class130.method925(35, new class118(class76.field1320.method1702(class145.field2762, class65.field1124.field1680, 100)));
            client.field3929 = 50;
            class157.method1119(30831);
        } else if (client.field3929 == 50) {
            class178.method1264(new class118(class76.field1320.method1702(class52.field835, class65.field1124.field1680, 100)), (byte) 99);
            client.field3929 = 60;
            class232.method1591(94, true);
            class157.method1119(30831);
        } else if (client.field3929 == 60) {
            if (class76.field1320.method1674(-125, class87.method567(-11039, new class185[] { class65.field1124.field1680, class237.field4241 }))) {
                if (!class76.field1320.method1676(1, class87.method567(-11039, new class185[] { class65.field1124.field1680, class237.field4241 }))) {
                    return;
                }
                class215.field3955 = class249.method1672(class87.method567(-11039, new class185[] { class65.field1124.field1680, class237.field4241 }), (byte) 78, class76.field1320);
            } else {
                class215.field3955 = new class169(0);
            }
            client.field3929 = 70;
            class157.method1119(30831);
        } else if (client.field3929 == 70) {
            class146.field2771 = new class114(11, true, class30.field500);
            client.field3929 = 73;
            class232.method1591(109, true);
            class157.method1119(30831);
        } else if (client.field3929 == 73) {
            class240.field4278 = new class114(12, true, class30.field500);
            client.field3929 = 76;
            class232.method1591(83, true);
            class157.method1119(30831);
        } else if (client.field3929 == 76) {
            class152.field2883 = new class114(14, true, class30.field500);
            client.field3929 = 79;
            class232.method1591(69, true);
            class157.method1119(30831);
        } else if (client.field3929 == 79) {
            class148.field2791 = new class114(17, true, class30.field500);
            client.field3929 = 82;
            class232.method1591(62, true);
            class157.method1119(30831);
        } else {
            int var9 = -6 / ((-arg0 - 15) / 62);
            if (client.field3929 == 82) {
                class234.field4203 = new class114(19, true, class30.field500);
                client.field3929 = 85;
                class232.method1591(90, true);
                class157.method1119(30831);
            } else if (client.field3929 == 85) {
                class132.field2373 = new class114(22, true, class30.field500);
                client.field3929 = 88;
                class232.method1591(112, true);
                class157.method1119(30831);
            } else if (client.field3929 == 88) {
                class10.field198 = new class114(26, true, class30.field500);
                client.field3929 = 91;
                class232.method1591(102, true);
                class157.method1119(30831);
            } else {
                class80.field1401 = new class114(30, true, class30.field500);
                client.field3929 = 100;
                class232.method1591(70, true);
                class157.method1119(30831);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static void method1817(int arg0) {
        field4719 = null;
        if (arg0 <= -19) {
            field4731 = null;
            field4734 = null;
            field4733 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4727 = arg0;
        this.field4721 = arg5;
        this.field4728 = arg4;
        this.field4722 = arg3;
        this.field4724 = arg1;
        this.field4720 = arg2;
        this.field4726 = arg6;
    }
}
