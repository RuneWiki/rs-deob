import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class384 {

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "Liha;")
    private class29 field6157 = new class29(64);

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "Liha;")
    public class29 field6172 = new class29(50);

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "Liha;")
    public class29 field6173 = new class29(5);

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "Z")
    public boolean field6159;

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "Lpo;")
    public class585 field6170;

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "Lgda;")
    public class58 field6167;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "Lgda;")
    private class58 field6168;

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6175 = new String[] { method3144(method3143("\u0012\u0000\\]S")), method3144(method3143("\u0012\u0000\\TS")), method3144(method3143("\u0012\u0000\\US")), method3144(method3143("\t\u0003\u001e{")), method3144(method3143("\u001cX\\9\u0006")), method3144(method3143("\u0012\u0000\\PS")), method3144(method3143("\u0012\u0000\\VS")), method3144(method3143("\u0012\u0000\\^S")), method3144(method3143("\u0012\u0000\\SS")), method3144(method3143("\u0012\u0000\\+\u0012\t\u001f\u0006)S")), method3144(method3143("\u0012\u0000\\QS")), method3144(method3143("\u0012\u0000\\_S")), method3144(method3143("\u0012\u0000\\RS")) };

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "[[I")
    public static int[][] field6161 = new int[128][128];

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "I")
    public int field6174;

    @OriginalMember(owner = "client!uv", name = "s", descriptor = "Z")
    public static boolean field6160;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)V", line = 3)
    public static void method3133(byte arg0) {
        try {
            field6161 = null;
            if (arg0 > -110) {
                method3138(-41);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6175[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZB)V", line = 14)
    public final void method3134(boolean arg0, byte arg1) {
        try {
            field6164++;
            if (this.field6159 != arg0) {
                if (arg1 != -93) {
                    method3133((byte) 9);
                }
                this.field6159 = arg0;
                this.method3139((byte) -20);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6175[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V", line = 29)
    public final void method3135(int arg0) {
        try {
            field6171++;
            class29 var2 = this.field6157;
            synchronized (this.field6157) {
                this.field6157.method298(5);
            }
            class29 var3 = this.field6172;
            synchronized (this.field6172) {
                if (arg0 != -1) {
                    this.field6167 = null;
                }
                this.field6172.method298(5);
            }
            class29 var4 = this.field6173;
            synchronized (this.field6173) {
                this.field6173.method298(arg0 + 6);
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field6175[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)V", line = 53)
    public final void method3136(int arg0) {
        try {
            class29 var2 = this.field6172;
            synchronized (this.field6172) {
                this.field6172.method304(1);
            }
            field6156++;
            class29 var3 = this.field6173;
            synchronized (this.field6173) {
                if (arg0 != 1744) {
                    this.method3139((byte) 66);
                }
                this.field6173.method304(1);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6175[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)V", line = 70)
    public final void method3137(int arg0, int arg1) {
        try {
            field6158++;
            this.field6174 = arg0;
            class29 var3 = this.field6172;
            synchronized (this.field6172) {
                if (arg1 != -10006) {
                    this.field6170 = null;
                }
                this.field6172.method304(1);
            }
            class29 var4 = this.field6173;
            synchronized (this.field6173) {
                this.field6173.method304(arg1 ^ 0xFFFFD8EB);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field6175[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)Z", line = 90)
    public static final boolean method3138(int arg0) {
        try {
            if (arg0 != 0) {
                method3133((byte) -118);
            }
            class142.field2025 = true;
            field6169++;
            class765.field11213++;
            return true;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6175[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V", line = 107)
    public final void method3139(byte arg0) {
        try {
            class29 var2 = this.field6157;
            synchronized (this.field6157) {
                this.field6157.method304(1);
            }
            field6165++;
            class29 var3 = this.field6172;
            synchronized (this.field6172) {
                this.field6172.method304(1);
            }
            class29 var4 = this.field6173;
            synchronized (this.field6173) {
                if (arg0 != -20) {
                    this.field6159 = false;
                }
                this.field6173.method304(1);
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field6175[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZI)V", line = 126)
    public final void method3140(boolean arg0, int arg1) {
        try {
            class29 var3 = this.field6157;
            synchronized (this.field6157) {
                this.field6157.method294(arg1, -630);
            }
            if (arg0) {
                field6163++;
                class29 var4 = this.field6172;
                synchronized (this.field6172) {
                    this.field6172.method294(arg1, -630);
                }
                class29 var5 = this.field6173;
                synchronized (this.field6173) {
                    this.field6173.method294(arg1, -630);
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field6175[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILnda;Lwq;)Ljo;", line = 148)
    public static final class353 method3141(int arg0, class584 arg1, class176 arg2) {
        try {
            field6162++;
            class353 var3 = new class353(arg1);
            int var4 = arg2.method1645((byte) -106);
            boolean var5 = (var4 & 0x1) != 0;
            boolean var6 = (var4 & 0x2) != 0;
            boolean var7 = (var4 & 0x4) != 0;
            if (arg0 != 15) {
                field6160 = true;
            }
            boolean var8 = (var4 & 0x8) != 0;
            if (var5) {
                var3.field5696[0] = arg2.method1674((byte) -80);
                var3.field5699[0] = arg2.method1674((byte) -80);
                if (arg1.field8437 != -1 || arg1.field8459 != -1) {
                    var3.field5696[1] = arg2.method1674((byte) -80);
                    var3.field5699[1] = arg2.method1674((byte) -80);
                }
                if (arg1.field8441 != -1 || arg1.field8477 != -1) {
                    var3.field5696[2] = arg2.method1674((byte) -80);
                    var3.field5699[2] = arg2.method1674((byte) -80);
                }
            }
            if (var6) {
                var3.field5698[0] = arg2.method1674((byte) -80);
                var3.field5697[0] = arg2.method1674((byte) -80);
                if (arg1.field8457 != -1 || arg1.field8432 != -1) {
                    var3.field5698[1] = arg2.method1674((byte) -80);
                    var3.field5697[1] = arg2.method1674((byte) -80);
                }
            }
            if (var7) {
                int var9 = arg2.method1687((byte) -95);
                int[] var10 = new int[] { class292.method2485(15, var9), class292.method2485(var9 >> 4, 15), class292.method2485(var9, 4050) >> 8, class292.method2485(var9 >> 12, 15) };
                for (int var11 = 0; var11 < 4; var11++) {
                    if (var10[var11] != 15) {
                        var3.field5700[var10[var11]] = (short) arg2.method1687((byte) -101);
                    }
                }
            }
            if (var8) {
                int var12 = arg2.method1645((byte) -123);
                int[] var13 = new int[] { class292.method2485(15, var12), class292.method2485(var12 >> 4, 15) };
                for (int var14 = 0; var14 < 2; var14++) {
                    if (var13[var14] != 15) {
                        var3.field5695[var13[var14]] = (short) arg2.method1687((byte) -107);
                    }
                }
            }
            return var3;
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field6175[2] + arg0 + ',' + (arg1 == null ? field6175[3] : field6175[4]) + ',' + (arg2 == null ? field6175[3] : field6175[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)Lfaa;", line = 248)
    public final class162 method3142(int arg0, byte arg1) {
        try {
            field6166++;
            class29 var3 = this.field6157;
            class162 var4;
            synchronized (this.field6157) {
                var4 = (class162) this.field6157.method302(arg1 ^ 0xFFFFFFF5, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field6168;
            byte[] var6;
            synchronized (this.field6168) {
                var6 = this.field6168.method604((byte) 112, class451.method3506(arg0, 124), class662.method4804(arg0, false));
            }
            class162 var7 = new class162();
            if (arg1 != 80) {
                method3133((byte) -114);
            }
            var7.field2617 = this;
            var7.field2615 = arg0;
            if (var6 != null) {
                var7.method1523(255, new class176(var6));
            }
            var7.method1518(-5);
            class29 var8 = this.field6157;
            synchronized (this.field6157) {
                this.field6157.method295(false, (long) arg0, var7);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field6175[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lpo;IZLgda;Lgda;)V", line = 294)
    public class384(class585 arg0, int arg1, boolean arg2, class58 arg3, class58 arg4) {
        try {
            this.field6159 = arg2;
            this.field6170 = arg0;
            this.field6167 = arg4;
            this.field6168 = arg3;
            if (this.field6168 != null) {
                int var6 = this.field6168.method600(1) - 1;
                this.field6168.method580(78, var6);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field6175[9] + (arg0 == null ? field6175[3] : field6175[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field6175[3] : field6175[4]) + ',' + (arg4 == null ? field6175[3] : field6175[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3143(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3144(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 103;
                    break;
                case 1:
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 114;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 123;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
