import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class172 extends class376 {

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "[B")
    public byte[] field2449;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public static int field2444 = 0;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    public static int field2450 = 0;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "Lsl;")
    public static class318 field2442 = new class318(3, -1);

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "Ltf;")
    public static class193 field2451;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 8)
    public static void method1219(int arg0) {
        field2442 = null;
        if (arg0 <= 11) {
            method1219(-52);
        }
        field2451 = null;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)V", line = 20)
    public static final void method1220(byte arg0) {
        field2443++;
        if (class121.field1717 != null) {
            return;
        }
        class121.field1717 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
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
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var10 = var18;
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
                    var11 = var8;
                    var10 = var17;
                    var9 = var16;
                } else if (var14 == 4) {
                    var9 = var18;
                    var11 = var8;
                    var10 = var16;
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
                int var25 = var24 + (var22 << 16) + (var23 << 8) - 16777216;
                class121.field1717[var3++] = var25;
            }
        }
        if (arg0 != -24) {
            field2444 = 91;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 142)
    public static final void method1221(String arg0, int arg1, int arg2) {
        class33.field378++;
        field2445++;
        class32.method258(-86, class342.field4732);
        class472.field6970.method638(255, class494.method2962(arg0, (byte) -81) + arg2);
        class472.field6970.method608(0, arg1);
        class472.field6970.method605(62, arg0);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILya;IIII)Lt;", line = 157)
    public static final class471 method1222(int arg0, int arg1, class38 arg2, int arg3, int arg4, int arg5, int arg6) {
        field2448++;
        long var7 = (long) arg0;
        class471 var9 = (class471) class153.field2171.method1115(var7, (byte) 58);
        short var10 = 2055;
        if (var9 == null) {
            class353 var11 = class118.method933(0, class62.field726, (byte) 89, arg0);
            if (var11 == null) {
                return null;
            }
            if (var11.field4919 < 13) {
                var11.method2122(0, (byte) -106);
            }
            var9 = arg2.method314(var11, var10, class63.field750, 64, 768);
            class153.field2171.method1107(1, var7, var9);
        }
        class471 var12 = var9.method458((byte) 2, var10, true);
        if (arg5 != 0) {
            var12.method451(arg5);
        }
        if (arg3 > -108) {
            method1222(-19, 101, null, -29, -117, -7, -4);
        }
        if (arg1 != 0) {
            var12.method447(arg1);
        }
        if (arg4 != 0) {
            var12.method455(arg4);
        }
        if (arg6 != 0) {
            var12.method446(0, arg6, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B)V", line = 206)
    public class172(byte[] arg0) {
        this.field2449 = arg0;
    }
}
