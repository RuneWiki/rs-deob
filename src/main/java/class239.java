import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public abstract class class239 extends class678 {

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    public static int field3537 = 0;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "Z")
    public static boolean field3535 = false;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "J")
    public static long field3538 = -1L;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "[I")
    public static int[] field3539 = new int[5];

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)Z")
    public abstract boolean method1239(boolean arg0);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method1585(Throwable arg0, byte arg1) throws IOException {
        field3532++;
        String var3;
        if (arg0 instanceof class112) {
            class112 var2 = (class112) arg0;
            arg0 = var2.field2010;
            var3 = var2.field2016 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg1 >= -74) {
            field3533 = 27;
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

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static void method1586(int arg0) {
        if (arg0 != -5395) {
            method1586(59);
        }
        field3539 = null;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I)V")
    public class239(int arg0) {
        this.field3534 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1236(int arg0);

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V")
    public static final void method1587(byte arg0) {
        if (arg0 < 37) {
            field3537 = -108;
        }
        field3540++;
        class263 var1 = null;
        try {
            var1 = class17.method391("2", 2);
            class61 var2 = new class61(class253.field3755 * 6 + 3);
            var2.method693((byte) 106, 1);
            var2.method745(class253.field3755, 128);
            for (int var3 = 0; var3 < class650.field9383.length; var3++) {
                if (class302.field4501[var3]) {
                    var2.method745(var3, 128);
                    var2.method715(class650.field9383[var3], 1949991176);
                }
            }
            var1.method1724(var2.field1397, 0, var2.field1393, 0);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method1726((byte) -128);
            }
        } catch (Exception var4) {
        }
        class542.field7565 = class525.method3074((byte) -101);
        class164.field2750 = false;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BIII)V")
    public static final void method1588(byte arg0, int arg1, int arg2, int arg3) {
        field3536++;
        class19 var4 = class373.method2355(110, arg2, 9);
        if (arg0 != -75) {
            field3537 = -20;
        }
        var4.method432(54);
        var4.field833 = arg1;
        var4.field829 = arg3;
    }
}
