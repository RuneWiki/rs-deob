import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public abstract class class489 {

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "Leq;")
    public class357 field6956;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "Lsga;")
    public static class583 field6951 = new class583(8);

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "Laca;")
    public static class580 field6953 = new class580();

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "F")
    public static float field6955;

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "Ltj;")
    public static class662 field6957;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lda", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field6958;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(BLkp;I)V")
    public abstract void method12(byte arg0, class411 arg1, int arg2);

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IZ)V")
    public abstract void method10(int arg0, boolean arg1);

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(III)V")
    public abstract void method8(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V")
    public abstract void method6(int arg0);

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method2857(Throwable arg0, byte arg1) throws IOException {
        field6952++;
        String var3;
        if (arg0 instanceof class401) {
            class401 var2 = (class401) arg0;
            arg0 = var2.field5555;
            var3 = var2.field5554 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg1 != -96) {
            method2859((byte) 63);
        }
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZBLjava/io/File;)V")
    public static final void method2858(boolean arg0, byte arg1, File arg2) {
        if (class132.field1572 == null) {
            class523.method3005(2048);
        }
        field6954++;
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field6958 == null ? (field6958 = method2860("java.lang.String")) : field6958, Boolean.TYPE);
            int var5 = -69 / ((-arg1 - 82) / 40);
            var4.invoke(class132.field1572, arg2.getAbsolutePath(), Boolean.valueOf(arg0));
        } catch (Exception var7) {
            System.out.println("HeapDump error:");
            var7.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)V")
    public static void method2859(byte arg0) {
        field6951 = null;
        field6957 = null;
        if (arg0 >= -44) {
            field6951 = null;
        }
        field6953 = null;
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(B)Z")
    public abstract boolean method7(byte arg0);

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(IZ)V")
    public abstract void method9(int arg0, boolean arg1);

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Leq;)V")
    public class489(class357 arg0) {
        this.field6956 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2860(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
