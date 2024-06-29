import jaggl.OpenGL;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class77 extends class88 implements class678 {

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "Led;")
    public static class732 field1076 = new class732(14, 0, 4, 1);

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    public static int field1078;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sh", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field1079;

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lsha;Lg;II[BII)V")
    public class77(class757 arg0, class166 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class415.field5986, arg2 * arg3, false);
        this.field1070 = arg2;
        this.field1064 = arg3;
        super.field1258.method3882(0, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field1243, 0, this.method711(-122), arg2, arg3, 0, class350.method2238((byte) 79, super.field1249), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(FZ)F")
    public final float method617(float arg0, boolean arg1) {
        ++field1078;
        if (arg1) {
            this.method620(96, -92, -117, 45, -83, (int[]) null, 92, -114);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lsha;Lg;II[FII)V")
    public class77(class757 arg0, class166 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class415.field5990, arg2 * arg3, false);
        this.field1064 = arg3;
        this.field1070 = arg2;
        super.field1258.method3882(0, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field1243, 0, this.method711(-123), arg2, arg3, 0, class350.method2238((byte) 79, super.field1249), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIII[BLg;IB)V")
    public final void method618(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, class166 arg6, int arg7, byte arg8) {
        ++field1069;
        super.field1258.method3882(0, this);
        if (arg2 == 0) {
            arg2 = arg7;
        }
        OpenGL.glPixelStorei(3317, 1);
        if (arg2 != arg7) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Dub(super.field1243, 0, arg1, arg4, arg7, arg3, class350.method2238((byte) 79, arg6), 5121, arg5, arg0);
        if (arg2 != arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        int var10 = -79 % ((arg8 - 20) / 59);
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)V")
    public static void method619(int arg0) {
        if (arg0 < -74) {
            field1076 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIII[III)V")
    public final void method620(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        super.field1258.method3882(0, this);
        if (~arg4 == -1) {
            arg4 = arg2;
        }
        ++field1067;
        if (arg6 <= 63) {
            field1076 = null;
        }
        if (arg2 != arg4) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Di(super.field1243, 0, arg3, arg1, arg2, arg7, 32993, super.field1258.field10336, arg5, arg0);
        if (arg2 != arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IF)F")
    public final float method621(int arg0, float arg1) {
        ++field1071;
        return arg0 != 20490 ? -0.2936516F : arg1;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lsha;Lg;Lwj;II)V")
    public class77(class757 arg0, class166 arg1, class415 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field1064 = arg4;
        this.field1070 = arg3;
        super.field1258.method3882(0, this);
        OpenGL.glTexImage2Dub(super.field1243, 0, this.method711(-115), arg3, arg4, 0, class350.method2238((byte) 79, super.field1249), class195.method1284(5125, super.field1260), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZZZ)V")
    public final void method622(boolean arg0, boolean arg1, boolean arg2) {
        if (arg0) {
            ++field1072;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)I")
    public final int method623(boolean arg0) {
        if (arg0) {
            this.method622(true, true, true);
        }
        ++field1065;
        return this.field1070;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lsha;II[III)V")
    public class77(class757 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class109.field1521, class415.field5986, arg1 * arg2, false);
        this.field1070 = arg1;
        this.field1064 = arg2;
        super.field1258.method3882(0, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field1243, 0, 6408, this.field1070, this.field1064, 0, 32993, super.field1258.field10336, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BZ[B)V")
    public static final void method624(byte arg0, boolean arg1, byte[] arg2) {
        ++field1066;
        int var3 = 43 % ((arg0 - -14) / 44);
        if (class350.field5103 == null) {
            class350.field5103 = new class254(20000);
        }
        class350.field5103.method1716(arg2, arg2.length, 0, true);
        if (arg1) {
            class318.method2061(class350.field5103.field3789, 72);
            class310.field4388 = new class154[class371.field5408];
            int var4 = 0;
            for (int var5 = class488.field6803; var5 <= class187.field2449; ++var5) {
                class154 var6 = class673.method3712((byte) 76, var5);
                if (var6 != null) {
                    class310.field4388[var4++] = var6;
                }
            }
            class141.field1891 = false;
            class221.field2864 = class401.method2440(false);
            class350.field5103 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZZIII)V")
    public static final void method625(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class654.method3639(-104);
        ++field1077;
        if (!arg1) {
            method625(true, false, -35, -68, -75);
        }
        class697.field9250 = 0L;
        int var5 = class164.method1133(-15388);
        if (~arg2 == -4 || ~var5 == -4) {
            arg0 = true;
        }
        if (!class375.field5490.method479()) {
            arg0 = true;
        }
        class398.method2427(arg2, 36, arg3, var5, arg0, arg4);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Z")
    public static final boolean method626(byte arg0, String arg1, Class arg2) {
        if (arg0 < 65) {
            field1076 = null;
        }
        ++field1068;
        Class var3 = (Class) class10.field111.get(arg1);
        if (var3 != null) {
            return var3.getClassLoader() == arg2.getClassLoader();
        } else {
            File var4 = null;
            if (var4 == null) {
                var4 = (File) class732.field9911.get(arg1);
            }
            if (var4 != null) {
                try {
                    var4 = new File(var4.getCanonicalPath());
                    Class var5 = Class.forName("java.lang.Runtime");
                    Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    Method var8 = var5.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                    var7.invoke(var8, Boolean.TRUE);
                    var8.invoke(Runtime.getRuntime(), arg2, var4.getPath());
                    var7.invoke(var8, Boolean.FALSE);
                    class10.field111.put(arg1, arg2);
                    return true;
                } catch (NoSuchMethodException var9) {
                    System.load(var4.getPath());
                    class10.field111.put(arg1, field1079 != null ? field1079 : (field1079 = method630("caa")));
                    return true;
                } catch (Throwable var10) {
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)I")
    public final int method627(int arg0) {
        ++field1074;
        if (arg0 != -7840) {
            method626((byte) 93, (String) null, (Class) null);
        }
        return this.field1064;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Z")
    public final boolean method628(int arg0) {
        ++field1073;
        if (arg0 != 15501) {
            this.field1064 = 57;
        }
        return false;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[IIIIII)V")
    public final void method629(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1075;
        int[] var8 = new int[this.field1070 * this.field1064];
        super.field1258.method3882(arg4 + 14191, this);
        OpenGL.glGetTexImagei(super.field1243, 0, 32993, 5121, var8, 0);
        int var9 = 0;
        if (arg4 != -14191) {
            this.method627(9);
        }
        while (~arg5 < ~var9) {
            class421.method2531(var8, (arg2 + arg5 + -var9 - 1) * this.field1070, arg1, arg0 - -(arg6 * var9), arg6);
            ++var9;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method630(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
