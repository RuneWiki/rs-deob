import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class334 {

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    private int field4897;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public int field4894;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "[I")
    public static int[] field4895 = new int[1];

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "Lla;")
    public static class422 field4889;

    @OriginalMember(owner = "client!tm", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field4888++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)Z", line = 11)
    public static final boolean method2139(int arg0, int arg1) {
        field4890++;
        if (arg0 != 4) {
            method2144(109);
        }
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)I", line = 24)
    public static final int method2140(int arg0, int arg1) {
        field4891++;
        if (arg1 != 255) {
            field4889 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BF)F", line = 37)
    public static final float method2141(byte arg0, float arg1) {
        field4892++;
        return arg0 >= -90 ? -0.75172037F : arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BII)Z", line = 49)
    public static final boolean method2142(byte arg0, int arg1, int arg2) {
        field4887++;
        if (!class32.field304) {
            return false;
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class158.field2453[var3] == null || class158.field2453[var3][var4] == null) {
            return false;
        } else if (arg0 >= -20) {
            return false;
        } else {
            class353 var5 = class158.field2453[var3][var4];
            if (arg2 == -1 && var5.field5306 == 0) {
                for (class208 var6 = (class208) class344.field5093.method3463((byte) -50); var6 != null; var6 = (class208) class344.field5093.method3469((byte) 107)) {
                    if (var6.field3488 == 10 || var6.field3488 == 1001 || var6.field3488 == 8 || var6.field3488 == 46 || var6.field3488 == 3) {
                        for (class353 var7 = class65.method638(var6.field3474, 1668949296); var7 != null; var7 = class69.method652(var7, 0)) {
                            if (var5.field5349 == var7.field5349) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (class208 var8 = (class208) class344.field5093.method3463((byte) -50); var8 != null; var8 = (class208) class344.field5093.method3469((byte) 107)) {
                    if (var8.field3478 == arg2 && var5.field5349 == var8.field3474 && (var8.field3488 == 10 || var8.field3488 == 1001 || var8.field3488 == 8 || var8.field3488 == 46 || var8.field3488 == 3)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)I", line = 117)
    public final int method2143(byte arg0) {
        if (arg0 != 24) {
            field4889 = null;
        }
        field4893++;
        return this.field4897;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 130)
    public static void method2144(int arg0) {
        field4889 = null;
        field4895 = null;
        if (arg0 <= 34) {
            method2141((byte) 114, -1.6550117F);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IBIIILha;I)Lka;", line = 144)
    public static final class282 method2145(int arg0, byte arg1, int arg2, int arg3, int arg4, class544 arg5, int arg6) {
        field4896++;
        if (arg1 != 116) {
            return null;
        }
        long var7 = (long) arg0;
        class282 var9 = (class282) class145.field2239.method80((byte) -72, var7);
        short var10 = 2055;
        if (var9 == null) {
            class352 var11 = class357.method2284(class532.field7662, arg0, 0, (byte) -109);
            if (var11 == null) {
                return null;
            }
            if (var11.field5193 < 13) {
                var11.method2235(126, 2);
            }
            var9 = arg5.method301(var11, var10, class440.field6417, 64, 768);
            class145.field2239.method67(var7, var9, arg1 ^ 0xFFFFE5F8);
        }
        class282 var12 = var9.method1025((byte) 2, var10, true);
        if (arg3 != 0) {
            var12.method1019(arg3);
        }
        if (arg4 != 0) {
            var12.method1042(arg4);
        }
        if (arg6 != 0) {
            var12.method1049(arg6);
        }
        if (arg2 != 0) {
            var12.method1047(0, arg2, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(II)V", line = 198)
    public class334(int arg0, int arg1) {
        this.field4897 = arg0;
        this.field4894 = arg1;
    }
}
