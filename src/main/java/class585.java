import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class585 {

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public int field8439 = 0;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Z")
    private boolean field8444 = false;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public int field8438 = 0;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8455 = new String[] { method4333(method4332("V\u0012Ca\u0000")), method4333(method4332("HPC\fU")), method4333(method4332("]\u000b\u0001N")), method4333(method4332("V\u0012C`\u0000")), method4333(method4332("V\u0012Cf\u0000")), method4333(method4332("V\u0012Cd\u0000")), method4333(method4332("V\u0012Cg\u0000")), method4333(method4332("V\u0012Cc\u0000")) };

    @OriginalMember(owner = "client!el", name = "o", descriptor = "[I")
    public static int[] field8435 = new int[4096];

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    private int field8436;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field8437;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public int field8440;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public int field8441;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field8442;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public int field8445;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public int field8446;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public int field8447;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field8448;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field8449;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public int field8450;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public int field8452;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public int field8453;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public int field8454;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "J")
    public long field8451;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field8435[var0] = class796.method5740(-50, var0);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BLjc;I)V", line = 3)
    private final void method4326(byte arg0, class711 arg1, int arg2) {
        try {
            if (arg2 == 1) {
                this.field8436 = arg1.method5116((byte) -117);
            } else if (arg2 == 2) {
                arg1.method5128(0);
            } else if (arg2 == 3) {
                this.field8452 = arg1.method5113(18443);
                this.field8450 = arg1.method5113(18443);
                this.field8453 = arg1.method5113(18443);
            } else if (arg2 == 4) {
                this.field8454 = arg1.method5128(0);
                this.field8447 = arg1.method5113(arg0 + 18505);
            } else if (arg2 == 6) {
                this.field8440 = arg1.method5128(0);
            } else if (arg2 == 8) {
                this.field8438 = 1;
            } else if (arg2 == 9) {
                this.field8439 = 1;
            } else if (arg2 == 10) {
                this.field8444 = true;
            }
            if (arg0 == -62) {
                field8448++;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8455[3] + arg0 + ',' + (arg1 == null ? field8455[2] : field8455[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V", line = 65)
    public final void method4327(boolean arg0) {
        try {
            this.field8446 = class487.field7150[this.field8436 << 3];
            field8437++;
            long var2 = (long) this.field8452;
            if (arg0) {
                this.field8436 = -124;
            }
            long var4 = (long) this.field8450;
            long var6 = (long) this.field8453;
            this.field8445 = (int) Math.sqrt((double) (var6 * var6 + var2 * var2 + var4 * var4));
            if (this.field8447 == 0) {
                this.field8447 = 1;
            }
            if (this.field8454 == 0) {
                this.field8451 = 2147483647L;
            } else if (this.field8454 == 1) {
                this.field8451 = (this.field8445 * 8 / this.field8447);
                this.field8451 *= this.field8451;
            } else if (this.field8454 == 2) {
                this.field8451 = (this.field8445 * 8 / this.field8447);
            }
            if (this.field8444) {
                this.field8445 *= -1;
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field8455[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 125)
    public static void method4328(byte arg0) {
        try {
            if (arg0 > -55) {
                field8435 = null;
            }
            field8435 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8455[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Z", line = 151)
    public static final boolean method4329(int arg0, int arg1, int arg2) {
        try {
            field8449++;
            if (arg0 != 0) {
                field8435 = null;
            }
            return (arg2 & 0x10) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8455[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjc;)V", line = 162)
    public final void method4330(int arg0, class711 arg1) {
        try {
            while (true) {
                int var3 = arg1.method5128(0);
                if (var3 == 0) {
                    field8443++;
                    if (arg0 != -6622) {
                        this.field8446 = -59;
                        return;
                    }
                    return;
                }
                this.method4326((byte) -62, arg1, var3);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8455[5] + arg0 + ',' + (arg1 == null ? field8455[2] : field8455[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIZZ)V", line = 183)
    public static final void method4331(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        try {
            class761.method5514((byte) -63);
            if (!arg3) {
                method4328((byte) 80);
            }
            field8442++;
            class527.field7669 = 0L;
            int var5 = class680.method4883(26);
            if (arg2 == 3 || var5 == 3) {
                arg4 = true;
            }
            if (!class236.field3418.method216()) {
                arg4 = true;
            }
            class144.method1247(var5, arg4, arg0, arg1, -24334, arg2);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8455[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!el", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4332(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x28);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!el", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4333(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 126;
                    break;
                case 2:
                    var10005 = 109;
                    break;
                case 3:
                    var10005 = 34;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
