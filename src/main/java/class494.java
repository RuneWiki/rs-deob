import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class494 {

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Z")
    public boolean field7053;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field7054 = -1;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lwl;")
    public class378 field7052;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Lwl;")
    public class378 field7060;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Z")
    public boolean field7057;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)I")
    public static final int method2958(int arg0, int arg1) {
        field7055++;
        return arg1 >= -123 ? 99 : arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static final void method2959(int arg0) {
        field7051++;
        class368.field5459 = 0;
        int var1 = (class532.field7456.field9806 >> 9) + class33.field967;
        int var2 = (class532.field7456.field9815 >> 9) + class323.field4749;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class368.field5459 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class368.field5459 = 1;
        }
        if (arg0 != 9535) {
            field7054 = 80;
        }
        if (class368.field5459 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class368.field5459 = 0;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)Z")
    public static final boolean method2960(int arg0) {
        field7059++;
        Hashtable var1 = new Hashtable();
        if (arg0 != 0) {
            field7054 = 91;
        }
        Enumeration var2 = class26.field916.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class26.field916.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class26.field916.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class4.field464.get(var9);
                        Class var11 = (Class) class26.field916.get(var9);
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
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var24) {
        }
        class26.field916 = var1;
        return class26.field916.isEmpty();
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)Z")
    public final boolean method2961(boolean arg0) {
        field7056++;
        if (arg0) {
            this.field7057 = false;
        }
        return this.field7057 && !this.field7053;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public final void method2962(byte arg0) {
        if (this.field7052 != null) {
            this.field7052.method382((byte) 99);
        }
        field7058++;
        this.field7057 = false;
        if (arg0 <= 60) {
            this.method2962((byte) -36);
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Z)V")
    public class494(boolean arg0) {
        this.field7053 = arg0;
    }
}
