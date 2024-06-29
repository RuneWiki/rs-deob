import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public abstract class class64 {

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field979 = 0;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field989 = 0;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "F")
    public static float field981;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "Lbi;")
    public static class145 field988;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Lrn;")
    public static class18 field978;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "Lrn;")
    public static class18 field986;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "Lrn;")
    public static class18 field990;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field974;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Z")
    public static boolean field985;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)Lqf;", line = 7)
    public class64 method400(int arg0, int arg1, int arg2) {
        field987++;
        return this;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 18)
    public static final void method631(int arg0) {
        if (arg0 != -16) {
            field989 = -3;
        }
        field980++;
        if (class261.field4005) {
            return;
        }
        class78.field1138 = true;
        if (class278.field4292) {
            class279.field4312 = (float) ((int) class279.field4312 - 17 & 0xFFFFFFF0);
        } else {
            class121.field1935 += (-12.0F - class121.field1935) / 2.0F;
        }
        class261.field4005 = true;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)Z", line = 43)
    public static final boolean method632(int arg0, int arg1, int arg2, int arg3) {
        if (!class62.method625(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class277.field4290[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class205.field3165) {
                    if (!class112.method965(var4, var6, var5)) {
                        return false;
                    }
                    if (!class112.method965(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class112.method965(var4, var7, var5)) {
                        return false;
                    }
                    if (!class112.method965(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class112.method965(var4, var8, var5)) {
                    return false;
                }
                if (!class112.method965(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class190.field2977) {
                    if (!class112.method965(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class112.method965(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class112.method965(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class112.method965(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class112.method965(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class112.method965(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class205.field3165) {
                    if (!class112.method965(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class112.method965(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class112.method965(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class112.method965(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class112.method965(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class112.method965(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class190.field2977) {
                    if (!class112.method965(var4, var6, var5)) {
                        return false;
                    }
                    if (!class112.method965(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class112.method965(var4, var7, var5)) {
                        return false;
                    }
                    if (!class112.method965(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class112.method965(var4, var8, var5)) {
                    return false;
                }
                if (!class112.method965(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class112.method965(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class112.method965(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class112.method965(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class112.method965(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class112.method965(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()Z", line = 228)
    public boolean method390() {
        field984++;
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;", line = 237)
    public static final String method633(String arg0, String arg1, String arg2, byte arg3) {
        if (arg3 > -124) {
            method633((String) null, (String) null, (String) null, (byte) -109);
        }
        for (int var4 = arg1.indexOf(arg2); var4 != -1; var4 = arg1.indexOf(arg2, arg0.length() + var4)) {
            arg1 = arg1.substring(0, var4) + arg0 + arg1.substring(var4 + arg2.length());
        }
        field982++;
        return arg1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BII)I", line = 262)
    public static final int method634(byte arg0, int arg1, int arg2) {
        field983++;
        if (arg0 <= 51) {
            field981 = 0.58998936F;
        }
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg2 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIZ)V", line = 289)
    public static final void method635(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 > arg1) {
            class283.method2059(arg2, class133.field2235[arg3], (byte) 100, arg0, arg1);
        } else {
            class283.method2059(arg2, class133.field2235[arg3], (byte) 97, arg1, arg0);
        }
        field976++;
        if (!arg4) {
            field990 = (class18) null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V", line = 313)
    public static void method636(boolean arg0) {
        field986 = null;
        field978 = null;
        field990 = null;
        field974 = null;
        field988 = null;
        if (arg0) {
            field975 = 94;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lqf;IIIZ)V", line = 341)
    public void method394(class64 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field977++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()I")
    public abstract int method21();

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V")
    public abstract void method32(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIIJILem;)V")
    public abstract void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class273 arg10);
}
