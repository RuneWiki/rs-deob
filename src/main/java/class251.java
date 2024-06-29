import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class251 {

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Loh;")
    public static class258 field4328 = class153.method1046("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 109);

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field4329 = 0;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "Lgb;")
    public static class213 field4325;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "[Lvi;")
    public static class129[] field4322;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 15)
    public static final void method1699(int arg0) {
        field4327++;
        if (class147.field2501 == 2) {
            if (class84.field1415 == class249.field4298 && class49.field729 == class113.field1947) {
                class147.field2501 = 0;
                class272.method1924(class69.field1195 - 1, 1);
            }
        } else if (class84.field1415 == class219.field3791 && class173.field3103 == class113.field1947) {
            class147.field2501 = 0;
            class272.method1924(class69.field1195 - 1, 1);
        } else {
            class147.field2501 = 2;
            class49.field729 = class173.field3103;
            class249.field4298 = class219.field3791;
        }
        if (arg0 != 9361) {
            method1701(false, -71, 61);
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V", line = 68)
    public static final void method1700(int arg0) {
        for (class247 var1 = (class247) class276.field4750.method985(115); var1 != null; var1 = (class247) class276.field4750.method983(~arg0)) {
            int var2 = var1.field4283;
            if (class92.method685(-1, var2)) {
                boolean var3 = true;
                class171[] var4 = class23.field290[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field3006;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2642;
                    class171 var7 = class263.method1844(var6, (byte) -70);
                    if (var7 != null) {
                        class165.method1099((byte) 125, var7);
                    }
                }
            }
        }
        if (arg0 != 0) {
            method1699(-108);
        }
        field4321++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZII)V", line = 122)
    public static final void method1701(boolean arg0, int arg1, int arg2) {
        field4324++;
        class128.field2274 = class57.field899[arg1][arg2].field991;
        class144.field2409 = class57.field899[arg1][arg2].field990;
        class283.field4862 = class57.field899[arg1][arg2].field1003;
        if (arg0) {
            method1700(-118);
        }
        class304.method2129((float) class128.field2274, (float) class144.field2409, (float) class283.field4862);
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V", line = 141)
    public static final void method1702(int arg0) {
        field4323++;
        if (arg0 != 64) {
            method1701(false, -9, -36);
        }
        int var1 = class84.field1427.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class84.field1427[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class258.field4489; var4++) {
                    if (class31.field373[var4] == class231.field3990[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class31.field373[class258.field4489] = class231.field3990[var2];
                    var3 = class258.field4489++;
                }
                class235 var5 = new class235(class84.field1427[var2]);
                int var6 = 0;
                while (var5.field4051 < class84.field1427[var2].length && var6 < 511) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1615(10);
                    int var9 = var8 >> 7 & 0x3F;
                    int var10 = var8 & 0x3F;
                    int var11 = (class231.field3990[var2] & 0xFF) * 64 + var10 - class311.field5271;
                    int var12 = var8 >> 14;
                    int var13 = (class231.field3990[var2] >> 8) * 64 + var9 - class229.field3955;
                    class151 var14 = class88.method632(-119, var5.method1615(-118));
                    if (class16.field214[var7] == null && (var14.field2563 & 0x1) > 0 && class265.field4626 == var12 && var13 >= 0 && (var14.field2548 + var13) < 104 && var11 >= 0 && var14.field2548 + var11 < 104) {
                        class16.field214[var7] = new class107();
                        class107 var15 = class16.field214[var7];
                        class92.field1616[class226.field3895++] = var7;
                        var15.field1906 = var14;
                        var15.field951 = class202.field3498;
                        var15.method449(var15.field1906.field2548, (byte) -116);
                        var15.field927 = var15.field1906.field2589;
                        var15.field957 = var15.field1906.field2575;
                        var15.field926 = var15.field1906.field2560;
                        var15.field979 = var15.field1906.field2541;
                        if (var15.field979 == 0) {
                            var15.field923 = 0;
                        }
                        var15.field973 = var15.field1906.field2565;
                        var15.field967 = var15.field1906.field2552;
                        var15.field929 = var15.field1906.field2561;
                        var15.field915 = var15.field1906.field2592;
                        var15.method448((byte) -23, var13, true, var15.method447(18123), var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V", line = 247)
    public static void method1703(int arg0) {
        if (arg0 == 0) {
            field4328 = null;
            field4325 = null;
            field4322 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Loh;ZZ)V", line = 262)
    public static final void method1704(class258 arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            method1701(true, 76, 7);
        }
        byte var3 = 4;
        field4326++;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class44.field662.method257(arg0, 250);
        int var7 = class44.field662.method259(arg0, 250) * 13;
        if (class257.field4390) {
            class296.method2096(var5 - var3, -var3 + var4, var3 + var6 + var3, var7 - -var3 + var3, 0);
            class296.method2084(var5 - var3, var4 - var3, var6 + var3 + var3, var3 + var7 + var3, 16777215);
        } else {
            class211.method1398(var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var7 - -var3, 0);
            class211.method1404(var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        }
        class44.field662.method269(arg0, var5, var4, var6, var7, 16777215, -1, 1, 1, 0);
        class93.method691(-126, var6 + var3 + var3, var7 - -var3 + var3, var5 - var3, -var3 + var4);
        if (!arg1) {
            class31.method230(var5, var6, var7, (byte) 19, var4);
        } else if (class257.field4390) {
            class257.method1764();
        } else {
            try {
                Graphics var8 = class5.field67.getGraphics();
                class83.field1407.method785(0, 128, 0, var8);
            } catch (Exception var10) {
                class5.field67.repaint();
            }
        }
    }
}
