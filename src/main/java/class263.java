import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class263 extends class456 {

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "Ljava/lang/Object;")
    private Object field4019 = new Object();

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    private int field4023 = 0;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    private int field4022 = 0;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "[Lau;")
    private class521[] field4024 = new class521[0];

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "Lje;")
    public static class278 field4014 = new class278(2, 4, 4, 0);

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "Lmf;")
    public static class291 field4025;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    public static int field4021;

    static {
        new class309("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field4025 = new class291();
        field4026 = -1;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)Z", line = 4)
    public static final boolean method1682(boolean arg0, int arg1) {
        if (!arg0) {
            method1683(21, 51, 107, 46, 6, -36, 4);
        }
        ++field4011;
        return ~arg1 == -10 || ~arg1 == -11 || ~arg1 == -12;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIII)V", line = 16)
    public static final void method1683(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class519 var7 = new class519();
        var7.field7553 = arg1 >> class353.field5216;
        var7.field7550 = arg2 >> class353.field5216;
        var7.field7538 = arg3 >> class353.field5216;
        var7.field7554 = arg4 >> class353.field5216;
        var7.field7539 = arg0;
        var7.field7545 = arg1;
        var7.field7536 = arg2;
        var7.field7535 = arg3;
        var7.field7534 = arg4;
        var7.field7549 = arg5;
        var7.field7555 = arg6;
        class161.field2589[class296.field4501++] = var7;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(FIZLya;I)V", line = 33)
    public final void method1346(float arg0, int arg1, boolean arg2, class38 arg3, int arg4) {
        ++field4012;
        if (arg1 == 5000) {
            Object var6 = this.field4019;
            synchronized (this.field4019) {
                super.field6769[super.field6767] = (byte) (!arg2 ? arg4 + 30 : arg4 + 40);
                super.field6772[super.field6767] = arg3;
                super.field6765[super.field6767] = arg0;
                ++super.field6767;
                ++super.field6766;
                ++super.field6761;
                if (~super.field6767 <= -5001) {
                    super.field6767 = 0;
                }
                if (this.field4022 > 0) {
                    this.field4019.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lak;I)V", line = 58)
    public final void method1343(class234 arg0, int arg1) {
        Object var3 = this.field4019;
        synchronized (this.field4019) {
            --super.field6763;
            if (~super.field6763 > -1) {
                super.field6763 = 4999;
            }
            super.field6769[super.field6763] = 21;
            if (arg1 != 1) {
                return;
            }
            super.field6772[super.field6763] = arg0;
            ++super.field6766;
            ++super.field6761;
            if (this.field4022 > 0) {
                this.field4019.notifyAll();
            }
        }
        ++field4017;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)V", line = 82)
    public final void method1341(byte arg0, int arg1) {
        Object var3 = this.field4019;
        synchronized (this.field4019) {
            super.field6769[super.field6767] = (byte) arg1;
            ++super.field6767;
            if (arg0 != -27) {
                this.field4023 = 85;
            }
            ++super.field6766;
            if (~super.field6767 <= -5001) {
                super.field6767 = 0;
            }
            ++super.field6761;
            if (this.field4022 > 0) {
                this.field4019.notifyAll();
            }
        }
        ++field4013;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(II)V", line = 105)
    private final void method1684(int arg0, int arg1) {
        if (arg1 != -11) {
            field4025 = null;
        }
        ++field4020;
        super.field6769[super.field6767] = (byte) (arg0 + 10);
        ++super.field6767;
        if (~super.field6767 <= -5001) {
            super.field6767 = 0;
        }
        ++super.field6766;
        ++super.field6761;
        if (this.field4022 > 0) {
            Object var3 = this.field4019;
            synchronized (this.field4019) {
                this.field4019.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 132)
    public final void method1345(int arg0) {
        ++field4018;
        try {
            if (arg0 != -696) {
                this.field4023 = 27;
            }
            Object var2 = this.field4019;
            synchronized (this.field4019) {
                while (super.field6766 != 0) {
                    this.field4019.wait();
                }
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILak;)V", line = 160)
    public final void method1339(int arg0, class234 arg1) {
        Object var3 = this.field4019;
        synchronized (this.field4019) {
            super.field6769[super.field6767] = 20;
            super.field6772[super.field6767] = arg1;
            ++super.field6767;
            if (arg0 != -7763) {
                method1687((byte) -27);
            }
            ++super.field6766;
            if (super.field6767 >= 5000) {
                super.field6767 = 0;
            }
            ++super.field6761;
            if (this.field4022 > 0) {
                this.field4019.notifyAll();
            }
        }
        ++field4010;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V", line = 184)
    public final void method1349(int arg0) {
        if (arg0 == 1) {
            Object var2 = this.field4019;
            synchronized (this.field4019) {
                int var3 = 0;
                while (true) {
                    if (this.field4023 <= var3) {
                        break;
                    }
                    if (~this.field4024[var3].field7565 <= -1) {
                        this.method1684(this.field4024[var3].field7565, -11);
                    }
                    ++var3;
                }
            }
            ++field4021;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLau;)V", line = 207)
    public final void method1685(byte arg0, class521 arg1) {
        ++field4015;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field4019;
            byte var7;
            synchronized (this.field4019) {
                while (~super.field6761 == -1) {
                    ++this.field4022;
                    this.field4019.wait();
                    --this.field4022;
                }
                var7 = super.field6769[super.field6763];
                int var8 = -29 % ((arg0 - 56) / 42);
                if (~arg1.field7565 <= -1) {
                    if (var7 < 0 || ~var7 < -4) {
                        var3 = true;
                    }
                } else if (~var7 <= -1 && ~var7 >= -4) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field6391 = super.field6772[super.field6763];
                    var5 = super.field6765[super.field6763];
                    super.field6772[super.field6763] = null;
                    ++super.field6763;
                    if (~super.field6763 <= -5001) {
                        super.field6763 = 0;
                    }
                    --super.field6761;
                }
            }
            if (var3) {
                if (arg1.field7565 < 0) {
                    if (var7 >= 0 && ~var7 >= -4) {
                        arg1.field7565 = var7;
                        class34.field522.method316(var7);
                    }
                } else if (~var7 != -22) {
                    if (var7 == 20) {
                        class234 var9 = (class234) arg1.field6391;
                        if (var9.field3610 != null) {
                            var9.field3610.method9((byte) -104, class34.field522);
                        }
                        if (var9.field3613 != null) {
                            var9.field3613.method9((byte) -123, class34.field522);
                        }
                        if (var9.field3605 != null) {
                            var9.field3605.method9((byte) -113, class34.field522);
                        }
                        if (var9.field3602 != null) {
                            var9.field3602.method9((byte) -120, class34.field522);
                        }
                        if (var9.field3619 != null) {
                            var9.field3619.method9((byte) -120, class34.field522);
                        }
                        for (class440 var10 = var9.field3607; var10 != null; var10 = var10.field6528) {
                            var10.field6530.method9((byte) -113, class34.field522);
                        }
                    } else if (~var7 <= -31 && ~var7 >= -34) {
                        class34.field522.method385(3000.0F, var5 * 1.5F);
                        ((class38) arg1.field6391).method176(class107.field1974, class199.field3222, class97.field1894, class38.field559, var7 + -30 == 0);
                    } else if (var7 >= 40 && var7 <= 43) {
                        class34.field522.method385(3000.0F, var5 * 1.5F);
                        ((class38) arg1.field6391).method176(class107.field1974, class199.field3222, class97.field1894, class486.field7158, ~(var7 + -40) == -1);
                    } else if (var7 != 22) {
                        if (~var7 != -24) {
                            if (~var7 != -25) {
                                if (var7 >= 10 && ~var7 >= -14) {
                                    class34.field522.method409(arg1.field7565);
                                    arg1.field7565 = -1;
                                }
                            } else {
                                class34.field522.method372(0, (class256[]) null);
                            }
                        } else {
                            class34.field522.method367();
                        }
                    } else {
                        class34.field522.method428(-1, 1583160, 40, 127);
                    }
                } else {
                    class222.method1482(arg1, (class234) arg1.field6391);
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var23) {
        } finally {
            Object var14 = null;
            if (var3) {
                Object var15 = this.field4019;
                synchronized (this.field4019) {
                    --super.field6766;
                    if (~super.field6766 == -1) {
                        this.field4019.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLak;)V", line = 380)
    public final void method1344(byte arg0, class234 arg1) {
        ++field4008;
        Object var3 = this.field4019;
        synchronized (this.field4019) {
            super.field6769[super.field6767] = 21;
            super.field6772[super.field6767] = arg1;
            ++super.field6767;
            ++super.field6761;
            if (~super.field6767 <= -5001) {
                super.field6767 = 0;
            }
            if (arg0 >= -32) {
                this.method1344((byte) 28, (class234) null);
            }
            ++super.field6766;
            if (~this.field4022 < -1) {
                this.field4019.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(ZI)V", line = 403)
    private final void method1686(boolean arg0, int arg1) {
        super.field6769[super.field6767] = (byte) arg1;
        ++field4009;
        ++super.field6767;
        if (!arg0) {
            this.field4022 = -30;
        }
        if (super.field6767 >= 5000) {
            super.field6767 = 0;
        }
        ++super.field6761;
        ++super.field6766;
        if (this.field4022 > 0) {
            Object var3 = this.field4019;
            synchronized (this.field4019) {
                this.field4019.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)V", line = 429)
    public final void method1347(int arg0, int arg1) {
        ++field4016;
        int var3 = 0;
        Object var4 = this.field4019;
        synchronized (this.field4019) {
            if (~this.field4023 == ~arg1) {
                for (int var5 = 0; this.field4023 > var5; ++var5) {
                    this.method1686(true, var3++);
                }
            } else {
                for (int var6 = 0; this.field4023 > var6; ++var6) {
                    this.field4024[var6].method3085((byte) 35);
                }
                this.field4023 = arg1;
                this.field4024 = new class521[this.field4023];
                int var7 = 0;
                if (arg0 >= 86) {
                    while (~var7 > ~this.field4023) {
                        this.field4024[var7] = new class521(this);
                        this.field4024[var7].method3087(0);
                        this.method1686(true, var3++);
                        ++var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V", line = 490)
    public static void method1687(byte arg0) {
        if (arg0 <= 111) {
            method1683(-68, 78, 14, 92, -55, -13, 88);
        }
        field4014 = null;
        field4025 = null;
    }
}
