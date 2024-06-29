import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class505 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Ljt;")
    private class106 field7169 = new class106(16);

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Lvd;")
    private class39 field7171;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Lpd;")
    public static class259 field7177 = new class259(3);

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lqe;")
    public static class469 field7180 = new class469(55, -2);

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field7181 = 0;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field7183 = 0;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
    public static final void method2993(int arg0, int arg1) {
        field7179++;
        if (arg1 != 0) {
            method3000(-18, null, 60, null, -19, -93, -89, -47, -39, -92, -90, 24);
        }
        class150 var2 = class676.method3885(1000, 1, arg0);
        var2.method1115(true);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public static void method2994(boolean arg0) {
        if (!arg0) {
            method2996(11, -48);
        }
        field7180 = null;
        field7177 = null;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)Lmw;")
    public final class493 method2995(int arg0, int arg1) {
        field7172++;
        class106 var3 = this.field7169;
        class493 var4;
        synchronized (this.field7169) {
            var4 = (class493) this.field7169.method803(109, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class39 var5 = this.field7171;
        byte[] var6;
        synchronized (this.field7171) {
            var6 = this.field7171.method211(true, 30, arg0);
        }
        class493 var7 = new class493();
        if (arg1 != 2) {
            this.method2997(108);
        }
        if (var6 != null) {
            var7.method2941(new class645(var6), 127);
        }
        class106 var8 = this.field7169;
        synchronized (this.field7169) {
            this.field7169.method801(1, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)I")
    public static final int method2996(int arg0, int arg1) {
        field7174++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = -49 % ((arg1 + 28) / 42);
        int var8 = var6 | var6 >>> 16;
        return ~var8 & arg0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public final void method2997(int arg0) {
        field7176++;
        class106 var2 = this.field7169;
        synchronized (this.field7169) {
            int var3 = -43 % ((-arg0 - 32) / 50);
            this.field7169.method809(true);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public final void method2998(byte arg0) {
        field7178++;
        class106 var2 = this.field7169;
        synchronized (this.field7169) {
            this.field7169.method800(78);
            if (arg0 != 26) {
                this.method2998((byte) -54);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static final void method2999(int arg0) {
        field7175++;
        class63.field916.method4111(79, 1, class63.field916.field10182);
        class63.field916.method4111(88, 1, class63.field916.field10204);
        class63.field916.method4111(arg0 ^ 0x5F, 2, class63.field916.field10199);
        class63.field916.method4111(arg0 ^ 0x4F, 2, class63.field916.field10203);
        class63.field916.method4111(92, 1, class63.field916.field10193);
        class63.field916.method4111(72, 1, class63.field916.field10207);
        class63.field916.method4111(arg0 ^ 0x41, 1, class63.field916.field10165);
        class63.field916.method4111(125, 1, class63.field916.field10170);
        class63.field916.method4111(104, 1, class63.field916.field10205);
        class63.field916.method4111(arg0 ^ 0x5F, 1, class63.field916.field10162);
        class63.field916.method4111(103, 1, class63.field916.field10185);
        class63.field916.method4111(80, 1, class63.field916.field10175);
        class63.field916.method4111(63, 0, class63.field916.field10166);
        class63.field916.method4111(arg0 + 114, 1, class63.field916.field10209);
        class63.field916.method4111(75, 0, class63.field916.field10196);
        class63.field916.method4111(90, 0, class63.field916.field10183);
        class63.field916.method4111(79, 1, class63.field916.field10174);
        class63.field916.method4111(99, arg0, class63.field916.field10198);
        class63.field916.method4111(arg0 ^ 0x6B, 0, class63.field916.field10201);
        class115.method851(true);
        class63.field916.method4111(67, 1, class63.field916.field10160);
        class63.field916.method4111(121, 3, class63.field916.field10176);
        class438.method2708(false);
        class608.method3528(arg0 + 1);
        class424.field6300 = true;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILk;ILha;IIIIIIII)V")
    public static final void method3000(int arg0, class567 arg1, int arg2, class60 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field7170++;
        if (arg4 > arg2 && arg0 + arg2 > arg4 && arg8 > (arg9 - 13) && arg8 < (arg9 + 3)) {
            arg10 = arg11;
        }
        String var12 = class559.method3269(arg1, (byte) 127);
        class298.field4225.method558(arg2 + arg5, arg10, arg9, var12, 0, class259.field3701, class409.field6169, arg5 + 114);
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(II)V")
    public final void method3001(int arg0, int arg1) {
        class106 var3 = this.field7169;
        synchronized (this.field7169) {
            this.field7169.method807(arg1, -1);
        }
        if (arg0 == 0) {
            field7173++;
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lqg;ILvd;)V")
    public class505(class464 arg0, int arg1, class39 arg2) {
        this.field7171 = arg2;
        this.field7171.method229(30, 0);
    }
}
