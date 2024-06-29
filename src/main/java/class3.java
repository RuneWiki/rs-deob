import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class class3 extends class292 {

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "Z")
    public static boolean field49 = false;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field53 = new String[200];

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    public static int field50 = 0;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public int field42;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    public int field43;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    public int field46;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
    public int field48;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BIIII)V")
    public final void method37(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 71) {
            return;
        }
        field41++;
        int var6 = this.field46 << 3;
        int var7 = (arg3 << 4) + (var6 & 0xF);
        int var8 = this.field43 << 3;
        int var9 = (arg4 << 4) + (var8 & 0xF);
        this.method51(var6, var8, var7, var9, arg2, arg1);
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)V")
    public abstract void method38(int arg0, int arg1);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)V")
    public abstract void method39(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
    public abstract void method40(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIII)V")
    public abstract void method41(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)Lkd;")
    public static final class209 method42(byte arg0, int arg1) {
        field44++;
        if (class244.field3791 && arg1 >= class149.field2309 && class137.field2130 >= arg1) {
            int var2 = -43 % ((-arg0 - 23) / 51);
            return class276.field4356[arg1 - class149.field2309];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
    public static final void method43(int arg0) {
        field51++;
        int var1 = class259.field3977 * 128 + 64;
        int var2 = class98.field1566 * 128 + 64;
        int var3 = class224.method1502((byte) -126, class274.field4318, var2, var1) - class135.field2106;
        if (class28.field415 >= 100) {
            class69.field1100 = class98.field1566 * 128 + 64;
            class266.field4245 = class259.field3977 * 128 + 64;
            class295.field4631 = class224.method1502((byte) -125, class274.field4318, class69.field1100, class266.field4245) - class135.field2106;
        } else {
            if (class266.field4245 < var1) {
                class266.field4245 += (var1 - class266.field4245) * class28.field415 / 1000 + class111.field1754;
                if (var1 < class266.field4245) {
                    class266.field4245 = var1;
                }
            }
            if (var2 > class69.field1100) {
                class69.field1100 += (var2 - class69.field1100) * class28.field415 / 1000 + class111.field1754;
                if (class69.field1100 > var2) {
                    class69.field1100 = var2;
                }
            }
            if (class69.field1100 > var2) {
                class69.field1100 -= (class69.field1100 - var2) * class28.field415 / 1000 + class111.field1754;
                if (class69.field1100 < var2) {
                    class69.field1100 = var2;
                }
            }
            if (class295.field4631 < var3) {
                class295.field4631 += (var3 - class295.field4631) * class28.field415 / 1000 + class111.field1754;
                if (var3 < class295.field4631) {
                    class295.field4631 = var3;
                }
            }
            if (class295.field4631 > var3) {
                class295.field4631 -= (class295.field4631 - var3) * class28.field415 / 1000 + class111.field1754;
                if (class295.field4631 < var3) {
                    class295.field4631 = var3;
                }
            }
            if (var1 < class266.field4245) {
                class266.field4245 -= class111.field1754 + ((class266.field4245 - var1) * class28.field415 / 1000);
                if (var1 > class266.field4245) {
                    class266.field4245 = var1;
                }
            }
        }
        int var4 = class180.field2685 * 128 + 64;
        int var5 = class278.field4379 * 128 + 64;
        int var6 = class224.method1502((byte) -128, class274.field4318, var4, var5) - class283.field4473;
        int var7 = var5 - class266.field4245;
        int var8 = var4 - class69.field1100;
        int var9 = var6 - class295.field4631;
        if (arg0 != 1000) {
            method46(66, -32, -46);
        }
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var8)) & 0x7FF;
        int var13 = var12 - class142.field2182;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var11 > class25.field373) {
            class25.field373 += class123.field1895 + ((var11 - class25.field373) * class189.field3014 / 1000);
            if (var11 < class25.field373) {
                class25.field373 = var11;
            }
        }
        if (var13 > 0) {
            class142.field2182 += class189.field3014 * var13 / 1000 + class123.field1895;
            class142.field2182 &= 0x7FF;
        }
        if (var13 < 0) {
            class142.field2182 -= class123.field1895 + (-var13 * class189.field3014 / 1000);
            class142.field2182 &= 0x7FF;
        }
        int var14 = var12 - class142.field2182;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class142.field2182 = var12;
        }
        if (class25.field373 <= var11) {
            return;
        }
        class25.field373 -= (class25.field373 - var11) * class189.field3014 / 1000 + class123.field1895;
        if (var11 > class25.field373) {
            class25.field373 = var11;
            return;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(Z)V")
    public static void method44(boolean arg0) {
        field53 = null;
        if (arg0) {
            field53 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(II)V")
    public abstract void method45(int arg0, int arg1);

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(III)Laa;")
    public static final class172 method46(int arg0, int arg1, int arg2) {
        class23 var3 = class255.field3907[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field360; var4++) {
            class172 var5 = var3.field358[var4];
            if ((var5.field2569 >> 29 & 0x3L) == 2L && var5.field2558 == arg1 && var5.field2560 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZB)V")
    public static final void method47(boolean arg0, byte arg1) {
        if (arg0) {
            if (class34.field544 != -1) {
                class154.method1037(class34.field544, (byte) -35);
            }
            for (class120 var2 = (class120) class13.field230.method1410(arg1 ^ 0x47); var2 != null; var2 = (class120) class13.field230.method1413(-1)) {
                class249.method1672(true, (byte) 97, var2);
            }
            class34.field544 = -1;
            class13.field230 = new class211(8);
            class8.method92((byte) 99);
            class34.field544 = class16.field264;
            class109.method819(-58, false);
            class172.method1139(100);
            class208.method1394(class34.field544, (byte) -124);
        }
        class119.field1835 = -1;
        field45++;
        class81.method635(class102.field1627, (byte) 114);
        class261.field4058 = new class28();
        class261.field4058.field4176 = 3000;
        class261.field4058.field4123 = 3000;
        if (class154.field2352 == 0) {
            class119.method856(class90.field1459, true);
            class77.method609(arg1 + 54, 10);
        } else {
            if (class6.field111 == 2) {
                class266.field4245 = class259.field3977 << 7;
                class69.field1100 = class98.field1566 << 7;
            } else {
                class272.method1836((byte) -48);
            }
            class189.method1278(false);
            class77.method609(10, 28);
        }
        if (arg1 != -44) {
            field53 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(II)I")
    public static int method48(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(II)V")
    public abstract void method49(int arg0, int arg1);

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)Lli;")
    public static final class297 method50(byte arg0) {
        if (arg0 != -41) {
            method46(-14, 71, -71);
        }
        field47++;
        return class87.field1422;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIII)V")
    public abstract void method51(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
