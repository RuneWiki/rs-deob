import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public class class776 {

    @OriginalMember(owner = "client!kka", name = "e", descriptor = "Z")
    private boolean field11060 = false;

    @OriginalMember(owner = "client!kka", name = "n", descriptor = "I")
    private int field11062 = -1;

    @OriginalMember(owner = "client!kka", name = "l", descriptor = "[Ljava/lang/String;")
    private String[] field11069 = new String[0];

    @OriginalMember(owner = "client!kka", name = "m", descriptor = "I")
    private int field11064;

    @OriginalMember(owner = "client!kka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11072 = new String[] { method5594(method5593("G@\u007f\\8\u0004")), method5594(method5593("W\u00050\\\r")), method5594(method5593("B^r\u001e")), method5594(method5593("G@\u007f\\1\u0004")), method5594(method5593("G@\u007f\\3\u0004")), method5594(method5593("G@\u007f\\6\u0004")), method5594(method5593("G@\u007f\\2\u0004")), method5594(method5593("G@\u007f\\5\u0004")), method5594(method5593("G@\u007f\\4\u0004")), method5594(method5593("G@\u007f\\LEEw\u0006N\u0004")), method5594(method5593("G@\u007f\\7\u0004")), method5594(method5593("G@\u007f\\\u0004Cxj\u0000\u0019BL6")), method5594(method5593("\u0000\u000b")) };

    @OriginalMember(owner = "client!kka", name = "c", descriptor = "I")
    public static int field11058;

    @OriginalMember(owner = "client!kka", name = "h", descriptor = "I")
    public static int field11059;

    @OriginalMember(owner = "client!kka", name = "j", descriptor = "I")
    public static int field11063;

    @OriginalMember(owner = "client!kka", name = "k", descriptor = "I")
    public static int field11065;

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "I")
    public static int field11066;

    @OriginalMember(owner = "client!kka", name = "d", descriptor = "I")
    public static int field11067;

    @OriginalMember(owner = "client!kka", name = "f", descriptor = "I")
    public static int field11068;

    @OriginalMember(owner = "client!kka", name = "b", descriptor = "I")
    public static int field11070;

    @OriginalMember(owner = "client!kka", name = "i", descriptor = "Llga;")
    public static class47 field11061;

    @OriginalMember(owner = "client!kka", name = "g", descriptor = "[I")
    public static int[] field11071;

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(B)V")
    public static void method5585(byte arg0) {
        try {
            field11061 = null;
            int var1 = 15 / ((arg0 + 80) / 39);
            field11071 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11072[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(Ljc;I)Ltc;")
    public static final class177 method5586(class711 arg0, int arg1) {
        try {
            if (arg1 >= -105) {
                method5592(null, (byte) -55);
            }
            field11065++;
            return new class177(arg0.method5087((byte) -26), arg0.method5087((byte) -26), arg0.method5087((byte) -26), arg0.method5087((byte) -26), arg0.method5085(true), arg0.method5128(0));
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11072[5] + (arg0 == null ? field11072[2] : field11072[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(II)V")
    private final void method5587(int arg0, int arg1) {
        try {
            field11070++;
            String[] var3 = new String[this.method5591(arg1, 98)];
            class569.method4246(this.field11069, 0, var3, 0, this.field11069.length);
            this.field11069 = var3;
            if (arg0 <= 78) {
                this.method5589(null, -11, 11);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11072[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(I)[Ljava/lang/String;")
    public final String[] method5588(int arg0) {
        try {
            field11067++;
            String[] var2 = new String[this.field11062 + 1];
            class569.method4246(this.field11069, 0, var2, arg0, this.field11062 + 1);
            return var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11072[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(Ljava/lang/String;II)V")
    private final void method5589(String arg0, int arg1, int arg2) {
        try {
            field11058++;
            if (arg2 > this.field11062) {
                this.field11062 = arg2;
            }
            if (this.field11069.length <= arg2) {
                this.method5587(119, arg2);
            }
            this.field11069[arg2] = arg0;
            if (arg1 != 0) {
                this.toString();
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11072[3] + (arg0 == null ? field11072[2] : field11072[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method5590(byte arg0, String arg1) {
        try {
            if (arg0 < 85) {
                this.toString();
            }
            this.method5589(arg1, 0, this.field11062 + 1);
            field11063++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11072[8] + arg0 + ',' + (arg1 == null ? field11072[2] : field11072[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!kka", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field11068++;
            StringBuffer var1 = new StringBuffer();
            var1.append("[");
            for (int var2 = 0; var2 < this.field11062; var2++) {
                if (var2 != 0) {
                    var1.append(field11072[12]);
                }
                var1.append(this.field11069[var2]);
            }
            var1.append("]");
            return var1.toString();
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11072[11] + ')');
        }
    }

    @OriginalMember(owner = "client!kka", name = "b", descriptor = "(II)I")
    private final int method5591(int arg0, int arg1) {
        try {
            if (arg1 < 69) {
                this.method5591(-66, 61);
            }
            field11066++;
            int var3 = this.field11069.length;
            while (var3 <= arg0) {
                if (!this.field11060) {
                    var3 += this.field11064;
                } else if (var3 == 0) {
                    var3 = 1;
                } else {
                    var3 = this.field11064 * var3;
                }
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11072[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(Ljc;B)Lsm;")
    public static final class598 method5592(class711 arg0, byte arg1) {
        try {
            if (arg1 == -91) {
                field11059++;
                class427 var2 = class184.method1521(-8821, arg0);
                int var3 = arg0.method5087((byte) -26);
                return new class598(var2.field10540, var2.field10539, var2.field10542, var2.field10547, var2.field10543, var2.field10541, var2.field10544, var2.field10545, var2.field10548, var2.field6151, var2.field6147, var2.field6148, var2.field6144, var2.field6143, var2.field6142, var3);
            } else {
                return null;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11072[10] + (arg0 == null ? field11072[2] : field11072[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kka", name = "<init>", descriptor = "(IZ)V")
    public class776(int arg0, boolean arg1) {
        try {
            this.field11064 = arg0;
            this.field11060 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11072[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5593(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x70);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5594(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 44;
                    break;
                case 1:
                    var10005 = 43;
                    break;
                case 2:
                    var10005 = 30;
                    break;
                case 3:
                    var10005 = 114;
                    break;
                default:
                    var10005 = 112;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
