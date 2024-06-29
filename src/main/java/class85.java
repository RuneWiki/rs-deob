import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class85 extends class67 {

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "Lgd;")
    private static class40 field1889 = class14.method90(false, "Loaded textures");

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "Lgd;")
    public static class40 field1895 = class14.method90(false, ":chalreq:");

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "Lgd;")
    public static class40 field1890 = class14.method90(false, "welle2:");

    @OriginalMember(owner = "client!ob", name = "ib", descriptor = "Lgd;")
    private static class40 field1898 = class14.method90(false, "Loaded title screen");

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "Lgd;")
    private static class40 field1894 = class14.method90(false, "Accept challenge");

    @OriginalMember(owner = "client!ob", name = "ob", descriptor = "Lgd;")
    public static class40 field1904 = field1898;

    @OriginalMember(owner = "client!ob", name = "pb", descriptor = "Lgd;")
    private static class40 field1905 = class14.method90(false, "Please remove ");

    @OriginalMember(owner = "client!ob", name = "kb", descriptor = "Lgd;")
    public static class40 field1900 = field1894;

    @OriginalMember(owner = "client!ob", name = "jb", descriptor = "Lgd;")
    public static class40 field1899 = class14.method90(false, "@yel@*V");

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "Lgd;")
    public static class40 field1896 = field1905;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "Lgd;")
    public static class40 field1891 = class14.method90(false, "Fallen lassen");

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "Lgd;")
    public static class40 field1888 = field1905;

    @OriginalMember(owner = "client!ob", name = "qb", descriptor = "Lgd;")
    public static class40 field1906 = field1889;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "B")
    public byte field1892;

    @OriginalMember(owner = "client!ob", name = "nb", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!ob", name = "rb", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!ob", name = "sb", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!ob", name = "hb", descriptor = "Lrb;")
    public static class103 field1897;

    @OriginalMember(owner = "client!ob", name = "lb", descriptor = "Lw;")
    public class135 field1901;

    @OriginalMember(owner = "client!ob", name = "mb", descriptor = "Lmb;")
    public static class73 field1902;

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "[Lgd;")
    public static class40[] field1893;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZB)V", line = 34)
    public static final void method557(boolean arg0, byte arg1) {
        if (arg1 > -30) {
            field1900 = null;
        }
        field1907++;
        class77.field1790 = arg0;
        if (!class77.field1790) {
            int var2 = class100.field2376.method757((byte) 112);
            int var3 = class100.field2376.method810((byte) -114);
            int var4 = class100.field2376.method760((byte) 82);
            int var5 = class100.field2376.method797(-7916);
            int var6 = class100.field2376.method798((byte) -69);
            int var7 = (class51.field1305 - class100.field2376.field2563) / 16;
            class120.field2815 = new int[var7][4];
            for (int var8 = 0; var8 < var7; var8++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class120.field2815[var8][var14] = class100.field2376.method774(-29404);
                }
            }
            class91.field2077 = new byte[var7][];
            class24.field567 = new int[var7];
            class113.field2725 = new int[var7];
            boolean var9 = false;
            if ((var4 / 8 == 48 || var4 / 8 == 49) && var2 / 8 == 48) {
                var9 = true;
            }
            class66.field1615 = new byte[var7][];
            class113.field2733 = new int[var7];
            if (var4 / 8 == 48 && var2 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var4 - 6) / 8; var11 <= (var4 + 6) / 8; var11++) {
                for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class113.field2733[var10] = var13;
                        class24.field567[var10] = class80.field1826.method749(client.method114(true, new class40[] { class41.field1025, class21.method121(23444, var11), class87.field1952, class21.method121(23444, var12) }), 1);
                        class113.field2725[var10] = class80.field1826.method749(client.method114(true, new class40[] { class50.field1286, class21.method121(23444, var11), class87.field1952, class21.method121(23444, var12) }), 1);
                        var10++;
                    }
                }
            }
            class7.method42(var6, (byte) -66, var2, var5, var3, var4);
            return;
        }
        int var15 = class100.field2376.method797(-7916);
        int var16 = class100.field2376.method797(-7916);
        int var17 = class100.field2376.method797(-7916);
        int var18 = class100.field2376.method797(-7916);
        class100.field2376.method292(-123);
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = class100.field2376.method298(1, 19600);
                    if (var37 == 1) {
                        class24.field554[var19][var35][var36] = class100.field2376.method298(26, 19600);
                    } else {
                        class24.field554[var19][var35][var36] = -1;
                    }
                }
            }
        }
        class100.field2376.method289((byte) -58);
        int var20 = (class51.field1305 - class100.field2376.field2563) / 16;
        class120.field2815 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var34 = 0; var34 < 4; var34++) {
                class120.field2815[var21][var34] = class100.field2376.method764(-2);
            }
        }
        int var22 = class100.field2376.method758(97);
        class113.field2733 = new int[var20];
        class91.field2077 = new byte[var20][];
        class24.field567 = new int[var20];
        class113.field2725 = new int[var20];
        class66.field1615 = new byte[var20][];
        int var23 = 0;
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    int var27 = class24.field554[var24][var25][var26];
                    if (var27 != -1) {
                        int var28 = var27 >> 14 & 0x3FF;
                        int var29 = var27 >> 3 & 0x7FF;
                        int var30 = (var28 / 8 << 8) + var29 / 8;
                        for (int var31 = 0; var31 < var23; var31++) {
                            if (class113.field2733[var31] == var30) {
                                var30 = -1;
                                break;
                            }
                        }
                        if (var30 != -1) {
                            int var32 = var30 >> 8 & 0xFF;
                            int var33 = var30 & 0xFF;
                            class113.field2733[var23] = var30;
                            class24.field567[var23] = class80.field1826.method749(client.method114(true, new class40[] { class41.field1025, class21.method121(23444, var32), class87.field1952, class21.method121(23444, var33) }), 1);
                            class113.field2725[var23] = class80.field1826.method749(client.method114(true, new class40[] { class50.field1286, class21.method121(23444, var32), class87.field1952, class21.method121(23444, var33) }), 1);
                            var23++;
                        }
                    }
                }
            }
        }
        class7.method42(var22, (byte) -78, var15, var17, var16, var18);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V", line = 260)
    public static final void method558(byte arg0) {
        if (arg0 != 96) {
            method557(false, (byte) -48);
        }
        field1903++;
        class49.method383(null, 20, false, 0);
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V", line = 271)
    public static void method559(int arg0) {
        field1899 = null;
        field1895 = null;
        field1897 = null;
        field1905 = null;
        if (arg0 >= -30) {
            method557(false, (byte) 38);
        }
        field1896 = null;
        field1904 = null;
        field1888 = null;
        field1889 = null;
        field1890 = null;
        field1894 = null;
        field1906 = null;
        field1891 = null;
        field1902 = null;
        field1900 = null;
        field1893 = null;
        field1898 = null;
    }
}
