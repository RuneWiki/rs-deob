import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class312 implements class100 {

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Lsi;")
    private class691 field4001;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Lwu;")
    private class557 field3999;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "[Lsq;")
    public static class15[] field4003 = new class15[1024];

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static volatile int field4004 = -1;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Lcw;")
    private class21 field3997;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lep;III[I[I)Lfb;", line = 4)
    public static final class669 method1822(class371 arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        field4000++;
        byte[] var6 = new byte[arg1 * arg2];
        for (int var7 = 0; var7 < arg2; var7++) {
            int var8 = arg1 * var7 + arg5[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        if (arg3 != -1089) {
            field3995 = 2;
        }
        return new class669(arg0, arg1, arg2, var6);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZZ)V", line = 36)
    public final void method681(boolean arg0, boolean arg1) {
        if (!arg0) {
            return;
        }
        field3998++;
        if (!arg1) {
            return;
        }
        int var3 = class58.field807 <= class95.field1381 ? class95.field1381 : class58.field807;
        int var4 = class631.field8989 < class582.field8281 ? class582.field8281 : class631.field8989;
        int var5 = this.field3997.method116();
        int var6 = this.field3997.method108();
        int var7 = 0;
        int var8 = var3;
        int var9 = var3 * var6 / var5;
        int var10 = (var4 - var9) / 2;
        if (var9 > var4) {
            var10 = 0;
            var9 = var4;
            var8 = var4 * var5 / var6;
            var7 = (var3 - var8) / 2;
        }
        this.field3997.method100(var7, var10, var8, var9);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V", line = 79)
    public static void method1823(boolean arg0) {
        if (arg0) {
            field4003 = null;
        }
        field4003 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Z", line = 98)
    public final boolean method680(int arg0) {
        field3996++;
        if (arg0 != 29892) {
            field4004 = -119;
        }
        return this.field3999.method3340(0, this.field4001.field9670);
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lwu;Lsi;)V", line = 109)
    public class312(class557 arg0, class691 arg1) {
        this.field4001 = arg1;
        this.field3999 = arg0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Ljava/lang/String;", line = 118)
    public static final String method1824(int arg0, int arg1) {
        field4002++;
        if (arg1 != 2) {
            method1824(96, -23);
        }
        class192 var2 = (class192) class63.field842.method1381(true, (long) arg0);
        if (var2 != null) {
            class412 var3 = var2.field2791.method3852((byte) 112);
            if (var3 != null) {
                double var4 = var2.field2791.method3857(0);
                if ((double) var3.method2513(arg1 - 94) <= var4 && (double) var3.method2510((byte) -30) >= var4) {
                    return var3.method2512((byte) -25);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 149)
    public final void method682(byte arg0) {
        if (arg0 >= 29) {
            this.field3997 = class7.method32(false, this.field4001.field9670, this.field3999);
            field4005++;
        }
    }
}
