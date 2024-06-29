import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class97 {

    @OriginalMember(owner = "client!oia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1098 = new String[] { method817(method816("}@*ft:")), method817(method816("}@*fw:")), method817(method816("i\u0007efH")), method817(method816("|\\'$")), method817(method816("}@*fv:")) };

    @OriginalMember(owner = "client!oia", name = "d", descriptor = "[I")
    public static int[] field1092 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!oia", name = "e", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "I")
    public int field1094;

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!oia", name = "f", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "[Ljl;")
    public class285[] field1096;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILib;Lvaa;)Ljl;")
    private final class285 method813(int arg0, class163 arg1, class494 arg2) {
        try {
            field1097++;
            if (class494.field7099 == arg2) {
                return class548.method4133(arg1, (byte) -74);
            } else if (class417.field6138 == arg2) {
                return class331.method2793((byte) -108, arg1);
            } else if (class149.field1834 == arg2) {
                return class152.method1275(true, arg1);
            } else if (class67.field710 == arg2) {
                return class90.method773(arg1, 1);
            } else if (class625.field9136 == arg2) {
                return class452.method3466(-108, arg1);
            } else if (class235.field3540 == arg2) {
                return class710.method5181(120, arg1);
            } else {
                if (arg0 != -31213) {
                    method814(43);
                }
                if (class638.field9279 == arg2) {
                    return class424.method3274(arg1, arg0 ^ 0xFFFF866D);
                } else if (class724.field10464 == arg2) {
                    return class475.method3607((byte) -110, arg1);
                } else if (class759.field11002 == arg2) {
                    return class594.method4422((byte) -110, arg1);
                } else if (class544.field8132 == arg2) {
                    return class251.method2125(false, arg1);
                } else {
                    return null;
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1098[1] + arg0 + ',' + (arg1 == null ? field1098[3] : field1098[2]) + ',' + (arg2 == null ? field1098[3] : field1098[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)V")
    public static void method814(int arg0) {
        try {
            if (arg0 != 0) {
                field1092 = null;
            }
            field1092 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1098[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lib;I)V")
    public final void method815(class163 arg0, int arg1) {
        try {
            field1093++;
            this.field1095 = arg0.method1436((byte) 110);
            this.field1094 = arg0.method1445((byte) 112);
            this.field1096 = new class285[arg0.method1455((byte) 62)];
            class494[] var3 = class239.method2049((byte) 118);
            for (int var4 = 0; var4 < this.field1096.length; var4++) {
                this.field1096[var4] = this.method813(arg1 - 31215, arg0, var3[arg0.method1455((byte) 62)]);
            }
            if (arg1 != 2) {
                this.method813(54, null, null);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1098[4] + (arg0 == null ? field1098[3] : field1098[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method816(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method817(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 18;
                    break;
                case 1:
                    var10005 = 41;
                    break;
                case 2:
                    var10005 = 75;
                    break;
                case 3:
                    var10005 = 72;
                    break;
                default:
                    var10005 = 53;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
