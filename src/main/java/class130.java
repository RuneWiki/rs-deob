import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class130 {

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    private int field2011 = 0;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public int field1984;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "[Lq;")
    public class134[] field1994;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lle;")
    public static class44 field1985 = new class44(0, 0);

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field1993 = 0;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "J")
    private long field2007;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Lq;")
    private class134 field2001;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "Lq;")
    private class134 field2010;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "[[I")
    public static int[][] field2005;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZLq;J)V")
    public final void method857(boolean arg0, class134 arg1, long arg2) {
        field1992++;
        if (arg1.field2108 != null) {
            arg1.method900(116);
        }
        if (arg0) {
            field2005 = null;
        }
        class134 var5 = this.field1994[(int) ((long) (this.field1984 - 1) & arg2)];
        arg1.field2102 = arg2;
        arg1.field2104 = var5;
        arg1.field2108 = var5.field2108;
        arg1.field2108.field2104 = arg1;
        arg1.field2104.field2108 = arg1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method858(int arg0, String arg1) {
        field1987++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class140.field2164; var2++) {
            if (arg1.equalsIgnoreCase(class120.field1848[var2])) {
                return true;
            }
        }
        if (arg0 != 80) {
            method861((byte) 96);
        }
        return arg1.equalsIgnoreCase(class309.field5006.field3329);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)I")
    public final int method859(int arg0) {
        field2003++;
        if (arg0 != 80) {
            method867(43, 69);
        }
        return this.field1984;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public static final void method860(int arg0) {
        field2004++;
        if (arg0 != 3) {
            return;
        }
        class58.method354(true, class138.field2135);
        class60.field919++;
        if (class197.field3131 && class115.field1744) {
            int var1 = class60.field924;
            int var2 = class1.field1;
            int var3 = var1 - class52.field702;
            if (class199.field3164 > var3) {
                var3 = class199.field3164;
            }
            if (class199.field3164 + class197.field3130.field4152 < class138.field2135.field4152 + var3) {
                var3 = class199.field3164 + class197.field3130.field4152 - class138.field2135.field4152;
            }
            int var4 = var3 - class237.field3748;
            int var5 = var2 - class82.field1304;
            if (class68.field992 > var5) {
                var5 = class68.field992;
            }
            if ((class138.field2135.field4085 + var5) > (class68.field992 + class197.field3130.field4085)) {
                var5 = class68.field992 + class197.field3130.field4085 - class138.field2135.field4085;
            }
            int var6 = var5 - class6.field48;
            int var7 = class138.field2135.field4156;
            if (class138.field2135.field4173 < class60.field919 && (var7 < var6 || (-var7) > var6 || var7 < var4 || var4 < -var7)) {
                class246.field3927 = true;
            }
            int var8 = var5 + class197.field3130.field4175 - class68.field992;
            int var9 = var3 + class197.field3130.field4125 - class199.field3164;
            if (class138.field2135.field4172 != null && class246.field3927) {
                class298 var10 = new class298();
                var10.field4897 = var8;
                var10.field4909 = var9;
                var10.field4906 = class138.field2135;
                var10.field4905 = class138.field2135.field4172;
                class126.method844(arg0 ^ 0x30D43, var10);
            }
            if (class109.field1669 == 0) {
                if (class246.field3927) {
                    if (class138.field2135.field4057 != null) {
                        class298 var11 = new class298();
                        var11.field4906 = class138.field2135;
                        var11.field4907 = class314.field5063;
                        var11.field4897 = var8;
                        var11.field4909 = var9;
                        var11.field4905 = class138.field2135.field4057;
                        class126.method844(200000, var11);
                    }
                    if (class314.field5063 != null && client.method1087(class138.field2135) != null) {
                        class248.field3952++;
                        class276.field4572.method1391(0, 210);
                        class276.field4572.method1412(class138.field2135.field4040, false);
                        class276.field4572.method1425(class138.field2135.field4077, (byte) -115);
                        class276.field4572.method1451(class314.field5063.field4077, arg0 ^ 0xFFFFFF83);
                        class276.field4572.method1412(class314.field5063.field4040, false);
                    }
                } else if ((class258.field4246 == 1 || class144.method969(class18.field251 - 1, arg0 + -4)) && class18.field251 > 2) {
                    class90.method581(1);
                } else if (class18.field251 > 0) {
                    class121.method791((byte) 94);
                }
                class138.field2135 = null;
            }
        } else if (class60.field919 > 1) {
            class138.field2135 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static void method861(byte arg0) {
        if (arg0 != -33) {
            field1985 = null;
        }
        field2005 = null;
        field1985 = null;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public static final void method862(byte arg0) {
        if (class79.field1255 < 128.0F) {
            class79.field1255 = 128.0F;
        }
        if (class79.field1255 > 383.0F) {
            class79.field1255 = 383.0F;
        }
        field1998++;
        int var1 = 31 / ((arg0 + 61) / 38);
        while (class202.field3253 >= 2048.0F) {
            class202.field3253 -= 2048.0F;
        }
        int var2 = class302.field4946 >> 7;
        while (class202.field3253 < 0.0F) {
            class202.field3253 += 2048.0F;
        }
        int var3 = class118.field1804 >> 7;
        int var4 = class12.method66(class302.field4946, class165.field2600, class118.field1804, 0);
        int var5 = 0;
        if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
            for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                for (int var7 = var3 - 4; var7 <= (var3 + 4); var7++) {
                    int var8 = class165.field2600;
                    if (var8 < 3 && (class128.field1972[1][var6][var7] & 0x2) == 2) {
                        var8++;
                    }
                    int var9 = (class148.field2318[var8][var6][var7] & 0xFF) * 8 + var4 - class242.field3842[var8][var6][var7];
                    if (var9 > var5) {
                        var5 = var9;
                    }
                }
            }
        }
        int var10 = var5 * 192;
        if (var10 > 98048) {
            var10 = 98048;
        }
        if (var10 < 32768) {
            var10 = 32768;
        }
        if (class276.field4569 < var10) {
            class276.field4569 += (var10 - class276.field4569) / 24;
        } else if (var10 < class276.field4569) {
            class276.field4569 += (var10 - class276.field4569) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLfa;)V")
    public static final void method863(byte arg0, class273 arg1) {
        if (arg0 != -29) {
            field2005 = null;
        }
        class310.field5014 = arg1;
        field1990++;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)Lq;")
    public final class134 method864(int arg0) {
        field1999++;
        if (this.field2001 == null) {
            return null;
        }
        class134 var2 = this.field1994[(int) (this.field2007 & (long) (this.field1984 + arg0))];
        while (this.field2001 != var2) {
            if (this.field2001.field2102 == this.field2007) {
                class134 var3 = this.field2001;
                this.field2001 = this.field2001.field2104;
                return var3;
            }
            this.field2001 = this.field2001.field2104;
        }
        this.field2001 = null;
        return null;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
    public static final void method865(int arg0) {
        field2000++;
        if (class115.field1733 == 30) {
            class229.method1614(25, 28);
        }
        int var1 = -98 / ((arg0 + 80) / 43);
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
    public static final void method866(int arg0) {
        class16.field227.method144(arg0 ^ arg0);
        field1997++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
    public static final void method867(int arg0, int arg1) {
        field1988++;
        class111.field1696.method147(arg0, (byte) -119);
        if (arg1 >= -60) {
            method861((byte) -48);
        }
        class6.field54.method147(arg0, (byte) -128);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lgk;")
    public static final class165 method868(Throwable arg0, String arg1) {
        field1986++;
        class165 var2;
        if ((arg0 instanceof class165)) {
            var2 = (class165) arg0;
            var2.field2598 = var2.field2598 + ' ' + arg1;
        } else {
            var2 = new class165(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)Lq;")
    public final class134 method869(int arg0) {
        field1991++;
        if (this.field2011 > 0 && this.field1994[this.field2011 - 1] != this.field2010) {
            class134 var2 = this.field2010;
            this.field2010 = var2.field2104;
            return var2;
        }
        while (this.field1984 > this.field2011) {
            class134 var3 = this.field1994[this.field2011++].field2104;
            if (this.field1994[this.field2011 - 1] != var3) {
                this.field2010 = var3.field2104;
                return var3;
            }
        }
        if (arg0 != -14210) {
            method862((byte) 53);
        }
        return null;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)I")
    public static final int method870(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)Lq;")
    public final class134 method871(int arg0) {
        this.field2011 = 0;
        field2002++;
        return arg0 == -36 ? this.method869(-14210) : null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BJ)Lq;")
    public final class134 method872(byte arg0, long arg1) {
        this.field2007 = arg1;
        class134 var4 = this.field1994[(int) (arg1 & (long) (this.field1984 - 1))];
        if (arg0 > -80) {
            this.method874((byte) -14);
        }
        field2008++;
        for (this.field2001 = var4.field2104; this.field2001 != var4; this.field2001 = this.field2001.field2104) {
            if (this.field2001.field2102 == arg1) {
                class134 var5 = this.field2001;
                this.field2001 = this.field2001.field2104;
                return var5;
            }
        }
        this.field2001 = null;
        return null;
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "(I)I")
    public final int method873(int arg0) {
        int var2 = 0;
        if (arg0 != 32) {
            return 48;
        }
        for (int var3 = 0; var3 < this.field1984; var3++) {
            class134 var4 = this.field1994[var3];
            class134 var5 = var4.field2104;
            while (var4 != var5) {
                var5 = var5.field2104;
                var2++;
            }
        }
        field1996++;
        return var2;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(I)V")
    public class130(int arg0) {
        this.field1984 = arg0;
        this.field1994 = new class134[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class134 var3 = this.field1994[var2] = new class134();
            var3.field2104 = var3;
            var3.field2108 = var3;
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)V")
    public final void method874(byte arg0) {
        field1995++;
        for (int var2 = 0; var2 < this.field1984; var2++) {
            class134 var3 = this.field1994[var2];
            while (true) {
                class134 var4 = var3.field2104;
                if (var3 == var4) {
                    break;
                }
                var4.method900(121);
            }
        }
        this.field2001 = null;
        if (arg0 >= -120) {
            method862((byte) 10);
        }
        this.field2010 = null;
    }
}
