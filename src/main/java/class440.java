import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class440 {

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    private int field6484 = 32;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "Z")
    private boolean field6486 = false;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "J")
    private long field6488 = class614.method4531(-33);

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "J")
    private long field6495 = 0L;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "J")
    private long field6491 = 0L;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    private int field6496 = 0;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "Z")
    private boolean field6500 = true;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "[Ljn;")
    private class528[] field6494 = new class528[8];

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "I")
    private int field6497 = 0;

    @OriginalMember(owner = "client!wm", name = "F", descriptor = "[Ljn;")
    private class528[] field6502 = new class528[8];

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    private int field6505 = 0;

    @OriginalMember(owner = "client!wm", name = "C", descriptor = "I")
    private int field6503 = 0;

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field6507 = new String[] { method3432(method3431("\u00178d/,")), method3432(method3431("\u00178d.,")), method3432(method3431("\u00178d;,")), method3432(method3431("\u00178d-,")), method3432(method3431("\u00178d#,")), method3432(method3431("\u00178d(,")), method3432(method3431("\u001b{dEy")), method3432(method3431("\u00178d&,")), method3432(method3431("\u000e &\u0007")), method3432(method3431("\u00178d*,")), method3432(method3431("\u00178d\",")), method3432(method3431("\u00178d$,")), method3432(method3431("\u00178d,,")), method3432(method3431("\u00178d:,")), method3432(method3431("\u00178d ,")), method3432(method3431("\u00178d',")) };

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field6485 = 0;

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "I")
    public static int field6487 = 0;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public static int field6490 = 0;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "Z")
    public static boolean field6489 = false;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!wm", name = "G", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    public int field6499;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public int field6501;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    private int field6504;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "Lfu;")
    public static class219 field6492;

    @OriginalMember(owner = "client!wm", name = "E", descriptor = "Ljn;")
    private class528 field6481;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "[I")
    public int[] field6476;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBLjn;)V")
    private final void method3421(int arg0, byte arg1, class528 arg2) {
        try {
            field6474++;
            int var4 = arg0 >> 5;
            class528 var5 = this.field6494[var4];
            if (arg1 <= 72) {
                this.method3429((byte) 115);
            }
            if (var5 == null) {
                this.field6502[var4] = arg2;
            } else {
                var5.field7674 = arg2;
            }
            this.field6494[var4] = arg2;
            arg2.field7677 = arg0;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6507[10] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6507[8] : field6507[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([BB)V")
    public static final void method3422(byte[] arg0, byte arg1) {
        try {
            field6472++;
            class711 var2 = new class711(arg0);
            while (true) {
                while (true) {
                    int var3 = var2.method5128(0);
                    if (var3 == 0) {
                        if (arg1 >= -127) {
                            method3427(20, -43, 112);
                            return;
                        }
                        return;
                    }
                    if (var3 == 1) {
                        int[] var4 = class224.field3254 = new int[6];
                        var4[0] = var2.method5116((byte) -106);
                        var4[1] = var2.method5116((byte) -111);
                        var4[2] = var2.method5116((byte) -112);
                        var4[3] = var2.method5116((byte) -116);
                        var4[4] = var2.method5116((byte) -114);
                        var4[5] = var2.method5116((byte) -123);
                    } else if (var3 == 4) {
                        int var5 = var2.method5128(0);
                        class616.field8792 = new int[var5];
                        for (int var6 = 0; var6 < var5; var6++) {
                            class616.field8792[var6] = var2.method5116((byte) -107);
                            if (class616.field8792[var6] == 65535) {
                                class616.field8792[var6] = -1;
                            }
                        }
                    } else if (var3 == 5) {
                        int var7 = var2.method5128(0);
                        class777.field11074 = new int[var7];
                        for (int var8 = 0; var8 < var7; var8++) {
                            class777.field11074[var8] = var2.method5116((byte) -128);
                            if (class777.field11074[var8] == 65535) {
                                class777.field11074[var8] = -1;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field6507[7] + (arg0 == null ? field6507[8] : field6507[6]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "()V")
    public void method1462() throws Exception {
        try {
            field6483++;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6507[5] + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "()V")
    public void method1465() throws Exception {
        try {
            field6475++;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6507[1] + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
    public final synchronized void method3423(int arg0) {
        try {
            field6473++;
            if (!this.field6486) {
                long var2 = class614.method4531(-26);
                try {
                    if (var2 > (this.field6488 + 6000L)) {
                        this.field6488 = var2 - 6000L;
                    }
                    while (var2 > (this.field6488 + 5000L)) {
                        this.method3424(256, -3);
                        this.field6488 += (256000 / class215.field3148);
                        var2 = class614.method4531(-107);
                    }
                    if (arg0 < 53) {
                        this.field6497 = -59;
                    }
                } catch (Exception var8) {
                    this.field6488 = var2;
                }
                if (this.field6476 != null) {
                    try {
                        if (this.field6495 != 0L) {
                            if (var2 < this.field6495) {
                                return;
                            }
                            this.method1461(this.field6501);
                            this.field6500 = true;
                            this.field6495 = 0L;
                        }
                        int var4 = this.method1463();
                        if (this.field6503 < (this.field6505 - var4)) {
                            this.field6503 = this.field6505 - var4;
                        }
                        int var5 = this.field6504 + this.field6499;
                        if (var5 + 256 > 16384) {
                            var5 = 16128;
                        }
                        if (var5 + 256 > this.field6501) {
                            this.field6501 += 1024;
                            if (this.field6501 > 16384) {
                                this.field6501 = 16384;
                            }
                            this.method1464();
                            var4 = 0;
                            this.method1461(this.field6501);
                            if (this.field6501 < (var5 + 256)) {
                                var5 = this.field6501 - 256;
                                this.field6504 = var5 - this.field6499;
                            }
                            this.field6500 = true;
                        }
                        while (var5 > var4) {
                            this.method3426(this.field6476, 256);
                            var4 += 256;
                            this.method1462();
                        }
                        if (this.field6491 < var2) {
                            if (this.field6500) {
                                this.field6500 = false;
                            } else if (this.field6503 == 0 && this.field6496 == 0) {
                                this.method1464();
                                this.field6495 = var2 + 2000L;
                                return;
                            } else {
                                this.field6504 = Math.min(this.field6496, this.field6503);
                                this.field6496 = this.field6503;
                            }
                            this.field6491 = var2 + 2000L;
                            this.field6503 = 0;
                        }
                        this.field6505 = var4;
                    } catch (Exception var7) {
                        this.method1464();
                        this.field6495 = var2 + 2000L;
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field6507[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "()I")
    public int method1463() throws Exception {
        try {
            field6478++;
            return this.field6501;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6507[12] + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)V")
    private final void method3424(int arg0, int arg1) {
        try {
            this.field6497 -= arg0;
            if (arg1 != -3) {
                method3427(63, -50, -59);
            }
            field6477++;
            if (this.field6497 < 0) {
                this.field6497 = 0;
            }
            if (this.field6481 != null) {
                this.field6481.method937(arg0);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6507[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljn;I)V")
    public final synchronized void method3425(class528 arg0, int arg1) {
        try {
            this.field6481 = arg0;
            field6498++;
            int var3 = -31 / ((arg1 - 6) / 53);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6507[15] + (arg0 == null ? field6507[8] : field6507[6]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1466(Component arg0) throws Exception {
        try {
            field6493++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6507[9] + (arg0 == null ? field6507[8] : field6507[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([II)V")
    private final void method3426(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class375.field5471) {
            var3 = arg1 << 1;
        }
        class569.method4242(arg0, 0, var3);
        this.field6497 -= arg1;
        if (this.field6481 != null && this.field6497 <= 0) {
            this.field6497 += class215.field3148 >> 4;
            class272.method2225(this.field6481, -116);
            this.method3421(this.field6481.method938(), (byte) 116, this.field6481);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class528 var10 = null;
                        class528 var11 = this.field6502[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class630 var12 = var11.field7675;
                                if (var12 == null || var12.field8962 <= var8) {
                                    var11.field7676 = true;
                                    int var13 = var11.method917();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field8962 += var13;
                                    }
                                    if (var4 >= this.field6484) {
                                        break label107;
                                    }
                                    class528 var14 = var11.method931();
                                    if (var14 != null) {
                                        int var15 = var11.field7677;
                                        while (var14 != null) {
                                            this.method3421(var15 * var14.method938() >> 8, (byte) 77, var14);
                                            var14 = var11.method919();
                                        }
                                    }
                                    class528 var16 = var11.field7674;
                                    var11.field7674 = null;
                                    if (var10 == null) {
                                        this.field6502[var7] = var16;
                                    } else {
                                        var10.field7674 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field6494[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field7674;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class528 var18 = this.field6502[var17];
                this.field6502[var17] = this.field6494[var17] = null;
                while (var18 != null) {
                    class528 var19 = var18.field7674;
                    var18.field7674 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field6497 < 0) {
            this.field6497 = 0;
        }
        if (this.field6481 != null) {
            this.field6481.method927(arg0, 0, arg1);
        }
        this.field6488 = class614.method4531(-45);
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)V")
    public void method1461(int arg0) throws Exception {
        try {
            field6480++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6507[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "()V")
    public void method1464() {
        try {
            field6506++;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6507[3] + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)V")
    public static final void method3427(int arg0, int arg1, int arg2) {
        class621 var3 = class608.field8715[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class478.method3703(var3.field8847);
        class478.method3703(var3.field8852);
        if (var3.field8847 != null) {
            var3.field8847 = null;
        }
        if (var3.field8852 != null) {
            var3.field8852 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V")
    public static void method3428(byte arg0) {
        try {
            field6492 = null;
            if (arg0 != 79) {
                method3422(null, (byte) 122);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6507[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V")
    public final synchronized void method3429(byte arg0) {
        try {
            if (class553.field8067 != null) {
                boolean var2 = true;
                for (int var3 = 0; var3 < 2; var3++) {
                    if (class553.field8067.field4497[var3] == this) {
                        class553.field8067.field4497[var3] = null;
                    }
                    if (class553.field8067.field4497[var3] != null) {
                        var2 = false;
                    }
                }
                if (var2) {
                    class553.field8067.field4490 = true;
                    while (class553.field8067.field4495) {
                        class449.method3474(arg0 ^ 0xFFFFAEBB, 50L);
                    }
                    class553.field8067 = null;
                }
            }
            if (arg0 != -22) {
                this.field6476 = null;
            }
            field6479++;
            this.method1464();
            this.field6476 = null;
            this.field6486 = true;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6507[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
    public final synchronized void method3430(int arg0) {
        try {
            if (arg0 == 2000) {
                field6482++;
                this.field6500 = true;
                try {
                    this.method1465();
                } catch (Exception var3) {
                    this.method1464();
                    this.field6495 = class614.method4531(-50) + 2000L;
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6507[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3431(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3432(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 85;
                    break;
                case 2:
                    var10005 = 74;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 4;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
