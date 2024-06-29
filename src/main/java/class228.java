import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class228 extends class216 {

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "Ljava/lang/Object;")
    private Object field3415 = new Object();

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    private int field3422 = 0;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "[Lqk;")
    private class345[] field3429 = new class345[0];

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    private int field3424 = 0;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "Ljn;")
    public static class409 field3431 = new class409("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "Ljn;")
    public static class409 field3432 = new class409("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "[Lat;")
    public static class256[] field3433 = new class256[2048];

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
    public final void method38(int arg0, int arg1) {
        ++field3426;
        int var3 = 0;
        Object var4 = this.field3415;
        synchronized (this.field3415) {
            if (this.field3422 == arg1) {
                for (int var5 = 0; this.field3422 > var5; ++var5) {
                    this.method1566(arg0 + -127, var3++);
                }
            } else {
                for (int var6 = 0; ~var6 > ~this.field3422; ++var6) {
                    this.field3429[var6].method2237(-1);
                }
                this.field3422 = arg1;
                this.field3429 = new class345[this.field3422];
                for (int var7 = arg0; this.field3422 > var7; ++var7) {
                    this.field3429[var7] = new class345(this);
                    this.field3429[var7].method2238(19663);
                    this.method1566(arg0 ^ -127, var3++);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(II)Lpo;")
    public static final class210 method1560(int arg0, int arg1) {
        ++field3427;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (arg1 != 7) {
                                        if (arg1 != 8) {
                                            if (arg1 != 9) {
                                                if (arg1 != 10) {
                                                    if (~arg1 != -12) {
                                                        if (~arg1 != -13) {
                                                            if (arg1 != 13) {
                                                                if (~arg1 != -15) {
                                                                    if (~arg1 != -16) {
                                                                        if (arg1 != 16) {
                                                                            if (arg1 != 17) {
                                                                                if (~arg1 != -19) {
                                                                                    if (~arg1 != -20) {
                                                                                        if (arg1 != 20) {
                                                                                            if (~arg1 != -22) {
                                                                                                if (arg1 != 22) {
                                                                                                    if (arg1 != 23) {
                                                                                                        if (~arg1 != -25) {
                                                                                                            if (arg1 != 25) {
                                                                                                                if (~arg1 != -27) {
                                                                                                                    if (arg1 != 27) {
                                                                                                                        if (~arg1 != -29) {
                                                                                                                            if (~arg1 != -30) {
                                                                                                                                if (~arg1 != -31) {
                                                                                                                                    if (arg1 != 31) {
                                                                                                                                        if (~arg1 != -33) {
                                                                                                                                            if (arg1 != 33) {
                                                                                                                                                if (arg1 != 34) {
                                                                                                                                                    if (~arg1 != -36) {
                                                                                                                                                        if (arg1 != 36) {
                                                                                                                                                            if (arg1 != 37) {
                                                                                                                                                                if (arg1 != 38) {
                                                                                                                                                                    if (~arg1 == -40) {
                                                                                                                                                                        return new class310();
                                                                                                                                                                    } else {
                                                                                                                                                                        if (arg0 != 2) {
                                                                                                                                                                            field3431 = null;
                                                                                                                                                                        }
                                                                                                                                                                        return null;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    return new class42();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class250();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class18();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class92();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class227();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class334();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class275();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class318();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class342();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class202();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class451();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class44();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class432();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class320();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class165();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class225();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class51();
                                                                                                }
                                                                                            } else {
                                                                                                return new class84();
                                                                                            }
                                                                                        } else {
                                                                                            return new class316();
                                                                                        }
                                                                                    } else {
                                                                                        return new class257();
                                                                                    }
                                                                                } else {
                                                                                    return new class244();
                                                                                }
                                                                            } else {
                                                                                return new class7();
                                                                            }
                                                                        } else {
                                                                            return new class222();
                                                                        }
                                                                    } else {
                                                                        return new class88();
                                                                    }
                                                                } else {
                                                                    return new class236();
                                                                }
                                                            } else {
                                                                return new class237();
                                                            }
                                                        } else {
                                                            return new class60();
                                                        }
                                                    } else {
                                                        return new class189();
                                                    }
                                                } else {
                                                    return new class251();
                                                }
                                            } else {
                                                return new class180();
                                            }
                                        } else {
                                            return new class388();
                                        }
                                    } else {
                                        return new class308();
                                    }
                                } else {
                                    return new class347();
                                }
                            } else {
                                return new class75();
                            }
                        } else {
                            return new class393();
                        }
                    } else {
                        return new class56();
                    }
                } else {
                    return new class313();
                }
            } else {
                return new class303();
            }
        } else {
            return new class249();
        }
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(II)V")
    private final void method1561(int arg0, int arg1) {
        super.field3080[super.field3085] = (byte) (arg0 + 10);
        ++field3421;
        ++super.field3085;
        ++super.field3084;
        if (super.field3085 >= 5000) {
            super.field3085 = 0;
        }
        ++super.field3076;
        if (~this.field3424 < -1) {
            Object var3 = this.field3415;
            synchronized (this.field3415) {
                this.field3415.notifyAll();
            }
        }
        if (arg1 != 0) {
            field3434 = -28;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lct;ILfp;)V")
    public static final void method1562(class104 arg0, int arg1, class9 arg2) {
        ++field3414;
        if (!class322.field4759) {
            arg2.method138(0);
            if (arg1 == -4) {
                class38.field533 = arg2.method100(class144.method994(arg0, class137.field1880), true);
                class38.field533.method1915((class214.field3016 + -class38.field533.method1861()) / 2, (class375.field5473 + -class38.field533.method1860()) / 2);
                class149.field2023 = arg2.method100(class144.method994(arg0, class342.field5041), true);
                class149.field2023.method1915((class214.field3016 - class149.field2023.method1861()) / 2, 18);
                class322.field4759 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)Lds;")
    public static final class233 method1563(int arg0, int arg1, int arg2) {
        class369 var3 = class178.field2530[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5334;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILqk;)V")
    public final void method1564(int arg0, class345 arg1) {
        ++field3423;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field3415;
            byte var7;
            synchronized (this.field3415) {
                while (super.field3084 == 0) {
                    ++this.field3424;
                    this.field3415.wait();
                    --this.field3424;
                }
                if (arg0 <= 54) {
                    this.field3415 = null;
                }
                var7 = super.field3080[super.field3082];
                if (~arg1.field5071 <= -1) {
                    if (var7 < 0 || var7 > 3) {
                        var3 = true;
                    }
                } else if (var7 >= 0 && ~var7 >= -4) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field2085 = super.field3079[super.field3082];
                    var5 = super.field3078[super.field3082];
                    super.field3079[super.field3082] = null;
                    ++super.field3082;
                    if (~super.field3082 <= -5001) {
                        super.field3082 = 0;
                    }
                    --super.field3084;
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (~arg1.field5071 <= -1) {
                if (~var7 == -22) {
                    class100.method673(arg1, (class369) arg1.field2085);
                } else if (~var7 != -21) {
                    if (var7 >= 30 && var7 <= 33) {
                        class151.field2050.method81(3000.0F, var5 * 1.5F);
                        ((class378) arg1.field2085).method1419(class145.field1969, class189.field2651, class31.field431, class57.field694, ~(var7 + -30) == -1);
                    } else if (~var7 <= -41 && ~var7 >= -44) {
                        class151.field2050.method81(3000.0F, var5 * 1.5F);
                        ((class378) arg1.field2085).method1419(class145.field1969, class189.field2651, class31.field431, class276.field4081, var7 + -40 == 0);
                    } else if (var7 == 22) {
                        class151.field2050.method154(-1, 1583160, 40);
                    } else if (var7 != 23) {
                        if (~var7 == -25) {
                            class151.field2050.method68(0, (class298[]) null);
                        } else if (var7 >= 10 && var7 <= 13) {
                            class151.field2050.method129(arg1.field5071);
                            arg1.field5071 = -1;
                        }
                    } else {
                        class151.field2050.method72();
                    }
                } else {
                    class369 var8 = (class369) arg1.field2085;
                    if (var8.field5335 != null) {
                        var8.field5335.method14(-7561, class151.field2050);
                    }
                    if (var8.field5332 != null) {
                        var8.field5332.method14(-7561, class151.field2050);
                    }
                    if (var8.field5327 != null) {
                        var8.field5327.method14(-7561, class151.field2050);
                    }
                    if (var8.field5334 != null) {
                        var8.field5334.method14(-7561, class151.field2050);
                    }
                    if (var8.field5346 != null) {
                        var8.field5346.method14(-7561, class151.field2050);
                    }
                    for (class206 var9 = var8.field5345; var9 != null; var9 = var9.field2882) {
                        var9.field2880.method14(-7561, class151.field2050);
                    }
                }
            } else if (var7 >= 0 && var7 <= 3) {
                arg1.field5071 = var7;
                class151.field2050.method111(var7);
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field3415;
                synchronized (this.field3415) {
                    --super.field3076;
                    if (~super.field3076 == -1) {
                        this.field3415.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
    public static void method1565(byte arg0) {
        if (arg0 != 33) {
            method1560(25, 14);
        }
        field3433 = null;
        field3431 = null;
        field3432 = null;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
    public final void method47(int arg0) {
        ++field3420;
        Object var2 = this.field3415;
        synchronized (this.field3415) {
            int var3 = 0;
            if (arg0 != 5000) {
                this.method38(-95, 126);
            }
            while (~this.field3422 < ~var3) {
                if (this.field3429[var3].field5071 >= 0) {
                    this.method1561(this.field3429[var3].field5071, 0);
                }
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IFZILui;)V")
    public final void method45(int arg0, float arg1, boolean arg2, int arg3, class378 arg4) {
        Object var6 = this.field3415;
        synchronized (this.field3415) {
            super.field3080[super.field3085] = (byte) (!arg2 ? arg3 + 30 : arg3 + 40);
            super.field3079[super.field3085] = arg4;
            super.field3078[super.field3085] = arg1;
            if (arg0 != 24216) {
                return;
            }
            ++super.field3085;
            ++super.field3084;
            ++super.field3076;
            if (~super.field3085 <= -5001) {
                super.field3085 = 0;
            }
            if (~this.field3424 < -1) {
                this.field3415.notifyAll();
            }
        }
        ++field3418;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Log;I)V")
    public final void method46(class369 arg0, int arg1) {
        ++field3417;
        Object var3 = this.field3415;
        synchronized (this.field3415) {
            super.field3080[super.field3085] = 20;
            super.field3079[super.field3085] = arg0;
            ++super.field3085;
            ++super.field3076;
            ++super.field3084;
            if (arg1 == -25826) {
                if (~super.field3085 <= -5001) {
                    super.field3085 = 0;
                }
                if (~this.field3424 < -1) {
                    this.field3415.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILog;)V")
    public final void method44(int arg0, class369 arg1) {
        if (arg0 != -15110) {
            field3433 = null;
        }
        Object var3 = this.field3415;
        synchronized (this.field3415) {
            --super.field3082;
            if (super.field3082 < 0) {
                super.field3082 = 4999;
            }
            super.field3080[super.field3082] = 21;
            super.field3079[super.field3082] = arg1;
            ++super.field3076;
            ++super.field3084;
            if (~this.field3424 < -1) {
                this.field3415.notifyAll();
            }
        }
        ++field3419;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)V")
    public final void method37(int arg0, int arg1) {
        Object var3 = this.field3415;
        synchronized (this.field3415) {
            super.field3080[super.field3085] = (byte) arg0;
            int var4 = -103 / ((-47 - arg1) / 40);
            ++super.field3085;
            ++super.field3084;
            ++super.field3076;
            if (~super.field3085 <= -5001) {
                super.field3085 = 0;
            }
            if (this.field3424 > 0) {
                this.field3415.notifyAll();
            }
        }
        ++field3428;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Log;B)V")
    public final void method43(class369 arg0, byte arg1) {
        Object var3 = this.field3415;
        synchronized (this.field3415) {
            super.field3080[super.field3085] = 21;
            super.field3079[super.field3085] = arg0;
            ++super.field3085;
            if (super.field3085 >= 5000) {
                super.field3085 = 0;
            }
            ++super.field3084;
            if (arg1 <= 92) {
                return;
            }
            ++super.field3076;
            if (~this.field3424 < -1) {
                this.field3415.notifyAll();
            }
        }
        ++field3430;
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(II)V")
    private final void method1566(int arg0, int arg1) {
        super.field3080[super.field3085] = (byte) arg1;
        if (arg0 >= -120) {
            method1563(-101, -11, 38);
        }
        ++field3416;
        ++super.field3085;
        ++super.field3076;
        if (super.field3085 >= 5000) {
            super.field3085 = 0;
        }
        ++super.field3084;
        if (this.field3424 > 0) {
            Object var3 = this.field3415;
            synchronized (this.field3415) {
                this.field3415.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public final void method42(byte arg0) {
        try {
            Object var2 = this.field3415;
            synchronized (this.field3415) {
                while (true) {
                    if (~super.field3076 == -1) {
                        break;
                    }
                    this.field3415.wait();
                }
            }
            if (arg0 >= -120) {
                this.field3424 = 21;
            }
        } catch (Exception var4) {
        }
        ++field3425;
    }
}
