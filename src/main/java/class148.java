import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class148 {

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "I")
    public int field2232 = 0;

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "Z")
    public boolean field2238 = false;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "Z")
    public boolean field2235 = true;

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
    public int field2239 = -1;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
    public int field2236 = 1190717;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    public int field2228 = 8;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
    public int field2240 = -1;

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
    public int field2237 = 127;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "I")
    public int field2231 = -1;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
    public int field2229 = 128;

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "I")
    public int field2246 = 16;

    @OriginalMember(owner = "client!ut", name = "w", descriptor = "Z")
    public boolean field2248 = true;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
    public int field2226;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!ut", name = "x", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "Lmg;")
    public class529 field2245;

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "Lok;")
    public static class74 field2234;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lok;Lok;Z)V")
    public static final void method1070(class74 arg0, class74 arg1, boolean arg2) {
        class23.field353 = arg0;
        class258.field3707 = arg1;
        if (!arg2) {
            method1076(6, true);
        }
        field2249++;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
    public static void method1071(int arg0) {
        if (arg0 == -1185989056) {
            field2234 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILgk;)V")
    public final void method1072(int arg0, class468 arg1) {
        field2247++;
        while (true) {
            int var3 = arg1.method2765(arg0 ^ 0xFFFF9BCD);
            if (var3 == 0) {
                if (arg0 == -25666) {
                    return;
                } else {
                    this.field2226 = 23;
                    return;
                }
            }
            this.method1075(var3, arg1, -8102);
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V")
    public final void method1073(int arg0) {
        field2244++;
        if (arg0 <= 88) {
            this.method1075(41, null, -35);
        }
        this.field2228 = this.field2228 << 8 | this.field2226;
        if (this.field2231 == -1) {
            this.field2231 = this.field2240;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIILsh;IFFIIF[BFF)V")
    public static final void method1074(int arg0, int arg1, int arg2, class510 arg3, int arg4, float arg5, float arg6, int arg7, int arg8, float arg9, byte[] arg10, float arg11, float arg12) {
        field2233++;
        for (int var13 = arg0; var13 < arg2; var13++) {
            class154.method1108(arg2, arg6, var13, arg4, arg3, arg8, (byte) 110, arg5, arg10, arg12, arg1, arg11, arg7, arg9);
            arg1 += arg7 * arg8;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILgk;I)V")
    private final void method1075(int arg0, class468 arg1, int arg2) {
        if (arg2 != -8102) {
            return;
        }
        if (arg0 == 1) {
            this.field2232 = class310.method1930(arg2 ^ 0xFFFFE05A, arg1.method2759(1919914864));
        } else if (arg0 == 2) {
            this.field2240 = arg1.method2765(100);
        } else if (arg0 == 3) {
            this.field2240 = arg1.method2727((byte) 43);
            if (this.field2240 == 65535) {
                this.field2240 = -1;
            }
        } else if (arg0 == 5) {
            this.field2248 = false;
        } else if (arg0 == 7) {
            this.field2239 = class310.method1930(0, arg1.method2759(1919914864));
        } else if (arg0 == 8) {
            this.field2245.field7796 = this.field2226;
        } else if (arg0 == 9) {
            this.field2229 = arg1.method2727((byte) 43) << 0;
        } else if (arg0 == 10) {
            this.field2235 = false;
        } else if (arg0 == 11) {
            this.field2228 = arg1.method2765(86);
        } else if (arg0 == 12) {
            this.field2238 = true;
        } else if (arg0 == 13) {
            this.field2236 = arg1.method2759(1919914864);
        } else if (arg0 == 14) {
            this.field2246 = arg1.method2765(91) << 0;
        } else if (arg0 == 15) {
            this.field2231 = arg1.method2727((byte) 43);
            if (this.field2231 == 65535) {
                this.field2231 = -1;
            }
        } else if (arg0 == 16) {
            this.field2237 = arg1.method2765(82);
        }
        field2241++;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IZ)V")
    public static final void method1076(int arg0, boolean arg1) {
        if (arg1) {
            if (class256.field3477 != -1) {
                class79.method568(class256.field3477, (byte) 94);
            }
            for (class313 var2 = (class313) class312.field4840.method3061(arg0 ^ 0xFFFFBEF3); var2 != null; var2 = (class313) class312.field4840.method3066((byte) 125)) {
                if (!var2.method875(arg0 ^ 0xBC)) {
                    var2 = (class313) class312.field4840.method3061(-16817);
                    if (var2 == null) {
                        break;
                    }
                }
                class43.method336(true, var2, false, false);
            }
            class256.field3477 = -1;
            class312.field4840 = new class517(8);
            class130.method953((byte) 34);
            class256.field3477 = class100.field1525;
            class123.method914(false, true);
            class134.method988(-28945);
            class64.method445(class256.field3477);
        }
        field2243++;
        if (arg0 != 188) {
            method1070(null, null, false);
        }
        class209.field3010 = true;
    }
}
