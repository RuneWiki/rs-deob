import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class158 {

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Lh;")
    private class190 field2296 = new class190(256);

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lh;")
    private class190 field2298 = new class190(256);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lve;")
    private class233 field2284;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lve;")
    private class233 field2293;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field2289 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2287 = "Walk here";

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field2288 = 0;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Lnf;")
    public static class57 field2300 = new class57();

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "[Lpg;")
    public static class175[] field2290;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "[Llk;")
    public static class244[] field2301;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[IIB)Lml;")
    private final class116 method1057(int arg0, int[] arg1, int arg2, byte arg3) {
        int var5 = arg2 ^ (arg0 >>> 12 | (arg0 & 0x80000FFF) << 4);
        int var6 = var5 | arg0 << 16;
        if (arg3 < 60) {
            field2300 = null;
        }
        field2299++;
        long var7 = (long) var6;
        class116 var9 = (class116) this.field2298.method1218(var7, -94);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class238 var10 = class238.method1560(this.field2293, arg0, arg2);
            if (var10 == null) {
                return null;
            }
            class116 var11 = var10.method1561();
            this.field2298.method1215(var11, -94, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field1721.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II[I)Lml;")
    public final class116 method1058(int arg0, int arg1, int[] arg2) {
        field2286++;
        if (this.field2284.method1526((byte) 48) == 1) {
            return this.method1064(arg2, false, 0, arg0);
        }
        if (arg1 != 0) {
            this.field2296 = null;
        }
        if (this.field2284.method1525(11672, arg0) != 1) {
            throw new RuntimeException();
        }
        return this.method1064(arg2, false, arg0, 0);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)V")
    public static final void method1059(byte arg0, int arg1) {
        field2285++;
        int var2 = -107 / ((69 - arg0) / 39);
        class12.field191 = -1;
        if (arg1 == 37) {
            class9.field166 = 3.0F;
        } else if (arg1 == 50) {
            class9.field166 = 4.0F;
        } else if (arg1 == 75) {
            class9.field166 = 6.0F;
        } else if (arg1 == 100) {
            class9.field166 = 8.0F;
        } else if (arg1 == 200) {
            class9.field166 = 16.0F;
        }
        class12.field191 = -1;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1060(String arg0, String arg1, String arg2, int arg3) {
        int var4 = arg1.length();
        int var5 = arg0.length();
        int var6 = arg2.length();
        field2291++;
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg1.indexOf(arg0, var9);
                if (var10 < 0) {
                    break;
                }
                var9 = var5 + var10;
                var7 += var8;
            }
        }
        StringBuffer var11 = new StringBuffer(var7);
        int var12 = -75 / ((arg3 + 12) / 52);
        int var13 = 0;
        while (true) {
            int var14 = arg1.indexOf(arg0, var13);
            if (var14 < 0) {
                var11.append(arg1.substring(var13));
                return var11.toString();
            }
            var11.append(arg1.substring(var13, var14));
            var11.append(arg2);
            var13 = var5 + var14;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1061(String arg0, int arg1) {
        field2295++;
        if (arg1 != -1) {
            field2290 = null;
        }
        for (int var2 = 0; var2 < class17.field240.length; var2++) {
            if (class17.field240[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([IIB)Lml;")
    public final class116 method1062(int[] arg0, int arg1, byte arg2) {
        field2297++;
        if (arg2 >= -70) {
            this.field2296 = null;
        }
        if (this.field2293.method1526((byte) 127) == 1) {
            return this.method1057(0, arg0, arg1, (byte) 78);
        } else if (this.field2293.method1525(11672, arg1) == 1) {
            return this.method1057(arg1, arg0, 0, (byte) 78);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public static final void method1063(boolean arg0) {
        class27.field384.method260(0);
        class263.field3956.method260(0);
        class69.field1073.method260(0);
        class129.field1889.method260(0);
        if (arg0) {
            field2287 = null;
        }
        field2292++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([IZII)Lml;")
    private final class116 method1064(int[] arg0, boolean arg1, int arg2, int arg3) {
        field2294++;
        int var5 = arg3 ^ (arg2 >>> 12 | (arg2 & 0x60000FFF) << 4);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        if (arg1) {
            return null;
        }
        class116 var9 = (class116) this.field2298.method1218(var7, -6);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class49 var10 = (class49) this.field2296.method1218(var7, 115);
            if (var10 == null) {
                var10 = class49.method332(this.field2284, arg2, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field2296.method1215(var10, -110, var7);
            }
            class116 var11 = var10.method333(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method1706(-61);
                this.field2298.method1215(var11, -94, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lve;Lve;)V")
    public class158(class233 arg0, class233 arg1) {
        this.field2284 = arg1;
        this.field2293 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)V")
    public static void method1065(boolean arg0) {
        field2287 = null;
        field2290 = null;
        field2301 = null;
        if (!arg0) {
            field2300 = null;
        }
        field2300 = null;
    }
}
