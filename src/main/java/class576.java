import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class576 extends class768 {

    @OriginalMember(owner = "client!lba", name = "O", descriptor = "[Ljava/lang/String;")
    private static final String[] field8310 = new String[] { method4231(method4230("gx+<U#")), method4231(method4230("gx+<T#")), method4231(method4230("p4d<l")), method4231(method4230("eo&~")), method4231(method4230("gx+<S#")), method4231(method4230("gx+<P#")) };

    @OriginalMember(owner = "client!lba", name = "M", descriptor = "I")
    public static int field8306 = 0;

    @OriginalMember(owner = "client!lba", name = "J", descriptor = "Lat;")
    public static class398 field8304 = new class398();

    @OriginalMember(owner = "client!lba", name = "F", descriptor = "[Z")
    public static boolean[] field8309 = new boolean[5];

    @OriginalMember(owner = "client!lba", name = "E", descriptor = "I")
    public static int field8299;

    @OriginalMember(owner = "client!lba", name = "H", descriptor = "I")
    public static int field8301;

    @OriginalMember(owner = "client!lba", name = "L", descriptor = "I")
    public static int field8303;

    @OriginalMember(owner = "client!lba", name = "I", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!lba", name = "N", descriptor = "I")
    public int field8307;

    @OriginalMember(owner = "client!lba", name = "K", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!lba", name = "G", descriptor = "Ldca;")
    public class186 field8302;

    @OriginalMember(owner = "client!lba", name = "D", descriptor = "[B")
    public byte[] field8300;

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(Z)I", line = 4)
    public final int method4226(boolean arg0) {
        try {
            ++field8299;
            if (super.field11246) {
                return 0;
            } else {
                return !arg0 ? -108 : 100;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8310[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILat;IILha;)V", line = 18)
    public static final void method4227(int arg0, class398 arg1, int arg2, int arg3, class63 arg4) {
        try {
            ++field8301;
            if (arg2 == 100) {
                class728.field10663.method3224(false);
                if (!class91.field1344) {
                    for (class420 var5 = (class420) arg1.method3228(11); var5 != null; var5 = (class420) arg1.method3216(true)) {
                        class209 var6 = class770.field11257.method2325(-2, var5.field6636);
                        if (class82.method842((byte) -2, var6)) {
                            boolean var7 = class123.method1191(-3073, arg3, arg0, arg4, var6, var5);
                            if (var7) {
                                class755.method5467(var5, 46, arg4, var6);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field8310[4] + arg0 + ',' + (arg1 != null ? field8310[2] : field8310[3]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8310[2] : field8310[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(Z)[B", line = 55)
    public final byte[] method4228(boolean arg0) {
        try {
            if (!arg0) {
                return null;
            } else {
                ++field8305;
                if (super.field11246) {
                    throw new RuntimeException();
                } else {
                    return this.field8300;
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8310[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)V", line = 73)
    public static void method4229(int arg0) {
        try {
            field8304 = null;
            if (arg0 != 0) {
                method4227(-102, (class398) null, 88, -22, (class63) null);
            }
            field8309 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8310[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4230(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4231(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 26;
                    break;
                case 2:
                    var10005 = 74;
                    break;
                case 3:
                    var10005 = 18;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
