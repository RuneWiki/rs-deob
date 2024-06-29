import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class270 {

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Lgda;")
    private class58 field4352;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Lgda;")
    private class58 field4350;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4353 = new String[] { method2336(method2335(".Xbf>")), method2336(method2335("3\u0015b\nk")), method2336(method2335(";\u0003 $")), method2336(method2335("3\u0015b\tk")), method2336(method2335("3\u0015b\fk")), method2336(method2335("3\u0015bt*;\u001f8vk")), method2336(method2335("3\u0015b\u000bk")) };

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Lfb;")
    private class705 field4345;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILal;)Lbka;", line = 3)
    public final class175 method2331(int arg0, class105 arg1) {
        try {
            field4347++;
            if (arg1 == null) {
                return null;
            }
            class155 var3 = arg1.method989(false);
            if (class504.field7539 == var3) {
                return new class427((class750) arg1);
            } else if (class365.field5944 == var3) {
                return new class623(this.method2333(true), (class375) arg1);
            } else {
                if (arg0 != -8662) {
                    this.method2333(true);
                }
                if (class39.field443 == var3) {
                    return new class751(this.field4350, (class541) arg1);
                } else if (class663.field9444 == var3) {
                    return new class212(this.field4350, (class106) arg1);
                } else if (class201.field3178 == var3) {
                    return new class586(this.field4350, this.field4352, (class716) arg1);
                } else if (class197.field3129 == var3) {
                    return new class45(this.field4350, this.field4352, (class622) arg1);
                } else if (class484.field7347 == var3) {
                    return new class795(this.field4350, this.field4352, (class282) arg1);
                } else if (class623.field8992 == var3) {
                    return new class650(this.field4350, this.field4352, (class642) arg1);
                } else if (class265.field4302 == var3) {
                    return new class531(this.field4350, (class203) arg1);
                } else if (class198.field3140 == var3) {
                    return new class104(this.field4350, this.field4352, (class443) arg1);
                } else {
                    return null;
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4353[4] + arg0 + ',' + (arg1 == null ? field4353[2] : field4353[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lwq;I)Lgm;", line = 61)
    public static final class131 method2332(class176 arg0, int arg1) {
        try {
            field4348++;
            class662 var2 = class268.method2315(false)[arg0.method1645((byte) -125)];
            class666 var3 = class395.method3197(false)[arg0.method1645((byte) -108)];
            int var4 = arg0.method1657(90);
            int var5 = arg0.method1657(arg1 - 12431);
            int var6 = arg0.method1687((byte) -45);
            int var7 = arg0.method1687((byte) -85);
            int var8 = arg0.method1657(116);
            int var9 = arg0.method1622(-18712);
            int var10 = arg0.method1622(-18712);
            return arg1 == 12523 ? new class131(var2, var3, var4, var5, var6, var7, var8, var9, var10) : null;
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field4353[1] + (arg0 == null ? field4353[2] : field4353[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)Lfb;", line = 91)
    private final class705 method2333(boolean arg0) {
        try {
            field4351++;
            if (this.field4345 == null) {
                this.field4345 = new class705();
            }
            if (!arg0) {
                this.field4345 = null;
            }
            return this.field4345;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4353[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILd;Ljava/awt/Canvas;I)Lha;", line = 106)
    public static final class63 method2334(int arg0, class158 arg1, Canvas arg2, int arg3) {
        try {
            int var4 = 54 / ((-arg3 - 59) / 50);
            field4349++;
            return new class159(arg2, arg1, arg0);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4353[6] + arg0 + ',' + (arg1 == null ? field4353[2] : field4353[0]) + ',' + (arg2 == null ? field4353[2] : field4353[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lgda;Lgda;)V", line = 122)
    public class270(class58 arg0, class58 arg1) {
        try {
            this.field4352 = arg1;
            this.field4350 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4353[5] + (arg0 == null ? field4353[2] : field4353[0]) + ',' + (arg1 == null ? field4353[2] : field4353[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2335(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2336(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 85;
                    break;
                case 1:
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 72;
                    break;
                default:
                    var10005 = 67;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
