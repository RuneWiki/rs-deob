import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public class class324 {

    @OriginalMember(owner = "client!dja", name = "i", descriptor = "[Ljava/lang/String;")
    private String[] field5259 = new String[0];

    @OriginalMember(owner = "client!dja", name = "e", descriptor = "Z")
    private boolean field5253 = false;

    @OriginalMember(owner = "client!dja", name = "m", descriptor = "I")
    private int field5261 = -1;

    @OriginalMember(owner = "client!dja", name = "j", descriptor = "I")
    private int field5258;

    @OriginalMember(owner = "client!dja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5263 = new String[] { method2755(method2754("\nc")), method2755(method2754("B)l\u0000\bI\u0010y\\\u0015H$%")), method2755(method2754("B)l\u0000?\u000e")), method2755(method2754("B)l\u00009\u000e")), method2755(method2754("B)l\u0000>\u000e")), method2755(method2754("]m#\u0000\u0001")), method2755(method2754("H6aB")), method2755(method2754("B)l\u0000;\u000e")), method2755(method2754("B)l\u0000@O-dZB\u000e")), method2755(method2754("B)l\u0000:\u000e")), method2755(method2754("B)l\u00008\u000e")) };

    @OriginalMember(owner = "client!dja", name = "k", descriptor = "Lqr;")
    public static class69 field5256 = new class69(16);

    @OriginalMember(owner = "client!dja", name = "g", descriptor = "I")
    public static int field5262 = 0;

    @OriginalMember(owner = "client!dja", name = "n", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!dja", name = "c", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!dja", name = "f", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!dja", name = "b", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!dja", name = "h", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!dja", name = "d", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!dja", name = "l", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "[Lhk;")
    public static class107[] field5254;

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 5)
    private final void method2747(int arg0, String arg1, boolean arg2) {
        try {
            if (arg0 > this.field5261) {
                this.field5261 = arg0;
            }
            field5257++;
            if (this.field5259.length <= arg0) {
                this.method2752(arg0, 30165);
            }
            this.field5259[arg0] = arg1;
            if (!arg2) {
                method2753(-96, 43, -78, null);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5263[10] + arg0 + ',' + (arg1 == null ? field5263[6] : field5263[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(II)I", line = 27)
    private final int method2748(int arg0, int arg1) {
        try {
            field5250++;
            if (arg1 != -1) {
                return -76;
            }
            int var3 = this.field5259.length;
            while (arg0 >= var3) {
                if (!this.field5253) {
                    var3 += this.field5258;
                } else if (var3 == 0) {
                    var3 = 1;
                } else {
                    var3 = this.field5258 * var3;
                }
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5263[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dja", name = "toString", descriptor = "()Ljava/lang/String;", line = 57)
    public final String toString() {
        try {
            field5255++;
            StringBuffer var1 = new StringBuffer();
            var1.append("[");
            for (int var2 = 0; var2 < this.field5261; var2++) {
                if (var2 != 0) {
                    var1.append(field5263[0]);
                }
                var1.append(this.field5259[var2]);
            }
            var1.append("]");
            return var1.toString();
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5263[1] + ')');
        }
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(BLjava/lang/String;)V", line = 83)
    public final void method2749(byte arg0, String arg1) {
        try {
            field5252++;
            this.method2747(this.field5261 + 1, arg1, true);
            if (arg0 != -43) {
                this.field5253 = false;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5263[4] + arg0 + ',' + (arg1 == null ? field5263[6] : field5263[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)[Ljava/lang/String;", line = 96)
    public final String[] method2750(int arg0) {
        try {
            if (arg0 > -86) {
                this.field5261 = -97;
            }
            field5260++;
            String[] var2 = new String[this.field5261 + 1];
            class405.method3255(this.field5259, 0, var2, 0, this.field5261 + 1);
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5263[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dja", name = "b", descriptor = "(I)V", line = 110)
    public static void method2751(int arg0) {
        try {
            if (arg0 != 0) {
                field5262 = -126;
            }
            field5256 = null;
            field5254 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5263[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dja", name = "b", descriptor = "(II)V", line = 125)
    private final void method2752(int arg0, int arg1) {
        try {
            field5249++;
            if (arg1 == 30165) {
                String[] var3 = new String[this.method2748(arg0, -1)];
                class405.method3255(this.field5259, 0, var3, 0, this.field5259.length);
                this.field5259 = var3;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5263[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 141)
    public static final void method2753(int arg0, int arg1, int arg2, Class arg3) {
        class290 var4 = class85.field1280[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class135 var5 = var4.field4670; var5 != null; var5 = var5.field1912) {
            class185 var6 = var5.field1911;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field2945 == arg1 && var6.field2946 == arg2) {
                class165.method1553(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(IZ)V", line = 192)
    public class324(int arg0, boolean arg1) {
        try {
            this.field5258 = arg0;
            this.field5253 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5263[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2754(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2755(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 38;
                    break;
                case 1:
                    var10005 = 67;
                    break;
                case 2:
                    var10005 = 13;
                    break;
                case 3:
                    var10005 = 46;
                    break;
                default:
                    var10005 = 124;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
