import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class91 {

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "[I")
    public int[] field1042;

    @OriginalMember(owner = "client!kca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1046 = new String[] { method780(method779("a9>};\"")), method780(method779("a9>}Dc46'F\"")), method780(method779("qtq}\u0005")), method780(method779("a9>}:\"")), method780(method779("d/3?")), method780(method779("a9>}9\"")) };

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "Lwia;")
    public static class790 field1040 = new class790(8, 8);

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "I")
    public static int field1044 = 0;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "[Lfs;")
    public static class581[] field1039;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "[[I")
    public static int[][] field1045;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "[[Z")
    public static boolean[][] field1038;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method776(int arg0, int arg1, int arg2) {
        try {
            if (arg2 != 8) {
                method777(-27);
            }
            field1041++;
            return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1046[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V", line = 22)
    public static void method777(int arg0) {
        try {
            field1038 = null;
            field1039 = null;
            if (arg0 == -8450) {
                field1045 = null;
                field1040 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1046[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(BLib;)V", line = 35)
    private final void method778(byte arg0, class163 arg1) {
        try {
            label29: while (true) {
                int var3 = arg1.method1455((byte) 62);
                if (var3 != 0) {
                    if (var3 != 1) {
                        continue;
                    }
                    int var4 = arg1.method1455((byte) 62);
                    this.field1042 = new int[var4];
                    int var5 = 0;
                    while (true) {
                        if (var5 >= this.field1042.length) {
                            continue label29;
                        }
                        this.field1042[var5] = arg1.method1455((byte) 62);
                        var5++;
                    }
                }
                int var6 = -47 % ((58 - arg0) / 63);
                field1043++;
                return;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1046[3] + arg0 + ',' + (arg1 == null ? field1046[4] : field1046[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lla;)V", line = 88)
    public class91(class476 arg0) {
        try {
            byte[] var2 = arg0.method3638(-84, 6);
            this.method778((byte) -55, new class163(var2));
            if (this.field1042 == null) {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1046[1] + (arg0 == null ? field1046[4] : field1046[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "()V", line = 101)
    protected class91() {
        try {
            this.field1042 = new int[0];
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1046[1] + ')');
        }
    }

    @OriginalMember(owner = "client!kca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method779(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x78);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method780(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 95;
                    break;
                case 3:
                    var10005 = 83;
                    break;
                default:
                    var10005 = 120;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
