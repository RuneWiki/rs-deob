import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class466 {

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public int field7143 = 0;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "Z")
    public boolean field7151 = false;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public int field7149 = 64;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public int field7145 = 8;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Z")
    public boolean field7147 = true;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public int field7162 = 1190717;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public int field7157 = 127;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public int field7161 = -1;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public int field7160 = -1;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Z")
    public boolean field7155 = true;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public int field7163 = 512;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7164 = new String[] { method3604(method3603("?Vg\u001b;")), method3604(method3603("*\r%Y")), method3604(method3603(".\u001bgsn")), method3604(method3603(".\u001bgtn")), method3604(method3603(".\u001bgvn")), method3604(method3603(".\u001bgwn")), method3604(method3603(".\u001bgqn")), method3604(method3603(".\u001bgrn")), method3604(method3603(".\u001bgpn")) };

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field7144 = -1;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public int field7146;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Lgv;")
    public class87 field7156;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lrba;ILrba;)V")
    public static final void method3596(class459 arg0, int arg1, class459 arg2) {
        try {
            field7153++;
            if (arg0.field7073 != null) {
                arg0.method3558((byte) 125);
            }
            if (arg1 != 2) {
                method3596(null, 105, null);
            }
            arg0.field7074 = arg2;
            arg0.field7073 = arg2.field7073;
            arg0.field7073.field7074 = arg0;
            arg0.field7074.field7073 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7164[6] + (arg0 == null ? field7164[1] : field7164[0]) + ',' + arg1 + ',' + (arg2 == null ? field7164[1] : field7164[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public final void method3597(byte arg0) {
        try {
            if (arg0 == -86) {
                this.field7145 = this.field7146 | this.field7145 << 8;
                field7152++;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7164[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
    public static final int method3598(int arg0) {
        try {
            field7148++;
            if (arg0 != 1) {
                method3599(-6, -90, 6, 11, -46);
            }
            if (class82.field1247 == null) {
                return class149.field2090 ? 2 : 1;
            } else {
                return 3;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7164[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII)V")
    public static final void method3599(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            int var5 = -110 / ((65 - arg1) / 58);
            if (arg4 >= class546.field8030 && arg4 <= class779.field11374) {
                int var9 = class694.method5039(class478.field7264, class310.field5088, 0, arg3);
                int var8 = class694.method5039(class478.field7264, class310.field5088, 0, arg0);
                class221.method1954(arg4, arg2, var9, 31983, var8);
            }
            field7154++;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7164[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBLwq;)V")
    private final void method3600(int arg0, byte arg1, class176 arg2) {
        try {
            if (arg0 == 1) {
                this.field7143 = class300.method2586(16711935, arg2.method1685(false));
            } else if (arg0 == 2) {
                this.field7160 = arg2.method1645((byte) -104);
            } else if (arg0 == 3) {
                this.field7160 = arg2.method1687((byte) -85);
                if (this.field7160 == 65535) {
                    this.field7160 = -1;
                }
            } else if (arg0 == 5) {
                this.field7147 = false;
            } else if (arg0 == 7) {
                this.field7161 = class300.method2586(16711935, arg2.method1685(false));
            } else if (arg0 == 8) {
                this.field7156.field1301 = this.field7146;
            } else if (arg0 == 9) {
                this.field7163 = arg2.method1687((byte) -89) << 2;
            } else if (arg0 == 10) {
                this.field7155 = false;
            } else if (arg0 == 11) {
                this.field7145 = arg2.method1645((byte) -98);
            } else if (arg0 == 12) {
                this.field7151 = true;
            } else if (arg0 == 13) {
                this.field7162 = arg2.method1685(false);
            } else if (arg0 == 14) {
                this.field7149 = arg2.method1645((byte) -106) << 2;
            } else if (arg0 == 16) {
                this.field7157 = arg2.method1645((byte) -103);
            }
            field7158++;
            if (arg1 != -66) {
                this.method3597((byte) -120);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7164[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7164[1] : field7164[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILwq;)V")
    public final void method3601(int arg0, class176 arg1) {
        try {
            while (true) {
                int var3 = arg1.method1645((byte) -106);
                if (var3 == 0) {
                    if (arg0 >= -8) {
                        return;
                    }
                    field7159++;
                    return;
                }
                this.method3600(var3, (byte) -66, arg1);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7164[8] + arg0 + ',' + (arg1 == null ? field7164[1] : field7164[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILjava/lang/Object;IB)[B")
    public static final byte[] method3602(int arg0, Object arg1, int arg2, byte arg3) {
        try {
            field7142++;
            if (arg1 == null) {
                return null;
            } else if (arg1 instanceof byte[]) {
                byte[] var4 = (byte[]) arg1;
                return class73.method766(0, arg2, arg0, var4);
            } else if (arg1 instanceof class129) {
                class129 var5 = (class129) arg1;
                return var5.method38(arg2, (byte) -46, arg0);
            } else {
                if (arg3 != 51) {
                    method3599(121, -3, 99, 79, -67);
                }
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7164[3] + arg0 + ',' + (arg1 == null ? field7164[1] : field7164[0]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3603(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x46);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3604(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 68;
                    break;
                case 1:
                    var10005 = 120;
                    break;
                case 2:
                    var10005 = 73;
                    break;
                case 3:
                    var10005 = 53;
                    break;
                default:
                    var10005 = 70;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
