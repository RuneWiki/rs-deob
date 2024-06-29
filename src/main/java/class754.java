import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class754 extends class54 {

    @OriginalMember(owner = "client!pea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10981 = new String[] { method5481(method5480("\t\u0013\u0018-\u000eQ")), method5481(method5480("\t\u0013\u0018-\u0007Q")), method5481(method5480("\t\u0013\u0018-\u0003Q")), method5481(method5480("\t\u0013\u0018-\u0004Q")), method5481(method5480("\t\u0013\u0018-\u0002Q")), method5481(method5480("\t\u0013\u0018-\u000bQ")), method5481(method5480("\t\u0013\u0018-\u0001Q")), method5481(method5480("\t\u0013\u0018-\u0005Q")), method5481(method5480("\t\u0013\u0018-\u0000Q")) };

    @OriginalMember(owner = "client!pea", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field10971 = new String[200];

    @OriginalMember(owner = "client!pea", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field10978 = new String[] { method5481(method5480("\u001c\u0018")), method5481(method5480("\u001d\u0013")), method5481(method5480("\u001f\u0004")), method5481(method5480("\t\u0002")), method5481(method5480("\u0017\u001a")) };

    @OriginalMember(owner = "client!pea", name = "o", descriptor = "[I")
    public static int[] field10970 = new int[8];

    @OriginalMember(owner = "client!pea", name = "u", descriptor = "Lel;")
    public static class573 field10974 = new class573(125, 3);

    @OriginalMember(owner = "client!pea", name = "q", descriptor = "I")
    public static int field10968;

    @OriginalMember(owner = "client!pea", name = "r", descriptor = "I")
    public static int field10969;

    @OriginalMember(owner = "client!pea", name = "m", descriptor = "I")
    public static int field10972;

    @OriginalMember(owner = "client!pea", name = "t", descriptor = "I")
    public static int field10973;

    @OriginalMember(owner = "client!pea", name = "s", descriptor = "I")
    public static int field10975;

    @OriginalMember(owner = "client!pea", name = "x", descriptor = "I")
    public static int field10976;

    @OriginalMember(owner = "client!pea", name = "w", descriptor = "I")
    public static int field10977;

    @OriginalMember(owner = "client!pea", name = "p", descriptor = "I")
    public static int field10980;

    @OriginalMember(owner = "client!pea", name = "y", descriptor = "[[B")
    public static byte[][] field10979;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(Z)I")
    public final int method111(boolean arg0) {
        try {
            ++field10976;
            if (arg0) {
                this.method113(-8, -35);
            }
            return 1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10981[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V")
    public static void method5475(byte arg0) {
        try {
            field10979 = null;
            field10971 = null;
            field10974 = null;
            field10970 = null;
            field10978 = null;
            int var1 = -25 % ((-21 - arg0) / 44);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10981[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BII)I")
    public static final int method5476(byte arg0, int arg1, int arg2) {
        try {
            ++field10972;
            if (~arg2 != -2 && arg2 != 3) {
                if (arg0 != -75) {
                    field10979 = null;
                }
                return class318.field5037[3 & arg1];
            } else {
                return class352.field5433[3 & arg1];
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10981[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        try {
            ++field10977;
            if (super.field589.method656(arg0)) {
                super.field593 = 0;
            }
            if (super.field593 != 1 && ~super.field593 != -1) {
                super.field593 = this.method111(false);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10981[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(II)V")
    public final void method113(int arg0, int arg1) {
        try {
            if (arg0 != 0) {
                field10970 = null;
            }
            super.field593 = arg1;
            ++field10975;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10981[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(IB)I")
    public final int method109(int arg0, byte arg1) {
        try {
            ++field10973;
            if (super.field589.method656(true)) {
                return 3;
            } else {
                return arg1 > -106 ? -76 : 1;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10981[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lhia;)V")
    public class754(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "(Z)I")
    public final int method5477(boolean arg0) {
        try {
            ++field10980;
            if (arg0) {
                this.method5479(-8);
            }
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10981[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(ILhia;)V")
    public class754(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(FI)F")
    public static final float method5478(float arg0, int arg1) {
        try {
            if (arg1 != 10) {
                return -1.2391319F;
            } else {
                ++field10968;
                return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10981[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "(I)Z")
    public final boolean method5479(int arg0) {
        try {
            if (arg0 != -10243) {
                this.method109(-28, (byte) -6);
            }
            ++field10969;
            return !super.field589.method656(true);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10981[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5480(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 70);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5481(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 121;
                    break;
                case 1:
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 121;
                    break;
                case 3:
                    var10005 = 3;
                    break;
                default:
                    var10005 = 70;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
