import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class655 extends class46 {

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "[I")
    private int[] field9359 = new int[512];

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "[I")
    public static int[] field9354 = new int[32];

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
    public static int field9355;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
    public static int field9356;

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "I")
    public static int field9357;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
    public static int field9358;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IFIBIFIFFI[F)V")
    public final void method223(int arg0, float arg1, int arg2, byte arg3, int arg4, float arg5, int arg6, float arg7, float arg8, int arg9, float[] arg10) {
        field9357++;
        int var12 = (int) ((float) arg6 * arg1 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg0 * arg8 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg2 * arg7 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg9 * arg7;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        float var24 = class509.method2925(6, var21);
        int var25 = var20 & var17;
        if (arg3 != 42) {
            this.field9359 = null;
        }
        int var26 = this.field9359[var23];
        int var27 = this.field9359[var25];
        for (int var28 = 0; var28 < arg0; var28++) {
            float var29 = (float) var28 * arg8;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            int var35 = var30 & var15;
            float var36 = class509.method2925(6, var32);
            int var37 = this.field9359[var26 + var35];
            int var38 = this.field9359[var34 + var26];
            int var39 = this.field9359[var27 + var35];
            int var40 = this.field9359[var27 + var34];
            for (int var41 = 0; var41 < arg6; var41++) {
                float var42 = (float) var41 * arg1;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                int var47 = var44 & var13;
                float var48 = class509.method2925(arg3 - 36, var45);
                int var49 = var43 & var13;
                arg10[arg4++] = class231.method1344((byte) -28, class231.method1344((byte) -28, class231.method1344((byte) -28, class535.method3043(var46, class203.method1246(this.field9359[var49 + var37], 7), var22, var33, (byte) -120), class535.method3043(var45, class203.method1246(7, this.field9359[var37 + var47]), var22, var33, (byte) -120), var48), class231.method1344((byte) -28, class535.method3043(var46, class203.method1246(this.field9359[var38 + var49], 7), var22, var32, (byte) -120), class535.method3043(var45, class203.method1246(this.field9359[var38 + var47], 7), var22, var32, (byte) -120), var48), var36), class231.method1344((byte) -28, class231.method1344((byte) -28, class535.method3043(var46, class203.method1246(this.field9359[var49 + var39], 7), var21, var33, (byte) -120), class535.method3043(var45, class203.method1246(7, this.field9359[var47 + var39]), var21, var33, (byte) -120), var48), class231.method1344((byte) -28, class535.method3043(var46, class203.method1246(this.field9359[var40 + var49], 7), var21, var32, (byte) -120), class535.method3043(var45, class203.method1246(7, this.field9359[var40 + var47]), var21, var32, (byte) -120), var48), var36), var24) * arg5;
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)V")
    public static void method3697(int arg0) {
        field9354 = null;
        if (arg0 != -46) {
            field9354 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZIILjava/lang/String;)I")
    public static final int method3698(boolean arg0, int arg1, int arg2, String arg3) {
        field9358++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        for (int var8 = arg1; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg2) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)V")
    public static final void method3699(byte arg0) {
        if (arg0 < 32) {
            method3698(true, -88, -56, null);
        }
        field9355++;
        class480.method2802(class50.field530, 16751);
        class213.field2569++;
        class334.field4314.method2537(18244, class30.field353);
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(B)Z")
    public static final boolean method3700(byte arg0) {
        field9356++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class351.field4598.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class351.field4598.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class351.field4598.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class168.field2012.get(var9);
                        Class var11 = (Class) class351.field4598.get(var9);
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
                                        } catch (Throwable var20) {
                                        }
                                        var7.invoke(var18, Boolean.FALSE);
                                        var7.invoke(var17, Boolean.FALSE);
                                    }
                                } catch (Throwable var21) {
                                }
                                var7.invoke(var15, Boolean.FALSE);
                            } catch (Throwable var22) {
                            }
                        }
                    } catch (Throwable var23) {
                    }
                }
            } catch (Throwable var24) {
            }
            var7.invoke(var6, Boolean.FALSE);
            int var19 = 48 / (arg0 / 57);
        } catch (Throwable var25) {
        }
        class351.field4598 = var1;
        return class351.field4598.isEmpty();
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(I)V")
    public class655(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field9359[var3] = this.field9359[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field9359[var5];
            this.field9359[var5] = this.field9359[var5 + 256] = this.field9359[var4];
            this.field9359[var4] = this.field9359[var4 + 256] = var6;
        }
    }
}
