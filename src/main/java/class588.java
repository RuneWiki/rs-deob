import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class588 extends class299 {

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8529 = new String[] { method4323(method4322("5\u001f\u0001Kf")), method4323(method4322("5\u001f\u0001Of")), method4323(method4322(")\u001dN")), method4323(method4322("5\u001f\u0001Jf")), method4323(method4322("5\u001f\u0001Mf")), method4323(method4322("5\u001f\u0001Hf")), method4323(method4322("5\u001f\u0001If")), method4323(method4322(".\rCb")), method4323(method4322(";V\u0001 3")), method4323(method4322("5\u001f\u0001Lf")), method4323(method4322("5\u001f\u0001Ff")) };

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field8516 = 52;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field8526 = -1;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "F")
    public static float field8522;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field8517;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field8518;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field8520;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field8524;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field8525;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field8528;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Z")
    public static boolean field8527;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)I", line = 4)
    public final int method4318(boolean arg0) {
        try {
            if (!arg0) {
                this.method848(5);
            }
            ++field8524;
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8529[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILgda;II)Lkaa;", line = 23)
    public static final class49 method4319(int arg0, class58 arg1, int arg2, int arg3) {
        try {
            ++field8528;
            byte[] var4 = arg1.method604((byte) 28, arg0, arg3);
            if (var4 == null) {
                return null;
            } else {
                if (arg2 != 0) {
                    field8527 = true;
                }
                return new class49(var4);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8529[9] + arg0 + ',' + (arg1 != null ? field8529[8] : field8529[7]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)I", line = 40)
    public final int method847(int arg0) {
        try {
            ++field8520;
            if (arg0 != 0) {
                field8521 = -46;
            }
            return 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8529[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZ)V", line = 53)
    public final void method846(int arg0, boolean arg1) {
        try {
            if (!arg1) {
                super.field4849 = arg0;
                ++field8519;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8529[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Les;)V", line = 64)
    public class588(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(ILes;)V", line = 67)
    public class588(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V", line = 70)
    public final void method848(int arg0) {
        try {
            if (~super.field4849 != -2 && super.field4849 != 0) {
                super.field4849 = this.method847(arg0 ^ -20456);
            }
            if (arg0 != -20456) {
                method4320(26);
            }
            ++field8518;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8529[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)Leb;", line = 85)
    public static final class654 method4320(int arg0) {
        try {
            ++field8525;
            if (arg0 < 119) {
                return null;
            } else {
                try {
                    return new class508();
                } catch (Throwable var3) {
                    try {
                        return (class654) Class.forName(field8529[2]).newInstance();
                    } catch (Throwable var2) {
                        return new class754();
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8529[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)V", line = 113)
    public static final void method4321(int arg0, byte arg1) {
        try {
            if (arg1 != 121) {
                field8521 = -2;
            }
            ++field8517;
            class551 var2 = class380.method3113(-118, (long) arg0, 4);
            var2.method4089(63);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8529[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)I", line = 130)
    public final int method852(int arg0, int arg1) {
        try {
            if (arg0 != 1) {
                return 109;
            } else {
                ++field8523;
                return 1;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8529[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4322(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 78);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4323(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 120;
                    break;
                case 2:
                    var10005 = 47;
                    break;
                case 3:
                    var10005 = 14;
                    break;
                default:
                    var10005 = 78;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
