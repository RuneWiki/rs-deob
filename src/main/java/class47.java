import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 extends class124 {

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "[Ln;")
    public class90[] field974;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "Lpe;")
    private static class109 field976 = class141.method1120("Drop", 0);

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "Lpe;")
    public static class109 field977 = field976;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "Lpe;")
    public static class109 field986 = class141.method1120("gr-Un:", 0);

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "Z")
    public static boolean field984 = false;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    public static int field985 = 0;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "[[I")
    public static int[][] field987 = new int[104][104];

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "[Lk;")
    public static class69[] field983;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "[Z")
    public static boolean[] field981;

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lna;Lna;IZ)V")
    public class47(class91 arg0, class91 arg1, int arg2, boolean arg3) {
        class19 var5 = new class19();
        int var6 = arg0.method754(arg2, (byte) -119);
        this.field974 = new class90[var6];
        int[] var7 = arg0.method749(arg2, -1);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class60 var9 = null;
            byte[] var10 = arg0.method742(var7[var8], -9, arg2);
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            for (class60 var12 = (class60) var5.method195((byte) 120); var12 != null; var12 = (class60) var5.method198((byte) -113)) {
                if (var12.field1173 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method764((byte) -69, var11, 0);
                } else {
                    var13 = arg1.method764((byte) 117, 0, var11);
                }
                var9 = new class60(var11, var13);
                var5.method188(-2, var9);
            }
            this.field974[var7[var8]] = new class90(var10, var9);
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
    public static void method414(int arg0) {
        field977 = null;
        field986 = null;
        if (arg0 == -10354) {
            field981 = null;
            field976 = null;
            field983 = null;
            field987 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([BI)V")
    public static final void method415(byte[] arg0, int arg1) {
        class13 var2 = new class13(arg0);
        var2.field309 = arg0.length - 2;
        field982++;
        class88.field1870 = var2.method105(arg1 + 1375221239);
        class57.field1142 = new int[class88.field1870];
        class92.field1970 = new byte[class88.field1870][];
        class120.field2668 = new int[class88.field1870];
        class107.field2246 = new int[class88.field1870];
        class152.field3342 = new int[class88.field1870];
        var2.field309 = arg0.length - class88.field1870 * 8 - 7;
        client.field519 = var2.method105(1375221240);
        class61.field1225 = var2.method105(1375221240);
        int var3 = (var2.method142(27467) & 0xFF) + 1;
        for (int var4 = 0; var4 < class88.field1870; var4++) {
            class107.field2246[var4] = var2.method105(1375221240);
        }
        for (int var5 = 0; var5 < class88.field1870; var5++) {
            class152.field3342[var5] = var2.method105(1375221240);
        }
        for (int var6 = 0; var6 < class88.field1870; var6++) {
            class57.field1142[var6] = var2.method105(1375221240);
        }
        for (int var7 = 0; var7 < class88.field1870; var7++) {
            class120.field2668[var7] = var2.method105(1375221240);
        }
        var2.field309 = arg0.length - class88.field1870 * 8 - (var3 + -1) * 3 - 7;
        class131.field2879 = new int[var3];
        for (int var8 = arg1; var8 < var3; var8++) {
            class131.field2879[var8] = var2.method149(true);
            if (class131.field2879[var8] == 0) {
                class131.field2879[var8] = 1;
            }
        }
        var2.field309 = 0;
        for (int var9 = 0; var9 < class88.field1870; var9++) {
            int var10 = class57.field1142[var9];
            int var11 = class120.field2668[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class92.field1970[var9] = var13;
            int var14 = var2.method142(27467);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method131(false);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method131(false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V")
    public static final void method416(byte arg0) {
        field979++;
        int var1 = class82.field1733.method526((byte) 127, 8);
        if (arg0 <= 16) {
            field986 = null;
        }
        if (var1 < class44.field927) {
            for (int var2 = var1; var2 < class44.field927; var2++) {
                class118.field2626[class61.field1198++] = class92.field1973[var2];
            }
        }
        if (class44.field927 < var1) {
            throw new RuntimeException("gppov1");
        }
        class44.field927 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class92.field1973[var3];
            class50 var5 = class104.field2194[var4];
            int var6 = class82.field1733.method526((byte) 127, 1);
            if (var6 == 0) {
                class92.field1973[class44.field927++] = var4;
                var5.field3119 = class12.field264;
            } else {
                int var7 = class82.field1733.method526((byte) 127, 2);
                if (var7 == 0) {
                    class92.field1973[class44.field927++] = var4;
                    var5.field3119 = class12.field264;
                    class84.field1784[class42.field869++] = var4;
                } else if (var7 == 1) {
                    class92.field1973[class44.field927++] = var4;
                    var5.field3119 = class12.field264;
                    int var8 = class82.field1733.method526((byte) 127, 3);
                    var5.method1127(-29576, false, var8);
                    int var9 = class82.field1733.method526((byte) 127, 1);
                    if (var9 == 1) {
                        class84.field1784[class42.field869++] = var4;
                    }
                } else if (var7 == 2) {
                    class92.field1973[class44.field927++] = var4;
                    var5.field3119 = class12.field264;
                    int var10 = class82.field1733.method526((byte) 127, 3);
                    var5.method1127(-29576, true, var10);
                    int var11 = class82.field1733.method526((byte) 127, 3);
                    var5.method1127(-29576, true, var11);
                    int var12 = class82.field1733.method526((byte) 127, 1);
                    if (var12 == 1) {
                        class84.field1784[class42.field869++] = var4;
                    }
                } else if (var7 == 3) {
                    class118.field2626[class61.field1198++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)Z")
    public final boolean method417(int arg0, int arg1) {
        field980++;
        if (arg1 != -1) {
            field987 = null;
        }
        return this.field974[arg0].field1895;
    }
}
