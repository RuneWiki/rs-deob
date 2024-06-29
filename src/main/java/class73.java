import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class73 {

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Lce;")
    private static class126 field1169 = class206.method1445(-7923, "Select");

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Lce;")
    public static class126 field1173 = field1169;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Lce;")
    public static class126 field1167 = class206.method1445(-7923, "Connexion au serveur de mise -9 jour en cours");

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Lce;")
    public static class126 field1179 = class206.method1445(-7923, " loggt sich ein)3");

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field1172 = 0;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field1180 = -1;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Lcc;")
    public static class313 field1166;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "[S")
    public static short[] field1176;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 12)
    public static final void method527(int arg0) {
        field1171++;
        if (class163.field2927 == -1 || class26.field372 == -1) {
            return;
        }
        int var1 = ((class47.field734 - class35.field513) * class243.field4115 >> 16) + class35.field513;
        class243.field4115 += var1;
        if (class243.field4115 < 65535) {
            class281.field4667 = false;
            class227.field3830 = false;
        } else {
            class243.field4115 = 65535;
            if (class227.field3830) {
                class281.field4667 = false;
            } else {
                class281.field4667 = true;
            }
            class227.field3830 = true;
        }
        float[] var2 = new float[3];
        float var3 = (float) class243.field4115 / 65535.0F;
        int var4 = class290.field4810 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class177.field3121[class163.field2927][var4][var5] * 3;
            int var7 = (class177.field3121[class163.field2927][var4 + 2][var5] - (class177.field3121[class163.field2927][var4 + 3][var5] - class177.field3121[class163.field2927][var4 + 2][var5])) * 3;
            int var8 = class177.field3121[class163.field2927][var4 + 1][var5] * 3;
            int var9 = class177.field3121[class163.field2927][var4][var5];
            int var10 = var8 - var6;
            int var11 = class177.field3121[class163.field2927][var4 + 2][var5] - (var9 - (var8 - var7));
            int var12 = var6 + var7 - (var8 * 2);
            var2[var5] = (((float) var11 * var3 + (float) var12) * var3 + (float) var10) * var3 + (float) var9;
        }
        class143.field2600 = (int) var2[1] * -1;
        class223.field3755 = (int) var2[2] - (class138.field2473 * 128);
        class152.field2780 = (int) var2[0] - (class58.field914 * 128);
        float[] var13 = new float[3];
        int var14 = class288.field4783 * arg0;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class177.field3121[class26.field372][var14][var15] * 3;
            int var17 = class177.field3121[class26.field372][var14 + 1][var15] * 3;
            int var18 = (class177.field3121[class26.field372][var14 + 2][var15] + class177.field3121[class26.field372][var14 + 2][var15] - class177.field3121[class26.field372][var14 + 3][var15]) * 3;
            int var19 = class177.field3121[class26.field372][var14][var15];
            int var20 = var17 - var16;
            int var21 = var16 + var18 - (var17 * 2);
            int var22 = class177.field3121[class26.field372][var14 + 2][var15] + var17 - var19 - var18;
            var13[var15] = (((float) var22 * var3 + (float) var21) * var3 + (float) var20) * var3 + (float) var19;
        }
        float var23 = var13[0] - var2[0];
        float var24 = var13[2] - var2[2];
        float var25 = (var13[1] - var2[1]) * -1.0F;
        double var26 = Math.sqrt((double) (var23 * var23 + var24 * var24));
        class259.field4350 = (float) Math.atan2((double) var25, var26);
        class74.field1194 = -((float) Math.atan2((double) var23, (double) var24));
        class29.field404 = (int) ((double) class74.field1194 * 325.949D) & 0x7FF;
        class102.field1640 = (int) ((double) class259.field4350 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IZIII)I", line = 115)
    public static final int method528(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (class174.field3082) {
            class174.field3082 = false;
            arg0 = 1000000;
        }
        field1174++;
        class98 var5 = class243.field4121[arg2][arg4];
        if (!arg1) {
            return -47;
        }
        float var6 = ((float) arg3 * 0.1F + 0.7F) * var5.field1590;
        int var7 = var5.field1576;
        float var8 = var5.field1588;
        int var9 = var5.field1581;
        float var10 = var5.field1582;
        int var11 = var5.field1575;
        if (!class13.field172) {
            var11 = 0;
        }
        if (class132.field2264 != var7 || class41.field655 != var6 || class112.field1917 != var10 || class186.field3224 != var8 || class286.field4751 != var9 || class13.field169 != var11) {
            class238.field4030 = class232.field3927;
            class244.field4135 = 0;
            class286.field4751 = var9;
            class78.field1279 = class186.field3211;
            class186.field3224 = var8;
            class264.field4404 = class303.field5040;
            class132.field2264 = var7;
            class41.field655 = var6;
            class112.field1917 = var10;
            class293.field4865 = class148.field2728;
            class13.field169 = var11;
            class9.field124 = class315.field5403;
            class239.field4032 = class278.field4636;
        }
        if (class244.field4135 < 65536) {
            class244.field4135 += arg0 * 250;
            if (class244.field4135 >= 65536) {
                class244.field4135 = 65536;
            }
            int var12 = 65536 - class244.field4135 >> 8;
            int var13 = class244.field4135 >> 8;
            class303.field5040 = ((class286.field4751 & 0xFF00) * var13 + (class264.field4404 & 0xFF00) * var12 & 0xFF0000) + ((class286.field4751 & 0xFF00FF) * var13 + (class264.field4404 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
            float var14 = (float) class244.field4135 / 65536.0F;
            class186.field3211 = class78.field1279 * var12 + class13.field169 * var13 >> 8;
            class278.field4636 = ((class239.field4032 & 0xFF00FF) * var12 + (class132.field2264 & 0xFF00FF) * var13 & 0xFF00FF00) + ((class239.field4032 & 0xFF00) * var12 + (class132.field2264 & 0xFF00) * var13 & 0xFF0000) >> 8;
            float var15 = (float) (65536 - class244.field4135) / 65536.0F;
            class315.field5403 = class9.field124 * var15 + class41.field655 * var14;
            class148.field2728 = class293.field4865 * var15 + class186.field3224 * var14;
            class232.field3927 = class238.field4030 * var15 + class112.field1917 * var14;
        }
        class235.method1602(class278.field4636, class315.field5403, class232.field3927, class148.field2728);
        class235.method1601(class303.field5040, class186.field3211);
        class235.method1603((float) class27.field379, (float) class301.field5003, (float) class93.field1458);
        class235.method1594();
        return class303.field5040;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)I", line = 211)
    public static final int method529(int arg0, int arg1, int arg2) {
        if (arg2 == -1259236833) {
            field1182++;
            int var3 = arg1 >> 31 & arg0 - 1;
            return (arg1 + (arg1 >>> 31)) % arg0 + var3;
        } else {
            return -104;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lce;BILce;)V", line = 224)
    public static final void method530(class126 arg0, byte arg1, int arg2, class126 arg3) {
        field1168++;
        if (arg1 < 80) {
            field1169 = (class126) null;
        }
        client.method807((class126) null, arg3, 83, arg2, arg0, -1);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V", line = 247)
    public static final void method531(int arg0, byte arg1) {
        if (arg1 <= 5) {
            field1177 = 36;
        }
        class75.field1208.method1175(true, arg0);
        field1181++;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 269)
    public static void method532(int arg0) {
        field1166 = null;
        field1167 = null;
        field1173 = null;
        if (arg0 != -1) {
            method528(29, false, 7, 73, -78);
        }
        field1169 = null;
        field1179 = null;
        field1176 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILmi;)V", line = 286)
    public static final void method533(int arg0, class204 arg1) {
        if (arg0 != 0) {
            return;
        }
        arg1.field3485 = false;
        if (arg1.field3487 != null) {
            arg1.field3487.field3238 = 0;
        }
        for (class204 var2 = arg1.method571(); var2 != null; var2 = arg1.method569()) {
            method533(0, var2);
        }
        field1178++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I[BIB)Z", line = 322)
    public static final boolean method534(int arg0, byte[] arg1, int arg2, byte arg3) {
        boolean var4 = true;
        field1170++;
        class134 var5 = new class134(arg1);
        int var6 = -1;
        label63: while (true) {
            int var7 = var5.method961(arg3 ^ 0x44BF0B1F);
            if (var7 == 0) {
                if (arg3 != 79) {
                    return false;
                }
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method930(arg3 - 15614);
                    if (var11 == 0) {
                        continue label63;
                    }
                    var8 += var11 - 1;
                    int var12 = var5.method948(-124) >> 2;
                    int var13 = var8 & 0x3F;
                    int var14 = (var8 & 0xFF1) >> 6;
                    int var15 = arg2 + var14;
                    int var16 = arg0 + var13;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class265 var17 = class185.method1338(var6, -7153);
                        if (var12 != 22 || class44.field677 || var17.field4489 != 0 || var17.field4470 == 1 || var17.field4478) {
                            if (!var17.method1779(0)) {
                                class41.field660++;
                                var4 = false;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method930(-15535);
                if (var10 == 0) {
                    break;
                }
                var5.method948(-128);
            }
        }
    }
}
