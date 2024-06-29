import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class513 {

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public int field7138;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Ljava/lang/String;")
    public String field7139;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Luv;")
    public static class3 field7142 = new class3(10, 16);

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Z")
    public static boolean field7143 = false;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public static final void method2859(boolean arg0) {
        field7141++;
        if (class455.field6438) {
            return;
        }
        if (arg0) {
            field7143 = true;
        }
        if (class501.field6954.field7869) {
            class521.field7250 = ((int) class521.field7250 - 65 & 0xFFFFFF80);
        } else {
            class628.field9169 += (-24.0F - class628.field9169) / 2.0F;
        }
        class194.field2524 = true;
        class455.field6438 = true;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class513(String arg0, int arg1) {
        this.field7138 = arg1;
        this.field7139 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7140++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Z")
    public static final boolean method2860(int arg0) {
        if (arg0 != 0) {
            method2860(-44);
        }
        field7136++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class20.field291.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class20.field291.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class20.field291.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class496.field6915.get(var9);
                        Class var11 = (Class) class20.field291.get(var9);
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
        class20.field291 = var1;
        return class20.field291.isEmpty();
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static void method2861(byte arg0) {
        field7142 = null;
        if (arg0 >= -107) {
            method2860(98);
        }
    }
}
