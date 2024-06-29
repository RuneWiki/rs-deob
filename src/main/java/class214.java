import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class214 {

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Lcn;")
    private class37 field3350 = new class37(256);

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lcn;")
    private class37 field3358 = new class37(256);

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lrn;")
    private class18 field3349;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Lrn;")
    private class18 field3356;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static volatile int field3346 = 0;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Z")
    public static boolean field3348 = true;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Lrn;")
    public static class18 field3354;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lie;")
    public static class330 field3352;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[I)Lqj;", line = 12)
    private final class225 method1603(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = arg0 ^ ((arg2 & 0x90000FFF) << 4 | arg2 >>> 12);
        field3355++;
        int var6 = var5 | arg2 << 16;
        if (arg1 != 0) {
            method1604(16, (String) null);
        }
        long var7 = (long) var6;
        class225 var9 = (class225) this.field3358.method370((byte) -120, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class251 var10 = class251.method1866(this.field3349, arg2, arg0);
            if (var10 == null) {
                return null;
            }
            class225 var11 = var10.method1865();
            this.field3358.method375(var11, var7, -83);
            if (arg3 != null) {
                arg3[0] -= var11.field3516.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 51)
    public static final boolean method1604(int arg0, String arg1) {
        field3347++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 >= -126) {
            field3351 = -119;
        }
        for (int var2 = 0; var2 < class131.field2215; var2++) {
            if (arg1.equalsIgnoreCase(class83.field1197[var2])) {
                return true;
            }
        }
        if (arg1.equalsIgnoreCase(class173.field2746.field2706)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB[I)Lqj;", line = 83)
    public final class225 method1605(int arg0, byte arg1, int[] arg2) {
        field3353++;
        if (this.field3349.method185(false) == 1) {
            return this.method1603(arg0, 0, 0, arg2);
        } else if (this.field3349.method197((byte) 123, arg0) == 1) {
            return this.method1603(0, 0, arg0, arg2);
        } else {
            if (arg1 > -99) {
                this.method1606(-34, 97, (int[]) null, -102);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[II)Lqj;", line = 106)
    private final class225 method1606(int arg0, int arg1, int[] arg2, int arg3) {
        int var5 = ((arg1 & 0xC0000FFF) << 4 | arg1 >>> 12) ^ arg0;
        int var6 = var5 | arg1 << 16;
        field3345++;
        long var7 = (long) var6 ^ 0x100000000L;
        class225 var9 = (class225) this.field3358.method370((byte) -120, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class302 var10 = (class302) this.field3350.method370((byte) -120, var7);
            if (var10 == null) {
                var10 = class302.method2180(this.field3356, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field3350.method375(var10, var7, -92);
            }
            class225 var11 = var10.method2183(arg2);
            if (arg3 != -29296) {
                method1604(-20, (String) null);
            }
            if (var11 == null) {
                return null;
            } else {
                var10.method1357(947647010);
                this.field3358.method375(var11, var7, -83);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 150)
    public static void method1607(int arg0) {
        field3352 = null;
        if (arg0 == -1879044097) {
            field3354 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[I)Lqj;", line = 170)
    public final class225 method1608(int arg0, int arg1, int[] arg2) {
        field3357++;
        if (this.field3356.method185(false) == 1) {
            return this.method1606(arg0, 0, arg2, -29296);
        } else if (this.field3356.method197((byte) -34, arg0) == 1) {
            return this.method1606(0, arg0, arg2, -29296);
        } else {
            if (arg1 != 0) {
                method1607(65);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lrn;Lrn;)V", line = 198)
    public class214(class18 arg0, class18 arg1) {
        this.field3349 = arg0;
        this.field3356 = arg1;
    }
}
