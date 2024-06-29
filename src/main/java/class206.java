import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class206 extends class114 {

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "[J")
    public static long[] field3531 = new long[100];

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "Lia;")
    public static class257 field3539 = class28.method234(-111, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "[I")
    private int[] field3535;

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "[I")
    public int[] field3543;

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "[Lia;")
    private class257[] field3526;

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "[[I")
    private int[][] field3538;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "[[S")
    public static short[][] field3529;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)Lia;")
    public final class257 method1381(int arg0) {
        field3534++;
        class257 var2 = class54.method416(0, 80);
        if (this.field3526 == null) {
            return class68.field1366;
        }
        var2.method1684(-35, this.field3526[0]);
        if (arg0 != -15168) {
            return null;
        }
        for (int var3 = 1; var3 < this.field3526.length; var3++) {
            var2.method1684(arg0 + 15133, class205.field3518);
            var2.method1684(arg0 + 15133, this.field3526[var3]);
        }
        return var2.method1714((byte) -50);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILk;)Lia;")
    public final class257 method1382(int arg0, class152 arg1) {
        class257 var3 = class54.method416(arg0, 80);
        if (this.field3535 != null) {
            for (int var4 = 0; var4 < this.field3535.length; var4++) {
                var3.method1684(-35, this.field3526[var4]);
                var3.method1684(-35, class154.method1081(this.field3535[var4], this.field3538[var4], arg1.method1078(class111.field2036[this.field3535[var4]], arg0 - 118), true));
            }
        }
        var3.method1684(-35, this.field3526[this.field3526.length - 1]);
        field3542++;
        return var3.method1714((byte) -90);
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
    public static final void method1383(int arg0) {
        field3528++;
        if (class183.field3184 == 0) {
            return;
        }
        if (arg0 != -26778) {
            field3529 = null;
        }
        try {
            if (class183.field3184 == 1) {
                if (class207.field3551.field3000 == 2) {
                    throw new IOException();
                }
                if (class207.field3551.field3000 != 1) {
                    return;
                }
                class151.field2595 = new class211((Socket) class207.field3551.field3001, class72.field1404);
                class207.field3551 = null;
                class151.field2595.method1419(class205.field3524.field2677, 0, class205.field3524.field2638, arg0 ^ 0x68AD);
                class40.field827.field2677 = 0;
                class183.field3184 = 2;
            }
            if (class183.field3184 == 2) {
                if (class182.field3175 != null) {
                    class182.field3175.method628(126);
                }
                if (class79.field1543 != null) {
                    class79.field1543.method628(122);
                }
                int var1 = class151.field2595.method1425(0);
                if (class182.field3175 != null) {
                    class182.field3175.method628(126);
                }
                if (class79.field1543 != null) {
                    class79.field1543.method628(121);
                }
                if (var1 < 0) {
                    return;
                }
                if (class121.field2183 == 1) {
                    if (var1 == 0) {
                        class138.field2471 = 3;
                    } else {
                        class138.field2471 = var1;
                    }
                }
                if (class121.field2183 == 2) {
                    if (var1 == 0) {
                        class76.field1493 = 3;
                    } else if (var1 == 21) {
                        class183.field3184 = 3;
                        return;
                    } else {
                        class76.field1493 = var1;
                    }
                }
                class183.field3184 = 0;
                if (class121.field2183 == 3) {
                    if (var1 == 0) {
                        class133.field2377 = 3;
                    } else {
                        class133.field2377 = var1;
                    }
                }
                class121.field2183 = 0;
                if (class151.field2595 != null) {
                    class151.field2595.method1421((byte) 105);
                }
                class151.field2595 = null;
            }
            if (class183.field3184 == 3) {
                int var2 = class151.field2595.method1423((byte) 110);
                if (var2 > 0) {
                    class189.field3259 = new class257[class151.field2595.method1425(0)];
                    class183.field3184 = 4;
                }
            }
            if (class183.field3184 == 4) {
                int var3 = class151.field2595.method1423((byte) -87);
                if (var3 >= class189.field3259.length * 8) {
                    class40.field827.field2677 = 0;
                    class151.field2595.method1424(class40.field827.field2638, 0, class189.field3259.length * 8, (byte) -80);
                    for (int var4 = 0; var4 < class189.field3259.length; var4++) {
                        class189.field3259[var4] = class199.method1334((byte) -111, class40.field827.method1049(class238.method1553(arg0, -26856)));
                    }
                    class183.field3184 = 0;
                    class76.field1493 = 21;
                    class121.field2183 = 0;
                    if (class151.field2595 != null) {
                        class151.field2595.method1421((byte) 84);
                    }
                    class151.field2595 = null;
                    return;
                }
            }
        } catch (IOException var5) {
            class133.field2377 = 3;
            class76.field1493 = 3;
            class138.field2471 = 3;
            class183.field3184 = 0;
            class121.field2183 = 0;
            if (class151.field2595 != null) {
                class151.field2595.method1421((byte) 111);
            }
            class151.field2595 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V")
    public static void method1384(byte arg0) {
        field3539 = null;
        if (arg0 != -119) {
            method1384((byte) 8);
        }
        field3529 = null;
        field3531 = null;
    }

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "(I)I")
    public final int method1385(int arg0) {
        if (arg0 > -39) {
            return -20;
        } else {
            field3530++;
            return this.field3535 == null ? 0 : this.field3535.length;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBI)I")
    public final int method1386(int arg0, byte arg1, int arg2) {
        field3540++;
        if (this.field3535 == null || arg2 < 0 || this.field3535.length < arg2) {
            return -1;
        } else if (this.field3538[arg2] == null || arg0 < 0 || arg0 > this.field3538[arg2].length) {
            return -1;
        } else if (arg1 == -27) {
            return this.field3538[arg2][arg0];
        } else {
            return 125;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZILk;)V")
    private final void method1387(boolean arg0, int arg1, class152 arg2) {
        if (!arg0) {
            return;
        }
        if (arg1 == 1) {
            this.field3526 = arg2.method1039(1995).method1689((byte) -55, 60);
        } else if (arg1 == 2) {
            int var8 = arg2.method1051((byte) -91);
            this.field3543 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3543[var9] = arg2.method1063(-17162);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method1051((byte) 103);
            this.field3535 = new int[var4];
            this.field3538 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1063(-17162);
                this.field3535[var5] = var6;
                this.field3538[var5] = new int[class58.field1228[var6]];
                for (int var7 = 0; var7 < class58.field1228[var6]; var7++) {
                    this.field3538[var5][var7] = arg2.method1063(-17162);
                }
            }
        }
        field3527++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)I")
    public final int method1388(byte arg0, int arg1) {
        if (arg0 == -1) {
            field3532++;
            return this.field3535 == null || arg1 < 0 || this.field3535.length < arg1 ? -1 : this.field3535[arg1];
        } else {
            return -69;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BILia;)V")
    public static final void method1389(byte arg0, int arg1, class257 arg2) {
        class205.field3524.method908(false, 234);
        if (arg0 == 39) {
            class109.field2027++;
            class205.field3524.method1048((byte) 126, arg1);
            class205.field3524.method1044(false, arg2.method1668(-60));
            field3533++;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lk;I[I)V")
    public final void method1390(class152 arg0, int arg1, int[] arg2) {
        if (arg1 != -1) {
            return;
        }
        field3525++;
        if (this.field3535 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field3535.length; var4++) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = class177.field3003[this.method1388((byte) -1, var4)];
            if (var5 > 0) {
                arg0.method1025((long) arg2[var4], var5, arg1 ^ 0xFFFFFFF7);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLk;)V")
    public final void method1391(byte arg0, class152 arg1) {
        field3541++;
        if (arg0 != 17) {
            this.method1386(-86, (byte) 48, 123);
        }
        while (true) {
            int var3 = arg1.method1051((byte) -120);
            if (var3 == 0) {
                return;
            }
            this.method1387(true, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILme;I)V")
    public static final void method1392(int arg0, int arg1, class44 arg2, int arg3) {
        field3537++;
        if (arg2.field918 == 0) {
            arg2.field928 = arg2.field877;
        } else if (arg2.field918 == 1) {
            arg2.field928 = (arg3 - arg2.field981) / 2 + arg2.field877;
        } else if (arg2.field918 == 2) {
            arg2.field928 = arg3 - arg2.field981 - arg2.field877;
        } else if (arg2.field918 == 3) {
            arg2.field928 = arg2.field877 * arg3 >> 14;
        } else if (arg2.field918 == 4) {
            arg2.field928 = (arg2.field877 * arg3 >> 14) + (arg3 - arg2.field981) / 2;
        } else {
            arg2.field928 = arg3 - (arg2.field877 * arg3 >> 14) - arg2.field981;
        }
        if (arg2.field931 == 0) {
            arg2.field1025 = arg2.field979;
        } else if (arg2.field931 == 1) {
            arg2.field1025 = (arg1 - arg2.field926) / 2 + arg2.field979;
        } else if (arg2.field931 == 2) {
            arg2.field1025 = arg1 - arg2.field926 - arg2.field979;
        } else if (arg2.field931 == 3) {
            arg2.field1025 = arg2.field979 * arg1 >> 14;
        } else if (arg2.field931 == 4) {
            arg2.field1025 = (arg2.field979 * arg1 >> 14) + (arg1 - arg2.field926) / 2;
        } else {
            arg2.field1025 = arg1 - arg2.field926 - (arg2.field979 * arg1 >> 14);
        }
        if (arg0 != 26483) {
            field3529 = null;
        }
        if (!class87.field1695 || client.method590(arg2) == 0 && arg2.field871 != 0) {
            return;
        }
        if (arg2.field928 < 0) {
            arg2.field928 = 0;
        } else if (arg2.field928 + arg2.field981 > arg3) {
            arg2.field928 = arg3 - arg2.field981;
        }
        if (arg2.field1025 < 0) {
            arg2.field1025 = 0;
        } else if (arg1 < (arg2.field926 + arg2.field1025)) {
            arg2.field1025 = arg1 - arg2.field926;
            return;
        }
    }

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "(I)V")
    public final void method1393(int arg0) {
        field3536++;
        if (this.field3543 != null) {
            for (int var2 = 0; var2 < this.field3543.length; var2++) {
                this.field3543[var2] = class198.method1332(this.field3543[var2], 32768);
            }
        }
        if (arg0 != -3) {
            this.method1385(70);
        }
    }
}
