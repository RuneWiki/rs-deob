import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class18 extends class55 {

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    private int field277 = 0;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "Lff;")
    private class47 field289 = new class47(16);

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "I")
    private int field304 = 0;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "Lfg;")
    private class203 field301 = new class203();

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "J")
    private long field307 = 0L;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "Lch;")
    private class131 field280;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "Z")
    private boolean field303;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "Lfg;")
    private class203 field305;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "Z")
    private boolean field308;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "Ldf;")
    private class154 field284;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "Lch;")
    private class131 field297;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "Loc;")
    private class135 field266;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    private int field273;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "Lkk;")
    private class222 field286;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "Lve;")
    private static class255 field275 = class87.method607(81, "Loading textures )2 ");

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public static int field281 = 0;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lve;")
    public static class255 field267 = field275;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
    public static int field295 = 0;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "Lda;")
    private class112 field279;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "Z")
    private boolean field306;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "[B")
    private byte[] field268;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "[I")
    public static int[] field296;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 15762) {
            field295 = -82;
        }
        class258.field4388 = arg4;
        class276.field4738 = arg3;
        class13.field180 = arg2;
        class224.field3751 = arg0;
        field272++;
        class213.field3641 = arg1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)V", line = 28)
    public final void method91(int arg0, byte arg1) {
        field276++;
        if (this.field280 == null) {
            return;
        }
        for (class208 var3 = this.field301.method1471((byte) -63); var3 != null; var3 = this.field301.method1475((byte) 83)) {
            if ((long) arg0 == var3.field3568) {
                return;
            }
        }
        class208 var4 = new class208();
        var4.field3568 = (long) arg0;
        if (arg1 <= -72) {
            this.field301.method1472(true, var4);
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)I", line = 58)
    public final int method92(int arg0) {
        if (arg0 <= 76) {
            this.field289 = (class47) null;
        }
        field300++;
        return this.field277;
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V", line = 69)
    public static void method93(int arg0) {
        if (arg0 != -15362) {
            method90(7, -18, -82, 42, -3, 123);
        }
        field275 = null;
        field267 = null;
        field296 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIBIII)V", line = 87)
    public static final void method94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field274++;
        if (arg0 == arg2 && arg5 == arg9 && arg3 == arg7 && arg1 == arg8) {
            class152.method1121(arg9, (byte) -119, arg3, arg1, arg2, arg4);
        } else {
            int var10 = arg9;
            int var11 = arg9 * 3;
            int var12 = arg2;
            int var13 = arg2 * 3;
            int var14 = arg0 * 3;
            int var15 = arg5 * 3;
            int var16 = arg7 * 3;
            int var17 = arg8 * 3;
            int var18 = arg3 + var14 - var16 - arg2;
            int var19 = arg1 + var15 - (var17 - -arg9);
            int var20 = var16 - var14 - (var14 - var13);
            int var21 = var17 + var11 - var15 - var15;
            int var22 = var14 - var13;
            int var23 = var15 - var11;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg9 + (var28 + var32 + var30 >> 12);
                int var34 = (var27 + var29 + var31 >> 12) + arg2;
                class152.method1121(var10, (byte) -126, var34, var33, var12, arg4);
                var10 = var33;
                var12 = var34;
            }
        }
        if (arg6 != 72) {
            field267 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(IB)V", line = 166)
    public static final void method95(int arg0, byte arg1) {
        class53 var2 = class303.method2112(-1155040160, arg0, 5);
        int var3 = 99 % ((31 - arg1) / 58);
        var2.method326(106);
        field269++;
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)[Ldm;", line = 178)
    public static final class273[] method96(int arg0) {
        if (arg0 != 2) {
            field275 = (class255) null;
        }
        field298++;
        class273[] var1 = new class273[class109.field1850];
        for (int var2 = 0; var2 < class109.field1850; var2++) {
            var1[var2] = new class273(class153.field2608, class154.field2632, class131.field2167[var2], class298.field5098[var2], class132.field2173[var2], class187.field3027[var2], class282.field4849[var2], field296);
        }
        class111.method850(-3);
        return var1;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(IB)I", line = 204)
    public final int method97(int arg0, byte arg1) {
        field291++;
        class222 var3 = (class222) this.field289.method280((long) arg0, 29153);
        if (var3 == null) {
            return arg1 == 32 ? 0 : -30;
        } else {
            return var3.method80((byte) 60);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)I", line = 227)
    public final int method98(byte arg0) {
        field292++;
        if (this.field279 == null) {
            return 0;
        } else if (this.field303) {
            class208 var2 = this.field305.method1471((byte) 63);
            if (var2 == null) {
                return 0;
            } else {
                int var3 = 114 % ((arg0 - 38) / 42);
                return (int) var2.field3568;
            }
        } else {
            return this.field279.field1896;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[B", line = 250)
    public final byte[] method99(int arg0, int arg1) {
        field302++;
        class222 var3 = this.method107(arg1, arg0, arg1 + 2);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method82((byte) -16);
            var3.method1502((byte) -82);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)V", line = 266)
    public static final void method100(int arg0) {
        field278++;
        if (class88.field1433 == 0) {
            return;
        }
        try {
            if ((++class172.field2852) > 2000) {
                if (client.field4041 != null) {
                    client.field4041.method1650((byte) 101);
                    client.field4041 = null;
                }
                if (class274.field4715 >= 1) {
                    class46.field693 = -5;
                    class88.field1433 = 0;
                    return;
                }
                class172.field2852 = 0;
                if (class294.field5051 == class155.field2650) {
                    class294.field5051 = class232.field3853;
                } else {
                    class294.field5051 = class155.field2650;
                }
                class88.field1433 = 1;
                class274.field4715++;
            }
            if (class88.field1433 == 1) {
                class63.field957 = class221.field3728.method237(0, class294.field5051, class248.field4153);
                class88.field1433 = 2;
            }
            if (class88.field1433 == 2) {
                if (class63.field957.field2833 == 2) {
                    throw new IOException();
                }
                if (class63.field957.field2833 != 1) {
                    return;
                }
                client.field4041 = new class239((Socket) class63.field957.field2832, class221.field3728);
                class63.field957 = null;
                client.field4041.method1653(0, class255.field4318.field1066, (byte) -72, class255.field4318.field1068);
                if (class195.field3208 != null) {
                    class195.field3208.method1030((byte) -90);
                }
                if (class250.field4219 != null) {
                    class250.field4219.method1030((byte) -84);
                }
                int var1 = client.field4041.method1655(28982);
                if (class195.field3208 != null) {
                    class195.field3208.method1030((byte) -111);
                }
                if (class250.field4219 != null) {
                    class250.field4219.method1030((byte) -70);
                }
                if (var1 != 21) {
                    class46.field693 = var1;
                    class88.field1433 = 0;
                    client.field4041.method1650((byte) -103);
                    client.field4041 = null;
                    return;
                }
                class88.field1433 = 3;
            }
            if (arg0 != -2) {
                field296 = (int[]) null;
            }
            if (class88.field1433 == 3) {
                if (client.field4041.method1652(-13301) < 1) {
                    return;
                }
                class34.field549 = new class255[client.field4041.method1655(28982)];
                class88.field1433 = 4;
            }
            if (class88.field1433 == 4) {
                if (client.field4041.method1652(-13301) < (class34.field549.length * 8)) {
                    return;
                }
                class160.field2692.field1068 = 0;
                client.field4041.method1651(class34.field549.length * 8, class160.field2692.field1066, -1, 0);
                for (int var2 = 0; var2 < class34.field549.length; var2++) {
                    class34.field549[var2] = class147.method1091(class160.field2692.method485(class127.method943(arg0, 380964766)), arg0 - 126);
                }
                class46.field693 = 21;
                class88.field1433 = 0;
                client.field4041.method1650((byte) 29);
                client.field4041 = null;
                return;
            }
        } catch (IOException var4) {
            if (client.field4041 != null) {
                client.field4041.method1650((byte) 7);
                client.field4041 = null;
            }
            if (class274.field4715 >= 1) {
                class88.field1433 = 0;
                class46.field693 = -4;
            } else {
                class274.field4715++;
                if (class294.field5051 == class155.field2650) {
                    class294.field5051 = class232.field3853;
                } else {
                    class294.field5051 = class155.field2650;
                }
                class88.field1433 = 1;
                class172.field2852 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V", line = 432)
    public final void method101(byte arg0) {
        field293++;
        if (arg0 <= 109) {
            this.field284 = (class154) null;
        }
        if (this.field305 != null) {
            if (this.method106((byte) 2) == null) {
                return;
            }
            if (this.field303) {
                boolean var6 = true;
                for (class208 var7 = this.field305.method1471((byte) 89); var7 != null; var7 = this.field305.method1475((byte) 83)) {
                    int var8 = (int) var7.field3568;
                    if (this.field268[var8] == 0) {
                        this.method107(1, var8, 2);
                    }
                    if (this.field268[var8] == 0) {
                        var6 = false;
                    } else {
                        var7.method1502((byte) -82);
                    }
                }
                while (this.field304 < this.field279.field1881.length) {
                    if (this.field279.field1881[this.field304] == 0) {
                        this.field304++;
                    } else {
                        if (this.field284.field2634 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field268[this.field304] == 0) {
                            this.method107(1, this.field304, 2);
                        }
                        if (this.field268[this.field304] == 0) {
                            class208 var9 = new class208();
                            var6 = false;
                            var9.field3568 = (long) this.field304;
                            this.field305.method1472(true, var9);
                        }
                        this.field304++;
                    }
                }
                if (var6) {
                    this.field303 = false;
                    this.field304 = 0;
                }
            } else if (this.field306) {
                boolean var2 = true;
                for (class208 var3 = this.field305.method1471((byte) -79); var3 != null; var3 = this.field305.method1475((byte) 83)) {
                    int var4 = (int) var3.field3568;
                    if (this.field268[var4] != 1) {
                        this.method107(2, var4, 2);
                    }
                    if (this.field268[var4] == 1) {
                        var3.method1502((byte) -82);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field304 < this.field279.field1881.length) {
                    if (this.field279.field1881[this.field304] == 0) {
                        this.field304++;
                    } else {
                        if (this.field266.method1008(-21)) {
                            var2 = false;
                            break;
                        }
                        if (this.field268[this.field304] != 1) {
                            this.method107(2, this.field304, 2);
                        }
                        if (this.field268[this.field304] != 1) {
                            class208 var5 = new class208();
                            var2 = false;
                            var5.field3568 = (long) this.field304;
                            this.field305.method1472(true, var5);
                        }
                        this.field304++;
                    }
                }
                if (var2) {
                    this.field304 = 0;
                    this.field306 = false;
                }
            } else {
                this.field305 = null;
            }
        }
        if (!this.field308 || this.field307 > class218.method1541(40)) {
            return;
        }
        for (class222 var10 = (class222) this.field289.method288((byte) -42); var10 != null; var10 = (class222) this.field289.method289(117)) {
            if (!var10.field3742) {
                if (var10.field3740) {
                    if (!var10.field3739) {
                        throw new RuntimeException();
                    }
                    var10.method1502((byte) -82);
                } else {
                    var10.field3740 = true;
                }
            }
        }
        this.field307 = class218.method1541(-97) + 1000L;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(B)V", line = 610)
    public final void method102(byte arg0) {
        if (arg0 != 115) {
            return;
        }
        field287++;
        if (this.field305 == null || this.method106((byte) 2) == null) {
            return;
        }
        for (class208 var2 = this.field301.method1471((byte) -65); var2 != null; var2 = this.field301.method1475((byte) 83)) {
            int var3 = (int) var2.field3568;
            if (var3 < 0 || var3 >= this.field279.field1883 || this.field279.field1881[var3] == 0) {
                var2.method1502((byte) -82);
            } else {
                if (this.field268[var3] == 0) {
                    this.method107(1, var3, arg0 - 113);
                }
                if (this.field268[var3] == -1) {
                    this.method107(2, var3, 2);
                }
                if (this.field268[var3] == 1) {
                    var2.method1502((byte) -82);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "(I)V", line = 655)
    public final void method103(int arg0) {
        field294++;
        if (this.field280 == null) {
            return;
        }
        if (arg0 != 255) {
            this.field306 = false;
        }
        this.field306 = true;
        if (this.field305 == null) {
            this.field305 = new class203();
        }
    }

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "(I)I", line = 675)
    public final int method104(int arg0) {
        field299++;
        if (this.field279 == null) {
            return 0;
        } else {
            int var2 = 0 % ((-arg0 - 47) / 46);
            return this.field279.field1896;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(ILch;Lch;Loc;Ldf;IIZ)V", line = 1066)
    public class18(int arg0, class131 arg1, class131 arg2, class135 arg3, class154 arg4, int arg5, int arg6, boolean arg7) {
        this.field280 = arg1;
        this.field271 = arg0;
        if (this.field280 == null) {
            this.field303 = false;
        } else {
            this.field303 = true;
            this.field305 = new class203();
        }
        this.field308 = arg7;
        this.field284 = arg4;
        this.field297 = arg2;
        this.field266 = arg3;
        this.field265 = arg5;
        this.field273 = arg6;
        if (this.field297 != null) {
            this.field286 = this.field284.method1140(this.field271, (byte) 87, this.field297);
        }
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(B)I", line = 708)
    public final int method105(byte arg0) {
        field270++;
        if (this.method106((byte) 2) == null) {
            return this.field286 == null ? 0 : this.field286.method80((byte) 60);
        } else {
            if (arg0 < 30) {
                method96(-8);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)Lda;", line = 734)
    public final class112 method106(byte arg0) {
        field283++;
        if (this.field279 != null) {
            return this.field279;
        } else if (arg0 == 2) {
            if (this.field286 == null) {
                if (this.field266.method1017((byte) -27)) {
                    return null;
                }
                this.field286 = this.field266.method1004(this.field271, true, 255, (byte) 0, 3);
            }
            if (this.field286.field3742) {
                return null;
            }
            byte[] var2 = this.field286.method82((byte) -16);
            if (this.field286 instanceof class16) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field279 = new class112(var2, this.field265);
                    if (this.field279.field1898 != this.field273) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var5) {
                    this.field279 = null;
                    if (this.field266.method1017((byte) -27)) {
                        this.field286 = null;
                    } else {
                        this.field286 = this.field266.method1004(this.field271, true, 255, (byte) 0, arg0 ^ 0x1);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field279 = new class112(var2, this.field265);
                } catch (RuntimeException var6) {
                    this.field266.method1009(255);
                    this.field279 = null;
                    if (this.field266.method1017((byte) -27)) {
                        this.field286 = null;
                    } else {
                        this.field286 = this.field266.method1004(this.field271, true, 255, (byte) 0, 3);
                    }
                    return null;
                }
                if (this.field297 != null) {
                    this.field284.method1139(this.field297, var2, true, this.field271);
                }
            }
            this.field286 = null;
            if (this.field280 != null) {
                this.field277 = 0;
                this.field268 = new byte[this.field279.field1883];
            }
            return this.field279;
        } else {
            return (class112) null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)Lkk;", line = 846)
    private final class222 method107(int arg0, int arg1, int arg2) {
        field282++;
        class222 var4 = (class222) this.field289.method280((long) arg1, arg2 ^ 0x71E3);
        if (var4 != null && arg0 == 0 && !var4.field3739 && var4.field3742) {
            var4.method1502((byte) -82);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field280 == null || this.field268[arg1] == -1) {
                    if (this.field266.method1017((byte) -27)) {
                        return null;
                    }
                    var4 = this.field266.method1004(arg1, true, this.field271, (byte) 2, 3);
                } else {
                    var4 = this.field284.method1140(arg1, (byte) -107, this.field280);
                }
            } else if (arg0 == 1) {
                if (this.field280 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field284.method1131(arg1, this.field280, (byte) 102);
            } else if (arg0 == 2) {
                if (this.field280 == null) {
                    throw new RuntimeException();
                }
                if (this.field268[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field266.method1008(-21)) {
                    return null;
                }
                var4 = this.field266.method1004(arg1, false, this.field271, (byte) 2, 3);
            } else {
                throw new RuntimeException();
            }
            this.field289.method284(true, (long) arg1, var4);
        }
        if (var4.field3742) {
            return null;
        }
        if (arg2 != 2) {
            this.method102((byte) 43);
        }
        byte[] var5 = var4.method82((byte) -16);
        if (!var4 instanceof class16) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class156.field2655.reset();
                class156.field2655.update(var5, 0, var5.length - 2);
                int var6 = (int) class156.field2655.getValue();
                if (this.field279.field1894[arg1] != var6) {
                    throw new RuntimeException();
                }
                this.field266.field2253 = 0;
                this.field266.field2255 = 0;
            } catch (RuntimeException var14) {
                this.field266.method1009(255);
                var4.method1502((byte) -82);
                if (var4.field3739 && !this.field266.method1017((byte) -27)) {
                    class37 var8 = this.field266.method1004(arg1, true, this.field271, (byte) 2, arg2 + 1);
                    this.field289.method284(true, (long) arg1, var8);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field279.field1886[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field279.field1886[arg1];
            if (this.field280 != null) {
                this.field284.method1139(this.field280, var5, true, arg1);
                if (this.field268[arg1] != 1) {
                    this.field277++;
                    this.field268[arg1] = 1;
                }
            }
            if (!var4.field3739) {
                var4.method1502((byte) -82);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class156.field2655.reset();
            class156.field2655.update(var5, 0, var5.length - 2);
            int var9 = (int) class156.field2655.getValue();
            if (this.field279.field1894[arg1] != var9) {
                throw new RuntimeException();
            }
            int var10 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field279.field1886[arg1] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field268[arg1] != 1) {
                if (this.field268[arg1] == 0) {
                }
                this.field277++;
                this.field268[arg1] = 1;
            }
            if (!var4.field3739) {
                var4.method1502((byte) -82);
            }
            return var4;
        } catch (Exception var13) {
            this.field268[arg1] = -1;
            var4.method1502((byte) -82);
            if (var4.field3739 && !this.field266.method1017((byte) -27)) {
                class37 var12 = this.field266.method1004(arg1, true, this.field271, (byte) 2, 3);
                this.field289.method284(true, (long) arg1, var12);
            }
            return null;
        }
    }
}
