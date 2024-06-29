import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class89 extends class171 {

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "[I")
    public int[] field1230 = new int[5];

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "[Lgg;")
    public class198[] field1226 = new class198[5];

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
    public int field1245 = 0;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
    public int field1241;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public int field1229;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
    public int field1247;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "Lh;")
    public static class278 field1233 = new class278(5000);

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public static int field1253 = 0;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public int field1224;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public int field1232;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
    public int field1240;

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "Lqg;")
    public class106 field1225;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "Ltg;")
    public class186 field1246;

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "Lvi;")
    public class197 field1244;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "Lmd;")
    public class228 field1235;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "Lhc;")
    public static class235 field1251;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "Lwd;")
    public class23 field1237;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "Le;")
    public class66 field1243;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "Ljd;")
    public class89 field1249;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "Z")
    public boolean field1222;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "Z")
    public boolean field1236;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "Z")
    public boolean field1239;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "Z")
    public static boolean field1250;

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(III)V")
    public class89(int arg0, int arg1, int arg2) {
        this.field1241 = arg1;
        this.field1247 = this.field1229 = arg0;
        this.field1223 = arg2;
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
    public static void method565(int arg0) {
        if (arg0 != 1) {
            field1252 = -99;
        }
        field1251 = null;
        field1233 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)I")
    public static final int method566(byte arg0, int arg1) {
        field1242++;
        if (arg1 < 0) {
            return 0;
        }
        class69 var2 = (class69) class75.field1051.method23(216, (long) arg1);
        if (var2 == null) {
            return class22.method163(arg1, 126).field1926;
        }
        int var3 = 0;
        int var4 = 75 % ((arg0 - 22) / 60);
        for (int var5 = 0; var5 < var2.field941.length; var5++) {
            if (var2.field941[var5] == -1) {
                var3++;
            }
        }
        return var3 + (class22.method163(arg1, 124).field1926 - var2.field941.length);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I")
    public static final int method567(int arg0, int arg1) {
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        field1238++;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (arg1 != -1989) {
            method565(42);
        }
        return var6 + 1;
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)I")
    public static final int method568(int arg0) {
        if (arg0 != -20891) {
            field1248 = 70;
        }
        field1234++;
        return 0;
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V")
    public static final void method569(int arg0) {
        boolean var1 = false;
        if (arg0 != 1) {
            field1253 = 119;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class68.field925 - 1; var2++) {
                if (class221.field3306[var2] < 1000 && class221.field3306[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class41.field612[var2];
                    class41.field612[var2] = class41.field612[var2 + 1];
                    class41.field612[var2 + 1] = var3;
                    String var4 = class285.field4468[var2];
                    class285.field4468[var2] = class285.field4468[var2 + 1];
                    class285.field4468[var2 + 1] = var4;
                    int var5 = class219.field3299[var2];
                    class219.field3299[var2] = class219.field3299[var2 + 1];
                    class219.field3299[var2 + 1] = var5;
                    int var6 = class144.field2001[var2];
                    class144.field2001[var2] = class144.field2001[var2 + 1];
                    class144.field2001[var2 + 1] = var6;
                    int var7 = class227.field3444[var2];
                    class227.field3444[var2] = class227.field3444[var2 + 1];
                    class227.field3444[var2 + 1] = var7;
                    short var8 = class221.field3306[var2];
                    class221.field3306[var2] = class221.field3306[var2 + 1];
                    class221.field3306[var2 + 1] = var8;
                    long var9 = class278.field4316[var2];
                    class278.field4316[var2] = class278.field4316[var2 + 1];
                    class278.field4316[var2 + 1] = var9;
                }
            }
        }
        field1227++;
    }
}
