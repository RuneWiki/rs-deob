import jaggl.OpenGL;
import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public abstract class class478 extends class487 {

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "Z")
    public boolean field6964;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
    public int field6965;

    @OriginalMember(owner = "client!sv", name = "w", descriptor = "S")
    public short field6971;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "B")
    public byte field6956;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "B")
    public byte field6957;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public int field6954;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "S")
    public short field6970;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "S")
    public short field6959;

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "S")
    public short field6962;

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
    public int field6961;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "Ljava/lang/String;")
    public static String field6955 = null;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "Lbd;")
    public static class44 field6963 = new class44("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
    public int field6960;

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "I")
    public static int field6966;

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
    public static int field6969;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sv", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field6972;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2832(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIBIII)Z", line = 6)
    public static final boolean method2827(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field6968++;
        int var6 = -85 / ((arg2 - 52) / 62);
        for (int var7 = arg3; var7 <= arg5; var7++) {
            for (int var8 = arg4; var8 <= arg1; var8++) {
                if (class430.field6187[var7][var8] == arg0 && class302.field4482[var7][var8] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(B)V", line = 46)
    public void method127(byte arg0) {
        if (arg0 > -94) {
            method2829(101, -1, -52, -21, 42, null, -105);
        }
        field6958++;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/awt/Component;ZB)Lhh;", line = 57)
    public static final class86 method2828(Component arg0, boolean arg1, byte arg2) {
        field6967++;
        try {
            Constructor var3 = Class.forName("ik").getDeclaredConstructor(field6972 == null ? (field6972 = method2832("java.awt.Component")) : field6972, Boolean.TYPE);
            return (class86) var3.newInstance(arg0, Boolean.valueOf(arg1));
        } catch (Throwable var4) {
            return arg2 > -27 ? null : new class471(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIII[FI)V", line = 75)
    public static final void method2829(int arg0, int arg1, int arg2, int arg3, int arg4, float[] arg5, int arg6) {
        field6969++;
        if (arg4 > 0 && !class494.method2900((byte) 105, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg6 <= 0 || class494.method2900((byte) -86, arg6)) {
            int var7 = class474.method2814(arg3, 6410);
            int var8 = 0;
            int var9 = arg4 < arg6 ? arg4 : arg6;
            int var10 = arg4 >> 1;
            int var11 = arg6 >> 1;
            float[] var12 = arg5;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg1, var8, arg0, arg4, arg6, 0, arg3, 5126, var12, 0);
                if (var9 <= 1) {
                    if (arg2 < 91) {
                        field6963 = null;
                        return;
                    }
                    return;
                }
                int var14 = arg4 * var7;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                arg6 = var11;
                var12 = var15;
                arg4 = var10;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "(I)V", line = 175)
    public static void method2830(int arg0) {
        field6963 = null;
        if (arg0 <= 9) {
            method2827(-45, -74, (byte) -31, -15, -50, 86);
        }
        field6955 = null;
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(B)V", line = 193)
    public static final void method2831(byte arg0) {
        field6966++;
        class536 var1 = null;
        try {
            class81 var2 = class280.field4173.method2463(false, "2", true);
            while (var2.field1314 == 0) {
                class477.method2826(1L, 0);
            }
            if (var2.field1314 == 1) {
                var1 = (class536) var2.field1311;
                class519 var3 = new class519(class263.field3979 * 6 + 3);
                var3.method3048(-2034159384, 1);
                var3.method3016(class263.field3979, -10);
                for (int var4 = 0; var4 < class288.field4270.length; var4++) {
                    if (class388.field5517[var4]) {
                        var3.method3016(var4, -7);
                        var3.method3019(class288.field4270[var4], 11648);
                    }
                }
                var1.method3163(var3.field7545, var3.field7558, 0, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 < 71) {
                method2827(99, 111, (byte) -72, 17, -18, -66);
            }
            if (var1 != null) {
                var1.method3165(-7527);
            }
        } catch (Exception var5) {
        }
        class516.field7475 = class165.method1188((byte) 26);
        class84.field1340 = false;
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 249)
    public class478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field6964 = arg8;
        this.field6965 = arg3;
        this.field6971 = (short) arg4;
        this.field6956 = (byte) arg0;
        this.field6957 = arg9;
        this.field6954 = arg2;
        this.field6970 = (short) arg5;
        this.field6959 = (short) arg7;
        this.field6962 = (short) arg6;
        this.field6961 = arg1;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(Z)I")
    public abstract int method1792(boolean arg0);
}
