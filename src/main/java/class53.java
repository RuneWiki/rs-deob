import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class53 extends class130 {

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "Z")
    public boolean field815 = false;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public int field824 = -1;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field810 = -1;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "Lfi;")
    public static class38 field817 = null;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "Lpn;")
    public static class49 field814 = new class49(39, 15);

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "Ljp;")
    public static class55 field822 = new class55(66, -2);

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public int field820;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "Lwk;")
    public static class329 field819;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static void method348(int arg0) {
        int var1 = -121 % ((arg0 + 85) / 38);
        field817 = null;
        field822 = null;
        field814 = null;
        field819 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZILuu;)V")
    public static final void method349(boolean arg0, int arg1, class428 arg2) {
        class508.field7402 = false;
        field811++;
        class342.field5111 = 0;
        class105.method840(arg2, arg0);
        class423.method2633(127, arg2);
        if (class508.field7402) {
            System.out.println("---endgpp---");
        }
        if (arg2.field2982 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg2.field2982 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
    public static final void method350(boolean arg0) {
        field813++;
        if (class40.field667.method418(-43, class108.field1631) != 2) {
            return;
        }
        byte var1 = (byte) (class334.field5036 - 4 & 0xFF);
        int var2 = class334.field5036 % class338.field5076;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class250.field4077; var16++) {
                class107.field1627[var3][var2][var16] = var1;
            }
        }
        if (class30.field370 == 3) {
            return;
        }
        int var4 = 0;
        if (!arg0) {
            field821 = 3;
        }
        while (var4 < 2) {
            class107.field1629[var4] = -1000000;
            class529.field7736[var4] = 1000000;
            class42.field675[var4] = 0;
            class474.field6951[var4] = 1000000;
            class316.field4820[var4] = 0;
            var4++;
        }
        if (class33.field401 != 1) {
            int var15 = class416.method2605(class406.field5999, class128.field1917, (byte) -21, class30.field370);
            if (var15 - class505.field7344 >= 800 || (class229.field3460[class30.field370][class128.field1917 >> 7][class406.field5999 >> 7] & 0x4) == 0) {
                return;
            }
            class5.method25(class406.field5999 >> 7, false, 31386, class348.field5192, class128.field1917 >> 7, 1);
            return;
        }
        if ((class229.field3460[class30.field370][class116.field1781.field1275 >> 7][class116.field1781.field1279 >> 7] & 0x4) != 0) {
            class5.method25(class116.field1781.field1279 >> 7, false, 31386, class348.field5192, class116.field1781.field1275 >> 7, 0);
        }
        if (class430.field6377 >= 2560) {
            return;
        }
        int var5 = class128.field1917 >> 7;
        int var6 = class406.field5999 >> 7;
        int var7 = class116.field1781.field1275 >> 7;
        int var8 = class116.field1781.field1279 >> 7;
        int var9;
        if (var5 < var7) {
            var9 = var7 - var5;
        } else {
            var9 = var5 - var7;
        }
        int var10;
        if (var8 <= var6) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        if ((var9 != 0 || var10 != 0) && (-class338.field5076) < var9 && var9 < class338.field5076 && (-class250.field4077) < var10 && class250.field4077 > var10) {
            if (var9 <= var10) {
                int var11 = var9 * 65536 / var10;
                int var12 = 32768;
                while (var6 != var8) {
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    if ((class229.field3460[class30.field370][var5][var6] & 0x4) != 0) {
                        class5.method25(var6, false, 31386, class348.field5192, var5, 1);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var5 < var7) {
                            var5++;
                        } else if (var5 > var7) {
                            var5--;
                        }
                        if ((class229.field3460[class30.field370][var5][var6] & 0x4) != 0) {
                            class5.method25(var6, false, 31386, class348.field5192, var5, 1);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var10 * 65536 / var9;
            int var14 = 32768;
            while (var5 != var7) {
                if (var7 > var5) {
                    var5++;
                } else if (var5 > var7) {
                    var5--;
                }
                if ((class229.field3460[class30.field370][var5][var6] & 0x4) != 0) {
                    class5.method25(var6, false, 31386, class348.field5192, var5, 1);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var8 > var6) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    if ((class229.field3460[class30.field370][var5][var6] & 0x4) != 0) {
                        class5.method25(var6, false, 31386, class348.field5192, var5, 1);
                        return;
                    }
                }
            }
            return;
        }
        class197.method1407(true, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class422.field6201 + "," + class23.field273, null);
        return;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(I)V")
    public class53(int arg0) {
        this.field824 = arg0;
    }
}
