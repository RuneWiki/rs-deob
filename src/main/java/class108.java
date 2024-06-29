import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class108 extends class123 {

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    private int field2502 = 128;

    @OriginalMember(owner = "client!qd", name = "eb", descriptor = "I")
    private int field2517 = 128;

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "I")
    private int field2512 = 0;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "[S")
    private short[] field2503 = new short[6];

    @OriginalMember(owner = "client!qd", name = "lb", descriptor = "I")
    private int field2524 = 0;

    @OriginalMember(owner = "client!qd", name = "gb", descriptor = "I")
    private int field2519 = 0;

    @OriginalMember(owner = "client!qd", name = "ob", descriptor = "[S")
    private short[] field2527 = new short[6];

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    public int field2501 = -1;

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "Lvc;")
    public static class137 field2513 = class45.method325("System)2Update in: ", -46);

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "Lvc;")
    private static class137 field2515 = class45.method325(" ", -46);

    @OriginalMember(owner = "client!qd", name = "mb", descriptor = "I")
    public static int field2525 = 0;

    @OriginalMember(owner = "client!qd", name = "ib", descriptor = "Lvc;")
    private static class137 field2521 = class45.method325("Try again in 60 secs)3)3)3", -46);

    @OriginalMember(owner = "client!qd", name = "nb", descriptor = "I")
    public static int field2526 = 0;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "Lvc;")
    public static class137 field2504 = field2515;

    @OriginalMember(owner = "client!qd", name = "tb", descriptor = "Lvc;")
    public static class137 field2532 = field2521;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    public int field2505;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!qd", name = "hb", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!qd", name = "jb", descriptor = "I")
    private int field2522;

    @OriginalMember(owner = "client!qd", name = "pb", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!qd", name = "qb", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!qd", name = "rb", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!qd", name = "sb", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!qd", name = "fb", descriptor = "Lvb;")
    public static class136 field2518;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "Lnb;")
    public static class88 field2509;

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "Z")
    public static boolean field2514;

    @OriginalMember(owner = "client!qd", name = "kb", descriptor = "[Lvd;")
    public static class138[] field2523;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
    public static final void method781(int arg0) {
        field2511++;
        if (arg0 != 3876) {
            field2532 = null;
        }
        if (class78.field1747 != 1) {
            return;
        }
        if (class36.field788 >= 539 && class36.field788 <= 573 && class38.field835 >= 169 && class38.field835 < 205 && class32.field679[0] != -1) {
            class21.field439 = true;
            class75.field1691 = 0;
            class34.field737 = true;
        }
        if (class36.field788 >= 569 && class36.field788 <= 599 && class38.field835 >= 168 && class38.field835 < 205 && class32.field679[1] != -1) {
            class34.field737 = true;
            class21.field439 = true;
            class75.field1691 = 1;
        }
        if (class36.field788 >= 597 && class36.field788 <= 627 && class38.field835 >= 168 && class38.field835 < 205 && class32.field679[2] != -1) {
            class75.field1691 = 2;
            class21.field439 = true;
            class34.field737 = true;
        }
        if (class36.field788 >= 625 && class36.field788 <= 669 && class38.field835 >= 168 && class38.field835 < 203 && class32.field679[3] != -1) {
            class21.field439 = true;
            class75.field1691 = 3;
            class34.field737 = true;
        }
        if (class36.field788 >= 666 && class36.field788 <= 696 && class38.field835 >= 168 && class38.field835 < 205 && class32.field679[4] != -1) {
            class34.field737 = true;
            class75.field1691 = 4;
            class21.field439 = true;
        }
        if (class36.field788 >= 694 && class36.field788 <= 724 && class38.field835 >= 168 && class38.field835 < 205 && class32.field679[5] != -1) {
            class21.field439 = true;
            class75.field1691 = 5;
            class34.field737 = true;
        }
        if (class36.field788 >= 722 && class36.field788 <= 756 && class38.field835 >= 169 && class38.field835 < 205 && class32.field679[6] != -1) {
            class21.field439 = true;
            class34.field737 = true;
            class75.field1691 = 6;
        }
        if (class36.field788 >= 540 && class36.field788 <= 574 && class38.field835 >= 466 && class38.field835 < 502 && class32.field679[7] != -1) {
            class21.field439 = true;
            class34.field737 = true;
            class75.field1691 = 7;
        }
        if (class36.field788 >= 572 && class36.field788 <= 602 && class38.field835 >= 466 && class38.field835 < 503 && class32.field679[8] != -1) {
            class34.field737 = true;
            class21.field439 = true;
            class75.field1691 = 8;
        }
        if (class36.field788 >= 599 && class36.field788 <= 629 && class38.field835 >= 466 && class38.field835 < 503 && class32.field679[9] != -1) {
            class21.field439 = true;
            class34.field737 = true;
            class75.field1691 = 9;
        }
        if (class36.field788 >= 627 && class36.field788 <= 671 && class38.field835 >= 467 && class38.field835 < 502 && class32.field679[10] != -1) {
            class34.field737 = true;
            class21.field439 = true;
            class75.field1691 = 10;
        }
        if (class36.field788 >= 669 && class36.field788 <= 699 && class38.field835 >= 466 && class38.field835 < 503 && class32.field679[11] != -1) {
            class75.field1691 = 11;
            class34.field737 = true;
            class21.field439 = true;
        }
        if (class36.field788 >= 696 && class36.field788 <= 726 && class38.field835 >= 466 && class38.field835 < 503 && class32.field679[12] != -1) {
            class34.field737 = true;
            class21.field439 = true;
            class75.field1691 = 12;
        }
        if (class36.field788 >= 724 && class36.field788 <= 758 && class38.field835 >= 466 && class38.field835 < 502 && class32.field679[13] != -1) {
            class75.field1691 = 13;
            class21.field439 = true;
            class34.field737 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(B)V")
    public static void method782(byte arg0) {
        field2504 = null;
        field2513 = null;
        field2509 = null;
        field2523 = null;
        if (arg0 >= -22) {
            method786((byte) -22, null, null, 123, -34);
        }
        field2532 = null;
        field2521 = null;
        field2515 = null;
        field2518 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lqe;II)V")
    private final void method783(class109 arg0, int arg1, int arg2) {
        field2507++;
        if (arg1 != 7) {
            method788(null, -63, 41, -65, -32, -69, null, 47, -11, 101);
        }
        if (arg2 == 1) {
            this.field2522 = arg0.method835(2);
        } else if (arg2 == 2) {
            this.field2501 = arg0.method835(2);
        } else if (arg2 == 4) {
            this.field2517 = arg0.method835(2);
        } else if (arg2 == 5) {
            this.field2502 = arg0.method835(2);
        } else if (arg2 == 6) {
            this.field2512 = arg0.method835(arg1 - 5);
        } else if (arg2 == 7) {
            this.field2519 = arg0.method838(255);
        } else if (arg2 == 8) {
            this.field2524 = arg0.method838(255);
        } else if (arg2 >= 40 && arg2 < 50) {
            this.field2503[arg2 - 40] = (short) arg0.method835(2);
            return;
        } else if (arg2 >= 50 && arg2 < 60) {
            this.field2527[arg2 - 50] = (short) arg0.method835(arg1 - 5);
            return;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)Z")
    public static final boolean method784(int arg0, boolean arg1) {
        if (arg1) {
            method781(-77);
        }
        field2516++;
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IBZZZ)Lfc;")
    public static final class39 method785(int arg0, byte arg1, boolean arg2, boolean arg3, boolean arg4) {
        field2531++;
        int var5 = -37 / ((7 - arg1) / 52);
        class21 var6 = null;
        if (class91.field2170 != null) {
            var6 = new class21(arg0, class91.field2170, class141.field3322[arg0], 1000000);
        }
        return new class39(var6, class143.field3374, arg0, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLme;Lme;II)Lme;")
    public static final class85 method786(byte arg0, class85 arg1, class85 arg2, int arg3, int arg4) {
        field2530++;
        class85 var5 = class105.method761(class36.field795[arg1.field1910 >> 16], arg2, arg1.field1927, 0, arg4, arg1.field1929, arg3, 0, (byte) -128, arg1.field1932, arg1.field1975, arg1.field1910);
        if (var5 != null) {
            return var5;
        }
        if (arg1.field1980 != null) {
            var5 = class105.method761(arg1.field1980, arg2, arg1.field1927, 0, arg4, arg1.field1929, arg3, 0, (byte) -111, arg1.field1932, arg1.field1975, arg1.field1910);
        }
        if (arg0 < 102) {
            field2521 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lqe;B)V")
    public final void method787(class109 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method838(255);
            if (var3 == 0) {
                field2528++;
                if (arg1 >= -74) {
                    method784(5, false);
                    return;
                }
                return;
            }
            this.method783(arg0, 7, var3);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([Lic;IIIII[BIII)V")
    public static final void method788(class59[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg3 + var10 > 0 && arg3 + var10 < 103 && arg2 + var16 > 0 && arg2 + var16 < 103) {
                    arg0[arg5].field1267[arg3 + var10][arg2 + var16] = class45.method323(arg0[arg5].field1267[arg3 + var10][arg2 + var16], -16777217);
                }
            }
        }
        field2508++;
        int var11 = -52 % ((-arg8 - 44) / 33);
        class109 var12 = new class109(arg6);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg1 == var13 && var14 >= arg7 && var14 < arg7 + 8 && arg4 <= var15 && var15 < arg4 + 8) {
                        class83.method608(arg2 + class125.method937(var14 & 0x7, var15 & 0x7, (byte) 32, arg9), arg3 - -class68.method480(40, var15 & 0x7, var14 & 0x7, arg9), 49, 0, var12, arg5, arg9, 0);
                    } else {
                        class83.method608(-1, -1, 49, 0, var12, 0, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/awt/Component;Lha;ZII)Llb;")
    public static final class76 method789(Component arg0, class50 arg1, boolean arg2, int arg3, int arg4) {
        field2506++;
        if (arg3 != 27473) {
            field2509 = null;
        }
        class120.method907(13700, arg4, arg0, arg2, arg1);
        class76 var5 = new class76();
        class86.method634(4775, var5);
        return var5;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(BI)Lbf;")
    public final class14 method790(byte arg0, int arg1) {
        class14 var3 = (class14) class121.field2823.method758((long) this.field2505, (byte) -125);
        field2510++;
        if (var3 == null) {
            class144 var4 = class144.method1111(class39.field864, this.field2522, 0);
            if (var4 == null) {
                return null;
            }
            for (int var5 = 0; var5 < 6; var5++) {
                if (this.field2503[0] != 0) {
                    var4.method1114(this.field2503[var5], this.field2527[var5]);
                }
            }
            var3 = var4.method1113(this.field2519 + 64, this.field2524 + 850, -30, -50, -30);
            class121.field2823.method760(var3, 0, (long) this.field2505);
        }
        class14 var6;
        if (this.field2501 == -1 || arg1 == -1) {
            var6 = var3.method111(true);
        } else {
            var6 = class68.method481(0, this.field2501).method1097(var3, 3992, arg1);
        }
        if (this.field2517 != 128 || this.field2502 != 128) {
            var6.method95(this.field2517, this.field2502, this.field2517);
        }
        if (this.field2512 != 0) {
            if (this.field2512 == 90) {
                var6.method99();
            }
            if (this.field2512 == 180) {
                var6.method99();
                var6.method99();
            }
            if (this.field2512 == 270) {
                var6.method99();
                var6.method99();
                var6.method99();
            }
        }
        if (arg0 > -31) {
            method788(null, -51, 101, -3, 103, 9, null, 113, 93, 41);
        }
        return var6;
    }
}
