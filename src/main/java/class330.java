import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class330 extends class211 {

    @OriginalMember(owner = "client!vn", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field5194 = new String[] { method2792(method2791("\u001a_\u000f`?")), method2792(method2791("\u001a_\u000fc?")), method2792(method2791("\u001a_\u000ff?")) };

    @OriginalMember(owner = "client!vn", name = "F", descriptor = "I")
    public static int field5190 = -1;

    @OriginalMember(owner = "client!vn", name = "E", descriptor = "[[Z")
    public static boolean[][] field5193 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!vn", name = "C", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!vn", name = "D", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!vn", name = "G", descriptor = "Ljava/awt/Image;")
    public static Image field5191;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)[I", line = 4)
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field5192;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (super.field3231.field57) {
                int[][] var4 = this.method1853(0, arg0 + -8217, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; ~class343.field5332 < ~var8; ++var8) {
                    var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
                }
            }
            if (arg0 != 8217) {
                method2790(true, -119);
            }
            return var3;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field5194[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(III)Lqa;", line = 48)
    public static final class261 method2788(int arg0, int arg1, int arg2) {
        class96 var3 = class734.field10683[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1079;
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V", line = 57)
    public static void method2789(int arg0) {
        try {
            field5191 = null;
            field5193 = null;
            if (arg0 != 6410) {
                field5190 = 63;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5194[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZI)I", line = 71)
    public static final int method2790(boolean arg0, int arg1) {
        try {
            ++field5189;
            if (arg1 != 6407 && ~arg1 != -34844 && arg1 != 34837) {
                if (arg1 != 6408 && arg1 != 34842 && arg1 != 34836) {
                    if (arg1 != 6406 && arg1 != 34844) {
                        if (arg1 != 6409 && ~arg1 != -34847) {
                            if (~arg1 != -6411 && ~arg1 != -34848) {
                                if (!arg0) {
                                    method2790(false, -52);
                                }
                                if (~arg1 == -6403) {
                                    return 6402;
                                } else {
                                    throw new IllegalArgumentException("");
                                }
                            } else {
                                return 6410;
                            }
                        } else {
                            return 6409;
                        }
                    } else {
                        return 6406;
                    }
                } else {
                    return 6408;
                }
            } else {
                return 6407;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5194[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V", line = 109)
    public class330() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2791(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 23);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2792(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 49;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 34;
                    break;
                default:
                    var10005 = 23;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
