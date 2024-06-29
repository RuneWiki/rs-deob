import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class563 extends class299 {

    @OriginalMember(owner = "client!ts", name = "s", descriptor = "Z")
    public boolean field8176 = false;

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "Z")
    private boolean field8188 = true;

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8191 = new String[] { method4139(method4138("W\u000bI2I")), method4139(method4138("W\u000bI7I")), method4139(method4138("I\u0019\u0000\u0012\u0019")), method4139(method4138("W\u000bI4I")), method4139(method4138("W\u000bI>I")), method4139(method4138("W\u000bI3I")), method4139(method4138("W\u000bI?I")), method4139(method4138("W\u000bI=I")), method4139(method4138("W\u000bI<I")), method4139(method4138("W\u000bI1I")), method4139(method4138("W\u000bI0I")), method4139(method4138("W\u000bI5I")) };

    @OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
    public static int field8178 = 1;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "Lhl;")
    public static class556 field8181 = new class556(81, 6);

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "Z")
    public static boolean field8189 = true;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field8175;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
    public static int field8177;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
    public static int field8179;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public static int field8182;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!ts", name = "q", descriptor = "I")
    public static int field8184;

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
    public static int field8185;

    @OriginalMember(owner = "client!ts", name = "r", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!ts", name = "u", descriptor = "I")
    public static int field8187;

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "Z")
    public static boolean field8190;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)V")
    public static final void method4131(boolean arg0, int arg1) {
        try {
            ++field8179;
            class29 var2 = class223.field3499;
            synchronized (class223.field3499) {
                class223.field3499.method294(arg1, -630);
                if (!arg0) {
                    method4135(false);
                }
            }
            class29 var3 = class12.field137;
            synchronized (class12.field137) {
                class12.field137.method294(arg1, -630);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field8191[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Les;)V")
    public class563(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(Z)I")
    public final int method4132(boolean arg0) {
        try {
            ++field8180;
            if (!arg0) {
                method4135(false);
            }
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8191[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(Z)Z")
    public final boolean method4133(boolean arg0) {
        try {
            if (!arg0) {
                return false;
            } else {
                ++field8183;
                return this.field8188;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8191[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZ)V")
    public final void method846(int arg0, boolean arg1) {
        try {
            this.field8176 = arg1;
            super.field4849 = arg0;
            ++field8186;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8191[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)I")
    public final int method852(int arg0, int arg1) {
        try {
            if (arg0 != 1) {
                method4135(true);
            }
            ++field8185;
            if (!super.field4850.method3250((byte) 87).method2096(-114)) {
                return 3;
            } else {
                return ~arg1 == -4 && !class687.method5003(field8191[2], true) ? 3 : 2;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8191[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(JZ)V")
    public static final void method4134(long arg0, boolean arg1) {
        try {
            try {
                Thread.sleep(arg0);
                if (arg1) {
                    field8178 = 124;
                }
            } catch (InterruptedException var4) {
            }
            ++field8187;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8191[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "(Z)V")
    public static void method4135(boolean arg0) {
        try {
            if (!arg0) {
                method4134(86L, false);
            }
            field8181 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8191[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)I")
    public final int method847(int arg0) {
        try {
            if (arg0 != 0) {
                field8189 = false;
            }
            ++field8174;
            this.field8176 = true;
            return !super.field4850.method3250((byte) 87).method2096(89) ? 0 : 2;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8191[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(IZ)V")
    public final void method4136(int arg0, boolean arg1) {
        try {
            this.field8188 = arg1;
            if (arg0 != 1) {
                method4131(true, -122);
            }
            ++field8184;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8191[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(ILes;)V")
    public class563(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)Z")
    public final boolean method4137(int arg0) {
        try {
            ++field8175;
            if (!super.field4850.method3250((byte) 87).method2096(26)) {
                return false;
            } else {
                return arg0 != 3 ? true : true;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8191[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
    public final void method848(int arg0) {
        try {
            if (!super.field4850.method3250((byte) 87).method2096(arg0 ^ -20460)) {
                super.field4849 = 0;
            }
            if (arg0 != -20456) {
                this.field8188 = true;
            }
            ++field8182;
            if (super.field4849 < 0 || super.field4849 > 5) {
                super.field4849 = this.method847(arg0 ^ -20456);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8191[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4138(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 97);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4139(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 120;
                    break;
                case 2:
                    var10005 = 103;
                    break;
                case 3:
                    var10005 = 118;
                    break;
                default:
                    var10005 = 97;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
