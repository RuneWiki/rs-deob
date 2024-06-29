import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class559 extends class514 {

    @OriginalMember(owner = "client!de", name = "k", descriptor = "[I")
    public int[] field7945;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "[I")
    public int[] field7947;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "[I")
    public static int[] field7939 = new int[4];

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Lvl;")
    public static class15 field7942 = new class15(42, 7);

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field7946 = 0;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field7940;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field7941;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field7943;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field7948;

    // $FF: synthetic field
    @OriginalMember(owner = "client!de", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field7949;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Z")
    public static final boolean method3244(int arg0, String arg1, Class arg2) {
        field7948++;
        Class var3 = (Class) class37.field627.get(arg1);
        if (var3 != null) {
            return var3.getClassLoader() == arg2.getClassLoader();
        }
        if (arg0 != -1) {
            method3244(32, null, null);
        }
        File var4 = null;
        if (var4 == null) {
            var4 = (File) class488.field6591.get(arg1);
        }
        if (var4 != null) {
            try {
                var4 = new File(var4.getCanonicalPath());
                Class var5 = Class.forName("java.lang.Runtime");
                Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                Method var8 = var5.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                var7.invoke(var8, Boolean.TRUE);
                var8.invoke(Runtime.getRuntime(), arg2, var4.getPath());
                var7.invoke(var8, Boolean.FALSE);
                class37.field627.put(arg1, arg2);
                return true;
            } catch (NoSuchMethodException var9) {
                System.load(var4.getPath());
                class37.field627.put(arg1, field7949 == null ? (field7949 = method3249("w")) : field7949);
                return true;
            } catch (Throwable var10) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
    public static final void method3245(byte arg0) {
        field7943++;
        short var1 = 1024;
        short var2 = 3072;
        if (class507.field6967) {
            if (class482.field6510) {
                var1 = 2048;
            }
            var2 = 4096;
        }
        if (class43.field682 < (float) var1) {
            class43.field682 = var1;
        }
        if ((float) var2 < class43.field682) {
            class43.field682 = var2;
        }
        while (class53.field763 >= 16384.0F) {
            class53.field763 -= 16384.0F;
        }
        while (class53.field763 < 0.0F) {
            class53.field763 += 16384.0F;
        }
        int var3 = class97.field1557 >> 9;
        int var4 = class488.field6593 >> 9;
        if (arg0 < 119) {
            return;
        }
        int var5 = class309.method1973(15356, class97.field1557, class488.field6593, class282.field3917);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && (class483.field6515 - 4) > var3 && class65.field926 - 4 > var4) {
            for (int var7 = var3 - 4; var7 <= (var3 + 4); var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class282.field3917;
                    if (var9 < 3 && class61.method425(var8, 16340, var7)) {
                        var9++;
                    }
                    int var10 = 0;
                    if (class707.field9716.field7088 != null && class707.field9716.field7088[var9] != null) {
                        var10 = (class707.field9716.field7088[var9][var7][var8] & 0xFF) * 8 << 2;
                    }
                    if (class745.field10286 != null && class745.field10286[var9] != null) {
                        int var11 = var10 + var5 - class745.field10286[var9].method1897((byte) -34, var8, var7);
                        if (var6 < var11) {
                            var6 = var11;
                        }
                    }
                }
            }
        }
        int var12 = (var6 >> 2) * 1536;
        if (var12 > 786432) {
            var12 = 786432;
        }
        if (var12 < 262144) {
            var12 = 262144;
        }
        if (class224.field3284 < var12) {
            class224.field3284 += (var12 - class224.field3284) / 24;
        } else if (var12 < class224.field3284) {
            class224.field3284 += (var12 - class224.field3284) / 80;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)I")
    public static final int method3246(int arg0, int arg1) {
        if (arg0 <= 36) {
            return -115;
        } else {
            field7941++;
            return arg1 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BIIZZ)V")
    public static final void method3247(String arg0, String arg1, byte arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field7940++;
        class153.field2523.field9185 = 1;
        String var7 = arg0.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg3 != -1) {
            class485 var11 = class117.field2153.method1159((byte) -126, arg3);
            if (var11 == null || var11.method2776((byte) 51) != arg6) {
                return;
            }
            if (var11.method2776((byte) 114)) {
                var10 = var11.field6554;
            } else {
                var9 = var11.field6560;
            }
        }
        int var12 = 0;
        int var13 = 0;
        if (arg2 != 54) {
            return;
        }
        while (var13 < class143.field2427.field2961) {
            class730 var16 = class143.field2427.method1410((byte) 15, var13);
            if ((!arg5 || var16.field10022) && var16.field10011 == -1 && var16.field10081 == -1 && var16.field10077 == -1 && var16.field10044 == 0 && var16.field10079.toLowerCase().indexOf(var7) != -1) {
                label102: {
                    if (arg3 != -1) {
                        if (arg6) {
                            if (!arg1.equals(var16.method4048(arg3, true, var10))) {
                                break label102;
                            }
                        } else if (var16.method4061(var9, (byte) 121, arg3) != arg4) {
                            break label102;
                        }
                    }
                    if (var12 >= 250) {
                        class119.field2182 = null;
                        class792.field10853 = -1;
                        return;
                    }
                    if (var8.length <= var12) {
                        short[] var17 = new short[var8.length * 2];
                        for (int var18 = 0; var18 < var12; var18++) {
                            var17[var18] = var8[var18];
                        }
                        var8 = var17;
                    }
                    var8[var12++] = (short) var13;
                }
            }
            var13++;
        }
        class792.field10853 = var12;
        class119.field2182 = var8;
        class505.field6889 = 0;
        String[] var14 = new String[class792.field10853];
        for (int var15 = 0; var15 < class792.field10853; var15++) {
            var14[var15] = class143.field2427.method1410((byte) 60, var8[var15]).field10079;
        }
        class462.method2659(class119.field2182, true, var14);
        class153.field2523.method3748(0);
        class153.field2523.field9185 = 2;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V")
    public static void method3248(byte arg0) {
        field7942 = null;
        field7939 = null;
        if (arg0 >= -10) {
            method3245((byte) -17);
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(II[I[I)V")
    public class559(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field7945 = arg2;
        this.field7947 = arg3;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3249(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
