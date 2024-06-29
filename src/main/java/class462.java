import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class462 {

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "Lfa;")
    private class371 field6520 = new class371(256);

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "Lfa;")
    private class371 field6523 = new class371(256);

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "Lui;")
    private class451 field6514;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "Lui;")
    private class451 field6517;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "[I")
    public static int[] field6510 = new int[5];

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Ltr;")
    public static class229 field6513;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/String;IIBLjava/lang/String;Ljava/lang/String;)V")
    public static final void method2719(String arg0, int arg1, int arg2, byte arg3, String arg4, String arg5) {
        class269.method1748(arg5, arg4, arg1, arg0, (byte) -63, -1, (String) null, arg2);
        if (arg3 == -78) {
            field6516++;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I[II)Luk;")
    public final class328 method2720(int arg0, int[] arg1, int arg2) {
        field6519++;
        if (this.field6514.method2675(false) == 1) {
            return this.method2722(0, (byte) -29, arg0, arg1);
        }
        if (arg2 != -47426736) {
            method2719((String) null, -94, -78, (byte) 121, (String) null, (String) null);
        }
        if (this.field6514.method2662(arg0, (byte) -7) != 1) {
            throw new RuntimeException();
        }
        return this.method2722(arg0, (byte) -29, 0, arg1);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z[III)Luk;")
    private final class328 method2721(boolean arg0, int[] arg1, int arg2, int arg3) {
        field6521++;
        int var5 = ((arg3 & 0x70000FFF) << 4 | arg3 >>> 12) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class328 var9 = (class328) this.field6523.method2305(var7, (byte) 100);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class54 var10 = class54.method388(this.field6517, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class328 var11 = var10.method390();
            if (arg0) {
                return null;
            }
            this.field6523.method2307(var7, var11, (byte) -66);
            if (arg1 != null) {
                arg1[0] -= var11.field4922.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBI[I)Luk;")
    private final class328 method2722(int arg0, byte arg1, int arg2, int[] arg3) {
        field6515++;
        int var5 = arg2 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFFA);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class328 var9 = (class328) this.field6523.method2305(var7, (byte) 62);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            if (arg1 != -29) {
                method2719((String) null, -84, -109, (byte) -5, (String) null, (String) null);
            }
            class74 var10 = (class74) this.field6520.method2305(var7, (byte) 61);
            if (var10 == null) {
                var10 = class74.method634(this.field6514, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field6520.method2307(var7, var10, (byte) -59);
            }
            class328 var11 = var10.method641(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method283(2);
                this.field6523.method2307(var7, var11, (byte) 126);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
    public static final void method2723(int arg0, int arg1) {
        if (arg1 != -1) {
            method2726((byte) -27);
        }
        class400 var2 = class475.field6651;
        synchronized (class475.field6651) {
            class475.field6651.method2389(false, arg0);
        }
        field6512++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([IIB)Luk;")
    public final class328 method2724(int[] arg0, int arg1, byte arg2) {
        field6522++;
        if (this.field6517.method2675(false) == 1) {
            return this.method2721(false, arg0, arg1, 0);
        }
        int var4 = -89 / ((arg2 + 46) / 54);
        if (this.field6517.method2662(arg1, (byte) -7) != 1) {
            throw new RuntimeException();
        }
        return this.method2721(false, arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIB)V")
    public static final void method2725(int arg0, int arg1, byte arg2) {
        field6511++;
        class186 var3 = class275.method1789(arg0, (byte) 123, 13);
        var3.method1285(0);
        var3.field2829 = arg1;
        int var4 = 126 / ((arg2 - 52) / 51);
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lui;Lui;)V")
    public class462(class451 arg0, class451 arg1) {
        this.field6514 = arg1;
        this.field6517 = arg0;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static void method2726(byte arg0) {
        field6510 = null;
        field6513 = null;
        if (arg0 > -94) {
            field6518 = -83;
        }
    }
}
