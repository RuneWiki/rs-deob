import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class163 extends class210 {

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "I")
    private int field2114 = -1;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    private int field2122 = 0;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
    private int field2112 = 0;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "Z")
    public boolean field2118 = false;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    private int field2120 = -32768;

    @OriginalMember(owner = "client!uk", name = "ab", descriptor = "I")
    private int field2134 = 0;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
    private int field2124;

    @OriginalMember(owner = "client!uk", name = "bb", descriptor = "I")
    private int field2135;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
    public int field2117;

    @OriginalMember(owner = "client!uk", name = "db", descriptor = "Ljl;")
    private class168 field2137;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "[I")
    public static int[] field2126 = new int[32];

    @OriginalMember(owner = "client!uk", name = "eb", descriptor = "Lwt;")
    public static class194 field2138;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "F")
    public static float field2111;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!uk", name = "X", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!uk", name = "Z", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!uk", name = "cb", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "Lko;")
    private class332 field2125;

    @OriginalMember(owner = "client!uk", name = "Y", descriptor = "Lps;")
    public static class59 field2132;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field2126[var1] = var0 + -1;
            var0 += var0;
        }
        field2138 = new class194("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");
    }

    @OriginalMember(owner = "client!uk", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        ++field2123;
        if (this.field2125 != null) {
            this.field2125.method2007();
        }
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)Z", line = 16)
    public final boolean method723(int arg0) {
        ++field2121;
        return arg0 != 17774 ? false : false;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 30)
    public static final String method1028(String arg0, int arg1, String arg2, String arg3) {
        if (arg1 != 10276) {
            return null;
        } else {
            ++field2127;
            for (int var4 = arg3.indexOf(arg0); var4 != -1; var4 = arg3.indexOf(arg0, var4 - -arg2.length())) {
                arg3 = arg3.substring(0, var4) + arg2 + arg3.substring(var4 + arg0.length());
            }
            return arg3;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 50)
    public final void method1029(int arg0) {
        if (this.field2125 != null) {
            this.field2125.method2007();
        }
        ++field2128;
        if (arg0 > -12) {
            field2126 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILeq;I)Lva;", line = 63)
    private final class327 method1030(int arg0, int arg1, class134 arg2, int arg3) {
        ++field2136;
        if (arg0 != 0) {
            this.field2112 = 123;
        }
        class366 var5 = class53.field820.method2427(arg1, -17773);
        class441 var6 = class459.field6685[super.field2956];
        class441 var7 = this.field2124 < 3 ? class459.field6685[this.field2124 + 1] : null;
        return !this.field2118 ? var5.method2237(this.field2112, var7, true, arg2, -25375, this.field2114, this.field2122, super.field2959, super.field2970, class286.field4083, var6, arg3, super.field2966) : var5.method2237(-1, var7, true, arg2, -25375, -1, 0, super.field2959, super.field2970, class286.field4083, var6, arg3, super.field2966);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Leq;ILva;)V", line = 80)
    private final void method1031(class134 arg0, int arg1, class327 arg2) {
        ++field2109;
        class56[] var4 = arg2.method203();
        class339[] var5 = arg2.method185();
        if ((this.field2125 == null || this.field2125.field4820) && (var4 != null || var5 != null)) {
            this.field2125 = new class332(class263.field3748);
        }
        if (arg1 != 0) {
            method1033(78);
        }
        if (this.field2125 != null) {
            this.field2125.method2003(arg0, (long) class263.field3748, var4, var5, false);
            this.field2125.method2010(super.field2956, super.field2972, super.field2962, super.field2975, super.field2957);
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 281)
    public class163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field2124 = arg4;
        this.field2135 = arg0;
        this.field2117 = arg1 + arg2;
        this.field2134 = arg12;
        class366 var14 = class53.field820.method2427(this.field2135, -17773);
        int var15 = var14.field5501;
        if (var15 != -1) {
            this.field2137 = class286.field4083.method2602(-24462, var15);
            this.field2118 = false;
        } else {
            this.field2118 = true;
        }
        if (~this.field2117 == ~arg2) {
            class204.method1258(-1, this.field2112, super.field2959, false, this.field2137, super.field2966, super.field2956);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILeq;BI)Z", line = 109)
    public final boolean method365(int arg0, class134 arg1, byte arg2, int arg3) {
        ++field2113;
        int var5 = 73 % ((arg2 - -23) / 38);
        return false;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(Leq;Z)Lgl;", line = 120)
    public final class408 method364(class134 arg0, boolean arg1) {
        ++field2110;
        if (arg1) {
            method1035((byte) -6, (class239) null, (class239) null, (class239) null, (class239) null);
        }
        class327 var3 = this.method1030(0, this.field2135, arg0, 2048 | (~this.field2134 == -1 ? 0 : 5));
        if (var3 == null) {
            return null;
        } else {
            if (this.field2134 != 0) {
                var3.method171(this.field2134 * 2048);
            }
            class33 var4 = arg0.method830();
            var4.method278(super.field2959, super.field2970, super.field2966);
            if (this.field2125 == null) {
                var3.method191(var4, (class299) null, 0);
            } else {
                class191 var5 = this.field2125.method2005();
                arg0.method787(var3, var5, var4, (class299) null, 0);
            }
            this.field2120 = var3.method195();
            this.method1031(arg0, 0, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIB)V", line = 154)
    public static final void method1032(int arg0, int arg1, byte arg2) {
        ++field2116;
        class338 var3 = class380.method2294((byte) 80, 0, 15);
        var3.method2052((byte) -46);
        var3.field4930 = arg1;
        if (arg2 > -108) {
            field2126 = null;
        }
        var3.field4924 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)I", line = 174)
    public final int method724(byte arg0) {
        ++field2129;
        return arg0 > -30 ? -121 : this.field2120;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V", line = 194)
    public static void method1033(int arg0) {
        if (arg0 < -59) {
            field2132 = null;
            field2138 = null;
            field2126 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V", line = 206)
    public final void method1034(int arg0, int arg1) {
        ++field2115;
        if (!this.field2118) {
            this.field2122 += arg1;
            while (this.field2122 > this.field2137.field2205[this.field2112]) {
                this.field2122 -= this.field2137.field2205[this.field2112];
                ++this.field2112;
                if (~this.field2137.field2219.length >= ~this.field2112) {
                    this.field2118 = true;
                    break;
                }
            }
            if (arg0 != 0) {
                this.field2117 = 68;
            }
            if (!this.field2118) {
                class204.method1258(-1, this.field2112, super.field2959, false, this.field2137, super.field2966, super.field2956);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V", line = 236)
    public final void method722(int arg0) {
        if (arg0 != 0) {
            this.method722(-100);
        }
        ++field2119;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Leq;I)V", line = 248)
    public final void method361(class134 arg0, int arg1) {
        if (arg1 != -1) {
            this.field2137 = null;
        }
        ++field2131;
        class327 var3 = this.method1030(0, this.field2135, arg0, 0);
        if (var3 != null) {
            this.method1031(arg0, 0, var3);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIILbp;IZLeq;)V", line = 268)
    public final void method719(int arg0, int arg1, int arg2, class250 arg3, int arg4, boolean arg5, class134 arg6) {
        ++field2130;
        if (arg2 != -1) {
            this.field2137 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLhe;Lhe;Lhe;Lhe;)V", line = 315)
    public static final void method1035(byte arg0, class239 arg1, class239 arg2, class239 arg3, class239 arg4) {
        class225.field3175 = arg2;
        ++field2133;
        class184.field2616 = arg1;
        class281.field4018 = arg3;
        class121.field1574 = arg4;
        if (arg0 != 67) {
            method1033(-36);
        }
        class181.field2591 = new class356[class184.field2616.method1466(false)][];
        class370.field5561 = new boolean[class184.field2616.method1466(false)];
    }
}
