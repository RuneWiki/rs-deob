import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class283 {

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "Ldd;")
    public class141 field4736;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public int field4734;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field4733 = 50;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Z")
    public static boolean field4735 = false;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "[I")
    public static int[] field4737 = new int[500];

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "[Z")
    public static boolean[] field4731 = new boolean[100];

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "Lfa;")
    public static class273 field4738;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "[[Lkk;")
    public static class254[][] field4741;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIZIILid;)Lh;")
    public static final class294 method1997(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class157 arg6) {
        field4740++;
        int var7 = (arg5 << 19) + (arg3 ? 65536 : 0) + (arg0 << 17) + arg2;
        long var9 = (long) var7 * 3849834839L + (long) arg4 * 3147483667L;
        class294 var11 = (class294) class12.field152.method149((byte) -79, var9);
        if (var11 != null) {
            return var11;
        }
        class172.field2653 = false;
        class294 var12 = class276.method1923(arg3, arg2, false, arg0, arg5, arg4, (byte) -40, false, arg6);
        if (var12 != null && !class172.field2653) {
            class12.field152.method152(var12, var9, true);
        }
        int var13 = 121 % ((-arg1 - 3) / 40);
        return var12;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public static void method1998(int arg0) {
        if (arg0 >= -70) {
            field4731 = null;
        }
        field4741 = null;
        field4737 = null;
        field4738 = null;
        field4731 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[I[III)V")
    public static final void method1999(int arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 < arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var6;
            int var7 = arg0;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            for (int var9 = arg0; var9 < arg4; var9++) {
                if (arg2[var9] > var6 + (var9 & 0x1)) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var7];
                    arg2[var7] = var10;
                    int var11 = arg1[var9];
                    arg1[var9] = arg1[var7];
                    arg1[var7++] = var11;
                }
            }
            arg2[arg4] = arg2[var7];
            arg2[var7] = var6;
            arg1[arg4] = arg1[var7];
            arg1[var7] = var8;
            method1999(arg0, arg1, arg2, -89, var7 - 1);
            method1999(var7 + 1, arg1, arg2, -56, arg4);
        }
        if (arg3 > -42) {
            method1998(65);
        }
        field4742++;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(II)V")
    public class283(int arg0, int arg1) {
        this.field4736 = class101.method659((byte) 111, arg0);
        this.field4734 = arg1;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
    public static final void method2000(byte arg0) {
        boolean var1 = false;
        field4732++;
        if (arg0 >= -54) {
            method1997(-95, 91, -16, false, -22, 60, (class157) null);
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class18.field251 - 1); var2++) {
                if (class70.field1016[var2] < 1000 && class70.field1016[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class156.field2472[var2];
                    class156.field2472[var2] = class156.field2472[var2 + 1];
                    class156.field2472[var2 + 1] = var3;
                    String var4 = class178.field2773[var2];
                    class178.field2773[var2] = class178.field2773[var2 + 1];
                    class178.field2773[var2 + 1] = var4;
                    int var5 = field4737[var2];
                    field4737[var2] = field4737[var2 + 1];
                    field4737[var2 + 1] = var5;
                    int var6 = class175.field2739[var2];
                    class175.field2739[var2] = class175.field2739[var2 + 1];
                    class175.field2739[var2 + 1] = var6;
                    int var7 = class214.field3420[var2];
                    class214.field3420[var2] = class214.field3420[var2 + 1];
                    class214.field3420[var2 + 1] = var7;
                    short var8 = class70.field1016[var2];
                    class70.field1016[var2] = class70.field1016[var2 + 1];
                    class70.field1016[var2 + 1] = var8;
                    long var9 = class280.field4637[var2];
                    class280.field4637[var2] = class280.field4637[var2 + 1];
                    class280.field4637[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Ldd;I)V")
    public class283(class141 arg0, int arg1) {
        this.field4734 = arg1;
        this.field4736 = arg0;
    }
}
