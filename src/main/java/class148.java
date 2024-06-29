import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class148 {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "Lro;")
    private class1 field2065 = new class1();

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    private int field2084;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    private int field2071;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Lcs;")
    private class189 field2069;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2070 = 0;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field2082 = 0;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "Lbn;")
    public static class257 field2068 = new class257();

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "Lgp;")
    public static class31 field2078;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Ljava/awt/Image;")
    public static Image field2076;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "[Z")
    public static boolean[] field2087;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLjava/lang/Object;Lgl;)V", line = 3)
    public final void method874(byte arg0, Object arg1, class357 arg2) {
        this.method876((byte) 107, arg2);
        if (arg0 >= -116) {
            field2076 = null;
        }
        field2066++;
        if (this.field2084 == 0) {
            class324 var4 = (class324) this.field2065.method9(-6596);
            var4.method2290((byte) 98);
            var4.method2519(-2107);
        } else {
            this.field2084--;
        }
        class310 var5 = new class310(arg2, arg1);
        this.field2069.method1202(-1, arg2.method2278((byte) -93), var5);
        this.field2065.method6(-72, var5);
        var5.field5780 = 0L;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V", line = 32)
    public final void method875(int arg0, int arg1) {
        field2074++;
        if (class327.field4661 != null) {
            for (class324 var3 = (class324) this.field2065.method2(15056); var3 != null; var3 = (class324) this.field2065.method10(93)) {
                if (var3.method1945(-112)) {
                    if (var3.method1946(113) == null) {
                        var3.method2290((byte) 98);
                        var3.method2519(-2107);
                        this.field2084++;
                    }
                } else if ((long) arg0 < ++var3.field5780) {
                    class324 var4 = class327.field4661.method493(8073, var3);
                    this.field2069.method1202(-1, var3.field5248, var4);
                    class251.method1574(-1, var3, var4);
                    var3.method2290((byte) 98);
                    var3.method2519(-2107);
                }
            }
        }
        int var5 = -40 % ((-arg1 - 31) / 35);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLgl;)V", line = 79)
    private final void method876(byte arg0, class357 arg1) {
        field2086++;
        long var3 = arg1.method2278((byte) -125);
        for (class324 var5 = (class324) this.field2069.method1204((byte) -79, var3); var5 != null; var5 = (class324) this.field2069.method1209(-1)) {
            if (var5.field4576.method2277(arg1, (byte) 127)) {
                var5.method2290((byte) 98);
                var5.method2519(-2107);
                this.field2084++;
                break;
            }
        }
        if (arg0 < 4) {
            method887(-35);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V", line = 106)
    public final void method877(byte arg0) {
        field2085++;
        if (arg0 != -19) {
            return;
        }
        for (class324 var2 = (class324) this.field2065.method2(arg0 ^ 0xFFFFC53D); var2 != null; var2 = (class324) this.field2065.method10(110)) {
            if (var2.method1945(-113)) {
                var2.method2290((byte) 98);
                var2.method2519(arg0 ^ 0x828);
                this.field2084++;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 140)
    public static void method878(int arg0) {
        field2068 = null;
        field2076 = null;
        field2078 = null;
        if (arg0 != -1) {
            field2070 = -103;
        }
        field2087 = null;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V", line = 154)
    public final void method879(byte arg0) {
        if (arg0 >= 83) {
            this.field2065.method1((byte) 93);
            field2081++;
            this.field2069.method1206(-117);
            this.field2084 = this.field2071;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Llg;III[Z)Z", line = 170)
    public static final boolean method880(class238 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class132.field1814 != class111.field1285) {
            int var6 = class78.field887[arg1].method1991(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class319 var8 = class78.field887[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1991(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1978(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1980(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Len;III)V", line = 205)
    public static final void method881(class174 arg0, int arg1, int arg2, int arg3) {
        class257.field3504 = arg0;
        field2077++;
        if (arg3 < 121) {
            method881((class174) null, -13, -76, 112);
        }
        class114.field1321 = new class249[arg2][arg1];
        if (class282.field3966 != null) {
            class102.field1152 = class335.method2166(class282.field3966[1], true, class282.field3966[2], class282.field3966[4], class282.field3966[5], class282.field3966[0], class282.field3966[3]);
        }
        class72.field812 = new class249();
        class274.method1734(2);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)I", line = 245)
    public final int method882(boolean arg0) {
        if (!arg0) {
            this.field2069 = null;
        }
        field2073++;
        return this.field2071;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)I", line = 257)
    public final int method883(int arg0) {
        field2072++;
        if (arg0 != 1001) {
            this.method874((byte) -69, (Object) null, (class357) null);
        }
        return this.field2084;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(I)V", line = 290)
    public class148(int arg0) {
        this.field2084 = arg0;
        this.field2071 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field2069 = new class189(var2);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILra;Lra;Z)V", line = 274)
    public static final void method884(int arg0, class57 arg1, class57 arg2, boolean arg3) {
        if (arg0 != 2) {
            field2078 = null;
        }
        class72.field816 = arg2;
        field2080++;
        class262.field3628 = arg1;
        class281.field3962 = arg3;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lgl;I)Ljava/lang/Object;", line = 305)
    public final Object method885(class357 arg0, int arg1) {
        field2083++;
        long var3 = arg0.method2278((byte) -120);
        if (arg1 != 0) {
            method881((class174) null, -23, -21, 78);
        }
        for (class324 var5 = (class324) this.field2069.method1204((byte) -89, var3); var5 != null; var5 = (class324) this.field2069.method1209(-1)) {
            if (var5.field4576.method2277(arg0, (byte) 35)) {
                Object var6 = var5.method1946(arg1 ^ 0x6C);
                if (var6 != null) {
                    if (var5.method1945(-128)) {
                        class310 var7 = new class310(arg0, var6);
                        this.field2069.method1202(-1, var5.field5248, var7);
                        this.field2065.method6(116, var7);
                        var7.field5780 = 0L;
                        var5.method2290((byte) 98);
                        var5.method2519(arg1 ^ 0xFFFFF7C5);
                    } else {
                        this.field2065.method6(-107, var5);
                        var5.field5780 = 0L;
                    }
                    return var6;
                }
                var5.method2290((byte) 98);
                var5.method2519(-2107);
                this.field2084++;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lir;I)V", line = 359)
    public static final void method886(class19 arg0, int arg1) {
        arg0.field189 = null;
        field2079++;
        int var2 = arg0.field197.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field197[var3].field1784 = false;
        }
        if (arg1 != 1) {
            method878(-73);
        }
        class257[] var4 = class160.field2268;
        synchronized (class160.field2268) {
            if (var2 < class160.field2268.length && class111.field1281[var2] < 200) {
                class160.field2268[var2].method1605(arg0, arg1 ^ 0xFFFFC6D3);
                int var10002 = class111.field1281[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V", line = 387)
    public static final void method887(int arg0) {
        if (arg0 == 7066) {
            class233.field3142 = new class159(class452.field6583, "", class410.field5936, 1001, 0L, 0, 0);
            field2067++;
        }
    }
}
