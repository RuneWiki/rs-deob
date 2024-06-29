import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class477 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field6879 = 1406;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Z")
    public static boolean field6885 = false;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lak;")
    public static class234 field6881 = new class234("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Leo;")
    public static class196 field6882;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lad;")
    public static class295 field6878;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static final void method2871(byte arg0) {
        field6883++;
        class150.field2246.method774((byte) -102);
        class71.field1020.field3556 = 0;
        class150.field2247 = null;
        class274.field4194 = null;
        class238.field3819.field3556 = 0;
        class119.field1801 = 0;
        class131.field2010 = null;
        if (arg0 < 37) {
            field6885 = true;
        }
        class364.field5382 = 0;
        class350.field5176 = 0;
        class289.field4354 = null;
        for (int var1 = 0; var1 < 100; var1++) {
            class308.field4641[var1] = null;
        }
        class32.field374 = 0;
        class64.field785 = 0;
        class505.field7375 = 0;
        class108.field1509 = 0;
        class285.field4333 = null;
        class25.field315 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public static void method2872(boolean arg0) {
        field6882 = null;
        field6878 = null;
        field6881 = null;
        if (!arg0) {
            method2874(false, 50, -45, 118, 93, -1, null);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method2873(Random arg0, int arg1, int arg2) {
        int var3 = -108 / ((arg1 + 44) / 52);
        field6880++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class474.method2851(arg2, (byte) 96)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var4 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var5;
            do {
                var5 = arg0.nextInt();
            } while (var4 <= var5);
            return class408.method2569(-106766689, var5, arg2);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIIIII[B)V")
    public static final void method2874(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field6884++;
        if (arg3 > 0 && !class474.method2851(arg3, (byte) 82)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class474.method2851(arg1, (byte) 115)) {
            int var7 = client.method1373(arg5, (byte) -33);
            if (arg0) {
                field6878 = null;
            }
            int var8 = 0;
            int var9 = arg3 < arg1 ? arg3 : arg1;
            int var10 = arg3 >> 1;
            int var11 = arg1 >> 1;
            byte[] var12 = arg6;
            byte[] var13 = new byte[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Dub(arg2, var8, arg4, arg3, arg1, 0, arg5, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg3 * var7;
                byte[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            int var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var13 = var12;
                var12 = var15;
                arg1 = var11;
                arg3 = var10;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
