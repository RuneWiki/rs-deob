import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class24 {

    @OriginalMember(owner = "client!db", name = "f", descriptor = "[B")
    public byte[] field568 = new byte[18002];

    @OriginalMember(owner = "client!db", name = "p", descriptor = "[Z")
    public boolean[] field578 = new boolean[16];

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public int field579 = 0;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "[[I")
    public int[][] field572 = new int[6][258];

    @OriginalMember(owner = "client!db", name = "r", descriptor = "[I")
    public int[] field580 = new int[257];

    @OriginalMember(owner = "client!db", name = "B", descriptor = "[I")
    public int[] field590 = new int[6];

    @OriginalMember(owner = "client!db", name = "u", descriptor = "[[I")
    public int[][] field583 = new int[6][258];

    @OriginalMember(owner = "client!db", name = "L", descriptor = "[[I")
    public int[][] field600 = new int[6][258];

    @OriginalMember(owner = "client!db", name = "i", descriptor = "[B")
    public byte[] field571 = new byte[256];

    @OriginalMember(owner = "client!db", name = "I", descriptor = "[Z")
    public boolean[] field597 = new boolean[256];

    @OriginalMember(owner = "client!db", name = "l", descriptor = "[[B")
    public byte[][] field574 = new byte[6][258];

    @OriginalMember(owner = "client!db", name = "O", descriptor = "[I")
    public int[] field603 = new int[16];

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public int field591 = 0;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "[B")
    public byte[] field604 = new byte[4096];

    @OriginalMember(owner = "client!db", name = "S", descriptor = "[B")
    public byte[] field607 = new byte[18002];

    @OriginalMember(owner = "client!db", name = "R", descriptor = "[I")
    public int[] field606 = new int[256];

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Lpe;")
    public static class109 field577 = class141.method1120("Begeben Sie sich in ein freies Gebiet)1 um", 0);

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field575 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lpe;")
    public static class109 field569 = class141.method1120("(Y", 0);

    @OriginalMember(owner = "client!db", name = "K", descriptor = "Lpe;")
    public static class109 field599 = class141.method1120("Benutzeroberfl-=che geladen)3", 0);

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field565 = 0;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "Lpe;")
    public static class109 field605 = class141.method1120("::rect_debug", 0);

    @OriginalMember(owner = "client!db", name = "d", descriptor = "B")
    public byte field566;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public int field563;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public int field581;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public int field586;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public int field588;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public int field601;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public int field602;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[B")
    public byte[] field567;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "[B")
    public byte[] field595;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "[I")
    public static int[] field585;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILwa;)Z")
    public static final boolean method225(int arg0, class154 arg1) {
        int var2 = arg1.field3459;
        field573++;
        if (var2 == 205) {
            class139.field3039 = 250;
            return true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class16.field405.method167(var4 == 1, 93, var3);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class16.field405.method166(3058, var5, var6 == 1);
        }
        if (~var2 == arg0) {
            class16.field405.method162((byte) 41, false);
        }
        if (var2 == 325) {
            class16.field405.method162((byte) 107, true);
        }
        if (var2 == 326) {
            class19.field476++;
            class63.field1299.method535(152, -25013);
            class16.field405.method163(class63.field1299, -98);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public static final void method226(byte arg0) {
        int var1 = 23 % ((arg0 + 61) / 60);
        field598++;
        class86.field1827.method92((byte) 126);
        class52.field1066.method92((byte) 119);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)Z")
    public static final boolean method227(byte arg0) {
        field576++;
        try {
            if (class55.field1118 == 2) {
                if (class3.field61 == null) {
                    class3.field61 = class132.method1063(class94.field2023, class128.field2840, class157.field3622);
                    if (class3.field61 == null) {
                        return false;
                    }
                }
                if (class4.field95 == null) {
                    class4.field95 = new class78(class18.field450, class144.field3159);
                }
                if (class156.field3606.method457(class121.field2676, 22050, 62, class4.field95, class3.field61)) {
                    class156.field3606.method486(16);
                    class156.field3606.method467(class48.field998, 0);
                    class156.field3606.method492(class3.field61, 0, class144.field3170);
                    class94.field2023 = null;
                    class3.field61 = null;
                    class4.field95 = null;
                    class55.field1118 = 0;
                    return true;
                }
            }
            if (arg0 <= 5) {
                method230(4);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class156.field3606.method458((byte) -120);
            class4.field95 = null;
            class55.field1118 = 0;
            class3.field61 = null;
            class94.field2023 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BIIIIII)V")
    public static final void method228(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field589++;
        int var7 = 2048 - arg2 & 0x7FF;
        int var8 = 0;
        int var9 = 2048 - arg1 & 0x7FF;
        if (arg0 != 76) {
            return;
        }
        int var10 = arg6;
        int var11 = 0;
        if (var7 != 0) {
            int var12 = class105.field2221[var7];
            int var13 = class105.field2210[var7];
            int var14 = var11 * var13 - arg6 * var12 >> 16;
            var10 = arg6 * var13 + var11 * var12 >> 16;
            var11 = var14;
        }
        if (var9 != 0) {
            int var15 = class105.field2221[var9];
            int var16 = class105.field2210[var9];
            int var17 = var8 * var16 + var10 * var15 >> 16;
            var10 = var10 * var16 - var8 * var15 >> 16;
            var8 = var17;
        }
        class154.field3518 = arg3 - var10;
        class57.field1158 = arg1;
        class102.field2149 = arg4 - var11;
        class116.field2591 = arg2;
        class85.field1795 = arg5 - var8;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Loc;")
    public static final class100 method229(int arg0) {
        field570++;
        try {
            if (arg0 >= -72) {
                field575 = -111;
            }
            return (class100) Class.forName("vd").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public static void method230(int arg0) {
        field585 = null;
        field569 = null;
        if (arg0 != 0) {
            field575 = 23;
        }
        field605 = null;
        field577 = null;
        field599 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lha;IBI)V")
    public static final void method231(class50 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 15) {
            return;
        }
        if (arg0.field3124 == arg1 && arg1 != -1) {
            int var4 = class27.method238(arg2 ^ 0x7, arg1).field147;
            if (var4 == 1) {
                arg0.field3122 = 0;
                arg0.field3081 = arg3;
                arg0.field3063 = 0;
                arg0.field3083 = 0;
            }
            if (var4 == 2) {
                arg0.field3063 = 0;
            }
        } else if (arg1 == -1 || arg0.field3124 == -1 || class27.method238(arg2 - 7, arg1).field163 >= class27.method238(arg2 ^ 0x7, arg0.field3124).field163) {
            arg0.field3110 = arg0.field3080;
            arg0.field3081 = arg3;
            arg0.field3063 = 0;
            arg0.field3124 = arg1;
            arg0.field3122 = 0;
            arg0.field3083 = 0;
        }
        field587++;
    }
}
