import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class7 {

    @OriginalMember(owner = "client!nw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field97 = new String[] { method55(method54("qt\u0018Kq")), method55(method54("qt\u0018Nq")), method55(method54("qt\u0018Mq")), method55(method54("qt\u0018Jq")), method55(method54("qt\u0018Lq")) };

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "[Z")
    public static boolean[] field92 = new boolean[100];

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "Lmv;")
    public static class125 field90 = new class125(37, 7);

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "Lmv;")
    public static class125 field95 = new class125(17, -1);

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "I")
    public static int field96 = 0;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!nw", name = "k", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!nw", name = "j", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
    private int field94;

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "Ljava/lang/Object;")
    public static Object field88;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)V", line = 3)
    public static void method49(boolean arg0) {
        try {
            field95 = null;
            if (arg0) {
                field90 = null;
                field92 = null;
                field88 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field97[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)V", line = 18)
    public final void method50(byte arg0) {
        try {
            field89++;
            if (arg0 == -9) {
                this.field91 &= 0x3FFF;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field97[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIII)Z", line = 32)
    public final boolean method51(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg0 != -2038) {
                field92 = null;
            }
            field87++;
            int var5 = this.field94;
            if (this.field91 == arg3 && this.field94 == 0) {
                return false;
            }
            boolean var6;
            if (this.field94 == 0) {
                if (arg3 > this.field91 && arg3 <= this.field91 + arg1 || arg3 < this.field91 && arg3 >= (this.field91 - arg1)) {
                    this.field91 = arg3;
                    return false;
                }
                var6 = true;
            } else if (this.field94 > 0 && this.field91 < arg3) {
                int var7 = this.field94 * this.field94 / (arg1 * 2);
                int var8 = this.field91 + var7;
                if (var8 < arg3 && var8 >= this.field91) {
                    var6 = true;
                } else {
                    var6 = false;
                }
            } else if (this.field94 < 0 && this.field91 > arg3) {
                int var9 = this.field94 * this.field94 / (arg1 * 2);
                int var10 = this.field91 - var9;
                if (arg3 < var10 && var10 <= this.field91) {
                    var6 = true;
                } else {
                    var6 = false;
                }
            } else {
                var6 = false;
            }
            if (var6) {
                if (this.field91 < arg3) {
                    this.field94 += arg1;
                    if (arg2 != 0 && arg2 < this.field94) {
                        this.field94 = arg2;
                    }
                } else {
                    this.field94 -= arg1;
                    if (arg2 != 0 && this.field94 < -arg2) {
                        this.field94 = -arg2;
                    }
                }
                if (this.field94 != var5) {
                    int var11 = this.field94 * this.field94 / (arg1 * 2);
                    if (arg3 > this.field91) {
                        if ((this.field91 + var11) > arg3) {
                            this.field94 = var5;
                        }
                    } else if (arg3 < this.field91 && arg3 > this.field91 - var11) {
                        this.field94 = var5;
                    }
                }
            } else if (this.field94 <= 0) {
                this.field94 += arg1;
                if (this.field94 > 0) {
                    this.field94 = 0;
                }
            } else {
                this.field94 -= arg1;
                if (this.field94 < 0) {
                    this.field94 = 0;
                }
            }
            this.field91 += this.field94 + var5 >> 1;
            return var6;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field97[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)I", line = 168)
    public final int method52(int arg0) {
        try {
            field93++;
            return arg0 == 16383 ? this.field91 & 0x3FFF : 28;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field97[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(II)V", line = 185)
    public final void method53(int arg0, int arg1) {
        try {
            this.field91 = arg0;
            field86++;
            if (arg1 != -1) {
                this.method52(12);
            }
            this.field94 = 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field97[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method54(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method55(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 31;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 54;
                    break;
                case 3:
                    var10005 = 15;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
