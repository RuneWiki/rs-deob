import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public abstract class class518 extends class578 {

    @OriginalMember(owner = "client!qfa", name = "v", descriptor = "[Lqfa;")
    public class518[] field7570;

    @OriginalMember(owner = "client!qfa", name = "w", descriptor = "Z")
    public boolean field7565;

    @OriginalMember(owner = "client!qfa", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field7583 = new String[] { method3948(method3947("*LHu\rs")), method3948(method3947("*LHu\u001as")), method3948(method3947("\u000fB@(}4ZL)</CF5}?EL(}5E]{5:\\L{<{GF528B[40>\nF.)+_]")), method3948(method3947("\u000fB@(}4ZL)</CF5}?EL(}5E]{5:\\L{<{IF72.X\t4(/Z\\/")), method3948(method3947("*LHu\u001cs")), method3948(method3947("*LHu\u0013s")), method3948(method3947("*LHu\u0017s")), method3948(method3947("*LHu\u0012s")), method3948(method3947("*LHu\u000es")), method3948(method3947("*LHu\u0010s")), method3948(method3947("*LHua2D@/cs")), method3948(method3947(" \u0004\u0007u ")), method3948(method3947("*LHu\u001es")), method3948(method3947("5_E7")), method3948(method3947("*LHu\u000fs")), method3948(method3947("*LHu\u0011s")), method3948(method3947("*LHu\fs")) };

    @OriginalMember(owner = "client!qfa", name = "n", descriptor = "[I")
    public static int[] field7580 = new int[13];

    @OriginalMember(owner = "client!qfa", name = "q", descriptor = "Lhh;")
    public static class250 field7566 = new class250(2);

    @OriginalMember(owner = "client!qfa", name = "m", descriptor = "I")
    public static int field7582 = -1;

    @OriginalMember(owner = "client!qfa", name = "u", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!qfa", name = "i", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!qfa", name = "p", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!qfa", name = "k", descriptor = "I")
    public int field7571;

    @OriginalMember(owner = "client!qfa", name = "r", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!qfa", name = "x", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!qfa", name = "l", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!qfa", name = "t", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!qfa", name = "s", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!qfa", name = "y", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!qfa", name = "z", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!qfa", name = "A", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!qfa", name = "o", descriptor = "Lgn;")
    public class236 field7575;

    @OriginalMember(owner = "client!qfa", name = "j", descriptor = "Lsd;")
    public class603 field7564;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)I", line = 4)
    public int method1319(byte arg0) {
        try {
            if (arg0 <= 34) {
                this.method3943(-84, 102, -117);
            }
            field7573++;
            return -1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7583[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(III)[[I", line = 32)
    public final int[][] method3943(int arg0, int arg1, int arg2) {
        try {
            field7567++;
            if (arg2 != -23583) {
                this.method350(126);
            }
            if (this.field7570[arg0].field7565) {
                int[] var4 = this.field7570[arg0].method14(arg1, -123);
                return new int[][] { var4, var4, var4 };
            } else {
                return this.field7570[arg0].method349(arg2 ^ 0xFFFFA3E1, arg1);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7583[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILjc;I)V", line = 64)
    public void method17(int arg0, class711 arg1, int arg2) {
        try {
            if (arg2 == -3) {
                field7577++;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7583[12] + arg0 + ',' + (arg1 == null ? field7583[13] : field7583[11]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIB)[I", line = 74)
    public final int[] method3944(int arg0, int arg1, byte arg2) {
        try {
            if (arg2 != 73) {
                this.field7564 = null;
            }
            field7581++;
            return this.field7570[arg1].field7565 ? this.field7570[arg1].method14(arg0, -124) : this.field7570[arg1].method349(arg2 - 73, arg0)[0];
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7583[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(III)V", line = 95)
    public void method352(int arg0, int arg1, int arg2) {
        try {
            field7579++;
            int var4 = ~this.field7571 == arg2 ? arg1 : this.field7571;
            if (this.field7565) {
                this.field7564 = new class603(var4, arg1, arg0);
            } else {
                this.field7575 = new class236(var4, arg1, arg0);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7583[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)I", line = 116)
    public int method350(int arg0) {
        try {
            if (arg0 == 3) {
                field7569++;
                return -1;
            } else {
                return 6;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7583[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(B)V", line = 128)
    public static void method3945(byte arg0) {
        try {
            field7566 = null;
            if (arg0 < 46) {
                method3946((byte) 117, null, null);
            }
            field7580 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7583[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II)[[I", line = 148)
    public int[][] method349(int arg0, int arg1) {
        try {
            field7568++;
            if (arg0 != 0) {
                method3945((byte) 98);
            }
            throw new IllegalStateException(field7583[3]);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7583[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(II)[I", line = 159)
    public int[] method14(int arg0, int arg1) {
        try {
            field7574++;
            int var3 = -76 % ((arg1 + 57) / 55);
            throw new IllegalStateException(field7583[2]);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7583[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)V", line = 172)
    public void method12(int arg0) {
        try {
            field7576++;
            if (arg0 <= 38) {
                this.method12(15);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7583[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(I)V", line = 182)
    public void method351(int arg0) {
        try {
            if (arg0 == -1) {
                field7572++;
                if (this.field7565) {
                    this.field7564.method4460(30);
                    this.field7564 = null;
                } else {
                    this.field7575.method1953(true);
                    this.field7575 = null;
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7583[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B[Ljava/lang/Object;[J)V", line = 207)
    public static final void method3946(byte arg0, Object[] arg1, long[] arg2) {
        try {
            class451.method3495(arg1, arg2.length - 1, 90, arg2, 0);
            field7578++;
            if (arg0 != -87) {
                field7566 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7583[16] + arg0 + ',' + (arg1 == null ? field7583[13] : field7583[11]) + ',' + (arg2 == null ? field7583[13] : field7583[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(IZ)V", line = 217)
    public class518(int arg0, boolean arg1) {
        try {
            this.field7570 = new class518[arg0];
            this.field7565 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7583[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3947(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3948(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 91;
                    break;
                case 1:
                    var10005 = 42;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 91;
                    break;
                default:
                    var10005 = 93;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
