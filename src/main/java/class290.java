import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class290 extends class205 implements class185 {

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "Lhs;")
    public class205 field4385;

    @OriginalMember(owner = "client!ks", name = "P", descriptor = "Lsk;")
    public static class423 field4401 = new class423("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!ks", name = "Q", descriptor = "[I")
    public static int[] field4402 = new int[14];

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!ks", name = "F", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!ks", name = "L", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ks", name = "N", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!ks", name = "O", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!ks", name = "R", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)I", line = 3)
    public final int method174(byte arg0) {
        field4393++;
        if (arg0 <= 113) {
            this.field4385 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lqq;ZI)Lcd;", line = 16)
    public final class198 method167(class318 arg0, boolean arg1, int arg2) {
        field4386++;
        if (arg1) {
            this.method163(43);
        }
        return null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILtq;II)V", line = 32)
    public static final void method1767(int arg0, class427 arg1, int arg2, int arg3) {
        if (arg1.field6205 == 0) {
            arg1.field6262 = arg1.field6207;
        } else if (arg1.field6205 == 1) {
            arg1.field6262 = (arg2 - arg1.field6175) / 2 + arg1.field6207;
        } else if (arg1.field6205 == 2) {
            arg1.field6262 = arg2 - arg1.field6175 - arg1.field6207;
        } else if (arg1.field6205 == 3) {
            arg1.field6262 = arg1.field6207 * arg2 >> 14;
        } else if (arg1.field6205 == 4) {
            arg1.field6262 = (arg1.field6207 * arg2 >> 14) + (arg2 - arg1.field6175) / 2;
        } else {
            arg1.field6262 = arg2 - arg1.field6175 - (arg1.field6207 * arg2 >> 14);
        }
        field4396++;
        if (arg1.field6215 == 0) {
            arg1.field6259 = arg1.field6263;
        } else if (arg1.field6215 == 1) {
            arg1.field6259 = (arg3 - arg1.field6126) / 2 + arg1.field6263;
        } else if (arg1.field6215 == 2) {
            arg1.field6259 = arg3 - arg1.field6126 - arg1.field6263;
        } else if (arg1.field6215 == 3) {
            arg1.field6259 = arg1.field6263 * arg3 >> 14;
        } else if (arg1.field6215 == 4) {
            arg1.field6259 = (arg3 - arg1.field6126) / 2 + (arg1.field6263 * arg3 >> 14);
        } else {
            arg1.field6259 = arg3 - arg1.field6126 - (arg1.field6263 * arg3 >> 14);
        }
        if (class483.field7373 && (client.method1176(arg1).field823 != 0 || arg1.field6197 == 0)) {
            if (arg1.field6259 < 0) {
                arg1.field6259 = 0;
            } else if (arg3 < (arg1.field6259 + arg1.field6126)) {
                arg1.field6259 = arg3 - arg1.field6126;
            }
            if (arg1.field6262 < 0) {
                arg1.field6262 = 0;
            } else if (arg1.field6262 + arg1.field6175 > arg2) {
                arg1.field6262 = arg2 - arg1.field6175;
            }
        }
        if (arg0 != 30789) {
            method1768(null, true);
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)I", line = 102)
    public final int method173(int arg0) {
        field4387++;
        if (arg0 != 1438) {
            this.field4385 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lqq;BII)Z", line = 114)
    public final boolean method162(class318 arg0, byte arg1, int arg2, int arg3) {
        field4395++;
        return arg1 != -44;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lqq;I)V", line = 127)
    public final void method171(class318 arg0, int arg1) {
        if (arg1 != 1577) {
            field4401 = null;
        }
        field4390++;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Z", line = 137)
    public final boolean method161(int arg0) {
        field4394++;
        return arg0 == 15275 ? false : false;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILqq;Lps;ZZII)V", line = 150)
    public final void method165(int arg0, class318 arg1, class59 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field4389++;
        if (!arg4) {
            method1769(90);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BLqq;)Lkm;", line = 162)
    public final class227 method169(byte arg0, class318 arg1) {
        field4388++;
        if (arg0 > -11) {
            this.method171(null, -14);
        }
        return null;
    }

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "(I)I", line = 174)
    public final int method333(int arg0) {
        if (arg0 != 0) {
            field4402 = null;
        }
        field4384++;
        return 0;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 185)
    public static final String method1768(String arg0, boolean arg1) {
        field4397++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var3 > var2 && class168.method1059(false, arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && class168.method1059(false, arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        if (arg1) {
            field4403 = -54;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class49.method346(25688, var7)) {
                char var8 = class297.method1799(var7, (byte) -113);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)I", line = 244)
    public final int method170(boolean arg0) {
        field4392++;
        if (!arg0) {
            field4401 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "(I)V", line = 256)
    public final void method168(int arg0) {
        field4398++;
        int var2 = 33 % ((arg0 + 53) / 62);
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V", line = 266)
    public final void method163(int arg0) {
        if (arg0 != 8793) {
            this.field4385 = null;
        }
        field4383++;
    }

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "(I)V", line = 277)
    public static void method1769(int arg0) {
        if (arg0 < -99) {
            field4402 = null;
            field4401 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)Z", line = 288)
    public final boolean method164(int arg0) {
        field4391++;
        if (arg0 != 0) {
            this.method170(false);
        }
        return false;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(ZLqq;)V", line = 299)
    public final void method172(boolean arg0, class318 arg1) {
        if (!arg0) {
            field4382++;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZLqq;)V", line = 309)
    public final void method176(boolean arg0, class318 arg1) {
        if (!arg0) {
            this.field4385 = null;
        }
        field4399++;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(IIIIIIIIIILhs;)V", line = 328)
    public class290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class205 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class121.method838(arg0, 0, arg1));
        this.field4385 = arg10;
    }
}
