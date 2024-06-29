import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class405 extends class338 {

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public int field5894;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "J")
    public long field5891;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public int field5884;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public int field5892;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "Ljava/lang/String;")
    public String field5896;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public int field5897;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "Ljava/lang/String;")
    public String field5899;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "[I")
    public static int[] field5885 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "[Z")
    public static boolean[] field5895 = new boolean[100];

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "Z")
    public static boolean field5900 = true;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "Lam;")
    public static class286 field5886;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ii", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field5901;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "[I")
    public static int[] field5893;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2538(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIBIII)V", line = 5)
    public static final void method2533(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field5889++;
        int var8 = -32 / ((arg4 - 2) / 50);
        if (arg1 < 0 || arg0 < 0 || class315.field4214 - 1 <= arg1 || class340.field4549 - 1 <= arg0 || class176.field2209 == null) {
            return;
        }
        if (arg5 == 0) {
            class285 var13 = (class285) class173.method906(arg6, arg1, arg0);
            class285 var14 = (class285) class382.method2364(arg6, arg1, arg0);
            if (var13 != null && arg3 != 2) {
                if ((var13 instanceof class296)) {
                    ((class296) var13).field4023.method253((byte) -38, arg7);
                } else {
                    class46.method212(arg5, arg2, arg1, arg6, arg7, arg0, arg3, var13.method356(10397), false);
                }
            }
            if (var14 == null) {
                return;
            }
            if (var14 instanceof class296) {
                ((class296) var14).field4023.method253((byte) -46, arg7);
                return;
            }
            class46.method212(arg5, arg2, arg1, arg6, arg7, arg0, arg3, var14.method356(10397), false);
        } else if (arg5 == 1) {
            class285 var9 = (class285) class316.method1828(arg6, arg1, arg0);
            if (var9 != null) {
                if (var9 instanceof class232) {
                    ((class232) var9).field3196.method253((byte) -123, arg7);
                    return;
                }
                int var10 = var9.method356(10397);
                if (arg3 != 4 && arg3 != 5) {
                    if (arg3 != 6) {
                        if (arg3 == 7) {
                            class46.method212(arg5, (arg2 + 2 & 0x3) + 4, arg1, arg6, arg7, arg0, 4, var10, false);
                        } else if (arg3 == 8) {
                            class46.method212(arg5, arg2 + 4, arg1, arg6, arg7, arg0, 4, var10, false);
                            class46.method212(arg5, (arg2 + 2 & 0x3) + 4, arg1, arg6, arg7, arg0, 4, var10, false);
                            return;
                        }
                        return;
                    }
                    class46.method212(arg5, arg2 + 4, arg1, arg6, arg7, arg0, 4, var10, false);
                    return;
                }
                class46.method212(arg5, arg2, arg1, arg6, arg7, arg0, 4, var10, false);
                return;
            }
            return;
        } else if (arg5 == 2) {
            class285 var12 = (class285) class165.method878(arg6, arg1, arg0, field5901 == null ? (field5901 = method2538("io")) : field5901);
            if (var12 != null) {
                if (arg3 == 11) {
                    arg3 = 10;
                }
                if (var12 instanceof class63) {
                    ((class63) var12).field664.method253((byte) -53, arg7);
                    return;
                }
                class46.method212(arg5, arg2, arg1, arg6, arg7, arg0, arg3, var12.method356(10397), false);
                return;
            }
        } else {
            if (arg5 == 3) {
                class285 var11 = (class285) class275.method1514(arg6, arg1, arg0);
                if (var11 != null) {
                    if (var11 instanceof class423) {
                        ((class423) var11).field6210.method253((byte) -110, arg7);
                        return;
                    }
                    class46.method212(arg5, arg2, arg1, arg6, arg7, arg0, arg3, var11.method356(10397), false);
                    return;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V", line = 129)
    public static final void method2534(int arg0, int arg1) {
        class69.field722.method614(arg0 ^ 0xFFFFFF86, arg1);
        field5888++;
        if (arg0 != 2) {
            method2537((byte) -98);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V", line = 145)
    public static final void method2535(byte arg0) {
        field5898++;
        if (class334.field4437.length() == 0) {
            return;
        }
        class418.method2592("--> " + class334.field4437, false);
        class227.method1233(class334.field4437, 7272, false);
        if (arg0 != -32) {
            method2535((byte) 117);
        }
        class89.field1005 = 0;
        class334.field4437 = "";
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)Lqq;", line = 166)
    public static final class262 method2536(byte arg0, int arg1) {
        field5890++;
        class262 var2 = (class262) class38.field394.method616(-31, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = field5886.method1687(arg1, 1, 255);
        if (arg0 != 90) {
            field5893 = null;
        }
        class262 var4 = new class262();
        if (var3 != null) {
            var4.method1465(false, new class250(var3), arg1);
        }
        class38.field394.method615((byte) -106, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V", line = 198)
    public class405(String arg0, String arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        this.field5894 = arg6;
        this.field5891 = arg4;
        this.field5884 = arg2;
        this.field5892 = arg3;
        this.field5896 = arg0;
        this.field5897 = arg5;
        this.field5899 = arg1;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V", line = 212)
    public static void method2537(byte arg0) {
        field5885 = null;
        if (arg0 == 70) {
            field5893 = null;
            field5886 = null;
            field5895 = null;
        }
    }
}
