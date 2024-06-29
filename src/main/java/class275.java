import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class275 extends class518 {

    @OriginalMember(owner = "client!aea", name = "n", descriptor = "I")
    private int field3589;

    @OriginalMember(owner = "client!aea", name = "o", descriptor = "I")
    private int field3590;

    @OriginalMember(owner = "client!aea", name = "l", descriptor = "I")
    private int field3587;

    @OriginalMember(owner = "client!aea", name = "m", descriptor = "I")
    private int field3588;

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!aea", name = "k", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!aea", name = "p", descriptor = "I")
    public static int field3591;

    // $FF: synthetic field
    @OriginalMember(owner = "client!aea", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field3592;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(IIB)V")
    public final void method1044(int arg0, int arg1, byte arg2) {
        if (arg2 != 24) {
            this.field3590 = -29;
        }
        ++field3583;
        int var4 = this.field3589 * arg1 >> 12;
        int var5 = this.field3588 * arg1 >> 12;
        int var6 = this.field3587 * arg0 >> 12;
        int var7 = this.field3590 * arg0 >> 12;
        class353.method2032(var5, 67, var4, var6, var7, super.field6595);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZLjava/lang/Class;Ljava/lang/String;)Z")
    public static final boolean method1697(boolean arg0, Class arg1, String arg2) {
        ++field3584;
        if (!arg0) {
            method1697(false, (Class) null, (String) null);
        }
        Class var3 = (Class) class170.field2259.get(arg2);
        if (var3 != null) {
            return var3.getClassLoader() == arg1.getClassLoader();
        } else {
            File var4 = null;
            if (var4 == null) {
                var4 = (File) class232.field3128.get(arg2);
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
                    class170.field2259.put(arg2, arg1);
                    return true;
                } catch (NoSuchMethodException var9) {
                    System.load(var4.getPath());
                    class170.field2259.put(arg2, field3592 != null ? field3592 : (field3592 = method1699("he")));
                    return true;
                } catch (Throwable var10) {
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIB)V")
    public final void method1041(int arg0, int arg1, byte arg2) {
        ++field3585;
        int var4 = this.field3589 * arg0 >> 12;
        if (arg2 > 11) {
            int var5 = this.field3588 * arg0 >> 12;
            int var6 = this.field3587 * arg1 >> 12;
            int var7 = this.field3590 * arg1 >> 12;
            class305.method1800(var4, -118, var5, var6, var7, super.field6592, super.field6594, super.field6595);
        }
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(IIIIIII)V")
    public class275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3589 = arg0;
        this.field3590 = arg3;
        this.field3587 = arg1;
        this.field3588 = arg2;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)V")
    public final void method1042(int arg0, int arg1, int arg2) {
        ++field3586;
        int var4 = this.field3589 * arg1 >> 12;
        if (arg0 != -23442) {
            method1698((class391) null, -59);
        }
        int var5 = this.field3588 * arg1 >> 12;
        int var6 = this.field3587 * arg2 >> 12;
        int var7 = this.field3590 * arg2 >> 12;
        class446.method2555(var7, super.field6592, var6, super.field6594, (byte) -28, var4, var5);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Luaa;I)V")
    public static final void method1698(class391 arg0, int arg1) {
        if (arg1 == 5) {
            ++field3591;
            if (class582.field7362 == arg0.field5110) {
                if (class422.field5564.field375 == null) {
                    arg0.field5027 = 0;
                    arg0.field5069 = 0;
                } else {
                    arg0.field5149 = 150;
                    arg0.field5068 = 2047 & (int) (256.0D * Math.sin((double) class693.field8900 / 40.0D));
                    arg0.field5135 = 5;
                    arg0.field5069 = class330.field4043;
                    arg0.field5027 = class299.method1782(class422.field5564.field375, 4118);
                    arg0.field5024 = class422.field5564.field4696;
                    arg0.field5029 = class422.field5564.field4694;
                    arg0.field5142 = 0;
                    arg0.field5113 = class422.field5564.field4722;
                    class11 var2 = ~arg0.field5024 == 0 ? null : class143.field1864.method4265(true, arg0.field5024);
                    if (var2 != null) {
                        class216.method1423(arg0.field5113, arg1 ^ 5, var2);
                    }
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1699(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
