import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class308 {

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Z")
    public boolean field4662 = false;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "[I")
    public static int[] field4654 = new int[32];

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "[I")
    public static int[] field4658 = new int[1];

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public int field4653;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public int field4655;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Lti;")
    public class689 field4663;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field4664;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2042(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Z", line = 9)
    public final boolean method2036(byte arg0) {
        field4660++;
        if (arg0 >= -111) {
            this.field4663 = null;
        }
        return this.field4663.field9790.method2621(this.field4653, -28975);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLofa;)V", line = 22)
    public final void method2037(boolean arg0, class301 arg1) {
        if (arg0) {
            return;
        }
        field4659++;
        while (true) {
            int var3 = arg1.method1987(-58);
            if (var3 == 0) {
                return;
            }
            this.method2041(var3, arg1, (byte) 76);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZBLha;)Lit;", line = 50)
    public final class34 method2038(int arg0, boolean arg1, byte arg2, class544 arg3) {
        field4657++;
        long var5 = (long) (arg3.field7769 << 19 | (arg1 ? 262144 : 0) | this.field4653 | arg0 << 16);
        class34 var7 = (class34) this.field4663.field9796.method80((byte) -99, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field4663.field9790.method2621(this.field4653, -28975)) {
            class726 var8 = class726.method4002(this.field4663.field9790, this.field4653, 0);
            if (var8 != null) {
                var8.field10180 = var8.field10179 = var8.field10187 = var8.field10182 = 0;
                if (arg1) {
                    var8.method4004();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method4009();
                }
            }
            class34 var10 = arg3.method310(var8, true);
            if (var10 != null) {
                this.field4663.field9796.method67(var5, var10, -6772);
            }
            if (arg2 < 38) {
                method2039(-85, (byte) -39, 24, -12, -60, -7, 109, -24);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBIIIIII)V", line = 96)
    public static final void method2039(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4656++;
        if (arg0 >= 0 && arg3 >= 0 && arg0 < (class191.field3229 - 1) && arg3 < class314.field4720 - 1) {
            if (class488.field7062 == null) {
                return;
            }
            if (arg5 == 0) {
                class523 var8 = (class523) class486.method2948(arg2, arg0, arg3);
                class523 var9 = (class523) class664.method3728(arg2, arg0, arg3);
                if (var8 != null && arg4 != 2) {
                    if ((var8 instanceof class16)) {
                        ((class16) var8).field168.method832(0, arg6);
                    } else {
                        class659.method3706(arg5, arg3, arg4, var8.method87(2836), -89, arg6, arg0, arg7, arg2);
                    }
                }
                if (var9 != null) {
                    if ((var9 instanceof class16)) {
                        ((class16) var9).field168.method832(0, arg6);
                    } else {
                        class659.method3706(arg5, arg3, arg4, var9.method87(2836), arg1 ^ 0x61, arg6, arg0, arg7, arg2);
                    }
                }
            } else if (arg5 == 1) {
                class523 var12 = (class523) class55.method521(arg2, arg0, arg3);
                if (var12 != null) {
                    if (var12 instanceof class93) {
                        ((class93) var12).field1397.method832(0, arg6);
                    } else {
                        int var13 = var12.method87(2836);
                        if (arg4 == 4 || arg4 == 5) {
                            class659.method3706(arg5, arg3, 4, var13, -119, arg6, arg0, arg7, arg2);
                        } else if (arg4 == 6) {
                            class659.method3706(arg5, arg3, 4, var13, arg1 + 5, arg6, arg0, arg7 + 4, arg2);
                        } else if (arg4 == 7) {
                            class659.method3706(arg5, arg3, 4, var13, -107, arg6, arg0, (arg7 + 2 & 0x3) + 4, arg2);
                        } else if (arg4 == 8) {
                            class659.method3706(arg5, arg3, 4, var13, -102, arg6, arg0, arg7 + 4, arg2);
                            class659.method3706(arg5, arg3, 4, var13, 101, arg6, arg0, (arg7 + 2 & 0x3) + 4, arg2);
                        }
                    }
                }
            } else if (arg5 == 2) {
                class523 var11 = (class523) class140.method1093(arg2, arg0, arg3, field4664 == null ? (field4664 = method2042("tw")) : field4664);
                if (var11 != null) {
                    if (arg4 == 11) {
                        arg4 = 10;
                    }
                    if ((var11 instanceof class196)) {
                        ((class196) var11).field3372.method832(arg1 - 88, arg6);
                    } else {
                        class659.method3706(arg5, arg3, arg4, var11.method87(2836), 99, arg6, arg0, arg7, arg2);
                    }
                }
            } else if (arg5 == 3) {
                class523 var10 = (class523) class558.method3243(arg2, arg0, arg3);
                if (var10 != null) {
                    if ((var10 instanceof class545)) {
                        ((class545) var10).field7802.method832(0, arg6);
                    } else {
                        class659.method3706(arg5, arg3, arg4, var10.method87(2836), arg1 - 184, arg6, arg0, arg7, arg2);
                    }
                }
            }
        }
        if (arg1 != 88) {
            field4654 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V", line = 218)
    public static void method2040(boolean arg0) {
        field4658 = null;
        field4654 = null;
        if (!arg0) {
            method2040(true);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILofa;B)V", line = 231)
    private final void method2041(int arg0, class301 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field4653 = arg1.method1989((byte) -68);
        } else if (arg0 == 2) {
            this.field4655 = arg1.method1952(22085);
        } else if (arg0 == 3) {
            this.field4662 = true;
        } else if (arg0 == 4) {
            this.field4653 = -1;
        }
        field4661++;
        int var4 = 49 / ((arg2 + 48) / 54);
    }
}
