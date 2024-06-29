import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class class778 {

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Ltja;")
    public static class288 field10744 = new class288(4);

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Ltu;")
    public static class369 field10745 = new class369(0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field10740;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field10741;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field10742;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field10743;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Ltc;")
    public static class372 field10746;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field10747;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field10748;

    // $FF: synthetic method
    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4322(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I", line = 3)
    public static final int method4317(int arg0, int arg1) {
        if (arg1 > -53) {
            return -121;
        } else {
            field10740++;
            return arg0 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V", line = 25)
    public static void method4318(byte arg0) {
        if (arg0 == -79) {
            field10745 = null;
            field10744 = null;
            field10746 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V", line = 41)
    public static final void method4319(int arg0) {
        if (arg0 < 2) {
            return;
        }
        field10741++;
        class506.field7198 = -1;
        class268.field3168 = 1;
        long var1 = 0L;
        if (class31.field491 == null) {
            class138.method1010(35, (byte) 50);
        } else {
            class403 var3 = new class403(class343.method2036((byte) -69, class494.method2911(class31.field491, -104)));
            long var4 = var3.method2361(26);
            class616.field8285 = var3.method2361(49);
            class571.method3312(class486.method2889(true, var4), false, true, "", -119);
        }
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V", line = 76)
    public static final void method4320(int arg0) {
        field10742++;
        if (class12.field211 != null) {
            return;
        }
        class12.field211 = new int[65536];
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
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var11 = var16;
                    var9 = var8;
                } else if (var14 == 1) {
                    var11 = var16;
                    var9 = var17;
                    var10 = var8;
                } else if (var14 == 2) {
                    var9 = var16;
                    var10 = var8;
                    var11 = var18;
                } else if (var14 == 3) {
                    var11 = var8;
                    var9 = var16;
                    var10 = var17;
                } else if (var14 == 4) {
                    var11 = var8;
                    var10 = var16;
                    var9 = var18;
                } else if (var14 == 5) {
                    var9 = var8;
                    var11 = var17;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class12.field211[var3++] = var25;
            }
        }
        if (arg0 != 27737) {
            field10744 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)I", line = 204)
    public static final int method4321(byte arg0) {
        field10743++;
        int var1 = 0;
        Field[] var2 = (field10747 == null ? (field10747 = method4322("hd")) : field10747).getDeclaredFields();
        Field[] var3 = var2;
        if (arg0 != 123) {
            method4318((byte) -33);
        }
        for (int var4 = 0; var4 < var3.length; var4++) {
            Field var5 = var3[var4];
            if ((field10748 == null ? (field10748 = method4322("vg")) : field10748).isAssignableFrom(var5.getType())) {
                var1++;
            }
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V")
    public abstract void method131(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public abstract void method138(int arg0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()V")
    public abstract void method128();

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)V")
    public abstract void method130(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III[I)V")
    public abstract void method135(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "()Lnh;")
    public abstract class778 method136();

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public abstract void method139(int arg0);

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V")
    public abstract void method126(int arg0);

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V")
    public abstract void method125(int arg0);

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(III[I)V")
    public abstract void method132(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V")
    public abstract void method133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lnh;)V")
    public abstract void method141(class778 arg0);

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)V")
    public abstract void method123(int arg0);

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(III[I)V")
    public abstract void method134(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)V")
    public abstract void method122(int arg0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([I)V")
    public abstract void method124(int[] arg0);
}
