import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class94 {

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public int field1283 = 8;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public int field1299 = 16777215;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field1300 = 0;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field1302 = 0;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1303 = new Rectangle[100];

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "F")
    public static float field1288;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public int field1285;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public int field1286;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public int field1289;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public int field1291;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public int field1297;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Lqj;")
    public static class238 field1293;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Lqj;")
    public static class238 field1294;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "Lvb;")
    public static class91 field1305;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Z")
    public boolean field1287;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field1303[var0] = new Rectangle();
        }
        field1304 = -1;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Z", line = 3)
    public static final boolean method575(int arg0) {
        field1295++;
        if (arg0 != 17762) {
            method578((String[]) null, (byte) -25);
        }
        return class10.field97 > 0;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 14)
    public static void method576(byte arg0) {
        field1294 = null;
        field1305 = null;
        if (arg0 > 114) {
            field1293 = null;
            field1303 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILil;IZ)V", line = 32)
    private final void method577(int arg0, class265 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            this.field1283 = arg1.method1685(8104);
        } else if (arg2 == 2) {
            this.field1287 = true;
        } else if (arg2 == 3) {
            this.field1285 = arg1.method1698(1625554944);
            this.field1291 = arg1.method1698(1625554944);
            this.field1289 = arg1.method1698(1625554944);
        } else if (arg2 == 4) {
            this.field1297 = arg1.method1697(102);
        } else if (arg2 == 5) {
            this.field1286 = arg1.method1685(8104);
        } else if (arg2 == 6) {
            this.field1299 = arg1.method1691(false);
        }
        if (arg3) {
            field1288 = -0.44831973F;
        }
        field1298++;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;", line = 79)
    public static final String[] method578(String[] arg0, byte arg1) {
        field1282++;
        String[] var2 = new String[5];
        int var3 = 31 / ((31 - arg1) / 47);
        for (int var4 = 0; var4 < 5; var4++) {
            var2[var4] = var4 + ": ";
            if (arg0 != null && arg0[var4] != null) {
                var2[var4] = var2[var4] + arg0[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V", line = 104)
    public static final void method579(int arg0) {
        class37.field590.method212(-128);
        if (arg0 >= -112) {
            field1305 = null;
        }
        field1290++;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILil;B)V", line = 119)
    public final void method580(int arg0, class265 arg1, byte arg2) {
        while (true) {
            int var4 = arg1.method1697(-59);
            if (var4 == 0) {
                int var5 = -54 % ((24 - arg2) / 56);
                field1284++;
                return;
            }
            this.method577(arg0, arg1, var4, false);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILnr;IIII)V", line = 148)
    public static final void method581(int arg0, class437 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.method2155(arg5, arg2, arg3 + arg5, arg2 - -arg4);
        field1296++;
        arg1.method2766(arg3, arg4, arg5, arg2, -16777216, -116);
        if (class424.field6305 < 100) {
            return;
        }
        float var6 = (float) class76.field1046 / (float) class76.field1032;
        int var7 = arg3;
        int var8 = arg4;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg3 * var6);
        } else {
            var7 = (int) ((float) arg4 / var6);
        }
        int var9 = (arg3 - var7) / 2 + arg5;
        int var10 = (arg4 - var8) / 2 + arg2;
        if (class358.field5239 == null || arg3 != class358.field5239.method1095() || class358.field5239.method1090() != arg4) {
            class76.method479(class76.field1041, class76.field1046 + class76.field1044, class76.field1041 - -class76.field1032, class76.field1044, var9, var10, var7 + var9, var8 + var10);
            class76.method474(arg1);
            class358.field5239 = arg1.method2173(var9, var10, var7, var8, false);
        }
        class358.field5239.method1499(var9, var10);
        int var11 = class107.field1465 * var7 / class76.field1032;
        int var12 = -33 % ((arg0 + 63) / 37);
        int var13 = class271.field3971 * var8 / class76.field1046;
        int var14 = class235.field3307 * var7 / class76.field1032 + var9;
        int var15 = var8 + var10 - (client.field3687 * var8 / class76.field1046) - var13;
        int var16 = -1996554240;
        if (class126.field1679 == 1) {
            var16 = -1996488705;
        }
        arg1.method2188(var14, var15, var11, var13, var16, 1);
        arg1.method2057(var14, var15, var11, var13, var16, 0);
        if (class292.field4230 <= 0) {
            return;
        }
        int var17;
        if (class395.field5935 <= 50) {
            var17 = class395.field5935 * 5;
        } else {
            var17 = (100 - class395.field5935) * 5;
        }
        for (class419 var18 = (class419) class76.field1031.method2649(0); var18 != null; var18 = (class419) class76.field1031.method2656(0)) {
            class80 var19 = class27.method248(var18.field6231, (byte) 1);
            if (class52.method355(var19, -1225)) {
                if (class423.field6297 == var18.field6231) {
                    int var20 = var18.field6223 * var7 / class76.field1032 + var9;
                    int var21 = var10 + ((class76.field1046 - var18.field6230) * var8 / class76.field1046);
                    arg1.method2766(4, 4, var20 - 2, var21 + -2, var17 << 24 | 0xFFFF00, 127);
                } else if (class263.field3834 != -1 && class263.field3834 == var19.field1119) {
                    int var22 = var18.field6223 * var7 / class76.field1032 + var9;
                    int var23 = var10 + ((class76.field1046 - var18.field6230) * var8 / class76.field1046);
                    arg1.method2766(4, 4, var22 - 2, var23 - 2, var17 << 24 | 0xFFFF00, 120);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lil;Ljava/lang/String;I)I", line = 244)
    public static final int method582(class265 arg0, String arg1, int arg2) {
        field1292++;
        int var3 = arg0.field3915;
        byte[] var4 = class104.method706(arg1, (byte) -125);
        if (arg2 != -1996488705) {
            method579(23);
        }
        arg0.method1713(arg2 + 1996521473, var4.length);
        arg0.field3915 += class248.field3456.method548(arg0.field3915, arg2 ^ 0x88FFFFBF, var4.length, arg0.field3879, 0, var4);
        return arg0.field3915 - var3;
    }
}
