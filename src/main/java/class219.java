import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class219 extends class256 {

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "Ljd;")
    private class86 field3944 = class265.field4691;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "Ljd;")
    public static class86 field3943 = class122.method868("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", true);

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
    public int field3933;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
    public int field3940;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
    private int field3948;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "Lre;")
    public static class212 field3946;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "Lmg;")
    private class252 field3926;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "Lmg;")
    public class252 field3927;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "[Lmk;")
    public static class101[] field3942;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "[Lod;")
    public static class90[] field3945;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "[[[B")
    public static byte[][][] field3928;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "[[[I")
    public static int[][][] field3930;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    private final void method1538(byte arg0) {
        field3936++;
        this.field3926 = new class252(this.field3927.method1707(98048));
        class232 var2 = (class232) this.field3927.method1709(-123);
        if (arg0 >= -72) {
            this.field3926 = null;
        }
        while (var2 != null) {
            class59 var3 = new class59(var2.field4205, (int) var2.field3759);
            this.field3926.method1699(-28407, var3, var2.field4205.method626(true));
            var2 = (class232) this.field3927.method1704(-101);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljd;I)Z")
    public final boolean method1539(class86 arg0, int arg1) {
        field3941++;
        if (this.field3927 == null) {
            return false;
        }
        int var3 = 113 % ((72 - arg1) / 49);
        if (this.field3926 == null) {
            this.method1538((byte) -105);
        }
        for (class59 var4 = (class59) this.field3926.method1698(arg0.method626(true), (byte) 123); var4 != null; var4 = (class59) this.field3926.method1708((byte) -75)) {
            if (var4.field1189.method625((byte) -109, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)Lmk;")
    public static final class101 method1540(byte arg0) {
        field3932++;
        class101 var1 = new class101(class70.field1438, class169.field3121, class138.field2628[0], class1.field6[0], class24.field592[0], class191.field3393[0], class213.field3857[0], class268.field4718);
        int var2 = 100 % ((arg0 - 69) / 57);
        class127.method894((byte) 20);
        return var1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)I")
    public final int method1541(int arg0, int arg1) {
        field3938++;
        if (this.field3927 == null) {
            return this.field3948;
        } else {
            class2 var3 = (class2) this.field3927.method1698((long) arg1, (byte) 113);
            int var4 = 12 / ((arg0 - 42) / 53);
            return var3 == null ? this.field3948 : var3.field24;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)Z")
    public final boolean method1542(int arg0, int arg1) {
        field3949++;
        if (this.field3927 == null) {
            return false;
        }
        if (this.field3926 == null) {
            this.method1545(3365);
        }
        class2 var3 = (class2) this.field3926.method1698((long) arg0, (byte) 109);
        if (arg1 > -47) {
            return true;
        } else {
            return var3 != null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILqk;)V")
    public final void method1543(int arg0, class200 arg1) {
        while (true) {
            int var3 = arg1.method1408((byte) -64);
            if (var3 == 0) {
                if (arg0 >= -24) {
                    this.field3940 = 23;
                }
                field3931++;
                return;
            }
            this.method1550(3, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLqk;)Lsf;")
    public static final class93 method1544(byte arg0, class200 arg1) {
        field3929++;
        return arg0 >= 0 ? null : new class93(arg1.method1421((byte) -33), arg1.method1421((byte) 120), arg1.method1421((byte) -33), arg1.method1421((byte) 109), arg1.method1405(-3), arg1.method1405(-3), arg1.method1408((byte) -110));
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)V")
    private final void method1545(int arg0) {
        this.field3926 = new class252(this.field3927.method1707(98048));
        if (arg0 != 3365) {
            return;
        }
        for (class2 var2 = (class2) this.field3927.method1709(-69); var2 != null; var2 = (class2) this.field3927.method1704(-97)) {
            class2 var3 = new class2((int) var2.field3759);
            this.field3926.method1699(-28407, var3, (long) var2.field24);
        }
        field3937++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILbj;I)[Lmk;")
    public static final class101[] method1546(int arg0, class151 arg1, int arg2) {
        field3925++;
        if (arg0 != 13139) {
            field3928 = null;
        }
        return class81.method570(14, arg1, arg2) ? class247.method1674(arg0 ^ 0x3351) : null;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(II)Lob;")
    public static final class127 method1547(int arg0, int arg1) {
        field3935++;
        class127 var2 = (class127) class191.field3395.method701((byte) -118, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class195.field3505.method1084((byte) -123, class80.method560(arg0, (byte) 23), class189.method1298(9651, arg0));
        class127 var4 = new class127();
        if (arg1 > -116) {
            field3928 = null;
        }
        var4.field2456 = arg0;
        if (var3 != null) {
            var4.method893(-30, new class200(var3));
        }
        class191.field3395.method696((long) arg0, var4, (byte) -96);
        return var4;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)Ljd;")
    public final class86 method1548(byte arg0, int arg1) {
        field3939++;
        if (this.field3927 == null) {
            return this.field3944;
        }
        class232 var3 = (class232) this.field3927.method1698((long) arg1, (byte) 123);
        if (arg0 < 58) {
            method1551(-107, (class86) null, (class86) null, true);
        }
        return var3 == null ? this.field3944 : var3.field4205;
    }

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)V")
    public static void method1549(int arg0) {
        field3945 = null;
        if (arg0 != 0) {
            return;
        }
        field3946 = null;
        field3928 = null;
        field3930 = null;
        field3942 = null;
        field3943 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILqk;I)V")
    private final void method1550(int arg0, class200 arg1, int arg2) {
        if (arg0 != 3) {
            return;
        }
        if (arg2 == 1) {
            this.field3940 = arg1.method1408((byte) -26);
        } else if (arg2 == 2) {
            this.field3933 = arg1.method1408((byte) -38);
        } else if (arg2 == 3) {
            this.field3944 = arg1.method1376((byte) 24);
        } else if (arg2 == 4) {
            this.field3948 = arg1.method1386(-4603);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method1410(-85);
            this.field3927 = new class252(class156.method1139(var4, -80));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1386(-4603);
                class207 var7;
                if (arg2 == 5) {
                    var7 = new class232(arg1.method1376((byte) 24));
                } else {
                    var7 = new class2(arg1.method1386(arg0 - 4606));
                }
                this.field3927.method1699(-28407, var7, (long) var6);
            }
        }
        field3934++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjd;Ljd;Z)V")
    public static final void method1551(int arg0, class86 arg1, class86 arg2, boolean arg3) {
        class56.field1152 = arg1;
        class56.field1150 = arg2;
        field3947++;
        class257.field4552 = arg0;
        if (class56.field1152.method625((byte) 30, class56.field1155) || class56.field1150.method625((byte) -116, class56.field1155)) {
            class185.field3282 = 3;
        } else if (class147.field2766 == -1) {
            class97.field1926 = 0;
            class7.field254 = 1;
            class185.field3282 = -3;
            class200 var4 = new class200(128);
            var4.method1388(-39, 10);
            var4.method1428((byte) -111, (int) (Math.random() * 99999.0D));
            var4.method1428((byte) -110, 514);
            var4.method1399((byte) -4, class56.field1152.method622(-2));
            if (arg3) {
                var4.method1406(1472534024, (int) (Math.random() * 9.9999999E7D));
                var4.method1379(0, class56.field1150);
                var4.method1406(1472534024, (int) (Math.random() * 9.9999999E7D));
                var4.method1385(0, class81.field1586, class132.field2499);
                class36.field809.field3565 = 0;
                class36.field809.method1388(-119, 48);
                class36.field809.method1388(-45, var4.field3565);
                class36.field809.method1423(var4.field3565, (byte) 57, var4.field3547, 0);
            }
        } else {
            class205.method1464(false);
        }
    }
}
