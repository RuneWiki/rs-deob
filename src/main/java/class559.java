import java.awt.Canvas;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class559 extends class660 {

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "Lmj;")
    private class344 field7985;

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
    private int field7986;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
    private int field7980;

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "I")
    private int field7978;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
    private int field7981;

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
    private int field7975;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "I")
    private int field7976;

    @OriginalMember(owner = "client!lu", name = "u", descriptor = "Lsb;")
    public static class305 field7987 = new class305(48, 11);

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "I")
    public static int field7977;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
    public static int field7979;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
    public static int field7983;

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "I")
    public static int field7984;

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "Lica;")
    private class219 field7982;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lu", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field7989;

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "[[B")
    public static byte[][] field7988;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(JJ)J")
    public static long method3171(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Z")
    public static final boolean method3172(Class arg0, int arg1, String arg2) {
        field7977++;
        Class var3 = (Class) class166.field1867.get(arg2);
        if (var3 != null) {
            return var3.getClassLoader() == arg0.getClassLoader();
        }
        File var4 = null;
        if (var4 == null) {
            var4 = (File) class673.field9364.get(arg2);
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
                class166.field1867.put(arg2, arg0);
                return true;
            } catch (NoSuchMethodException var9) {
                System.load(var4.getPath());
                class166.field1867.put(arg2, field7989 == null ? (field7989 = method3176("qga")) : field7989);
                return true;
            } catch (Throwable var10) {
            }
        }
        if (arg1 > -27) {
            field7984 = -23;
        }
        return false;
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)V")
    public static void method3173(int arg0) {
        field7987 = null;
        field7988 = null;
        if (arg0 != 0) {
            field7984 = 102;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lfa;ILjava/awt/Canvas;)Lr;")
    public static final class564 method3174(class524 arg0, int arg1, Canvas arg2) {
        field7983++;
        if (arg1 != 1) {
            field7988 = null;
        }
        return new class172(arg2, arg0);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)Lica;")
    public final class219 method3175(int arg0) {
        if (arg0 > -44) {
            return null;
        }
        field7979++;
        if (this.field7982 == null) {
            class461.field6559[3] = this.field7975;
            class461.field6559[0] = this.field7981;
            class461.field6559[5] = this.field7976;
            class461.field6559[4] = this.field7986;
            class524 var2 = this.field7985.field8050;
            class461.field6559[2] = this.field7980;
            class461.field6559[1] = this.field7978;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method144(8649, class461.field6559[var5])) {
                    return null;
                }
                class295 var7 = var2.method140(class461.field6559[var5], 862);
                int var8 = var7.field3668 ? 64 : 128;
                if (var7.field3675 > 0) {
                    var3 = true;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class287.field3583[var6] = var2.method145(var4, false, 1.0F, -18551, var4, class461.field6559[var6]);
            }
            this.field7982 = this.field7985.method1321(var4, var3, class287.field3583, (byte) 52);
        }
        return this.field7982;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lmj;IIIIII)V")
    public class559(class344 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7985 = arg0;
        this.field7986 = arg5;
        this.field7980 = arg3;
        this.field7978 = arg2;
        this.field7981 = arg1;
        this.field7975 = arg4;
        this.field7976 = arg6;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3176(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
