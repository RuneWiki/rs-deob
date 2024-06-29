import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class83 extends class101 {

    @OriginalMember(owner = "client!id", name = "E", descriptor = "Ltg;")
    public static class184 field1477 = class135.method812("zur-Uck auf die RuneScape)2Webseite gehen", 3);

    @OriginalMember(owner = "client!id", name = "S", descriptor = "Ltg;")
    public static class184 field1490 = class135.method812("::fps ", 3);

    @OriginalMember(owner = "client!id", name = "M", descriptor = "B")
    public byte field1485;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public int field1486;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "Lpb;")
    public static class143 field1489;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "Lud;")
    public class190 field1474;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "[I")
    public static int[] field1475;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "[I")
    public static int[] field1479;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "[I")
    public static int[] field1481;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static final void method462(int arg0) {
        while (true) {
            if (class21.field394.method104(false, class111.field2014) >= 27) {
                int var1 = class21.field394.method115(15, 104);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class52.field948[var1] == null) {
                        var2 = true;
                        class52.field948[var1] = new class158();
                    }
                    class158 var3 = class52.field948[var1];
                    class97.field1782[class38.field711++] = var1;
                    var3.field609 = class161.field2903;
                    int var4 = class21.field394.method115(1, 104);
                    if (var4 == 1) {
                        class103.field1881[class87.field1610++] = var1;
                    }
                    int var5 = class21.field394.method115(1, 104);
                    int var6 = class21.field394.method115(5, 104);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    var3.field2832 = class194.method1233(class21.field394.method115(14, 104), 32137);
                    int var7 = class153.field2740[class21.field394.method115(3, 104)];
                    if (var2) {
                        var3.field649 = var3.field647 = var7;
                    }
                    int var8 = class21.field394.method115(5, 104);
                    var3.field604 = var3.field2832.field794;
                    var3.field656 = var3.field2832.field774;
                    var3.field629 = var3.field2832.field797;
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.field626 = var3.field2832.field761;
                    var3.field636 = var3.field2832.field778;
                    var3.field651 = var3.field2832.field784;
                    var3.field627 = var3.field2832.field769;
                    if (var3.field636 == 0) {
                        var3.field647 = 0;
                    }
                    var3.field663 = var3.field2832.field781;
                    var3.field596 = var3.field2832.field795;
                    var3.method212(-9740, class46.field872.field615[0] + var8, class46.field872.field644[0] + var6, var5 == 1);
                    continue;
                }
            }
            class21.field394.method107((byte) -82);
            field1476++;
            if (arg0 >= -94) {
                field1477 = null;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZLj;I)V")
    public static final void method463(boolean arg0, class87 arg1, int arg2) {
        field1484++;
        if (class182.field3503 != null) {
            try {
                class182.field3503.method515(-116);
            } catch (Exception var8) {
            }
            class182.field3503 = null;
        }
        class182.field3503 = arg1;
        class168.method1046(arg0, (byte) -52);
        class47.field885 = null;
        class2.field55 = null;
        class60.field1111 = 0;
        class119.field2143.field1834 = 0;
        while (true) {
            class83 var3 = (class83) class212.field4101.method57(-19654);
            if (var3 == null) {
                while (true) {
                    class83 var4 = (class83) class175.field3318.method57(-19654);
                    if (var4 == null) {
                        if (class130.field2361 != 0) {
                            try {
                                class97 var5 = new class97(4);
                                var5.method583((byte) 14, 4);
                                var5.method583((byte) 14, class130.field2361);
                                var5.method589((byte) -103, 0);
                                class182.field3503.method514(4, 0, var5.field1809, -23422);
                            } catch (IOException var7) {
                                try {
                                    class182.field3503.method515(107);
                                } catch (Exception var6) {
                                }
                                class43.field828++;
                                class182.field3503 = null;
                            }
                        }
                        class14.field259 = arg2;
                        class66.field1273 = class24.method165(128);
                        return;
                    }
                    class2.field45.method922((byte) -76, var4);
                    class81.field1455.method55((byte) -89, var4, var4.field2393);
                    class146.field2638--;
                    class132.field2394++;
                }
            }
            class9.field159.method55((byte) -108, var3, var3.field2393);
            class73.field1370++;
            class6.field113--;
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
    public static void method464(int arg0) {
        field1490 = null;
        field1477 = null;
        field1475 = null;
        if (arg0 < -103) {
            field1481 = null;
            field1489 = null;
            field1479 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Lub;")
    public static final class188 method465(int arg0, int arg1) {
        field1487++;
        class188 var2 = (class188) class17.field316.method773((long) arg0, 1);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -1) {
            method462(-104);
        }
        byte[] var3 = class170.field3235.method1249((byte) -118, arg0, 12);
        class188 var4 = new class188();
        if (var3 != null) {
            var4.method1192(-1, new class97(var3));
        }
        var4.method1193(false);
        class17.field316.method776(var4, (long) arg0, (byte) 103);
        return var4;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([BI)[B")
    public static final byte[] method466(byte[] arg0, int arg1) {
        field1473++;
        class97 var2 = new class97(arg0);
        int var3 = var2.method588((byte) -106);
        int var4 = var2.method599(-16003);
        if (var4 < 0 || class168.field3147 != 0 && class168.field3147 < var4) {
            throw new RuntimeException();
        } else if (~var3 == arg1) {
            byte[] var5 = new byte[var4];
            var2.method571(0, arg1 ^ 0xFFFFFF00, var4, var5);
            return var5;
        } else {
            int var6 = var2.method599(-16003);
            if (var6 < 0 || class168.field3147 != 0 && class168.field3147 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class86.method505(var7, var6, arg0, var4, 9);
            } else {
                class66.field1262.method792(-25425, var2, var7);
            }
            return var7;
        }
    }
}
