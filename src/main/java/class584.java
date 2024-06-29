import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class584 {

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "J")
    public static long field7641 = -1L;

    @OriginalMember(owner = "client!kha", name = "e", descriptor = "[[I")
    public static int[][] field7645 = new int[6][];

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!kha", name = "d", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(ZIIIIIII)V", line = 8)
    public static final void method3189(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7642++;
        if (!arg0) {
            method3191(-64);
        }
        int var8 = arg4 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class178.field2685 - class229.field3260) * var8 / 100 + class229.field3260;
        int var10 = arg5 * var9 >> 8;
        class100.field1358 = class100.field1299 * var9 >> 8;
        int var11 = 16384 - arg2 & 0x3FFF;
        int var12 = 16384 - arg7 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class451.field6174[var11] * -var10 >> 14;
            var15 = class451.field6177[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class451.field6174[var12] * var15 >> 14;
            var15 = class451.field6177[var12] * var15 >> 14;
        }
        class332.field4729 = arg2;
        class694.field9662 = arg3 - var13;
        class314.field4488 = arg1 - var15;
        class22.field400 = 0;
        class222.field3162 = arg6 - var14;
        class372.field5175 = arg7;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(I)Z", line = 62)
    public static final boolean method3190(int arg0) {
        field7643++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class18.field241.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class18.field241.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                int var8 = 39 / ((arg0 - 62) / 51);
                Enumeration var9 = class18.field241.keys();
                while (var9.hasMoreElements()) {
                    String var10 = (String) var9.nextElement();
                    try {
                        File var11 = (File) class271.field3787.get(var10);
                        Class var12 = (Class) class18.field241.get(var10);
                        Vector var13 = (Vector) var6.get(var12.getClassLoader());
                        for (int var14 = 0; var13.size() > var14; var14++) {
                            try {
                                Object var15 = var13.elementAt(var14);
                                Field var16 = var15.getClass().getDeclaredField("name");
                                var7.invoke(var16, Boolean.TRUE);
                                try {
                                    String var17 = (String) var16.get(var15);
                                    if (var17 != null && var17.equalsIgnoreCase(var11.getCanonicalPath())) {
                                        Field var18 = var15.getClass().getDeclaredField("handle");
                                        Method var19 = var15.getClass().getDeclaredMethod("finalize");
                                        var7.invoke(var18, Boolean.TRUE);
                                        var7.invoke(var19, Boolean.TRUE);
                                        try {
                                            var19.invoke(var15);
                                            var18.set(var15, Integer.valueOf(0));
                                            var1.remove(var10);
                                        } catch (Throwable var20) {
                                        }
                                        var7.invoke(var19, Boolean.FALSE);
                                        var7.invoke(var18, Boolean.FALSE);
                                    }
                                } catch (Throwable var21) {
                                }
                                var7.invoke(var16, Boolean.FALSE);
                            } catch (Throwable var22) {
                            }
                        }
                    } catch (Throwable var23) {
                    }
                }
            } catch (Throwable var24) {
            }
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var25) {
        }
        class18.field241 = var1;
        return class18.field241.isEmpty();
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(I)V", line = 161)
    public static void method3191(int arg0) {
        if (arg0 < -70) {
            field7645 = null;
        }
    }

    @OriginalMember(owner = "client!kha", name = "toString", descriptor = "()Ljava/lang/String;", line = 171)
    public final String toString() {
        field7644++;
        throw new IllegalStateException();
    }
}
