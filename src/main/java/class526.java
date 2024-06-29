import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class526 {

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "Lad;")
    private class19 field7421 = new class19(128);

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "Ltf;")
    private class701 field7423;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "[Lf;")
    public static class534[] field7420;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)Loaa;")
    public final class553 method2963(int arg0, int arg1) {
        field7422++;
        class19 var3 = this.field7421;
        class553 var4;
        synchronized (this.field7421) {
            var4 = (class553) this.field7421.method78(0, (long) arg0);
            int var5 = 57 / ((64 - arg1) / 46);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var6 = this.field7423.method3854((byte) 72, class384.method2201(4288, arg0), class341.method1971(22826, arg0));
        class553 var7 = new class553();
        if (var6 != null) {
            var7.method3134(-1, new class115(var6));
        }
        class19 var8 = this.field7421;
        synchronized (this.field7421) {
            this.field7421.method92(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II[S[Ljava/lang/String;B)V")
    public static final void method2964(int arg0, int arg1, short[] arg2, String[] arg3, byte arg4) {
        if (arg1 < arg0) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg1;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            for (int var9 = arg1; var9 < arg0; var9++) {
                if (var7 == null || arg3[var9] != null && (var9 & 0x1) > arg3[var9].compareTo(var7)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method2964(var6 - 1, arg1, arg2, arg3, (byte) -86);
            method2964(arg0, var6 + 1, arg2, arg3, (byte) -86);
        }
        field7418++;
        if (arg4 != -86) {
            method2965(57, -5, -23, 99, (byte) -116, -45, 22);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIBII)I")
    public static final int method2965(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        int var7 = arg5 & 0x3;
        field7419++;
        if ((arg6 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return 1 + 7 - arg0 - arg2;
        } else {
            int var9 = 72 / ((arg4 - 64) / 49);
            return var7 == 2 ? 8 - arg1 - arg3 : arg2;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V")
    public static void method2966(byte arg0) {
        int var1 = -128 / ((arg0 + 5) / 37);
        field7420 = null;
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lqh;ILtf;)V")
    public class526(class320 arg0, int arg1, class701 arg2) {
        this.field7423 = arg2;
        if (this.field7423 != null) {
            int var4 = this.field7423.method3877(100) - 1;
            this.field7423.method3883(var4, 0);
        }
    }
}
