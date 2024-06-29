import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class131 extends class67 {

    @OriginalMember(owner = "client!ve", name = "Z", descriptor = "[Lea;")
    public class25[] field3168;

    @OriginalMember(owner = "client!ve", name = "ab", descriptor = "I")
    public static int field3169 = -1;

    @OriginalMember(owner = "client!ve", name = "fb", descriptor = "Lgd;")
    public static class40 field3174 = class14.method90(false, "(U4");

    @OriginalMember(owner = "client!ve", name = "ib", descriptor = "[I")
    public static int[] field3177 = new int[50];

    @OriginalMember(owner = "client!ve", name = "jb", descriptor = "[Lgd;")
    public static class40[] field3178 = new class40[500];

    @OriginalMember(owner = "client!ve", name = "Y", descriptor = "Lgd;")
    public static class40 field3167 = class14.method90(false, "title)3jpg");

    @OriginalMember(owner = "client!ve", name = "eb", descriptor = "Lgd;")
    public static class40 field3173 = class14.method90(false, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!ve", name = "lb", descriptor = "I")
    public static int field3180 = -1;

    @OriginalMember(owner = "client!ve", name = "mb", descriptor = "I")
    public static int field3181 = 0;

    @OriginalMember(owner = "client!ve", name = "kb", descriptor = "Loe;")
    public static class89 field3179 = new class89();

    @OriginalMember(owner = "client!ve", name = "ob", descriptor = "Z")
    public static boolean field3183 = false;

    @OriginalMember(owner = "client!ve", name = "pb", descriptor = "I")
    public static int field3184 = 1;

    @OriginalMember(owner = "client!ve", name = "qb", descriptor = "Lgd;")
    public static class40 field3185 = class14.method90(false, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!ve", name = "tb", descriptor = "[I")
    public static int[] field3188 = new int[25];

    @OriginalMember(owner = "client!ve", name = "ub", descriptor = "I")
    public static int field3189 = 0;

    @OriginalMember(owner = "client!ve", name = "bb", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!ve", name = "cb", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!ve", name = "db", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!ve", name = "gb", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!ve", name = "hb", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!ve", name = "nb", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!ve", name = "sb", descriptor = "Loc;")
    public static class86 field3187;

    @OriginalMember(owner = "client!ve", name = "rb", descriptor = "[[[B")
    public static byte[][][] field3186;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLrb;II)Lhe;", line = 14)
    public static final class47 method1035(byte arg0, class103 arg1, int arg2, int arg3) {
        field3172++;
        if (class126.method1000(arg2, arg1, arg3, true)) {
            return arg0 == -114 ? class91.method606((byte) -42) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V", line = 33)
    public static void method1036(int arg0) {
        if (arg0 != -1) {
            field3184 = -123;
        }
        field3185 = null;
        field3173 = null;
        field3177 = null;
        field3186 = null;
        field3187 = null;
        field3178 = null;
        field3174 = null;
        field3167 = null;
        field3179 = null;
        field3188 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)Z", line = 66)
    public final boolean method1037(byte arg0, int arg1) {
        field3182++;
        if (arg0 != 26) {
            field3178 = null;
        }
        return this.field3168[arg1].field591;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BII[Lgd;)Lgd;", line = 90)
    public static final class40 method1038(byte arg0, int arg1, int arg2, class40[] arg3) {
        field3170++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            if (arg3[arg1 + var5] == null) {
                arg3[arg1 + var5] = class59.field1496;
            }
            var4 += arg3[arg1 + var5].field950;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg2; var8++) {
            class40 var10 = arg3[arg1 + var8];
            class84.method556(var10.field948, 0, var6, var7, var10.field950);
            var7 += var10.field950;
        }
        class40 var9 = new class40();
        var9.field948 = var6;
        var9.field950 = var4;
        return arg0 == 59 ? var9 : null;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lrb;Lrb;IZ)V", line = 137)
    public class131(class103 arg0, class103 arg1, int arg2, boolean arg3) {
        class89 var5 = new class89();
        int var6 = arg0.method729(1, arg2);
        this.field3168 = new class25[var6];
        int[] var7 = arg0.method739(true, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method731(var7[var8], arg2, (byte) -112);
            class80 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class80 var12 = (class80) var5.method593(0); var12 != null; var12 = (class80) var5.method582(false)) {
                if (var12.field1828 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method747(0, var11, 0);
                } else {
                    var13 = arg1.method747(var11, 0, 0);
                }
                var10 = new class80(var11, var13);
                var5.method589(var10, -98);
            }
            this.field3168[var7[var8]] = new class25(var9, var10);
        }
    }
}
