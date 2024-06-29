import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class660 {

    @OriginalMember(owner = "client!am", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field9143 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field9148 = 0;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field9140;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field9141;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field9144;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field9145;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field9149;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Lgj;")
    public static class662 field9142;

    // $FF: synthetic field
    @OriginalMember(owner = "client!am", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field9150;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
    public static void method3709(int arg0) {
        field9143 = null;
        field9142 = null;
        if (arg0 != -27744) {
            method3712((byte) 28, true, true);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ltc;IIII)Z")
    public static final boolean method3710(class373 arg0, int arg1, int arg2, int arg3, int arg4) {
        field9147++;
        if (!class378.field5160 || !class633.field8766) {
            return false;
        } else if (class22.field461 < 100) {
            return false;
        } else if (class757.method4186(arg4, (byte) -49, arg2, arg3)) {
            int var5 = arg2 << class654.field9055;
            int var6 = arg3 << class654.field9055;
            int var7 = class745.field10286[arg4].method1897((byte) -34, arg3, arg2) - 1;
            int var8 = var7 + arg0.method907(-20425);
            if (arg0.field5065 == 1) {
                if (!class625.method3519(class365.field4955 + var6, var5, var6, var6, var5, var7, var8, 66, var8, var5)) {
                    return false;
                } else if (class625.method3519(class365.field4955 + var6, var5, var6, class365.field4955 + var6, var5, var7, var8, -82, var7, var5)) {
                    class640.field8802++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field5065 == 2) {
                if (!class625.method3519(var6 + class365.field4955, var5, class365.field4955 + var6, class365.field4955 + var6, var5, var7, var8, -94, var8, class365.field4955 + var5)) {
                    return false;
                } else if (class625.method3519(class365.field4955 + var6, var5, var6 + class365.field4955, class365.field4955 + var6, var5 + class365.field4955, var7, var7, arg1 - 6212, var8, class365.field4955 + var5)) {
                    class640.field8802++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field5065 == 4) {
                if (!class625.method3519(var6 + class365.field4955, class365.field4955 + var5, var6, var6, var5 + class365.field4955, var7, var8, 60, var8, var5 + class365.field4955)) {
                    return false;
                } else if (class625.method3519(var6 + class365.field4955, class365.field4955 + var5, var6, class365.field4955 + var6, class365.field4955 + var5, var7, var8, -79, var7, class365.field4955 + var5)) {
                    class640.field8802++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field5065 == 8) {
                if (!class625.method3519(var6, var5, var6, var6, var5, var7, var8, 30, var8, var5 + class365.field4955)) {
                    return false;
                } else if (class625.method3519(var6, var5, var6, var6, class365.field4955 + var5, var7, var7, -83, var8, class365.field4955 + var5)) {
                    class640.field8802++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field5065 == 16) {
                if (class307.method1955(class370.field5022, var8, class370.field5022, -1, class370.field5022 + var6, var5, var7)) {
                    class640.field8802++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field5065 == 32) {
                if (class307.method1955(class370.field5022, var8, class370.field5022, arg1 ^ 0xFFFFE75D, var6 + class370.field5022, var5 - -class370.field5022, var7)) {
                    class640.field8802++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field5065 == 64) {
                if (class307.method1955(class370.field5022, var8, class370.field5022, -1, var6, class370.field5022 + var5, var7)) {
                    class640.field8802++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field5065 != 128) {
                return arg1 == 6306 ? true : true;
            } else if (class307.method1955(class370.field5022, var8, class370.field5022, -1, var6, var5, var7)) {
                class640.field8802++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(FFFB)F")
    public static final float method3711(float arg0, float arg1, float arg2, byte arg3) {
        if (arg3 <= 48) {
            method3709(62);
        }
        field9149++;
        return (arg1 - arg2) * arg0 + arg2;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BZZ)V")
    public static final void method3712(byte arg0, boolean arg1, boolean arg2) {
        field9146++;
        if (arg2) {
            class382.field5192--;
            if (class382.field5192 == 0) {
                class424.field5802 = null;
            }
        }
        if (arg0 >= -49 || !arg1) {
            return;
        }
        class313.field4287--;
        if (class313.field4287 == 0) {
            class624.field8692 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/io/File;IZ)V")
    public static final void method3713(File arg0, int arg1, boolean arg2) {
        field9140++;
        if (class662.field9195 == null) {
            class383.method2324((byte) 122);
        }
        try {
            if (arg1 != 3) {
                method3711(-1.7128015F, -0.49723434F, -0.09278228F, (byte) 75);
            }
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field9150 == null ? (field9150 = method3715("java.lang.String")) : field9150, Boolean.TYPE);
            var4.invoke(class662.field9195, arg0.getAbsolutePath(), Boolean.valueOf(arg2));
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
    public static final void method3714(int arg0) {
        field9141++;
        if (arg0 != -29080) {
            return;
        }
        class262.field3679.method2079((byte) -68);
        int var1 = class262.field3679.method2078(8, 15455);
        if (class610.field8520 > var1) {
            for (int var2 = var1; var2 < class610.field8520; var2++) {
                class546.field7418[class461.field6266++] = class744.field10273[var2];
            }
        }
        if (class610.field8520 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class610.field8520 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class744.field10273[var3];
            class666 var5 = ((class755) class664.field9216.method337((long) var4, 1)).field10414;
            int var6 = class262.field3679.method2078(1, 15455);
            if (var6 == 0) {
                class744.field10273[class610.field8520++] = var4;
                var5.field5258 = class475.field6431;
            } else {
                int var7 = class262.field3679.method2078(2, 15455);
                if (var7 == 0) {
                    class744.field10273[class610.field8520++] = var4;
                    var5.field5258 = class475.field6431;
                    class449.field6154[class614.field8549++] = var4;
                } else if (var7 == 1) {
                    class744.field10273[class610.field8520++] = var4;
                    var5.field5258 = class475.field6431;
                    int var8 = class262.field3679.method2078(3, 15455);
                    var5.method3761(1, -13677, var8);
                    int var9 = class262.field3679.method2078(1, 15455);
                    if (var9 == 1) {
                        class449.field6154[class614.field8549++] = var4;
                    }
                } else if (var7 == 2) {
                    class744.field10273[class610.field8520++] = var4;
                    var5.field5258 = class475.field6431;
                    if (class262.field3679.method2078(1, 15455) == 1) {
                        int var10 = class262.field3679.method2078(3, arg0 + 44535);
                        var5.method3761(2, -13677, var10);
                        int var11 = class262.field3679.method2078(3, arg0 ^ 0xFFFFB237);
                        var5.method3761(2, arg0 + 15403, var11);
                    } else {
                        int var12 = class262.field3679.method2078(3, 15455);
                        var5.method3761(0, -13677, var12);
                    }
                    int var13 = class262.field3679.method2078(1, 15455);
                    if (var13 == 1) {
                        class449.field6154[class614.field8549++] = var4;
                    }
                } else if (var7 == 3) {
                    class546.field7418[class461.field6266++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9145++;
        throw new IllegalStateException();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3715(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
