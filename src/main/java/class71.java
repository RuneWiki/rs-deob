import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class71 extends class46 {

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "[I")
    private int[] field1184 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public int field1187 = -1;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "Z")
    public boolean field1196 = false;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "Lmb;")
    public static class132 field1177 = class166.method1092("mapdots", 127);

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "Lmb;")
    public static class132 field1195 = class166.method1092("::gc", 124);

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "[I")
    public static int[] field1188 = new int[128];

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    public static int field1198 = 0;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "Lmb;")
    private static class132 field1200 = class166.method1092("Loading wordpack )2 ", 124);

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "Lmb;")
    public static class132 field1181 = field1200;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    public static int field1201 = 0;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "Loc;")
    public static class155 field1199;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "[I")
    private int[] field1180;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "[Lhh;")
    public static class85[] field1179;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "[S")
    private short[] field1176;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "[S")
    private short[] field1178;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "[S")
    private short[] field1186;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "[S")
    private short[] field1191;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)Z")
    public final boolean method431(int arg0) {
        field1182++;
        if (this.field1180 == null) {
            return true;
        }
        if (arg0 != 1664) {
            field1181 = null;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1180.length; var3++) {
            if (!class168.field3085.method1091(-118, 0, this.field1180[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)Lgj;")
    public final class76 method432(byte arg0) {
        class76[] var2 = new class76[5];
        int var3 = 0;
        field1189++;
        if (arg0 != 72) {
            return null;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1184[var4] != -1) {
                var2[var3++] = class76.method466(class168.field3085, this.field1184[var4], 0);
            }
        }
        class76 var5 = new class76(var2, var3);
        if (this.field1176 != null) {
            for (int var6 = 0; var6 < this.field1176.length; var6++) {
                var5.method465(this.field1176[var6], this.field1178[var6]);
            }
        }
        if (this.field1191 != null) {
            for (int var7 = 0; var7 < this.field1191.length; var7++) {
                var5.method453(this.field1191[var7], this.field1186[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZII)I")
    public static final int method433(boolean arg0, int arg1, int arg2) {
        field1192++;
        if (arg0) {
            field1188 = null;
        }
        int var3 = arg2 + arg1 * 57;
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(B)[Lhh;")
    public static final class85[] method434(byte arg0) {
        if (arg0 != 73) {
            return null;
        }
        field1183++;
        class85[] var1 = new class85[class235.field4248];
        for (int var2 = 0; var2 < class235.field4248; var2++) {
            var1[var2] = new class188(class153.field2792, class140.field2619, class23.field321[var2], class30.field462[var2], class94.field1657[var2], class153.field2793[var2], class10.field109[var2], class118.field2244);
        }
        class187.method1193(1);
        return var1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILkd;)V")
    public final void method435(int arg0, class112 arg1) {
        while (true) {
            int var3 = arg1.method716(-1308);
            if (var3 == 0) {
                field1193++;
                if (arg0 != -9437) {
                    field1181 = null;
                    return;
                }
                return;
            }
            this.method437(-5948, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(B)V")
    public static void method436(byte arg0) {
        field1199 = null;
        field1179 = null;
        field1195 = null;
        field1188 = null;
        field1181 = null;
        field1200 = null;
        field1177 = null;
        if (arg0 != -104) {
            field1198 = 116;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILkd;)V")
    private final void method437(int arg0, int arg1, class112 arg2) {
        if (arg0 != -5948) {
            return;
        }
        if (arg1 == 1) {
            this.field1187 = arg2.method716(-1308);
        } else if (arg1 == 2) {
            int var8 = arg2.method716(-1308);
            this.field1180 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1180[var9] = arg2.method739(118);
            }
        } else if (arg1 == 3) {
            this.field1196 = true;
        } else if (arg1 == 40) {
            int var6 = arg2.method716(-1308);
            this.field1178 = new short[var6];
            this.field1176 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1176[var7] = (short) arg2.method739(-125);
                this.field1178[var7] = (short) arg2.method739(class122.method804(arg0, 5957));
            }
        } else if (arg1 == 41) {
            int var4 = arg2.method716(-1308);
            this.field1186 = new short[var4];
            this.field1191 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1191[var5] = (short) arg2.method739(arg0 + 5961);
                this.field1186[var5] = (short) arg2.method739(95);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1184[arg1 - 60] = arg2.method739(arg0 + 6024);
        }
        field1197++;
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(B)Lgj;")
    public final class76 method438(byte arg0) {
        field1190++;
        if (this.field1180 == null) {
            return null;
        }
        class76[] var2 = new class76[this.field1180.length];
        if (arg0 != -64) {
            this.field1178 = null;
        }
        for (int var3 = 0; var3 < this.field1180.length; var3++) {
            var2[var3] = class76.method466(class168.field3085, this.field1180[var3], 0);
        }
        class76 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class76(var2, var2.length);
        }
        if (this.field1176 != null) {
            for (int var5 = 0; var5 < this.field1176.length; var5++) {
                var4.method465(this.field1176[var5], this.field1178[var5]);
            }
        }
        if (this.field1191 != null) {
            for (int var6 = 0; var6 < this.field1191.length; var6++) {
                var4.method453(this.field1191[var6], this.field1186[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)Z")
    public final boolean method439(int arg0) {
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field1184[var3] != -1 && !class168.field3085.method1091(-107, 0, this.field1184[var3])) {
                var2 = false;
            }
        }
        field1185++;
        return var2;
    }
}
