import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class169 {

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field2755 = 0;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field2753 = 0;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static final void method1229(int arg0) {
        field2754++;
        if (class128.method910(16) != 2 || arg0 < 0) {
            return;
        }
        byte var1 = (byte) (class286.field4575 - 4 & 0xFF);
        int var2 = class286.field4575 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class151.field2369[var3][var2][var16] = var1;
            }
        }
        if (class56.field941 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class25.field307[var4] = -1000000;
            class56.field927[var4] = 1000000;
            class155.field2420[var4] = 0;
            class96.field1550[var4] = 1000000;
            class92.field1480[var4] = 0;
        }
        if (class120.field1919 != 1) {
            int var5 = class155.method1060((byte) -12, class56.field941, class104.field1666, class148.field2314);
            if ((var5 - class46.field776) < 800 && (class301.field4818[class56.field941][class148.field2314 >> 7][class104.field1666 >> 7] & 0x4) != 0) {
                class256.method1724(false, 1, class104.field1666 >> 7, class148.field2314 >> 7, class218.field3584, (byte) 73);
                return;
            }
            return;
        }
        if ((class301.field4818[class56.field941][class239.field3829.field637 >> 7][class239.field3829.field710 >> 7] & 0x4) != 0) {
            class256.method1724(false, 0, class239.field3829.field710 >> 7, class239.field3829.field637 >> 7, class218.field3584, (byte) 73);
        }
        if (class264.field4245 >= 310) {
            return;
        }
        int var6 = class104.field1666 >> 7;
        int var7 = class148.field2314 >> 7;
        int var8 = class239.field3829.field637 >> 7;
        int var9 = class239.field3829.field710 >> 7;
        int var10;
        if (var7 >= var8) {
            var10 = var7 - var8;
        } else {
            var10 = var8 - var7;
        }
        int var11;
        if (var6 >= var9) {
            var11 = var6 - var9;
        } else {
            var11 = var9 - var6;
        }
        if (var10 == 0 && var11 == 0 || var10 <= -104 || var10 >= 104 || var11 <= -104 || var11 >= 104) {
            class19.method94(-105, (Throwable) null, "RC: " + var7 + "," + var6 + " " + var8 + "," + var9 + " " + class276.field4438 + "," + class108.field1732);
            return;
        }
        if (var10 <= var11) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var6 != var9) {
                if (var6 < var9) {
                    var6++;
                } else if (var6 > var9) {
                    var6--;
                }
                if ((class301.field4818[class56.field941][var7][var6] & 0x4) != 0) {
                    class256.method1724(false, 1, var6, var7, class218.field3584, (byte) 73);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    if (var8 > var7) {
                        var7++;
                    } else if (var7 > var8) {
                        var7--;
                    }
                    var13 -= 65536;
                    if ((class301.field4818[class56.field941][var7][var6] & 0x4) != 0) {
                        class256.method1724(false, 1, var6, var7, class218.field3584, (byte) 73);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var11 * 65536 / var10;
        int var15 = 32768;
        while (var7 != var8) {
            if (var7 < var8) {
                var7++;
            } else if (var7 > var8) {
                var7--;
            }
            if ((class301.field4818[class56.field941][var7][var6] & 0x4) != 0) {
                class256.method1724(false, 1, var6, var7, class218.field3584, (byte) 73);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                var15 -= 65536;
                if (var9 > var6) {
                    var6++;
                } else if (var9 < var6) {
                    var6--;
                }
                if ((class301.field4818[class56.field941][var7][var6] & 0x4) != 0) {
                    class256.method1724(false, 1, var6, var7, class218.field3584, (byte) 73);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)Z")
    public static final boolean method1230(int arg0, int arg1) {
        int var2 = 106 / ((arg0 + 33) / 48);
        field2752++;
        return (-arg1 & arg1) == arg1;
    }
}
