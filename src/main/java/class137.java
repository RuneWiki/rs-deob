import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class137 extends class8 {

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "[B")
    public byte[] field2168;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "J")
    public static long field2161 = 0L;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "Z")
    public static boolean field2164 = false;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2167 = "glow3:";

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "[I")
    public static int[] field2163;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "[I")
    public static int[] field2166;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)Loa;", line = 4)
    public static final class153 method1016(int arg0, int arg1, int arg2) {
        class204 var3 = class324.field5032[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3360; var4++) {
            class153 var5 = var3.field3343[var4];
            if ((var5.field2358 >> 29 & 0x3L) == 2L && var5.field2371 == arg1 && var5.field2366 == arg2) {
                class20.method106(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(III)V", line = 30)
    public static final void method1017(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class205.field3373; var3++) {
            for (int var4 = 0; var4 < class45.field633; var4++) {
                for (int var5 = 0; var5 < class158.field2618; var5++) {
                    class204 var6 = class324.field5032[var3][var4][var5];
                    if (var6 != null) {
                        class225 var7 = var6.field3364;
                        if (var7 != null && var7.field3599.method35()) {
                            class268.method1904(var7.field3599, var3, var4, var5, 1, 1);
                            if (var7.field3594 != null && var7.field3594.method35()) {
                                class268.method1904(var7.field3594, var3, var4, var5, 1, 1);
                                var7.field3599.method40(var7.field3594, 0, 0, 0, false);
                                var7.field3594 = var7.field3594.method34(arg0, arg1, arg2);
                            }
                            var7.field3599 = var7.field3599.method34(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3360; var8++) {
                            class153 var9 = var6.field3343[var8];
                            if (var9 != null && var9.field2373.method35()) {
                                class268.method1904(var9.field2373, var3, var4, var5, var9.field2355 + 1 - var9.field2371, var9.field2361 - var9.field2366 + 1);
                                var9.field2373 = var9.field2373.method34(arg0, arg1, arg2);
                            }
                        }
                        class113 var10 = var6.field3347;
                        if (var10 != null && var10.field1728.method35()) {
                            class227.method1607(var10.field1728, var3, var4, var5);
                            var10.field1728 = var10.field1728.method34(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)I", line = 109)
    public static final int method1018(int arg0, int arg1) {
        int var2 = 98 / ((-arg1 - 4) / 51);
        field2165++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V", line = 118)
    public static void method1019(int arg0) {
        if (arg0 != -20500) {
            field2167 = (String) null;
        }
        field2163 = null;
        field2166 = null;
        field2167 = null;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "([B)V", line = 144)
    public class137(byte[] arg0) {
        this.field2168 = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V", line = 154)
    public static final void method1020(int arg0) {
        field2169++;
        if (class303.field4756) {
            return;
        }
        class303.field4756 = true;
        int var1 = -13 / ((arg0 - 51) / 51);
        if (class57.field803) {
            class97.field1386 = (float) ((int) class97.field1386 - 17 & 0xFFFFFFF0);
        } else {
            class201.field3276 += (-class201.field3276 - 12.0F) / 2.0F;
        }
        class33.field444 = true;
    }
}
