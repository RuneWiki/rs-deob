import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class267 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "Lbh;")
    private class538 field3622 = new class538(64);

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Lwu;")
    private class557 field3628;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lio;")
    public static class708 field3625;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIZII)V")
    public static final void method1637(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3623++;
        class729[] var7 = class349.field4441;
        int var8 = 0;
        if (arg4) {
            return;
        }
        while (var8 < var7.length) {
            class729 var9 = var7[var8];
            if (var9 != null && var9.field10216 == 2) {
                class136.method886(var9.field10217, var9.field10222, var9.field10221, true, arg6, arg3 >> 1, arg0, var9.field10214 * 2, arg5 >> 1);
                if (class161.field2235[0] > -1 && (class245.field3409 % 20) < 10) {
                    class21 var10 = class370.field4731[var9.field10215];
                    int var11 = class161.field2235[0] + arg1 - 12;
                    int var12 = class161.field2235[1] + arg2 - 28;
                    var10.method101(var11, var12);
                    class217.method1422(var11 + var10.method116(), var12 - -var10.method108(), -92, var11, var12);
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZ)V")
    public static final void method1638(int arg0, int arg1, boolean arg2) {
        field3624++;
        class344 var3 = class70.method444(arg1, arg2, Integer.MIN_VALUE);
        if (var3 != null) {
            int var4 = -105 / ((arg0 + 28) / 35);
            var3.method3065(-17363);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public final void method1639(int arg0) {
        field3630++;
        class538 var2 = this.field3622;
        synchronized (this.field3622) {
            this.field3622.method3210(false);
        }
        if (arg0 > -7) {
            this.field3628 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1640(String arg0, int arg1) {
        field3631++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class713.field10110; var2++) {
            if (arg0.equalsIgnoreCase(class570.field8079[var2])) {
                return var2;
            }
        }
        if (arg1 != -11279) {
            method1640(null, -16);
        }
        return -1;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V")
    public final void method1641(int arg0, int arg1) {
        class538 var3 = this.field3622;
        synchronized (this.field3622) {
            this.field3622.method3204((byte) -126, arg1);
        }
        if (arg0 == -1) {
            field3627++;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    public static void method1642(int arg0) {
        field3625 = null;
        int var1 = -113 % ((arg0 - 63) / 34);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public final void method1643(byte arg0) {
        class538 var2 = this.field3622;
        synchronized (this.field3622) {
            this.field3622.method3202((byte) 127);
        }
        field3626++;
        int var3 = -88 / ((arg0 + 48) / 44);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lwj;ILwu;)V")
    public class267(class121 arg0, int arg1, class557 arg2) {
        this.field3628 = arg2;
        this.field3628.method3333(32, 3443);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)Ltf;")
    public final class591 method1644(int arg0, byte arg1) {
        field3629++;
        class538 var3 = this.field3622;
        class591 var4;
        synchronized (this.field3622) {
            var4 = (class591) this.field3622.method3200((long) arg0, -19983);
        }
        if (var4 != null) {
            return var4;
        }
        class557 var5 = this.field3628;
        byte[] var6;
        synchronized (this.field3628) {
            var6 = this.field3628.method3322(32, arg0, (byte) 124);
        }
        class591 var7 = new class591();
        if (var6 != null) {
            var7.method3511(511, new class26(var6));
        }
        if (arg1 != 25) {
            method1638(54, -49, false);
        }
        class538 var8 = this.field3622;
        synchronized (this.field3622) {
            this.field3622.method3199((byte) 78, var7, (long) arg0);
            return var7;
        }
    }
}
