import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class113 extends class310 {

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
    private int field1857 = 4096;

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "Z")
    private boolean field1858 = true;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field1855 = "K";

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "[I")
    public static int[] field1853 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "[I")
    public static int[] field1859 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "[I")
    public static int[] field1854 = new int[2000];

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!ue", name = "eb", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!ue", name = "fb", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ue", name = "gb", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)[[I", line = 8)
    public final int[][] method391(int arg0, boolean arg1) {
        int[][] var3 = this.field4942.method10((byte) -127, arg0);
        if (this.field4942.field30) {
            int[] var4 = this.method2200(0, field1861 & arg0 - 1, (byte) 74);
            int[] var5 = this.method2200(0, arg0, (byte) 74);
            int[] var6 = this.method2200(0, arg0 + 1 & field1861, (byte) 74);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class261.field4405; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field1857;
                int var12 = (var5[class98.field1628 & var10 + 1] - var5[class98.field1628 & var10 - 1]) * this.field1857;
                int var13 = var11 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var14 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = var12 / var17;
                    var19 = var11 / var17;
                    var18 = 16777216 / var17;
                }
                if (this.field1858) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var19;
                var9[var10] = var18;
            }
        }
        if (!arg1) {
            field1861 = -104;
        }
        field1846++;
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILqm;)Lnc;", line = 89)
    public static final class104 method855(int arg0, int arg1, class227 arg2) {
        field1847++;
        class104 var3 = new class104(arg1, arg2.method1758((byte) -112), arg2.method1758((byte) 70), arg2.method1715((byte) 71), arg2.method1715((byte) 62), arg2.method1720((byte) -77) == 1, arg2.method1720((byte) -119));
        int var4 = arg2.method1720((byte) -125);
        if (arg0 != 4) {
            method859((class57) null, false, (class57) null, false);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field1692.method2302((byte) -108, new class160(arg2.method1720((byte) -10), arg2.method1720((byte) -44), arg2.method1765(true), arg2.method1765(true), arg2.method1765(true), arg2.method1765(true), arg2.method1765(true), arg2.method1765(true), arg2.method1765(true), arg2.method1765(true)));
        }
        var3.method805(arg0 + 24615);
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 114)
    public static final void method856(int arg0, boolean arg1, String arg2) {
        boolean var3 = arg1;
        for (int var4 = 0; var4 < class345.field5501; var4++) {
            class258 var5 = class56.field924[class306.field4895[var4]];
            if (var5 != null && var5.field4349 != null && var5.field4349.equalsIgnoreCase(arg2)) {
                var3 = true;
                if (arg0 == 1) {
                    class140.field2304++;
                    class36.field520.method2228(136, 16547);
                    class36.field520.method1767(false, 0);
                    class36.field520.method1731(-85, class306.field4895[var4]);
                } else if (arg0 == 4) {
                    class36.field520.method2228(126, 16547);
                    client.field711++;
                    class36.field520.method1712(0, -96);
                    class36.field520.method1729(class306.field4895[var4], 206);
                } else if (arg0 == 5) {
                    class182.field2940++;
                    class36.field520.method2228(12, 16547);
                    class36.field520.method1731(-117, class306.field4895[var4]);
                    class36.field520.method1728(0, (byte) -114);
                } else if (arg0 == 6) {
                    class124.field2121++;
                    class36.field520.method2228(101, 16547);
                    class36.field520.method1721(-96, 0);
                    class36.field520.method1761(116, class306.field4895[var4]);
                } else if (arg0 == 7) {
                    class36.field520.method2228(100, 16547);
                    class36.field520.method1728(0, (byte) 122);
                    class322.field5121++;
                    class36.field520.method1719(class306.field4895[var4], 128);
                }
                break;
            }
        }
        field1850++;
        if (!var3) {
            class182.method1431(class295.field4755 + arg2, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)I", line = 186)
    public static final int method857(byte arg0, int arg1) {
        field1849++;
        if (arg1 < 0) {
            return 0;
        }
        class354 var2 = (class354) class329.field5229.method1268(-50, (long) arg1);
        if (var2 == null) {
            return class310.method2204(-19, arg1).field5588;
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = 43 / ((arg0 - 20) / 63);
        while (var4 < var2.field5617.length) {
            if (var2.field5617[var4] == -1) {
                var3++;
            }
            var4++;
        }
        return var3 + class310.method2204(-19, arg1).field5588 - var2.field5617.length;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lqm;II)V", line = 231)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg1 != -2470) {
            method855(-78, 60, (class227) null);
        }
        if (arg2 == 0) {
            this.field1857 = arg0.method1765(true);
        } else if (arg2 == 1) {
            this.field1858 = arg0.method1720((byte) -94) == 1;
        }
        field1852++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;ILwf;)Ljava/lang/String;", line = 273)
    public static final String method858(String arg0, int arg1, class250 arg2) {
        field1860++;
        if (arg1 >= -114) {
            method856(-120, false, (String) null);
        }
        if (arg0.indexOf("%") == -1) {
            return arg0;
        }
        while (true) {
            int var3 = arg0.indexOf("%1");
            if (var3 == -1) {
                while (true) {
                    int var4 = arg0.indexOf("%2");
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg0.indexOf("%3");
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg0.indexOf("%4");
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg0.indexOf("%5");
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg0.indexOf("%dns");
                                                    if (var8 == -1) {
                                                        return arg0;
                                                    }
                                                    String var9 = "";
                                                    if (class195.field3102 != null) {
                                                        if (class195.field3102.field3066 == null) {
                                                            var9 = class294.method2118(class195.field3102.field3061, -124);
                                                        } else {
                                                            var9 = (String) class195.field3102.field3066;
                                                        }
                                                    }
                                                    arg0 = arg0.substring(0, var8) + var9 + arg0.substring(var8 + 4);
                                                }
                                            }
                                            arg0 = arg0.substring(0, var7) + class238.method1818(class307.method2187(4, arg2, (byte) 59), 85) + arg0.substring(var7 + 2);
                                        }
                                    }
                                    arg0 = arg0.substring(0, var6) + class238.method1818(class307.method2187(3, arg2, (byte) 59), 95) + arg0.substring(var6 + 2);
                                }
                            }
                            arg0 = arg0.substring(0, var5) + class238.method1818(class307.method2187(2, arg2, (byte) 59), 120) + arg0.substring(var5 + 2);
                        }
                    }
                    arg0 = arg0.substring(0, var4) + class238.method1818(class307.method2187(1, arg2, (byte) 59), 124) + arg0.substring(var4 + 2);
                }
            }
            arg0 = arg0.substring(0, var3) + class238.method1818(class307.method2187(0, arg2, (byte) 59), 103) + arg0.substring(var3 + 2);
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 363)
    public class113() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lth;ZLth;Z)V", line = 373)
    public static final void method859(class57 arg0, boolean arg1, class57 arg2, boolean arg3) {
        class235.field3902 = arg0;
        field1845++;
        class353.field5603 = arg3;
        if (arg1) {
            field1855 = (String) null;
        }
        class314.field5013 = arg2;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V", line = 395)
    public static void method860(int arg0) {
        field1853 = null;
        field1855 = null;
        field1854 = null;
        field1859 = null;
        int var1 = 99 / ((arg0 + 45) / 38);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(BI)Li;", line = 416)
    public static final class350 method861(byte arg0, int arg1) {
        field1843++;
        if (arg0 != 115) {
            field1853 = (int[]) null;
        }
        class350 var2 = (class350) class66.field1171.method2147((byte) 108, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class348.field5533.method472(arg1, 84, 11);
        class350 var4 = new class350();
        if (var3 != null) {
            var4.method2462((byte) 15, new class227(var3));
        }
        class66.field1171.method2149(var4, arg0 ^ 0xFFFF80BE, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([BIZ)Ljava/lang/Object;", line = 443)
    public static final Object method862(byte[] arg0, int arg1, boolean arg2) {
        field1856++;
        int var3 = -75 % ((-arg1 - 17) / 47);
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class3.field24) {
            try {
                class237 var4 = (class237) Class.forName("ff").getDeclaredConstructor().newInstance();
                var4.method1137(-1, arg0);
                return var4;
            } catch (Throwable var6) {
                class3.field24 = true;
            }
        }
        return arg2 ? class177.method1396(false, arg0) : arg0;
    }
}
