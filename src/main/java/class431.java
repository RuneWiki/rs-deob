import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class431 extends class497 {

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6254 = new String[] { method3360(method3359("^83H9")), method3360(method3359("^83M9")), method3360(method3359("^83L9")), method3360(method3359("^83B9")), method3360(method3359("^83O9")), method3360(method3359("^83N9")), method3360(method3359("^83C9")), method3360(method3359("^83I9")), method3360(method3359("^83J9")) };

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "[I")
    public static int[] field6253 = new int[1];

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)V", line = 5)
    public static final void method3354(byte arg0) {
        try {
            ++field6248;
            if (class499.field7298 != null) {
                class499.field7298.method3429((byte) -22);
            }
            if (arg0 < 80) {
                method3354((byte) 70);
            }
            if (class591.field8505 != null) {
                class591.field8505.method3429((byte) -22);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6254[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V", line = 24)
    public final void method1031(byte arg0) {
        try {
            ++field6252;
            if (super.field7292 < 0 && ~super.field7292 < -5) {
                super.field7292 = this.method1032(-106);
            }
            if (arg0 > -70) {
                this.method1030(-95, 64);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6254[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lpp;)V", line = 39)
    public class431(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)I", line = 42)
    public static final int method3355(int arg0) {
        try {
            if (arg0 < 73) {
                method3356(-75, (byte) 66);
            }
            ++field6251;
            return class323.field4404;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6254[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)I", line = 54)
    public final int method1029(byte arg0, int arg1) {
        try {
            ++field6245;
            if (arg0 != -73) {
                field6253 = null;
            }
            return 1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6254[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)V", line = 65)
    public static final void method3356(int arg0, byte arg1) {
        try {
            ++field6249;
            if (arg1 < -83) {
                class294 var2 = class146.method1261((long) arg0, -62, 7);
                var2.method2376(124);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6254[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(ILpp;)V", line = 78)
    public class431(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)I", line = 81)
    public final int method1032(int arg0) {
        try {
            ++field6246;
            if (super.field7293.method4675((byte) -116).method274(-665543870) > 1) {
                return 4;
            } else {
                if (arg0 > -101) {
                    this.method3357(-118);
                }
                return 2;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6254[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(I)I", line = 97)
    public final int method3357(int arg0) {
        try {
            if (arg0 != 3) {
                this.method1031((byte) 1);
            }
            ++field6247;
            return super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6254[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)V", line = 110)
    public static void method3358(int arg0) {
        try {
            field6253 = null;
            if (arg0 != 1) {
                field6253 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6254[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V", line = 120)
    public final void method1030(int arg0, int arg1) {
        try {
            super.field7292 = arg1;
            ++field6250;
            if (arg0 != 64) {
                field6253 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6254[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3359(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3360(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 44;
                    break;
                case 1:
                    var10005 = 86;
                    break;
                case 2:
                    var10005 = 29;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
