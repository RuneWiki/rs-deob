import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class130 extends class425 implements class115 {

    @OriginalMember(owner = "client!d", name = "z", descriptor = "Llm;")
    public class425 field2073;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "Lcba;")
    public static class471 field2080 = new class471(58, -1);

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public static int field2093 = 0;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "J")
    public static long field2092 = 0L;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "I")
    public static int field2094 = -1;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "[I")
    public static int[] field2095 = new int[6];

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    public static int field2091;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field2096;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(ZLqa;)Lvw;")
    public final class254 method483(boolean arg0, class207 arg1) {
        field2085++;
        return arg0 ? null : null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)I")
    public final int method748(boolean arg0) {
        if (arg0) {
            field2094 = -106;
        }
        field2091++;
        return 0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
    public static final boolean method886(int arg0, int arg1) {
        if (arg0 == 1) {
            field2074++;
            return (-arg1 & arg1) == arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)Z")
    public final boolean method264(int arg0) {
        if (arg0 != 1) {
            field2092 = -43L;
        }
        field2084++;
        return false;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(IIIIIIIIIILlm;)V")
    public class130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class425 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class49.method476(true, arg1, arg0));
        this.field2073 = arg10;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method488(class207 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 1) {
            this.method749(-54);
        }
        field2086++;
        return false;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLqa;I)Lr;")
    public final class157 method744(byte arg0, class207 arg1, int arg2) {
        int var4 = -62 % ((arg0 + 54) / 60);
        field2082++;
        return null;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)Z")
    public final boolean method747(int arg0) {
        field2076++;
        if (arg0 != -23611) {
            this.field2073 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIILqa;BIIII)V")
    public static final void method887(int arg0, int arg1, int arg2, class207 arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field2089++;
        class115 var9 = (class115) class265.method1739(arg2, arg8, arg6);
        if (var9 != null) {
            class364 var10 = class18.field227.method1201((byte) -128, var9.method748(false));
            int var11 = var9.method749(24194) & 0x3;
            int var12 = var9.method752(true);
            if (var10.field4957 == -1) {
                int var13 = arg7;
                if (var10.field4881 > 0) {
                    var13 = arg0;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg3.method1335(arg5, 4, 0, var13, arg1);
                    } else if (var11 == 1) {
                        arg3.method1316(var13, 4, 0, arg5, arg1);
                    } else if (var11 == 2) {
                        arg3.method1335(arg5, 4, 0, var13, arg1 + 3);
                    } else if (var11 == 3) {
                        arg3.method1316(var13, 4, 0, arg5 + 3, arg1);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg3.method1368(arg5, 1, 1, var13, arg1, (byte) -16);
                    } else if (var11 == 1) {
                        arg3.method1368(arg5, 1, 1, var13, arg1 + 3, (byte) -16);
                    } else if (var11 == 2) {
                        arg3.method1368(arg5 + 3, 1, 1, var13, arg1 + 3, (byte) -16);
                    } else if (var11 == 3) {
                        arg3.method1368(arg5 + 3, 1, 1, var13, arg1, (byte) -16);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg3.method1316(var13, 4, 0, arg5, arg1);
                    } else if (var11 == 1) {
                        arg3.method1335(arg5, 4, 0, var13, arg1 + 3);
                    } else if (var11 == 2) {
                        arg3.method1316(var13, 4, 0, arg5 + 3, arg1);
                    } else if (var11 == 3) {
                        arg3.method1335(arg5, 4, 0, var13, arg1);
                    }
                }
            } else {
                class319.method1986(arg5, arg1, var10, arg3, var11, 61);
            }
        }
        if (arg4 >= -125) {
            return;
        }
        class115 var14 = (class115) class582.method3324(arg2, arg8, arg6, field2096 == null ? (field2096 = method889("wf")) : field2096);
        if (var14 != null) {
            class364 var15 = class18.field227.method1201((byte) -112, var14.method748(false));
            int var16 = var14.method749(24194) & 0x3;
            int var17 = var14.method752(true);
            if (var15.field4957 != -1) {
                class319.method1986(arg5, arg1, var15, arg3, var16, 82);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field4881 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg3.method1367(arg5 + 3, arg1 - -3, arg5, var18, arg1, true);
                } else {
                    arg3.method1367(arg5, arg1 + 3, arg5 + 3, var18, arg1, true);
                }
            }
        }
        class115 var19 = (class115) class404.method2411(arg2, arg8, arg6);
        if (var19 == null) {
            return;
        }
        class364 var20 = class18.field227.method1201((byte) 81, var19.method748(false));
        int var21 = var19.method749(24194) & 0x3;
        if (var20.field4957 != -1) {
            class319.method1986(arg5, arg1, var20, arg3, var21, 108);
            return;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLqa;)V")
    public final void method746(byte arg0, class207 arg1) {
        field2078++;
        if (arg0 > -50) {
            field2094 = 103;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILqa;)V")
    public final void method751(int arg0, class207 arg1) {
        field2090++;
        if (arg0 >= 0) {
            field2092 = 8L;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)I")
    public final int method749(int arg0) {
        if (arg0 != 24194) {
            field2092 = -50L;
        }
        field2083++;
        return 0;
    }

    @OriginalMember(owner = "client!d", name = "k", descriptor = "(I)V")
    public static void method888(int arg0) {
        if (arg0 <= -66) {
            field2080 = null;
            field2095 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public final void method750(int arg0) {
        field2079++;
        if (arg0 <= 88) {
            this.method258(-124, false, 66, -67, null, -60, null);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIILjt;ILqa;)V")
    public final void method258(int arg0, boolean arg1, int arg2, int arg3, class87 arg4, int arg5, class207 arg6) {
        field2077++;
        if (arg2 < 79) {
            field2094 = 119;
        }
    }

    @OriginalMember(owner = "client!d", name = "h", descriptor = "(I)I")
    public final int method492(int arg0) {
        if (arg0 == 0) {
            field2088++;
            return 0;
        } else {
            return 78;
        }
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
    public final void method262(int arg0) {
        if (arg0 == 1) {
            field2087++;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)I")
    public final int method752(boolean arg0) {
        if (arg0) {
            field2072++;
            return 0;
        } else {
            return 126;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLqa;)Lnk;")
    public final class611 method490(boolean arg0, class207 arg1) {
        if (arg0) {
            field2095 = null;
        }
        field2081++;
        return this.field2073.method490(false, arg1);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lqa;B)V")
    public final void method487(class207 arg0, byte arg1) {
        if (arg1 != 21) {
            this.method749(-117);
        }
        field2075++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method889(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
