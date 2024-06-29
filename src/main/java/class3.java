import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field174 = 0;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Ljd;")
    public static class92 field168 = class202.method1325((byte) 90, "scrollbar");

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "Ljd;")
    private static class92 field183 = class202.method1325((byte) 90, "Password: ");

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Ljd;")
    private static class92 field179 = class202.method1325((byte) 90, "This computers address has been blocked");

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Ljd;")
    private static class92 field185 = class202.method1325((byte) 90, "Loading textures )2 ");

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field170 = 50;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field186 = 0;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field182 = 0;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "Ljd;")
    public static class92 field188 = field179;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Ljd;")
    public static class92 field178 = field183;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "Ljd;")
    public static class92 field187 = field185;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Ljd;")
    public static class92 field172 = class202.method1325((byte) 90, "");

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Ljd;")
    public static class92 field169 = field172;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Ljd;")
    public static class92 field184 = field172;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Ljd;")
    public static class92 field175 = field172;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Ljd;")
    public static class92 field173 = field172;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Ljd;")
    public static class92 field171 = field172;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Ljd;")
    public static class92 field181 = field172;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Lbg;")
    public static class18 field176 = new class18();

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Ljd;")
    public static class92 field189 = class202.method1325((byte) 90, "");

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "Ljd;")
    public static class92 field190 = field189;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILa;)V")
    public static final void method21(int arg0, class1 arg1) {
        if (arg0 != 26702) {
            method23((byte) -76);
        }
        if (class156.field3098 == arg1.field135) {
            class55.field1143[arg1.field39] = true;
        }
        field180++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZB)V")
    public static final void method22(boolean arg0, byte arg1) {
        class100.field2057 = arg0;
        field177++;
        if (arg1 != -45) {
            method23((byte) -66);
        }
        if (!class100.field2057) {
            int var25 = (class148.field2930 - class185.field3497.field1472) / 16;
            class113.field2275 = new int[var25][4];
            for (int var26 = 0; var26 < var25; var26++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class113.field2275[var26][var37] = class185.field3497.method451(arg1 + 102);
                }
            }
            int var27 = class185.field3497.method443(255);
            int var28 = class185.field3497.method442(-21351);
            int var29 = class185.field3497.method465(255);
            boolean var30 = false;
            int var31 = class185.field3497.method425((byte) -101);
            int var32 = class185.field3497.method425((byte) -101);
            class195.field3806 = new byte[var25][];
            class175.field3384 = new byte[var25][];
            class104.field2140 = new int[var25];
            if ((var28 / 8 == 48 || var28 / 8 == 49) && var32 / 8 == 48) {
                var30 = true;
            }
            class208.field3992 = new int[var25];
            if (var28 / 8 == 48 && var32 / 8 == 148) {
                var30 = true;
            }
            class92.field1850 = new int[var25];
            int var33 = 0;
            for (int var34 = (var28 - 6) / 8; var34 <= (var28 + 6) / 8; var34++) {
                for (int var35 = (var32 - 6) / 8; var35 <= (var32 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (!var30 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class92.field1850[var33] = var36;
                        class208.field3992[var33] = class182.field3462.method880(class77.method529(-3, new class92[] { class172.field3346, class142.method938(var34, false), class100.field2055, class142.method938(var35, false) }), false);
                        class104.field2140[var33] = class182.field3462.method880(class77.method529(-3, new class92[] { class179.field3435, class142.method938(var34, false), class100.field2055, class142.method938(var35, false) }), false);
                        var33++;
                    }
                }
            }
            class165.method1066(false, var28, var32, var31, var27, var29);
            return;
        }
        int var2 = class185.field3497.method465(255);
        int var3 = class185.field3497.method414((byte) -16);
        int var4 = class185.field3497.method411(124);
        int var5 = class185.field3497.method425((byte) -101);
        int var6 = class185.field3497.method442(-21351);
        class185.field3497.method407(0);
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class185.field3497.method408((byte) -32, 1);
                    if (var24 == 1) {
                        class10.field360[var7][var22][var23] = class185.field3497.method408((byte) -32, 26);
                    } else {
                        class10.field360[var7][var22][var23] = -1;
                    }
                }
            }
        }
        class185.field3497.method406(8);
        int var8 = (class148.field2930 - class185.field3497.field1472) / 16;
        class113.field2275 = new int[var8][4];
        for (int var9 = 0; var9 < var8; var9++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class113.field2275[var9][var21] = class185.field3497.method451(75);
            }
        }
        class92.field1850 = new int[var8];
        class175.field3384 = new byte[var8][];
        class104.field2140 = new int[var8];
        class195.field3806 = new byte[var8][];
        class208.field3992 = new int[var8];
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 13; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    int var14 = class10.field360[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = var14 >> 14 & 0x3FF;
                        int var16 = var14 >> 3 & 0x7FF;
                        int var17 = (var15 / 8 << 8) + var16 / 8;
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class92.field1850[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            class92.field1850[var10] = var17;
                            int var19 = var17 >> 8 & 0xFF;
                            int var20 = var17 & 0xFF;
                            class208.field3992[var10] = class182.field3462.method880(class77.method529(arg1 + 42, new class92[] { class172.field3346, class142.method938(var19, false), class100.field2055, class142.method938(var20, false) }), false);
                            class104.field2140[var10] = class182.field3462.method880(class77.method529(class98.method685(arg1, 46), new class92[] { class179.field3435, class142.method938(var19, false), class100.field2055, class142.method938(var20, false) }), false);
                            var10++;
                        }
                    }
                }
            }
        }
        class165.method1066(false, var3, var6, var5, var4, var2);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method23(byte arg0) {
        field172 = null;
        field183 = null;
        if (arg0 <= 39) {
            method23((byte) -112);
        }
        field169 = null;
        field179 = null;
        field184 = null;
        field188 = null;
        field175 = null;
        field176 = null;
        field189 = null;
        field171 = null;
        field178 = null;
        field190 = null;
        field181 = null;
        field168 = null;
        field187 = null;
        field185 = null;
        field173 = null;
    }
}
