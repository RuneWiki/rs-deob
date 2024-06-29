import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class466 implements class422 {

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "Lpu;")
    private class522 field6705;

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "Ljava/lang/String;")
    private String field6708;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "I")
    public static int field6703 = -1;

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "I")
    public static int field6706 = 0;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "Ltf;")
    public static class264 field6707 = new class264(14, 2);

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!bda", name = "g", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)Lvj;", line = 4)
    public final class405 method638(byte arg0) {
        field6704++;
        int var2 = -20 % ((67 - arg0) / 45);
        return class405.field5933;
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)Z", line = 19)
    public static final boolean method2758(int arg0) {
        field6709++;
        if (arg0 <= 73) {
            method2758(10);
        }
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class9.field88.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class9.field88.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class9.field88.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class336.field4959.get(var9);
                        Class var11 = (Class) class9.field88.get(var9);
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
        class9.field88 = var1;
        return class9.field88.isEmpty();
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)V", line = 124)
    public static void method2759(int arg0) {
        field6707 = null;
        int var1 = 127 / ((-arg0 - 23) / 32);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)I", line = 134)
    public final int method640(int arg0) {
        field6710++;
        if (this.field6705.method3001(this.field6708, false)) {
            return 100;
        } else {
            if (arg0 != 11442) {
                field6707 = null;
            }
            return this.field6705.method2996(this.field6708, (byte) -80);
        }
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lpu;Ljava/lang/String;)V", line = 148)
    public class466(class522 arg0, String arg1) {
        this.field6705 = arg0;
        this.field6708 = arg1;
    }
}
