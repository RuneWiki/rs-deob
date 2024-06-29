import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class554 extends class46 {

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "Lhja;")
    public class426 field8257;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "Ldn;")
    public class542 field8254;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field8259 = new String[] { method4174(method4173("\\yn\u0015x")), method4174(method4173("I\",W")), method4174(method4173("O;n|-")), method4174(method4173("O;n\u0007lI>4\u0005-")), method4174(method4173("O;np-")), method4174(method4173("O;n}-")), method4174(method4173("O;nq-")), method4174(method4173("O;nw-")), method4174(method4173("O;ns-")) };

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "Lwia;")
    public static class790 field8253 = new class790(35, -1);

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
    public static int field8258 = 0;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public int field8245;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field8246;

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "I")
    public static int field8247;

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
    public int field8248;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    public int field8250;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
    public int field8251;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "I")
    public static int field8252;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
    public int field8256;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIZII)I", line = 6)
    public static final int method4166(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        try {
            int var10 = arg1 & 0x3;
            if ((arg5 & 0x1) == 1) {
                int var7 = arg3;
                arg3 = arg2;
                arg2 = var7;
            }
            field8249++;
            if (var10 == 0) {
                return arg0;
            } else if (var10 == 1) {
                return 1 - (arg3 - (7 - arg6));
            } else if (var10 == 2) {
                return -arg2 - (-(7 - arg0) - 1);
            } else {
                if (!arg4) {
                    method4171((byte) -81);
                }
                return arg6;
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field8259[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "()V", line = 39)
    public static final void method4167() {
        for (int var0 = 0; var0 < class108.field1259.length; var0++) {
            class108.field1259[var0].method4800();
        }
        class108.field1259 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 53)
    public final void method4168(int arg0) {
        try {
            if (arg0 > -119) {
                method4172(-39, 33);
            }
            this.field8248 = this.field8257.field6272;
            field8255++;
            this.field8251 = this.field8257.field6277;
            this.field8256 = this.field8257.field6280;
            if (this.field8257.field6276 != null) {
                this.field8257.field6276.method2393(this.field8254.field8120, this.field8254.field8112, this.field8254.field8127, class709.field10275);
            }
            this.field8245 = class709.field10275[2];
            this.field8250 = class709.field10275[0];
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8259[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/lang/String;)I", line = 73)
    public static final int method4169(int arg0, String arg1) {
        try {
            if (arg0 == 23827) {
                field8246++;
                return arg1.length() + 1;
            } else {
                return 118;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8259[8] + arg0 + ',' + (arg1 == null ? field8259[1] : field8259[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([BB)V", line = 85)
    public static final void method4170(byte[] arg0, byte arg1) {
        try {
            if (arg1 > 68) {
                field8247++;
                class163 var2 = new class163(arg0);
                while (true) {
                    int var3;
                    label66: do {
                        while (true) {
                            while (true) {
                                var3 = var2.method1455((byte) 62);
                                if (var3 == 0) {
                                    return;
                                }
                                if (var3 == 1) {
                                    int[] var8 = class572.field8459 = new int[6];
                                    var8[0] = var2.method1445((byte) 118);
                                    var8[1] = var2.method1445((byte) 117);
                                    var8[2] = var2.method1445((byte) 101);
                                    var8[3] = var2.method1445((byte) 108);
                                    var8[4] = var2.method1445((byte) 112);
                                    var8[5] = var2.method1445((byte) 102);
                                } else {
                                    if (var3 != 4) {
                                        continue label66;
                                    }
                                    int var6 = var2.method1455((byte) 62);
                                    class10.field105 = new int[var6];
                                    for (int var7 = 0; var7 < var6; var7++) {
                                        class10.field105[var7] = var2.method1445((byte) 116);
                                        if (class10.field105[var7] == 65535) {
                                            class10.field105[var7] = -1;
                                        }
                                    }
                                }
                            }
                        }
                    } while (var3 != 5);
                    int var4 = var2.method1455((byte) 62);
                    class324.field5106 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        class324.field5106[var5] = var2.method1445((byte) 103);
                        if (class324.field5106[var5] == 65535) {
                            class324.field5106[var5] = -1;
                        }
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field8259[2] + (arg0 == null ? field8259[1] : field8259[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)V", line = 161)
    public static void method4171(byte arg0) {
        try {
            if (arg0 == -33) {
                field8253 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8259[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)I", line = 180)
    public static final int method4172(int arg0, int arg1) {
        try {
            field8252++;
            int var2 = arg0 >>> 1;
            int var3 = var2 | var2 >>> 1;
            int var4 = var3 | var3 >>> 2;
            int var5 = var4 | var4 >>> 4;
            int var6 = var5 | var5 >>> 8;
            if (arg1 != 24500) {
                field8253 = null;
            }
            int var7 = var6 | var6 >>> 16;
            return arg0 & ~var7;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field8259[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lhja;Lkq;)V", line = 203)
    public class554(class426 arg0, class619 arg1) {
        try {
            this.field8257 = arg0;
            this.field8254 = this.field8257.method3283((byte) 53);
            this.method4168(-124);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8259[3] + (arg0 == null ? field8259[1] : field8259[0]) + ',' + (arg1 == null ? field8259[1] : field8259[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4173(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4174(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 87;
                    break;
                case 2:
                    var10005 = 64;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
