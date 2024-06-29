import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class625 {

    @OriginalMember(owner = "client!go", name = "i", descriptor = "Z")
    private boolean field8985;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    private int field8981;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "Z")
    private boolean field8979;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    private int field8982;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field8978;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field8980;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public static int field8983;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    public static int field8984;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "J")
    public static long field8977;

    // $FF: synthetic field
    @OriginalMember(owner = "client!go", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field8988;

    // $FF: synthetic method
    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3616(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIIIII)V", line = 6)
    public static final void method3610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 1466) {
            method3610(115, 111, -80, 20, -113, -76, 119, 48);
        }
        field8983++;
        if (arg3 < 0 || arg4 < 0 || (class174.field2540 - 1) <= arg3 || arg4 >= class716.field9999 - 1) {
            return;
        }
        if (class390.field5454 == null) {
            return;
        }
        if (arg7 == 0) {
            class141 var8 = (class141) class654.method3688(arg6, arg3, arg4);
            class141 var9 = (class141) class46.method419(arg6, arg3, arg4);
            if (var8 != null && arg5 != 2) {
                if ((var8 instanceof class527)) {
                    ((class527) var8).field7483.method1748((byte) -125, arg1);
                } else {
                    class230.method1582(arg2, arg0 ^ 0xFFFFFA44, arg6, arg4, arg1, arg7, arg3, var8.method1109((byte) -96), arg5);
                }
            }
            if (var9 != null) {
                if (var9 instanceof class527) {
                    ((class527) var9).field7483.method1748((byte) 119, arg1);
                    return;
                }
                class230.method1582(arg2, arg0 ^ 0xFFFFFA44, arg6, arg4, arg1, arg7, arg3, var9.method1109((byte) -115), arg5);
                return;
            }
            return;
        }
        if (arg7 != 1) {
            if (arg7 == 2) {
                class141 var11 = (class141) class470.method2853(arg6, arg3, arg4, field8988 == null ? (field8988 = method3616("wk")) : field8988);
                if (var11 == null) {
                    return;
                }
                if (arg5 == 11) {
                    arg5 = 10;
                }
                if (var11 instanceof class344) {
                    ((class344) var11).field4845.method1748((byte) 93, arg1);
                    return;
                }
                class230.method1582(arg2, -2, arg6, arg4, arg1, arg7, arg3, var11.method1109((byte) -91), arg5);
            } else if (arg7 == 3) {
                class141 var10 = (class141) class158.method1202(arg6, arg3, arg4);
                if (var10 != null) {
                    if (var10 instanceof class208) {
                        ((class208) var10).field2989.method1748((byte) -126, arg1);
                        return;
                    }
                    class230.method1582(arg2, -2, arg6, arg4, arg1, arg7, arg3, var10.method1109((byte) 90), arg5);
                    return;
                }
            }
            return;
        }
        class141 var12 = (class141) class140.method1107(arg6, arg3, arg4);
        if (var12 == null) {
            return;
        }
        if (!(var12 instanceof class187)) {
            int var13 = var12.method1109((byte) -128);
            if (arg5 != 4 && arg5 != 5) {
                if (arg5 == 6) {
                    class230.method1582(arg2 + 4, -2, arg6, arg4, arg1, arg7, arg3, var13, 4);
                    return;
                }
                if (arg5 == 7) {
                    class230.method1582((arg2 + 2 & 0x3) + 4, -2, arg6, arg4, arg1, arg7, arg3, var13, 4);
                } else if (arg5 == 8) {
                    class230.method1582(arg2 + 4, -2, arg6, arg4, arg1, arg7, arg3, var13, 4);
                    class230.method1582((arg2 + 2 & 0x3) + 4, -2, arg6, arg4, arg1, arg7, arg3, var13, 4);
                    return;
                }
                return;
            }
            class230.method1582(arg2, -2, arg6, arg4, arg1, arg7, arg3, var13, 4);
            return;
        }
        ((class187) var12).field2694.method1748((byte) -124, arg1);
        return;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)Z", line = 130)
    public final boolean method3611(byte arg0) {
        if (arg0 <= 62) {
            this.method3613((byte) -43);
        }
        field8978++;
        return this.field8979;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Z", line = 141)
    public final boolean method3612(int arg0) {
        field8986++;
        return arg0 == 4 ? this.field8985 : true;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(B)I", line = 157)
    public final int method3613(byte arg0) {
        field8984++;
        int var2 = -68 % ((-arg0 - 71) / 36);
        return this.field8981;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lvw;I)V", line = 168)
    public static final void method3614(class304 arg0, int arg1) {
        field8987++;
        arg0.field4297 = null;
        if (arg1 >= -113) {
            method3610(-30, 17, -5, 64, 111, -9, 77, 18);
        }
        int var2 = arg0.field4298.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field4298[var3].field3397 = false;
        }
        class747[] var4 = class42.field638;
        synchronized (class42.field638) {
            if (var2 < class42.field638.length && class248.field3476[var2] < 200) {
                class42.field638[var2].method4152(arg0, 0);
                int var10002 = class248.field3476[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(ZIIZ)V", line = 195)
    public class625(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field8985 = arg0;
        this.field8981 = arg2;
        this.field8979 = arg3;
        this.field8982 = arg1;
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(B)I", line = 209)
    public final int method3615(byte arg0) {
        field8980++;
        if (arg0 <= 9) {
            this.field8981 = 76;
        }
        return this.field8982;
    }
}
