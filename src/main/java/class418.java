import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class418 extends class693 {

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "[Lrk;")
    public class30[] field6033;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field6031 = 0;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "J")
    public static long field6032 = -1L;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field6034 = 0;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field6030;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field6035;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Z")
    public static final boolean method2538(byte arg0, Class arg1, String arg2) {
        field6028++;
        Class var3 = (Class) class26.field916.get(arg2);
        if (var3 != null) {
            return var3.getClassLoader() == arg1.getClassLoader();
        } else if (arg0 == 80) {
            File var4 = null;
            if (var4 == null) {
                var4 = (File) class4.field464.get(arg2);
            }
            if (var4 != null) {
                try {
                    var4 = new File(var4.getCanonicalPath());
                    Class var5 = Class.forName("java.lang.Runtime");
                    Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    Method var8 = var5.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                    var7.invoke(var8, Boolean.TRUE);
                    var8.invoke(Runtime.getRuntime(), arg1, var4.getPath());
                    var7.invoke(var8, Boolean.FALSE);
                    class26.field916.put(arg2, arg1);
                    return true;
                } catch (NoSuchMethodException var9) {
                    System.load(var4.getPath());
                    class26.field916.put(arg2, field6035 == null ? (field6035 = method2541("kda")) : field6035);
                    return true;
                } catch (Throwable var10) {
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "([Lrk;)V")
    public class418(class30[] arg0) {
        this.field6033 = arg0;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(Z)V")
    public static final void method2539(boolean arg0) {
        if (class428.field6169 != null) {
            class428.field6169.method919(-16385);
        }
        field6030++;
        if (arg0) {
            field6034 = 105;
        }
        if (class589.field8482 != null) {
            class589.field8482.method919(-16385);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(FFIIIFII)[F")
    public static final float[] method2540(float arg0, float arg1, int arg2, int arg3, int arg4, float arg5, int arg6, int arg7) {
        field6029++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
        var8[3] = 0.0F;
        var8[1] = 0.0F;
        float var12 = 1.0F - var10;
        var8[0] = var10;
        var8[2] = var11;
        var8[6] = -var11;
        var8[8] = var10;
        var8[7] = 0.0F;
        var8[4] = 1.0F;
        var8[5] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg6 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg3 * arg3 + (arg2 * arg2)));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var15 = (float) arg3 / var19;
                var14 = (float) (-arg2) / var19;
            }
            var13[4] = var16;
            var13[7] = -var14 * var17;
            var13[5] = var14 * var17;
            var13[1] = var15 * var17;
            var13[3] = -var15 * var17;
            var13[8] = var15 * var15 * var18 + var16;
            var13[0] = var14 * var14 * var18 + var16;
            var13[6] = var14 * var15 * var18;
            var13[2] = var14 * var15 * var18;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        if (arg7 < 113) {
            field6034 = -51;
        }
        var9[3] *= arg0;
        var9[2] *= arg1;
        var9[5] *= arg0;
        var9[7] *= arg5;
        var9[8] *= arg5;
        var9[0] *= arg1;
        var9[6] *= arg5;
        var9[4] *= arg0;
        var9[1] *= arg1;
        return var9;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2541(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
