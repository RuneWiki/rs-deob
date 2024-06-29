import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class66 extends class12 {

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    private int field1189 = -1;

    @OriginalMember(owner = "client!ha", name = "Z", descriptor = "I")
    private int field1210 = 0;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "Lkb;")
    public static class93 field1188 = class76.method390("sl_back", 0);

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "Lkb;")
    public static class93 field1197 = class76.method390("Freie Welt", 0);

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "Lkb;")
    private static class93 field1199 = class76.method390("Please wait 5 minutes before trying again)3", 0);

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "Lkb;")
    private static class93 field1196 = class76.method390("Type", 0);

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "Lkb;")
    private static class93 field1203 = class76.method390("Invalid loginserver requested)3", 0);

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
    public static int field1204 = 0;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "Lkb;")
    public static class93 field1192 = field1196;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field1186 = 0;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "Lkb;")
    public static class93 field1207 = field1199;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "Lkb;")
    private static class93 field1185 = class76.method390("Unable to connect)3", 0);

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "Lkb;")
    public static class93 field1191 = field1203;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "Lkb;")
    public static class93 field1200 = field1185;

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "I")
    public static int field1209 = 2;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "Lkb;")
    public static class93 field1195 = field1185;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "Lme;")
    public static class114 field1183;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
    private final void method345(int arg0, int arg1) {
        field1190++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = 0.0D;
        double var13 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        double var15 = 0.0D;
        if (var3 < var5) {
            var13 = var5;
        }
        if (var7 > var13) {
            var13 = var7;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var17 = (var9 + var13) / 2.0D;
        this.field1198 = (int) (var17 * 256.0D);
        if (var9 != var13) {
            if (var3 == var13) {
                var15 = (var5 - var7) / (var13 - var9);
            } else if (var5 == var13) {
                var15 = (var7 - var3) / (-var9 + var13) + 2.0D;
            } else if (var7 == var13) {
                var15 = (var3 - var5) / (-var9 + var13) + 4.0D;
            }
            if (var17 < 0.5D) {
                var11 = (var13 - var9) / (var9 + var13);
            }
            if (var17 >= 0.5D) {
                var11 = (var13 - var9) / (2.0D - var13 - var9);
            }
        }
        if (this.field1198 < 0) {
            this.field1198 = 0;
        } else if (this.field1198 > 255) {
            this.field1198 = 255;
        }
        this.field1205 = (int) (var11 * 256.0D);
        if (this.field1205 < 0) {
            this.field1205 = 0;
        } else if (this.field1205 > 255) {
            this.field1205 = 255;
        }
        double var19 = var15 / 6.0D;
        if (var17 > 0.5D) {
            this.field1184 = (int) ((1.0D - var17) * var11 * 512.0D);
        } else {
            this.field1184 = (int) (var11 * var17 * 512.0D);
        }
        if (this.field1184 < 1) {
            this.field1184 = 1;
        }
        if (arg1 != -5635) {
            field1192 = null;
        }
        this.field1187 = (int) ((double) this.field1184 * var19);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBILrd;)V")
    private final void method346(int arg0, byte arg1, int arg2, class158 arg3) {
        field1206++;
        int var5 = 94 % ((36 - arg1) / 34);
        if (arg0 == 1) {
            this.field1210 = arg3.method1060(255);
            this.method345(this.field1210, -5635);
        } else if (arg0 == 2) {
            this.field1189 = arg3.method1071(28101);
            if (this.field1189 != 65535) {
                return;
            }
            this.field1189 = -1;
        } else if (arg0 == 3) {
            arg3.method1071(28101);
            return;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lqh;ILjg;Ljg;Ljg;)Z")
    public static final boolean method347(class153 arg0, int arg1, class89 arg2, class89 arg3, class89 arg4) {
        class15.field272 = arg3;
        field1193++;
        if (arg1 != -1) {
            method347(null, 66, null, null, null);
        }
        class115.field2169 = arg4;
        class83.field1532 = arg2;
        class142.field2784 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lrd;IB)V")
    public final void method348(class158 arg0, int arg1, byte arg2) {
        if (arg2 != 98) {
            return;
        }
        field1201++;
        while (true) {
            int var4 = arg0.method1054(128);
            if (var4 == 0) {
                return;
            }
            this.method346(var4, (byte) -101, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public static void method349(int arg0) {
        field1188 = null;
        field1196 = null;
        if (arg0 != -18675) {
            field1200 = null;
        }
        field1207 = null;
        field1191 = null;
        field1199 = null;
        field1197 = null;
        field1192 = null;
        field1185 = null;
        field1200 = null;
        field1203 = null;
        field1183 = null;
        field1195 = null;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
    public static final void method350(int arg0, int arg1) {
        if (arg0 != 65535) {
            return;
        }
        for (class197 var2 = (class197) class37.field610.method612(12981); var2 != null; var2 = (class197) class37.field610.method623((byte) -77)) {
            if ((long) arg1 == (var2.field718 >> 48 & 0xFFFFL)) {
                var2.method235(false);
            }
        }
        field1208++;
    }
}
