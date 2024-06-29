import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class559 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Lmu;")
    public static class303 field7736 = new class303(49, 4);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field7737;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "[Lb;")
    public static class335[] field7738;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V", line = 9)
    public static void method3210(byte arg0) {
        field7738 = null;
        if (arg0 <= 47) {
            field7738 = null;
        }
        field7736 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)Z", line = 21)
    public static final boolean method3211(boolean arg0) {
        field7737++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class598.field8210.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class598.field8210.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            if (!arg0) {
                return false;
            }
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class598.field8210.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class197.field2895.get(var9);
                        Class var11 = (Class) class598.field8210.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; var12.size() > var13; var13++) {
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
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var24) {
        }
        class598.field8210 = var1;
        return class598.field8210.isEmpty();
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)V", line = 122)
    public static final void method3212(int arg0, int arg1, int arg2) {
        if ((class489.field6771 > class489.field6769)) {
            class489.field6769 = (float) ((double) class489.field6769 / 30.0D + (double) class489.field6769);
            if (class489.field6771 < class489.field6769) {
                class489.field6769 = class489.field6771;
            }
            class7.method27(false);
            class489.field6777 = (int) class489.field6769 >> 1;
            class489.field6773 = class11.method64(class489.field6777, 12871);
        } else if (class489.field6769 > class489.field6771) {
            class489.field6769 = (float) ((double) class489.field6769 - (double) class489.field6769 / 30.0D);
            if (class489.field6771 > class489.field6769) {
                class489.field6769 = class489.field6771;
            }
            class7.method27(false);
            class489.field6777 = (int) class489.field6769 >> 1;
            class489.field6773 = class11.method64(class489.field6777, arg0 + 12871);
        }
        field7735++;
        if (~class638.field8761 != arg0 && class606.field8321 != -1) {
            int var3 = class638.field8761 - class33.field850;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class606.field8321 - class614.field8388;
            class33.field850 += var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class614.field8388 -= -var4;
            if (var3 == 0 && var4 == 0) {
                class638.field8761 = -1;
                class606.field8321 = -1;
            }
            class7.method27(false);
        }
        if (class505.field7035 > 0) {
            class723.field9806--;
            if (class723.field9806 == 0) {
                class505.field7035--;
                class723.field9806 = 100;
            }
        } else {
            class699.field9460 = -1;
            class443.field6305 = -1;
        }
        if (!class308.field4271 || class591.field8075 == null) {
            return;
        }
        for (class682 var5 = (class682) class591.field8075.method1269(4); var5 != null; var5 = (class682) class591.field8075.method1264((byte) 116)) {
            class553 var6 = class489.field6760.method2136(var5.field9247.field9629, (byte) 125);
            if (var5.method3824(arg1, arg2, 95)) {
                if (var6.field7622 != null) {
                    if (var6.field7622[4] != null) {
                        class142.method1128(false, var6.field7610, 0, (byte) -100, false, var6.field7641, -1, true, 1006, (long) var5.field9247.field9629, var6.field7622[4], (long) var5.field9247.field9629, -1);
                    }
                    if (var6.field7622[3] != null) {
                        class142.method1128(false, var6.field7610, 0, (byte) -127, false, var6.field7641, -1, true, 1003, (long) var5.field9247.field9629, var6.field7622[3], (long) var5.field9247.field9629, -1);
                    }
                    if (var6.field7622[2] != null) {
                        class142.method1128(false, var6.field7610, 0, (byte) -108, false, var6.field7641, -1, true, 1002, (long) var5.field9247.field9629, var6.field7622[2], (long) var5.field9247.field9629, -1);
                    }
                    if (var6.field7622[1] != null) {
                        class142.method1128(false, var6.field7610, 0, (byte) -69, false, var6.field7641, -1, true, 1012, (long) var5.field9247.field9629, var6.field7622[1], (long) var5.field9247.field9629, -1);
                    }
                    if (var6.field7622[0] != null) {
                        class142.method1128(false, var6.field7610, 0, (byte) -92, false, var6.field7641, -1, true, 1009, (long) var5.field9247.field9629, var6.field7622[0], (long) var5.field9247.field9629, -1);
                    }
                }
                if (!var5.field9247.field9630) {
                    var5.field9247.field9630 = true;
                    class83.method784(class367.field5231, var5.field9247.field9629, var6.field7641);
                }
                if (var5.field9247.field9630) {
                    class83.method784(class659.field9028, var5.field9247.field9629, var6.field7641);
                }
            } else if (var5.field9247.field9630) {
                var5.field9247.field9630 = false;
                class83.method784(class377.field5341, var5.field9247.field9629, var6.field7641);
            }
        }
    }
}
