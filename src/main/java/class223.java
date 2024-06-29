import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class223 {

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public int field3249 = 0;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public int field3257 = 2048;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public int field3255 = 0;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public int field3261 = 2048;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Lfja;")
    public static class783 field3252 = new class783(50, 2);

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field3260 = 0;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "Ltaa;")
    public static class431 field3254;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ik", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field3262;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1526(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZB)I", line = 4)
    public static final int method1518(boolean arg0, byte arg1) {
        field3253++;
        int var2 = class278.field3847;
        if (var2 == 0) {
            return arg0 ? 0 : class361.field4925;
        } else if (var2 == 1) {
            return class361.field4925;
        } else if (var2 == 2) {
            return 0;
        } else {
            int var3 = -21 % ((54 - arg1) / 36);
            return 0;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lha;I)V", line = 44)
    public static final void method1519(class66 arg0, int arg1) {
        field3258++;
        if (arg1 != 8735) {
            method1522(-42);
        }
        class34.field569 = new class401[class668.field9303.length];
        for (int var2 = 0; var2 < class668.field9303.length; var2++) {
            int var3 = class668.field9303[var2];
            class145 var4 = class502.method2871(-1, var3, class3.field40);
            class67 var5 = arg0.method476(var4, class49.method372(class488.field6592, var3), true);
            class34.field569[var2] = new class401(var5, var4);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILfca;I)V", line = 71)
    private final void method1520(int arg0, class93 arg1, int arg2) {
        field3248++;
        if (arg0 == 1) {
            this.field3249 = arg1.method793((byte) 71);
        } else if (arg0 == 2) {
            this.field3261 = arg1.method763(120);
        } else if (arg0 == 3) {
            this.field3257 = arg1.method763(-27);
        } else if (arg0 == 4) {
            this.field3255 = arg1.method774(-4);
        }
        int var4 = 13 % ((-arg2 - 46) / 59);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)Z", line = 100)
    public static final boolean method1521(int arg0) {
        int var1 = 117 / ((arg0 - 50) / 59);
        field3256++;
        return class761.field10485;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 111)
    public static final void method1522(int arg0) {
        field3259++;
        try {
            Method var1 = (field3262 == null ? (field3262 = method1526("java.lang.Runtime")) : field3262).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class381.field5187 = var3;
                } catch (Throwable var4) {
                }
            }
            if (arg0 != 9563) {
                method1521(124);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BFFF)I", line = 147)
    public static final int method1523(byte arg0, float arg1, float arg2, float arg3) {
        field3250++;
        if (arg0 != -106) {
            field3260 = 122;
        }
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = (arg3 < 0.0F) ? -arg3 : arg3;
        float var6 = (arg2 < 0.0F) ? -arg2 : arg2;
        if (var5 > var4 && var5 > var6) {
            return arg3 > 0.0F ? 0 : 1;
        } else if (var4 < var6 && var6 > var5) {
            return (arg2 > 0.0F) ? 2 : 3;
        } else if (arg1 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILfca;)V", line = 194)
    public final void method1524(int arg0, class93 arg1) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method793((byte) 116);
            if (var3 == 0) {
                field3251++;
                return;
            }
            this.method1520(var3, arg1, arg0 - 127);
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V", line = 222)
    public static void method1525(int arg0) {
        field3252 = null;
        field3254 = null;
        if (arg0 > -67) {
            field3252 = null;
        }
    }
}
