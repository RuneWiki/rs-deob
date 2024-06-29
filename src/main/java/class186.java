import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class186 extends class125 {

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public int field3293;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    public int field3295;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "Z")
    public static boolean field3294 = true;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field3291 = 0;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "Loa;")
    public static class99 field3297 = class221.method1463(2844, ")3)3)3");

    @OriginalMember(owner = "client!da", name = "F", descriptor = "[S")
    public static short[] field3301 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!da", name = "A", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "[I")
    public static int[] field3292;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public static void method1273(int arg0) {
        if (arg0 != -3) {
            field3291 = 52;
        }
        field3297 = null;
        field3292 = null;
        field3301 = null;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    public static final void method1274(int arg0) {
        class238.method1555(class42.field717, 10555);
        class11.field84++;
        field3300++;
        if (class209.field3632 && class260.field4537) {
            int var1 = class172.field3054;
            int var2 = class38.field656;
            int var3 = var2 - class90.field1537;
            if (var3 < class103.field1748) {
                var3 = class103.field1748;
            }
            int var4 = class42.field717.field1857;
            int var5 = var1 - class139.field2466;
            if ((class42.field717.field1793 + var3) > (class103.field1748 + class149.field2616.field1793)) {
                var3 = class103.field1748 + class149.field2616.field1793 - class42.field717.field1793;
            }
            int var6 = var3 + class149.field2616.field1832 - class103.field1748;
            int var7 = var3 - class7.field56;
            if (class76.field1354 > var5) {
                var5 = class76.field1354;
            }
            if ((class76.field1354 + class149.field2616.field1933) < (class42.field717.field1933 + var5)) {
                var5 = class76.field1354 + class149.field2616.field1933 - class42.field717.field1933;
            }
            int var8 = var5 + class149.field2616.field1871 - class76.field1354;
            int var9 = var5 - class23.field322;
            if (class11.field84 > class42.field717.field1792 && (var9 > var4 || var9 < (-var4) || var7 > var4 || var7 < (-var4))) {
                class220.field3823 = true;
            }
            if (class42.field717.field1905 != null && class220.field3823) {
                class260 var10 = new class260();
                var10.field4552 = var6;
                var10.field4541 = var8;
                var10.field4553 = class42.field717;
                var10.field4543 = class42.field717.field1905;
                class56.method385(200000, var10);
            }
            if (class51.field849 == arg0) {
                if (class220.field3823) {
                    if (class42.field717.field1785 != null) {
                        class260 var11 = new class260();
                        var11.field4553 = class42.field717;
                        var11.field4552 = var6;
                        var11.field4543 = class42.field717.field1785;
                        var11.field4541 = var8;
                        var11.field4544 = class214.field3722;
                        class56.method385(200000, var11);
                    }
                    if (class214.field3722 != null && client.method1052(class42.field717) != null) {
                        class265.field4689++;
                        class131.field2277.method966((byte) 49, 24);
                        class131.field2277.method1716(class214.field3722.field1873, 362525296);
                        class131.field2277.method1745(class42.field717.field1922, (byte) 5);
                        class131.field2277.method1697(class214.field3722.field1922, -106);
                        class131.field2277.method1734(class42.field717.field1873, (byte) -100);
                    }
                } else if ((class143.field2522 == 1 || class132.method887((byte) 123, class258.field4497 - 1)) && class258.field4497 > 2) {
                    class78.method549(108);
                } else if (class258.field4497 > 0) {
                    class216.method1442(-22297);
                }
                class42.field717 = null;
            }
        } else if (class11.field84 > 1) {
            class42.field717 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZIIIZB)V")
    public static final void method1275(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, byte arg6) {
        field3296++;
        if (arg4 == 3) {
            method1275(-1, true, -1, arg3, class36.field628, true, (byte) -69);
            return;
        }
        Container var7;
        if (class253.field4377 != null) {
            var7 = class253.field4377;
        } else if (class75.field1281 == null) {
            var7 = class24.field368.field1493;
        } else {
            var7 = class75.field1281;
        }
        class254.field4390 = var7.getSize().width;
        class280.field4901 = var7.getSize().height;
        if (class75.field1281 == var7) {
            Insets var8 = class75.field1281.getInsets();
            class254.field4390 -= var8.left + var8.right;
            class280.field4901 -= var8.top + var8.bottom;
        }
        if (arg4 < 2) {
            class24.field373 = 503;
            class2.field16 = 0;
            class252.field4368 = (class254.field4390 - 765) / 2;
            class199.field3458 = 765;
        } else {
            class199.field3458 = class254.field4390;
            class2.field16 = 0;
            class252.field4368 = 0;
            class24.field373 = class280.field4901;
        }
        if (arg1) {
            class248.method1608(32767, class166.field2951);
            class265.method1766(class166.field2951, (byte) -46);
            if (class144.field2538 != null) {
                class144.field2538.method614(class166.field2951, 0);
            }
            class175.field3082.method1947((byte) 116);
            class174.method1169(class166.field2951, 4188);
            class172.method1159(class166.field2951, 7);
            if (class144.field2538 != null) {
                class144.field2538.method615(-127, class166.field2951);
            }
        } else {
            class166.field2951.setSize(class199.field3458, class24.field373);
            if (class75.field1281 == var7) {
                Insets var9 = class75.field1281.getInsets();
                class166.field2951.setLocation(var9.left + class252.field4368, class2.field16 + var9.top);
            } else {
                class166.field2951.setLocation(class252.field4368, class2.field16);
            }
        }
        if (arg6 >= -23) {
            method1273(105);
        }
        if (arg4 > 0) {
            method1275(-1, true, -1, arg3, 0, true, (byte) -52);
            return;
        }
        class78.field1377 = !class139.method951(436421925);
        if (class9.field75 != -1) {
            class43.method326(-32039, true);
        }
        if (class133.field2322 != null && (class156.field2808 == 30 || class156.field2808 == 25)) {
            class115.method775(32435);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class173.field3057[var10] = true;
        }
        class125.field2193 = true;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)[Lvd;")
    public static final class4[] method1276(int arg0) {
        field3299++;
        if (arg0 > -100) {
            field3291 = 65;
        }
        class4[] var1 = new class4[class201.field3495];
        for (int var2 = 0; var2 < class201.field3495; var2++) {
            int var3 = class223.field3885[var2] * class193.field3395[var2];
            byte[] var4 = class181.field3151[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class173.field3062[class71.method502(255, var4[var6])];
            }
            var1[var2] = new class4(class164.field2883, class88.field1520, class290.field5082[var2], class11.field94[var2], class223.field3885[var2], class193.field3395[var2], var5);
        }
        class24.method181(false);
        return var1;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(II)V")
    public class186(int arg0, int arg1) {
        this.field3293 = arg0;
        this.field3295 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)I")
    public static final int method1277(int arg0, int arg1, int arg2) {
        field3298++;
        int var3 = arg2 >>> 31;
        return arg1 >= -18 ? 16 : (arg2 + var3) / arg0 - var3;
    }
}
