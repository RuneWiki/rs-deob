import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class330 extends class379 {

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "Ljava/lang/String;")
    public String field4074 = null;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "I")
    public int field4081 = 0;

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "Z")
    private boolean field4089 = true;

    @OriginalMember(owner = "client!wt", name = "y", descriptor = "[I")
    public static int[] field4088 = new int[4];

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "Z")
    public static boolean field4075 = true;

    @OriginalMember(owner = "client!wt", name = "x", descriptor = "B")
    public byte field4087;

    @OriginalMember(owner = "client!wt", name = "A", descriptor = "B")
    public byte field4090;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!wt", name = "w", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "J")
    public long field4080;

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "Z")
    private boolean field4083;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "[I")
    private int[] field4073;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "[Ltw;")
    public class216[] field4076;

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "[Lcr;")
    public static class600[] field4085;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)Z")
    public static final boolean method1956(int arg0, int arg1) {
        ++field4082;
        if (arg1 <= 98) {
            method1958(true);
        }
        return ~arg0 == -3 || ~arg0 == -4;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method1957(String arg0, int arg1) {
        ++field4079;
        if (arg1 != 15658) {
            this.field4083 = true;
        }
        for (int var3 = 0; ~this.field4081 < ~var3; ++var3) {
            if (this.field4076[var3].field2544.equalsIgnoreCase(arg0)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(Z)V")
    public static final void method1958(boolean arg0) {
        ++field4071;
        try {
            if (!arg0) {
                if (~class558.field7751 == -2) {
                    int var1 = class665.field9130.method2995((byte) 60);
                    if (var1 > 0 && class665.field9130.method2978(arg0)) {
                        int var2 = var1 - class753.field10443;
                        if (~var2 > -1) {
                            var2 = 0;
                        }
                        class665.field9130.method3014(var2, -2);
                        return;
                    }
                    class665.field9130.method3012(552725320);
                    class665.field9130.method3000((byte) -119);
                    class16.field300 = null;
                    class332.field4110 = null;
                    if (class8.field138 == null) {
                        class558.field7751 = 0;
                    } else {
                        class558.field7751 = 2;
                    }
                }
                if (class558.field7751 == 3) {
                    int var3 = class665.field9130.method2995((byte) 78);
                    if (var3 < class486.field6774 && class665.field9130.method2978(false)) {
                        int var4 = class120.field1543 + var3;
                        if (~class486.field6774 > ~var4) {
                            var4 = class486.field6774;
                        }
                        class665.field9130.method3014(var4, -2);
                    } else {
                        class558.field7751 = 0;
                        class120.field1543 = 0;
                    }
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class665.field9130.method3012(552725320);
            class332.field4110 = null;
            class558.field7751 = 0;
            class16.field300 = null;
            class300.field3598 = null;
            class8.field138 = null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)[I")
    public final int[] method1959(int arg0) {
        if (this.field4073 == null) {
            this.field4073 = new int[this.field4081];
            String[] var2 = new String[this.field4081];
            int var3 = 0;
            while (this.field4081 > var3) {
                var2[var3] = this.field4076[var3].field2544;
                this.field4073[var3] = var3++;
            }
            class677.method3812(-50, var2, this.field4073);
        }
        ++field4086;
        if (arg0 != 0) {
            field4075 = true;
        }
        return this.field4073;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IB)V")
    public final void method1960(int arg0, byte arg1) {
        ++field4077;
        --this.field4081;
        if (this.field4081 != 0) {
            class211.method1335(this.field4076, arg0 - -1, this.field4076, arg0, -arg0 + this.field4081);
        } else {
            this.field4076 = null;
        }
        if (arg1 != -25) {
            field4085 = null;
        }
        this.field4073 = null;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)V")
    private final void method1961(int arg0, int arg1) {
        if (this.field4076 == null) {
            this.field4076 = new class216[arg1];
        } else {
            class211.method1335(this.field4076, 0, this.field4076 = new class216[arg1], 0, this.field4081);
        }
        ++field4072;
        if (arg0 != 100) {
            this.field4083 = true;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Ltw;I)V")
    public final void method1962(class216 arg0, int arg1) {
        if (arg1 == -5) {
            ++field4078;
            if (this.field4076 == null || ~this.field4076.length >= ~this.field4081) {
                this.method1961(arg1 ^ -97, this.field4081 - -5);
            }
            this.field4076[this.field4081++] = arg0;
            this.field4073 = null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
    public static void method1963(byte arg0) {
        field4088 = null;
        if (arg0 <= 64) {
            field4088 = null;
        }
        field4085 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Les;I)V")
    private final void method1964(class403 arg0, int arg1) {
        ++field4084;
        int var3 = arg0.method2396((byte) 112);
        if ((1 & var3) != 0) {
            this.field4083 = true;
        }
        if (~(var3 & 2) != -1) {
            this.field4089 = true;
        }
        super.field4809 = arg0.method2361(65);
        this.field4080 = arg0.method2361(47);
        this.field4074 = arg0.method2384(-6435);
        arg0.method2396((byte) -106);
        this.field4087 = arg0.method2392(-126);
        this.field4090 = arg0.method2392(121);
        this.field4081 = arg0.method2390((byte) -119);
        if (this.field4081 > 0) {
            this.field4076 = new class216[this.field4081];
            for (int var4 = 0; this.field4081 > var4; ++var4) {
                class216 var5 = new class216();
                if (this.field4083) {
                    arg0.method2361(121);
                }
                if (this.field4089) {
                    var5.field2544 = arg0.method2384(-6435);
                }
                var5.field2539 = arg0.method2392(119);
                var5.field2543 = arg0.method2390((byte) -101);
                this.field4076[var4] = var5;
            }
        }
        int var6 = 74 / ((7 - arg1) / 51);
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Les;)V")
    public class330(class403 arg0) {
        this.method1964(arg0, -60);
    }
}
