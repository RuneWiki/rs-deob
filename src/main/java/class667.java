import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class667 extends class362 {

    @OriginalMember(owner = "client!gba", name = "u", descriptor = "I")
    public int field9108;

    @OriginalMember(owner = "client!gba", name = "o", descriptor = "I")
    public int field9102;

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "[I")
    public static int[] field9103 = new int[13];

    @OriginalMember(owner = "client!gba", name = "s", descriptor = "I")
    public static int field9106 = -2;

    @OriginalMember(owner = "client!gba", name = "t", descriptor = "[I")
    public static int[] field9107 = new int[4];

    @OriginalMember(owner = "client!gba", name = "v", descriptor = "I")
    public static int field9109 = 2;

    @OriginalMember(owner = "client!gba", name = "r", descriptor = "I")
    public static int field9105 = 0;

    @OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!gba", name = "w", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!gba", name = "x", descriptor = "I")
    public static int field9111;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gba", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field9112;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
    public static void method3745(int arg0) {
        field9103 = null;
        field9107 = null;
        if (arg0 != 3) {
            field9106 = 101;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Z")
    public static final boolean method3746(Class arg0, byte arg1, String arg2) {
        field9111++;
        Class var3 = (Class) class598.field8210.get(arg2);
        if (var3 != null) {
            return var3.getClassLoader() == arg0.getClassLoader();
        }
        File var4 = null;
        if (var4 == null) {
            var4 = (File) class197.field2895.get(arg2);
        }
        if (arg1 != 20) {
            field9105 = -118;
        }
        if (var4 != null) {
            try {
                var4 = new File(var4.getCanonicalPath());
                Class var5 = Class.forName("java.lang.Runtime");
                Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                Method var8 = var5.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                var7.invoke(var8, Boolean.TRUE);
                var8.invoke(Runtime.getRuntime(), arg0, var4.getPath());
                var7.invoke(var8, Boolean.FALSE);
                class598.field8210.put(arg2, arg0);
                return true;
            } catch (NoSuchMethodException var9) {
                System.load(var4.getPath());
                class598.field8210.put(arg2, field9112 == null ? (field9112 = method3748("bc")) : field9112);
                return true;
            } catch (Throwable var10) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(II)V")
    public class667(int arg0, int arg1) {
        this.field9108 = arg1;
        this.field9102 = arg0;
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V")
    public static final void method3747(int arg0) {
        field9110++;
        if (class456.field6424 != null) {
            return;
        }
        class456.field6424 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFEBD) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x384) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (0.6666666666666666D - var24) * (var16 - var18) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class456.field6424[var3] = var35;
        }
        if (arg0 != 2) {
            field9106 = 92;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3748(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
