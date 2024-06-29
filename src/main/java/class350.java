import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class350 extends class544 {

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "Ljj;")
    private class66 field5005;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "Loj;")
    private class498 field5011;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Lbv;")
    public static class567 field5004 = new class567("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Ljava/lang/String;")
    public static String field5010;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "[Lji;")
    public static class314[] field5012;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)I", line = 5)
    public final int method2127(byte arg0) {
        if (arg0 != 122) {
            field5012 = null;
        }
        field5008++;
        return this.field5011.field6976;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(FLoj;Loj;I)Z", line = 20)
    public final boolean method2128(float arg0, class498 arg1, class498 arg2, int arg3) {
        field5006++;
        boolean var5 = true;
        class353 var6 = this.field5005.field1203;
        this.field5005.method640(class105.field1758);
        this.field5005.method657();
        this.field5005.method547(-1);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field5011.field6976, this.field5011.field6976);
        this.field5005.method532(arg3 - 56575, false);
        this.field5005.method578(116, false);
        this.field5005.method561(true, false);
        this.field5005.method616(false, 0);
        this.field5005.method514(-2, true);
        this.field5005.method654(false, 1);
        this.field5005.method530(0.0F, 0.0F, (byte) 117, arg0, 0.0F);
        this.field5005.method656(arg3 ^ 0xFFFF3164, 34165, 34165);
        this.field5005.method648(73, arg1);
        this.field5005.method654(false, 0);
        if (arg3 != 65535) {
            return true;
        }
        this.field5005.method634(89, 1);
        this.field5005.method648(96, arg2);
        this.field5005.method539(var6, true);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method2147(0, var8, this.field5011, 0);
            var6.method2137(arg3 - 91004, 0);
            if (!var6.method2141(arg3 - 101589)) {
                var5 = false;
                break;
            }
            OpenGL.glBegin(7);
            if (var8 == 34069) {
                OpenGL.glTexCoord3i(65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34070) {
                OpenGL.glTexCoord3i(-65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34071) {
                OpenGL.glTexCoord3i(-65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34072) {
                OpenGL.glTexCoord3i(-65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34073) {
                OpenGL.glTexCoord3i(-65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34074) {
                OpenGL.glTexCoord3i(65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            }
            OpenGL.glEnd();
        }
        var6.method2148(1, 0);
        this.field5005.method564((byte) 26, var6);
        this.field5005.method654(false, 1);
        this.field5005.method648(arg3 ^ 0xFFFF0064, null);
        this.field5005.method656(-12645, 8448, 8448);
        this.field5005.method654(false, 0);
        this.field5005.method648(arg3 - 65464, null);
        OpenGL.glPopAttrib();
        this.field5005.method615(class105.field1758[0], class105.field1758[1], class105.field1758[2], class105.field1758[3]);
        if (var5 && !this.field5005.field1211) {
            this.field5011.method1479(-82);
        }
        return var5;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)Loj;", line = 224)
    public final class498 method323(boolean arg0) {
        field5007++;
        if (!arg0) {
            method2129((byte) 18);
        }
        return this.field5011;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V", line = 238)
    public static void method2129(byte arg0) {
        field5012 = null;
        field5010 = null;
        if (arg0 != -47) {
            field5004 = null;
        }
        field5004 = null;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Ljj;I)V", line = 249)
    public class350(class66 arg0, int arg1) {
        this.field5005 = arg0;
        this.field5011 = new class498(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILbj;IIIIIIIZIIILqa;Lr;)Lr;", line = 258)
    public static final class519 method2130(int arg0, class439 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, class167 arg13, class519 arg14) {
        field5009++;
        if (arg14 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg1 != null) {
            int var16 = var15 | arg1.method2594(-1, false, arg11, -1);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg6 << 32) + ((long) arg12 << 48) + (long) ((arg5 << 24) + (arg10 << 16) + arg8);
        class395 var19 = class557.field7878;
        class519 var20;
        synchronized (class557.field7878) {
            var20 = (class519) class557.field7878.method2407(false, var17);
        }
        if (var20 == null || arg13.method560(var20.method1373(), var15) != 0) {
            if (var20 != null) {
                var15 = arg13.method649(var15, var20.method1373());
            }
            byte var21;
            if (arg8 == 1) {
                var21 = 9;
            } else if (arg8 == 2) {
                var21 = 12;
            } else if (arg8 == 3) {
                var21 = 15;
            } else if (arg8 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class560 var24 = new class560(var21 * var22 + 1, var21 * 2 * var22 - var21, 0);
            int var25 = var24.method3149(0, 0, (byte) 91, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class285.field4154[var31] * var28 >> 15;
                    int var33 = class285.field4152[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method3149(var33, var32, (byte) 118, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg5 * var35 + arg10 * var36 >> 8);
                short var38 = (short) (((arg6 & 0x380) * var36 + (arg12 & 0x380) * var35 & 0x38000) + ((arg6 & 0xFC00) * var36 + (arg12 & 0xFC00) * var35 & 0xFC0000) + ((arg6 & 0x7F) * var36 + (arg12 & 0x7F) * var35 & 0x7F00) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method3160((short) -1, var37, var38, (byte) 1, 0, var26[0][(var39 + 1) % var21], var26[0][var39], var25, (byte) -1);
                    } else {
                        var24.method3160((short) -1, var37, var38, (byte) 1, 0, var26[var34 - 1][(var39 + 1) % var21], var26[var34][(var39 + 1) % var21], var26[var34 - 1][var39], (byte) -1);
                        var24.method3160((short) -1, var37, var38, (byte) 1, 0, var26[var34][(var39 + 1) % var21], var26[var34][var39], var26[var34 - 1][var39], (byte) -1);
                    }
                }
            }
            var20 = arg13.method400(var24, var15, class225.field3369, 64, 768);
            class395 var40 = class557.field7878;
            synchronized (class557.field7878) {
                class557.field7878.method2408(var20, var17, -112);
            }
        }
        int var41 = (arg8 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg0 != 0) {
            if ((arg0 & 0x8) != 0) {
                var42 -= 128;
            }
            if ((arg0 & 0x4) != 0) {
                var44 = var41 + 128;
            }
            if ((arg0 & 0x2) != 0) {
                var43 -= 128;
            }
            if ((arg0 & 0x1) != 0) {
                var45 = var41 + 128;
            }
        }
        int var46 = arg14.method1392();
        int var47 = arg14.method1376();
        int var48 = arg14.method1378();
        if (var46 < var42) {
            var46 = var42;
        }
        if (var47 > var44) {
            var47 = var44;
        }
        int var49 = arg14.method1362();
        if (var43 > var48) {
            var48 = var43;
        }
        if (var49 > var45) {
            var49 = var45;
        }
        class285 var50 = null;
        if (arg1 != null) {
            int var51 = arg1.field6416[arg11];
            var50 = class49.field739.method2298(-63, var51 >> 16);
            arg11 = var51 & 0xFFFF;
        }
        class519 var52;
        if (var50 == null) {
            var52 = var20.method765((byte) 3, var15, true);
            var52.method1349(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method1368(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method765((byte) 3, var15, true);
            var52.method1349(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method1368(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method2931(var50, 107, arg11);
        }
        if (arg7 != 0) {
            var52.method1383(arg7);
        }
        if (arg3 != 0) {
            var52.method1400(arg3);
        }
        if (arg9) {
            if (arg4 != 0) {
                var52.method1368(0, arg4, 0);
            }
            return var52;
        } else {
            return null;
        }
    }
}
