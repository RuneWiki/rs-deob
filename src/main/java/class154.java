import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class154 extends class438 {

    @OriginalMember(owner = "client!s", name = "C", descriptor = "[I")
    private int[] field2168 = new int[this.field6155];

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public static int field2161 = 0;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "Z")
    public static boolean field2169;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    private int field2160;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "I")
    private int field2166;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "I")
    public static int field2167;

    // $FF: synthetic field
    @OriginalMember(owner = "client!s", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field2171;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "[B")
    private byte[] field2158;

    // $FF: synthetic method
    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1038(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class442("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field2169 = true;
        field2170 = 0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIBIIIII)V", line = 5)
    public static final void method1032(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2165;
        if (arg2 != 106) {
            field2161 = 80;
        }
        if (arg1 >= 0 && ~arg3 <= -1 && ~(class211.field2954 + -1) < ~arg1 && arg3 < class290.field4061 - 1) {
            if (class328.field4549 == null) {
                return;
            }
            if (~arg6 != -1) {
                if (~arg6 == -2) {
                    class193 var8 = (class193) class326.method2094(arg0, arg1, arg3);
                    if (var8 != null) {
                        if (!(var8 instanceof class247)) {
                            int var9 = var8.method689((byte) -83);
                            if (arg4 == 4 || arg4 == 5) {
                                class438.method2757(arg6, arg5, arg3, arg7, var9, arg1, 4, arg0, false);
                                return;
                            }
                            if (~arg4 == -7) {
                                class438.method2757(arg6, arg5, arg3, arg7 + 4, var9, arg1, 4, arg0, false);
                                return;
                            }
                            if (arg4 == 7) {
                                class438.method2757(arg6, arg5, arg3, (arg7 - -2 & 3) + 4, var9, arg1, 4, arg0, false);
                                return;
                            }
                            if (arg4 == 8) {
                                class438.method2757(arg6, arg5, arg3, arg7 + 4, var9, arg1, 4, arg0, false);
                                class438.method2757(arg6, arg5, arg3, (arg7 + 2 & 3) - -4, var9, arg1, 4, arg0, false);
                                return;
                            }
                        } else {
                            ((class247) var8).field3477.method1836(0, arg5);
                        }
                        return;
                    }
                } else if (~arg6 == -3) {
                    class193 var10 = (class193) class139.method952(arg0, arg1, arg3, field2171 != null ? field2171 : (field2171 = method1038("sc")));
                    if (var10 != null) {
                        if (arg4 == 11) {
                            arg4 = 10;
                        }
                        if (!(var10 instanceof class132)) {
                            class438.method2757(arg6, arg5, arg3, arg7, var10.method689((byte) -83), arg1, arg4, arg0, false);
                            return;
                        }
                        ((class132) var10).field1874.method1836(0, arg5);
                        return;
                    }
                } else {
                    if (~arg6 != -4) {
                        return;
                    }
                    class193 var11 = (class193) class19.method259(arg0, arg1, arg3);
                    if (var11 == null) {
                        return;
                    }
                    if (!(var11 instanceof class371)) {
                        class438.method2757(arg6, arg5, arg3, arg7, var11.method689((byte) -83), arg1, arg4, arg0, false);
                        return;
                    }
                    ((class371) var11).field5221.method1836(0, arg5);
                }
                return;
            }
            class193 var12 = (class193) class244.method1655(arg0, arg1, arg3);
            class193 var13 = (class193) class438.method2754(arg0, arg1, arg3);
            if (var12 != null && ~arg4 != -3) {
                if (var12 instanceof class440) {
                    ((class440) var12).field6199.method1836(0, arg5);
                } else {
                    class438.method2757(arg6, arg5, arg3, arg7, var12.method689((byte) -83), arg1, arg4, arg0, false);
                }
            }
            if (var13 != null) {
                if (var13 instanceof class440) {
                    ((class440) var13).field6199.method1836(0, arg5);
                    return;
                }
                class438.method2757(arg6, arg5, arg3, arg7, var13.method689((byte) -83), arg1, arg4, arg0, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IIIIIF)V", line = 123)
    public class154(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field6155; ++var7) {
            this.field2168[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V", line = 140)
    public final void method1033(int arg0) {
        this.field2160 = Math.abs(this.field2160);
        if (arg0 == 4) {
            ++field2167;
            if (~this.field2160 <= -4097) {
                this.field2160 = 4095;
            }
            this.method1034(this.field2166++, (byte) (this.field2160 >> 4));
            this.field2160 = 0;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)V", line = 157)
    public void method1034(int arg0, byte arg1) {
        this.field2158[this.field2166++] = (byte) (class387.method2454(127, arg1 >> 1) + 127);
        ++field2164;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 166)
    public final void method1035(int arg0) {
        if (arg0 != -416361076) {
            this.method1036(97, 75, -127);
        }
        ++field2163;
        this.field2166 = 0;
        this.field2160 = 0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V", line = 182)
    public final void method1036(int arg0, int arg1, int arg2) {
        ++field2159;
        if (arg0 >= -110) {
            this.method1036(69, 7, -99);
        }
        this.field2160 += this.field2168[arg2] * arg1 >> 12;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z[B)Z", line = 206)
    public static final boolean method1037(boolean arg0, byte[] arg1) {
        ++field2162;
        class11 var2 = new class11(arg1);
        int var3 = var2.method172((byte) 52);
        if (var3 != 1) {
            return false;
        } else {
            boolean var4 = var2.method172((byte) 52) == 1;
            if (var4) {
                class349.method2220(var2, -107);
            }
            class133.method927(-43, var2);
            if (arg0) {
                method1037(true, (byte[]) null);
            }
            return true;
        }
    }
}
