import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class249 {

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
    private int field3846 = 0;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "[Les;")
    public class261[] field3842;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public int field3838;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "Ls;")
    public static class186 field3841 = new class186(2, -2);

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "J")
    private long field3844;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "Les;")
    private class261 field3834;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "Les;")
    private class261 field3849;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "Lph;")
    public static class459 field3845;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "[[[B")
    public static byte[][][] field3848;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)I")
    public final int method1611(byte arg0) {
        field3843++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 != -21) {
            this.method1615(48);
        }
        while (var3 < this.field3838) {
            class261 var4 = this.field3842[var3];
            class261 var5 = var4.field3972;
            while (var4 != var5) {
                var5 = var5.field3972;
                var2++;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)Lwk;")
    public static final class97 method1612(int arg0) {
        field3839++;
        if (class319.field4858 == null || class119.field2093 == null) {
            return null;
        }
        class119.field2093.method2892(arg0 ^ 0xFFFFD3F6, class319.field4858);
        class97 var1 = (class97) class119.field2093.method2893(-128);
        if (arg0 != -11366) {
            return null;
        } else if (var1 == null) {
            return null;
        } else {
            class25 var2 = class319.field4842.method1247(false, var1.field1890);
            return var2 != null && var2.field380 && var2.method175(-2871, class319.field4849) ? var1 : class216.method1447(true);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V")
    public static void method1613(boolean arg0) {
        if (arg0) {
            method1613(false);
        }
        field3848 = null;
        field3841 = null;
        field3845 = null;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V")
    public final void method1614(byte arg0) {
        field3832++;
        for (int var2 = 0; var2 < this.field3838; var2++) {
            class261 var3 = this.field3842[var2];
            while (true) {
                class261 var4 = var3.field3972;
                if (var3 == var4) {
                    break;
                }
                var4.method1676(true);
            }
        }
        if (arg0 != -24) {
            field3847 = 31;
        }
        this.field3849 = null;
        this.field3834 = null;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)Les;")
    public final class261 method1615(int arg0) {
        field3835++;
        this.field3846 = arg0;
        return this.method1621((byte) -34);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I[Les;)I")
    public final int method1616(int arg0, class261[] arg1) {
        field3831++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3838; var4++) {
            class261 var5 = this.field3842[var4];
            for (class261 var6 = var5.field3972; var6 != var5; var6 = var6.field3972) {
                arg1[var3++] = var6;
            }
        }
        if (arg0 != -32437) {
            this.field3849 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(Z)I")
    public final int method1617(boolean arg0) {
        field3840++;
        if (arg0) {
            this.method1620(60);
        }
        return this.field3838;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Les;JI)V")
    public final void method1618(class261 arg0, long arg1, int arg2) {
        if (arg0.field3976 != null) {
            arg0.method1676(true);
        }
        field3837++;
        class261 var5 = this.field3842[(int) ((long) (this.field3838 + arg2) & arg1)];
        arg0.field3976 = var5.field3976;
        arg0.field3972 = var5;
        arg0.field3976.field3972 = arg0;
        arg0.field3977 = arg1;
        arg0.field3972.field3976 = arg0;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILlt;Lnn;I)V")
    public static final void method1619(int arg0, class480 arg1, class289 arg2, int arg3) {
        field3830++;
        class270 var4 = new class270();
        var4.field4089 = arg2.method1858(-3256);
        var4.field4098 = arg2.method1815((byte) -116);
        var4.field4099 = new class121[var4.field4089];
        var4.field4102 = new int[var4.field4089];
        var4.field4093 = new byte[var4.field4089][][];
        var4.field4101 = new int[var4.field4089];
        var4.field4097 = new class121[var4.field4089];
        var4.field4091 = new int[var4.field4089];
        for (int var5 = 0; var5 < var4.field4089; var5++) {
            try {
                int var6 = arg2.method1858(-3256);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg2.method1834(-17823);
                    String var8 = arg2.method1834(-17823);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg2.method1815((byte) -48);
                    }
                    var4.field4091[var5] = var6;
                    var4.field4102[var5] = var9;
                    var4.field4097[var5] = arg1.method2872(var8, class198.method1342(var7, -100), 86);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg2.method1834(-17823);
                    String var11 = arg2.method1834(-17823);
                    int var12 = arg2.method1858(-3256);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg2.method1834(-17823);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method1815((byte) -128);
                            var15[var16] = new byte[var17];
                            arg2.method1849(var17, -1, var15[var16], 0);
                        }
                    }
                    var4.field4091[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class198.method1342(var13[var19], -105);
                    }
                    var4.field4099[var5] = arg1.method2862(true, var18, class198.method1342(var10, 67), var11);
                    var4.field4093[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field4101[var5] = -1;
            } catch (SecurityException var21) {
                var4.field4101[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field4101[var5] = -3;
            } catch (Exception var23) {
                var4.field4101[var5] = -4;
            } catch (Throwable var24) {
                var4.field4101[var5] = -5;
            }
        }
        if (arg0 > -59) {
            field3845 = null;
        }
        class467.field6936.method1885(false, var4);
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)Les;")
    public final class261 method1620(int arg0) {
        field3836++;
        if (this.field3834 == null) {
            return null;
        }
        class261 var2 = this.field3842[(int) ((long) (this.field3838 - 1) & this.field3844)];
        while (this.field3834 != var2) {
            if (this.field3834.field3977 == this.field3844) {
                class261 var3 = this.field3834;
                this.field3834 = this.field3834.field3972;
                return var3;
            }
            this.field3834 = this.field3834.field3972;
        }
        if (arg0 > -19) {
            return null;
        } else {
            this.field3834 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(B)Les;")
    public final class261 method1621(byte arg0) {
        field3833++;
        int var2 = -72 % ((arg0 - 19) / 53);
        if (this.field3846 > 0 && this.field3842[this.field3846 - 1] != this.field3849) {
            class261 var3 = this.field3849;
            this.field3849 = var3.field3972;
            return var3;
        }
        while (this.field3838 > this.field3846) {
            class261 var4 = this.field3842[this.field3846++].field3972;
            if (this.field3842[this.field3846 - 1] != var4) {
                this.field3849 = var4.field3972;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(JI)Les;")
    public final class261 method1622(long arg0, int arg1) {
        field3829++;
        this.field3844 = arg0;
        int var4 = -112 % ((arg1 + 43) / 59);
        class261 var5 = this.field3842[(int) ((long) (this.field3838 - 1) & arg0)];
        for (this.field3834 = var5.field3972; this.field3834 != var5; this.field3834 = this.field3834.field3972) {
            if (this.field3834.field3977 == arg0) {
                class261 var6 = this.field3834;
                this.field3834 = this.field3834.field3972;
                return var6;
            }
        }
        this.field3834 = null;
        return null;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(I)V")
    public class249(int arg0) {
        this.field3842 = new class261[arg0];
        this.field3838 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class261 var3 = this.field3842[var2] = new class261();
            var3.field3972 = var3;
            var3.field3976 = var3;
        }
    }

    static {
        new class309("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field3847 = 2;
    }
}
