import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class203 {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field3430 = 0;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[[Z")
    public static boolean[][] field3431 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Lbd;")
    public static class162 field3434 = class17.method142(0, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Z")
    public static boolean field3439 = true;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Z")
    public static boolean field3440 = false;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field3443 = -1;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "Lbd;")
    public static class162 field3441 = class17.method142(0, "underlay");

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Lda;")
    public static class143 field3435;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Lda;")
    public static class143 field3436;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lbd;B)V", line = 5)
    public static final void method1508(class162 arg0, byte arg1) {
        field3432++;
        int var2 = class12.method108(arg0, false);
        if (var2 == -1) {
            return;
        }
        class86.field1527 = class9.field112.field531[var2] - class290.field4893;
        int var3 = -17 % ((76 - arg1) / 40);
        class59.field922 = class9.field114 + class87.field1536 - class9.field112.field535[var2] - 1;
        int var4 = class86.field1527 - ((int) ((float) class314.field5304.field1340 / class149.field2689));
        int var5 = (int) ((float) class314.field5304.field1340 / class149.field2689) + class86.field1527;
        if (var4 < 0) {
            class86.field1527 = (int) ((float) class314.field5304.field1340 / class149.field2689);
        }
        if (class304.field5132 < var5) {
            class86.field1527 = class304.field5132 - ((int) ((float) class314.field5304.field1340 / class149.field2689));
        }
        int var6 = class59.field922 - ((int) ((float) class314.field5304.field1367 / class149.field2689));
        int var7 = (int) ((float) class314.field5304.field1367 / class149.field2689) + class59.field922;
        if (var6 < 0) {
            class59.field922 = (int) ((float) class314.field5304.field1367 / class149.field2689);
        }
        if (var7 > class9.field114) {
            class59.field922 = class9.field114 - (int) ((float) class314.field5304.field1367 / class149.field2689);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 55)
    public static final void method1509(int arg0) {
        field3438++;
        if (class201.field3415 == 0) {
            return;
        }
        try {
            int var1 = -38 % ((arg0 + 38) / 59);
            if ((++class213.field3569) > 1500) {
                if (class116.field2054 != null) {
                    class116.field2054.method1829((byte) 4);
                    class116.field2054 = null;
                }
                if (class116.field2073 >= 1) {
                    class217.field3620 = -5;
                    class201.field3415 = 0;
                    return;
                }
                class213.field3569 = 0;
                class116.field2073++;
                if (class171.field2962 == class156.field2745) {
                    class156.field2745 = class19.field310;
                } else {
                    class156.field2745 = class171.field2962;
                }
                class201.field3415 = 1;
            }
            if (class201.field3415 == 1) {
                class71.field1132 = client.field1903.method237(class156.field2745, -6303, class83.field1441);
                class201.field3415 = 2;
            }
            if (class201.field3415 == 2) {
                if (class71.field1132.field2934 == 2) {
                    throw new IOException();
                }
                if (class71.field1132.field2934 != 1) {
                    return;
                }
                class116.field2054 = new class267((Socket) class71.field1132.field2933, client.field1903);
                class71.field1132 = null;
                class116.field2054.method1827(0, 83, class187.field3229.field1681, class187.field3229.field1653);
                if (class268.field4484 != null) {
                    class268.field4484.method458((byte) -74);
                }
                if (class247.field4100 != null) {
                    class247.field4100.method458((byte) -74);
                }
                int var2 = class116.field2054.method1832(25831);
                if (class268.field4484 != null) {
                    class268.field4484.method458((byte) -74);
                }
                if (class247.field4100 != null) {
                    class247.field4100.method458((byte) -74);
                }
                if (var2 != 101) {
                    class201.field3415 = 0;
                    class217.field3620 = var2;
                    class116.field2054.method1829((byte) 4);
                    class116.field2054 = null;
                    return;
                }
                class201.field3415 = 3;
            }
            if (class201.field3415 == 3) {
                if (class116.field2054.method1826(90) >= 2) {
                    int var3 = class116.field2054.method1832(25831) << 8 | class116.field2054.method1832(25831);
                    class263.method1809(var3, 1);
                    if (class212.field3566 == -1) {
                        class201.field3415 = 0;
                        class217.field3620 = 6;
                        class116.field2054.method1829((byte) 4);
                        class116.field2054 = null;
                        return;
                    }
                    class201.field3415 = 0;
                    class116.field2054.method1829((byte) 4);
                    class116.field2054 = null;
                    class270.method1847((byte) -16);
                    return;
                }
                return;
            }
        } catch (IOException var5) {
            if (class116.field2054 != null) {
                class116.field2054.method1829((byte) 4);
                class116.field2054 = null;
            }
            if (class116.field2073 >= 1) {
                class217.field3620 = -4;
                class201.field3415 = 0;
            } else {
                class213.field3569 = 0;
                if (class171.field2962 == class156.field2745) {
                    class156.field2745 = class19.field310;
                } else {
                    class156.field2745 = class171.field2962;
                }
                class116.field2073++;
                class201.field3415 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BII)V", line = 200)
    public static final void method1510(byte arg0, int arg1, int arg2) {
        field3442++;
        if (class135.field2413 != 0 && arg1 != -1) {
            class252.method1759((byte) -56, class67.field1081, class135.field2413, arg1, 0, false);
            class127.field2307 = true;
        }
        int var3 = -102 % ((-arg0 - 45) / 63);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)Lbd;", line = 226)
    public static final class162 method1511(byte arg0, int arg1) {
        class162 var2 = new class162();
        if (arg0 < 59) {
            field3443 = 16;
        }
        var2.field2817 = new byte[arg1];
        field3437++;
        var2.field2865 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZIBIII)V", line = 267)
    public static final void method1512(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var6 = 44 % ((29 - arg2) / 55);
        if (arg5 < 1) {
            arg5 = 1;
        }
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (class117.field2159) {
            int var7 = arg4 - 334;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 100) {
                var7 = 100;
            }
            int var8 = (class34.field559 - class7.field71) * var7 / 100 + class7.field71;
            if (class15.field236 > var8) {
                var8 = class15.field236;
            } else if (class251.field4200 < var8) {
                var8 = class251.field4200;
            }
            int var9 = arg4 * var8 * 512 / (arg5 * 334);
            if (var9 < class183.field3164) {
                short var13 = class183.field3164;
                var8 = arg5 * var13 * 334 / (arg4 * 512);
                if (var8 > class251.field4200) {
                    var8 = class251.field4200;
                    int var14 = arg4 * var8 * 512 / (var13 * 334);
                    int var15 = (arg5 - var14) / 2;
                    if (arg0) {
                        class16.method122();
                        class16.method124(arg3, arg1, var15, arg4, 0);
                        class16.method124(arg3 + arg5 - var15, arg1, var15, arg4, 0);
                    }
                    arg3 += var15;
                    arg5 -= var15 * 2;
                }
            } else if (var9 > class167.field2938) {
                short var10 = class167.field2938;
                var8 = arg5 * var10 * 334 / (arg4 * 512);
                if (var8 < class15.field236) {
                    var8 = class15.field236;
                    int var11 = arg5 * var10 * 334 / (var8 * 512);
                    int var12 = (arg4 - var11) / 2;
                    if (arg0) {
                        class16.method122();
                        class16.method124(arg3, arg1, arg5, var12, 0);
                        class16.method124(arg3, arg4 + arg1 - var12, arg5, var12, 0);
                    }
                    arg1 += var12;
                    arg4 -= var12 * 2;
                }
            }
            class31.field522 = arg4 * var8 / 334;
        }
        class217.field3625 = arg3;
        class60.field925 = (short) arg5;
        field3433++;
        class142.field2525 = (short) arg4;
        class268.field4475 = arg1;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 372)
    public static void method1513(int arg0) {
        field3434 = null;
        field3435 = null;
        int var1 = 110 % ((arg0 - 71) / 33);
        field3436 = null;
        field3441 = null;
        field3431 = (boolean[][]) null;
    }
}
