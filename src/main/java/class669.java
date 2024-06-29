import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class669 {

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public int field9401 = 512;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public int field9405 = -1;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "Z")
    public boolean field9407 = true;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public int field9412 = 64;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "Z")
    public boolean field9398 = true;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public int field9400 = 127;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
    public int field9415 = 0;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "Z")
    public boolean field9414 = false;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
    public int field9418 = 8;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public int field9416 = 1190717;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
    public int field9417 = -1;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "Z")
    public static boolean field9410 = false;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "Leo;")
    public static class314 field9409 = new class314();

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "Z")
    public static boolean field9419 = false;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field9402;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field9403;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field9406;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public int field9408;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field9411;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public static int field9413;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public static int field9420;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "Lcka;")
    public class186 field9404;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ck", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field9421;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3725(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Z", line = 15)
    public static final boolean method3718(byte arg0, String arg1, Class arg2) {
        field9420++;
        if (arg0 > -85) {
            field9410 = true;
        }
        Class var3 = (Class) class139.field2027.get(arg1);
        if (var3 != null) {
            return var3.getClassLoader() == arg2.getClassLoader();
        }
        File var4 = null;
        if (var4 == null) {
            var4 = (File) class587.field7824.get(arg1);
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
                class139.field2027.put(arg1, arg2);
                return true;
            } catch (NoSuchMethodException var9) {
                System.load(var4.getPath());
                class139.field2027.put(arg1, field9421 == null ? (field9421 = method3725("ou")) : field9421);
                return true;
            } catch (Throwable var10) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILjp;)V", line = 85)
    public final void method3719(int arg0, class376 arg1) {
        field9402++;
        if (arg0 != -7) {
            method3722(39);
        }
        while (true) {
            int var3 = arg1.method2398(arg0 ^ 0x51D275F1);
            if (var3 == 0) {
                return;
            }
            this.method3724(arg1, 107, var3);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)Ljava/lang/String;", line = 109)
    public static final String method3720(int arg0, int arg1, int arg2) {
        field9413++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            if (arg0 != 9) {
                field9399 = -18;
            }
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZFIIIIII)[I", line = 150)
    public static final int[] method3721(boolean arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9406++;
        int[] var8 = new int[arg7];
        class13 var9 = new class13();
        if (arg6 != -15) {
            return null;
        }
        var9.field199 = arg2;
        var9.field201 = arg3;
        var9.field213 = arg5;
        var9.field200 = arg4;
        var9.field194 = arg0;
        var9.field195 = (int) (arg1 * 4096.0F);
        var9.method101(true);
        class160.method1172(arg7, 1, -50);
        var9.method98(125, var8, 0);
        return var8;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 174)
    public static void method3722(int arg0) {
        if (arg0 != 2) {
            method3721(false, -0.68490297F, -123, 22, -104, -125, -57, -50);
        }
        field9409 = null;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V", line = 191)
    public final void method3723(int arg0) {
        field9403++;
        if (arg0 != 127) {
            this.method3719(-114, null);
        }
        this.field9418 = this.field9408 | this.field9418 << 8;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljp;II)V", line = 207)
    private final void method3724(class376 arg0, int arg1, int arg2) {
        field9411++;
        if (arg1 < 58) {
            method3722(42);
        }
        if (arg2 == 1) {
            this.field9415 = class410.method2534((byte) -3, arg0.method2373(1223262424));
        } else if (arg2 == 2) {
            this.field9405 = arg0.method2398(-1372747256);
        } else if (arg2 == 3) {
            this.field9405 = arg0.method2359(-1);
            if (this.field9405 == 65535) {
                this.field9405 = -1;
                return;
            }
        } else if (arg2 == 5) {
            this.field9398 = false;
        } else if (arg2 == 7) {
            this.field9417 = class410.method2534((byte) -3, arg0.method2373(1223262424));
            return;
        } else if (arg2 == 8) {
            this.field9404.field2492 = this.field9408;
            return;
        } else if (arg2 == 9) {
            this.field9401 = arg0.method2359(-1) << 2;
            return;
        } else if (arg2 == 10) {
            this.field9407 = false;
            return;
        } else if (arg2 == 11) {
            this.field9418 = arg0.method2398(-1372747256);
            return;
        } else if (arg2 == 12) {
            this.field9414 = true;
            return;
        } else {
            if (arg2 == 13) {
                this.field9416 = arg0.method2373(1223262424);
            } else if (arg2 == 14) {
                this.field9412 = arg0.method2398(-1372747256) << 2;
                return;
            } else if (arg2 == 16) {
                this.field9400 = arg0.method2398(-1372747256);
                return;
            }
            return;
        }
    }
}
