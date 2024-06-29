import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class208 {

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public int field2905;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public int field2903;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public int field2899;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public int field2901;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field2904 = 0;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lho;")
    public static class318 field2898;

    // $FF: synthetic field
    @OriginalMember(owner = "client!o", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field2908;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V")
    public static final void method1321(int arg0, int arg1, int arg2) {
        boolean var3 = class59.field688[0][arg1][arg2] != null && class59.field688[0][arg1][arg2].field6549 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class59.field688[var4][arg1][arg2] == null) {
                class472 var5 = class59.field688[var4][arg1][arg2] = new class472(var4);
                if (var3) {
                    var5.field6546++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 > -127) {
            return;
        }
        field2906++;
        if (class177.field2236 <= (arg4 - arg1) && class627.field8783 >= arg1 + arg4 && class727.field10060 <= (arg5 - arg1) && (arg1 + arg5) <= class474.field6576) {
            class66.method511(arg1, arg3, arg2, arg4, (byte) 125, arg0, arg5);
        } else {
            class390.method2416(arg4, arg2, arg0, arg5, 0, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!o", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2900++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1323(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2902++;
        int var8 = 38 / ((-arg4 - 32) / 49);
        if (arg1 < 0 || arg2 < 0 || (class741.field10208 - 1) <= arg1 || arg2 >= class525.field7224 - 1 || class59.field688 == null) {
            return;
        }
        if (arg7 == 0) {
            class466 var9 = (class466) class174.method1110(arg5, arg1, arg2);
            class466 var10 = (class466) class534.method3160(arg5, arg1, arg2);
            if (var9 != null && arg0 != 2) {
                if ((var9 instanceof class107)) {
                    ((class107) var9).field1262.method2666((byte) -105, arg3);
                } else {
                    class542.method3217(arg2, arg5, arg6, var9.method760(-27640), arg1, arg3, 1, arg7, arg0);
                }
            }
            if (var10 != null) {
                if (var10 instanceof class107) {
                    ((class107) var10).field1262.method2666((byte) -111, arg3);
                    return;
                }
                class542.method3217(arg2, arg5, arg6, var10.method760(-27640), arg1, arg3, 1, arg7, arg0);
                return;
            }
        } else if (arg7 == 1) {
            class466 var13 = (class466) class371.method2310(arg5, arg1, arg2);
            if (var13 == null) {
                return;
            }
            if (var13 instanceof class521) {
                ((class521) var13).field7170.method2666((byte) -112, arg3);
                return;
            }
            int var14 = var13.method760(-27640);
            if (arg0 == 4 || arg0 == 5) {
                class542.method3217(arg2, arg5, arg6, var14, arg1, arg3, 1, arg7, 4);
                return;
            }
            if (arg0 == 6) {
                class542.method3217(arg2, arg5, arg6 + 4, var14, arg1, arg3, 1, arg7, 4);
                return;
            }
            if (arg0 == 7) {
                class542.method3217(arg2, arg5, (arg6 + 2 & 0x3) + 4, var14, arg1, arg3, 1, arg7, 4);
            } else if (arg0 == 8) {
                class542.method3217(arg2, arg5, arg6 + 4, var14, arg1, arg3, 1, arg7, 4);
                class542.method3217(arg2, arg5, (arg6 + 2 & 0x3) + 4, var14, arg1, arg3, 1, arg7, 4);
                return;
            }
        } else if (arg7 == 2) {
            class466 var12 = (class466) class485.method2882(arg5, arg1, arg2, field2908 == null ? (field2908 = method1326("oc")) : field2908);
            if (var12 != null) {
                if (arg0 == 11) {
                    arg0 = 10;
                }
                if (var12 instanceof class681) {
                    ((class681) var12).field9540.method2666((byte) 27, arg3);
                    return;
                }
                class542.method3217(arg2, arg5, arg6, var12.method760(-27640), arg1, arg3, 1, arg7, arg0);
                return;
            }
        } else {
            if (arg7 == 3) {
                class466 var11 = (class466) class349.method2197(arg5, arg1, arg2);
                if (var11 != null) {
                    if (!(var11 instanceof class236)) {
                        class542.method3217(arg2, arg5, arg6, var11.method760(-27640), arg1, arg3, 1, arg7, arg0);
                        return;
                    }
                    ((class236) var11).field3548.method2666((byte) -126, arg3);
                    return;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method1324(int arg0) {
        if (arg0 == 0) {
            field2898 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([J[IB)V")
    public static final void method1325(long[] arg0, int[] arg1, byte arg2) {
        field2897++;
        class657.method3764(arg2 ^ 0xFFFFFFFA, arg0, arg0.length - 1, 0, arg1);
        if (arg2 != -5) {
            method1324(59);
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIII)V")
    public class208(int arg0, int arg1, int arg2, int arg3) {
        this.field2905 = arg0;
        this.field2903 = arg2;
        this.field2899 = arg3;
        this.field2901 = arg1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1326(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
