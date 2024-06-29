import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class580 {

    @OriginalMember(owner = "client!kha", name = "p", descriptor = "Ljh;")
    private class158 field8198 = new class158();

    @OriginalMember(owner = "client!kha", name = "q", descriptor = "Ljh;")
    private class158 field8199 = new class158();

    @OriginalMember(owner = "client!kha", name = "r", descriptor = "Ljh;")
    private class158 field8200 = new class158();

    @OriginalMember(owner = "client!kha", name = "s", descriptor = "Ljh;")
    private class158 field8201 = new class158();

    @OriginalMember(owner = "client!kha", name = "v", descriptor = "Lud;")
    private class35 field8204 = new class35(4);

    @OriginalMember(owner = "client!kha", name = "A", descriptor = "I")
    public volatile int field8209 = 0;

    @OriginalMember(owner = "client!kha", name = "z", descriptor = "B")
    private byte field8208 = 0;

    @OriginalMember(owner = "client!kha", name = "y", descriptor = "I")
    public volatile int field8207 = 0;

    @OriginalMember(owner = "client!kha", name = "x", descriptor = "Lud;")
    private class35 field8206 = new class35(8);

    @OriginalMember(owner = "client!kha", name = "g", descriptor = "Lmp;")
    public static class758 field8189 = new class758(16);

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "I")
    public static int field8184;

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "I")
    public static int field8185;

    @OriginalMember(owner = "client!kha", name = "d", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!kha", name = "e", descriptor = "I")
    public static int field8187;

    @OriginalMember(owner = "client!kha", name = "f", descriptor = "I")
    public static int field8188;

    @OriginalMember(owner = "client!kha", name = "h", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!kha", name = "i", descriptor = "I")
    public static int field8191;

    @OriginalMember(owner = "client!kha", name = "j", descriptor = "I")
    public static int field8192;

    @OriginalMember(owner = "client!kha", name = "k", descriptor = "I")
    public static int field8193;

    @OriginalMember(owner = "client!kha", name = "l", descriptor = "I")
    public static int field8194;

    @OriginalMember(owner = "client!kha", name = "m", descriptor = "I")
    public static int field8195;

    @OriginalMember(owner = "client!kha", name = "n", descriptor = "I")
    public static int field8196;

    @OriginalMember(owner = "client!kha", name = "o", descriptor = "I")
    public static int field8197;

    @OriginalMember(owner = "client!kha", name = "u", descriptor = "I")
    private int field8203;

    @OriginalMember(owner = "client!kha", name = "t", descriptor = "J")
    private long field8202;

    @OriginalMember(owner = "client!kha", name = "C", descriptor = "Lgq;")
    private class511 field8210;

    @OriginalMember(owner = "client!kha", name = "w", descriptor = "Lqw;")
    private class76 field8205;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Z)I", line = 4)
    private final int method3350(boolean arg0) {
        field8190++;
        if (arg0) {
            this.field8209 = -79;
        }
        return this.field8200.method1198(88) + this.field8201.method1198(124);
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(ZI)V", line = 15)
    public final void method3351(boolean arg0, int arg1) {
        field8186++;
        int var3 = -15 / ((58 - arg1) / 34);
        if (this.field8205 == null) {
            return;
        }
        try {
            this.field8204.field469 = 0;
            this.field8204.method263((byte) 72, arg0 ? 2 : 3);
            this.field8204.method245(1537222688, 0);
            this.field8205.method765(false, 4, 0, this.field8204.field483);
        } catch (IOException var5) {
            try {
                this.field8205.method769((byte) -126);
            } catch (Exception var4) {
            }
            this.field8205 = null;
            this.field8209++;
            this.field8207 = -2;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(ILud;)Ljava/lang/String;", line = 42)
    public static final String method3352(int arg0, class35 arg1) {
        int var2 = -34 / ((arg0 - 86) / 36);
        field8191++;
        return class611.method3520(arg1, 32767, false);
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(B)V", line = 52)
    public final void method3353(byte arg0) {
        field8184++;
        try {
            if (arg0 > -108) {
                return;
            }
            this.field8205.method769((byte) -128);
        } catch (Exception var2) {
        }
        this.field8209++;
        this.field8208 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field8207 = -1;
        this.field8205 = null;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Lqw;ZB)V", line = 76)
    public final void method3354(class76 arg0, boolean arg1, byte arg2) {
        if (this.field8205 != null) {
            try {
                this.field8205.method769((byte) -128);
            } catch (Exception var8) {
            }
            this.field8205 = null;
        }
        field8187++;
        this.field8205 = arg0;
        this.method3364((byte) -112);
        if (arg2 < 83) {
            this.method3364((byte) 119);
        }
        this.method3351(arg1, 97);
        this.field8210 = null;
        this.field8206.field469 = 0;
        while (true) {
            class511 var4 = (class511) this.field8199.method1200(false);
            if (var4 == null) {
                while (true) {
                    class511 var5 = (class511) this.field8201.method1200(false);
                    if (var5 == null) {
                        if (this.field8208 != 0) {
                            try {
                                this.field8204.field469 = 0;
                                this.field8204.method263((byte) -118, 4);
                                this.field8204.method263((byte) 88, this.field8208);
                                this.field8204.method223(1493807496, 0);
                                this.field8205.method765(false, 4, 0, this.field8204.field483);
                            } catch (IOException var7) {
                                try {
                                    this.field8205.method769((byte) -127);
                                } catch (Exception var6) {
                                }
                                this.field8209++;
                                this.field8205 = null;
                                this.field8207 = -2;
                            }
                        }
                        this.field8203 = 0;
                        this.field8202 = class742.method4128(1);
                        return;
                    }
                    this.field8200.method1203(var5, -101);
                }
            }
            this.field8198.method1203(var4, -101);
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(I)V", line = 146)
    public final void method3355(int arg0) {
        field8197++;
        if (this.field8205 == null) {
            return;
        }
        if (arg0 != 24543) {
            method3357(-120);
        }
        try {
            this.field8204.field469 = 0;
            this.field8204.method263((byte) 122, 7);
            this.field8204.method245(1537222688, 0);
            this.field8205.method765(false, 4, 0, this.field8204.field483);
        } catch (IOException var3) {
            try {
                this.field8205.method769((byte) -126);
            } catch (Exception var2) {
            }
            this.field8205 = null;
            this.field8207 = -2;
            this.field8209++;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(BIIIZ)Lgq;", line = 175)
    public final class511 method3356(byte arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field8195++;
        if (arg1 != 27840) {
            return null;
        }
        long var6 = (long) ((arg3 << 16) + arg2);
        class511 var8 = new class511();
        var8.field7286 = arg0;
        var8.field2339 = arg4;
        var8.field3211 = var6;
        if (arg4) {
            if (this.method3359(arg1 - 27820) >= 20) {
                throw new RuntimeException();
            }
            this.field8198.method1203(var8, -101);
        } else if (this.method3350(false) < 20) {
            this.field8200.method1203(var8, -101);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(I)V", line = 218)
    public static void method3357(int arg0) {
        field8189 = null;
        if (arg0 != 0) {
            field8189 = null;
        }
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(B)V", line = 228)
    public final void method3358(byte arg0) {
        field8193++;
        if (this.field8205 != null) {
            this.field8205.method769((byte) -127);
        }
        if (arg0 <= 27) {
            this.method3364((byte) 27);
        }
    }

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "(I)I", line = 245)
    public final int method3359(int arg0) {
        if (arg0 != 20) {
            this.field8203 = -102;
        }
        field8183++;
        return this.field8198.method1198(77) + this.field8199.method1198(120);
    }

    @OriginalMember(owner = "client!kha", name = "d", descriptor = "(I)V", line = 258)
    public final void method3360(int arg0) {
        if (arg0 != 7) {
            this.method3362(88);
        }
        if (this.field8205 != null) {
            this.field8205.method763(0);
        }
        field8194++;
    }

    @OriginalMember(owner = "client!kha", name = "e", descriptor = "(I)Z", line = 272)
    public final boolean method3361(int arg0) {
        if (this.field8205 != null) {
            long var2 = class742.method4128(1);
            int var4 = (int) (var2 - this.field8202);
            this.field8202 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field8203 += var4;
            if (this.field8203 > 30000) {
                try {
                    this.field8205.method769((byte) -126);
                } catch (Exception var27) {
                }
                this.field8205 = null;
            }
        }
        field8188++;
        if (this.field8205 == null) {
            return this.method3359(20) == 0 && this.method3350(false) == 0;
        } else if (arg0 < 55) {
            return false;
        } else {
            try {
                this.field8205.method762(-19861);
                for (class511 var5 = (class511) this.field8198.method1196(-128); var5 != null; var5 = (class511) this.field8198.method1204(false)) {
                    this.field8204.field469 = 0;
                    this.field8204.method263((byte) 94, 1);
                    this.field8204.method245(1537222688, (int) var5.field3211);
                    this.field8205.method765(false, 4, 0, this.field8204.field483);
                    this.field8199.method1203(var5, -101);
                }
                for (class511 var6 = (class511) this.field8200.method1196(-123); var6 != null; var6 = (class511) this.field8200.method1204(false)) {
                    this.field8204.field469 = 0;
                    this.field8204.method263((byte) -113, 0);
                    this.field8204.method245(1537222688, (int) var6.field3211);
                    this.field8205.method765(false, 4, 0, this.field8204.field483);
                    this.field8201.method1203(var6, -101);
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = this.field8205.method768((byte) 81);
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    this.field8203 = 0;
                    byte var9 = 0;
                    if (this.field8210 == null) {
                        var9 = 8;
                    } else if (this.field8210.field7289 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - this.field8206.field469;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        this.field8205.method761(var10, -118, this.field8206.field469, this.field8206.field483);
                        if (this.field8208 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                this.field8206.field483[this.field8206.field469 + var11] = (byte) class349.method2193(this.field8206.field483[this.field8206.field469 + var11], this.field8208);
                            }
                        }
                        this.field8206.field469 += var10;
                        if (var9 <= this.field8206.field469) {
                            if (this.field8210 == null) {
                                this.field8206.field469 = 0;
                                int var12 = this.field8206.method273(255);
                                int var13 = this.field8206.method253(-13900);
                                int var14 = this.field8206.method273(255);
                                int var15 = this.field8206.method234((byte) -115);
                                int var16 = var14 & 0x7F;
                                boolean var17 = (var14 & 0x80) != 0;
                                long var18 = (long) ((var12 << 16) + var13);
                                Object var20 = null;
                                class511 var21;
                                if (var17) {
                                    for (var21 = (class511) this.field8201.method1196(-125); var21 != null && var21.field3211 != var18; var21 = (class511) this.field8201.method1204(false)) {
                                    }
                                } else {
                                    for (var21 = (class511) this.field8199.method1196(-124); var21 != null && var21.field3211 != var18; var21 = (class511) this.field8199.method1204(false)) {
                                    }
                                }
                                if (var21 == null) {
                                    throw new IOException();
                                }
                                int var22 = var16 == 0 ? 5 : 9;
                                this.field8210 = var21;
                                this.field8210.field7288 = new class35(this.field8210.field7286 + var15 + var22);
                                this.field8210.field7288.method263((byte) 95, var16);
                                this.field8210.field7288.method233(var15, -23162);
                                this.field8210.field7289 = 8;
                                this.field8206.field469 = 0;
                            } else if (this.field8210.field7289 != 0) {
                                throw new IOException();
                            } else if (this.field8206.field483[0] == -1) {
                                this.field8210.field7289 = 1;
                                this.field8206.field469 = 0;
                            } else {
                                this.field8210 = null;
                            }
                        }
                    } else {
                        int var23 = this.field8210.field7288.field483.length - this.field8210.field7286;
                        int var24 = 512 - this.field8210.field7289;
                        if (var24 > (var23 - this.field8210.field7288.field469)) {
                            var24 = var23 - this.field8210.field7288.field469;
                        }
                        if (var8 < var24) {
                            var24 = var8;
                        }
                        this.field8205.method761(var24, -123, this.field8210.field7288.field469, this.field8210.field7288.field483);
                        if (this.field8208 != 0) {
                            for (int var25 = 0; var25 < var24; var25++) {
                                this.field8210.field7288.field483[this.field8210.field7288.field469 + var25] = (byte) class349.method2193(this.field8210.field7288.field483[this.field8210.field7288.field469 + var25], this.field8208);
                            }
                        }
                        this.field8210.field7289 += var24;
                        this.field8210.field7288.field469 += var24;
                        if (this.field8210.field7288.field469 == var23) {
                            this.field8210.method1553(75);
                            this.field8210.field2336 = false;
                            this.field8210 = null;
                        } else if (this.field8210.field7289 == 512) {
                            this.field8210.field7289 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var28) {
                try {
                    this.field8205.method769((byte) -128);
                } catch (Exception var26) {
                }
                this.field8205 = null;
                this.field8209++;
                this.field8207 = -2;
                return this.method3359(20) == 0 && this.method3350(false) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!kha", name = "f", descriptor = "(I)Z", line = 554)
    public final boolean method3362(int arg0) {
        field8185++;
        if (arg0 != 0) {
            method3357(-127);
        }
        return this.method3359(20) >= 20;
    }

    @OriginalMember(owner = "client!kha", name = "g", descriptor = "(I)Z", line = 568)
    public final boolean method3363(int arg0) {
        field8192++;
        if (arg0 != 0) {
            this.method3360(81);
        }
        return this.method3350(false) >= 20;
    }

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "(B)V", line = 579)
    private final void method3364(byte arg0) {
        field8196++;
        int var2 = -121 / ((-arg0 - 36) / 58);
        if (this.field8205 == null) {
            return;
        }
        try {
            this.field8204.field469 = 0;
            this.field8204.method263((byte) -120, 6);
            this.field8204.method245(1537222688, 3);
            this.field8205.method765(false, 4, 0, this.field8204.field483);
        } catch (IOException var4) {
            try {
                this.field8205.method769((byte) -127);
            } catch (Exception var3) {
            }
            this.field8209++;
            this.field8205 = null;
            this.field8207 = -2;
        }
    }
}
