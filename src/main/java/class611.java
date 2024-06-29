import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class611 {

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    private int field8802;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    private int field8790;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    private int field8787;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    private int field8794;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    private int field8793;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    private int field8784;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    private int field8788;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    private int field8797;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    private int field8801;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    private int field8792;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "[B")
    public static byte[] field8783 = new byte[2048];

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field8786 = 104;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field8789 = 0;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "Ldv;")
    public static class566 field8785 = new class566(53, 3);

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field8796;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field8800;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nk", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field8803;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)Z")
    public final boolean method3573(int arg0, int arg1, int arg2, int arg3) {
        field8791++;
        if (this.field8793 > arg1 || this.field8801 < arg1) {
            return false;
        } else if (arg3 != 2090313793) {
            return false;
        } else if (arg0 < this.field8792 || this.field8797 < arg0) {
            return false;
        } else if (arg2 >= this.field8788 && this.field8784 >= arg2) {
            int var5 = arg1 - this.field8790;
            int var6 = arg2 - this.field8794;
            return (var5 * var5 + var6 * var6) < this.field8802;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIZIII)V")
    public static final void method3574(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field8795++;
        class141 var7 = (class141) class297.field4071.method3150(16);
        if (!arg3) {
            method3575(-33);
        }
        while (var7 != null) {
            if (class405.field5763 >= var7.field2184) {
                var7.method939(59);
            } else {
                class100.method715(arg5, arg0 >> 1, arg2 >> 1, var7.field2186 * 2, (var7.field2189 << 7) + 64, arg6, (var7.field2190 << 7) + 64, arg3, var7.field2185);
                class515.field7246.method666(class328.field4394[1] + arg1, var7.field2183 | 0xFF000000, class328.field4394[0] + arg4, -118, var7.field2192, 0);
            }
            var7 = (class141) class297.field4071.method3147(16);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static void method3575(int arg0) {
        field8785 = null;
        if (arg0 != 64) {
            method3575(-91);
        }
        field8783 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILhv;)Ljava/lang/String;")
    public static final String method3576(int arg0, class442 arg1) {
        field8796++;
        if (arg0 == 23974) {
            return arg1.field6295 == null || arg1.field6295.length() <= 0 ? arg1.field6289 : arg1.field6289 + class405.field5762.method739(class173.field2491, -58) + arg1.field6295;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BIIIIIIIIII)V")
    public final void method3577(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field8802 = arg3 * arg3;
        this.field8794 = arg7;
        this.field8787 = arg9;
        field8799++;
        if (arg0 <= 73) {
            this.field8801 = 39;
        }
        this.field8790 = arg2;
        this.field8788 = this.field8794 + arg6;
        this.field8801 = this.field8790 + arg1;
        this.field8784 = this.field8794 + arg4;
        this.field8797 = this.field8787 + arg10;
        this.field8793 = this.field8790 + arg5;
        this.field8792 = this.field8787 + arg8;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZLjava/awt/Component;I)Ljc;")
    public static final class372 method3578(boolean arg0, Component arg1, int arg2) {
        field8800++;
        try {
            Constructor var3 = Class.forName("ad").getDeclaredConstructor(field8803 == null ? (field8803 = method3580("java.awt.Component")) : field8803, Boolean.TYPE);
            if (arg2 < 6) {
                method3578(false, null, 61);
            }
            return (class372) var3.newInstance(arg1, Boolean.valueOf(arg0));
        } catch (Throwable var4) {
            return new class506(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lbea;[II[I[I)V")
    public static final void method3579(class188 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        for (int var5 = arg2; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg4[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg0.field520.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field520[var9] = null;
                    } else {
                        class78 var10 = class331.field4418.method195(var6, (byte) 13);
                        int var11 = var10.field1282;
                        class244 var12 = arg0.field520[var9];
                        if (var12 != null) {
                            if (var12.field3406 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field520[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3404 = 1;
                                    var12.field3401 = 0;
                                    var12.field3400 = 0;
                                    var12.field3409 = 0;
                                    var12.field3408 = var8;
                                    class170.method1085(arg0.field6029, arg0.field6035, class645.field9372 == arg0, (byte) 59, 0, var10, arg0.field6037);
                                } else if (var11 == 2) {
                                    var12.field3401 = 0;
                                }
                            } else if (var10.field1276 >= class331.field4418.method195(var12.field3406, (byte) 13).field1276) {
                                var12 = arg0.field520[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class244 var13 = arg0.field520[var9] = new class244();
                            var13.field3406 = var6;
                            var13.field3404 = 1;
                            var13.field3400 = 0;
                            var13.field3409 = 0;
                            var13.field3408 = var8;
                            var13.field3401 = 0;
                            class170.method1085(arg0.field6029, arg0.field6035, class645.field9372 == arg0, (byte) -123, 0, var10, arg0.field6037);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field8798++;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field8802 = arg3 * arg3;
        this.field8790 = arg0;
        this.field8787 = arg1;
        this.field8794 = arg2;
        this.field8793 = this.field8790 + arg4;
        this.field8784 = this.field8794 + arg9;
        this.field8788 = this.field8794 + arg8;
        this.field8797 = this.field8787 + arg7;
        this.field8801 = this.field8790 + arg5;
        this.field8792 = this.field8787 + arg6;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3580(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
