import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class266 extends class28 {

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
    public int field3648;

    @OriginalMember(owner = "client!sca", name = "j", descriptor = "I")
    public int field3647;

    @OriginalMember(owner = "client!sca", name = "n", descriptor = "J")
    public static long field3651 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!sca", name = "l", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!sca", name = "o", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!sca", name = "p", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!sca", name = "q", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!sca", name = "r", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!sca", name = "s", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!sca", name = "t", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!sca", name = "u", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!sca", name = "m", descriptor = "Lem;")
    public static class639 field3650;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sca", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field3659;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IB)Lbea;")
    public static final class77 method1640(int arg0, byte arg1) {
        field3657++;
        if (arg1 < 60) {
            return null;
        }
        class77 var2 = (class77) class28.field274.method3134((long) arg0, -78);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class249.field3348.method1087(0, arg0, 1);
        class77 var4 = new class77();
        if (var3 != null) {
            var4.method439(new class138(var3), 16470, arg0);
        }
        class28.field274.method3130((long) arg0, true, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(II)V")
    public class266(int arg0, int arg1) {
        this.field3648 = arg0;
        this.field3647 = arg1;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIBIILoa;II)V")
    public static final void method1641(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class689 arg6, int arg7, int arg8) {
        field3653++;
        class289 var9 = (class289) class147.method997(arg0, arg7, arg4);
        if (var9 != null) {
            class252 var10 = class578.field7980.method1746(var9.method130(-5582), (byte) 124);
            int var11 = var9.method126(20377) & 0x3;
            int var12 = var9.method128((byte) 93);
            if (var10.field3398 == -1) {
                int var13 = arg2;
                if (var10.field3453 > 0) {
                    var13 = arg8;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg6.method3815(arg1, -56, arg5, var13, 4);
                    } else if (var11 == 1) {
                        arg6.method3814(1, 4, arg5, var13, arg1);
                    } else if (var11 == 2) {
                        arg6.method3815(arg1 + 3, -126, arg5, var13, 4);
                    } else if (var11 == 3) {
                        arg6.method3814(1, 4, arg5 + 3, var13, arg1);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg6.method3811(arg5, 1, 1, arg1, var13, 119);
                    } else if (var11 == 1) {
                        arg6.method3811(arg5, 1, 1, arg1 + 3, var13, 80);
                    } else if (var11 == 2) {
                        arg6.method3811(arg5 + 3, 1, 1, arg1 + 3, var13, 32);
                    } else if (var11 == 3) {
                        arg6.method3811(arg5 + 3, 1, 1, arg1, var13, 54);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg6.method3814(1, 4, arg5, var13, arg1);
                    } else if (var11 == 1) {
                        arg6.method3815(arg1 + 3, -112, arg5, var13, 4);
                    } else if (var11 == 2) {
                        arg6.method3814(1, 4, arg5 + 3, var13, arg1);
                    } else if (var11 == 3) {
                        arg6.method3815(arg1, -57, arg5, var13, 4);
                    }
                }
            } else {
                class377.method2293(arg1, var10, arg5, (byte) 61, var11, arg6);
            }
        }
        if (arg3 > -34) {
            field3650 = null;
        }
        class289 var14 = (class289) class609.method3354(arg0, arg7, arg4, field3659 == null ? (field3659 = method1649("dda")) : field3659);
        if (var14 != null) {
            class252 var15 = class578.field7980.method1746(var14.method130(-5582), (byte) 92);
            int var16 = var14.method126(20377) & 0x3;
            int var17 = var14.method128((byte) 56);
            if (var15.field3398 != -1) {
                class377.method2293(arg1, var15, arg5, (byte) 106, var16, arg6);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field3453 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg6.method3817(true, var18, arg1 + 3, arg5, arg5 + 3, arg1);
                } else {
                    arg6.method3817(true, var18, arg1 + 3, arg5 + 3, arg5, arg1);
                }
            }
        }
        class289 var19 = (class289) class618.method3391(arg0, arg7, arg4);
        if (var19 == null) {
            return;
        }
        class252 var20 = class578.field7980.method1746(var19.method130(-5582), (byte) 77);
        int var21 = var19.method126(20377) & 0x3;
        if (var20.field3398 != -1) {
            class377.method2293(arg1, var20, arg5, (byte) 69, var21, arg6);
            return;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)Z")
    public final boolean method1642(int arg0) {
        field3656++;
        if (arg0 == -2659) {
            return (this.field3648 >> 21 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)V")
    public static void method1643(int arg0) {
        if (arg0 == 23599) {
            field3650 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)I")
    public final int method1644(boolean arg0) {
        field3654++;
        return arg0 ? this.field3648 >> 18 & 0x7 : -125;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(Z)I")
    public final int method1645(boolean arg0) {
        field3658++;
        if (arg0) {
            field3650 = null;
        }
        return class326.method2089(this.field3648, false);
    }

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "(I)Z")
    public final boolean method1646(int arg0) {
        if (arg0 != 2) {
            field3651 = 109L;
        }
        field3655++;
        return (this.field3648 & 0x57BEB4) >> 22 != 0;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(IB)Z")
    public final boolean method1647(int arg0, byte arg1) {
        field3649++;
        int var3 = 23 % ((arg1 + 55) / 63);
        return (this.field3648 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "(I)Z")
    public final boolean method1648(int arg0) {
        if (arg0 != -1) {
            this.field3647 = -32;
        }
        field3652++;
        return (this.field3648 & 0x1) != 0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1649(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
