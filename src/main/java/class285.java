import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class285 extends class88 {

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "Ljava/lang/String;")
    private String field4541 = "null";

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public static int field4538 = 0;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "Z")
    public static boolean field4525 = true;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public static int field4530 = 0;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    public static int field4544 = 0;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "C")
    public char field4528;

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "C")
    public char field4547;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    private int field4526;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!ge", name = "cb", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "Lsb;")
    public class110 field4524;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "Lsb;")
    private class110 field4532;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "Lua;")
    public static class267 field4545;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
    private final void method1903(byte arg0) {
        field4534++;
        this.field4532 = new class110(this.field4524.method704((byte) 112));
        if (arg0 <= 125) {
            method1910((Component) null, (byte) -94);
        }
        for (class122 var2 = (class122) this.field4524.method710((byte) -29); var2 != null; var2 = (class122) this.field4524.method709(false)) {
            class122 var3 = new class122((int) var2.field3923);
            this.field4532.method707((long) var2.field1733, var3, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1904(String arg0, int arg1) {
        field4543++;
        if (this.field4524 == null) {
            return false;
        }
        if (this.field4532 == null) {
            this.method1912(-44);
        }
        if (arg1 < 83) {
            method1909((byte) -40);
        }
        for (class114 var3 = (class114) this.field4532.method708(class145.method1012((byte) -126, arg0), 32); var3 != null; var3 = (class114) this.field4532.method702((byte) 84)) {
            if (var3.field1636.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)Ljava/lang/String;")
    public final String method1905(int arg0, int arg1) {
        if (arg0 <= 36) {
            this.method1904((String) null, 93);
        }
        field4533++;
        if (this.field4524 == null) {
            return this.field4541;
        } else {
            class207 var3 = (class207) this.field4524.method708((long) arg1, 15);
            return var3 == null ? this.field4541 : var3.field3312;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)Z")
    public final boolean method1906(boolean arg0, int arg1) {
        field4548++;
        if (this.field4524 == null) {
            return false;
        }
        if (this.field4532 == null) {
            this.method1903((byte) 127);
        }
        class122 var3 = (class122) this.field4532.method708((long) arg1, 120);
        if (arg0) {
            return false;
        } else {
            return var3 != null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILpd;B)V")
    private final void method1907(int arg0, class96 arg1, byte arg2) {
        if (arg2 != 46) {
            method1908(25, -83, true);
        }
        field4546++;
        if (arg0 == 1) {
            this.field4528 = class161.method1123((byte) -27, arg1.method587(arg2 ^ 0xFFFFFF85));
        } else if (arg0 == 2) {
            this.field4547 = class161.method1123((byte) -27, arg1.method587(arg2 ^ 0x43));
        } else if (arg0 == 3) {
            this.field4541 = arg1.method588(false);
        } else if (arg0 == 4) {
            this.field4526 = arg1.method597(arg2 - 1197332614);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method549(arg2 ^ 0xD1);
            this.field4524 = new class110(class137.method923(-122, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method597(-1197332568);
                class237 var7;
                if (arg0 == 5) {
                    var7 = new class207(arg1.method588(false));
                } else {
                    var7 = new class122(arg1.method597(-1197332568));
                }
                this.field4524.method707((long) var6, var7, (byte) 120);
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIZ)I")
    public static final int method1908(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1914(13, -11, 53);
        }
        field4542++;
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)Lib;")
    public static final class56 method1909(byte arg0) {
        int var1 = class172.field2726[0] * class103.field1387[0];
        field4535++;
        byte[] var2 = class293.field4645[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class172.field2729[class173.method1186(255, var2[var4])];
        }
        class227 var5 = new class227(class286.field4562, class245.field4018, class40.field493[0], class129.field2072[0], class103.field1387[0], class172.field2726[0], var3);
        if (arg0 != -122) {
            field4544 = -93;
        }
        class24.method135(-113);
        return var5;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1910(Component arg0, byte arg1) {
        arg0.removeKeyListener(class118.field1671);
        arg0.removeFocusListener(class118.field1671);
        field4537++;
        if (arg1 < -90) {
            class275.field4389 = -1;
        }
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)V")
    public static void method1911(byte arg0) {
        field4545 = null;
        if (arg0 > -59) {
            field4538 = 13;
        }
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
    private final void method1912(int arg0) {
        this.field4532 = new class110(this.field4524.method704((byte) 114));
        field4531++;
        class207 var2 = (class207) this.field4524.method710((byte) -85);
        int var3 = 67 / ((46 - arg0) / 37);
        while (var2 != null) {
            class114 var4 = new class114(var2.field3312, (int) var2.field3923);
            this.field4532.method707(class145.method1012((byte) 94, var2.field3312), var4, (byte) 120);
            var2 = (class207) this.field4524.method709(false);
        }
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V")
    public static final void method1913(int arg0) {
        class190.method1322(class95.field1201, arg0 + 1050);
        int var1 = (class74.field932 >> 10) + (class167.field2683 >> 3);
        field4529++;
        int var2 = (class36.field465 >> 10) + (class181.field2883 >> 3);
        byte var3 = 0;
        if (arg0 != 21339) {
            field4536 = 112;
        }
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class209.field3343 = new byte[var6][];
        class156.field2520 = new int[var6];
        class39.field487 = new int[var6][4];
        class281.field4451 = new byte[var6][];
        class274.field4374 = new int[var6];
        class250.field4083 = new int[var6];
        class121.field1713 = new byte[var6][];
        class117.field1662 = new int[var6];
        class131.field2091 = new int[var6];
        class86.field1056 = new int[var6];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
            for (int var10 = (var2 - 6) / 8; var10 <= ((var2 + 6) / 8); var10++) {
                int var11 = (var8 << 8) + var10;
                class86.field1056[var7] = var11;
                class156.field2520[var7] = class137.field2191.method929((byte) 121, "m" + var8 + "_" + var10);
                class117.field1662[var7] = class137.field2191.method929((byte) -127, "l" + var8 + "_" + var10);
                class250.field4083[var7] = class137.field2191.method929((byte) -46, "n" + var8 + "_" + var10);
                class274.field4374[var7] = class137.field2191.method929((byte) 125, "um" + var8 + "_" + var10);
                class131.field2091[var7] = class137.field2191.method929((byte) 126, "ul" + var8 + "_" + var10);
                if (class250.field4083[var7] == -1) {
                    class156.field2520[var7] = -1;
                    class117.field1662[var7] = -1;
                    class274.field4374[var7] = -1;
                    class131.field2091[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class250.field4083.length; var9++) {
            class250.field4083[var9] = -1;
            class156.field2520[var9] = -1;
            class117.field1662[var9] = -1;
            class274.field4374[var9] = -1;
            class131.field2091[var9] = -1;
        }
        class117.method757(true, var5, var4, var1, -71, var2, var3, false);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Lgd;")
    public static final class128 method1914(int arg0, int arg1, int arg2) {
        class246 var3 = class46.field585[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4054;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)I")
    public final int method1915(byte arg0, int arg1) {
        field4527++;
        if (this.field4524 == null) {
            return this.field4526;
        } else if (arg0 < 57) {
            return 102;
        } else {
            class122 var3 = (class122) this.field4524.method708((long) arg1, -13);
            return var3 == null ? this.field4526 : var3.field1733;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lpd;I)V")
    public final void method1916(class96 arg0, int arg1) {
        if (arg1 >= -30) {
            this.field4541 = null;
        }
        field4540++;
        while (true) {
            int var3 = arg0.method584(255);
            if (var3 == 0) {
                return;
            }
            this.method1907(var3, arg0, (byte) 46);
        }
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V")
    public static final void method1917(int arg0) {
        field4539++;
        if (class261.field4227 == 0) {
            return;
        }
        try {
            if ((++class220.field3528) > 2000) {
                if (class28.field400 != null) {
                    class28.field400.method1210(-1);
                    class28.field400 = null;
                }
                if (class265.field4265 >= 1) {
                    class261.field4227 = 0;
                    class86.field1062 = -5;
                    return;
                }
                class261.field4227 = 1;
                class265.field4265++;
                class220.field3528 = 0;
                if (class20.field253 == class178.field2833) {
                    class178.field2833 = class42.field528;
                } else {
                    class178.field2833 = class20.field253;
                }
            }
            if (class261.field4227 == 1) {
                class108.field1455 = class194.field3107.method269((byte) 122, class178.field2833, class180.field2860);
                class261.field4227 = 2;
            }
            if (class261.field4227 == 2) {
                if (class108.field1455.field3995 == 2) {
                    throw new IOException();
                }
                if (class108.field1455.field3995 != 1) {
                    return;
                }
                class28.field400 = new class175((Socket) class108.field1455.field3992, class194.field3107);
                class108.field1455 = null;
                class28.field400.method1211(class4.field57.field1228, true, 0, class4.field57.field1218);
                if (class128.field2048 != null) {
                    class128.field2048.method155(0);
                }
                if (class47.field597 != null) {
                    class47.field597.method155(0);
                }
                int var1 = class28.field400.method1216((byte) 29);
                if (class128.field2048 != null) {
                    class128.field2048.method155(0);
                }
                if (class47.field597 != null) {
                    class47.field597.method155(0);
                }
                if (var1 != 21) {
                    class86.field1062 = var1;
                    class261.field4227 = 0;
                    class28.field400.method1210(-1);
                    class28.field400 = null;
                    return;
                }
                class261.field4227 = 3;
            }
            if (arg0 > 85) {
                if (class261.field4227 == 3) {
                    if (class28.field400.method1217(-115) < 1) {
                        return;
                    }
                    class256.field4143 = new String[class28.field400.method1216((byte) 29)];
                    class261.field4227 = 4;
                }
                if (class261.field4227 == 4 && class28.field400.method1217(-109) >= (class256.field4143.length * 8)) {
                    class96.field1283.field1228 = 0;
                    class28.field400.method1209(66, class256.field4143.length * 8, class96.field1283.field1218, 0);
                    for (int var2 = 0; var2 < class256.field4143.length; var2++) {
                        class256.field4143[var2] = class124.method815(class96.field1283.method556(false), (byte) -52);
                    }
                    class261.field4227 = 0;
                    class86.field1062 = 21;
                    class28.field400.method1210(-1);
                    class28.field400 = null;
                }
            }
        } catch (IOException var3) {
            if (class28.field400 != null) {
                class28.field400.method1210(-1);
                class28.field400 = null;
            }
            if (class265.field4265 >= 1) {
                class86.field1062 = -4;
                class261.field4227 = 0;
            } else {
                class265.field4265++;
                if (class20.field253 == class178.field2833) {
                    class178.field2833 = class42.field528;
                } else {
                    class178.field2833 = class20.field253;
                }
                class261.field4227 = 1;
                class220.field3528 = 0;
            }
        }
    }
}
