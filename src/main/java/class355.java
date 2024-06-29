import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class355 {

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "Z")
    public static boolean field5228 = false;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)Llf;")
    public static final class160 method2190(int arg0, int arg1) {
        field5225++;
        class160[] var2 = class470.method2812(0);
        int var3 = 81 % ((arg1 - 64) / 41);
        for (int var4 = 0; var4 < var2.length; var4++) {
            class160 var5 = var2[var4];
            if (var5.field2585 == arg0) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2191(int arg0, String arg1) {
        field5226++;
        class27.field437 = arg1;
        if (class497.field7305.field7072 == null) {
            return;
        }
        if (arg0 > -6) {
            field5228 = true;
        }
        try {
            String var2 = class497.field7305.field7072.getParameter("cookieprefix");
            String var3 = class497.field7305.field7072.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class31.method216(16017, class423.method2578(-19698) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class227.method1508("document.cookie=\"" + var5 + "\"", (byte) 118, class497.field7305.field7072);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2192(int arg0, byte arg1, int arg2) {
        if (arg1 == 85) {
            field5227++;
            return (arg0 & 0x100) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)V")
    public static final void method2193(int arg0, int arg1, int arg2) {
        field5224++;
        class18 var3 = class140.method1047(13, arg2, false);
        var3.method122(true);
        var3.field283 = arg1;
        if (arg0 != 0) {
            method2193(-48, -44, -91);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIBIII)V")
    public static final void method2194(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field5230++;
        int var6 = arg4 - arg0;
        int var7 = arg3 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class256.method1654(arg4, arg1, arg5, arg0, arg2 + 38);
            }
        } else if (var6 == 0) {
            class503.method3026(28319, arg1, arg3, arg5, arg0);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            if (arg2 == -40) {
                boolean var8 = var6 > var7;
                if (var8) {
                    int var9 = arg1;
                    arg1 = arg0;
                    int var10 = arg3;
                    arg3 = arg4;
                    arg0 = var9;
                    arg4 = var10;
                }
                if (arg3 < arg1) {
                    int var11 = arg1;
                    arg1 = arg3;
                    int var12 = arg0;
                    arg0 = arg4;
                    arg3 = var11;
                    arg4 = var12;
                }
                int var13 = arg0;
                int var14 = arg3 - arg1;
                int var15 = arg4 - arg0;
                int var16 = -(var14 >> 1);
                if (var15 < 0) {
                    var15 = -var15;
                }
                int var17 = arg0 >= arg4 ? -1 : 1;
                if (var8) {
                    for (int var18 = arg1; var18 <= arg3; var18++) {
                        class316.field4797[var18][var13] = arg5;
                        var16 += var15;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                } else {
                    for (int var19 = arg1; var19 <= arg3; var19++) {
                        class316.field4797[var13][var19] = arg5;
                        var16 += var15;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        }
    }
}
