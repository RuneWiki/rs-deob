import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class235 {

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public int field3245;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Llh;")
    public static class487 field3246 = new class487(2, -1);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!fc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3244++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static final void method1477(int arg0) {
        field3248++;
        if (arg0 != -28971) {
            return;
        }
        class181 var1 = null;
        try {
            var1 = class105.method756("2", (byte) -50);
            class501 var2 = new class501(class465.field6392 * 6 + 3);
            var2.method2817(1, true);
            var2.method2837(class465.field6392, -2);
            for (int var3 = 0; var3 < class324.field4421.length; var3++) {
                if (class588.field8266[var3]) {
                    var2.method2837(var3, -2);
                    var2.method2836(class324.field4421[var3], -22164);
                }
            }
            var1.method1242(35, var2.field6855, var2.field6892, 0);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method1248(0);
            }
        } catch (Exception var4) {
        }
        class282.field3848 = class577.method3295((byte) 15);
        class9.field90 = false;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class235(String arg0, int arg1) {
        this.field3245 = arg1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIB[IIIII)Z")
    public static final boolean method1478(int arg0, int arg1, byte arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 <= 63) {
            field3246 = null;
        }
        if (arg7 < 0) {
            arg7 = 0;
        }
        if (arg0 > class12.field125) {
            arg0 = class12.field125;
        }
        field3249++;
        if (arg7 >= arg0) {
            return true;
        }
        int var8 = arg0 - arg7 >> 2;
        int var9 = arg1 * arg7 + arg4;
        int var10 = arg7 + arg5 - 1;
        if (class1.field2 == 1) {
            class676.field9648 += var8;
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var16 = arg0 - arg7 & 0x3;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            return true;
                        }
                        var10++;
                        if (arg3[var10] > var9) {
                            arg3[var10] = var9;
                        }
                        var9 += arg1;
                    }
                }
                var10++;
                if (var9 < arg3[var10]) {
                    arg3[var10] = var9;
                }
                int var17 = arg1 + var9;
                var10++;
                if (arg3[var10] > var17) {
                    arg3[var10] = var17;
                }
                int var18 = arg1 + var17;
                var10++;
                if (arg3[var10] > var18) {
                    arg3[var10] = var18;
                }
                int var19 = arg1 + var18;
                var10++;
                if (var19 < arg3[var10]) {
                    arg3[var10] = var19;
                }
                var9 = arg1 + var19;
            }
        } else {
            int var11 = var9 - 38400;
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var12 = arg0 - arg7 & 0x3;
                    while (true) {
                        var12--;
                        if (var12 < 0) {
                            return true;
                        }
                        var10++;
                        if (arg3[var10] > var11) {
                            return false;
                        }
                        var11 += arg1;
                    }
                }
                var10++;
                if (arg3[var10] > var11) {
                    return false;
                }
                int var13 = arg1 + var11;
                int var10000 = ~var13;
                var10++;
                if (var10000 > ~arg3[var10]) {
                    return false;
                }
                int var14 = arg1 + var13;
                var10000 = ~var14;
                var10++;
                if (var10000 > ~arg3[var10]) {
                    return false;
                }
                int var15 = arg1 + var14;
                var10++;
                if (var15 < arg3[var10]) {
                    return false;
                }
                var11 = arg1 + var15;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static void method1479(byte arg0) {
        field3246 = null;
        if (arg0 < 95) {
            field3246 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1480(int arg0, String arg1) {
        field3247++;
        int var2 = arg1.length();
        if (arg0 >= -110) {
            method1477(-62);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 <= '߿') {
                var3 += 2;
            } else {
                var3 += 3;
            }
        }
        return var3;
    }
}
