import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class class113 {

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lgp;")
    public static class459 field1549 = new class459(1, 4);

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Lbt;")
    public static class88 field1550 = new class88(new byte[5000]);

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Lpi;")
    public static class340 field1552 = new class340(55, 6);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lov;")
    public static class278 field1553;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
    public static void method737(boolean arg0) {
        field1549 = null;
        field1550 = null;
        field1553 = null;
        if (!arg0) {
            field1552 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B[Ljava/lang/String;II[S)V")
    public static final void method738(byte arg0, String[] arg1, int arg2, int arg3, short[] arg4) {
        if (arg0 != 43) {
            field1553 = null;
        }
        if (arg3 < arg2) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg3;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var8;
            for (int var9 = arg3; var9 < arg2; var9++) {
                if (var7 == null || arg1[var9] != null && arg1[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg1[arg2] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var8;
            method738((byte) 43, arg1, var6 - 1, arg3, arg4);
            method738((byte) 43, arg1, arg2, var6 + 1, arg4);
        }
        field1548++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static final void method739(byte arg0) {
        field1551++;
        if (arg0 < 11) {
            field1550 = null;
        }
        for (class330 var1 = (class330) class287.field3663.method2122(0); var1 != null; var1 = (class330) class287.field3663.method2129(-97)) {
            var1.method1973();
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)Z")
    public static final boolean method740(int arg0, int arg1, int arg2, int arg3) {
        if (class60.method340(arg0, arg1, arg2)) {
            int var4 = arg1 << class169.field2206;
            int var5 = arg2 << class169.field2206;
            return class300.method1801(var4 + 1, class92.field1285[arg0].method1187(arg1, arg2) + arg3, var5 + 1) && class300.method1801(class286.field3658 + var4 - 1, class92.field1285[arg0].method1187(arg1 + 1, arg2) + arg3, var5 + 1) && class300.method1801(class286.field3658 + var4 - 1, class92.field1285[arg0].method1187(arg1 + 1, arg2 + 1) + arg3, class286.field3658 + var5 - 1) && class300.method1801(var4 + 1, class92.field1285[arg0].method1187(arg1, arg2 + 1) + arg3, class286.field3658 + var5 - 1);
        } else {
            return false;
        }
    }
}
