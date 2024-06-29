import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class192 {

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Lub;")
    private class18 field2700 = new class18(256);

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Lub;")
    private class18 field2706 = new class18(256);

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Lpc;")
    private class473 field2705;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Lpc;")
    private class473 field2704;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "[I")
    public static int[] field2697 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "[Lfg;")
    public static class83[] field2703;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[II)Luo;")
    private final class404 method1235(int arg0, int arg1, int[] arg2, int arg3) {
        field2698++;
        int var5 = arg3 ^ (arg1 << 4 & 0xFFFB | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        int var7 = -26 / ((21 - arg0) / 49);
        long var8 = (long) var6;
        class404 var10 = (class404) this.field2706.method182(var8, (byte) 101);
        if (var10 != null) {
            return var10;
        } else if (arg2 == null || arg2[0] > 0) {
            class113 var11 = class113.method776(this.field2704, arg1, arg3);
            if (var11 == null) {
                return null;
            }
            class404 var12 = var11.method777();
            this.field2706.method173(var8, var12, (byte) 104);
            if (arg2 != null) {
                arg2[0] -= var12.field5566.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I[IB)Luo;")
    public final class404 method1236(int arg0, int[] arg1, byte arg2) {
        int var4 = 115 % ((arg2 + 23) / 40);
        field2701++;
        if (this.field2705.method2724(0) == 1) {
            return this.method1239(65522, arg0, 0, arg1);
        } else if (this.field2705.method2710(arg0, (byte) -103) == 1) {
            return this.method1239(65522, 0, arg0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZIII)I")
    public static final int method1237(boolean arg0, int arg1, int arg2, int arg3) {
        field2702++;
        class32 var4 = class222.method1397(arg0, arg2, false);
        if (var4 == null) {
            return 0;
        } else if (arg1 == 18680) {
            return arg3 >= 0 && var4.field524.length > arg3 ? var4.field524[arg3] : 0;
        } else {
            return -96;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method1238(int arg0) {
        if (arg0 != 11) {
            method1238(62);
        }
        field2697 = null;
        field2703 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III[I)Luo;")
    private final class404 method1239(int arg0, int arg1, int arg2, int[] arg3) {
        field2699++;
        int var5 = arg1 ^ (arg2 >>> 12 | arg2 << 4 & arg0);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class404 var9 = (class404) this.field2706.method182(var7, (byte) 72);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class82 var10 = (class82) this.field2700.method182(var7, (byte) 75);
            if (var10 == null) {
                var10 = class82.method505(this.field2705, arg2, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field2700.method173(var7, var10, (byte) 99);
            }
            class404 var11 = var10.method509(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method300(false);
                this.field2706.method173(var7, var11, (byte) 71);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[I)Luo;")
    public final class404 method1240(int arg0, int arg1, int[] arg2) {
        field2696++;
        if (this.field2704.method2724(0) == 1) {
            return this.method1235(-115, 0, arg2, arg0);
        } else if (this.field2704.method2710(arg0, (byte) -123) == 1) {
            return this.method1235(arg1 + 77, arg0, arg2, 0);
        } else if (arg1 == 11) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lpc;Lpc;)V")
    public class192(class473 arg0, class473 arg1) {
        this.field2705 = arg1;
        this.field2704 = arg0;
    }
}
