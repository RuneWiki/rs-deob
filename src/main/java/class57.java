import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public abstract class class57 {

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field573;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nr", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field574;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BJ)I")
    public abstract int method309(byte arg0, long arg1);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V")
    public abstract void method310(byte arg0);

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)J")
    public abstract long method311(byte arg0);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)J")
    public abstract long method312(int arg0);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II[BIII)V")
    public static final void method313(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field571++;
        if (arg5 > -93 || arg4 <= arg3) {
            return;
        }
        int var6 = arg1 + arg3;
        int var7 = arg4 - arg3 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg4 - arg3 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg2[var6++] = 1;
                }
            }
            arg2[var6++] = 1;
            arg2[var6++] = 1;
            arg2[var6++] = 1;
            arg2[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIZIILha;I)V")
    public static final void method314(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, class58 arg7, int arg8) {
        field573++;
        class281 var9 = (class281) class628.method3602(arg6, arg2, arg5);
        if (!arg4) {
            return;
        }
        if (var9 != null) {
            class316 var10 = class445.field6442.method3972((byte) 120, var9.method1241((byte) 99));
            int var11 = var9.method1243((byte) 117) & 0x3;
            int var12 = var9.method1236((byte) -78);
            if (var10.field3990 == -1) {
                int var13 = arg8;
                if (var10.field4001 > 0) {
                    var13 = arg3;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg7.method412(arg1, arg0, var13, 19154, 4);
                    } else if (var11 == 1) {
                        arg7.method374(119, 4, arg1, arg0, var13);
                    } else if (var11 == 2) {
                        arg7.method412(arg1 + 3, arg0, var13, 19154, 4);
                    } else if (var11 == 3) {
                        arg7.method374(121, 4, arg1, arg0 + 3, var13);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg7.method410(var13, arg1, 1, -113, arg0, 1);
                    } else if (var11 == 1) {
                        arg7.method410(var13, arg1 + 3, 1, 89, arg0, 1);
                    } else if (var11 == 2) {
                        arg7.method410(var13, arg1 + 3, 1, 76, arg0 + 3, 1);
                    } else if (var11 == 3) {
                        arg7.method410(var13, arg1, 1, 116, arg0 + 3, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg7.method374(125, 4, arg1, arg0, var13);
                    } else if (var11 == 1) {
                        arg7.method412(arg1 + 3, arg0, var13, 19154, 4);
                    } else if (var11 == 2) {
                        arg7.method374(125, 4, arg1, arg0 + 3, var13);
                    } else if (var11 == 3) {
                        arg7.method412(arg1, arg0, var13, 19154, 4);
                    }
                }
            } else {
                class458.method2802(arg0, var11, arg1, arg7, 121, var10);
            }
        }
        class281 var14 = (class281) class229.method1330(arg6, arg2, arg5, field574 == null ? (field574 = method316("wha")) : field574);
        if (var14 != null) {
            class316 var15 = class445.field6442.method3972((byte) 127, var14.method1241((byte) 99));
            int var16 = var14.method1243((byte) 117) & 0x3;
            int var17 = var14.method1236((byte) -78);
            if (var15.field3990 != -1) {
                class458.method2802(arg0, var16, arg1, arg7, -123, var15);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field4001 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg7.method397(arg1, (byte) -126, arg0, arg0 + 3, var18, arg1 + 3);
                } else {
                    arg7.method397(arg1, (byte) -124, arg0 + 3, arg0, var18, arg1 + 3);
                }
            }
        }
        class281 var19 = (class281) class199.method1201(arg6, arg2, arg5);
        if (var19 == null) {
            return;
        }
        class316 var20 = class445.field6442.method3972((byte) 111, var19.method1241((byte) 99));
        int var21 = var19.method1243((byte) 117) & 0x3;
        if (var20.field3990 != -1) {
            class458.method2802(arg0, var21, arg1, arg7, -121, var20);
            return;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IJ)I")
    public final int method315(int arg0, long arg1) {
        field570++;
        long var4 = this.method311((byte) 125);
        if (var4 > 0L) {
            class524.method3076(arg0, var4);
        }
        return arg0 == 1 ? this.method309((byte) 107, arg1) : 84;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method316(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
