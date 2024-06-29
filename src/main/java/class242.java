import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class242 extends class354 {

    @OriginalMember(owner = "client!id", name = "w", descriptor = "Ljava/lang/Object;")
    private Object field3417 = new Object();

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    private int field3422 = 0;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    private int field3419 = 0;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "[Lrf;")
    private class444[] field3425 = new class444[0];

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "[Lwn;")
    public static class77[] field3429;

    static {
        new class368("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(IZ)V", line = 4)
    private final void method1567(int arg0, boolean arg1) {
        super.field4752[super.field4758] = (byte) (arg0 + 10);
        if (!arg1) {
            this.field3422 = -89;
        }
        ++field3414;
        ++super.field4758;
        ++super.field4756;
        ++super.field4753;
        if (super.field4758 >= 5000) {
            super.field4758 = 0;
        }
        if (~this.field3419 < -1) {
            Object var3 = this.field3417;
            synchronized (this.field3417) {
                this.field3417.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lr;B)V", line = 29)
    public final void method1568(class63 arg0, byte arg1) {
        if (arg1 > -122) {
            this.field3425 = null;
        }
        Object var3 = this.field3417;
        synchronized (this.field3417) {
            super.field4752[super.field4758] = 21;
            super.field4757[super.field4758] = arg0;
            ++super.field4758;
            ++super.field4753;
            if (super.field4758 >= 5000) {
                super.field4758 = 0;
            }
            ++super.field4756;
            if (this.field3419 > 0) {
                this.field3417.notifyAll();
            }
        }
        ++field3423;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lrf;I)V", line = 53)
    public final void method1569(class444 arg0, int arg1) {
        ++field3428;
        boolean var3 = false;
        if (arg1 >= -51) {
            this.field3422 = 71;
        }
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field3417;
            byte var7;
            synchronized (this.field3417) {
                while (~super.field4756 == -1) {
                    ++this.field3419;
                    this.field3417.wait();
                    --this.field3419;
                }
                var7 = super.field4752[super.field4754];
                if (arg0.field6226 >= 0) {
                    if (~var7 > -1 || ~var7 < -4) {
                        var3 = true;
                    }
                } else if (var7 >= 0 && ~var7 >= -4) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field4248 = super.field4757[super.field4754];
                    var5 = super.field4766[super.field4754];
                    super.field4757[super.field4754] = null;
                    ++super.field4754;
                    if (super.field4754 >= 5000) {
                        super.field4754 = 0;
                    }
                    --super.field4756;
                }
            }
            if (var3) {
                if (~arg0.field6226 > -1) {
                    if (var7 >= 0 && var7 <= 3) {
                        arg0.field6226 = var7;
                        class389.field5413.method181(var7);
                    }
                } else if (~var7 == -22) {
                    class402.method2489(arg0, (class63) arg0.field4248);
                } else if (var7 != 20) {
                    if (~var7 <= -31 && var7 <= 33) {
                        class389.field5413.method180(3000.0F, var5 * 1.5F);
                        ((class323) arg0.field4248).method338(class58.field750, class446.field6253, class244.field3440, class6.field62, ~(var7 + -30) == -1);
                    } else if (~var7 <= -41 && var7 <= 43) {
                        class389.field5413.method180(3000.0F, var5 * 1.5F);
                        ((class323) arg0.field4248).method338(class58.field750, class446.field6253, class244.field3440, class450.field6457, var7 + -40 == 0);
                    } else if (~var7 == -23) {
                        class389.field5413.method175(-1, 1583160, 40);
                    } else if (var7 != 23) {
                        if (~var7 != -25) {
                            if (var7 >= 10 && ~var7 >= -14) {
                                class389.field5413.method237(arg0.field6226);
                                arg0.field6226 = -1;
                            }
                        } else {
                            class389.field5413.method247(0, (class155[]) null);
                        }
                    } else {
                        class389.field5413.method201();
                    }
                } else {
                    class63 var8 = (class63) arg0.field4248;
                    if (var8.field867 != null) {
                        var8.field867.method707(class389.field5413, -104);
                    }
                    if (var8.field863 != null) {
                        var8.field863.method707(class389.field5413, -108);
                    }
                    if (var8.field861 != null) {
                        var8.field861.method707(class389.field5413, -109);
                    }
                    if (var8.field859 != null) {
                        var8.field859.method707(class389.field5413, -127);
                    }
                    if (var8.field854 != null) {
                        var8.field854.method707(class389.field5413, -119);
                    }
                    for (class48 var9 = var8.field853; var9 != null; var9 = var9.field608) {
                        var9.field617.method707(class389.field5413, -125);
                    }
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field3417;
                synchronized (this.field3417) {
                    --super.field4753;
                    if (~super.field4753 == -1) {
                        this.field3417.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(IZ)V", line = 220)
    public static final void method1570(int arg0, boolean arg1) {
        ++field3426;
        if (arg1 == !class26.field329) {
            class26.field329 = arg1;
            class339.method2067(-2060154424);
            if (arg0 > -59) {
                field3429 = null;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)V", line = 237)
    public final void method1571(int arg0, boolean arg1) {
        ++field3420;
        int var3 = 0;
        Object var4 = this.field3417;
        synchronized (this.field3417) {
            if (this.field3422 == arg0) {
                for (int var5 = 0; ~this.field3422 < ~var5; ++var5) {
                    this.method1575(var3++, (byte) 11);
                }
            } else {
                for (int var6 = 0; this.field3422 > var6; ++var6) {
                    this.field3425[var6].method2747((byte) 6);
                }
                this.field3422 = arg0;
                if (!arg1) {
                    this.field3425 = new class444[this.field3422];
                    for (int var7 = 0; var7 < this.field3422; ++var7) {
                        this.field3425[var7] = new class444(this);
                        this.field3425[var7].method2749((byte) 103);
                        this.method1575(var3++, (byte) 119);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILr;)V", line = 287)
    public final void method1572(int arg0, class63 arg1) {
        if (arg0 != 5000) {
            this.field3422 = -86;
        }
        ++field3424;
        Object var3 = this.field3417;
        synchronized (this.field3417) {
            --super.field4754;
            if (~super.field4754 > -1) {
                super.field4754 = 4999;
            }
            super.field4752[super.field4754] = 21;
            super.field4757[super.field4754] = arg1;
            ++super.field4753;
            ++super.field4756;
            if (this.field3419 > 0) {
                this.field3417.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V", line = 312)
    public static void method1573(boolean arg0) {
        if (!arg0) {
            field3429 = null;
        }
        field3429 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)V", line = 323)
    public final void method1574(byte arg0, int arg1) {
        ++field3418;
        Object var3 = this.field3417;
        synchronized (this.field3417) {
            super.field4752[super.field4758] = (byte) arg1;
            ++super.field4758;
            if (super.field4758 >= 5000) {
                super.field4758 = 0;
            }
            ++super.field4753;
            ++super.field4756;
            if (~this.field3419 < -1) {
                this.field3417.notifyAll();
            }
            int var4 = -118 % ((-64 - arg0) / 50);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V", line = 350)
    private final void method1575(int arg0, byte arg1) {
        super.field4752[super.field4758] = (byte) arg0;
        ++field3415;
        ++super.field4758;
        ++super.field4756;
        if (super.field4758 >= 5000) {
            super.field4758 = 0;
        }
        ++super.field4753;
        int var3 = -44 / ((-48 - arg1) / 52);
        if (~this.field3419 < -1) {
            Object var4 = this.field3417;
            synchronized (this.field3417) {
                this.field3417.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Lr;B)V", line = 382)
    public final void method1576(class63 arg0, byte arg1) {
        Object var3 = this.field3417;
        synchronized (this.field3417) {
            super.field4752[super.field4758] = 20;
            super.field4757[super.field4758] = arg0;
            ++super.field4758;
            ++super.field4756;
            ++super.field4753;
            if (~super.field4758 <= -5001) {
                super.field4758 = 0;
            }
            if (this.field3419 > 0) {
                this.field3417.notifyAll();
            }
            if (arg1 >= -65) {
                this.field3425 = null;
            }
        }
        ++field3416;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(FLdn;ZII)V", line = 409)
    public final void method1577(float arg0, class323 arg1, boolean arg2, int arg3, int arg4) {
        ++field3421;
        Object var6 = this.field3417;
        synchronized (this.field3417) {
            super.field4752[super.field4758] = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
            super.field4757[super.field4758] = arg1;
            super.field4766[super.field4758] = arg0;
            if (arg4 >= -47) {
                this.method1572(-107, (class63) null);
            }
            ++super.field4758;
            ++super.field4756;
            ++super.field4753;
            if (~super.field4758 <= -5001) {
                super.field4758 = 0;
            }
            if (this.field3419 > 0) {
                this.field3417.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V", line = 442)
    public final void method1578(int arg0) {
        try {
            int var2 = 86 / ((-48 - arg0) / 53);
            Object var3 = this.field3417;
            synchronized (this.field3417) {
                while (true) {
                    if (~super.field4753 == -1) {
                        break;
                    }
                    this.field3417.wait();
                }
            }
        } catch (Exception var5) {
        }
        ++field3427;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 463)
    public final void method1579(int arg0) {
        if (arg0 == -22563) {
            ++field3413;
            Object var2 = this.field3417;
            synchronized (this.field3417) {
                for (int var3 = 0; ~this.field3422 < ~var3; ++var3) {
                    if (this.field3425[var3].field6226 >= 0) {
                        this.method1567(this.field3425[var3].field6226, true);
                    }
                }
            }
        }
    }
}
