import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class64 extends class667 implements class633 {

    @OriginalMember(owner = "client!tga", name = "z", descriptor = "I")
    private int field655;

    @OriginalMember(owner = "client!tga", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field669 = new String[] { method462(method461("LFOO\f\u0010")), method462(method461("LFOOvQOG\u0015t\u0010")), method462(method461("C\u000f\u0000O7")), method462(method461("VTB\r")), method462(method461("LFOO\b\u0010")), method462(method461("VEO")), method462(method461("LFOO\r\u0010")), method462(method461("LFOO\u000b\u0010")), method462(method461("LFOO\u000e\u0010")), method462(method461("LFOO\u0002\u0010")), method462(method461("LFOO\t\u0010")), method462(method461("LFOO\u000f\u0010")), method462(method461("LFOO\u0003\u0010")) };

    @OriginalMember(owner = "client!tga", name = "w", descriptor = "[I")
    public static int[] field656 = new int[3];

    @OriginalMember(owner = "client!tga", name = "p", descriptor = "Z")
    public static boolean field658 = true;

    @OriginalMember(owner = "client!tga", name = "s", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!tga", name = "v", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!tga", name = "x", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!tga", name = "y", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!tga", name = "t", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!tga", name = "A", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!tga", name = "n", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!tga", name = "o", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!tga", name = "u", descriptor = "Llq;")
    public static class578 field664;

    @OriginalMember(owner = "client!tga", name = "r", descriptor = "Lkia;")
    public static class646 field667;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tga", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field668;

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)I")
    public final int method451(int arg0) {
        try {
            if (arg0 != 31188) {
                method453(11, (byte) -120);
            }
            ++field663;
            return super.field9696;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field669[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IB[BI)V")
    public final void method452(int arg0, byte arg1, byte[] arg2, int arg3) {
        try {
            ++field666;
            this.method4912((byte) -31, arg2, arg3);
            this.field655 = arg0;
            int var5 = 125 % ((-5 - arg1) / 35);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field669[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field669[2] : field669[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IB)I")
    public static final int method453(int arg0, byte arg1) {
        try {
            ++field665;
            if (arg1 != -69) {
                method454(-23, (class326) null);
            }
            return arg0 >>> 8;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field669[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILqja;)V")
    public static final void method454(int arg0, class326 arg1) {
        try {
            if (arg0 != -14496) {
                method453(-18, (byte) -92);
            }
            ++field659;
            if (class734.field10683 != null) {
                class583 var2 = null;
                if (arg1.field5139 == 0) {
                    var2 = (class583) class599.method4456(arg1.field5140, arg1.field5136, arg1.field5148);
                }
                if (~arg1.field5139 == -2) {
                    var2 = (class583) class271.method2248(arg1.field5140, arg1.field5136, arg1.field5148);
                }
                if (~arg1.field5139 == -3) {
                    var2 = (class583) class261.method2196(arg1.field5140, arg1.field5136, arg1.field5148, field668 != null ? field668 : (field668 = method460(field669[5])));
                }
                if (~arg1.field5139 == -4) {
                    var2 = (class583) class89.method766(arg1.field5140, arg1.field5136, arg1.field5148);
                }
                if (var2 != null) {
                    arg1.field5144 = var2.method1083((byte) -26);
                    arg1.field5146 = var2.method1087(18636);
                    arg1.field5135 = var2.method1097(false);
                } else {
                    arg1.field5135 = 0;
                    arg1.field5146 = 0;
                    arg1.field5144 = -1;
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field669[4] + arg0 + ',' + (arg1 != null ? field669[2] : field669[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "(I)V")
    public static void method455(int arg0) {
        try {
            field667 = null;
            field656 = null;
            if (arg0 < 48) {
                method455(-98);
            }
            field664 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field669[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(Lffa;I[BIZ)V")
    public class64(class197 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        try {
            this.field655 = arg1;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field669[1] + (arg0 != null ? field669[2] : field669[3]) + ',' + arg1 + ',' + (arg2 != null ? field669[2] : field669[3]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(Z)V")
    public final void method456(boolean arg0) {
        try {
            ++field657;
            super.field9700.method1752(this, 87);
            if (arg0) {
                method459(41L, -87);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field669[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)J")
    public final long method457(int arg0) {
        try {
            if (arg0 != -2471) {
                return 7L;
            } else {
                ++field660;
                return 0L;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field669[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Z)I")
    public final int method458(boolean arg0) {
        try {
            if (arg0) {
                field658 = false;
            }
            ++field661;
            return this.field655;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field669[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(JI)V")
    public static final void method459(long arg0, int arg1) {
        try {
            ++field662;
            int var3 = class194.field2605;
            int var4 = class114.field1356;
            if (~class477.field6945 != ~var3) {
                int var5 = var3 - class477.field6945;
                int var6 = (int) ((long) var5 * arg0 / 320L);
                if (var5 <= 0) {
                    if (var6 == 0) {
                        var6 = -1;
                    } else if (~var6 > ~var5) {
                        var6 = var5;
                    }
                } else if (~var6 != -1) {
                    if (~var5 > ~var6) {
                        var6 = var5;
                    }
                } else {
                    var6 = 1;
                }
                class477.field6945 += var6;
            }
            if (class578.field8576 != var4) {
                int var7 = -class578.field8576 + var4;
                int var8 = (int) ((long) var7 * arg0 / 320L);
                if (var7 > 0) {
                    if (~var8 != -1) {
                        if (~var8 < ~var7) {
                            var8 = var7;
                        }
                    } else {
                        var8 = 1;
                    }
                } else if (~var8 != -1) {
                    if (var8 < var7) {
                        var8 = var7;
                    }
                } else {
                    var8 = -1;
                }
                class578.field8576 += var8;
            }
            class98.field1099 += (float) arg0 * class402.field5996 / 40.0F * 8.0F;
            class377.field5748 += (float) arg0 * class459.field6688 / 40.0F * 8.0F;
            if (arg1 != 25578) {
                method455(-126);
            }
            class521.method3958(-16402);
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field669[8] + arg0 + ',' + arg1 + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method460(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method461(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 74);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method462(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 56;
                    break;
                case 1:
                    var10005 = 33;
                    break;
                case 2:
                    var10005 = 46;
                    break;
                case 3:
                    var10005 = 97;
                    break;
                default:
                    var10005 = 74;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
