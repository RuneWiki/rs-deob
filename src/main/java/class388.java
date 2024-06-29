import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class388 {

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Lps;")
    private class428 field5550 = new class428();

    @OriginalMember(owner = "client!re", name = "b", descriptor = "[I")
    public static int[] field5546 = new int[200];

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Lpf;")
    public static class485 field5549 = new class485();

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field5559 = 0;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Lpn;")
    public static class72 field5560 = new class72(30, 15);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "Lps;")
    private class428 field5562;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "[Lmn;")
    public static class85[] field5563;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)Lps;", line = 6)
    public final class428 method2334(int arg0) {
        field5545++;
        if (arg0 >= -81) {
            this.method2343(120);
        }
        class428 var2 = this.field5550.field6175;
        if (this.field5550 == var2) {
            this.field5562 = null;
            return null;
        } else {
            this.field5562 = var2.field6175;
            return var2;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)Lps;", line = 26)
    public final class428 method2335(int arg0) {
        field5552++;
        class428 var2 = this.field5550.field6172;
        if (arg0 != 0) {
            return null;
        } else if (this.field5550 == var2) {
            this.field5562 = null;
            return null;
        } else {
            this.field5562 = var2.field6172;
            return var2;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lps;B)V", line = 49)
    public final void method2336(class428 arg0, byte arg1) {
        if (arg1 != -56) {
            this.method2345(-38);
        }
        if (arg0.field6172 != null) {
            arg0.method2550(false);
        }
        field5557++;
        arg0.field6175 = this.field5550;
        arg0.field6172 = this.field5550.field6172;
        arg0.field6172.field6175 = arg0;
        arg0.field6175.field6172 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)I", line = 73)
    public final int method2337(int arg0) {
        field5556++;
        int var2 = arg0;
        class428 var3 = this.field5550.field6175;
        while (this.field5550 != var3) {
            var3 = var3.field6175;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)Lps;", line = 94)
    public final class428 method2338(int arg0) {
        field5555++;
        int var2 = -62 % ((arg0 - 60) / 47);
        class428 var3 = this.field5550.field6175;
        if (this.field5550 == var3) {
            return null;
        } else {
            var3.method2550(false);
            return var3;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 281)
    public class388() {
        this.field5550.field6172 = this.field5550;
        this.field5550.field6175 = this.field5550;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IBIZII)V", line = 118)
    public static final void method2339(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 != 37) {
            method2339(26, (byte) 79, 16, true, -12, -8);
        }
        field5553++;
        long var6 = (long) (arg4 | (arg3 ? Integer.MIN_VALUE : 0));
        class458 var8 = (class458) class269.field3856.method233(arg1 ^ 0x76, var6);
        if (var8 == null) {
            var8 = new class458();
            class269.field3856.method234(arg1 ^ 0xFFFFFFE5, var6, var8);
        }
        if (var8.field6447.length <= arg0) {
            int[] var9 = new int[arg0 + 1];
            int[] var10 = new int[arg0 + 1];
            for (int var11 = 0; var11 < var8.field6447.length; var11++) {
                var9[var11] = var8.field6447[var11];
                var10[var11] = var8.field6454[var11];
            }
            for (int var12 = var8.field6447.length; var12 < arg0; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field6454 = var10;
            var8.field6447 = var9;
        }
        var8.field6447[arg0] = arg5;
        var8.field6454[arg0] = arg2;
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)Lps;", line = 176)
    public final class428 method2340(int arg0) {
        int var2 = 79 % ((arg0 + 24) / 52);
        field5551++;
        class428 var3 = this.field5562;
        if (this.field5550 == var3) {
            this.field5562 = null;
            return null;
        } else {
            this.field5562 = var3.field6175;
            return var3;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 196)
    public static final void method2341(boolean arg0, int arg1, String arg2) {
        field5548++;
        class89 var3 = class146.method695(2, arg1, (byte) -112);
        var3.method449(!arg0);
        var3.field1120 = arg2;
        if (arg0) {
            field5561 = -110;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)V", line = 214)
    public static final void method2342(byte arg0, int arg1) {
        field5547++;
        class89 var2 = class146.method695(11, arg1, (byte) -91);
        if (arg0 != -86) {
            field5546 = null;
        }
        var2.method448(13);
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V", line = 234)
    public final void method2343(int arg0) {
        field5554++;
        while (true) {
            class428 var2 = this.field5550.field6175;
            if (this.field5550 == var2) {
                this.field5562 = null;
                if (arg0 == 0) {
                    return;
                } else {
                    field5546 = null;
                    return;
                }
            }
            var2.method2550(false);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V", line = 255)
    public static void method2344(boolean arg0) {
        field5549 = null;
        field5546 = null;
        field5560 = null;
        field5563 = null;
        if (arg0) {
            method2344(true);
        }
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(I)Z", line = 269)
    public final boolean method2345(int arg0) {
        if (arg0 != 4616) {
            this.method2340(-114);
        }
        field5558++;
        return this.field5550.field6175 == this.field5550;
    }
}
