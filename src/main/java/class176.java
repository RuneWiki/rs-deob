import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class176 {

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public int field2936 = -1;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public int field2937 = -1;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "Ldb;")
    public static class102 field2942 = new class102(64);

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "[I")
    public static int[] field2943 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "Lak;")
    public static class172 field2939;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "[I")
    public int[] field2941;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "[[S")
    public static short[][] field2940;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BILjj;)V", line = 4)
    public final void method1325(byte arg0, int arg1, class44 arg2) {
        field2931++;
        while (true) {
            int var4 = arg2.method286((byte) -101);
            if (var4 == 0) {
                if (arg0 != 27) {
                    field2940 = (short[][]) ((short[][]) null);
                }
                return;
            }
            this.method1329(arg2, 47, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)V", line = 34)
    public static final void method1326(int arg0, int arg1, int arg2) {
        class194.field3175.method2375(33, 0);
        int var3 = -48 / ((-arg1 - 14) / 54);
        field2934++;
        class341.field5309++;
        class194.field3175.method253(arg0, 127);
        class194.field3175.method284(arg2, -128);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljj;B)V", line = 57)
    public static final void method1327(class44 arg0, byte arg1) {
        if (arg1 <= 28) {
            field2942 = (class102) null;
        }
        field2932++;
        while (true) {
            while (arg0.field586 < arg0.field573.length) {
                int var2 = 0;
                int var3 = 0;
                boolean var4 = false;
                if (arg0.method286((byte) -104) == 1) {
                    var2 = arg0.method286((byte) -97);
                    var3 = arg0.method286((byte) -106);
                    var4 = true;
                }
                int var5 = arg0.method286((byte) -118);
                int var6 = arg0.method286((byte) -120);
                int var7 = var5 * 64 - class27.field377;
                int var8 = class74.field1048 + class93.field1276 - (var6 * 64) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && var7 + 63 < class111.field1650 && class74.field1048 > var8) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var4 || var11 >= var2 * 8 && (var2 * 8 + 8) > var11 && var3 * 8 <= var12 && var12 < (var3 * 8 + 8)) {
                                byte var13 = arg0.method246((byte) -17);
                                if (var13 != 0) {
                                    if (class280.field4520[var10][var9] == null) {
                                        class280.field4520[var10][var9] = new byte[4096];
                                    }
                                    class280.field4520[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method246((byte) -127);
                                    if (class73.field1025[var10][var9] == null) {
                                        class73.field1025[var10][var9] = new byte[4096];
                                    }
                                    class73.field1025[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var4 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method246((byte) -115);
                        if (var16 != 0) {
                            arg0.field586++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V", line = 163)
    public static void method1328(byte arg0) {
        if (arg0 > -125) {
            field2943 = (int[]) null;
        }
        field2940 = (short[][]) null;
        field2939 = null;
        field2942 = null;
        field2943 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljj;III)V", line = 182)
    private final void method1329(class44 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field2937 = arg0.method271(21081);
        } else if (arg2 == 2) {
            this.field2941 = new int[arg0.method286((byte) -77)];
            for (int var5 = 0; var5 < this.field2941.length; var5++) {
                this.field2941[var5] = arg0.method271(21081);
            }
        } else if (arg2 == 3) {
            this.field2936 = arg0.method286((byte) -99);
        }
        field2938++;
        if (arg1 <= 22) {
            this.method1325((byte) 56, 51, (class44) null);
        }
    }
}
