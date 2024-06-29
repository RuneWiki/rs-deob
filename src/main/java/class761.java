import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class761 {

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "Lkg;")
    public static class275 field10614 = new class275(33, -2);

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    public int field10611;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field10612;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field10613;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "Liea;")
    public static class481 field10616;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "Lnd;")
    public static class547 field10615;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "Ljava/lang/String;")
    public String field10617;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method4228(int arg0, String arg1) {
        field10612++;
        if (!class8.field103 || (class565.field7935 & 0x18) == 0) {
            return;
        }
        boolean var2 = false;
        int var3 = class416.field5303;
        int[] var4 = class657.field9155;
        for (int var5 = 0; var5 < var3; var5++) {
            class724 var6 = class5.field49[var4[var5]];
            if (var6.field10062 != null && var6.field10062.equalsIgnoreCase(arg1) && (class380.field4847 == var6 && (class565.field7935 & 0x10) != 0 || var6 != null && (class565.field7935 & 0x8) != 0)) {
                class424.field5493++;
                class589 var7 = class514.method2994(-29488, class760.field10605, class169.field2358);
                var7.field8251.method2630(-54, class100.field1388);
                var7.field8251.method2630(-48, class718.field10004);
                var7.field8251.method2565(true, 0);
                var7.field8251.method2624(-126, var4[var5]);
                var7.field8251.method2607((byte) -118, class27.field489);
                class737.method4107(var7, 7);
                class648.method3633(0, var6.method82((byte) 49), 0, -2, true, var6.field264[0], var6.method82((byte) 49), var6.field260[0], 17829);
                var2 = true;
                break;
            }
        }
        int var8 = 52 / ((-arg0 - 38) / 47);
        if (!var2) {
            class283.method1695(-96, 4, class454.field6024.method2547(-78, class243.field3143) + arg1);
        }
        if (class8.field103) {
            class522.method3033(24);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZII)I")
    public static final int method4229(boolean arg0, int arg1, int arg2) {
        field10613++;
        int var3 = 0;
        while (arg1 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg1--;
            arg2 >>>= 0x1;
        }
        if (arg0) {
            field10615 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
    public static void method4230(byte arg0) {
        field10614 = null;
        field10615 = null;
        if (arg0 != 36) {
            method4229(false, -114, -25);
        }
        field10616 = null;
    }
}
