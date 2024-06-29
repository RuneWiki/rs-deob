import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class310 extends class352 {

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
    private int field3951;

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "I")
    private int field3955;

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "I")
    private int field3963;

    @OriginalMember(owner = "client!rv", name = "x", descriptor = "I")
    private int field3961;

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "I")
    private int field3954;

    @OriginalMember(owner = "client!rv", name = "y", descriptor = "Len;")
    private class478 field3962;

    @OriginalMember(owner = "client!rv", name = "B", descriptor = "I")
    private int field3965;

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
    public static int field3953 = 0;

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "Lae;")
    public static class40 field3952 = new class40();

    @OriginalMember(owner = "client!rv", name = "A", descriptor = "I")
    public static int field3964 = 0;

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!rv", name = "u", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!rv", name = "w", descriptor = "Loq;")
    private class660 field3960;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZ)V", line = 5)
    public static final void method1790(int arg0, boolean arg1) {
        field3958++;
        class671.method3767((byte) 76);
        if (!class669.method3760(class504.field6675, (byte) -62)) {
            return;
        }
        class589.field8277++;
        if (class589.field8277 < 50 && !arg1) {
            return;
        }
        class589.field8277 = 0;
        if (!class579.field8113 && class446.field5686 != null) {
            class490.field6479++;
            class704 var2 = class314.method1820(class674.field9481, class400.field5014, (byte) -127);
            class122.method654(var2, (byte) -36);
            try {
                class558.method3071((byte) 121);
            } catch (IOException var3) {
                class579.field8113 = true;
            }
        }
        class671.method3767((byte) 76);
        if (arg0 != -1) {
            field3952 = null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)V", line = 42)
    public static void method1791(byte arg0) {
        if (arg0 != -1) {
            method1792(false);
        }
        field3952 = null;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(Z)V", line = 58)
    public static final void method1792(boolean arg0) {
        field3956++;
        if (arg0) {
            field3952 = null;
        }
        if (class581.field8129 == null) {
            return;
        }
        if (class581.field8129.field3358 == 1) {
            class581.field8129 = null;
            return;
        }
        if (class581.field8129.field3358 == 2) {
            class442.method2368(-97, class168.field2204, class523.field7117, 2);
            class581.field8129 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLjava/lang/String;)I", line = 89)
    public static final int method1793(byte arg0, String arg1) {
        field3957++;
        if (!class560.field7786.field9151) {
            return -1;
        } else if (class39.field526.containsKey(arg1)) {
            return 100;
        } else {
            if (arg0 != -127) {
                field3952 = null;
            }
            String var2 = class434.method2284((byte) -66, arg1);
            if (var2 == null) {
                return -1;
            }
            String var3 = class491.field6490 + var2;
            if (!class635.field8918.method3339(var3, 69, "")) {
                return -1;
            } else if (class635.field8918.method3362(false, var3)) {
                byte[] var4 = class635.field8918.method3345(78, var3, "");
                Object var5 = null;
                File var6;
                try {
                    var6 = class443.method2372(var2, (byte) -106);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class61.method372((byte) -103, var6);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class560.field7786.method3625(72, var6, var4);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class167.method954(arg1, var6, 49);
                return 100;
            } else {
                return class635.field8918.method3352(var3, arg0 ^ 0xFFFFFFFA);
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)Loq;", line = 183)
    public final class660 method1794(boolean arg0) {
        if (arg0) {
            this.field3963 = -80;
        }
        field3959++;
        if (this.field3960 == null) {
            class106.field1420[1] = this.field3955;
            class106.field1420[0] = this.field3963;
            class106.field1420[3] = this.field3965;
            class106.field1420[5] = this.field3951;
            class526 var2 = this.field3962.field7898;
            class106.field1420[2] = this.field3954;
            class106.field1420[4] = this.field3961;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method2480(false, class106.field1420[var5])) {
                    return null;
                }
                class13 var7 = var2.method2486(class106.field1420[var5], (byte) 86);
                int var8 = var7.field241 ? 64 : 128;
                if (var7.field232 > 0) {
                    var3 = true;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class6.field143[var6] = var2.method2481(class106.field1420[var6], 1.0F, false, var4, -5969, var4);
            }
            this.field3960 = this.field3962.method1696(var3, true, var4, class6.field143);
        }
        return this.field3960;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)Z", line = 244)
    public static final boolean method1795(int arg0) {
        field3950++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class281.field3524.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class281.field3524.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            int var5 = -25 % ((arg0 + 36) / 45);
            Class var6 = Class.forName("java.lang.ClassLoader");
            Field var7 = var6.getDeclaredField("nativeLibraries");
            Method var8 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var8.invoke(var7, Boolean.TRUE);
            try {
                Enumeration var9 = class281.field3524.keys();
                while (var9.hasMoreElements()) {
                    String var10 = (String) var9.nextElement();
                    try {
                        File var11 = (File) class39.field526.get(var10);
                        Class var12 = (Class) class281.field3524.get(var10);
                        Vector var13 = (Vector) var7.get(var12.getClassLoader());
                        for (int var14 = 0; var13.size() > var14; var14++) {
                            try {
                                Object var15 = var13.elementAt(var14);
                                Field var16 = var15.getClass().getDeclaredField("name");
                                var8.invoke(var16, Boolean.TRUE);
                                try {
                                    String var17 = (String) var16.get(var15);
                                    if (var17 != null && var17.equalsIgnoreCase(var11.getCanonicalPath())) {
                                        Field var18 = var15.getClass().getDeclaredField("handle");
                                        Method var19 = var15.getClass().getDeclaredMethod("finalize");
                                        var8.invoke(var18, Boolean.TRUE);
                                        var8.invoke(var19, Boolean.TRUE);
                                        try {
                                            var19.invoke(var15);
                                            var18.set(var15, Integer.valueOf(0));
                                            var1.remove(var10);
                                        } catch (Throwable var20) {
                                        }
                                        var8.invoke(var19, Boolean.FALSE);
                                        var8.invoke(var18, Boolean.FALSE);
                                    }
                                } catch (Throwable var21) {
                                }
                                var8.invoke(var16, Boolean.FALSE);
                            } catch (Throwable var22) {
                            }
                        }
                    } catch (Throwable var23) {
                    }
                }
            } catch (Throwable var24) {
            }
            var8.invoke(var7, Boolean.FALSE);
        } catch (Throwable var25) {
        }
        class281.field3524 = var1;
        return class281.field3524.isEmpty();
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Len;IIIIII)V", line = 350)
    public class310(class478 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3951 = arg6;
        this.field3955 = arg2;
        this.field3963 = arg1;
        this.field3961 = arg5;
        this.field3954 = arg3;
        this.field3962 = arg0;
        this.field3965 = arg4;
    }
}
