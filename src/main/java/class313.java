import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class313 {

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "Lsu;")
    private class143 field4713 = new class143();

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "Lsu;")
    private class143 field4718 = new class143();

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "Lsu;")
    private class143 field4723 = new class143();

    @OriginalMember(owner = "client!pr", name = "A", descriptor = "Lsu;")
    private class143 field4724 = new class143();

    @OriginalMember(owner = "client!pr", name = "D", descriptor = "Lhp;")
    private class217 field4727 = new class217(4);

    @OriginalMember(owner = "client!pr", name = "G", descriptor = "B")
    private byte field4729 = 0;

    @OriginalMember(owner = "client!pr", name = "K", descriptor = "I")
    public volatile int field4732 = 0;

    @OriginalMember(owner = "client!pr", name = "H", descriptor = "I")
    public volatile int field4730 = 0;

    @OriginalMember(owner = "client!pr", name = "I", descriptor = "Lhp;")
    private class217 field4731 = new class217(8);

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "Luq;")
    public static class114 field4712 = null;

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "Lak;")
    public static class234 field4708 = new class234("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "Lkl;")
    public static class56 field4716 = new class56("WTWIP", 3);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!pr", name = "F", descriptor = "I")
    private int field4728;

    @OriginalMember(owner = "client!pr", name = "C", descriptor = "J")
    private long field4726;

    @OriginalMember(owner = "client!pr", name = "L", descriptor = "Lpp;")
    private class270 field4733;

    @OriginalMember(owner = "client!pr", name = "B", descriptor = "Lti;")
    private class307 field4725;

    @OriginalMember(owner = "client!pr", name = "y", descriptor = "Lla;")
    public static class317 field4722;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "Lul;")
    public static class406 field4720;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "Lbo;")
    public static class515 field4700;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Z)I")
    public static final int method1995(int arg0, String arg1, String arg2, boolean arg3) {
        field4704++;
        int var4 = arg2.length();
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while ((var6 - var8) < var4 || var7 - var9 < var5) {
            if (var4 <= (var6 - var8)) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg2.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg1.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class210.method1458(var22, -2);
            var9 = class210.method1458(var24, -2);
            char var26 = class416.method2607(var22, 249, arg0);
            char var27 = class416.method2607(var24, 249, arg0);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class357.method2237((byte) -60, var28, arg0) - class357.method2237((byte) -60, var29, arg0);
                }
            }
        }
        if (!arg3) {
            return -127;
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg0 == 2) {
                var16 = var4 - var11 - 1;
                var17 = var5 - var11 - 1;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg2.charAt(var16);
            char var19 = arg1.charAt(var17);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class357.method2237((byte) -60, var20, arg0) - class357.method2237((byte) -60, var21, arg0);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg2.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class357.method2237((byte) -60, var14, arg0) - class357.method2237((byte) -60, var15, arg0);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
    public static void method1996(byte arg0) {
        if (arg0 < 95) {
            method1996((byte) 106);
        }
        field4708 = null;
        field4722 = null;
        field4716 = null;
        field4700 = null;
        field4720 = null;
        field4712 = null;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V")
    public static final void method1997(byte arg0) {
        class13 var1 = class425.field6331;
        synchronized (class425.field6331) {
            class425.field6331.method88(92);
        }
        field4717++;
        class13 var2 = class315.field4745;
        synchronized (class315.field4745) {
            if (arg0 < 75) {
                field4712 = null;
            }
            class315.field4745.method88(103);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    private final void method1998(int arg0) {
        field4703++;
        if (this.field4725 == null) {
            return;
        }
        try {
            if (arg0 < 78) {
                this.field4725 = null;
            }
            this.field4727.field3556 = 0;
            this.field4727.method1545(6, -103);
            this.field4727.method1519(3, 1824076200);
            this.field4725.method1969(this.field4727.field3572, 0, (byte) 64, 4);
        } catch (IOException var3) {
            try {
                this.field4725.method1966(120);
            } catch (Exception var2) {
            }
            this.field4732++;
            this.field4730 = -2;
            this.field4725 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZZ)V")
    public final void method1999(boolean arg0, boolean arg1) {
        field4719++;
        if (this.field4725 == null) {
            return;
        }
        try {
            this.field4727.field3556 = 0;
            this.field4727.method1545(arg0 ? 2 : 3, -79);
            this.field4727.method1519(0, 1824076200);
            if (arg1) {
                field4720 = null;
            }
            this.field4725.method1969(this.field4727.field3572, 0, (byte) -128, 4);
        } catch (IOException var4) {
            try {
                this.field4725.method1966(84);
            } catch (Exception var3) {
            }
            this.field4725 = null;
            this.field4730 = -2;
            this.field4732++;
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)Z")
    public final boolean method2000(int arg0) {
        if (arg0 != 0) {
            this.field4718 = null;
        }
        field4706++;
        return this.method2007(-2) >= 20;
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(B)V")
    public final void method2001(byte arg0) {
        field4714++;
        if (this.field4725 == null) {
            return;
        }
        try {
            if (arg0 <= -43) {
                this.field4727.field3556 = 0;
                this.field4727.method1545(7, -53);
                this.field4727.method1519(0, 1824076200);
                this.field4725.method1969(this.field4727.field3572, 0, (byte) 16, 4);
            }
        } catch (IOException var3) {
            try {
                this.field4725.method1966(80);
            } catch (Exception var2) {
            }
            this.field4732++;
            this.field4725 = null;
            this.field4730 = -2;
        }
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
    public final void method2002(int arg0) {
        field4699++;
        try {
            this.field4725.method1966(77);
        } catch (Exception var2) {
        }
        this.field4732++;
        this.field4729 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field4730 = -1;
        if (arg0 != 10914) {
            this.field4713 = null;
        }
        this.field4725 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZILti;)V")
    public final void method2003(boolean arg0, int arg1, class307 arg2) {
        if (this.field4725 != null) {
            try {
                this.field4725.method1966(121);
            } catch (Exception var8) {
            }
            this.field4725 = null;
        }
        field4698++;
        this.field4725 = arg2;
        this.method1998(80);
        this.method1999(arg0, false);
        this.field4733 = null;
        this.field4731.field3556 = 0;
        while (true) {
            class270 var4 = (class270) this.field4718.method1019(65408);
            if (var4 == null) {
                while (true) {
                    class270 var5 = (class270) this.field4724.method1019(arg1 ^ 0xFF80);
                    if (var5 == null) {
                        if (this.field4729 != 0) {
                            try {
                                this.field4727.field3556 = 0;
                                this.field4727.method1545(4, arg1 - 72);
                                this.field4727.method1545(this.field4729, arg1 ^ 0xFFFFFFCE);
                                this.field4727.method1542(0, -2756);
                                this.field4725.method1969(this.field4727.field3572, 0, (byte) 12, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field4725.method1966(69);
                                } catch (Exception var6) {
                                }
                                this.field4732++;
                                this.field4725 = null;
                                this.field4730 = -2;
                            }
                        }
                        this.field4728 = arg1;
                        this.field4726 = class493.method2937(-112);
                        return;
                    }
                    this.field4723.method1021(var5, -80);
                }
            }
            this.field4713.method1021(var4, -120);
        }
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(B)Z")
    public final boolean method2004(byte arg0) {
        if (this.field4725 != null) {
            long var2 = class493.method2937(-115);
            int var4 = (int) (var2 - this.field4726);
            this.field4726 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4728 += var4;
            if (this.field4728 > 30000) {
                try {
                    this.field4725.method1966(123);
                } catch (Exception var28) {
                }
                this.field4725 = null;
            }
        }
        field4707++;
        if (this.field4725 == null) {
            return this.method2008(3) == 0 && this.method2007(-2) == 0;
        }
        try {
            this.field4725.method1964((byte) -78);
            int var5 = -98 % ((arg0 - 74) / 48);
            for (class270 var6 = (class270) this.field4713.method1024((byte) 119); var6 != null; var6 = (class270) this.field4713.method1022(-3)) {
                this.field4727.field3556 = 0;
                this.field4727.method1545(1, -92);
                this.field4727.method1519((int) var6.field6596, 1824076200);
                this.field4725.method1969(this.field4727.field3572, 0, (byte) -127, 4);
                this.field4718.method1021(var6, -93);
            }
            for (class270 var7 = (class270) this.field4723.method1024((byte) 104); var7 != null; var7 = (class270) this.field4723.method1022(-3)) {
                this.field4727.field3556 = 0;
                this.field4727.method1545(0, -46);
                this.field4727.method1519((int) var7.field6596, 1824076200);
                this.field4725.method1969(this.field4727.field3572, 0, (byte) 6, 4);
                this.field4724.method1021(var7, -125);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field4725.method1970(true);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field4728 = 0;
                byte var10 = 0;
                if (this.field4733 == null) {
                    var10 = 8;
                } else if (this.field4733.field4134 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field4731.field3556;
                    if (var9 < var11) {
                        var11 = var9;
                    }
                    this.field4725.method1965(this.field4731.field3556, var11, (byte) -81, this.field4731.field3572);
                    if (this.field4729 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field4731.field3572[this.field4731.field3556 + var12] = (byte) class425.method2656(this.field4731.field3572[this.field4731.field3556 + var12], this.field4729);
                        }
                    }
                    this.field4731.field3556 += var11;
                    if (var10 <= this.field4731.field3556) {
                        if (this.field4733 == null) {
                            this.field4731.field3556 = 0;
                            int var13 = this.field4731.method1515((byte) 126);
                            int var14 = this.field4731.method1511(-98);
                            int var15 = this.field4731.method1515((byte) 124);
                            int var16 = this.field4731.method1556(98);
                            int var17 = var15 & 0x7F;
                            boolean var18 = (var15 & 0x80) != 0;
                            long var19 = (long) ((var13 << 16) + var14);
                            Object var21 = null;
                            class270 var22;
                            if (var18) {
                                for (var22 = (class270) this.field4724.method1024((byte) 103); var22 != null && var22.field6596 != var19; var22 = (class270) this.field4724.method1022(-3)) {
                                }
                            } else {
                                for (var22 = (class270) this.field4718.method1024((byte) 75); var22 != null && var22.field6596 != var19; var22 = (class270) this.field4718.method1022(-3)) {
                                }
                            }
                            if (var22 == null) {
                                throw new IOException();
                            }
                            int var23 = var17 == 0 ? 5 : 9;
                            this.field4733 = var22;
                            this.field4733.field4135 = new class217(var16 + this.field4733.field4137 + var23);
                            this.field4733.field4135.method1545(var17, -118);
                            this.field4733.field4135.method1566(true, var16);
                            this.field4731.field3556 = 0;
                            this.field4733.field4134 = 8;
                        } else if (this.field4733.field4134 != 0) {
                            throw new IOException();
                        } else if (this.field4731.field3572[0] == -1) {
                            this.field4731.field3556 = 0;
                            this.field4733.field4134 = 1;
                        } else {
                            this.field4733 = null;
                        }
                    }
                } else {
                    int var24 = this.field4733.field4135.field3572.length - this.field4733.field4137;
                    int var25 = 512 - this.field4733.field4134;
                    if (var25 > (var24 - this.field4733.field4135.field3556)) {
                        var25 = var24 - this.field4733.field4135.field3556;
                    }
                    if (var25 > var9) {
                        var25 = var9;
                    }
                    this.field4725.method1965(this.field4733.field4135.field3556, var25, (byte) -81, this.field4733.field4135.field3572);
                    if (this.field4729 != 0) {
                        for (int var26 = 0; var26 < var25; var26++) {
                            this.field4733.field4135.field3572[this.field4733.field4135.field3556 + var26] = (byte) class425.method2656(this.field4733.field4135.field3572[this.field4733.field4135.field3556 + var26], this.field4729);
                        }
                    }
                    this.field4733.field4134 += var25;
                    this.field4733.field4135.field3556 += var25;
                    if (this.field4733.field4135.field3556 == var24) {
                        this.field4733.method2754(-152804768);
                        this.field4733.field3927 = false;
                        this.field4733 = null;
                    } else if (this.field4733.field4134 == 512) {
                        this.field4733.field4134 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var29) {
            try {
                this.field4725.method1966(87);
            } catch (Exception var27) {
            }
            this.field4730 = -2;
            this.field4732++;
            this.field4725 = null;
            return this.method2008(3) == 0 && this.method2007(-2) == 0;
        }
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)Z")
    public final boolean method2005(int arg0) {
        if (arg0 != 0) {
            this.method2002(90);
        }
        field4709++;
        return this.method2008(3) >= 20;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBZIB)Lpp;")
    public final class270 method2006(int arg0, byte arg1, boolean arg2, int arg3, byte arg4) {
        if (arg4 != 0) {
            this.field4718 = null;
        }
        field4702++;
        long var6 = (long) ((arg0 << 16) + arg3);
        class270 var8 = new class270();
        var8.field4137 = arg1;
        var8.field6596 = var6;
        var8.field3926 = arg2;
        if (arg2) {
            if (this.method2008(3) >= 20) {
                throw new RuntimeException();
            }
            this.field4713.method1021(var8, -103);
        } else if (this.method2007(arg4 ^ 0xFFFFFFFE) < 20) {
            this.field4723.method1021(var8, -109);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "(I)I")
    private final int method2007(int arg0) {
        field4721++;
        return arg0 == -2 ? this.field4723.method1023(arg0 + 108) + this.field4724.method1023(114) : 71;
    }

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "(I)I")
    public final int method2008(int arg0) {
        if (arg0 != 3) {
            field4722 = null;
        }
        field4710++;
        return this.field4713.method1023(119) + this.field4718.method1023(112);
    }

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "(I)V")
    public final void method2009(int arg0) {
        field4711++;
        if (this.field4725 != null) {
            this.field4725.method1972(1);
        }
        if (arg0 != 0) {
            field4722 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "(B)V")
    public final void method2010(byte arg0) {
        field4705++;
        if (this.field4725 != null) {
            this.field4725.method1966(123);
        }
        int var2 = -90 % ((8 - arg0) / 43);
    }
}
