import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class58 {

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "J")
    public long field1133 = 0L;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "[I")
    public static int[] field1122 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field1132 = 0;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Lob;")
    private static class141 field1131 = class175.method1195(40, "glow3:");

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Lob;")
    public static class141 field1125 = field1131;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "Lob;")
    public static class141 field1134 = field1131;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "Lob;")
    public static class141 field1140 = class175.method1195(40, "headicons_prayer");

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "Lob;")
    public static class141 field1141 = class175.method1195(40, "Benutzen");

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public int field1130;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public int field1137;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "Laa;")
    public class2 field1135;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "Laa;")
    public class2 field1139;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "Li;")
    public static class80 field1142;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILob;Z)V")
    public static final void method390(int arg0, class141 arg1, boolean arg2) {
        int var3 = arg0;
        class141 var4 = arg1.method914((byte) -78);
        short[] var5 = new short[16];
        field1126++;
        for (int var6 = 0; var6 < class66.field1282; var6++) {
            class50 var9 = class96.method645((byte) -61, var6);
            if ((!arg2 || var9.field928) && var9.field937.method914((byte) 37).method910(var4, (byte) 124) != -1) {
                if (var3 >= 250) {
                    class95.field1891 = -1;
                    class88.field1752 = null;
                    return;
                }
                if (var3 >= var5.length) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var3; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var3++] = (short) var6;
            }
        }
        class214.field4090 = 0;
        class88.field1752 = var5;
        class95.field1891 = var3;
        class141[] var7 = new class141[class95.field1891];
        for (int var8 = 0; var8 < class95.field1891; var8++) {
            var7[var8] = class96.method645((byte) -61, var5[var8]).field937;
        }
        class108.method717(var7, class88.field1752, true);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z[BI)I")
    public static final int method391(boolean arg0, byte[] arg1, int arg2) {
        if (arg0) {
            field1131 = null;
        }
        field1128++;
        return class25.method176(arg1, arg2, -17062, 0);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static void method392(int arg0) {
        field1125 = null;
        if (arg0 != 24711) {
            field1141 = null;
        }
        field1140 = null;
        field1134 = null;
        field1131 = null;
        field1142 = null;
        field1122 = null;
        field1141 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V")
    public static final void method393(int arg0, int arg1, int arg2) {
        class153 var3 = class131.field2506[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field2936 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Z")
    public static final boolean method394(int arg0, int arg1) {
        field1124++;
        if (arg0 < arg1) {
            return false;
        }
        int var2 = class157.field3026[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1003;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIB)V")
    public static final void method395(int arg0, int arg1, byte arg2) {
        int var3 = -90 / ((arg2 - 70) / 36);
        class17.field298++;
        field1127++;
        class7.field120.method32(131, 12885);
        class7.field120.method1009(-117, arg0);
        class7.field120.method986(arg1, false);
    }
}
