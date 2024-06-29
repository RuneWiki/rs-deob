import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class371 extends class15 {

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "Lvn;")
    public class459 field5312;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "Z")
    public static boolean field5311 = false;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "[[I")
    public static int[][] field5314 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public static int field5318;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hb", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field5319;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2245(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V", line = 5)
    public static void method2241(int arg0) {
        if (arg0 == 7) {
            field5314 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lvn;)V", line = 14)
    public class371(class459 arg0) {
        this.field5312 = arg0;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V", line = 22)
    public static final void method2242(boolean arg0) {
        if (arg0) {
            return;
        }
        field5313++;
        try {
            Method var1 = (field5319 == null ? (field5319 = method2245("java.lang.Runtime")) : field5319).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class281.field4095 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)I", line = 61)
    public static final int method2243(int arg0, String arg1, byte arg2, String arg3) {
        field5315++;
        int var4 = arg3.length();
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        if (arg2 != -92) {
            field5314 = null;
        }
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || (var7 - var9) < var5) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg1.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class247.method1507(0, var22);
            var9 = class247.method1507(0, var24);
            char var26 = class260.method1595(var22, arg0, (byte) -112);
            char var27 = class260.method1595(var24, arg0, (byte) -112);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class63.method324(arg2 ^ 0xFFFFFFD3, var28, arg0) - class63.method324(9, var29, arg0);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg0 == 2) {
                var16 = var4 - var11 - 1;
                var17 = var5 - var11 - 1;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg3.charAt(var16);
            char var19 = arg1.charAt(var17);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class63.method324(117, var20, arg0) - class63.method324(11, var21, arg0);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class63.method324(123, var14, arg0) - class63.method324(arg2 + 218, var15, arg0);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(B)V", line = 186)
    public static final void method2244(byte arg0) {
        if (arg0 > -78) {
            field5318 = -41;
        }
        field5317++;
        if (!class230.field3183) {
            return;
        }
        while (true) {
            while (class76.field916 < class28.field368.length) {
                class239 var1 = class28.field368[class76.field916];
                if (var1 != null && var1.field3292 == -1) {
                    if (class346.field4947 == null) {
                        class346.field4947 = class99.field1213.method2070(63, var1.field3294);
                    }
                    int var2 = class346.field4947.field4324;
                    if (var2 == -1) {
                        return;
                    }
                    class76.field916++;
                    class346.field4947 = null;
                    var1.field3292 = var2;
                } else {
                    class76.field916++;
                }
            }
            return;
        }
    }
}
