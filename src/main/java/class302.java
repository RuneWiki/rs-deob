import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class302 extends class377 {

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field4414 = new Object();

    @OriginalMember(owner = "client!dn", name = "G", descriptor = "[Ltm;")
    private class220[] field4416 = new class220[0];

    @OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
    private int field4419 = 0;

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "I")
    private int field4418 = 0;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "[C")
    public static char[] field4405 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    public static int field4402 = 0;

    @OriginalMember(owner = "client!dn", name = "H", descriptor = "I")
    public static int field4417 = -1;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!dn", name = "K", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V")
    public final void method1916(int arg0, int arg1) {
        ++field4420;
        int var3 = 0;
        Object var4 = this.field4414;
        synchronized (this.field4414) {
            if (~this.field4418 == ~arg0) {
                for (int var5 = 0; this.field4418 > var5; ++var5) {
                    this.method2032(62, var3++);
                }
            } else {
                for (int var6 = arg1; this.field4418 > var6; ++var6) {
                    this.field4416[var6].method1550(true);
                }
                this.field4418 = arg0;
                this.field4416 = new class220[this.field4418];
                for (int var7 = 0; ~this.field4418 < ~var7; ++var7) {
                    this.field4416[var7] = new class220(this);
                    this.field4416[var7].method1551(2);
                    this.method2032(112, var3++);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(FBIZLuh;)V")
    public final void method1911(float arg0, byte arg1, int arg2, boolean arg3, class92 arg4) {
        Object var6 = this.field4414;
        synchronized (this.field4414) {
            super.field5374[super.field5370] = (byte) (arg3 ? arg2 + 40 : arg2 + 30);
            super.field5375[super.field5370] = arg4;
            super.field5372[super.field5370] = arg0;
            ++super.field5370;
            ++super.field5366;
            if (arg1 != -118) {
                field4405 = null;
            }
            ++super.field5371;
            if (~super.field5370 <= -5001) {
                super.field5370 = 0;
            }
            if (this.field4419 > 0) {
                this.field4414.notifyAll();
            }
        }
        ++field4403;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)V")
    public static void method2031(byte arg0) {
        field4405 = null;
        if (arg0 < 112) {
            method2035(37, -86, -105, -101);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILls;)V")
    public final void method1919(int arg0, class74 arg1) {
        ++field4413;
        Object var3 = this.field4414;
        synchronized (this.field4414) {
            super.field5374[super.field5370] = 20;
            super.field5375[super.field5370] = arg1;
            ++super.field5370;
            int var4 = -67 % ((83 - arg0) / 35);
            ++super.field5366;
            ++super.field5371;
            if (~super.field5370 <= -5001) {
                super.field5370 = 0;
            }
            if (this.field4419 > 0) {
                this.field4414.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)V")
    private final void method2032(int arg0, int arg1) {
        ++field4409;
        if (arg0 <= 24) {
            this.method1913(false);
        }
        super.field5374[super.field5370] = (byte) arg1;
        ++super.field5370;
        ++super.field5366;
        if (~super.field5370 <= -5001) {
            super.field5370 = 0;
        }
        ++super.field5371;
        if (~this.field4419 < -1) {
            Object var3 = this.field4414;
            synchronized (this.field4414) {
                this.field4414.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
    public final void method1917(byte arg0) {
        ++field4401;
        Object var2 = this.field4414;
        synchronized (this.field4414) {
            if (arg0 <= 114) {
                method2035(-24, 111, 33, 80);
            }
            for (int var3 = 0; var3 < this.field4418; ++var3) {
                if (~this.field4416[var3].field3171 <= -1) {
                    this.method2033(0, this.field4416[var3].field3171);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lls;Z)V")
    public final void method1912(class74 arg0, boolean arg1) {
        Object var3 = this.field4414;
        synchronized (this.field4414) {
            super.field5374[super.field5370] = 21;
            super.field5375[super.field5370] = arg0;
            ++super.field5370;
            if (arg1) {
                this.method1911(0.6666535F, (byte) -40, -22, false, (class92) null);
            }
            ++super.field5366;
            if (super.field5370 >= 5000) {
                super.field5370 = 0;
            }
            ++super.field5371;
            if (~this.field4419 < -1) {
                this.field4414.notifyAll();
            }
        }
        ++field4412;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lls;B)V")
    public final void method1914(class74 arg0, byte arg1) {
        ++field4408;
        Object var3 = this.field4414;
        synchronized (this.field4414) {
            --super.field5373;
            if (arg1 != -88) {
                this.method2033(16, 73);
            }
            if (super.field5373 < 0) {
                super.field5373 = 4999;
            }
            super.field5374[super.field5373] = 21;
            super.field5375[super.field5373] = arg0;
            ++super.field5371;
            ++super.field5366;
            if (~this.field4419 < -1) {
                this.field4414.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)V")
    private final void method2033(int arg0, int arg1) {
        ++field4407;
        if (arg0 == 0) {
            super.field5374[super.field5370] = (byte) (arg1 + 10);
            ++super.field5370;
            ++super.field5366;
            ++super.field5371;
            if (super.field5370 >= 5000) {
                super.field5370 = 0;
            }
            if (~this.field4419 < -1) {
                Object var3 = this.field4414;
                synchronized (this.field4414) {
                    this.field4414.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V")
    public final void method1913(boolean arg0) {
        try {
            Object var2 = this.field4414;
            synchronized (this.field4414) {
                while (true) {
                    if (~super.field5366 == -1) {
                        break;
                    }
                    this.field4414.wait();
                }
            }
            if (!arg0) {
                this.method1919(121, (class74) null);
            }
        } catch (Exception var4) {
        }
        ++field4411;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)V")
    public static final void method2034(byte arg0) {
        int var1 = 23 / ((49 - arg0) / 42);
        class390.field5490.method989(class200.field2855, !class125.field1678 ? -1 : class439.field6278 - -256);
        ++field4406;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIII)V")
    public static final void method2035(int arg0, int arg1, int arg2, int arg3) {
        class320.field4692 = new byte[arg0][arg3][arg2];
        if (arg1 != 246) {
            method2036(67, 73, -14);
        }
        ++field4404;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)V")
    public static final void method2036(int arg0, int arg1, int arg2) {
        class74 var3 = class385.field5449[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field975 != null) {
                var3.field975 = null;
            }
            if (var3.field977 != null) {
                var3.field977 = null;
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)V")
    public final void method1915(int arg0, byte arg1) {
        Object var3 = this.field4414;
        synchronized (this.field4414) {
            super.field5374[super.field5370] = (byte) arg0;
            ++super.field5370;
            if (arg1 != -19) {
                this.method1915(107, (byte) 91);
            }
            if (super.field5370 >= 5000) {
                super.field5370 = 0;
            }
            ++super.field5371;
            ++super.field5366;
            if (this.field4419 > 0) {
                this.field4414.notifyAll();
            }
        }
        ++field4415;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ltm;I)V")
    public final void method2037(class220 arg0, int arg1) {
        ++field4410;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field4414;
            byte var7;
            synchronized (this.field4414) {
                while (~super.field5371 == -1) {
                    ++this.field4419;
                    this.field4414.wait();
                    --this.field4419;
                }
                if (arg1 <= 81) {
                    field4402 = 78;
                }
                var7 = super.field5374[super.field5373];
                if (~arg0.field3171 > -1) {
                    if (var7 >= 0 && var7 <= 3) {
                        var3 = true;
                    }
                } else if (var7 < 0 || ~var7 < -4) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field5482 = super.field5375[super.field5373];
                    var5 = super.field5372[super.field5373];
                    super.field5375[super.field5373] = null;
                    ++super.field5373;
                    if (~super.field5373 <= -5001) {
                        super.field5373 = 0;
                    }
                    --super.field5371;
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (arg0.field3171 < 0) {
                if (var7 >= 0 && var7 <= 3) {
                    arg0.field3171 = var7;
                    class294.field4251.method890(var7);
                }
            } else if (~var7 != -22) {
                if (~var7 != -21) {
                    if (var7 >= 30 && ~var7 >= -34) {
                        class294.field4251.method956(3000.0F, var5 * 1.5F);
                        ((class92) arg0.field5482).method358(class65.field891, class333.field4842, class150.field2249, class9.field125, ~(var7 + -30) == -1);
                    } else if (var7 >= 40 && var7 <= 43) {
                        class294.field4251.method956(3000.0F, var5 * 1.5F);
                        ((class92) arg0.field5482).method358(class65.field891, class333.field4842, class150.field2249, class213.field3013, var7 + -40 == 0);
                    } else if (var7 == 22) {
                        class294.field4251.method1006(-1, 1583160, 40);
                    } else if (var7 == 23) {
                        class294.field4251.method967();
                    } else if (~var7 == -25) {
                        class294.field4251.method945(0, (class402[]) null);
                    } else if (var7 >= 10 && var7 <= 13) {
                        class294.field4251.method1005(arg0.field3171);
                        arg0.field3171 = -1;
                    }
                } else {
                    class74 var8 = (class74) arg0.field5482;
                    if (var8.field975 != null) {
                        var8.field975.method22(class294.field4251, (byte) 44);
                    }
                    if (var8.field977 != null) {
                        var8.field977.method22(class294.field4251, (byte) 58);
                    }
                    if (var8.field967 != null) {
                        var8.field967.method22(class294.field4251, (byte) 46);
                    }
                    if (var8.field976 != null) {
                        var8.field976.method22(class294.field4251, (byte) 109);
                    }
                    if (var8.field969 != null) {
                        var8.field969.method22(class294.field4251, (byte) 114);
                    }
                    for (class353 var9 = var8.field970; var9 != null; var9 = var9.field5127) {
                        var9.field5125.method22(class294.field4251, (byte) 117);
                    }
                }
            } else {
                class352.method2305(arg0, (class74) arg0.field5482);
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field4414;
                synchronized (this.field4414) {
                    --super.field5366;
                    if (super.field5366 == 0) {
                        this.field4414.notifyAll();
                    }
                }
            }
        }
    }
}
