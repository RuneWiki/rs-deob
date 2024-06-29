import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "Lvg;")
    private class49 field22 = new class49(128);

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "Lri;")
    private class97 field26;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "Lla;")
    public static class418 field20;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dp", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field27;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "Z")
    public static boolean field23;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZLjava/io/File;B)V")
    public static final void method10(boolean arg0, File arg1, byte arg2) {
        if (class46.field633 == null) {
            class673.method3847(true);
        }
        field18++;
        try {
            if (arg2 >= 34) {
                Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
                Method var4 = var3.getDeclaredMethod("dumpHeap", field27 == null ? (field27 = method18("java.lang.String")) : field27, Boolean.TYPE);
                var4.invoke(class46.field633, arg1.getAbsolutePath(), Boolean.valueOf(arg0));
            }
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
    public final void method11(byte arg0) {
        if (arg0 != -47) {
            this.field22 = null;
        }
        field19++;
        class49 var2 = this.field22;
        synchronized (this.field22) {
            this.field22.method569(0);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static void method12(int arg0) {
        if (arg0 > 93) {
            field20 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZ)V")
    public final void method13(int arg0, boolean arg1) {
        field17++;
        class49 var3 = this.field22;
        synchronized (this.field22) {
            if (arg1) {
                method15(null, -86, -105, -116);
            }
            this.field22.method573((byte) 121, arg0);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
    public static final int method14(String arg0, int arg1, int arg2, String arg3) {
        field21++;
        int var4 = arg0.length();
        if (arg1 < 120) {
            return 45;
        }
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var6 - var8 < var4 || (var7 - var9) < var5) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if (var5 <= var7 - var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg0.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg3.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class411.method2619(var22, -1);
            var9 = class411.method2619(var24, -1);
            char var26 = class435.method2767(var22, false, arg2);
            char var27 = class435.method2767(var24, false, arg2);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class466.method2902(arg2, (byte) 74, var28) - class466.method2902(arg2, (byte) 78, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var17 = var4 - var11 - 1;
                var16 = var5 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg0.charAt(var17);
            char var19 = arg3.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class466.method2902(arg2, (byte) 89, var20) - class466.method2902(arg2, (byte) 93, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg0.charAt(var13);
            char var15 = arg3.charAt(var13);
            if (var14 != var15) {
                return class466.method2902(arg2, (byte) 83, var14) - class466.method2902(arg2, (byte) 80, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lpn;III)V")
    public static final void method15(class692 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class43.field597) {
            class252 var4 = class454.field6818[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field4025 != null && var4.field4025.method398((byte) -103)) {
                arg0.method415(0, class134.field2203, 1, class595.field8435, true, 0, var4.field4025);
            }
        }
        if (arg3 < class43.field597) {
            class252 var5 = class454.field6818[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field4025 != null && var5.field4025.method398((byte) -102)) {
                arg0.method415(0, 0, 1, class595.field8435, true, class134.field2203, var5.field4025);
            }
        }
        if (arg2 < class43.field597 && arg3 < class541.field7896) {
            class252 var6 = class454.field6818[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field4025 != null && var6.field4025.method398((byte) -97)) {
                arg0.method415(0, class134.field2203, 1, class595.field8435, true, class134.field2203, var6.field4025);
            }
        }
        if (arg2 < class43.field597 && arg3 > 0) {
            class252 var7 = class454.field6818[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field4025 != null && var7.field4025.method398((byte) -107)) {
                arg0.method415(0, class134.field2203, 1, class595.field8435, true, -class134.field2203, var7.field4025);
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB)Llj;")
    public final class565 method16(int arg0, byte arg1) {
        field25++;
        class49 var3 = this.field22;
        class565 var4;
        synchronized (this.field22) {
            var4 = (class565) this.field22.method560(false, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class97 var5 = this.field26;
        byte[] var6;
        synchronized (this.field26) {
            var6 = this.field26.method926(1, -126, arg0);
        }
        class565 var7 = new class565();
        if (var6 != null) {
            var7.method3347(-1, new class6(var6));
        }
        class49 var8 = this.field22;
        synchronized (this.field22) {
            this.field22.method559(var7, (long) arg0, 0);
            int var9 = 64 % ((-arg1 - 14) / 46);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)V")
    public final void method17(byte arg0) {
        if (arg0 != 43) {
            return;
        }
        class49 var2 = this.field22;
        synchronized (this.field22) {
            this.field22.method563(0);
        }
        field24++;
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lei;ILri;)V")
    public class3(class162 arg0, int arg1, class97 arg2) {
        this.field26 = arg2;
        this.field26.method949(1, 0);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method18(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
