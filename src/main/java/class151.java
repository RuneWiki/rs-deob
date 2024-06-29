import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class151 extends class69 {

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "[I")
    private int[] field1867 = new int[this.field799];

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "J")
    public static long field1857 = -1L;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "Z")
    public static boolean field1866 = false;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "[I")
    public static int[] field1865 = new int[2500];

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "Lwq;")
    public static class92 field1872;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    private int field1858;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    private int field1864;

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "Lae;")
    public static class134 field1873;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "[B")
    private byte[] field1868;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public final void method394(byte arg0) {
        int var2 = 14 / ((arg0 - 56) / 61);
        this.field1864 = Math.abs(this.field1864);
        ++field1871;
        if (this.field1864 >= 4096) {
            this.field1864 = 4095;
        }
        this.method303(this.field1858++, (byte) (this.field1864 >> 4));
        this.field1864 = 0;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZI)V")
    public final void method396(int arg0, boolean arg1, int arg2) {
        ++field1870;
        this.field1864 += this.field1867[arg0] * arg2 >> 12;
        if (arg1) {
            this.field1867 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)V")
    public void method303(int arg0, byte arg1) {
        ++field1869;
        this.field1868[this.field1858++] = (byte) (class33.method210(arg1 >> 1, 127) + 127);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method914(boolean arg0, String arg1) {
        ++field1856;
        if (arg1 != null) {
            if (arg1.startsWith("*")) {
                arg1 = arg1.substring(1);
            }
            if (arg0) {
                field1865 = null;
            }
            String var2 = class255.method1720((byte) 74, arg1);
            if (var2 != null) {
                for (int var3 = 0; ~var3 > ~class97.field1170; ++var3) {
                    String var4 = class138.field1724[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class255.method1720((byte) 74, var4);
                    if (var5 != null && var5.equals(var2)) {
                        --class97.field1170;
                        for (int var6 = var3; class97.field1170 > var6; ++var6) {
                            class138.field1724[var6] = class138.field1724[var6 + 1];
                            class99.field1213[var6] = class99.field1213[var6 + 1];
                            class56.field680[var6] = class56.field680[var6 - -1];
                            class409.field5895[var6] = class409.field5895[var6 - -1];
                            class288.field4044[var6] = class288.field4044[var6 + 1];
                        }
                        ++class396.field5651;
                        class56.field676 = class146.field1792;
                        class62.field718.method2143(209, -2);
                        class62.field718.method1583(class81.method457(arg1, (byte) -49), (byte) -112);
                        class62.field718.method1596(arg1, false);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ltq;I)V")
    public static final void method915(class376 arg0, int arg1) {
        class236.field3334 = arg0;
        ++field1863;
        class106.field1266 = class236.field3334.method2415(arg1, (byte) 56);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
    public static final void method916(boolean arg0) {
        class305.field4288.method627(class306.field4327, !class18.field210 ? -1 : class397.field5678 + 256);
        if (arg0) {
            field1866 = true;
        }
        ++field1859;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public final void method392(int arg0) {
        this.field1858 = 0;
        this.field1864 = 0;
        if (arg0 < 84) {
            this.field1868 = null;
        }
        ++field1861;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method917(String arg0, int arg1) {
        ++field1862;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 <= 118) {
            method918(true);
        }
        for (int var4 = 0; var4 < var2; ++var4) {
            char var8 = arg0.charAt(var4);
            if (~var8 == -61 || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var2 > var6; ++var6) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 != '>') {
                var5.append(var7);
            } else {
                var5.append("<gt>");
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(Z)V")
    public static void method918(boolean arg0) {
        field1872 = null;
        field1873 = null;
        field1865 = null;
        if (arg0) {
            field1866 = true;
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIIIIF)V")
    public class151(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field799 > var7; ++var7) {
            this.field1867[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lqf;Lqf;I)V")
    public static final void method919(class406 arg0, class406 arg1, int arg2) {
        if (arg0.field5854 != null) {
            arg0.method2594((byte) -22);
        }
        ++field1860;
        arg0.field5862 = arg1;
        arg0.field5854 = arg1.field5854;
        arg0.field5854.field5862 = arg0;
        if (arg2 < -47) {
            arg0.field5862.field5854 = arg0;
        }
    }

    static {
        new class362((String) null, "die kürzlich gesprochen oder gehandelt haben.", (String) null, (String) null);
        field1872 = new class92();
    }
}
