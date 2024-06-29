import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class384 {

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "I")
    public static int field5505 = 0;

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "I")
    public static int field5511 = 0;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "Lkr;")
    public static class602 field5506 = new class602(93, 0);

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "I")
    public int field5507;

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "I")
    public int field5510;

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!laa", name = "h", descriptor = "[Lsa;")
    public class205[] field5512;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2408(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != -1) {
            field5506 = null;
        }
        int var7 = arg5 & 0x3;
        field5513++;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg0;
            arg0 = var8;
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return arg3;
        } else if (var7 == 2) {
            return 7 - arg6 - (arg4 + -1);
        } else {
            return 1 + 7 - arg0 - arg3;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(BLdc;)V")
    public final void method2409(byte arg0, class63 arg1) {
        field5508++;
        this.field5510 = arg1.method476((byte) -112);
        this.field5507 = arg1.method482(-772591672);
        if (arg0 <= 21) {
            return;
        }
        this.field5512 = new class205[arg1.method505((byte) -119)];
        class288[] var3 = class130.method822((byte) 76);
        for (int var4 = 0; var4 < this.field5512.length; var4++) {
            this.field5512[var4] = this.method2410(arg1, 0, var3[arg1.method505((byte) -119)]);
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ldc;ILww;)Lsa;")
    private final class205 method2410(class63 arg0, int arg1, class288 arg2) {
        field5509++;
        if (class731.field10160 == arg2) {
            return class378.method2373(arg0, arg1 ^ 0x23);
        } else if (class498.field6963 == arg2) {
            return class401.method2500((byte) -30, arg0);
        } else if (class757.field10565 == arg2) {
            return class550.method3262((byte) -52, arg0);
        } else {
            if (arg1 != 0) {
                method2408(86, -19, 76, -121, -125, 31, -39);
            }
            if (class687.field9560 == arg2) {
                return class495.method2998(arg0, (byte) 56);
            } else if (class550.field7651 == arg2) {
                return class222.method1319(arg0, arg1);
            } else if (class220.field2975 == arg2) {
                return class281.method1875(arg1 ^ 0xBD25B2F0, arg0);
            } else if (class63.field991 == arg2) {
                return class519.method3096(arg0, false);
            } else if (class588.field8005 == arg2) {
                return class737.method4103(25, arg0);
            } else if (class318.field4422 == arg2) {
                return class4.method22(0, arg0);
            } else if (class548.field7624 == arg2) {
                return class4.method23(arg0, (byte) -102);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)V")
    public static void method2411(boolean arg0) {
        if (arg0) {
            field5505 = -74;
        }
        field5506 = null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)Z")
    public static final boolean method2412(byte arg0) {
        field5514++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class581.field7957.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class581.field7957.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class581.field7957.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class380.field5454.get(var9);
                        Class var11 = (Class) class581.field7957.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; var13 < var12.size(); var13++) {
                            try {
                                Object var14 = var12.elementAt(var13);
                                Field var15 = var14.getClass().getDeclaredField("name");
                                var7.invoke(var15, Boolean.TRUE);
                                try {
                                    String var16 = (String) var15.get(var14);
                                    if (var16 != null && var16.equalsIgnoreCase(var10.getCanonicalPath())) {
                                        Field var17 = var14.getClass().getDeclaredField("handle");
                                        Method var18 = var14.getClass().getDeclaredMethod("finalize");
                                        var7.invoke(var17, Boolean.TRUE);
                                        var7.invoke(var18, Boolean.TRUE);
                                        try {
                                            var18.invoke(var14);
                                            var17.set(var14, Integer.valueOf(0));
                                            var1.remove(var9);
                                        } catch (Throwable var19) {
                                        }
                                        var7.invoke(var18, Boolean.FALSE);
                                        var7.invoke(var17, Boolean.FALSE);
                                    }
                                } catch (Throwable var20) {
                                }
                                var7.invoke(var15, Boolean.FALSE);
                            } catch (Throwable var21) {
                            }
                        }
                    } catch (Throwable var22) {
                    }
                }
            } catch (Throwable var23) {
            }
            if (arg0 != -75) {
                field5511 = 121;
            }
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var24) {
        }
        class581.field7957 = var1;
        return class581.field7957.isEmpty();
    }
}
