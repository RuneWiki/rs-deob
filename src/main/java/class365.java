import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class365 extends class299 {

    @OriginalMember(owner = "client!gha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5955 = new String[] { method3023(method3022("Y\u007f+Jb\u0016")), method3023(method3022("Pb&\b")), method3023(method3022("E9dJ[")), method3023(method3022("Y\u007f+Jl\u0016")), method3023(method3022("Zg")), method3023(method3022("Y\u007f+Ja\u0016")), method3023(method3022("Y\u007f+J`\u0016")), method3023(method3022("Y\u007f+Jc\u0016")), method3023(method3022("Y\u007f+Jn\u0016")), method3023(method3022("Y\u007f+Jd\u0016")), method3023(method3022("Y\u007f+Jg\u0016")), method3023(method3022("Y\u007f+Jo\u0016")), method3023(method3022("Y\u007f+Je\u0016")) };

    @OriginalMember(owner = "client!gha", name = "q", descriptor = "Lwh;")
    public static class155 field5944 = new class155(4, 1);

    @OriginalMember(owner = "client!gha", name = "h", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!gha", name = "n", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!gha", name = "k", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!gha", name = "g", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!gha", name = "m", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!gha", name = "l", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!gha", name = "p", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!gha", name = "o", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!gha", name = "i", descriptor = "I")
    public static int field5953;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gha", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field5954;

    // $FF: synthetic method
    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3021(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(ILes;)V", line = 3)
    public class365(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Les;)V", line = 7)
    public class365(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)I", line = 13)
    public final int method847(int arg0) {
        try {
            ++field5948;
            if (arg0 != 0) {
                this.method848(106);
            }
            return 1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5955[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIII)Z", line = 26)
    public static final boolean method3015(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field5950;
            class3 var4 = (class3) class244.method2102(arg0, arg2, arg3);
            boolean var5 = true;
            if (var4 != null) {
                var5 &= class468.method3611(false, var4);
            }
            class3 var6 = (class3) class59.method614(arg0, arg2, arg3, field5954 != null ? field5954 : (field5954 = method3021(field5955[4])));
            if (var6 != null) {
                var5 &= class468.method3611(false, var6);
            }
            class3 var7 = (class3) class605.method4422(arg0, arg2, arg3);
            if (arg1 != 0) {
                method3017((byte) 72, (class459) null, (class459) null);
            }
            if (var7 != null) {
                var5 &= class468.method3611(false, var7);
            }
            return var5;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field5955[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "(I)Z", line = 54)
    public final boolean method3016(int arg0) {
        try {
            ++field5947;
            if (super.field4850.method3245((byte) -58)) {
                return false;
            } else {
                if (arg0 != 3) {
                    method3018(true);
                }
                return true;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5955[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(BLrba;Lrba;)V", line = 70)
    public static final void method3017(byte arg0, class459 arg1, class459 arg2) {
        try {
            if (arg1.field7073 != null) {
                arg1.method3558((byte) 78);
            }
            if (arg0 >= -3) {
                field5944 = null;
            }
            ++field5952;
            arg1.field7073 = arg2;
            arg1.field7074 = arg2.field7074;
            arg1.field7073.field7074 = arg1;
            arg1.field7074.field7073 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5955[8] + arg0 + ',' + (arg1 != null ? field5955[2] : field5955[1]) + ',' + (arg2 != null ? field5955[2] : field5955[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(II)I", line = 87)
    public final int method852(int arg0, int arg1) {
        try {
            if (arg0 != 1) {
                field5944 = null;
            }
            ++field5951;
            return super.field4850.method3245((byte) -58) ? 3 : 1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5955[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "(Z)V", line = 105)
    public static void method3018(boolean arg0) {
        try {
            if (arg0) {
                method3018(false);
            }
            field5944 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5955[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IZ)V", line = 118)
    public final void method846(int arg0, boolean arg1) {
        try {
            super.field4849 = arg0;
            if (arg1) {
                method3018(true);
            }
            ++field5953;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5955[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "(Z)I", line = 130)
    public final int method3019(boolean arg0) {
        try {
            ++field5945;
            return !arg0 ? -67 : super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5955[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "(I)V", line = 141)
    public final void method848(int arg0) {
        try {
            ++field5949;
            if (super.field4850.method3245((byte) -58)) {
                super.field4849 = 0;
            }
            if (arg0 != -20456) {
                method3015(118, 17, -7, -42);
            }
            if (~super.field4849 != -2 && super.field4849 != 0) {
                super.field4849 = this.method847(0);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5955[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lha;Ljc;I)I", line = 157)
    public static final int method3020(class63 arg0, class466 arg1, int arg2) {
        try {
            ++field5946;
            if (~arg1.field7161 == 0) {
                if (~arg1.field7160 != 0) {
                    class304 var3 = arg0.field864.method1419(arg1.field7160, -91);
                    if (!var3.field4890) {
                        return var3.field4894;
                    }
                }
                return arg2 != -18754 ? 124 : arg1.field7143;
            } else {
                return arg1.field7161;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5955[0] + (arg0 != null ? field5955[2] : field5955[1]) + ',' + (arg1 != null ? field5955[2] : field5955[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3022(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 38);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3023(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 62;
                    break;
                case 1:
                    var10005 = 23;
                    break;
                case 2:
                    var10005 = 74;
                    break;
                case 3:
                    var10005 = 100;
                    break;
                default:
                    var10005 = 38;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
