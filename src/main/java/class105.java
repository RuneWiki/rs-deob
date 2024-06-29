import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class105 extends class134 {

    @OriginalMember(owner = "client!le", name = "F", descriptor = "Ln;")
    public class118 field2004 = new class118();

    @OriginalMember(owner = "client!le", name = "U", descriptor = "Lub;")
    public class183 field2018 = new class183();

    @OriginalMember(owner = "client!le", name = "G", descriptor = "Lme;")
    private class114 field2005;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static int field1998 = 0;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "Led;")
    private static class43 field2002 = class191.method1219("wave:", false);

    @OriginalMember(owner = "client!le", name = "H", descriptor = "Led;")
    public static class43 field2006 = class191.method1219(":clanreq:", false);

    @OriginalMember(owner = "client!le", name = "K", descriptor = "Led;")
    public static class43 field2009 = field2002;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "Led;")
    public static class43 field2003 = class191.method1219("und loggen sich dann erneut ein)3", false);

    @OriginalMember(owner = "client!le", name = "S", descriptor = "[I")
    public static int[] field2016 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!le", name = "P", descriptor = "Led;")
    public static class43 field2013 = class191.method1219("(U2", false);

    @OriginalMember(owner = "client!le", name = "V", descriptor = "Led;")
    private static class43 field2019 = class191.method1219("OFF", false);

    @OriginalMember(owner = "client!le", name = "O", descriptor = "Led;")
    public static class43 field2012 = field2019;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "Led;")
    public static class43 field2017 = class191.method1219("runes", false);

    @OriginalMember(owner = "client!le", name = "ab", descriptor = "Led;")
    public static class43 field2024 = field2002;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "J")
    public static volatile long field2020 = 0L;

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "Led;")
    public static class43 field2022 = class191.method1219("null", false);

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!le", name = "X", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!le", name = "Z", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "[Led;")
    public static class43[] field2007;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V")
    public static final void method646(boolean arg0) {
        class115.field2241 = 0;
        class17.field278 = 0;
        class116.method738(-127);
        if (arg0) {
            field2019 = null;
        }
        field2014++;
        class137.method889(1);
        class185.method1190(119);
        class100.method619(!arg0);
        for (int var1 = 0; var1 < class17.field278; var1++) {
            int var3 = class47.field947[var1];
            if (client.field559 != class12.field183[var3].field2343) {
                class12.field183[var3] = null;
            }
        }
        if (class114.field2215 != class38.field723.field1727) {
            throw new RuntimeException("gpp1 pos:" + class38.field723.field1727 + " psize:" + class114.field2215);
        }
        for (int var2 = 0; var2 < class170.field3399; var2++) {
            if (class12.field183[class125.field2472[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class170.field3399);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lsd;BI)V")
    private final void method647(class167 arg0, byte arg1, int arg2) {
        if ((this.field2005.field2197[arg0.field3309] & 0x4) != 0 && arg0.field3328 < 0) {
            int var4 = this.field2005.field2198[arg0.field3309] / class38.field726;
            int var5 = (var4 + 1048575 - arg0.field3294) / var4;
            arg0.field3294 = arg2 * var4 + arg0.field3294 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field2005.field2169[arg0.field3309] == 0) {
                    arg0.field3319 = class195.method1253(arg0.field3324, arg0.field3319.method1244(), arg0.field3319.method1263(), arg0.field3319.method1274());
                } else {
                    arg0.field3319 = class195.method1253(arg0.field3324, arg0.field3319.method1244(), 0, arg0.field3319.method1274());
                    this.field2005.method718(arg0, (byte) 80, arg0.field3303.field324[arg0.field3304] < 0);
                }
                if (arg0.field3303.field324[arg0.field3304] < 0) {
                    arg0.field3319.method1266(-1);
                }
                arg2 = arg0.field3294 / var4;
            }
        }
        field2000++;
        arg0.field3319.method652(arg2);
        if (arg1 >= -96) {
            field2009 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V")
    public static final void method648(int arg0) {
        field2010++;
        class90.field1792 = new class17(32);
        if (arg0 <= 118) {
            method646(false);
        }
    }

    @OriginalMember(owner = "client!le", name = "f", descriptor = "(I)V")
    public static void method649(int arg0) {
        field2012 = null;
        field2002 = null;
        field2013 = null;
        field2006 = null;
        field2009 = null;
        field2003 = null;
        field2016 = null;
        field2019 = null;
        field2024 = null;
        field2022 = null;
        field2017 = null;
        if (arg0 <= 1) {
            field2006 = null;
        }
        field2007 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I[IIIILsd;)V")
    private final void method650(int arg0, int[] arg1, int arg2, int arg3, int arg4, class167 arg5) {
        if ((this.field2005.field2197[arg5.field3309] & 0x4) != 0 && arg5.field3328 < 0) {
            int var7 = this.field2005.field2198[arg5.field3309] / class38.field726;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field3294) / var7;
                if (var8 > arg3) {
                    arg5.field3294 += arg3 * var7;
                    break;
                }
                arg5.field3319.method653(arg1, arg2, var8);
                arg2 += var8;
                arg3 -= var8;
                arg5.field3294 += var7 * var8 - 1048576;
                int var9 = class38.field726 / 100;
                class195 var10 = arg5.field3319;
                int var11 = 262144 / var7;
                if (var11 < var9) {
                    var9 = var11;
                }
                if (this.field2005.field2169[arg5.field3309] == 0) {
                    arg5.field3319 = class195.method1253(arg5.field3324, var10.method1244(), var10.method1263(), var10.method1274());
                } else {
                    arg5.field3319 = class195.method1253(arg5.field3324, var10.method1244(), 0, var10.method1274());
                    this.field2005.method718(arg5, (byte) 90, arg5.field3303.field324[arg5.field3304] < 0);
                    arg5.field3319.method1264(var9, var10.method1263());
                }
                if (arg5.field3303.field324[arg5.field3304] < 0) {
                    arg5.field3319.method1266(-1);
                }
                var10.method1242(var9);
                var10.method653(arg1, arg2, arg0 - arg2);
                if (var10.method1271()) {
                    this.field2018.method1183(var10);
                }
            }
        }
        if (arg4 >= -92) {
            method646(false);
        }
        arg5.field3319.method653(arg1, arg2, arg3);
        field2023++;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "()Log;")
    public final class134 method651() {
        field2015++;
        class167 var1 = (class167) this.field2004.method753(-26703);
        if (var1 == null) {
            return null;
        } else if (var1.field3319 == null) {
            return this.method655();
        } else {
            return var1.field3319;
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
    public final void method652(int arg0) {
        this.field2018.method652(arg0);
        field1997++;
        for (class167 var2 = (class167) this.field2004.method753(-26703); var2 != null; var2 = (class167) this.field2004.method755((byte) 127)) {
            if (!this.field2005.method721(var2, -1)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3333) {
                        this.method647(var2, (byte) -117, var3);
                        var2.field3333 -= var3;
                        break;
                    }
                    this.method647(var2, (byte) -117, var2.field3333);
                    var3 -= var2.field3333;
                } while (!this.field2005.method724(0, -125, var3, null, var2));
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([III)V")
    public final void method653(int[] arg0, int arg1, int arg2) {
        this.field2018.method653(arg0, arg1, arg2);
        field2011++;
        for (class167 var4 = (class167) this.field2004.method753(-26703); var4 != null; var4 = (class167) this.field2004.method755((byte) 125)) {
            if (!this.field2005.method721(var4, -1)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field3333 >= var6) {
                        this.method650(var5 + var6, arg0, var5, var6, -126, var4);
                        var4.field3333 -= var6;
                        break;
                    }
                    this.method650(var5 + var6, arg0, var5, var4.field3333, -106, var4);
                    var6 -= var4.field3333;
                    var5 += var4.field3333;
                } while (!this.field2005.method724(var5, -117, var6, arg0, var4));
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()I")
    public final int method654() {
        field2008++;
        return 0;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "()Log;")
    public final class134 method655() {
        field2001++;
        class167 var1;
        do {
            var1 = (class167) this.field2004.method755((byte) 121);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3319 == null);
        return var1.field3319;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static final void method656(byte arg0) {
        if (arg0 < 41) {
            field2022 = null;
        }
        field1999++;
        class64.field1308.method1108((byte) -90);
        class206.field4012.method1108((byte) -90);
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lme;)V")
    public class105(class114 arg0) {
        this.field2005 = arg0;
    }
}
