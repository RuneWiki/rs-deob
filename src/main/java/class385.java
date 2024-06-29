import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class385 extends class148 {

    @OriginalMember(owner = "client!lq", name = "N", descriptor = "I")
    private int field5837;

    @OriginalMember(owner = "client!lq", name = "M", descriptor = "Lri;")
    public static class73 field5836 = new class73(96, 20);

    @OriginalMember(owner = "client!lq", name = "P", descriptor = "Llt;")
    public static class475 field5839 = new class475("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!lq", name = "J", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!lq", name = "K", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!lq", name = "L", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!lq", name = "O", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!lq", name = "Q", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!lq", name = "R", descriptor = "I")
    public static int field5841;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lq", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field5842;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2357(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)V", line = 4)
    public static final void method2353(int arg0) {
        if (arg0 == 13400) {
            try {
                Method var1 = (field5842 != null ? field5842 : (field5842 = method2357("java.lang.Runtime"))).getMethod("availableProcessors");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                        class473.field6960 = var3;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
            ++field5835;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIB)Z", line = 32)
    public static final boolean method2354(int arg0, int arg1, byte arg2) {
        if (arg2 != -123) {
            method2353(-64);
        }
        ++field5834;
        return ~(16 & arg1) != -1;
    }

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)V", line = 43)
    public static void method2355(int arg0) {
        if (arg0 > 12) {
            field5839 = null;
            field5836 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V", line = 54)
    public class385() {
        this(4096);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILdh;I)V", line = 60)
    public final void method23(int arg0, class209 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field5837 = (arg1.method1428(32122) << 12) / 255;
        }
        ++field5840;
        int var5 = -33 % ((-88 - arg2) / 33);
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(I)V", line = 90)
    public class385(int arg0) {
        super(0, true);
        this.field5837 = 4096;
        this.field5837 = arg0;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)[I", line = 100)
    public final int[] method25(int arg0, int arg1) {
        ++field5838;
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            class520.method3074(var3, 0, class320.field4579, this.field5837);
        }
        if (arg0 >= -65) {
            this.method23(-47, (class209) null, -59);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(IIIIII)V", line = 124)
    public static final void method2356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5833;
        int var6 = arg0 - arg2;
        int var7 = -arg1 + arg5;
        if (var6 != 0) {
            if (~var7 == -1) {
                class284.method1841(0, arg2, arg0, arg1, arg3);
            } else {
                int var8 = (var7 << 12) / var6;
                int var9 = -(arg2 * var8 >> 12) + arg1;
                if (arg4 > -46) {
                    field5841 = 30;
                }
                int var10;
                int var11;
                if (~class494.field7297 >= ~arg2) {
                    if (arg2 > class445.field6629) {
                        var10 = class445.field6629;
                        var11 = var9 - -(class445.field6629 * var8 >> 12);
                    } else {
                        var11 = arg1;
                        var10 = arg2;
                    }
                } else {
                    var10 = class494.field7297;
                    var11 = (class494.field7297 * var8 >> 12) + var9;
                }
                int var12;
                int var13;
                if (arg0 < class494.field7297) {
                    var12 = (class494.field7297 * var8 >> 12) + var9;
                    var13 = class494.field7297;
                } else if (class445.field6629 < arg0) {
                    var12 = var9 - -(class445.field6629 * var8 >> 12);
                    var13 = class445.field6629;
                } else {
                    var12 = arg5;
                    var13 = arg0;
                }
                if (~var11 <= ~class37.field393) {
                    if (~var11 < ~class509.field7436) {
                        var11 = class509.field7436;
                        var10 = (class509.field7436 - var9 << 12) / var8;
                    }
                } else {
                    var10 = (class37.field393 - var9 << 12) / var8;
                    var11 = class37.field393;
                }
                if (~class37.field393 >= ~var12) {
                    if (class509.field7436 < var12) {
                        var13 = (-var9 + class509.field7436 << 12) / var8;
                        var12 = class509.field7436;
                    }
                } else {
                    var12 = class37.field393;
                    var13 = (-var9 + class37.field393 << 12) / var8;
                }
                class459.method2746(var11, var13, arg3, var10, var12, 6);
            }
        } else {
            if (~var7 != -1) {
                class131.method884(arg2, arg5, 0, arg3, arg1);
            }
        }
    }
}
