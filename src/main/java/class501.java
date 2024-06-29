import jaggl.OpenGL;
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class501 extends class12 {

    @OriginalMember(owner = "client!is", name = "I", descriptor = "[I")
    public static int[] field7045 = new int[5];

    @OriginalMember(owner = "client!is", name = "B", descriptor = "Ldh;")
    public static class320 field7038 = new class320(108, 3);

    @OriginalMember(owner = "client!is", name = "C", descriptor = "F")
    private float field7039;

    @OriginalMember(owner = "client!is", name = "G", descriptor = "F")
    private float field7043;

    @OriginalMember(owner = "client!is", name = "v", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!is", name = "w", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!is", name = "y", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!is", name = "z", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!is", name = "A", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!is", name = "E", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!is", name = "F", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!is", name = "H", descriptor = "I")
    private int field7044;

    @OriginalMember(owner = "client!is", name = "K", descriptor = "I")
    private int field7047;

    @OriginalMember(owner = "client!is", name = "L", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!is", name = "M", descriptor = "I")
    public static int field7049;

    // $FF: synthetic field
    @OriginalMember(owner = "client!is", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field7050;

    @OriginalMember(owner = "client!is", name = "x", descriptor = "Ljava/lang/String;")
    private String field7034;

    @OriginalMember(owner = "client!is", name = "D", descriptor = "Ljava/lang/String;")
    private String field7040;

    @OriginalMember(owner = "client!is", name = "J", descriptor = "Ljava/lang/String;")
    private String field7046;

    // $FF: synthetic method
    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2978(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V", line = 3)
    public final void method55(OggPacket arg0, int arg1) {
        ++field7042;
        if (~super.field95 >= -1 || "SUB".equals(this.field7034)) {
            class244 var3 = new class244(arg0.getData());
            int var4 = -26 / ((arg1 - 25) / 46);
            int var5 = var3.method1423(-110);
            if (super.field95 <= 8) {
                if (~(128 | var5) == -1) {
                    throw new IllegalStateException();
                }
                if (~super.field95 == -1) {
                    var3.field2903 += 23;
                    this.field7047 = var3.method1424(16212);
                    this.field7044 = var3.method1424(16212);
                    if (this.field7047 != 0 && ~this.field7044 != -1) {
                        class244 var6 = new class244(16);
                        var3.method1461(824, 0, var6.field2912, 16);
                        this.field7046 = var6.method1468(-1468860088);
                        var6.field2903 = 0;
                        var3.method1461(824, 0, var6.field2912, 16);
                        this.field7034 = var6.method1468(-1468860088);
                        return;
                    }
                    throw new IllegalStateException();
                }
            } else {
                if (~var5 == -1) {
                    long var7 = var3.method1422(719252384);
                    long var9 = var3.method1422(719252384);
                    long var11 = var3.method1422(719252384);
                    if (var7 < 0L || var9 < 0L || ~var11 > -1L || ~var7 > ~var11) {
                        throw new IllegalStateException();
                    }
                    this.field7039 = (float) ((long) this.field7044 * var7) / (float) this.field7047;
                    this.field7043 = (float) ((var7 - -var9) * (long) this.field7044) / (float) this.field7047;
                    int var13 = var3.method1424(16212);
                    if (~var13 > -1 || var13 > var3.field2912.length + -var3.field2903) {
                        throw new IllegalStateException();
                    }
                    this.field7040 = class463.method2821(var3.field2912, var3.field2903, (byte) -39, var13);
                }
                if ((var5 | 128) != 0) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lnv;[Lw;I)Lrda;", line = 79)
    public static final class660 method2971(class417 arg0, class299[] arg1, int arg2) {
        ++field7035;
        if (arg2 != -15582) {
            field7038 = null;
        }
        for (int var3 = 0; arg1.length > var3; ++var3) {
            if (arg1[var3] == null || ~arg1[var3].field3724 >= -1L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; ~arg1.length < ~var6; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field3724);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class512.field7307, 0);
        if (class512.field7307[0] == 0) {
            if (class512.field7307[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class512.field7307, 1);
            if (class512.field7307[1] > 1) {
                byte[] var7 = new byte[class512.field7307[1]];
                OpenGL.glGetInfoLogARB(var4, class512.field7307[1], class512.field7307, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (~class512.field7307[0] == -1) {
                for (int var8 = 0; var8 < arg1.length; ++var8) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field3724);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class660(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!is", name = "g", descriptor = "(I)Ljava/lang/String;", line = 148)
    public final String method2972(int arg0) {
        ++field7033;
        int var2 = 120 / ((arg0 - -29) / 38);
        return this.field7046;
    }

    @OriginalMember(owner = "client!is", name = "h", descriptor = "(I)V", line = 158)
    public static void method2973(int arg0) {
        field7045 = null;
        int var1 = -17 % ((25 - arg0) / 39);
        field7038 = null;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)F", line = 169)
    public final float method2974(boolean arg0) {
        if (arg0) {
            method2973(-85);
        }
        ++field7049;
        return this.field7043;
    }

    @OriginalMember(owner = "client!is", name = "f", descriptor = "(I)V", line = 180)
    public final void method56(int arg0) {
        ++field7037;
        if (arg0 != 3376) {
            this.method2972(95);
        }
    }

    @OriginalMember(owner = "client!is", name = "i", descriptor = "(I)F", line = 197)
    public final float method2975(int arg0) {
        if (arg0 != -7132) {
            method2973(89);
        }
        ++field7048;
        return this.field7039;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(Z)Ljava/lang/String;", line = 208)
    public final String method2976(boolean arg0) {
        ++field7041;
        if (!arg0) {
            this.method2974(true);
        }
        return this.field7040;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIIII)V", line = 219)
    public static final void method2977(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 != 0) {
            method2977(47, -58, -44, -24, -17, -81, 109, 8);
        }
        ++field7032;
        if (~arg1 <= -1 && ~arg7 <= -1 && ~(class489.field6976 + -1) < ~arg1 && ~arg7 > ~(class153.field1677 - 1)) {
            if (class638.field9170 == null) {
                return;
            }
            if (~arg4 == -1) {
                class281 var8 = (class281) class628.method3602(arg2, arg1, arg7);
                class281 var9 = (class281) class446.method2763(arg2, arg1, arg7);
                if (var8 != null && ~arg3 != -3) {
                    if (var8 instanceof class240) {
                        ((class240) var8).field2867.method2865(arg0, 0);
                    } else {
                        class210.method1250(arg1, arg7, arg2, arg3, arg6, arg0, arg4, (byte) -24, var8.method1241((byte) 99));
                    }
                }
                if (var9 != null) {
                    if (var9 instanceof class240) {
                        ((class240) var9).field2867.method2865(arg0, 0);
                        return;
                    }
                    class210.method1250(arg1, arg7, arg2, arg3, arg6, arg0, arg4, (byte) -24, var9.method1241((byte) 99));
                    return;
                }
                return;
            }
            if (~arg4 != -2) {
                if (~arg4 != -3) {
                    if (~arg4 == -4) {
                        class281 var10 = (class281) class199.method1201(arg2, arg1, arg7);
                        if (var10 != null) {
                            if (!(var10 instanceof class208)) {
                                class210.method1250(arg1, arg7, arg2, arg3, arg6, arg0, arg4, (byte) -24, var10.method1241((byte) 99));
                                return;
                            }
                            ((class208) var10).field2441.method2865(arg0, 0);
                            return;
                        }
                    }
                } else {
                    class281 var11 = (class281) class229.method1330(arg2, arg1, arg7, field7050 != null ? field7050 : (field7050 = method2978("wha")));
                    if (var11 == null) {
                        return;
                    }
                    if (~arg3 == -12) {
                        arg3 = 10;
                    }
                    if (!(var11 instanceof class505)) {
                        class210.method1250(arg1, arg7, arg2, arg3, arg6, arg0, arg4, (byte) -24, var11.method1241((byte) 99));
                        return;
                    }
                    ((class505) var11).field7213.method2865(arg0, 0);
                }
                return;
            }
            class281 var12 = (class281) class603.method3426(arg2, arg1, arg7);
            if (var12 != null) {
                if (var12 instanceof class599) {
                    ((class599) var12).field8538.method2865(arg0, 0);
                    return;
                }
                int var13 = var12.method1241((byte) 99);
                if (arg3 != 4 && arg3 != 5) {
                    if (~arg3 != -7) {
                        if (~arg3 == -8) {
                            class210.method1250(arg1, arg7, arg2, 4, (arg6 + 2 & 3) - -4, arg0, arg4, (byte) -24, var13);
                            return;
                        }
                        if (arg3 == 8) {
                            class210.method1250(arg1, arg7, arg2, 4, arg6 + 4, arg0, arg4, (byte) -24, var13);
                            class210.method1250(arg1, arg7, arg2, 4, (3 & arg6 + 2) + 4, arg0, arg4, (byte) -24, var13);
                            return;
                        }
                    } else {
                        class210.method1250(arg1, arg7, arg2, 4, arg6 + 4, arg0, arg4, (byte) -24, var13);
                    }
                    return;
                }
                class210.method1250(arg1, arg7, arg2, 4, arg6, arg0, arg4, (byte) -24, var13);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 354)
    public class501(OggStreamState arg0) {
        super(arg0);
    }
}
