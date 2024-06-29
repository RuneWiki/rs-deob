import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class138 {

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public int field2015;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Z")
    public boolean field2022;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Z")
    public boolean field2001;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "[S")
    public short[] field2010;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public int field2019;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    private int field2013;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "[I")
    public static int[] field2014 = new int[1000];

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    private int field2002;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    private int field2007;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    private int field2016;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    private int field2017;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Lf;")
    public static class191 field2006;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "Ldd;")
    public class471 field2020;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static void method915(byte arg0) {
        field2006 = null;
        field2014 = null;
        if (arg0 != -78) {
            field2004 = 119;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZILhu;Ljava/lang/String;)Lhh;")
    public static final class125 method916(boolean arg0, int arg1, class469 arg2, String arg3) {
        field2009++;
        if (!arg0) {
            return null;
        } else if (arg1 == 0) {
            return arg2.method2804(arg3, 24678);
        } else if (arg1 == 1) {
            try {
                class131.method839("openjs", (byte) -55, arg2.field6861, new Object[] { (new URL(arg2.field6861.getCodeBase(), arg3)).toString() });
                class125 var4 = new class125();
                var4.field1791 = 1;
                return var4;
            } catch (Throwable var10) {
                class125 var5 = new class125();
                var5.field1791 = 2;
                return var5;
            }
        } else if (arg1 == 2) {
            try {
                arg2.field6861.getAppletContext().showDocument(new URL(arg2.field6861.getCodeBase(), arg3), "_blank");
                class125 var6 = new class125();
                var6.field1791 = 1;
                return var6;
            } catch (Exception var11) {
                class125 var7 = new class125();
                var7.field1791 = 2;
                return var7;
            }
        } else if (arg1 == 3) {
            try {
                class131.method841(arg2.field6861, -14144, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                arg2.field6861.getAppletContext().showDocument(new URL(arg2.field6861.getCodeBase(), arg3), "_top");
                class125 var8 = new class125();
                var8.field1791 = 1;
                return var8;
            } catch (Exception var12) {
                class125 var9 = new class125();
                var9.field1791 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static final void method917(int arg0) {
        class14.field242.method1022((byte) -34);
        field2018++;
        class411.field6185.method1022((byte) -34);
        if (arg0 != 1024) {
            field2021 = -26;
        }
        class112.field1563.method1022((byte) -34);
        class242.field3402.method1022((byte) -34);
        class438.field6530.method1022((byte) -34);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V")
    public static final void method918(int arg0, int arg1, int arg2) {
        if (arg0 >= -115) {
            field2014 = null;
        }
        field2011++;
        class377 var3 = class99.method672(0, false, 15);
        var3.method2340((byte) 126);
        var3.field5763 = arg2;
        var3.field5762 = arg1;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILrk;I)V")
    public static final void method919(int arg0, int arg1, class194 arg2, int arg3) {
        field2008++;
        if (arg1 > -102) {
            return;
        }
        if (arg2.field5240 == arg3 && arg3 != -1) {
            class270 var4 = class260.field3621.method1934(119, arg3);
            int var5 = var4.field3735;
            if (var5 == 1) {
                arg2.field5266 = 1;
                arg2.field5322 = 0;
                arg2.field5269 = 0;
                arg2.field5256 = 0;
                arg2.field5301 = arg0;
                class445.method2678(false, arg2.field5269, arg2.field2210, var4, arg2.field2217, (byte) -117, arg2.field2215);
            }
            if (var5 == 2) {
                arg2.field5322 = 0;
                return;
            }
        } else if (arg3 == -1 || arg2.field5240 == -1 || class260.field3621.method1934(117, arg3).field3756 >= class260.field3621.method1934(127, arg2.field5240).field3756) {
            arg2.field5301 = arg0;
            arg2.field5240 = arg3;
            arg2.field5269 = 0;
            arg2.field5338 = arg2.field5343;
            arg2.field5256 = 0;
            arg2.field5266 = 1;
            arg2.field5322 = 0;
            if (arg2.field5240 == -1) {
                return;
            }
            class445.method2678(false, arg2.field5269, arg2.field2210, class260.field3621.method1934(118, arg2.field5240), arg2.field2217, (byte) -123, arg2.field2215);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII)V")
    public final void method920(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2017 = arg2;
        this.field2007 = arg1;
        if (arg0 == 14708) {
            field2003++;
            this.field2002 = arg4;
            this.field2016 = arg3;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BIIIIILqa;)V")
    private final void method921(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class496 arg6) {
        this.field2020 = arg6.method1071(arg5, arg1, arg3, arg2, arg4, 1.0F);
        field2005++;
        int var8 = 43 / ((arg0 - 25) / 51);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    private final void method922(int arg0) {
        field2000++;
        if (arg0 != 4096) {
            this.method920(-127, -128, 7, 93, -82);
        }
        int var2 = this.field2019;
        if (var2 == 2) {
            this.field2016 = 2048;
            this.field2002 = 1;
            this.field2007 = 2048;
            this.field2017 = 0;
        } else if (var2 == 3) {
            this.field2007 = 2048;
            this.field2017 = 0;
            this.field2002 = 1;
            this.field2016 = 4096;
        } else if (var2 == 4) {
            this.field2002 = 4;
            this.field2017 = 0;
            this.field2016 = 2048;
            this.field2007 = 2048;
        } else if (var2 == 5) {
            this.field2007 = 2048;
            this.field2002 = 4;
            this.field2017 = 0;
            this.field2016 = 8192;
        } else if (var2 == 12) {
            this.field2002 = 2;
            this.field2007 = 2048;
            this.field2017 = 0;
            this.field2016 = 2048;
        } else if (var2 == 13) {
            this.field2007 = 2048;
            this.field2017 = 0;
            this.field2002 = 2;
            this.field2016 = 8192;
        } else if (var2 == 10) {
            this.field2016 = 2048;
            this.field2007 = 512;
            this.field2017 = 1536;
            this.field2002 = 3;
        } else if (var2 == 11) {
            this.field2016 = 4096;
            this.field2007 = 512;
            this.field2002 = 3;
            this.field2017 = 1536;
        } else if (var2 == 6) {
            this.field2017 = 1280;
            this.field2007 = 768;
            this.field2002 = 3;
            this.field2016 = 2048;
        } else if (var2 == 7) {
            this.field2002 = 3;
            this.field2016 = 4096;
            this.field2007 = 768;
            this.field2017 = 1280;
        } else if (var2 == 8) {
            this.field2016 = 2048;
            this.field2017 = 1024;
            this.field2002 = 3;
            this.field2007 = 1024;
        } else if (var2 == 9) {
            this.field2016 = 4096;
            this.field2002 = 3;
            this.field2007 = 1024;
            this.field2017 = 1024;
        } else if (var2 == 14) {
            this.field2016 = 2048;
            this.field2017 = 1280;
            this.field2002 = 1;
            this.field2007 = 768;
        } else if (var2 == 15) {
            this.field2017 = 1536;
            this.field2016 = 4096;
            this.field2007 = 512;
            this.field2002 = 1;
        } else if (var2 == 16) {
            this.field2007 = 256;
            this.field2016 = 8192;
            this.field2002 = 1;
            this.field2017 = 1792;
        } else {
            this.field2002 = 0;
            this.field2017 = 0;
            this.field2016 = 2048;
            this.field2007 = 2048;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZII)V")
    public final void method923(boolean arg0, int arg1, int arg2) {
        if (arg2 != 50) {
            this.method922(-115);
        }
        field2012++;
        int var4;
        if (arg0) {
            var4 = 2048;
        } else {
            int var5 = this.field2016 * arg1 / 50 + this.field2013 & 0x7FF;
            int var6 = this.field2002;
            if (var6 == 1) {
                var4 = (class525.field7760[var5 << 3] >> 5) + 1024;
            } else if (var6 == 3) {
                var4 = class429.field6383[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field2020.method423((float) ((this.field2007 * var4 >> 11) + this.field2017) / 2048.0F, -119);
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    protected class138() {
        if (class429.field6383 == null) {
            class124.method800((byte) -62);
        }
        this.method922(4096);
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lqa;Ltl;I)V")
    public class138(class496 arg0, class91 arg1, int arg2) {
        if (class429.field6383 == null) {
            class124.method800((byte) -90);
        }
        this.field2015 = arg1.method618((byte) 100);
        this.field2022 = (this.field2015 & 0x10) != 0;
        this.field2001 = (this.field2015 & 0x8) != 0;
        this.field2015 &= 0x7;
        int var4 = arg1.method631(10494) << arg2;
        int var5 = arg1.method631(10494) << arg2;
        int var6 = arg1.method631(10494) << arg2;
        int var7 = arg1.method618((byte) 100);
        int var8 = var7 * 2 + 1;
        this.field2010 = new short[var8];
        for (int var9 = 0; var9 < this.field2010.length; var9++) {
            short var13 = (short) arg1.method631(10494);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if (var15 > var8 - var14) {
                var15 = var8 - var14;
            }
            this.field2010[var9] = (short) class286.method1860(var15, var14 << 8);
        }
        int var10 = (var7 << class386.field5882) + class380.field5804;
        int var11 = class249.field3466 == null ? class88.field1208[class500.method2987(arg1.method631(10494), 6755) & 0xFFFF] : class249.field3466[arg1.method631(10494)];
        int var12 = arg1.method618((byte) 100);
        this.field2019 = var12 & 0x1F;
        this.field2013 = var12 & 0xE0 << 3;
        if (this.field2019 != 31) {
            this.method922(4096);
        }
        this.method921((byte) -116, var6, var10, var5, var11, var4, arg0);
    }
}
