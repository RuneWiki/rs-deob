import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class257 {

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field3747 = 0;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "[Lrf;")
    public static class126[] field3748;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([Ljava/lang/String;ZI[SI)V", line = 7)
    public static final void method1784(String[] arg0, boolean arg1, int arg2, short[] arg3, int arg4) {
        if (!arg1) {
            method1787((class299) null, (String) null, 116);
        }
        field3746++;
        if (arg2 <= arg4) {
            return;
        }
        int var5 = (arg4 + arg2) / 2;
        int var6 = arg4;
        String var7 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var7;
        short var8 = arg3[var5];
        arg3[var5] = arg3[arg2];
        arg3[arg2] = var8;
        for (int var9 = arg4; var9 < arg2; var9++) {
            if (var7 == null || arg0[var9] != null && arg0[var9].compareTo(var7) < (var9 & 0x1)) {
                String var10 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6] = var10;
                short var11 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6++] = var11;
            }
        }
        arg0[arg2] = arg0[var6];
        arg0[var6] = var7;
        arg3[arg2] = arg3[var6];
        arg3[var6] = var8;
        method1784(arg0, true, var6 - 1, arg3, arg4);
        method1784(arg0, true, arg2, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 66)
    public static final void method1785(int arg0) {
        if (arg0 == 1) {
            class210.field2973.method2258((byte) 86);
            field3750++;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 88)
    public static void method1786(int arg0) {
        if (arg0 != 1) {
            method1786(113);
        }
        field3748 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lfd;Ljava/lang/String;I)I", line = 98)
    public static final int method1787(class299 arg0, String arg1, int arg2) {
        field3745++;
        int var3 = arg0.field4351;
        byte[] var4 = class122.method885(arg1, 23668);
        arg0.method2044(-32769, var4.length);
        if (arg2 != -32696) {
            field3748 = (class126[]) null;
        }
        arg0.field4351 += class279.field3976.method1540(arg0.field4351, 0, 19, arg0.field4350, var4, var4.length);
        return arg0.field4351 - var3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Lke;", line = 118)
    public static final class230 method1788(int arg0, int arg1) {
        class230 var2 = (class230) class159.field2258.method2265((long) arg1, (byte) 76);
        field3749++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class283.field4033.method1089(arg1, (byte) 115, 0);
        int var4 = -62 % ((arg0 - 3) / 55);
        class230 var5 = new class230(var3);
        var5.method1907(class357.field5584, (int[]) null);
        class159.field2258.method2257(-125, var5, (long) arg1);
        return var5;
    }
}
