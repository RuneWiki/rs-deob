import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class174 {

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    private int field3535 = 32;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "J")
    private long field3530 = class190.method1253((byte) 18);

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "J")
    private long field3547 = 0L;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "[Lve;")
    private class202[] field3549 = new class202[8];

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    private int field3546 = 0;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "J")
    private long field3554 = 0L;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "Z")
    private boolean field3553 = true;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
    private int field3550 = 0;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
    private int field3561 = 0;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "[Lve;")
    private class202[] field3563 = new class202[8];

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
    private int field3560 = 0;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Ldd;")
    public static class35 field3534 = class180.method1196((byte) -117, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Ldd;")
    public static class35 field3523 = class180.method1196((byte) -105, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Ldd;")
    public static class35 field3525 = class180.method1196((byte) 126, " <col=ffffff>");

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Ljava/util/Random;")
    public static Random field3540 = new Random();

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Ldd;")
    public static class35 field3552 = class180.method1196((byte) 127, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
    public static int field3559 = -1;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "Ldd;")
    public static class35 field3555 = null;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    public static int field3562 = 0;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    private int field3548;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "Lba;")
    public static class12 field3556;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lve;")
    private class202 field3532;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "[I")
    public int[] field3527;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method1154(int arg0) {
        if (arg0 != -1) {
            field3562 = -63;
        }
        field3525 = null;
        field3556 = null;
        field3555 = null;
        field3534 = null;
        field3540 = null;
        field3523 = null;
        field3552 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([II)V")
    private final void method1155(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class109.field2419) {
            var3 = arg1 << 1;
        }
        class156.method1049(arg0, 0, var3);
        this.field3561 -= arg1;
        if (this.field3532 != null && this.field3561 <= 0) {
            this.field3561 += class150.field3136 >> 4;
            class180.method1195(this.field3532, -98);
            this.method1160(this.field3532.method686(), (byte) -115, this.field3532);
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
                        class202 var10 = null;
                        class202 var11 = this.field3563[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class169 var12 = var11.field4033;
                                if (var12 == null || var12.field3391 <= var8) {
                                    var11.field4036 = true;
                                    int var13 = var11.method707();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3391 += var13;
                                    }
                                    if (var4 >= this.field3535) {
                                        break label107;
                                    }
                                    class202 var14 = var11.method704();
                                    if (var14 != null) {
                                        int var15 = var11.field4034;
                                        while (var14 != null) {
                                            this.method1160(var15 * var14.method686() >> 8, (byte) -80, var14);
                                            var14 = var11.method682();
                                        }
                                    }
                                    class202 var16 = var11.field4035;
                                    var11.field4035 = null;
                                    if (var10 == null) {
                                        this.field3563[var7] = var16;
                                    } else {
                                        var10.field4035 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3549[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4035;
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
                class202 var18 = this.field3563[var17];
                this.field3563[var17] = this.field3549[var17] = null;
                while (var18 != null) {
                    class202 var19 = var18.field4035;
                    var18.field4035 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3561 < 0) {
            this.field3561 = 0;
        }
        if (this.field3532 != null) {
            this.field3532.method705(arg0, 0, arg1);
        }
        this.field3530 = class190.method1253((byte) 18);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILve;)V")
    public final synchronized void method1156(int arg0, class202 arg1) {
        field3538++;
        if (arg0 < -69) {
            this.field3532 = arg1;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()V")
    public void method851() throws Exception {
        field3537++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V")
    private final void method1157(int arg0, int arg1) {
        this.field3561 -= arg0;
        field3524++;
        if (this.field3561 < 0) {
            this.field3561 = 0;
        }
        if (arg1 >= -123) {
            this.method1159((byte) 84);
        }
        if (this.field3532 != null) {
            this.field3532.method694(arg0);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()V")
    public void method849() throws Exception {
        field3529++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lo;ILhb;B)V")
    public static final void method1158(class134 arg0, int arg1, class72 arg2, byte arg3) {
        field3528++;
        if (arg3 > -67) {
            field3559 = -100;
        }
        byte[] var4 = null;
        class187 var5 = class71.field1698;
        synchronized (class71.field1698) {
            for (class161 var6 = (class161) class71.field1698.method1232(25831); var6 != null; var6 = (class161) class71.field1698.method1238(22622)) {
                if ((long) arg1 == var6.field2416 && var6.field3281 == arg2 && var6.field3284 == 0) {
                    var4 = var6.field3274;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg2.method578(arg1, (byte) -115);
            arg0.method915(-111, arg2, true, arg1, var7);
        } else {
            arg0.method915(-36, arg2, true, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "()V")
    public void method854() {
        field3543++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method853(Component arg0) throws Exception {
        field3541++;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public void method848(int arg0) throws Exception {
        field3533++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public final synchronized void method1159(byte arg0) {
        if (arg0 < 37) {
            return;
        }
        if (class178.field3658 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class178.field3658.field179[var3] == this) {
                    class178.field3658.field179[var3] = null;
                }
                if (class178.field3658.field179[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class178.field3658.field182 = true;
                while (class178.field3658.field185) {
                    class204.method1347(50L, false);
                }
                class178.field3658 = null;
            }
        }
        this.method854();
        this.field3527 = null;
        field3545++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBLve;)V")
    private final void method1160(int arg0, byte arg1, class202 arg2) {
        field3526++;
        int var4 = arg0 >> 5;
        class202 var5 = this.field3549[var4];
        if (arg1 > -72) {
            return;
        }
        if (var5 == null) {
            this.field3563[var4] = arg2;
        } else {
            var5.field4035 = arg2;
        }
        this.field3549[var4] = arg2;
        arg2.field4034 = arg0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI)I")
    public static final int method1161(boolean arg0, int arg1) {
        int var2 = 0;
        field3539++;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (!arg0) {
            return 8;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
    public static final void method1162(int arg0) {
        if (arg0 != 16) {
            field3523 = null;
        }
        field3551++;
        class29.field593.method813(-110);
        class34.field700.method813(-116);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
    public final synchronized void method1163(byte arg0) {
        this.field3553 = true;
        field3544++;
        try {
            this.method851();
        } catch (Exception var2) {
            this.method854();
            this.field3547 = class190.method1253((byte) 18) + 2000L;
        }
        if (arg0 != 89) {
            this.method1165(-9);
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
    public final synchronized void method1164(int arg0) {
        field3542++;
        if (this.field3527 == null) {
            return;
        }
        long var2 = class190.method1253((byte) 18);
        try {
            if (this.field3547 != 0L) {
                if (this.field3547 > var2) {
                    return;
                }
                this.method848(this.field3558);
                this.field3553 = true;
                this.field3547 = 0L;
            }
            int var4 = this.method850();
            if (this.field3546 - var4 > this.field3550) {
                this.field3550 = this.field3546 - var4;
            }
            int var5 = this.field3557 + this.field3548;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field3558 < var5 + 256) {
                var4 = 0;
                this.field3558 += 1024;
                if (this.field3558 > 16384) {
                    this.field3558 = 16384;
                }
                this.method854();
                this.method848(this.field3558);
                this.field3553 = true;
                if (var5 + 256 > this.field3558) {
                    var5 = this.field3558 - 256;
                    this.field3548 = var5 - this.field3557;
                }
            }
            if (arg0 != 0) {
                this.method854();
            }
            while (var4 < var5) {
                var4 += 256;
                this.method1155(this.field3527, 256);
                this.method849();
            }
            if (var2 > this.field3554) {
                if (this.field3553) {
                    this.field3553 = false;
                } else if (this.field3550 == 0 && this.field3560 == 0) {
                    this.method854();
                    this.field3547 = var2 + 2000L;
                    return;
                } else {
                    this.field3548 = Math.min(this.field3560, this.field3550);
                    this.field3560 = this.field3550;
                }
                this.field3550 = 0;
                this.field3554 = var2 + 2000L;
            }
            this.field3546 = var4;
        } catch (Exception var7) {
            this.method854();
            this.field3547 = var2 + 2000L;
        }
        try {
            if (var2 > this.field3530 + 500000L) {
                var2 = this.field3530;
            }
            while (var2 > this.field3530 + 5000L) {
                this.method1157(256, -127);
                this.field3530 += 256000 / class150.field3136;
            }
        } catch (Exception var6) {
            this.field3530 = var2;
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "()I")
    public int method850() throws Exception {
        field3536++;
        return this.field3558;
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
    public final void method1165(int arg0) {
        field3531++;
        this.field3553 = true;
        if (arg0 != 0) {
            this.method1160(-1, (byte) 52, null);
        }
    }
}
