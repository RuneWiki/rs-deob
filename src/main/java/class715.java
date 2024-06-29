import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class715 {

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
    public int field10348;

    @OriginalMember(owner = "client!jca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10353 = new String[] { method5184(method5183("\u001ef!)O\\")), method5184(method5183("\u000f+n)p")), method5184(method5183("\u001ef!)N\\")), method5184(method5183("\u001ap,k")), method5184(method5183("\u001ef!)1\u001dk)s3\\")), method5184(method5183("\u001ef!)L\\")), method5184(method5183("\u001ef!)y\u001bV4ud\u001abh")) };

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "Llt;")
    public static class706 field10347 = new class706(8, 4);

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
    public static int field10352 = 0;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public static int field10346;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
    public static int field10349;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
    public static int field10350;

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "I")
    public static int field10351;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIIF[FIF[FIIF)V", line = 7)
    public static final void method5180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float[] arg7, int arg8, float arg9, float[] arg10, int arg11, int arg12, float arg13) {
        try {
            field10346++;
            int var23 = arg3 - arg0;
            if (arg5 != -2800) {
                method5180(-125, -98, -71, -82, -13, 66, -1.7303097F, null, -38, 0.74382335F, null, -72, -18, -1.8782816F);
            }
            int var24 = arg4 - arg1;
            int var25 = arg8 - arg2;
            float var14 = arg10[2] * (float) var23 + arg10[0] * (float) var25 + arg10[1] * (float) var24;
            float var15 = arg10[5] * (float) var23 + arg10[4] * (float) var24 + arg10[3] * (float) var25;
            float var16 = arg10[8] * (float) var23 + arg10[6] * (float) var25 + arg10[7] * (float) var24;
            float var17;
            float var18;
            if (arg12 == 0) {
                var17 = arg9 + var14 + 0.5F;
                var18 = arg13 + 0.5F - var16;
            } else if (arg12 == 1) {
                var18 = arg13 + var16 + 0.5F;
                var17 = arg9 + var14 + 0.5F;
            } else if (arg12 == 2) {
                var17 = arg9 + 0.5F - var14;
                var18 = arg6 + 0.5F - var15;
            } else if (arg12 == 3) {
                var17 = arg9 + var14 + 0.5F;
                var18 = arg6 + 0.5F - var15;
            } else if (arg12 == 4) {
                var17 = arg13 + var16 + 0.5F;
                var18 = arg6 + 0.5F - var15;
            } else {
                var18 = arg6 + 0.5F - var15;
                var17 = arg13 + 0.5F - var16;
            }
            if (arg11 == 1) {
                float var20 = var17;
                var17 = -var18;
                var18 = var20;
            } else if (arg11 == 2) {
                var17 = -var17;
                var18 = -var18;
            } else if (arg11 == 3) {
                float var19 = var17;
                var17 = var18;
                var18 = -var19;
            }
            arg7[1] = var18;
            arg7[0] = var17;
        } catch (RuntimeException var22) {
            throw class590.method4333(var22, field10353[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field10353[3] : field10353[1]) + ',' + arg8 + ',' + arg9 + ',' + (arg10 == null ? field10353[3] : field10353[1]) + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lrv;I)V", line = 94)
    public static final void method5181(class117 arg0, int arg1) {
        try {
            arg0.method1156(arg1 - 118);
            field10350++;
            int var2 = class356.field5733;
            class738 var3 = class438.field6846 = class33.field395[var2] = new class738();
            var3.field1129 = var2;
            int var4 = arg0.method1163(30, 66);
            byte var5 = (byte) (var4 >> 28);
            int var6 = (var4 & 0xFFFCC6A) >> 14;
            var3.field1201[0] = var6 - class397.field6289;
            int var7 = var4 & 0x3FFF;
            var3.field9985 = (var3.field1201[0] << 9) + (var3.method804(true) << 8);
            var3.field1200[0] = var7 - class141.field2011;
            var3.field9983 = (var3.field1200[0] << 9) + (var3.method804(true) << 8);
            class673.field9554 = var3.field9975 = var3.field9974 = var5;
            if (class541.method4028(var3.field1200[0], var3.field1201[0], (byte) 113)) {
                var3.field9974++;
            }
            if (class762.field11186[var2] != null) {
                var3.method5368(class762.field11186[var2], false);
            }
            class691.field9962 = 0;
            class239.field3685[class691.field9962++] = var2;
            class424.field6682[var2] = 0;
            class378.field6108 = 0;
            if (arg1 != -4) {
                method5180(8, 76, 118, 59, -93, 89, 1.0025132F, null, 115, -0.46002972F, null, 66, 19, -0.05172654F);
            }
            for (int var8 = 1; var8 < 2048; var8++) {
                if (var2 != var8) {
                    int var9 = arg0.method1163(18, 46);
                    int var10 = var9 >> 16;
                    int var11 = (var9 & 0xFFEF) >> 8;
                    int var12 = var9 & 0xFF;
                    class94 var13 = class203.field3191[var8] = new class94();
                    var13.field1368 = false;
                    var13.field1372 = -1;
                    var13.field1374 = 0;
                    var13.field1373 = false;
                    var13.field1375 = (var10 << 28) + (var11 << 14) + var12;
                    class732.field10723[class378.field6108++] = var8;
                    class424.field6682[var8] = 0;
                }
            }
            arg0.method1160(7);
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field10353[5] + (arg0 == null ? field10353[3] : field10353[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V", line = 169)
    public static void method5182(int arg0) {
        try {
            if (arg0 == 1) {
                field10347 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10353[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jca", name = "toString", descriptor = "()Ljava/lang/String;", line = 182)
    public final String toString() {
        try {
            field10349++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10353[6] + ')');
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(I)V", line = 190)
    public class715(int arg0) {
        try {
            this.field10348 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10353[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5183(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xD);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5184(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 5;
                    break;
                case 2:
                    var10005 = 64;
                    break;
                case 3:
                    var10005 = 7;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
