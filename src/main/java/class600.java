import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class600 {

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "B")
    public byte field8347;

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "B")
    public byte field8344;

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "[I")
    public int[] field8342;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "[I")
    public int[] field8336;

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "[I")
    public int[] field8337;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "S")
    public short field8333;

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "S")
    public short field8335;

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "S")
    public short field8341;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "S")
    public short field8340;

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "[S")
    public short[] field8343;

    @OriginalMember(owner = "client!fba", name = "m", descriptor = "[S")
    public short[] field8345;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "[S")
    public short[] field8338;

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
    public static int field8334;

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "I")
    public static int field8339;

    @OriginalMember(owner = "client!fba", name = "n", descriptor = "I")
    public static int field8346;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fba", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field8348;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3308(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Z", line = 20)
    public static final boolean method3305(String arg0, Class arg1, int arg2) {
        field8334++;
        Class var3 = (Class) class682.field9334.get(arg0);
        if (var3 != null) {
            return var3.getClassLoader() == arg1.getClassLoader();
        }
        if (arg2 != -25704) {
            method3306(-65, 50, -45, (byte) -128, -116, -88, 39);
        }
        File var4 = null;
        if (var4 == null) {
            var4 = (File) class368.field5201.get(arg0);
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
                class682.field9334.put(arg0, arg1);
                return true;
            } catch (NoSuchMethodException var9) {
                System.load(var4.getPath());
                class682.field9334.put(arg0, field8348 == null ? (field8348 = method3308("ws")) : field8348);
                return true;
            } catch (Throwable var10) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIBIII)Z", line = 93)
    public static final boolean method3306(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field8346++;
        int var7 = arg2 + arg6;
        int var8 = arg1 + arg4;
        int var9 = arg0 + arg5;
        if (arg3 != -62) {
            return false;
        } else if (!class147.method923(var8, arg6, var7, var8, arg5, arg6, var9, 0, var8, var9)) {
            return false;
        } else if (class147.method923(var8, var7, var7, var8, arg5, arg6, arg5, 0, var8, var9)) {
            if (arg6 < class88.field1121) {
                if (!class147.method923(var8, arg6, arg6, arg4, var9, arg6, arg5, arg3 ^ 0xFFFFFFC2, var8, var9)) {
                    return false;
                }
                if (!class147.method923(var8, arg6, arg6, arg4, var9, arg6, arg5, arg3 + 62, arg4, arg5)) {
                    return false;
                }
            } else if (!class147.method923(var8, var7, var7, arg4, var9, var7, arg5, 0, var8, var9)) {
                return false;
            } else if (!class147.method923(var8, var7, var7, arg4, var9, var7, arg5, arg3 + 62, arg4, arg5)) {
                return false;
            }
            if (arg5 < class590.field8229) {
                if (!class147.method923(var8, arg6, var7, arg4, arg5, arg6, arg5, arg3 + 62, var8, arg5)) {
                    return false;
                }
                if (!class147.method923(var8, var7, var7, arg4, arg5, arg6, arg5, 0, arg4, arg5)) {
                    return false;
                }
            } else if (!class147.method923(var8, arg6, var7, arg4, var9, arg6, var9, 0, var8, var9)) {
                return false;
            } else if (!class147.method923(var8, var7, var7, arg4, var9, arg6, var9, 0, arg4, var9)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)V", line = 163)
    public static final void method3307(int arg0, int arg1) {
        if (arg0 < 89) {
            return;
        }
        if (class202.field2576 == 1) {
            class397.field5515 = arg1;
        } else if (class202.field2576 == 2) {
            class10.field107 = arg1;
        }
        field8339++;
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V", line = 180)
    public class600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field8347 = (byte) arg1;
        this.field8344 = (byte) arg0;
        this.field8342 = new int[4];
        this.field8336 = new int[4];
        this.field8337 = new int[4];
        this.field8337[0] = arg2;
        this.field8337[2] = arg4;
        this.field8337[1] = arg3;
        this.field8337[3] = arg5;
        this.field8342[1] = arg7;
        this.field8342[3] = arg9;
        this.field8342[0] = arg6;
        this.field8342[2] = arg8;
        this.field8336[0] = arg10;
        this.field8336[1] = arg11;
        this.field8336[3] = arg13;
        this.field8333 = (short) (arg2 >> class455.field6383);
        this.field8336[2] = arg12;
        this.field8335 = (short) (arg4 >> class455.field6383);
        this.field8341 = (short) (arg10 >> class455.field6383);
        this.field8340 = (short) (arg12 >> class455.field6383);
        this.field8343 = new short[4];
        this.field8345 = new short[4];
        this.field8338 = new short[4];
    }
}
