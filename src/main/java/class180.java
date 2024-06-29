import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class180 extends class151 {

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Lbd;")
    public static class162 field3084 = class17.method142(0, "rot:");

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    public static int field3091 = 0;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "[S")
    public static short[] field3085 = new short[256];

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "Lbd;")
    public static class162 field3087 = class17.method142(0, "<col=00ff00>");

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "Z")
    public static volatile boolean field3089 = false;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public static int field3086 = 0;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "Lbd;")
    public static class162 field3093 = class17.method142(0, "Benutzen");

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "[I")
    public static int[] field3105 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public int field3082;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public int field3083;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    public int field3100;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "Lbd;")
    public class162 field3096;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "Ldh;")
    public static class177 field3101;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "Lob;")
    public class78 field3092;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "Lob;")
    public class78 field3099;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "Z")
    public boolean field3098;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "[Ljava/lang/Object;")
    public Object[] field3102;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)Lbd;", line = 8)
    public static final class162 method1370(byte arg0, int arg1) {
        if (arg0 <= 101) {
            field3089 = true;
        }
        field3097++;
        return class31.field516[arg1].method1249((byte) -118) > 0 ? class135.method1062(new class162[] { class1.field9[arg1], class89.field1591, class31.field516[arg1] }, true) : class1.field9[arg1];
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)I", line = 26)
    public static final int method1371(int arg0) {
        field3103++;
        if (arg0 != 128) {
            method1370((byte) 99, 10);
        }
        return class18.field299 == 0 ? 0 : class269.field4499[class18.field299].method30();
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)Z", line = 47)
    public static final boolean method1372(int arg0, int arg1, int arg2, int arg3) {
        if (!class263.method1808(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class206.field3473[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class201.field3418) {
                    if (!class9.method54(var4, var6, var5)) {
                        return false;
                    }
                    if (!class9.method54(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class9.method54(var4, var7, var5)) {
                        return false;
                    }
                    if (!class9.method54(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class9.method54(var4, var8, var5)) {
                    return false;
                }
                if (!class9.method54(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class156.field2748) {
                    if (!class9.method54(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class9.method54(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class9.method54(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class9.method54(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class9.method54(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class9.method54(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class201.field3418) {
                    if (!class9.method54(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class9.method54(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class9.method54(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class9.method54(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class9.method54(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class9.method54(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class156.field2748) {
                    if (!class9.method54(var4, var6, var5)) {
                        return false;
                    }
                    if (!class9.method54(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class9.method54(var4, var7, var5)) {
                        return false;
                    }
                    if (!class9.method54(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class9.method54(var4, var8, var5)) {
                    return false;
                }
                if (!class9.method54(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class9.method54(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class9.method54(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class9.method54(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class9.method54(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class9.method54(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 250)
    public static void method1373(int arg0) {
        if (arg0 != 238) {
            return;
        }
        field3093 = null;
        field3105 = null;
        field3084 = null;
        field3085 = null;
        field3101 = null;
        field3087 = null;
    }
}
