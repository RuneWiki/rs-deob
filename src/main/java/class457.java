import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class457 {

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "Lkk;")
    private class188 field6448 = new class188(256);

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "Lkk;")
    private class188 field6451 = new class188(256);

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "Lfp;")
    private class323 field6442;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "Lfp;")
    private class323 field6444;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "[I")
    public static int[] field6440 = new int[16];

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
    public static volatile int field6447 = -1;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
    public static int field6450 = -1;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II[II)Lnp;", line = 9)
    private final class490 method2714(int arg0, int arg1, int[] arg2, int arg3) {
        field6449++;
        int var5 = arg1 ^ (arg0 >>> 12 | (arg0 & 0xFFF) << 4);
        if (arg3 <= 103) {
            method2719(true);
        }
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class490 var9 = (class490) this.field6451.method1180((byte) 26, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class214 var10 = class214.method1314(this.field6442, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            class490 var11 = var10.method1312();
            this.field6451.method1179(var7, var11, (byte) -26);
            if (arg2 != null) {
                arg2[0] -= var11.field6918.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V", line = 50)
    public static void method2715(int arg0) {
        if (arg0 != -1) {
            method2715(51);
        }
        field6440 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "([III)Lnp;", line = 60)
    public final class490 method2716(int[] arg0, int arg1, int arg2) {
        field6443++;
        if (this.field6444.method2098((byte) 20) == 1) {
            return this.method2717(0, arg1, arg0, (byte) 81);
        } else if (this.field6444.method2084(arg1, arg2 ^ arg2) == 1) {
            return this.method2717(arg1, 0, arg0, (byte) 81);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II[IB)Lnp;", line = 87)
    private final class490 method2717(int arg0, int arg1, int[] arg2, byte arg3) {
        if (arg3 != 81) {
            this.field6444 = null;
        }
        field6445++;
        int var5 = arg1 ^ (arg0 >>> 12 | (arg0 & 0x20000FFF) << 4);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class490 var9 = (class490) this.field6451.method1180((byte) 26, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class163 var10 = (class163) this.field6448.method1180((byte) 26, var7);
            if (var10 == null) {
                var10 = class163.method1075(this.field6444, arg0, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field6448.method1179(var7, var10, (byte) -26);
            }
            class490 var11 = var10.method1078(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method1185(-38);
                this.field6451.method1179(var7, var11, (byte) -26);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIILdha;)V", line = 131)
    public static final void method2718(int arg0, int arg1, int arg2, int arg3, class77 arg4) {
        class165 var5 = class307.method2008(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field1264 = (arg1 << class660.field9038) + class197.field2617;
        arg4.field1255 = arg3;
        arg4.field1250 = (arg2 << class660.field9038) + class197.field2617;
        var5.field2271 = arg4;
        int var6 = class459.field6474 == class135.field1969 ? 1 : 0;
        if (arg4.method746(-126)) {
            if (arg4.method751(false)) {
                arg4.field1251 = class373.field5234[var6];
                class373.field5234[var6] = arg4;
                return;
            }
            arg4.field1251 = class710.field9861[var6];
            class710.field9861[var6] = arg4;
            class230.field3098 = true;
            return;
        }
        arg4.field1251 = class321.field4433[var6];
        class321.field4433[var6] = arg4;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)Z", line = 167)
    public static final boolean method2719(boolean arg0) {
        if (!arg0) {
            field6447 = 64;
        }
        field6441++;
        return class469.field6659 != 0;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II[I)Lnp;", line = 185)
    public final class490 method2720(int arg0, int arg1, int[] arg2) {
        field6446++;
        if (this.field6442.method2098((byte) 20) == 1) {
            return this.method2714(0, arg0, arg2, 115);
        } else if (~this.field6442.method2084(arg0, arg1 ^ 0xFFFFFFFE) == arg1) {
            return this.method2714(arg0, 0, arg2, 118);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lfp;Lfp;)V", line = 213)
    public class457(class323 arg0, class323 arg1) {
        this.field6442 = arg0;
        this.field6444 = arg1;
    }
}
