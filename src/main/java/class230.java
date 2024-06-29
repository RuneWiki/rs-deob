import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class230 {

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "[Lig;")
    private class687[] field3332;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    private int field3325;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3334 = new String[] { method1914(method1913("(\u0005u\u0011<")), method1914(method1913("(\u0005uo}#\u000e/m<")), method1914(method1913("6Iu}i")), method1914(method1913("#\u00127?")), method1914(method1913("(\u0005u\u0017<")), method1914(method1913("(\u0005u\u0010<")), method1914(method1913("(\u0005u\u0016<")), method1914(method1913("(\u0005u\u0012<")) };

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field3330 = -1;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "J")
    private long field3324;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Lig;")
    private class687 field3327;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[Lcka;")
    public static class515[] field3333;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V", line = 9)
    public static void method1908(byte arg0) {
        try {
            field3333 = null;
            int var1 = 39 % ((arg0 - 54) / 57);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3334[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIII)I", line = 18)
    public static final int method1909(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            if (arg3 != -186708535) {
                return -61;
            }
            field3326++;
            if (class107.field1413 == null) {
                return 0;
            } else if (arg4 < 3) {
                int var6 = arg0 >> 9;
                int var7 = arg2 >> 9;
                if (arg5 < 0 || arg1 < 0 || arg5 > (class625.field8929 - 1) || (class14.field187 - 1) < arg1) {
                    return 0;
                } else if (var6 >= 1 && var7 >= 1 && (class625.field8929 - 1) >= var6 && var7 <= (class14.field187 - 1)) {
                    boolean var8 = (class76.field1089[1][arg0 >> 9][arg2 >> 9] & 0x2) != 0;
                    if ((arg0 & 0x1FF) == 0) {
                        boolean var9 = (class76.field1089[1][var6 - 1][arg2 >> 9] & 0x2) != 0;
                        boolean var10 = (class76.field1089[1][var6][arg2 >> 9] & 0x2) != 0;
                        if (var10 != var9) {
                            var8 = (class76.field1089[1][arg5][arg1] & 0x2) != 0;
                        }
                    }
                    if ((arg2 & 0x1FF) == 0) {
                        boolean var11 = (class76.field1089[1][arg0 >> 9][var7 - 1] & 0x2) != 0;
                        boolean var12 = (class76.field1089[1][arg0 >> 9][var7] & 0x2) != 0;
                        if (var11 != var12) {
                            var8 = (class76.field1089[1][arg5][arg1] & 0x2) != 0;
                        }
                    }
                    if (var8) {
                        arg4++;
                    }
                    return class107.field1413[arg4].method5440((byte) 15, arg0, arg2);
                } else {
                    return 0;
                }
            } else {
                return class107.field1413[arg4].method5440((byte) 15, arg0, arg2);
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field3334[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLig;J)V", line = 88)
    public final void method1910(boolean arg0, class687 arg1, long arg2) {
        try {
            field3328++;
            if (arg1.field9627 != null) {
                arg1.method4911(118);
            }
            class687 var5 = this.field3332[(int) ((long) (this.field3325 - 1) & arg2)];
            arg1.field9627 = var5.field9627;
            arg1.field9626 = var5;
            if (arg0) {
                arg1.field9627.field9626 = arg1;
                arg1.field9630 = arg2;
                arg1.field9626.field9627 = arg1;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field3334[4] + arg0 + ',' + (arg1 == null ? field3334[3] : field3334[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V", line = 120)
    public class230(int arg0) {
        try {
            this.field3332 = new class687[arg0];
            this.field3325 = arg0;
            for (int var2 = 0; var2 < arg0; var2++) {
                class687 var3 = this.field3332[var2] = new class687();
                var3.field9626 = var3;
                var3.field9627 = var3;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3334[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IJ)Lig;", line = 143)
    public final class687 method1911(int arg0, long arg1) {
        try {
            this.field3324 = arg1;
            field3331++;
            class687 var4 = this.field3332[(int) (arg1 & (long) (this.field3325 + arg0))];
            for (this.field3327 = var4.field9626; this.field3327 != var4; this.field3327 = this.field3327.field9626) {
                if (this.field3327.field9630 == arg1) {
                    class687 var5 = this.field3327;
                    this.field3327 = this.field3327.field9626;
                    return var5;
                }
            }
            this.field3327 = null;
            return null;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field3334[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)Lig;", line = 171)
    public final class687 method1912(boolean arg0) {
        try {
            field3329++;
            if (this.field3327 == null) {
                return null;
            }
            class687 var2 = this.field3332[(int) (this.field3324 & (long) (this.field3325 - 1))];
            while (this.field3327 != var2) {
                if (this.field3324 == this.field3327.field9630) {
                    class687 var3 = this.field3327;
                    this.field3327 = this.field3327.field9626;
                    return var3;
                }
                this.field3327 = this.field3327.field9626;
            }
            this.field3327 = null;
            return arg0 ? null : null;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3334[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1913(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x14);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1914(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 77;
                    break;
                case 1:
                    var10005 = 103;
                    break;
                case 2:
                    var10005 = 91;
                    break;
                case 3:
                    var10005 = 83;
                    break;
                default:
                    var10005 = 20;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
