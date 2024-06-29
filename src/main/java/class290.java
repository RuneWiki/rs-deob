import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class290 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lui;")
    private class251 field4094 = new class251(64);

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Llga;")
    private class47 field4096;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4099 = new String[] { method2356(method2355("f>~\\W")), method2356(method2355("f>~\"\u0016e0$ W")), method2356(method2355("pw~0\u0002")), method2356(method2355("e,<r")), method2356(method2355("f>~]W")), method2356(method2355("f>~_W")) };

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lsb;")
    public static class261 field4092 = new class261(91, 9);

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Ldp;")
    public static class514 field4097 = new class514();

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Ljava/applet/Applet;")
    public static Applet field4091;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "[Z")
    public static boolean[] field4098;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)Lpm;", line = 6)
    public final class246 method2352(int arg0, int arg1) {
        try {
            field4093++;
            class251 var3 = this.field4094;
            class246 var4;
            synchronized (this.field4094) {
                var4 = (class246) this.field4094.method2053(arg1 + 11020, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field4096;
            byte[] var6;
            synchronized (this.field4096) {
                if (arg1 != -11020) {
                    method2353(true);
                }
                var6 = this.field4096.method512(arg0, 5, (byte) -51);
            }
            class246 var7 = new class246();
            if (var6 != null) {
                var7.method2008((byte) -104, new class711(var6));
            }
            class251 var8 = this.field4094;
            synchronized (this.field4094) {
                this.field4094.method2051((long) arg0, var7, 93);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field4099[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V", line = 35)
    public static final void method2353(boolean arg0) {
        try {
            field4095++;
            if (class552.field8055 == null) {
                class552.field8055 = new int[65536];
                double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
                int var3 = 0;
                for (int var4 = 0; var4 < 512; var4++) {
                    float var5 = ((float) (var4 >> 1539218275) / 64.0F + 0.0078125F) * 360.0F;
                    float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
                    for (int var7 = 0; var7 < 128; var7++) {
                        float var8 = (float) var7 / 128.0F;
                        float var9 = 0.0F;
                        float var10 = 0.0F;
                        float var11 = 0.0F;
                        float var12 = var5 / 60.0F;
                        int var13 = (int) var12;
                        int var14 = var13 % 6;
                        float var15 = var12 - (float) var13;
                        float var16 = (1.0F - var6) * var8;
                        float var17 = (1.0F - (var6 * var15)) * var8;
                        float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                        if (var14 == 0) {
                            var10 = var18;
                            var11 = var16;
                            var9 = var8;
                        } else if (var14 == 1) {
                            var10 = var8;
                            var11 = var16;
                            var9 = var17;
                        } else if (var14 == 2) {
                            var9 = var16;
                            var10 = var8;
                            var11 = var18;
                        } else if (var14 == 3) {
                            var9 = var16;
                            var11 = var8;
                            var10 = var17;
                        } else if (var14 == 4) {
                            var9 = var18;
                            var10 = var16;
                            var11 = var8;
                        } else if (var14 == 5) {
                            var11 = var17;
                            var9 = var8;
                            var10 = var16;
                        }
                        float var19 = (float) Math.pow((double) var9, var1);
                        float var20 = (float) Math.pow((double) var10, var1);
                        float var21 = (float) Math.pow((double) var11, var1);
                        int var22 = (int) (var19 * 256.0F);
                        int var23 = (int) (var20 * 256.0F);
                        int var24 = (int) (var21 * 256.0F);
                        int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                        class552.field8055[var3++] = var25;
                    }
                }
                if (arg0) {
                    method2353(true);
                }
            }
        } catch (RuntimeException var27) {
            throw class665.method4799(var27, field4099[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 163)
    public static void method2354(byte arg0) {
        try {
            field4097 = null;
            field4098 = null;
            field4092 = null;
            if (arg0 != -106) {
                field4097 = null;
            }
            field4091 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4099[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lfs;ILlga;)V", line = 187)
    public class290(class796 arg0, int arg1, class47 arg2) {
        try {
            this.field4096 = arg2;
            this.field4096.method509(true, 5);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4099[1] + (arg0 == null ? field4099[3] : field4099[2]) + ',' + arg1 + ',' + (arg2 == null ? field4099[3] : field4099[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2355(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2356(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 89;
                    break;
                case 2:
                    var10005 = 80;
                    break;
                case 3:
                    var10005 = 30;
                    break;
                default:
                    var10005 = 127;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
