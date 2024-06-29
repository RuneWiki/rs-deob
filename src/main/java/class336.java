import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class336 {

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "Lwo;")
    public static class690 field4466 = new class690(28, 6);

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V", line = 10)
    public static void method1937(boolean arg0) {
        if (arg0) {
            method1938(-66);
        }
        field4466 = null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 23)
    public static final void method1938(int arg0) {
        field4464++;
        class500.field6991 = null;
        class167.method1057(-1, class300.field4038, class467.field6533, arg0, 0, 0, -126, class127.field1619, 0);
        if (class500.field6991 != null) {
            class160.method1017(class467.field6533, class54.field873, 15, class441.field6296.field406, class300.field4038, class500.field6991, 0, class54.field868, -1412584499, 0);
            class500.field6991 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V", line = 38)
    public static final void method1939(byte arg0) {
        field4465++;
        if (class221.field2851.method1757(class375.field5039, true) != 2) {
            return;
        }
        byte var1 = (byte) (class114.field1478 - 4 & 0xFF);
        if (arg0 != -59) {
            method1938(-108);
        }
        int var2 = class114.field1478 % class473.field6604;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class205.field2465; var18++) {
                class257.field3493[var3][var2][var18] = var1;
            }
        }
        if (class617.field8853 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class137.field1736[var4] = -1000000;
            class368.field4958[var4] = 1000000;
            class637.field9119[var4] = 0;
            class608.field8735[var4] = 1000000;
            class642.field9170[var4] = 0;
        }
        int var5 = class206.field2472.field530;
        int var6 = class206.field2472.field531;
        if (class586.field8507 != 1 && class51.field842 == -1) {
            int var7 = class589.method3416(class346.field4550, -29, class617.field8853, class627.field8995);
            if ((var7 - class614.field8846) < 3200 && (class73.field1104[class617.field8853][class346.field4550 >> 9][class627.field8995 >> 9] & 0x4) != 0) {
                class114.method821(class627.field8995 >> 9, class281.field3808, false, class346.field4550 >> 9, 1, 61);
                return;
            }
            return;
        }
        if (class586.field8507 != 1) {
            var5 = class51.field842;
            var6 = class221.field2860;
        }
        if ((class73.field1104[class617.field8853][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class114.method821(var6 >> 9, class281.field3808, false, var5 >> 9, 0, 108);
        }
        if (class569.field8329 >= 2560) {
            return;
        }
        int var8 = class346.field4550 >> 9;
        int var9 = class627.field8995 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var10 > var8) {
            var12 = var10 - var8;
        } else {
            var12 = var8 - var10;
        }
        int var13;
        if (var9 >= var11) {
            var13 = var9 - var11;
        } else {
            var13 = var11 - var9;
        }
        if (var12 == 0 && var13 == 0 || var12 <= -class473.field6604 || class473.field6604 <= var12 || var13 <= (-class205.field2465) || class205.field2465 <= var13) {
            class544.method3184(23383, "RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class36.field689 + "," + class88.field1239, null);
            return;
        }
        if (var13 < var12) {
            int var14 = var13 * 65536 / var12;
            int var15 = 32768;
            while (var8 != var10) {
                if (var8 < var10) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                if ((class73.field1104[class617.field8853][var8][var9] & 0x4) != 0) {
                    class114.method821(var9, class281.field3808, false, var8, 1, 39);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    if (var11 > var9) {
                        var9++;
                    } else if (var11 < var9) {
                        var9--;
                    }
                    var15 -= 65536;
                    if ((class73.field1104[class617.field8853][var8][var9] & 0x4) != 0) {
                        class114.method821(var9, class281.field3808, false, var8, 1, 47);
                        return;
                    }
                }
            }
            return;
        }
        int var16 = var12 * 65536 / var13;
        int var17 = 32768;
        while (var9 != var11) {
            if (var11 > var9) {
                var9++;
            } else if (var9 > var11) {
                var9--;
            }
            if ((class73.field1104[class617.field8853][var8][var9] & 0x4) != 0) {
                class114.method821(var9, class281.field3808, false, var8, 1, 85);
                return;
            }
            var17 += var16;
            if (var17 >= 65536) {
                var17 -= 65536;
                if (var10 > var8) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                if ((class73.field1104[class617.field8853][var8][var9] & 0x4) != 0) {
                    class114.method821(var9, class281.field3808, false, var8, 1, 109);
                    return;
                }
            }
        }
    }
}
