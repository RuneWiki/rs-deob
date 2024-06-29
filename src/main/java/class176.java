import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class176 {

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lefa;")
    private class322 field2469 = new class322(256);

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Lefa;")
    private class322 field2470 = new class322(256);

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Lmv;")
    private class295 field2468;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lmv;")
    private class295 field2463;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZIIIIII)V", line = 6)
    public static final void method1201(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 <= -121) {
            if ((arg0 ? class335.field4872.field9479 : class335.field4872.field9495) != 0 && arg1 != 0 && class380.field5732 < 50 && arg5 != -1) {
                class141.field2038[class380.field5732++] = new class268((byte) (arg0 ? 3 : 2), arg5, arg1, arg3, arg6, 0, arg4, null);
            }
            field2465++;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[IBI)Lwm;", line = 23)
    private final class396 method1202(int arg0, int[] arg1, byte arg2, int arg3) {
        field2464++;
        int var5 = arg3 ^ (arg0 << 4 & 0xFFF7 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class396 var9 = (class396) this.field2470.method2002((byte) -127, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class482 var10 = class482.method2762(this.field2468, arg0, arg3);
            if (arg2 > -115) {
                this.method1203((byte) 27, 10, -107, null);
            }
            if (var10 == null) {
                return null;
            }
            class396 var11 = var10.method2761();
            this.field2470.method2001(-94, var11, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field5988.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BII[I)Lwm;", line = 66)
    private final class396 method1203(byte arg0, int arg1, int arg2, int[] arg3) {
        field2462++;
        int var5 = arg2 ^ ((arg1 & 0xC0000FFF) << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class396 var9 = (class396) this.field2470.method2002((byte) -109, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class137 var10 = (class137) this.field2469.method2002((byte) -116, var7);
            if (var10 == null) {
                var10 = class137.method970(this.field2463, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field2469.method2001(75, var10, var7);
            }
            class396 var11 = var10.method974(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method2360((byte) 66);
                int var12 = 26 % ((-arg0 - 62) / 41);
                this.field2470.method2001(108, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II[I)Lwm;", line = 111)
    public final class396 method1204(int arg0, int arg1, int[] arg2) {
        field2461++;
        if (this.field2463.method1816(62) == 1) {
            return this.method1203((byte) 62, 0, arg0, arg2);
        } else if (this.field2463.method1845(arg0, true) == 1) {
            return this.method1203((byte) 60, arg0, 0, arg2);
        } else {
            if (arg1 != 930269740) {
                this.method1202(57, null, (byte) -74, 80);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[II)Lwm;", line = 139)
    public final class396 method1205(int arg0, int[] arg1, int arg2) {
        field2467++;
        if (this.field2468.method1816(-100) == 1) {
            return this.method1202(0, arg1, (byte) -119, arg2);
        } else if (this.field2468.method1845(arg2, true) == 1) {
            return this.method1202(arg2, arg1, (byte) -128, 0);
        } else {
            if (arg0 != 0) {
                this.method1204(90, 107, null);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lmv;Lmv;)V", line = 168)
    public class176(class295 arg0, class295 arg1) {
        this.field2468 = arg0;
        this.field2463 = arg1;
    }
}
