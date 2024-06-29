import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class470 {

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "Lvk;")
    private class651 field6885 = new class651();

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6889 = new String[] { method3621(method3620("\u0019$I$b")), method3621(method3620("\u0019$I)b")), method3621(method3620("\u0019$I*b")), method3621(method3620("\u0019$I'b")), method3621(method3620("\u0001\"\u000b\u0003")), method3621(method3620("\u0014yIA7")), method3621(method3620("\u0019$I+b")), method3621(method3620("\u0019$I#b")), method3621(method3620("\u0019$I&b")), method3621(method3620("\u0019$I(b")), method3621(method3620("\u0019$IS#\u0001>\u0013Qb")), method3621(method3620("\u0019$I,b")), method3621(method3620("\u0019$I-b")), method3621(method3620("\u0019$I.b")), method3621(method3620("\u0019$I%b")) };

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "Lmv;")
    public static class125 field6884 = new class125(53, 3);

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "Lvk;")
    private class651 field6888;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIII)I")
    public static final int method3608(int arg0, int arg1, int arg2, int arg3) {
        try {
            field6879++;
            int var6 = arg2 & 0x3;
            if (var6 == 0) {
                return arg1;
            } else if (var6 == 1) {
                return 7 - arg0;
            } else if (var6 == 2) {
                return 7 - arg1;
            } else {
                if (arg3 > -100) {
                    field6884 = null;
                }
                return arg0;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6889[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
    public static void method3609(int arg0) {
        try {
            field6884 = null;
            if (arg0 != 1) {
                field6884 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6889[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I[BLdga;I)Lnh;")
    public static final class388 method3610(int arg0, byte[] arg1, class713 arg2, int arg3) {
        try {
            field6876++;
            if (arg1 == null) {
                return null;
            }
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg0, var4);
            OpenGL.glProgramRawARB(arg0, 34933, arg1);
            OpenGL.glGetIntegerv(arg3, class559.field8130, 0);
            if (class559.field8130[0] == -1) {
                OpenGL.glBindProgramARB(arg0, 0);
                return new class388(arg2, arg0, var4);
            } else {
                OpenGL.glBindProgramARB(arg0, 0);
                return null;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6889[3] + arg0 + ',' + (arg1 == null ? field6889[4] : field6889[5]) + ',' + (arg2 == null ? field6889[4] : field6889[5]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)Lvk;")
    public final class651 method3611(int arg0) {
        try {
            if (arg0 > -123) {
                return null;
            }
            field6875++;
            class651 var2 = this.field6885.field9248;
            if (this.field6885 == var2) {
                return null;
            } else {
                var2.method4736(0);
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6889[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "(I)Lvk;")
    public final class651 method3612(int arg0) {
        try {
            if (arg0 != 3) {
                this.field6888 = null;
            }
            field6880++;
            class651 var2 = this.field6888;
            if (this.field6885 == var2) {
                this.field6888 = null;
                return null;
            } else {
                this.field6888 = var2.field9248;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6889[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
    public final void method3613(byte arg0) {
        try {
            field6877++;
            while (true) {
                class651 var2 = this.field6885.field9248;
                if (this.field6885 == var2) {
                    if (arg0 != 118) {
                        this.method3616(-49);
                    }
                    this.field6888 = null;
                    return;
                }
                var2.method4736(arg0 - 118);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6889[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(Z)Z")
    public final boolean method3614(boolean arg0) {
        try {
            if (!arg0) {
                this.field6888 = null;
            }
            field6886++;
            return this.field6885.field9248 == this.field6885;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6889[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZB)V")
    public static final void method3615(boolean arg0, byte arg1) {
        try {
            field6883++;
            int var2 = 62 % ((-arg1 - 36) / 43);
            for (class576 var3 = (class576) class614.field8777.method3977((byte) -114); var3 != null; var3 = (class576) class614.field8777.method3987(0)) {
                if (var3.field8324 != null) {
                    class261.field3699.method4232(var3.field8324);
                    var3.field8324 = null;
                }
                if (var3.field8333 != null) {
                    class261.field3699.method4232(var3.field8333);
                    var3.field8333 = null;
                }
                var3.method4294(0);
            }
            if (arg0) {
                for (class576 var4 = (class576) class364.field5278.method3977((byte) -41); var4 != null; var4 = (class576) class364.field5278.method3987(0)) {
                    if (var4.field8324 != null) {
                        class261.field3699.method4232(var4.field8324);
                        var4.field8324 = null;
                    }
                    var4.method4294(0);
                }
                for (class576 var5 = (class576) class572.field8289.method3696(0); var5 != null; var5 = (class576) class572.field8289.method3697(-108)) {
                    if (var5.field8324 != null) {
                        class261.field3699.method4232(var5.field8324);
                        var5.field8324 = null;
                    }
                    var5.method4294(0);
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6889[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "(I)Lvk;")
    public final class651 method3616(int arg0) {
        try {
            field6881++;
            if (arg0 != 1) {
                return null;
            }
            class651 var2 = this.field6885.field9253;
            if (this.field6885 == var2) {
                this.field6888 = null;
                return null;
            } else {
                this.field6888 = var2.field9253;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6889[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)Lvk;")
    public final class651 method3617(boolean arg0) {
        try {
            if (arg0) {
                field6884 = null;
            }
            field6882++;
            class651 var2 = this.field6885.field9248;
            if (this.field6885 == var2) {
                this.field6888 = null;
                return null;
            } else {
                this.field6888 = var2.field9248;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6889[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lvk;I)V")
    public final void method3618(class651 arg0, int arg1) {
        try {
            field6887++;
            if (arg0.field9253 != null) {
                arg0.method4736(0);
            }
            arg0.field9253 = this.field6885.field9253;
            arg0.field9248 = this.field6885;
            arg0.field9253.field9248 = arg0;
            arg0.field9248.field9253 = arg0;
            if (arg1 < 22) {
                this.method3614(false);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6889[8] + (arg0 == null ? field6889[4] : field6889[5]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)I")
    public final int method3619(int arg0) {
        try {
            field6878++;
            int var2 = arg0;
            class651 var3 = this.field6885.field9248;
            while (this.field6885 != var3) {
                var3 = var3.field9248;
                var2++;
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6889[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V")
    public class470() {
        try {
            this.field6885.field9253 = this.field6885;
            this.field6885.field9248 = this.field6885;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6889[10] + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3620(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3621(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 111;
                    break;
                case 1:
                    var10005 = 87;
                    break;
                case 2:
                    var10005 = 103;
                    break;
                case 3:
                    var10005 = 111;
                    break;
                default:
                    var10005 = 74;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
