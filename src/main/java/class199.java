import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class199 {

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3118 = new String[] { method1790(method1789("\u001c;($k")), method1790(method1789("\u001c;(!k")), method1790(method1789("\u001c;(\"k")), method1790(method1789("\u001c;(%k")), method1790(method1789("\u001c;( k")), method1790(method1789("\u001c;(#k")), method1790(method1789("\u001c;('k")) };

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field3107 = new String[5];

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "Z")
    public static boolean field3115 = false;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "Lel;")
    public static class573 field3117 = new class573(101, 2);

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
    private int field3106;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
    public int field3110;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "[Z")
    public static boolean[] field3112;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)V", line = 7)
    public static final void method1782(int arg0) {
        try {
            field3114++;
            for (int var1 = arg0; var1 < 5; var1++) {
                class28.field345[var1] = false;
            }
            class475.field6888 = class375.field5711;
            class634.field9239 = -1;
            class501.field7245 = class93.field1052;
            class218.field3340 = class144.field1749;
            class163.field2215 = class683.field9899;
            class427.field6286 = -1;
            class589.field8664 = 0;
            class777.field11288 = 0;
            class185.field2559 = 5;
            class9.field93 = class320.field5061;
            class238.field3617 = -1;
            class730.field10605 = -1;
            class154.field1900 = class271.field4116;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3118[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)V", line = 36)
    public final void method1783(int arg0, int arg1) {
        try {
            this.field3106 = 0;
            if (arg0 < 117) {
                this.field3106 = -65;
            }
            this.field3110 = arg1;
            field3109++;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3118[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIII)Z", line = 53)
    public final boolean method1784(int arg0, int arg1, int arg2, int arg3) {
        try {
            field3116++;
            int var5 = this.field3106;
            if (this.field3110 == arg2 && this.field3106 == 0) {
                return false;
            }
            if (arg0 <= 98) {
                field3112 = null;
            }
            boolean var6;
            if (this.field3106 == 0) {
                if (this.field3110 < arg2 && (this.field3110 + arg1) >= arg2 || arg2 < this.field3110 && this.field3110 - arg1 <= arg2) {
                    this.field3110 = arg2;
                    return false;
                }
                var6 = true;
            } else if (this.field3106 > 0 && this.field3110 < arg2) {
                int var9 = this.field3106 * this.field3106 / (arg1 * 2);
                int var10 = this.field3110 + var9;
                if (var10 < arg2 && this.field3110 <= var10) {
                    var6 = true;
                } else {
                    var6 = false;
                }
            } else if (this.field3106 < 0 && arg2 < this.field3110) {
                int var7 = this.field3106 * this.field3106 / (arg1 * 2);
                int var8 = this.field3110 - var7;
                if (arg2 < var8 && this.field3110 >= var8) {
                    var6 = true;
                } else {
                    var6 = false;
                }
            } else {
                var6 = false;
            }
            if (var6) {
                if (arg2 > this.field3110) {
                    this.field3106 += arg1;
                    if (arg3 != 0 && arg3 < this.field3106) {
                        this.field3106 = arg3;
                    }
                } else {
                    this.field3106 -= arg1;
                    if (arg3 != 0 && -arg3 > this.field3106) {
                        this.field3106 = -arg3;
                    }
                }
                if (this.field3106 != var5) {
                    int var11 = this.field3106 * this.field3106 / (arg1 * 2);
                    if (arg2 <= this.field3110) {
                        if (arg2 < this.field3110 && arg2 > (this.field3110 - var11)) {
                            this.field3106 = var5;
                        }
                    } else if (arg2 < this.field3110 + var11) {
                        this.field3106 = var5;
                    }
                }
            } else if (this.field3106 > 0) {
                this.field3106 -= arg1;
                if (this.field3106 < 0) {
                    this.field3106 = 0;
                }
            } else {
                this.field3106 += arg1;
                if (this.field3106 > 0) {
                    this.field3106 = 0;
                }
            }
            this.field3110 += this.field3106 + var5 >> 1;
            return var6;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field3118[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)I", line = 188)
    public final int method1785(int arg0) {
        try {
            if (arg0 != 5) {
                field3115 = true;
            }
            field3108++;
            return this.field3110 & 0x3FFF;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3118[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "(I)V", line = 204)
    public final void method1786(int arg0) {
        try {
            field3113++;
            this.field3110 &= 0x3FFF;
            if (arg0 != -1) {
                this.method1783(-9, -49);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3118[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIZ)Z", line = 217)
    public static final boolean method1787(int arg0, int arg1, boolean arg2) {
        try {
            field3111++;
            if (arg2) {
                return (arg1 & 0x34) != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3118[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V", line = 228)
    public static void method1788(int arg0) {
        try {
            if (arg0 == 2) {
                field3107 = null;
                field3117 = null;
                field3112 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3118[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1789(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1790(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 115;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 6;
                    break;
                case 3:
                    var10005 = 102;
                    break;
                default:
                    var10005 = 67;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
