import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class27 extends class578 {

    @OriginalMember(owner = "client!aca", name = "C", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "client!aca", name = "j", descriptor = "Z")
    private boolean field339;

    @OriginalMember(owner = "client!aca", name = "F", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client!aca", name = "y", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client!aca", name = "t", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "client!aca", name = "v", descriptor = "I")
    private int field340;

    @OriginalMember(owner = "client!aca", name = "l", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "client!aca", name = "A", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client!aca", name = "G", descriptor = "Z")
    private boolean field328;

    @OriginalMember(owner = "client!aca", name = "p", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!aca", name = "o", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!aca", name = "m", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "client!aca", name = "H", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "client!aca", name = "E", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "client!aca", name = "k", descriptor = "Ljava/lang/String;")
    private String field341;

    @OriginalMember(owner = "client!aca", name = "i", descriptor = "Ljava/lang/String;")
    private String field338;

    @OriginalMember(owner = "client!aca", name = "u", descriptor = "Ljava/lang/String;")
    private String field332;

    @OriginalMember(owner = "client!aca", name = "D", descriptor = "Ljava/lang/String;")
    private String field329;

    @OriginalMember(owner = "client!aca", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field354 = new String[] { method311(method310("pI\u0014\u001e;9")), method311(method310("\u007f_\u0019\\")), method311(method310("j\u0004[\u001e\u0007")), method311(method310("'\u0004D")), method311(method310("%\u0004L")), method311(method310(" \u001a[\u0007")), method311(method310("$\u0004D")), method311(method310(" \u001a[\u0004")), method311(method310("'\u0004E")), method311(method310(" \u001a[\u0005")), method311(method310("pZ\u0005\\\u001f")), method311(method310("fC\u001b")), method311(method310("pG\u0011\u0006N")), method311(method310("|K\u0016")), method311(method310("pI\u0014\u001eFxD\u001cDD9")), method311(method310("i\u0012CoL%")), method311(method310("%\u0004E")), method311(method310("b_\u001b")), method311(method310(" \u001a[\u0006")), method311(method310("}C\u001bE\u0002")), method311(method310("$\u0004E")), method311(method310("|C\u0016B\u0015bE\u0013D")), method311(method310("%\u0004D")), method311(method310("pI\u0014\u001e89")), method311(method310("pI\u0014\u001e99")), method311(method310("pI\u0014\u001e>9")) };

    @OriginalMember(owner = "client!aca", name = "q", descriptor = "I")
    public static int field345 = -1;

    @OriginalMember(owner = "client!aca", name = "n", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!aca", name = "w", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!aca", name = "s", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client!aca", name = "B", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client!aca", name = "x", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)I", line = 5)
    public final int method306(boolean arg0) {
        try {
            field352++;
            if (arg0) {
                return 34;
            }
            byte var2 = 23;
            int var3 = var2 + class236.method1954(-113, this.field341);
            int var4 = var3 + class236.method1954(-127, this.field329);
            int var5 = var4 + class236.method1954(-125, this.field332);
            return var5 + class236.method1954(-126, this.field338);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field354[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)I", line = 24)
    public static final int method307(int arg0, int arg1) {
        try {
            field330++;
            if (arg0 != 127) {
                method307(-17, 64);
            }
            return arg1 & 0x7F;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field354[24] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V", line = 44)
    private final void method308(int arg0) {
        try {
            field331++;
            if (this.field341.length() > 40) {
                this.field341 = this.field341.substring(0, 40);
            }
            if (this.field329.length() > 40) {
                this.field329 = this.field329.substring(0, 40);
            }
            if (this.field332.length() > 10) {
                this.field332 = this.field332.substring(0, 10);
            }
            if (this.field338.length() > 10) {
                this.field338 = this.field338.substring(0, 10);
            }
            if (arg0 != 2173) {
                this.method306(true);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field354[25] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILjc;)V", line = 77)
    public final void method309(int arg0, class711 arg1) {
        try {
            arg1.method5114(255, 5);
            field335++;
            arg1.method5114(255, this.field346);
            arg1.method5114(255, this.field339 ? 1 : 0);
            arg1.method5114(arg0 + 255, this.field353);
            arg1.method5114(255, this.field343);
            arg1.method5114(255, this.field350);
            arg1.method5114(255, this.field340);
            arg1.method5114(255, this.field342);
            arg1.method5114(255, this.field328 ? 1 : 0);
            arg1.method5138((byte) -99, this.field344);
            if (arg0 != 0) {
                this.field328 = false;
            }
            arg1.method5114(255, this.field348);
            arg1.method5107(this.field337, true);
            arg1.method5138((byte) -124, this.field349);
            arg1.method5114(255, this.field351);
            arg1.method5114(255, this.field336);
            arg1.method5114(255, this.field334);
            arg1.method5133((byte) -103, this.field341);
            arg1.method5133((byte) -114, this.field329);
            arg1.method5133((byte) -126, this.field332);
            arg1.method5133((byte) -117, this.field338);
            arg1.method5114(arg0 + 255, this.field347);
            arg1.method5138((byte) -116, this.field333);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field354[0] + arg0 + ',' + (arg1 == null ? field354[1] : field354[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "()V", line = 120)
    public class27() {
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(ZLft;)V", line = 123)
    public class27(boolean arg0, class188 arg1) {
        try {
            if (arg0) {
                if (class188.field2485.startsWith(field354[11])) {
                    this.field346 = 1;
                } else if (class188.field2485.startsWith(field354[13])) {
                    this.field346 = 2;
                } else if (class188.field2485.startsWith(field354[19])) {
                    this.field346 = 3;
                } else {
                    this.field346 = 4;
                }
                if (class188.field2481.startsWith(field354[12]) || class188.field2481.startsWith(field354[15])) {
                    this.field339 = true;
                } else {
                    this.field339 = false;
                }
                if (this.field346 == 1) {
                    if (class188.field2478.indexOf(field354[16]) != -1) {
                        this.field353 = 1;
                    } else if (class188.field2478.indexOf(field354[22]) != -1) {
                        this.field353 = 2;
                    } else if (class188.field2478.indexOf(field354[4]) != -1) {
                        this.field353 = 3;
                    } else if (class188.field2478.indexOf(field354[20]) != -1) {
                        this.field353 = 4;
                    } else if (class188.field2478.indexOf(field354[6]) != -1) {
                        this.field353 = 5;
                    } else if (class188.field2478.indexOf(field354[8]) != -1) {
                        this.field353 = 6;
                    } else if (class188.field2478.indexOf(field354[3]) != -1) {
                        this.field353 = 7;
                    }
                } else if (this.field346 == 2) {
                    if (class188.field2478.indexOf(field354[7]) != -1) {
                        this.field353 = 20;
                    } else if (class188.field2478.indexOf(field354[9]) != -1) {
                        this.field353 = 21;
                    } else if (class188.field2478.indexOf(field354[18]) != -1) {
                        this.field353 = 22;
                    } else if (class188.field2478.indexOf(field354[5]) != -1) {
                        this.field353 = 23;
                    }
                }
                if (class188.field2488.toLowerCase().indexOf(field354[17]) != -1) {
                    this.field343 = 1;
                } else if (class188.field2488.toLowerCase().indexOf(field354[21]) != -1) {
                    this.field343 = 2;
                } else if (class188.field2488.toLowerCase().indexOf(field354[10]) == -1) {
                    this.field343 = 4;
                } else {
                    this.field343 = 3;
                }
                int var3 = 2;
                int var4 = 0;
                try {
                    while (class188.field2487.length() > var3) {
                        char var5 = class188.field2487.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 + var5 - 48;
                        var3++;
                    }
                } catch (Exception var17) {
                }
                this.field350 = var4;
                int var6 = class188.field2487.indexOf(46, 2) + 1;
                int var7 = 0;
                try {
                    while (class188.field2487.length() > var6) {
                        char var8 = class188.field2487.charAt(var6);
                        if (var8 < '0' || var8 > '9') {
                            break;
                        }
                        var7 = var7 * 10 - (48 - var8);
                        var6++;
                    }
                } catch (Exception var16) {
                }
                this.field340 = var7;
                int var9 = 0;
                int var10 = class188.field2487.indexOf(95, 4) + 1;
                try {
                    while (class188.field2487.length() > var10) {
                        char var11 = class188.field2487.charAt(var10);
                        if (var11 < '0' || var11 > '9') {
                            break;
                        }
                        var10++;
                        var9 = var9 * 10 + (var11 - '0');
                    }
                } catch (Exception var15) {
                }
                if (this.field350 > 3) {
                    this.field348 = class648.field9208;
                } else {
                    this.field348 = 0;
                }
                this.field344 = class342.field4980;
                if (arg1.field2479) {
                    this.field328 = false;
                } else {
                    this.field328 = true;
                }
                this.field342 = var9;
                try {
                    int[] var12 = HardwareInfo.getCPUInfo();
                    if (var12 != null && var12.length == 7) {
                        this.field334 = var12[5];
                        this.field337 = var12[6];
                        this.field349 = var12[2];
                        this.field336 = var12[4];
                        this.field351 = var12[3];
                    }
                } catch (Throwable var14) {
                    this.field337 = 0;
                }
            }
            if (this.field341 == null) {
                this.field341 = "";
            }
            if (this.field338 == null) {
                this.field338 = "";
            }
            if (this.field332 == null) {
                this.field332 = "";
            }
            if (this.field329 == null) {
                this.field329 = "";
            }
            this.method308(2173);
        } catch (RuntimeException var18) {
            throw class665.method4799(var18, field354[14] + arg0 + ',' + (arg1 == null ? field354[1] : field354[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method310(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method311(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 17;
                    break;
                case 1:
                    var10005 = 42;
                    break;
                case 2:
                    var10005 = 117;
                    break;
                case 3:
                    var10005 = 48;
                    break;
                default:
                    var10005 = 122;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
