import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class439 {

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Ljp;")
    private class236 field6028 = new class236(64);

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lpc;")
    public class473 field6029;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lpc;")
    private class473 field6034;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Lvj;")
    public static class304 field6031 = new class304("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Len;")
    public static class208 field6033 = new class208();

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field6035 = 0;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V", line = 3)
    public final void method2533(byte arg0, int arg1) {
        class236 var3 = this.field6028;
        synchronized (this.field6028) {
            this.field6028.method1461(-5, arg1);
        }
        if (arg0 >= 77) {
            field6032++;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)Lfl;", line = 17)
    public final class518 method2534(boolean arg0, int arg1) {
        field6027++;
        class236 var3 = this.field6028;
        class518 var4;
        synchronized (this.field6028) {
            var4 = (class518) this.field6028.method1456((long) arg1, 109);
        }
        if (!arg0) {
            field6033 = null;
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6034.method2708(3, arg1, (byte) 54);
        class518 var6 = new class518();
        var6.field7678 = this;
        if (var5 != null) {
            var6.method3049(-91, new class379(var5));
        }
        class236 var7 = this.field6028;
        synchronized (this.field6028) {
            this.field6028.method1462(var6, (long) arg1, -84);
            return var6;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V", line = 55)
    public final void method2535(byte arg0) {
        class236 var2 = this.field6028;
        synchronized (this.field6028) {
            int var3 = 12 / ((arg0 + 46) / 46);
            this.field6028.method1458((byte) 106);
        }
        field6024++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BZ)V", line = 68)
    public static final void method2536(byte arg0, boolean arg1) {
        class421.field5766 = 0;
        field6030++;
        if (arg0 != 95) {
            method2536((byte) -103, false);
        }
        class35.field556 = 0;
        class298.method1740(true);
        class386.method2283(-96, arg1);
        class499.method2857((byte) 80);
        for (int var2 = 0; var2 < class35.field556; var2++) {
            int var4 = class249.field3314[var2];
            if (class31.field516 != class291.field3822[var4].field6235) {
                if (class291.field3822[var4].field1661.method2889(arg0 + 10)) {
                    class526.method3092(2, class291.field3822[var4]);
                }
                class291.field3822[var4].method803(null, (byte) 125);
                class291.field3822[var4] = null;
            }
        }
        if (class219.field2965 != class481.field6632.field5173) {
            throw new RuntimeException("gnp1 pos:" + class481.field6632.field5173 + " psize:" + class219.field2965);
        }
        for (int var3 = 0; var3 < class60.field942; var3++) {
            if (class291.field3822[class162.field2369[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class60.field942);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([Ljava/lang/Object;III[I)V", line = 121)
    public static final void method2537(Object[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field6026++;
        int var5 = 43 / ((13 - arg1) / 49);
        if (arg2 >= arg3) {
            return;
        }
        int var6 = (arg2 + arg3) / 2;
        int var7 = arg2;
        int var8 = arg4[var6];
        arg4[var6] = arg4[arg3];
        arg4[arg3] = var8;
        Object var9 = arg0[var6];
        arg0[var6] = arg0[arg3];
        arg0[arg3] = var9;
        int var10 = var8 == Integer.MAX_VALUE ? 0 : 1;
        for (int var11 = arg2; var11 < arg3; var11++) {
            if (arg4[var11] < var8 + (var11 & var10)) {
                int var12 = arg4[var11];
                arg4[var11] = arg4[var7];
                arg4[var7] = var12;
                Object var13 = arg0[var11];
                arg0[var11] = arg0[var7];
                arg0[var7++] = var13;
            }
        }
        arg4[arg3] = arg4[var7];
        arg4[var7] = var8;
        arg0[arg3] = arg0[var7];
        arg0[var7] = var9;
        method2537(arg0, 80, arg2, var7 - 1, arg4);
        method2537(arg0, -119, var7 + 1, arg3, arg4);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 177)
    public static void method2538(int arg0) {
        field6031 = null;
        if (arg0 > 11) {
            field6033 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V", line = 189)
    public final void method2539(int arg0) {
        field6025++;
        class236 var2 = this.field6028;
        synchronized (this.field6028) {
            this.field6028.method1459(19088);
            int var3 = 10 % ((arg0 - 46) / 56);
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lrb;ILpc;Lpc;)V", line = 213)
    public class439(class234 arg0, int arg1, class473 arg2, class473 arg3) {
        this.field6029 = arg3;
        this.field6034 = arg2;
        this.field6034.method2710(3, (byte) -127);
    }
}
