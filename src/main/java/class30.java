import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class30 {

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field566 = 3;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "Lia;")
    public static class257 field572 = class28.method234(-121, "<col=ffffff>");

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Lia;")
    private static class257 field561 = class28.method234(90, "red:");

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "Lia;")
    public static class257 field579 = field561;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "Lia;")
    private static class257 field575 = class28.method234(-60, "cyan:");

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Lia;")
    public static class257 field563 = field575;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "Lia;")
    public static class257 field574 = field575;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "Lia;")
    public static class257 field571 = field561;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "Lia;")
    public static class257 field580 = class28.method234(-7, "null");

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "J")
    public long field573;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "Ls;")
    public static class229 field578;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "Ldh;")
    public class30 field568;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "Ldh;")
    public class30 field577;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Z")
    public final boolean method247(int arg0) {
        field569++;
        if (this.field568 == null) {
            return false;
        } else if (arg0 >= -54) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public static void method248(int arg0) {
        field580 = null;
        field575 = null;
        field578 = null;
        field563 = null;
        field561 = null;
        field579 = null;
        field571 = null;
        if (arg0 != -1) {
            field579 = null;
        }
        field574 = null;
        field572 = null;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
    public static final void method249(int arg0) {
        if (arg0 < 77) {
            field561 = null;
        }
        field567++;
        class158.field2783++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
    public static final void method250(int arg0, int arg1) {
        field564++;
        if (~arg0 == arg1 || !class31.method258(arg0, 0)) {
            return;
        }
        class44[] var2 = class28.field539[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class44 var4 = var2[var3];
            if (var4.field910 != null) {
                class164 var5 = new class164();
                var5.field2867 = var4.field910;
                var5.field2864 = var4;
                class94.method691(var5, 2000000, (byte) 112);
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static final void method251(byte arg0) {
        Object var1 = class189.field3254;
        synchronized (class189.field3254) {
            if (class159.field2786 == 0) {
                class72.field1404.method710(new class231(), (byte) -121, 5);
            }
            class159.field2786 = 600;
            if (arg0 < 80) {
                field572 = null;
            }
        }
        field570++;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)I")
    public static int method252(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)V")
    public static final void method253(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class233.field3997 = class181.field3149 * arg2 / arg4;
        class181.field3146 = class252.field4337 * arg3 / arg0;
        class26.field510 = arg1;
        field565++;
        class143.field2516 = -1;
        class228.method1488((byte) 125);
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
    public final void method254(int arg0) {
        field562++;
        if (this.field568 == null) {
            return;
        }
        this.field568.field577 = this.field577;
        this.field577.field568 = this.field568;
        this.field577 = null;
        if (arg0 != 1) {
            this.field577 = null;
        }
        this.field568 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIZ[Lia;[S)V")
    public static final void method255(int arg0, int arg1, boolean arg2, class257[] arg3, short[] arg4) {
        if (arg2) {
            method248(-50);
        }
        field576++;
        if (arg0 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg0) / 2;
        class257 var6 = arg3[var5];
        arg3[var5] = arg3[arg0];
        arg3[arg0] = var6;
        short var7 = arg4[var5];
        arg4[var5] = arg4[arg0];
        int var8 = arg1;
        arg4[arg0] = var7;
        for (int var9 = arg1; var9 < arg0; var9++) {
            if (var6 == null || arg3[var9] != null && (var9 & 0x1) > arg3[var9].method1691(-20239, var6)) {
                class257 var10 = arg3[var9];
                arg3[var9] = arg3[var8];
                arg3[var8] = var10;
                short var11 = arg4[var9];
                arg4[var9] = arg4[var8];
                arg4[var8++] = var11;
            }
        }
        arg3[arg0] = arg3[var8];
        arg3[var8] = var6;
        arg4[arg0] = arg4[var8];
        arg4[var8] = var7;
        method255(var8 - 1, arg1, false, arg3, arg4);
        method255(arg0, var8 + 1, false, arg3, arg4);
    }
}
