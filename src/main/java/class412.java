import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class412 {

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    public int field6082 = -1;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public int field6084 = -1;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6086 = new String[] { method3210(method3209("%hX|c")), method3210(method3209(".6X\u00116")), method3210(method3209("03\u001a>")), method3210(method3209(".6X\u00106")), method3210(method3209(".6X\u00136")) };

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "[I")
    public static int[] field6080 = new int[6];

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "[I")
    public int[] field6079;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V", line = 6)
    public static void method3206(byte arg0) {
        try {
            if (arg0 != 56) {
                field6080 = null;
            }
            field6080 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6086[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lib;I)V", line = 21)
    public final void method3207(class163 arg0, int arg1) {
        try {
            while (true) {
                int var3 = arg0.method1455((byte) 62);
                if (var3 == 0) {
                    field6083++;
                    if (arg1 != 0) {
                        this.field6082 = 73;
                        return;
                    }
                    return;
                }
                this.method3208(var3, arg0, (byte) -117);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6086[1] + (arg0 == null ? field6086[2] : field6086[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILib;B)V", line = 54)
    private final void method3208(int arg0, class163 arg1, byte arg2) {
        try {
            if (arg2 > -114) {
                this.method3207(null, 66);
            }
            if (arg0 == 1) {
                this.field6084 = arg1.method1445((byte) 110);
            } else if (arg0 == 2) {
                this.field6079 = new int[arg1.method1455((byte) 62)];
                for (int var4 = 0; var4 < this.field6079.length; var4++) {
                    this.field6079[var4] = arg1.method1445((byte) 119);
                }
            } else if (arg0 == 3) {
                this.field6082 = arg1.method1455((byte) 62);
            }
            field6081++;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6086[3] + arg0 + ',' + (arg1 == null ? field6086[2] : field6086[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3209(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3210(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 94;
                    break;
                case 1:
                    var10005 = 70;
                    break;
                case 2:
                    var10005 = 118;
                    break;
                case 3:
                    var10005 = 82;
                    break;
                default:
                    var10005 = 30;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
