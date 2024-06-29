import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class390 extends class378 {

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field5738 = new Object();

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "[Lli;")
    private class358[] field5743 = new class358[0];

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    private int field5744 = 0;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    private int field5745 = 0;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field5726 = 0;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "Lo;")
    public static class332 field5737 = new class332("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "Lat;")
    public static class412 field5742;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "Lct;")
    public static class285 field5746;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "[I")
    public static int[] field5747;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "I")
    public static int field5741;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dk", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field5748;

    // $FF: synthetic method
    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2355(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class332("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field5742 = new class412();
        field5746 = new class285(4, 2);
        field5747 = new int[500];
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)V", line = 4)
    private final void method2348(boolean arg0, int arg1) {
        super.field5617[super.field5627] = (byte) (arg1 + 10);
        ++field5728;
        ++super.field5627;
        ++super.field5623;
        ++super.field5626;
        if (super.field5627 >= 5000) {
            super.field5627 = 0;
        }
        if (~this.field5745 < -1) {
            Object var3 = this.field5738;
            synchronized (this.field5738) {
                this.field5738.notifyAll();
            }
        }
        if (!arg0) {
            field5747 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lke;I)V", line = 29)
    public final void method100(class337 arg0, int arg1) {
        ++field5741;
        Object var3 = this.field5738;
        synchronized (this.field5738) {
            super.field5617[super.field5627] = 21;
            super.field5620[super.field5627] = arg0;
            ++super.field5627;
            if (super.field5627 >= 5000) {
                super.field5627 = 0;
            }
            ++super.field5626;
            ++super.field5623;
            if (this.field5745 > 0) {
                this.field5738.notifyAll();
            }
            if (arg1 != -23157) {
                this.method2348(true, -92);
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)V", line = 54)
    private final void method2349(int arg0, int arg1) {
        ++field5729;
        super.field5617[super.field5627] = (byte) arg0;
        ++super.field5627;
        ++super.field5626;
        ++super.field5623;
        if (super.field5627 >= 5000) {
            super.field5627 = 0;
        }
        if (arg1 < this.field5745) {
            Object var3 = this.field5738;
            synchronized (this.field5738) {
                this.field5738.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIILjava/lang/Class;)Lug;", line = 78)
    public static final class305 method2350(int arg0, int arg1, int arg2, Class arg3) {
        class337 var4 = class170.field2427[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        } else {
            for (class448 var5 = var4.field5054; var5 != null; var5 = var5.field6340) {
                class305 var6 = var5.field6343;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field4542 == arg1 && var6.field4547 == arg2) {
                    return var6;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V", line = 106)
    public static void method2351(int arg0) {
        field5737 = null;
        field5747 = null;
        if (arg0 != -1) {
            field5726 = 125;
        }
        field5742 = null;
        field5746 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 119)
    public final void method89(byte arg0) {
        Object var2 = this.field5738;
        synchronized (this.field5738) {
            int var3 = 0;
            while (true) {
                if (~var3 <= ~this.field5744) {
                    if (arg0 > -123) {
                        field5742 = null;
                    }
                    break;
                }
                if (this.field5743[var3].field5445 >= 0) {
                    this.method2348(true, this.field5743[var3].field5445);
                }
                ++var3;
            }
        }
        ++field5731;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(BLke;)V", line = 143)
    public final void method94(byte arg0, class337 arg1) {
        if (arg0 != 37) {
            field5737 = null;
        }
        ++field5733;
        Object var3 = this.field5738;
        synchronized (this.field5738) {
            super.field5617[super.field5627] = 20;
            super.field5620[super.field5627] = arg1;
            ++super.field5627;
            if (super.field5627 >= 5000) {
                super.field5627 = 0;
            }
            ++super.field5623;
            ++super.field5626;
            if (this.field5745 > 0) {
                this.field5738.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lli;I)V", line = 166)
    public final void method2352(class358 arg0, int arg1) {
        ++field5739;
        boolean var3 = false;
        if (arg1 != -25993) {
            this.field5745 = 100;
        }
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field5738;
            byte var7;
            synchronized (this.field5738) {
                while (super.field5623 == 0) {
                    ++this.field5745;
                    this.field5738.wait();
                    --this.field5745;
                }
                var7 = super.field5617[super.field5625];
                if (arg0.field5445 < 0) {
                    if (~var7 <= -1 && ~var7 >= -4) {
                        var3 = true;
                    }
                } else if (~var7 > -1 || var7 > 3) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field413 = super.field5620[super.field5625];
                    var5 = super.field5615[super.field5625];
                    super.field5620[super.field5625] = null;
                    ++super.field5625;
                    --super.field5623;
                    if (super.field5625 >= 5000) {
                        super.field5625 = 0;
                    }
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (~arg0.field5445 <= -1) {
                if (~var7 != -22) {
                    if (~var7 == -21) {
                        class337 var8 = (class337) arg0.field413;
                        if (var8.field5044 != null) {
                            var8.field5044.method260(0, class432.field6150);
                        }
                        if (var8.field5047 != null) {
                            var8.field5047.method260(0, class432.field6150);
                        }
                        if (var8.field5058 != null) {
                            var8.field5058.method260(0, class432.field6150);
                        }
                        if (var8.field5050 != null) {
                            var8.field5050.method260(arg1 ^ -25993, class432.field6150);
                        }
                        if (var8.field5063 != null) {
                            var8.field5063.method260(0, class432.field6150);
                        }
                        for (class448 var9 = var8.field5054; var9 != null; var9 = var9.field6340) {
                            var9.field6343.method260(arg1 ^ -25993, class432.field6150);
                        }
                    } else if (~var7 <= -31 && var7 <= 33) {
                        class432.field6150.method501(3000.0F, var5 * 1.5F);
                        ((class48) arg0.field413).method203(class307.field4577, class386.field5702, class281.field4243, class206.field3116, ~(var7 + -30) == -1);
                    } else if (~var7 <= -41 && ~var7 >= -44) {
                        class432.field6150.method501(3000.0F, var5 * 1.5F);
                        ((class48) arg0.field413).method203(class307.field4577, class386.field5702, class281.field4243, class10.field155, var7 + -40 == 0);
                    } else if (var7 == 22) {
                        class432.field6150.method517(-1, 1583160, 40, 127);
                    } else if (var7 == 23) {
                        class432.field6150.method511();
                    } else if (~var7 == -25) {
                        class432.field6150.method542(0, (class233[]) null);
                    } else if (~var7 <= -11 && ~var7 >= -14) {
                        class432.field6150.method532(arg0.field5445);
                        arg0.field5445 = -1;
                    }
                } else {
                    class229.method1487(arg0, (class337) arg0.field413);
                }
            } else if (~var7 <= -1 && ~var7 >= -4) {
                arg0.field5445 = var7;
                class432.field6150.method564(var7);
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field5738;
                synchronized (this.field5738) {
                    --super.field5626;
                    if (super.field5626 == 0) {
                        this.field5738.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILcl;ZIF)V", line = 338)
    public final void method91(int arg0, class48 arg1, boolean arg2, int arg3, float arg4) {
        Object var6 = this.field5738;
        synchronized (this.field5738) {
            super.field5617[super.field5627] = (byte) (!arg2 ? arg0 + 30 : arg0 + 40);
            super.field5620[super.field5627] = arg1;
            super.field5615[super.field5627] = arg4;
            ++super.field5627;
            int var7 = -22 / ((arg3 - -44) / 61);
            ++super.field5626;
            if (~super.field5627 <= -5001) {
                super.field5627 = 0;
            }
            ++super.field5623;
            if (~this.field5745 < -1) {
                this.field5738.notifyAll();
            }
        }
        ++field5727;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ltq;Z)V", line = 361)
    public static final void method2353(class63 arg0, boolean arg1) {
        ++field5736;
        if (class24.field320 != class472.field6622.field4545) {
            if (arg1) {
                field5726 = -51;
            }
            if (class170.field2427 != null) {
                if (class414.method2470(arg1, class472.field6622.field4545, arg0)) {
                    class24.field320 = class472.field6622.field4545;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)V", line = 381)
    public final void method99(int arg0, byte arg1) {
        Object var3 = this.field5738;
        synchronized (this.field5738) {
            super.field5617[super.field5627] = (byte) arg0;
            if (arg1 < 80) {
                this.method89((byte) 79);
            }
            ++super.field5627;
            ++super.field5626;
            if (~super.field5627 <= -5001) {
                super.field5627 = 0;
            }
            ++super.field5623;
            if (this.field5745 > 0) {
                this.field5738.notifyAll();
            }
        }
        ++field5732;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 408)
    public final void method93(int arg0) {
        if (arg0 >= 66) {
            try {
                Object var2 = this.field5738;
                synchronized (this.field5738) {
                    while (~super.field5626 != -1) {
                        this.field5738.wait();
                    }
                }
            } catch (Exception var4) {
            }
            ++field5735;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V", line = 434)
    public final void method98(int arg0, int arg1) {
        ++field5740;
        int var3 = 0;
        if (arg0 != 20923) {
            this.field5744 = -34;
        }
        Object var4 = this.field5738;
        synchronized (this.field5738) {
            if (~this.field5744 == ~arg1) {
                for (int var5 = 0; var5 < this.field5744; ++var5) {
                    this.method2349(var3++, 0);
                }
            } else {
                for (int var6 = 0; ~var6 > ~this.field5744; ++var6) {
                    this.field5743[var6].method2203(arg0 + 1951);
                }
                this.field5744 = arg1;
                this.field5743 = new class358[this.field5744];
                for (int var7 = 0; this.field5744 > var7; ++var7) {
                    this.field5743[var7] = new class358(this);
                    this.field5743[var7].method2202(39);
                    this.method2349(var3++, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIBI)Z", line = 488)
    public static final boolean method2354(int arg0, int arg1, byte arg2, int arg3) {
        ++field5734;
        if (arg2 < 7) {
            return false;
        } else {
            class218 var4 = (class218) class147.method1006(arg0, arg3, arg1);
            boolean var5 = true;
            if (var4 != null) {
                var5 &= class226.method1467(105, var4);
            }
            class218 var6 = (class218) method2350(arg0, arg3, arg1, field5748 != null ? field5748 : (field5748 = method2355("ki")));
            if (var6 != null) {
                var5 &= class226.method1467(104, var6);
            }
            class218 var7 = (class218) class487.method2848(arg0, arg3, arg1);
            if (var7 != null) {
                var5 &= class226.method1467(84, var7);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLke;)V", line = 515)
    public final void method90(byte arg0, class337 arg1) {
        if (arg0 == 25) {
            Object var3 = this.field5738;
            synchronized (this.field5738) {
                --super.field5625;
                if (super.field5625 < 0) {
                    super.field5625 = 4999;
                }
                super.field5617[super.field5625] = 21;
                super.field5620[super.field5625] = arg1;
                ++super.field5626;
                ++super.field5623;
                if (~this.field5745 < -1) {
                    this.field5738.notifyAll();
                }
            }
            ++field5730;
        }
    }
}
